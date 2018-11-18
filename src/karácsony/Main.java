/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karácsony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dóri
 */
public class Main {

    public static void main(String[] args) {
        List<Hozzávaló> hozzávalók = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] st = sor.split(";");
            Hozzávaló hozzávaló = new Hozzávaló();
            hozzávaló.setHozzavalo(st[0]);
            hozzávaló.setMennyi(Integer.parseInt(st[1]));

            boolean bennevoltmar = false;
            for (int i = 0; i < hozzávalók.size(); i++) {
                if (hozzávalók.get(i).getHozzavalo().equals(hozzávaló.getHozzavalo())) {
                    hozzávalók.get(i).setMennyi(hozzávalók.get(i).getMennyi() + hozzávaló.getMennyi());
                    bennevoltmar = true;
                }
            }
//  for(Hozzávaló i:hozzávalók){
//      if(i.getHozzavalo().equals(hozzávaló.getHozzavalo())){
//          i.setMennyi(i.getMennyi()+hozzávaló.getMennyi());
//          bennevoltmar=true;
//      }
//  }
            if (!bennevoltmar) {
                hozzávalók.add(hozzávaló);
                
            }
            sor = sc.nextLine();
        }

//        for(Hozzávaló i:hozzávalók)
//            System.out.println(i);
Collections.sort(hozzávalók);
        for (int i = 0; i < hozzávalók.size(); i++) {
            System.out.println(hozzávalók.get(i));
        }

    }

}
