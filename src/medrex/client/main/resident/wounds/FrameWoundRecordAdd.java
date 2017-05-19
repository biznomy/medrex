package medrex.client.main.resident.wounds;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameWoundRecordAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9070316958243939382L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			FrameWoundRecordAdd dialog = (FrameWoundRecordAdd) FrameFactory
					.createWindowOfType(FrameWoundRecordAdd.class);
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
	public FrameWoundRecordAdd() {
		super();
		Global.frameWoundRecordAdd = this;
		setResizable(false);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		final JPanel panel = new PanelWoundRecordAdd();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
