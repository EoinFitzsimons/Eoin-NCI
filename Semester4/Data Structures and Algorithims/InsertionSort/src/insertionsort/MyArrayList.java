/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertionsort;

import java.util.ArrayList;

/**
 *
 * @author eoin0
 */
public class MyArrayList<E> extends ArrayList<E> {

    public void insertionSort() {
        int position;
        E keyElement;
        for (int i = 1; i < size(); i++) {
            keyElement = get(i);
            position = i;

            while (position > 0 && ((Comparable) get(position - 1)).compareTo(keyElement) > 0) {
                E elementAtPositionMinusOne = get(position - 1);
                set(position, elementAtPositionMinusOne);
                position = position - 1;
            }
            set(position, keyElement);
        }
    }

    public void betterBubble() {
        Comparable elemAtJ;  //making use of the Comparable interface
        Comparable elemAtJplus;

        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size() - 1 - i; j++) {
                elemAtJ = (Comparable) get(j); //getting the items at the required indexes
                elemAtJplus = (Comparable) get(j + 1); //casting them to compare them

                if (elemAtJ.compareTo(elemAtJplus) > 0) {
                    swap(j, j + 1); //you write that method
                }

            }
        }
    }

    //swap method based on the pseudocode from notes
    private void swap(int position1, int position2) {
        //temp holders for elements
        //remove and add your elements to the correct positions
        E tempObj1 = get(position1);
        set(position1, get(position2));
        set(position2, tempObj1);

    }

    public void simpleBubble() {
        Comparable elemAtI;  //making use of the Comparable interface
        Comparable elemAtIplus;
        boolean moreSwaps = true;
        while (moreSwaps == true) {
            moreSwaps = false;

            for (int i = 0; i < size() - 1; i++) {
                elemAtI = (Comparable) get(i); //getting the items at the required indexes
                elemAtIplus = (Comparable) get(i + 1); //casting them to compare them

                if (elemAtI.compareTo(elemAtIplus) > 0) {
                    swap(i, i + 1); //you write that method
                    moreSwaps = true;
                }
            }
        }
    }
}
