/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author eoin0
 */
public class Cleaner extends Employee {

    private double hourly, weekly;
    private int hours;

    public Cleaner(double hourly, int hours, String name, String id, String dob) {
        super(name, id, dob);
        this.hourly = hourly;
        this.hours = hours;
    }

    public Cleaner() {
        super();
        hourly = 0;
    }

    @Override
    public String details() {
        //super.details() this picks up from the parent class method
        return super.details() + ", rate: " + hourly;
    }

    /*    public void computeWeeklyPay() {
    weekly = hours * hourly;
    }*/

    public double getHourly() {
        return hourly;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWeekly() {
        return weekly;
    }

    public void setWeekly(double weekly) {
        this.weekly = weekly;
    }

}
