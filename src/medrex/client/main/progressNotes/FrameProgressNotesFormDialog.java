package medrex.client.main.progressNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameProgressNotesFormDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameProgressNotesFormDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameProgressNotesFormDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 330, 238);

		final JPanel panel = new medrex.client.main.progressNotes.PanelProgressNotesFormDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
