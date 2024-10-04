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
public class PingPongTest {
    public static void main(String args[]) 
  {
    Runnable ping = new PingPongRun("Ping", 33);
    Runnable pong = new PingPongRun("Pong", 100);
    new Thread(ping).start();
    new Thread(pong).start();
  }
    
}
