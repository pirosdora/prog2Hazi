/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.util.Objects;

/**
 *
 * @author Dóri
 */
public class CégesAdatok implements Comparable<CégesAdatok> {
    private String cégnév;
    private String telephely;
    private int év;
    private int éves_árbevétel;

    public CégesAdatok() {
    }
    

    public CégesAdatok(String cégnév, String telephely, int év, int éves_árbevétel) {
        this.cégnév = cégnév;
        this.telephely = telephely;
        this.év = év;
        this.éves_árbevétel = éves_árbevétel;
    }

    public String getCégnév() {
        return cégnév;
    }

    public String getTelephely() {
        return telephely;
    }

    public int getÉv() {
        return év;
    }

    public int getÉves_árbevétel() {
        return éves_árbevétel;
    }

    public void setCégnév(String cégnév) {
        this.cégnév = cégnév;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public void setÉves_árbevétel(int éves_árbevétel) {
        this.éves_árbevétel = éves_árbevétel;
    }
    

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append(this.cégnév);
       sb.append("(").append(this.telephely).append("): ").append(this.éves_árbevétel);
       return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj==null)||!(obj instanceof CégesAdatok))
        return false;
        
        CégesAdatok cég=(CégesAdatok) obj;
        return this.cégnév.equals(cég.getCégnév())&& this.telephely.equals(cég.getTelephely());
    }

    @Override
    public int compareTo(CégesAdatok o) {
        
         if(this.éves_árbevétel==o.getÉves_árbevétel()){
             
             if(){
                 return this.cégnév.compareTo(o.getCégnév());
             }else{
                 
             }
         }else{
             return (-1)*Integer.compare(this.éves_árbevétel, o.getÉves_árbevétel());
         }
    }
    
    
}
