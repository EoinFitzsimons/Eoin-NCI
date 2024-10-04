/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author eoin0
 */
public class InsertionSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList<Integer> list1 = new MyArrayList<>();

        int num;
        for (int i = 0; i < 1000; i++) {
            num = (int) (Math.random() * 1000);
            list1.add(num);
        }
        MyArrayList<Integer> list3 = new MyArrayList<>();
        list3.addAll(list1);
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.addAll(list1);

        System.out.println("Before sorting list by insertion: " + list1);
        final long Start = System.nanoTime();
        list1.insertionSort();
        final long End = System.nanoTime();
        System.out.println("After sorting list by insertion: " + list1);
        System.out.println("Time taken in seconds = " + ((End - Start) / 1e+9));

        System.out.println("Before sorting list by better bubble: " + list3);
        final long Start3 = System.nanoTime();
        list3.betterBubble();
        final long End3 = System.nanoTime();
        System.out.println("After sorting list by better bubble: " + list3);
        System.out.println("Time taken in seconds = " + ((End3 - Start3) / 1e+9));

        System.out.println("Before sorting list by simple bubble: " + list2);
        final long Start2 = System.nanoTime();
        list2.simpleBubble();
        final long End2 = System.nanoTime();

        System.out.println("After sorting list by simple bubble: " + list2);
        System.out.println("Time taken in seconds = " + ((End2 - Start2) / 1e+9));
    }

}
