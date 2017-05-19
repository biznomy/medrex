package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelPhysicianOrderTherapyStage1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6461727521989086622L;
	private JTextField txtIncludeMeds;
	private JTextField txtIvf;
	private JTextField txtTpn;
	private PanelPhysicianOrderTherapyStage1 panelPhysicianOrderTherapyStage1;

	public PanelPhysicianOrderTherapyStage1 getPanelPhysicianOrderTherapyStage1() {
		return panelPhysicianOrderTherapyStage1;
	}

	public void setPanelPhysicianOrderTherapyStage1(
			PanelPhysicianOrderTherapyStage1 panelPhysicianOrderTherapyStage1) {
		this.panelPhysicianOrderTherapyStage1 = panelPhysicianOrderTherapyStage1;
	}

	public PanelPhysicianOrderTherapyStage1() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel_fungal = new JPanel();
		panel_fungal.setBackground(Color.WHITE);
		panel_fungal.setLayout(null);
		panel_fungal.setOpaque(false);
		panel_fungal.setBounds(0, 0, 533, 128);
		add(panel_fungal);

		final JLabel includeIvMedsLabel = new JLabel();
		includeIvMedsLabel.setForeground(ColorConstants.DEF_COLOR);
		includeIvMedsLabel.setFont(new Font("", Font.BOLD, 12));
		includeIvMedsLabel.setText("INCLUDE IV MEDS");
		includeIvMedsLabel.setBounds(100, 10, 120, 16);
		panel_fungal.add(includeIvMedsLabel);

		final JLabel ivfLabel = new JLabel();
		ivfLabel.setForeground(ColorConstants.DEF_COLOR);
		ivfLabel.setFont(new Font("", Font.BOLD, 12));
		ivfLabel.setText("IVF");
		ivfLabel.setBounds(100, 40, 120, 16);
		panel_fungal.add(ivfLabel);

		final JLabel tpnLabel = new JLabel();
		tpnLabel.setForeground(ColorConstants.DEF_COLOR);
		tpnLabel.setFont(new Font("", Font.BOLD, 12));
		tpnLabel.setText("TPN");
		tpnLabel.setBounds(100, 70, 120, 16);
		panel_fungal.add(tpnLabel);

		txtIncludeMeds = new JTextField();
		txtIncludeMeds.setForeground(ColorConstants.DEF_COLOR);
		txtIncludeMeds.setBounds(250, 10, 120, 16);
		panel_fungal.add(txtIncludeMeds);

		txtIvf = new JTextField();
		txtIvf.setForeground(ColorConstants.DEF_COLOR);
		txtIvf.setBorder(new LineBorder(Color.black, 1, false));
		txtIvf.setBounds(250, 40, 120, 16);
		panel_fungal.add(txtIvf);

		txtTpn = new JTextField();
		txtTpn.setForeground(ColorConstants.DEF_COLOR);
		txtTpn.setBorder(new LineBorder(Color.black, 1, false));
		txtTpn.setBounds(250, 70, 120, 16);
		panel_fungal.add(txtTpn);

	}
}
