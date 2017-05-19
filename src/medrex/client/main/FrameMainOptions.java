package medrex.client.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

import medrex.client.FrameMainDesktopTmp;
import medrex.client.PanelMainDashboard;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.constants.Global;
import medrex.client.medicationcart.FrameResidentDesktopMedication;
import medrex.client.reports.FrameLabReports;
import medrex.client.users.FrameUsers;
import medrex.commons.enums.ResidentTabs;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxFrame;

public class FrameMainOptions extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652133611081685418L;

	public static void main(String args[]) {
		try {
			// System.out.println("Adding Dashboard");
			FrameMainOptions frame = (FrameMainOptions) FrameFactory
					.createWindowOfType(FrameMainOptions.class);
			frame.setVisible(true);
			// System.out.println("Dashboard Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FrameMainOptions() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(final WindowEvent arg0) {
				new ControllerUserLogon().logoutUpdate();
			}
		});
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				FrameMainOptions.this.requestFocusInWindow();
				FrameMainOptions.this.requestFocus();
			}
		});
		Global.frameMainOptions = this;
		// setUndecorated(true);
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.WHITE);
		// setSize(1024, 768);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		// setResizable(false);
		setTitle("Long Term Care");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusableWindowState(true);

		final PanelMainDashboard panel = new PanelMainDashboard(this);
		getContentPane().add(panel, BorderLayout.CENTER);
		// setComponentZOrder(panel, 1);

		// final JMenuBar menuBar = new JMenuBar();
		// setJMenuBar(menuBar);
		// menuBar.setVisible(false);
		// final JMenu adminMenu = new JMenu();
		// adminMenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// panel.noFeature();
		// }
		// });
		// adminMenu.setText("Admin");
		// menuBar.add(adminMenu);
		//
		// final JMenu helpMenu = new JMenu();
		// helpMenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// panel.noFeature();
		// }
		// });
		// helpMenu.setText("Help");
		// menuBar.add(helpMenu);

		// repaint();
	}

	// public void openMainDesktop() {
	// FrameMainDesktop mainDesktop = new FrameMainDesktop();
	// mainDesktop.setVisible(true);
	// this.setVisible(false);
	// }
	public void openMainDesktopTmp() {
		FrameMainDesktopTmp mainDesktopTmp;
		if (Global.frameMainDesktopTmp != null
				&& Global.currentResidenceKey != 0) {
			mainDesktopTmp = Global.frameMainDesktopTmp;
			// System.out.println("Global.currentMainTab: "+Global.currentMainTab);
			if (Global.currentMainTab == 2) {
				Global.currentMainTab = 2;
				Global.currentInnerTab = 0;
			}
			if (Global.currentMainTab == 1) {
				Global.currentResidenceArgument = Global.currentResidenceKey;
			}
		} else {
			mainDesktopTmp = (FrameMainDesktopTmp) FrameFactory
					.createWindowOfType(FrameMainDesktopTmp.class);
		}
		// mainDesktopTmp =(FrameMainDesktopTmp)
		// FrameFactory.createWindowOfType(FrameMainDesktopTmp.class);
		// mainDesktopTmp.doRedraw();
		mainDesktopTmp.doRedraw();
		mainDesktopTmp.setState(Frame.NORMAL);
		mainDesktopTmp.setVisible(true);
		// this.setVisible(false);
	}

	public void openProvidersDesktop() {
		// FrameProviders providers = new FrameProviders();
		// providers.setVisible(true);
		// this.setVisible(false);
	}

	/*
	 * public void openOthersDesktop() { FrameOthersDesktop othersDesktop=new
	 * FrameOthersDesktop(); othersDesktop.setVisible(true);
	 * this.setVisible(false); }
	 */
	// public void openResidentDesktop() {
	// FrameResidentDesktop frameResidentDesktop = new FrameResidentDesktop();
	// frameResidentDesktop.setVisible(true);
	// this.setVisible(false);
	// }
	// public void openResidentDesktopCensus() {
	// FrameResidentDesktopCensus frameResidentDesktopCensus = new
	// FrameResidentDesktopCensus();
	// frameResidentDesktopCensus.setVisible(true);
	// this.setVisible(false);
	// }
	public void openUsersDesktop() {
		FrameUsers users = new FrameUsers();
		users.setVisible(true);
		this.setVisible(false);
	}

	public void openResidentDesktopMedication() {
		FrameResidentDesktopMedication frameResidentDesktopMedication = new FrameResidentDesktopMedication();
		frameResidentDesktopMedication.setVisible(true);
		this.setVisible(false);
	}

	// public void openResidentDesktopCareLog() {
	// FrameResidentDesktopCareLog frameResidentDesktopCareLog = new
	// FrameResidentDesktopCareLog();
	// frameResidentDesktopCareLog.setVisible(true);
	// this.setVisible(false);
	// }

	public void openLabReports() {
		FrameLabReports labReports = new FrameLabReports();
		labReports.setVisible(true);
		this.setVisible(false);
	}

	public void openMainDesktopWithPanel(ResidentTabs tabName, String formName) {
		FrameMainDesktopTmp mainDesktopTmp = null;
		if (Global.frameMainDesktopTmp != null) {
			mainDesktopTmp = Global.frameMainDesktopTmp;
			// System.out.println("Hello");
		} else {
			mainDesktopTmp = (FrameMainDesktopTmp) FrameFactory
					.createWindowOfType(FrameMainDesktopTmp.class);
		}
		// mainDesktopTmp = (FrameMainDesktopTmp)
		// FrameFactory.createWindowOfType(FrameMainDesktopTmp.class);
		mainDesktopTmp.openMainDesktopTmpWithPanel(tabName, formName);
		// mainDesktopTmp.doRedraw();
		mainDesktopTmp.setState(Frame.NORMAL);
		mainDesktopTmp.doRedraw();
		mainDesktopTmp.setVisible(true);
	}

	// public void setVisible(boolean b) {
	// boolean windowFocusable = getFocusableWindowState();
	// this.setFocusableWindowState(true);
	// super.setVisible(b);
	// this.setFocusableWindowState(windowFocusable);
	// }
}
