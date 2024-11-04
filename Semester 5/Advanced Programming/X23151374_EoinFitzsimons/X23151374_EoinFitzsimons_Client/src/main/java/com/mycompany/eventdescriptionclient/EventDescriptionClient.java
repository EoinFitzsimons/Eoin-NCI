/**
 *
 * @author eoin0
 */
package com.mycompany.eventdescriptionclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

// Client class to handle the user input
public class EventDescriptionClient {
    // Variables to set up the client
    private static InetAddress host;
    private static final int PORT = 1234;
    private static DatagramSocket dgramSocket;
    private static DatagramPacket inPacket, outPacket;
    private static byte[] buffer;

    // Main method to get the host and run the client
    public static void main(String[] args) {
        try {
            host = InetAddress.getLocalHost(); // Initialize host here
        } catch (UnknownHostException e) {
            System.out.println("Host ID not found!");
            System.exit(1);
        }
        run();
    }

    // Method to run the client
    private static void run() {
        try {
            dgramSocket = new DatagramSocket();
            // Create a DatagramSocket object to send and receive DatagramPackets
            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));
            String message = null;
            String response = null;
            // Do-while loop to send and receive messages
            do {
                System.out.println(
                        "Enter a detailed message in the format 'add - YYYYMMDD - HH:MM - Description' or 'remove - YYYYMMDD - HH:MM - Description'. Use 'STOP' to close the connection: ");
                message = userEntry.readLine();
                outPacket = new DatagramPacket(message.getBytes(), message.length(), host, PORT);
                dgramSocket.send(outPacket);
                // If the message is not 'STOP', receive the response from the server
                if (!message.equals("STOP")) {
                    buffer = new byte[256];
                    inPacket = new DatagramPacket(buffer, buffer.length);
                    dgramSocket.receive(inPacket); // Step 6.
                    response = new String(inPacket.getData(), 0, inPacket.getLength());
                    System.out.println("\nSERVER> " + response);
                }
                // End the loop if the message is 'STOP'
            } while (!message.equals("STOP"));
        } catch (IOException e) {
            e.printStackTrace();// Print the stack trace if an exception occurs
        } finally {
            System.out.println("\nClosing connection...");
            dgramSocket.close(); // Close the connection
        }
    }
}
