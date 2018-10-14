/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Hullamvasut {

    private String nev;
    private String vilag;
    private int legkisebbMagassag;
    private int varakozasiIdo;

    public Hullamvasut(String nev, String vilag, int legkisebbMagassag, int varakozasiIdo) {
        this.nev = nev;
        this.vilag = vilag;
        this.legkisebbMagassag = legkisebbMagassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getNev() {
        return nev;
    }

    public String getVilag() {
        return vilag;
    }

    public int getLegkisebbMagassag() {
        return legkisebbMagassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setVilag(String vilag) {
        this.vilag = vilag;
    }

    public void setLegkisebbMagassag(int legkisebbMagassag) {
        this.legkisebbMagassag = legkisebbMagassag;
    }

    public void setVarakozasiIdo(int varakozasiIdo) {
        this.varakozasiIdo = varakozasiIdo;
    }

    @Override
    public String toString() {
        return nev + " " + "(" + vilag + ")" + ": " + varakozasiIdo;
    }

}
