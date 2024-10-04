/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holidaybooking;

/**
 *
 * @author eoin0
 */
public class Hotel extends Booking {

    private int roomNumber, fee;
    private int breakfast;

    public Hotel(int roomNumber, int breakfast, String name, String bookingReference, String startDate, int duration) {
        super(name, bookingReference, startDate, duration);
        this.roomNumber = roomNumber;
        this.breakfast = breakfast;
    }

    public Hotel() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public void computeFee() {
        fee = ((130 * getDuration()) + (getBreakfast() * getDuration()));
    }

    public int getFee() {
        return fee;
    }

}
