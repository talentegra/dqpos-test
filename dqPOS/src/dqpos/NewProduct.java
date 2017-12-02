/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

import com.commons.Constants;
import com.utils.SDCommonUtil;
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author camp
 */
public class NewProduct extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Connection conn;

    public NewProduct() {

        initComponents();

        BindComboCategory();

    }

    public void BindComboCategory() {
        try {
            MyQuery mq = new MyQuery();
            HashMap<String, Integer> map = mq.populateComboCategory();
            for (String s : map.keySet()) {
                jComboCategory.addItem(s);

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
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jComboBarcode = new javax.swing.JComboBox<>();
        jComboCategory = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldProdTax = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldAlertQty = new javax.swing.JTextField();
        jComboBoxTax = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldImage = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jImgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Product");

        jPanelNewUser.setBackground(new java.awt.Color(223, 235, 223));
        jPanelNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanelNewUser.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 70, 30));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, -1, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 51));
        jLabel34.setText("Type");
        jPanelNewUser.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 20));

        jComboBoxType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Combo", "Service" }));
        jPanelNewUser.add(jComboBoxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 240, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 51));
        jLabel32.setText("Code");
        jPanelNewUser.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 27));

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 240, 34));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 51));
        jLabel31.setText(" Name");
        jPanelNewUser.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 27));

        jTextFieldCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 34));

        jComboBarcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBarcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code128", "Code 25", "Code 39", "EAN8", "EAN13", "UPC- A", "UPC- E" }));
        jComboBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBarcodeActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jComboBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 240, 32));

        jComboCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        jPanelNewUser.add(jComboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 240, 32));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 0, 51));
        jLabel33.setText("Category");
        jPanelNewUser.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 27));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 51));
        jLabel36.setText("Barcode Symbology");
        jPanelNewUser.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 27));

        jTextFieldCost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 240, 34));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 0, 51));
        jLabel37.setText("Cost");
        jPanelNewUser.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 27));

        jTextFieldPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 240, 34));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("Price");
        jPanelNewUser.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 80, 27));

        jTextFieldProdTax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldProdTax.setText("0");
        jPanelNewUser.add(jTextFieldProdTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 240, 34));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 0, 51));
        jLabel39.setText("Product Tax");
        jPanelNewUser.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 80, 27));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 0, 51));
        jLabel44.setText("Details");
        jPanelNewUser.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 80, 27));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanelNewUser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 411, 38));

        jTextFieldAlertQty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldAlertQty.setText("0");
        jPanelNewUser.add(jTextFieldAlertQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 248, 34));

        jComboBoxTax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxTax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inclusive", "Exclusive" }));
        jComboBoxTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTaxActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jComboBoxTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 240, 32));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(153, 0, 51));
        jLabel45.setText("Alert Quantity");
        jPanelNewUser.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 80, 27));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 0, 51));
        jLabel38.setText("Tax Method");
        jPanelNewUser.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 80, 27));

        jTextFieldImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 248, 34));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 0, 51));
        jLabel40.setText("Image");
        jPanelNewUser.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 80, 27));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 0, 51));
        jLabel42.setText("Quantity");
        jPanelNewUser.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 80, 27));

        jTextFieldQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelNewUser.add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 200, 38));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setText("Choose File");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 34));

        jImgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/open.png"))); // NOI18N
        jPanel21.add(jImgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 30, 39));

        jPanelNewUser.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        dispose();
        new ProductHome().setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        final int NUM_FIELDS = 13;
        int numCorrectFields = 0;
        String errorMessage = "";
        String type = jComboBoxType.getSelectedItem().toString();
        String name = jTextFieldName.getText();
        String code = jTextFieldCode.getText();
        String barcode = jComboBarcode.getSelectedItem().toString();
        String category_id = jComboCategory.getSelectedItem().toString();
        int cost = Integer.parseInt(jTextFieldCost.getText());
        int price = Integer.parseInt(jTextFieldPrice.getText());
        String prodtax = jTextFieldProdTax.getText();
        String tax_method = jComboBoxTax.getSelectedItem().toString();
        String alertqty = jTextFieldAlertQty.getText();
        String Quantity = jTextFieldQuantity.getText();
        String image = jTextFieldImage.getText();
        String details = jTextArea1.getText();

        try {
            if (jTextFieldName.getText().equalsIgnoreCase("<enter name>") || jTextFieldName.getText().isEmpty()) {
                errorMessage = errorMessage.concat("NAME FIELD IS MISSING.\n");
            } else {
                numCorrectFields++;
                name = jTextFieldName.getText();
            }
            if (jTextFieldCode.getText().equalsIgnoreCase("<enter name>") || jTextFieldCode.getText().isEmpty()) {
                errorMessage = errorMessage.concat("CODE FIELD IS MISSING.\n");
            } else {
                numCorrectFields++;
                code = jTextFieldCode.getText();
            }
            if (jTextFieldCost.getText().equalsIgnoreCase("<enter name>") || jTextFieldCost.getText().isEmpty()) {
                errorMessage = errorMessage.concat("COST FIELD IS MISSING.\n");
            } else {
                numCorrectFields++;
                cost = Integer.parseInt(jTextFieldCost.getText());
            }
            if (jTextFieldPrice.getText().equalsIgnoreCase("<enter name>") || jTextFieldPrice.getText().isEmpty()) {
                errorMessage = errorMessage.concat("PRICE FIELD IS MISSING.\n");
            } else {
                try {

                    int price1 = Integer.parseInt(jTextFieldPrice.getText());
                    if (price1 <= 0 || price1 >= 10) {
                        errorMessage = errorMessage.concat("PRICE MUST BE  DIGITS \n");
                    } else {
                        price = price1;
                        numCorrectFields++;
                    }

                } catch (NumberFormatException e) {
                    errorMessage = errorMessage.concat("PRICE  IS NOT  VALID \n");
                }

            }
            

            if (jComboBoxTax.getSelectedItem().toString().isEmpty()) {
                errorMessage = errorMessage.concat("YOU MUST SELECT A GENDER \n");
            } else {
                tax_method = jComboBoxTax.getSelectedItem().toString();
                numCorrectFields++;
            }
             if (numCorrectFields < NUM_FIELDS) {

                JOptionPane.showMessageDialog(null, errorMessage, "INVALID/INCOMPLETE USER INPUT", JOptionPane.ERROR_MESSAGE);
                int p = JOptionPane.showConfirmDialog(this, "Do you really wnat to coninue", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
                if (p == 0) {

            conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();
            String l_strCategory = "";
            if (category_id != null && !category_id.equals("")) {
                if (category_id.equals("c14")) {
                    l_strCategory = "c14";
                }
                if (category_id.equals("cf1")) {
                    l_strCategory = "cf1";
                }
                if (category_id.equals("cf32")) {
                    l_strCategory = "cf32";
                }
            }

            String l_strQuery = "insert into dq_products "
                    + "(code,name,category_id,price,image,tax,cost,tax_method,quantity,barcode_symbology,type,details,alert_quantity)"
                    + "values("
                    + "'" + code + "'"
                    + ",'" + name + "'"
                    + "," + SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_categories", "code", "id", "'" + l_strCategory + "'", true) + ""
                    + ",'" + price + "'"
                    + ",'" + image + "'"
                    + ",'" + prodtax + "'"
                    + ",'" + cost + "'"
                    + ",'" + tax_method + "'"
                    + ",'" + Quantity + "'"
                    + ",'" + barcode + "'"
                    + ",'" + type + "'"
                    + ",'" + details + "'"
                    + ",'" + alertqty + "'"
                    + ")";
            int i = l_objStatement.executeUpdate(l_strQuery);
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Product Inserted Sucessfully");
            }}
                jComboBoxType.setSelectedItem("");
                jTextFieldName.setText("");
                jTextFieldCode.setText("");
                jComboBarcode.setSelectedItem("");
                jComboCategory.setSelectedItem("");
                jTextFieldCost.setText("");
                jTextFieldPrice.setText("");
                jTextFieldProdTax.setText("");
                jComboBoxTax.setSelectedItem("");
                jTextFieldAlertQty.setText("");
                jTextFieldQuantity.setText("");
                jTextFieldImage.setText("");
                jTextArea1.setText("");
                dispose();

                ProductHome ph = new ProductHome();

                ph.setVisible(true);

                ph.jTextProductname.setText(name);
                ph.jTextProductname.setEnabled(false);
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

    private void jComboBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBarcodeActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:

        JFileChooser jf1 = new JFileChooser();
        jf1.showOpenDialog(null);
        File f = jf1.getSelectedFile();
        String filename = f.getPath();
        ImageIcon img1 = new ImageIcon(filename);
        jImgLbl.setIcon(img1);
        jTextFieldImage.setText(filename);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jComboBoxTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTaxActionPerformed

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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProduct().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JComboBox<String> jComboBarcode;
    private javax.swing.JComboBox<String> jComboBoxTax;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JLabel jImgLbl;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel21;
    public javax.swing.JPanel jPanelNewUser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAlertQty;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldImage;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProdTax;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
