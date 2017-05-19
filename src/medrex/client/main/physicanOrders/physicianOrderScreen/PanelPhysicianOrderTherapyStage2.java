package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelPhysicianOrderTherapyStage2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 96423673527186579L;
	private JTextField txtOrders;
	private JTextField txtDuration;
	private JTextField txtRequiredLabs;
	private PanelPhysicianOrderTherapyStage2 panelPhysicianOrderTherapyStage2;

	public PanelPhysicianOrderTherapyStage2 getPanelPhysicianOrderTherapyStage2() {
		return panelPhysicianOrderTherapyStage2;
	}

	public void setPanelPhysicianOrderTherapyStage2(
			PanelPhysicianOrderTherapyStage2 panelPhysicianOrderTherapyStage2) {
		this.panelPhysicianOrderTherapyStage2 = panelPhysicianOrderTherapyStage2;
	}

	public PanelPhysicianOrderTherapyStage2() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel_fungal = new JPanel();
		panel_fungal.setBackground(Color.WHITE);
		panel_fungal.setLayout(null);
		panel_fungal.setOpaque(false);
		panel_fungal.setBounds(0, 0, 533, 111);
		add(panel_fungal);

		final JLabel ordersLabel = new JLabel();
		ordersLabel.setForeground(ColorConstants.DEF_COLOR);
		ordersLabel.setFont(new Font("", Font.BOLD, 12));
		ordersLabel.setText("ORDERS");
		ordersLabel.setBounds(100, 10, 120, 16);
		panel_fungal.add(ordersLabel);

		final JLabel durationLabel = new JLabel();
		durationLabel.setForeground(ColorConstants.DEF_COLOR);
		durationLabel.setFont(new Font("", Font.BOLD, 12));
		durationLabel.setText("DURATION");
		durationLabel.setBounds(100, 40, 120, 16);
		panel_fungal.add(durationLabel);

		final JLabel requiredLabsLabel = new JLabel();
		requiredLabsLabel.setForeground(ColorConstants.DEF_COLOR);
		requiredLabsLabel.setFont(new Font("", Font.BOLD, 12));
		requiredLabsLabel.setText("REQUIRED LABS");
		requiredLabsLabel.setBounds(100, 70, 120, 16);
		panel_fungal.add(requiredLabsLabel);

		txtOrders = new JTextField();
		txtOrders.setForeground(ColorConstants.DEF_COLOR);
		txtOrders.setBorder(new LineBorder(Color.black, 1, false));
		txtOrders.setBounds(250, 10, 120, 16);
		panel_fungal.add(txtOrders);

		txtDuration = new JTextField();
		txtDuration.setForeground(ColorConstants.DEF_COLOR);
		txtDuration.setBorder(new LineBorder(Color.black, 1, false));
		txtDuration.setBounds(250, 40, 120, 16);
		panel_fungal.add(txtDuration);

		txtRequiredLabs = new JTextField();
		txtRequiredLabs.setForeground(ColorConstants.DEF_COLOR);
		txtRequiredLabs.setBorder(new LineBorder(Color.black, 1, false));
		txtRequiredLabs.setBounds(250, 70, 120, 16);
		panel_fungal.add(txtRequiredLabs);

	}

}
