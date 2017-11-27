/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.utils.SDCommonUtil;
import com.commons.Constants;
import java.util.HashMap;

/**
 *
 * @author camp
 */
public class EditUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Connection conn;

    public EditUser() {

        initComponents();
        BindCombogroup();
        BindCombostatus();
        BindCombostore();

    }

    public void ClearUser() {
        jComboBox1.setSelectedIndex(-1);
        jTextUserID.setText("");
        jTextField1.setText("");
        jTextField8.setText("");
        jComboBox2.getSelectedItem().toString();
        jTextField4.setText("");
        jTextField5.setText("");
        pwd1.setText("");
        password2.setText("");
        jComboBox3.setSelectedIndex(-1);
        jComboBox4.setSelectedIndex(-1);

    }

    public void BindCombogroup() {
        try {
            MyQuery mq = new MyQuery();
            HashMap<String, Integer> map = mq.populateCombo();
            for (String s : map.keySet()) {
                jComboBox1.addItem(s);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BindCombostatus() {
        try {
            MyQuery mq = new MyQuery();
            HashMap<String, Integer> map = mq.populateCombo1();
            for (String s : map.keySet()) {
                jComboBox3.addItem(s);
                // jComboBox11.addItem(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BindCombostore() {
        try {
            MyQuery mq = new MyQuery();
            HashMap<String, Integer> map = mq.populateCombo2();
            for (String s : map.keySet()) {
                jComboBox4.addItem(s);
                //  jComboBox4.addItem(s);
//                jComboBox12.addItem(s);
//                jComboBox16.addItem(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNewUser = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        pwd1 = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextUserID = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit User");

        jPanelNewUser.setBackground(new java.awt.Color(223, 235, 223));
        jPanelNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 51));
        jLabel29.setText("User ID");
        jPanelNewUser.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 27));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("First Name");
        jPanelNewUser.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 27));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 51));
        jLabel25.setText("Last Name");
        jPanelNewUser.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 27));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 51));
        jLabel30.setText("Phone");
        jPanelNewUser.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 27));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 0, 51));
        jLabel28.setText("Gender");
        jPanelNewUser.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 27));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 51));
        jLabel31.setText("Email");
        jPanelNewUser.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 27));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 51));
        jLabel32.setText("User name");
        jPanelNewUser.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 27));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 0, 51));
        jLabel33.setText("Password");
        jPanelNewUser.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 80, 27));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 51));
        jLabel34.setText("Confirm Password");
        jPanelNewUser.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 80, 27));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("Store");
        jPanelNewUser.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 80, 27));
        jPanelNewUser.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 249, 34));
        jPanelNewUser.add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 249, 34));
        jPanelNewUser.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 249, 34));
        jPanelNewUser.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 249, 34));
        jPanelNewUser.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 249, 34));
        jPanelNewUser.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 249, 34));
        jPanelNewUser.add(jTextUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 249, 34));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 51));
        jLabel36.setText("Status");
        jPanelNewUser.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 80, 27));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Group" }));
        jPanelNewUser.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 249, 34));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status" }));
        jPanelNewUser.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 249, 35));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Store" }));
        jPanelNewUser.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 249, 35));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanelNewUser.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 249, 35));

        jButton26.setBackground(new java.awt.Color(153, 255, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("Ok");
        jButton26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton26FocusLost(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 80, 30));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 80, 30));
        jPanelNewUser.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 249, 34));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 0, 51));
        jLabel37.setText("Group Name");
        jPanelNewUser.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        try {
            String group_id = jComboBox1.getSelectedItem().toString();
            String fname = jTextField2.getText();
            String lname = jTextField1.getText();
            String phone = jTextField8.getText();
            String gender = jComboBox2.getSelectedItem().toString();
            String email = jTextField4.getText();
            String uname = jTextField5.getText();
            String password = pwd1.getText();
            String cpwd = password2.getText();
            String status_id = jComboBox3.getSelectedItem().toString();
            String store_id = jComboBox4.getSelectedItem().toString();

            conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();

            String User_id = jTextUserID.getText();

            boolean l_blnQuotes = true;
            String l_strRole = "";
            String l_strStore = "";

            if (group_id != null && !group_id.equals("")) {
                if (group_id.equals("admin")) {
                    l_strRole = "admin";
                }
                if (group_id.equals("staff")) {
                    l_strRole = "staff";
                }
            }

            if (store_id != null && !store_id.equals("")) {
                if (store_id.equals("SimplePOS")) {
                    l_strStore = "SimplePOS";
                }

            }
            String l_strQuery = "Update " + Constants.DB_NAME + ".dq_users set"
                    + " group_id="
                    + SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_groups", "name", "id", "'" + l_strRole + "'", l_blnQuotes)
                    + ",first_name="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField2.getText()).trim(), l_blnQuotes)
                    + ",last_name="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField1.getText()).trim(), l_blnQuotes)
                    + ",phone="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField8.getText()).trim(), l_blnQuotes)
                    + ",gender="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jComboBox2.getSelectedItem().toString()).trim(), l_blnQuotes)
                    + ",email="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField4.getText()).trim(), l_blnQuotes)
                    + ",username="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField5.getText()).trim(), l_blnQuotes)
                    + ",password="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(pwd1.getText()).trim(), l_blnQuotes)
                    + ",cpwd="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(password2.getText()).trim(), l_blnQuotes)
                    + ",status="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jComboBox3.getSelectedItem().toString()).trim(), l_blnQuotes)
                    + ",store_id="
                    + SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "name", "id", "'" + l_strStore + "'", l_blnQuotes)
                    + " where id ="
                    + User_id;
            int res = l_objStatement.executeUpdate(l_strQuery);

            if (res == 1) {
                JOptionPane.showMessageDialog(this, "User Updated Sucessfully");
                jComboBox1.setSelectedIndex(-1);
                jTextField2.setText("");
                jTextField1.setText("");
                jTextField8.setText("");
                jComboBox2.setSelectedIndex(-1);
                jTextField4.setText("");
                jTextField5.setText("");
                pwd1.setText("");
                password2.setText("");
                jComboBox3.setSelectedIndex(-1);
                jComboBox4.setSelectedIndex(-1);

                dispose();
                Home1 nh = new Home1();
                nh.dispose();

//                Home1 nh = new Home1();
//                nh.setVisible(true);
//                dispose();
//                nh.bg.setVisible(true);
//                nh.jComboBox1.setSelectedItem(group_id);
//                nh.jTextField2.setText(fname);
//                nh.jTextField1.setText(lname);
//                nh.jTextField8.setText(phone);
//                nh.jComboBox2.setSelectedItem(gender);
//                nh.jTextField4.setText(email);
//                nh.jTextField5.setText(uname);
//                nh.pwd1.setText(password);
//                nh.password2.setText(cpwd);
//                nh.jComboBox3.setSelectedItem(status_id);
//                nh.jComboBox4.setSelectedItem(store_id);
                conn.setAutoCommit(true);

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton26ActionPerformed


    private void jButton26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton26FocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton26FocusLost

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home1().setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

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
            java.util.logging.Logger.getLogger(EditUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanelNewUser;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextUserID;
    public javax.swing.JPasswordField password2;
    public javax.swing.JPasswordField pwd1;
    // End of variables declaration//GEN-END:variables
}
