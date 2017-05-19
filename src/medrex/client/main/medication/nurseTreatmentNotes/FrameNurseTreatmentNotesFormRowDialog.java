package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameNurseTreatmentNotesFormRowDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameNurseTreatmentNotesFormRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameNurseTreatmentNotesFormRowDialogNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 330, 302);

		final JPanel panel = new PanelNurseTreatmentNotesFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
