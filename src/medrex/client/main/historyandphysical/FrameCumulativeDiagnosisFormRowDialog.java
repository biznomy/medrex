package medrex.client.main.historyandphysical;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameCumulativeDiagnosisFormRowDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameCumulativeDiagnosisFormRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameCumulativeDiagnosisFormRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(230, 250));
		setBounds(100, 100, 330, 250);

		final JPanel panel = new medrex.client.main.historyandphysical.PanelCumulativeDiagnosisFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}

}
