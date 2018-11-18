/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import java.util.Objects;

/**
 *
 * @author Dóri
 */
public class Autó implements Comparable<Autó>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public Autó(int teljesítmény, boolean automata) {
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public Autó() {
    }
    
    
    public String getRendszám(){
        return this.rendszám;
    }
    public int getTeljesítmény(){
        return this.teljesítmény;
    }
    public boolean isAutomata(){
        return this.automata;
    }
//    public boolean isSzabályos(){
//        return ((this.rendszám.isLetter(this.rendszám.substring(0, 2))&& this.rendszám.isDigit(rendszám.substring(3, 5))) && this.rendszám.length()==6);
//    }

    @Override
    public String toString() {
        return "Rendszám: " + rendszám + ", teljesítmény: " + teljesítmény + ", automata: " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Autó)){
            return false;
        }
            Autó autó=(Autó)obj;
            return this.rendszám.equals(autó.getRendszám());
        
    }

    @Override
    public int compareTo(Autó o) {
        return Integer.compare(this.teljesítmény, o.getTeljesítmény());
    }
    
    
    
    
}
