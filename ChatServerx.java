/***************************************************************
 * File Name     : ChatServerx.java
 * Description   : This Java program implements the server-side of a 
 *                 simple chat messenger using TCP sockets. It waits 
 *                 for a client to connect and facilitates two-way 
 *                 communication over the network.
 * Package       : (default)
 * Date          : 26/06/2025
 * Author        : Shreya Siddharth Sasane
 ***************************************************************/

import java.net.*;
import java.io.*;

class ChatServerx {

    /***************************************************************
     * Function Name : main
     * Description   : Entry point for the chat server. It opens a 
     *                 ServerSocket on port 4200, accepts a client 
     *                 connection, and starts a chat loop.
     * Parameters    : [String[] A] - Command-line arguments (unused)
     * Date          : 26/06/2025
     * Author        : Shreya Siddharth Sasane
     ***************************************************************/
    public static void main(String A[]) throws Exception {
        // Create server socket listening on port 4200
        ServerSocket ssobj = new ServerSocket(4200);
        System.out.println("Marvellous Server is waiting at port number 4200");

        // Accept incoming client connection
        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server successfully connected with the client");

        // Output stream to send data to client
        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        // Input stream to receive data from client
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Input stream to take input from server operator
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------------------------------------------------");
        System.out.println("Marvellous Chat Messenger is ready to use");
        System.out.println("------------------------------------------------------");

        String str1 = null, str2 = null;

        // Chat loop: read message from client, respond with server input
        while ((str1 = bobj1.readLine()) != null) {
            System.out.println("Client says : " + str1);
            System.out.println("Enter the message for client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }

        // Optional: Close resources
        // sobj.close(); ssobj.close(); bobj1.close(); bobj2.close(); pobj.close();
    }
}
