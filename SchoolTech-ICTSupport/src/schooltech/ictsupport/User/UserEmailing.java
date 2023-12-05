
package schooltech.ictsupport.User;

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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class UserEmailing extends User{
    
     private String loggedInEmail;
    private final String emailFor = "SchoolTech@ict-support.com";
    private String emailSubject;
    private String emailMessage;
    private String Replies = "";
    private String Status = "Sent";
  
    

    public UserEmailing() {
        
    }

    public UserEmailing(String loggedInEmail, String emailSubject, String emailMessage, java.util.Date date) {
        this.loggedInEmail = loggedInEmail;
        this.emailSubject = emailSubject;
        this.emailMessage = emailMessage;
    }

    
    public void getEmailDataFromUI(String LoginEmail, JTextField subjectField, JTextArea messageArea) {
        this.loggedInEmail = LoginEmail;
        this.emailSubject = subjectField.getText();
        this.emailMessage = messageArea.getText();
    }

    // Method to send email information to the database
   
    public boolean sendEmailToICTSupport() {
    try {
        // Check if subject and message are not empty
        if (emailSubject.isEmpty() || emailMessage.isEmpty()) {
            // Subject or message is empty, show a message dialog to the user
            JOptionPane.showMessageDialog(null, "Subject and message cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Connect to the database using the 'con' connection obtained from the User class
        connectToDatabase();

        // Check if an email with the same subject from the same sender already exists
        String checkDuplicateSql = "SELECT COUNT(*) FROM emails WHERE EmailSender = ? AND Subject = ?";
        try (PreparedStatement checkDuplicateStatement = con.prepareStatement(checkDuplicateSql)) {
            checkDuplicateStatement.setString(1, loggedInEmail);
            checkDuplicateStatement.setString(2, emailSubject);
            ResultSet resultSet = checkDuplicateStatement.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                // A duplicate email with the same subject and sender exists
                JOptionPane.showMessageDialog(null, "An email with the same subject already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Execute SQL statement to insert email information into the 'emails' table
        String insertSql = "INSERT INTO emails (EmailSender, Receiver, DateTime, Subject, Message, Status, Replies) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement insertStatement = con.prepareStatement(insertSql)) {
            insertStatement.setString(1, loggedInEmail);
            insertStatement.setString(2, emailFor);
            insertStatement.setString(3, formattedDateTime);
            insertStatement.setString(4, emailSubject);
            insertStatement.setString(5, emailMessage);
            insertStatement.setString(6, Status);
            insertStatement.setString(7, Replies);

            // Execute the update
            int rowsAffected = insertStatement.executeUpdate();

            // Check if the insertion was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Email sent successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to send Email.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    } catch (SQLException ex) {
        // If there's an error during insertion, show a message dialog to the user
        JOptionPane.showMessageDialog(null, "Failed to send email. Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}



    // Method to create buttons with checkboxes from SQL and add them to the target panel
    public void displayAllEmailintoButtonCheckbox(String loggedInEmail, JPanel targetPanel, String EmailStatus) {
        try {
            // Connect to the database using the 'con' connection obtained from the User class
            connectToDatabase();
            // Execute SQL statement to select emails based on the predefined status
              // Adjust the SQL query to handle the case where the status is not equal to a specific value
        String selectSql;
        if (EmailStatus.startsWith("!")) {
            // If EmailStatus starts with "!", it means we want emails with a status not equal to the provided value
            selectSql = "SELECT Subject, DateTime FROM emails WHERE EmailSender = ? AND Status != ? ORDER BY DateTime DESC";
            // Remove "!" from the beginning of EmailStatus for comparison
            EmailStatus = EmailStatus.substring(1);
        } else if ("Replied".equalsIgnoreCase(EmailStatus)) {
            // If EmailStatus is "togot", it means we want emails that have been replied
        selectSql = "SELECT Subject, DateTime FROM emails WHERE EmailSender = ? AND (Status = ? OR (Status = 'Archived' AND Replies <> '')) ORDER BY DateTime DESC";

        }else {
            // Otherwise, select emails with the specified status
            selectSql = "SELECT Subject, DateTime FROM emails WHERE EmailSender = ? AND Status = ? ORDER BY DateTime DESC";
        }
            try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
                selectStatement.setString(1, loggedInEmail);
                selectStatement.setString(2, EmailStatus);
                // Execute the query
                ResultSet resultSet = selectStatement.executeQuery();

                // Use BoxLayout for vertical arrangement
                targetPanel.setLayout(new BoxLayout(targetPanel, BoxLayout.Y_AXIS));

                while (resultSet.next()) {
                    String emailSubject = resultSet.getString("Subject");
                    String dateTime = resultSet.getString("DateTime");

                    targetPanel.add(Box.createVerticalStrut(6));

                   boolean isReplied = isEmailReplied(loggedInEmail, emailSubject);
                    createButtonWithCheckbox(emailSubject, dateTime, isReplied, targetPanel);



                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
 SwingUtilities.invokeLater(() -> {
        targetPanel.revalidate();
        targetPanel.repaint();
    });
    }
     
    private void createButtonWithCheckbox(String subject, String dateTime, boolean isReplied, JPanel targetPanel ) {
        // Create a button

         JButton  emailButton = new JButton("<html><style>body { white-space: nowrap; }</style><font size='1'>" + dateTime + "</font> - <b><font size='3'>" + subject + "</font></b></html>");

        buttonProperties(emailButton, isReplied);


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
                handleEmailButtonClick(subject);
            } catch (SQLException ex) {
                Logger.getLogger(UserEmailing.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
         checkBox.addActionListener((ActionEvent e) -> {
            
        boolean isChecked = checkBox.isSelected();
            checkedStatusMap.put(subject, isChecked);
           
              
    });
         }
    
      // Add a Map to track the checked status for each subject
    private Map<String, Boolean> checkedStatusMap = new HashMap<>();          
 
    // Method to set properties for the button
    private void buttonProperties(JButton button, boolean isReplied) {

        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setFont(new Font("Courier New", Font.BOLD, 13));
        button.setForeground(new Color(33, 33, 33));
        button.setBackground(new Color(153, 153, 153));
        if (isReplied) {

            button.setBorder(BorderFactory.createEtchedBorder(Color.PINK, Color.PINK));
        } else {
            button.setBackground(new Color(153, 153, 153));
            button.setBorder(BorderFactory.createEtchedBorder());
        }
        button.setFocusPainted(false);

        int newWidth = 370; // Set your preferred width
        int newHeight = 40; // Set your preferred height
        button.setPreferredSize(new Dimension(newWidth, newHeight));
        button.setMinimumSize(new Dimension(newWidth, newHeight));
        button.setMaximumSize(new Dimension(newWidth, newHeight));
    }

  
    public void archiveSelectedEmails(JPanel targetPanel, String loggedInEmail) {
        
     
    // Display a confirmation dialog before proceeding with the archive action
    int confirmResult = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to archive the selected emails?",
            "Archive Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirmResult == JOptionPane.YES_OPTION) {
        for (Map.Entry<String, Boolean> entry : checkedStatusMap.entrySet()) {
            String subject = entry.getKey();
            boolean isChecked = entry.getValue();

            if (isChecked) {
                try {
                    // Perform archive action for the selected email
                    archiveEmail(subject, loggedInEmail);

                    // Update the display after archiving
                    displayAllEmailintoButtonCheckbox(loggedInEmail, targetPanel, Status);
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

// Method to archive an email
private void archiveEmail(String subject, String emailSender) throws SQLException {
    String archiveSql = "UPDATE emails SET Status = 'Archived' WHERE Subject = ? AND EmailSender = ?";
    try (PreparedStatement archiveStatement = con.prepareStatement(archiveSql)) {
        archiveStatement.setString(1, subject);
        archiveStatement.setString(2, emailSender);
        int rowsUpdated = archiveStatement.executeUpdate();

        if (rowsUpdated > 0) {
            // Display a JOptionPane to inform the user about the archiving action
            JOptionPane.showMessageDialog(null, "Email with subject '" + subject + "' has been archived.");
        } else {
            // Handle the case where the update didn't succeed
            JOptionPane.showMessageDialog(null, "Failed to archive email with subject '" + subject + "'.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Handle the exception appropriately
    }
}
    
    private void handleEmailButtonClick(String subject) throws SQLException {
         new ViewSelectedEmail(subject).setVisible(true);
     }

    public void unarchiveSelectedEmails(String emailSender) {
            // Display a confirmation dialog before proceeding with the unarchive action
    int confirmResult = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to unarchive the selected emails?",
            "Unarchive Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirmResult == JOptionPane.YES_OPTION) {
        // Proceed with unarchiving for selected emails
        for (Map.Entry<String, Boolean> entry : checkedStatusMap.entrySet()) {
            String subject = entry.getKey();
            boolean isChecked = entry.getValue();

            if (isChecked) {
                try {
                    // Perform unarchive action for the selected email
                    unarchiveEmail(subject, emailSender);
                } catch (SQLException ex) {
                    ex.printStackTrace(); // Handle the exception appropriately
                }
            }
        }

        // Clear the checked subjects map
        checkedStatusMap.clear();
    } else {
         }
    }

      private void unarchiveEmail(String subject, String emailSender) throws SQLException {
        // Display a confirmation dialog before proceeding with the unarchive action
       
            String selectSql = "SELECT * FROM emails WHERE Status = 'Replied' AND EmailSender = ? AND Subject = ?";
            try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
                selectStatement.setString(1, emailSender);
                selectStatement.setString(2, subject);

                // Execute the query
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    boolean hasReply = resultSet.next();

                    // Update the email status based on whether there is a reply
                    String updateSql;
                    if (hasReply) {
                        updateSql = "UPDATE emails SET Status = 'Replied' WHERE Subject = ? AND EmailSender = ?";
                    } else {
                        updateSql = "UPDATE emails SET Status = 'Sent' WHERE Subject = ? AND EmailSender = ?";
                    }

                    try (PreparedStatement updateStatement = con.prepareStatement(updateSql)) {
                        updateStatement.setString(1, subject);
                        updateStatement.setString(2, emailSender);
                        int rowsUpdated = updateStatement.executeUpdate();

                        if (rowsUpdated > 0) {
                            // Display a JOptionPane to inform the user about the unarchiving action
                            JOptionPane.showMessageDialog(null, "Email with subject '" + subject + "' has been unarchived.");


                        } else {
                            // Handle the case where the update didn't succeed
                            JOptionPane.showMessageDialog(null, "Failed to unarchive email with subject '" + subject + "'.");
                        }
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Handle the exception appropriately
            }
        }

    private boolean isEmailReplied(String loggedInEmail, String emailSubject) {
    try {
        // Connect to the database
        connectToDatabase();

        // Execute SQL statement to check if the email has a reply
          String selectSql = "SELECT * FROM emails WHERE EmailSender = ? AND Subject = ? AND Replies <> ''";
        try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
            selectStatement.setString(1, loggedInEmail);
            selectStatement.setString(2, emailSubject);

            // Execute the query
            try (ResultSet resultSet = selectStatement.executeQuery()) {
                // Check if there is at least one row in the result set
                return resultSet.next();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle the exception appropriately
        return false; // Return false in case of an exception
    }
}

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
                
                   // Revalidate and repaint the target panel to refresh the UI
       
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
    // Perform the email deletion logic without asking for confirmation again
    String deleteSql = "DELETE FROM emails WHERE Subject = ?";
    try (PreparedStatement deleteStatement = con.prepareStatement(deleteSql)) {
        deleteStatement.setString(1, subject);
        int rowsDeleted = deleteStatement.executeUpdate();

        if (rowsDeleted > 0) {
            // Display a JOptionPane to inform the user about the deletion action
            JOptionPane.showMessageDialog(null, "Email with subject '" + subject + "' has been deleted.");
        } else {
            // Handle the case where the deletion didn't succeed
            JOptionPane.showMessageDialog(null, "Failed to delete email with subject '" + subject + "'.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Handle the exception appropriately
    }
}
    

     
}





    


    


