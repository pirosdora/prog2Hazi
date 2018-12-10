/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dóri
 */
public class Teszt {
public static void számol(List<CégesAdatok> lista){
    boolean bennevoltmár=false;
    CégesAdatok c=new CégesAdatok();
    List<CégesAdatok> list=new ArrayList<>();
    for(int i=0;i<lista.size();i++){
        if(lista.get(i).getCégnév().equals(c.getCégnév())&& lista.get(i).getTelephely().equals(c.getTelephely())){
            lista.get(i).setÉves_árbevétel(lista.get(i).getÉves_árbevétel()+c.getÉves_árbevétel());
            bennevoltmár=true;
        }
    }
    if(!bennevoltmár){
        lista.add(c);
    }
}
    public static void main(String[] args) {
        List<CégesAdatok> cégek = new ArrayList<>();

        try {
            FileReader fr = new FileReader(new File("mérlegelés.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] st = sor.split(":");
                CégesAdatok cég = new CégesAdatok(st[0], st[1], Integer.parseInt(st[2]), Integer.parseInt(st[3]));
                számol(cégek);
            }
br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Collections.sort(cégek);
        
        for(CégesAdatok i:cégek){
        System.out.println(i);
        }
    }
}
