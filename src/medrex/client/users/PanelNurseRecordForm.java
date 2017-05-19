package medrex.client.users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.others.Nurse;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDrawPanel;

public class PanelNurseRecordForm extends JPanel implements Form {

	private JxDrawPanel signatureImage;
	private JLabel lastNameLabel_9;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JxComboBox cmbState;

	private JTextField txtNurseTypeSelected;

	private JTextField txtEmailAddress;

	private PhoneField txtCell;

	private PhoneField txtFaxField;

	private PhoneField txtPhone;

	private JFormattedTextField txtZipField;

	private JTextField txtCity;

	private JTextArea txtAddress;

	private JLabel lastNameLabel_8;

	private JLabel lastNameLabel_7;

	private JLabel lastNameLabel_6;

	private JLabel lastNameLabel_5;

	private JLabel lastNameLabel_4;

	private JLabel lastNameLabel_3;

	private JLabel lastNameLabel_2;

	private JLabel lastNameLabel_1;

	private JTextField txtNurseId;

	private JLabel firstNameLabel_1;

	private JLabel nurseLabel;

	private JTextField txtNurseSurName;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox cmbNurseType;

	private JTextField txtNurseName;

	private JLabel errorLabel;

	private Map myMap;
	private PresentationModel presentationModel;
	private ControllerUsers controllerUsers;
	private ControllerNurseRecordForm controllerNurseRecordForm;
	private int num = 0;

	protected MyFocusTraversalPolicy focusTraversalPolicy;

	public class MyFocusTraversalPolicy extends FocusTraversalPolicy {
		@Override
		public Component getComponentAfter(Container focusCycleRoot,
				Component aComponent) {
			if (aComponent.equals(txtNurseName))
				return txtNurseSurName;
			else if (aComponent.equals(txtNurseSurName))
				return txtAddress;
			else if (aComponent.equals(txtAddress))
				return txtCity;
			else if (aComponent.equals(txtCity))
				return cmbState;
			else if (aComponent.equals(cmbState))
				return txtZipField;
			else if (aComponent.equals(txtZipField))
				return txtPhone;
			else if (aComponent.equals(txtPhone))
				return txtFaxField;
			else if (aComponent.equals(txtFaxField))
				return txtCell;
			else if (aComponent.equals(txtCell))
				return txtEmailAddress;
			else
				return txtNurseName;
		}

		@Override
		public Component getComponentBefore(Container focusCycleRoot,
				Component aComponent) {
			return txtCell;
		}

		@Override
		public Component getDefaultComponent(Container focusCycleRoot) {
			return txtNurseName;
		}

		@Override
		public Component getFirstComponent(Container focusCycleRoot) {
			return txtNurseName;
		}

		@Override
		public Component getLastComponent(Container focusCycleRoot) {
			return txtEmailAddress;
		}
	}

	/**
	 * Create the panel
	 */
	public PanelNurseRecordForm(ControllerUsers controllerUsers) {
		super();
		this.controllerUsers = controllerUsers;
		myMap = new HashMap();
		controllerNurseRecordForm = new ControllerNurseRecordForm(
				controllerUsers);
		focusTraversalPolicy = new MyFocusTraversalPolicy();
		setFocusTraversalPolicy(focusTraversalPolicy);
		setFocusTraversalPolicyProvider(true);

		setBackground(Color.WHITE);
		// Global.panelNurseRecordForm = this;
		setLayout(null);
		setPreferredSize(new Dimension(580, 380));

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("FIRST NAME :");
		firstNameLabel.setBounds(10, 173, 81, 16);
		add(firstNameLabel);

		txtNurseName = new JTextField();
		myMap.put("nurseName", txtNurseName);
		txtNurseName.setForeground(DEF_COLOR);
		txtNurseName.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtNurseName.setBounds(110, 110, 150, 20);
		add(txtNurseName);

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
		userLabel.setText("NURSE TYPE :");
		userLabel.setBounds(300, 260, 99, 16);
		userLabel.setVisible(false);
		add(userLabel);

		cmbNurseType = new JComboBox();
		cmbNurseType.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		cmbNurseType.setBackground(Color.WHITE);
		cmbNurseType.setBounds(380, 230, 150, 20);
		cmbNurseType.setVisible(false);
		add(cmbNurseType);

		txtNurseSurName = new JTextField();
		myMap.put("nurseSurName", txtNurseSurName);
		txtNurseSurName.setForeground(DEF_COLOR);
		txtNurseSurName.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtNurseSurName.setBounds(110, 140, 150, 20);
		add(txtNurseSurName);

		nurseLabel = new JLabel();
		nurseLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		nurseLabel.setText("");
		nurseLabel.setFont(new Font("", Font.BOLD, 36));
		nurseLabel.setBackground(Color.WHITE);
		nurseLabel.setBounds(10, 10, 343, 34);
		add(nurseLabel);

		firstNameLabel_1 = new JLabel();
		firstNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		firstNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		firstNameLabel_1.setText("ID:");
		firstNameLabel_1.setBounds(10, 80, 81, 16);
		add(firstNameLabel_1);

		txtNurseId = new JTextField();
		txtNurseId.setForeground(DEF_COLOR);
		txtNurseId.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtNurseId.setEditable(false);
		txtNurseId.setBackground(Color.WHITE);
		txtNurseId.setBounds(110, 80, 150, 20);
		add(txtNurseId);

		lastNameLabel_1 = new JLabel();
		lastNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_1.setText("ADDRESS:");
		lastNameLabel_1.setBounds(10, 170, 81, 16);
		add(lastNameLabel_1);

		lastNameLabel_2 = new JLabel();
		lastNameLabel_2.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_2.setText("CITY:");
		lastNameLabel_2.setBounds(10, 230, 81, 16);
		add(lastNameLabel_2);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_3.setText("STATE:");
		lastNameLabel_3.setBounds(10, 260, 81, 16);
		add(lastNameLabel_3);

		lastNameLabel_4 = new JLabel();
		lastNameLabel_4.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_4.setText("ZIP:");
		lastNameLabel_4.setBounds(300, 80, 81, 16);
		add(lastNameLabel_4);

		lastNameLabel_5 = new JLabel();
		lastNameLabel_5.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_5.setText("PHONE:");
		lastNameLabel_5.setBounds(300, 110, 81, 16);
		add(lastNameLabel_5);

		lastNameLabel_6 = new JLabel();
		lastNameLabel_6.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_6.setText("FAX:");
		lastNameLabel_6.setBounds(300, 140, 81, 16);
		add(lastNameLabel_6);

		lastNameLabel_7 = new JLabel();
		lastNameLabel_7.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_7.setText("CELL:");
		lastNameLabel_7.setBounds(300, 170, 81, 16);
		add(lastNameLabel_7);

		lastNameLabel_8 = new JLabel();
		lastNameLabel_8.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_8.setText("EMAIL:");
		lastNameLabel_8.setBounds(300, 200, 81, 16);
		add(lastNameLabel_8);

		txtAddress = new JTextArea();
		// myMap.put("address", txtAddress);
		txtAddress.setForeground(DEF_COLOR);
		txtAddress.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtAddress.setWrapStyleWord(true);
		txtAddress.setLineWrap(true);
		txtAddress.setBounds(110, 170, 150, 47);
		add(txtAddress);

		txtCity = new JTextField();
		// myMap.put("city", txtCity);
		txtCity.setForeground(DEF_COLOR);
		txtCity.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtCity.setBounds(110, 230, 150, 20);
		add(txtCity);

		cmbState = new JxComboBox();
		myMap.put("state", cmbState);
		cmbState.setArc(0.4f);
		cmbState.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbState.setForeground(DEF_COLOR);
		cmbState.setBackground(Color.WHITE);
		cmbState.setBounds(110, 260, 150, 20);
		add(cmbState);

		txtZipField = new JFormattedTextField(FieldFormatter.ZIP);
		// myMap.put("zipField", txtZipField);
		txtZipField.setForeground(DEF_COLOR);
		txtZipField.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtZipField.setBounds(380, 80, 150, 20);
		add(txtZipField);

		txtPhone = new PhoneField();
		// myMap.put("phone", txtPhone);
		txtPhone.setForeground(DEF_COLOR);
		txtPhone.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtPhone.setBounds(380, 110, 150, 22);
		add(txtPhone);

		txtFaxField = new PhoneField();
		// myMap.put("faxField", txtFaxField);
		txtFaxField.setForeground(DEF_COLOR);
		txtFaxField.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtFaxField.setBounds(380, 140, 150, 22);
		add(txtFaxField);

		txtCell = new PhoneField();
		// myMap.put("cell", txtCell);
		txtCell.setForeground(DEF_COLOR);
		txtCell.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtCell.setBounds(380, 170, 150, 22);
		add(txtCell);

		txtEmailAddress = new JTextField();
		myMap.put("emailAddress", txtEmailAddress);
		txtEmailAddress.setForeground(DEF_COLOR);
		txtEmailAddress.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtEmailAddress.setBounds(380, 200, 150, 20);
		add(txtEmailAddress);

		txtNurseTypeSelected = new JTextField();
		// myMap.put("nurseTypeSelected", txtNurseTypeSelected);
		txtNurseTypeSelected.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtNurseTypeSelected.setBackground(Color.WHITE);
		txtNurseTypeSelected.setEditable(false);
		txtNurseTypeSelected.setBounds(380, 260, 150, 20);
		txtNurseTypeSelected.setVisible(false);
		add(txtNurseTypeSelected);

		final JPanel errorPanel = new JPanel();
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setLayout(null);
		errorPanel.setBounds(10, 50, 520, 20);
		add(errorPanel);

		errorLabel = new JLabel();
		errorLabel.setText("");
		errorPanel.add(errorLabel);
		errorLabel.setBounds(0, 0, 520, 20);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBounds(110, 299, 150, 47);
		panel.setBorder(new CompoundBorder(new LineBorder(DEF_COLOR, 1, false),
				new EmptyBorder(1, 1, 1, 1)));
		add(panel);

		signatureImage = new JxDrawPanel(150, 47);
		signatureImage.setBounds(110, 299, 150, 47);
		panel.add(signatureImage);

		doLoad();

		presentationModel = new PresentationModel(myMap, Nurse.class,
				controllerNurseRecordForm, errorLabel);

		lastNameLabel_9 = new JLabel();
		lastNameLabel_9.setText("SIGNATURE:");
		lastNameLabel_9.setBounds(10, 301, 81, 16);
		lastNameLabel_9.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lastNameLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		add(lastNameLabel_9);

		presentationModel.validateAll();

	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
		cmbNurseType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Senior Nurse", "Junior Nurse" }));
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

		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		try {
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
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

	}

	public int doSave() {
		Nurse refNurse = new Nurse();

		refNurse.setSerial(controllerUsers.getCurrentSelectedUserId());

		refNurse.setNurseTypeSelected(controllerUsers
				.getCurrentSelectedUserType());
		refNurse.setEmailAddress(txtEmailAddress.getText());
		refNurse.setCell(txtCell.getNumber());
		refNurse.setFaxField(txtFaxField.getNumber());
		refNurse.setPhone(txtPhone.getNumber());
		refNurse.setState((State) cmbState.getSelectedItem());
		refNurse.setCity(txtCity.getText());
		refNurse.setAddress(txtAddress.getText());
		refNurse.setNurseSurName(txtNurseSurName.getText());
		refNurse.setNurseType((String) cmbNurseType.getSelectedItem());
		refNurse.setNurseName(txtNurseName.getText());
		refNurse.setZipField(txtZipField.getText());
		refNurse.setNurseId(txtNurseId.getText());
		refNurse.setImg(signatureImage.getImageIcon());

		List errors = controllerNurseRecordForm.doValidate(refNurse, "");
		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Nurse Record");
			m.setVisible(true);
			num = 0;
		} else {
			try {
				controllerNurseRecordForm.insertOrUpdateNurseRecord(refNurse);
				// Global.currentNurseRecordFormKey =
				// MedrexClientManager.getInstance()
				// .insertOrUpdateNurseRecord(refNurse);
				JOptionPane.showMessageDialog(this, "Saved successfully");
				num = 1;
			} catch (Exception eee) {
				num = 0;
			}
		}
		return num;

	}

	public void doUpdate() {

		// System.out.println("nurses id :"+
		// controllerUsers.getCurrentSelectedUserId()+", "+controllerUsers.getCurrentSelectedUserType());

		Nurse refNurse = null;
		if (!controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
				"Physicians")) {
			if (controllerUsers.getCurrentSelectedUserId() != 0) {

				refNurse = controllerNurseRecordForm
						.getNursesRecord(controllerUsers
								.getCurrentSelectedUserId());

				nurseLabel
						.setText(controllerUsers.getCurrentSelectedUserType());
				txtNurseTypeSelected.setText(controllerUsers
						.getCurrentSelectedUserType());
				// txtNurseTypeSelected.setText(refNurse.getNurseTypeSelected());
				txtNurseId.setText(refNurse.getSerial() + "");
				txtEmailAddress.setText(refNurse.getEmailAddress());
				txtCell.setNumber(refNurse.getCell());
				txtFaxField.setNumber(refNurse.getFaxField());
				txtPhone.setNumber(refNurse.getPhone());
				cmbState.setSelectedItem(refNurse.getState());
				txtCity.setText(refNurse.getCity());
				txtAddress.setText(refNurse.getAddress());
				txtNurseSurName.setText(refNurse.getNurseSurName());
				cmbNurseType.setSelectedItem(refNurse.getNurseType());
				txtNurseName.setText(refNurse.getNurseName());
				txtZipField.setText(refNurse.getZipField());
				signatureImage.setImagefromImageIcon(refNurse.getImg());

			} else {

				nurseLabel
						.setText(controllerUsers.getCurrentSelectedUserType());
				txtNurseTypeSelected.setText(controllerUsers
						.getCurrentSelectedUserType());
				txtNurseId.setText("");
				txtEmailAddress.setText("");
				txtCell.setNumber("");
				txtFaxField.setNumber("");
				txtPhone.setNumber("");
				cmbState.setSelectedItem(null);
				txtCity.setText("");
				txtAddress.setText("");
				txtNurseSurName.setText("");
				cmbNurseType.setSelectedItem("");
				txtNurseName.setText("");
				txtZipField.setText("");
				signatureImage.setImagefromImageIcon(null);
			}
			signatureImage.repaint();
		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtNurseName, Global.currentUsers + " " + "Name Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation
				.isEmpty(temp = FieldValidation.isNonEmpty(txtNurseSurName,
						Global.currentUsers + " " + "Last Name Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
				txtPhone, "Phone Number Field", 10))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
				txtCell, "Cell Number Field", 10))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isValidPhone(
				txtFaxField, "Fax Field", 10))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyEmail(
				txtEmailAddress, "Email Address"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, Global.currentUsers);
			return false;
		} else {
			// FieldValidation.Msgbox("Saved successfully", "Nurse ");
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}

	}

	/*
	 * public static void main(String a[]) { JDialog jd = new JDialog();
	 * jd.add(new PanelNurseRecordForm()); jd.setBounds(0, 0, 700, 800);
	 * SwingUtils.center(jd); jd.setModal(true); jd.setVisible(true);
	 * 
	 * }
	 */

}
