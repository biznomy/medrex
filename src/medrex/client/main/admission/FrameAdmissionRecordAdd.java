package medrex.client.main.admission;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameAdmissionRecordAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3055248824134278231L;
	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	public JPanel panel;

	public static void main(String args[]) {
		try {
			FrameAdmissionRecordAdd dialog = (FrameAdmissionRecordAdd) FrameFactory
					.createWindowOfType(FrameAdmissionRecordAdd.class);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog
	 */
	public FrameAdmissionRecordAdd() {
		super();
		Global.frameAdmissionRecordAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		// setBounds(100, 100, 1024,
		// Toolkit.getDefaultToolkit().getScreenSize().height - 30);
		// setSize(Toolkit.getDefaultToolkit().getScreenSize().height);

		panel = new PanelAdmissionsRecordAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
