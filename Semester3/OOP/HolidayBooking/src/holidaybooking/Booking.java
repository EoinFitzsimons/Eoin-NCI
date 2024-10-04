/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holidaybooking;

/**
 *
 * @author eoin0
 */
public abstract class Booking {

    protected String name, bookingReference, startDate;
    protected int duration;

    public Booking(String name, String bookingReference, String startDate, int duration) {
        this.name = name;
        this.bookingReference = bookingReference;
        this.startDate = startDate;
        this.duration = duration;
    }

    public Booking() {
        name = "";
        bookingReference = "";
        startDate = "";
        duration = 0;
    }

    public abstract void computeFee();
    
    public String details() {
        return "User name: " + name + ", Booking Reference: " + bookingReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
