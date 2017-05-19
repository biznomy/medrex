package medrex.client.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.controls.PhoneField;

import com.jgoodies.validation.ValidationResult;

public class PanelResidentInfoGeneralAddDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 734801572524351035L;
	private JCheckBox cbPhonePrimary;
	private JComboBox cmbType;
	private PhoneField txtNumber;
	private JLabel orderLabel;
	private JButton cancelButton;
	private JButton saveButton;
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelResidentInfoGeneralAddDialog() {
		super();
		setBackground(UIManager.getColor("Button.background"));
		setPreferredSize(new Dimension(217, 125));
		setSize(new Dimension(330, 273));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("Button.background"));
		panel_2.setBounds(0, 0, 241, 94);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setText("Type");
		diagnosisLabel.setBounds(10, 60, 70, 14);
		panel_2.add(diagnosisLabel);

		orderLabel = new JLabel();
		orderLabel.setText("Number:");
		orderLabel.setBounds(10, 23, 70, 14);
		panel_2.add(orderLabel);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		txtNumber = new PhoneField();
		txtNumber.setBounds(62, 20, 94, 20);
		panel_2.add(txtNumber);

		cmbType = new JComboBox();
		cmbType.setModel(new DefaultComboBoxModel(new String[] { "",
				"HeadPhone", "Landline(Home)", "Landline(Office)" }));
		cmbType.setBounds(62, 55, 94, 25);
		panel_2.add(cmbType);

		cbPhonePrimary = new JCheckBox();
		cbPhonePrimary.setText("IsPrimary");
		cbPhonePrimary.setBounds(162, 42, 94, 14);
		panel_2.add(cbPhonePrimary);

		saveButton = new JButton();
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent arg0) {

				if (doValidate()) {
					doSave();
					Global.frameResidentInfoGeneralAddDialog.dispose();
				}
			}
		});

		saveButton.setText("Save");
		saveButton.setBounds(10, 100, 93, 23);
		add(saveButton);

		cancelButton = new JButton();
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentResidentMain = null;
				Global.frameResidentInfoGeneralAddDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(109, 100, 104, 23);
		add(cancelButton);
		updateData();
	}

	public void doSave() {
		// ResidentInfoGeneralPhone rc = new ResidentInfoGeneralPhone();
		// rc.setResidentId(Global.currentResidenceKey);
		// rc.setSerial(Global.currentcontactPhoneKey);
		// rc.setPhoneNumber(txtNumber.getNumber());
		// rc.setPhoneType((String) cmbType.getSelectedItem());
		// rc.setPhonePrimary(cbPhonePrimary.isSelected());
		// try{
		// // Global.currentResidentInfoGeneralPhoneKey =
		// Global.ltcServer.insertOrUpdateResidentInfoGeneralPhone(rc);
		// }catch(Exception e){
		// e.printStackTrace();
		// }
	}

	public void updateData() {
		// if (Global.currentcontactPhoneKey != 0) {
		// try {
		// ResidentInfoGeneralPhone ref =
		// Global.ltcServer.getResidentInfoGeneralPhone(Global.currentcontactPhoneKey);
		// txtNumber.setNumber(ref.getPhoneNumber());
		// cmbType.setSelectedItem(ref.getPhoneType());
		// cbPhonePrimary.setSelected(ref.isPhonePrimary());
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// } else{
		// txtNumber.setNumber(null);
		// cmbType.setSelectedItem(null);
		// cbPhonePrimary.setSelected(false);
		// }
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
				txtNumber, "Phone Field", 10))) {
			vRes.addAllFrom(temp);
		}

		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Resident Info");
			return false;
		}
	}
}
