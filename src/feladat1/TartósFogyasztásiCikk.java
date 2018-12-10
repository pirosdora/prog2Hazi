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
public class TartósFogyasztásiCikk {
    private String név;
    private String mennyiségi_egység;
    private double ár;

    public TartósFogyasztásiCikk(String név, String mennyiségi_egység, double ár) {
        this.név = név;
        this.mennyiségi_egység = mennyiségi_egység;
        this.ár = ár;
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
    
    
}
