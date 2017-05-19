package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameNurseMedicationNotesRowDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	public FrameNurseMedicationNotesRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameNurseMedicationNotesRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 414, 400);

		final JPanel panel = new medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotesRowDialog();
		panel.setPreferredSize(new Dimension(10, 0));
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
