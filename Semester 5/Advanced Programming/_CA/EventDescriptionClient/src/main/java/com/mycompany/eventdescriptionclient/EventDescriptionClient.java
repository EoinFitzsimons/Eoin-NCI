package com.mycompany.eventdescriptionclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class EventDescriptionClient {

    private static InetAddress host;
    private static final int PORT = 1234;
    private static DatagramSocket dgramSocket;
    private static DatagramPacket inPacket, outPacket;
    private static byte[] buffer;

    public static void main(String[] args) {
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host ID not found!");
            System.exit(1);
        }
        run();
    }

    private static void run() {
        try {
            dgramSocket = new DatagramSocket(); // Step 1.
            // Set up stream for keyboard entry...
            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));
            String message = null;
            String response = null;

            do {
                System.out.println("Enter a detailed message in the format 'add; YYYYMMDD; HHMM; Description' or 'remove; YYYYMMDD; HHMM; Description'. Use 'STOP' to close the connection: ");
                message = userEntry.readLine();
                outPacket = new DatagramPacket(message.getBytes(), message.length(), host, PORT); // Step 2.
                dgramSocket.send(outPacket); // Step 3.

                if (!message.equals("STOP")) {
                    buffer = new byte[256]; // Step 4.
                    inPacket = new DatagramPacket(buffer, buffer.length); // Step 5.
                    dgramSocket.receive(inPacket); // Step 6.
                    response = new String(inPacket.getData(), 0, inPacket.getLength()); // Step 7.
                    System.out.println("\nSERVER> " + response);
                }

            } while (!message.equals("STOP"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nClosing connection...");
            dgramSocket.close(); // Step 8.
        }
    }

}
