/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztálypénz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dóri
 */
public class Main {
    public static void main(String[] args) {
        List<Osztálypénz> osztálypénz=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        while(sor.length()>0){
            String[] st=sor.split(";");
            Osztálypénz darab=new Osztálypénz();
            darab.setNév(st[0]);
            darab.setPénz(Integer.parseInt(st[1]));
            boolean bennevoltmar=false;
            
            for(int i=0;i<osztálypénz.size();i++){
                if(osztálypénz.get(i).getNév().equals(darab.getNév())){
                    osztálypénz.get(i).setPénz(osztálypénz.get(i).getPénz()+darab.getPénz());
                    bennevoltmar=true;
                }
            }
            if(!bennevoltmar){
                osztálypénz.add(darab);
                
            }
            sor=sc.nextLine();
        }
        Collections.sort(osztálypénz);
        for(int i=0;i<osztálypénz.size();i++){
            System.out.println(osztálypénz.get(i));
        }
        
    }
}
