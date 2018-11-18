/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztálypénz;

import java.util.Objects;

/**
 *
 * @author Dóri
 */
public class Osztálypénz implements Comparable<Osztálypénz> {
    private String név;
    private int pénz;

    public Osztálypénz() {
    }
    
    

    public Osztálypénz(String név, int pénz) {
        this.név = név;
        this.pénz = pénz;
    }

    public String getNév() {
        return név;
    }

    public int getPénz() {
        return pénz;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setPénz(int pénz) {
        this.pénz = pénz;
    }

    @Override
    public String toString() {
        return    név + ";" + pénz;
    }

    @Override
    public int compareTo(Osztálypénz o) {
      if(this.pénz==o.getPénz()){
          return this.név.compareTo(o.getNév());
      }else{
          return (-1)*Integer.compare(this.pénz, o.getPénz());
      }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Osztálypénz))
            return false;
        Osztálypénz op=(Osztálypénz) obj;
        return this.pénz==op.getPénz();
    }
    
    
    
}
