/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstempgui;

/**
 *
 * @author EThornbury
 */
public class FloorStaff extends Employee{
    private int hours;
    private double rate;

    public FloorStaff() {
    }

    public FloorStaff(int hours, double rate, String name, String id) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return super.toString()+ " FloorStaff{ " + "hours=" + hours + ", rate=" + rate + '}';
    }
    
    
}
