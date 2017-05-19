package medrex.client.main.physicanOrders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FramePhysicianOrdersAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	// public static void main(String args[]) {
	// try {
	// FramePhysicianOrdersAdd dialog = (FramePhysicianOrdersAdd)
	// FrameFactory.createWindowOfType(FramePhysicianOrdersAdd.class);
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
	public FramePhysicianOrdersAdd() {
		super();
		getContentPane().setBackground(Color.GRAY);
		Global.framePhysicianOrdersAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 25));
		JPanel panel = null;
		if (Global.currentPhysicianOrderForm
				.equalsIgnoreCase("Prescription Form")) {
			panel = new PanelAddNewPhysician();
			Global.panelAddNewPhysician.doFormChanged();
		} else {
			panel = new PanelPhysicianOrdersAdd();
		}
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
