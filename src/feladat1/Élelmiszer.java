/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Dóri
 */
public class Élelmiszer {
    private String név;
    private String mennyiségi_egység;
    private double ár;
    private int szavatosság;

    public Élelmiszer(String név, String mennyiségi_egység, double ár, int szavatosság) {
        this.név = név;
        this.mennyiségi_egység = mennyiségi_egység;
        this.ár = ár;
        this.szavatosság = szavatosság;
    }

    public String getNév() {
        return név;
    }

    public String getMennyiségi_egység() {
        return mennyiségi_egység;
    }

    public double getÁr() {
        return ár;
    }

    public int getSzavatosság() {
        return szavatosság;
    }
    
    
}
