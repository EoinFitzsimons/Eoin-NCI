/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackexceptionsexample;

/**
 *
 * @author razi
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MyStack {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Banana");
        data.add("Kiwi");
        data.add("Orange");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an index position for an element in ArrayList: ");
        int index = input.nextInt();

        try {
            if (index < 0) {
                throw new StackUnderflow();
            } 
            else if (index > data.size()-1) {
                throw new StackOverflow();
            }
            System.out.println("The element is " + data.get(index));
        } 
        catch (StackUnderflow | StackOverflow e) {
            System.out.println(e.getStackMsg());
        }
    }
}
