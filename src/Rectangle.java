/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Rectangle extends GeometricShape {
private double width;
private double height;
    public Rectangle() {
        this.height=1.0;
        this.width=1.0;
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
        this.height=height;
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    
}
