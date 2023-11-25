
package schooltechadmin;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author YLADx
 */
public class AdminEmailMainInterface extends javax.swing.JFrame {

   AdminEmail adminemailreceive = new AdminEmail();
    private String currentStatus;
    
    
    public AdminEmailMainInterface() {
        initComponents();
        
        //set UserAccount ButtonNametoLoginusername
     
              
        adminemailreceive.populateUserComboBox(UserList, DeleteUserButton);
         EmailSent.doClick();
         
           
        setLocationRelativeTo(null);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Account = new javax.swing.JFrame();
        AccountBg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogoutfromAccount = new javax.swing.JButton();
        DeleteAllEMail = new javax.swing.JButton();
        backfromacc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DeleteUserLabel = new javax.swing.JLabel();
        UserList = new javax.swing.JComboBox<>();
        DeleteUserButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BackGround = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        ButtonMenu = new javax.swing.JPanel();
        EmailSent = new javax.swing.JButton();
        Replied = new javax.swing.JButton();
        MenuLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        AccountPanel = new javax.swing.JPanel();
        UserAccountButton = new javax.swing.JButton();
        ClickButton = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmailPanel = new javax.swing.JPanel();

        Account.setTitle("ADMIN ACCOUNT");
        Account.setResizable(false);

        AccountBg.setBackground(new java.awt.Color(255, 255, 255));
        AccountBg.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-account-64.png"))); // NOI18N
        AccountBg.add(jLabel5);
        jLabel5.setBounds(100, 20, 70, 70);

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN ACCOUNT");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        AccountBg.add(jLabel2);
        jLabel2.setBounds(60, 90, 150, 27);

        LogoutfromAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-16.png"))); // NOI18N
        LogoutfromAccount.setContentAreaFilled(false);
        LogoutfromAccount.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LogoutfromAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutfromAccountActionPerformed(evt);
            }
        });
        AccountBg.add(LogoutfromAccount);
        LogoutfromAccount.setBounds(230, 10, 30, 30);

        DeleteAllEMail.setBackground(new java.awt.Color(255, 51, 51));
        DeleteAllEMail.setText("Delete All Email Receive");
        DeleteAllEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllEMailActionPerformed(evt);
            }
        });
        AccountBg.add(DeleteAllEMail);
        DeleteAllEMail.setBounds(30, 250, 210, 30);

        backfromacc.setBackground(new java.awt.Color(153, 255, 153));
        backfromacc.setText("Back");
        backfromacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backfromaccActionPerformed(evt);
            }
        });
        AccountBg.add(backfromacc);
        backfromacc.setBounds(30, 300, 210, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DeleteUserLabel.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        DeleteUserLabel.setForeground(new java.awt.Color(51, 51, 51));
        DeleteUserLabel.setText("Delete User");

        UserList.setBackground(new java.awt.Color(255, 255, 204));
        UserList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DeleteUserButton.setBackground(new java.awt.Color(255, 51, 51));
        DeleteUserButton.setText("Delete User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(DeleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeleteUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(DeleteUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(DeleteUserButton)
                .addContainerGap())
        );

        AccountBg.add(jPanel1);
        jPanel1.setBounds(20, 130, 230, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Background/8351299.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        AccountBg.add(jLabel3);
        jLabel3.setBounds(-560, -40, 870, 410);

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account.getContentPane());
        Account.getContentPane().setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountBg, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountBg, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCHOOLTECH[ADMIN]");
        setMinimumSize(new java.awt.Dimension(720, 450));
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 254, 239));
        BackGround.setMinimumSize(new java.awt.Dimension(720, 450));
        BackGround.setLayout(null);

        Left.setBackground(new java.awt.Color(102, 102, 102));
        Left.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Left.setLayout(null);

        Back.setBackground(new java.awt.Color(255, 254, 239));
        Back.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 16)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<] ");
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
        Left.add(Back);
        Back.setBounds(8, 15, 29, 24);

        ButtonMenu.setBackground(new java.awt.Color(33, 33, 33));
        ButtonMenu.setOpaque(false);

        EmailSent.setBackground(new java.awt.Color(255, 255, 204));
        EmailSent.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        EmailSent.setForeground(new java.awt.Color(102, 102, 102));
        EmailSent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-inbox-30.png"))); // NOI18N
        EmailSent.setText("Email User Sent");
        EmailSent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmailSent.setName("EmailSent"); // NOI18N
        EmailSent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailSentActionPerformed(evt);
            }
        });

        Replied.setBackground(new java.awt.Color(255, 255, 204));
        Replied.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        Replied.setForeground(new java.awt.Color(102, 102, 102));
        Replied.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reply-30.png"))); // NOI18N
        Replied.setText("Replied Email");
        Replied.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Replied.setName("Replied Email"); // NOI18N
        Replied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepliedActionPerformed(evt);
            }
        });

        MenuLabel.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 14)); // NOI18N
        MenuLabel.setForeground(new java.awt.Color(255, 255, 204));
        MenuLabel.setText("Admin Menu:");

        javax.swing.GroupLayout ButtonMenuLayout = new javax.swing.GroupLayout(ButtonMenu);
        ButtonMenu.setLayout(ButtonMenuLayout);
        ButtonMenuLayout.setHorizontalGroup(
            ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Replied, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(EmailSent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonMenuLayout.setVerticalGroup(
            ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailSent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Replied, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1821, Short.MAX_VALUE))
        );

        Left.add(ButtonMenu);
        ButtonMenu.setBounds(10, 60, 229, 1973);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Background/8351291.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 33, 33), 5));
        Left.add(jLabel1);
        jLabel1.setBounds(-180, 0, 440, 450);

        BackGround.add(Left);
        Left.setBounds(0, 0, 260, 450);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-30.png"))); // NOI18N
        Delete.setBorderPainted(false);
        Delete.setContentAreaFilled(false);
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        BackGround.add(Delete);
        Delete.setBounds(680, 70, 20, 20);

        AccountPanel.setBackground(new java.awt.Color(102, 102, 102));
        AccountPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UserAccountButton.setBackground(new java.awt.Color(51, 51, 51));
        UserAccountButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        UserAccountButton.setForeground(new java.awt.Color(33, 33, 33));
        UserAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-account-24 (1).png"))); // NOI18N
        UserAccountButton.setText("ADMIN");
        UserAccountButton.setBorderPainted(false);
        UserAccountButton.setContentAreaFilled(false);
        UserAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserAccountButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UserAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        UserAccountButton.setName("UserAccountButton"); // NOI18N
        UserAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAccountButtonActionPerformed(evt);
            }
        });

        ClickButton.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 18)); // NOI18N
        ClickButton.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ClickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(UserAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ClickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        BackGround.add(AccountPanel);
        AccountPanel.setBounds(260, 0, 460, 60);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(390, 8000));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(390, 290));

        EmailPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmailPanel.setMinimumSize(new java.awt.Dimension(390, 290));
        EmailPanel.setOpaque(false);
        EmailPanel.setLayout(null);
        jScrollPane3.setViewportView(EmailPanel);

        BackGround.add(jScrollPane3);
        jScrollPane3.setBounds(270, 100, 450, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAccountButtonActionPerformed
        
        
       
          Account.setPreferredSize(new Dimension(280, 400));
        Account.pack();

        Account.setLocationRelativeTo(null);
        Account.setVisible(true);
    }//GEN-LAST:event_UserAccountButtonActionPerformed

    private void RepliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepliedActionPerformed
        // Store the current status before updating to "Replied"
    currentStatus = "Replied";
    ButtonCLick(evt);

    EmailPanel.removeAll();
             adminemailreceive.displayUserEmailButtons(EmailPanel, currentStatus);  

    revalidate();
    repaint();
    }//GEN-LAST:event_RepliedActionPerformed

    private void EmailSentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailSentActionPerformed
        ButtonCLick(evt);
        
        currentStatus = "!Replied";
     EmailPanel.removeAll();
            adminemailreceive.displayUserEmailButtons(EmailPanel, currentStatus);    
 
       
         revalidate();
         repaint();
    }//GEN-LAST:event_EmailSentActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        int confirmLogout = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmLogout == JOptionPane.YES_OPTION) {
        
        this.dispose();
    } else {
        // User chose not to log out, you can add any additional actions here
    }
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
   
        EmailPanel.removeAll();
        adminemailreceive.deleteSelectedEmails( EmailPanel);
    
            adminemailreceive.displayUserEmailButtons(EmailPanel, currentStatus); 
   
     
        revalidate();
         repaint();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void backfromaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backfromaccActionPerformed
      Account.dispose();
    }//GEN-LAST:event_backfromaccActionPerformed

    private void LogoutfromAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutfromAccountActionPerformed
       
       Account.dispose();
       this.dispose();
    }//GEN-LAST:event_LogoutfromAccountActionPerformed

    private void DeleteAllEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllEMailActionPerformed
       adminemailreceive.deleteAllEmails(EmailPanel);
    }//GEN-LAST:event_DeleteAllEMailActionPerformed

    private void ButtonCLick(ActionEvent evt){
           JButton sourceButton = (JButton) evt.getSource();
    String buttonName = sourceButton.getName();

    ClickButton.setText(buttonName);

    // Enable clicked button and disable all other buttons
    for (Component component : ButtonMenu.getComponents()) {
        if (component instanceof JButton) {
            JButton button = (JButton) component;
            button.setEnabled(button != sourceButton);
        }
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
            java.util.logging.Logger.getLogger(AdminEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEmailMainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Account;
    private javax.swing.JPanel AccountBg;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JButton Back;
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel ButtonMenu;
    private javax.swing.JLabel ClickButton;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteAllEMail;
    private javax.swing.JButton DeleteUserButton;
    private javax.swing.JLabel DeleteUserLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JButton EmailSent;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LogoutfromAccount;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JButton Replied;
    private javax.swing.JButton UserAccountButton;
    private javax.swing.JComboBox<String> UserList;
    private javax.swing.JButton backfromacc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
