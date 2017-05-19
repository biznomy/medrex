package medrex.client.main.careplan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameCarePlanAdd extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FrameCarePlanAdd dialog = (FrameCarePlanAdd) FrameFactory
					.createWindowOfType(FrameCarePlanAdd.class);
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
	public FrameCarePlanAdd() {
		super();
		getContentPane().setBackground(Color.GRAY);
		Global.frameCarePlanAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelCarePlanAdd();

		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
