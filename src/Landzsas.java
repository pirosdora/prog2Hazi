/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Landzsas extends Katona {

    public Landzsas(int támadóErő, int védőErő) {
        super(támadóErő, védőErő);
    }

    @Override
    public String toString() {
        return "Landzsas: TE:" + super.getTámadóErő() + ", VE: " + super.getVédőErő();
    }

}
