/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionsexamples;

/**
 *
 * @author razi
 */
public class DivideOperation {
    public static void main(String[] args) {
        int numerator = 10;
        //int denominator = 2;
        int denominator = 0;

        try {
            System.out.print(numerator+" divided by "+denominator+" = ");
            System.out.println(DivideOperation.division(numerator, denominator));
        } catch (ArithmeticException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    private static float division(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
