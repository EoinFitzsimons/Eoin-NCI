/**
 *
 * @author eoin0
 */
package com.mycompany.eventdescriptionserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventDescriptionServer {
    private static final int PORT = 1234;
    private static DatagramSocket dgramSocket;
    private static List<String> events = Collections.synchronizedList(new ArrayList<>());// List to store the events
    // Main method to open the port and handle the client messages

    public static void main(String[] args) {
        System.out.println("Opening port...\n");
        try {
            dgramSocket = new DatagramSocket(PORT);
            while (true) {
                DatagramPacket inPacket = new DatagramPacket(new byte[256], 256);
                dgramSocket.receive(inPacket);
                new Thread(new ClientHandler(inPacket)).start();
            }
        } catch (SocketException e) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing connection...");
            if (dgramSocket != null && !dgramSocket.isClosed()) {
                dgramSocket.close();
            }
        }
    }

    // This class handles the client messages, it implements the Runnable interface
    // because it will be run in a separate thread
    private static class ClientHandler implements Runnable {
        private DatagramPacket inPacket;

        public ClientHandler(DatagramPacket inPacket) {
            this.inPacket = inPacket;
        }

        // The run method is called when the thread is started
        @Override
        public void run() {
            try {
                InetAddress clientAddress = inPacket.getAddress();
                int clientPort = inPacket.getPort();
                String messageIn = new String(inPacket.getData(), 0, inPacket.getLength());

                String response;
                try {
                    response = handleClientMessage(messageIn);
                } catch (IncorrectActionException e) {
                    response = e.getMessage();
                }
                // Send the response to the client
                DatagramPacket outPacket = new DatagramPacket(response.getBytes(), response.length(), clientAddress,
                        clientPort);
                dgramSocket.send(outPacket);
                // Close the connection if the message is 'STOP'
                if (messageIn.equalsIgnoreCase("STOP")) {
                    dgramSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // This method handles the client message and returns the response
        private String handleClientMessage(String message) throws IncorrectActionException {
            String[] parts = message.split(" - ");// Split the message into parts using ' - ' as the delimiter
            if (parts.length < 4) {// Check if the message has at least 4 parts
                throw new IncorrectActionException(// Custom exception class to handle incorrect actions
                        "Invalid message format. Use 'add - YYYYMMDD - HHMM - Description' or 'remove - YYYYMMDD - HHMM - Description'.");
            }

            String action = parts[0].trim();// Get the action part of the message
            String date = parts[1].trim();// Get the date part of the message
            String time = parts[2].trim();// Get the time part of the message
            String description = parts[3].trim();// Get the description part of the message and remove leading/trailing
                                                 // spaces

            String timePattern = "([01][0-2]|2[0-3])[0-5][0-9]";// Regular expression to validate the time format

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");// Date formatter for 'YYYYMMDD'
            try {
                LocalDate.parse(date, dateFormatter);// Check if the date is in the correct format using the formatter
                                                     // and parse method
            } catch (DateTimeParseException e) {
                throw new IncorrectActionException("Invalid date format. Ensure the date is valid and use 'YYYYMMDD'.");
            }

            if (!time.matches(timePattern)) {
                throw new IncorrectActionException("Invalid time format. Use 'HHMM' within the 0000-2359 range.");
            }
            // Create the event string using the date, time, and description
            String event = date + " - " + time + " - " + description;
            synchronized (events) {// Synchronize the events list to prevent concurrent modification
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
                        throw new IncorrectActionException("Unknown action. Use 'add' or 'remove'.");
                }
            }
        }

        // This method returns the events on a specific date
        private String getEventsOnDate(String date) {
            StringBuilder sb = new StringBuilder();// Create a string builder to store the events
            synchronized (events) {
                for (String event : events) {// Iterate through the events list
                    if (event.startsWith(date)) {
                        sb.append(event).append("; ");// Append the event to the string builder
                    }
                }
            }
            return sb.length() > 0 ? sb.toString() : "No events found on this date.";// Return the message if no events
                                                                                     // are found
        }
    }
}