/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeinheritance;

/**
 *
 * @author eoin0
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double area, double radius){
        super(name,area);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double computeArea(){
    area = 3.14 * radius * radius;
    return area;
    }

}
