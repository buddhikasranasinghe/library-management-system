/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib_system;

//import com.mysql.cj.Session;
import java.awt.Color;
import static java.awt.image.ImageObserver.PROPERTIES;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.net.*;
import javax.net.ssl.*;
import java.net.*;
import static java.time.Clock.system;
import javax.swing.JFrame;

/**
 *
 * @author Sanadamal
 */
public class cna extends javax.swing.JFrame {

    /**
     * Creates new form cna
     */
    int x,y;
    public cna() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        jPanel2.setBackground(new Color(0, 0,0,65));
        jLabel3.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        jLabel7.setForeground(Color.white);
        jPanel3.setBackground(new Color(0,0,0,65));
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        jLabel9.setForeground(Color.white);
        jLabel5.setForeground(Color.white);
        jLabel8.setForeground(Color.white);
        jLabel10.setForeground(Color.white);
        jLabel11.setForeground(Color.white);
        jLabel12.setForeground(Color.white);
        jLabel14.setForeground(Color.white);
       jButton1.setContentAreaFilled(false);
       jButton1.setOpaque(false);
       btn_cancel.setContentAreaFilled(false);
       btn_cancel.setOpaque(false);
       
       t_one.setText("no entered");
       t_two.setText("no entered");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lable_one = new javax.swing.JLabel();
        lable_two = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        short_name = new javax.swing.JTextField();
        full_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        nic_number = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_one = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_two = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("jLabel13");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 49, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 128, 129));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jButton1.setText("Ctreate Account");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 704, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registration Form");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 866, -1));

        lable_one.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        lable_one.setForeground(new java.awt.Color(255, 255, 255));
        lable_one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lable_one.setText("Back");
        lable_one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable_oneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable_oneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable_oneMouseExited(evt);
            }
        });
        jPanel1.add(lable_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 805, 100, 30));

        lable_two.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        lable_two.setForeground(new java.awt.Color(255, 255, 255));
        lable_two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lable_two.setText("I Already Have An Account");
        lable_two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable_twoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable_twoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable_twoMouseExited(evt);
            }
        });
        jPanel1.add(lable_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 805, 276, 30));

        btn_cancel.setBackground(new java.awt.Color(0, 128, 129));
        btn_cancel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 131, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel4.setText("Confirm password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 165, -1));

        p1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 82, 499, 40));

        p2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 135, 499, 40));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel7.setText("User Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 165, -1));

        u_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel2.add(u_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 25, 499, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 501, 792, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel1.setText("Full Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 40, 167, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel2.setText("Name With Initials");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 167, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel5.setText("Email Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 169, 167, -1));

        email.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 164, 499, 37));

        short_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        short_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                short_nameActionPerformed(evt);
            }
        });
        jPanel3.add(short_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 74, 499, 39));

        full_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        full_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                full_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                full_nameMouseExited(evt);
            }
        });
        jPanel3.add(full_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 29, 499, 38));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel8.setText("Permanant Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 208, 167, -1));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 208, 499, 52));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel9.setText("NIC number");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 167, -1));

        nic_number.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel3.add(nic_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 120, 499, 37));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel10.setText("Gender");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 267, 167, -1));

        jRadioButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");
        jRadioButton1.setOpaque(false);
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 263, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseEntered(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 263, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel11.setText("Contact Number");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 314, 167, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel12.setText("1.");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 314, -1, -1));

        t_one.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel3.add(t_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 311, 170, 36));

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel14.setText("2.");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 314, -1, -1));

        t_two.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jPanel3.add(t_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 311, 179, 37));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 114, 790, 370));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/close.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/minimize.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanadamal\\Desktop\\lib_system\\login_form_background.png")); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 870, 860));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void short_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_short_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_short_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serverTimezone=UTC","root","");
            String sql = "select *from master.dbo.sysdatabases where name ='lib_system' ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "database is exsist");
            }else{
                JOptionPane.showMessageDialog(this, "not exsist");
        }
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(this, e);
        }
       /* String n= p2.getText();
        if(full_name.getText().equals("") || address.getText().equals("")|| nic_number.getText().equals("") || (t_one.getText().equals("") && t_two.getText().equals("")) || u_name.getText().equals("") || short_name.getText().equals("") || p1.getText().equals("") || p2.getText().equals("") ){
               JOptionPane.showMessageDialog(this, "Please Enter All Data to Create New Account");
        }else{
                if(p1.getText().equals(n)){
                    try{

                        int get_id = get_id();
                        String gender="female";
                        if(jRadioButton1.isSelected()){
                            gender ="male";
                        }
                        
                        String tOne ="no entered";
                        if(tOne!= t_one.getText()){
                            tOne = t_one.getText();
                        }
                        String tTwo = "no entered";
                        if(tTwo != t_two.getText()){
                            tTwo = t_two.getText();
                        }
                        
                        int number = get_random_number();
                        String to =email.getText();
                        String Subject ="Email verification";
                        String text ="verification code  "+number+"";
                        String res = send_mail(to, Subject, text);
                        if(res!="true"){
                            
                        }else{
                        String result =  JOptionPane.showInputDialog(this, "Enter your Code Here", "Email Varification", JOptionPane.WARNING_MESSAGE);
                        int rslt = Integer.parseInt(result);
                                    if(rslt == number){
                                       Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root",""); 

                                    String sql = "insert into login values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                    PreparedStatement pstmt = conn.prepareStatement(sql);
                                    pstmt.setInt(1, get_id);
                                    pstmt.setString(2, full_name.getText());
                                    pstmt.setString(3, short_name.getText());
                                    pstmt.setString(4, nic_number.getText());
                                    pstmt.setString(5, email.getText());
                                    pstmt.setString(6, address.getText());
                                    pstmt.setString(7, gender);
                                    pstmt.setString(8, tOne);
                                    pstmt.setString(9, tTwo);
                                    pstmt.setString(10, u_name.getText());
                                    pstmt.setString(11, p2.getText());
                                    
                                    pstmt.executeUpdate();
                                    JOptionPane.showMessageDialog(this, "Insettion Successful\nYour Account Successfuly Created !\nYour ID "+get_id+"\nYour User Name "+ u_name.getText()+ "\nYour Password "+ p2.getText());

                                                    full_name.setText("");
                                                    short_name.setText("");
                                                    p1.setText("");
                                                    p2.setText("");
                                                    email.setText("");
                                                    nic_number.setText("");
                                                    address.setText("");
                                                    t_one.setText("");
                                                    t_two.setText("");
                                                    u_name.setText("");
                                    }else{
                                        JOptionPane.showMessageDialog(this, "Please Enter Varification Code Correctly !!", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                         }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
               }else{
                       JOptionPane.showMessageDialog(this, "Your Passwords Doesn't Match !!"); 
                       p1.setText("");
                       p2.setText("");
               }
        }*/ 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lable_oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseClicked
        // TODO add your handling code here:
        main a = new main();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_lable_oneMouseClicked

    private void lable_twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_twoMouseClicked
        // TODO add your handling code here:
        main a = new main();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_lable_twoMouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Do You No Need An Account !! ","Question", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            main m = new main();
            m.setVisible(true);
            dispose();
        }else{
            full_name.setText("");
            short_name.setText("");
            p1.setText("");
            p2.setText("");
        }
        
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void lable_oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseEntered
        // TODO add your handling code here:
        lable_one.setForeground(Color.red);
    }//GEN-LAST:event_lable_oneMouseEntered

    private void lable_oneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseExited
        // TODO add your handling code here:
        lable_one.setForeground(Color.black);
    }//GEN-LAST:event_lable_oneMouseExited

    private void lable_twoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_twoMouseEntered
        // TODO add your handling code here:
        lable_two.setForeground(Color.red);
    }//GEN-LAST:event_lable_twoMouseEntered

    private void lable_twoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_twoMouseExited
        // TODO add your handling code here:
        lable_two.setForeground(Color.black);
    }//GEN-LAST:event_lable_twoMouseExited

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
        // TODO add your handling code here:
        btn_cancel.setContentAreaFilled(true);
        btn_cancel.setBackground(new Color(0,128,129));
        btn_cancel.setOpaque(false);
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        // TODO add your handling code here:
        btn_cancel.setContentAreaFilled(false);
        
    }//GEN-LAST:event_btn_cancelMouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        methode_logout();
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jRadioButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseEntered

    private void full_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_full_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_full_nameMouseEntered

    private void full_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_full_nameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_full_nameMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(true);
        jButton1.setBackground(new Color(0,128,129));
        jButton1.setOpaque(false);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(cna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cna().setVisible(true);
            }
        });
    }
    public int get_random_number(){
    int min =1001;
    int max = 9999;
    int result =(int)(Math.random() * (max- min +1) + min);
    return result;
    }
    
    public String send_mail(String to, String Subject, String text){
        String Msg=null;
        final String from ="libraraymanagementsystem@gmail.com";
        final String password ="libsystem";
        Properties props = new Properties();
        props.put("mail.smtp.auth","true");//enable uthenticatioon
        props.put("mail.smtp.starttls.enable","true");// enable starttls
        props.put("mail.smtp.host","smtp.gmail.com");// smtp host
        props.put("mail.smtp.port",587);// tls port

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
           @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return  new PasswordAuthentication(from, password);
            }
});
        try{
            MimeMessage message  = new MimeMessage(session);
            message.setFrom( new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(Subject);
            message.setText(text);
            Transport.send(message);
            Msg="true";
            JOptionPane.showMessageDialog(this, "You Will Riceve Email !");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Check Your Internet Connection !!","Error",JOptionPane.ERROR_MESSAGE);
        }
        return Msg;
    }
    
    public int get_id(){
        int id=0;
        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
                        String check =" select id, max(id) from login";
                        ResultSet rs;
                        PreparedStatement pstmt_check = conn.prepareStatement(check);
                        rs = pstmt_check.executeQuery();
                        if(rs.next()){
                            id= rs.getInt(2);
                        }
                        id=id+1;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        return id;
    }
    
public void methode_logout(){
      
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
        PreparedStatement pstmt = conn.prepareStatement("delete from temporary_user");
        //pstmt.setString(1, id);
        pstmt.executeUpdate();
         // JOptionPane.showMessageDialog(this, "Succesfuly Logout !");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

public int validation(String tOne, String tTwo){
    int result_one =0;
    int result_two =0;
    String mobile_one =tOne;
    String mobile_two =tTwo;
    int length_one = tOne.length();
    int length_two = tTwo.length();

    if(!"no entered".equals(mobile_one)|| !"".equals(mobile_one)){
        if(length_one == 10){
            try{
                int m_one = Integer.parseInt(mobile_one);
                result_one = 1;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please Enter Mobile Number in Number Format !!","Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please Enter Mobile Number Correctly !!","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    if(!"no entered".equals(mobile_two)|| !"".equals(mobile_two)){     
        if(length_two == 10){
            try{
                int m_two = Integer.parseInt(mobile_two);
                result_two = 1;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please Enter Mobile Number Correctly !!","Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please Enter Mobile Number Correctly !!","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    return result_one;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField full_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lable_one;
    private javax.swing.JLabel lable_two;
    private javax.swing.JTextField nic_number;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField short_name;
    private javax.swing.JTextField t_one;
    private javax.swing.JTextField t_two;
    private javax.swing.JTextField u_name;
    // End of variables declaration//GEN-END:variables

    private void getAuthentication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
