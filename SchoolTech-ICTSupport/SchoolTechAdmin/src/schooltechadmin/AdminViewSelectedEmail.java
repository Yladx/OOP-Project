/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltechadmin;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminViewSelectedEmail extends javax.swing.JFrame {

    AdminEmail adminmethod = new AdminEmail();
    private Connection con;
    private final String SubjectSelected;
    
   
    public AdminViewSelectedEmail(String subject)throws SQLException {
        initComponents();
        
      this.SubjectSelected = subject;
      
      getthesubjectemailfromDatabase();
      
      this.setPreferredSize(new Dimension(480, 420));
      
       setLocationRelativeTo(null);
       
     Replytoemail.setPreferredSize(new Dimension(600, 448));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Replytoemail = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        ReplytothisEmail = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReplyMessage = new javax.swing.JTextPane();
        SendReply = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        MessageLabel = new javax.swing.JLabel();
        MessagePane = new javax.swing.JScrollPane();
        ViewMessageofTheEmail = new javax.swing.JLabel();
        Replylabel = new javax.swing.JLabel();
        ReplyButton = new javax.swing.JButton();
        ReplyPanel = new javax.swing.JScrollPane();
        ReplyforTheEmail = new javax.swing.JLabel();
        SubjectName = new javax.swing.JLabel();
        EmailInformationViewing = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Replytoemail.setTitle("REPLY");
        Replytoemail.setMinimumSize(new java.awt.Dimension(429, 328));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        ReplytothisEmail.setBackground(new java.awt.Color(255, 255, 204));
        ReplytothisEmail.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 14)); // NOI18N
        ReplytothisEmail.setForeground(new java.awt.Color(33, 33, 33));
        ReplytothisEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReplytothisEmail.setText("Reply to this Email");
        ReplytothisEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ReplytothisEmail.setOpaque(true);

        ReplyMessage.setBackground(new java.awt.Color(204, 204, 204));
        ReplyMessage.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        ReplyMessage.setForeground(new java.awt.Color(33, 33, 33));
        jScrollPane2.setViewportView(ReplyMessage);

        SendReply.setBackground(new java.awt.Color(204, 255, 204));
        SendReply.setForeground(new java.awt.Color(102, 102, 102));
        SendReply.setText("Reply");
        SendReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendReplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SendReply)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ReplytothisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(ReplytothisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SendReply)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout ReplytoemailLayout = new javax.swing.GroupLayout(Replytoemail.getContentPane());
        Replytoemail.getContentPane().setLayout(ReplytoemailLayout);
        ReplytoemailLayout.setHorizontalGroup(
            ReplytoemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ReplytoemailLayout.setVerticalGroup(
            ReplytoemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMAIL VIEWING");
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(470, 572));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(470, 572));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(470, 572));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(153, 255, 153));
        jLabel4.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ViewEmail");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 10, 190, 30);

        Back.setBackground(new java.awt.Color(51, 51, 51));
        Back.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 16)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 51, 51));
        Back.setText("<<");
        Back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(20, 20, 24, 24);

        MessageLabel.setBackground(new java.awt.Color(255, 204, 204));
        MessageLabel.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        MessageLabel.setForeground(new java.awt.Color(102, 102, 102));
        MessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MessageLabel.setText("Message");
        MessageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        MessageLabel.setOpaque(true);
        jPanel1.add(MessageLabel);
        MessageLabel.setBounds(30, 180, 80, 20);

        MessagePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MessagePane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MessagePane.setMaximumSize(new java.awt.Dimension(100, 100));
        MessagePane.setMinimumSize(new java.awt.Dimension(100, 100));

        ViewMessageofTheEmail.setBackground(new java.awt.Color(255, 255, 255));
        ViewMessageofTheEmail.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        ViewMessageofTheEmail.setText("Message");
        ViewMessageofTheEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ViewMessageofTheEmail.setAutoscrolls(true);
        ViewMessageofTheEmail.setMaximumSize(new java.awt.Dimension(5454, 45545));
        ViewMessageofTheEmail.setOpaque(true);
        MessagePane.setViewportView(ViewMessageofTheEmail);

        jPanel1.add(MessagePane);
        MessagePane.setBounds(40, 190, 390, 160);

        Replylabel.setBackground(new java.awt.Color(255, 204, 204));
        Replylabel.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        Replylabel.setForeground(new java.awt.Color(102, 102, 102));
        Replylabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Replylabel.setText("Replies");
        Replylabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Replylabel.setOpaque(true);
        jPanel1.add(Replylabel);
        Replylabel.setBounds(30, 376, 80, 20);

        ReplyButton.setBackground(new java.awt.Color(153, 255, 255));
        ReplyButton.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        ReplyButton.setForeground(new java.awt.Color(51, 51, 51));
        ReplyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reply-24.png"))); // NOI18N
        ReplyButton.setText("Reply ");
        ReplyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReplyButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ReplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReplyButton);
        ReplyButton.setBounds(370, 370, 80, 30);

        ReplyforTheEmail.setBackground(new java.awt.Color(255, 255, 255));
        ReplyforTheEmail.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        ReplyforTheEmail.setText("Message");
        ReplyforTheEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ReplyforTheEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ReplyforTheEmail.setOpaque(true);
        ReplyPanel.setViewportView(ReplyforTheEmail);

        jPanel1.add(ReplyPanel);
        ReplyPanel.setBounds(40, 380, 390, 170);

        SubjectName.setBackground(new java.awt.Color(255, 204, 204));
        SubjectName.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        SubjectName.setForeground(new java.awt.Color(102, 102, 102));
        SubjectName.setText("jLabel2");
        SubjectName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SubjectName.setOpaque(true);
        jPanel1.add(SubjectName);
        SubjectName.setBounds(40, 60, 390, 30);

        EmailInformationViewing.setBackground(new java.awt.Color(255, 204, 204));
        EmailInformationViewing.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        EmailInformationViewing.setForeground(new java.awt.Color(102, 102, 102));
        EmailInformationViewing.setText("Information");
        EmailInformationViewing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EmailInformationViewing.setOpaque(true);
        jPanel1.add(EmailInformationViewing);
        EmailInformationViewing.setBounds(40, 110, 390, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Background/8351224.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-60, 0, 760, 570);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ReplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplyButtonActionPerformed
            Replytoemail.setVisible(true);
        
        Replytoemail.setPreferredSize(new Dimension(600, 350));
       
    }//GEN-LAST:event_ReplyButtonActionPerformed

    private void SendReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendReplyActionPerformed
         boolean replySent = adminmethod.updateEmailStatus(SubjectSelected, ReplyMessage);

        if (replySent) {
            JOptionPane.showMessageDialog(null, "Reply sent successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            Replytoemail.dispose();
           
            this.dispose();
            
       
            
            
        } else {
        JOptionPane.showMessageDialog(null, "Failed to send reply.", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_SendReplyActionPerformed
    }
    
        public void getthesubjectemailfromDatabase() throws SQLException{
        connectToDatabase();

// SQL statement to retrieve email information based on the subject
String selectSql = "SELECT * FROM emails WHERE Subject = ?";
try (PreparedStatement selectStatement = con.prepareStatement(selectSql)) {
    selectStatement.setString(1, SubjectSelected);

    ResultSet resultSet = selectStatement.executeQuery();

    if (resultSet.next()) {
        // Extract information from the result set
        String datetime = resultSet.getString("DateTime");
        String sender = resultSet.getString("EmailSender");
        String receiver = resultSet.getString("Receiver");
        String message = resultSet.getString("Message");
        String reply = resultSet.getString("Replies");
        // Display information in labels
       String displayText = "<html>"
        + "Sender: " + sender + "<br>"
        + "Receiver: " + receiver + "<br>"
        + "Date/Time: " + datetime + "<br>"     
        + "</html>";

        // Set the text in EmailInformationViewing label
        EmailInformationViewing.setText("<html><div style='margin: 10px;'>" + displayText + "</div></html>");

            // Assuming you want a margin of 10 pixels on all sides
        int margin = 10;
        String styledMessage = "<html><body style='margin: " + margin + "px;'>" + message.replace("\n", "<br>") + "</body></html>";
        ViewMessageofTheEmail.setText(styledMessage);

        // Set the preferred size to allow the label to expand vertically
        ViewMessageofTheEmail.setPreferredSize(new Dimension(370, Integer.MAX_VALUE));

        // Ensure the label wraps text and adjusts its size accordingly
        ViewMessageofTheEmail.setSize(ViewMessageofTheEmail.getPreferredSize());
            
       
         SubjectName.setText("<html><div style='margin: 10px;'>Subject: " + SubjectSelected + "</div></html>");
         
            // Check if the message is not empty
            if (!reply.isEmpty()) {
                
                
                // Display the reply panel
                // Assuming you have a replyPanel variable representing the reply panel
               this.setPreferredSize(new Dimension(480, 614));
               this.pack();
               
                ReplyButton.setVisible(false);
                ReplyPanel.setVisible(true);
                // Extract and display the message in ViewMessageofTheEmail label
                ReplyforTheEmail.setText("<html><body style='margin: " + margin + "px;'>" + reply.replace("\n", "<br>") + "</body></html>");
                
                
            } else {
             
                Replylabel.setVisible(false);
                // If the message is empty, hide the reply panel
                // Assuming you have a replyPanel variable representing the reply panel
                ReplyPanel.setVisible(false);
                
                this.setPreferredSize(new Dimension(480, 448));
                this.pack();
            }
    }
} catch (SQLException e) {
    e.printStackTrace(); // Handle the exception appropriately
}
}
        

     protected void connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooltech?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
          
        
        } catch (ClassNotFoundException ex) {
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminViewSelectedEmail("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminViewSelectedEmail.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel EmailInformationViewing;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JScrollPane MessagePane;
    private javax.swing.JButton ReplyButton;
    private javax.swing.JTextPane ReplyMessage;
    private javax.swing.JScrollPane ReplyPanel;
    private javax.swing.JLabel ReplyforTheEmail;
    private javax.swing.JLabel Replylabel;
    private javax.swing.JDialog Replytoemail;
    private javax.swing.JLabel ReplytothisEmail;
    private javax.swing.JButton SendReply;
    private javax.swing.JLabel SubjectName;
    private javax.swing.JLabel ViewMessageofTheEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    Object EmailInformationViewing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
