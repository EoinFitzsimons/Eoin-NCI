/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package betterbubble;

/**
 *
 * @author eoin0
 */
/*
*
*MyArrayList.java
 */
import java.util.ArrayList;

public class MyArrayList<ElemType> extends ArrayList<ElemType> {

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
        ElemType tempObj1 = get(position1);
        set(position1, get(position2));
        set(position2, tempObj1);

    }

//    //simpleBubble() method based on the pseudo code in the notes
//    moreSwaps = true;
//    while moreSwaps is equal to true{moreSwaps = false;
//    for x = 0  up to numOfElements-1 do:{
//         if elementAt(x) > elementAt(x+1){
//               swap(elementAt(x),elementAt(x+1))
//               moreSwaps = true;      
//         }
//    }
//} 
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
