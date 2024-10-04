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
public class SleepThreadTest {
    public static void main(String args[]) {
    Runnable r1 = new SleepThreadRun("One");
    Runnable r2 = new SleepThreadRun("Two");
    Runnable r3 = new SleepThreadRun("Three");
    
    Thread t1 = new Thread(r1,((SleepThreadRun)r1).getName());
    System.out.println("New thread: " + t1.getName());
    t1.start();
    
    Thread t2 = new Thread(r2, ((SleepThreadRun)r2).getName());
    System.out.println("New thread: " + t2.getName());
    t2.start();
    
    Thread t3 = new Thread(r3, ((SleepThreadRun)r3).getName());
    System.out.println("New thread: " + t3.getName());
    t3.start();
     
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting");
  }
    
}
