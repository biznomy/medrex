package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class PanelloggedInUser extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5635566725702409439L;
	private JLabel logedInUser;

	public PanelloggedInUser() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(330, 30));

		logedInUser = new JLabel();
		logedInUser.setBounds(5, 5, 250, 15);
		logedInUser.setPreferredSize(new Dimension(250, 25));
		logedInUser.setText(Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		add(logedInUser);

		final JCheckBox issignedCheckBox = new JCheckBox();
		issignedCheckBox.setBounds(225, 4, 74, 17);
		issignedCheckBox.setMargin(new Insets(5, 2, 2, 2));
		issignedCheckBox.setBackground(Color.WHITE);
		issignedCheckBox.setText("IsSigned");
		add(issignedCheckBox);
	}

}
