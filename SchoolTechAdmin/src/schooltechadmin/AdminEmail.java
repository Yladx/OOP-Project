
package schooltechadmin;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;
/**
 *
 * @author YLADx
 */
public class AdminEmail extends Admin{
    

  
    // Constructors, getters, and setters for the new properties

    public AdminEmail() {
        // Default constructor
    }

    public AdminEmail(String loggedInEmail, String emailSubject, String emailMessage, java.util.Date date) {
    }
    
        public boolean updateEmailStatus(String subject, JTextPane textArea) {
            try {
               // Connect to the database using the 'con' connection obtained from the User class
               connectToDatabase();

               // Check if the text area is empty
               if (textArea.getText().trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Reply cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                   return false;
               }

               // Ask the user for confirmation
               int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to send this reply?", "Confirmation", JOptionPane.YES_NO_OPTION);

               if (confirmation == JOptionPane.YES_OPTION) {
                   // Update the status to "Replied" in the 'emails' table
                   String updateSql = "UPDATE emails SET Status = 'Replied', Replies = ? WHERE Subject = ?";
                   try (PreparedStatement updateStatement = con.prepareStatement(updateSql)) {
                       // Set the content of the JTextArea as the reply in the database
                       updateStatement.setString(1, textArea.getText());
                       updateStatement.setString(2, subject);

                       // Execute the update query
                       updateStatement.executeUpdate();

                       return true; // Return true if the update was successful
                   }
               } else {
                   // User clicked NO, you can handle this case if needed
                   return false;
               }
           } catch (SQLException e) {
               e.printStackTrace(); // Handle the exception appropriately
               return false;
           }
       }
        
        
       // Method to create buttons with checkboxes from SQL and add them to the target panel
       public void displayUserEmailButtons(JPanel targetPanel, String status) {
           try {
               // Connect to the database using the 'con' connection obtained from the User class
               connectToDatabase();
               String selectSql;
               
         if ("Replied".equalsIgnoreCase(status)) {
    // If EmailStatus is "Replied", it means we want emails that have been replied or archived
    selectSql = "SELECT Subject, DateTime FROM emails WHERE Status = ? OR (Status = 'Archived' AND Replies <> '') ORDER BY DateTime DESC";
} else if ("AllArchivedSent".equalsIgnoreCase(status)) {
    // If EmailStatus is "AllArchivedSent", it means we want all archived and sent emails without a reply
    selectSql = "SELECT Subject, DateTime FROM emails WHERE (Status IN ('Archived', 'Sent') AND Replies = '') ORDER BY DateTime DESC";
}else {
            // Otherwise, select emails with the specified status
            selectSql = "SELECT Subject, DateTime FROM emails WHERE Status = ? ORDER BY DateTime DESC";
        }
               try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
                   if (!"AllArchivedSent".equalsIgnoreCase(status)) {
        // Set the status parameter only if it's not "AllArchivedSent"
        selectStatement.setString(1, status);
    }
                 
                   // Execute the query
                   ResultSet resultSet = selectStatement.executeQuery();

                   // Use BoxLayout for vertical arrangement
                   targetPanel.setLayout(new BoxLayout(targetPanel, BoxLayout.Y_AXIS));

                   while (resultSet.next()) {
                       String emailSubject = resultSet.getString("Subject");
                       String dateTime = resultSet.getString("DateTime");
                       createButtonWithCheckbox(emailSubject, dateTime, targetPanel);

                       targetPanel.add(Box.createVerticalStrut(6));
                   }
               }
           } catch (SQLException e) {
               // Handle the exception appropriately

           }

           targetPanel.revalidate();
           targetPanel.repaint();
       }

       private void createButtonWithCheckbox(String subject, String dateTime, JPanel targetPanel) {
           // Create a button

            JButton  emailButton = new JButton("<html><style>body { white-space: nowrap; }</style><font size='1'>" + dateTime + "</font> - <b><font size='3'>" + subject + "</font></b></html>");

           buttonProperties(emailButton);

           // Create a checkbox
           JCheckBox checkBox = new JCheckBox();

           // Create a panel for the button and checkbox with BoxLayout
           JPanel buttonPanel = new JPanel();
           buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

           // Add rigid area before the button for fixed horizontal space
           buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));

           // Add the checkbox and button to the panel
           buttonPanel.add(checkBox);
           buttonPanel.add(emailButton);

           // Add the panel to the target panel
           targetPanel.add(buttonPanel);

           // Add rigid area after the button for fixed horizontal space
           targetPanel.add(Box.createRigidArea(new Dimension(10, 0)));

           // Revalidate and repaint the target panel
           targetPanel.revalidate();
           targetPanel.repaint();

           // Add an ActionListener to the emailButton
           emailButton.addActionListener((ActionEvent e) -> {
               try {
                   String emailSubject = e.getActionCommand();
                   handleEmailButtonClick(subject);
                   targetPanel.revalidate();
                   
                   
               } catch (SQLException ex) {
                   Logger.getLogger(AdminEmail.class.getName()).log(Level.SEVERE, null, ex);
               }
           });
           
            checkBox.addActionListener((ActionEvent e) -> {
            
        boolean isChecked = checkBox.isSelected();
            checkedStatusMap.put(subject, isChecked);
            System.out.println("Selected Subject: " + subject + ", Checked: " + isChecked);
              
    });
       }

       // Method to set properties for the button
       private void buttonProperties(JButton button) {

           button.setHorizontalAlignment(SwingConstants.LEFT);
           button.setAlignmentX(Component.LEFT_ALIGNMENT);
           button.setFont(new Font("Courier New", Font.BOLD, 13));
           button.setForeground(new Color(33, 33, 33));
           button.setBackground(new Color(153, 153, 153));
           button.setBorder(BorderFactory.createEtchedBorder());
           button.setFocusPainted(false);

           int newWidth = 370; // Set your preferred width
           int newHeight = 40; // Set your preferred height
           button.setPreferredSize(new Dimension(newWidth, newHeight));
           button.setMinimumSize(new Dimension(newWidth, newHeight));
           button.setMaximumSize(new Dimension(newWidth, newHeight));
       }


        private void handleEmailButtonClick(String subject) throws SQLException {
            new AdminViewSelectedEmail(subject).setVisible(true);
            
            


        }
        
        private Map<String, Boolean> checkedStatusMap = new HashMap<>();     

       public void deleteSelectedEmails(JPanel targetPanel) {
        // Display a confirmation dialog before proceeding with the delete action
        int confirmResult = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete the selected emails?",
                "Delete Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION) {
            // Proceed with deletion for selected emails
            targetPanel.removeAll();

            for (Map.Entry<String, Boolean> entry : checkedStatusMap.entrySet()) {
                String subject = entry.getKey();
                boolean isChecked = entry.getValue();

                if (isChecked) {
                    try {
                        // Perform delete action for the selected email
                        deleteEmail(subject, targetPanel);

                    } catch (SQLException ex) {
                        ex.printStackTrace(); // Handle the exception appropriately
                    }
                }
            }

            // Clear the checked subjects map
            checkedStatusMap.clear();


        } else {
            // User clicked No, do nothing or handle as needed
        }
    }

    // Update the deleteEmail method to include the targetPanel parameter
    private void deleteEmail(String subject, JPanel targetPanel) throws SQLException {

        connectToDatabase();
        // Perform the email deletion logic without asking for confirmation again
        String deleteSql = "DELETE FROM emails WHERE Subject = ?";
        try (PreparedStatement deleteStatement = con.prepareStatement(deleteSql)) {
            deleteStatement.setString(1, subject);
            int rowsDeleted = deleteStatement.executeUpdate();

            if (rowsDeleted > 0) {
                // Display a JOptionPane to inform the user about the deletion action
                JOptionPane.showMessageDialog(null, "Email with subject '" + subject + "' has been deleted.");
                // Revalidate and repaint the target panel to refresh the UI
            SwingUtilities.invokeLater(() -> {
                targetPanel.revalidate();
                targetPanel.repaint();
                System.out.println("Target panel refreshed after deletion.");
            });
                 displayUserEmailButtons(targetPanel, subject);
            } else {
                // Handle the case where the deletion didn't succeed
                JOptionPane.showMessageDialog(null, "Failed to delete email with subject '" + subject + "'.");
            }


        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception appropriately
        }

         SwingUtilities.invokeLater(() -> {
                    targetPanel.revalidate();
                    targetPanel.repaint(); });
    }

     

     
}




    


    


