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
import javax.swing.JTabbedPane;

/**
 *
 * @author camp
 */
public class CustomerHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     *
     */
    public CustomerHome() {

        initComponents();

        //  jTabbedPanelCustomers.setVisible(false);
        JTabbedPane jTabbedPane1 = new JTabbedPane();
        addTabbedPane();
        showDate();
        BindCombogroup();
        BindCombostatus();
        BindCombostore();
        Show_User_in_Table();

    }

    public ArrayList<Customer> customerList() {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        try {

            Connection conn = DBConnect.getConnection();

            Statement st;
            ResultSet rs;
            String sql = "select name from dq_customers where deleteflag_cm='N'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Customer customer;
            while (rs.next()) {

                customer = new Customer(rs.getString("name"));
                customerList.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public void Show_User_in_Table() {
        ArrayList<Customer> list = customerList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[1];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getFirstName();
            model.addRow(row);

        }

    }
//    public void ListCustomer() {
//        try {
//            conn = DBConnect.getConnection();
//            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
//            PreparedStatement ps = conn.prepareStatement("select name,phone,email,cf1,cf2 from dq_customers");
//            ResultSet rs = ps.executeQuery();
//
//            int x = 0;
//            while (rs.next()) {
//
//                dtm.setValueAt(rs.getString(1), x, 0);
//                dtm.setValueAt(rs.getString(2), x, 1);
//                dtm.setValueAt(rs.getString(3), x, 2);
//                dtm.setValueAt(rs.getString(4), x, 3);
//                dtm.setValueAt(rs.getString(5), x, 4);
//
//                x++;
//                System.out.println();
//
//            }
//
//            System.out.println("-------------------------------------------------");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

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
        Customerbg = new javax.swing.JPanel();
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
        jTabbedPanelCustomers = new javax.swing.JTabbedPane();
        jPanelCustomer = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jPanelHome = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jSearch = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
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
        jButton17 = new javax.swing.JButton();
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

        Customerbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        Customerbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Customerbg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 810));

        jLabel1.setText("jLabel1");
        Customerbg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -70, -1, -1));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Customerbg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, 30));

        jTabbedPanelCustomers.setForeground(new java.awt.Color(51, 204, 0));
        jTabbedPanelCustomers.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPanelCustomers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanelCustomer.setBackground(new java.awt.Color(206, 239, 221));
        jPanelCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));

        jSeparator11.setBackground(new java.awt.Color(51, 153, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Existing Customers:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Customers");

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
                "FirstName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextFieldSearch.setText("Type to search Customer(s)");
        jTextFieldSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jTextFieldSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSearchMouseClicked(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(153, 255, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setText("New");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(153, 255, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setText("Edit");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(153, 255, 153));
        jDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jPanelHome.setBackground(new java.awt.Color(223, 235, 223));
        jPanelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        jPanelHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelHomeFocusGained(evt);
            }
        });
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("Name");
        jPanelHome.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 27));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 51));
        jLabel25.setText("Email Address");
        jPanelHome.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 27));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 51));
        jLabel30.setText("Phone");
        jPanelHome.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 175, 80, 27));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 0, 51));
        jLabel28.setText("Customer Custom Field1");
        jPanelHome.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 239, 150, 27));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 51));
        jLabel31.setText("Customer Custom Field2");
        jPanelHome.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 292, 140, 27));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("Store");
        jPanelHome.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, 27));
        jPanelHome.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 249, 34));
        jPanelHome.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 249, 34));
        jPanelHome.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 249, 34));
        jPanelHome.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 249, 34));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Store" }));
        jPanelHome.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 249, 35));

        jButton26.setBackground(new java.awt.Color(153, 255, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("Save");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanelHome.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 70, 30));

        jButton27.setBackground(new java.awt.Color(153, 255, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelHome.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 80, 30));
        jPanelHome.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 249, 34));

        jSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/search1.jpg"))); // NOI18N
        jSearch.setToolTipText("User");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator12)
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton22)
                                .addGap(30, 30, 30)
                                .addComponent(jButton23)
                                .addGap(30, 30, 30)
                                .addComponent(jDelete))
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearch))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22)
                            .addComponent(jButton23)
                            .addComponent(jDelete)))
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPanelCustomers.addTab("Customers", jPanelCustomer);

        Customerbg.add(jTabbedPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 990, 810));

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

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dqpos/images/category.jpg"))); // NOI18N
        jButton17.setToolTipText("Category");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 30));

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
            .addComponent(Customerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Customerbg, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
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
        new CustomerHome().setVisible(true);
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

            jTabbedPanelCustomers.setVisible(true);
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

        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:

        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:

        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jMenuItem13ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuItem13ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ComponentRemoved

    private void jProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductActionPerformed
        // TODO add your handling code here:

       if (evt.getSource() == jProduct) {

            ProductHome H1 = new ProductHome();
            H1.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jProductActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Customerbg.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
      //  dispose();
        new NewCustomer().setVisible(true);


    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

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

            Connection conn = DBConnect.getConnection();
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

                conn.setAutoCommit(true);

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jPanelHomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelHomeFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_jPanelHomeFocusGained

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:

      //  dispose();
        try {

            Connection conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();
            String fname1 = jTextField2.getText();

            String l_strQuery1 = "Select id from dq_customers where deleteflag_cm='N' and name="
                    + "'" + fname1 + "'";
            ResultSet l_objResultSet = l_objStatement.executeQuery(l_strQuery1);

            EditCustomer EC = new EditCustomer();
            EC.setVisible(true);

            if (l_objResultSet != null) {
                while (l_objResultSet.next()) {

                    EC.jTextCustomerID.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("id"), false));

                }
            }

            String name = jTextField2.getText();
            String email = jTextField1.getText();
            String phone = jTextField9.getText();
            String ccf1 = jTextField8.getText();
            String ccf2 = jTextField4.getText();
            String store_id = jComboBox4.getSelectedItem().toString();

            //  dispose();
            EC.jTextField2.setText(name);
            EC.jTextField1.setText(email);
            EC.jTextField9.setText(phone);
            EC.jTextField8.setText(ccf1);
            EC.jTextField4.setText(ccf2);
            EC.jComboBox4.setSelectedItem(store_id);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        model.removeRow(row);

        try {
            String fname = jTextField2.getText();
            Connection conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            String l_strQuery = "Update " + Constants.DB_NAME + ".dq_customers  set deleteflag_cm='Y'where name="
                    + "'" + fname + "'";
            int l_intResult = l_objStatement.executeUpdate(l_strQuery);
            if (l_intResult == 1) {

                JOptionPane.showMessageDialog(this, "Customer deleted Successfully ");
                jTextField2.setText("");
                jTextField1.setText("");
                jTextField9.setText("");
                jTextField8.setText("");
                jTextField4.setText("");
                jComboBox4.setSelectedItem("");

            } else {
                JOptionPane.showMessageDialog(this, "Customer is not in List");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        String fname = jTable1.getModel().getValueAt(row, 0).toString();

        try {
            Connection conn = DBConnect.getConnection();
            conn.setAutoCommit(true);

            Statement l_objStatement1 = conn.createStatement();
            String l_strQuery1 = "select * from " + Constants.DB_NAME + ".dq_customers where name="
                    + "'" + fname + "'";
            PreparedStatement pst = conn.prepareStatement(l_strQuery1);
            String l_strGroup = "";

            ResultSet l_objResultSet = pst.executeQuery(l_strQuery1);

            if (l_objResultSet != null) {
                while (l_objResultSet.next()) {

                    jTextField2.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("name"), false));
                    jTextField1.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("email"), false));
                    jTextField9.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("phone"), false));
                    jTextField8.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf1"), false));
                    jTextField4.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf2"), false));
                    jComboBox4.setSelectedItem(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "id", "name", SDCommonUtil.convertNullToBlank(l_objResultSet.getString("store_id"), false), false));

                }

                //  JOptionPane.showMessageDialog(this, "Update User Record ");
            } else {
                // JOptionPane.showMessageDialog(this, "Failed");
            }
            l_objResultSet.close();
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = DBConnect.getConnection();
            Statement l_objStatement = conn.createStatement();
            Statement l_objStatement1 = conn.createStatement();

            String l_strQuery = "select * from " + Constants.DB_NAME + ".dq_customers where deleteflag_cm='N' and name like '" + jTextFieldSearch.getText() + "%'";
            ResultSet l_objResultSet = l_objStatement.executeQuery(l_strQuery);

            if (l_objResultSet != null) {
                while (l_objResultSet.next()) {

                    jTextField2.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("name"), false));
                    jTextField1.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("email"), false));
                    jTextField9.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("phone"), false));
                    jTextField8.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf1"), false));
                    jTextField4.setText(SDCommonUtil.convertNullToBlank(l_objResultSet.getString("cf2"), false));
                    jComboBox4.setSelectedItem(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, Constants.DB_NAME + ".dq_stores", "id", "name", SDCommonUtil.convertNullToBlank(l_objResultSet.getString("store_id"), false), false));
                }
                JOptionPane.showMessageDialog(this, "Customer Record ");
            } else {
                JOptionPane.showMessageDialog(this, "Customer is deleted");
            }
            l_objResultSet.close();
            l_objStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jSearchActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSearchMouseClicked
        // TODO add your handling code here:
        jTextFieldSearch.setText("");
    }//GEN-LAST:event_jTextFieldSearchMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHome().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Customerbg;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JButton jCustomer;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPanelCustomers;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JButton jUser;
    // End of variables declaration//GEN-END:variables
}
