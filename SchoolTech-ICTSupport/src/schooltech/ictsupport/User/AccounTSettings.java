/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooltech.ictsupport.User;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
public class AccounTSettings extends User {
    
         private String loggedInEmail;
         
         public AccounTSettings (String Loginemail){
             this.loggedInEmail = Loginemail;
         }
         
         
     public boolean deleteLoggedInEmail() throws SQLException {
    try {
        // Connect to the database using the 'con' connection obtained from the User class
        connectToDatabase();

        // Ask the user for confirmation
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete the login email and all sent emails?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Execute SQL statement to delete the login email
            String deleteLoginSql = "DELETE FROM users WHERE Emails = ?";
            String deleteSentEmailsSql = "DELETE FROM emails WHERE EmailSender = ?";

            try {
                // Set autocommit to false to ensure atomicity of the operations
                con.setAutoCommit(false);

                // Delete sent emails
                try (PreparedStatement deleteSentEmailsStatement = con.prepareStatement(deleteSentEmailsSql)) {
                    deleteSentEmailsStatement.setString(1, loggedInEmail);
                    deleteSentEmailsStatement.executeUpdate();
                }

                // Delete the login email
                try (PreparedStatement deleteLoginStatement = con.prepareStatement(deleteLoginSql)) {
                    deleteLoginStatement.setString(1, loggedInEmail);

                    // Execute the deletion
                    int rowsAffected = deleteLoginStatement.executeUpdate();

                    // Check if the deletion was successful
                    if (rowsAffected > 0) {
                        // Display a JOptionPane message for successful deletion
                        JOptionPane.showMessageDialog(null, "Login email and sent emails deleted successfully");

                        // Commit the transaction
                        con.commit();

                        // Return true indicating successful deletion
                        return true;
                    } else {
                        // Display a JOptionPane message for unsuccessful deletion
                        JOptionPane.showMessageDialog(null, "Error deleting login email");

                        // Rollback the transaction
                        con.rollback();

                        // Return false indicating unsuccessful deletion
                        return false;
                    }
                }
            } finally {
                // Set autocommit back to true after completion
                con.setAutoCommit(true);
            }
        } else {
            // Return false if the user chooses not to delete
            return false;
        }
    } catch (SQLException ex) {
        // Handle the exception, e.g., log the error

        // Display a JOptionPane message for the exception
        JOptionPane.showMessageDialog(null, "Error deleting login email: " + ex.getMessage());

        // Return false indicating an error occurred
        return false;
    } catch (Exception ex) {
        // Handle other exceptions, e.g., user closed the confirmation dialog
        // Display a JOptionPane message for the exception
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        // Return false indicating an error occurred
        return false;
    }
}
    
      
            
        public void displayAllUserInfo(JLabel userInfoLabel) {
        try {
            // Connect to the database using the 'con' connection obtained from the User class
            connectToDatabase();

            // Execute SQL statement to select user information based on the login email
            String selectSql = "SELECT * FROM users WHERE Emails = ?";
            try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
                selectStatement.setString(1, loggedInEmail);

                // Execute the query
                ResultSet resultSet = selectStatement.executeQuery();

                // Check if a user with the provided email exists
                if (resultSet.next()) {
                    // Get user information from the result set
                    String srCode = resultSet.getString("SrCode");
                    String name = resultSet.getString("Name");
                    String email = resultSet.getString("Emails");
                    String dateOfBirth = resultSet.getString("DateOfBirth");

                    // Set user information to the JLabel
                    String userInfoText = "<html> <div style='margin: 5px;'> Name: " + name + "</div>"
                    + "<div style='margin: 5px;'>SR Code: " + srCode + "</div>"
                    + "<div style='margin: 5px;'>Email: " + email + "</div>"
                    + "<div style='margin: 5px;'>Date of Birth: " + dateOfBirth + "</div></html>";

                    userInfoLabel.setText(userInfoText);
                } else {
                    // If no user with the provided email is found, set an error message
                    userInfoLabel.setText("User not found");
                }
            }
        } catch (SQLException ex) {
            // Handle the exception, e.g., log the error

            // If there's an error, set an error message to the JLabel
            userInfoLabel.setText("Error fetching user information: " + ex.getMessage());
        }
    }   
        
        
        public void updateButtonWithUserName(JButton loginButton) {
    try {
        // Connect to the database using the 'con' connection obtained from the User class
        connectToDatabase();

        // Execute SQL statement to select the user's name based on the login email
        String selectSql = "SELECT Name FROM users WHERE Emails = ?";
        try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
            selectStatement.setString(1, loggedInEmail);

            // Execute the query
            ResultSet resultSet = selectStatement.executeQuery();

            // Check if a user with the provided email exists
            if (resultSet.next()) {
                // Get the user's name from the result set
                String userName = resultSet.getString("Name");

                // Update the button's text with the user's name
                loginButton.setText( userName);
            } else {
                // If no user with the provided email is found, set a default text for the button
                loginButton.setText("Login");
            }
        }
    } catch (SQLException ex) {
        // Handle the exception, e.g., log the error

        // If there's an error, set a default text for the button
        loginButton.setText("Login");
    }
}
}
