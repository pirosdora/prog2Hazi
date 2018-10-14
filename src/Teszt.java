/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Teszt {

    public static Katona megkuzd(Katona k1, Katona k2) {
        Katona győztes = null;
        if (k1.getTámadóErő() > k2.getVédőErő()) {
            győztes = k1;
        } else if (k2.getTámadóErő() > k1.getVédőErő()) {
            győztes = k2;
        } else if (k1.getTámadóErő() == k2.getVédőErő() || k2.getTámadóErő() == k1.getVédőErő()) {
            győztes = k1;
        }
        System.out.println("Katona 1: " + k1 + "\nKatona 2: " + k2);
        return győztes;
    }

    public static void main(String[] args) {
        Nyilas ny1 = new Nyilas(15, 10, 15);
        Nyilas ny2 = new Nyilas(20, 18, 25);
        Landzsas l = new Landzsas(25, 14);
        System.out.println("első küzdelem:");

        Katona gy = megkuzd(ny1, l);

        System.out.println("második küzdelem:");
        Katona gy2 = megkuzd(gy, ny2);
        System.out.println("A győztes:" + gy2);
    }
}
