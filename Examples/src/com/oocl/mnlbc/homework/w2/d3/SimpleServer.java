package com.oocl.mnlbc.homework.w2.d3;

import java.net.*;
import java.io.*;

public class SimpleServer {
  public static void main(String args[]) {
    ServerSocket s = null;

    // Register your service on port 5432
    try {
      s = new ServerSocket(543);
    } catch (IOException e) {
      // ignore
    }

   // Run the listen/accept loop forever
    while (true) {
      try {
        // Wait here and listen for a connection
        Socket s1 = s.accept();

        // Get output stream associated with the socket
        OutputStream s1out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1out);

        // Send your string!
        dos.writeUTF("Hello Net World!");

        // Close the connection, but not the server socket
        dos.close();
        s1.close();
      } catch (IOException e) {
        // ignore
      }
    }
  }
}
