package medrex.client.users;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.security.SecurityRole;

import com.sX.swing.JxButton;

public class PanelUserSecurity extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7090436220209545614L;

	private JxButton moveSelectedLeftButton;

	private JxButton moveSelectedRightButton;

	private JxButton moveOneLeftButton;

	private JxButton moveOneRightButton;

	private JxButton cancelButton;

	private JxButton saveButton;

	private JList listOfRoles;

	public JList listSelectedRoles;

	private DefaultListModel model;

	private DefaultListModel model1;

	private JScrollPane scrollPane_1;

	private Object[] values;

	private int totalSize;

	public PanelUserSecurity() {
		super();
		setPreferredSize(new Dimension(620, 400));
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(67, 79, 225, 290);
		add(scrollPane_1);

		model1 = new DefaultListModel();
		listSelectedRoles = new JList();
		listSelectedRoles.setModel(model1);
		scrollPane_1.setViewportView(listSelectedRoles);
		listSelectedRoles.setBorder(new LineBorder(Color.black, 1, false));

		/*
		 * saveButton = new JxButton(); saveButton.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent
		 * arg0) { doSave(); Global.frameSecurityAddNew.dispose(); } });
		 * saveButton.setArc(0.4f);
		 * saveButton.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * saveButton.setForeground(GuiModes.DESIGNER_FORMS
		 * .getControlForegroundColor());
		 * saveButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * saveButton.setFont(new Font("", Font.BOLD, 12));
		 * saveButton.setText("Save"); saveButton.setBounds(199, 386, 75, 35);
		 * add(saveButton);
		 * 
		 * cancelButton = new JxButton(); cancelButton.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent
		 * arg0) { Global.frameSecurityAddNew.dispose(); } });
		 * cancelButton.setArc(0.4f);
		 * cancelButton.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * cancelButton.setForeground(GuiModes.DESIGNER_FORMS
		 * .getControlForegroundColor());
		 * cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * cancelButton.setFont(new Font("", Font.BOLD, 12));
		 * cancelButton.setText("Cancel"); cancelButton.setBounds(301, 386, 75,
		 * 35); add(cancelButton);
		 */

		moveSelectedLeftButton = new JxButton();
		moveSelectedLeftButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				updateLists("<<");
			}
		});
		moveSelectedLeftButton.setArc(0.4f);
		moveSelectedLeftButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		moveSelectedLeftButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		moveSelectedLeftButton.setBorder(GuiModes.DESIGNER_FORMS
				.getControlBorder());
		moveSelectedLeftButton.setFont(new Font("", Font.BOLD, 12));
		moveSelectedLeftButton.setText("<<");
		moveSelectedLeftButton.setBounds(303, 143, 39, 21);
		add(moveSelectedLeftButton);

		moveSelectedRightButton = new JxButton();
		moveSelectedRightButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				updateLists(">>");
			}
		});
		moveSelectedRightButton.setArc(0.4f);
		moveSelectedRightButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		moveSelectedRightButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		moveSelectedRightButton.setBorder(GuiModes.DESIGNER_FORMS
				.getControlBorder());
		moveSelectedRightButton.setFont(new Font("", Font.BOLD, 12));
		moveSelectedRightButton.setText(">>");
		moveSelectedRightButton.setBounds(303, 187, 39, 21);
		add(moveSelectedRightButton);

		moveOneLeftButton = new JxButton();
		moveOneLeftButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				values = listOfRoles.getSelectedValues();
				// listOfRoles.setSelectedIndex(-1);
				updateLists("<");
			}
		});
		moveOneLeftButton.setArc(0.4f);
		moveOneLeftButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		moveOneLeftButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		moveOneLeftButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		moveOneLeftButton.setFont(new Font("", Font.BOLD, 12));
		moveOneLeftButton.setText("<");
		moveOneLeftButton.setBounds(301, 223, 39, 21);
		add(moveOneLeftButton);

		moveOneRightButton = new JxButton();
		moveOneRightButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				values = listSelectedRoles.getSelectedValues();
				updateLists(">");
			}
		});
		moveOneRightButton.setArc(0.4f);
		moveOneRightButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		moveOneRightButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		moveOneRightButton
				.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		moveOneRightButton.setFont(new Font("", Font.BOLD, 12));
		moveOneRightButton.setText(">");
		moveOneRightButton.setBounds(303, 262, 39, 21);
		add(moveOneRightButton);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(380, 79, 227, 290);
		add(scrollPane);

		listOfRoles = new JList();
		scrollPane.setViewportView(listOfRoles);
		listOfRoles.setBorder(new LineBorder(Color.black, 1, false));
		model = new DefaultListModel();
		/*
		 * String[] data = new String[] { "CNS - View", "CNS - View/Update",
		 * "Reports - View", "Reports - View/Update", "Censue - View",
		 * "Censue - View/Update", "Care Log - View", "Care Log - View/Update",
		 * "Medication - View", "Medication - View/Update", "Admission - View",
		 * "Admission - View/Update", "Activites - View",
		 * "Activites - View/Update", "Medication & Treatment - View",
		 * "Medication & Treatment - View/Update", "Dietary - View",
		 * "Dietary - View/Update", "Consultent - View",
		 * "Consultent - View/Update", "Progress Notes - View",
		 * "Progress Notes - View/Update", "Labs & Special Reports - View",
		 * "Labs & Special Reports - View/Update", "History & Physical - View",
		 * "History & Physical  - View/Update", "Phyicians Orders - View",
		 * "Phyicians Orders - View/Update", "OT-PT-ACT Speech - View",
		 * "OT-PT-ACT Speech - View/Update", "Monthly Summaries - View",
		 * "Monthly Summaries - View/Update", "PSYCH - View",
		 * "PSYCH  - View/Update", "Flow Sheets - View",
		 * "Flow Sheets - View/Update", "Dental & Podiatry - View",
		 * "Dental & Podiatry - View/Update", "Social Services - View",
		 * "Social Services - View/Update", "UR Discharge planing - View",
		 * "UR Discharge planing - View/Update", "Assessments - View",
		 * "Assessments - View/Update", "MISC - View", "MISC  - View/Update",
		 * "MDS - View", "MDS - View/Update", "Care Plan - View",
		 * "Care Plan - View/Update" };
		 */

		String[] data = new String[] {
				"CNA - View",
				"CNA - View/Update",
				"Reports - View",
				"Reports - View/Update",
				"Census - View",
				"Census - View/Update",
				"Care Log - View",
				"Care Log - View/Update",
				"Medication - View",
				"Medication - View/Update",
				"Admission - View",
				"Admission - View/Update",
				"Activites - View",
				"Activites - View/Update",
				"Medication & Treatment - View",
				"Medication & Treatment - View/Update",
				"Dietary - View",
				"Dietary - View/Update",
				"Consultent - View",
				"Consultent - View/Update",
				"Progress Notes - View",
				"Progress Notes - View/Update",
				"Labs & Special Reports - View",
				"Labs & Special Reports - View/Update",
				"History & Physical - View",
				"History & Physical  - View/Update",
				"Phyicians Orders - View",
				"Phyicians Orders - View/Update",
				"OT-PT-ACT Speech - View",
				"OT-PT-ACT Speech - View/Update",
				"MDS - View",
				"MDS - View/Update",
				"Care Plan - View",
				"Care Plan - View/Update",
				// suresh
				"Resident Information allergies - View",
				"Resident Information allergies - View/Update",
				"Resident Information scheduling - View",
				"Resident Information scheduling - View/Update",
				"Resident Information vital - View",
				"Resident Information vital - View/Update",
				"Resident Information Weight - View",
				"Resident Information Weight - View/Update",
				"Resident Information wounds - View",
				"Resident Information wounds - View/Update",
				"Resident Information PersonalInfo - View",
				"Resident Information PersonalInfo - View/Update",
				"Resident Information Payer info - View",
				"Resident Information Payer info - View/Update",
				"Resident Information contactinfo - View",
				"Resident Information contactinfo - View/Update",
				"Resident Information physicians - View",
				"Resident Information physicians - View/Update",
				"Resident Information Providers - View",
				"Resident Information Providers - View/Update",
				"Resident Information census - View",
				"Resident Information census - View/Update",
				"Resident Information diagnosis - View",
				"Resident Information diagnosis - View/Update",
				"Resident Information scan - View",
				"Resident Information scan - View/Update",
				"Resident Information room - View",
				"Resident Information room - View/Update",

				"Resident - View", "Resident - View/Update", "Users - View",
				"Users - View/Update", "UsersLogon - View",
				"UsersLogon - View/Update", "Messages - View",
				"Messages - View/Update", "MasterList - View",
				"MasterList - View/Update", "Admin - View",
				"Admin - View/Update"

		};

		for (int i = 0; i < data.length; i++) {
			model.addElement(data[i]);
		}
		listOfRoles.setModel(model);

		model1.addElement("a");
		model1.removeAllElements();
		model1.clear();
		updateData();

	}

	public void updateLists(String actionButton) {
		if (actionButton.equals("<")) {
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					((DefaultListModel) listSelectedRoles.getModel())
							.addElement(values[i]);
					((DefaultListModel) listOfRoles.getModel())
							.removeElement(values[i]);
				}
			}
		}
		if (actionButton.equals(">")) {
			if (values != null) {

				for (int i = 0; i < values.length; i++) {
					((DefaultListModel) listOfRoles.getModel())
							.addElement(values[i]);
					((DefaultListModel) listSelectedRoles.getModel())
							.removeElement(values[i]);
				}

			}
		}

		if (actionButton.equals("<<")) {
			if (listOfRoles.getModel().getSize() > 0) {
				updateLists(">");
				listSelectedRoles.setModel(listOfRoles.getModel());
				listOfRoles.setModel(new DefaultListModel());
			}
		}
		if (actionButton.equals(">>")) {
			if (listSelectedRoles.getModel().getSize() > 0) {
				updateLists("<");
				listOfRoles.setModel(listSelectedRoles.getModel());
				listSelectedRoles.setModel(new DefaultListModel());
			}
		}

	}

	public void doSave(String sec) {

		int cnt = listSelectedRoles.getModel().getSize();
		SecurityRole securityRole = new SecurityRole();
		/*
		 * if(Global.currentSecurityRoleKey!=0){
		 * securityRole.setSerial(Global.currentSecurityRoleKey); }
		 */
		securityRole.setName(sec);
		securityRole.setTypeOfRole(Global.currentRoleType);
		securityRole.setSerial(Global.userRoleId);

		for (int i = 0; i < cnt; i++) {
			String selectedRole = (String) listSelectedRoles.getModel()
					.getElementAt(i);

			/*
			 * String selectedRole = (String) listSelectedRoles.getModel()
			 * .getElementAt(i);
			 */

			if (selectedRole.equalsIgnoreCase("CNA - View")) {
				if (securityRole.getAccessCNA() < 1) {
					securityRole.setAccessCNA(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("CNA - View/Update")) {
				securityRole.setAccessCNA(2);
			}
			if (selectedRole.equalsIgnoreCase("Reports - View")) {
				if (securityRole.getAccessReports() < 1) {
					securityRole.setAccessReports(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Reports - View/Update")) {
				securityRole.setAccessReports(2);
			}
			if (selectedRole.equalsIgnoreCase("Census - View")) {
				if (securityRole.getAccessCensus() < 1) {
					securityRole.setAccessCensus(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Census - View/Update")) {
				securityRole.setAccessCensus(2);
			}
			if (selectedRole.equalsIgnoreCase("Care Log - View")) {
				if (securityRole.getAccessCareLog() < 1) {
					securityRole.setAccessCareLog(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Care Log - View/Update")) {
				securityRole.setAccessCareLog(2);
			}
			if (selectedRole.equalsIgnoreCase("Medication - View")) {
				if (securityRole.getAccessMedicationCart() < 1) {
					securityRole.setAccessMedicationCart(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Medication - View/Update")) {
				securityRole.setAccessMedicationCart(2);
			}
			if (selectedRole.equalsIgnoreCase("Admission - View")) {
				if (securityRole.getAccessAdmissionRecords() < 1) {
					securityRole.setAccessAdmissionRecords(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Admission - View/Update")) {
				securityRole.setAccessAdmissionRecords(2);
			}
			if (selectedRole.equalsIgnoreCase("Activites - View")) {
				if (securityRole.getAccessActivity() < 1) {
					securityRole.setAccessActivity(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Activites - View/Update")) {
				securityRole.setAccessActivity(2);
			}
			if (selectedRole.equalsIgnoreCase("Medication & Treatment - View")) {
				if (securityRole.getAccessMedicationTreatment() < 1) {
					securityRole.setAccessMedicationTreatment(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Medication & Treatment - View/Update")) {
				securityRole.setAccessMedicationTreatment(2);
			}
			if (selectedRole.equalsIgnoreCase("Dietary - View")) {
				if (securityRole.getAccessDietary() < 1) {
					securityRole.setAccessDietary(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Dietary - View/Update")) {
				securityRole.setAccessDietary(2);
			}
			if (selectedRole.equalsIgnoreCase("Consultent - View")) {
				if (securityRole.getAccessConsultant() < 1) {
					securityRole.setAccessConsultant(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Consultent - View/Update")) {
				securityRole.setAccessConsultant(2);
			}
			if (selectedRole.equalsIgnoreCase("Progress Notes - View")) {
				if (securityRole.getAccessProgressNotes() < 1) {
					securityRole.setAccessProgressNotes(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Progress Notes - View/Update")) {
				securityRole.setAccessProgressNotes(2);
			}
			if (selectedRole.equalsIgnoreCase("Labs & Special Reports - View")) {
				if (securityRole.getAccessLabSpecialReports() < 1) {
					securityRole.setAccessLabSpecialReports(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Labs & Special Reports - View/Update")) {
				securityRole.setAccessLabSpecialReports(2);
			}
			if (selectedRole.equalsIgnoreCase("History & Physical - View")) {
				if (securityRole.getAccessHistoryPhysical() < 1) {
					securityRole.setAccessHistoryPhysical(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("History & Physical  - View/Update")) {
				securityRole.setAccessHistoryPhysical(2);
			}
			if (selectedRole.equalsIgnoreCase("Phyicians Orders - View")) {
				if (securityRole.getAccessPhysicianOrders() < 1) {
					securityRole.setAccessPhysicianOrders(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Phyicians Orders - View/Update")) {
				securityRole.setAccessPhysicianOrders(2);
			}
			if (selectedRole.equalsIgnoreCase("OT-PT-ACT Speech - View")) {
				if (securityRole.getAccessOtPtActSpeech() < 1) {
					securityRole.setAccessOtPtActSpeech(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("OT-PT-ACT Speech - View/Update")) {
				securityRole.setAccessOtPtActSpeech(2);
			}
			if (selectedRole.equalsIgnoreCase("MDS - View")) {
				if (securityRole.getAccessMDS() < 1) {
					securityRole.setAccessMDS(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("MDS - View/Update")) {
				securityRole.setAccessMDS(2);
			}
			if (selectedRole.equalsIgnoreCase("Care Plan - View")) {
				if (securityRole.getAccessCarePlan() < 1) {
					securityRole.setAccessCarePlan(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Care Plan - View/Update")) {
				securityRole.setAccessCarePlan(2);
			}
			// suresh

			if (selectedRole
					.equalsIgnoreCase("Resident Information allergies - View")) {
				if (securityRole.getAccessResidentInfoAllergies() < 1) {
					securityRole.setAccessResidentInfoAllergies(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information allergies - View/Update")) {
				securityRole.setAccessResidentInfoAllergies(2);
			}

			if (selectedRole
					.equalsIgnoreCase("Resident Information scheduling - View")) {
				if (securityRole.getAccessResidentInfoScheduling() < 1) {
					securityRole.setAccessResidentInfoScheduling(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information scheduling - View/Update")) {
				securityRole.setAccessResidentInfoScheduling(2);
			}

			if (selectedRole
					.equalsIgnoreCase("Resident Information vital - View")) {
				if (securityRole.getAccessResidentInfoVital() < 1) {
					securityRole.setAccessResidentInfoVital(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information vital - View/Update")) {
				securityRole.setAccessResidentInfoVital(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information Weight - View")) {
				if (securityRole.getAccessResidentInfoWeight() < 1) {
					securityRole.setAccessResidentInfoWeight(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information Weight - View/Update")) {
				securityRole.setAccessResidentInfoWeight(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information wounds - View")) {
				if (securityRole.getAccessResidentInfoWounds() < 1) {
					securityRole.setAccessResidentInfoWounds(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information wounds - View/Update")) {
				securityRole.setAccessResidentInfoWounds(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information PersonalInfo - View")) {
				if (securityRole.getAccessResidentInfoPersonalInfo() < 1) {
					securityRole.setAccessResidentInfoPersonalInfo(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information PersonalInfo - View/Update")) {
				securityRole.setAccessResidentInfoPersonalInfo(2);
			}

			if (selectedRole
					.equalsIgnoreCase("Resident Information Payer info - View")) {
				if (securityRole.getAccessResidentInfoPayerInfo() < 1) {
					securityRole.setAccessResidentInfoPayerInfo(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information Payer info - View/Update")) {
				securityRole.setAccessResidentInfoPayerInfo(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information contactinfo - View")) {
				if (securityRole.getAccessResidentInfoContactInfo() < 1) {
					securityRole.setAccessResidentInfoContactInfo(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information contactinfo - View/Update")) {
				securityRole.setAccessResidentInfoContactInfo(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information physicians - View")) {
				if (securityRole.getAccessResidentInfoPhysicians() < 1) {
					securityRole.setAccessResidentInfoPhysicians(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information physicians - View/Update")) {
				securityRole.setAccessResidentInfoPhysicians(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information Providers - View")) {
				if (securityRole.getAccessResidentInfoProviders() < 1) {
					securityRole.setAccessResidentInfoProviders(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information Providers - View/Update")) {
				securityRole.setAccessResidentInfoProviders(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information census - View")) {
				if (securityRole.getAccessResidentInfoCensus() < 1) {
					securityRole.setAccessResidentInfoCensus(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information census - View/Update")) {
				securityRole.setAccessResidentInfoCensus(2);
			}

			if (selectedRole
					.equalsIgnoreCase("Resident Information diagnosis - View")) {
				if (securityRole.getAccessResidentInfoDiagnosis() < 1) {
					securityRole.setAccessResidentInfoDiagnosis(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information diagnosis - View/Update")) {
				securityRole.setAccessResidentInfoDiagnosis(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information scan - View")) {
				if (securityRole.getAccessResidentInfoScan() < 1) {
					securityRole.setAccessResidentInfoScan(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information scan - View/Update")) {
				securityRole.setAccessResidentInfoScan(2);
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information room - View")) {
				if (securityRole.getAccessResidentInfoRoom() < 1) {
					securityRole.setAccessResidentInfoRoom(1);
				}
			}
			if (selectedRole
					.equalsIgnoreCase("Resident Information room - View/Update")) {
				securityRole.setAccessResidentInfoRoom(2);
			}

			if (selectedRole.equalsIgnoreCase("Resident - View")) {
				if (securityRole.getAccessResident() < 1) {
					securityRole.setAccessResident(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Resident - View/Update")) {
				securityRole.setAccessResident(2);
			}

			if (selectedRole.equalsIgnoreCase("Users - View")) {
				if (securityRole.getAccessUsers() < 1) {
					securityRole.setAccessUsers(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Users - View/Update")) {
				securityRole.setAccessUsers(2);
			}

			if (selectedRole.equalsIgnoreCase("UsersLogon - View")) {
				if (securityRole.getAccessUserLogon() < 1) {
					securityRole.setAccessUserLogon(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("UsersLogon - View/Update")) {
				securityRole.setAccessUserLogon(2);
			}

			if (selectedRole.equalsIgnoreCase("Messages - View")) {
				if (securityRole.getAccessMessages() < 1) {
					securityRole.setAccessMessages(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Messages - View/Update")) {
				securityRole.setAccessMessages(2);
			}

			if (selectedRole.equalsIgnoreCase("MasterList - View")) {
				if (securityRole.getAccessMasterlist() < 1) {
					securityRole.setAccessMasterlist(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("MasterList - View/Update")) {
				securityRole.setAccessMasterlist(2);
			}

			//
			if (selectedRole.equalsIgnoreCase("Admin - View")) {
				if (securityRole.getAccessAdmin() < 1) {
					securityRole.setAccessAdmin(1);
				}
			}
			if (selectedRole.equalsIgnoreCase("Admin - View/Update")) {
				securityRole.setAccessAdmin(2);
			}
		}

		int serial = 0;
		try {
			serial = MedrexClientManager.getInstance()
					.insertOrUpdatedSecurityRole(securityRole);

		} catch (Exception e) {

		}
		Global.userRoleId = serial;

		// securityRole.setName(txtRoleName.getText());

		// GlobalSecurity.currentRole=securityRole;

	}

	public void updateData() {
		SecurityRole srole = null;
		model1.clear();
		model1.removeAllElements();
		model1.clear();
		// model1.addElement("Try");
		if (Global.userRoleId != 0) {

			try {
				srole = MedrexClientManager.getInstance().getSecurityRole(
						Global.userRoleId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (srole.getAccessActivity() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Activites - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Activites - View");
			}
			if (srole.getAccessActivity() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Activites - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Activites - View/Update");
			}
			if (srole.getAccessAdmissionRecords() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Admission - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Admission - View");
			}
			if (srole.getAccessAdmissionRecords() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Admission - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Admission - View/Update");
			}
			if (srole.getAccessCareLog() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Care Log - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Care Log - View");
			}
			if (srole.getAccessCareLog() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Care Log - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Care Log - View/Update");
			}
			if (srole.getAccessCarePlan() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Care Plan - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Care Plan - View");
			}
			if (srole.getAccessCarePlan() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Care Plan - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Care Plan - View/Update");
			}
			if (srole.getAccessCensus() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Census - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Census - View");
			}
			if (srole.getAccessCensus() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Census - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Census - View/Update");
			}

			if (srole.getAccessCNA() == 1) {
				model1.addElement("CNA - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("CNA - View");
			}
			if (srole.getAccessCNA() == 2) {
				model1.addElement("CNA - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("CNA - View/Update");
			}
			if (srole.getAccessConsultant() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Consultent - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Consultent - View");
			}
			if (srole.getAccessConsultant() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Consultent - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Consultent - View/Update");
			}
			if (srole.getAccessDietary() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Dietary - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Dietary - View");
			}
			if (srole.getAccessDietary() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Dietary - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Dietary - View/Update");
			}
			if (srole.getAccessHistoryPhysical() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("History & Physical - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("History & Physical - View");
			}
			if (srole.getAccessHistoryPhysical() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("History & Physical  - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("History & Physical  - View/Update");
			}
			if (srole.getAccessLabSpecialReports() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Labs & Special Reports - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Labs & Special Reports - View");
			}
			if (srole.getAccessLabSpecialReports() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Labs & Special Reports - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Labs & Special Reports - View/Update");
			}
			if (srole.getAccessMDS() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("MDS - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("MDS - View");
			}
			if (srole.getAccessMDS() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("MDS - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("MDS - View/Update");
			}
			if (srole.getAccessMedicationCart() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Medication - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Medication - View");
			}
			if (srole.getAccessMedicationCart() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Medication - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Medication - View/Update");
			}
			if (srole.getAccessMedicationTreatment() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Medication & Treatment - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Medication & Treatment - View");
			}
			if (srole.getAccessMedicationTreatment() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Medication & Treatment - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Medication & Treatment - View/Update");
			}
			if (srole.getAccessOtPtActSpeech() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("OT-PT-ACT Speech - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("OT-PT-ACT Speech - View");
			}
			if (srole.getAccessOtPtActSpeech() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("OT-PT-ACT Speech - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("OT-PT-ACT Speech - View/Update");
			}
			if (srole.getAccessPhysicianOrders() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Phyicians Orders - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Phyicians Orders - View");
			}
			if (srole.getAccessPhysicianOrders() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Phyicians Orders - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Phyicians Orders - View/Update");
			}
			if (srole.getAccessProgressNotes() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Progress Notes - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Progress Notes - View");
			}
			if (srole.getAccessProgressNotes() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Progress Notes - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Progress Notes - View/Update");
			}
			if (srole.getAccessReports() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Reports - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Reports - View");
			}
			if (srole.getAccessReports() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Reports - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Reports - View/Update");
			}

			// suresh
			if (srole.getAccessResidentInfoAllergies() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information allergies - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information allergies - View");
			}
			if (srole.getAccessResidentInfoAllergies() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information allergies - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information allergies - View/Update");
			}
			if (srole.getAccessResidentInfoScheduling() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information scheduling - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information scheduling - View");
			}
			if (srole.getAccessResidentInfoScheduling() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information scheduling - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information scheduling - View/Update");
			}

			if (srole.getAccessResidentInfoVital() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information vital - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information vital - View");
			}
			if (srole.getAccessResidentInfoVital() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information vital - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information vital - View/Update");
			}
			if (srole.getAccessResidentInfoWeight() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Weight - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Weight - View");
			}
			if (srole.getAccessResidentInfoWeight() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Weight - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Weight - View/Update");
			}
			if (srole.getAccessResidentInfoWounds() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information wounds - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information wounds - View");
			}
			if (srole.getAccessResidentInfoWounds() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information wounds - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information wounds - View/Update");
			}

			if (srole.getAccessResidentInfoPersonalInfo() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information PersonalInfo - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information PersonalInfo - View");
			}
			if (srole.getAccessResidentInfoPersonalInfo() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information PersonalInfo - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information PersonalInfo - View/Update");
			}

			if (srole.getAccessResidentInfoPayerInfo() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Payer info - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Payer info - View");
			}
			if (srole.getAccessResidentInfoPayerInfo() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Payer info - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Payer info - View/Update");
			}
			if (srole.getAccessResidentInfoContactInfo() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information contactinfo - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information contactinfo - View");
			}
			if (srole.getAccessResidentInfoContactInfo() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information contactinfo - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information contactinfo - View/Update");
			}
			if (srole.getAccessResidentInfoPhysicians() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information physicians - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information physicians - View");
			}
			if (srole.getAccessResidentInfoPhysicians() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information physicians - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information physicians - View/Update");
			}
			if (srole.getAccessResidentInfoProviders() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Providers - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Providers - View");
			}
			if (srole.getAccessResidentInfoProviders() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Providers - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Providers - View/Update");
			}
			if (srole.getAccessResidentInfoCensus() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information census - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information census - View");
			}
			if (srole.getAccessResidentInfoCensus() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information census - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information census - View/Update");
			}
			if (srole.getAccessResidentInfoDiagnosis() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information diagnosis - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information diagnosis - View");
			}
			if (srole.getAccessResidentInfoDiagnosis() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information diagnosis - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information diagnosis - View/Update");
			}
			if (srole.getAccessResidentInfoScan() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information scan - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information scan - View");
			}
			if (srole.getAccessResidentInfoScan() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information scan - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information scan - View/Update");
			}
			if (srole.getAccessResidentInfoRoom() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information room - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information room - View");
			}
			if (srole.getAccessResidentInfoRoom() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information room - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information room - View/Update");
			}

			// ////

			if (srole.getAccessResident() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident - View");
			}
			if (srole.getAccessResident() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident - View/Update");
			}

			//
			if (srole.getAccessUsers() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Users - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Users - View");
			}
			if (srole.getAccessUsers() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Users - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Users - View/Update");
			}

			if (srole.getAccessUserLogon() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("UsersLogon - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("UsersLogon - View");
			}
			if (srole.getAccessUserLogon() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("UsersLogon - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("UsersLogon - View/Update");
			}

			if (srole.getAccessMessages() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Messages - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Messages - View");
			}
			if (srole.getAccessMessages() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Messages - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Messages - View/Update");
			}

			if (srole.getAccessMasterlist() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("MasterList - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("MasterList - View");
			}
			if (srole.getAccessMasterlist() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("MasterList - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("MasterList - View/Update");
			}

			if (srole.getAccessAdmin() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Admin - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Admin - View");
			}
			if (srole.getAccessAdmin() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Admin - View/Update");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Admin - View/Update");
			}
		}

		listSelectedRoles.repaint();
		System.out.println(((DefaultListModel) listSelectedRoles.getModel())
				.size());
		System.out.println("with model" + model1.size());
		scrollPane_1.getViewport().repaint();
	}
}
