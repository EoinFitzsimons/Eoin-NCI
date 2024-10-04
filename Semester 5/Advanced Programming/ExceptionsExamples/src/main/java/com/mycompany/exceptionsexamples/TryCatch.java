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
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int denominator = 0;
        System.out.println("Enter an integer number:");
        
        try { 
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();
            
            System.out.println( number / denominator );
            System.out.println( "This text will not be shown");
        } 
        catch(ArithmeticException e)
        {
            System.out.println( e.getMessage());
        } 
        catch(InputMismatchException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            System.out.println("This text will be shown NOW");
        }
    }
}
