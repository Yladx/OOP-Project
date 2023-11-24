/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltechadmin;

import java.awt.Color;


public class AdminLogin extends javax.swing.JFrame {

    
    public AdminLogin() {
        initComponents();
        ADMINLOGININPUT.setBackground(new Color(102,102,102, 100));
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginAdmin = new javax.swing.JLabel();
        ADMINLOGININPUT = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        AdminUsername = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SchoolTech[Admin]");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LoginAdmin.setBackground(new java.awt.Color(102, 102, 102));
        LoginAdmin.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 18)); // NOI18N
        LoginAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginAdmin.setText("ADMIN LOGIN");
        LoginAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        LoginAdmin.setOpaque(true);
        jPanel1.add(LoginAdmin);
        LoginAdmin.setBounds(240, 70, 210, 50);

        ADMINLOGININPUT.setBackground(new java.awt.Color(102, 102, 102));
        ADMINLOGININPUT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        UsernameLabel.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password:");

        AdminUsername.setForeground(new java.awt.Color(51, 51, 51));
        AdminUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AdminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUsernameActionPerformed(evt);
            }
        });

        AdminPassword.setForeground(new java.awt.Color(51, 51, 51));
        AdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMINLOGININPUTLayout = new javax.swing.GroupLayout(ADMINLOGININPUT);
        ADMINLOGININPUT.setLayout(ADMINLOGININPUTLayout);
        ADMINLOGININPUTLayout.setHorizontalGroup(
            ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINLOGININPUTLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        ADMINLOGININPUTLayout.setVerticalGroup(
            ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINLOGININPUTLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(ADMINLOGININPUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(ADMINLOGININPUT);
        ADMINLOGININPUT.setBounds(210, 100, 270, 150);

        jButton1.setBackground(new java.awt.Color(93, 54, 108));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 260, 240, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Background/8351160.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-240, -10, 1120, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsernameActionPerformed
    
        AdminPassword.requestFocusInWindow();
    }//GEN-LAST:event_AdminUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin admin = new Admin();
        
        boolean loginSuccess = admin.performAdminLogin(AdminUsername, AdminPassword, jButton1 );

        if (loginSuccess) {
            this.dispose();
            
      
             new AdminEmailMainInterface().setVisible(true);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPasswordActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_AdminPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMINLOGININPUT;
    private javax.swing.JPasswordField AdminPassword;
    private javax.swing.JTextField AdminUsername;
    private javax.swing.JLabel LoginAdmin;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
