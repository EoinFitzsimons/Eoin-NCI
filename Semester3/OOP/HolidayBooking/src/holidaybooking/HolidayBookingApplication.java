/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holidaybooking;

import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class HolidayBookingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HolidayBookingUI myUI = new HolidayBookingUI();  //declare and create EmployeeIU obj
        String goAgain;
        do {
            myUI.menu();
            goAgain = JOptionPane.showInputDialog(null, "Enter yes to go back to menu");
        } while (goAgain.equalsIgnoreCase("yes"));
    }
}
