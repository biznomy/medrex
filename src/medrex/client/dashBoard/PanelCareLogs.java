package medrex.client.dashBoard;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.commons.enums.ColorConstants;

public class PanelCareLogs extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1823598347165168652L;

	public PanelCareLogs() {
		super();
		setLayout(new FlowLayout());
		final JLabel cnaadminLabel = new JLabel();
		cnaadminLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cnaadminLabel.setText("CARE LOGS");
		cnaadminLabel.setForeground(ColorConstants.DEF_COLOR);
		add(cnaadminLabel);
	}
}
