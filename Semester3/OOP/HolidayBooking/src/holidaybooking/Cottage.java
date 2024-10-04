/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holidaybooking;

/**
 *
 * @author eoin0
 */
public class Cottage extends Booking {

    private String address;
    private char keyCollection;
    private int fee;

    public Cottage(String address, char keyCollection, String name, String bookingReference, String startDate, int duration) {
        super(name, bookingReference, startDate, duration);
        this.address = address;
        this.keyCollection = keyCollection;
    }

    public Cottage() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getKeyCollection() {
        return keyCollection;
    }

    public void setKeyCollection(char keyCollection) {
        this.keyCollection = keyCollection;
    }

    @Override
    public void computeFee() {
        fee = (50 + (60 * getDuration()));
    }

    public int getFee() {
        return fee;
    }
}
