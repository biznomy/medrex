package medrex.client.main.dietary;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameDietaryPlazaHealthRowDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	public FrameDietaryPlazaHealthRowDialog() {
		super();
		// getContentPane().setBackground(Color.GRAY);
		Global.frameDietaryPlazaHealthRowDialog = this;
		setResizable(false);
		setTitle("LTC");
		setSize(new Dimension(330, 400));
		setBounds(100, 100, 512, 270);

		final JPanel panel = new medrex.client.main.dietary.PanelDietaryPlazaHealthRowDialog();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
}
