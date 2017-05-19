package medrex.client.main.MonthlySummary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

import com.sX.frameFactory.FrameFactory;

public class FrameMonthlySummaryRecordAdd extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7873544734184458966L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			FrameMonthlySummaryRecordAdd dialog = (FrameMonthlySummaryRecordAdd) FrameFactory
					.createWindowOfType(FrameMonthlySummaryRecordAdd.class);
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
	public FrameMonthlySummaryRecordAdd() {
		super();
		Global.frameMonthlySummaryRecordAdd = this;
		setResizable(false);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);

		final JPanel panel = new PanelMonthlySummaryRecordAdd();
		getContentPane().add(panel, BorderLayout.CENTER);
		//
	}
}
