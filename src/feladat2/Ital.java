/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

import java.util.Objects;

/**
 *
 * @author Dóri
 */
public class Ital implements Comparable<Ital> {
   protected String név;
   protected String kiszerelés;
   protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név+", "+kiszerelés+", "+ár+" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Ital))
            return false;
        Ital t=(Ital) obj;
        return this.név.equals(t.getNév()) && this.kiszerelés.equals(t.getKiszerelés());
    }

    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.getÁr(), o.getÁr());
    }

   
}
