package com.mycompany.nistinternettimeserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Connects to the NIST Internet Time Server (`time.nist.gov`) to fetch the current date and time.
 * The application attempts the connection three times, handles possible connection issues with retries, and logs each attempt with the response status.
 * If successful, it prints the current date and time. If unsuccessful after all attempts, it displays a failure message to the user.
 * 
 * @author: Eoin Fitzsimons
 * Date: 05/12/2024
 */
public class NISTInternetTimeServer {

    // Constants
    private static final String TIME_SERVER_HOST = "time.nist.gov";
    private static final int TIME_SERVER_PORT = 13; // Port for Daytime Protocol
    private static final int MAX_RETRIES = 3; // Maximum number of connection attempts
    private static final int RETRY_DELAY_MS = 3000; // Delay between retries (in milliseconds)

    public static void main(String[] args) {
        int attemptCount = 0;
        boolean connectionSuccessful = false;

        // Attempt to connect to the time server up to MAX_RETRIES times
        while (attemptCount < MAX_RETRIES && !connectionSuccessful) {
            attemptCount++;
            System.out.println("Attempt " + attemptCount + ": Connecting to " + TIME_SERVER_HOST + "...");

            try (Socket socket = new Socket(TIME_SERVER_HOST, TIME_SERVER_PORT);
                 BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                // Read the response from the time server
                String serverResponse;
                while ((serverResponse = inputReader.readLine()) != null) {
                    System.out.println("Server Response: " + serverResponse);
                }

                // Mark the connection as successful
                connectionSuccessful = true;

            } catch (UnknownHostException e) {
                System.err.println("Attempt " + attemptCount + ": Unknown host. Could not resolve server address.");
            } catch (Exception e) {
                System.err.println("Attempt " + attemptCount + ": Connection failed. Error: " + e.getMessage());
            }

            // Wait before retrying if connection was unsuccessful
            if (!connectionSuccessful && attemptCount < MAX_RETRIES) {
                System.out.println("Retrying in " + (RETRY_DELAY_MS / 1000) + " seconds...");
                try {
                    Thread.sleep(RETRY_DELAY_MS);
                } catch (InterruptedException e) {
                    System.err.println("Retry delay interrupted: " + e.getMessage());
                }
            }
        }

        // Final message based on connection status
        if (connectionSuccessful) {
            System.out.println("Successfully fetched the date and time from the server.");
        } else {
            System.out.println("Failed to connect to " + TIME_SERVER_HOST + " after " + MAX_RETRIES + " attempts.");
        }
    }
}
