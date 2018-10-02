
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;
    
    public Ital(String név, String kiszerelés){
        this.név=név;
        this.kiszerelés=kiszerelés;
        this.gyártásiDátum=new Date();
    }
    
    public String getNév(){
        return név;
    }
    public String getKiszerelés(){
        return kiszerelés;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }
    public static int getÁr(){
        return ár;
    }
   
    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return this.név+", "+this.kiszerelés+", "+ár+"Ft";
        
    }
    
    public static double getÁrEuróban(double euro){
        return ár/euro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(Ital.ár, Ital.ár)) {
            return false;
        }
        return true;
    }
      
    
}
