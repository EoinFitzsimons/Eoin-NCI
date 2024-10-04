/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tcpechoserver;

import java.io.*;
import java.net.*;

/**
 *
 * @author razi
 */
public class TCPEchoServer {

    private static ServerSocket servSock;
    private static final int PORT = 1234;
    private static int clientConnections = 0;

    public static void main(String[] args) {
        System.out.println("Opening port...\n");
        try {
            servSock = new ServerSocket(PORT);      //Step 1.
        } catch (IOException e) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        }

        do {
            run();
        } while (true);

    }

    private static void run() {
        Socket link = null;                        //Step 2.
        try {
            link = servSock.accept();               //Step 2.
            clientConnections++;
            String clientName = "Client " + clientConnections;
            Runnable resource = new ClientThread(clientName, link);
            Thread t = new Thread(resource);
            t.start();

        } catch (IOException e) {
            e.printStackTrace();

        } // finish run method 
    } // finish the class
}