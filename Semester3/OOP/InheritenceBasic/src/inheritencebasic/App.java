/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritencebasic;

/**
 *
 * @author eoin0
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        System.out.println("C1");
        ChildOne c1= new ChildOne("fish","Gilgamesh"); //Talent,Name
        System.out.println(c1.getName() + " cannot " + c1.getTalent());
        System.out.println("C2");
        ChildTwo c2= new ChildTwo("Zenith");
        System.out.println("c2 name " + c2.getName());

        c1.print("chicken");
        c1.print("egg","laid");
    }
    
}
