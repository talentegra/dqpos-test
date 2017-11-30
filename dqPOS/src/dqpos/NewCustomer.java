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
public class NewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Connection conn;

    public NewCustomer() {

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
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Customer");

        jPanelNewUser.setBackground(new java.awt.Color(223, 235, 223));
        jPanelNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("Name");
        jPanelNewUser.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 66, 80, 27));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 51));
        jLabel25.setText("Email Address");
        jPanelNewUser.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 126, 80, 27));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 51));
        jLabel30.setText("Phone");
        jPanelNewUser.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 175, 80, 27));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 51));
        jLabel31.setText("CCF1");
        jPanelNewUser.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 27));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 51));
        jLabel32.setText("CCF1");
        jPanelNewUser.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 27));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("Store");
        jPanelNewUser.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 27));
        jPanelNewUser.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 249, 34));
        jPanelNewUser.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 249, 34));
        jPanelNewUser.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 175, 249, 34));
        jPanelNewUser.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 123, 249, 34));
        jPanelNewUser.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 63, 249, 34));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Store" }));
        jPanelNewUser.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 249, 35));

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
        jPanelNewUser.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 70, 30));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:

        String name = jTextField2.getText();
        String email = jTextField1.getText();
        String phone = jTextField9.getText();
        String cf1 = jTextField8.getText();
        String cf2 = jTextField4.getText();
        String store_id = jComboBox4.getSelectedItem().toString();
        String l_strRole = "";
        String l_strStatus = "";
        String l_strStore = "";
        try {

            conn = DBConnect.getConnection();
            conn.setAutoCommit(true);
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();

            if (store_id != null && !store_id.equals("")) {
                if (store_id.equals("SimplePOS")) {
                    l_strStore = "SimplePOS";
                }

            }

            String l_strQuery = "insert into  dq_customers "
                    + "(name,email,phone,cf1,cf2,store_id)"
                    + "values("
                    + "'" + name + "'"
                    + ",'" + email + "'"
                    + ",'" + phone + "'"
                    + ",'" + cf1 + "'"
                    + ",'" + cf2 + "'"
                    + "," + SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "name", "id", "'" + l_strStore + "'", true) + ""
                    + ")";
            int i = l_objStatement.executeUpdate(l_strQuery);
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Customer Inserted Sucessfully");

                jTextField2.setText("");
                jTextField1.setText("");
                jTextField9.setText("");
                jTextField8.setText("");
                jTextField4.setText("");
                jComboBox4.setSelectedIndex(-1);

                dispose();
               

//
                CustomerHome CH = new CustomerHome();
                CH.setVisible(true);
              //  dispose();
              //  CH.Customerbg.setVisible(true);                
                CH.jTextFieldName.setText(name);
                CH.jTextField1.setText(email);
                CH.jTextField9.setText(phone);
                CH.jTextField8.setText(cf1);
                CH.jTextField4.setText(cf2);
                CH.jComboBox4.setSelectedItem(store_id);
                 
                CH.jTextFieldName.setEnabled(false);
                CH.jTextField1.setEnabled(false);
                CH.jTextField9.setEnabled(false);
                CH.jTextField8.setEnabled(false);
                CH.jTextField4.setEnabled(false);
                CH.jComboBox4.setEnabled(false);
                        
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
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomer().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    public javax.swing.JPanel jPanelNewUser;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
