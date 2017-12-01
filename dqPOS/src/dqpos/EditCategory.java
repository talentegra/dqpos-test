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
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camp
 */
public class EditCategory extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Connection conn;

    public EditCategory() {

        initComponents();
       

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
        jTextCode = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextImage = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jImgLbl = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextCategoryID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Category");

        jPanelNewUser.setBackground(new java.awt.Color(223, 235, 223));
        jPanelNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("Code");
        jPanelNewUser.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 80, 27));
        jPanelNewUser.add(jTextCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, 34));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 51));
        jLabel20.setText(" Name");
        jPanelNewUser.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 80, 27));
        jPanelNewUser.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 240, 34));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 51));
        jLabel23.setText("image");
        jPanelNewUser.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, 27));
        jPanelNewUser.add(jTextImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 240, 34));

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

        jPanelNewUser.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jButtonOk.setBackground(new java.awt.Color(153, 255, 153));
        jButtonOk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonOk.setText("Ok");
        jButtonOk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonOkFocusLost(evt);
            }
        });
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 70, 30));

        jCancel.setBackground(new java.awt.Color(153, 255, 153));
        jCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });
        jPanelNewUser.add(jCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 80, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 51));
        jLabel29.setText("Custoemr  ID");
        jPanelNewUser.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 27));
        jPanelNewUser.add(jTextCategoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 249, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:

        JFileChooser jf1 = new JFileChooser();
        jf1.showOpenDialog(null);
        File f = jf1.getSelectedFile();
        String filename = f.getPath();
        ImageIcon img1 = new ImageIcon(filename);
        jImgLbl.setIcon(img1);
        jTextImage.setText(filename);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonOkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonOkFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonOkFocusLost

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
        try {

            String code = jTextCode.getText();
            String name = jTextName.getText();
            String image = jTextImage.getText();

            conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();

            String Category_id = jTextCategoryID.getText();

            boolean l_blnQuotes = true;
            String l_strRole = "";
            String l_strStore = "";

            String l_strQuery = "Update " + Constants.DB_NAME + ".dq_categories set"
                    + " code="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextCode.getText()).trim(), l_blnQuotes)
                    + ",name="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextName.getText()).trim(), l_blnQuotes)
                    + ",image="
                    + SDCommonUtil.convertBlankToNull(SDCommonUtil.checkEscapeSequenceCharacter(jTextImage.getText()).trim(), l_blnQuotes)
                    + " where id ="
                    + Category_id;
            int res = l_objStatement.executeUpdate(l_strQuery);

            if (res == 1) {
                JOptionPane.showMessageDialog(this, "Category Updated Sucessfully");

                jTextCode.setText(" ");
                jTextName.setText(" ");
                jTextImage.setText(" ");

                dispose();

                CategoryHome ph = new CategoryHome();

                ph.setVisible(true);

                ph.jTextCategoryname.setText(name);
                ph.jTextCategoryname.setEnabled(false);

                conn.setAutoCommit(true);

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CategoryHome().setVisible(true);
    }//GEN-LAST:event_jCancelActionPerformed

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
            java.util.logging.Logger.getLogger(EditCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCategory().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jCancel;
    private javax.swing.JLabel jImgLbl;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel21;
    public javax.swing.JPanel jPanelNewUser;
    public javax.swing.JTextField jTextCategoryID;
    public javax.swing.JTextField jTextCode;
    public javax.swing.JTextField jTextImage;
    public javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
