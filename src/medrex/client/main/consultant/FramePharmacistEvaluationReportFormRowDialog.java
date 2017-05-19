package medrex.client.main.consultant;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FramePharmacistEvaluationReportFormRowDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FramePharmacistEvaluationReportFormRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.framePharmacistEvaluationReportFormRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 210));

		final JPanel panel = new medrex.client.main.consultant.PanelPharmacistEvaluationReportFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
