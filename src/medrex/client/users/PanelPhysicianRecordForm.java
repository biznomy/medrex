package medrex.client.users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.others.Doctors;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDrawPanel;

public class PanelPhysicianRecordForm extends JPanel implements Form {

	private JxDrawPanel signatureCom;
	private JLabel lastNameLabel_13;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JxComboBox cmbState;
	private JLabel lastNameLabel_12;
	private JLabel lastNameLabel_11;
	private JLabel lastNameLabel_10;
	private JLabel lastNameLabel_9;
	private JLabel lastNameLabel_8;
	private JFormattedTextField txtFederalId;
	private JFormattedTextField txtNpi;
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
	private JFormattedTextField txtPinNumber;
	private JFormattedTextField txtImpField;
	private JLabel lastNameLabel_3;
	private JLabel lastNameLabel_2;
	private JLabel lastNameLabel_1;
	private JFormattedTextField txtPhysicianId;
	private JLabel firstNameLabel_1;
	private JLabel doctorsLabel;
	private JTextField txtPhysicianSurName;

	private Map myMap;
	private PresentationModel presentationModel;
	private ControllerPhysicianRecordForm controllerPhysicianRecordForm;
	private int num = 0;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JxComboBox cmbDoctorType;

	private JTextField txtPhysicianName;
	// private FrameDoctorsType frameDoctorsType;
	private JLabel errorLabel;

	private ControllerUsers controllerUsers;

	protected MyFocusTraversalPolicy focusTraversalPolicy;

	/**
	 * Create the panel
	 */

	public class MyFocusTraversalPolicy extends FocusTraversalPolicy {
		@Override
		public Component getComponentAfter(Container focusCycleRoot,
				Component aComponent) {
			if (aComponent.equals(txtPhysicianName))
				return txtPhysicianSurName;
			else if (aComponent.equals(txtPhysicianSurName))
				return txtImpField;
			else if (aComponent.equals(txtImpField))
				return txtPinNumber;
			else if (aComponent.equals(txtPinNumber))
				return txtAddress;
			else if (aComponent.equals(txtAddress))
				return txtCity;
			else if (aComponent.equals(txtCity))
				return cmbState;
			else if (aComponent.equals(cmbState))
				return txtZip;
			else if (aComponent.equals(txtZip))
				return txtPhoneNumber;
			else if (aComponent.equals(txtPhoneNumber))
				return txtCellNumber;
			else if (aComponent.equals(txtCellNumber))
				return txtEmailAddress;
			else if (aComponent.equals(txtEmailAddress))
				return txtNpi;
			else if (aComponent.equals(txtNpi))
				return txtFederalId;
			else if (aComponent.equals(txtFederalId))
				return cmbDoctorType;
			else
				return txtPhysicianName;
		}

		@Override
		public Component getComponentBefore(Container focusCycleRoot,
				Component aComponent) {
			return txtCellNumber;
		}

		@Override
		public Component getDefaultComponent(Container focusCycleRoot) {
			return txtPhysicianName;
		}

		@Override
		public Component getFirstComponent(Container focusCycleRoot) {
			return txtPhysicianName;
		}

		@Override
		public Component getLastComponent(Container focusCycleRoot) {
			return cmbDoctorType;
		}
	}

	public PanelPhysicianRecordForm(ControllerUsers controllerUsers) {
		super();
		this.controllerUsers = controllerUsers;
		controllerPhysicianRecordForm = new ControllerPhysicianRecordForm(
				controllerUsers);
		myMap = new HashMap();
		focusTraversalPolicy = new MyFocusTraversalPolicy();
		setFocusTraversalPolicy(focusTraversalPolicy);
		setFocusTraversalPolicyProvider(true);

		setBackground(Color.WHITE);
		// Global.panelPhysicianRecordForm = this;
		setLayout(null);
		setPreferredSize(new Dimension(600, 375));
		setSize(600, 357);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("FIRST NAME :");
		firstNameLabel.setBounds(10, 110, 81, 16);
		add(firstNameLabel);

		txtPhysicianName = new JTextField();
		txtPhysicianName.setFocusAccelerator('1');
		txtPhysicianName.setFocusCycleRoot(false);
		txtPhysicianName.setFocusTraversalPolicyProvider(false);
		myMap.put("physicianName", txtPhysicianName);
		txtPhysicianName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPhysicianName.setBounds(120, 110, 150, 20);
		add(txtPhysicianName);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel.setFont(new Font("", Font.BOLD, 12));
		lastNameLabel.setText("LAST NAME :");
		lastNameLabel.setBounds(10, 140, 81, 16);
		add(lastNameLabel);

		final JLabel userLabel = new JLabel();
		userLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		userLabel.setFont(new Font("", Font.BOLD, 12));
		userLabel.setText("PHYSICIAN TYPE:");
		userLabel.setBounds(302, 308, 99, 16);
		add(userLabel);

		cmbDoctorType = new JxComboBox();
		myMap.put("doctorType", cmbDoctorType);
		cmbDoctorType.setArc(0.4f);
		cmbDoctorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbDoctorType.setForeground(DEF_COLOR);
		cmbDoctorType.setBackground(Color.WHITE);
		cmbDoctorType.setBounds(420, 307, 150, 20);

		add(cmbDoctorType);

		txtPhysicianSurName = new JTextField();
		txtPhysicianSurName.setFocusTraversalPolicyProvider(false);
		txtPhysicianSurName.setFocusCycleRoot(false);
		myMap.put("physicianSurName", txtPhysicianSurName);
		txtPhysicianSurName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPhysicianSurName.setBounds(120, 140, 150, 20);
		add(txtPhysicianSurName);

		doctorsLabel = new JLabel();
		doctorsLabel.setForeground(SystemColor.desktop);
		doctorsLabel.setFont(new Font("", Font.BOLD, 24));
		doctorsLabel.setText("PHYSICIANS");
		doctorsLabel.setBounds(10, 10, 225, 38);
		add(doctorsLabel);

		firstNameLabel_1 = new JLabel();
		firstNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		firstNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		firstNameLabel_1.setText("PHYSICIAN-ID:");
		firstNameLabel_1.setBounds(10, 80, 81, 16);
		add(firstNameLabel_1);

		txtPhysicianId = new JFormattedTextField(FieldFormatter.GENERAL);
		// txtPhysicianId.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtPhysicianId.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPhysicianId.setEditable(false);
		txtPhysicianId.setBackground(Color.WHITE);
		txtPhysicianId.setBounds(120, 80, 150, 20);
		add(txtPhysicianId);

		lastNameLabel_1 = new JLabel();
		lastNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_1.setText("IMP:");
		lastNameLabel_1.setBounds(10, 170, 81, 16);
		add(lastNameLabel_1);

		lastNameLabel_2 = new JLabel();
		lastNameLabel_2.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_2.setText("PIN:");
		lastNameLabel_2.setBounds(10, 200, 81, 16);
		add(lastNameLabel_2);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_3.setText("ADDRESS:");
		lastNameLabel_3.setBounds(10, 230, 81, 16);
		add(lastNameLabel_3);

		txtImpField = new JFormattedTextField(FieldFormatter.IMP);
		txtImpField.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("impField", txtImpField);
		// txtImpField = new JTextField();
		txtImpField.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtImpField.setBounds(120, 170, 150, 20);
		add(txtImpField);

		txtPinNumber = new JFormattedTextField(FieldFormatter.PIN);
		txtPinNumber.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// txtPinNumber = new JTextField();
		// myMap.put("pinNumber", txtPinNumber);
		txtPinNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPinNumber.setBounds(120, 200, 150, 20);
		add(txtPinNumber);

		txtAddress = new JTextArea();
		// txtAddress.setBorder(new TitledBorder(null, "",
		// TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
		// null, null));
		txtAddress.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtAddress.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtAddress.setWrapStyleWord(true);
		txtAddress.setLineWrap(true);
		txtAddress.setBounds(120, 230, 150, 47);
		add(txtAddress);

		lastNameLabel_4 = new JLabel();
		lastNameLabel_4.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_4.setText("CITY:");
		lastNameLabel_4.setBounds(10, 290, 81, 16);
		add(lastNameLabel_4);

		txtCity = new JTextField();
		txtCity.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("city", txtCity);
		txtCity.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtCity.setBounds(120, 290, 150, 20);
		add(txtCity);

		lastNameLabel_5 = new JLabel();
		lastNameLabel_5.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_5.setText("STATE:");
		lastNameLabel_5.setBounds(320, 80, 81, 16);
		add(lastNameLabel_5);

		lastNameLabel_6 = new JLabel();
		lastNameLabel_6.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_6.setText("ZIP:");
		lastNameLabel_6.setBounds(320, 110, 81, 16);
		add(lastNameLabel_6);

		txtZip = new JFormattedTextField(FieldFormatter.ZIP);
		txtZip.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("zip", txtZip);
		txtZip.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtZip.setBounds(420, 110, 150, 20);
		add(txtZip);

		lastNameLabel_7 = new JLabel();
		lastNameLabel_7.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_7.setText("PHONE:");
		lastNameLabel_7.setBounds(320, 140, 81, 16);
		add(lastNameLabel_7);

		txtPhoneNumber = new PhoneField();
		txtPhoneNumber.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtPhoneNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtPhoneNumber.setBounds(420, 140, 150, 22);
		add(txtPhoneNumber);

		txtFax = new PhoneField();
		txtFax.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtFax.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtFax.setBounds(420, 340, 150, 22);
		add(txtFax);

		txtCellNumber = new PhoneField();
		txtCellNumber.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtCellNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtCellNumber.setBounds(420, 172, 150, 22);
		add(txtCellNumber);

		txtEmailAddress = new JTextField();
		txtEmailAddress.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("emailAddress", txtEmailAddress);
		txtEmailAddress.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtEmailAddress.setBounds(420, 203, 150, 20);
		add(txtEmailAddress);

		txtNpi = new JFormattedTextField(FieldFormatter.GENERAL);
		txtNpi.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("npi", txtNpi);
		txtNpi.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtNpi.setBounds(420, 236, 150, 20);
		add(txtNpi);

		txtFederalId = new JFormattedTextField(FieldFormatter.GENERAL);
		txtFederalId.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// myMap.put("federalId", txtFederalId);
		txtFederalId.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtFederalId.setBounds(420, 275, 150, 20);
		add(txtFederalId);

		// lastNameLabel_8 = new JLabel();
		// lastNameLabel_8.setForeground(GuiModes.DESIGNER_FORMS
		// .getDefaultForegroundColor());
		// lastNameLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		// lastNameLabel_8.setText("FAX:");
		// lastNameLabel_8.setBounds(320, 170, 81, 16);
		// add(lastNameLabel_8);

		lastNameLabel_9 = new JLabel();
		lastNameLabel_9.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_9.setText("CELL:");
		lastNameLabel_9.setBounds(320, 172, 81, 16);
		add(lastNameLabel_9);

		lastNameLabel_10 = new JLabel();
		lastNameLabel_10.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_10.setText("EMAIL:");
		lastNameLabel_10.setBounds(320, 204, 81, 16);
		add(lastNameLabel_10);

		lastNameLabel_11 = new JLabel();
		lastNameLabel_11.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_11.setText("NPI:");
		lastNameLabel_11.setBounds(322, 242, 81, 16);
		add(lastNameLabel_11);

		lastNameLabel_12 = new JLabel();
		lastNameLabel_12.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_12.setText("FEDERAL ID:");
		lastNameLabel_12.setBounds(320, 275, 81, 16);
		add(lastNameLabel_12);

		cmbState = new JxComboBox();
		myMap.put("state", cmbState);
		cmbState.setArc(0.4f);
		cmbState.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbState.setForeground(DEF_COLOR);
		cmbState.setBackground(Color.WHITE);
		cmbState.setBounds(420, 80, 150, 20);
		add(cmbState);
		fillCombos();

		final JPanel errorPanel = new JPanel();
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setLayout(null);
		errorPanel.setBounds(10, 54, 486, 20);
		add(errorPanel);

		errorLabel = new JLabel();
		errorLabel.setText("");
		errorPanel.add(errorLabel);
		errorLabel.setBounds(0, 0, 486, 20);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		presentationModel = new PresentationModel(myMap, Doctors.class,
				controllerPhysicianRecordForm, errorLabel);

		lastNameLabel_13 = new JLabel();
		lastNameLabel_13.setText("SIGNATURE");
		lastNameLabel_13.setBounds(10, 321, 81, 16);
		lastNameLabel_13.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		add(lastNameLabel_13);

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBounds(120, 320, 150, 49);
		panel.setBorder(new CompoundBorder(new LineBorder(DEF_COLOR, 1, false),
				new EmptyBorder(1, 1, 1, 1)));
		add(panel);

		signatureCom = new JxDrawPanel(150, 47);
		panel.add(signatureCom, BorderLayout.CENTER);
		signatureCom.setLayout(null);

		final JLabel faxLabel = new JLabel();
		faxLabel.setText("FAX :");
		faxLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		faxLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		faxLabel.setBounds(320, 343, 66, 16);
		add(faxLabel);

		presentationModel.validateAll();

	}

	public void doLoad() {
		fillCombos();
		// fillPhysicianTypeCombo();
		doUpdate();
	}

	public void fillCombos() {
		/*
		 * cmbState.setModel(new DefaultComboBoxModel(new String[] { "Alabama",
		 * "Alaska", "Arizona", "Arkansas", "California", "Colorado",
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

		/*
		 * cmbDoctorType.setModel(new DefaultComboBoxModel(new String[] { "",
		 * "ALT_PHYS", "CLERGY", "DENTIST","OPHTH", "PHYS", "Physicians",
		 * "PODIATRIST", "PSYCH" }));
		 */

		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		List<MasterList> doctorTypeComboItems = new ArrayList<MasterList>();
		try {
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
			doctorTypeComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(DoctorTypes.class);
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

		cmbDoctorType.removeAllItems();
		for (int i = 0; i < doctorTypeComboItems.size(); i++) {
			MasterList m = doctorTypeComboItems.get(i);
			cmbDoctorType.addItem(m);
		}
		DoctorTypes dType = new DoctorTypes();
		dType.setId(0);
		dType.setMsterName(" ");
		cmbDoctorType.insertItemAt(dType, 0);
		cmbDoctorType.setSelectedIndex(0);

	}

	/*
	 * public void fillPhysicianTypeCombo() { List l = null; try { l =
	 * MedrexClientManager.getInstance().getDoctorsTypeRecords();
	 * }catch(Exception e) {} Iterator i = l.iterator(); while(i.hasNext()) {
	 * DoctorsType d = (DoctorsType) i.next(); String str = d.getDoctorType();
	 * cmbDoctorType.addItem(str); }
	 * 
	 * 
	 * }
	 */

	public int doSave() {

		Doctors refDoct = new Doctors();
		// refDoct.setSerial(Global.currentPhysicianRecordFormKey);

		refDoct.setSerial(controllerUsers.getCurrentSelectedUserId());

		refDoct.setState((State) cmbState.getSelectedItem());
		refDoct.setFederalId(txtFederalId.getText());
		refDoct.setNpi(txtNpi.getText());
		refDoct.setEmailAddress(txtEmailAddress.getText());
		refDoct.setCellNumber(txtCellNumber.getNumber());
		refDoct.setFax(txtFax.getNumber());
		refDoct.setPhoneNumber(txtPhoneNumber.getNumber());
		refDoct.setCity(txtCity.getText());
		refDoct.setAddress(txtAddress.getText());
		refDoct.setPhysicianId(txtPhysicianId.getText());
		refDoct.setPhysicianSurName(txtPhysicianSurName.getText());
		refDoct.setDoctorType((DoctorTypes) cmbDoctorType.getSelectedItem());
		refDoct.setPhysicianName(txtPhysicianName.getText());
		refDoct.setImpField(txtImpField.getText());
		refDoct.setPinNumber(txtPinNumber.getText());
		refDoct.setZip(txtZip.getText());
		refDoct.setImg(signatureCom.getImageIcon());

		// Users user = new Users();
		// // user = MedrexClientManager.getInstance().getUser(serial);
		// user.setSignature(signatureCom.getImageIcon());

		List errors = controllerPhysicianRecordForm.doValidate(refDoct, "");

		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Pyisician Record");
			m.setVisible(true);
			num = 0;
		} else if (errors.size() == 0) {
			try {
				controllerPhysicianRecordForm
						.insertOrUpdateDoctorsRecord(refDoct);
				/*
				 * Global.currentPhysicianRecordFormKey =
				 * MedrexClientManager.getInstance()
				 * .insertOrUpdateDoctorsRecord(refDoct);
				 */
				// JOptionPane.showMessageDialog(this,
				// " Physician Saved successfully");
				num = 1;
				// return(0);
			} catch (Exception eee) {
				num = 0;
			}
		}
		return num;
	}

	public void doUpdate() {

		Doctors refDoct = null;
		if (controllerUsers.getCurrentSelectedUserId() != 0) {
			refDoct = controllerPhysicianRecordForm
					.getDoctorsRecord(controllerUsers
							.getCurrentSelectedUserId());

			cmbState.setSelectedItem(refDoct.getState());
			txtFederalId.setText(refDoct.getFederalId());
			txtNpi.setText(refDoct.getNpi());
			txtEmailAddress.setText(refDoct.getEmailAddress());
			txtCellNumber.setNumber(refDoct.getCellNumber());
			txtFax.setNumber(refDoct.getFax());
			txtPhoneNumber.setNumber(refDoct.getPhoneNumber());
			txtCity.setText(refDoct.getCity());
			txtAddress.setText(refDoct.getAddress());
			txtPhysicianId.setText(refDoct.getSerial() + "");
			txtPhysicianSurName.setText(refDoct.getPhysicianSurName());
			cmbDoctorType.setSelectedItem(refDoct.getDoctorType());
			txtPhysicianName.setText(refDoct.getPhysicianName());
			txtImpField.setText(refDoct.getImpField());
			txtPinNumber.setText(refDoct.getPinNumber());
			txtZip.setText(refDoct.getZip());
			signatureCom.setImagefromImageIcon(refDoct.getImg());

		} else {
			cmbState.setSelectedItem(null);
			txtFederalId.setText("");
			txtNpi.setText("");
			txtEmailAddress.setText(null);
			txtCellNumber.setNumber("");
			txtFax.setNumber(null);
			txtPhoneNumber.setNumber(null);
			txtCity.setText(null);
			txtAddress.setText(null);
			txtPhysicianId.setText(null);
			txtPhysicianSurName.setText(null);
			cmbDoctorType.setSelectedItem(null);
			txtPhysicianName.setText(null);
			txtImpField.setText(null);
			txtPinNumber.setText(null);
			txtZip.setText(null);
			signatureCom.setImagefromImageIcon(null);
		}
		signatureCom.repaint();
		presentationModel.validateAll();

	}

	public boolean doValidate() {
		/*
		 * ValidationResult vRes = new ValidationResult(); ValidationResult
		 * temp;
		 * 
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
		 * txtPhysicianName, "Physician Name Field"))) { vRes.addAllFrom(temp);
		 * } if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
		 * txtPhysicianSurName, "Physician Last Name Field"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation .isNonEmptyAlphaNumericField(txtImpField,
		 * "Imp Field", 0, 7))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation
		 * .isNonEmptyAlphaNumericField(txtPinNumber, "Pin Field", 0, 5))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isNonEmpty( txtAddress, "Address Field"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isNonEmpty(txtCity, "City Field"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isNonEmptyZip( txtZip, "Zip Code", 5))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isValidPhone( txtFax, "Fax Field", 10))) {
		 * vRes.addAllFrom(temp); }
		 * 
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyEmail(
		 * txtEmailAddress, "Email Address"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation
		 * .isNonEmptyAlphaNumericField(txtNpi, "NPI Field", 0, 9))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation .isNonEmptyAlphaNumericField(txtFederalId,
		 * "FederalID Field", 0, 9))) { vRes.addAllFrom(temp); }
		 * 
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
		 * txtPhoneNumber, "Phone Number Field", 10))) { vRes.addAllFrom(temp);
		 * } if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
		 * txtCellNumber, "Cell Number Field", 10))) { vRes.addAllFrom(temp); }
		 * 
		 * //
		 * System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		 * 
		 * if (!FieldValidation.isEmpty(vRes)) { FieldValidation.Msgbox(vRes,
		 * "Physician "); return false; } else { //
		 * FieldValidation.Msgbox("Saved successfully", "Physician "); //
		 * JOptionPane.showMessageDialog(this, "Saved successfully"); return
		 * true; }
		 */
		return true;
	}
	/*
	 * public static void main(String a[]) { JDialog jd = new JDialog();
	 * jd.add(new PanelPhysicianRecordForm()); jd.setBounds(0, 0, 700, 800);
	 * SwingUtils.center(jd); jd.setModal(true); jd.setVisible(true);
	 * 
	 * }
	 */
}
