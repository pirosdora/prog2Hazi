
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dóri
 */
public class TestHullamvasut {

    public static Hullamvasut[] hv;

    public static void rendez(Hullamvasut[] h) {
        for (int i = 0; i < h.length - 1; i++) {
            for (int j = i + 1; j < h.length; j++) {
                if (h[i].getVarakozasiIdo() > h[j].getVarakozasiIdo()) {
                    Hullamvasut tmp = h[i];
                    h[i] = h[j];
                    h[j] = tmp;
                } else if (h[i].getVarakozasiIdo() == h[j].getVarakozasiIdo()) {
                    if (h[i].getLegkisebbMagassag() == h[j].getLegkisebbMagassag()) {
                        if (h[i].getNev().compareTo(h[j].getNev()) > 0) {
                            Hullamvasut tmp = h[i];
                            h[i] = h[j];
                            h[j] = tmp;
                        } else if (h[i].getLegkisebbMagassag() < h[j].getLegkisebbMagassag()) {
                            Hullamvasut tmp = h[i];
                            h[i] = h[j];
                            h[j] = tmp;
                        }
                    }
                }
            }
        }
    }

    public static void kiir(Hullamvasut[] h) {
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        hv = new Hullamvasut[n];
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(";");
            int magassag = Integer.parseInt(st[2]);
            int ido = Integer.parseInt(st[3]);
            hv[i] = new Hullamvasut(st[0], st[1], magassag, ido);
        }
        rendez(hv);
        System.out.println("\n");
        kiir(hv);
    }
}
