/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholTartalom) {
        super("", termoTerulet, "", alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }


    public int hanyPuttonyos(){
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu "+"Termőterület: " +super.holTermett() + " puttonySzam=" + puttonySzam+ " alkoholTartalom: "+super.mennyiAlkoholtTartalmaz();
    }

    
}
