/***************************************************************
 * File Name     : ChatClientx.java
 * Description   : This Java program implements the client-side of a 
 *                 simple chat messenger using TCP sockets. It connects 
 *                 to the server and allows two-way communication 
 *                 until the user types "end".
 * Package       : (default)
 * Date          : 26/06/2025
 * Author        : Shreya Siddharth Sasane
 ***************************************************************/

import java.net.*;
import java.io.*;

class ChatClientx {

    /***************************************************************
     * Function Name : main
     * Description   : Entry point of the chat client. It establishes a socket 
     *                 connection to the server, sends messages entered by the user,
     *                 and prints responses from the server.
     * Parameters    : [String[] A] - Command-line arguments (unused)
     * Date          : 26/06/2025
     * Author        : Shreya Siddharth Sasane
     ***************************************************************/
    public static void main(String A[]) throws Exception {
        System.out.println("Client is ready to connect with server");

        // Establish connection to server at localhost on port 4200
        Socket sobj = new Socket("localhost", 4200);
        System.out.println("Marvellous client is successfully connected with server");

        // Output stream to send data to the server
        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        // Input stream to read data from server
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Input stream to read data from user
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------------------------------------------------");
        System.out.println("Marvellous Chat Messenger is ready to use");
        System.out.println("------------------------------------------------------");

        String str1 = null, str2 = null;

        // Chat loop: continue until user types "end"
        while (!(str1 = bobj2.readLine()).equals("end")) {
            pobj.println(str1);  // Send message to server
            str2 = bobj1.readLine();  // Read server response
            System.out.println("Server says : " + str2);
            System.out.println("Enter message for server : ");
        }

        // Optional: close resources (can be added if needed)
        // sobj.close(); bobj1.close(); bobj2.close(); pobj.close();
    }
}
