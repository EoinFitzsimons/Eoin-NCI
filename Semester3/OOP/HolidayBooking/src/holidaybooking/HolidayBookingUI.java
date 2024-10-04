/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holidaybooking;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class HolidayBookingUI {
    //private Booking bookings[]; //declared my array of objs

    private ArrayList<Booking> bookings; //declare
    // private int count;

    public HolidayBookingUI() {
        bookings = new ArrayList<>();  //create my array of objs to hold 5
        //count = 0;
    }

    public void menu() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1: add, 2:print"));
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                remove();
                break;
            default:
                break;
        }
    }

    public void add() {
        //ask which is to be added
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to add Hotel, 2 to add Floor Staff, 3:search, 4:remove"));
        //if manager or floor staff
        if (type == 1) {
            //get relevant details
            Hotel tempH = new Hotel();
            tempH.setName(JOptionPane.showInputDialog(null, "Enter your name"));
            tempH.setBookingReference(JOptionPane.showInputDialog(null, "Enter booking reference"));
            tempH.setStartDate(JOptionPane.showInputDialog(null, "Enter start date"));
            tempH.setDuration(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of days you'll stay")));
            tempH.setRoomNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter room number")));
            //https://stackoverflow.com/questions/8396870/joptionpane-yes-or-no-window?rq=3
            int ansBreak = JOptionPane.showConfirmDialog(
                    null,
                    "Would you like breakfast?",
                    "Breakfast is €10 per night",
                    JOptionPane.YES_NO_OPTION);

            if (ansBreak == JOptionPane.YES_OPTION) { //for multiplying with amount of days
                JOptionPane.showMessageDialog(null, "Breakfast is served at 8am til 11am");
                tempH.setBreakfast(10);
            } else {
                JOptionPane.showMessageDialog(null, "Please note the restaraunt is closed until 11am");
                tempH.setBreakfast(1);
            }

            bookings.add(tempH);

        } else if (type == 2) {
            //get relevant details
            Cottage tempC = new Cottage();
            tempC.setName(JOptionPane.showInputDialog(null, "Enter your name"));
            tempC.setBookingReference(JOptionPane.showInputDialog(null, "Enter booking reference"));
            tempC.setStartDate(JOptionPane.showInputDialog(null, "Enter start date"));
            tempC.setDuration(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of days you'll stay")));

            //add to array at the index of count
            bookings.add(tempC);
//            bookings[count] = tempFS;
//            //count ++
//            count++;
        }
    }

    public void search() {
        //if count =0 nothing to search
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No bookings in system to search");
        } else {
            //else need to search, we will use id as a searchterm
            //loop over the array of objs
            //get the id and see if it eaquals the search term
            //if it does then display
            String searchterm = JOptionPane.showInputDialog(null, "Enter id to search");
            for (int i = 0; i < bookings.size(); i++) {
                if (bookings.get(i).getBookingReference().equalsIgnoreCase(searchterm)) {
                    JOptionPane.showMessageDialog(null, bookings.get(i).details());
                }
            }
        }
    }//end search()

    public void print() {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No bookings to print");
        } else {
            for (int i = 0; i < bookings.size(); i++) {
                Booking tempB = bookings.get(i);
                if (tempB instanceof Hotel) {
                    //display those details
                    tempB.computeFee();
                    JOptionPane.showMessageDialog(null, "Hello " + tempB.getName() + ", Booking Reference:" + tempB.getBookingReference() + ", we will see you on " + tempB.getStartDate() + " for " + tempB.getDuration() + " days. We hope you enjoy your stay in room " + ((Hotel)tempB).getRoomNumber());
                    JOptionPane.showMessageDialog(null, "Your total fee is " + ((Hotel)tempB).getFee());
                } else if (tempB instanceof Cottage) {
                    //display those details
                    JOptionPane.showMessageDialog(null, "Hello " + tempB.getName() + ", Booking Reference:" + tempB.getBookingReference() + ", we will see you on " + tempB.getStartDate() + " for " + tempB.getDuration() + " days. We hope you enjoy your stay at " + ((Cottage)tempB).getAddress() + ". Remember to collect your key at location " + ((Cottage)tempB).getKeyCollection() + ".");
                    JOptionPane.showMessageDialog(null, "Your total fee is " + ((Cottage)tempB).getFee());
                }

            }//for loop
        }//if statement
    }//end method

    public void remove() {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(null, "nothing to remove.");
        } else {
            String searchterm = JOptionPane.showInputDialog(null, "Enter ID to search.");
            for (int i = 0; i < bookings.size(); i++) {
                if (bookings.get(i).getBookingReference().equalsIgnoreCase(searchterm)) {
                    bookings.remove(i);
                    JOptionPane.showMessageDialog(null, "Booking has been removed");
                }
            }
        }
    }
}
