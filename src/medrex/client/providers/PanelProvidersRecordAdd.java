package medrex.client.providers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.providers.ProvidersRecordForm;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelProvidersRecordAdd extends PopUpView {

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private JLabel errorLabel;
	private JxComboBox cmbState;
	private JLabel lastNameLabel_10;
	private JLabel lastNameLabel_9;
	private JLabel lastNameLabel_8;
	private JTextField txtEmailAddress;
	private PhoneField txtCellNumber;
	private PhoneField txtFax;
	private PhoneField txtPhoneNumber;
	private JLabel lastNameLabel_7;
	private JFormattedTextField txtZip;
	private JLabel lastNameLabel_6;
	private JLabel lastNameLabel_5;
	private JTextField txtCity;
	private JLabel lastNameLabel_4;
	private JTextArea txtAddress;
	private JLabel lastNameLabel_3;
	private JLabel ProvidersLabel;
	private JTextField txtProviderSurName;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JxComboBox cmbProviderType;

	private JTextField txtProviderName;

	private ControllerProvider controllerProvider;

	private Map presentationMap;
	private PresentationModel presentationModel;

	/**
	 * Create the panel
	 */
	public PanelProvidersRecordAdd(ControllerProvider controllerProvider) {
		super();
		this.controllerProvider = controllerProvider;
		presentationMap = new HashMap();

		setBackground(Color.WHITE);
		// Global.panelProvidersRecordAdd = this;
		setLayout(null);
		// setPreferredSize(new Dimension(700, 800));

		setPreferredSize(new Dimension(750, 550));
		setSize(new Dimension(750, 500));

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("COMPANY NAME :");
		firstNameLabel.setBounds(10, 140, 104, 16);
		add(firstNameLabel);

		txtProviderName = new JTextField();
		presentationMap.put("providerName", txtProviderName);
		txtProviderName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtProviderName.setBounds(120, 140, 225, 20);
		add(txtProviderName);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel.setFont(new Font("", Font.BOLD, 12));
		lastNameLabel.setText("CONTACT NAME :");
		lastNameLabel.setBounds(10, 170, 104, 16);
		add(lastNameLabel);

		final JLabel userLabel = new JLabel();
		userLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		userLabel.setFont(new Font("", Font.BOLD, 12));
		userLabel.setText("PROVIDER TYPE:");
		userLabel.setBounds(367, 290, 94, 16);
		add(userLabel);

		cmbProviderType = new JxComboBox();
		presentationMap.put("providerType", cmbProviderType);
		cmbProviderType.setArc(0.4f);
		cmbProviderType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbProviderType.setForeground(DEF_COLOR);
		cmbProviderType.setBackground(Color.WHITE);
		cmbProviderType.setBounds(465, 290, 225, 20);
		add(cmbProviderType);

		final JxButton btnSave = new JxButton();
		btnSave.setArc(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(186, 370, 106, 26);
		if (controllerProvider.getType().equalsIgnoreCase("residentTabPro")) {
			btnSave.setVisible(false);
		}
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(322, 370, 106, 26);
		if (controllerProvider.getType().equalsIgnoreCase("residentTabPro")) {
			btnCancel.setVisible(false);
		}
		add(btnCancel);

		txtProviderSurName = new JTextField();
		presentationMap.put("providerSurName", txtProviderSurName);
		txtProviderSurName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtProviderSurName.setBounds(120, 170, 225, 20);
		add(txtProviderSurName);

		ProvidersLabel = new JLabel();
		ProvidersLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		ProvidersLabel.setFont(new Font("", Font.BOLD, 36));
		ProvidersLabel.setText("PROVIDERS");
		ProvidersLabel.setBounds(220, 25, 258, 47);
		add(ProvidersLabel);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_3.setText("ADDRESS:");
		lastNameLabel_3.setBounds(10, 200, 81, 16);
		add(lastNameLabel_3);

		txtAddress = new JTextArea();
		presentationMap.put("address", txtAddress);
		txtAddress.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtAddress.setBorder(new TitledBorder(null, "",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		txtAddress.setWrapStyleWord(true);
		txtAddress.setLineWrap(true);
		txtAddress.setBounds(120, 200, 225, 47);
		add(txtAddress);

		lastNameLabel_4 = new JLabel();
		lastNameLabel_4.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_4.setText("CITY:");
		lastNameLabel_4.setBounds(10, 257, 81, 16);
		add(lastNameLabel_4);

		txtCity = new JTextField();
		presentationMap.put("city", txtCity);
		txtCity.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtCity.setBounds(120, 257, 225, 20);
		add(txtCity);

		lastNameLabel_5 = new JLabel();
		lastNameLabel_5.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_5.setText("STATE:");
		lastNameLabel_5.setBounds(10, 290, 81, 16);
		add(lastNameLabel_5);

		lastNameLabel_6 = new JLabel();
		lastNameLabel_6.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_6.setText("ZIP:");
		lastNameLabel_6.setBounds(372, 140, 81, 16);
		add(lastNameLabel_6);

		txtZip = new JFormattedTextField(FieldFormatter.ZIP);
		presentationMap.put("zip", txtZip);
		txtZip.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtZip.setBounds(465, 140, 225, 20);
		add(txtZip);

		lastNameLabel_7 = new JLabel();
		lastNameLabel_7.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_7.setText("PHONE:");
		lastNameLabel_7.setBounds(372, 170, 81, 16);
		add(lastNameLabel_7);

		txtPhoneNumber = new PhoneField();
		presentationMap.put("phoneNumber", txtPhoneNumber);
		txtPhoneNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPhoneNumber.setBounds(465, 170, 97, 22);
		add(txtPhoneNumber);

		txtFax = new PhoneField();
		presentationMap.put("fax", txtFax);
		txtFax.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtFax.setBounds(465, 200, 97, 22);
		add(txtFax);

		txtCellNumber = new PhoneField();
		presentationMap.put("cellNumber", txtCellNumber);
		txtCellNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtCellNumber.setBounds(465, 230, 97, 22);
		add(txtCellNumber);

		txtEmailAddress = new JTextField();
		presentationMap.put("emailAddress", txtEmailAddress);
		txtEmailAddress.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtEmailAddress.setBounds(465, 260, 225, 20);
		add(txtEmailAddress);

		lastNameLabel_8 = new JLabel();
		lastNameLabel_8.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_8.setText("FAX:");
		lastNameLabel_8.setBounds(372, 200, 81, 16);
		add(lastNameLabel_8);

		lastNameLabel_9 = new JLabel();
		lastNameLabel_9.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_9.setText("CELL:");
		lastNameLabel_9.setBounds(372, 230, 81, 16);
		add(lastNameLabel_9);

		lastNameLabel_10 = new JLabel();
		lastNameLabel_10.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_10.setText("EMAIL:");
		lastNameLabel_10.setBounds(372, 260, 81, 16);
		add(lastNameLabel_10);

		cmbState = new JxComboBox();
		presentationMap.put("state", cmbState);
		cmbState.setArc(0.4f);
		cmbState.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbState.setForeground(DEF_COLOR);
		cmbState.setBackground(Color.WHITE);
		cmbState.setBounds(120, 289, 225, 20);
		add(cmbState);

		errorLabel = new JLabel();
		errorLabel.setText("");
		errorLabel.setForeground(Color.red);
		errorLabel.setBounds(10, 100, 335, 16);
		add(errorLabel);

		fillCombos();
		updateData();

		presentationModel = new PresentationModel(presentationMap,
				ProvidersRecordForm.class, controllerProvider, errorLabel);

		presentationModel.validateAll();

	}

	public void fillCombos() {
		/*
		 * cmbProviderType.setModel(new DefaultComboBoxModel(new String[] { "",
		 * "AMBULANCE", "EMPLOYER", "FUNERAL","HOSPITAL","MORTUARY","PHARMACY"
		 * }));
		 */
		/*
		 * cmbState.setModel(new DefaultComboBoxModel(new String[] { "",
		 * "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
		 * "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
		 * "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana",
		 * "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
		 * "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
		 * "New Hampshire", "New Jersey", "New Mexico", "New York",
		 * "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
		 * "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
		 * "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
		 * "West Virginia", "Wisconsin", "Wyoming" }));
		 */

		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		List<MasterList> providerTypesComboItems = new ArrayList<MasterList>();

		try {
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
			providerTypesComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(ProviderTypes.class);
		} catch (Exception e) {

		}

		cmbState.removeAllItems();
		for (int i = 0; i < stateComboItems.size(); i++) {
			MasterList m = stateComboItems.get(i);
			cmbState.addItem(m);
		}
		State st = new State();
		st.setId(0);
		st.setMsterName(" ");
		cmbState.insertItemAt(st, 0);
		cmbState.setSelectedIndex(0);

		cmbProviderType.removeAllItems();
		for (int i = 0; i < providerTypesComboItems.size(); i++) {
			MasterList m = providerTypesComboItems.get(i);
			cmbProviderType.addItem(m);
		}
		ProviderTypes providerTypes = new ProviderTypes();
		providerTypes.setId(0);
		providerTypes.setMsterName(" ");
		cmbProviderType.insertItemAt(providerTypes, 0);
		cmbProviderType.setSelectedIndex(0);

	}

	public boolean doSave() {
		ProvidersRecordForm refProviders = new ProvidersRecordForm();
		refProviders.setSerial(controllerProvider.getCurrentSerial());

		refProviders.setState((State) cmbState.getSelectedItem());
		refProviders.setEmailAddress(txtEmailAddress.getText());
		refProviders.setCellNumber(txtCellNumber.getNumber());
		refProviders.setFax(txtFax.getNumber());
		refProviders.setPhoneNumber(txtPhoneNumber.getNumber());
		refProviders.setCity(txtCity.getText());
		refProviders.setAddress(txtAddress.getText());

		refProviders.setProviderSurName(txtProviderSurName.getText());
		refProviders.setProviderType((ProviderTypes) cmbProviderType
				.getSelectedItem());
		refProviders.setProviderName(txtProviderName.getText());
		refProviders.setZip(txtZip.getText());

		List errors = controllerProvider.doValidate(refProviders, "");

		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Income Info");
			m.setVisible(true);
			return false;
		} else {
			try {
				controllerProvider
						.insertOrUpdateProvidersRecordForm(refProviders);
				JOptionPane.showMessageDialog(this, "Saved successfully");
			} catch (Exception eee) {
				eee.printStackTrace();
			}
			return true;
		}
	}

	public void updateData() {

		ProvidersRecordForm refProviders = null;
		if (controllerProvider.getCurrentSerial() != 0) {
			try {
				refProviders = controllerProvider.getProvidersRecordForm();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			cmbState.setSelectedItem(refProviders.getState());
			txtEmailAddress.setText(refProviders.getEmailAddress());
			txtCellNumber.setNumber(refProviders.getCellNumber());
			txtFax.setNumber(refProviders.getFax());
			txtPhoneNumber.setNumber(refProviders.getPhoneNumber());
			txtCity.setText(refProviders.getCity());
			txtAddress.setText(refProviders.getAddress());
			// txtPhysicianId.setText(refDoct.getPhysicianId());
			txtProviderSurName.setText(refProviders.getProviderSurName());
			cmbProviderType.setSelectedItem(refProviders.getProviderType());
			txtProviderName.setText(refProviders.getProviderName());
			txtZip.setText(refProviders.getZip());

		}
	}

	/*
	 * public boolean doValidate() { ValidationResult vRes = new
	 * ValidationResult(); ValidationResult temp;
	 * 
	 * if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	 * txtProviderName, "Company Name Field"))) { vRes.addAllFrom(temp); } if
	 * (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	 * txtProviderSurName, "Contact Person Name Field"))) {
	 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
	 * FieldValidation.isValidPhone( txtPhoneNumber, "Phone number Field", 10)))
	 * { vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
	 * FieldValidation.isValidPhone( txtCellNumber, "Cell number Field", 10))) {
	 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
	 * FieldValidation.isValidPhone( txtFax, "Fax Field", 10))) {
	 * vRes.addAllFrom(temp); }
	 * 
	 * if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyEmail(
	 * txtEmailAddress, "Email Address"))) { vRes.addAllFrom(temp); }
	 * 
	 * System.out.println(FieldValidation.getMessages(vRes.getMessages()));
	 * 
	 * if (!FieldValidation.isEmpty(vRes)) { FieldValidation.Msgbox(vRes,
	 * "Provider "); return false; } else { //
	 * FieldValidation.Msgbox("Saved successfully", "Provider ");
	 * JOptionPane.showMessageDialog(this, "saved successfully"); return true; }
	 * }
	 */

	@Override
	public String getTitle() {
		return ("Add Providers Record");
	}

}
