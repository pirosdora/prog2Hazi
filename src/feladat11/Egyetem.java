/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dóri
 */
public class Egyetem extends Személy implements University {
    List<Egyetem> polgárok;
    
    public Egyetem(String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
    }

    @Override
    public void add(Object obj) {
        int index = 0;
        polgárok.add(polgárok.get(index));
    }

    @Override
    public void delete(int index) {
        polgárok.remove(index);
    }

public static void háromLegfiatalabb(List<Személy> polgárok){
    
    List<Hallgató> hallgatók=new ArrayList<>();
   
        if(polgárok.size()<3){
            for(int i=0;i<polgárok.size();i++){
            System.out.println(polgárok.get(i));
        }}
    for(int i=0;i<polgázok.size();i++){
        if(polgárok.get(i) instanceof Hallgató){           
           hallgatók.add((Hallgató) polgárok.get(i));
        }
    }
    if(hallgatok.size()<3){
    for(int i=0;i<hallgatók.size();i++){
        System.out.println(hallgatók.get(i));
    }}else{
            Collections.sort(hallgatók);
            for(int j=0;j<=2;j++){
                System.out.println(hallgatók.get(j));
            }
        }
    
    
    
    
}
   
    
}
