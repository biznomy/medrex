package medrex.client.reports;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.main.FrameMainOptions;

import com.sX.frameFactory.FrameFactory;

public class FrameLabReports extends JDialog {

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
	 * Create the dialog
	 */
	public FrameLabReports() {
		super();
		Global.frameLabReports = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		final PanelLabReportMails panel = new PanelLabReportMails();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

	public void openMainOptions() {
		FrameMainOptions users = (FrameMainOptions) FrameFactory
				.createWindowOfType(FrameMainOptions.class);
		users.setVisible(true);
		this.setVisible(false);
	}

}
