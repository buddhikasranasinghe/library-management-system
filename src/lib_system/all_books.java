/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sanadamal
 */
public class all_books extends javax.swing.JFrame {

    /**
     * Creates new form all_books
     */
    int x,y;
    public all_books() {
        initComponents();
        
        display_book_details();
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1_yes);
        bg.add(jRadioButton2_no);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        search_item = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_name = new javax.swing.JTextField();
        a_name = new javax.swing.JTextField();
        r_number = new javax.swing.JTextField();
        b_id = new javax.swing.JTextField();
        b_update = new javax.swing.JButton();
        jRadioButton1_yes = new javax.swing.JRadioButton();
        jRadioButton2_no = new javax.swing.JRadioButton();
        b_category = new javax.swing.JComboBox<>();
        b_floor = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 720, 83, 40));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Books");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1670, 50));

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jButton2.setText("Add new Books");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 175, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 20))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search From");

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no selected>", "Book ID", "Book Name", "Book Category", "Floor", "Rack", "Authour Name" }));

        search_item.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        jTable2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(search_item, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_item, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 960, 280));

        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "category", "book name", "aouther name", "issure", "floor", "rack"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 960, 192));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Books Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 20))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel4.setText("Book ID");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel5.setText("Category");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel7.setText("Aouther Name");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel8.setText("Can Issure");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel9.setText("Floor Number");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel10.setText("Rack Number");

        b_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        a_name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        r_number.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        b_id.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N

        b_update.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        b_update.setText("Update");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        jRadioButton1_yes.setText("Yes");

        jRadioButton2_no.setText("No");

        b_category.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        b_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no selected>", "Novel", "Fairy tails", "Short story", "Science", "Mathematics", "Language", "Religions", "Magazine", "News paper", "Geography", "Healthy", "Medicine", "Bussines" }));

        b_floor.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        b_floor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no selected>", "1st Floor", "2nd Floor", "3rd Floor" }));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Get Values");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b_floor, 0, 342, Short.MAX_VALUE)
                                    .addComponent(r_number)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1_yes)
                                        .addGap(79, 79, 79)
                                        .addComponent(jRadioButton2_no))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(b_id, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b_name)
                                    .addComponent(a_name, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b_category, 0, 342, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(b_update)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_category, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(a_name, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1_yes)
                    .addComponent(jRadioButton2_no))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(b_floor))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(r_number, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(b_update)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, -1, 560));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/minimize.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib_system/close.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanadamal\\Desktop\\lib_system\\new_all_books_background.png")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1670, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        menu m = new menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        add_book ab = new add_book();
        ab.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String column = (String) jComboBox1.getSelectedItem();
        String bo_id="";
        String bo_category="";
        String bo_name="";
        String ao_name="";
        String bo_issure="";
        String bo_floor="";
        String bo_rack="";
        
        String value ="<no selected>";
        
        if(column.equals("Book ID")){
            value ="b_id";
        }else if(column.equals("Book Category")){
            value = "b_category";
        }else if(column.equals("Book Name")){
            value= "b_name";
        }else if(column.equals("Authour Name")){
            value ="a_name";
        }else if(column.equals("Floor")){
            value ="b_floor";
        }else if(column.equals("Rack")){
            value ="b_rack";
        }
        
        if(jComboBox1.getSelectedItem().equals("<no selected>") || search_item.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cannot Search !!");
        }else{
            get_search_details(value);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        get_selected_book();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String value = get_selected_book();
        int result = JOptionPane.showConfirmDialog(this, "Are You Sure Want To Delete "+value, "Massage",JOptionPane.YES_NO_OPTION);
        if(result!= JOptionPane.YES_OPTION){
            
        }else{
            try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
               String sql;
               sql = "delete from all_books where b_id=? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);
               pstmt.setString(1, value);
               pstmt.executeUpdate();
               
               String sql_two = "delete from available_books where b_id=? ";
               PreparedStatement pstmt_two = conn.prepareStatement(sql_two);
               pstmt_two.setString(1, value);
               pstmt_two.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Delete Sucessuly !!");
          }catch(Exception e){
              JOptionPane.showMessageDialog(this, e);
          }
        }
        display_book_details();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
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
           String category =(String)b_category.getSelectedItem();
           //to get jComboBox2 value
           String floor =(String)b_floor.getSelectedItem();
        
         if(b_id.getText().equals("") || category.equals("<not selected>") || b_name.getText().equals("") || a_name.getText().equals("") || issure.equals("") || floor.equals("<no selected>") || r_number.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Empty Feild !!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                try{
                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
                                String sql;
                                sql = "update all_books set b_category=?, b_name=?, a_name=?, b_issure=?, b_floor=?, b_rack=? where b_id=?";
                                PreparedStatement pstmt = conn.prepareStatement(sql);
                                pstmt.setString(7, b_id.getText());
                                pstmt.setString(1, category);
                                pstmt.setString(2, b_name.getText());
                                pstmt.setString(3, a_name.getText());
                                pstmt.setString(4, issure);
                                pstmt.setString(5, floor);
                                pstmt.setString(6, r_number.getText());
                                pstmt.executeUpdate();
                                
                                String sql_two;
                                sql_two = "update available_books set b_category=?, b_name=?, a_name=?, b_issure=?, b_floor=?, b_rack=? where b_id=?";
                                PreparedStatement pstmt_two = conn.prepareStatement(sql_two);
                                pstmt_two.setString(7, b_id.getText());
                                pstmt_two.setString(1, category);
                                pstmt_two.setString(2, b_name.getText());
                                pstmt_two.setString(3, a_name.getText());
                                pstmt_two.setString(4, issure);
                                pstmt_two.setString(5, floor);
                                pstmt_two.setString(6, r_number.getText());
                                pstmt_two.executeUpdate();
                                
                                JOptionPane.showMessageDialog(this, "Successfuly Update !!");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);
                }
        }
        display_book_details();
    }//GEN-LAST:event_b_updateActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        
          if(b_id.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Index Number", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String sql ="select * from available_books where b_id=?";
            try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
                ResultSet rs ;
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, b_id.getText());
                rs = pstmt.executeQuery(); 
                if(rs.next()){
                    get_value();
                }else{
                    JOptionPane.showMessageDialog(this, "Invalied Index", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        methode_logout();
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(all_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(all_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(all_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(all_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new all_books().setVisible(true);
            }
        });
    }
    
     public void display_book_details(){
        String sql = "select * from all_books";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public String get_selected_book(){
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         int row = jTable1.getSelectedRow();
        // int column = jTable1.getSelectedColumn();
         String value = (String) jTable1.getModel().getValueAt(row, 0);
         return value;
     }
     
      public void get_value(){
            
          
          String book_category = null;
          String book_name = null;
          String aouther_name = null;
          String book_rack = null;
          String book_issure = null;
          String book_floor = null;
          
          
            String sql ="select * from available_books where b_id=?";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
                ResultSet rs ;
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, b_id.getText());
                rs = pstmt.executeQuery(); 
                        if(rs.next()){
                            book_category = rs.getString(2);
                            book_name = rs.getString(3);
                            aouther_name =rs.getString(4);
                            book_issure = rs.getString(5);
                            book_floor = rs.getString(6);
                            book_rack = rs.getString(7);
                        }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        //s_full_name.setText(one);
        b_name.setText(book_name);
        a_name.setText(aouther_name);
        //st_home.setText(four);
       // st_mobile.setText(five);
        r_number.setText(book_rack);
     }
      
           public void get_search_details(String value){
        try{
           String sql = "select * from all_books where "+value+" ='"+search_item.getText()+"'";
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
           PreparedStatement pstmt =conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery(sql);
          
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
           
 public void methode_logout(){
      
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_system?serverTimezone=UTC","root","");
        PreparedStatement pstmt = conn.prepareStatement("delete from temporary_user");
        pstmt.executeUpdate();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_name;
    private javax.swing.JComboBox<String> b_category;
    private javax.swing.JComboBox<String> b_floor;
    private javax.swing.JTextField b_id;
    private javax.swing.JTextField b_name;
    private javax.swing.JButton b_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JRadioButton jRadioButton1_yes;
    private javax.swing.JRadioButton jRadioButton2_no;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField r_number;
    private javax.swing.JTextField search_item;
    // End of variables declaration//GEN-END:variables
}
