/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author YLADx
 */
public class ConcernSolutionInterface extends javax.swing.JFrame {

    private final String TableofQuestion;   
    private final String SelectedQuestion;
    private Connection con;
    
    public ConcernSolutionInterface(String SelectedQuestion, String TableofQuestion) throws SQLException {
           initComponents();
    this.SelectedQuestion = SelectedQuestion;
    this.TableofQuestion = TableofQuestion;
    connectToDatabase();
    Question.setText("<html>" + SelectedQuestion + "</html>");
    
       displaySolution(SelectedQuestion, TableofQuestion);
        
        OtherSolutionPanel.setVisible(false);
        
        Okay.setVisible(false);
         setLocationRelativeTo(null);
    }

    private void displaySolution(String selectedQuestion, String tableOfQuestion) {
    try {
      String solution = getSolutionFromDatabase(selectedQuestion, tableOfQuestion);
        Solution1.setText("<html><b>Solution:</b><br> " + solution + "</html>");
Solution1.setPreferredSize(new Dimension(Solution1.getPreferredSize().width, Solution1.getPreferredSize().height));
    } catch (SQLException ex) {
        Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
        Solution1.setText("<html><b>Solution:</b><br>Error fetching solution</html>");
    }
}

    private String getSolutionFromDatabase(String selectedQuestion, String tableOfQuestion) throws SQLException {
    String query = "SELECT `Solution` FROM `" + tableOfQuestion + "` WHERE `ConcernQuestion` = ?";
    try (PreparedStatement pstmt = con.prepareStatement(query)) {
        pstmt.setString(1, selectedQuestion);
        try (ResultSet resultSet = pstmt.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getString("Solution");
            } else {
                return "Solution not found";
            }
        }
    }
}
    
    
    
    private void connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/specificconcern?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
               
        } catch (ClassNotFoundException ex) {
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        Question = new javax.swing.JLabel();
        Solution1Panel = new javax.swing.JPanel();
        Solution1 = new javax.swing.JLabel();
        OtherSolutionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DoesItFixYourConcern = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        y1 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        Okay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SchoolTech");
        setMinimumSize(new java.awt.Dimension(720, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 254, 239));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 450));

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

        Question.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 12)); // NOI18N
        Question.setForeground(new java.awt.Color(33, 33, 33));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("Project");
        Question.setToolTipText("");
        Question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Solution1Panel.setBackground(new java.awt.Color(255, 255, 204));
        Solution1Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Solution1Panel.setForeground(new java.awt.Color(255, 255, 204));

        Solution1.setText("Solution");
        Solution1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Solution1.setMaximumSize(new java.awt.Dimension(451, 500));
        Solution1.setMinimumSize(new java.awt.Dimension(451, 80));
        Solution1.setPreferredSize(new java.awt.Dimension(451, 80));

        javax.swing.GroupLayout Solution1PanelLayout = new javax.swing.GroupLayout(Solution1Panel);
        Solution1Panel.setLayout(Solution1PanelLayout);
        Solution1PanelLayout.setHorizontalGroup(
            Solution1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Solution1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Solution1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        Solution1PanelLayout.setVerticalGroup(
            Solution1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Solution1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Solution1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );

        OtherSolutionPanel.setBackground(new java.awt.Color(255, 255, 204));
        OtherSolutionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        OtherSolutionPanel.setForeground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Yes and No Solution");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout OtherSolutionPanelLayout = new javax.swing.GroupLayout(OtherSolutionPanel);
        OtherSolutionPanel.setLayout(OtherSolutionPanelLayout);
        OtherSolutionPanelLayout.setHorizontalGroup(
            OtherSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherSolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        OtherSolutionPanelLayout.setVerticalGroup(
            OtherSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OtherSolutionPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        DoesItFixYourConcern.setMinimumSize(new java.awt.Dimension(450, 45));
        DoesItFixYourConcern.setOpaque(false);
        DoesItFixYourConcern.setPreferredSize(new java.awt.Dimension(450, 45));
        DoesItFixYourConcern.setLayout(null);

        jLabel1.setText("Does Solution Provided fix your Concern? ");
        DoesItFixYourConcern.add(jLabel1);
        jLabel1.setBounds(15, 9, 244, 16);

        y1.setBackground(new java.awt.Color(0, 153, 51));
        y1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        y1.setText("YES");
        y1.setName("y1"); // NOI18N
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });
        DoesItFixYourConcern.add(y1);
        y1.setBounds(265, 6, 72, 24);

        n1.setBackground(new java.awt.Color(185, 21, 21));
        n1.setText("NO");
        n1.setName("n1"); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        DoesItFixYourConcern.add(n1);
        n1.setBounds(363, 6, 72, 23);

        Okay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-like-64.png"))); // NOI18N
        Okay.setBorderPainted(false);
        Okay.setContentAreaFilled(false);
        Okay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Back)
                        .addGap(98, 98, 98)
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(Solution1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OtherSolutionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(DoesItFixYourConcern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(Okay)))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(Solution1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(OtherSolutionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DoesItFixYourConcern, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Okay)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        try {
            ChoosenCategoryInterface chosencategoryFrame;
            
           chosencategoryFrame = new ChoosenCategoryInterface(TableofQuestion);
                     chosencategoryFrame.setVisible(true);
                     this.dispose();  // Close the current frame
        } catch (SQLException ex) {
            Logger.getLogger(Login_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BackActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
          
    
        try {
            OtherPossibleSolution(SelectedQuestion, TableofQuestion, evt, Okay);
        y1.setEnabled(false);
    } catch (SQLException ex) {
        Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_n1ActionPerformed

    
    private boolean containsContactSchoolTechSupport(String text) {
    // Case-insensitive check for the phrase
    return text.toLowerCase().contains("contact schooltechsupport");
}

    
   private void OtherPossibleSolution(String selectedQuestion, String tableOfQuestion, ActionEvent evt, JButton okayButton) throws SQLException {
    try {
        JButton sourceButton = (JButton) evt.getSource();
        String buttonName = sourceButton.getName();

        String query = "SELECT `" + buttonName + "` FROM `" + tableOfQuestion + "` WHERE `ConcernQuestion` = ?";
        OtherSolutionPanel.setVisible(true);
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, selectedQuestion);

            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    String solution = resultSet.getString(buttonName);
                    
                    jLabel3.setText("<html><b>Solution:</b><br>" + solution + "</html>");
                    // Check if the solution contains the contact phrase
                    boolean containsContactPhrase = containsContactSchoolTechSupport(solution);

                    

                    // Make the okay button visible
                    okayButton.setVisible(true);

                    // Add an ActionListener to the okay button
                    okayButton.addActionListener((ActionEvent e) -> {
                        if (containsContactPhrase) {
                            // Prompt user with a confirmation dialog
                            int option = JOptionPane.showConfirmDialog(
                                    this, 
                                    "Would you like to email SchoolTech Support?",
                                    "Contact SchoolTech Support",
                                    JOptionPane.YES_NO_OPTION);

                            // If the user chooses 'Yes'
                            if (option == JOptionPane.YES_OPTION) {
                                // Bring the user to the login interface
                                // Replace this with the appropriate code to open the login interface
                                Login_Interface loginInterface = new Login_Interface();
                                loginInterface.setVisible(true);
                               
                            }
                            
                            
                        }
                        
                        try {
                                new MainInterface().setVisible(true);
                            } catch (SQLException ex) {
                                Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           this.dispose();
                    });
                } else {
                    jLabel3.setText("<html><b>Solution:</b><br>Solution not found</html>");
                }
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, "Error in OtherPossibleSolution", ex);
        jLabel3.setText("<html><b>Solution:</b><br>Error fetching solution</html>");
    }
}
    
  
    
    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        n1.setEnabled(false);
     
        
        try {     
           OtherPossibleSolution(SelectedQuestion, TableofQuestion, evt, Okay);
        } catch (SQLException ex) {
            Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_y1ActionPerformed

    private void OkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkayActionPerformed

    
    

    
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
            java.util.logging.Logger.getLogger(ConcernSolutionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConcernSolutionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConcernSolutionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConcernSolutionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConcernSolutionInterface("Question", "TableName").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ConcernSolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel DoesItFixYourConcern;
    private javax.swing.JButton Okay;
    private javax.swing.JPanel OtherSolutionPanel;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel Solution1;
    private javax.swing.JPanel Solution1Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton n1;
    private javax.swing.JButton y1;
    // End of variables declaration//GEN-END:variables
}
