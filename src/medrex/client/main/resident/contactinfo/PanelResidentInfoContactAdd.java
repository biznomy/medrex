package medrex.client.main.resident.contactinfo;

import java.awt.BorderLayout;
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

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDrawPanel;

public class PanelResidentInfoContactAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8464934277790970516L;
	private JxDrawPanel signaturePanel;
	private JLabel errorLabel;
	private JPanel errorPanel;
	private JTextArea txtNotes;
	private JxComboBox cmbRelation;
	private JxTableMedrex table;
	private JTextField txtEmail;
	private JFormattedTextField txtZip;
	private JxComboBox cmbState;
	private JTextField txtCity;
	private JTextField txtAddress;
	private JxComboBox cmbSex;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	public JCheckBox checkBoxPower;
	private JCheckBox checkBoxProxy;
	private JCheckBox checkBoxEmergency;
	private JCheckBox checkBoxresponsibleParty;

	private JLabel lblEmpty;

	public List updateContactPhone = new ArrayList();
	public ResidentContactPhone currentresidentContactPhone;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private Map presentationMap;
	private PresentationModel presentationModel;
	private ControllerResidentInfoContact controllerResidentInfoContact;
	private ControllerResidentInfoContactPhone controllerResidentInfoContactPhone;

	boolean isNew;

	/**
	 * Create the panel
	 */
	public PanelResidentInfoContactAdd(
			ControllerResidentInfoContact controllerResidentInfoContact) {
		super();

		presentationMap = new HashMap();
		this.controllerResidentInfoContact = controllerResidentInfoContact;

		setBackground(Color.WHITE);

		setLayout(null);
		setPreferredSize(new Dimension(550, 650));
		setSize(new Dimension(550, 634));

		errorPanel = new JPanel();
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setBounds(10, 1, 495, 20);
		add(errorPanel);

		errorLabel = new JLabel();
		errorLabel.setBounds(0, 0, 495, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setBackground(Color.WHITE);
		firstNameLabel.setForeground(DEF_COLOR);
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("FIRST NAME");
		firstNameLabel.setBounds(10, 27, 81, 16);
		add(firstNameLabel);

		txtFirstName = new JTextField();
		presentationMap.put("firstName", txtFirstName);
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setForeground(DEF_COLOR);
		txtFirstName.setBounds(86, 25, 128, 20);
		add(txtFirstName);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setBackground(Color.WHITE);
		lastNameLabel.setForeground(DEF_COLOR);
		lastNameLabel.setFont(new Font("", Font.BOLD, 12));
		lastNameLabel.setText("LAST NAME");
		lastNameLabel.setBounds(230, 27, 66, 16);
		add(lastNameLabel);

		txtLastName = new JTextField();
		presentationMap.put("lastName", txtLastName);
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setForeground(DEF_COLOR);
		txtLastName.setBounds(302, 25, 108, 20);
		add(txtLastName);

		final JLabel sexLabel = new JLabel();
		sexLabel.setBackground(Color.WHITE);
		sexLabel.setForeground(DEF_COLOR);
		sexLabel.setFont(new Font("", Font.BOLD, 12));
		sexLabel.setText("SEX");
		sexLabel.setBounds(425, 27, 32, 16);
		add(sexLabel);

		cmbSex = new JxComboBox();
		presentationMap.put("sex", cmbSex);
		cmbSex.setArc(0.4f);
		cmbSex.setBackground(Color.WHITE);
		cmbSex.setForeground(DEF_COLOR);
		cmbSex.setBounds(455, 23, 57, 25);
		add(cmbSex);

		final JLabel addressLabel = new JLabel();
		addressLabel.setBackground(Color.WHITE);
		addressLabel.setForeground(DEF_COLOR);
		addressLabel.setFont(new Font("", Font.BOLD, 12));
		addressLabel.setText("ADDRESS");
		addressLabel.setBounds(10, 57, 66, 16);
		add(addressLabel);

		txtAddress = new JTextField();
		presentationMap.put("address", txtAddress);
		txtAddress.setBackground(Color.WHITE);
		txtAddress.setForeground(DEF_COLOR);
		txtAddress.setBounds(86, 55, 426, 20);
		add(txtAddress);

		final JLabel cityLabel = new JLabel();
		cityLabel.setBackground(Color.WHITE);
		cityLabel.setForeground(DEF_COLOR);
		cityLabel.setFont(new Font("", Font.BOLD, 12));
		cityLabel.setText("CITY");
		cityLabel.setBounds(10, 91, 66, 16);
		add(cityLabel);

		txtCity = new JTextField();
		presentationMap.put("city", txtCity);
		txtCity.setBackground(Color.WHITE);
		txtCity.setForeground(DEF_COLOR);
		txtCity.setBounds(86, 89, 128, 20);
		add(txtCity);

		final JLabel stateLabel = new JLabel();
		stateLabel.setBackground(Color.WHITE);
		stateLabel.setForeground(DEF_COLOR);
		stateLabel.setFont(new Font("", Font.BOLD, 12));
		stateLabel.setText("STATE");
		stateLabel.setBounds(230, 91, 66, 16);
		add(stateLabel);

		cmbState = new JxComboBox();
		presentationMap.put("state", cmbState);
		cmbState.setArc(0.4f);
		cmbState.setBackground(Color.WHITE);
		cmbState.setForeground(DEF_COLOR);
		cmbState.setBounds(280, 87, 108, 25);
		add(cmbState);

		final JLabel zipLabel = new JLabel();
		zipLabel.setBackground(Color.WHITE);
		zipLabel.setForeground(DEF_COLOR);
		zipLabel.setFont(new Font("", Font.BOLD, 12));
		zipLabel.setText("ZIP");
		zipLabel.setBounds(404, 91, 47, 16);
		add(zipLabel);

		txtZip = new JFormattedTextField(FieldFormatter.ZIP);
		presentationMap.put("zip", txtZip);
		txtZip.setBackground(Color.WHITE);
		txtZip.setForeground(DEF_COLOR);
		txtZip.setBounds(425, 89, 87, 20);
		add(txtZip);

		final JLabel emailLabel = new JLabel();
		emailLabel.setBackground(Color.WHITE);
		emailLabel.setForeground(DEF_COLOR);
		emailLabel.setFont(new Font("", Font.BOLD, 12));
		emailLabel.setText("EMAIL");
		emailLabel.setBounds(10, 126, 66, 16);
		add(emailLabel);

		final JxButton btnSave = new JxButton();
		btnSave.setArc(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(157, 571, 106, 26);
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(280, 571, 106, 26);
		add(btnCancel);

		txtEmail = new JTextField();
		presentationMap.put("email", txtEmail);
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setForeground(DEF_COLOR);
		txtEmail.setBounds(86, 124, 185, 20);
		add(txtEmail);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 161, 324, 90);
		add(scrollPane);

		controllerResidentInfoContactPhone = new ControllerResidentInfoContactPhone(
				controllerResidentInfoContact);
		table = new JxTableMedrex(controllerResidentInfoContactPhone);

		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					isNew = false;
					doAddorUpdate();
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton addButton = new JxButton();
		addButton.setArc(0.4f);
		addButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		addButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = true;
				doAddorUpdate();
			}
		});
		addButton.setFont(new Font("", Font.BOLD, 12));
		addButton.setText("Add");
		addButton.setBounds(421, 161, 106, 26);
		add(addButton);

		final JxButton viewButton = new JxButton();
		viewButton.setArc(0.4f);
		viewButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		viewButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = false;
				doAddorUpdate();
			}
		});
		viewButton.setFont(new Font("", Font.BOLD, 12));
		viewButton.setText("View/Update");
		viewButton.setBounds(421, 193, 106, 26);
		add(viewButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setArc(0.4f);
		deleteButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		deleteButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
			}
		});
		deleteButton.setFont(new Font("", Font.BOLD, 12));
		deleteButton.setText("Delete");
		deleteButton.setBounds(421, 225, 106, 26);
		add(deleteButton);

		final JLabel relationshipToResidentLabel = new JLabel();
		relationshipToResidentLabel.setBackground(Color.WHITE);
		relationshipToResidentLabel.setForeground(DEF_COLOR);
		relationshipToResidentLabel.setFont(new Font("", Font.BOLD, 12));
		relationshipToResidentLabel.setText("RELATIONSHIP TO RESIDENT");
		relationshipToResidentLabel.setBounds(10, 273, 168, 16);
		add(relationshipToResidentLabel);

		cmbRelation = new JxComboBox();
		presentationMap.put("relationship", cmbRelation);
		cmbRelation.setArc(0.4f);
		cmbRelation.setBackground(Color.WHITE);
		cmbRelation.setForeground(DEF_COLOR);
		cmbRelation.setBounds(184, 269, 226, 25);
		add(cmbRelation);

		checkBoxPower = new JCheckBox();
		checkBoxPower.setBackground(Color.WHITE);
		checkBoxPower.setForeground(DEF_COLOR);
		checkBoxPower.setFont(new Font("", Font.BOLD, 12));
		checkBoxPower.setText("POWER OF ATTORNEY");
		checkBoxPower.setBounds(3, 308, 151, 24);
		add(checkBoxPower);

		checkBoxProxy = new JCheckBox();
		checkBoxProxy.setBackground(Color.WHITE);
		checkBoxProxy.setForeground(DEF_COLOR);
		checkBoxProxy.setFont(new Font("", Font.BOLD, 12));
		checkBoxProxy.setText("HC PROXY");
		checkBoxProxy.setBounds(155, 308, 87, 24);
		add(checkBoxProxy);

		checkBoxEmergency = new JCheckBox();
		checkBoxEmergency.setBackground(Color.WHITE);
		checkBoxEmergency.setForeground(DEF_COLOR);
		checkBoxEmergency.setFont(new Font("", Font.BOLD, 12));
		checkBoxEmergency.setText("EMERGENCY CONTACT");
		checkBoxEmergency.setBounds(242, 308, 154, 24);
		add(checkBoxEmergency);

		checkBoxresponsibleParty = new JCheckBox();
		checkBoxresponsibleParty.setBackground(Color.WHITE);
		checkBoxresponsibleParty.setForeground(DEF_COLOR);
		checkBoxresponsibleParty.setFont(new Font("", Font.BOLD, 12));
		checkBoxresponsibleParty.setText("RESPONSIBLE PARTY");
		checkBoxresponsibleParty.setBounds(398, 308, 148, 24);
		add(checkBoxresponsibleParty);

		final JLabel notesLabel = new JLabel();
		notesLabel.setBackground(Color.WHITE);
		notesLabel.setForeground(DEF_COLOR);
		notesLabel.setFont(new Font("", Font.BOLD, 12));
		notesLabel.setText("NOTES");
		notesLabel.setBounds(10, 364, 47, 16);
		add(notesLabel);

		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(86, 348, 324, 95);
		add(scrollPane3);

		txtNotes = new JTextArea();
		txtNotes.setLineWrap(true);
		txtNotes.setWrapStyleWord(true);
		// presentationMap.put("notes", txtNotes);
		txtNotes.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtNotes.setBounds(86, 348, 324, 95);
		// add(txtNotes);
		scrollPane3.setViewportView(txtNotes);

		final JLabel phonesLabel = new JLabel();
		phonesLabel.setBackground(Color.WHITE);
		phonesLabel.setForeground(DEF_COLOR);
		phonesLabel.setFont(new Font("", Font.BOLD, 12));
		phonesLabel.setText("PHONES");
		phonesLabel.setBounds(10, 198, 66, 16);
		add(phonesLabel);

		lblEmpty = new JLabel();
		lblEmpty.setBounds(86, 262, 66, 6);
		add(lblEmpty);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setForeground(DEF_COLOR);
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		signatureLabel.setText("SIGNATURE");
		signatureLabel.setBounds(10, 497, 69, 14);
		add(signatureLabel);

		final JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.setBorder(new CompoundBorder(
				new LineBorder(DEF_COLOR, 1, false), null));
		panel2.setBounds(86, 461, 189, 62);
		add(panel2);

		signaturePanel = new JxDrawPanel(189, 62);
		signaturePanel.setBorder(new EmptyBorder(1, 1, 1, 1));
		signaturePanel.setLayout(null);
		panel2.add(signaturePanel);

		fillCombos();
		updateData();

		presentationModel = new PresentationModel(presentationMap,
				ResidentContact.class, controllerResidentInfoContact,
				errorLabel);

		presentationModel.validateAll();
	}

	public void fillCombos() {
		/*
		 * cmbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "Male", "Female" }));
		 */

		/*
		 * cmbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "Alabama", "Alaska", "Arizona", "Arkansas", "California",
		 * "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
		 * "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
		 * "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
		 * "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
		 * "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
		 * "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
		 * "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
		 * "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
		 * "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
		 */

		// cmbRelation.setModel(new DefaultComboBoxModel(new String[] {"",
		// "AUNT", "BOY FRIEND", "BROTHER", "BROTHER IN LAW", "CASE MANAGER",
		// "COMMON LAW WIFE", "COUSIN", "COUSIN-IN-LAW", "DAUGHER", "DAUGHTER",
		// "DAUGHTER IN LAW", "DETECTIVE", "EX BROTHER IN-LAW", "EX-HUSBAND",
		// "FATHER", "FRIEND", "GIRL FRIEND", "GODFATHER", "GRANDDAUGHTER",
		// "GRANDSON", "GUARDIAN", "LANDLADY", "LAWYER", "LEGAL GUARDIAN",
		// "MOTHER", "NEIGHBOR", "NEPHEW", "NEPHEW IN LAW", "NIECE", "OTHER",
		// "PASTER", "SELF", "SISTER", "SISTER-IN-LAW", "SOCIAL WORKER", "SON",
		// "SON IN LAW", "SPOUSE", "STEP DAUGHTER", "STEPSON", "TWIN BROTHER",
		// "UNCLE", "WIFE"}));
		List<MasterList> sexComboItems = new ArrayList<MasterList>();
		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		List<MasterList> relationComboItems = new ArrayList<MasterList>();

		try {
			sexComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Sex.class);
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
			relationComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Relation.class);
		} catch (Exception e) {

		}

		cmbSex.removeAllItems();
		for (int i = 0; i < sexComboItems.size(); i++) {
			MasterList m = sexComboItems.get(i);
			cmbSex.addItem(m);
		}
		Sex s = new Sex();
		s.setId(0);
		s.setMsterName(" ");
		cmbSex.insertItemAt(s, 0);
		cmbSex.setSelectedIndex(0);

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

		cmbRelation.removeAllItems();
		for (int i = 0; i < relationComboItems.size(); i++) {
			MasterList m = relationComboItems.get(i);
			cmbRelation.addItem(m);
		}
		Relation rel = new Relation();
		rel.setId(0);
		rel.setMsterName(" ");
		cmbRelation.insertItemAt(rel, 0);
		cmbRelation.setSelectedIndex(0);

	}

	public boolean doSave() {
		ResidentContact rc = new ResidentContact();

		rc.setFirstName(txtFirstName.getText());
		rc.setLastName(txtLastName.getText());
		rc.setSex((Sex) cmbSex.getSelectedItem());
		rc.setAddress(txtAddress.getText());
		rc.setCity(txtCity.getText());
		rc.setState((State) cmbState.getSelectedItem());
		rc.setZip(txtZip.getText());
		rc.setEmail(txtEmail.getText());
		rc.setRelationship((Relation) cmbRelation.getSelectedItem());
		if (checkBoxPower.isSelected()) {
			rc.setPower(1);
		} else {
			rc.setPower(0);
		}

		if (checkBoxProxy.isSelected()) {
			rc.setHcProxy(1);
		} else {
			rc.setHcProxy(0);
		}

		if (checkBoxEmergency.isSelected()) {
			rc.setEmergency(1);
		} else {
			rc.setEmergency(0);
		}

		if (checkBoxresponsibleParty.isSelected()) {
			rc.setResponsibleParty(1);
		} else {
			rc.setResponsibleParty(0);
		}

		rc.setNotes(txtNotes.getText());
		rc.setSignature(signaturePanel.getImageIcon());

		List errors = controllerResidentInfoContact.doValidate(rc, "");
		if (errors.size() > 0) {
			// JOptionPane.showMessageDialog(null, "error");
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error saving contact info");
			m.setVisible(true);
			return false;
		} else {
			try {

				controllerResidentInfoContact.insertOrUpdate(rc);
				close();
				// Global.currentcontactKey = MedrexClientManager.getInstance()
				// .insertOrUpdateResidentContact(rc);
				// // JOptionPane.showMessageDialog(this, "Saved successfully");
			} catch (Exception eee) {

			}
			// // deleteallphones(for global.currentcontactkey);
			// try {
			// List residentContactPhones = MedrexClientManager.getInstance()
			// .getResidentContactPhones(Global.currentcontactKey);
			// Iterator itr = residentContactPhones.iterator();
			// while (itr.hasNext()) {
			// ResidentContactPhone residentContactPhone =
			// (ResidentContactPhone) itr
			// .next();
			// int residentContactPhoneSerial = residentContactPhone
			// .getSerial();
			// MedrexClientManager.getInstance()
			// .deleteAllPhonesForContact(residentContactPhoneSerial);
			// }
			// } catch (Exception e1) {
			// e1.printStackTrace();
			// }
			//
			// List newPhones = contactPhoneJTable.residentContactPhones;
			// if (newPhones != null) {
			// Iterator i = newPhones.iterator();
			// while (i.hasNext()) {
			// ResidentContactPhone rcp = (ResidentContactPhone) i.next();
			// rcp.setContactId(Global.currentcontactKey);
			// rcp.setSerial(0);
			// try {
			// Global.currentResidentInfoGeneralPhoneKey =
			// MedrexClientManager.getInstance()
			// .insertOrUpdateResidentContactPhone(rcp);
			// } catch (Exception e) {
			//
			// }
			// }
			// }

			return true;
		}

	}

	public void updateData() {
		if (controllerResidentInfoContact.getCurrentContactSerial() == 0) {

		} else {
			ResidentContact rc = null;
			try {
				rc = controllerResidentInfoContact.getCurrentResidentContact();
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}
			txtFirstName.setText(rc.getFirstName());
			txtLastName.setText(rc.getLastName());
			cmbSex.setSelectedItem(rc.getSex());
			txtAddress.setText(rc.getAddress());
			txtCity.setText(rc.getCity());
			cmbState.setSelectedItem(rc.getState());
			txtZip.setText(rc.getZip());
			txtEmail.setText(rc.getEmail());
			cmbRelation.setSelectedItem(rc.getRelationship());
			if (rc.getPower() == 0) {
				checkBoxPower.setSelected(false);
			} else {
				checkBoxPower.setSelected(true);
			}
			if (rc.getHcProxy() == 0) {
				checkBoxProxy.setSelected(false);
			} else {
				checkBoxProxy.setSelected(true);
			}
			if (rc.getEmergency() == 0) {
				checkBoxEmergency.setSelected(false);
			} else {
				checkBoxEmergency.setSelected(true);
			}
			if (rc.getResponsibleParty() == 0) {
				checkBoxresponsibleParty.setSelected(false);
			} else {
				checkBoxresponsibleParty.setSelected(true);
			}

			txtNotes.setText(rc.getNotes());
			ImageIcon imageIcon = rc.getSignature();
			if (imageIcon != null) {
				signaturePanel.setImagefromImageIcon(imageIcon);
			}
			signaturePanel.repaint();
		}
		controllerResidentInfoContactPhone.updateResidentContactPhoneList();
		updateTable();
	}

	@Override
	public String getTitle() {
		return "Contact Info";
	}

	public void setSelectedRow() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
			} catch (Exception e) {

			}
		}
		if (selectedRow == -1) {
			controllerResidentInfoContactPhone.setSelectedPhoneRow(-1);
		} else {
			controllerResidentInfoContactPhone.setSelectedPhoneRow(selectedRow);
		}

	}

	public void doAddorUpdate() {
		setSelectedRow();
		PanelResidentContactPhoneAdd panelResidentInfoContactPhoneAdd = new PanelResidentContactPhoneAdd(
				controllerResidentInfoContactPhone);
		SwingUtils.openInDialog(panelResidentInfoContactPhoneAdd);
		updateTable();
	}

	public void updateTable() {

		table.update();
	}

	public void doDelete() {
		setSelectedRow();
		controllerResidentInfoContactPhone.deleteCurrentResidentContactPhone();
		updateTable();

	}

}
