package medrex.client.admin.security;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameSecurityAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	/**
	 * Create the dialog
	 */
	public FrameSecurityAdd(int roleType) {
		super();
		Global.frameSecurityAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		SwingUtils.center(this);
		// setSize(new Dimension(1024, 768));

		final JPanel panel = new PanelSecurityAdd(roleType);
		getContentPane().add(panel, BorderLayout.CENTER);
	}
}
