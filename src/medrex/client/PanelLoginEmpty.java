package medrex.client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;

import com.sX.frameFactory.FrameFactory;

public class PanelLoginEmpty extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1643306993635429533L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			PanelLoginEmpty dialog = (PanelLoginEmpty) FrameFactory
					.createWindowOfType(PanelLoginEmpty.class);

			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog
	 */
	public PanelLoginEmpty() {
		super();
		getContentPane().setBackground(new Color(0, 0, 153));
		getContentPane().setLayout(null);
		setSize(new Dimension(300, 200));
		this.setModal(true);
	}

}
