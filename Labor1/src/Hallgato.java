/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgato  {
    String név;
    String nkód;
    int évfolyam;
    double átlag;

    public Hallgato(String név, String nkód, int évfolyam, double átlag) {
        this.név = név;
        this.nkód = nkód;
        this.évfolyam = évfolyam;
        this.átlag = átlag;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getNkód() {
        return nkód;
    }

    public void setNkód(String nkód) {
        this.nkód = nkód;
    }

    public int getÉvfolyam() {
        return évfolyam;
    }

    public void setÉvfolyam(int évfolyam) {
        this.évfolyam = évfolyam;
    }

    public double getÁtlag() {
        return átlag;
    }

    public void setÁtlag(double átlag) {
        this.átlag = átlag;
    }
    
    public void koszon(Hallgato h){
        System.out.println("Szia "+h.getNév());
            
    }
}
