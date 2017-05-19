package medrex.client.main.nursesNote;

import java.awt.Dimension;

import javax.swing.JDialog;

import medrex.client.constants.Global;

public class FrameDailySkilledNursesNotesDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7568169911649451586L;

	FrameDailySkilledNursesNotesDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameDailySkilledNursesNotesDialog = this;
		setResizable(false);
		setTitle("Daily Skilled Nurses Notes ");
		setSize(new Dimension(520, 430));
		setBounds(100, 100, 520, 430);
		// final JPanel panel = new PanelDailySkilledNursesNotedDialog();
		// getContentPane().add(panel, BorderLayout.CENTER);
	}

}
