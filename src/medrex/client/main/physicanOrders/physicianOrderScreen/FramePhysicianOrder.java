package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FramePhysicianOrder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6956868773696228310L;

	/**
	 * @param
	 * 
	 */
	public static void main(String args[]) {
		try {
			// System.out.println("Adding phy");
			FramePhysicianOrder frame = (FramePhysicianOrder) FrameFactory
					.createWindowOfType(FramePhysicianOrder.class);
			frame.setVisible(true);
			// System.out.println("phy Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FramePhysicianOrder() {
		Global.framePhysicianOrder = this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				FramePhysicianOrder.this.requestFocusInWindow();
				FramePhysicianOrder.this.requestFocus();
			}
		});
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.WHITE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setTitle("Physician Order");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setFocusableWindowState(true);

		PanelPhysicianOrderDetails panel = new PanelPhysicianOrderDetails();
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
