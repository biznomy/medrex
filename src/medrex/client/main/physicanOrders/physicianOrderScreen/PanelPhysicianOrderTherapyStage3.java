package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelPhysicianOrderTherapyStage3 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6155547223689239064L;
	private JTextField txtLineType;
	private JTextField txtCareOfLine;
	private JTextField txtDsg;
	private JTextField txtInsertionSite;
	private PanelPhysicianOrderTherapyStage3 panelPhysicianOrderTherapyStage3;

	public PanelPhysicianOrderTherapyStage3 getPanelPhysicianOrderTherapyStage3() {
		return panelPhysicianOrderTherapyStage3;
	}

	public void setPanelPhysicianOrderTherapyStage3(
			PanelPhysicianOrderTherapyStage3 panelPhysicianOrderTherapyStage3) {
		this.panelPhysicianOrderTherapyStage3 = panelPhysicianOrderTherapyStage3;
	}

	public PanelPhysicianOrderTherapyStage3() {
		super();

		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel_fungal = new JPanel();
		panel_fungal.setBackground(Color.WHITE);
		panel_fungal.setLayout(null);
		panel_fungal.setOpaque(false);
		panel_fungal.setBounds(0, 0, 533, 137);
		add(panel_fungal);

		final JLabel lineTypeLabel = new JLabel();
		lineTypeLabel.setForeground(ColorConstants.DEF_COLOR);
		lineTypeLabel.setFont(new Font("", Font.BOLD, 12));
		lineTypeLabel.setText("LINE TYPE");
		lineTypeLabel.setBounds(100, 10, 120, 16);
		panel_fungal.add(lineTypeLabel);

		final JLabel careOfLineLabel = new JLabel();
		careOfLineLabel.setForeground(ColorConstants.DEF_COLOR);
		careOfLineLabel.setFont(new Font("", Font.BOLD, 12));
		careOfLineLabel.setText("CARE OF LINE");
		careOfLineLabel.setBounds(100, 40, 120, 16);
		panel_fungal.add(careOfLineLabel);

		final JLabel dsgLabel = new JLabel();
		dsgLabel.setForeground(ColorConstants.DEF_COLOR);
		dsgLabel.setFont(new Font("", Font.BOLD, 12));
		dsgLabel.setText("DSG");
		dsgLabel.setBounds(100, 70, 120, 16);
		panel_fungal.add(dsgLabel);

		final JLabel insertionSiteLabel = new JLabel();
		insertionSiteLabel.setForeground(ColorConstants.DEF_COLOR);
		insertionSiteLabel.setFont(new Font("", Font.BOLD, 12));
		insertionSiteLabel.setText("INSERTION SITE");
		insertionSiteLabel.setBounds(100, 100, 120, 16);
		panel_fungal.add(insertionSiteLabel);

		txtLineType = new JTextField();
		txtLineType.setForeground(ColorConstants.DEF_COLOR);
		txtLineType.setBorder(new LineBorder(Color.black, 1, false));
		txtLineType.setBounds(250, 10, 120, 16);
		panel_fungal.add(txtLineType);

		txtCareOfLine = new JTextField();
		txtCareOfLine.setForeground(ColorConstants.DEF_COLOR);
		txtCareOfLine.setBorder(new LineBorder(Color.black, 1, false));
		txtCareOfLine.setBounds(250, 40, 120, 16);
		panel_fungal.add(txtCareOfLine);

		txtDsg = new JTextField();
		txtDsg.setForeground(ColorConstants.DEF_COLOR);
		txtDsg.setBorder(new LineBorder(Color.black, 1, false));
		txtDsg.setBounds(250, 70, 120, 16);
		panel_fungal.add(txtDsg);

		txtInsertionSite = new JTextField();
		txtInsertionSite.setForeground(ColorConstants.DEF_COLOR);
		txtInsertionSite.setBorder(new LineBorder(Color.black, 1, false));
		txtInsertionSite.setBounds(250, 100, 120, 16);
		panel_fungal.add(txtInsertionSite);

	}

}
