package medrex.client.census.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameCensusNotesAdd extends JDialog {
	private static final long serialVersionUID = 1L;
	private Toolkit toolkit = null;

	public FrameCensusNotesAdd() {
		super();
		Global.frameCensusNotesAdd = this;
		toolkit = Toolkit.getDefaultToolkit();
		setModal(true);
		setTitle("View Added Notes");

		getContentPane().setLayout(null);
		PanelCensusNotesAdd panelCensusNotesAdd = new PanelCensusNotesAdd();
		panelCensusNotesAdd.setBounds(0, 0, 710, 530);
		getContentPane().add(panelCensusNotesAdd);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(710, 530));
		SwingUtils.center(this);
		setResizable(false);
	}

}
