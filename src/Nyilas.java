/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Nyilas extends Katona {

    private int lőtáv;

    public int getLőtáv() {
        return lőtáv;
    }

    public int getTámadóErő() {
        return lőtáv + super.getTámadóErő();
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public Nyilas(int lőtáv, int támadóErő, int védőErő) {
        super(támadóErő, védőErő);
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getTámadóErő() + ", VE: " + super.getVédőErő();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null && !(obj instanceof Nyilas)) {
            return false;
        }
        Nyilas ny = (Nyilas) obj;
        return this.lőtáv == ny.lőtáv && super.getTámadóErő() == ny.getTámadóErő() && super.getVédőErő() == ny.getVédőErő();
    }

}
