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

    public static int mult(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }

    public static int div(int a, int b) {
        int c = a / b;
        System.out.println(c);
        return c;
    }

    public static int min(int a, int b) {
        int c = a - b;
        System.out.println(c);
        return c;
    }
      
    public static double carea(double r){
        double a = (3.14)*(r*r);
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int b = 3, c = 5;
        int a = add(b, c);
        int d = mult(b, c);
        int e = div(b, c);
        int f = min(b, c);
        System.out.println("Hello World!" + a + d + e + f);
        double r = 10;
        double area = carea(r);
        System.out.println("Area of circle is "+area);

    }
}
