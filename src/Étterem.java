/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Étterem extends VendéglátóipariEgység {
    private String[] étlap;

    public Étterem(String[] étlap, String név, int férőhelyekSzáma) {
        super(név, férőhelyekSzáma,false);
        this.étlap = étlap;
        
    }
    
    

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "\u00c9tterem{" + "\u00e9tlap=" + étlap + '}';
    }
      
    
}
