/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Metódusok {

    public static void növekvő(int a, int b, int c) {
        if (a < b && a < c && b < c) {
            System.out.println(a + "," + b + "," + c);
        } else if (a < b && a < c && b > c) {
            System.out.println(a + "," + c + "," + b);
        } else if (b < a && b < c && a < c) {
            System.out.println(b + "," + a + "," + c);
        } else if (b < a && b < c && c < a) {
            System.out.println(b + "," + c + "," + a);
        } else if (c < a && c < b && a < b) {
            System.out.println(c + "," + a + "," + b);
        } else {
            System.out.println(c + "," + b + "," + a);
        }
    }

    public static void minMax(double a, double b, double c) {
        double min;
        double max;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        if (c < 0) {
            c *= -1;
        }
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("min=" + min + ", " + "max=" + max);
    }

    public static void sorrend(double a, double b, double c, double d) {
        System.out.println(a + ", " + b + ", " + c + "," + d);
        if (d >= 0) {
            System.out.println(a + ", " + c + ", " + b + ", " + d);
        } else {
            System.out.println(a + ", " + b + ", " + d + ", " + c);
        }
    }

    public static boolean háromszög(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public static int szökőév(int a, int b) {
        int i;
        int db = 0;
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        for (i = a; i <= b; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                db++;
            }
        }
        return db;
    }

    public static void osztályzat(int jegy) {
        switch (jegy) {
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
            default:
                System.out.println("Nem érdemjegy!");
        }
    }

    public static void main(String[] args) {
        minMax(5.6, 3.2, 10.6);
        sorrend(9.3, -2.6, 3.8, 0);
        System.out.println(háromszög(2.5, 0.1, 0.1));
        System.out.println(szökőév(2000, 2018));
        osztályzat(4);
        növekvő(40, 12, 23);
    }

}
