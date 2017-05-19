package medrex.client.main.nursesNote;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameNursesNotesRecordAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1796202041031353998L;
	/**
	 * @author Mayank Chandela Frame to add Nurses Notes record add panel
	 */

	public PanelNursesNoteRecordAdd panel;

	public static void main(String args[]) {
		try {
			FrameNursesNotesRecordAdd dialog = (FrameNursesNotesRecordAdd) FrameFactory
					.createWindowOfType(FrameNursesNotesRecordAdd.class);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog
	 */
	public FrameNursesNotesRecordAdd() {
		super();
		Global.frameNursesNotesRecordAdd = this;
		setResizable(false);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		panel = new PanelNursesNoteRecordAdd();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
