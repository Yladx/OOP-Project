
package schooltech.ictsupport;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeMessageInterface extends javax.swing.JFrame {

    
    public WelcomeMessageInterface() {
        initComponents();
        welcomemess.setText("<html> Welcome to SchoolTech-ICT Support! </html>");
        
        // Add a MouseListener to the BackGround panel
        BackGround.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    handleMouseClick();
                } catch (SQLException ex) {
                    Logger.getLogger(WelcomeMessageInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            
        });
        
         setLocationRelativeTo(null);
                }

    private void handleMouseClick() throws SQLException {
                 new MainInterface().setVisible(true);
                 this.dispose();
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        welcomemess = new javax.swing.JLabel();
        welcomemess1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SchoolTech");
        setMinimumSize(new java.awt.Dimension(720, 450));
        setName("SchoolTech"); // NOI18N

        BackGround.setBackground(new java.awt.Color(118, 116, 92));
        BackGround.setMinimumSize(new java.awt.Dimension(720, 450));
        BackGround.setOpaque(false);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-technical-support-100.png"))); // NOI18N
        Logo.setAutoscrolls(true);

        welcomemess.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 24)); // NOI18N
        welcomemess.setForeground(new java.awt.Color(33, 33, 33));
        welcomemess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomemess.setText("Welcome to SchoolTech-ICT Support:");
        welcomemess.setToolTipText("");
        welcomemess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        welcomemess1.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 12)); // NOI18N
        welcomemess1.setForeground(new java.awt.Color(33, 33, 33));
        welcomemess1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomemess1.setText(" How may we assist you today?");
        welcomemess1.setToolTipText("");
        welcomemess1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomemess, javax.swing.GroupLayout.PREFERRED_SIZE, 283, Short.MAX_VALUE)
                .addGap(172, 172, 172))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomemess1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomemess, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(welcomemess1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

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
            java.util.logging.Logger.getLogger(WelcomeMessageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeMessageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeMessageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeMessageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeMessageInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel welcomemess;
    private javax.swing.JLabel welcomemess1;
    // End of variables declaration//GEN-END:variables
}
