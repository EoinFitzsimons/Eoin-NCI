package com.mycompany.tcpudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");

            for (int i = 0; i < 5; i++) {
                String message = "Hello from UDP Client! Message " + (i + 1);
                byte[] buffer = message.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ip, 9876);

                boolean acknowledged = false;
                int attempts = 0;
                while (!acknowledged && attempts < 5) {
                    socket.send(packet);
                    System.out.println("Message sent: " + message + ", Attempt: " + (attempts + 1));

                    byte[] bufferreply = new byte[1024];
                    DatagramPacket packetreply = new DatagramPacket(bufferreply, bufferreply.length);

                    socket.setSoTimeout(1000); // Set a timeout of 1 second
                    try {
                        socket.receive(packetreply);
                        String reply = new String(packetreply.getData(), 0, packetreply.getLength());
                        System.out.println("Reply received: " + reply);
                        acknowledged = true;
                    } catch (Exception e) {
                        System.out.println("No acknowledgment received, resending...");
                        attempts++;
                        Thread.sleep(500);
                    }
                }

                if (!acknowledged) {
                    System.out.println("Failed to receive acknowledgment after 5 attempts");
                }

                Thread.sleep(500);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
