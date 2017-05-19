package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameNurseTreatmentNotesFormRow1Dialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameNurseTreatmentNotesFormRow1Dialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameNurseTreatmentNotesFormRow1DialogNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 330, 400);

		final JPanel panel = new PanelNurseTreatmentNotesFormRow1Dialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
