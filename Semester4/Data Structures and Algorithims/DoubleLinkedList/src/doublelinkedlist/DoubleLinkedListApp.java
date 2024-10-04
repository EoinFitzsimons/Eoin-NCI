/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author eoin0
 */
public class DoubleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DLList d1 = new DLList();
        System.out.println("Empty: "+d1.isEmpty());
        d1.add("1",1);
        d1.add("HELLO");
        d1.printList();
        d1.add("2",2);
        d1.add("W");
        d1.printList();
        System.out.println("Empty: "+d1.isEmpty());
        d1.add("5", 5);
        d1.printList();
        d1.add("T", 3);
        d1.add("W");
        System.out.println("Empty: "+d1.isEmpty());
        d1.printList();
    }
    
}
