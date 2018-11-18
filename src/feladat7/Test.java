/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dóri
 */
public class Test {
    public static List<Lakóház> tágasLakóházak(List<Lakóház> list,double térfogat){
        List<Lakóház> lh=new ArrayList<>();
        
       for(int i=0;i<list.size();i++){
           if(list.get(i).légköbméter()>térfogat)
               lh.add(list.get(i));
          
       }
       return lh;
    }
    public static void main(String[] args) {
        List<Lakóház> lakóházak=new ArrayList<>();
        lakóházak.add(new Lakóház("Derék utca 100", 4, 120.5));
        lakóházak.add(new Lakóház("Szoboszlai út", 10, 250.7));
        lakóházak.add(new Lakóház("Piac utca 67", 4, 100.6));
        lakóházak.add(new Lakóház("Kassai út 7", 8, 180.6));
        lakóházak.add(new Lakóház("Pesti utca 32", 4, 105.6));
        lakóházak.add(new Lakóház("Ótemető utca 1", 6, 140.7));
        lakóházak.add(new Lakóház("Csapó utca 84", 10, 300.1));
        lakóházak.add(new Lakóház("Berek utca 18", 3, 114.8));
        lakóházak.add(new Lakóház("Piac utca 42", 5, 120.3));
        lakóházak.add(new Lakóház("Kishegyesi út 88", 4, 104.8));
     
        /*for(Lakóház i:lakóházak){
            System.out.println(i);
        }*/
       List<Lakóház> uj=tágasLakóházak(lakóházak, 4000);
        Collections.sort(uj);
        for(Lakóház i:uj){
            System.out.println(i);
        }
    }
}
