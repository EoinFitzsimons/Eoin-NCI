package com.mycompany.tcpudp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6789);
            System.out.println("TCP Server is waiting for a client connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());

            boolean terminate = false;
            while (!terminate) {
                String message = in.readUTF();
                if (message.equals("TERMINATE")) {
                    System.out.println("Termination signal received. Closing connection...");
                    terminate = true;
                } else {
                    System.out.println("Message received: " + message);
                }
            }

            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
