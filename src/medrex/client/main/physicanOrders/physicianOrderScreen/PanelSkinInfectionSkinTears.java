package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.dataObj.physicianOrders.SkinTears;
import medrex.commons.enums.ColorConstants;

public class PanelSkinInfectionSkinTears extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4927293159283192156L;
	private JCheckBox cbPedalPulse;
	private JCheckBox cbCapillaryRefill;
	private JCheckBox cbMiscellaneous;
	private JTextField FrequencyPedalPulse;
	private JTextField txtLocationPedalPulse;
	private JTextField txtFrequencyRefill;
	private JTextField txtLocationSkinTears;
	private SkinTears skinTears;
	private JTextField txtFrequencyPedalPulse;

	public PanelSkinInfectionSkinTears() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setOpaque(false);
		setBounds(0, 0, 533, 128);

		final JPanel panel_skinTears = new JPanel();
		panel_skinTears.setForeground(ColorConstants.DEF_COLOR);
		panel_skinTears.setBackground(Color.WHITE);
		panel_skinTears.setLayout(null);
		panel_skinTears.setOpaque(false);
		panel_skinTears.setBounds(0, 0, 533, 128);
		add(panel_skinTears);

		final JLabel locationLabel = new JLabel();
		locationLabel.setForeground(ColorConstants.DEF_COLOR);
		locationLabel.setText("Location");
		locationLabel.setBounds(10, 10, 77, 21);
		panel_skinTears.add(locationLabel);

		txtLocationSkinTears = new JTextField();
		txtLocationSkinTears.setBounds(93, 10, 86, 21);
		panel_skinTears.add(txtLocationSkinTears);

		cbMiscellaneous = new JCheckBox();
		cbMiscellaneous.setForeground(ColorConstants.DEF_COLOR);
		cbMiscellaneous.setBackground(Color.WHITE);
		cbMiscellaneous.setText("MISCELLANEOUS");
		cbMiscellaneous.setBounds(10, 34, 111, 18);
		panel_skinTears.add(cbMiscellaneous);

		cbCapillaryRefill = new JCheckBox();
		cbCapillaryRefill.setForeground(ColorConstants.DEF_COLOR);
		cbCapillaryRefill.setBackground(Color.WHITE);
		cbCapillaryRefill.setText("CAPILLARY REFILL");
		cbCapillaryRefill.setBounds(10, 58, 135, 18);
		panel_skinTears.add(cbCapillaryRefill);

		txtFrequencyRefill = new JTextField();
		txtFrequencyRefill.setBounds(182, 57, 86, 21);
		panel_skinTears.add(txtFrequencyRefill);

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		frequencyLabel.setText("FREQUENCY");
		frequencyLabel.setBounds(274, 58, 86, 18);
		panel_skinTears.add(frequencyLabel);

		cbPedalPulse = new JCheckBox();
		cbPedalPulse.setBackground(Color.WHITE);
		cbPedalPulse.setForeground(ColorConstants.DEF_COLOR);
		cbPedalPulse.setText("PEDAL PULSE");
		cbPedalPulse.setBounds(10, 100, 94, 18);
		panel_skinTears.add(cbPedalPulse);

		final JLabel ofLabel = new JLabel();
		ofLabel.setForeground(ColorConstants.DEF_COLOR);
		ofLabel.setText("OF");
		ofLabel.setBounds(110, 100, 35, 18);
		panel_skinTears.add(ofLabel);

		txtLocationPedalPulse = new JTextField();
		txtLocationPedalPulse.setBounds(145, 99, 86, 21);
		panel_skinTears.add(txtLocationPedalPulse);

		txtFrequencyPedalPulse = new JTextField();
		txtFrequencyPedalPulse.setBounds(336, 99, 86, 21);
		panel_skinTears.add(txtFrequencyPedalPulse);

		final JLabel locationLabel_1 = new JLabel();
		locationLabel_1.setForeground(ColorConstants.DEF_COLOR);
		locationLabel_1.setText("LOCATION");
		locationLabel_1.setBounds(237, 100, 68, 18);
		panel_skinTears.add(locationLabel_1);

		final JLabel locationLabel_1_1 = new JLabel();
		locationLabel_1_1.setBackground(Color.WHITE);
		locationLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		locationLabel_1_1.setText("FREQUENCY");
		locationLabel_1_1.setBounds(437, 101, 68, 18);
		panel_skinTears.add(locationLabel_1_1);
	}

	public void doSave() {
		SkinTears refSkinTears = new SkinTears();

		refSkinTears.setPedalPulse(cbPedalPulse.isSelected());
		refSkinTears.setCapillaryRefill(cbCapillaryRefill.isSelected());
		refSkinTears.setMiscellaneous(cbMiscellaneous.isSelected());
		refSkinTears.setFrequencyPedalPulse(txtFrequencyPedalPulse.getText());
		refSkinTears.setLocationPedalPulse(txtLocationPedalPulse.getText());
		refSkinTears.setFrequencyRefill(txtFrequencyRefill.getText());
		refSkinTears.setLocationSkinTears(txtLocationSkinTears.getText());

		setSkinTears(refSkinTears);

	}

	public void doUpdate() {

		cbPedalPulse.setSelected(this.skinTears.isPedalPulse());
		cbCapillaryRefill.setSelected(this.skinTears.isCapillaryRefill());
		cbMiscellaneous.setSelected(this.skinTears.isMiscellaneous());
		txtFrequencyPedalPulse.setText(this.skinTears.getFrequencyPedalPulse());
		txtLocationPedalPulse.setText(this.skinTears.getLocationPedalPulse());
		txtFrequencyRefill.setText(this.skinTears.getFrequencyRefill());
		txtLocationSkinTears.setText(this.skinTears.getLocationSkinTears());

	}

	public void setSkinTears(SkinTears skinTears) {
		this.skinTears = skinTears;
	}

	public SkinTears getSkinTears() {
		return this.skinTears;
	}

}
