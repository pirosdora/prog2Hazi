/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author Dóri
 */
public class Tea implements Rendezhető<Tea>{
public String nev;
public int ár;

    public Tea(String nev, int ár) {
        this.nev = nev;
        this.ár = ár;
    }

    @Override
    public boolean egyenlo(Tea o) {
    return this.nev.equals(o.nev);
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        return this.ár>o.ár;
    }

    @Override
    public boolean kisebbMint(Tea o) {
    return this.ár<o.ár;
    }

}
