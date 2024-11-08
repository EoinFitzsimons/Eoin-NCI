package Transport_Tuesday05;
/** @author Eugene */
/*TCP (Transmission Control Protocol) is a connection-oriented protocol
that guarantees reliable data transfer. 
It ensures that packets arrive in order, handles
retransmissions if packets are lost, and maintains 
a continuous connection until terminated.

*/
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Establish a connection to the server on localhost at port 6789
            Socket socket = new Socket("localhost", 6789);

            // Set up an output stream to send data to the server
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Message to send to the server
            String message = "Hello from TCP Client!";
            
            // Send the message through the output stream
            out.writeUTF(message);
            System.out.println("Message sent: " + message);

            // Close the output stream and the socket
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*Socket("localhost", 6789): Establishes a TCP connection 
to the server at localhost on port 6789.
DataOutputStream: Used to send data over the established
socket connection.
out.writeUTF(message): Sends a UTF-encoded string to the server.
socket.close(): Closes the socket connection.

*/