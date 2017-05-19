package medrex.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.FrameMainOptions;
import medrex.commons.MedrexMain;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.messageServer.MsgServer;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxFrame;

public class FrameLogin extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 * 
	 */

	ImageIcon icc = null;

	public static void main(String args[]) {
		MedrexClientManager.getInstance().setArgs(args);
		(new MedrexMain()).generalInitializations();

		FrameSplash frameSplash = (FrameSplash) FrameFactory
				.createWindowOfType(FrameSplash.class);
		frameSplash.setVisible(true);
		frameSplash.dispose();
		MedrexClientManager.getInstance().connect();

		FrameLogin frameLogin = (FrameLogin) FrameFactory
				.createWindowOfType(FrameLogin.class);

		frameLogin.setVisible(true);

		// /*
		// * Global.arguments = args;
		// *
		// * try { MedrexIntf medrexInterface = null; if (args.length > 0) { if
		// * (System.getSecurityManager() == null) {
		// System.setSecurityManager(new
		// * SecurityManager()); } try { Registry registry =
		// * LocateRegistry.getRegistry(args[0]); medrexInterface = (MedrexIntf)
		// * registry.lookup("medrex"); //
		// * System.out.println("Message: "+object.residentInfo()); } catch
		// * (Exception e) { System.out.println("Medrex Client Exception:");
		// * e.printStackTrace(); } Global.ltcServer = medrexInterface; } else {
		// * Global.ltcServer = new medrex.server.MedrexServer(false); }
		// *
		// *
		// * if (args.length == 1) { if (Utils.getRmiConnection(args)) { if
		// * (Global.ltcServer != null) { Global.selectedSource =
		// "Local Server";
		// * frameSplash.dispose(); updateVersion(); } } else {
		// * FrameMedrexServerMessage f = (FrameMedrexServerMessage)
		// FrameFactory.createWindowOfType(FrameMedrexServerMessage.class); } }
		// else
		// * { if (args.length == 0) { Global.ltcServer = new
		// * medrex.server.MedrexServer(false); (new
		// * MedrexMain()).generalInitializations(); FrameLogin frame = new
		// * FrameLogin(); frame.setVisible(true); frameSplash.dispose(); } if
		// * (args.length == 2) { if (Utils.getRmiConnection(args)) { if
		// * (Global.ltcServer != null) { if
		// * (args[1].toString().trim().equalsIgnoreCase( "Local")) {
		// * Global.selectedSource = "Local Server"; } else if
		// * (args[1].toString().trim() .equalsIgnoreCase("Internet")) {
		// * Global.selectedSource = "Internet"; } frameSplash.dispose();
		// * updateVersion(); } } else { FrameMedrexServerMessage f = new
		// * FrameMedrexServerMessage(); } }
		// *
		// * } frameSplash.dispose(); } catch (Exception e) { }
		// */
	}

	/*
	 * public static void updateVersion() { try { if (Global.selectedSource ==
	 * null) { Global.selectedSource = "Internet"; } if
	 * (Global.selectedSource.trim().equalsIgnoreCase( "")) {
	 * Global.selectedSource = "Internet"; } if (Global.selectedSource != null)
	 * { if (!FrameClientUpdater.isLatestVersion()) { FrameClientUpdater updater
	 * = new FrameClientUpdater(); updater.updateVersion();
	 * updater.downloadMedrex(); updater.extractMedrex();
	 * System.out.println("download complete"); JOptionPane
	 * .showMessageDialog(null,
	 * "Medrex Updated. Please restart the application"); updater.dispose();
	 * System.exit(0); } } } catch (Exception e) { } try { (new
	 * MedrexMain()).generalInitializations(); FrameLogin frame = new
	 * FrameLogin(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

	/**
	 * Create the frame
	 */
	public FrameLogin() {
		super();
		Global.currentLoggedInUserKey = 0;
		Global.currentLoggedInUserName = "";
		Global.currentLoggedInUserType = "";

		try {
			Global.frameMainOptions.dispose();
		} catch (Exception e) {

		}
		// setSize(1284, 768);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(new Color(0, 153, 153));
		setResizable(false);
		setTitle("Long Term Care");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.setVisible(false);

		final JMenu adminMenu = new JMenu();
		adminMenu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				noFeature();
			}
		});
		adminMenu.setText("Admin");
		menuBar.add(adminMenu);

		final JMenu helpMenu = new JMenu();
		helpMenu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				noFeature();
			}
		});
		helpMenu.setText("Help");
		menuBar.add(helpMenu);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1024, 768));
		panel.setBackground(new Color(232, 240, 245));
		getContentPane().add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(406, 102, 494, 200);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(400, 300));
		panel_1.setBackground(new Color(232, 240, 245));
		panel.add(panel_1);

		final JLabel ltcLabel = new JLabel(new ImageIcon("img/medrexLogo.png"));
		ltcLabel.setBackground(new Color(232, 240, 245));
		ltcLabel.setBounds(26, -8, 287, 177);
		panel_1.add(ltcLabel);

		final JPanel panel_2 = new PanelLogin(this);
		panel_2.setBounds(442, 308, 300, 200);
		panel.add(panel_2);
		panel_2.setPreferredSize(new Dimension(300, 200));

		// MedrexServer med = null;
		// try {
		// med = MedrexClientManager.getInstance().getMedrexServer();
		// } catch (RemoteException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// } catch (MedrexException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		if (Global.msgserver == null) {
			MessageServer msgserver = new MessageServer();
			Global.msgserver = msgserver;
			MsgServer ms = null;
			try {
				ms = new MsgServer(InetAddress.getLocalHost().getHostAddress()
						+ "", msgserver.serverSocket.getLocalPort() + "");
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (ms != null) {
					MedrexClientManager.getInstance().addMessageServer(ms);
				}
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (MedrexException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		// setVisible(true);
	}

	public void loadLogin() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		PanelLoginEmpty l = (PanelLoginEmpty) FrameFactory
				.createWindowOfType(PanelLoginEmpty.class);
		l.setLocation(new Double((screen.getWidth() / 2) - (l.getWidth()))
				.intValue(), 300);
		l.setVisible(true);

		l.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	

	public void noFeature() {
		JOptionPane.showMessageDialog(this,
				"Functionality to be incorporated later");
	}

	public void openMainOptions() {
		FrameMainOptions frameMainOptions = (FrameMainOptions) FrameFactory
				.createWindowOfType(FrameMainOptions.class);
		// frameMainOptions.requestFocusInWindow();
		// frameMainOptions.requestFocus();
		frameMainOptions.setVisible(true);
		this.dispose();
		// frameMainOptions.requestFocusInWindow();
		// frameMainOptions.requestFocus();
	}

	// public static void insertCensusDummyData() {
	// insertAdmissionFromHead("Hospital");
	// insertAdmissionFromHead("Nursing Home");
	// }
	// public static void insertAdmissionFromHead(String name) {
	// AdmissionFromHead ref = new AdmissionFromHead();
	// ref.setName(name);
	// }

}
