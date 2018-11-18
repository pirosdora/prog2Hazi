/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dóri
 */
public class Dolgozat {

    public static void rendez(SzeszesItal[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].getAlkoholTartalom() < s[j].getAlkoholTartalom()) {
                    SzeszesItal tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;

                }
            }
        }
    }

    public static SzeszesItal[] haromLegmagasabb(Ital[] t) {
        int count = 0;
        if (t.length < 3) {
            return null;
        } else if (t.length >= 3) {
            for (int i = 0; i < t.length; i++) {
                if (t[i] instanceof SzeszesItal) {
                    SzeszesItal it = (SzeszesItal) t[i];
                    count++;
                }
            }
        }
        SzeszesItal[] szital = new SzeszesItal[count];
        if (count < 3) {
            return null;
        } else {
            int p = 0;
            for (int i = 0; i < t.length; i++) {
                if (t[i] instanceof SzeszesItal) {
                    SzeszesItal it = (SzeszesItal) t[i];
                    szital[p] = it;
                    p++;
                }
            }
        }
        SzeszesItal[] harom = new SzeszesItal[3];
        if (szital.length < 3) {
            return null;
        } else {
            rendez(szital);

            harom[0] = szital[0];
            harom[1] = szital[1];
            harom[2] = szital[2];
        }
        return harom;
    }

    public static void main(String[] args) {
        Ital[] ital = new Ital[]{
            new Ital("Sió", "0.5 l", 230),
            new Ital("Xixo", "1.5 l", 190),
            new SzeszesItal("Kékfrankos", "0.75 l", 800, 15),
            new SzeszesItal("Jim Beam", "0.75 l", 1500, 20),
            new SzeszesItal("Bailey's", "0.75 l", 1800, 12),
            new SzeszesItal("Fütyülős", "1 l", 2100, 13),
            new Ital("Pepsi", "1.5 l", 300)
        };
        SzeszesItal[] szeszesital = haromLegmagasabb(ital);
        for (SzeszesItal k : szeszesital) {
            System.out.println(k);
        }

    }
}
