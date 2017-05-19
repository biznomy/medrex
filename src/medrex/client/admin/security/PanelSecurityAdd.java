package medrex.client.admin.security;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.users.PanelUsersAdd;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.security.SecurityRole;

import com.sX.swing.JxButton;

public class PanelSecurityAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -373520060947728477L;

	private JxButton moveSelectedLeftButton;

	private JxButton moveSelectedRightButton;

	private JxButton moveOneLeftButton;

	private JxButton moveOneRightButton;

	private JxButton cancelButton;

	private JxButton saveButton;

	private JList listOfRoles;

	private JList listSelectedRoles;

	private JTextField txtRoleName;

	private DefaultListModel model;

	private DefaultListModel model1;

	private List selectedRoleList;

	private Object[] values;

	private JTable table;

	int roleType;

	private PanelUsersAdd panelUsersAdd;

	private Users user;

	private ControllerSecurity conSecurity;
	private Map myMap;
	private PresentationModel presentationModel;
	private JLabel errorLabel;

	public PanelSecurityAdd(int rType) {
		super();
		roleType = rType;
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.black, 1, false));
		myMap = new HashMap();
		conSecurity = new ControllerSecurity();
		setLayout(null);

		final JLabel roleNameLabel = new JLabel();
		roleNameLabel.setForeground(SystemColor.desktop);
		roleNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		roleNameLabel.setBounds(67, 35, 76, 14);
		roleNameLabel.setText("Role Name");
		add(roleNameLabel);

		txtRoleName = new JTextField();
		myMap.put("name", txtRoleName);
		txtRoleName.setBounds(149, 31, 204, 23);
		add(txtRoleName);
		if (roleType == 1) {
			roleNameLabel.setVisible(false);
			txtRoleName.setVisible(false);
			myMap.remove("name");
		}

		DefaultTableModel dm;
		RadioButtonEditor rr;
		dm = new DefaultTableModel();
		dm.setDataVector(getData(),
				new Object[] { "Application", "Priviledge" });

		table = new JTable(dm);
		String[] answer = { "None                ", "View             ",
				"Update           " };

		table.getColumn("Priviledge").setCellRenderer(
				new RadioButtonRenderer(answer));
		rr = new RadioButtonEditor(new JCheckBox(),
				new RadioButtonPanel(answer));
		table.getColumn("Priviledge").setCellEditor(rr);

		final JScrollPane scrollPane_3 = new JScrollPane(table);
		scrollPane_3.setBounds(67, 79, 679, 290);
		scrollPane_3.setBackground(Color.WHITE);
		scrollPane_3.getViewport().setBackground(Color.WHITE);
		add(scrollPane_3);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(484, 392, 225, 290);
		// add(scrollPane_1);

		model1 = new DefaultListModel();
		listSelectedRoles = new JList();
		listSelectedRoles.setModel(new DefaultListModel());
		scrollPane_1.setViewportView(listSelectedRoles);
		listSelectedRoles.setBorder(new LineBorder(Color.black, 1, false));

		saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (doSave())
					Global.frameSecurityAddNew.dispose();
			}
		});
		saveButton.setArc(0.4f);
		saveButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		saveButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(199, 386, 75, 35);
		add(saveButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.frameSecurityAddNew.dispose();
			}
		});
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(301, 386, 75, 35);
		add(cancelButton);

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
		// add(moveSelectedLeftButton);

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
		// add(moveSelectedRightButton);

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
		// add(moveOneLeftButton);

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
		// add(moveOneRightButton);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(642, 392, 227, 290);
		// add(scrollPane);

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

		String[] data = new String[] { "CNA - View", "CNA - View/Update",
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
				"Resident Information allergies - View/Update",
				"Resident Information scheduling - View/Update",
				"Resident Information vital - View/Update",
				"Resident Information Weight - View/Update",
				"Resident Information wounds - View/Update",
				"Resident Information PersonalInfo - View/Update",
				"Resident Information Payer info - View/Update",
				"Resident Information contactinfo - View/Update",
				"Resident Information physicians - View/Update",
				"Resident Information Providers - View/Update",
				"Resident Information census - View/Update",
				"Resident Information diagnosis - View/Update",
				"Resident Information scan - View/Update",
				"Resident Information room - View/Update",

				"Resident - View/Update", "Users - View",
				"UsersLogon - View/Update", "Messages - View/Update",
				"MasterList - View/Update", "Admin - View/Update"

		};

		for (int i = 0; i < data.length; i++) {
			model.addElement(data[i]);
		}
		listOfRoles.setModel(model);

		errorLabel = new JLabel();
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setText("");
		errorLabel.setBounds(67, 10, 200, 14);
		add(errorLabel);

		presentationModel = new PresentationModel(myMap, SecurityRole.class,
				conSecurity, errorLabel);
		presentationModel.validateAll();

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
				// updateLists(">");
				DefaultListModel rolMod = (DefaultListModel) listOfRoles
						.getModel();
				DefaultListModel selMod = (DefaultListModel) listSelectedRoles
						.getModel();
				for (int i = 0; i < rolMod.getSize(); i++) {
					selMod.addElement(rolMod.getElementAt(i));
				}
				listSelectedRoles.setModel(selMod);
				listOfRoles.setModel(new DefaultListModel());
			}
		}
		if (actionButton.equals(">>")) {
			if (listSelectedRoles.getModel().getSize() > 0) {
				// updateLists("<");
				DefaultListModel rolMod = (DefaultListModel) listOfRoles
						.getModel();
				DefaultListModel selMod = (DefaultListModel) listSelectedRoles
						.getModel();
				for (int i = 0; i < selMod.getSize(); i++) {
					rolMod.addElement(selMod.getElementAt(i));
				}
				listSelectedRoles.setModel(new DefaultListModel());
				listOfRoles.setModel(rolMod);
			}
		}
	}

	public boolean doSave() {

		SecurityRole securityRole = new SecurityRole();
		if (Global.currentSecurityRoleKey != 0) {
			securityRole.setSerial(Global.currentSecurityRoleKey);
		}
		securityRole.setName(txtRoleName.getText());
		securityRole.setTypeOfRole(roleType);

		securityRole
				.setAccessCNA(((Integer) table.getValueAt(0, 1)).intValue());
		securityRole.setAccessReports(((Integer) table.getValueAt(1, 1))
				.intValue());
		securityRole.setAccessCensus(((Integer) table.getValueAt(2, 1))
				.intValue());
		securityRole.setAccessCareLog(((Integer) table.getValueAt(3, 1))
				.intValue());
		securityRole.setAccessMedicationCart(((Integer) table.getValueAt(4, 1))
				.intValue());
		securityRole.setAccessAdmissionRecords(((Integer) table
				.getValueAt(5, 1)).intValue());
		securityRole.setAccessActivity(((Integer) table.getValueAt(6, 1))
				.intValue());
		securityRole.setAccessMedicationTreatment(((Integer) table.getValueAt(
				7, 1)).intValue());
		securityRole.setAccessConsultant(((Integer) table.getValueAt(8, 1))
				.intValue());
		securityRole.setAccessProgressNotes(((Integer) table.getValueAt(9, 1))
				.intValue());
		securityRole.setAccessLabSpecialReports(((Integer) table.getValueAt(10,
				1)).intValue());
		securityRole.setAccessPhysicianOrders(((Integer) table
				.getValueAt(11, 1)).intValue());
		securityRole.setAccessOtPtActSpeech(((Integer) table.getValueAt(12, 1))
				.intValue());
		securityRole.setAccessMDS(((Integer) table.getValueAt(13, 1))
				.intValue());
		securityRole.setAccessCarePlan(((Integer) table.getValueAt(14, 1))
				.intValue());

		// suresh

		securityRole.setAccessResidentInfoAllergies(((Integer) table
				.getValueAt(15, 1)).intValue());

		securityRole.setAccessResidentInfoScheduling(((Integer) table
				.getValueAt(16, 1)).intValue());
		securityRole.setAccessResidentInfoVital(((Integer) table.getValueAt(17,
				1)).intValue());
		securityRole.setAccessResidentInfoWeight(((Integer) table.getValueAt(
				18, 1)).intValue());
		securityRole.setAccessResidentInfoWounds(((Integer) table.getValueAt(
				19, 1)).intValue());
		securityRole.setAccessResidentInfoPersonalInfo(((Integer) table
				.getValueAt(20, 1)).intValue());
		securityRole.setAccessResidentInfoPayerInfo(((Integer) table
				.getValueAt(21, 1)).intValue());

		securityRole.setAccessResidentInfoContactInfo(((Integer) table
				.getValueAt(22, 1)).intValue());
		securityRole.setAccessResidentInfoPhysicians(((Integer) table
				.getValueAt(23, 1)).intValue());
		securityRole.setAccessResidentInfoProviders(((Integer) table
				.getValueAt(24, 1)).intValue());

		securityRole.setAccessResidentInfoCensus(((Integer) table.getValueAt(
				25, 1)).intValue());
		securityRole.setAccessResidentInfoDiagnosis(((Integer) table
				.getValueAt(26, 1)).intValue());
		securityRole.setAccessResidentInfoScan(((Integer) table.getValueAt(27,
				1)).intValue());
		securityRole.setAccessResidentInfoRoom(((Integer) table.getValueAt(28,
				1)).intValue());

		// for dashboard privilages

		securityRole.setAccessResident(((Integer) table.getValueAt(29, 1))
				.intValue());

		securityRole.setAccessUsers(((Integer) table.getValueAt(30, 1))
				.intValue());

		securityRole.setAccessUserLogon(((Integer) table.getValueAt(31, 1))
				.intValue());

		securityRole.setAccessMessages(((Integer) table.getValueAt(32, 1))
				.intValue());

		securityRole.setAccessMasterlist(((Integer) table.getValueAt(33, 1))
				.intValue());

		securityRole.setAccessAdmin(((Integer) table.getValueAt(34, 1))
				.intValue());

		// int cnt =listSelectedRoles.getModel().getSize();
		//		
		//		
		// for(int i=0;i<cnt;i++){
		// String selectedRole
		// =(String)listSelectedRoles.getModel().getElementAt(i);
		//			
		// if(selectedRole.equalsIgnoreCase("CNA - View")){
		// if(securityRole.getAccessCNA()<1){
		// securityRole.setAccessCNA(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("CNA - View/Update")){
		// securityRole.setAccessCNA(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Reports - View")){
		// if(securityRole.getAccessReports()<1){
		// securityRole.setAccessReports(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Reports - View/Update")){
		// securityRole.setAccessReports(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Census - View")){
		// if(securityRole.getAccessCensus()<1){
		// securityRole.setAccessCensus(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Census - View/Update")){
		// securityRole.setAccessCensus(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Care Log - View")){
		// if(securityRole.getAccessCareLog()<1){
		// securityRole.setAccessCareLog(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Care Log - View/Update")){
		// securityRole.setAccessCareLog(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Medication - View")){
		// if(securityRole.getAccessMedicationCart()<1){
		// securityRole.setAccessMedicationCart(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Medication - View/Update")){
		// securityRole.setAccessMedicationCart(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Admission - View")){
		// if(securityRole.getAccessAdmissionRecords()<1){
		// securityRole.setAccessAdmissionRecords(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Admission - View/Update")){
		// securityRole.setAccessAdmissionRecords(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Activites - View")){
		// if(securityRole.getAccessActivity()<1){
		// securityRole.setAccessActivity(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Activites - View/Update")){
		// securityRole.setAccessActivity(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Medication & Treatment - View")){
		// if(securityRole.getAccessMedicationTreatment()<1){
		// securityRole.setAccessMedicationTreatment(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Medication & Treatment - View/Update")){
		// securityRole.setAccessMedicationTreatment(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Dietary - View")){
		// if(securityRole.getAccessDietary()<1){
		// securityRole.setAccessDietary(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Dietary - View/Update")){
		// securityRole.setAccessDietary(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Consultent - View")){
		// if(securityRole.getAccessConsultant()<1){
		// securityRole.setAccessConsultant(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Consultent - View/Update")){
		// securityRole.setAccessConsultant(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Progress Notes - View")){
		// if(securityRole.getAccessProgressNotes()<1){
		// securityRole.setAccessProgressNotes(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Progress Notes - View/Update")){
		// securityRole.setAccessProgressNotes(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Labs & Special Reports - View")){
		// if(securityRole.getAccessLabSpecialReports()<1){
		// securityRole.setAccessLabSpecialReports(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Labs & Special Reports - View/Update")){
		// securityRole.setAccessLabSpecialReports(2);
		// }
		// if(selectedRole.equalsIgnoreCase("History & Physical - View")){
		// if(securityRole.getAccessHistoryPhysical()<1){
		// securityRole.setAccessHistoryPhysical(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("History & Physical  - View/Update")){
		// securityRole.setAccessHistoryPhysical(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Phyicians Orders - View")){
		// if(securityRole.getAccessPhysicianOrders()<1){
		// securityRole.setAccessPhysicianOrders(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Phyicians Orders - View/Update")){
		// securityRole.setAccessPhysicianOrders(2);
		// }
		// if(selectedRole.equalsIgnoreCase("OT-PT-ACT Speech - View")){
		// if(securityRole.getAccessOtPtActSpeech()<1){
		// securityRole.setAccessOtPtActSpeech(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("OT-PT-ACT Speech - View/Update")){
		// securityRole.setAccessOtPtActSpeech(2);
		// }
		// if(selectedRole.equalsIgnoreCase("MDS - View")){
		// if(securityRole.getAccessMDS()<1){
		// securityRole.setAccessMDS(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("MDS - View/Update")){
		// securityRole.setAccessMDS(2);
		// }
		// if(selectedRole.equalsIgnoreCase("Care Plan - View")){
		// if(securityRole.getAccessCarePlan()<1){
		// securityRole.setAccessCarePlan(1);
		// }
		// }
		// if(selectedRole.equalsIgnoreCase("Care Plan - View/Update")){
		// securityRole.setAccessCarePlan(2);
		// }
		// }
		//		

		List errors = conSecurity.doValidate(securityRole, "");
		if (roleType != 1) {
			if (errors.size() > 0) {
				MsgBox m = new MsgBox();
				Iterator itr = errors.iterator();
				String strError = "";
				while (itr.hasNext()) {
					strError += (String) itr.next() + "\n";
				}
				m.addPrompt(strError);
				m.setTitle("Error Saving Security");
				m.setVisible(true);
				return false;
			} else {
				try {
					Global.userRoleId = MedrexClientManager.getInstance()
							.insertOrUpdatedSecurityRole(securityRole);
				} catch (Exception e) {

				}

				SecurityRole securityRoleobject = null;
				try {
					securityRoleobject = MedrexClientManager.getInstance()
							.getSecurityRole(Global.userRoleId);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (roleType == 1) {
					user.setUserRole(securityRoleobject);
					try {
						Global.currentUserKey = MedrexClientManager
								.getInstance().insertOrUpdateUser(user);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		return true;

	}

	public Object[][] getData() {

		if (roleType == 1) {
			user = new Users();
			try {
				user = MedrexClientManager.getInstance().getUser(
						Global.currentUsersKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		SecurityRole srole = null;
		if (Global.currentSecurityRoleKey != 0) {

			try {
				srole = MedrexClientManager.getInstance().getSecurityRole(
						Global.currentSecurityRoleKey);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			srole = new SecurityRole();
		}

		Object[][] data = new Object[35][2];
		data[0][0] = "CNA";
		data[0][1] = new Integer(srole.getAccessCNA());
		data[1][0] = "Reports";
		data[1][1] = new Integer(srole.getAccessReports());
		data[2][0] = "Census";
		data[2][1] = new Integer(srole.getAccessCensus());

		data[3][0] = "Carelog";
		data[3][1] = new Integer(srole.getAccessCareLog());
		data[4][0] = "Medication Cart";
		data[4][1] = new Integer(srole.getAccessMedicationCart());
		data[5][0] = "Admission";
		data[5][1] = new Integer(srole.getAccessAdmissionRecords());

		data[6][0] = "Activity";
		data[6][1] = new Integer(srole.getAccessActivity());
		data[7][0] = "Medication & Treatment";
		data[7][1] = new Integer(srole.getAccessMedicationTreatment());
		data[8][0] = "Consultant";
		data[8][1] = new Integer(srole.getAccessConsultant());

		data[9][0] = "Progress Notes";
		data[9][1] = new Integer(srole.getAccessProgressNotes());
		data[10][0] = "Labs and Special Reports";
		data[10][1] = new Integer(srole.getAccessLabSpecialReports());
		data[11][0] = "Physician Orders";
		data[11][1] = new Integer(srole.getAccessPhysicianOrders());

		data[12][0] = "OT PT ACT Speech";
		data[12][1] = new Integer(srole.getAccessOtPtActSpeech());
		data[13][0] = "MDS";
		data[13][1] = new Integer(srole.getAccessMDS());
		data[14][0] = "Care Plan";
		data[14][1] = new Integer(srole.getAccessCarePlan());

		// suresh
		data[15][0] = "Resident Information Allergies";
		data[15][1] = new Integer(srole.getAccessResidentInfoAllergies());
		// ////////////////////////
		data[16][0] = "Resident Information Scheduling";
		data[16][1] = new Integer(srole.getAccessResidentInfoScheduling());

		data[17][0] = "Resident Information Vital";
		data[17][1] = new Integer(srole.getAccessResidentInfoWeight());

		data[18][0] = "Resident Information Weight";
		data[18][1] = new Integer(srole.getAccessResidentInfoWeight());

		data[19][0] = "Resident Information Wounds";
		data[19][1] = new Integer(srole.getAccessResidentInfoWounds());

		data[20][0] = "Resident Information Personal info";
		data[20][1] = new Integer(srole.getAccessResidentInfoPersonalInfo());

		data[21][0] = "Resident Information Payer info";
		data[21][1] = new Integer(srole.getAccessResidentInfoPayerInfo());

		data[22][0] = "Resident Information contact info";
		data[22][1] = new Integer(srole.getAccessResidentInfoContactInfo());

		data[23][0] = "Resident Information Physicians";
		data[23][1] = new Integer(srole.getAccessResidentInfoPhysicians());

		data[24][0] = "Resident Information Providers";
		data[24][1] = new Integer(srole.getAccessResidentInfoProviders());

		data[25][0] = "Resident Information census";
		data[25][1] = new Integer(srole.getAccessResidentInfoCensus());

		data[26][0] = "Resident Information Diagnosis";
		data[26][1] = new Integer(srole.getAccessResidentInfoDiagnosis());

		data[27][0] = "Resident Information scan";
		data[27][1] = new Integer(srole.getAccessResidentInfoScan());

		data[28][0] = "Resident Information Room";
		data[28][1] = new Integer(srole.getAccessResidentInfoRoom());

		// dashboard privilages

		data[29][0] = "Resident";
		data[29][1] = new Integer(srole.getAccessResident());

		data[30][0] = "Users";
		data[30][1] = new Integer(srole.getAccessUsers());

		data[31][0] = "UsersLogon";
		data[31][1] = new Integer(srole.getAccessUserLogon());

		data[32][0] = "Messages";
		data[32][1] = new Integer(srole.getAccessMessages());

		data[33][0] = "MasterList";
		data[33][1] = new Integer(srole.getAccessMasterlist());

		data[34][0] = "Admin";
		data[34][1] = new Integer(srole.getAccessAdmin());

		return (data);

	}

	public void updateData() {
		if (roleType == 1) {
			user = new Users();
			try {
				user = MedrexClientManager.getInstance().getUser(
						Global.currentUsersKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		SecurityRole srole = null;
		if (Global.currentSecurityRoleKey != 0) {

			try {
				srole = MedrexClientManager.getInstance().getSecurityRole(
						Global.currentSecurityRoleKey);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			txtRoleName.setText(srole.getName());

			if (roleType == 1) {
				txtRoleName.setVisible(false);
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
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("CNA - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("CNA - View");
			}
			if (srole.getAccessCNA() == 2) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("CNA - View/Update");
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

			// / suresh

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

			if (srole.getAccessResidentInfoPersonalInfo() == 1) {
				((DefaultListModel) listSelectedRoles.getModel())
						.addElement("Resident Information Payer info - View");
				((DefaultListModel) listOfRoles.getModel())
						.removeElement("Resident Information Payer info - View");
			}
			if (srole.getAccessResidentInfoPersonalInfo() == 2) {
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

			// for dashboard

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

	}

}
