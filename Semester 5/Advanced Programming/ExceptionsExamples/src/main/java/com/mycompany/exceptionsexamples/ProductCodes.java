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
import java.util.Scanner;
public class ProductCodes {
   //---------------------------------------
   //  Counts the number of product codes that are entered with a
   //  zone of R and district greater than 2000.
   //---------------------------------------
   public static void main(String [ ] args) {
      String code;
      char zone;
      int district, valid = 0, banned = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter product code (STOP to quit): ");
      code = scan.nextLine();
      while (!code.equals("STOP")){
         try {
            zone = code.charAt(9);
            district = Integer.parseInt(code.substring(3, 7));
            valid++;
            if (zone == 'R' && district > 2000)
               banned++;
         }
         catch (StringIndexOutOfBoundsException exception) 
         {
            System.out.println("Improper code length: " + code);
         } 
         catch (NumberFormatException exception) 
         {
            System.out.println("District is not numeric: " + code);
         }
        
         System.out.print("Enter product code (STOP to quit): ");
         code = scan.nextLine();
      }
      System.out.println("# of valid codes entered: " + valid);
      System.out.println("# of banned codes entered: " + banned);
   }
}
