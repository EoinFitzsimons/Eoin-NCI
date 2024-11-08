package com.mycompany.tcpudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Random;

public class UDPReceiver {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            Random random = new Random();
            System.out.println("UDP Server is waiting for incoming messages...");

            while (true) {
                socket.receive(packet);
                if (random.nextBoolean()) {
                    // Simulate packet loss by ignoring 50% of the messages
                    System.out.println("Packet dropped");
                    continue;
                }

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Message received: " + message);

                String reply = "Acknowledgment from UDP Receiver!";
                byte[] bufferreply = reply.getBytes();
                DatagramPacket packetreply = new DatagramPacket(bufferreply, bufferreply.length, packet.getAddress(), packet.getPort());
                socket.send(packetreply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
