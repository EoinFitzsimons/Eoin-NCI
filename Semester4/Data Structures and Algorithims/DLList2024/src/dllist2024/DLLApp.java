/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dllist2024;

/**
 *
 * @author EThornbury
 */
public class DLLApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* create a MyDLL object
         * Add 6 names to the list on different positions
         * print the size of the dllist
         * remove some names (nodes) from the list. For example, the 3rd name, the 1st name
         * print  the list after each removal.
         * */ 
  
       MyDLL d1 = new MyDLL();
        System.out.println("Empty: "+d1.isEmpty());
        d1.add(1,"1");
        d1.add(2,"2");
        d1.printList();
        System.out.println("Empty: "+d1.isEmpty());
        d1.add(2,"X");
        d1.printList();
        d1.add(4,"T");
        System.out.println("Empty: "+d1.isEmpty());
        d1.printList();
        
        
    }
    
}
