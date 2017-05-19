package medrex.client;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageServer {
	public ServerSocket serverSocket = null;

	MessageServer() {
		socketConnection();
	}

	public static void main(String args[]) {
		MessageServer m = new MessageServer();
		JFrame f = new JFrame();
		f.setVisible(true);
		try {
			System.out.println("Started message server at "
					+ InetAddress.getLocalHost().getHostAddress() + " "
					+ m.serverSocket.getLocalPort());
		} catch (Exception e) {

		}
	}

	public void socketConnection() {
		try {
			// 1. creating a server socket
			if (serverSocket == null) {
				serverSocket = new ServerSocket(0);
			}
			// System.out.println("server started at "+serverSocket.getLocalPort());

			Thread t = new Thread() {
				@Override
				public void run() {
					while (true) {

						try {
							// System.out.println("Waiting for message");
							Socket clientConnection = serverSocket.accept();

							BufferedReader inFromClient = new BufferedReader(
									new InputStreamReader(clientConnection
											.getInputStream()));
							new DataOutputStream(clientConnection
									.getOutputStream());
							String clientMessage = inFromClient.readLine();
							// System.out.println("message received");
							handleMessage(clientMessage);

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			};
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void handleMessage(String message) {
		if (!message.equalsIgnoreCase("test")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, message, "MESSAGE FROM SERVER",
					1);
			System.out.println(message);
		}
	}

}
