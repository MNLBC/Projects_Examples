package com.oocl.mnlbc.homework.w2.d3;

import java.io.*;
import java.net.*;

public class UdpClient {
	public static void main(String args[]) {
		UdpClient udpClient = new UdpClient();
		try {
			udpClient.go();
		} catch (Exception e) {
			System.out.println("Exception occured with socket.");
			System.out.println(e);
			System.exit(1);
		}
	}
	
	public void go() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket;
		DatagramPacket outDataPacket; // Datagram packet to the server
		DatagramPacket inDataPacket; // Datagram packet from the server
		InetAddress serverAddress; // Server host address
		byte[] msg = new byte[100]; // Buffer space.
		String receivedMsg; // Received message in String form.

		// Allocate a socket by which messages are sent and received.
		datagramSocket = new DatagramSocket();

		// Server is running on this same machine for this example.
		// This method can throw an UnknownHostException.
		serverAddress = InetAddress.getLocalHost();

		// Set up a datagram request to be sent to the server.
		// Send to port 8000.
		outDataPacket = new DatagramPacket(msg, 1, serverAddress, 8000);

		// Make the request to the server.
		datagramSocket.send(outDataPacket);

		// Set up a datagram packet to receive server's response.
		inDataPacket = new DatagramPacket(msg, msg.length);

		// Receive the time data from the server
		datagramSocket.receive(inDataPacket);

		// Print the data received from the server
		receivedMsg = new String(inDataPacket.getData(), 0, inDataPacket.getLength());
		System.out.println(receivedMsg);

		// close the socket
		datagramSocket.close();
	}

}
