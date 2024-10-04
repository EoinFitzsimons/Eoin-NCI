/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author eoin0
 */
public class MergeSortApp {

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
            

        System.out.println("MergeSort");
        System.out.println("Before sorting: " + list1);
        final long Start = System.nanoTime();
        list1.mergeSort(0, list1.size()-1);
        final long End = System.nanoTime();
        System.out.println("After sorting: " + list1);
        System.out.println("Time taken = " + ((End - Start) / 1e+9));
    }
}
