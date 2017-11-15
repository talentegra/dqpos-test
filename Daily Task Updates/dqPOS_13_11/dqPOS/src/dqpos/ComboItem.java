/*(
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqpos;

/**
 *
 * @author camp
 */
public class ComboItem {

    private int Gid;
    private String Gname;

    public ComboItem(int Gid, String Gname) {
        this.Gid = Gid;
        this.Gname = Gname;
         }

    public int getGid() {

        return Gid;
    }
    public void setGid(int Gid) {

       this.Gid = Gid;
    }
    
     public String getGname() {

        return Gname;
    }
    public void setGname(String Gname) {

       this.Gname = Gname;
    }
    
    

}
