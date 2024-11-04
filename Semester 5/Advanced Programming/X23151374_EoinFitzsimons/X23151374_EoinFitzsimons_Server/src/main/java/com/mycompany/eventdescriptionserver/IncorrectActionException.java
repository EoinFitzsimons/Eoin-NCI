/**
 *
 * @author eoin0
 */
package com.mycompany.eventdescriptionserver;

// Custom Exception Class
public class IncorrectActionException extends Exception {

    public IncorrectActionException(String message) {
        super(message); // This calls the Exception class constructor with the message
    }
}
