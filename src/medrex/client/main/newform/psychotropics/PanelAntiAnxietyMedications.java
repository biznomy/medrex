package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelAntiAnxietyMedications extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3493177617104640630L;

	public PanelAntiAnxietyMedications() {
		super();
		setOpaque(false);
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(254, 252, 252));

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(1, 1, 799, 999);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 35, 766, 368);
		panel.add(panel_1);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setText("<html><body><b><u>Anti-Anxiety Medications:");
		label.setBounds(10, 10, 252, 16);
		panel_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("New JLabel");
		label_1.setBounds(37, 32, 187, 16);
		panel_1.add(label_1);
	}

}
