package Transport_Tuesday05;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket to receive packets on port 9876
            DatagramSocket socket = new DatagramSocket(9876);

            // Buffer to store incoming data
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("UDP Server is waiting for incoming messages...");

            // Receive the incoming packet
            socket.receive(packet);

            // Convert received data into a string
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Message received: " + message);

            // Close the socket after receiving the message
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*DatagramSocket(9876): Opens a UDP socket on port 9876 to listen 
for incoming packets.
byte[] buffer: Allocates a buffer to store incoming data.
DatagramPacket(packet): Holds the data and sender information.
socket.receive(packet): Blocks and waits for an incoming packet.
packet.getData(): Retrieves the message data, and packet.getLength() 
specifies its length.
socket.close(): Closes the socket after receiving the packet.
*/