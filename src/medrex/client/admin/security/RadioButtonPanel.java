package medrex.client.admin.security;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 296122869869090279L;
	JRadioButton[] buttons;

	RadioButtonPanel(String[] str) {
		this.setBackground(Color.WHITE);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		buttons = new JRadioButton[str.length];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JRadioButton(str[i]);
			buttons[i].setBackground(Color.WHITE);
			buttons[i].setFocusPainted(true);
			add(buttons[i]);
		}
	}

	public void setSelectedIndex(int index) {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setSelected(false);
			buttons[i].setFocusPainted(false);
		}
		if (index > -1) {
			buttons[index].setSelected(true);
			buttons[index].setFocusPainted(true);
		}

		// buttons
	}

	public int getSelectedIndex() {
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i].isSelected()) {
				return i;
			}
		}
		return -1;
	}

	public JRadioButton[] getButtons() {
		return buttons;
	}
}
