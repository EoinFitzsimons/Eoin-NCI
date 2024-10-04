/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

import java.util.ArrayList;

/**
 *
 * @author eoin0
 * @param <E>
 */
public class MyArrayList<E> extends ArrayList<E> {

    public void quickSort(int start, int end) {
        int pivotIndex;
        if (start < end) {
            pivotIndex = partition(start, end);
            quickSort(start, pivotIndex-1);
            quickSort(pivotIndex + 1, end);
        }
    }

    private int partition(int start, int end) {
        int up = start;
        int down = end;
        E pivot = get(start);
        while(up < down){
            while(up < end && ((Comparable)get(up)).compareTo((Comparable)pivot)<0){
                up++;
            }
            while(down > start && (((Comparable)get(down)).compareTo((Comparable)pivot) > 0 || ((Comparable)get(down)).compareTo((Comparable)pivot) == 0)){
                down--;
            }
            if (up<down){
                E elemUp = get(up);
                set(up,get(down));
                set(down,elemUp);
            }
        }
        set(start,get(down));
        set(down,pivot);
        return down;
    }
}
