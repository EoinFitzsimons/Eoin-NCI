package Transport_Tuesday05;

/*UDP (User Datagram Protocol) is a connectionless protocol 
that doesn’t guarantee message delivery. 
This means that packets are sent independently,
without establishing a persistent connection, 
and may arrive out of order or get lost entirely.

 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        try {
            // Create a DatagramSocket to send data packets
            DatagramSocket socket = new DatagramSocket();

            // Define the IP address of the server (localhost in this case)
            InetAddress ip = InetAddress.getByName("localhost");

            // Message to be sent as a byte array
            String message = "Hello from UDP Client!";
            byte[] buffer = message.getBytes();

            // Create a DatagramPacket with the message, destination IP, and port
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ip, 9876);

            // Send the packet through the socket
            socket.send(packet);
            System.out.println("Message sent: " + message);

            // Close the socket after sending
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*Explanation:

DatagramSocket: Creates a UDP socket that can send packets.
InetAddress.getByName("localhost"): Gets the IP address of the server. 
Here, it's localhost, so it will connect to the same machine.
DatagramPacket: Encapsulates the data (buffer), the data length, 
the server's IP address, and the port number (9876).
socket.send(packet): Sends the packet to the specified server.
socket.close(): Closes the socket.
*/
