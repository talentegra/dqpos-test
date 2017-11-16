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
public class ComboCategory {

    private int Cateid;
    private String Catename;

    public ComboCategory(int Cateid, String Catename) {
        
        this.Cateid = Cateid;
        this.Catename = Catename;
    }

    public int getCateid() {

        return Cateid;
    }

    public void setCateid(int Typeid) {

        this.Cateid = Cateid;
    }

    public String getCatename() {

        return Catename;
    }

    public void setTypename(String Typename) {

        this.Catename = Catename;
    }

}
