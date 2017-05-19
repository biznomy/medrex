package medrex.client.main.dietary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameDietaryAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7033147315836256342L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			FrameDietaryAdd dialog = (FrameDietaryAdd) FrameFactory
					.createWindowOfType(FrameDietaryAdd.class);
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
	public FrameDietaryAdd() {
		super();
		Global.frameDietaryAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelDietaryAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}

}
