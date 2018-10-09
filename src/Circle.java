/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class Circle extends GeometricShape{
private double radius;
    public Circle() {
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return (2*this.radius*Math.PI);
    }
    public double getArea(){
        return (Math.pow(this.radius, 2))*Math.PI;
    }
    public double getDiameter(){
        return 2*this.radius;
    }
    
}
