package com.oocl.mnlbc.homework.w2.d3.v3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	private String ipAdress;

	public ChatClient(String ipAString) {
		this.ipAdress = ipAdress;
	}

	public void startWork() throws UnknownHostException, IOException {
		Socket socket = new Socket(ipAdress, 2345);
		new ReadMes(socket).start();
		new SendMes(socket).start();
		
	}

	/**
	 * Description
	 * 
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		ChatClient chatClient = new ChatClient(args[0]);
		chatClient.startWork();
	}

}