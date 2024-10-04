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
public class StackOverflow extends StackException {

    public StackOverflow() {
        this.msg = "Overflow";
    }

    public StackOverflow(String msg) {
        super(msg);
    }
}
