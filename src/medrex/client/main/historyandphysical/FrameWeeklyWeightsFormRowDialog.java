package medrex.client.main.historyandphysical;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameWeeklyWeightsFormRowDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	public FrameWeeklyWeightsFormRowDialog() {
		super();
		Global.frameWeeklyWeightsFormRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 407, 472);
		setModal(true);

		final JPanel panel = new medrex.client.main.historyandphysical.PanelWeeklyWeightsFormRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
