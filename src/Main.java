
import java.util.HashSet;
import java.util.Set;

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

    public static void osztás(int a, int b) {
        int hányados;
        hányados = 0;
        while (a >= b) {
            hányados++;
            a -= b;
        }
        System.out.println(hányados);
    }

    public static void prím(int n) {
        int i;
        int db = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                db++;
            }
        }
        if (db == 2) {
            System.out.println("Prímszám");
        } else {
            System.out.println("Nem prímszám");
        }

    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(a + "," + b);
        } else {
            c = a + b;
            System.out.println(a + "," + b + "," + c);
        }

        int k = 3;
        while (k < n) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
            k++;
        }
    }

    public static void fordított_szám(int n) {
        int újszám = 0;

        while (n != 0) {
            int maradék = n % 10;
            újszám = újszám * 10 + maradék;
            n = n / 10;
        }
        System.out.println(újszám);
    }

    public static int faktoriális(int szám) {
        int i;
        int fakt = 1;
        for (i = 1; i <= szám; i++) {
            fakt *= i;
        }
        return fakt;
    }

    public static void osztható_K(int n1, int n2, int k) {
        int i;
        int tmp;
        if (n1 > n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        for (i = n1; i <= n2; i++) {
            if (i % k == 0) {
                System.out.println(i);
            }
        }
    }

    public static int legkisebbFibonacci(int n) {
        int eredmény;
        int a = 0;
        int b = 1;
        int c;
        if (n == 0) {
            eredmény = b;
        } else {
            c = a + b;

            do {
                a = b;
                b = c;
                c = a + b;
                eredmény = c;
            } while (c <= n);
        }
        return eredmény;
    }

    public static void számjegyKöbÖsszeg() {
        for (int i = 0; i < 1000; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 3);
                n = n / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("1.feladat");
        Pont p1 = new Pont(2, 8);
        Pont p2 = new Pont(5, 3);
        Pont p3 = new Pont(4, 10);
        Pont p4 = new Pont(12, 9);

        p1.setY(p1.getY() + 5);
        p2.setY(p2.getY() + 5);
        p3.setX(p3.getX() - 3.4);
        p4.setX(p4.getX() - 3.4);

        System.out.println("Módosult koordináták:");
        System.out.println("x=" + p1.getX() + " y=" + p1.getY());
        System.out.println("x=" + p2.getX() + " y=" + p2.getY());
        System.out.println("x=" + p3.getX() + " y=" + p3.getY());
        System.out.println("x=" + p4.getX() + " y=" + p4.getY());
        System.out.println("-----------------------");

        System.out.println("2.feladat");
        RegularPolygon s1 = new RegularPolygon();
        RegularPolygon s2 = new RegularPolygon(6, 4);
        RegularPolygon s3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("A sokszög kerülete: " + s1.getPerimeter() + ", területe: " + s1.getArea());
        System.out.println("A sokszög kerülete: " + s2.getPerimeter() + ", területe: " + s2.getArea());
        System.out.println("A sokszög kerülete: " + s3.getPerimeter() + ", területe: " + s3.getArea());
        System.out.println("------------------------");

        System.out.println("3.feladat");
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("A téglalap szélessége: " + r1.width + "\nmagassága: " + r1.height + "\nkerülete: " + r1.getPerimeter() + " és területe: " + r1.getArea());
        System.out.println("\n");
        System.out.println("A téglalap szélessége: " + r2.width + "\nmagassága: " + r2.height + "\nkerülete: " + r2.getPerimeter() + " és területe: " + r2.getArea());

        System.out.println("-----------------------------");

        System.out.println("4.feladat");
        Ital i1 = new Ital("Pepsi", "2");
        Ital i2 = new Ital("Coca-Cola","1");
        System.out.println(i1+"\n"+i2);
        System.out.println("Ár euróban:"+Ital.getÁrEuróban(308));
        System.out.println("--------------------------");

        System.out.println("5. feladat");
        QuadraticEquation e1 = new QuadraticEquation(1, 2, 3);
        QuadraticEquation e2 = new QuadraticEquation(2, 9, 1);
        QuadraticEquation e3 = new QuadraticEquation(4, 4, 1);
        
        if (e1.getDiscriminant() > 0) {
            System.out.println("x1=" + e1.getRoot1() + ", x2=" + e1.getRoot2() + "\n");
        } else if (e1.getDiscriminant() == 0) {
            System.out.println("x=" + e1.getRoot1() + "\n");
        } else {
            System.out.println("The equation has no roots.\n");
        }

        if (e2.getDiscriminant() > 0) {
            System.out.println("x1=" + e2.getRoot1() + ", x2=" + e2.getRoot2() + "\n");
        } else if (e2.getDiscriminant() == 0) {
            System.out.println("x=" + e2.getRoot1() + "\n");
        } else {
            System.out.println("The equation has no roots.\n");
        }
        if (e3.getDiscriminant() > 0) {
            System.out.println("x1=" + e3.getRoot1() + ", x2=" + e3.getRoot2() + "\n");
        } else if (e3.getDiscriminant() == 0) {
            System.out.println("x=" + e3.getRoot1() + "\n");
        } else {
            System.out.println("The equation has no roots.\n");
        }
        System.out.println("------------------------------");
        
        System.out.println("6.feladat");
        LinearEquation n1 = new LinearEquation(3, 2, 9, 6, 5, 6);
        LinearEquation n2 = new LinearEquation(10, 12, 6, 4, 9, 3);
        LinearEquation n3 = new LinearEquation(9, 15, 4, 7, 9, 8);

        if (n1.isSolvable()) {
            System.out.println("x1=" + n1.getX() + ", y1=" + n1.getY() + "\n");
        } else {
            System.out.println("The equation has no solution.\n");
        }
        if (n2.isSolvable()) {
            System.out.println("x2=" + n2.getX() + ", y2=" + n2.getY() + "\n");
        } else {
            System.out.println("The equation has no solution.\n");
        }
        if (n3.isSolvable()) {
            System.out.println("x3=" + n3.getX() + ", y3=" + n3.getY() + "\n");
        } else {
            System.out.println("The equation has no solution.\n");
        }
        System.out.println("---------------------------");

        System.out.println("Metódusok feladat");
        System.out.println("1.feladat");
        Metódusok.növekvő(40, 12, 23);
        System.out.println("-----------");
        System.out.println("2.feladat");
        Metódusok.minMax(5.6, 3.2, 10.6);
        System.out.println("-----------");
        System.out.println("3.feladat");
        Metódusok.sorrend(9.3, -2.6, 3.8, 0);
        Metódusok.sorrend(9.3, -2.6, 3.8, -1.5);
        System.out.println("------------");
        System.out.println("4.feladat");
        System.out.println(Metódusok.háromszög(2.6, 3.8, 5.5));
        System.out.println("-------------");
        System.out.println("5.feladat");
        System.out.println(Metódusok.szökőév(2000, 2018));
        System.out.println("-------------");
        System.out.println("6.feladat");
        Metódusok.osztályzat(4);
        System.out.println("-------------");

        System.out.println("7.feladat");
        osztás(23, 5);
        System.out.println("--------------");
        System.out.println("8. feladat");
        prím(13);
        System.out.println("--------------");
        System.out.println("9.feladat");
        fibonacci(10);
        System.out.println("------------");
        System.out.println("10.feladat");
        fordított_szám(321);
        System.out.println("-------------");
        System.out.println("11.feladat");
        System.out.println(faktoriális(12));
        System.out.println("-------------");
        System.out.println("12.feladat");
        osztható_K(5, 20, 3);
        System.out.println("-------------");
        System.out.println("13.feladat");
        System.out.println(legkisebbFibonacci(8));
        System.out.println("-------------");
        System.out.println("14.feladat");
        számjegyKöbÖsszeg();
        System.out.println("-------------");
    }

}
