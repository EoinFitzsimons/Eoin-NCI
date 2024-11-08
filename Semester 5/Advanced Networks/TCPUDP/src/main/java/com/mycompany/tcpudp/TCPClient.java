package com.mycompany.tcpudp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6789);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String message = "Hello from TCP Client!";
            out.writeUTF(message);
            System.out.println("Message sent: " + message);

            // Send the termination signal
            out.writeUTF("TERMINATE");
            System.out.println("Termination signal sent");

            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
