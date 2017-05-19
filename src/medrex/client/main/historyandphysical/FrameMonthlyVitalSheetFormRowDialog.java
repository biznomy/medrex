package medrex.client.main.historyandphysical;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameMonthlyVitalSheetFormRowDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameMonthlyVitalSheetFormRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameMonthlyVitalSheetFormRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 484, 462);

		final JPanel panel = new medrex.client.main.historyandphysical.PanelMonthlyVitalSheetFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
