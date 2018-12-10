/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostaiKüldemény;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dóri
 */
public class Teszt {
    public static void main(String[] args) {
        List<Küldemény> küldemények=new ArrayList<>();
        
        try{
            FileReader fr=new FileReader(new File("küldemény.txt"));
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            while((sor=br.readLine())!=null){
                String[] st=sor.split(":");
                Küldemény k=new Küldemény(st[0], Integer.parseInt(st[1]),st[2], st[3], Integer.parseInt(st[4]), Integer.parseInt(st[5]));
                
                küldemények.add(k);
                
                }
               br.close();
            }
        catch(IOException e){
            
        }
        for(Küldemény i:küldemények){
            System.out.println(i);
        }
    }
}

