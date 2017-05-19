package medrex.client.main.resident.contactinfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.PhoneType;
import medrex.commons.vo.resident.ResidentContactPhone;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelResidentContactPhoneAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8838512258582992929L;
	private JLabel errorLabel;
	private JPanel errorPanel;

	private static JxComboBox cmbType;

	private static PhoneField txtNumber;
	private static JCheckBox checkBoxPrimary;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private Map<String, JComponent> presentationMap;
	private PresentationModel presentationModel;
	private ControllerResidentInfoContactPhone controllerResidentInfoContactPhone;

	/**
	 * Create the dialog
	 */
	public PanelResidentContactPhoneAdd(
			ControllerResidentInfoContactPhone controllerResidentInfoContactPhone) {
		super();
		setLayout(null);
		this.controllerResidentInfoContactPhone = controllerResidentInfoContactPhone;
		presentationMap = new HashMap<String, JComponent>();
		setBackground(Color.WHITE);
		setBounds(100, 100, 352, 172);

		errorPanel = new JPanel();
		add(errorPanel);
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setBounds(10, 3, 326, 20);

		errorLabel = new JLabel();
		errorLabel.setBounds(0, 0, 326, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		final JLabel numberLabel = new JLabel();
		numberLabel.setForeground(DEF_COLOR);
		numberLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberLabel.setBackground(Color.WHITE);
		numberLabel.setText("NUMBER");
		numberLabel.setBounds(10, 29, 56, 16);
		add(numberLabel);

		txtNumber = new PhoneField();
		presentationMap.put("number", txtNumber);
		txtNumber.setForeground(DEF_COLOR);
		txtNumber.setBackground(Color.WHITE);
		txtNumber.setBounds(69, 29, 97, 22);
		add(txtNumber);

		final JLabel typeLabel = new JLabel();
		typeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		typeLabel.setForeground(DEF_COLOR);
		typeLabel.setBackground(Color.WHITE);
		typeLabel.setText("TYPE");
		typeLabel.setBounds(10, 57, 66, 16);
		add(typeLabel);

		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setText("SAVE");
		saveButton.setBounds(69, 103, 80, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("CANCEL");
		cancelButton.setBounds(169, 103, 87, 26);
		add(cancelButton);

		cmbType = new JxComboBox();
		presentationMap.put("type", cmbType);
		cmbType.setArc(0.4f);
		cmbType.setForeground(DEF_COLOR);
		cmbType.setBackground(Color.WHITE);
		cmbType.setBounds(66, 60, 128, 25);
		add(cmbType);

		/*
		 * cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "HandPhone", "Landline(Home)", "Landline(Office)" }));
		 */

		List<MasterList> phoneTypesComboItems = new ArrayList<MasterList>();
		try {
			phoneTypesComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(PhoneType.class);
		} catch (Exception e) {

		}
		cmbType.removeAllItems();
		for (int i = 0; i < phoneTypesComboItems.size(); i++) {
			MasterList m = phoneTypesComboItems.get(i);
			cmbType.addItem(m);
		}
		PhoneType ph = new PhoneType();
		ph.setId(0);
		ph.setMsterName(" ");
		cmbType.insertItemAt(ph, 0);
		cmbType.setSelectedIndex(0);

		checkBoxPrimary = new JCheckBox();
		checkBoxPrimary.setForeground(DEF_COLOR);
		checkBoxPrimary.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBoxPrimary.setBackground(Color.WHITE);
		checkBoxPrimary.setText("Is Primary");
		checkBoxPrimary.setBounds(218, 25, 118, 24);
		add(checkBoxPrimary);

		updateData();

		presentationModel = new PresentationModel(presentationMap,
				ResidentContactPhone.class, controllerResidentInfoContactPhone,
				errorLabel);
		presentationModel.validateAll();

	}

	public boolean doSave() {
		ResidentContactPhone rcp = new ResidentContactPhone();

		rcp.setNumber(txtNumber.getNumber());
		rcp.setType((PhoneType) cmbType.getSelectedItem());
		if (checkBoxPrimary.isSelected()) {
			rcp.setIsPrimary(1);
		} else {
			rcp.setIsPrimary(0);
		}
		List<String> errors = controllerResidentInfoContactPhone.doValidate(
				rcp, "");

		if (errors.size() > 0) {
			MsgBox m = new MsgBox(errors);
			m.addErrorList(errors);
			m.setTitle("Error saving contact phone");
			m.setVisible(true);
			return false;
		} else {
			controllerResidentInfoContactPhone.insertOrUpdate(rcp);
			return true;
		}

	}

	public void updateData() {
		if (controllerResidentInfoContactPhone.getSelectedPhoneRow() != -1) {
			ResidentContactPhone rcp = controllerResidentInfoContactPhone
					.getCurrentResidentContactPhone();
			txtNumber.setNumber(rcp.getNumber());
			cmbType.setSelectedItem(rcp.getType());
			if (rcp.getIsPrimary() == 0) {
				checkBoxPrimary.setSelected(false);
			} else {
				checkBoxPrimary.setSelected(true);
			}
		}
	}

	@Override
	public String getTitle() {
		return "Contact phone";
	}

}
