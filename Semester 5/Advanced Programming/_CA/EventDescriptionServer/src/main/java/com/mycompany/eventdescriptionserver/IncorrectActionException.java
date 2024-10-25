/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventdescriptionserver;

/**
 *
 * @author eoin0
 */
// Custom Exception Class
public class IncorrectActionException extends Exception {

    public IncorrectActionException(String message) {
        super(message); // This calls the Exception class constructor with the message
    }
}
