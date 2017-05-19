package medrex.client.main.dialysis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameDialysisRecordAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5235303997851436752L;
	/**
	 * @author Mayank Chandela Frame to add dialysis record add panel
	 */

	public JPanel panel;

	public static void main(String args[]) {
		try {
			FrameDialysisRecordAdd dialog = (FrameDialysisRecordAdd) FrameFactory
					.createWindowOfType(FrameDialysisRecordAdd.class);
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
	public FrameDialysisRecordAdd() {
		super();
		Global.frameDialysisRecordAdd = this;
		setResizable(false);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		panel = new PanelDialysisRecordAdd();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
