/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackexceptionsexample;

/**
 *
 * @author razi
 */
public class StackUnderflow extends StackException {
    public StackUnderflow() {
        this.msg = "Underflow";
    }

    public StackUnderflow(String msg) {
        super(msg);
    }
}