/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;
    
    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher=maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSz\u00e1ll\u00edthat\u00f3Teher=" + maxSzállíthatóTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj2) {
        if(obj2==null || !(obj2 instanceof Teherautó))
            return false;
        Teherautó t=(Teherautó) obj2;
        return super.equals(t)&& this.maxSzállíthatóTeher==t.maxSzállíthatóTeher;
    }
    
}
