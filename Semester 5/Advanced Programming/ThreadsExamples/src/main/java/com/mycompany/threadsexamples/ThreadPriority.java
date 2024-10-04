/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threadsexamples;

/**
 *
 * @author razi
 */
public class ThreadPriority extends Thread {
    public void run()
    {
      System.out.println ("running thread name is:" + this.getName ());
      System.out.println ("running thread priority is:" + this.getPriority ());
    }
    
}
