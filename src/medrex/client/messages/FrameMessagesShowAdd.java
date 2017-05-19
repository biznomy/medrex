package medrex.client.messages;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;

public class FrameMessagesShowAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog
	 */
	public FrameMessagesShowAdd() {
		super();
		Global.frameMessagesShowAdd = this;
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(550, 550));
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);

		final JPanel panel = new PanelMessagesShowAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
