/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author eoin0
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackInterface si = new MyStack();
        System.out.println("Empty? " + si.isEmpty());
        System.out.println("Blocks 1 2 3");
        si.push("1");
        System.out.println("");
        System.out.println("Peek at top: "+si.peek());
        si.push("2");
        System.out.println("Peek at top: "+si.peek());
        si.push("3");
        System.out.println("Peek at top: "+si.peek());
        System.out.println("Pop off");
        si.pop();
        System.out.println("Peek at top: "+si.peek());
        System.out.println("Display: "+si.display());
        
    }
    
}
