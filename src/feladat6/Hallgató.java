/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

import java.util.Random;

/**
 *
 * @author Dóri
 */
public class Hallgató {
   public int mennyitKeszult; 
   public boolean sokatTanul;

    public Hallgató(int mennyitKeszult, boolean sokatTanul) {
        Random r=new Random();
        this.mennyitKeszult = r.nextInt(6)+0;
        this.sokatTanul = sokatTanul;
    }

    
   public Dolgozat dolgozatotIr(){
       int pontszam;
       if(sokatTanul){
           Random rand=new Random();
           int szam=rand.nextInt(4)+4;
           pontszam=this.mennyitKeszult*szam; 
       }else{
           Random rand2=new Random();
           int szam=rand2.nextInt(6)+0;
           pontszam=this.mennyitKeszult*szam;
       }
       Dolgozat eredmeny=new Dolgozat(pontszam);
       eredmeny.setPontszam(pontszam);
       return eredmeny;
   }
}
