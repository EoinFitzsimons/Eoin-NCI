/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritencebasic;

/**
 *
 * @author eoin0
 */
public class Parent {
    protected String name; //Classes that share package can use.
    public Parent (){
        System.out.println("Parent");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent(String name) {
        this.name = name;
    }
    
    
    
    
}
