/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport.User;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewSelectedEmail extends javax.swing.JFrame {

    
    private Connection con;
    private String SubjectSelected;
    
   
    public ViewSelectedEmail(String subject)throws SQLException {
        initComponents();
        
      this.SubjectSelected = subject;
      
      getthesubjectemailfromDatabase();
      
      this.setPreferredSize(new Dimension(480, 420));
      
       setLocationRelativeTo(null);
       
     
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        EmailInformationViewing = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        MessagePane = new javax.swing.JScrollPane();
        ViewMessageofTheEmail = new javax.swing.JLabel();
        ReplyLabel = new javax.swing.JLabel();
        ReplyPanel = new javax.swing.JScrollPane();
        ReplyforTheEmail = new javax.swing.JLabel();
        SubjectName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ViewEmail");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(470, 572));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(470, 572));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(470, 572));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Viewing Email");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 10, 240, 40);

        EmailInformationViewing.setBackground(new java.awt.Color(255, 255, 204));
        EmailInformationViewing.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        EmailInformationViewing.setForeground(new java.awt.Color(204, 160, 193));
        EmailInformationViewing.setText("Information");
        EmailInformationViewing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EmailInformationViewing.setOpaque(true);
        jPanel1.add(EmailInformationViewing);
        EmailInformationViewing.setBounds(40, 110, 390, 50);

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
        Back.setBounds(14, 14, 30, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 160, 193));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Message");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 180, 80, 20);

        MessagePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MessagePane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MessagePane.setMaximumSize(new java.awt.Dimension(100, 100));
        MessagePane.setMinimumSize(new java.awt.Dimension(100, 100));

        ViewMessageofTheEmail.setBackground(new java.awt.Color(204, 204, 204));
        ViewMessageofTheEmail.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        ViewMessageofTheEmail.setText("Message");
        ViewMessageofTheEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ViewMessageofTheEmail.setAutoscrolls(true);
        ViewMessageofTheEmail.setMaximumSize(new java.awt.Dimension(5454, 45545));
        ViewMessageofTheEmail.setOpaque(true);
        MessagePane.setViewportView(ViewMessageofTheEmail);

        jPanel1.add(MessagePane);
        MessagePane.setBounds(40, 190, 390, 160);

        ReplyLabel.setBackground(new java.awt.Color(255, 255, 204));
        ReplyLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ReplyLabel.setForeground(new java.awt.Color(204, 160, 193));
        ReplyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReplyLabel.setText("Reply:");
        ReplyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ReplyLabel.setOpaque(true);
        jPanel1.add(ReplyLabel);
        ReplyLabel.setBounds(30, 380, 80, 20);

        ReplyforTheEmail.setBackground(new java.awt.Color(204, 204, 204));
        ReplyforTheEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        ReplyforTheEmail.setText("Message");
        ReplyforTheEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ReplyforTheEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ReplyforTheEmail.setOpaque(true);
        ReplyPanel.setViewportView(ReplyforTheEmail);

        jPanel1.add(ReplyPanel);
        ReplyPanel.setBounds(40, 390, 400, 150);

        SubjectName.setBackground(new java.awt.Color(255, 255, 204));
        SubjectName.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        SubjectName.setForeground(new java.awt.Color(204, 160, 193));
        SubjectName.setText("jLabel2");
        SubjectName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubjectName.setOpaque(true);
        jPanel1.add(SubjectName);
        SubjectName.setBounds(40, 66, 390, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackGround/6604008.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-23, -14, 510, 640);

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
        + "From: " + sender + "<br>"
        + "To: " + receiver + "<br>"
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
               this.setPreferredSize(new Dimension(480, 600));
               this.pack();
               
               
                ReplyPanel.setVisible(true);
                // Extract and display the message in ViewMessageofTheEmail label
                ReplyforTheEmail.setText("<html><body style='margin: " + margin + "px;'>" + reply.replace("\n", "<br>") + "</body></html>");
                
                
            } else {
                ReplyLabel.setVisible(false);
                // If the message is empty, hide the reply panel
                // Assuming you have a replyPanel variable representing the reply panel
                ReplyPanel.setVisible(false);
                
                this.setPreferredSize(new Dimension(480, 420));
                this.pack();
            }
    }
} catch (SQLException e) {
            // Handle the exception appropriately
            
            
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
            java.util.logging.Logger.getLogger(ViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ViewSelectedEmail("").setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ViewSelectedEmail.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel EmailInformationViewing;
    private javax.swing.JScrollPane MessagePane;
    private javax.swing.JLabel ReplyLabel;
    private javax.swing.JScrollPane ReplyPanel;
    private javax.swing.JLabel ReplyforTheEmail;
    private javax.swing.JLabel SubjectName;
    private javax.swing.JLabel ViewMessageofTheEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    Object EmailInformationViewing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
