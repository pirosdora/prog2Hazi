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
public class Oktató extends Személy{
    protected String tanszék;
    
    public Oktató(String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
    }

    public Oktató(String név, int életkor, boolean férfi,String tanszék) {
        super(név, életkor, férfi);
        this.tanszék = tanszék;
    }

    public String getTanszék() {
        return tanszék;
    }

    @Override
    public String toString() {
        return super.toString()+" "+tanszék;
    }
    
}
