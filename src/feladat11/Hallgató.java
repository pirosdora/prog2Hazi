/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

/**
 *
 * @author Dóri
 */
public class Hallgató extends Személy {
    protected double átlag;
    
    public Hallgató(String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
    }

    public Hallgató(String név, int életkor, boolean férfi, double átlag) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    public double getÁtlag() {
        return átlag;
    }

    public boolean jóKépességű(){
        return this.átlag>=4.0;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.getNév()).append("\n");
        sb.append(super.getÉletkor()).append("\n");
        sb.append(super.isFérfi()).append("\n");
        sb.append(this.átlag);
        return sb.toString();
    }
    
}
