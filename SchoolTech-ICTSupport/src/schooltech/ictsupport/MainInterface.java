/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MainInterface extends javax.swing.JFrame {

    private ArrayList<String> tableNames;
    private Connection con;

    public MainInterface() throws SQLException {
       initComponents();
    connectToDatabase();
    tableNames = new ArrayList<>(); // Initialize the ArrayList
    loadTableNames(con);
    createButtonsForTables();
    Projectname.setText("<html><div style='text-align: center;'>  SchoolTech   ICT Support </div></html>");
    setVisible(true); // Make sure the frame is visible
    
    String noteText = "<html><div style='margin: 10px;'>Note: >For unlisted concerns, select 'Other Concern' to login and email us.</div></html>";;
    Note.setText(noteText);
    
    
     setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Projectname = new javax.swing.JLabel();
        guide = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        Note = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SchoolTech");
        setName("SchoolTech"); // NOI18N
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 254, 239));
        BackGround.setForeground(new java.awt.Color(255, 254, 239));

        Projectname.setBackground(new java.awt.Color(33, 33, 33));
        Projectname.setFont(new java.awt.Font("Nineteen Ninety Seven", 1, 19)); // NOI18N
        Projectname.setForeground(new java.awt.Color(33, 33, 33));
        Projectname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Projectname.setText("project");

        guide.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        guide.setForeground(new java.awt.Color(51, 51, 51));
        guide.setText("Select the category suits your concern:");

        ButtonPanel.setBackground(new java.awt.Color(255, 254, 239));

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        Note.setBackground(new java.awt.Color(255, 204, 204));
        Note.setFont(new java.awt.Font("Sitka Heading", 0, 12)); // NOI18N
        Note.setForeground(new java.awt.Color(51, 51, 51));
        Note.setText("jLabel1");
        Note.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Note.setOpaque(true);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Projectname, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addGap(217, 217, 217)))
                .addContainerGap())
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Projectname, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(guide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void loadTableNames(Connection con) {
          
String query = "SHOW TABLES";

      
     try (Statement stmt = con.createStatement();
         ResultSet resultSet = stmt.executeQuery(query)) {

        while (resultSet.next()) {
            String tableName = resultSet.getString(1);

            // Exclude tables with names containing "pma"
            if (!tableName.toLowerCase().contains("pma")) {
                tableNames.add(tableName);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        }


private void createButtonsForTables() {
    ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));

    for (String tableName : tableNames) {
        JButton tableButton = new JButton(tableName.toUpperCase());
        tableButton.setAlignmentX(CENTER_ALIGNMENT);

        // Set button properties
        setButtonProperties(tableButton);

        tableButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            // Get the selected table name
            String selectedTableName = tableButton.getText();
            
             // Pass the selected table name to SpecificConcern frame
                ChoosenCategoryInterface chosencategoryFrame;
                try {
                    chosencategoryFrame = new ChoosenCategoryInterface(selectedTableName);
                     chosencategoryFrame.setVisible(true);
                     this.dispose();  // Close the current frame
                } catch (SQLException ex) {
                    Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        });

        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(Box.createVerticalGlue()); // Add vertical glue for centering
        verticalBox.add(tableButton);
        verticalBox.add(Box.createVerticalStrut(6)); // Add a vertical gap of 6 pixels

        ButtonPanel.add(verticalBox);
    }

    // Add ". . . ." button
    JButton noDefineConcernButton = new JButton(". . . . .");
    noDefineConcernButton.setAlignmentX(CENTER_ALIGNMENT);
    setButtonProperties(noDefineConcernButton);

    // Add "Other Concern" button
    JButton otherConcernButton = new JButton("OTHER CONCERN");
    otherConcernButton.setAlignmentX(CENTER_ALIGNMENT);
    setButtonProperties(otherConcernButton);

    otherConcernButton.addActionListener((java.awt.event.ActionEvent evt) -> {
        // You can navigate to the LoginInterface 
        Login_Interface loginInterface = new Login_Interface();
        loginInterface.setVisible(true);
        this.dispose();  // Close the current frame
    });

    ButtonPanel.add(Box.createVerticalGlue()); // Add additional vertical glue
    ButtonPanel.add(noDefineConcernButton);
    ButtonPanel.add(Box.createVerticalStrut(6)); // Add a vertical gap of 6 pixels
    ButtonPanel.add(otherConcernButton);
}


private void setButtonProperties(JButton button) {
    button.setFont(new Font("Retropix", Font.BOLD, 16));
    button.setForeground(new Color(33,33,33));
    button.setBackground(new Color(254, 255, 153));
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setFocusPainted(false);
    button.setMinimumSize(new Dimension(231, 51));
    button.setMaximumSize(new Dimension(231, 51));

    int newWidth = 231; // Set your preferred width
    int newHeight = 51; // Set your preferred height
    
    button.setPreferredSize(new Dimension(newWidth, newHeight));
}

    private void connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/specificconcern?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainInterface().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel Note;
    private javax.swing.JLabel Projectname;
    private javax.swing.JLabel guide;
    // End of variables declaration//GEN-END:variables

}
