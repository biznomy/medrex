package medrex.client.masterList;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameMasterListAdd extends JDialog {

	private static final long serialVersionUID = 1L;

	// public static void main(String args[]) {
	// try {
	// FrameMasterListAdd dialog = new FrameMasterListAdd();
	// dialog.addWindowListener(new WindowAdapter() {
	// public void windowClosing(WindowEvent e) {
	// System.exit(0);
	// }
	// });
	// dialog.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * Create the dialog
	 */
	public FrameMasterListAdd(ControllerMasterList controller) {
		super();
		Global.frameMasterListAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(360, 200));
		SwingUtils.center(this);
		// setSize(new Dimension(1024, 768));

		final JPanel panel = new PanelMasterListAdd(controller);
		panel.setPreferredSize(new Dimension(365, 185));
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
