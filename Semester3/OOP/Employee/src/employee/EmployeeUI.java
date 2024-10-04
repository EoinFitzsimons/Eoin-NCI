/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class EmployeeUI {

    //private Employee employees[]; //declared my array of objs
    private ArrayList<Employee> employees; //declare
    // private int count;

    public EmployeeUI() {
        employees = new ArrayList<>();  //create my array of objs to hold 5
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
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to add Manager, 2 to add Floor Staff, 3:search, 4:remove"));
        //if manager or floor staff
        if (type == 1) {
            //get relevant details
            Manager tempM = new Manager();
            tempM.setName(JOptionPane.showInputDialog(null, "Enter Manager name"));
            tempM.setId(JOptionPane.showInputDialog(null, "Enter Manager id"));
            tempM.setDob(JOptionPane.showInputDialog(null, "Enter DOB"));
            tempM.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter salary")));
            //add to array at the index of count
            employees.add(tempM);
//            employees[count] = tempM;
//            //count increases 
//            count++;
        } else if (type == 2) {
            //get relevant details
            Cleaner tempC = new Cleaner();
            tempC.setName(JOptionPane.showInputDialog(null, "Enter Floor staff name"));
            tempC.setId(JOptionPane.showInputDialog(null, "Enter id"));
            tempC.setDob(JOptionPane.showInputDialog(null, "Enter DOB"));
            tempC.setHourly(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hour rate")));
            tempC.setHours(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hours")));

            //add to array at the index of count
            employees.add(tempC);
//            employees[count] = tempC;
//            //count ++
//            count++;
        }
    }

    public void search() {
        //if count =0 nothing to search
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employees in system to search");
        } else {
            //else need to search, we will use id as a searchterm
            //loop over the array of objs
            //get the id and see if it eaquals the search term
            //if it does then display
            String searchterm = JOptionPane.showInputDialog(null, "Enter id to search");
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId().equalsIgnoreCase(searchterm)) {
                    JOptionPane.showMessageDialog(null, employees.get(i).details());
                }
            }
        }
    }//end search()

    public void print() {
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employees to print");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                Employee tempE = employees.get(i);
                if (tempE instanceof Manager) {
                    //display those details
                    JOptionPane.showMessageDialog(null, "name: " + tempE.getName() + ", id:" + tempE.getId() + " salary: " + ((Manager) tempE).getSalary());
                } else if (tempE instanceof Cleaner) {
                    //display those details
                    JOptionPane.showMessageDialog(null, tempE.getName() + tempE.getId() + ((Cleaner) tempE).getHourly());
                }

            }//for loop
        }//if statement
    }//end method

    public void remove() {
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "nothing to remove.");
        } else {
            String searchterm = JOptionPane.showInputDialog(null, "Enter ID to search.");
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId().equalsIgnoreCase(searchterm)) {
                    employees.remove(i);
                    JOptionPane.showMessageDialog(null, "Employee has been removed");
                }
            }
        }
    }
    
}