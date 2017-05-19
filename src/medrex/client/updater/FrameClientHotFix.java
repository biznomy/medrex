package medrex.client.updater;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.FTPDownload;
import medrex.commons.utils.Unzipper;

public class FrameClientHotFix extends JFrame {

	private JComboBox cmbDownloadSource;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	/**
	 * Create the frame
	 */

	JLabel lblCurrentVersion;
	JLabel lblLatestVersion;
	JLabel lblmessage;

	JProgressBar progressBar;

	// private boolean source = false;
	public FrameClientHotFix() {
		super();
		getContentPane().setLayout(null);

		setSize(421, 314);
		getContentPane().setBackground(new Color(232, 240, 242));
		setTitle("Long Term Care");
		setUndecorated(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Double xx = new Double((screen.getWidth() - 400) / 2);
		Double yy = new Double((screen.getHeight() - 275) / 2);

		setLocation(xx.intValue(), yy.intValue());

		final JLabel medrexClientHotLabel = new JLabel();
		medrexClientHotLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		medrexClientHotLabel.setText("MEDREX CLIENT HOT FIX");
		medrexClientHotLabel.setBounds(60, 21, 310, 25);
		getContentPane().add(medrexClientHotLabel);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_1.setText("Current Version");
		label_1.setBounds(16, 60, 96, 16);
		getContentPane().add(label_1);

		lblCurrentVersion = new JLabel();
		lblCurrentVersion.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCurrentVersion.setText("");
		lblCurrentVersion.setBounds(118, 61, 40, 16);
		getContentPane().add(lblCurrentVersion);

		final JLabel latestVersionLabel = new JLabel();
		latestVersionLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		latestVersionLabel.setText("Latest Version");
		latestVersionLabel.setBounds(223, 60, 89, 16);
		getContentPane().add(latestVersionLabel);

		lblLatestVersion = new JLabel();
		lblLatestVersion.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLatestVersion.setText("");
		lblLatestVersion.setBounds(320, 60, 40, 16);
		getContentPane().add(lblLatestVersion);

		lblmessage = new JLabel();
		lblmessage.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblmessage.setText("");
		lblmessage.setBounds(16, 103, 354, 16);
		getContentPane().add(lblmessage);

		progressBar = new JProgressBar();

		progressBar.setBounds(27, 230, 354, 16);
		getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		setVisible(true);

		final JLabel downloadFromLabel = new JLabel();
		downloadFromLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		downloadFromLabel.setText("Download from ");
		downloadFromLabel.setBounds(28, 143, 96, 16);
		getContentPane().add(downloadFromLabel);

		// cmbDownloadSource = new JComboBox();
		// cmbDownloadSource.addItemListener(new ItemListener() {
		// public void itemStateChanged(final ItemEvent e) {
		// Global.selectedSource =
		// cmbDownloadSource.getSelectedItem().toString();
		// }
		// });
		// cmbDownloadSource.setModel(new DefaultComboBoxModel(new String[] {"",
		// "Internet", "Local Server"}));
		// cmbDownloadSource.setBounds(153, 142, 111, 21);
		// getContentPane().add(cmbDownloadSource);
		//
		// final JButton okButton = new JButton();
		// okButton.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// if (cmbDownloadSource.getSelectedItem() != null) {
		// source = true;
		// } else {
		// source = false;
		// }
		// }
		// });
		// okButton.setText("ok");
		// okButton.setBounds(297, 142, 75, 21);
		// getContentPane().add(okButton);

	}

	// public boolean startDownload() {
	// return source;
	// }

	public static void main(String args[]) {
		// FrameClientUpdater frameClientUpdater = new FrameClientUpdater();
		// System.out.println(FrameClientUpdater.isLatestVersion());

	}

	public void extractMedrexHotFix() throws MedrexException {
		lblmessage.setText("Installing Medrex Hot Fix");
		Unzipper unzipper = new Unzipper();
		unzipper.recursiveUnzip(new File("C:\\medrextmp\\medrex1.zip"),
				new File("C:\\medrexrmi\\"));

		lblmessage.setText("Done");

	}

	public void updateHotFixVersion() throws MedrexException {

		lblmessage.setText("Checking Latest Version");
		lblCurrentVersion.setText(Global.clienthotfixversion + "");
		FTPDownload.downloadFile("version1.txt");
		String strLine = "";

		try {
			FileInputStream fstream = new FileInputStream(
					"c:\\medrextmp\\version1.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				break;
			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		if (!strLine.equalsIgnoreCase("")) {
			new Float(strLine).parseFloat(strLine);
		}

		lblLatestVersion.setText(strLine);

	}

	public void downloadMedrexHotFix() throws MedrexException {

		lblmessage.setText("Downloading Hot Fix of Medrex");

		FTPDownload.downloadFile("medrex1.zip");

		lblmessage.setText("Download Complete");

	}

	public static boolean isHotFixAvailable() throws MedrexException {
		FTPDownload.downloadFile("version1.txt");
		String strLine = "";

		try {
			FileInputStream fstream = new FileInputStream(
					"c:\\medrextmp\\version1.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				break;
			}
			// Close the input stream
			in.close();

		} catch (Exception e) {// Catch exception if any
			// System.err.println("Error: " + e.getMessage());
		}

		float f = 0.01f;
		if (!strLine.equalsIgnoreCase("")) {
			f = new Float(strLine).parseFloat(strLine);
		}

		if (Global.clienthotfixversion < f) {
			return (true);
		} else {
			return (false);
		}

	}

}