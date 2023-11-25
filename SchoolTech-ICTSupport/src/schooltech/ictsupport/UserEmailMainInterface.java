/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooltech.ictsupport;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import schooltech.ictsupport.User.AccounTSettings;
import schooltech.ictsupport.User.UserEmailing;

/**
 *
 * @author YLADx
 */
public class UserEmailMainInterface extends javax.swing.JFrame {

    UserEmailing userEmail = new UserEmailing();
    private final String LoginUser;
     private String currentStatus;
     
    public UserEmailMainInterface(String LoginUser) {
        initComponents();
        this.LoginUser = LoginUser;
        
        //set UserAccount ButtonNametoLoginusername
        UserAccountButton.setText(LoginUser);
              
         
         Inbox.doClick();
        AccounTSettings accinfo = new AccounTSettings(LoginUser);
        accinfo.updateButtonWithUserName(UserAccountButton);
        setLocationRelativeTo(null);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComposeEmail = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComposeEmailBackGround = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComposeEmailForm = new javax.swing.JPanel();
        EmailerName = new javax.swing.JLabel();
        SchoolTechasReciever = new javax.swing.JLabel();
        DateOfEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComposeSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        SendEmail = new javax.swing.JButton();
        BackFromEmailCompose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Account = new javax.swing.JFrame();
        AccountBg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserInfo = new javax.swing.JLabel();
        DeleteAccount = new javax.swing.JButton();
        LogoutfromAccount = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BackGround = new javax.swing.JPanel();
        ComposeEmailButton = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        ButtonMenu = new javax.swing.JPanel();
        Inbox = new javax.swing.JButton();
        Archives = new javax.swing.JButton();
        Replied = new javax.swing.JButton();
        MenuLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        AccountPanel = new javax.swing.JPanel();
        UserAccountButton = new javax.swing.JButton();
        ClickButton = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmailPanel = new javax.swing.JPanel();
        UnarchiveButton = new javax.swing.JButton();
        ArchivingButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        ComposeEmail.setTitle("Compose Email");
        ComposeEmail.setMinimumSize(new java.awt.Dimension(349, 430));
        ComposeEmail.setResizable(false);

        ComposeEmailBackGround.setBackground(new java.awt.Color(255, 254, 239));
        ComposeEmailBackGround.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMAIL SCHOOLTECH");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        ComposeEmailBackGround.add(jLabel1);
        jLabel1.setBounds(63, 29, 224, 35);

        ComposeEmailForm.setBackground(new java.awt.Color(204, 204, 204));
        ComposeEmailForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComposeEmailForm.setForeground(new java.awt.Color(33, 33, 33));

        EmailerName.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        EmailerName.setForeground(new java.awt.Color(33, 33, 33));
        EmailerName.setText("Email:");

        SchoolTechasReciever.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        SchoolTechasReciever.setForeground(new java.awt.Color(33, 33, 33));
        SchoolTechasReciever.setText("To: SChooltech- ict support");

        DateOfEmail.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        DateOfEmail.setForeground(new java.awt.Color(33, 33, 33));
        DateOfEmail.setText("Subject:");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Message");

        ComposeSubject.setBackground(new java.awt.Color(204, 204, 204));
        ComposeSubject.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        ComposeSubject.setForeground(new java.awt.Color(33, 33, 33));
        ComposeSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComposeSubjectActionPerformed(evt);
            }
        });

        MessageTextArea.setBackground(new java.awt.Color(204, 204, 204));
        MessageTextArea.setColumns(20);
        MessageTextArea.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        MessageTextArea.setRows(10);
        MessageTextArea.setMaximumSize(new java.awt.Dimension(13, 20));
        jScrollPane1.setViewportView(MessageTextArea);

        javax.swing.GroupLayout ComposeEmailFormLayout = new javax.swing.GroupLayout(ComposeEmailForm);
        ComposeEmailForm.setLayout(ComposeEmailFormLayout);
        ComposeEmailFormLayout.setHorizontalGroup(
            ComposeEmailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComposeEmailFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ComposeEmailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(DateOfEmail)
                    .addComponent(EmailerName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SchoolTechasReciever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComposeSubject)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ComposeEmailFormLayout.setVerticalGroup(
            ComposeEmailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComposeEmailFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmailerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SchoolTechasReciever, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateOfEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComposeSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ComposeEmailBackGround.add(ComposeEmailForm);
        ComposeEmailForm.setBounds(6, 73, 337, 318);

        SendEmail.setBackground(new java.awt.Color(153, 204, 255));
        SendEmail.setForeground(new java.awt.Color(33, 33, 33));
        SendEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-send-16.png"))); // NOI18N
        SendEmail.setText("SEND");
        SendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailActionPerformed(evt);
            }
        });
        ComposeEmailBackGround.add(SendEmail);
        SendEmail.setBounds(234, 397, 100, 27);

        BackFromEmailCompose.setBackground(new java.awt.Color(255, 254, 239));
        BackFromEmailCompose.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 16)); // NOI18N
        BackFromEmailCompose.setForeground(new java.awt.Color(33, 33, 33));
        BackFromEmailCompose.setText("<<");
        BackFromEmailCompose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BackFromEmailCompose.setContentAreaFilled(false);
        BackFromEmailCompose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackFromEmailCompose.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackFromEmailCompose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackFromEmailComposeActionPerformed(evt);
            }
        });
        ComposeEmailBackGround.add(BackFromEmailCompose);
        BackFromEmailCompose.setBounds(6, 14, 23, 24);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackGround/1711593.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        ComposeEmailBackGround.add(jLabel6);
        jLabel6.setBounds(-470, -10, 1040, 620);

        jScrollPane2.setViewportView(ComposeEmailBackGround);

        javax.swing.GroupLayout ComposeEmailLayout = new javax.swing.GroupLayout(ComposeEmail.getContentPane());
        ComposeEmail.getContentPane().setLayout(ComposeEmailLayout);
        ComposeEmailLayout.setHorizontalGroup(
            ComposeEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComposeEmailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ComposeEmailLayout.setVerticalGroup(
            ComposeEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        Account.setTitle("Account");
        Account.setResizable(false);

        AccountBg.setBackground(new java.awt.Color(255, 255, 255));
        AccountBg.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-account-64.png"))); // NOI18N
        AccountBg.add(jLabel5);
        jLabel5.setBounds(100, 20, 70, 70);

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setText(" Account Information");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        AccountBg.add(jLabel2);
        jLabel2.setBounds(60, 90, 150, 27);

        UserInfo.setBackground(new java.awt.Color(204, 204, 204));
        UserInfo.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        UserInfo.setForeground(new java.awt.Color(102, 102, 102));
        UserInfo.setText("jLabel2");
        UserInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AccountBg.add(UserInfo);
        UserInfo.setBounds(50, 110, 170, 160);

        DeleteAccount.setBackground(new java.awt.Color(153, 0, 0));
        DeleteAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-denied-25.png"))); // NOI18N
        DeleteAccount.setText("DeleteAccount");
        DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountActionPerformed(evt);
            }
        });
        AccountBg.add(DeleteAccount);
        DeleteAccount.setBounds(30, 280, 210, 30);

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

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AccountBg.add(jButton1);
        jButton1.setBounds(30, 320, 210, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackGround/8351299.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        AccountBg.add(jLabel8);
        jLabel8.setBounds(-520, 10, 850, 360);

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
        setTitle("SchoolTech Email");
        setMinimumSize(new java.awt.Dimension(720, 450));
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 254, 239));
        BackGround.setMinimumSize(new java.awt.Dimension(720, 450));
        BackGround.setLayout(null);

        ComposeEmailButton.setBackground(new java.awt.Color(33, 125, 65));
        ComposeEmailButton.setFont(new java.awt.Font("Garamond", 0, 39)); // NOI18N
        ComposeEmailButton.setForeground(new java.awt.Color(255, 255, 255));
        ComposeEmailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-64.png"))); // NOI18N
        ComposeEmailButton.setText("+");
        ComposeEmailButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 60, true));
        ComposeEmailButton.setBorderPainted(false);
        ComposeEmailButton.setContentAreaFilled(false);
        ComposeEmailButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ComposeEmailButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComposeEmailButtonFocusGained(evt);
            }
        });
        ComposeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComposeEmailButtonActionPerformed(evt);
            }
        });
        BackGround.add(ComposeEmailButton);
        ComposeEmailButton.setBounds(660, 390, 60, 60);

        Left.setBackground(new java.awt.Color(102, 102, 102));
        Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 33, 33)));
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

        Inbox.setBackground(new java.awt.Color(255, 255, 204));
        Inbox.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        Inbox.setForeground(new java.awt.Color(102, 102, 102));
        Inbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-inbox-30.png"))); // NOI18N
        Inbox.setText("Inbox");
        Inbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inbox.setName("Inbox"); // NOI18N
        Inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InboxActionPerformed(evt);
            }
        });

        Archives.setBackground(new java.awt.Color(255, 255, 204));
        Archives.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        Archives.setForeground(new java.awt.Color(102, 102, 102));
        Archives.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-archive-30.png"))); // NOI18N
        Archives.setText("Archived");
        Archives.setName("Archived"); // NOI18N
        Archives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivesActionPerformed(evt);
            }
        });

        Replied.setBackground(new java.awt.Color(255, 255, 204));
        Replied.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        Replied.setForeground(new java.awt.Color(102, 102, 102));
        Replied.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reply-30.png"))); // NOI18N
        Replied.setText("Replied");
        Replied.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Replied.setName("Replied Email"); // NOI18N
        Replied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepliedActionPerformed(evt);
            }
        });

        MenuLabel.setFont(new java.awt.Font("Nineteen Ninety Seven", 0, 14)); // NOI18N
        MenuLabel.setForeground(new java.awt.Color(255, 255, 204));
        MenuLabel.setText("Menu:");

        javax.swing.GroupLayout ButtonMenuLayout = new javax.swing.GroupLayout(ButtonMenu);
        ButtonMenu.setLayout(ButtonMenuLayout);
        ButtonMenuLayout.setHorizontalGroup(
            ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Replied, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Archives, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        ButtonMenuLayout.setVerticalGroup(
            ButtonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Inbox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Archives, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Replied, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Left.add(ButtonMenu);
        ButtonMenu.setBounds(8, 51, 240, 279);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackGround/City.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Left.add(jLabel4);
        jLabel4.setBounds(-10, 0, 270, 450);

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
        Delete.setBounds(690, 70, 20, 20);

        AccountPanel.setBackground(new java.awt.Color(255, 255, 204));
        AccountPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UserAccountButton.setBackground(new java.awt.Color(51, 51, 51));
        UserAccountButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        UserAccountButton.setForeground(new java.awt.Color(33, 33, 33));
        UserAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-account-24 (1).png"))); // NOI18N
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

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ClickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(UserAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addComponent(ClickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(UserAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        BackGround.add(AccountPanel);
        AccountPanel.setBounds(260, 0, 500, 60);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(390, 8000));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(390, 290));

        EmailPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmailPanel.setMinimumSize(new java.awt.Dimension(390, 290));
        EmailPanel.setNextFocusableComponent(ComposeEmailButton);
        EmailPanel.setOpaque(false);
        EmailPanel.setLayout(null);
        jScrollPane3.setViewportView(EmailPanel);

        BackGround.add(jScrollPane3);
        jScrollPane3.setBounds(270, 100, 450, 310);

        UnarchiveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-archive-30 (1).png"))); // NOI18N
        UnarchiveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UnarchiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnarchiveButtonActionPerformed(evt);
            }
        });
        BackGround.add(UnarchiveButton);
        UnarchiveButton.setBounds(660, 70, 20, 20);

        ArchivingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-archive-48.png"))); // NOI18N
        ArchivingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ArchivingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivingButtonActionPerformed(evt);
            }
        });
        BackGround.add(ArchivingButton);
        ArchivingButton.setBounds(660, 70, 20, 20);

        jLabel7.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Note: If the Email is Replied the Border Color is Pink");
        BackGround.add(jLabel7);
        jLabel7.setBounds(280, 420, 320, 20);

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

    private void ComposeSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComposeSubjectActionPerformed
        
    }//GEN-LAST:event_ComposeSubjectActionPerformed

    private void BackFromEmailComposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackFromEmailComposeActionPerformed
        ComposeEmail.dispose();
        
    }//GEN-LAST:event_BackFromEmailComposeActionPerformed

    private void DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountActionPerformed
       AccounTSettings accountSettings = new AccounTSettings(LoginUser);
            boolean deletionSuccessful;
        try {
            deletionSuccessful = accountSettings.deleteLoggedInEmail();
            
                if (deletionSuccessful) {
                    Account.dispose();
        this.dispose();
       
        new Login_Interface().setVisible(true);
                } else {
                    
                }
       
        } catch (SQLException ex) {
            Logger.getLogger(UserEmailMainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

      
       
    }//GEN-LAST:event_DeleteAccountActionPerformed

    private void SendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailActionPerformed
     
       // Get email data from UI components
   userEmail.getEmailDataFromUI(LoginUser, ComposeSubject, MessageTextArea);

    // Send email information to the database
    boolean emailSentSuccessfully = userEmail.sendEmailToICTSupport();

    if (!emailSentSuccessfully) {


        return;
    }
        ComposeEmail.dispose();
        MessageTextArea.setText("");
        ComposeSubject.setText("");
            EmailPanel.removeAll();

             revalidate();
             repaint();


              InboxActionPerformed(evt);
                Inbox.doClick();
       
    }//GEN-LAST:event_SendEmailActionPerformed

    private void UserAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAccountButtonActionPerformed
        
        AccounTSettings accounTSettings = new AccounTSettings(LoginUser);
        accounTSettings.displayAllUserInfo(UserInfo);
          Account.setPreferredSize(new Dimension(280, 400));
        Account.pack();

        Account.setLocationRelativeTo(null);
        Account.setVisible(true);
    }//GEN-LAST:event_UserAccountButtonActionPerformed

    private void RepliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepliedActionPerformed
         UnarchiveButton.setVisible(false);
         
         
         currentStatus = "Replied";
        ButtonCLick(evt);
          
      ArchivingButton.setVisible(true);
       EmailPanel.removeAll();
        
        userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
        
        revalidate();
         repaint();
    }//GEN-LAST:event_RepliedActionPerformed

    private void ArchivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivesActionPerformed
        ButtonCLick(evt);
        
        UnarchiveButton.setVisible(true);
        ArchivingButton.setVisible(false);
        EmailPanel.removeAll();
        jScrollPane3.revalidate();
        
         currentStatus = "Archived";
        userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
        
        revalidate();
         repaint();
    }//GEN-LAST:event_ArchivesActionPerformed

    private void InboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InboxActionPerformed
        ButtonCLick(evt);
        
        UnarchiveButton.setVisible(false);
        ArchivingButton.setVisible(true); 
        
        EmailPanel.removeAll();
          
      currentStatus = "Sent";
        userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
        
        currentStatus = "Replied";
         userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
       
         revalidate();
         repaint();
    }//GEN-LAST:event_InboxActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
int confirmLogout = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

if (confirmLogout == JOptionPane.YES_OPTION) {
    new Login_Interface().setVisible(true);
    this.dispose();
} else {
    // User chose not to log out, you can add any additional actions here
}
    }//GEN-LAST:event_BackActionPerformed

    private void ComposeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComposeEmailButtonActionPerformed

        EmailerName.setText("From:  " +LoginUser);

        ComposeEmail.setPreferredSize(new Dimension(369, 475));
        ComposeEmail.pack();

        ComposeEmail.setLocationRelativeTo(null);
        ComposeEmail.setVisible(true);
    }//GEN-LAST:event_ComposeEmailButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
     
      userEmail.deleteSelectedEmails(EmailPanel);
  
     
 EmailPanel.removeAll();
        
          userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
          
             EmailPanel.revalidate();    
        EmailPanel.repaint();
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Account.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutfromAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutfromAccountActionPerformed
       new Login_Interface().setVisible(true);
       Account.dispose();
       this.dispose();
    }//GEN-LAST:event_LogoutfromAccountActionPerformed

    private void ArchivingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivingButtonActionPerformed
      userEmail.archiveSelectedEmails(EmailPanel, LoginUser);
      
        EmailPanel.removeAll();
        
        userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
      
        EmailPanel.revalidate();    
        EmailPanel.repaint();
       
    }//GEN-LAST:event_ArchivingButtonActionPerformed

    private void UnarchiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnarchiveButtonActionPerformed
       userEmail.unarchiveSelectedEmails(LoginUser);
       
       
        EmailPanel.removeAll();
        
         userEmail.displayAllEmailintoButtonCheckbox(LoginUser, EmailPanel, currentStatus);
     
         EmailPanel.revalidate();
        EmailPanel.repaint();
       
    }//GEN-LAST:event_UnarchiveButtonActionPerformed

    private void ComposeEmailButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComposeEmailButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ComposeEmailButtonFocusGained

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
            java.util.logging.Logger.getLogger(UserEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserEmailMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserEmailMainInterface("User").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Account;
    private javax.swing.JPanel AccountBg;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JButton Archives;
    private javax.swing.JButton ArchivingButton;
    private javax.swing.JButton Back;
    private javax.swing.JButton BackFromEmailCompose;
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel ButtonMenu;
    private javax.swing.JLabel ClickButton;
    private javax.swing.JFrame ComposeEmail;
    private javax.swing.JPanel ComposeEmailBackGround;
    private javax.swing.JButton ComposeEmailButton;
    private javax.swing.JPanel ComposeEmailForm;
    private javax.swing.JTextField ComposeSubject;
    private javax.swing.JLabel DateOfEmail;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteAccount;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JLabel EmailerName;
    private javax.swing.JButton Inbox;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LogoutfromAccount;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JButton Replied;
    private javax.swing.JLabel SchoolTechasReciever;
    private javax.swing.JButton SendEmail;
    private javax.swing.JButton UnarchiveButton;
    private javax.swing.JButton UserAccountButton;
    private javax.swing.JLabel UserInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
