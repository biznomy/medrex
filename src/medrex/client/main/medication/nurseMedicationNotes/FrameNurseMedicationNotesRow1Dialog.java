package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameNurseMedicationNotesRow1Dialog extends JDialog {
	private static final long serialVersionUID = 1L;

	public FrameNurseMedicationNotesRow1Dialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameNurseMedicationNotesRow1Dialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(380, 300));
		setBounds(100, 100, 368, 226);

		final JPanel panel = new medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotesRow1Dialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
