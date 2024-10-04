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
public class ThreadPriorityTest {
  public static void main (String args[])
    {
        ThreadPriority t1 = new ThreadPriority ();
        ThreadPriority t2 = new ThreadPriority ();
        
        t1.setPriority (Thread.MIN_PRIORITY);
        t1.start ();
        t2.start ();
        

    }  
}
