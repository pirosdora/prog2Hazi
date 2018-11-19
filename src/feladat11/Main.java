/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dóri
 */
public class Main {
    public static double átlag(List<Személy> halmaz){
        int sum=0;
        int db=0;
        for(int i=0;i<halmaz.size();i++){
            if(halmaz.get(i)instanceof Hallgató){
                Hallgató hallgató=(Hallgató)halmaz.get(i);
                if(hallgató.jóKépességű()){
                    sum+=hallgató.getÉletkor();
                    db++;
                }
            }
        }
        return (double)sum/(double)db;
    }
    
    public static void main(String[] args) {
        
//        Személy személy=new Személy("Mona Lisa", 20, false);
//        System.out.println(személy);
//        i)feladat
//        Személy[] személyek=new Személy[4];
//        Scanner sc=new Scanner(System.in);
//        
//        for(int i=0;i<személyek.length-2;i++){
//            String sor=sc.nextLine();
//            String[] darab=sor.split("[' ']");
//            személyek[i]=new Hallgató(darab[0], Integer.parseInt(darab[1]), Boolean.parseBoolean(darab[2]), Double.parseDouble(darab[3]));
//        }
//        for(int j=2;j<személyek.length;j++){
//            String sor=sc.nextLine();
//            String[] darab=sor.split("[' ']");
//            személyek[j]=new Oktató(darab[0], Integer.parseInt(darab[1]), Boolean.parseBoolean(darab[2]), darab[3]);
//        }
//        for(int i=0;i<személyek.length;i++){
//            System.out.println(személyek[i]);
//        }

List<Személy> hallgatók=new ArrayList<>();
hallgatók.add(new Hallgató("Pisti", 25, true, 4.5));
hallgatók.add(new Hallgató("Kata", 14, false, 3.4));
hallgatók.add(new Hallgató("Tamás", 15, true, 2.9));
hallgatók.add(new Hallgató("Dóra", 24, false, 4.3));

        System.out.println(átlag(hallgatók));
        Egyetem.háromLegfiatalabb(hallgatók);
    }
  
}
