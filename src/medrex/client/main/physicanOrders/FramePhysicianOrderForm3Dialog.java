package medrex.client.main.physicanOrders;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FramePhysicianOrderForm3Dialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FramePhysicianOrderForm3Dialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.framePhysicianOrderForm3Dialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(1500, 200));
		setBounds(100, 100, 1500, 200);
		SwingUtils.center(this);

		/*
		 * setSize(new Dimension(819, 165)); setBounds(100, 100, 819, 165);
		 */

		final JPanel panel = new PanelPhysicianOrderForm3Dialog();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
