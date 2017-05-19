package medrex.client.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameResidentInfoGeneralAddDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2208025215017240832L;

	/**
	 * Create the dialog
	 */
	public FrameResidentInfoGeneralAddDialog() {
		super();
		Global.frameResidentInfoGeneralAddDialog = this;
		setTitle("LTC");
		setSize(new Dimension(300, 200));
		setBounds(100, 100, 300, 200);
		SwingUtils.center(this);
		setResizable(false);
		setModal(true);

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		final PanelResidentInfoGeneralAddDialog panel = new PanelResidentInfoGeneralAddDialog();
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
