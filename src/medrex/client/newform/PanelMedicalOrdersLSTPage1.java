package medrex.client.newform;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import medrex.commons.intf.Form;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMedicalOrdersLSTPage1 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6968296026509192921L;
	private JxCheckBox cbDocumentation;
	private JxCheckBox cbOrganDonation;
	private JxCheckBox cbLivingWill;
	private JxCheckBox cbHealthCareProxy;
	private JxLabel lblCheckAdvanceDirectives;
	private JxLabel lblAdvanceDirectives;
	private JxLabel lblSectionD;
	private JxLabel lblPhysicianPhonePagerNumber;
	private JxLabel lblPhyPhPagerNo;
	private JxLabel lblPhysicianLicenseNumber;
	private JxLabel lblPhyLicenseNo;
	private JxLabel lblDateTime2;
	private JxLabel lblDate_Time2;
	private JxLabel lblPrintPhysicianName;
	private JxLabel lblPrintPhyName;
	private JxLabel lblPhySignature;
	private JxLabel lblPhySign;
	private JxLabel lblPhysicianSignature;
	private JxLabel lblSectionC;
	private JxCheckBox cbSurrogate;
	private JxCheckBox cbMinorsParentGuardian;
	private JxCheckBox cbPublicHealthLawSurrogate;
	private JxCheckBox cbHealthCareAgent;
	private JxCheckBox cbPatient;
	private JxLabel lblWhoMadeTheDecision;
	private JxLabel lblSecondWitnessName;
	private JxLabel lblSecondWitness;
	private JxLabel lblFirstWitnessName;
	private JxLabel lblFirstWitness;
	private JxLabel lblNameOfDecisionMaker;
	private JxLabel lblDecisionMaker;
	private JxLabel lblDate_Time;
	private JxLabel lblDateTime;
	private JxCheckBox cbSignature;
	private JxLabel lblSignature;
	private JxText txtSignature;
	private JxLabel lblConcentResuscitationInstructions;
	private JxLabel lblSectionB;
	private JxLabel lblDNRLST;
	private JxLabel lblDNR;
	private JxLabel lblCPR;
	private JxCheckBox cbDNROrder;
	private JxLabel lblCheckOne;
	private JxLabel lblResuscitationInstructions;
	private JxLabel lblSectionA;
	private JxCheckBox cbCPROrder;
	Theme theme = new BlackOverWhiteTheme();

	private JxLabel lbleMolstNo;
	private JxLabel lblEMolstNumber;
	private JxLabel label3;
	private JxLabel label2;
	private JxRadioButton rbFemale;
	private JxRadioButton rbMale;
	private JxLabel label1;
	private JxLabel lblDateOfBirth;
	private JxLabel lblDOB;
	private JxLabel lblZip;
	private JxLabel lblState;
	private JxLabel lblCity;
	private JxLabel lblZp;
	private JxLabel lblSta;
	private JxLabel lblCty;
	private JxLabel lblAddress;
	private JxLabel lblAddr;
	private JxLabel lblInitialPatient;
	private JxLabel lblMName;
	private JxLabel lblFName;
	private JxLabel lblLName;

	private JxLabel lblInitialOfPatient;
	private JxLabel lblMiddleName;
	private JxLabel lblFirstName;
	private JxLabel lblLastName;
	private JxLabel lblPhysicianCopy;

	private JxLabel lblMedicalOrdersForLifeSustainingTreatement;
	private JxLabel lblNewYorkStateDepartmentOfHealth;

	private ButtonGroup gender = new ButtonGroup();

	public PanelMedicalOrdersLSTPage1() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(930, 1200));

		final JxPanel panel = new JxPanel();
		// panel.setTheme(null);
		panel.setLayout(null);
		panel.setBounds(10, 1189, 910, -1182);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		// panel_1.setTheme(null);
		panel_1.setLayout(null);
		panel_1.setBounds(20, 20, 889, 39);
		add(panel_1);

		lblNewYorkStateDepartmentOfHealth = new JxLabel();
		lblNewYorkStateDepartmentOfHealth.setTheme(theme);
		lblNewYorkStateDepartmentOfHealth.setFontSize(14);
		lblNewYorkStateDepartmentOfHealth.setFontStyle(Font.PLAIN);
		lblNewYorkStateDepartmentOfHealth
				.setText("NEW YORK STATE DEPATMENT OF HEALTH");
		lblNewYorkStateDepartmentOfHealth.setBounds(0, 10, 311, 20);
		panel_1.add(lblNewYorkStateDepartmentOfHealth);

		lblMedicalOrdersForLifeSustainingTreatement = new JxLabel();
		lblMedicalOrdersForLifeSustainingTreatement.setTheme(theme);
		lblMedicalOrdersForLifeSustainingTreatement.setFontSize(18);
		lblMedicalOrdersForLifeSustainingTreatement.setFontStyle(Font.BOLD);
		lblMedicalOrdersForLifeSustainingTreatement
				.setText("Medical Orders for Life-Sustaining Treatement(MOLST)");
		lblMedicalOrdersForLifeSustainingTreatement.setBounds(383, 10, 506, 20);
		panel_1.add(lblMedicalOrdersForLifeSustainingTreatement);

		final JxPanel panel_2 = new JxPanel();
		// panel_2.setTheme(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBounds(20, 60, 889, 10);
		add(panel_2);

		final JxPanel panel_2_1 = new JxPanel();
		// panel_2_1.setTheme(null);
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(20, 80, 889, 30);
		add(panel_2_1);

		lblPhysicianCopy = new JxLabel();
		lblPhysicianCopy.setTheme(theme);
		lblPhysicianCopy.setFontSize(14);
		lblPhysicianCopy.setFontStyle(Font.PLAIN);
		lblPhysicianCopy.setForeground(new Color(255, 255, 255));
		lblPhysicianCopy.setBackground(Color.BLACK);
		lblPhysicianCopy
				.setText("THE PATIENT KEEPS THE ORIGINAL MOLST FORM DURING TRAVEL TO DIFFERENT CARE SETTINGS. THE PHYSICIAN KEEPS A COPY.");
		lblPhysicianCopy.setBounds(0, 10, 889, 14);
		panel_2_1.add(lblPhysicianCopy);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBounds(20, 116, 889, 203);
		add(panel_3);

		lblFName = new JxLabel();
		lblFName.setTheme(theme);
		lblFName.setText("");
		lblFName.setBounds(140, 2, 100, 14);
		panel_3.add(lblFName);

		lblMName = new JxLabel();
		lblMName.setTheme(theme);
		lblMName.setText("");
		lblMName.setBounds(270, 0, 100, 14);
		panel_3.add(lblMName);

		lblInitialPatient = new JxLabel();
		lblInitialPatient.setTheme(theme);
		lblInitialPatient.setText("");
		lblInitialPatient.setBounds(400, 0, 100, 14);
		panel_3.add(lblInitialPatient);

		lblSta = new JxLabel();
		lblSta.setTheme(theme);
		lblSta.setText("");
		lblSta.setBounds(140, 111, 100, 14);
		panel_3.add(lblSta);

		lblZp = new JxLabel();
		lblZp.setTheme(theme);
		lblZp.setText("");
		lblZp.setBounds(270, 111, 100, 14);
		panel_3.add(lblZp);

		lblDateOfBirth = new JxLabel();
		lblDateOfBirth.setTheme(theme);
		lblDateOfBirth.setText("Date Of Birth");
		lblDateOfBirth.setBounds(10, 180, 100, 14);
		panel_3.add(lblDateOfBirth);

		lblEMolstNumber = new JxLabel();
		lblEMolstNumber.setTheme(theme);
		lblEMolstNumber.setText("eMOLST NUMBER (THIS IS NOT AN eMOLST FORM)");
		lblEMolstNumber.setBounds(400, 180, 254, 14);
		panel_3.add(lblEMolstNumber);

		lbleMolstNo = new JxLabel();
		lbleMolstNo.setTheme(theme);
		lbleMolstNo.setText("");
		lbleMolstNo.setBounds(400, 160, 86, 14);
		panel_3.add(lbleMolstNo);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setLayout(null);
		jxPanel_2.setBackground(UIManager.getColor("Button.background"));
		jxPanel_2.setBounds(0, 0, 600, 14);
		panel_3.add(jxPanel_2);

		lblLName = new JxLabel();
		lblLName.setBounds(10, 0, 100, 14);
		jxPanel_2.add(lblLName);
		lblLName.setTheme(theme);
		lblLName.setText("");

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setLayout(null);
		jxPanel_3.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3.setBounds(0, 20, 600, 14);
		panel_3.add(jxPanel_3);

		lblLastName = new JxLabel();
		lblLastName.setBounds(10, 0, 55, 14);
		jxPanel_3.add(lblLastName);
		lblLastName.setTheme(theme);
		lblLastName.setText("LAST NAME");

		lblFirstName = new JxLabel();
		lblFirstName.setBounds(140, 0, 100, 14);
		jxPanel_3.add(lblFirstName);
		lblFirstName.setTheme(theme);
		lblFirstName.setText("FIRST NAME");

		lblMiddleName = new JxLabel();
		lblMiddleName.setBounds(270, 0, 100, 14);
		jxPanel_3.add(lblMiddleName);
		lblMiddleName.setTheme(theme);
		lblMiddleName.setText("MIDDLE NAME");

		lblInitialOfPatient = new JxLabel();
		lblInitialOfPatient.setBounds(400, 0, 100, 14);
		jxPanel_3.add(lblInitialOfPatient);
		lblInitialOfPatient.setTheme(theme);
		lblInitialOfPatient.setText("INITIAL OF PATIENT");

		final JxPanel jxPanel_3_1 = new JxPanel();
		jxPanel_3_1.setLayout(null);
		jxPanel_3_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1.setBounds(0, 60, 600, 14);
		panel_3.add(jxPanel_3_1);

		lblAddr = new JxLabel();
		lblAddr.setBounds(10, 0, 100, 14);
		jxPanel_3_1.add(lblAddr);
		lblAddr.setTheme(theme);
		lblAddr.setText("");

		final JxPanel jxPanel_3_1_1 = new JxPanel();
		jxPanel_3_1_1.setLayout(null);
		jxPanel_3_1_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1_1.setBounds(0, 80, 600, 14);
		panel_3.add(jxPanel_3_1_1);

		lblAddress = new JxLabel();
		lblAddress.setBounds(10, 0, 100, 14);
		jxPanel_3_1_1.add(lblAddress);
		lblAddress.setTheme(theme);
		lblAddress.setText("ADDRESS");

		final JxPanel jxPanel_3_1_2 = new JxPanel();
		jxPanel_3_1_2.setLayout(null);
		jxPanel_3_1_2.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1_2.setBounds(0, 111, 600, 14);
		panel_3.add(jxPanel_3_1_2);

		lblCty = new JxLabel();
		lblCty.setBounds(10, 0, 100, 14);
		jxPanel_3_1_2.add(lblCty);
		lblCty.setTheme(theme);
		lblCty.setText("");

		final JxPanel jxPanel_3_1_3 = new JxPanel();
		jxPanel_3_1_3.setLayout(null);
		jxPanel_3_1_3.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1_3.setBounds(0, 131, 600, 14);
		panel_3.add(jxPanel_3_1_3);

		lblCity = new JxLabel();
		lblCity.setBounds(10, 0, 100, 14);
		jxPanel_3_1_3.add(lblCity);
		lblCity.setTheme(theme);
		lblCity.setText("CITY");

		lblState = new JxLabel();
		lblState.setBounds(140, 0, 100, 14);
		jxPanel_3_1_3.add(lblState);
		lblState.setTheme(theme);
		lblState.setText("STATE");

		lblZip = new JxLabel();
		lblZip.setBounds(270, 0, 100, 14);
		jxPanel_3_1_3.add(lblZip);
		lblZip.setTheme(theme);
		lblZip.setText("ZIP");

		final JxPanel jxPanel_3_1_4 = new JxPanel();
		jxPanel_3_1_4.setLayout(null);
		jxPanel_3_1_4.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1_4.setBounds(0, 180, 800, 14);
		panel_3.add(jxPanel_3_1_4);

		rbMale = new JxRadioButton();
		rbMale.setBounds(140, 0, 75, 14);
		jxPanel_3_1_4.add(rbMale);
		rbMale.setTheme(theme);
		gender.add(rbMale);
		rbMale.setText("Male");

		rbFemale = new JxRadioButton();
		rbFemale.setBounds(270, 0, 75, 14);
		jxPanel_3_1_4.add(rbFemale);
		rbFemale.setTheme(theme);
		gender.add(rbFemale);
		rbFemale.setText("Female");

		final JxPanel jxPanel_3_1_5 = new JxPanel();
		jxPanel_3_1_5.setLayout(null);
		jxPanel_3_1_5.setBackground(UIManager.getColor("Button.background"));
		jxPanel_3_1_5.setBounds(0, 160, 600, 14);
		panel_3.add(jxPanel_3_1_5);

		lblDOB = new JxLabel();
		lblDOB.setBounds(10, 0, 100, 14);
		jxPanel_3_1_5.add(lblDOB);
		lblDOB.setTheme(theme);
		lblDOB.setText("");

		final JxPanel panel_2_2 = new JxPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.BLACK);
		panel_2_2.setBounds(20, 320, 889, 10);
		add(panel_2_2);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setLayout(null);
		jxPanel.setTheme(theme);
		jxPanel.setBackground(UIManager.getColor("Button.background"));
		jxPanel.setBounds(20, 330, 889, 209);
		add(jxPanel);

		lblDNRLST = new JxLabel();
		lblDNRLST.setTheme(theme);
		lblDNRLST.setFontSize(12);
		lblDNRLST.setFontStyle(Font.BOLD);
		lblDNRLST
				.setText("Do-Not-Resuscitate (DNR) and Other Life-Sustaining Treatement (LST)");
		lblDNRLST.setBounds(10, 10, 441, 14);
		jxPanel.add(lblDNRLST);

		label1 = new JxLabel();
		label1.setTheme(theme);
		label1.setBounds(10, 30, 869, 60);
		jxPanel.add(label1);
		label1
				.setText("<html><p align=\"justify\"> This is a medical order form that tells others the patient's wishes for life sustaining treatement."
						+ "A health care professional must complete or change the MOLST form, based on the patient's current medical condition, values, wishes and MOLST Instructions."
						+ " If the patient is unable to make medical decisions, the orders should reflect patient wishes as best understood by the health care agent or surrogate."
						+ "A physician must sign the MOLST form."
						+ "All health care professionals must follow these medical orders as patient moves from one location to another, unless a physican examines a patient, reviews the orders and changes them. </p>");

		label2 = new JxLabel();
		label2.setTheme(theme);
		label2.setBounds(10, 96, 869, 84);
		jxPanel.add(label2);
		label2
				.setText("<html><p align=\"justify\"> MOLST is generally for patients with serious health conditions."
						+ "The patient or other decision-maker should work with the physician and consider asking the physician to fill out a MOLST form if the patient: </p>"
						+ "<p><t> - Wants to avoid or receive any or all life-sustaining treatement. </p></t>"
						+ "<p> - Resides in a long-term care facility or requires long-term care services. </p>"
						+ "<p> - Might die within the next year. </p>");

		label3 = new JxLabel();
		label3.setTheme(theme);
		label3.setBounds(10, 186, 869, 18);
		jxPanel.add(label3);
		label3
				.setText("<html><p align=\"justify\"> If the patient has a developmental disability and does not have ability to decide, the doctor must follow special procedures and attach the appropriate legal requirement checklist. </p>");

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_1.setBounds(20, 539, 889, 644);
		add(jxPanel_1);

		final JxPanel jxPanel_4 = new JxPanel();
		// jxPanel_4.setTheme(null);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBackground(Color.BLACK);
		jxPanel_4.setBounds(0, 0, 100, 30);
		jxPanel_1.add(jxPanel_4);

		lblSectionA = new JxLabel();
		lblSectionA.setTheme(theme);
		lblSectionA.setFontSize(14);
		lblSectionA.setFontStyle(Font.PLAIN);
		lblSectionA.setForeground(new Color(255, 255, 255));
		lblSectionA.setBackground(Color.BLACK);
		lblSectionA.setText("SECTION A");
		lblSectionA.setBounds(0, 10, 86, 14);
		jxPanel_4.add(lblSectionA);

		final JxPanel jxPanel_5 = new JxPanel();
		// jxPanel_5.setTheme(null);
		jxPanel_5.setBackground(UIManager.getColor("Button.shadow"));
		jxPanel_5.setBounds(101, 0, 788, 30);
		jxPanel_1.add(jxPanel_5);

		lblResuscitationInstructions = new JxLabel();
		lblResuscitationInstructions.setTheme(theme);
		lblResuscitationInstructions.setFontSize(14);
		lblResuscitationInstructions.setFontStyle(Font.BOLD);
		lblResuscitationInstructions
				.setText("Resuscitation Instructions When The Patient Has No Pulse and/or Is Not Breathing");
		jxPanel_5.add(lblResuscitationInstructions);

		lblCheckOne = new JxLabel();
		lblCheckOne.setTheme(theme);
		lblCheckOne.setText("<html> Check <u>One</u>: </html>");
		lblCheckOne.setBounds(0, 36, 60, 14);
		jxPanel_1.add(lblCheckOne);

		final JxPanel jxPanel_6 = new JxPanel();
		jxPanel_6.setTheme(theme);
		jxPanel_6.setLayout(null);
		jxPanel_6.setBackground(UIManager.getColor("Button.background"));
		jxPanel_6.setBounds(0, 50, 889, 126);
		jxPanel_1.add(jxPanel_6);

		cbCPROrder = new JxCheckBox();
		cbCPROrder.setBounds(0, 0, 320, 14);
		jxPanel_6.add(cbCPROrder);
		cbCPROrder.setTheme(theme);
		cbCPROrder.setFontSize(11);
		cbCPROrder.setFontStyle(Font.BOLD);
		cbCPROrder.setText("CPR Order: Attempt Cardio-Pulmonary Resuscitation");

		lblCPR = new JxLabel();
		lblCPR.setBounds(15, 20, 861, 45);
		jxPanel_6.add(lblCPR);
		lblCPR.setTheme(theme);
		lblCPR.setVerticalAlignment(SwingConstants.TOP);
		lblCPR.setTheme(theme);
		lblCPR
				.setText("<html><p align=\"justify\"> CPR involves artificial breathing and fourceful pressure on the chest to try to restart the heart."
						+ "It usually involves electric shock (defibrillation) and a plastic tube down the throat into yhe windpipe to assist breathing (intubation)."
						+ "It means that all medical treatements will be done to prolong life when the heart stops or breathing stops, including being placed on a breathing machine and being transferred to the hospital.</p>");

		cbDNROrder = new JxCheckBox();
		cbDNROrder.setBounds(0, 80, 383, 14);
		jxPanel_6.add(cbDNROrder);
		cbDNROrder.setTheme(theme);
		cbDNROrder.setFontSize(11);
		cbDNROrder.setFontStyle(Font.BOLD);
		cbDNROrder
				.setText("DNR Order: Do Not Attempt Resuscitation (Allow Natural Death)");

		lblDNR = new JxLabel();
		lblDNR.setBounds(15, 100, 861, 14);
		jxPanel_6.add(lblDNR);
		lblDNR.setTheme(theme);
		lblDNR.setVerticalAlignment(SwingConstants.TOP);
		lblDNR
				.setText("<html><p align=\"justify\"> This means do not begin CPR, as defined above, to make hte heart or breathing start again if either stops. </p>");

		final JxPanel jxPanel_4_1 = new JxPanel();
		jxPanel_4_1.setLayout(null);
		jxPanel_4_1.setBackground(Color.BLACK);
		jxPanel_4_1.setBounds(0, 175, 100, 30);
		jxPanel_1.add(jxPanel_4_1);

		lblSectionB = new JxLabel();
		lblSectionB.setTheme(theme);
		lblSectionB.setFontSize(14);
		lblSectionB.setFontStyle(Font.PLAIN);
		lblSectionB.setForeground(new Color(255, 255, 255));
		lblSectionB.setBackground(Color.BLACK);
		lblSectionB.setText("SECTION B");
		lblSectionB.setBounds(0, 10, 75, 14);
		jxPanel_4_1.add(lblSectionB);

		final JxPanel jxPanel_5_1 = new JxPanel();
		jxPanel_5_1.setLayout(null);
		// jxPanel_5_1.setTheme(null);
		jxPanel_5_1.setBackground(UIManager.getColor("Button.shadow"));
		jxPanel_5_1.setBackground(Color.BLACK);
		jxPanel_5_1.setBounds(101, 175, 788, 30);
		jxPanel_1.add(jxPanel_5_1);

		lblConcentResuscitationInstructions = new JxLabel();
		lblConcentResuscitationInstructions.setTheme(theme);
		lblConcentResuscitationInstructions.setFontSize(14);
		lblConcentResuscitationInstructions.setFontStyle(Font.BOLD);
		lblConcentResuscitationInstructions
				.setText("Consent for Resuscitation Instructions (Section A)");
		lblConcentResuscitationInstructions.setBounds(105, 10, 357, 14);
		jxPanel_5_1.add(lblConcentResuscitationInstructions);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setLayout(null);
		jxPanel_7.setTheme(theme);
		jxPanel_6.setBackground(UIManager.getColor("Button.background"));
		jxPanel_7.setBounds(0, 205, 889, 191);
		jxPanel_1.add(jxPanel_7);

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setVerticalAlignment(SwingConstants.TOP);
		jxLabel.setTheme(theme);
		jxLabel
				.setText("<html><p align=\"justify\"> The patient can make a decision about resuscitation if he or she has the ability to decide about resuscitation."
						+ "If the patient does not have the ability to decide about resuscitation and has a health care proxy, the health care agent makes this decision."
						+ "If there is no health care proxy, another person will decide, choosen from a list based on NYS law. </p>");
		jxLabel.setBounds(0, 0, 889, 30);
		jxPanel_7.add(jxLabel);

		final JxPanel jxPanel_8 = new JxPanel();
		jxPanel_8.setTheme(theme);
		jxPanel_8.setLayout(null);
		jxPanel_8.setTheme(theme);
		jxPanel_8.setBackground(UIManager.getColor("Button.background"));
		jxPanel_8.setBounds(0, 40, 889, 40);
		jxPanel_7.add(jxPanel_8);

		txtSignature = new JxText();
		txtSignature.setTheme(theme);
		txtSignature.setBounds(0, 0, 100, 14);
		jxPanel_8.add(txtSignature);

		lblSignature = new JxLabel();
		lblSignature.setTheme(theme);
		lblSignature.setText("SIGNATURE");
		lblSignature.setBounds(0, 25, 100, 14);
		jxPanel_8.add(lblSignature);

		cbSignature = new JxCheckBox();
		cbSignature.setTheme(theme);
		cbSignature.setText("Check if verval concent");
		cbSignature.setBounds(218, 10, 137, 18);
		jxPanel_8.add(cbSignature);

		lblDateTime = new JxLabel();
		lblDateTime.setTheme(theme);
		lblDateTime.setText("DATE/TIME");
		lblDateTime.setBounds(475, 26, 100, 14);
		jxPanel_8.add(lblDateTime);

		lblDate_Time = new JxLabel();
		lblDate_Time.setTheme(theme);
		lblDate_Time.setVerticalAlignment(SwingConstants.TOP);
		lblDate_Time.setText("");
		lblDate_Time.setBounds(475, 1, 100, 14);
		jxPanel_8.add(lblDate_Time);

		final JxPanel jxPanel_9 = new JxPanel();
		jxPanel_9.setTheme(theme);
		jxPanel_9.setLayout(null);
		jxPanel_9.setTheme(theme);
		jxPanel_9.setBackground(UIManager.getColor("Button.background"));
		jxPanel_9.setBounds(0, 80, 889, 40);
		jxPanel_7.add(jxPanel_9);

		lblDecisionMaker = new JxLabel();
		lblDecisionMaker.setTheme(theme);
		lblDecisionMaker.setVerticalAlignment(SwingConstants.TOP);
		lblDecisionMaker.setText("");
		lblDecisionMaker.setBounds(0, 0, 200, 14);
		jxPanel_9.add(lblDecisionMaker);

		lblNameOfDecisionMaker = new JxLabel();
		lblNameOfDecisionMaker.setTheme(theme);
		lblNameOfDecisionMaker.setText("PRINT NAME OF DECISION-MAKER");
		lblNameOfDecisionMaker.setBounds(0, 25, 200, 14);
		jxPanel_9.add(lblNameOfDecisionMaker);

		final JxPanel jxPanel_9_1 = new JxPanel();
		jxPanel_9_1.setTheme(theme);
		jxPanel_9_1.setLayout(null);
		jxPanel_9_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_9_1.setBounds(0, 120, 889, 40);
		jxPanel_7.add(jxPanel_9_1);

		lblFirstWitness = new JxLabel();
		lblFirstWitness.setTheme(theme);
		lblFirstWitness.setText("");
		lblFirstWitness.setBounds(0, 0, 200, 14);
		jxPanel_9_1.add(lblFirstWitness);

		lblFirstWitnessName = new JxLabel();
		lblFirstWitnessName.setTheme(theme);
		lblFirstWitnessName.setText("PRINT FIRST WITNESS NAME");
		lblFirstWitnessName.setBounds(0, 25, 200, 14);
		jxPanel_9_1.add(lblFirstWitnessName);

		lblSecondWitness = new JxLabel();
		lblSecondWitness.setTheme(theme);
		lblSecondWitness.setText("");
		lblSecondWitness.setBounds(381, 1, 200, 14);
		jxPanel_9_1.add(lblSecondWitness);

		lblSecondWitnessName = new JxLabel();
		lblSecondWitnessName.setTheme(theme);
		lblSecondWitnessName.setText("PRINT SECOND WITNESS NAME");
		lblSecondWitnessName.setBounds(381, 26, 200, 14);
		jxPanel_9_1.add(lblSecondWitnessName);

		final JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setLayout(null);
		jxPanel_10.setBackground(UIManager.getColor("Button.background"));
		jxPanel_10.setBounds(0, 160, 889, 24);
		jxPanel_7.add(jxPanel_10);

		lblWhoMadeTheDecision = new JxLabel();
		lblWhoMadeTheDecision.setTheme(theme);
		lblWhoMadeTheDecision.setFontStyle(Font.BOLD);
		lblWhoMadeTheDecision.setText("Who made the decision?");
		lblWhoMadeTheDecision.setBounds(0, 10, 150, 14);
		jxPanel_10.add(lblWhoMadeTheDecision);

		cbPatient = new JxCheckBox();
		cbPatient.setTheme(theme);
		cbPatient.setBounds(166, 10, 60, 14);
		jxPanel_10.add(cbPatient);
		cbPatient.setText("Patient");

		cbHealthCareAgent = new JxCheckBox();
		cbHealthCareAgent.setTheme(theme);
		cbHealthCareAgent.setText("Health Care Agent");
		cbHealthCareAgent.setBounds(230, 10, 118, 14);
		jxPanel_10.add(cbHealthCareAgent);

		cbPublicHealthLawSurrogate = new JxCheckBox();
		cbPublicHealthLawSurrogate.setTheme(theme);
		cbPublicHealthLawSurrogate.setText("Public Health Law Surrogate");
		cbPublicHealthLawSurrogate.setBounds(354, 10, 160, 14);
		jxPanel_10.add(cbPublicHealthLawSurrogate);

		cbMinorsParentGuardian = new JxCheckBox();
		cbMinorsParentGuardian.setTheme(theme);
		cbMinorsParentGuardian.setText("Minor's Parent/Guardian");
		cbMinorsParentGuardian.setBounds(520, 10, 140, 14);
		jxPanel_10.add(cbMinorsParentGuardian);

		cbSurrogate = new JxCheckBox();
		cbSurrogate.setTheme(theme);
		cbSurrogate.setText("1750-b Surrogate");
		cbSurrogate.setBounds(666, 10, 110, 14);
		jxPanel_10.add(cbSurrogate);

		final JxPanel jxPanel_11 = new JxPanel();
		// jxPanel_11.setTheme(null);
		jxPanel_11.setBackground(Color.BLACK);
		jxPanel_11.setBounds(0, 396, 100, 30);
		jxPanel_1.add(jxPanel_11);

		lblSectionC = new JxLabel();
		lblSectionC.setTheme(theme);
		lblSectionC.setFontSize(14);
		lblSectionC.setFontStyle(Font.PLAIN);
		lblSectionC.setForeground(new Color(255, 255, 255));
		lblSectionC.setBackground(Color.BLACK);
		lblSectionC.setText("SECTION C");
		jxPanel_11.add(lblSectionC);

		final JxPanel jxPanel_5_1_1 = new JxPanel();
		jxPanel_5_1_1.setTheme(theme);
		jxPanel_5_1_1.setLayout(null);
		jxPanel_5_1_1.setBackground(UIManager.getColor("Button.shadow"));
		jxPanel_5_1_1.setBounds(101, 396, 788, 30);
		jxPanel_1.add(jxPanel_5_1_1);

		lblPhysicianSignature = new JxLabel();
		lblPhysicianSignature.setTheme(theme);
		lblPhysicianSignature.setFontSize(14);
		lblPhysicianSignature.setFontStyle(Font.BOLD);
		lblPhysicianSignature
				.setText("Physician Signature for Sections A and B");
		lblPhysicianSignature.setBounds(105, 10, 402, 14);
		jxPanel_5_1_1.add(lblPhysicianSignature);

		final JxPanel jxPanel_9_1_1 = new JxPanel();
		jxPanel_9_1_1.setTheme(theme);
		jxPanel_9_1_1.setLayout(null);
		jxPanel_9_1_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_9_1_1.setBounds(0, 425, 889, 40);
		jxPanel_1.add(jxPanel_9_1_1);

		lblPhySign = new JxLabel();
		lblPhySign.setTheme(theme);
		lblPhySign.setText("");
		lblPhySign.setBounds(0, 0, 200, 14);
		jxPanel_9_1_1.add(lblPhySign);

		lblPhySignature = new JxLabel();
		lblPhySignature.setTheme(theme);
		lblPhySignature.setText("PHYSICIAN SIGNATURE");
		lblPhySignature.setBounds(0, 25, 200, 14);
		jxPanel_9_1_1.add(lblPhySignature);

		lblPrintPhyName = new JxLabel();
		lblPrintPhyName.setTheme(theme);
		lblPrintPhyName.setText("");
		lblPrintPhyName.setBounds(250, 0, 200, 14);
		jxPanel_9_1_1.add(lblPrintPhyName);

		lblPrintPhysicianName = new JxLabel();
		lblPrintPhysicianName.setTheme(theme);
		lblPrintPhysicianName.setText("PRINT PHYSICIAN NAME");
		lblPrintPhysicianName.setBounds(250, 26, 200, 14);
		jxPanel_9_1_1.add(lblPrintPhysicianName);

		lblDate_Time2 = new JxLabel();
		lblDate_Time2.setTheme(theme);
		lblDate_Time2.setText("");
		lblDate_Time2.setBounds(499, 1, 200, 14);
		jxPanel_9_1_1.add(lblDate_Time2);

		lblDateTime2 = new JxLabel();
		lblDateTime2.setTheme(theme);
		lblDateTime2.setText("DATE/TIME");
		lblDateTime2.setBounds(500, 26, 200, 14);
		jxPanel_9_1_1.add(lblDateTime2);

		final JxPanel jxPanel_9_1_1_1 = new JxPanel();
		jxPanel_9_1_1_1.setTheme(theme);
		jxPanel_9_1_1_1.setLayout(null);
		jxPanel_9_1_1_1.setBackground(UIManager.getColor("Button.background"));
		jxPanel_9_1_1_1.setBounds(0, 464, 889, 40);
		jxPanel_1.add(jxPanel_9_1_1_1);

		lblPhyLicenseNo = new JxLabel();
		lblPhyLicenseNo.setTheme(theme);
		lblPhyLicenseNo.setText("");
		lblPhyLicenseNo.setBounds(0, 0, 200, 14);
		jxPanel_9_1_1_1.add(lblPhyLicenseNo);

		lblPhysicianLicenseNumber = new JxLabel();
		lblPhysicianLicenseNumber.setTheme(theme);
		lblPhysicianLicenseNumber.setText("PHYSICIAN LICENSE NUMBER");
		lblPhysicianLicenseNumber.setBounds(0, 25, 200, 14);
		jxPanel_9_1_1_1.add(lblPhysicianLicenseNumber);

		lblPhyPhPagerNo = new JxLabel();
		lblPhyPhPagerNo.setTheme(theme);
		lblPhyPhPagerNo.setText("");
		lblPhyPhPagerNo.setBounds(250, 0, 200, 14);
		jxPanel_9_1_1_1.add(lblPhyPhPagerNo);

		lblPhysicianPhonePagerNumber = new JxLabel();
		lblPhysicianPhonePagerNumber.setTheme(theme);
		lblPhysicianPhonePagerNumber.setText("PHYSICIAN PHONE/PAGER NUMBER");
		lblPhysicianPhonePagerNumber.setBounds(250, 26, 200, 14);
		jxPanel_9_1_1_1.add(lblPhysicianPhonePagerNumber);

		final JxPanel jxPanel_4_1_1 = new JxPanel();
		jxPanel_4_1_1.setTheme(theme);
		jxPanel_4_1_1.setLayout(null);
		jxPanel_4_1_1.setBounds(0, 510, 889, 75);
		jxPanel_1.add(jxPanel_4_1_1);

		final JxPanel jxPanel_4_1_2 = new JxPanel();
		// jxPanel_4_1_2.setTheme(null);
		jxPanel_4_1_2.setLayout(null);
		jxPanel_4_1_2.setBackground(Color.BLACK);
		jxPanel_4_1_2.setBounds(0, 0, 100, 30);
		jxPanel_4_1_1.add(jxPanel_4_1_2);

		lblSectionD = new JxLabel();
		lblSectionD.setTheme(theme);
		lblSectionD.setFontSize(14);
		lblSectionD.setFontStyle(Font.PLAIN);
		lblSectionD.setForeground(new Color(255, 255, 255));
		lblSectionD.setText("SECTION D");
		lblSectionD.setBounds(0, 10, 75, 14);
		jxPanel_4_1_2.add(lblSectionD);

		final JxPanel jxPanel_5_1_2 = new JxPanel();
		jxPanel_5_1_2.setTheme(theme);
		jxPanel_5_1_2.setLayout(null);
		jxPanel_5_1_2.setBackground(UIManager.getColor("Button.shadow"));
		jxPanel_5_1_2.setBounds(101, 0, 788, 30);
		jxPanel_4_1_1.add(jxPanel_5_1_2);

		lblAdvanceDirectives = new JxLabel();
		lblAdvanceDirectives.setTheme(theme);
		lblAdvanceDirectives.setFontStyle(1);
		lblAdvanceDirectives.setFontSize(14);
		lblAdvanceDirectives.setText("Advance Directives");
		lblAdvanceDirectives.setBounds(105, 10, 357, 14);
		jxPanel_5_1_2.add(lblAdvanceDirectives);

		lblCheckAdvanceDirectives = new JxLabel();
		lblCheckAdvanceDirectives.setTheme(theme);
		lblCheckAdvanceDirectives
				.setText("Check all advance directives known to have been completed:");
		lblCheckAdvanceDirectives.setBounds(0, 30, 308, 14);
		jxPanel_4_1_1.add(lblCheckAdvanceDirectives);

		final JxPanel jxPanel_12 = new JxPanel();
		jxPanel_12.setLayout(null);
		jxPanel_12.setBounds(0, 50, 889, 20);
		jxPanel_4_1_1.add(jxPanel_12);

		cbHealthCareProxy = new JxCheckBox();
		cbHealthCareProxy.setTheme(theme);
		cbHealthCareProxy.setText("Health Care Proxy");
		cbHealthCareProxy.setBounds(10, 0, 113, 18);
		jxPanel_12.add(cbHealthCareProxy);

		cbLivingWill = new JxCheckBox();
		cbLivingWill.setTheme(theme);
		cbLivingWill.setText("Living Will");
		cbLivingWill.setBounds(130, 1, 75, 18);
		jxPanel_12.add(cbLivingWill);

		cbOrganDonation = new JxCheckBox();
		cbOrganDonation.setTheme(theme);
		cbOrganDonation.setText("Organ Donation");
		cbOrganDonation.setBounds(215, 1, 100, 18);
		jxPanel_12.add(cbOrganDonation);

		cbDocumentation = new JxCheckBox();
		cbDocumentation.setTheme(theme);
		cbDocumentation.setText("Documentation of Oral Advance Directive");
		cbDocumentation.setBounds(320, 1, 227, 18);
		jxPanel_12.add(cbDocumentation);

	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelMedicalOrdersLSTPage1 panel1 = new PanelMedicalOrdersLSTPage1();
		scroller.setViewportView(panel1);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);

	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
