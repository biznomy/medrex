package medrex.client.main.dialysis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage1;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelRenalDialysisCommunicationFormPage1 extends JPanel implements
		Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1978046382768884252L;
	private ButtonGroup bgSignificantChanges = new ButtonGroup();
	private JTextArea txtOther;
	private JLabel medicationGivenDuringLabel_3;
	private JPanel panel_73;
	private JTextArea txtMedicationGiven;
	private JLabel medicationGivenDuringLabel_2;
	private JPanel panel_72;
	private JTextArea txtPsychosocialIssues;
	private JLabel medicationGivenDuringLabel_1;
	private JPanel panel_71;
	private JTextArea txtDietaryConcerns;
	private JLabel medicationGivenDuringLabel;
	private JPanel panel_70;
	private JTextField txtGlucoseAbnormalValues;
	private JTextField txtGlucoseTime;
	private JPanel panel_69;
	private JDateChooser dcGlucoseDate;
	private JPanel panel_68;
	private JPanel panel_67;
	private JPanel panel_66;
	private JPanel panel_65;
	private JPanel panel_64;
	private JPanel panel_63;
	private JPanel panel_62;
	private JTextField txtGlucoseVitals;
	private JPanel panel_61;
	private JPanel panel_60;
	private JLabel vitalsLabel_7;
	private JPanel panel_59;
	private JPanel panel_58;
	private JTextField txtPulseAbnormalValues;
	private JTextField txtPulseTime;
	private JPanel panel_57;
	private JDateChooser dcPulseDate;
	private JPanel panel_56;
	private JPanel panel_55;
	private JPanel panel_54;
	private JPanel panel_53;
	private JPanel panel_52;
	private JPanel panel_51;
	private JPanel panel_50;
	private JTextField txtPulseVitals;
	private JPanel panel_49;
	private JPanel panel_48;
	private JLabel vitalsLabel_6;
	private JPanel panel_47;
	private JPanel panel_46;
	private JTextField txtBpAbnormalValues;
	private JTextField txtBpTime;
	private JPanel panel_45;
	private JDateChooser dcBpDate;
	private JPanel panel_44;
	private JPanel panel_43;
	private JPanel panel_42;
	private JPanel panel_41;
	private JPanel panel_40;
	private JPanel panel_39;
	private JPanel panel_38;
	private JTextField txtBpVitals;
	private JPanel panel_37;
	private JPanel panel_36;
	private JLabel vitalsLabel_5;
	private JPanel panel_35;
	private JPanel panel_34;
	private JTextField txtTempAbnormalValues;
	private JTextField txtTempTime;
	private JPanel panel_33;
	private JDateChooser dcTempDate;
	private JPanel panel_32;
	private JPanel panel_31;
	private JPanel panel_30;
	private JPanel panel_29;
	private JPanel panel_28;
	private JPanel panel_27;
	private JPanel panel_26;
	private JTextField txtTempVital;
	private JPanel panel_25;
	private JPanel panel_24;
	private JLabel vitalsLabel_4;
	private JPanel panel_23;
	private JPanel panel_22;
	private JLabel vitalsLabel_3;
	private JLabel vitalsLabel_2;
	private JPanel panel_21;
	private JLabel vitalsLabel_1;
	private JPanel panel_20;
	private JPanel panel_19;
	private JPanel panel_18;
	private JPanel panel_17;
	private JPanel panel_16;
	private JPanel panel_15;
	private JPanel panel_14;
	private JLabel vitalsLabel;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_11;
	private JPanel panel_10;
	private JPanel panel_9;
	private JLabel communicationFormForLabel_1;
	private JTextField txtTelephoneNumber;
	private JLabel newOrdersLabel_2;
	private JPanel panel_8;
	private JDateChooser dcDate;
	private JLabel newOrdersLabel_1;
	private JPanel panel_7;
	private JComboBox cmbCompletedBySignature;
	private JLabel newOrdersLabel;
	private JPanel panel_6;
	private JLabel label_1;
	private JLabel centerPlazaHealthcareLabel;
	private JPanel panel_5;
	private JTextField txtResidentName;
	private JLabel residentNameLabel;
	private JPanel panel_4;
	private JTextField txtSignificantChangesYes;
	private JRadioButton rbSignificantChangesYes;
	private JLabel noLabel_1;
	private JTextField txtSignificantChangesNo;
	private JRadioButton rbSignificantChangesNo;
	private JLabel noLabel;
	private JPanel panel_3;
	private JLabel predialysisWeightLabel_1;
	private JTextField txtSignificantChanges;
	private JLabel predialysisWeightLabel;
	private JPanel panel_2;
	private JLabel communicationFormForLabel;
	private JLabel rentalDialysisLabel;
	private JPanel panel_1;

	/**
	 * Create the panel
	 */
	public PanelRenalDialysisCommunicationFormPage1() {
		super();
		setPreferredSize(new Dimension(800, 900));
		Global.panelRenalDialysisCommunicationFormPage1 = this;
		setLayout(null);
		setSize(800, 900);
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 800, 900);
		add(panel_1);

		rentalDialysisLabel = new JLabel();
		rentalDialysisLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		rentalDialysisLabel.setText("Plaza Healthcare & Rehabilitation Center");
		rentalDialysisLabel.setBounds(240, 17, 421, 23);
		panel_1.add(rentalDialysisLabel);

		communicationFormForLabel = new JLabel();
		communicationFormForLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		communicationFormForLabel.setText("RENAL DIALYSIS");
		communicationFormForLabel.setBounds(264, 40, 180, 29);
		panel_1.add(communicationFormForLabel);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(20, 198, 713, 77);
		panel_1.add(panel_2);

		predialysisWeightLabel = new JLabel();
		predialysisWeightLabel.setText("Significant Changes");
		predialysisWeightLabel.setBounds(10, 0, 162, 19);
		panel_2.add(predialysisWeightLabel);

		txtSignificantChanges = new JTextField();
		txtSignificantChanges.setBounds(10, 55, 198, 20);
		panel_2.add(txtSignificantChanges);

		predialysisWeightLabel_1 = new JLabel();
		predialysisWeightLabel_1.setText("Since Last Dialysis:");
		predialysisWeightLabel_1.setBounds(10, 24, 162, 19);
		panel_2.add(predialysisWeightLabel_1);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(271, 0, 121, 77);
		panel_2.add(panel_3);

		noLabel = new JLabel();
		noLabel.setText("No.:");
		noLabel.setBounds(10, 10, 33, 18);
		panel_3.add(noLabel);

		rbSignificantChangesNo = new JRadioButton();
		bgSignificantChanges.add(rbSignificantChangesNo);
		rbSignificantChangesNo.setActionCommand("1");
		rbSignificantChangesNo.setBackground(Color.WHITE);
		rbSignificantChangesNo.setText("New JRadioButton");
		rbSignificantChangesNo.setBounds(10, 27, 14, 18);
		panel_3.add(rbSignificantChangesNo);

		txtSignificantChangesNo = new JTextField();
		txtSignificantChangesNo.setBounds(10, 54, 101, 21);
		panel_3.add(txtSignificantChangesNo);

		noLabel_1 = new JLabel();
		noLabel_1.setText("Yes(explain):");
		noLabel_1.setBounds(398, 10, 71, 18);
		panel_2.add(noLabel_1);

		rbSignificantChangesYes = new JRadioButton();
		bgSignificantChanges.add(rbSignificantChangesYes);
		rbSignificantChangesYes.setActionCommand("2");
		rbSignificantChangesYes.setBackground(Color.WHITE);
		rbSignificantChangesYes.setText("New JRadioButton");
		rbSignificantChangesYes.setBounds(398, 27, 13, 18);
		panel_2.add(rbSignificantChangesYes);

		txtSignificantChangesYes = new JTextField();
		txtSignificantChangesYes.setBounds(408, 54, 101, 21);
		panel_2.add(txtSignificantChangesYes);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(20, 123, 713, 69);
		panel_1.add(panel_4);

		residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setBounds(10, 21, 86, 24);
		panel_4.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(102, 23, 183, 20);
		panel_4.add(txtResidentName);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(329, 0, 384, 69);
		panel_4.add(panel_5);

		centerPlazaHealthcareLabel = new JLabel();
		centerPlazaHealthcareLabel
				.setText("Center: Plaza HealthCare & Rehabilitation Center");
		centerPlazaHealthcareLabel.setBounds(10, 10, 244, 22);
		panel_5.add(centerPlazaHealthcareLabel);

		label_1 = new JLabel();
		label_1.setText("456 Rahway Ave.,Elizabeth,NJ 07202");
		label_1.setBounds(46, 30, 182, 14);
		panel_5.add(label_1);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(20, 759, 232, 50);
		panel_1.add(panel_6);

		newOrdersLabel = new JLabel();
		newOrdersLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel.setText("Completed By: Signature/Tile");
		newOrdersLabel.setBounds(10, 0, 216, 14);
		panel_6.add(newOrdersLabel);

		cmbCompletedBySignature = new JComboBox();
		cmbCompletedBySignature.setBackground(Color.WHITE);
		cmbCompletedBySignature.setBounds(10, 20, 192, 21);
		panel_6.add(cmbCompletedBySignature);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(258, 759, 232, 50);
		panel_1.add(panel_7);

		newOrdersLabel_1 = new JLabel();
		newOrdersLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel_1.setText("Date:");
		newOrdersLabel_1.setBounds(10, 0, 216, 14);
		panel_7.add(newOrdersLabel_1);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(10, 20, 159, 19);
		panel_7.add(dcDate);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(496, 759, 237, 50);
		panel_1.add(panel_8);

		newOrdersLabel_2 = new JLabel();
		newOrdersLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel_2.setText("Telephone Number:");
		newOrdersLabel_2.setBounds(10, 0, 216, 14);
		panel_8.add(newOrdersLabel_2);

		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setBounds(10, 20, 181, 20);
		panel_8.add(txtTelephoneNumber);

		communicationFormForLabel_1 = new JLabel();
		communicationFormForLabel_1.setFont(new Font("Dialog", Font.BOLD, 22));
		communicationFormForLabel_1
				.setText("COMMUNICATION FORM FOR HEMODIALYSIS");
		communicationFormForLabel_1.setBounds(127, 75, 492, 29);
		panel_1.add(communicationFormForLabel_1);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(20, 280, 713, 159);
		panel_1.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 713, 32);
		panel_9.add(panel_10);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 0, 156, 32);
		panel_10.add(panel_11);

		panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 0, 34);
		panel_10.add(panel_12);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(156, 0, 99, 32);
		panel_10.add(panel_13);

		vitalsLabel = new JLabel();
		vitalsLabel.setText("Vitals");
		vitalsLabel.setBounds(10, 10, 54, 14);
		panel_13.add(vitalsLabel);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(254, 0, 99, 32);
		panel_10.add(panel_14);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(-255, 31, 707, 32);
		panel_14.add(panel_15);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 0, 156, 32);
		panel_15.add(panel_16);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(0, 0, 0, 34);
		panel_15.add(panel_17);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(155, 0, 99, 32);
		panel_15.add(panel_18);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(254, 0, 99, 32);
		panel_15.add(panel_19);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(352, 0, 99, 32);
		panel_15.add(panel_20);

		vitalsLabel_1 = new JLabel();
		vitalsLabel_1.setText("Date");
		vitalsLabel_1.setBounds(10, 10, 54, 14);
		panel_14.add(vitalsLabel_1);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(352, 0, 99, 32);
		panel_10.add(panel_21);

		vitalsLabel_2 = new JLabel();
		vitalsLabel_2.setText("Time");
		vitalsLabel_2.setBounds(10, 10, 54, 14);
		panel_21.add(vitalsLabel_2);

		vitalsLabel_3 = new JLabel();
		vitalsLabel_3.setText("Abnormal Values");
		vitalsLabel_3.setBounds(457, 10, 88, 14);
		panel_10.add(vitalsLabel_3);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 31, 713, 32);
		panel_9.add(panel_22);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(0, 0, 156, 32);
		panel_22.add(panel_23);

		vitalsLabel_4 = new JLabel();
		vitalsLabel_4.setText("Temp");
		vitalsLabel_4.setBounds(10, 10, 54, 14);
		panel_23.add(vitalsLabel_4);

		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBounds(0, 0, 0, 34);
		panel_22.add(panel_24);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(156, 0, 99, 32);
		panel_22.add(panel_25);

		txtTempVital = new JTextField();
		txtTempVital.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTempVital.setBounds(10, 5, 79, 20);
		panel_25.add(txtTempVital);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(254, 0, 99, 32);
		panel_22.add(panel_26);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(-255, 31, 707, 32);
		panel_26.add(panel_27);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 0, 156, 32);
		panel_27.add(panel_28);

		panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBounds(0, 0, 0, 34);
		panel_27.add(panel_29);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(155, 0, 99, 32);
		panel_27.add(panel_30);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(254, 0, 99, 32);
		panel_27.add(panel_31);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(352, 0, 99, 32);
		panel_27.add(panel_32);

		dcTempDate = new JDateChooser();
		dcTempDate.setDateFormatString("MM/dd/yyyy");
		dcTempDate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcTempDate.setBounds(5, 5, 92, 21);
		panel_26.add(dcTempDate);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(352, 0, 99, 32);
		panel_22.add(panel_33);

		txtTempTime = new JTextField();
		txtTempTime.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTempTime.setBounds(10, 5, 79, 20);
		panel_33.add(txtTempTime);

		txtTempAbnormalValues = new JTextField();
		txtTempAbnormalValues.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTempAbnormalValues.setBounds(457, 5, 246, 20);
		panel_22.add(txtTempAbnormalValues);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 62, 713, 32);
		panel_9.add(panel_34);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 0, 156, 32);
		panel_34.add(panel_35);

		vitalsLabel_5 = new JLabel();
		vitalsLabel_5.setText("BP");
		vitalsLabel_5.setBounds(10, 10, 54, 14);
		panel_35.add(vitalsLabel_5);

		panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBounds(0, 0, 0, 34);
		panel_34.add(panel_36);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(156, 0, 99, 32);
		panel_34.add(panel_37);

		txtBpVitals = new JTextField();
		txtBpVitals.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtBpVitals.setBounds(10, 5, 79, 20);
		panel_37.add(txtBpVitals);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(254, 0, 99, 32);
		panel_34.add(panel_38);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(-255, 31, 707, 32);
		panel_38.add(panel_39);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(0, 0, 156, 32);
		panel_39.add(panel_40);

		panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBounds(0, 0, 0, 34);
		panel_39.add(panel_41);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(155, 0, 99, 32);
		panel_39.add(panel_42);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(254, 0, 99, 32);
		panel_39.add(panel_43);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(352, 0, 99, 32);
		panel_39.add(panel_44);

		dcBpDate = new JDateChooser();
		dcBpDate.setDateFormatString("MM/dd/yyyy");
		dcBpDate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcBpDate.setBounds(5, 5, 92, 21);
		panel_38.add(dcBpDate);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(352, 0, 99, 32);
		panel_34.add(panel_45);

		txtBpTime = new JTextField();
		txtBpTime.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtBpTime.setBounds(10, 5, 79, 20);
		panel_45.add(txtBpTime);

		txtBpAbnormalValues = new JTextField();
		txtBpAbnormalValues.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtBpAbnormalValues.setBounds(457, 5, 246, 20);
		panel_34.add(txtBpAbnormalValues);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 92, 713, 32);
		panel_9.add(panel_46);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 0, 156, 32);
		panel_46.add(panel_47);

		vitalsLabel_6 = new JLabel();
		vitalsLabel_6.setText("Pulse");
		vitalsLabel_6.setBounds(10, 10, 54, 14);
		panel_47.add(vitalsLabel_6);

		panel_48 = new JPanel();
		panel_48.setLayout(null);
		panel_48.setBounds(0, 0, 0, 34);
		panel_46.add(panel_48);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(156, 0, 99, 32);
		panel_46.add(panel_49);

		txtPulseVitals = new JTextField();
		txtPulseVitals.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPulseVitals.setBounds(10, 5, 79, 20);
		panel_49.add(txtPulseVitals);

		panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(Color.black, 1, false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(254, 0, 99, 32);
		panel_46.add(panel_50);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(-255, 31, 707, 32);
		panel_50.add(panel_51);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(0, 0, 156, 32);
		panel_51.add(panel_52);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBounds(0, 0, 0, 34);
		panel_51.add(panel_53);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(155, 0, 99, 32);
		panel_51.add(panel_54);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(254, 0, 99, 32);
		panel_51.add(panel_55);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(352, 0, 99, 32);
		panel_51.add(panel_56);

		dcPulseDate = new JDateChooser();
		dcPulseDate.setDateFormatString("MM/dd/yyyy");
		dcPulseDate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcPulseDate.setBounds(5, 5, 92, 21);
		panel_50.add(dcPulseDate);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(352, 0, 99, 32);
		panel_46.add(panel_57);

		txtPulseTime = new JTextField();
		txtPulseTime.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPulseTime.setBounds(10, 5, 79, 20);
		panel_57.add(txtPulseTime);

		txtPulseAbnormalValues = new JTextField();
		txtPulseAbnormalValues.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPulseAbnormalValues.setBounds(457, 5, 246, 20);
		panel_46.add(txtPulseAbnormalValues);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 122, 713, 32);
		panel_9.add(panel_58);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(0, 0, 156, 32);
		panel_58.add(panel_59);

		vitalsLabel_7 = new JLabel();
		vitalsLabel_7.setText("Glucose");
		vitalsLabel_7.setBounds(10, 10, 54, 14);
		panel_59.add(vitalsLabel_7);

		panel_60 = new JPanel();
		panel_60.setLayout(null);
		panel_60.setBounds(0, 0, 0, 34);
		panel_58.add(panel_60);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(156, 0, 99, 32);
		panel_58.add(panel_61);

		txtGlucoseVitals = new JTextField();
		txtGlucoseVitals.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtGlucoseVitals.setBounds(10, 5, 79, 20);
		panel_61.add(txtGlucoseVitals);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(254, 0, 99, 32);
		panel_58.add(panel_62);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(-255, 31, 707, 32);
		panel_62.add(panel_63);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(0, 0, 156, 32);
		panel_63.add(panel_64);

		panel_65 = new JPanel();
		panel_65.setLayout(null);
		panel_65.setBounds(0, 0, 0, 34);
		panel_63.add(panel_65);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(155, 0, 99, 32);
		panel_63.add(panel_66);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(254, 0, 99, 32);
		panel_63.add(panel_67);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(352, 0, 99, 32);
		panel_63.add(panel_68);

		dcGlucoseDate = new JDateChooser();
		dcGlucoseDate.setDateFormatString("MM/dd/yyyy");
		dcGlucoseDate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcGlucoseDate.setBounds(5, 5, 92, 21);
		panel_62.add(dcGlucoseDate);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(352, 0, 99, 32);
		panel_58.add(panel_69);

		txtGlucoseTime = new JTextField();
		txtGlucoseTime.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtGlucoseTime.setBounds(10, 5, 79, 20);
		panel_69.add(txtGlucoseTime);

		txtGlucoseAbnormalValues = new JTextField();
		txtGlucoseAbnormalValues.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtGlucoseAbnormalValues.setBounds(457, 5, 246, 20);
		panel_58.add(txtGlucoseAbnormalValues);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(20, 441, 713, 77);
		panel_1.add(panel_70);

		medicationGivenDuringLabel = new JLabel();
		medicationGivenDuringLabel.setFont(new Font("", Font.BOLD, 12));
		medicationGivenDuringLabel.setText("Dietary Concerns:");
		medicationGivenDuringLabel.setBounds(17, 0, 128, 20);
		panel_70.add(medicationGivenDuringLabel);

		txtDietaryConcerns = new JTextArea();
		txtDietaryConcerns.setWrapStyleWord(true);
		txtDietaryConcerns.setLineWrap(true);
		txtDietaryConcerns.setBounds(10, 26, 693, 43);
		panel_70.add(txtDietaryConcerns);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(20, 523, 713, 77);
		panel_1.add(panel_71);

		medicationGivenDuringLabel_1 = new JLabel();
		medicationGivenDuringLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel_1.setText("Psychosocial Issues:");
		medicationGivenDuringLabel_1.setBounds(10, 0, 156, 19);
		panel_71.add(medicationGivenDuringLabel_1);

		txtPsychosocialIssues = new JTextArea();
		txtPsychosocialIssues.setWrapStyleWord(true);
		txtPsychosocialIssues.setLineWrap(true);
		txtPsychosocialIssues.setBounds(10, 25, 693, 43);
		panel_71.add(txtPsychosocialIssues);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(20, 605, 713, 77);
		panel_1.add(panel_72);

		medicationGivenDuringLabel_2 = new JLabel();
		medicationGivenDuringLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel_2
				.setText("Medications Given Prior to Dialysis:");
		medicationGivenDuringLabel_2.setBounds(17, 0, 261, 20);
		panel_72.add(medicationGivenDuringLabel_2);

		txtMedicationGiven = new JTextArea();
		txtMedicationGiven.setWrapStyleWord(true);
		txtMedicationGiven.setLineWrap(true);
		txtMedicationGiven.setBounds(17, 26, 686, 43);
		panel_72.add(txtMedicationGiven);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(20, 688, 713, 77);
		panel_1.add(panel_73);

		medicationGivenDuringLabel_3 = new JLabel();
		medicationGivenDuringLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel_3.setText("Other:");
		medicationGivenDuringLabel_3.setBounds(17, 0, 69, 20);
		panel_73.add(medicationGivenDuringLabel_3);

		txtOther = new JTextArea();
		txtOther.setBorder(new LineBorder(Color.black, 1, false));
		txtOther.setWrapStyleWord(true);
		txtOther.setLineWrap(true);
		txtOther.setBounds(80, 4, 623, 63);
		panel_73.add(txtOther);

		fillCombos();
		updateData();

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
		cmbCompletedBySignature.addItem(user.getUserName());
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
		} catch (Exception e) {

		}

		if (Global.currentRenalDialysisCommunicationFormKey == 0) {

			txtSignificantChanges.setText("");
			txtSignificantChangesNo.setText("");
			txtSignificantChangesYes.setText("");
			SwingUtils.setSelectedButton(bgSignificantChanges, 0);

			txtTempVital.setText("");
			dcTempDate.setDate(null);
			txtTempTime.setText("");
			txtTempAbnormalValues.setText("");

			txtBpVitals.setText("");
			dcBpDate.setDate(null);
			txtBpTime.setText("");
			txtBpAbnormalValues.setText("");

			txtPulseVitals.setText("");
			dcPulseDate.setDate(null);
			txtPulseTime.setText("");
			txtPulseAbnormalValues.setText("");

			txtGlucoseVitals.setText("");
			dcGlucoseDate.setDate(null);
			txtGlucoseTime.setText("");
			txtGlucoseAbnormalValues.setText("");

			txtDietaryConcerns.setText("");
			txtPsychosocialIssues.setText("");
			txtMedicationGiven.setText("");
			txtOther.setText("");

			cmbCompletedBySignature.setSelectedItem("");
			dcDate.setDate(null);
			txtTelephoneNumber.setText("");

		} else {
			RenalDialysisCommunicationFormPage1 rdcfp1 = null;
			try {
				rdcfp1 = MedrexClientManager
						.getInstance()
						.getRenalDialysisCommunicationFormPage1(
								(Global.currentRenalDialysisCommunicationFormKey));
			} catch (Exception e) {

			}

			txtSignificantChanges.setText(rdcfp1.getSignificantChanges());
			txtSignificantChangesNo.setText(rdcfp1.getSignificantChangesNo());
			txtSignificantChangesYes.setText(rdcfp1.getSignificantChangesYes());
			SwingUtils.setSelectedButton(bgSignificantChanges, rdcfp1
					.getSignificantChangesOption());

			txtTempVital.setText(rdcfp1.getTempVitals());
			dcTempDate.setDate(rdcfp1.getTempDate());
			txtTempTime.setText(rdcfp1.getTempTime());
			txtTempAbnormalValues.setText(rdcfp1.getTempAbnormalValues());

			txtBpVitals.setText(rdcfp1.getBpVitals());
			dcBpDate.setDate(rdcfp1.getBpDate());
			txtBpTime.setText(rdcfp1.getBpTime());
			txtBpAbnormalValues.setText(rdcfp1.getBpAbnormalValues());

			txtPulseVitals.setText(rdcfp1.getPulseVitals());
			dcPulseDate.setDate(rdcfp1.getPulseDate());
			txtPulseTime.setText(rdcfp1.getPulseTime());
			txtPulseAbnormalValues.setText(rdcfp1.getPulseAbnormalValues());

			txtGlucoseVitals.setText(rdcfp1.getGlucoseVitals());
			dcGlucoseDate.setDate(rdcfp1.getGlucoseDate());
			txtGlucoseTime.setText(rdcfp1.getGlucoseTime());
			txtGlucoseAbnormalValues.setText(rdcfp1.getGlucoseAbnormalValues());

			txtDietaryConcerns.setText(rdcfp1.getDietaryConcerns());
			txtPsychosocialIssues.setText(rdcfp1.getPsychosocialIssues());
			txtMedicationGiven.setText(rdcfp1.getMedicationGiven());
			txtOther.setText(rdcfp1.getOther());

			cmbCompletedBySignature.setSelectedItem(rdcfp1.getSignature());
			dcDate.setDate(rdcfp1.getDateRecord());
			txtTelephoneNumber.setText(rdcfp1.getTelephoneNumber());

		}

	}

	public int doSave() {
		RenalDialysisCommunicationFormPage1 rdcfp1 = new RenalDialysisCommunicationFormPage1();

		rdcfp1.setSerial(Global.currentRenalDialysisCommunicationFormKey);
		rdcfp1.setResidentId(Global.currentResidenceKey);

		rdcfp1.setSignificantChanges(txtSignificantChanges.getText());
		rdcfp1.setSignificantChangesNo(txtSignificantChangesNo.getText());
		rdcfp1.setSignificantChangesYes(txtSignificantChangesYes.getText());
		rdcfp1.setSignificantChangesOption(SwingUtils
				.getSelectedButton(bgSignificantChanges));

		rdcfp1.setTempVitals(txtTempVital.getText());
		rdcfp1.setTempDate(dcTempDate.getDate());
		rdcfp1.setTempTime(txtTempTime.getText());
		rdcfp1.setTempAbnormalValues(txtTempAbnormalValues.getText());

		rdcfp1.setBpVitals(txtBpVitals.getText());
		rdcfp1.setBpDate(dcBpDate.getDate());
		rdcfp1.setBpTime(txtBpTime.getText());
		rdcfp1.setBpAbnormalValues(txtBpAbnormalValues.getText());

		rdcfp1.setPulseVitals(txtPulseVitals.getText());
		rdcfp1.setPulseDate(dcPulseDate.getDate());
		rdcfp1.setPulseTime(txtPulseTime.getText());
		rdcfp1.setPulseAbnormalValues(txtPulseAbnormalValues.getText());

		rdcfp1.setGlucoseVitals(txtGlucoseVitals.getText());
		rdcfp1.setGlucoseDate(dcGlucoseDate.getDate());
		rdcfp1.setGlucoseTime(txtGlucoseTime.getText());
		rdcfp1.setGlucoseAbnormalValues(txtGlucoseAbnormalValues.getText());

		rdcfp1.setDietaryConcerns(txtDietaryConcerns.getText());
		rdcfp1.setPsychosocialIssues(txtPsychosocialIssues.getText());
		rdcfp1.setMedicationGiven(txtMedicationGiven.getText());
		rdcfp1.setOther(txtOther.getText());

		rdcfp1.setSignature((String) cmbCompletedBySignature.getSelectedItem());
		rdcfp1.setDateRecord(dcDate.getDate());
		rdcfp1.setTelephoneNumber(txtTelephoneNumber.getText());

		try {
			Global.currentRenalDialysisCommunicationFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateRenalDialysisCommunicationFormPage1(rdcfp1);
		} catch (Exception e) {
		}
		return Global.currentRenalDialysisCommunicationFormKey;

	}

	public void doLoad() {

	}

	public void doUpdate() {

	}

	public boolean doValidate() {

		return true;
	}

}
