/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

/**
 *
 * @author camp
 */
public class ComboItem2 {
    private int Storeid;
    private String Storename;

    public ComboItem2(int Storeid, String Storename) {
        this.Storeid = Storeid;
        this.Storename = Storename;
         }

    public int getStoreid() {

        return Storeid;
    }
    public void setStoreid(int Storeid) {

       this.Storeid= Storeid;
    }
    
     public String getStorename() {

        return Storename;
    }
    public void setStorename(String Storename) {

       this.Storename = Storename;
    }
    
    
 
    
}
