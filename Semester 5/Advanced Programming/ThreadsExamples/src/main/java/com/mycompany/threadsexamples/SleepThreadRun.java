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
public class SleepThreadRun implements Runnable {
  public String name;
  
  SleepThreadRun(String threadName) {
    name = threadName;
  }

  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(this.name + ": " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(this.name + " Interrupted");
    }
    System.out.println(this.name + " exiting");
  }
  
  public String getName()
  {
      return this.name;
  }
}
