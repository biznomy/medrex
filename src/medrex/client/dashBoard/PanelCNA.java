package medrex.client.dashBoard;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.commons.enums.ColorConstants;

public class PanelCNA extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3826064930508972464L;

	public PanelCNA() {
		super();
		setLayout(new FlowLayout());
		final JLabel cnaadminLabel = new JLabel();
		cnaadminLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cnaadminLabel.setText("CNA-ADMIN");
		cnaadminLabel.setForeground(ColorConstants.DEF_COLOR);
		add(cnaadminLabel);
	}

}
