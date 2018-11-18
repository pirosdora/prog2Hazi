/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dóri
 */
public class Main {

    public static List<Teherautó> teherbírásNagyobb20T(Autó[] autó) {
        List<Teherautó> teherautók = new ArrayList<>();
        for (int i = 0; i < autó.length; i++) {
            if (autó[i] instanceof Teherautó) {
                teherautók.add((Teherautó) autó[i]);
            }
        }
        List<Teherautó> teherautók20 = new ArrayList<>();
        for (int i = 0; i < teherautók.size(); i++) {
            if ((teherautók.get(i).getTeherbírás() / 1000) > 20) {
                teherautók20.add(teherautók.get(i));
            }
        }
        return teherautók20;
    }

    public static void main(String[] args) {
//        i)feladat
//        Autó autó=new Autó();
//        Scanner sc=new Scanner(System.in);
//        String sor=sc.nextLine();
//           
//        autó=new Autó(sor, 100, true);
//        
//        System.out.println(autó);
//       j)feladat 

        Autó[] autók = new Autó[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < autók.length - 2; i++) {
            String sor = sc.nextLine();
            String[] st = sor.split("[' ']");
            autók[i] = new Autó(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]));

        }
        for (int j = 2; j < autók.length; j++) {
            String sor = sc.nextLine();
            String[] st2 = sor.split("[' ']");
            autók[j] = new Teherautó(st2[0], Integer.parseInt(st2[1]), Boolean.parseBoolean(st2[2]), Integer.parseInt(st2[3]));

        }

        for(int i=0;i<autók.length;i++){
            System.out.println(autók[i]);
        }
//l)feladat
        List<Teherautó> uj = teherbírásNagyobb20T(autók);
        for (Teherautó i : uj) {
            System.out.println(i);
        }

    }

}
