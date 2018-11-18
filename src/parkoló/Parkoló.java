/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkoló;

/**
 *
 * @author Dóri
 */
public class Parkoló implements Comparable<Parkoló> {
    private String cím;
    private double terület;
    private int kapacitás;
    private String rendszám;

    public Parkoló() {
    }

    public Parkoló(String cím, double terület, int kapacitás) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
    }

    public Parkoló(String cím, double terület, int kapacitás, String rendszám) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
        this.rendszám = rendszám;
    }

    public String getCím() {
        return cím;
    }

    public double getTerület() {
        return terület;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public String getRendszám() {
        return rendszám;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public void setTerület(double terület) {
        this.terület = terület;
    }

    public void setKapacitás(int kapacitás) {
        this.kapacitás = kapacitás;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return  cím + ": " + kapacitás + " szabad hely";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Parkoló))
            return false;
        Parkoló parkoló=(Parkoló) obj;
        return this.kapacitás==parkoló.getKapacitás();
    }

    @Override
    public int compareTo(Parkoló o) {
        if(this.kapacitás==o.getKapacitás()){
            return this.cím.compareTo(o.getCím());
        }else{
            return (-1)*Integer.compare(this.kapacitás, o.getKapacitás());
        }
    }
    
    
}
