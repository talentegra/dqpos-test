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
public class EditCustomer extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Connection conn;

    public EditCustomer() {

        initComponents();
        BindCombogroup();
        BindCombostatus();
        BindCombostore();
        

    }

    public void BindCombogroup() {
        try {
            MyQuery mq = new MyQuery();
            HashMap<String, Integer> map = mq.populateCombo();
            for (String s : map.keySet()) {

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
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextCustomerID = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Customer");

        jPanelNewUser.setBackground(new java.awt.Color(223, 235, 223));
        jPanelNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 51));
        jLabel29.setText("Custoemr  ID");
        jPanelNewUser.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 27));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("Name");
        jPanelNewUser.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 27));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 51));
        jLabel25.setText("Email Address");
        jPanelNewUser.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 27));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 51));
        jLabel30.setText("Phone");
        jPanelNewUser.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 27));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 51));
        jLabel31.setText("CF2");
        jPanelNewUser.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 27));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("Store");
        jPanelNewUser.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 27));
        jPanelNewUser.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 249, 34));
        jPanelNewUser.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 249, 34));
        jPanelNewUser.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 249, 34));
        jPanelNewUser.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 249, 34));
        jPanelNewUser.add(jTextCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 249, 34));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Store" }));
        jPanelNewUser.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 249, 35));

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
        jPanelNewUser.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 70, 30));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 80, 30));
        jPanelNewUser.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 249, 34));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 0, 51));
        jLabel37.setText("CF1");
        jPanelNewUser.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        try {

            String name = jTextField2.getText();
            String email = jTextField1.getText();
            String phone = jTextField9.getText();
            String cf1 = jTextField8.getText();
            String cf2 = jTextField4.getText();
            String store_id = jComboBox4.getSelectedItem().toString();

            conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();

            String User_id = jTextCustomerID.getText();

            boolean l_blnQuotes = true;
            String l_strRole = "";
            String l_strStore = "";

            if (store_id != null && !store_id.equals("")) {
                if (store_id.equals("SimplePOS")) {
                    l_strStore = "SimplePOS";
                }

            }
            String l_strQuery = "Update " + Constants.DB_NAME + ".dq_customers set"
                    + " name="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField2.getText()).trim(), l_blnQuotes)
                    + ",email="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField1.getText()).trim(), l_blnQuotes)
                    + ",phone="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField9.getText()).trim(), l_blnQuotes)
                    + ",cf1="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField8.getText()).trim(), l_blnQuotes)
                    + ",cf2="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextField8.getText()).trim(), l_blnQuotes)
                    + ",store_id="
                    + SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "name", "id", "'" + l_strStore + "'", l_blnQuotes)
                    + " where id ="
                    + User_id;
            int res = l_objStatement.executeUpdate(l_strQuery);

            if (res == 1) {
                JOptionPane.showMessageDialog(this, "Customer Updated Sucessfully");

                jTextField2.setText("");
                jTextField1.setText("");
                jTextField9.setText("");
                jTextField8.setText("");
                jTextField4.setText("");
                jComboBox4.setSelectedIndex(-1);

                dispose();

                CustomerHome CH = new CustomerHome();
                CH.setVisible(true);
//                CH.dispose();
                CH.jTextFieldName.setText(name);
                CH.jTextField1.setText(email);
                CH.jTextField9.setText(phone);
                CH.jTextField8.setText(cf1);
                CH.jTextField4.setText(cf2);
                CH.jComboBox4.setSelectedItem(store_id);

                
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
        setVisible(false);
        new CustomerHome().setVisible(true);
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
            java.util.logging.Logger.getLogger(EditCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanelNewUser;
    public javax.swing.JTextField jTextCustomerID;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
