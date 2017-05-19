package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicianInfusion;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianInfusion extends JPanel {

	private JCheckBox cbVenousOpen;
	private JCheckBox cbCentralOpen;
	private JCheckBox cbMidlineOpen;
	private JComboBox cmbNurseSign;
	private JComboBox cmbPhysicianSign;
	private JCheckBox cbVenousContinuous;
	private JCheckBox cbVenousMaintenance;
	private JCheckBox cbCentralContinuous;
	private JCheckBox cbVenousClosedTip;
	private JCheckBox cbVenousPort;
	private JCheckBox cbCentralIntermittent;

	private JCheckBox cbCentralMaintenance;
	private JCheckBox cbCentralClosedTip;
	private JCheckBox cbCentral;
	private JCheckBox cbMidlineIntermittent;
	private JCheckBox cbMidlineContinuous;
	private JCheckBox cbMidlineMaintenance;
	private JCheckBox cbMidlineClosedTip;
	private JCheckBox cbMidline;
	private JCheckBox cbPeripheralIntermittent;
	private JCheckBox cbPeripheralContinuous;
	private JLabel healthcareLabel;
	private JLabel solutionsLabel;
	private JTextField txtNurseTime;
	private JTextField txtPhysicianTime;
	private JLabel peripheralLabel_26;
	private JDateChooser dcNurseDate;
	private JLabel peripheralLabel_25;
	private JDateChooser dcPhysicianDate;
	private JLabel form400RevLabel;
	private JLabel peripheralLabel_24;
	private JLabel peripheralLabel_23;
	private JLabel noIvMaintenanceLabel_28;
	private JLabel noIvMaintenanceLabel_27;
	private JDateChooser dcVenousDate;
	private JLabel noIvMaintenanceLabel_26;
	private JLabel noIvMaintenanceLabel_25;
	private JLabel noIvMaintenanceLabel_24;
	private JLabel noIvMaintenanceLabel_23;
	private JLabel noIvMaintenanceLabel_22;
	private JLabel noIvMaintenanceLabel_21;
	private JLabel peripheralLabel_22;
	private JLabel peripheralLabel_21;
	private JLabel peripheralLabel_20;
	private JLabel noIvMaintenanceLabel_19;
	private JCheckBox cbVenousIntermittent;
	private JLabel noIvMaintenanceLabel_18;
	private JPanel panel_20;
	private JLabel noIvMaintenanceLabel_20;
	private JLabel noIvMaintenanceLabel_17;
	private JLabel noIvMaintenanceLabel_16;

	private JLabel noIvMaintenanceLabel_15;

	private JLabel peripheralLabel_19;
	private JLabel peripheralLabel_18;
	private JLabel peripheralLabel_17;
	private JLabel noIvMaintenanceLabel_14;

	private JLabel noIvMaintenanceLabel_13;

	private JPanel panel_19;
	private JLabel noIvMaintenanceLabel_12;
	private JLabel noIvMaintenanceLabel_11;
	private JLabel noIvMaintenanceLabel_10;
	private JLabel noIvMaintenanceLabel_7;
	private JLabel noIvMaintenanceLabel_6;

	private JLabel noIvMaintenanceLabel_5;

	private JLabel peripheralLabel_16;
	private JLabel peripheralLabel_15;

	private JLabel peripheralLabel_14;
	private JCheckBox cbPlcc;
	private JLabel noIvMaintenanceLabel_9;

	private JLabel noIvMaintenanceLabel_8;

	private JPanel panel_18;
	private JLabel noIvMaintenanceLabel_4;

	private JLabel noIvMaintenanceLabel_3;

	private JLabel noIvMaintenanceLabel_2;
	private JLabel noIvMaintenanceLabel_1;
	private JLabel noIvMaintenanceLabel;
	private JCheckBox cbPeripheralMaintenance;
	private JCheckBox cbPeripheralCatheter;
	private JPanel panel_16;
	private JPanel panel_15;
	private JLabel dressingExtensionSetLabel_1;
	private JPanel panel_14;
	private JLabel peripheralLabel_13;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14;
	private JLabel peripheralLabel_12;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13;
	private JLabel peripheralLabel_11;
	private JLabel peripheralLabel_10;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12;
	private JLabel peripheralLabel_9;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11;
	private JLabel peripheralLabel_8;
	private JLabel peripheralLabel_7;
	private JLabel peripheralLabel_6;
	private JLabel peripheralLabel_5;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10;
	private JCheckBox cbExternalEveryweek;
	private JLabel peripheralLabel_4;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9;
	private JLabel peripheralLabel_3;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8;
	private JCheckBox cbMidlineEveryweek;
	private JCheckBox cbMidlinePost;
	private JLabel peripheralLabel_2;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7;
	private JLabel peripheralLabel_1;
	private JLabel peripheralLabel;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6;
	private JLabel dressingExtensionSetLabel;
	private JPanel panel_13;
	private JTextField txtTimeMedication;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5;
	private JDateChooser dcNewPatientDate;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4;
	private JTextField txtLenghtTherapy;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3;
	private JCheckBox cbAdministerPush;
	private JCheckBox cbAdministerGravity;
	private JCheckBox cbAdministerFlow;
	private JCheckBox cbAdministerPump;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2;
	private JPanel panel_12;
	private JCheckBox cbFirstDose;
	private JTextField txtAnaphylaxis;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1;
	private JTextArea txtMedicationOrSol;
	private JLabel medicationOrSolutiondosefrequencyroutelengthlabworkLabel;
	private JCheckBox cbNewOrder;
	private JCheckBox cbReAdmission;
	private JCheckBox cbNewAdmission;
	private JPanel panel_7;
	private JTextField txtDiagnosis;
	private JLabel patientNameLabel_8;
	private JPanel panel_11;
	private JTextField txtAllergies;
	private JLabel patientNameLabel_7;
	private JLabel orderLabel_1;
	private JCheckBox cbVerbal;
	private JLabel orderLabel;
	private JCheckBox cbTelephoneOrder;
	private JTextField txtOrderingPhysician;
	private JLabel patientNameLabel_6;
	private JTextField txtSocialSecurity;
	private JLabel patientNameLabel_5;
	private JCheckBox cbPayerCAID;
	private JCheckBox cbPayerPVT;
	private JCheckBox cbPayerManaged;
	private JCheckBox cbPayerMedD;
	private JCheckBox cbPayerMedA;
	private JLabel patientNameLabel_4;
	private JPanel panel_10;
	private JDateChooser dcPatientDate;
	private JLabel patientNameLabel_3;
	private JPanel panel_9;
	private JTextField txtRoomNo;
	private JLabel patientNameLabel_2;
	private JPanel panel_8;
	private JDateChooser dcPatientBirthDate;
	private JLabel patientNameLabel_1;
	private JPanel panel_3;
	private JPanel panel_6;
	private JPanel panel_5;
	private JPanel panel_4;
	private JPanel panel_2;
	private JTextField txtPatientName;
	private JLabel patientNameLabel;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel plazaHealthcareLabel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public PanelPhysicianInfusion() {
		super();
		Global.panelPhysicianInfusion = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(900, 1200));
		setLayout(null);

		plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("", Font.BOLD, 18));
		plazaHealthcareLabel.setText("INFUSION ORDER FORM");
		plazaHealthcareLabel.setBounds(348, 0, 214, 27);
		add(plazaHealthcareLabel);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 33, 850, 1200);
		add(panel);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 16, 850, 154);
		panel.add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 1, 850, 39);
		panel_1.add(panel_2);

		patientNameLabel = new JLabel();
		patientNameLabel.setBounds(5, 10, 85, 14);
		panel_2.add(patientNameLabel);
		patientNameLabel.setFont(new Font("", Font.BOLD, 12));
		patientNameLabel.setText("Patient Name:");

		txtPatientName = new JTextField();
		txtPatientName.setBackground(Color.WHITE);
		txtPatientName.setEditable(false);
		txtPatientName.setBounds(96, 10, 278, 20);
		panel_2.add(txtPatientName);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(381, 0, 171, 39);
		panel_2.add(panel_3);

		patientNameLabel_1 = new JLabel();
		patientNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_1.setText("D.O.B:");
		patientNameLabel_1.setBounds(3, 10, 34, 14);
		panel_3.add(patientNameLabel_1);

		dcPatientBirthDate = new JDateChooser();
		dcPatientBirthDate.setDateFormatString("MM/dd/yyyy");
		dcPatientBirthDate.setFocusable(false);
		dcPatientBirthDate.setBounds(43, 3, 112, 29);
		panel_3.add(dcPatientBirthDate);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(551, 0, 148, 39);
		panel_2.add(panel_8);

		patientNameLabel_2 = new JLabel();
		patientNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_2.setText("Room #:");
		patientNameLabel_2.setBounds(3, 10, 46, 14);
		panel_8.add(patientNameLabel_2);

		txtRoomNo = new JTextField();
		txtRoomNo.setBackground(Color.WHITE);
		txtRoomNo.setEditable(false);
		txtRoomNo.setBounds(55, 10, 92, 20);
		panel_8.add(txtRoomNo);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(698, 0, 152, 39);
		panel_2.add(panel_9);

		patientNameLabel_3 = new JLabel();
		patientNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_3.setText("Date:");
		patientNameLabel_3.setBounds(3, 10, 34, 14);
		panel_9.add(patientNameLabel_3);

		dcPatientDate = new JDateChooser();
		dcPatientDate.setDateFormatString("MM/dd/yyyy");
		dcPatientDate.setFocusable(false);
		dcPatientDate.setBounds(39, 3, 107, 29);
		panel_9.add(dcPatientDate);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 39, 850, 39);
		panel_1.add(panel_4);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 552, 39);
		panel_4.add(panel_10);

		patientNameLabel_4 = new JLabel();
		patientNameLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_4.setText("Payor:");
		patientNameLabel_4.setBounds(5, 10, 36, 14);
		panel_10.add(patientNameLabel_4);

		cbPayerMedA = new JCheckBox();
		cbPayerMedA.setFont(new Font("", Font.BOLD, 12));
		cbPayerMedA.setBackground(Color.WHITE);
		cbPayerMedA.setText("MED. A");
		cbPayerMedA.setBounds(47, 17, 57, 18);
		panel_10.add(cbPayerMedA);

		cbPayerMedD = new JCheckBox();
		cbPayerMedD.setFont(new Font("", Font.BOLD, 12));
		cbPayerMedD.setBackground(Color.WHITE);
		cbPayerMedD.setText("MED. D");
		cbPayerMedD.setBounds(120, 17, 57, 18);
		panel_10.add(cbPayerMedD);

		cbPayerManaged = new JCheckBox();
		cbPayerManaged.setFont(new Font("", Font.BOLD, 12));
		cbPayerManaged.setBackground(Color.WHITE);
		cbPayerManaged.setText("Managed");
		cbPayerManaged.setBounds(195, 17, 78, 18);
		panel_10.add(cbPayerManaged);

		cbPayerPVT = new JCheckBox();
		cbPayerPVT.setFont(new Font("Dialog", Font.BOLD, 12));
		cbPayerPVT.setBackground(Color.WHITE);
		cbPayerPVT.setText("PVT");
		cbPayerPVT.setBounds(284, 17, 46, 18);
		panel_10.add(cbPayerPVT);

		cbPayerCAID = new JCheckBox();
		cbPayerCAID.setFont(new Font("Dialog", Font.BOLD, 12));
		cbPayerCAID.setBackground(Color.WHITE);
		cbPayerCAID.setText("CAID");
		cbPayerCAID.setBounds(343, 17, 46, 18);
		panel_10.add(cbPayerCAID);

		patientNameLabel_5 = new JLabel();
		patientNameLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_5.setText("Social Security #:");
		patientNameLabel_5.setBounds(556, 10, 98, 14);
		panel_4.add(patientNameLabel_5);

		txtSocialSecurity = new JTextField();
		txtSocialSecurity.setBounds(660, 10, 180, 20);
		panel_4.add(txtSocialSecurity);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 77, 850, 39);
		panel_1.add(panel_5);

		patientNameLabel_6 = new JLabel();
		patientNameLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_6.setText("Ordering Physician:");
		patientNameLabel_6.setBounds(5, 10, 111, 14);
		panel_5.add(patientNameLabel_6);

		txtOrderingPhysician = new JTextField();
		txtOrderingPhysician.setBounds(127, 10, 266, 20);
		panel_5.add(txtOrderingPhysician);

		cbTelephoneOrder = new JCheckBox();
		cbTelephoneOrder.setPreferredSize(new Dimension(0, 0));
		cbTelephoneOrder.setBackground(Color.WHITE);
		cbTelephoneOrder.setText("Telephone ");
		cbTelephoneOrder.setBounds(412, 1, 71, 18);
		panel_5.add(cbTelephoneOrder);

		orderLabel = new JLabel();
		orderLabel.setText("Order");
		orderLabel.setBounds(432, 18, 54, 14);
		panel_5.add(orderLabel);

		cbVerbal = new JCheckBox();
		cbVerbal.setPreferredSize(new Dimension(0, 0));
		cbVerbal.setBackground(Color.WHITE);
		cbVerbal.setText("Verbal");
		cbVerbal.setBounds(567, 1, 71, 18);
		panel_5.add(cbVerbal);

		orderLabel_1 = new JLabel();
		orderLabel_1.setText("Order");
		orderLabel_1.setBounds(587, 19, 54, 14);
		panel_5.add(orderLabel_1);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 115, 850, 39);
		panel_1.add(panel_6);

		patientNameLabel_7 = new JLabel();
		patientNameLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_7.setText("Allergies:");
		patientNameLabel_7.setBounds(5, 10, 53, 14);
		panel_6.add(patientNameLabel_7);

		txtAllergies = new JTextField();
		txtAllergies.setBounds(71, 10, 292, 20);
		panel_6.add(txtAllergies);

		panel_11 = new JPanel();
		panel_11.setBounds(388, 0, 462, 39);
		panel_6.add(panel_11);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);

		patientNameLabel_8 = new JLabel();
		patientNameLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		patientNameLabel_8.setText("Diagnosis Related to infusion:");
		patientNameLabel_8.setBounds(5, 10, 178, 14);
		panel_11.add(patientNameLabel_8);

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(189, 10, 263, 20);
		panel_11.add(txtDiagnosis);

		panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBounds(0, 190, 850, 302);
		panel.add(panel_12);

		panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 850, 231);
		panel_12.add(panel_7);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);

		cbNewAdmission = new JCheckBox();
		cbNewAdmission.setFont(new Font("", Font.BOLD, 14));
		cbNewAdmission.setBackground(Color.WHITE);
		cbNewAdmission.setText("New Admission");
		cbNewAdmission.setBounds(5, 10, 124, 18);
		panel_7.add(cbNewAdmission);

		cbReAdmission = new JCheckBox();
		cbReAdmission.setFont(new Font("Dialog", Font.BOLD, 14));
		cbReAdmission.setBackground(Color.WHITE);
		cbReAdmission.setText("Readmission");
		cbReAdmission.setBounds(150, 10, 114, 18);
		panel_7.add(cbReAdmission);

		cbNewOrder = new JCheckBox();
		cbNewOrder.setFont(new Font("Dialog", Font.BOLD, 14));
		cbNewOrder.setBackground(Color.WHITE);
		cbNewOrder.setText("New Order");
		cbNewOrder.setBounds(282, 10, 93, 18);
		panel_7.add(cbNewOrder);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel
				.setFont(new Font("", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel
				.setText("Medication or Solution/Dose/Frequency/Route/Length/Labwork orders (for TPN refer to specific form):");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel.setBounds(5,
				35, 650, 16);
		panel_7.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel);

		txtMedicationOrSol = new JTextArea();
		txtMedicationOrSol.setBounds(5, 57, 762, 139);
		panel_7.add(txtMedicationOrSol);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1
				.setFont(new Font("Dialog", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1
				.setText("Anaphylaxis orders according to facility P&P, or:");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1.setBounds(5,
				202, 308, 18);
		panel_7.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_1);

		txtAnaphylaxis = new JTextField();
		txtAnaphylaxis.setBounds(322, 202, 265, 20);
		panel_7.add(txtAnaphylaxis);

		cbFirstDose = new JCheckBox();
		cbFirstDose.setFont(new Font("", Font.PLAIN, 14));
		cbFirstDose.setBackground(Color.WHITE);
		cbFirstDose.setText("First Dose from E-Kit/Pyxis");
		cbFirstDose.setBounds(617, 202, 206, 18);
		panel_7.add(cbFirstDose);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2
				.setFont(new Font("Dialog", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2
				.setText("Administer Medication Via:");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2.setBounds(
				37, 237, 166, 16);
		panel_12
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_2);

		cbAdministerPump = new JCheckBox();
		cbAdministerPump.setFont(new Font("", Font.PLAIN, 14));
		cbAdministerPump.setPreferredSize(new Dimension(0, 0));
		cbAdministerPump.setBackground(Color.WHITE);
		cbAdministerPump.setText("Pump");
		cbAdministerPump.setBounds(222, 237, 71, 18);
		panel_12.add(cbAdministerPump);

		cbAdministerFlow = new JCheckBox();
		cbAdministerFlow.setPreferredSize(new Dimension(0, 0));
		cbAdministerFlow.setFont(new Font("Dialog", Font.PLAIN, 14));
		cbAdministerFlow.setBackground(Color.WHITE);
		cbAdministerFlow.setText("Flow regulator tubing (dial tubing)");
		cbAdministerFlow.setBounds(306, 237, 233, 18);
		panel_12.add(cbAdministerFlow);

		cbAdministerGravity = new JCheckBox();
		cbAdministerGravity.setPreferredSize(new Dimension(0, 0));
		cbAdministerGravity.setFont(new Font("Dialog", Font.PLAIN, 14));
		cbAdministerGravity.setBackground(Color.WHITE);
		cbAdministerGravity.setText("Gravity");
		cbAdministerGravity.setBounds(565, 237, 71, 18);
		panel_12.add(cbAdministerGravity);

		cbAdministerPush = new JCheckBox();
		cbAdministerPush.setPreferredSize(new Dimension(0, 0));
		cbAdministerPush.setFont(new Font("Dialog", Font.PLAIN, 14));
		cbAdministerPush.setBackground(Color.WHITE);
		cbAdministerPush.setText("IV Push");
		cbAdministerPush.setBounds(661, 237, 71, 18);
		panel_12.add(cbAdministerPush);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3
				.setFont(new Font("Dialog", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3
				.setText("Length of therapy:");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3.setBounds(5,
				271, 116, 18);
		panel_12
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_3);

		txtLenghtTherapy = new JTextField();
		txtLenghtTherapy.setBounds(133, 271, 124, 20);
		panel_12.add(txtLenghtTherapy);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4
				.setFont(new Font("Dialog", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4
				.setText("(# of days or date)");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4.setBounds(
				263, 271, 124, 18);
		panel_12
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_4);

		dcNewPatientDate = new JDateChooser();
		dcNewPatientDate.setDateFormatString("MM/dd/yyyy");
		dcNewPatientDate.setBounds(393, 271, 107, 27);
		panel_12.add(dcNewPatientDate);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5
				.setFont(new Font("Dialog", Font.PLAIN, 14));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5
				.setText("Time medication needed:");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5.setBounds(
				514, 271, 166, 18);
		panel_12
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_5);

		txtTimeMedication = new JTextField();
		txtTimeMedication.setBounds(686, 271, 154, 20);
		panel_12.add(txtTimeMedication);

		panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(0, 505, 850, 179);
		panel.add(panel_13);

		dressingExtensionSetLabel = new JLabel();
		dressingExtensionSetLabel.setFont(new Font("", Font.BOLD, 14));
		dressingExtensionSetLabel
				.setText("DRESSING, EXTENSION SET & CAP CHANGES:");
		dressingExtensionSetLabel.setBounds(5, 10, 311, 18);
		panel_13.add(dressingExtensionSetLabel);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6
				.setFont(new Font("", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6.setBounds(5,
				25, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_6);

		peripheralLabel = new JLabel();
		peripheralLabel.setFont(new Font("", Font.PLAIN, 14));
		peripheralLabel.setText("Peripheral");
		peripheralLabel.setBounds(20, 38, 81, 18);
		panel_13.add(peripheralLabel);

		peripheralLabel_1 = new JLabel();
		peripheralLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_1.setText("at time of restart & PRN");
		peripheralLabel_1.setBounds(45, 62, 162, 14);
		panel_13.add(peripheralLabel_1);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7.setBounds(5,
				70, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_7);

		peripheralLabel_2 = new JLabel();
		peripheralLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_2.setText("Midline/PICC:");
		peripheralLabel_2.setBounds(20, 84, 98, 16);
		panel_13.add(peripheralLabel_2);

		cbMidlinePost = new JCheckBox();
		cbMidlinePost.setFont(new Font("", Font.PLAIN, 14));
		cbMidlinePost.setBackground(Color.WHITE);
		cbMidlinePost.setText("24 hrs. post insertion, then");
		cbMidlinePost.setBounds(20, 106, 187, 18);
		panel_13.add(cbMidlinePost);

		cbMidlineEveryweek = new JCheckBox();
		cbMidlineEveryweek.setFont(new Font("Dialog", Font.PLAIN, 14));
		cbMidlineEveryweek.setBackground(Color.WHITE);
		cbMidlineEveryweek.setText("Every week & PRN");
		cbMidlineEveryweek.setBounds(20, 130, 187, 18);
		panel_13.add(cbMidlineEveryweek);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8.setBounds(
				280, 25, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_8);

		peripheralLabel_3 = new JLabel();
		peripheralLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_3.setText("External catheters:");
		peripheralLabel_3.setBounds(294, 38, 136, 18);
		panel_13.add(peripheralLabel_3);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9.setBounds(
				300, 47, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_9);

		peripheralLabel_4 = new JLabel();
		peripheralLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_4.setText("24 hrs. post insertion, then");
		peripheralLabel_4.setBounds(314, 60, 187, 14);
		panel_13.add(peripheralLabel_4);

		cbExternalEveryweek = new JCheckBox();
		cbExternalEveryweek.setFont(new Font("Dialog", Font.PLAIN, 14));
		cbExternalEveryweek.setBackground(Color.WHITE);
		cbExternalEveryweek.setText("Every week & PRN");
		cbExternalEveryweek.setBounds(300, 82, 187, 18);
		panel_13.add(cbExternalEveryweek);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10.setBounds(
				280, 95, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_10);

		peripheralLabel_5 = new JLabel();
		peripheralLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_5.setText("Venous Ports:");
		peripheralLabel_5.setBounds(294, 109, 98, 18);
		panel_13.add(peripheralLabel_5);

		peripheralLabel_6 = new JLabel();
		peripheralLabel_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_6.setText("Every week");
		peripheralLabel_6.setBounds(314, 133, 98, 18);
		panel_13.add(peripheralLabel_6);

		peripheralLabel_7 = new JLabel();
		peripheralLabel_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_7.setText("non-coring needle, & PRN");
		peripheralLabel_7.setBounds(314, 157, 172, 18);
		panel_13.add(peripheralLabel_7);

		peripheralLabel_8 = new JLabel();
		peripheralLabel_8.setFont(new Font("", Font.BOLD, 14));
		peripheralLabel_8.setText("Monitoring:");
		peripheralLabel_8.setBounds(583, 38, 91, 18);
		panel_13.add(peripheralLabel_8);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11.setBounds(
				608, 47, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_11);

		peripheralLabel_9 = new JLabel();
		peripheralLabel_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_9.setText("I&O every shift & document");
		peripheralLabel_9.setBounds(626, 60, 187, 14);
		panel_13.add(peripheralLabel_9);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12.setBounds(
				608, 70, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_12);

		peripheralLabel_10 = new JLabel();
		peripheralLabel_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_10.setText("Labwork as ordered");
		peripheralLabel_10.setBounds(626, 84, 162, 14);
		panel_13.add(peripheralLabel_10);

		peripheralLabel_11 = new JLabel();
		peripheralLabel_11.setFont(new Font("Dialog", Font.BOLD, 14));
		peripheralLabel_11.setText("Tubing Changes:");
		peripheralLabel_11.setBounds(583, 109, 118, 18);
		panel_13.add(peripheralLabel_11);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13.setBounds(
				608, 120, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_13);

		peripheralLabel_12 = new JLabel();
		peripheralLabel_12.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_12.setText("Continues IV - Every 48hrs. & PRN");
		peripheralLabel_12.setBounds(626, 135, 224, 14);
		panel_13.add(peripheralLabel_12);

		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14 = new JLabel();
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14
				.setFont(new Font("Dialog", Font.BOLD, 28));
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14
				.setText("   .");
		medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14.setBounds(
				608, 147, 8, 26);
		panel_13
				.add(medicationOrSolutiondosefrequencyroutelengthlabworkLabel_14);

		peripheralLabel_13 = new JLabel();
		peripheralLabel_13.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_13.setText("Intermittent IV - Every 48hrs. & PRN");
		peripheralLabel_13.setBounds(626, 159, 224, 14);
		panel_13.add(peripheralLabel_13);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 693, 850, 27);
		panel.add(panel_14);

		dressingExtensionSetLabel_1 = new JLabel();
		dressingExtensionSetLabel_1.setFont(new Font("", Font.BOLD, 16));
		dressingExtensionSetLabel_1
				.setText("Identify patient access device and type of infusion.");
		dressingExtensionSetLabel_1.setBounds(224, 3, 386, 18);
		panel_14.add(dressingExtensionSetLabel_1);

		panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(0, 720, 850, 392);
		panel.add(panel_15);

		panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 428, 139);
		panel_15.add(panel_16);

		cbPeripheralCatheter = new JCheckBox();
		cbPeripheralCatheter.setFont(new Font("", Font.BOLD, 12));
		cbPeripheralCatheter.setBackground(Color.WHITE);
		cbPeripheralCatheter.setText("PERIPHERAL CATHETER");
		cbPeripheralCatheter.setBounds(91, 3, 153, 18);
		panel_16.add(cbPeripheralCatheter);

		cbPeripheralMaintenance = new JCheckBox();
		cbPeripheralMaintenance.setBackground(Color.WHITE);
		cbPeripheralMaintenance.setBounds(10, 27, 14, 18);
		panel_16.add(cbPeripheralMaintenance);

		noIvMaintenanceLabel = new JLabel();
		noIvMaintenanceLabel.setFont(new Font("", Font.PLAIN, 14));
		noIvMaintenanceLabel
				.setText("No IV, maintenance only; flush c 5ml 0.9% NS every 8 hrs.");
		noIvMaintenanceLabel.setBounds(30, 29, 364, 14);
		panel_16.add(noIvMaintenanceLabel);

		noIvMaintenanceLabel_1 = new JLabel();
		noIvMaintenanceLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_1
				.setText("(If dosing > every 8hrs.,flush cath to maintain patency,");
		noIvMaintenanceLabel_1.setBounds(30, 48, 364, 18);
		panel_16.add(noIvMaintenanceLabel_1);

		noIvMaintenanceLabel_2 = new JLabel();
		noIvMaintenanceLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_2.setText("at least every 8 hrs.c 5ml 0.9% NS)");
		noIvMaintenanceLabel_2.setBounds(30, 69, 231, 16);
		panel_16.add(noIvMaintenanceLabel_2);

		noIvMaintenanceLabel_3 = new JLabel();
		noIvMaintenanceLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_3
				.setText("Continuous IV: flush c 5ml 0.9% NS between bags");
		noIvMaintenanceLabel_3.setBounds(30, 94, 364, 18);
		panel_16.add(noIvMaintenanceLabel_3);

		noIvMaintenanceLabel_4 = new JLabel();
		noIvMaintenanceLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_4
				.setText("Intermittent IV: before and after meds 5ml 0.9% NS");
		noIvMaintenanceLabel_4.setBounds(30, 117, 364, 18);
		panel_16.add(noIvMaintenanceLabel_4);

		cbPeripheralContinuous = new JCheckBox();
		cbPeripheralContinuous.setBackground(Color.WHITE);
		cbPeripheralContinuous.setText("New JCheckBox");
		cbPeripheralContinuous.setBounds(10, 97, 14, 18);
		panel_16.add(cbPeripheralContinuous);

		cbPeripheralIntermittent = new JCheckBox();
		cbPeripheralIntermittent.setBackground(Color.WHITE);
		cbPeripheralIntermittent.setText("New JCheckBox");
		cbPeripheralIntermittent.setBounds(10, 118, 14, 18);
		panel_16.add(cbPeripheralIntermittent);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 137, 428, 254);
		panel_15.add(panel_18);

		noIvMaintenanceLabel_8 = new JLabel();
		noIvMaintenanceLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_8.setText("then Heparin 5ml (100 units/ml)");
		noIvMaintenanceLabel_8.setBounds(30, 90, 197, 16);
		panel_18.add(noIvMaintenanceLabel_8);

		noIvMaintenanceLabel_9 = new JLabel();
		noIvMaintenanceLabel_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_9
				.setText("Intermittent IV: before & after flush c 5ml 0.9% NS, finish c");
		noIvMaintenanceLabel_9.setBounds(30, 130, 364, 18);
		panel_18.add(noIvMaintenanceLabel_9);

		cbPlcc = new JCheckBox();
		cbPlcc.setFont(new Font("Dialog", Font.BOLD, 12));
		cbPlcc.setBackground(Color.WHITE);
		cbPlcc.setText("PLCC");
		cbPlcc.setBounds(215, 5, 64, 18);
		panel_18.add(cbPlcc);

		peripheralLabel_14 = new JLabel();
		peripheralLabel_14.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_14.setText("Open tip");
		peripheralLabel_14.setBounds(70, 23, 64, 18);
		panel_18.add(peripheralLabel_14);

		peripheralLabel_15 = new JLabel();
		peripheralLabel_15.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_15.setText("Closed tip (groshong)**");
		peripheralLabel_15.setBounds(173, 27, 147, 18);
		panel_18.add(peripheralLabel_15);

		peripheralLabel_16 = new JLabel();
		peripheralLabel_16.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_16.setText("# of Lumens   1   2");
		peripheralLabel_16.setBounds(132, 47, 147, 18);
		panel_18.add(peripheralLabel_16);

		noIvMaintenanceLabel_5 = new JLabel();
		noIvMaintenanceLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_5
				.setText("No IV, maintenance only; flush every 8hrs. c 5ml 0.9% NS,");
		noIvMaintenanceLabel_5.setBounds(30, 69, 364, 16);
		panel_18.add(noIvMaintenanceLabel_5);

		noIvMaintenanceLabel_6 = new JLabel();
		noIvMaintenanceLabel_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_6
				.setText("Continuous IV: flush c 5ml 0.9% NS between bags");
		noIvMaintenanceLabel_6.setBounds(30, 109, 364, 18);
		panel_18.add(noIvMaintenanceLabel_6);

		noIvMaintenanceLabel_7 = new JLabel();
		noIvMaintenanceLabel_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_7
				.setText("Heparin 5ml (100 units/ml) (if dosing > every 8hrs.,flush ");
		noIvMaintenanceLabel_7.setBounds(30, 150, 364, 18);
		panel_18.add(noIvMaintenanceLabel_7);

		noIvMaintenanceLabel_10 = new JLabel();
		noIvMaintenanceLabel_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_10
				.setText("cath to maintain patency, at least every 6-8 hrs. c 5ml 0.9%");
		noIvMaintenanceLabel_10.setBounds(30, 170, 388, 18);
		panel_18.add(noIvMaintenanceLabel_10);

		noIvMaintenanceLabel_11 = new JLabel();
		noIvMaintenanceLabel_11.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_11
				.setText("NS followed by Heparin 5ml (100units/ml)");
		noIvMaintenanceLabel_11.setBounds(30, 190, 273, 18);
		panel_18.add(noIvMaintenanceLabel_11);

		noIvMaintenanceLabel_12 = new JLabel();
		noIvMaintenanceLabel_12.setFont(new Font("", Font.BOLD, 14));
		noIvMaintenanceLabel_12
				.setText("* * NO Heparin needed for closed tip catheter");
		noIvMaintenanceLabel_12.setBounds(10, 230, 324, 20);
		panel_18.add(noIvMaintenanceLabel_12);

		cbMidline = new JCheckBox();
		cbMidline.setFont(new Font("Dialog", Font.BOLD, 12));
		cbMidline.setBackground(Color.WHITE);
		cbMidline.setText("MIDLINE");
		cbMidline.setBounds(70, 7, 64, 18);
		panel_18.add(cbMidline);

		cbMidlineClosedTip = new JCheckBox();
		cbMidlineClosedTip.setBackground(Color.WHITE);
		cbMidlineClosedTip.setText("New JCheckBox");
		cbMidlineClosedTip.setBounds(153, 27, 14, 18);
		panel_18.add(cbMidlineClosedTip);

		cbMidlineMaintenance = new JCheckBox();
		cbMidlineMaintenance.setBackground(Color.WHITE);
		cbMidlineMaintenance.setText("New JCheckBox");
		cbMidlineMaintenance.setBounds(10, 71, 14, 18);
		panel_18.add(cbMidlineMaintenance);

		cbMidlineContinuous = new JCheckBox();
		cbMidlineContinuous.setBackground(Color.WHITE);
		cbMidlineContinuous.setText("New JCheckBox");
		cbMidlineContinuous.setBounds(10, 112, 14, 18);
		panel_18.add(cbMidlineContinuous);

		cbMidlineIntermittent = new JCheckBox();
		cbMidlineIntermittent.setBackground(Color.WHITE);
		cbMidlineIntermittent.setText("New JCheckBox");
		cbMidlineIntermittent.setBounds(10, 133, 14, 18);
		panel_18.add(cbMidlineIntermittent);

		cbMidlineOpen = new JCheckBox();
		cbMidlineOpen.setAutoscrolls(true);
		cbMidlineOpen.setBackground(Color.WHITE);
		cbMidlineOpen.setBounds(50, 25, 14, 18);
		panel_18.add(cbMidlineOpen);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(427, 0, 428, 179);
		panel_15.add(panel_19);

		noIvMaintenanceLabel_13 = new JLabel();
		noIvMaintenanceLabel_13.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_13.setText("then Heparin 5ml (100 units/ml)");
		noIvMaintenanceLabel_13.setBounds(30, 90, 197, 16);
		panel_19.add(noIvMaintenanceLabel_13);

		noIvMaintenanceLabel_14 = new JLabel();
		noIvMaintenanceLabel_14.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_14
				.setText("Intermittent IV: before & after c 5ml 0.9% NS, finish c");
		noIvMaintenanceLabel_14.setBounds(30, 125, 364, 18);
		panel_19.add(noIvMaintenanceLabel_14);

		peripheralLabel_17 = new JLabel();
		peripheralLabel_17.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_17.setText("Open tip");
		peripheralLabel_17.setBounds(70, 23, 64, 18);
		panel_19.add(peripheralLabel_17);

		peripheralLabel_18 = new JLabel();
		peripheralLabel_18.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_18.setText("Closed tip (groshong)**");
		peripheralLabel_18.setBounds(173, 27, 147, 18);
		panel_19.add(peripheralLabel_18);

		peripheralLabel_19 = new JLabel();
		peripheralLabel_19.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_19.setText("# of Lumens   1   2   3");
		peripheralLabel_19.setBounds(132, 47, 159, 18);
		panel_19.add(peripheralLabel_19);

		noIvMaintenanceLabel_15 = new JLabel();
		noIvMaintenanceLabel_15.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_15
				.setText("No IV, maintenance only; flush every 24hrs. c 5ml 0.9% NS,");
		noIvMaintenanceLabel_15.setBounds(30, 69, 388, 16);
		panel_19.add(noIvMaintenanceLabel_15);

		noIvMaintenanceLabel_16 = new JLabel();
		noIvMaintenanceLabel_16.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_16
				.setText("Continuous IV: flush c 5ml 0.9% NS between bags");
		noIvMaintenanceLabel_16.setBounds(30, 109, 364, 18);
		panel_19.add(noIvMaintenanceLabel_16);

		noIvMaintenanceLabel_17 = new JLabel();
		noIvMaintenanceLabel_17.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_17.setText("Heparin 5ml (100 units/ml)");
		noIvMaintenanceLabel_17.setBounds(30, 142, 364, 18);
		panel_19.add(noIvMaintenanceLabel_17);

		noIvMaintenanceLabel_20 = new JLabel();
		noIvMaintenanceLabel_20.setFont(new Font("Dialog", Font.BOLD, 14));
		noIvMaintenanceLabel_20
				.setText("* * NO Heparin needed for closed tip catheter");
		noIvMaintenanceLabel_20.setBounds(10, 159, 324, 18);
		panel_19.add(noIvMaintenanceLabel_20);

		cbCentral = new JCheckBox();
		cbCentral.setFont(new Font("Dialog", Font.BOLD, 12));
		cbCentral.setBackground(Color.WHITE);
		cbCentral.setText("CENTRAL EXTERNAL CATHETER");
		cbCentral.setBounds(111, 3, 209, 18);
		panel_19.add(cbCentral);

		cbCentralClosedTip = new JCheckBox();
		cbCentralClosedTip.setBackground(Color.WHITE);
		cbCentralClosedTip.setBounds(146, 27, 14, 18);
		panel_19.add(cbCentralClosedTip);

		cbCentralMaintenance = new JCheckBox();
		cbCentralMaintenance.setBackground(Color.WHITE);
		cbCentralMaintenance.setBounds(10, 70, 22, 18);
		panel_19.add(cbCentralMaintenance);

		cbCentralIntermittent = new JCheckBox();
		cbCentralIntermittent.setBackground(Color.WHITE);
		cbCentralIntermittent.setBounds(10, 127, 14, 18);
		panel_19.add(cbCentralIntermittent);

		cbCentralContinuous = new JCheckBox();
		cbCentralContinuous.setBackground(Color.WHITE);
		cbCentralContinuous.setBounds(10, 112, 14, 18);
		panel_19.add(cbCentralContinuous);

		cbCentralOpen = new JCheckBox();
		cbCentralOpen.setBackground(Color.WHITE);
		cbCentralOpen.setBounds(40, 25, 22, 18);
		panel_19.add(cbCentralOpen);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(427, 177, 423, 214);
		panel_15.add(panel_20);

		noIvMaintenanceLabel_18 = new JLabel();
		noIvMaintenanceLabel_18.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_18.setText("then Heparin 5ml (100 units/ml)");
		noIvMaintenanceLabel_18.setBounds(30, 86, 197, 16);
		panel_20.add(noIvMaintenanceLabel_18);

		noIvMaintenanceLabel_19 = new JLabel();
		noIvMaintenanceLabel_19.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_19
				.setText("Intermittent IV: before & after c 5ml 0.9% NS, finish c");
		noIvMaintenanceLabel_19.setBounds(30, 140, 364, 18);
		panel_20.add(noIvMaintenanceLabel_19);

		peripheralLabel_20 = new JLabel();
		peripheralLabel_20.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_20.setText("Open tip");
		peripheralLabel_20.setBounds(70, 23, 64, 18);
		panel_20.add(peripheralLabel_20);

		peripheralLabel_21 = new JLabel();
		peripheralLabel_21.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_21.setText("Closed tip (groshong)**");
		peripheralLabel_21.setBounds(173, 27, 147, 18);
		panel_20.add(peripheralLabel_21);

		peripheralLabel_22 = new JLabel();
		peripheralLabel_22.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_22.setText("# of Portals   1   2   ");
		peripheralLabel_22.setBounds(132, 47, 159, 18);
		panel_20.add(peripheralLabel_22);

		noIvMaintenanceLabel_21 = new JLabel();
		noIvMaintenanceLabel_21.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_21
				.setText("No IV, maintenance only; flush every month c 5ml 0.9% NS,");
		noIvMaintenanceLabel_21.setBounds(30, 69, 388, 16);
		panel_20.add(noIvMaintenanceLabel_21);

		noIvMaintenanceLabel_22 = new JLabel();
		noIvMaintenanceLabel_22.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_22
				.setText("Continuous IV: flush c 5ml 0.9% NS between bags");
		noIvMaintenanceLabel_22.setBounds(30, 122, 364, 18);
		panel_20.add(noIvMaintenanceLabel_22);

		noIvMaintenanceLabel_23 = new JLabel();
		noIvMaintenanceLabel_23.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_23.setText("maintain patency)");
		noIvMaintenanceLabel_23.setBounds(30, 173, 128, 18);
		panel_20.add(noIvMaintenanceLabel_23);

		noIvMaintenanceLabel_24 = new JLabel();
		noIvMaintenanceLabel_24.setFont(new Font("Dialog", Font.BOLD, 14));
		noIvMaintenanceLabel_24
				.setText("* * NO Heparin needed for closed tip catheter");
		noIvMaintenanceLabel_24.setBounds(10, 190, 324, 18);
		panel_20.add(noIvMaintenanceLabel_24);

		noIvMaintenanceLabel_25 = new JLabel();
		noIvMaintenanceLabel_25.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_25
				.setText("Heparin 5ml (100 units/ml) (or at least every 24hrs, to");
		noIvMaintenanceLabel_25.setBounds(30, 157, 364, 18);
		panel_20.add(noIvMaintenanceLabel_25);

		noIvMaintenanceLabel_26 = new JLabel();
		noIvMaintenanceLabel_26.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_26.setText("Day/date of monthly flush:");
		noIvMaintenanceLabel_26.setBounds(30, 105, 172, 16);
		panel_20.add(noIvMaintenanceLabel_26);

		dcVenousDate = new JDateChooser();
		dcVenousDate.setDateFormatString("MM/dd/yyyy");
		dcVenousDate.setBounds(204, 105, 121, 18);
		panel_20.add(dcVenousDate);

		cbVenousPort = new JCheckBox();
		cbVenousPort.setFont(new Font("Dialog", Font.BOLD, 12));
		cbVenousPort.setBackground(Color.WHITE);
		cbVenousPort.setText("VENOUS PORT");
		cbVenousPort.setBounds(107, 3, 209, 18);
		panel_20.add(cbVenousPort);

		cbVenousClosedTip = new JCheckBox();
		cbVenousClosedTip.setBackground(Color.WHITE);
		cbVenousClosedTip.setBounds(149, 27, 14, 18);
		panel_20.add(cbVenousClosedTip);

		cbVenousIntermittent = new JCheckBox();
		cbVenousIntermittent.setBackground(Color.WHITE);
		cbVenousIntermittent.setBounds(10, 142, 14, 18);
		panel_20.add(cbVenousIntermittent);

		cbVenousMaintenance = new JCheckBox();
		cbVenousMaintenance.setBackground(Color.WHITE);
		cbVenousMaintenance.setBounds(10, 70, 14, 18);
		panel_20.add(cbVenousMaintenance);

		cbVenousContinuous = new JCheckBox();
		cbVenousContinuous.setBackground(Color.WHITE);
		cbVenousContinuous.setBounds(10, 124, 14, 18);
		panel_20.add(cbVenousContinuous);

		cbVenousOpen = new JCheckBox();
		cbVenousOpen.setBackground(Color.WHITE);
		cbVenousOpen.setBounds(40, 25, 14, 18);
		panel_20.add(cbVenousOpen);

		noIvMaintenanceLabel_27 = new JLabel();
		noIvMaintenanceLabel_27.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_27.setText("Physician's Signature:");
		noIvMaintenanceLabel_27.setBounds(10, 1112, 150, 18);
		panel.add(noIvMaintenanceLabel_27);

		noIvMaintenanceLabel_28 = new JLabel();
		noIvMaintenanceLabel_28.setFont(new Font("Dialog", Font.PLAIN, 14));
		noIvMaintenanceLabel_28.setText("Nurse's Signature:");
		noIvMaintenanceLabel_28.setBounds(10, 1135, 131, 18);
		panel.add(noIvMaintenanceLabel_28);

		peripheralLabel_23 = new JLabel();
		peripheralLabel_23.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_23.setText("Date:");
		peripheralLabel_23.setBounds(417, 1112, 41, 18);
		panel.add(peripheralLabel_23);

		peripheralLabel_24 = new JLabel();
		peripheralLabel_24.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_24.setText("Time:");
		peripheralLabel_24.setBounds(555, 1112, 41, 18);
		panel.add(peripheralLabel_24);

		form400RevLabel = new JLabel();
		form400RevLabel.setText("FORM #400 Rev. 1/06");
		form400RevLabel.setBounds(10, 1153, 131, 14);
		panel.add(form400RevLabel);

		dcPhysicianDate = new JDateChooser();
		dcPhysicianDate.setDateFormatString("MM/dd/yyyy");
		dcPhysicianDate.setBounds(452, 1115, 97, 18);
		panel.add(dcPhysicianDate);

		peripheralLabel_25 = new JLabel();
		peripheralLabel_25.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_25.setText("Date:");
		peripheralLabel_25.setBounds(417, 1138, 34, 18);
		panel.add(peripheralLabel_25);

		dcNurseDate = new JDateChooser();
		dcNurseDate.setDateFormatString("MM/dd/yyyy");
		dcNurseDate.setBounds(452, 1138, 97, 18);
		panel.add(dcNurseDate);

		peripheralLabel_26 = new JLabel();
		peripheralLabel_26.setFont(new Font("Dialog", Font.PLAIN, 14));
		peripheralLabel_26.setText("Time:");
		peripheralLabel_26.setBounds(555, 1138, 41, 18);
		panel.add(peripheralLabel_26);

		txtPhysicianTime = new JTextField();
		txtPhysicianTime.setBounds(589, 1113, 86, 20);
		panel.add(txtPhysicianTime);

		txtNurseTime = new JTextField();
		txtNurseTime.setBounds(589, 1137, 86, 20);
		panel.add(txtNurseTime);

		solutionsLabel = new JLabel();
		solutionsLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		solutionsLabel.setText("Solutions");
		solutionsLabel.setBounds(698, 1118, 142, 26);
		panel.add(solutionsLabel);

		healthcareLabel = new JLabel();
		healthcareLabel.setFont(new Font("", Font.PLAIN, 20));
		healthcareLabel.setText("healthcare");
		healthcareLabel.setBounds(732, 1143, 108, 18);
		panel.add(healthcareLabel);

		cmbPhysicianSign = new JComboBox();
		cmbPhysicianSign.setBackground(Color.WHITE);
		cmbPhysicianSign.setBounds(155, 1115, 240, 20);
		panel.add(cmbPhysicianSign);

		cmbNurseSign = new JComboBox();
		cmbNurseSign.setBackground(Color.WHITE);
		cmbNurseSign.setBounds(155, 1145, 240, 20);
		panel.add(cmbNurseSign);

		fillCombos();
	}

	public void fillCombos() {

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
		cmbNurseSign.addItem(user.getUserName());
		cmbPhysicianSign.addItem(user.getUserName());
		// cmbNurseSign.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "Mary", "Sue" }));
		// cmbPhysicianSign.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "Tom", "John" }));

	}

	public void doSave() {

		PhysicianInfusion refPhysicianInfusion = new PhysicianInfusion();
		refPhysicianInfusion.setResidentId(Global.currentResidenceKey);

		refPhysicianInfusion.setVenousOpen(cbVenousOpen.isSelected());
		refPhysicianInfusion.setCentralOpen(cbCentralOpen.isSelected());
		refPhysicianInfusion.setMidlineOpen(cbMidlineOpen.isSelected());
		refPhysicianInfusion.setNurseSign((String) cmbNurseSign
				.getSelectedItem());
		refPhysicianInfusion.setPhysicianSign((String) cmbPhysicianSign
				.getSelectedItem());
		refPhysicianInfusion.setVenousContinuous(cbVenousContinuous
				.isSelected());
		refPhysicianInfusion.setVenousMaintenance(cbVenousMaintenance
				.isSelected());
		refPhysicianInfusion.setCentralContinuous(cbCentralContinuous
				.isSelected());
		refPhysicianInfusion.setVenousClosedTip(cbVenousClosedTip.isSelected());
		refPhysicianInfusion.setVenousPort(cbVenousPort.isSelected());
		refPhysicianInfusion.setCentralIntermittent(cbCentralIntermittent
				.isSelected());
		refPhysicianInfusion.setCentralMaintenance(cbCentralMaintenance
				.isSelected());
		refPhysicianInfusion.setCentralClosedTip(cbCentralClosedTip
				.isSelected());
		refPhysicianInfusion.setCentral(cbCentral.isSelected());
		refPhysicianInfusion.setMidlineIntermittent(cbMidlineIntermittent
				.isSelected());
		refPhysicianInfusion.setMidlineContinuous(cbMidlineContinuous
				.isSelected());
		refPhysicianInfusion.setMidlineMaintenance(cbMidlineMaintenance
				.isSelected());
		refPhysicianInfusion.setMidlineClosedTip(cbMidlineClosedTip
				.isSelected());
		refPhysicianInfusion.setMidline(cbMidline.isSelected());
		refPhysicianInfusion.setPeripheralIntermittent(cbPeripheralIntermittent
				.isSelected());
		refPhysicianInfusion.setPeripheralContinuous(cbPeripheralContinuous
				.isSelected());
		refPhysicianInfusion.setNurseTime(txtNurseTime.getText());
		refPhysicianInfusion.setPhysicianTime(txtPhysicianTime.getText());
		refPhysicianInfusion.setNurseDate(dcNurseDate.getDate());
		refPhysicianInfusion.setPhysicianDate(dcPhysicianDate.getDate());
		refPhysicianInfusion.setVenousDate(dcVenousDate.getDate());
		refPhysicianInfusion.setVenousIntermittent(cbVenousIntermittent
				.isSelected());
		refPhysicianInfusion.setPlcc(cbPlcc.isSelected());
		refPhysicianInfusion.setPeripheralMaintenance(cbPeripheralMaintenance
				.isSelected());
		refPhysicianInfusion.setPeripheralCatheter(cbPeripheralCatheter
				.isSelected());
		refPhysicianInfusion.setExternalEveryweek(cbExternalEveryweek
				.isSelected());
		refPhysicianInfusion.setMidlineEveryweek(cbMidlineEveryweek
				.isSelected());
		refPhysicianInfusion.setMidlinePost(cbMidlinePost.isSelected());
		refPhysicianInfusion.setTimeMedication(txtTimeMedication.getText());
		refPhysicianInfusion.setNewPatientDate(dcNewPatientDate.getDate());
		refPhysicianInfusion.setLenghtTherapy(txtLenghtTherapy.getText());
		refPhysicianInfusion.setAdministerPush(cbAdministerPush.isSelected());
		refPhysicianInfusion.setAdministerGravity(cbAdministerGravity
				.isSelected());
		refPhysicianInfusion.setAdministerFlow(cbAdministerFlow.isSelected());
		refPhysicianInfusion.setAdministerPump(cbAdministerPump.isSelected());
		refPhysicianInfusion.setFirstDose(cbFirstDose.isSelected());
		refPhysicianInfusion.setAnaphylaxis(txtAnaphylaxis.getText());
		refPhysicianInfusion.setMedicationOrSol(txtMedicationOrSol.getText());
		refPhysicianInfusion.setNewOrder(cbNewOrder.isSelected());
		refPhysicianInfusion.setReAdmission(cbReAdmission.isSelected());
		refPhysicianInfusion.setNewAdmission(cbNewAdmission.isSelected());
		refPhysicianInfusion.setDiagnosis(txtDiagnosis.getText());
		refPhysicianInfusion.setAllergies(txtAllergies.getText());
		refPhysicianInfusion.setVerbal(cbVerbal.isSelected());
		refPhysicianInfusion.setTelephoneOrder(cbTelephoneOrder.isSelected());
		refPhysicianInfusion.setOrderingPhysician(txtOrderingPhysician
				.getText());
		refPhysicianInfusion.setSocialSecurity(txtSocialSecurity.getText());
		refPhysicianInfusion.setPayerCAID(cbPayerCAID.isSelected());
		refPhysicianInfusion.setPayerPVT(cbPayerPVT.isSelected());
		refPhysicianInfusion.setPayerManaged(cbPayerManaged.isSelected());
		refPhysicianInfusion.setPayerMedD(cbPayerMedD.isSelected());
		refPhysicianInfusion.setPayerMedA(cbPayerMedA.isSelected());
		refPhysicianInfusion.setPatientDate(dcPatientDate.getDate());
		refPhysicianInfusion.setRoomNo(txtRoomNo.getText());
		refPhysicianInfusion.setPatientBirthDate(dcPatientBirthDate.getDate());
		refPhysicianInfusion.setPatientName(txtPatientName.getText());

		try {
			Global.currentPhysicianInfusionKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianInfusion(
							refPhysicianInfusion);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		PhysicianInfusion refPhysicianInfusion = null;

		if (Global.currentPhysicianInfusionKey != 0) {
			try {
				refPhysicianInfusion = MedrexClientManager.getInstance()
						.getPhysicianInfusion(
								Global.currentPhysicianInfusionKey);
			} catch (Exception e) {

			}
			cbVenousOpen.setSelected(refPhysicianInfusion.isVenousOpen());
			cbCentralOpen.setSelected(refPhysicianInfusion.isCentralOpen());
			cbMidlineOpen.setSelected(refPhysicianInfusion.isMidlineOpen());
			cmbNurseSign.setSelectedItem(refPhysicianInfusion.getNurseSign());
			cmbPhysicianSign.setSelectedItem(refPhysicianInfusion
					.getPhysicianSign());
			cbVenousContinuous.setSelected(refPhysicianInfusion
					.isVenousContinuous());
			cbVenousMaintenance.setSelected(refPhysicianInfusion
					.isVenousMaintenance());
			cbCentralContinuous.setSelected(refPhysicianInfusion
					.isCentralContinuous());
			cbVenousClosedTip.setSelected(refPhysicianInfusion
					.isVenousClosedTip());
			cbVenousPort.setSelected(refPhysicianInfusion.isVenousPort());
			cbCentralIntermittent.setSelected(refPhysicianInfusion
					.isCentralIntermittent());
			cbCentralMaintenance.setSelected(refPhysicianInfusion
					.isCentralMaintenance());
			cbCentralClosedTip.setSelected(refPhysicianInfusion
					.isCentralClosedTip());
			cbCentral.setSelected(refPhysicianInfusion.isCentral());
			cbMidlineIntermittent.setSelected(refPhysicianInfusion
					.isMidlineIntermittent());
			cbMidlineContinuous.setSelected(refPhysicianInfusion
					.isMidlineContinuous());
			cbMidlineMaintenance.setSelected(refPhysicianInfusion
					.isMidlineMaintenance());
			cbMidlineClosedTip.setSelected(refPhysicianInfusion
					.isMidlineClosedTip());
			cbMidline.setSelected(refPhysicianInfusion.isMidline());
			cbPeripheralIntermittent.setSelected(refPhysicianInfusion
					.isPeripheralIntermittent());
			cbPeripheralContinuous.setSelected(refPhysicianInfusion
					.isPeripheralContinuous());
			txtNurseTime.setText(refPhysicianInfusion.getNurseTime());
			txtPhysicianTime.setText(refPhysicianInfusion.getPhysicianTime());
			dcNurseDate.setDate(refPhysicianInfusion.getNurseDate());
			dcPhysicianDate.setDate(refPhysicianInfusion.getPhysicianDate());
			dcVenousDate.setDate(refPhysicianInfusion.getVenousDate());
			cbVenousIntermittent.setSelected(refPhysicianInfusion
					.isVenousIntermittent());
			cbPlcc.setSelected(refPhysicianInfusion.isPlcc());
			cbPeripheralMaintenance.setSelected(refPhysicianInfusion
					.isPeripheralMaintenance());
			cbPeripheralCatheter.setSelected(refPhysicianInfusion
					.isPeripheralCatheter());
			cbExternalEveryweek.setSelected(refPhysicianInfusion
					.isExternalEveryweek());
			cbMidlineEveryweek.setSelected(refPhysicianInfusion
					.isMidlineEveryweek());
			cbMidlinePost.setSelected(refPhysicianInfusion.isMidlinePost());
			txtTimeMedication.setText(refPhysicianInfusion.getTimeMedication());
			dcNewPatientDate.setDate(refPhysicianInfusion.getNewPatientDate());
			txtLenghtTherapy.setText(refPhysicianInfusion.getLenghtTherapy());
			cbAdministerPush.setSelected(refPhysicianInfusion
					.isAdministerPush());
			cbAdministerGravity.setSelected(refPhysicianInfusion
					.isAdministerGravity());
			cbAdministerFlow.setSelected(refPhysicianInfusion
					.isAdministerFlow());
			cbAdministerPump.setSelected(refPhysicianInfusion
					.isAdministerPump());
			cbFirstDose.setSelected(refPhysicianInfusion.isFirstDose());
			txtAnaphylaxis.setText(refPhysicianInfusion.getAnaphylaxis());
			txtMedicationOrSol.setText(refPhysicianInfusion
					.getMedicationOrSol());
			cbNewOrder.setSelected(refPhysicianInfusion.isNewOrder());
			cbReAdmission.setSelected(refPhysicianInfusion.isReAdmission());
			cbNewAdmission.setSelected(refPhysicianInfusion.isNewAdmission());
			txtDiagnosis.setText(refPhysicianInfusion.getDiagnosis());
			txtAllergies.setText(refPhysicianInfusion.getAllergies());
			cbVerbal.setSelected(refPhysicianInfusion.isVerbal());
			cbTelephoneOrder.setSelected(refPhysicianInfusion
					.isTelephoneOrder());
			txtOrderingPhysician.setText(refPhysicianInfusion
					.getOrderingPhysician());
			txtSocialSecurity.setText(refPhysicianInfusion.getSocialSecurity());
			cbPayerCAID.setSelected(refPhysicianInfusion.isPayerCAID());
			cbPayerPVT.setSelected(refPhysicianInfusion.isPayerPVT());
			cbPayerManaged.setSelected(refPhysicianInfusion.isPayerManaged());
			cbPayerMedD.setSelected(refPhysicianInfusion.isPayerMedD());
			cbPayerMedA.setSelected(refPhysicianInfusion.isPayerMedA());
			dcPatientDate.setDate(refPhysicianInfusion.getPatientDate());
			txtRoomNo.setText(refPhysicianInfusion.getRoomNo());
			dcPatientBirthDate.setDate(refPhysicianInfusion
					.getPatientBirthDate());
			txtPatientName.setText(refPhysicianInfusion.getPatientName());
		}
	}

}