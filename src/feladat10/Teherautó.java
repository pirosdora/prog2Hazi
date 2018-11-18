/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

/**
 *
 * @author Dóri
 */
public class Teherautó extends Autó {
    private int teherbírás;
    
    public Teherautó(String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
    }

    public Teherautó(String rendszám, int teljesítmény, boolean automata, int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }
    

    @Override
    public String toString() {
        return super.toString()+ ", teherbírás:" + teherbírás;
    }
    
}
