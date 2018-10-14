
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
public class TestSzotar {

    public static Szotar[] sz;

    public static void rendez(Szotar[] sz) {
        for (int i = 0; i < sz.length - 1; i++) {
            for (int j = i + 1; j < sz.length; j++) {
                if (sz[i].getAngol().compareTo(sz[j].getAngol()) > 0) {
                    Szotar tmp = sz[i];
                    sz[i] = sz[j];
                    sz[j] = tmp;
                } else if (sz[i].getAngol().compareTo(sz[j].getAngol()) == 0) {
                    if (sz[i].getMagyar().compareTo(sz[j].getMagyar()) > 0) {
                        Szotar tmp = sz[i];
                        sz[i] = sz[j];
                        sz[j] = tmp;
                    }
                }
            }
        }
    }

    public static void kiir(Szotar[] sz) {
        for (int i = 0; i < sz.length; i++) {
            System.out.println(sz[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        sz = new Szotar[n];
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();
            String[] st = sor.split(":");
            sz[i] = new Szotar(st[0], st[1]);
        }
        rendez(sz);
        System.out.println("\n");
        kiir(sz);

    }
}
