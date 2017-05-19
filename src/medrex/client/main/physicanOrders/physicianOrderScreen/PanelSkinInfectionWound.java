package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.dataObj.physicianOrders.Wound;
import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelSkinInfectionWound extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4331277750953752345L;
	private JCheckBox cbRemoveStaples;
	private JCheckBox cbCleanseNs;
	private JCheckBox cbShift;
	private JCheckBox cbOta;
	private JComboBox cmbDailyBid;
	private JTextField txtLocationWound;
	private JDateChooser dcOn;
	private Wound wound;

	public PanelSkinInfectionWound() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setOpaque(false);
		setBounds(0, 0, 533, 128);

		final JPanel panel_wound = new JPanel();
		panel_wound.setBackground(Color.WHITE);
		panel_wound.setLayout(null);
		panel_wound.setOpaque(false);
		panel_wound.setBounds(0, 0, 533, 128);
		add(panel_wound);

		final JLabel locationLabel = new JLabel();
		locationLabel.setForeground(ColorConstants.DEF_COLOR);
		locationLabel.setText("Location");
		locationLabel.setBounds(10, 10, 67, 14);
		panel_wound.add(locationLabel);

		txtLocationWound = new JTextField();
		txtLocationWound.setBounds(104, 7, 130, 21);
		panel_wound.add(txtLocationWound);

		cbOta = new JCheckBox();
		cbOta.setForeground(ColorConstants.DEF_COLOR);
		cbOta.setBackground(Color.WHITE);
		cbOta.setText("OTA");
		cbOta.setBounds(10, 34, 67, 18);
		panel_wound.add(cbOta);

		cbShift = new JCheckBox();
		cbShift.setForeground(ColorConstants.DEF_COLOR);
		cbShift.setBackground(Color.WHITE);
		cbShift.setText("SHIFT");
		cbShift.setBounds(104, 34, 94, 18);
		panel_wound.add(cbShift);

		cbCleanseNs = new JCheckBox();
		cbCleanseNs.setForeground(ColorConstants.DEF_COLOR);
		cbCleanseNs.setBackground(Color.WHITE);
		cbCleanseNs.setText("Cleanse and NS, COVER and DRY DSC");
		cbCleanseNs.setBounds(10, 58, 247, 18);
		panel_wound.add(cbCleanseNs);

		cmbDailyBid = new JComboBox();
		cmbDailyBid.setBackground(Color.WHITE);
		cmbDailyBid.setBounds(265, 57, 88, 21);
		panel_wound.add(cmbDailyBid);
		cmbDailyBid.setModel(new DefaultComboBoxModel(new String[] { "",
				"DAILY", "BID" }));

		cbRemoveStaples = new JCheckBox();
		cbRemoveStaples.setForeground(ColorConstants.DEF_COLOR);
		cbRemoveStaples.setBackground(Color.WHITE);
		cbRemoveStaples.setText("Remove Staples/ ");
		cbRemoveStaples.setBounds(10, 82, 130, 18);
		panel_wound.add(cbRemoveStaples);

		final JLabel onLabel = new JLabel();
		onLabel.setForeground(ColorConstants.DEF_COLOR);
		onLabel.setText("On");
		onLabel.setBounds(146, 82, 24, 18);
		panel_wound.add(onLabel);

		dcOn = new JDateChooser();
		dcOn.setDateFormatString("MM/dd/yyyy");
		dcOn.setBounds(178, 82, 79, 21);
		panel_wound.add(dcOn);
	}

	public void doSave() {
		Wound refWound = new Wound();

		refWound.setLocationWound(txtLocationWound.getText());
		refWound.setOta(cbOta.isSelected());
		refWound.setShift(cbShift.isSelected());
		refWound.setCleanseNs(cbCleanseNs.isSelected());
		refWound.setRemoveStaples(cbRemoveStaples.isSelected());
		refWound.setDailyBid((String) cmbDailyBid.getSelectedItem());
		refWound.setOn(dcOn.getDate());

		setWound(refWound);

	}

	public void doUpdate() {

		txtLocationWound.setText(this.wound.getLocationWound());
		cbOta.setSelected(this.wound.isOta());
		cbShift.setSelected(this.wound.isShift());
		cbCleanseNs.setSelected(this.wound.isCleanseNs());
		cbRemoveStaples.setSelected(this.wound.isRemoveStaples());
		cmbDailyBid.setSelectedItem(this.wound.getDailyBid());
		dcOn.setDate(this.wound.getOn());

	}

	public Wound getWound() {
		return wound;
	}

	public void setWound(Wound wound) {
		this.wound = wound;
	}

}
