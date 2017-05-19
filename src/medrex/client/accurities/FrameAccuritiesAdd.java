package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameAccuritiesAdd extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FrameAccuritiesAdd dialog = new FrameAccuritiesAdd();
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
	public FrameAccuritiesAdd() {
		super();
		getContentPane().setBackground(Color.GRAY);
		Global.frameAccuritiesAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setSize(new Dimension(700, 500));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelAccuritiesAdd();

		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}
}
