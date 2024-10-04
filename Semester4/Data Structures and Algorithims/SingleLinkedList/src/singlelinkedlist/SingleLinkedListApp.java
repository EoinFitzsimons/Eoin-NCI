/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author eoin0
 */
public class SingleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLList sl = new SLList();
        sl.add("Joshua");
        sl.add("Eskander", 2);
        sl.add("Yonas", 3);
        System.out.println(sl.size());
        sl.printList();
        sl.add("Tanvir", 2);
        System.out.println(sl.size());
        sl.printList();
    }
    
}
