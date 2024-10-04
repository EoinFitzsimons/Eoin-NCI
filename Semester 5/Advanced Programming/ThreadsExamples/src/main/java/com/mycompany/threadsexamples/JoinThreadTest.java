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
public class JoinThreadTest {
  public static void main(String args[]) {
    JoinThreadRun worker1 = new JoinThreadRun("One");
    JoinThreadRun worker2 = new JoinThreadRun("Two");
    JoinThreadRun worker3 = new JoinThreadRun("Three");
    
    Thread t1 = new Thread(worker1, worker1.name);
    System.out.println("New thread: " + t1.getName());
    t1.start();
    
    Thread t2 = new Thread(worker2, worker2.name);
    System.out.println("New thread: " + t2.getName());
    t2.start();
    
    Thread t3 = new Thread(worker3, worker3.name);
    System.out.println("New thread: " + t3.getName());
    t3.start();

    System.out.println("Thread One is alive: " + t1.isAlive());
    System.out.println("Thread Two is alive: " + t2.isAlive());
    System.out.println("Thread Three is alive: " + t3.isAlive());

    try {
      System.out.println("Waiting for threads to finish");
      t1.join();
      t2.join();
      t3.join();
    } 
    catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }

    System.out.println("Thread One is alive: " + t1.isAlive());
    System.out.println("Thread Two is alive: " + t2.isAlive());
    System.out.println("Thread Three is alive: " + t3.isAlive());

    System.out.println("Main thread exiting");
  }
}
