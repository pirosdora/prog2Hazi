/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Main {
    public static Aszu[] puttony(Bor[] b) {
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    index++;
                }
            }
        }
        Aszu[] aszu = new Aszu[index];
        int p = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];

                if (a.hanyPuttonyos() == 5) {
                    aszu[p] = a;
                    p++;
                }
            }
        }

        return aszu;
    }

    public static void main(String[] args) {
        Bor[] b = new Bor[]{
            new Bor("fehér", "Eger", "száraz", 2.5),
            new Bor("vörös", "Tokaj", "édes", 5.6),
            new Aszu(5, "Tokaj", 15.0),
            new Aszu(5, "Tokaj", 12.6),
            new Aszu(3, "Tokaj", 14.7),
            new Bor("fehér", "Tokaj", "félédes", 5.4)
        };

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("puttonyos");
        Aszu[] ital = puttony(b);
        for (Aszu k : ital) {
            System.out.println(k);
        }

    }
}
