/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanadamal
 */
public class add_book extends javax.swing.JFrame {

    /**
     * Creates new form add_book
     */
    int x,y;
    public add_book() {
        initComponents();
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1_yes);
        bg.add(jRadioButton2_no);
        
        jPanel2.setBackground(new Color(0,0,0,65));
        jPanel3.setBackground(new Color(0,0,0,65));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_id = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        b_name = new javax.swing.JTextField();
        a_name = new javax.swing.JTextField();
        jRadioButton1_yes = new javax.swing.JRadioButton();
        jRadioButton2_no = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        r_name = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        lable_one = new javax.swing.JLabel();
        lable_three = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book ID");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Category");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author name");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Can Issure this Book");

        b_id.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no selected>", "Novel", "Fairy tails", "Short story", "Science", "Mathematics", "Language", "Religions", "Magazine", "News paper", "Geography", "Healthy", "Medicine", "Bussines", " ", " " }));

        b_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        a_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        jRadioButton1_yes.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jRadioButton1_yes.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1_yes.setText("Yes");

        jRadioButton2_no.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jRadioButton2_no.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2_no.setText("No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1_yes)
                                .addGap(51, 51, 51)
                                .addComponent(jRadioButton2_no))
                            .addComponent(a_name)
                            .addComponent(b_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_name))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(b_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(b_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1_yes)
                    .addComponent(jRadioButton2_no))
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 128, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Floor Number");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rack Number");

        r_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no selected>", "1st Floor", "2nd Floor", "3rd Floor" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, 271, Short.MAX_VALUE)
                    .addComponent(r_name))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(r_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 563, 570, -1));

        lable_one.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
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
        jPanel1.add(lable_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 812, -1, -1));

        lable_three.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        lable_three.setText("Cancel");
        lable_three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable_threeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable_threeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable_threeMouseExited(evt);
            }
        });
        jPanel1.add(lable_three, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 812, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add New Books");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 650, -1));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jButton1.setText("Add");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 770, -1, -1));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/minimize.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/close.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(560, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanadamal\\Desktop\\lib_system\\add_book_background.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 850));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lable_oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseClicked
        // TODO add your handling code here:
        menu a= new menu();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_lable_oneMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //to get BottonGroup value
           String issure="";
           if(jRadioButton1_yes.isSelected()){
               issure= jRadioButton1_yes.getText();
           }
           if(jRadioButton2_no.isSelected()){
               issure=jRadioButton2_no.getText();
           }
           
           //to get jComboBox1 value
           String category =(String)jComboBox1.getSelectedItem();
           //to get jComboBox2 value
           String floor =(String)jComboBox2.getSelectedItem();
           
           if(b_id.getText().equals("") || category.equals("<no selected>") || b_name.getText().equals("") || a_name.getText().equals("") || issure.equals("") || floor.equals("<no selected>") || r_name.getText().equals("")){
                      JOptionPane.showMessageDialog(this, "Please Enter All Data To Add This Book !! ", "Warning", JOptionPane.WARNING_MESSAGE);
           }else{
               
                                   try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
                        
                        String check ="select * from all_books where b_id =?";
                        
                        ResultSet rs;
                        PreparedStatement pstmt_check = conn.prepareStatement(check);
                        pstmt_check.setString(1, b_id.getText());
                        rs = pstmt_check.executeQuery();
                    
                    if(rs.next()){
                            JOptionPane.showMessageDialog(this, "This Book is Allready Exist !!", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                    
                        String sql = "insert into all_books values (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        pstmt.setString(1, b_id.getText());
                        pstmt.setString(2, category);
                        pstmt.setString(3, b_name.getText());
                        pstmt.setString(4, a_name.getText());
                        pstmt.setString(5, issure);
                        pstmt.setString(6, floor);
                        pstmt.setString(7, r_name.getText());
                        pstmt.executeUpdate();
                        
                        String sql_two;
                        sql_two ="insert into available_books value(?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pstmt_two = conn.prepareStatement(sql_two);
                        pstmt_two.setString(1, b_id.getText());
                        pstmt_two.setString(2, category);
                        pstmt_two.setString(3, b_name.getText());
                        pstmt_two.setString(4, a_name.getText());
                        pstmt_two.setString(5, issure);
                        pstmt_two.setString(6, floor);
                        pstmt_two.setString(7, r_name.getText());
                        pstmt_two.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this, "Successfuly Added");
                                b_id.setText("");
                                b_name.setText("");
                                a_name.setText("");
                                r_name.setText("");
                                jComboBox1.setSelectedItem("<no selected>");
                                jComboBox2.setSelectedItem("<no selected>");
                       }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
               }
           }
           
        
       /* pb1.setValue(0);
        pb1.setStringPainted(true);
        int i =0;
        while(i<=100){
            pb1.setValue(i);
            i=i+20;
            try{
                Thread.sleep(1500);
            } catch (Exception e) {
               // Logger.getLogger(add_book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lable_threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_threeMouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Are You Sure Want To Cancel !", "Warning",JOptionPane.YES_NO_OPTION );
        if(result == JOptionPane.YES_NO_OPTION){
                b_id.setText("");
                b_name.setText("");
                a_name.setText("");
                r_name.setText("");
            }
     
    }//GEN-LAST:event_lable_threeMouseClicked

    private void lable_oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseEntered
        // TODO add your handling code here:
        lable_one.setForeground(Color.red);
    }//GEN-LAST:event_lable_oneMouseEntered

    private void lable_oneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_oneMouseExited
        // TODO add your handling code here:
        lable_one.setForeground(Color.black);
    }//GEN-LAST:event_lable_oneMouseExited

    private void lable_threeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_threeMouseEntered
        // TODO add your handling code here:
        lable_three.setForeground(Color.red);
    }//GEN-LAST:event_lable_threeMouseEntered

    private void lable_threeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_threeMouseExited
        // TODO add your handling code here:
        lable_three.setForeground(Color.black);
    }//GEN-LAST:event_lable_threeMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        methode_logout();
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

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

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(true);
        jButton1.setOpaque(false);
        jButton1.setBackground(new Color(0,128,129));
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
            java.util.logging.Logger.getLogger(add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_book().setVisible(true);
            }
        });
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_name;
    private javax.swing.JTextField b_id;
    private javax.swing.JTextField b_name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1_yes;
    private javax.swing.JRadioButton jRadioButton2_no;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lable_one;
    private javax.swing.JLabel lable_three;
    private javax.swing.JTextField r_name;
    // End of variables declaration//GEN-END:variables
}
