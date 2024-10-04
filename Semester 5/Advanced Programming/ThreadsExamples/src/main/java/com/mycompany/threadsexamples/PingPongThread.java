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
public class PingPongThread extends Thread {

  private String word;
  private int delay;

  public PingPongThread(String whatToSay, int delayTime) {
    this.word = whatToSay;
    this.delay = delayTime;
  }

  @Override
  public void run() {
    try {
      while (true) {
        System.out.println(this.word + " ");
        Thread.sleep(this.delay);
      }
    } catch (InterruptedException e) {
      return;
    }
  }

  public static void main(String args[]) {
    new PingPongThread("Ping", 33).start();
    new PingPongThread("Pong", 100).start();
  }
}