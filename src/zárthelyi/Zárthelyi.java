/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zárthelyi;

/**
 *
 * @author Dóri
 */
public class Zárthelyi implements Comparable<Zárthelyi> {
    private String név;
    private int pont;

    public Zárthelyi() {
    }

    public Zárthelyi(String név, int kor) {
        this.név = név;
        this.pont = kor;
    }

    public String getNév() {
        return név;
    }

    public int getPont() {
        return pont;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return név + ": " + pont + " pont";
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Zárthelyi))
            return false;
        Zárthelyi zh=(Zárthelyi) obj;
        return this.név.equals(zh.getNév());
    }

    @Override
    public int compareTo(Zárthelyi o) {
        if(this.pont==o.getPont()){
            return this.név.compareTo(o.getNév());
        }else{
            return (-1)*Integer.compare(this.pont,o.getPont());
        }
    }

    
    
    
}
