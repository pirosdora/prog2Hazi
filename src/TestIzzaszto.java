
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
public class TestIzzaszto {

    public static Izzaszto[] z;
    public static Izzaszto iz;

    public static void rendez(Izzaszto[] z) {
        for (int i = 0; i < z.length - 1; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (z[i].getFok() < z[j].getFok()) {
                    Izzaszto tmp = z[i];
                    z[i] = z[j];
                    z[j] = tmp;
                } else if (z[i].getFok() == z[j].getFok()) {
                    if (z[i].getVáros().compareTo(z[j].getVáros()) > 0) {
                        Izzaszto tmp = z[i];
                        z[i] = z[j];
                        z[j] = tmp;
                    }
                }
            }
        }

    }

    public static void városBenne(Izzaszto[] z) {
        int b = 0;
        int f = 0;
        for (int i = 0; i < z.length; i++) {
            if (z[i].getVáros().equals(iz.getVáros())) {
                b++;
                f = z[i].getFok();
            }
        }
        if (b == 1) {
            for (int j = 0; j < z.length; j++) {
                if (f < z[j].getFok()) {
                    System.out.println(z[j]);
                }
            }
        } else {
            System.out.println("Missing data");
        }
    }

    public static void main(String[] args) {
        int fok = 0;
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] st = sor.split(" ");

        iz = new Izzaszto(st[1]);
        int n;
        n = Integer.parseInt(st[0]);
        z = new Izzaszto[n];
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            st = sor.split(":");
            fok = Integer.parseInt(st[1]);
            z[i] = new Izzaszto(st[0], fok);

        }

        rendez(z);
        városBenne(z);
    }
}
