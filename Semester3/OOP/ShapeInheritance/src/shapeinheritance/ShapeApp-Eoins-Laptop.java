/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeinheritance;

/**
 *
 * @author eoin0
 */
public class ShapeApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name;
       double radius;
       
       Circle c = new Circle();
       c.setName("Get method in action from parent: " +c.getName());
       name = JOptionPane.showInputDialog(null, "Enter Name");
       radius = JOptionPane.showInputDialog(null, "Enter Radius");
       
       JOptionPane.showMessageDialog(null, "Area " + Area);
//        Circle c = new Circle("hi",1,1);
//        c.setName("Get method in action from parent: " +c.getName());
//        System.out.println("Enter A Radius");
//        double word = input.nextDouble();
//        c.setRadius(word);
//
//        System.out.println("You Entered : " + word);
//
//        System.out.println("You have generated a area of: "+c.getArea(word));
    }
    
}
