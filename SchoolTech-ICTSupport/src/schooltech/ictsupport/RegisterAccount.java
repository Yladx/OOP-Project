/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import schooltech.ictsupport.User.RegisterUser;


public class RegisterAccount extends javax.swing.JFrame {
    
    

    
    
    public RegisterAccount() throws SQLException {
        
        initComponents();       
        DoyouWanttoRegister.setText("<html> Ready to register? Press 'Yes' if everything is correct, or 'No' to edit. </html>");
         FilloutPanel.setBackground(new Color (255,255,255,45));
        RegisterConfirmation. setLocationRelativeTo(null);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterConfirmation = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        YES = new javax.swing.JButton();
        No = new javax.swing.JButton();
        DoyouWanttoRegister = new javax.swing.JLabel();
        AllUserInput = new javax.swing.JLabel();
        BackGround = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FilloutPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        SrCode = new javax.swing.JTextField();
        SrCodeLabel = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        DoBLabel = new javax.swing.JLabel();
        DateofBirth = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ConfirmPass = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(231, 244));
        jPanel2.setMinimumSize(new java.awt.Dimension(231, 244));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Confirm your Information:");

        jPanel3.setBackground(new java.awt.Color(255, 254, 239));
        jPanel3.setForeground(new java.awt.Color(255, 254, 239));

        YES.setBackground(new java.awt.Color(0, 153, 51));
        YES.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        YES.setText("Yes");
        YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YESActionPerformed(evt);
            }
        });

        No.setBackground(new java.awt.Color(185, 21, 21));
        No.setText("NO");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        DoyouWanttoRegister.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        DoyouWanttoRegister.setForeground(new java.awt.Color(33, 33, 33));
        DoyouWanttoRegister.setText("Ready to register? Press 'Yes' if everything is correct, or 'No' to edit.");
        DoyouWanttoRegister.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DoyouWanttoRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YES)
                        .addGap(18, 18, 18)
                        .addComponent(No)
                        .addGap(31, 31, 31))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(DoyouWanttoRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(No)
                    .addComponent(YES))
                .addGap(9, 9, 9))
        );

        AllUserInput.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        AllUserInput.setForeground(new java.awt.Color(33, 33, 33));
        AllUserInput.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AllUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel3))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RegisterConfirmationLayout = new javax.swing.GroupLayout(RegisterConfirmation.getContentPane());
        RegisterConfirmation.getContentPane().setLayout(RegisterConfirmationLayout);
        RegisterConfirmationLayout.setHorizontalGroup(
            RegisterConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, Short.MAX_VALUE)
        );
        RegisterConfirmationLayout.setVerticalGroup(
            RegisterConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCHOOLTECH[REGISTER]");
        setMinimumSize(new java.awt.Dimension(720, 447));

        BackGround.setBackground(new java.awt.Color(255, 255, 204));
        BackGround.setMinimumSize(new java.awt.Dimension(720, 447));
        BackGround.setPreferredSize(new java.awt.Dimension(720, 447));
        BackGround.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 33, 33));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register Acc");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jLabel2.setOpaque(true);
        BackGround.add(jLabel2);
        jLabel2.setBounds(260, 30, 210, 50);

        FilloutPanel.setBackground(new java.awt.Color(255, 255, 255));
        FilloutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 33, 33), 3));
        FilloutPanel.setForeground(new java.awt.Color(33, 33, 33));

        NameLabel.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(33, 33, 33));
        NameLabel.setText("Name");

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(33, 33, 33));
        EmailLabel.setText("Email");

        SrCode.setBackground(new java.awt.Color(255, 255, 255));
        SrCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SrCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrCodeActionPerformed(evt);
            }
        });

        SrCodeLabel.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        SrCodeLabel.setForeground(new java.awt.Color(33, 33, 33));
        SrCodeLabel.setText("SR-Code: ");

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        DoBLabel.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        DoBLabel.setForeground(new java.awt.Color(33, 33, 33));
        DoBLabel.setText("Date of Birth: YYYY-MM-DD");

        DateofBirth.setBackground(new java.awt.Color(255, 255, 255));
        DateofBirth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateofBirthActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 33, 33));
        jLabel6.setText("Password:");

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(33, 33, 33));
        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Confirm Password:");

        ConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FilloutPanelLayout = new javax.swing.GroupLayout(FilloutPanel);
        FilloutPanel.setLayout(FilloutPanelLayout);
        FilloutPanelLayout.setHorizontalGroup(
            FilloutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilloutPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(FilloutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilloutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(FilloutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(164, 164, 164))
                    .addComponent(SrCode)
                    .addGroup(FilloutPanelLayout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addComponent(Name)
                    .addGroup(FilloutPanelLayout.createSequentialGroup()
                        .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(176, 176, 176))
                    .addComponent(Email)
                    .addComponent(DateofBirth)
                    .addComponent(Password)
                    .addComponent(ConfirmPass)
                    .addGroup(FilloutPanelLayout.createSequentialGroup()
                        .addComponent(DoBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addComponent(SrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        FilloutPanelLayout.setVerticalGroup(
            FilloutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilloutPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SrCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        BackGround.add(FilloutPanel);
        FilloutPanel.setBounds(230, 70, 260, 320);

        Register.setBackground(new java.awt.Color(255, 102, 102));
        Register.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-register-24.png"))); // NOI18N
        Register.setText("Register");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        BackGround.add(Register);
        Register.setBounds(270, 400, 180, 30);

        Back.setBackground(new java.awt.Color(255, 254, 239));
        Back.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(33, 33, 33));
        Back.setText("<<");
        Back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Back.setContentAreaFilled(false);
        Back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        BackGround.add(Back);
        Back.setBounds(19, 22, 26, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackGround/cloud.gif"))); // NOI18N
        BackGround.add(jLabel4);
        jLabel4.setBounds(0, 0, 720, 450);

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

        
    
    
    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        RegisterConfirmation.dispose();

    }//GEN-LAST:event_NoActionPerformed

    private void YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YESActionPerformed
        RegisterUser registerUser = new RegisterUser(SrCode, Name, Email, DateofBirth, Password, ConfirmPass);
        try {
            registerUser.getAllInputValues(AllUserInput);

            // Call the method to save user data to the database
            registerUser.saveToDatabase();
            this.dispose();
            RegisterConfirmation.dispose();
            new Login_Interface().setVisible(true);
            
            // Optionally, display a success message or perform additional actions
            JOptionPane.showMessageDialog(null, "User data saved to the database successfully!");
        } catch (SQLException ex) {
            // Handle the SQLException (e.g., display an error message)
            JOptionPane.showMessageDialog(null, "Error saving user data to the database: " + ex.getMessage());
        }
    }//GEN-LAST:event_YESActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new Login_Interface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed

        RegisterUser registerUser = new RegisterUser(SrCode, Name, Email, DateofBirth, Password, ConfirmPass);
        // Check if all input values are valid before proceeding
        if (!registerUser.getAllInputValues(AllUserInput)) {
            // If there are validation errors, do not proceed
            return;
        }
        RegisterConfirmation.setPreferredSize(new Dimension(231, 300));
        RegisterConfirmation.pack();

        RegisterConfirmation.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

    private void ConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPassActionPerformed

    }//GEN-LAST:event_ConfirmPassActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        ConfirmPass.requestFocusInWindow();
    }//GEN-LAST:event_PasswordActionPerformed

    private void DateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateofBirthActionPerformed
        Password.requestFocusInWindow();
    }//GEN-LAST:event_DateofBirthActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        DateofBirth.requestFocusInWindow();
    }//GEN-LAST:event_EmailActionPerformed

    private void SrCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrCodeActionPerformed
        Email.requestFocusInWindow();
    }//GEN-LAST:event_SrCodeActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

        SrCode.requestFocusInWindow();
    }//GEN-LAST:event_NameActionPerformed


    
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
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RegisterAccount().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(RegisterAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllUserInput;
    private javax.swing.JButton Back;
    private javax.swing.JPanel BackGround;
    private javax.swing.JTextField ConfirmPass;
    private javax.swing.JTextField DateofBirth;
    private javax.swing.JLabel DoBLabel;
    private javax.swing.JLabel DoyouWanttoRegister;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel FilloutPanel;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton No;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Register;
    private javax.swing.JDialog RegisterConfirmation;
    private javax.swing.JTextField SrCode;
    private javax.swing.JLabel SrCodeLabel;
    private javax.swing.JButton YES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
