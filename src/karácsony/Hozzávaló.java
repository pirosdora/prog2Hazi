/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karácsony;

import java.util.Objects;

/**
 *
 * @author Dóri
 */
public class Hozzávaló implements Comparable<Hozzávaló> {
    private String hozzavalo;
    private int mennyi;

    public Hozzávaló() {
    }
    
    

    public Hozzávaló(String hozzavalo) {
        this.hozzavalo = hozzavalo;
        this.mennyi = mennyi;
    }

    public Hozzávaló(String hozzavalo, int mennyi) {
        this.hozzavalo = hozzavalo;
        this.mennyi = mennyi;
    }


    public String getHozzavalo() {
        return hozzavalo;
    }

    public int getMennyi() {
        return mennyi;
    }

    public void setHozzavalo(String hozzavalo) {
        this.hozzavalo = hozzavalo;
    }

    public void setMennyi(int mennyi) {
        this.mennyi = mennyi;
    }

    @Override
    public String toString() {
        return  hozzavalo + ";" + mennyi;
    }

    @Override
    public int compareTo(Hozzávaló o) {
        if(this.mennyi==o.getMennyi()){
            return this.hozzavalo.compareTo(o.getHozzavalo());
        }
        else{
            return (-1)*Integer.compare(this.getMennyi(), o.getMennyi());
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj==null||!(obj instanceof Hozzávaló))
            return false;
        Hozzávaló h=(Hozzávaló) obj;
        return this.hozzavalo.equals(h.getHozzavalo());
    }

    
    
}
