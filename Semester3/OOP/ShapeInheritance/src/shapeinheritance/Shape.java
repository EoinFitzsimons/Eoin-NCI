/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeinheritance;

/**
 *
 * @author eoin0
 */
public class Shape {
    protected String name;
    protected double area;
    
    public Shape(){
        
    }

    public Shape(String name, double area) {
        this.name = name;
        this.area = area;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }
    
    
    
}
