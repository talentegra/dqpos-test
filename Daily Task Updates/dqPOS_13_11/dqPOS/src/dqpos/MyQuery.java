/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author camp
 */
public class MyQuery {

    public HashMap<String, Integer> populateCombo() throws Exception {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        try {

            String sql = "select id,name from dq_groups";
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ComboItem cmi;

            while (rs.next()) {

                cmi = new ComboItem(rs.getInt(1), rs.getString(2));
                map.put(cmi.getGname(), cmi.getGid());
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return map;
    }
     public HashMap<String, Integer> populateCombo1() throws Exception {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try {

            String sql = "select id,name from dq_status";
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ComboItem1 cmi;

            while (rs.next()) {

                cmi = new ComboItem1(rs.getInt(1), rs.getString(2));
                map.put(cmi.getStatusname(), cmi.getStatusid());
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return map;
    }
     
     public HashMap<String, Integer> populateCombo2() throws Exception {
        
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        try {

            String sql = "select id,name from dq_stores";
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ComboItem2 cmi;

            while (rs.next()) {

                cmi = new ComboItem2(rs.getInt(1), rs.getString(2));
                map1.put(cmi.getStorename(), cmi.getStoreid());
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return map1;
    }
     
     public HashMap<String, Integer> populateComboCategory() throws Exception {
        
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        try {

            String sql = "select id,code from dq_categories";
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ComboCategory cmi;

            while (rs.next()) {

                cmi = new ComboCategory(rs.getInt(1), rs.getString(2));
                map1.put(cmi.getCatename(), cmi.getCateid());
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return map1;
    }
     
     
}
