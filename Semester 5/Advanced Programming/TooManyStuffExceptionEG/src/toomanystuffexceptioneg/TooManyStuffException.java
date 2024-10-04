/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toomanystuffexceptioneg;

/**
 *
 * @author eoin0
 */
public class TooManyStuffException extends Exception {

    String msg = "Too many stuff!";

    public TooManyStuffException() {
    }

    public TooManyStuffException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getTooManyMessages() {
        return this.msg;
    }
}
