package medrex.client.main.historyandphysical;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameHistoryAndPhysicalAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4162060258875966620L;

	/**
	 * Create the dialog
	 */
	public FrameHistoryAndPhysicalAdd() {
		super();
		Global.frameHistoryAndPhysicalAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelHistoryAndPhysicalAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
