/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Izzaszto {

    private String város;
    private int fok;

    public Izzaszto(String város, int fok) {
        this.város = város;
        this.fok = fok;
    }

    public Izzaszto(String város) {
        this.város = város;
        this.fok = fok;
    }

    public String getVáros() {
        return város;
    }

    public int getFok() {
        return fok;
    }

    @Override
    public String toString() {
        return város + " " + "(" + fok + ")";
    }

}
