/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcpechoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author eoin0
 */
public class ClientThread implements Runnable {

    String name;
    Socket link = null;

    public ClientThread(String name, Socket link) {
        this.name = name;
        this.link = link;
    }

    @Override
    public void run() {
                             //Step 2.
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream())); //Step 3.
            PrintWriter out = new PrintWriter(link.getOutputStream(), true); //Step 3.

            String message = in.readLine();         //Step 4.
            System.out.println("Message received from client: " + name + "  " + message);
            out.println("Echo Message: " + message);     //Step 4.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection... *");
                link.close();				    //Step 5.
            } catch (IOException e) {
                System.out.println("Unable to disconnect!");
                System.exit(1);
            }
        }
    }
}
