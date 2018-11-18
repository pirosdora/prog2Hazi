/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkoló;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dóri
 */
public class Main {
    public static void main(String[] args) {
        List<Parkoló> parkolók=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int e=0;
        
        while(sor.length()>0){
            String[] st=sor.split("[;]");
            Parkoló parkoló=new Parkoló();
            parkoló.setCím(st[0]);
            parkoló.setTerület(Double.parseDouble(st[1]));
            parkoló.setKapacitás(Integer.parseInt(st[2]));
            List<String> rendszám=new ArrayList<>();
            
            for(int i=3;i<st.length;i++){
                rendszám.add(st[i]);
            }
            parkolók.add(new Parkoló(parkoló.getCím(),parkoló.getTerület(),parkoló.getKapacitás()));
            parkolók.get(e).setKapacitás(parkolók.get(e).getKapacitás()-rendszám.size());
        e++;
        sor=sc.nextLine();
        }
        Collections.sort(parkolók);
        for(int i=0;i<parkolók.size();i++){
            if(parkolók.get(i).getKapacitás()>2){
            System.out.println(parkolók.get(i));
            }
        }
        
    }
 
}
