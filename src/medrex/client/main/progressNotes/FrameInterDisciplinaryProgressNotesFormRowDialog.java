package medrex.client.main.progressNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameInterDisciplinaryProgressNotesFormRowDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameInterDisciplinaryProgressNotesFormRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameInterDisciplinaryProgressNotesFormRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 330, 239);

		final JPanel panel = new medrex.client.main.progressNotes.PanelInterDisciplinaryProgressNotesFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
