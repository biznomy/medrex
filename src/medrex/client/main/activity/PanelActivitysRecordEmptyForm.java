package medrex.client.main.activity;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelActivitysRecordEmptyForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3265865577580690387L;

	/**
	 * Create the panel
	 */
	public PanelActivitysRecordEmptyForm() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));
		setLayout(null);

		final JLabel spaceForFormLabel = new JLabel();
		spaceForFormLabel.setText("Space for Form");
		spaceForFormLabel.setBounds(284, 10, 94, 16);
		add(spaceForFormLabel);

	}

}
