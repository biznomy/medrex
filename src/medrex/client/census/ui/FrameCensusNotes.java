package medrex.client.census.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameCensusNotes extends JDialog {
	private static final long serialVersionUID = 1L;
	private Toolkit toolkit = null;

	public FrameCensusNotes() {
		super();
		Global.frameCensusNotes = this;
		toolkit = Toolkit.getDefaultToolkit();
		setTitle("Census Notes");
		setModal(true);

		getContentPane().setLayout(null);
		PanelCensusNotes panelCensusNotes = new PanelCensusNotes();
		panelCensusNotes.setBounds(0, 0, 810, 630);
		getContentPane().add(panelCensusNotes);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(810, 430));
		SwingUtils.center(this);
		setResizable(false);
	}

}
