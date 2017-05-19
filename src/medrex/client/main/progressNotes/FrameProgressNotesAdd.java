package medrex.client.main.progressNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameProgressNotesAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6649432841151127287L;

	/**
	 * Create the dialog
	 */
	public FrameProgressNotesAdd() {
		super();
		Global.frameProgressNotesAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelProgressNotesAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
