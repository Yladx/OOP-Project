/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooltechadmin;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 *
 * @author YLADx
 */
public class Admin {
    private String loggedInUsername;
    protected Connection con;
    
    
    private static int MAX_LOGIN_ATTEMPTS = 3;

public boolean performAdminLogin(JTextField adminUsernameField, JPasswordField adminPasswordField, JButton loginbutton ){
    String username = adminUsernameField.getText();
    String password = new String(adminPasswordField.getPassword());

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all required fields");
        return false;
    }

    try {
        connectToDatabase();

        // Execute SQL statements to check login credentials
        String sql = "SELECT * FROM admin WHERE AdminEmail = ? AND AdminPass = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a user with the provided credentials exists
            boolean credentialsValid = resultSet.next();

            if (credentialsValid) {
                // Reset login attempts on successful login
                // Login successful, you can proceed with further actions
                // For example, show a new frame or perform other operations
                JOptionPane.showMessageDialog(null, "Admin login successful");
                loggedInUsername = username;
                return true;
            } else {
                MAX_LOGIN_ATTEMPTS--;

                if (MAX_LOGIN_ATTEMPTS == 0) {
                    // Disable the frame or take appropriate action
                    JOptionPane.showMessageDialog(null, "Too many invalid login attempts. Frame will be disabled.");
                    loginbutton.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid admin username or password. Attempts left: " + MAX_LOGIN_ATTEMPTS);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
    

        protected void connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooltech?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
          
        
        } catch (ClassNotFoundException ex) {
        }
    }
        


           
    public String getLoggedInUsername() {
        return loggedInUsername;
    }

    public boolean verifyAdminCredentials(String username, String password) throws SQLException {
        // Connect to the database using the 'con' connection obtained from the Admin class
        connectToDatabase();

        // Execute SQL statements to check admin login credentials
        String sql = "SELECT * FROM admin WHERE AdminEmail = ? AND AdminPass = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if an admin with the provided credentials exists
            return resultSet.next();
        } catch (SQLException ex) {
            // Handle the exception, e.g., log the error
            ex.printStackTrace();
            return false;
        }
    }
    
    
     public void deleteAllEmails(JPanel targetPanel) {
    try {
        connectToDatabase();

        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete all emails?", "Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            // Remove all email panels from the target panel
            targetPanel.removeAll();

            // Delete all emails from the database
            String deleteSql = "DELETE FROM emails";
            try (Statement statement = con.createStatement()) {
                statement.executeUpdate(deleteSql);
            }

            // Refresh the target panel
            targetPanel.revalidate();
            targetPanel.repaint();
        }
    } catch (SQLException e) {
        // Handle the exception appropriately (e.g., logging or displaying an error message)
    }
     }
    
  public void populateUserComboBox(JComboBox<String> userComboBox, JButton deleteButton) {
    try {
        connectToDatabase();

        // Execute SQL statement to select names and emails of users
        String selectSql = "SELECT Name, Emails FROM users";
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSql)) {

            // Clear existing items in the combo box
            userComboBox.removeAllItems();

            // Add "All" as the first item
            userComboBox.addItem("All");

            // Add names and emails to the combo box
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Emails");
                String displayInfo = name + " - " + email;
                userComboBox.addItem(displayInfo);
            }
        }
    } catch (SQLException e) {
        // Handle the exception appropriately
    }

    // Add an ActionListener to the deleteButton
    deleteButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected item from the combo box
            String selectedItem = (String) userComboBox.getSelectedItem();

            // Ask the user for confirmation
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete the selected user?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION && selectedItem != null && !"All".equals(selectedItem)) {
                // Extract the email from the selected item (assuming the email is separated by " - ")
                String[] parts = selectedItem.split(" - ");
                if (parts.length > 1) {
                    String selectedEmail = parts[1];

                    // Execute SQL statement to delete the user
                    String deleteSql = "DELETE FROM users WHERE Emails = ?";
                    try (PreparedStatement deleteStatement = con.prepareStatement(deleteSql)) {
                        deleteStatement.setString(1, selectedEmail);
                        deleteStatement.executeUpdate();
                    } catch (SQLException ex) {
                        // Handle the exception appropriately
                    }

                    // Repopulate the combo box after deletion
                    populateUserComboBox(userComboBox, deleteButton);
                }
            }
        }
    });
}


}
