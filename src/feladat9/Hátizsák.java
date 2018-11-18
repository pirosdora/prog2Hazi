/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

/**
 *
 * @author Dóri
 */
public class Hátizsák implements Comparable<Hátizsák> {

    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return  "Márka: " + márka + ", Zsebek száma: " + zsebekSzáma;
    }

    @Override
    public int compareTo(Hátizsák o) {
        if (this.márka == o.getMárka()) {
            return (-1)*Integer.compare(this.zsebekSzáma, o.getZsebekSzáma());
        } else {
            return this.márka.compareTo(o.getMárka());

        }

    }
}


