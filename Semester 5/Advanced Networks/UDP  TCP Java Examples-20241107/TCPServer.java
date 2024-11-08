package Transport_Tuesday05;
/** * @author Eugene */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket that listens on port 6789
            ServerSocket serverSocket = new ServerSocket(6789);

            System.out.println("TCP Server is waiting for a client connection...");

            // Accept an incoming connection from a client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Set up an input stream to receive data from the client
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());

            // Read and print the message received from the client
            String message = in.readUTF();
            System.out.println("Message received: " + message);

            // Close the input stream, client socket, and server socket
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*ServerSocket(6789): Creates a TCP server that listens on port 6789.
serverSocket.accept(): Waits for an incoming client connection.
DataInputStream: Used to read data from the client connection.
in.readUTF(): Reads a UTF-encoded message sent by the client.
clientSocket.close(): Closes the client connection.
serverSocket.close(): Closes the server socket.
*/