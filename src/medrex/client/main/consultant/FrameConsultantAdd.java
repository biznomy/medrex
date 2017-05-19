package medrex.client.main.consultant;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameConsultantAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5837515674656360588L;

	/**
	 * Create the dialog
	 */
	public FrameConsultantAdd() {
		super();
		Global.frameConsultantAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelConsultantAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
