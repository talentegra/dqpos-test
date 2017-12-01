/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;

/**
 *
 * @author camp
 */
public class ProductHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     *
     */
    public ProductHome() {

        initComponents();

        addTabbedPane();
        showDate();
        Show_Product_in_Table();
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
//        jComboBoxType.setEnabled(false);
//        jComboBarcode.setEnabled(false);
//        jComboBoxCategory.setEnabled(false);
//        jComboBoxTax.setEnabled(false);

    }

    public void Show_Product_in_Table() {
        ArrayList<Product> list = productList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[1];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getName();
            model.addRow(row);

        }

    }

    public ArrayList<Product> productList() {

        ArrayList<Product> productList = new ArrayList<Product>();

        try {

            Connection conn = DBConnect.getConnection();

            Statement st;
            ResultSet rs;
            String sql = "select name from dq_products where deleteflag_pm='N'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Product product;
            while (rs.next()) {

                product = new Product(rs.getString("name"));
                productList.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public ArrayList<Product> searchList() {

        ArrayList<Product> searchList = new ArrayList<Product>();

        try {

            Connection conn = DBConnect.getConnection();
            Statement st;
            ResultSet rs;
            String sql = "select name from dq_products where deleteflag_pm='N' and name like '" + jTextFieldSearch.getText() + "%'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Product product;

            while (rs.next()) {

                product = new Product(rs.getString("name"));
                searchList.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchList;
    }

    public void Show_SearchProduct_in_Table() {

        ArrayList<Product> list1 = searchList();
        String name = jTextFieldSearch.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[1];

        for (int i = 0; i < list1.size(); i++) {
            row[0] = list1.get(i).getName();
            model.addRow(row);

        }
        if (row[0] == null) {

            JOptionPane.showMessageDialog(this, "No Product is Defined");
        }

    }

    void showDate() {

        Date currentDate = new Date();
        // SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        String dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("Date Format using getDateTimeInstance(): " + dateToStr);
        dateLbl.setText(dateToStr);
    }

    private void addTabbedPane() {
        // Create ClosableTabbedPane and override the tabAboutToClose

        ClosableTabbedPane jTabbedPane1 = new ClosableTabbedPane() {

            public boolean tabAboutToClose(int tabIndex) {
                //  String tab = tabbedPane.getTabTitleAt(tabIndex);
                int choice = JOptionPane.showConfirmDialog(null,
                        "You are about to close \n Do you want to proceed ?",
                        "Confirmation Dialog", JOptionPane.INFORMATION_MESSAGE);
                return choice == 0; // if returned false tab closing will be
                // canceled
            }
        };
        getContentPane().add(jTabbedPane1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Productbg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTabbedPanelProduct = new javax.swing.JTabbedPane();
        jPanelCustomer = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextProductname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDelete = new javax.swing.JButton();
        jSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dateLbl = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jCustomer = new javax.swing.JButton();
        jUser = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jCategory = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jProduct = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("dqPOS ");

        Productbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        Productbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(51, 51, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/dashb.png"))); // NOI18N

        jButton9.setText("Dashboard");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 6, 130, 60);

        jPanel7.setBackground(new java.awt.Color(51, 51, 0));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/pos.png"))); // NOI18N
        jLabel5.setToolTipText("POS");

        jButton10.setText("POS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton10))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 71, 150, 61);

        jPanel8.setBackground(new java.awt.Color(51, 51, 0));

        jButton8.setText("Product");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/product.png"))); // NOI18N
        jLabel26.setToolTipText("Product");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(9, 137, 130, 40);

        jPanel9.setBackground(new java.awt.Color(51, 51, 0));

        jButton7.setText("Categories");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/category.jpg"))); // NOI18N
        jLabel27.setToolTipText("Product");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(4, 203, 120, 30);

        jPanel10.setBackground(new java.awt.Color(51, 51, 0));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/sales.png"))); // NOI18N
        jLabel8.setToolTipText("Sales");

        jButton6.setText("Sales");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton6))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10);
        jPanel10.setBounds(8, 250, 110, 50);

        jPanel11.setBackground(new java.awt.Color(51, 51, 0));
        jPanel11.setToolTipText("");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/purchase.png"))); // NOI18N
        jLabel9.setToolTipText("Purchase");

        jButton1.setText("Purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(0, 320, 130, 40);

        jPanel12.setBackground(new java.awt.Color(51, 51, 0));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/gift.png"))); // NOI18N
        jLabel10.setToolTipText("Gift Card");

        jButton3.setText("Gift Card");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12);
        jPanel12.setBounds(0, 370, 130, 40);

        jPanel14.setBackground(new java.awt.Color(51, 51, 0));

        jButton5.setText("Settings");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/setting.png"))); // NOI18N
        jLabel7.setToolTipText("settings");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton5))
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(0, 420, 130, 50);

        jPanel15.setBackground(new java.awt.Color(51, 51, 0));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/report.png"))); // NOI18N
        jLabel13.setToolTipText("Reports");

        jButton2.setText("Reports");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15);
        jPanel15.setBounds(0, 470, 130, 50);

        Productbg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 810));

        jLabel1.setText("jLabel1");
        Productbg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -70, -1, -1));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Productbg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, 30));

        jTabbedPanelProduct.setForeground(new java.awt.Color(51, 204, 0));
        jTabbedPanelProduct.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPanelProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanelCustomer.setBackground(new java.awt.Color(206, 239, 221));
        jPanelCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));

        jPanelHome.setBackground(new java.awt.Color(223, 235, 223));
        jPanelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        jPanelHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelHomeFocusGained(evt);
            }
        });
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 51));
        jLabel29.setText("Product");
        jPanelHome.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 27));

        jTextProductname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanelHome.add(jTextProductname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 260, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r1.setSelected(true);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        r1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                r1KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("New");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 100, 40));

        jButtonUpdate.setBackground(new java.awt.Color(153, 255, 153));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanelHome.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Existing Products");
        jPanelHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 144, 27));

        jDelete.setBackground(new java.awt.Color(153, 255, 153));
        jDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jPanelHome.add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/search1.jpg"))); // NOI18N
        jSearch.setToolTipText("User");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });
        jPanelHome.add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 40, -1));

        jTextFieldSearch.setText("Type to search Customer(s)");
        jTextFieldSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jTextFieldSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSearchMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldSearchMouseReleased(evt);
            }
        });
        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyTyped(evt);
            }
        });
        jPanelHome.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 390, 31));

        jPanel4.setBackground(new java.awt.Color(51, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 148, 430, 500));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Products");
        jPanelHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 93, 27));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelHome.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 80, 30));

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanelProduct.addTab("Products", jPanelCustomer);

        Productbg.add(jTabbedPanelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 990, 810));

        jPanel26.setBackground(new java.awt.Color(204, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLbl.setBackground(new java.awt.Color(204, 255, 0));
        dateLbl.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 24, 189, 29));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/search.png"))); // NOI18N
        jButton11.setToolTipText("Search Invoice");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 30));

        jCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/customers.png"))); // NOI18N
        jCustomer.setToolTipText("Customer");
        jCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(jCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));

        jUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/admin.png"))); // NOI18N
        jUser.setToolTipText("User");
        jUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserActionPerformed(evt);
            }
        });
        jPanel1.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/invoice.png"))); // NOI18N
        jButton14.setToolTipText("Create Invoice");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/payments.png"))); // NOI18N
        jButton15.setToolTipText("Receive Payments");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 30, 30));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/pos.png"))); // NOI18N
        jButton16.setToolTipText("Search Payments");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 30));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, 30));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 30));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 10, 10, 30));

        jCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/category.jpg"))); // NOI18N
        jCategory.setToolTipText("Category");
        jCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(jCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 30));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, 30));

        jProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/product.jpg"))); // NOI18N
        jProduct.setToolTipText("Product");
        jProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductActionPerformed(evt);
            }
        });
        jPanel1.add(jProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 30));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/report.png"))); // NOI18N
        jButton19.setToolTipText("Reports");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 30));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/setting.png"))); // NOI18N
        jButton20.setToolTipText("Settings");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setAlignmentX(15.0F);
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jMenu1.setText("File        ");
        jMenu1.setAlignmentX(0.0F);
        jMenu1.setAlignmentY(0.0F);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/year.png"))); // NOI18N
        jMenuItem2.setText("Create Financial Year");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/open.png"))); // NOI18N
        jMenuItem4.setText("Open Financial Year");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/delete.png"))); // NOI18N
        jMenuItem5.setText("Close Financial Year");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/close.png"))); // NOI18N
        jMenuItem6.setText("Delete Financial Year");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        jMenu11.setForeground(new java.awt.Color(51, 204, 0));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/product.jpg"))); // NOI18N
        jMenu11.setText("Products");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem26.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/add.png"))); // NOI18N
        jMenuItem26.setText("Add Product");
        jMenu11.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem27.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/update.png"))); // NOI18N
        jMenuItem27.setText("Update Product");
        jMenu11.add(jMenuItem27);

        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem28.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/close.png"))); // NOI18N
        jMenuItem28.setText("Delete Product");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem28);

        jMenu1.add(jMenu11);

        jMenu12.setForeground(new java.awt.Color(51, 204, 0));
        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/category.jpg"))); // NOI18N
        jMenu12.setText("Category");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/add.png"))); // NOI18N
        jMenuItem7.setText("Add  Category");
        jMenu12.add(jMenuItem7);

        jMenuItem29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem29.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/update.png"))); // NOI18N
        jMenuItem29.setText("Update Category");
        jMenu12.add(jMenuItem29);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/close.png"))); // NOI18N
        jMenuItem8.setText("Delete Category");
        jMenu12.add(jMenuItem8);

        jMenu1.add(jMenu12);
        jMenu1.add(jSeparator3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/exit.png"))); // NOI18N
        jMenuItem9.setText("Exit");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Invoice         ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/invoice.png"))); // NOI18N
        jMenuItem10.setText("Create Invoice ");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/search.png"))); // NOI18N
        jMenuItem11.setText("Search  Invoice");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);
        jMenu2.add(jSeparator5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Payments             ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/payments.png"))); // NOI18N
        jMenuItem12.setText("Receive Payment");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/pos.png"))); // NOI18N
        jMenuItem13.setText("Search Payment");
        jMenuItem13.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jMenuItem13ComponentRemoved(evt);
            }
        });
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText(" Customers        ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu9.setForeground(new java.awt.Color(51, 204, 0));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/customers.png"))); // NOI18N
        jMenu9.setText("Customers");

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem20.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/add.png"))); // NOI18N
        jMenuItem20.setText("Add Customer");
        jMenu9.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/update.png"))); // NOI18N
        jMenuItem21.setText("Update Customer");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem21);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem22.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/close.png"))); // NOI18N
        jMenuItem22.setText("Delete Customer");
        jMenu9.add(jMenuItem22);

        jMenu4.add(jMenu9);

        jMenu10.setForeground(new java.awt.Color(51, 204, 0));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/admin.png"))); // NOI18N
        jMenu10.setText("Users");

        jMenuItem23.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/add.png"))); // NOI18N
        jMenuItem23.setText("Add User");
        jMenu10.add(jMenuItem23);

        jMenuItem24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem24.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/update.png"))); // NOI18N
        jMenuItem24.setText("Update User");
        jMenu10.add(jMenuItem24);

        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem25.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/close.png"))); // NOI18N
        jMenuItem25.setText("Delete User");
        jMenu10.add(jMenuItem25);

        jMenu4.add(jMenu10);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/customers.png"))); // NOI18N
        jMenuItem15.setText("Customer Account");
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Maintenance       ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/sales.png"))); // NOI18N
        jMenuItem16.setText("Sales");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/purchase.png"))); // NOI18N
        jMenuItem17.setText("Purchase");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);
        jMenu5.add(jSeparator4);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem18.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/gift.png"))); // NOI18N
        jMenuItem18.setText("Gift Card");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/setting.png"))); // NOI18N
        jMenuItem19.setText("Setings");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu8.setText("Reports");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/help.png"))); // NOI18N
        jMenuItem14.setText("Help");
        jMenu8.add(jMenuItem14);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Productbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Productbg, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new AddProduct().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new AddCategory().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new ProductHome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomerActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == jCustomer) {
            CustomerHome H1 = new CustomerHome();
            H1.setVisible(true);
            dispose();

        }


    }//GEN-LAST:event_jCustomerActionPerformed

    private void jUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == jUser) {

            Home1 H1 = new Home1();
            H1.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jUserActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:

        Productbg.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:

        Productbg.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Productbg.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Productbg.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoryActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == jCategory) {

            CategoryHome CH = new CategoryHome();
            CH.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_jCategoryActionPerformed

    private void jMenuItem13ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuItem13ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ComponentRemoved

    private void jProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == jProduct) {

            jTabbedPanelProduct.setVisible(true);
        }

    }//GEN-LAST:event_jProductActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Productbg.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Name"}));
        Show_SearchProduct_in_Table();

    }//GEN-LAST:event_jSearchActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        model.removeRow(row);

        try {
            String fname = jTextProductname.getText();
            Connection conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            String l_strQuery = "Update " + Constants.DB_NAME + ".dq_products set deleteflag_pm='Y' where name="
                    + "'" + fname + "'";
            int l_intResult = l_objStatement.executeUpdate(l_strQuery);

            if (l_intResult == 1) {

                JOptionPane.showMessageDialog(this, "Product deleted Successfully ");
                jTextProductname.setText("");

                //   jComboBox4.setSelectedItem("");
            } else {
                JOptionPane.showMessageDialog(this, "Product record is already deleted");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        jTextProductname.setEnabled(true); 
        EditProduct EP = new EditProduct();
        EP.setVisible(true);
        
        try {

            Connection conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();
            String name1 = jTextProductname.getText();

            String l_strQuery1 = "Select * from dq_products where deleteflag_pm='N' and name="
                    + "'" + name1 + "'";
            ResultSet l_objResultSet = l_objStatement.executeQuery(l_strQuery1);

            if (l_objResultSet != null) {
                while (l_objResultSet.next()) {

                    EP.jTextProductID.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("id"), false));
                    EP.jTextFieldCode.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("code"), false));
                    EP.jTextFieldName.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("name"), false));
                    EP.jComboBoxCategory.setSelectedItem(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_categories", "id", "code", SDCommonUtil.convertNullToBlank(l_objResultSet.getString("category_id"), false), false));
                    EP.jTextFieldPrice.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("price"), false));
                    EP.jTextFieldImage.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("image"), false));
                    EP.jTextFieldProdTax.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("tax"), false));
                    EP.jTextFieldCost.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cost"), false));
                    EP.jComboBoxTax.setSelectedItem(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("tax_method"), false));
                    EP.jTextFieldQuantity.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("quantity"), false));
                    EP.jComboBarcode.setSelectedItem(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("barcode_symbology"), false));
                    EP.jComboBoxType.setSelectedItem(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("type"), false));
                    EP.jTextArea1.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("details"), false));
                    EP.jTextFieldAlertQty.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("alert_quantity"), false));
                     dispose();
                }
            }
            l_objResultSet.close();
            l_objStatement1.close();
            conn.close();

            //dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
      

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSearchMouseClicked
        // TODO add your handling code here:
        jTextFieldSearch.setText("");
    }//GEN-LAST:event_jTextFieldSearchMouseClicked

    private void jPanelHomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelHomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelHomeFocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        String name = jTable1.getModel().getValueAt(row, 0).toString();

        try {
            Connection conn = DBConnect.getConnection();
            conn.setAutoCommit(true);

            Statement l_objStatement1 = conn.createStatement();
            String l_strQuery1 = "select * from " + Constants.DB_NAME + ".dq_products where name="
                    + "'" + name + "'";
            // PreparedStatement pst = conn.prepareStatement(l_strQuery1);

            ResultSet l_objResultSet = l_objStatement1.executeQuery(l_strQuery1);

            if (l_objResultSet != null) {
                while (l_objResultSet.next()) {

                    jTextProductname.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("name"), false));
//                    jTextField9.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("phone"), false));
//                    jTextField8.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf1"), false));
//                    jTextField4.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf2"), false));
//                    jComboBox4.setSelectedItem(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "id", "name", SDCommonUtil.convertNullToBlank(l_objResultSet.getString("store_id"), false), false));
                }

                //  JOptionPane.showMessageDialog(this, "Update User Record ");
            } else {
                // JOptionPane.showMessageDialog(this, "Failed");
            }
            l_objResultSet.close();
            l_objStatement1.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void r1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_r1KeyPressed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:

        if (r1.isSelected()) {
            new NewProduct().setVisible(true);
        }
        dispose();

    }//GEN-LAST:event_r1ActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jTextFieldSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSearchMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldSearchMouseReleased

    private void jTextFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyTyped
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Name"}));
        Show_Product_in_Table();
    }//GEN-LAST:event_jTextFieldSearchKeyTyped

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
            java.util.logging.Logger.getLogger(ProductHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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

                ProductHome ph = new ProductHome();
                ph.setVisible(true);
                ph.setDefaultCloseOperation(Home1.EXIT_ON_CLOSE);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Productbg;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jCategory;
    private javax.swing.JButton jCustomer;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCustomer;
    public javax.swing.JPanel jPanelHome;
    private javax.swing.JButton jProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPanelProduct;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    public javax.swing.JTextField jTextProductname;
    private javax.swing.JButton jUser;
    private javax.swing.JRadioButton r1;
    // End of variables declaration//GEN-END:variables
}
