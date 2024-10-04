/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mergesort;

import java.util.ArrayList;

/**
 *
 * @author eoin0
 */
public class MyArrayList<E> extends ArrayList<E> {

    public void mergeSort(int start, int end) {
        int mid;
        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    public void merge(int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = 0;
        
        ArrayList<E> temp = new ArrayList<>();
        while(i <= m && j <= r){
            if(((Comparable)get(i)).compareTo((Comparable)get(j))<0){
                temp.add(k,get(i));
                i++;
            }else{
                temp.add(k,get(j));
                j++;
            }
            k++;
        }
        while(i<=m){
            temp.add(k,get(i));
            k++;
            i++;
        }
        while(j<=r){
            temp.add(k,get(j));
            k++;
            j++;
        }
        for(i=l,k=0;i<=r;i++,k++){
            set(i,(E)temp.get(k));
        }
    }
}
