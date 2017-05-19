package medrex.client.main.physicanOrders.progressNotes;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameProgressNotes2Dialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameProgressNotes2Dialog() {
		super();

		// getContentPane().setBackground(Color.GRAY);
		Global.frameProgressNotes2Dialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(809, 200));
		setBounds(100, 100, 809, 200);
		SwingUtils.center(this);

		/*
		 * setSize(new Dimension(819, 165)); setBounds(100, 100, 819, 165);
		 */

		final JPanel panel = new PanelProgressNotes2Dialog();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
