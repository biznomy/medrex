package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStTreatment;

import com.toedter.calendar.JDateChooser;

public class PanelPtOtStTreatment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtHealthCareB;
	private JTextArea txtProcedure;
	private JLabel wwweastcoastwoundcarecomLabel;
	private JLabel performanceOfTheLabel_14;
	private JLabel performanceOfTheLabel_13;
	private JTextField txtUnitRoom;
	private JTextField txtResident;
	private JLabel treatmentConsentLabel_2;
	private JTextArea txt_Assignment;
	private JLabel performanceOfTheLabel_32;
	private JTextField txtWitnessTimeC;
	private JLabel performanceOfTheLabel_31;
	private JDateChooser dcWitnessDateC;
	private JLabel performanceOfTheLabel_30;
	private JComboBox cmbWitnessSignC;
	private JLabel performanceOfTheLabel_29;
	private JTextField txtStaffTimeC;
	private JLabel performanceOfTheLabel_28;
	private JDateChooser dcStaffdateC;
	private JComboBox cmbStaffSignC;
	private JLabel performanceOfTheLabel_27;
	private JTextField txtRelationC;
	private JLabel unableToGiveLabel_3;
	private JLabel iLabel_7;
	private JTextField txtVerbalC;
	private JLabel unableToGiveLabel_2;
	private JLabel performanceOfTheLabel_26;
	private JTextField txtNameC;
	private JLabel performanceOfTheLabel_25;
	private JTextField txtVerbalTimeC;
	private JLabel performanceOfTheLabel_24;
	private JDateChooser dcVerbalDateC;
	private JLabel performanceOfTheLabel_23;
	private JTextArea txt_PatientSign_3;
	private JLabel iLabel_6;
	private JPanel panel_6;
	private JLabel performanceOfTheLabel_12;
	private JComboBox cmbWitnessSignB;
	private JTextField txtRelationToPatientB;
	private JLabel performanceOfTheLabel_11;
	private JTextField txtWitnessTimeB;
	private JLabel performanceOfTheLabel_10;
	private JDateChooser dcWitnessDateB;
	private JLabel performanceOfTheLabel_9;
	private JLabel performanceOfTheLabel_8;
	private JLabel performanceOfTheLabel_7;
	private JTextField txtTimeB;
	private JDateChooser dcHealthDateB;
	private JTextArea txt_PatientSign_1;
	private JLabel iLabel_3;
	private JPanel panel_4;
	private JLabel performanceOfTheLabel_6;
	private JTextField txtWitnessTimeA;
	private JLabel performanceOfTheLabel_5;
	private JDateChooser dcWitnessDateA;
	private JLabel performanceOfTheLabel_4;
	private JComboBox cmbWitnessSignA;
	private JLabel performanceOfTheLabel_3;
	private JLabel performanceOfTheLabel_2;
	private JTextField txtPatientTimeA;
	private JDateChooser dcPatientDateA;
	private JTextArea txt_PatientSign;
	private JComboBox cmbPatientSignA;
	private JLabel iLabel_2;
	private JPanel panel_2;
	private JLabel treatmentConsentLabel_1;
	private JPanel panel_1;
	private JTextArea txt_Treatment;
	private JTextField txtDoctor;
	private JLabel performanceOfTheLabel_1;
	private JLabel performanceOfTheLabel;
	private JLabel iLabel_1;
	private JTextField txtPatientName;
	private JLabel iLabel;
	private JPanel panel;
	private JLabel treatmentConsentLabel;
	private JLabel eastCostLabel;

	/**
	 * Create the panel
	 */
	public PanelPtOtStTreatment() {
		super();
		Global.panelPtOtStTreatment = this;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 1200));

		eastCostLabel = new JLabel();
		eastCostLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		eastCostLabel.setBackground(Color.WHITE);
		eastCostLabel.setText("EAST COAST");
		eastCostLabel.setBounds(298, 10, 138, 45);
		add(eastCostLabel);

		treatmentConsentLabel = new JLabel();
		treatmentConsentLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		treatmentConsentLabel.setText("TREATMENT CONSENT");
		treatmentConsentLabel.setBounds(267, 61, 204, 23);
		add(treatmentConsentLabel);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(14, 118, 736, 175);
		add(panel);

		iLabel = new JLabel();
		iLabel.setFont(new Font("", Font.BOLD, 14));
		iLabel.setText("I,");
		iLabel.setBounds(10, 10, 12, 14);
		panel.add(iLabel);

		txtPatientName = new JTextField();
		txtPatientName.setBounds(28, 8, 486, 20);
		panel.add(txtPatientName);

		iLabel_1 = new JLabel();
		iLabel_1.setFont(new Font("", Font.BOLD, 14));
		iLabel_1.setText(", hereby give consent for the");
		iLabel_1.setBounds(520, 8, 206, 21);
		panel.add(iLabel_1);

		performanceOfTheLabel = new JLabel();
		performanceOfTheLabel.setFont(new Font("", Font.BOLD, 14));
		performanceOfTheLabel
				.setText("performance of the following procedure(s):");
		performanceOfTheLabel.setBounds(10, 33, 303, 21);
		panel.add(performanceOfTheLabel);

		performanceOfTheLabel_1 = new JLabel();
		performanceOfTheLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_1.setText("upon me by Dr.");
		performanceOfTheLabel_1.setBounds(10, 99, 105, 20);
		panel.add(performanceOfTheLabel_1);

		txtDoctor = new JTextField();
		txtDoctor.setBounds(134, 99, 369, 20);
		panel.add(txtDoctor);

		txt_Treatment = new JTextArea();
		txt_Treatment.setWrapStyleWord(true);
		txt_Treatment.setLineWrap(true);
		txt_Treatment.setFont(new Font("", Font.BOLD, 14));
		txt_Treatment
				.setText("The nature, benefits, and risks of the procedure(s) have been explained to me (or to my next of kin or Power of Attorney), and I am willing to give informed consent for the procedure(s). ");
		txt_Treatment.setBounds(10, 125, 716, 48);
		panel.add(txt_Treatment);

		txtProcedure = new JTextArea();
		txtProcedure.setBounds(10, 53, 716, 42);
		panel.add(txtProcedure);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(14, 309, 736, 595);
		add(panel_1);

		treatmentConsentLabel_1 = new JLabel();
		treatmentConsentLabel_1
				.setFont(new Font("Arial Black", Font.PLAIN, 16));
		treatmentConsentLabel_1.setText("Signatures");
		treatmentConsentLabel_1.setBounds(281, 10, 110, 23);
		panel_1.add(treatmentConsentLabel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(1, 32, 730, 134);
		panel_1.add(panel_2);

		iLabel_2 = new JLabel();
		iLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		iLabel_2.setText("A.");
		iLabel_2.setBounds(10, 10, 20, 14);
		panel_2.add(iLabel_2);

		cmbPatientSignA = new JComboBox();
		cmbPatientSignA.setBackground(Color.WHITE);
		cmbPatientSignA.setBounds(36, 9, 355, 21);
		panel_2.add(cmbPatientSignA);

		txt_PatientSign = new JTextArea();
		txt_PatientSign.setWrapStyleWord(true);
		txt_PatientSign.setLineWrap(true);
		txt_PatientSign.setFont(new Font("", Font.BOLD, 14));
		txt_PatientSign
				.setText("PAITENT'S SIGNATURE (with decision-making capacity)");
		txt_PatientSign.setBounds(36, 31, 345, 42);
		panel_2.add(txt_PatientSign);

		dcPatientDateA = new JDateChooser();
		dcPatientDateA.setDateFormatString("MM/dd/yyyy");
		dcPatientDateA.setBounds(446, 9, 120, 21);
		panel_2.add(dcPatientDateA);

		txtPatientTimeA = new JTextField();
		txtPatientTimeA.setBounds(600, 9, 120, 20);
		panel_2.add(txtPatientTimeA);

		performanceOfTheLabel_2 = new JLabel();
		performanceOfTheLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_2.setText("DATE ");
		performanceOfTheLabel_2.setBounds(446, 30, 46, 20);
		panel_2.add(performanceOfTheLabel_2);

		performanceOfTheLabel_3 = new JLabel();
		performanceOfTheLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_3.setText("TIME");
		performanceOfTheLabel_3.setBounds(600, 30, 46, 20);
		panel_2.add(performanceOfTheLabel_3);

		cmbWitnessSignA = new JComboBox();
		cmbWitnessSignA.setBackground(Color.WHITE);
		cmbWitnessSignA.setBounds(36, 85, 355, 21);
		panel_2.add(cmbWitnessSignA);

		performanceOfTheLabel_4 = new JLabel();
		performanceOfTheLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_4.setText("WITNESS SIGNATURE");
		performanceOfTheLabel_4.setBounds(36, 108, 198, 18);
		panel_2.add(performanceOfTheLabel_4);

		dcWitnessDateA = new JDateChooser();
		dcWitnessDateA.setDateFormatString("MM/dd/yyyy");
		dcWitnessDateA.setBounds(446, 85, 120, 21);
		panel_2.add(dcWitnessDateA);

		performanceOfTheLabel_5 = new JLabel();
		performanceOfTheLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_5.setText("DATE ");
		performanceOfTheLabel_5.setBounds(446, 110, 46, 20);
		panel_2.add(performanceOfTheLabel_5);

		txtWitnessTimeA = new JTextField();
		txtWitnessTimeA.setBounds(600, 85, 120, 20);
		panel_2.add(txtWitnessTimeA);

		performanceOfTheLabel_6 = new JLabel();
		performanceOfTheLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_6.setText("TIME");
		performanceOfTheLabel_6.setBounds(600, 110, 46, 20);
		panel_2.add(performanceOfTheLabel_6);

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(1, 172, 730, 179);
		panel_1.add(panel_4);

		iLabel_3 = new JLabel();
		iLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		iLabel_3.setText("B.");
		iLabel_3.setBounds(10, 10, 20, 14);
		panel_4.add(iLabel_3);

		txt_PatientSign_1 = new JTextArea();
		txt_PatientSign_1.setWrapStyleWord(true);
		txt_PatientSign_1
				.setText("HEALTH CARE DECISION-MAKER (If patient lacks decision-making capacity)");
		txt_PatientSign_1.setLineWrap(true);
		txt_PatientSign_1.setFont(new Font("Dialog", Font.BOLD, 14));
		txt_PatientSign_1.setBounds(36, 31, 345, 42);
		panel_4.add(txt_PatientSign_1);

		dcHealthDateB = new JDateChooser();
		dcHealthDateB.setDateFormatString("MM/dd/yyyy");
		dcHealthDateB.setBounds(446, 9, 120, 21);
		panel_4.add(dcHealthDateB);

		txtTimeB = new JTextField();
		txtTimeB.setBounds(600, 9, 120, 20);
		panel_4.add(txtTimeB);

		performanceOfTheLabel_7 = new JLabel();
		performanceOfTheLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_7.setText("DATE ");
		performanceOfTheLabel_7.setBounds(446, 30, 47, 20);
		panel_4.add(performanceOfTheLabel_7);

		performanceOfTheLabel_8 = new JLabel();
		performanceOfTheLabel_8.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_8.setText("TIME");
		performanceOfTheLabel_8.setBounds(600, 30, 47, 20);
		panel_4.add(performanceOfTheLabel_8);

		performanceOfTheLabel_9 = new JLabel();
		performanceOfTheLabel_9.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_9.setText("RELATIONSHIP TO PATIENT ");
		performanceOfTheLabel_9.setBounds(36, 100, 198, 18);
		panel_4.add(performanceOfTheLabel_9);

		dcWitnessDateB = new JDateChooser();
		dcWitnessDateB.setDateFormatString("MM/dd/yyyy");
		dcWitnessDateB.setBounds(446, 127, 127, 21);
		panel_4.add(dcWitnessDateB);

		performanceOfTheLabel_10 = new JLabel();
		performanceOfTheLabel_10.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_10.setText("DATE ");
		performanceOfTheLabel_10.setBounds(446, 148, 47, 20);
		panel_4.add(performanceOfTheLabel_10);

		txtWitnessTimeB = new JTextField();
		txtWitnessTimeB.setBounds(600, 127, 120, 20);
		panel_4.add(txtWitnessTimeB);

		performanceOfTheLabel_11 = new JLabel();
		performanceOfTheLabel_11.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_11.setText("TIME");
		performanceOfTheLabel_11.setBounds(600, 148, 47, 20);
		panel_4.add(performanceOfTheLabel_11);

		txtRelationToPatientB = new JTextField();
		txtRelationToPatientB.setBounds(36, 79, 355, 20);
		panel_4.add(txtRelationToPatientB);

		cmbWitnessSignB = new JComboBox();
		cmbWitnessSignB.setBackground(Color.WHITE);
		cmbWitnessSignB.setBounds(36, 127, 355, 21);
		panel_4.add(cmbWitnessSignB);

		performanceOfTheLabel_12 = new JLabel();
		performanceOfTheLabel_12.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_12.setText("WITNESS SIGNATURE");
		performanceOfTheLabel_12.setBounds(36, 148, 198, 18);
		panel_4.add(performanceOfTheLabel_12);

		txtHealthCareB = new JTextField();
		txtHealthCareB.setBounds(36, 9, 355, 20);
		panel_4.add(txtHealthCareB);

		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(1, 357, 736, 228);
		panel_1.add(panel_6);

		iLabel_6 = new JLabel();
		iLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		iLabel_6.setText("C.");
		iLabel_6.setBounds(10, 10, 20, 14);
		panel_6.add(iLabel_6);

		txt_PatientSign_3 = new JTextArea();
		txt_PatientSign_3.setWrapStyleWord(true);
		txt_PatientSign_3
				.setText("VERBAL/TELEPHONE CONSENT :  The patient (or patient's health care decision-maker is ");
		txt_PatientSign_3.setLineWrap(true);
		txt_PatientSign_3.setFont(new Font("Dialog", Font.BOLD, 14));
		txt_PatientSign_3.setBounds(36, 9, 635, 21);
		panel_6.add(txt_PatientSign_3);

		performanceOfTheLabel_23 = new JLabel();
		performanceOfTheLabel_23.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_23.setText("NAME");
		performanceOfTheLabel_23.setBounds(36, 110, 61, 18);
		panel_6.add(performanceOfTheLabel_23);

		dcVerbalDateC = new JDateChooser();
		dcVerbalDateC.setDateFormatString("MM/dd/yyyy");
		dcVerbalDateC.setBounds(446, 89, 127, 21);
		panel_6.add(dcVerbalDateC);

		performanceOfTheLabel_24 = new JLabel();
		performanceOfTheLabel_24.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_24.setText("DATE ");
		performanceOfTheLabel_24.setBounds(446, 110, 77, 20);
		panel_6.add(performanceOfTheLabel_24);

		txtVerbalTimeC = new JTextField();
		txtVerbalTimeC.setBounds(600, 89, 120, 20);
		panel_6.add(txtVerbalTimeC);

		performanceOfTheLabel_25 = new JLabel();
		performanceOfTheLabel_25.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_25.setText("TIME");
		performanceOfTheLabel_25.setBounds(600, 110, 54, 20);
		panel_6.add(performanceOfTheLabel_25);

		txtNameC = new JTextField();
		txtNameC.setBounds(36, 89, 159, 20);
		panel_6.add(txtNameC);

		performanceOfTheLabel_26 = new JLabel();
		performanceOfTheLabel_26.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_26.setText("STAFF MEMBER'S SIGNATURE");
		performanceOfTheLabel_26.setBounds(36, 159, 219, 18);
		panel_6.add(performanceOfTheLabel_26);

		unableToGiveLabel_2 = new JLabel();
		unableToGiveLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		unableToGiveLabel_2
				.setText("unable to give written consent because of");
		unableToGiveLabel_2.setBounds(36, 32, 297, 21);
		panel_6.add(unableToGiveLabel_2);

		txtVerbalC = new JTextField();
		txtVerbalC.setBounds(339, 32, 332, 20);
		panel_6.add(txtVerbalC);

		iLabel_7 = new JLabel();
		iLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		iLabel_7.setText(",");
		iLabel_7.setBounds(673, 36, 13, 20);
		panel_6.add(iLabel_7);

		unableToGiveLabel_3 = new JLabel();
		unableToGiveLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		unableToGiveLabel_3
				.setText("therefore the procedure(s) has been explained and verbal consent obtained from");
		unableToGiveLabel_3.setBounds(36, 54, 589, 18);
		panel_6.add(unableToGiveLabel_3);

		txtRelationC = new JTextField();
		txtRelationC.setBounds(201, 89, 192, 20);
		panel_6.add(txtRelationC);

		performanceOfTheLabel_27 = new JLabel();
		performanceOfTheLabel_27.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_27.setText("RELATIONSHIP");
		performanceOfTheLabel_27.setBounds(201, 110, 112, 18);
		panel_6.add(performanceOfTheLabel_27);

		cmbStaffSignC = new JComboBox();
		cmbStaffSignC.setBackground(Color.WHITE);
		cmbStaffSignC.setBounds(36, 136, 357, 21);
		panel_6.add(cmbStaffSignC);

		dcStaffdateC = new JDateChooser();
		dcStaffdateC.setDateFormatString("MM/dd/yyyy");
		dcStaffdateC.setBounds(446, 136, 127, 21);
		panel_6.add(dcStaffdateC);

		performanceOfTheLabel_28 = new JLabel();
		performanceOfTheLabel_28.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_28.setText("DATE ");
		performanceOfTheLabel_28.setBounds(446, 159, 54, 20);
		panel_6.add(performanceOfTheLabel_28);

		txtStaffTimeC = new JTextField();
		txtStaffTimeC.setBounds(600, 136, 120, 20);
		panel_6.add(txtStaffTimeC);

		performanceOfTheLabel_29 = new JLabel();
		performanceOfTheLabel_29.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_29.setText("TIME");
		performanceOfTheLabel_29.setBounds(600, 159, 54, 20);
		panel_6.add(performanceOfTheLabel_29);

		cmbWitnessSignC = new JComboBox();
		cmbWitnessSignC.setBackground(Color.WHITE);
		cmbWitnessSignC.setBounds(36, 183, 357, 21);
		panel_6.add(cmbWitnessSignC);

		performanceOfTheLabel_30 = new JLabel();
		performanceOfTheLabel_30.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_30.setText("WITNESS SIGNATURE");
		performanceOfTheLabel_30.setBounds(36, 205, 159, 18);
		panel_6.add(performanceOfTheLabel_30);

		dcWitnessDateC = new JDateChooser();
		dcWitnessDateC.setDateFormatString("MM/dd/yyyy");
		dcWitnessDateC.setBounds(446, 183, 127, 21);
		panel_6.add(dcWitnessDateC);

		performanceOfTheLabel_31 = new JLabel();
		performanceOfTheLabel_31.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_31.setText("DATE ");
		performanceOfTheLabel_31.setBounds(446, 205, 54, 20);
		panel_6.add(performanceOfTheLabel_31);

		txtWitnessTimeC = new JTextField();
		txtWitnessTimeC.setBounds(600, 183, 120, 20);
		panel_6.add(txtWitnessTimeC);

		performanceOfTheLabel_32 = new JLabel();
		performanceOfTheLabel_32.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_32.setText("TIME");
		performanceOfTheLabel_32.setBounds(600, 205, 54, 20);
		panel_6.add(performanceOfTheLabel_32);

		txt_Assignment = new JTextArea();
		txt_Assignment.setFont(new Font("", Font.BOLD, 12));
		txt_Assignment
				.setText("The East Coast Wound Care physicians may disclose all or any part of a patient record to a hospital, medical service company, insurance company, workers compensation carrier, welfare fund, or the patient's employer. I hereby authorize my insurance company/fund to pay benefits for this and subsequent visits directly to East Coast Wound Care, P.C. or its designee, Furthermore, I undrestand that I am financially responsible to East Coast Wound Care, P.C. for any amount that is not paid or covered by insurance, I have read the above, and agree to abide by the terms and conditions put forth by East Coast Wound Care, P.C.");
		txt_Assignment.setWrapStyleWord(true);
		txt_Assignment.setLineWrap(true);
		txt_Assignment.setBackground(Color.WHITE);
		txt_Assignment.setBounds(14, 957, 709, 100);
		add(txt_Assignment);

		treatmentConsentLabel_2 = new JLabel();
		treatmentConsentLabel_2
				.setFont(new Font("Arial Black", Font.PLAIN, 16));
		treatmentConsentLabel_2
				.setText("ASSIGNMENT OF INSURANCE BENEFITS / RELEASES OF INFORMATION: ");
		treatmentConsentLabel_2.setBounds(14, 931, 681, 23);
		add(treatmentConsentLabel_2);

		txtResident = new JTextField();
		txtResident.setBounds(14, 1099, 373, 20);
		add(txtResident);

		txtUnitRoom = new JTextField();
		txtUnitRoom.setBounds(464, 1099, 274, 20);
		add(txtUnitRoom);

		performanceOfTheLabel_13 = new JLabel();
		performanceOfTheLabel_13.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_13.setText("RESIDENT");
		performanceOfTheLabel_13.setBounds(14, 1120, 82, 18);
		add(performanceOfTheLabel_13);

		performanceOfTheLabel_14 = new JLabel();
		performanceOfTheLabel_14.setFont(new Font("Dialog", Font.BOLD, 14));
		performanceOfTheLabel_14.setText("UNIT / ROOM");
		performanceOfTheLabel_14.setBounds(464, 1120, 127, 18);
		add(performanceOfTheLabel_14);

		wwweastcoastwoundcarecomLabel = new JLabel();
		wwweastcoastwoundcarecomLabel.setFont(new Font("", Font.PLAIN, 14));
		wwweastcoastwoundcarecomLabel.setText("www.eastcoastwoundcare.com");
		wwweastcoastwoundcarecomLabel.setBounds(233, 1164, 191, 16);
		add(wwweastcoastwoundcarecomLabel);

		fillcombo();

	}

	private void fillcombo() {
		UserLogon ul = new UserLogon();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbPatientSignA.addItem(user.getUserName());
		cmbStaffSignC.addItem(user.getUserName());
		cmbWitnessSignA.addItem(user.getUserName());
		cmbWitnessSignB.addItem(user.getUserName());
		cmbWitnessSignC.addItem(user.getUserName());
	}

	public void doSave() {

		PtOtStTreatment refPtOtStTreatment = new PtOtStTreatment();
		refPtOtStTreatment.setResidentId(Global.currentResidenceKey);

		refPtOtStTreatment.setHealthCareB(txtHealthCareB.getText());
		refPtOtStTreatment.setProcedure(txtProcedure.getText());
		refPtOtStTreatment.setUnitRoom(txtUnitRoom.getText());
		refPtOtStTreatment.setResident(txtResident.getText());
		refPtOtStTreatment.setWitnessTimeC(txtWitnessTimeC.getText());
		refPtOtStTreatment.setWitnessDateC(dcWitnessDateC.getDate());
		refPtOtStTreatment.setWitnessSignC((String) cmbWitnessSignC
				.getSelectedItem());
		refPtOtStTreatment.setStaffTimeC(txtStaffTimeC.getText());
		refPtOtStTreatment.setStaffdateC(dcStaffdateC.getDate());
		refPtOtStTreatment.setStaffSignC((String) cmbStaffSignC
				.getSelectedItem());
		refPtOtStTreatment.setRelationC(txtRelationC.getText());
		refPtOtStTreatment.setVerbalC(txtVerbalC.getText());
		refPtOtStTreatment.setNameC(txtNameC.getText());
		refPtOtStTreatment.setVerbalTimeC(txtVerbalTimeC.getText());
		refPtOtStTreatment.setVerbalDateC(dcVerbalDateC.getDate());
		refPtOtStTreatment.setWitnessSignB((String) cmbWitnessSignB
				.getSelectedItem());
		refPtOtStTreatment.setRelationToPatientB(txtRelationToPatientB
				.getText());
		refPtOtStTreatment.setWitnessTimeB(txtWitnessTimeB.getText());
		refPtOtStTreatment.setWitnessDateB(dcWitnessDateB.getDate());
		refPtOtStTreatment.setTimeB(txtTimeB.getText());
		refPtOtStTreatment.setHealthDateB(dcHealthDateB.getDate());
		refPtOtStTreatment.setWitnessTimeA(txtWitnessTimeA.getText());
		refPtOtStTreatment.setWitnessDateA(dcWitnessDateA.getDate());
		refPtOtStTreatment.setWitnessSignA((String) cmbWitnessSignA
				.getSelectedItem());
		refPtOtStTreatment.setPatientTimeA(txtPatientTimeA.getText());
		refPtOtStTreatment.setPatientDateA(dcPatientDateA.getDate());
		refPtOtStTreatment.setPatientSignA((String) cmbPatientSignA
				.getSelectedItem());
		refPtOtStTreatment.setDoctor(txtDoctor.getText());
		refPtOtStTreatment.setPatientName(txtPatientName.getText());

		try {
			Global.currentPtOtStTreatmentKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStTreatment(
							refPtOtStTreatment);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		PtOtStTreatment refPtOtStTreatment = null;

		if (Global.currentPtOtStTreatmentKey != 0) {
			try {
				refPtOtStTreatment = MedrexClientManager.getInstance()
						.getPtOtStTreatment(Global.currentPtOtStTreatmentKey);
			} catch (Exception e) {

			}
			txtHealthCareB.setText(refPtOtStTreatment.getHealthCareB());
			txtProcedure.setText(refPtOtStTreatment.getProcedure());
			txtUnitRoom.setText(refPtOtStTreatment.getUnitRoom());
			txtResident.setText(refPtOtStTreatment.getResident());
			txtWitnessTimeC.setText(refPtOtStTreatment.getWitnessTimeC());
			dcWitnessDateC.setDate(refPtOtStTreatment.getWitnessDateC());
			cmbWitnessSignC.setSelectedItem(refPtOtStTreatment
					.getWitnessSignC());
			txtStaffTimeC.setText(refPtOtStTreatment.getStaffTimeC());
			dcStaffdateC.setDate(refPtOtStTreatment.getStaffdateC());
			cmbStaffSignC.setSelectedItem(refPtOtStTreatment.getStaffSignC());
			txtRelationC.setText(refPtOtStTreatment.getRelationC());
			txtVerbalC.setText(refPtOtStTreatment.getVerbalC());
			txtNameC.setText(refPtOtStTreatment.getNameC());
			txtVerbalTimeC.setText(refPtOtStTreatment.getVerbalTimeC());
			dcVerbalDateC.setDate(refPtOtStTreatment.getVerbalDateC());
			cmbWitnessSignB.setSelectedItem(refPtOtStTreatment
					.getWitnessSignB());
			txtRelationToPatientB.setText(refPtOtStTreatment
					.getRelationToPatientB());
			txtWitnessTimeB.setText(refPtOtStTreatment.getWitnessTimeB());
			dcWitnessDateB.setDate(refPtOtStTreatment.getWitnessDateB());
			txtTimeB.setText(refPtOtStTreatment.getTimeB());
			dcHealthDateB.setDate(refPtOtStTreatment.getHealthDateB());
			txtWitnessTimeA.setText(refPtOtStTreatment.getWitnessTimeA());
			dcWitnessDateA.setDate(refPtOtStTreatment.getWitnessDateA());
			cmbWitnessSignA.setSelectedItem(refPtOtStTreatment
					.getWitnessSignA());
			txtPatientTimeA.setText(refPtOtStTreatment.getPatientTimeA());
			dcPatientDateA.setDate(refPtOtStTreatment.getPatientDateA());
			cmbPatientSignA.setSelectedItem(refPtOtStTreatment
					.getPatientSignA());
			txtDoctor.setText(refPtOtStTreatment.getDoctor());
			txtPatientName.setText(refPtOtStTreatment.getPatientName());
		}
	}
}
