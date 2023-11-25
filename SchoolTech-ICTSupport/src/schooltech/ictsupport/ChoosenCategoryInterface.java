/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class ChoosenCategoryInterface extends javax.swing.JFrame {
    
    private Connection con;
    private final String selectedTableName;

    public ChoosenCategoryInterface(String selectedTableName) throws SQLException {
        this.selectedTableName = selectedTableName;
        initComponents();
        connectToDatabase();   
        ChoosenTable.setText(selectedTableName);
        guide.setText("<html> Here are some Common concern Regarding " + selectedTableName + "</html>");
        createConcernQuestionButtons();
        setVisible(true);
        
         setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        ChoosenTable = new javax.swing.JLabel();
        guide = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SchoolTech");
        setName("SchoolTech"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 254, 239));

        ButtonPanel.setBackground(new java.awt.Color(255, 254, 239));

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        ChoosenTable.setBackground(new java.awt.Color(33, 33, 33));
        ChoosenTable.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 19)); // NOI18N
        ChoosenTable.setForeground(new java.awt.Color(33, 33, 33));
        ChoosenTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoosenTable.setText("ConcernName");

        guide.setFont(new java.awt.Font("RetroPix", 1, 12)); // NOI18N
        guide.setForeground(new java.awt.Color(51, 51, 51));
        guide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guide.setText("Message:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(ChoosenTable, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ChoosenTable, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        try {
            new MainInterface().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Login_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void createConcernQuestionButtons() {
    String query = "SELECT `ConcernQuestion` FROM `" + selectedTableName + "`";

    try (PreparedStatement pstmt = con.prepareStatement(query);
         ResultSet resultSet = pstmt.executeQuery()) {

        while (resultSet.next()) {
            String question = resultSet.getString("ConcernQuestion");
            
            
            addButtonForConcernQuestion( question);
        }
    } catch (SQLException ex) {
        
    }
}

    private void addButtonForConcernQuestion(String question) {
         ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));

        // Add a vertical strut (gap) before the button for spacing
        JButton questionButton = new JButton("<html>" + question + "</html>");

        // Customize the button properties if needed
        customizeButton(questionButton);

        // Add a vertical strut (gap) before the button for spacing
        ButtonPanel.add(Box.createVerticalStrut(10)); // Adjust the spacing as needed

        // Create a horizontal box to center the button
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue()); // Add horizontal glue for centering
        horizontalBox.add(questionButton);
        horizontalBox.add(Box.createHorizontalGlue()); // Add horizontal glue for centering

        // Add the horizontal box to the panel
        ButtonPanel.add(horizontalBox);
        
        // Add the question button to the panel
        ButtonPanel.add(questionButton);

        // Revalidate and repaint to update the UI
        ButtonPanel.revalidate();
        ButtonPanel.repaint();

        
        questionButton.addActionListener((ActionEvent evt) -> {
             try {
                 new ConcernSolutionInterface(question, selectedTableName).setVisible(true);
                 this.dispose();
             } catch (SQLException ex) {
                 Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(Level.SEVERE, null, ex);
             }
          
        });
      
    }
    
    private void customizeButton(JButton button) {
    // Customize the button properties if needed
    button.setAlignmentX(CENTER_ALIGNMENT);
   button.setFont(new Font("Retropix", Font.BOLD, 13));
    button.setForeground(new Color(33,33,33));
    button.setBackground(new Color(254, 255, 153));
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setFocusPainted(false);
 
    button.setMinimumSize(new Dimension(400, 51));
    button.setMaximumSize(new Dimension(400, 51));

    int newWidth = 400; // Set your preferred width
    int newHeight = 51; // Set your preferred height
    button.setPreferredSize(new Dimension(newWidth, newHeight));
}



    private void connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/specificconcern?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
               
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
            java.util.logging.Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ChoosenCategoryInterface("TableName").setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ChoosenCategoryInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel ChoosenTable;
    private javax.swing.JLabel guide;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
