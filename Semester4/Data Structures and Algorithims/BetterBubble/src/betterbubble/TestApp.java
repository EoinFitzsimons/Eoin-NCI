/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package betterbubble;

/**
 *
 * @author eoin0
 */
public class TestApp {
    //main()

    public static void main(String args[]) {
        MyArrayList<Integer> list1 = new MyArrayList<Integer>();

        //to add items unsorted to your list1, print list1,
        //sort using your betterBubble(), print list1 again to ensure it is sorted
        //create list2 with String values
        // Add items to your list1
        for (int j = 0; j < 10; j++){
        for (int i = 0; i < 1000; i++){
        list1.add(55);
        list1.add(32);
        list1.add(18);
        list1.add(10);
        list1.add(99);
        list1.add(25);
        list1.add(37);
        list1.add(98);
        list1.add(3);
        list1.add(99);
        }

        MyArrayList<Integer> list2 = new MyArrayList<Integer>();
        list2.addAll(list1);

        System.out.println("Before sorting: " + list1);
        final long Start = System.nanoTime();
        list1.betterBubble();
        final long End = System.nanoTime();
        System.out.println("After sorting: " + list1);
        System.out.println("Time taken = " + ((End - Start)/1e+9));

        System.out.println("Before sorting: " + list2);
        final long Start2 = System.nanoTime();
        list2.simpleBubble();
        final long End2 = System.nanoTime();

        System.out.println("After sorting: " + list2);
        System.out.println("Time taken = " + ((End2 - Start2)/1e+9));
    }}
}
