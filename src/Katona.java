/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Katona {

    private int támadóErő;
    private int védőErő;

    public int getTámadóErő() {
        return támadóErő;
    }

    public int getVédőErő() {
        return védőErő;
    }

    public void setTámadóErő(int támadóErő) {
        this.támadóErő = támadóErő;
    }

    public void setVédőErő(int védőErő) {
        this.védőErő = védőErő;
    }

    public Katona() {
        this.támadóErő = (int) 5.5;
        this.védőErő = (int) 5.5;
    }

    public Katona(int támadóErő, int védőErő) {
        this.támadóErő = támadóErő;
        this.védőErő = védőErő;
    }

    @Override
    public String toString() {
        return "TE: " + támadóErő + ", VE: " + védőErő;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null && !(obj instanceof Katona)) {
            return false;
        }
        Katona k = (Katona) obj;
        return this.támadóErő == k.támadóErő && this.védőErő == k.védőErő;
    }

}
