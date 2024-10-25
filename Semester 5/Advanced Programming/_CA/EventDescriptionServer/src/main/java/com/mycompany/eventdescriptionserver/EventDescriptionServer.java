package com.mycompany.eventdescriptionserver;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;

public class EventDescriptionServer {
    private static final int PORT = 1234;
    private static DatagramSocket dgramSocket;
    private static DatagramPacket inPacket, outPacket;
    private static byte[] buffer;
    private static ArrayList<String> events = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Opening port...\n");
        try {
            dgramSocket = new DatagramSocket(PORT);  // Step 1.
        } catch (SocketException e) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        }
        run();
    }

    private static void run() {
        try {
            while (true) {
                buffer = new byte[256];  // Step 2.
                inPacket = new DatagramPacket(buffer, buffer.length);  // Step 3.
                dgramSocket.receive(inPacket);  // Step 4.
                InetAddress clientAddress = inPacket.getAddress();
                int clientPort = inPacket.getPort();

                String messageIn = new String(inPacket.getData(), 0, inPacket.getLength());

                // Handle the message
                String response = handleClientMessage(messageIn);

                // Send the response back to the client
                outPacket = new DatagramPacket(response.getBytes(), response.length(), clientAddress, clientPort);
                dgramSocket.send(outPacket);  // Step 5.

                if (messageIn.equalsIgnoreCase("STOP")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing connection...");
            dgramSocket.close();  // Step 6.
        }
    }

    private static String handleClientMessage(String message) {
    String[] parts = message.split(";");
    if (parts.length < 4) {
        return "Error: Invalid message format. Use 'add; DATE; TIME; Description' or 'remove; DATE; TIME; Description'.";
    }

    String action = parts[0].trim();
    String date = parts[1].trim();
    String time = parts[2].trim();
    String description = parts[3].trim();
    String event = date + "; " + time + "; " + description;

    switch (action) {
        case "add":
            events.add(event);
            return "Events on " + date + ": " + getEventsOnDate(date);
        case "remove":
            events.remove(event);
            return "Events on " + date + ": " + getEventsOnDate(date);
        case "STOP":
            return "TERMINATE";
        default:
            return "Error: Unknown action. Use 'add' or 'remove'.";
    }
}


    private static String getEventsOnDate(String date) {
        StringBuilder sb = new StringBuilder();
        for (String event : events) {
            if (event.startsWith(date)) {
                sb.append(event).append("; ");
            }
        }
        return sb.toString();
    }
}
