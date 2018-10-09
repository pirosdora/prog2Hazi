/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(1.0, 1.5, 1.0, "yellow", true);
        System.out.println("The area: "+triangle.getArea());
        System.out.println("The perimeter: "+triangle.getPerimeter());
        System.out.println("The color is "+triangle.getColor());
       if(triangle.isFilled()){
           System.out.println("Filled");
       }else{
           System.out.println("Not filled");
       }
    }
}
