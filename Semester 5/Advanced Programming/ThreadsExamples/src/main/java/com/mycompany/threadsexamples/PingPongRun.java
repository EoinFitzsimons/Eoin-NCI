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
public class PingPongRun implements Runnable{
  private String word;
  private int delay;

  public PingPongRun(String whatToSay, int delayTime) {
    this.word = whatToSay;
    this.delay = delayTime;
  }
  @Override
  public void run()
  {
     try {
      while (true) {
        System.out.println(this.word + " ");
        Thread.sleep(this.delay);
      }
    } 
    catch (InterruptedException e) {
      return;
    }
  }
      
}
