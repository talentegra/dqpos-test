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
public class ComboItem1 {
    private int Statusid;
    private String Statusname;

    public ComboItem1(int Statusid, String Statusname) {
        this.Statusid = Statusid;
        this.Statusname = Statusname;
         }

    public int getStatusid() {

        return Statusid;
    }
    public void setStatusid(int Statusid) {

       this.Statusid= Statusid;
    }
    
     public String getStatusname() {

        return Statusname;
    }
    public void setStatusname(String Statusname) {

       this.Statusname = Statusname;
    }
    
    
 
    
}
