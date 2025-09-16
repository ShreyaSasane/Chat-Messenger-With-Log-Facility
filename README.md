===============================================================================
                      Marvellous Chat Messenger (TCP-based)
================================================================================

Project Name   : Marvellous Chat Messenger
Author         : Shreya Siddharth Sasane
Date Created   : 26/06/2025
Language       : Java
Type           : TCP Socket-Based Client-Server Chat Application

--------------------------------------------------------------------------------
📁 File Structure
--------------------------------------------------------------------------------

1. ChatClientx.java
    - Client-side implementation for sending/receiving messages via TCP socket.

2. ChatServerx.java
    - Server-side implementation to accept client connections and communicate.

--------------------------------------------------------------------------------
🔧 How It Works
--------------------------------------------------------------------------------

- The server listens on port 4200 for client connections.
- The client connects to the server at localhost on port 4200.
- After successful connection, both client and server can exchange messages.
- The chat continues until the user types `end` from the client side.

--------------------------------------------------------------------------------
▶️ Execution Instructions
--------------------------------------------------------------------------------

1. **Compile Both Files:**

javac ChatServerx.java
javac ChatClientx.java

markdown
Copy code

2. **Run the Server First:**

java ChatServerx

makefile
Copy code

Output:
Marvellous Server is waiting at port number 4200

arduino
Copy code

3. **Run the Client in a new terminal:**

java ChatClientx

makefile
Copy code

Output:
Marvellous client is successfully connected with server

markdown
Copy code

4. **Start Messaging:**
- You can now chat between client and server.
- Type `end` from the client side to stop the chat.

--------------------------------------------------------------------------------
💬 Sample Interaction
--------------------------------------------------------------------------------

Client Terminal:
Client is ready to connect with server
Marvellous client is successfully connected with server
Marvellous Chat Messenger is ready to use
Hello Server!
Server says: Hello Client!
Enter message for server:
end

arduino
Copy code

Server Terminal:
Marvellous Server is waiting at port number 4200
Marvellous Server successfully connected with the client
Marvellous Chat Messenger is ready to use
Client says: Hello Server!
Enter the message for client:
Hello Client!

pgsql
Copy code

--------------------------------------------------------------------------------
📦 Features
--------------------------------------------------------------------------------

✅ Simple and lightweight implementation  
✅ Two-way communication via TCP  
✅ Clean and modular design  
✅ Easy to extend (e.g., for GUI or multiclient support)

--------------------------------------------------------------------------------
⚠️ Notes
--------------------------------------------------------------------------------

- Make sure port 4200 is not being used by another application.
- Both client and server should be run on the same machine (localhost) or 
  ensure proper IP/hostname and firewall settings for network use.
- Current implementation handles a single client at a time.

--------------------------------------------------------------------------------
📞 Contact
--------------------------------------------------------------------------------

Author : Shreya Siddharth Sasane  
Date   : 26/06/2025 

