package medrex.client.users;

import java.awt.Dimension;

import javax.swing.JDialog;

import medrex.client.constants.Global;

public class FramePhysicianFormAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FramePhysicianFormAdd() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.framePhysicianFormAdd = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(580, 320));
		setBounds(100, 100, 580, 320);

		// final JPanel panel = new PanelPhysicianForm();
		// getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
