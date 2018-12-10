/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dóri
 */
public class Teszt {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("feladat1.txt");
            BufferedReader br=new BufferedReader(fr);
            String sor;
//                    while((sor=br.readLine())!=null)
        }catch(IOException e){
            
        }
    }
}
