/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eoin0
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        boolean v = false;

        do {
            try {
                System.out.print("Enter the first integer: ");
                a = scanner.nextInt();
                v = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        } while (!v);

        v = false; // Reset

        do {
            try {
                System.out.print("Enter the second integer: ");
                b = scanner.nextInt();
                v = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        } while (!v);

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
    }
}
