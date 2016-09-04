package danzicr;

import java.net.*;
import java.io.*;
import java.util.logging.*;

/**
* @author Caroline Danzi
* 6 September 2016
* CSE 383
* ServerMain
*
* Implements a server that connects to any client using any protocol
* 
* Used code from previous 283 assignments, written both by myself and Dr. Pierre St. Juste
*/

public class ServerMain {
	
	private final int PORT = 5678;
	private static Logger LOGGER = Logger.getLogger("info");
	private FileHandler fh = null;
	
	public ServerMain() {
		// Logging code from ClientMain.java, written by Dr. Campbell
		try {
			fh = new FileHandler("server.log");
			LOGGER.addHandler(fh);
			LOGGER.setUseParentHandlers(false);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);  

		} catch (IOException err) {
			System.err.println("Error - can't open log file");
		}

		LOGGER.info("ServerMain - Port = " + PORT);
	}
	
	/**
	 * Listens for a connection
	 */
	private void listen() {
		try {
			ServerSocket servSocket = new ServerSocket(PORT);
			Socket clientSocket;
			while(true) {
				clientSocket = servSocket.accept();
			}
		} catch (Exception e) {
			System.err.println("Error - Could not open connection");
		}
		
	}
	
	public static void main(String[] args) {
		ServerMain sm = new ServerMain();
		sm.listen();
	}
}