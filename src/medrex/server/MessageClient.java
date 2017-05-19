package medrex.server;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

import medrex.commons.vo.messageServer.MsgServer;

public class MessageClient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5344675232921842502L;
	List<MsgServer> msgServers = new ArrayList<MsgServer>();
	final JList list;
	final JTextArea textArea;

	public void addServer(MsgServer msgServer) {
		msgServers.add(msgServer);
		list.setListData(msgServers.toArray());
	}

	MessageClient() {
		super();
		setSize(new Dimension(600, 300));
		getContentPane().setLayout(null);

		list = new JList();
		list.setBounds(10, 41, 160, 166);
		getContentPane().add(list);

		final JButton btnUpdate = new JButton();
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				refreshClientList();
			}
		});
		btnUpdate.setText("Refresh Client List");
		btnUpdate.setBounds(10, 226, 160, 26);
		getContentPane().add(btnUpdate);

		textArea = new JTextArea();
		textArea.setBounds(203, 42, 381, 174);
		getContentPane().add(textArea);

		final JButton btnSendMessage = new JButton();
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				sendMessageToAll();
			}
		});
		btnSendMessage.setText("Send Message");
		btnSendMessage.setBounds(350, 226, 130, 26);
		getContentPane().add(btnSendMessage);

		setVisible(true);

		final JLabel medrexServerLabel = new JLabel();
		medrexServerLabel.setText("Medrex Server");
		medrexServerLabel.setBounds(169, 10, 130, 16);
		getContentPane().add(medrexServerLabel);

	}

	public void sendMessageToAll() {
		try {

			for (int i = 0; i < msgServers.size(); i++) {
				MsgServer m = msgServers.get(i);
				String sentence = textArea.getText();
				Socket clientSocket = new Socket(m.getIp(), new Integer(m
						.getPort()).intValue());
				DataOutputStream outToServer = new DataOutputStream(
						clientSocket.getOutputStream());
				outToServer.writeBytes(sentence + '\n');
				clientSocket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void refreshClientList() {

		for (int i = msgServers.size() - 1; i > -1; i--) {
			try {
				MsgServer m = msgServers.get(i);
				String sentence = "test";
				Socket clientSocket = new Socket(m.getIp(), new Integer(m
						.getPort()).intValue());
				DataOutputStream outToServer = new DataOutputStream(
						clientSocket.getOutputStream());
				outToServer.writeBytes(sentence + '\n');
				clientSocket.close();
			} catch (Exception e) {
				msgServers.remove(i);
				list.setListData(msgServers.toArray());
			}
		}

	}

	public static void main(String args[]) {
		MessageClient m = new MessageClient();
		m.addServer(new MsgServer("59.161.82.66", "49666"));
		m.addServer(new MsgServer("59.161.82.66", "49667"));
		// m.sendMessageToAll();
	}

}
