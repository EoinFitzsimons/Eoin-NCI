/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calc;

/**
 *
 * @author tj
 */
public class Calc {

    public static int add(int a, int b) {

        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        int b = 3, c = 5;
        int a = add(b, c);
        System.out.println("Hello World!" + a);

    }
}
