/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostaiKüldemény;

/**
 *
 * @author Dóri
 */
public class Küldemény {
  private String név;
private int ir_szám;
private String település;
private String utca;
private int házszám;
private int csomag_érték;

    public Küldemény() {
    }

    public Küldemény(String név, int ir_szám, String település, String utca, int házszám, int csomag_érték) {
        this.név = név;
        this.ir_szám = ir_szám;
        this.település = település;
        this.utca = utca;
        this.házszám = házszám;
        this.csomag_érték = csomag_érték;
    }

    public String getNév() {
        return név;
    }

    public int getIr_szám() {
        return ir_szám;
    }

    public String getTelepülés() {
        return település;
    }

    public String getUtca() {
        return utca;
    }

    public int getHázszám() {
        return házszám;
    }

    public int getCsomag_érték() {
        return csomag_érték;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setIr_szám(int ir_szám) {
        this.ir_szám = ir_szám;
    }

    public void setTelepülés(String település) {
        this.település = település;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public void setHázszám(int házszám) {
        this.házszám = házszám;
    }

    public void setCsomag_érték(int csomag_érték) {
        this.csomag_érték = csomag_érték;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj==null) || !(obj instanceof Küldemény))
        return false;
        
        Küldemény k=(Küldemény) obj;
        return this.ir_szám==k.getIr_szám();
        
        
    }

    @Override
    public String toString() {
        return "K\u00fcldem\u00e9ny{" + "n\u00e9v=" + név + ", ir_sz\u00e1m=" + ir_szám + ", telep\u00fcl\u00e9s=" + település + ", utca=" + utca + ", h\u00e1zsz\u00e1m=" + házszám + ", csomag_\u00e9rt\u00e9k=" + csomag_érték + '}';
    }

   


}
