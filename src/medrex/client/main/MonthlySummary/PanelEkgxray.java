package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DebugGraphics;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

public class PanelEkgxray extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6313992519831723761L;
	private JTextField txtpreauthorization;
	private JCheckBox cbOther;
	private JCheckBox CbHomeBond;
	private JCheckBox cbSNF;
	ButtonGroup bgGender = new ButtonGroup();
	ButtonGroup bgNoofPaitent = new ButtonGroup();

	PanelEkgxray() {
		super();
		setBackground(Color.WHITE);
		setOpaque(true);
		setAutoscrolls(true);
		setPreferredSize(new Dimension(840, 1600));
		setLayout(null);

		final JPanel panelLogo1 = new JPanel();
		panelLogo1.setBackground(new Color(0, 117, 30));
		panelLogo1.setLayout(null);

		panelLogo1.setBounds(21, 26, 203, 185);
		add(panelLogo1);

		final JLabel lblFastrad = new JLabel();
		lblFastrad.setFont(new Font("", Font.BOLD, 12));
		lblFastrad.setBounds(44, 129, 140, 16);
		lblFastrad.setText("1-888-594-5910");
		panelLogo1.add(lblFastrad);

		final JLabel label_1 = new JLabel();
		label_1.setText(" ");
		label_1.setBounds(29, 16, 152, 107);
		panelLogo1.add(label_1);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);

		panel.setActionMap(null);
		panel.setLayout(null);
		panel.setBounds(21, 230, 484, 521);
		add(panel);

		final JLabel lblDOS = new JLabel();
		lblDOS.setText("Date of Service");
		lblDOS.setBounds(16, 38, 129, 25);
		panel.add(lblDOS);

		// final JDate txtDOS = new JTextField();
		// txtDOS.setBounds(159, 40, 142, 20);
		// panel.add(txtDOS);

		final JLabel lblfacilityName = new JLabel();
		lblfacilityName.setText("Facility Name");
		lblfacilityName.setBounds(14, 74, 87, 25);
		panel.add(lblfacilityName);

		final JTextField txtFacilityName = new JTextField();
		txtFacilityName.setBounds(159, 76, 142, 20);
		panel.add(txtFacilityName);

		final JLabel lblRoom = new JLabel();
		lblRoom.setText("Room #");
		lblRoom.setBounds(321, 78, 66, 16);
		panel.add(lblRoom);

		final JTextField txtRoomNumber = new JTextField();
		txtRoomNumber.setBounds(366, 76, 104, 20);
		panel.add(txtRoomNumber);

		final JLabel lblPatientName = new JLabel();
		lblPatientName.setText("Patient Name");
		lblPatientName.setBounds(16, 116, 85, 16);
		panel.add(lblPatientName);

		final JTextField txtPatientNameLast = new JTextField();
		txtPatientNameLast.setBounds(159, 114, 141, 20);
		panel.add(txtPatientNameLast);

		final JLabel lblLastPatientNameLast = new JLabel();
		lblLastPatientNameLast.setText("Last");
		lblLastPatientNameLast.setBounds(125, 116, 40, 16);
		panel.add(lblLastPatientNameLast);

		final JLabel lblLlasttNameFirst = new JLabel();
		lblLlasttNameFirst.setText("First");
		lblLlasttNameFirst.setBounds(321, 114, 49, 20);
		panel.add(lblLlasttNameFirst);

		final JTextField txtPatientNamefirst = new JTextField();
		txtPatientNamefirst.setBounds(366, 114, 104, 20);
		panel.add(txtPatientNamefirst);

		final JLabel lblDOB = new JLabel();
		lblDOB.setText("Date Of Birth");
		lblDOB.setBounds(16, 156, 78, 16);
		panel.add(lblDOB);

		final JTextField txtDOB = new JTextField();
		txtDOB.setBounds(159, 154, 142, 20);
		panel.add(txtDOB);

		final JLabel lblsex = new JLabel();
		lblsex.setText("Sex");
		lblsex.setBounds(321, 156, 66, 16);
		panel.add(lblsex);

		final JPanel panelSexchecbox = new JPanel();
		panelSexchecbox.setBackground(Color.WHITE);
		panelSexchecbox.setLayout(null);
		panelSexchecbox.setBounds(366, 156, 115, 45);
		panel.add(panelSexchecbox);

		final JRadioButton rbmale = new JRadioButton();
		rbmale.setBackground(Color.WHITE);
		rbmale.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbmale.setBounds(0, 0, 52, 24);
		panelSexchecbox.add(rbmale);
		rbmale.setText("Male");
		bgGender.add(rbmale);

		final JRadioButton rbFemale = new JRadioButton();
		rbFemale.setAutoscrolls(true);
		rbFemale.setBackground(Color.WHITE);
		rbFemale.setBounds(55, 0, 74, 24);
		panelSexchecbox.add(rbFemale);
		rbFemale.setText("Female");
		bgGender.add(rbFemale);
		final JLabel lblSocialSecurity = new JLabel();
		lblSocialSecurity.setText("Social Security #");
		lblSocialSecurity.setBounds(16, 185, 104, 16);
		panel.add(lblSocialSecurity);

		final JTextField txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setBounds(159, 185, 142, 20);
		panel.add(txtSocialSecurityNumber);

		final JLabel addressLabel = new JLabel();
		addressLabel.setText("Address");
		addressLabel.setBounds(16, 229, 54, 14);
		panel.add(addressLabel);

		final JLabel phoneLabel = new JLabel();
		phoneLabel.setText("PHONE");
		phoneLabel.setBounds(16, 282, 54, 20);
		panel.add(phoneLabel);

		final JLabel medicareLabel = new JLabel();
		medicareLabel.setText("MEDICARE #");
		medicareLabel.setBounds(16, 320, 104, 14);
		panel.add(medicareLabel);

		final JLabel medicaidLabel = new JLabel();
		medicaidLabel.setText("MEDICAID #");
		medicaidLabel.setBounds(16, 359, 85, 14);
		panel.add(medicaidLabel);

		final JLabel insuranceCoLabel = new JLabel();
		insuranceCoLabel.setToolTipText("");
		insuranceCoLabel.setName("");
		insuranceCoLabel.setText("INSURANCE CO.");
		insuranceCoLabel.setBounds(16, 392, 90, 14);
		panel.add(insuranceCoLabel);

		final JLabel policyLabel = new JLabel();
		policyLabel.setText("POLICY #");
		policyLabel.setBounds(16, 423, 78, 14);
		panel.add(policyLabel);

		final JLabel preauthorizationLabel = new JLabel();
		preauthorizationLabel.setText("PREAUTHORIZATION #");
		preauthorizationLabel.setBounds(16, 457, 129, 14);
		panel.add(preauthorizationLabel);

		final JLabel patientLabel = new JLabel();
		patientLabel.setText("PATIENT:");
		patientLabel.setBounds(15, 490, 54, 14);
		panel.add(patientLabel);

		cbSNF = new JCheckBox();
		cbSNF.setBackground(Color.WHITE);
		cbSNF.setText("SNF");
		cbSNF.setBounds(138, 490, 54, 18);
		panel.add(cbSNF);

		CbHomeBond = new JCheckBox();
		CbHomeBond.setAutoscrolls(false);
		CbHomeBond.setBackground(Color.WHITE);
		CbHomeBond.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		CbHomeBond.setText("Home Bond ");
		CbHomeBond.setBounds(199, 490, 94, 18);
		panel.add(CbHomeBond);

		cbOther = new JCheckBox();
		cbOther.setAutoscrolls(true);
		cbOther.setBackground(Color.WHITE);
		cbOther.setText("Other");
		cbOther.setBounds(299, 490, 88, 18);
		panel.add(cbOther);

		final JTextField txtPhone = new JTextField();
		txtPhone.setBounds(159, 282, 142, 21);
		panel.add(txtPhone);

		final JTextField txtMedicare = new JTextField();
		txtMedicare.setBounds(159, 317, 142, 21);
		panel.add(txtMedicare);

		final JTextField txtMedicaid = new JTextField();
		txtMedicaid.setBounds(159, 356, 142, 21);
		panel.add(txtMedicaid);

		final JTextField txtInsuranceCo = new JTextField();
		txtInsuranceCo.setBounds(159, 389, 142, 21);
		panel.add(txtInsuranceCo);

		final JTextField txtPolicy = new JTextField();
		txtPolicy.setBounds(159, 420, 142, 21);
		panel.add(txtPolicy);

		final JTextField txtDateOfService = new JTextField();
		txtDateOfService.setBounds(158, 40, 143, 21);
		panel.add(txtDateOfService);

		txtpreauthorization = new JTextField();
		txtpreauthorization.setBounds(159, 447, 142, 21);
		panel.add(txtpreauthorization);

		final JScrollPane scraddress = new JScrollPane();
		final JTextArea txtAddress = new JTextArea();
		txtAddress.setBorder(new LineBorder(Color.black, 1, false));
		scraddress.add(txtAddress);

		txtAddress.setBounds(159, 211, 142, 52);
		panel.add(txtAddress);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(590, 26, 240, 131);
		add(panel_2);

		final JLabel ekgxrayRequisitionLabel = new JLabel();
		ekgxrayRequisitionLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ekgxrayRequisitionLabel.setBounds(20, 10, 206, 33);
		ekgxrayRequisitionLabel.setText("EKG-X-RAY REQUISITION");
		panel_2.add(ekgxrayRequisitionLabel);

		final JLabel homeboundServiceLabel = new JLabel();
		homeboundServiceLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		homeboundServiceLabel.setText("HOMEBOUND SERVICE");
		homeboundServiceLabel.setBounds(20, 39, 193, 23);
		panel_2.add(homeboundServiceLabel);

		final JLabel accessionNumberLabel = new JLabel();
		accessionNumberLabel.setText("Accession Number");
		accessionNumberLabel.setBounds(20, 95, 110, 14);
		panel_2.add(accessionNumberLabel);

		final JTextField txtAccessionNumber = new JTextField();
		txtAccessionNumber.setBounds(136, 95, 90, 21);
		panel_2.add(txtAccessionNumber);

		final JLabel ptAccountLabel = new JLabel();
		ptAccountLabel.setText("PT Account #");
		ptAccountLabel.setBounds(136, 68, 79, 23);
		panel_2.add(ptAccountLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(590, 163, 240, 220);
		add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);

		panel_4.setLayout(null);
		panel_4.setBounds(10, 10, 207, 185);
		panel_3.add(panel_4);

		final JLabel nameLabel = new JLabel();
		nameLabel.setBounds(10, 82, 44, 14);
		panel_4.add(nameLabel);
		nameLabel.setText("Name:");

		final JLabel lastLabel_1 = new JLabel();
		lastLabel_1.setBounds(50, 60, 41, 29);
		panel_4.add(lastLabel_1);
		lastLabel_1.setText("Last");

		final JTextField txtorderingPhyLastName = new JTextField();
		txtorderingPhyLastName.setBounds(97, 68, 89, 21);
		panel_4.add(txtorderingPhyLastName);

		final JTextField txtorderingPhyFirsttName = new JTextField();
		txtorderingPhyFirsttName.setBounds(98, 97, 89, 21);
		panel_4.add(txtorderingPhyFirsttName);

		final JLabel firstLabel_1 = new JLabel();
		firstLabel_1.setBounds(51, 97, 31, 21);
		panel_4.add(firstLabel_1);
		firstLabel_1.setText("First");

		final JLabel telLabel = new JLabel();
		telLabel.setText("Tel.");
		telLabel.setBounds(10, 127, 31, 14);
		panel_4.add(telLabel);

		final JLabel faxLabel = new JLabel();
		faxLabel.setText("Fax");
		faxLabel.setBounds(10, 161, 31, 14);
		panel_4.add(faxLabel);

		final JTextField txtorderingPhyTelno = new JTextField();
		txtorderingPhyTelno.setBounds(98, 124, 89, 21);
		panel_4.add(txtorderingPhyTelno);

		final JTextField txtorderingPhyFax = new JTextField();
		txtorderingPhyFax.setBounds(98, 158, 89, 21);
		panel_4.add(txtorderingPhyFax);

		final JLabel orderingPhysicianLabel = new JLabel();
		orderingPhysicianLabel.setBounds(0, 10, 131, 23);
		panel_4.add(orderingPhysicianLabel);
		orderingPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		orderingPhysicianLabel.setText("ORDERING PHYSICIAN");

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(589, 389, 241, 205);
		add(panel_5);

		final JLabel techNameLabel = new JLabel();
		techNameLabel.setBounds(10, 21, 80, 14);
		techNameLabel.setText("Tech Name:");
		panel_5.add(techNameLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setText("Time:");
		timeLabel.setBounds(10, 55, 68, 14);
		panel_5.add(timeLabel);

		final JTextField txtTechname = new JTextField();
		txtTechname.setBounds(112, 18, 105, 21);
		panel_5.add(txtTechname);

		final JTextField txtTime = new JTextField();
		txtTime.setBounds(112, 52, 105, 21);
		panel_5.add(txtTime);

		final JTextArea txtTechComments = new JTextArea();

		txtTechComments.setBorder(new LineBorder(Color.black, 1, false));
		txtTechComments.setBounds(112, 79, 105, 83);
		panel_5.add(txtTechComments);

		final JLabel numberOfPatientsLabel = new JLabel();

		numberOfPatientsLabel.setText("   Number of Patients");
		numberOfPatientsLabel.setBounds(5, 170, 128, 24);
		panel_5.add(numberOfPatientsLabel);

		final JRadioButton rbpatient1 = new JRadioButton();
		rbpatient1.setBackground(Color.WHITE);
		rbpatient1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbpatient1.setBorder(new LineBorder(Color.black, 1, false));
		rbpatient1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rbpatient1.setText("1");
		rbpatient1.setBounds(133, 170, 25, 24);
		panel_5.add(rbpatient1);
		// rbpatient1.add(rbpatient1);
		// bgNoofPaitent.add(rbpatient1);

		final JRadioButton rbpatient3 = new JRadioButton();
		rbpatient3.setAutoscrolls(true);
		rbpatient3.setBackground(Color.WHITE);
		rbpatient3.setBorder(new LineBorder(Color.black, 1, false));
		rbpatient3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbpatient3.setText("3");
		rbpatient3.setBounds(190, 170, 32, 24);
		panel_5.add(rbpatient3);

		final JRadioButton rbpatient2 = new JRadioButton();
		rbpatient2.setBackground(Color.WHITE);
		rbpatient2.setBorder(new LineBorder(Color.black, 1, false));
		rbpatient2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbpatient2.setText("2");
		rbpatient2.setBounds(158, 170, 33, 24);
		panel_5.add(rbpatient2);

		ButtonGroup bgGroup = new ButtonGroup();
		bgGroup.add(rbpatient1);
		bgGroup.add(rbpatient2);
		bgGroup.add(rbpatient3);

		final JLabel techCommentsLabel = new JLabel();
		techCommentsLabel.setBounds(10, 79, 97, 36);
		panel_5.add(techCommentsLabel);
		techCommentsLabel.setText("Tech Comments:");

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setActionMap(null);
		panel_6.setBounds(590, 600, 240, 164);
		add(panel_6);

		final JLabel lblDiagnosisReauired = new JLabel();
		lblDiagnosisReauired.setText(" DIAGNOSIS/SYMPTOM/REASON REQUIRED");
		lblDiagnosisReauired.setBounds(0, 10, 240, 26);
		panel_6.add(lblDiagnosisReauired);

		final JTextArea txtSymptom = new JTextArea();
		txtSymptom.setBorder(new LineBorder(Color.black, 1, false));
		txtSymptom.setBounds(10, 42, 220, 32);
		panel_6.add(txtSymptom);

		final JLabel otherExamesLabel = new JLabel();
		otherExamesLabel.setText("Other Exams");
		otherExamesLabel.setBounds(10, 87, 79, 14);
		panel_6.add(otherExamesLabel);

		final JTextArea txtOtherExams = new JTextArea();
		txtOtherExams.setBorder(new LineBorder(Color.black, 1, false));
		txtOtherExams.setBounds(10, 107, 220, 28);
		panel_6.add(txtOtherExams);

		final JPanel panelAddress = new JPanel();
		panelAddress.setBackground(Color.WHITE);
		panelAddress.setLayout(null);
		panelAddress.setBounds(300, 26, 191, 185);
		add(panelAddress);

		final JLabel brooklynNy11211Label = new JLabel();
		brooklynNy11211Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		brooklynNy11211Label.setText("    Brooklyn, NY 11211");
		brooklynNy11211Label.setBounds(21, 26, 149, 14);
		panelAddress.add(brooklynNy11211Label);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setText("405 Candlewood Commons");
		label_2.setBounds(10, 66, 160, 15);
		panelAddress.add(label_2);

		final JLabel howellNj07731Label = new JLabel();
		howellNj07731Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		howellNj07731Label.setText("        Howell, NJ 07731");
		howellNj07731Label.setBounds(20, 109, 149, 14);
		panelAddress.add(howellNj07731Label);

		final JLabel tel7185941001Label = new JLabel();
		tel7185941001Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		tel7185941001Label.setText("    Tel: 718.594.1001");
		tel7185941001Label.setBounds(22, 146, 135, 14);
		panelAddress.add(tel7185941001Label);

		final JLabel fax7185941006Label = new JLabel();
		fax7185941006Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		fax7185941006Label.setText("Fax: 718.594.1006");
		fax7185941006Label.setBounds(32, 166, 107, 14);
		panelAddress.add(fax7185941006Label);

		final JLabel label = new JLabel();
		label.setBounds(10, 5, 171, 15);
		panelAddress.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setText("       101 N. 3rd Street");

		//		
		// panel_22.setLayout(null);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		// panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(275, 1020, 264, 389);
		add(panel_9);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBounds(0, 0, 193, 380);
		panel_9.add(panel_30);

		final JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.WHITE);
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBounds(0, 20, 193, 20);
		panel_30.add(panel_34);

		final JLabel chestribsLabel = new JLabel();
		chestribsLabel.setBounds(0, 0, 193, 20);
		chestribsLabel.setText("  Chest/Ribs");
		panel_34.add(chestribsLabel);

		final JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.WHITE);
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBounds(0, 40, 193, 20);
		panel_30.add(panel_36);

		final JLabel chestribsLabel_1 = new JLabel();
		chestribsLabel_1.setBounds(0, 0, 193, 20);
		panel_36.add(chestribsLabel_1);
		chestribsLabel_1.setText("  Abnormal Chest Sounds");

		final JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.WHITE);
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBounds(0, 60, 193, 20);
		panel_30.add(panel_38);

		final JLabel chestribsLabel_1_1 = new JLabel();
		chestribsLabel_1_1.setText("  Chest/Pulmonary Congestion");
		chestribsLabel_1_1.setBounds(0, 0, 193, 20);
		panel_38.add(chestribsLabel_1_1);

		final JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.WHITE);
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBounds(0, 80, 193, 20);
		panel_30.add(panel_40);

		final JLabel sympLabel_1 = new JLabel();
		sympLabel_1.setBounds(0, 0, 193, 20);
		sympLabel_1.setText("  CHF");
		panel_40.add(sympLabel_1);

		final JLabel chestpulmonaryCongestionLabel = new JLabel();
		chestpulmonaryCongestionLabel.setBounds(0, 100, 170, 20);
		panel_30.add(chestpulmonaryCongestionLabel);
		chestpulmonaryCongestionLabel.setText("  Collapsed Lung");

		final JPanel panel_43 = new JPanel();
		panel_43.setBackground(Color.WHITE);
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBounds(0, 100, 193, 20);
		panel_30.add(panel_43);

		final JPanel panel_44 = new JPanel();
		panel_44.setBackground(Color.WHITE);
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBounds(0, 120, 193, 20);
		panel_30.add(panel_44);

		final JLabel copdLabel = new JLabel();
		copdLabel.setBounds(0, 0, 193, 20);
		copdLabel.setText("  COPD");
		panel_44.add(copdLabel);

		final JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.WHITE);
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBounds(0, 140, 193, 20);
		panel_30.add(panel_56);

		final JLabel coughLabel = new JLabel();
		coughLabel.setBounds(0, 0, 193, 20);
		coughLabel.setText("  Cough");
		panel_56.add(coughLabel);

		final JPanel panel_56_1 = new JPanel();
		panel_56_1.setBackground(Color.WHITE);
		panel_56_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1.setLayout(null);
		panel_56_1.setBounds(0, 160, 193, 20);
		panel_30.add(panel_56_1);

		final JLabel coughLabel_1 = new JLabel();
		coughLabel_1.setText("  Pain-Chest/Rib");
		coughLabel_1.setBounds(0, 0, 193, 20);
		panel_56_1.add(coughLabel_1);

		final JPanel panel_56_1_1 = new JPanel();
		panel_56_1_1.setBackground(Color.WHITE);
		panel_56_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1.setLayout(null);
		panel_56_1_1.setBounds(0, 180, 193, 20);
		panel_30.add(panel_56_1_1);

		final JLabel coughLabel_1_1 = new JLabel();
		coughLabel_1_1.setText("  Pleural Effusion");
		coughLabel_1_1.setBounds(0, 0, 193, 20);
		panel_56_1_1.add(coughLabel_1_1);

		final JPanel panel_56_1_1_1 = new JPanel();
		panel_56_1_1_1.setBackground(Color.WHITE);
		panel_56_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1.setLayout(null);
		panel_56_1_1_1.setBounds(0, 200, 193, 20);
		panel_30.add(panel_56_1_1_1);

		final JLabel coughLabel_1_1_1 = new JLabel();
		coughLabel_1_1_1.setText("  Pneumonia");
		coughLabel_1_1_1.setBounds(0, 0, 193, 20);
		panel_56_1_1_1.add(coughLabel_1_1_1);

		final JPanel panel_56_1_1_1_1 = new JPanel();
		panel_56_1_1_1_1.setBackground(Color.WHITE);
		panel_56_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_56_1_1_1_1.setLayout(null);
		panel_56_1_1_1_1.setBounds(0, 220, 193, 20);
		panel_30.add(panel_56_1_1_1_1);

		final JLabel coughLabel_1_1_1_1 = new JLabel();
		coughLabel_1_1_1_1.setText("  Positive PPD");
		coughLabel_1_1_1_1.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_1.add(coughLabel_1_1_1_1);

		final JPanel panel_56_1_1_1_1_1 = new JPanel();
		panel_56_1_1_1_1_1.setBackground(Color.WHITE);
		panel_56_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1_1_1.setLayout(null);
		panel_56_1_1_1_1_1.setBounds(0, 240, 193, 20);
		panel_30.add(panel_56_1_1_1_1_1);

		final JLabel coughLabel_1_1_1_1_1 = new JLabel();
		coughLabel_1_1_1_1_1.setBackground(Color.WHITE);
		coughLabel_1_1_1_1_1.setText("  Shortness of Breath");
		coughLabel_1_1_1_1_1.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_1_1.add(coughLabel_1_1_1_1_1);

		final JPanel panel_56_1_1_1_1_2 = new JPanel();
		panel_56_1_1_1_1_2.setBackground(Color.WHITE);
		panel_56_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1_1_2.setLayout(null);
		panel_56_1_1_1_1_2.setBounds(0, 260, 193, 20);
		panel_30.add(panel_56_1_1_1_1_2);

		final JLabel coughLabel_1_1_1_1_2 = new JLabel();
		coughLabel_1_1_1_1_2.setText("  Fever/Elev Temp");
		coughLabel_1_1_1_1_2.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_1_2.add(coughLabel_1_1_1_1_2);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(0, 280, 193, 20);
		panel_30.add(panel_11);

		final JLabel discomfortTightnessInLabel = new JLabel();
		discomfortTightnessInLabel.setBounds(0, 0, 193, 20);
		discomfortTightnessInLabel.setText("  Discomfort, Tightness in Chest");
		panel_11.add(discomfortTightnessInLabel);

		final JPanel panel_56_1_1_1_2 = new JPanel();
		panel_56_1_1_1_2.setBackground(Color.WHITE);
		panel_56_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1_2.setLayout(null);
		panel_56_1_1_1_2.setBounds(0, 300, 193, 20);
		panel_30.add(panel_56_1_1_1_2);

		final JLabel coughLabel_1_1_1_2 = new JLabel();
		coughLabel_1_1_1_2.setText("  Emphysema");
		coughLabel_1_1_1_2.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_2.add(coughLabel_1_1_1_2);

		final JPanel panel_56_1_1_1_2_1 = new JPanel();
		panel_56_1_1_1_2_1.setBackground(Color.WHITE);
		panel_56_1_1_1_2_1.setLayout(null);
		panel_56_1_1_1_2_1.setBounds(0, 320, 193, 20);
		panel_30.add(panel_56_1_1_1_2_1);

		final JLabel coughLabel_1_1_1_2_1 = new JLabel();
		coughLabel_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		coughLabel_1_1_1_2_1.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_2_1.add(coughLabel_1_1_1_2_1);
		coughLabel_1_1_1_2_1.setText("  Respiratory Distress");

		final JPanel panel_56_1_1_1_2_2 = new JPanel();
		panel_56_1_1_1_2_2.setBackground(Color.WHITE);
		panel_56_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1_2_2.setLayout(null);
		panel_56_1_1_1_2_2.setBounds(0, 340, 193, 20);
		panel_30.add(panel_56_1_1_1_2_2);

		final JLabel coughLabel_1_1_1_2_2 = new JLabel();
		coughLabel_1_1_1_2_2.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_2_2.add(coughLabel_1_1_1_2_2);
		coughLabel_1_1_1_2_2.setText("  Wheezing");

		final JPanel panel_56_1_1_1_2_2_1 = new JPanel();
		panel_56_1_1_1_2_2_1.setBackground(Color.WHITE);
		panel_56_1_1_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_56_1_1_1_2_2_1.setLayout(null);
		panel_56_1_1_1_2_2_1.setBounds(0, 360, 193, 20);
		panel_30.add(panel_56_1_1_1_2_2_1);

		final JLabel coughLabel_1_1_1_2_3 = new JLabel();
		coughLabel_1_1_1_2_3.setBounds(0, 0, 193, 20);
		panel_56_1_1_1_2_2_1.add(coughLabel_1_1_1_2_3);
		coughLabel_1_1_1_2_3.setText("  PICC - Line Placement");

		final JPanel panel_34_1 = new JPanel();
		panel_34_1.setBackground(Color.LIGHT_GRAY);
		panel_34_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_34_1.setLayout(null);
		panel_34_1.setBounds(0, 0, 193, 20);
		panel_30.add(panel_34_1);

		final JLabel chestribsLabel_2 = new JLabel();
		chestribsLabel_2.setText("  SYMPTOMS/DIAGNOSIS/REASON");
		chestribsLabel_2.setBounds(0, 0, 193, 20);
		panel_34_1.add(chestribsLabel_2);

		final JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBounds(193, 0, 71, 380);
		panel_9.add(panel_31);

		final JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.WHITE);
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBounds(0, 40, 71, 20);
		panel_31.add(panel_37);

		final JLabel label_27 = new JLabel();
		label_27.setBounds(0, 0, 71, 20);
		panel_37.add(label_27);
		label_27.setText("       786.7");

		final JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.WHITE);
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);

		panel_39.setBounds(0, 60, 71, 20);
		panel_31.add(panel_39);

		final JLabel label_26 = new JLabel();
		label_26.setBorder(new EmptyBorder(0, 0, 0, 0));
		label_26.setBounds(0, 0, 71, 20);
		panel_39.add(label_26);
		label_26.setText("       514");

		final JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.WHITE);
		panel_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_41.setLayout(null);
		panel_41.setBounds(0, 80, 71, 20);
		panel_31.add(panel_41);

		final JLabel label_28 = new JLabel();
		label_28.setText("       428.0");
		label_28.setBounds(0, 0, 71, 20);
		panel_41.add(label_28);

		final JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.WHITE);
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBounds(0, 100, 71, 20);
		panel_31.add(panel_42);

		final JLabel label_29 = new JLabel();
		label_29.setText("       518");
		label_29.setBounds(0, 0, 71, 20);
		panel_42.add(label_29);

		final JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.WHITE);
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBounds(0, 120, 71, 20);
		panel_31.add(panel_45);

		final JLabel label_41 = new JLabel();
		label_41.setText("       496");
		label_41.setBounds(0, 0, 71, 20);
		panel_45.add(label_41);

		final JPanel panel_45_1 = new JPanel();
		panel_45_1.setBackground(Color.WHITE);
		panel_45_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1.setLayout(null);
		panel_45_1.setBounds(0, 140, 71, 20);
		panel_31.add(panel_45_1);

		final JLabel label_41_1 = new JLabel();
		label_41_1.setText("       786.2");
		label_41_1.setBounds(0, 0, 71, 20);
		panel_45_1.add(label_41_1);

		final JPanel panel_45_1_1 = new JPanel();
		panel_45_1_1.setBackground(Color.WHITE);
		panel_45_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1.setLayout(null);
		panel_45_1_1.setBounds(0, 160, 71, 20);
		panel_31.add(panel_45_1_1);

		final JLabel label_41_1_1 = new JLabel();
		label_41_1_1.setText("       786.50");
		label_41_1_1.setBounds(0, 0, 71, 20);
		panel_45_1_1.add(label_41_1_1);

		final JPanel panel_45_1_1_1 = new JPanel();
		panel_45_1_1_1.setBackground(Color.WHITE);
		panel_45_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1_1.setLayout(null);
		panel_45_1_1_1.setBounds(0, 180, 71, 20);
		panel_31.add(panel_45_1_1_1);

		final JLabel label_41_1_1_1 = new JLabel();
		label_41_1_1_1.setText("       511.9");
		label_41_1_1_1.setBounds(0, 0, 71, 20);
		panel_45_1_1_1.add(label_41_1_1_1);

		final JPanel panel_45_1_1_1_1 = new JPanel();
		panel_45_1_1_1_1.setBackground(Color.WHITE);
		panel_45_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1_1_1.setLayout(null);
		panel_45_1_1_1_1.setBounds(0, 200, 71, 20);
		panel_31.add(panel_45_1_1_1_1);

		final JLabel label_41_1_1_1_1 = new JLabel();
		label_41_1_1_1_1.setText("       486");
		label_41_1_1_1_1.setBounds(0, 0, 71, 20);
		panel_45_1_1_1_1.add(label_41_1_1_1_1);

		final JPanel panel_45_1_1_1_1_1 = new JPanel();
		panel_45_1_1_1_1_1.setBackground(Color.WHITE);
		panel_45_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1_1_1_1.setLayout(null);
		panel_45_1_1_1_1_1.setBounds(0, 220, 71, 20);
		panel_31.add(panel_45_1_1_1_1_1);

		final JLabel label_41_1_1_1_1_1 = new JLabel();
		label_41_1_1_1_1_1.setText("       795.5");
		label_41_1_1_1_1_1.setBounds(0, 0, 71, 20);
		panel_45_1_1_1_1_1.add(label_41_1_1_1_1_1);

		final JPanel panel_45_1_1_1_1_2 = new JPanel();
		panel_45_1_1_1_1_2.setBackground(Color.WHITE);
		panel_45_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1_1_1_2.setLayout(null);
		panel_45_1_1_1_1_2.setBounds(0, 240, 71, 20);
		panel_31.add(panel_45_1_1_1_1_2);

		final JLabel label_41_1_1_1_1_2 = new JLabel();
		label_41_1_1_1_1_2.setText("       786.05");
		label_41_1_1_1_1_2.setBounds(0, 0, 71, 20);
		panel_45_1_1_1_1_2.add(label_41_1_1_1_1_2);

		final JPanel panel_45_1_1_1_1_3 = new JPanel();
		panel_45_1_1_1_1_3.setBackground(Color.WHITE);
		panel_45_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_45_1_1_1_1_3.setLayout(null);
		panel_45_1_1_1_1_3.setBounds(0, 260, 71, 20);
		panel_31.add(panel_45_1_1_1_1_3);

		final JLabel label_41_1_1_1_1_3 = new JLabel();
		label_41_1_1_1_1_3.setBackground(Color.WHITE);
		label_41_1_1_1_1_3.setText("       780.6");
		label_41_1_1_1_1_3.setBounds(0, 0, 71, 20);
		panel_45_1_1_1_1_3.add(label_41_1_1_1_1_3);

		final JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.WHITE);
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBounds(0, 280, 71, 20);
		panel_31.add(panel_57);

		final JLabel label_42 = new JLabel();
		label_42.setBounds(0, 0, 71, 20);
		label_42.setText("       786.59");
		panel_57.add(label_42);

		final JPanel panel_59 = new JPanel();
		panel_59.setBackground(Color.WHITE);
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBounds(0, 300, 71, 20);
		panel_31.add(panel_59);

		final JLabel label_43 = new JLabel();
		label_43.setBounds(0, 0, 71, 20);
		label_43.setText("       492.8");
		panel_59.add(label_43);

		final JPanel panel_59_1 = new JPanel();
		panel_59_1.setBackground(Color.WHITE);
		panel_59_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_59_1.setLayout(null);
		panel_59_1.setBounds(0, 320, 71, 20);
		panel_31.add(panel_59_1);

		final JLabel label_43_1 = new JLabel();
		label_43_1.setText("       786.09");
		label_43_1.setBounds(0, 0, 71, 20);
		panel_59_1.add(label_43_1);

		final JPanel panel_59_2 = new JPanel();
		panel_59_2.setBackground(Color.WHITE);
		panel_59_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_59_2.setLayout(null);
		panel_59_2.setBounds(0, 340, 71, 20);
		panel_31.add(panel_59_2);

		final JLabel label_43_2 = new JLabel();
		label_43_2.setBackground(Color.WHITE);
		label_43_2.setText("       786.07");
		label_43_2.setBounds(0, 0, 71, 20);
		panel_59_2.add(label_43_2);

		final JPanel panel_59_3 = new JPanel();
		panel_59_3.setBackground(Color.WHITE);
		panel_59_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_59_3.setLayout(null);
		panel_59_3.setBounds(0, 360, 71, 20);
		panel_31.add(panel_59_3);

		final JLabel v5881Label = new JLabel();
		v5881Label.setText("       V58.81");
		v5881Label.setBounds(0, 0, 71, 20);
		panel_59_3.add(v5881Label);

		final JPanel panel_37_1 = new JPanel();
		panel_37_1.setBackground(Color.WHITE);
		panel_37_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_37_1.setLayout(null);
		panel_37_1.setBounds(0, 20, 71, 20);
		panel_31.add(panel_37_1);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.LIGHT_GRAY);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 71, 20);
		panel_31.add(panel_15);

		final JLabel diagCodeLabel = new JLabel();
		diagCodeLabel.setText(" DIAG. CODE");
		diagCodeLabel.setBounds(0, 0, 71, 20);
		panel_15.add(diagCodeLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);

		panel_10.setBounds(566, 770, 264, 263);
		add(panel_10);

		final JPanel panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBounds(193, 0, 71, 260);
		panel_10.add(panel_60);

		final JPanel panel_64 = new JPanel();
		panel_64.setBackground(Color.LIGHT_GRAY);
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBounds(0, 0, 71, 20);
		panel_60.add(panel_64);

		final JLabel diagCodeLabel_1 = new JLabel();
		diagCodeLabel_1.setBounds(0, 0, 71, 20);
		panel_64.add(diagCodeLabel_1);
		diagCodeLabel_1.setText(" DIAG. CODE");

		final JPanel panel_65 = new JPanel();
		panel_65.setBackground(Color.WHITE);
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBounds(0, 20, 71, 20);
		panel_60.add(panel_65);

		final JPanel panel_65_1 = new JPanel();
		panel_65_1.setBackground(Color.WHITE);
		panel_65_1.setLayout(null);
		panel_65_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_1.setBounds(0, 40, 71, 20);
		panel_60.add(panel_65_1);

		final JLabel label_40 = new JLabel();
		label_40.setBounds(0, 0, 71, 20);
		label_40.setText("       787.3");
		panel_65_1.add(label_40);

		final JPanel panel_65_2 = new JPanel();
		panel_65_2.setBackground(Color.WHITE);
		panel_65_2.setLayout(null);
		panel_65_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_2.setBounds(0, 60, 71, 20);
		panel_60.add(panel_65_2);

		final JLabel label_45 = new JLabel();
		label_45.setBounds(0, 0, 71, 20);
		panel_65_2.add(label_45);
		label_45.setText("       789.4");

		final JPanel panel_65_3 = new JPanel();
		panel_65_3.setBackground(Color.WHITE);
		panel_65_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_3.setLayout(null);
		panel_65_3.setBounds(0, 80, 71, 20);
		panel_60.add(panel_65_3);

		final JLabel label_46 = new JLabel();
		label_46.setBounds(0, 0, 71, 20);
		panel_65_3.add(label_46);
		label_46.setText("       787.5");

		final JPanel panel_65_4 = new JPanel();
		panel_65_4.setBackground(Color.WHITE);
		panel_65_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_4.setLayout(null);
		panel_65_4.setBounds(0, 100, 71, 20);
		panel_60.add(panel_65_4);

		final JLabel label_47 = new JLabel();
		label_47.setBounds(0, 0, 71, 20);
		panel_65_4.add(label_47);
		label_47.setText("       564.00");

		final JPanel panel_65_5 = new JPanel();
		panel_65_5.setBackground(Color.WHITE);
		panel_65_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_5.setLayout(null);
		panel_65_5.setBounds(0, 120, 71, 20);
		panel_60.add(panel_65_5);

		final JLabel label_48 = new JLabel();
		label_48.setText("       787.91");
		label_48.setBounds(0, 0, 71, 20);
		panel_65_5.add(label_48);

		final JPanel panel_65_6 = new JPanel();
		panel_65_6.setBackground(Color.WHITE);
		panel_65_6.setBorder(new LineBorder(Color.black, 1, false));

		panel_65_6.setLayout(null);
		panel_65_6.setBounds(0, 140, 71, 20);
		panel_60.add(panel_65_6);

		final JLabel label_49 = new JLabel();
		label_49.setBackground(Color.WHITE);
		label_49.setText("       560.1");
		label_49.setBounds(0, 0, 71, 20);
		panel_65_6.add(label_49);

		final JPanel panel_65_7 = new JPanel();
		panel_65_7.setBackground(Color.WHITE);
		panel_65_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_7.setLayout(null);
		panel_65_7.setBounds(0, 160, 71, 20);
		panel_60.add(panel_65_7);

		final JLabel label_50 = new JLabel();
		label_50.setText("       560.9");
		label_50.setBounds(0, 0, 71, 20);
		panel_65_7.add(label_50);

		final JPanel panel_65_8 = new JPanel();
		panel_65_8.setBackground(Color.WHITE);
		panel_65_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_8.setLayout(null);
		panel_65_8.setBounds(0, 180, 71, 20);
		panel_60.add(panel_65_8);

		final JLabel label_51 = new JLabel();
		label_51.setText("       787.02");
		label_51.setBounds(0, 0, 71, 20);
		panel_65_8.add(label_51);

		final JPanel panel_65_9 = new JPanel();
		panel_65_9.setBackground(Color.WHITE);
		panel_65_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_9.setLayout(null);
		panel_65_9.setBounds(0, 200, 71, 20);
		panel_60.add(panel_65_9);

		final JLabel label_52 = new JLabel();
		label_52.setText("       789.00");
		label_52.setBounds(0, 0, 71, 20);
		panel_65_9.add(label_52);

		final JPanel panel_65_10 = new JPanel();
		panel_65_10.setBackground(Color.WHITE);
		panel_65_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10.setLayout(null);
		panel_65_10.setBounds(0, 220, 71, 20);
		panel_60.add(panel_65_10);

		final JLabel label_53 = new JLabel();
		label_53.setText("       536.8");
		label_53.setBounds(0, 0, 71, 20);
		panel_65_10.add(label_53);

		final JPanel panel_65_10_1 = new JPanel();
		panel_65_10_1.setBackground(Color.WHITE);
		panel_65_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1.setLayout(null);
		panel_65_10_1.setBounds(0, 240, 71, 20);
		panel_60.add(panel_65_10_1);

		final JLabel label_54 = new JLabel();
		label_54.setText("       787.03");
		label_54.setBounds(0, 0, 71, 20);
		panel_65_10_1.add(label_54);

		final JPanel panel_66_1 = new JPanel();
		panel_66_1.setBackground(Color.WHITE);
		panel_66_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1.setLayout(null);
		panel_66_1.setBounds(0, 20, 193, 20);
		panel_10.add(panel_66_1);

		final JLabel abnormalDisentionLabel = new JLabel();
		abnormalDisentionLabel.setBackground(Color.WHITE);
		abnormalDisentionLabel.setBounds(0, 0, 193, 19);
		panel_66_1.add(abnormalDisentionLabel);
		abnormalDisentionLabel.setText("  Abdomen");

		final JPanel panel_66_1_1 = new JPanel();
		panel_66_1_1.setBackground(Color.WHITE);
		panel_66_1_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_66_1_1.setLayout(null);
		panel_66_1_1.setBounds(0, 40, 193, 20);
		panel_10.add(panel_66_1_1);

		final JLabel abnormalDisentionLabel_1 = new JLabel();
		abnormalDisentionLabel_1.setText("  Abnormal Disention");
		abnormalDisentionLabel_1.setBounds(0, 0, 193, 20);
		panel_66_1_1.add(abnormalDisentionLabel_1);

		final JPanel panel_66_1_2 = new JPanel();
		panel_66_1_2.setBackground(Color.WHITE);
		panel_66_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_2.setLayout(null);
		panel_66_1_2.setBounds(0, 60, 193, 20);
		panel_10.add(panel_66_1_2);

		final JLabel abnormalDisentionLabel_1_1 = new JLabel();
		abnormalDisentionLabel_1_1.setText("  Abnormal Rigidity");
		abnormalDisentionLabel_1_1.setBounds(0, 0, 193, 20);
		panel_66_1_2.add(abnormalDisentionLabel_1_1);

		final JPanel panel_66_1_3 = new JPanel();
		panel_66_1_3.setBackground(Color.WHITE);
		panel_66_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_3.setLayout(null);
		panel_66_1_3.setBounds(0, 80, 193, 20);
		panel_10.add(panel_66_1_3);

		final JLabel abnormalDisentionLabel_1_2 = new JLabel();
		abnormalDisentionLabel_1_2.setText("  Abnormal Bowel sounds");
		abnormalDisentionLabel_1_2.setBounds(0, 0, 193, 20);
		panel_66_1_3.add(abnormalDisentionLabel_1_2);

		final JPanel panel_66_1_4 = new JPanel();
		panel_66_1_4.setBackground(Color.WHITE);
		panel_66_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_4.setLayout(null);
		panel_66_1_4.setBounds(0, 100, 193, 20);
		panel_10.add(panel_66_1_4);

		final JLabel abnormalDisentionLabel_1_3 = new JLabel();
		abnormalDisentionLabel_1_3.setText("  Constipation");
		abnormalDisentionLabel_1_3.setBounds(0, 0, 193, 20);
		panel_66_1_4.add(abnormalDisentionLabel_1_3);

		final JPanel panel_66_1_5 = new JPanel();
		panel_66_1_5.setBackground(Color.WHITE);
		panel_66_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_5.setLayout(null);
		panel_66_1_5.setBounds(0, 120, 193, 20);
		panel_10.add(panel_66_1_5);

		final JLabel abnormalDisentionLabel_1_3_1 = new JLabel();
		abnormalDisentionLabel_1_3_1.setText("  Diarrhea");
		abnormalDisentionLabel_1_3_1.setBounds(0, 0, 193, 20);
		panel_66_1_5.add(abnormalDisentionLabel_1_3_1);

		final JPanel panel_66_1_6 = new JPanel();
		panel_66_1_6.setBackground(Color.WHITE);
		panel_66_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_6.setLayout(null);
		panel_66_1_6.setBounds(0, 140, 193, 20);
		panel_10.add(panel_66_1_6);

		final JLabel abnormalDisentionLabel_1_2_1 = new JLabel();
		abnormalDisentionLabel_1_2_1.setText("  Ileus");
		abnormalDisentionLabel_1_2_1.setBounds(0, 0, 193, 20);
		panel_66_1_6.add(abnormalDisentionLabel_1_2_1);

		final JPanel panel_66_1_7 = new JPanel();
		panel_66_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_7.setLayout(null);
		panel_66_1_7.setBounds(0, 160, 193, 20);
		panel_10.add(panel_66_1_7);

		final JLabel abnormalDisentionLabel_1_3_3 = new JLabel();
		abnormalDisentionLabel_1_3_3.setText("  Intestinal Obstruction");
		abnormalDisentionLabel_1_3_3.setBounds(0, 0, 193, 20);
		panel_66_1_7.add(abnormalDisentionLabel_1_3_3);

		final JPanel panel_66_1_6_2 = new JPanel();
		panel_66_1_6_2.setBackground(Color.WHITE);
		panel_66_1_6_2.setBounds(0, 0, 193, 20);
		panel_66_1_7.add(panel_66_1_6_2);
		panel_66_1_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_6_2.setLayout(null);

		final JPanel panel_66_1_8 = new JPanel();
		panel_66_1_8.setBackground(Color.WHITE);
		panel_66_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_8.setLayout(null);
		panel_66_1_8.setBounds(0, 180, 193, 20);
		panel_10.add(panel_66_1_8);

		final JLabel abnormalDisentionLabel_1_3_6 = new JLabel();
		abnormalDisentionLabel_1_3_6.setText("  Nausea");
		abnormalDisentionLabel_1_3_6.setBounds(0, 0, 193, 20);
		panel_66_1_8.add(abnormalDisentionLabel_1_3_6);

		final JPanel panel_66_1_9 = new JPanel();
		panel_66_1_9.setBackground(Color.WHITE);
		panel_66_1_9.setBorder(new LineBorder(Color.black, 1, false));

		panel_66_1_9.setLayout(null);
		panel_66_1_9.setBounds(0, 200, 193, 20);
		panel_10.add(panel_66_1_9);

		final JLabel abnormalDisentionLabel_1_3_4 = new JLabel();
		abnormalDisentionLabel_1_3_4.setText("  Pain-Abdominal (cramps)");
		abnormalDisentionLabel_1_3_4.setBounds(0, 0, 193, 20);
		panel_66_1_9.add(abnormalDisentionLabel_1_3_4);

		final JPanel panel_66_1_10 = new JPanel();
		panel_66_1_10.setBackground(Color.WHITE);
		panel_66_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10.setLayout(null);
		panel_66_1_10.setBounds(0, 220, 193, 20);
		panel_10.add(panel_66_1_10);

		final JLabel abnormalDisentionLabel_1_3_5 = new JLabel();
		abnormalDisentionLabel_1_3_5.setText("  Pain-Stomach");
		abnormalDisentionLabel_1_3_5.setBounds(0, 0, 193, 20);
		panel_66_1_10.add(abnormalDisentionLabel_1_3_5);

		final JPanel panel_34_1_1 = new JPanel();
		panel_34_1_1.setBackground(Color.LIGHT_GRAY);
		panel_34_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_34_1_1.setLayout(null);
		panel_34_1_1.setBounds(0, 0, 193, 20);
		panel_10.add(panel_34_1_1);

		final JLabel chestribsLabel_2_1 = new JLabel();
		chestribsLabel_2_1.setText("  SYMPTOMS/DIAGNOSIS/REASON");
		chestribsLabel_2_1.setBounds(0, 0, 193, 20);
		panel_34_1_1.add(chestribsLabel_2_1);

		final JPanel panel_66_1_10_1 = new JPanel();
		panel_66_1_10_1.setBackground(Color.WHITE);
		panel_66_1_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1.setLayout(null);
		panel_66_1_10_1.setBounds(0, 240, 193, 20);
		panel_10.add(panel_66_1_10_1);

		final JLabel abnormalDisentionLabel_1_3_5_2 = new JLabel();
		abnormalDisentionLabel_1_3_5_2.setText("  Vomiting");
		abnormalDisentionLabel_1_3_5_2.setBounds(0, 0, 193, 20);
		panel_66_1_10_1.add(abnormalDisentionLabel_1_3_5_2);
		// panel_8.setBorder(new LineBorder(Color.black, 1, false));

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(21, 757, 230, 648);
		add(panel_7);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(4, 4, 225, 634);
		panel_7.add(panel_2_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
		panel_3_1.setForeground(Color.WHITE);
		panel_3_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 0, 225, 76);
		panel_2_1.add(panel_3_1);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.LIGHT_GRAY);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(0, 0, 158, 19);
		panel_3_1.add(panel_4_1);

		final JLabel xrayExamsLabel = new JLabel();
		xrayExamsLabel.setText("  X-RAY EXAMS");
		xrayExamsLabel.setBounds(0, 0, 125, 19);
		panel_4_1.add(xrayExamsLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 19, 54, 19);
		panel_3_1.add(panel_5_1);

		final JLabel label_3 = new JLabel();
		label_3.setText("  200");
		label_3.setBounds(0, 0, 54, 19);
		panel_5_1.add(label_3);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2.setBounds(158, 19, 67, 19);
		panel_3_1.add(panel_1_2);

		final JLabel label_4 = new JLabel();
		label_4.setBounds(0, 0, 67, 19);
		label_4.setText("        2");
		panel_1_2.add(label_4);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(54, 19, 104, 19);
		panel_3_1.add(panel_6_1);

		final JLabel abdomenLabel_2 = new JLabel();
		abdomenLabel_2.setText("  Abdomen");
		abdomenLabel_2.setBounds(0, 0, 78, 14);
		panel_6_1.add(abdomenLabel_2);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(Color.WHITE);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 38, 54, 19);
		panel_3_1.add(panel_5_1_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1.setText("  210");
		label_3_1.setBounds(0, 0, 54, 19);
		panel_5_1_1.add(label_3_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(Color.WHITE);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(54, 38, 104, 19);
		panel_3_1.add(panel_6_1_1);

		final JLabel abdomenLabel_2_1 = new JLabel();
		abdomenLabel_2_1.setText("  Chest");
		abdomenLabel_2_1.setBounds(0, 0, 54, 14);
		panel_6_1_1.add(abdomenLabel_2_1);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(158, 38, 67, 19);
		panel_3_1.add(panel_1_2_1);

		final JLabel label_4_1_1 = new JLabel();
		label_4_1_1.setText(" ");
		label_4_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1.add(label_4_1_1);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBounds(158, 0, 67, 19);
		panel_3_1.add(panel_12);

		final JLabel ofViewsLabel_1 = new JLabel();
		ofViewsLabel_1.setBounds(0, 0, 67, 19);
		ofViewsLabel_1.setText(" # of Views");
		panel_12.add(ofViewsLabel_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, 57, 54, 19);
		panel_3_1.add(panel_5_1_1_1);

		final JLabel label_3_1_1 = new JLabel();
		label_3_1_1.setText("  220");
		label_3_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1.add(label_3_1_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(54, 57, 104, 19);
		panel_3_1.add(panel_6_1_1_1);

		final JLabel abdomenLabel_2_1_1 = new JLabel();
		abdomenLabel_2_1_1.setText("  Ribs");
		abdomenLabel_2_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1.add(abdomenLabel_2_1_1);

		final JLabel rtLabel = new JLabel();
		rtLabel.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel.setText(" Rt");
		rtLabel.setBounds(60, 0, 22, 19);
		panel_6_1_1_1.add(rtLabel);

		final JLabel rtLabel_1 = new JLabel();
		rtLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1.setText("  Lt");
		rtLabel_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1.add(rtLabel_1);

		final JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1.setLayout(null);
		panel_1_2_1_1.setBounds(158, 57, 67, 19);
		panel_3_1.add(panel_1_2_1_1);

		final JLabel label_4_1_1_1 = new JLabel();
		label_4_1_1_1.setText("        3");
		label_4_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1.add(label_4_1_1_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(0, 76, 225, 214);
		panel_2_1.add(panel_3_1_1);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(Color.LIGHT_GRAY);
		panel_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(0, 0, 158, 19);
		panel_3_1_1.add(panel_4_1_1);

		final JLabel xrayExamsLabel_1 = new JLabel();
		xrayExamsLabel_1.setText("  UPPER EXTREMITY EXAMS");
		xrayExamsLabel_1.setBounds(0, 0, 158, 19);
		panel_4_1_1.add(xrayExamsLabel_1);

		final JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_5_1_2.setBackground(Color.WHITE);
		panel_5_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBounds(0, 19, 54, 19);
		panel_3_1_1.add(panel_5_1_2);

		final JLabel label_3_2 = new JLabel();
		label_3_2.setText("  230");
		label_3_2.setBounds(0, 0, 54, 19);
		panel_5_1_2.add(label_3_2);

		final JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBackground(Color.WHITE);
		panel_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBounds(158, 19, 67, 19);
		panel_3_1_1.add(panel_1_2_2);

		final JLabel label_4_2 = new JLabel();
		label_4_2.setText("        3");
		label_4_2.setBounds(0, 0, 55, 19);
		panel_1_2_2.add(label_4_2);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2.setLayout(null);
		panel_5_1_1_2.setBounds(0, 38, 54, 19);
		panel_3_1_1.add(panel_5_1_1_2);

		final JLabel label_3_1_2 = new JLabel();
		label_3_1_2.setText("  240");
		label_3_1_2.setBounds(0, 0, 54, 19);
		panel_5_1_1_2.add(label_3_1_2);

		final JPanel panel_1_2_1_2 = new JPanel();
		panel_1_2_1_2
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_1_2_1_2.setBackground(Color.WHITE);
		panel_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_2.setLayout(null);
		panel_1_2_1_2.setBounds(158, 38, 67, 19);
		panel_3_1_1.add(panel_1_2_1_2);

		final JLabel label_4_1_1_2 = new JLabel();
		label_4_1_1_2.setBackground(Color.WHITE);
		label_4_1_1_2.setText("        3");
		label_4_1_1_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_2.add(label_4_1_1_2);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setBackground(Color.LIGHT_GRAY);
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(158, 0, 67, 19);
		panel_3_1_1.add(panel_12_1);

		final JPanel panel_5_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1.setLayout(null);
		panel_5_1_1_1_1.setBounds(0, 57, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1);

		final JLabel label_3_1_1_1 = new JLabel();
		label_3_1_1_1.setText("  250");
		label_3_1_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1.add(label_3_1_1_1);

		final JPanel panel_6_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(54, 57, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1);

		final JLabel abdomenLabel_2_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1.setText("   Fingers");
		abdomenLabel_2_1_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1.add(abdomenLabel_2_1_1_1);

		final JLabel rtLabel_2 = new JLabel();
		rtLabel_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2.setText("  Rt");
		rtLabel_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1.add(rtLabel_2);

		final JLabel rtLabel_1_1 = new JLabel();
		rtLabel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1.setText("  Lt");
		rtLabel_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1.add(rtLabel_1_1);

		final JPanel panel_1_2_1_1_1 = new JPanel();
		panel_1_2_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1.setLayout(null);
		panel_1_2_1_1_1.setBounds(158, 57, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1);

		final JLabel label_4_1_1_1_1 = new JLabel();
		label_4_1_1_1_1.setText("        3");
		label_4_1_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1.add(label_4_1_1_1_1);

		final JPanel panel_6_1_1_1_2 = new JPanel();
		panel_6_1_1_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2.setLayout(null);
		panel_6_1_1_1_2.setBounds(54, 19, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_2);

		final JLabel abdomenLabel_2_1_1_2 = new JLabel();
		abdomenLabel_2_1_1_2.setText("  Clavicle");
		abdomenLabel_2_1_1_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_2.add(abdomenLabel_2_1_1_2);

		final JLabel rtLabel_3 = new JLabel();
		rtLabel_3.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_3.setText("  Rt");
		rtLabel_3.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_2.add(rtLabel_3);

		final JLabel rtLabel_1_2 = new JLabel();
		rtLabel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_2.setText("  Lt");
		rtLabel_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_2.add(rtLabel_1_2);

		final JPanel panel_6_1_1_1_2_1 = new JPanel();
		panel_6_1_1_1_2_1.setBackground(Color.WHITE);
		panel_6_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_1.setLayout(null);
		panel_6_1_1_1_2_1.setBounds(54, 38, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_2_1);

		final JLabel abdomenLabel_2_1_1_2_1 = new JLabel();
		abdomenLabel_2_1_1_2_1.setText("   Elbow");
		abdomenLabel_2_1_1_2_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_2_1.add(abdomenLabel_2_1_1_2_1);

		final JLabel rtLabel_3_1 = new JLabel();
		rtLabel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_3_1.setText("  Rt");
		rtLabel_3_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_2_1.add(rtLabel_3_1);

		final JLabel rtLabel_1_2_1 = new JLabel();
		rtLabel_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_2_1.setText("  Lt");
		rtLabel_1_2_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_2_1.add(rtLabel_1_2_1);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 76, 225, 24);
		panel_3_1_1.add(panel_13);
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setText("               1   2   3   4   5 ");
		label_5.setBounds(0, 0, 215, 24);
		panel_13.add(label_5);

		final JPanel panel_5_1_1_1_1_2 = new JPanel();
		panel_5_1_1_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_2.setLayout(null);
		panel_5_1_1_1_1_2.setBounds(0, 100, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_2);

		final JLabel label_6 = new JLabel();
		label_6.setText("  260");
		label_6.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_2.add(label_6);

		final JPanel panel_6_1_1_1_1_2 = new JPanel();
		panel_6_1_1_1_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2.setLayout(null);
		panel_6_1_1_1_1_2.setBounds(54, 100, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2);

		final JLabel abdomenLabel_2_1_1_1_2 = new JLabel();
		abdomenLabel_2_1_1_1_2.setText("  Forearm");
		abdomenLabel_2_1_1_1_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2.add(abdomenLabel_2_1_1_1_2);

		final JLabel rtLabel_2_2 = new JLabel();
		rtLabel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2.setText("  Rt");
		rtLabel_2_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2.add(rtLabel_2_2);

		final JLabel rtLabel_1_1_2 = new JLabel();
		rtLabel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2.setText("  Lt");
		rtLabel_1_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2.add(rtLabel_1_1_2);

		final JPanel panel_1_2_1_1_1_2 = new JPanel();
		panel_1_2_1_1_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_2.setLayout(null);
		panel_1_2_1_1_1_2.setBounds(158, 100, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_2);

		final JLabel label_4_1_1_1_1_2 = new JLabel();
		label_4_1_1_1_1_2.setText("        2");
		label_4_1_1_1_1_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_2.add(label_4_1_1_1_1_2);

		final JPanel panel_5_1_1_1_1_2_1 = new JPanel();
		panel_5_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_2_1.setLayout(null);
		panel_5_1_1_1_1_2_1.setBounds(0, 119, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_2_1);

		final JLabel label_3_1_1_1_4 = new JLabel();
		label_3_1_1_1_4.setText("  270");
		label_3_1_1_1_4.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_2_1.add(label_3_1_1_1_4);

		final JPanel panel_6_1_1_1_1_2_1 = new JPanel();
		panel_6_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_1.setLayout(null);
		panel_6_1_1_1_1_2_1.setBounds(54, 119, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2_1);

		final JLabel abdomenLabel_2_1_1_1_2_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1.setText("  Hand");
		abdomenLabel_2_1_1_1_2_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1.add(abdomenLabel_2_1_1_1_2_1);

		final JLabel rtLabel_2_2_1 = new JLabel();
		rtLabel_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1.setText("  Rt");
		rtLabel_2_2_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1.add(rtLabel_2_2_1);

		final JLabel rtLabel_1_1_2_1 = new JLabel();
		rtLabel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1.setText("  Lt");
		rtLabel_1_1_2_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1.add(rtLabel_1_1_2_1);

		final JPanel panel_1_2_1_1_1_3 = new JPanel();
		panel_1_2_1_1_1_3.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3.setLayout(null);
		panel_1_2_1_1_1_3.setBounds(158, 119, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_3);

		final JLabel label_4_1_1_1_1_3 = new JLabel();
		label_4_1_1_1_1_3.setText("        3");
		label_4_1_1_1_1_3.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3.add(label_4_1_1_1_1_3);

		final JPanel panel_5_1_1_1_1_3 = new JPanel();
		panel_5_1_1_1_1_3.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3.setLayout(null);
		panel_5_1_1_1_1_3.setBounds(0, 138, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_3);

		final JLabel label_3_1_1_1_3 = new JLabel();
		label_3_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3.setText("  280");
		label_3_1_1_1_3.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3.add(label_3_1_1_1_3);

		final JPanel panel_6_1_1_1_1_2_1_1 = new JPanel();
		panel_6_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_1_1.setLayout(null);
		panel_6_1_1_1_1_2_1_1.setBounds(54, 138, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2_1_1);

		final JLabel abdomenLabel_2_1_1_1_2_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1.setText("  Humerus");
		abdomenLabel_2_1_1_1_2_1_1.setBounds(0, 0, 60, 19);
		panel_6_1_1_1_1_2_1_1.add(abdomenLabel_2_1_1_1_2_1_1);

		final JLabel rtLabel_2_2_1_1 = new JLabel();
		rtLabel_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1.setText("  Rt");
		rtLabel_2_2_1_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1.add(rtLabel_2_2_1_1);

		final JLabel rtLabel_1_1_2_1_1 = new JLabel();
		rtLabel_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1.setText("  Lt");
		rtLabel_1_1_2_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1.add(rtLabel_1_1_2_1_1);

		final JPanel panel_1_2_1_1_1_3_1 = new JPanel();
		panel_1_2_1_1_1_3_1
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_1_2_1_1_1_3_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_1.setLayout(null);
		panel_1_2_1_1_1_3_1.setBounds(157, 138, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_3_1);

		final JLabel label_4_1_1_1_1_3_1 = new JLabel();
		label_4_1_1_1_1_3_1.setText("        2");
		label_4_1_1_1_1_3_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1.add(label_4_1_1_1_1_3_1);

		final JPanel panel_5_1_1_1_1_3_1 = new JPanel();
		panel_5_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_1.setLayout(null);
		panel_5_1_1_1_1_3_1.setBounds(0, 157, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_3_1);

		final JLabel label_3_1_1_1_3_1 = new JLabel();
		label_3_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_1.setText("  290");
		label_3_1_1_1_3_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_1.add(label_3_1_1_1_3_1);

		final JPanel panel_6_1_1_1_1_2_1_1_1 = new JPanel();
		panel_6_1_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_1_1_1.setLayout(null);
		panel_6_1_1_1_1_2_1_1_1.setBounds(54, 157, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2_1_1_1);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_1.setText("  Scapula");
		abdomenLabel_2_1_1_1_2_1_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1_1_1.add(abdomenLabel_2_1_1_1_2_1_1_1);

		final JLabel rtLabel_2_2_1_1_1 = new JLabel();
		rtLabel_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_1.setText("  Rt");
		rtLabel_2_2_1_1_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1.add(rtLabel_2_2_1_1_1);

		final JLabel rtLabel_1_1_2_1_1_1 = new JLabel();
		rtLabel_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_1.setText("  Lt");
		rtLabel_1_1_2_1_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1.add(rtLabel_1_1_2_1_1_1);

		final JPanel panel_1_2_1_1_1_3_1_1 = new JPanel();
		panel_1_2_1_1_1_3_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_1_1.setLayout(null);
		panel_1_2_1_1_1_3_1_1.setBounds(157, 157, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_3_1_1);

		final JLabel label_4_1_1_1_1_3_1_1 = new JLabel();
		label_4_1_1_1_1_3_1_1.setText("        2");
		label_4_1_1_1_1_3_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_1.add(label_4_1_1_1_1_3_1_1);

		final JPanel panel_5_1_1_1_1_3_1_1 = new JPanel();
		panel_5_1_1_1_1_3_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_1_1.setLayout(null);
		panel_5_1_1_1_1_3_1_1.setBounds(0, 176, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_3_1_1);

		final JLabel label_3_1_1_1_3_1_1 = new JLabel();
		label_3_1_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_1_1.setText("  300 ");
		label_3_1_1_1_3_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_1_1.add(label_3_1_1_1_3_1_1);

		final JPanel panel_6_1_1_1_1_2_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_1_1_1_2_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1_2_1_1_1_1.setBounds(54, 176, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2_1_1_1_1);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_1_1.setText("  Shoulder");
		abdomenLabel_2_1_1_1_2_1_1_1_1.setBounds(0, 0, 60, 19);
		panel_6_1_1_1_1_2_1_1_1_1.add(abdomenLabel_2_1_1_1_2_1_1_1_1);

		final JLabel rtLabel_2_2_1_1_1_1 = new JLabel();
		rtLabel_2_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_1_1.setText("  Rt");
		rtLabel_2_2_1_1_1_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1.add(rtLabel_2_2_1_1_1_1);

		final JLabel rtLabel_1_1_2_1_1_1_1 = new JLabel();
		rtLabel_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_1_1.setText("  Lt");
		rtLabel_1_1_2_1_1_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1.add(rtLabel_1_1_2_1_1_1_1);

		final JPanel panel_1_2_1_1_1_3_1_1_1 = new JPanel();
		panel_1_2_1_1_1_3_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_1_1_1.setLayout(null);
		panel_1_2_1_1_1_3_1_1_1.setBounds(158, 176, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_3_1_1_1);

		final JLabel label_4_1_1_1_1_3_1_1_1 = new JLabel();
		label_4_1_1_1_1_3_1_1_1.setText("        2");
		label_4_1_1_1_1_3_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_1_1.add(label_4_1_1_1_1_3_1_1_1);

		final JPanel panel_5_1_1_1_1_3_1_1_1 = new JPanel();
		panel_5_1_1_1_1_3_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_1_1_1.setLayout(null);
		panel_5_1_1_1_1_3_1_1_1.setBounds(0, 195, 54, 19);
		panel_3_1_1.add(panel_5_1_1_1_1_3_1_1_1);

		final JLabel label_3_1_1_1_3_1_1_1 = new JLabel();
		label_3_1_1_1_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_1_1_1.setText("  310");
		label_3_1_1_1_3_1_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_1_1_1.add(label_3_1_1_1_3_1_1_1);

		final JPanel panel_6_1_1_1_1_2_1_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_1_1_1_2_1_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1_2_1_1_1_1_1.setBounds(54, 195, 104, 19);
		panel_3_1_1.add(panel_6_1_1_1_1_2_1_1_1_1_1);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_1_1_1.setText("  Wrist");
		abdomenLabel_2_1_1_1_2_1_1_1_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1_1_1_1_1.add(abdomenLabel_2_1_1_1_2_1_1_1_1_1);

		final JLabel rtLabel_2_2_1_1_1_1_1 = new JLabel();
		rtLabel_2_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_1_1_1.setText("  Rt");
		rtLabel_2_2_1_1_1_1_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1_1.add(rtLabel_2_2_1_1_1_1_1);

		final JLabel rtLabel_1_1_2_1_1_1_1_1 = new JLabel();
		rtLabel_1_1_2_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_1_1_1.setText(" Lt");
		rtLabel_1_1_2_1_1_1_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1_1.add(rtLabel_1_1_2_1_1_1_1_1);

		final JPanel panel_1_2_1_1_1_3_1_1_1_1 = new JPanel();
		panel_1_2_1_1_1_3_1_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_1_2_1_1_1_3_1_1_1_1.setLayout(null);
		panel_1_2_1_1_1_3_1_1_1_1.setBounds(158, 195, 67, 19);
		panel_3_1_1.add(panel_1_2_1_1_1_3_1_1_1_1);

		final JLabel label_4_1_1_1_1_3_1_1_1_1 = new JLabel();
		label_4_1_1_1_1_3_1_1_1_1.setText("        3");
		label_4_1_1_1_1_3_1_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_1_1_1.add(label_4_1_1_1_1_3_1_1_1_1);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(0, 288, 225, 219);
		panel_2_1.add(panel_3_1_1_1);

		final JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1.setLayout(null);
		panel_4_1_1_1.setBounds(0, 0, 158, 19);
		panel_3_1_1_1.add(panel_4_1_1_1);

		final JLabel xrayExamsLabel_1_1 = new JLabel();
		xrayExamsLabel_1_1.setBackground(Color.LIGHT_GRAY);
		xrayExamsLabel_1_1.setText("  LOWER EXTREMITY EXAMS");
		xrayExamsLabel_1_1.setBounds(0, 0, 175, 19);
		panel_4_1_1_1.add(xrayExamsLabel_1_1);

		final JPanel panel_5_1_2_1 = new JPanel();
		panel_5_1_2_1.setBackground(Color.WHITE);
		panel_5_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_2_1.setLayout(null);
		panel_5_1_2_1.setBounds(0, 19, 54, 19);
		panel_3_1_1_1.add(panel_5_1_2_1);

		final JLabel label_3_2_1 = new JLabel();
		label_3_2_1.setBackground(Color.WHITE);
		label_3_2_1.setText("  320");
		label_3_2_1.setBounds(0, 0, 54, 19);
		panel_5_1_2_1.add(label_3_2_1);

		final JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setBackground(Color.WHITE);
		panel_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_2_1.setLayout(null);
		panel_1_2_2_1.setBounds(158, 19, 67, 19);
		panel_3_1_1_1.add(panel_1_2_2_1);

		final JLabel label_4_2_1 = new JLabel();
		label_4_2_1.setText("        3");
		label_4_2_1.setBounds(0, 0, 67, 19);
		panel_1_2_2_1.add(label_4_2_1);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(Color.WHITE);
		panel_5_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2_1.setLayout(null);
		panel_5_1_1_2_1.setBounds(0, 38, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_2_1);

		final JLabel label_3_1_2_1 = new JLabel();
		label_3_1_2_1.setText("  330");
		label_3_1_2_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_2_1.add(label_3_1_2_1);

		final JPanel panel_1_2_1_2_1 = new JPanel();
		panel_1_2_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_2_1.setLayout(null);
		panel_1_2_1_2_1.setBounds(158, 38, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_2_1);

		final JLabel label_4_1_1_2_1 = new JLabel();
		label_4_1_1_2_1.setText("        2");
		label_4_1_1_2_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_2_1.add(label_4_1_1_2_1);

		final JPanel panel_12_1_1 = new JPanel();
		panel_12_1_1.setBackground(Color.LIGHT_GRAY);
		panel_12_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_1.setLayout(null);
		panel_12_1_1.setBounds(158, 0, 67, 19);
		panel_3_1_1_1.add(panel_12_1_1);

		final JPanel panel_5_1_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_1.setLayout(null);
		panel_5_1_1_1_1_1.setBounds(0, 57, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_1);

		final JLabel label_3_1_1_1_1 = new JLabel();
		label_3_1_1_1_1.setText("  340");
		label_3_1_1_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_1.add(label_3_1_1_1_1);

		final JPanel panel_6_1_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1_1.setBounds(54, 57, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_1);

		final JLabel abdomenLabel_2_1_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_1.setText("  Foot");
		abdomenLabel_2_1_1_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_1.add(abdomenLabel_2_1_1_1_1);

		final JLabel rtLabel_2_1 = new JLabel();
		rtLabel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_1.setText("  Rt");
		rtLabel_2_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_1.add(rtLabel_2_1);

		final JLabel rtLabel_1_1_1 = new JLabel();
		rtLabel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_1.setText(" Lt");
		rtLabel_1_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_1.add(rtLabel_1_1_1);

		final JPanel panel_1_2_1_1_1_1 = new JPanel();
		panel_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_1.setLayout(null);
		panel_1_2_1_1_1_1.setBounds(158, 57, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_1);

		final JLabel label_4_1_1_1_1_1 = new JLabel();
		label_4_1_1_1_1_1.setText("        3");
		label_4_1_1_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_1.add(label_4_1_1_1_1_1);

		final JPanel panel_6_1_1_1_2_2 = new JPanel();
		panel_6_1_1_1_2_2.setBackground(Color.WHITE);
		panel_6_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_2.setLayout(null);
		panel_6_1_1_1_2_2.setBounds(54, 19, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_2_2);

		final JLabel abdomenLabel_2_1_1_2_2 = new JLabel();
		abdomenLabel_2_1_1_2_2.setText("  Ankle");
		abdomenLabel_2_1_1_2_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_2_2.add(abdomenLabel_2_1_1_2_2);

		final JLabel rtLabel_3_2 = new JLabel();
		rtLabel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_3_2.setText("  Rt");
		rtLabel_3_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_2_2.add(rtLabel_3_2);

		final JLabel rtLabel_1_2_2 = new JLabel();
		rtLabel_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_2_2.setText(" Lt");
		rtLabel_1_2_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_2_2.add(rtLabel_1_2_2);

		final JPanel panel_6_1_1_1_2_1_1 = new JPanel();
		panel_6_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_1_1.setLayout(null);
		panel_6_1_1_1_2_1_1.setBounds(54, 38, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_2_1_1);

		final JLabel abdomenLabel_2_1_1_2_1_1 = new JLabel();
		abdomenLabel_2_1_1_2_1_1.setText("  Femur");
		abdomenLabel_2_1_1_2_1_1.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_2_1_1.add(abdomenLabel_2_1_1_2_1_1);

		final JLabel rtLabel_3_1_1 = new JLabel();
		rtLabel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_3_1_1.setText("  Rt");
		rtLabel_3_1_1.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_2_1_1.add(rtLabel_3_1_1);

		final JLabel rtLabel_1_2_1_1 = new JLabel();
		rtLabel_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_2_1_1.setText("  Lt");
		rtLabel_1_2_1_1.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_2_1_1.add(rtLabel_1_2_1_1);

		final JPanel panel_13_1 = new JPanel();
		panel_13_1.setBackground(Color.WHITE);
		panel_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1.setLayout(null);
		panel_13_1.setBounds(0, 76, 225, 24);
		panel_3_1_1_1.add(panel_13_1);

		final JLabel label_5_1 = new JLabel();
		label_5_1.setBorder(new LineBorder(Color.black, 1, false));
		label_5_1.setText("  350");
		label_5_1.setBounds(0, 0, 55, 24);
		panel_13_1.add(label_5_1);

		final JPanel panel_6_1_1_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1_1_1.setBounds(55, 0, 104, 24);
		panel_13_1.add(panel_6_1_1_1_1_1_1);

		final JLabel abdomenLabel_2_1_1_1_1_1 = new JLabel();
		abdomenLabel_2_1_1_1_1_1.setText("  Heel");
		abdomenLabel_2_1_1_1_1_1.setBounds(0, 0, 54, 24);
		panel_6_1_1_1_1_1_1.add(abdomenLabel_2_1_1_1_1_1);

		final JLabel rtLabel_2_1_1 = new JLabel();
		rtLabel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_1_1.setText("  Rt");
		rtLabel_2_1_1.setBounds(60, 0, 22, 24);
		panel_6_1_1_1_1_1_1.add(rtLabel_2_1_1);

		final JLabel rtLabel_1_1_1_1 = new JLabel();
		rtLabel_1_1_1_1.setBounds(82, 0, 22, 24);
		panel_6_1_1_1_1_1_1.add(rtLabel_1_1_1_1);
		rtLabel_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_1_1.setText(" Lt");

		final JPanel panel_1_2_1_1_1_1_2 = new JPanel();
		panel_1_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_1_2.setBounds(158, 0, 67, 24);
		panel_13_1.add(panel_1_2_1_1_1_1_2);
		panel_1_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_1_2.setLayout(null);

		final JLabel label_4_1_1_1_1_1_2 = new JLabel();
		label_4_1_1_1_1_1_2.setBounds(0, 0, 67, 24);
		panel_1_2_1_1_1_1_2.add(label_4_1_1_1_1_1_2);
		label_4_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		label_4_1_1_1_1_1_2.setText("        2");

		final JPanel panel_5_1_1_1_1_2_2 = new JPanel();
		panel_5_1_1_1_1_2_2.setBackground(Color.WHITE);
		panel_5_1_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_2_2.setLayout(null);
		panel_5_1_1_1_1_2_2.setBounds(0, 100, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_2_2);

		final JLabel label_6_1 = new JLabel();
		label_6_1.setText("  360");
		label_6_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_2_2.add(label_6_1);

		final JPanel panel_6_1_1_1_1_2_2 = new JPanel();
		panel_6_1_1_1_1_2_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_2.setLayout(null);
		panel_6_1_1_1_1_2_2.setBounds(54, 100, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_2_2);

		final JLabel abdomenLabel_2_1_1_1_2_2 = new JLabel();
		abdomenLabel_2_1_1_1_2_2.setText("  Hip");
		abdomenLabel_2_1_1_1_2_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_2.add(abdomenLabel_2_1_1_1_2_2);

		final JLabel rtLabel_2_2_2 = new JLabel();
		rtLabel_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_2.setText("  Rt");
		rtLabel_2_2_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_2.add(rtLabel_2_2_2);

		final JLabel rtLabel_1_1_2_2 = new JLabel();
		rtLabel_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_2.setText(" Lt");
		rtLabel_1_1_2_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_2.add(rtLabel_1_1_2_2);

		final JPanel panel_1_2_1_1_1_2_1 = new JPanel();
		panel_1_2_1_1_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_2_1.setLayout(null);
		panel_1_2_1_1_1_2_1.setBounds(158, 100, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_2_1);

		final JLabel label_4_1_1_1_1_2_1 = new JLabel();
		label_4_1_1_1_1_2_1.setText("        2");
		label_4_1_1_1_1_2_1.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_2_1.add(label_4_1_1_1_1_2_1);

		final JPanel panel_5_1_1_1_1_2_1_1 = new JPanel();
		panel_5_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_2_1_1.setLayout(null);
		panel_5_1_1_1_1_2_1_1.setBounds(0, 119, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_2_1_1);

		final JLabel label_3_1_1_1_4_1 = new JLabel();
		label_3_1_1_1_4_1.setText("  370");
		label_3_1_1_1_4_1.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_2_1_1.add(label_3_1_1_1_4_1);

		final JPanel panel_6_1_1_1_1_2_1_2 = new JPanel();
		panel_6_1_1_1_1_2_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_1_2.setLayout(null);
		panel_6_1_1_1_1_2_1_2.setBounds(54, 119, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_2_1_2);

		final JLabel abdomenLabel_2_1_1_1_2_1_2 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_2.setText("  Knee");
		abdomenLabel_2_1_1_1_2_1_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1_2.add(abdomenLabel_2_1_1_1_2_1_2);

		final JLabel rtLabel_2_2_1_2 = new JLabel();
		rtLabel_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_2.setText("  Rt");
		rtLabel_2_2_1_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_2.add(rtLabel_2_2_1_2);

		final JLabel rtLabel_1_1_2_1_2 = new JLabel();
		rtLabel_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_2.setText(" Lt");
		rtLabel_1_1_2_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_2.add(rtLabel_1_1_2_1_2);

		final JPanel panel_1_2_1_1_1_3_2 = new JPanel();
		panel_1_2_1_1_1_3_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_2.setLayout(null);
		panel_1_2_1_1_1_3_2.setBounds(158, 119, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_3_2);

		final JLabel label_4_1_1_1_1_3_2 = new JLabel();
		label_4_1_1_1_1_3_2.setText("        3");
		label_4_1_1_1_1_3_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_2.add(label_4_1_1_1_1_3_2);

		final JPanel panel_5_1_1_1_1_3_2 = new JPanel();
		panel_5_1_1_1_1_3_2.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_2.setLayout(null);
		panel_5_1_1_1_1_3_2.setBounds(0, 138, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_3_2);

		final JLabel label_3_1_1_1_3_2 = new JLabel();
		label_3_1_1_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_2.setText("  380");
		label_3_1_1_1_3_2.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_2.add(label_3_1_1_1_3_2);

		final JPanel panel_6_1_1_1_1_2_1_1_2 = new JPanel();
		panel_6_1_1_1_1_2_1_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1_2_1_1_2.setLayout(null);
		panel_6_1_1_1_1_2_1_1_2.setBounds(54, 138, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_2_1_1_2);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_2 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_2.setText("  Pelvis");
		abdomenLabel_2_1_1_1_2_1_1_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1_1_2.add(abdomenLabel_2_1_1_1_2_1_1_2);

		final JLabel rtLabel_2_2_1_1_2 = new JLabel();
		rtLabel_2_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_2.setText("  Rt");
		rtLabel_2_2_1_1_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_2.add(rtLabel_2_2_1_1_2);

		final JLabel rtLabel_1_1_2_1_1_2 = new JLabel();
		rtLabel_1_1_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_2.setText(" Lt");
		rtLabel_1_1_2_1_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_2.add(rtLabel_1_1_2_1_1_2);

		final JPanel panel_1_2_1_1_1_3_1_2 = new JPanel();
		panel_1_2_1_1_1_3_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_1_2.setLayout(null);
		panel_1_2_1_1_1_3_1_2.setBounds(157, 138, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_3_1_2);

		final JLabel label_4_1_1_1_1_3_1_2 = new JLabel();
		label_4_1_1_1_1_3_1_2.setText("        3");
		label_4_1_1_1_1_3_1_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_2.add(label_4_1_1_1_1_3_1_2);

		final JPanel panel_5_1_1_1_1_3_1_2 = new JPanel();
		panel_5_1_1_1_1_3_1_2.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_1_2.setLayout(null);
		panel_5_1_1_1_1_3_1_2.setBounds(0, 157, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_3_1_2);

		final JLabel label_3_1_1_1_3_1_2 = new JLabel();
		label_3_1_1_1_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_1_2.setText("  390");
		label_3_1_1_1_3_1_2.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_1_2.add(label_3_1_1_1_3_1_2);

		final JPanel panel_6_1_1_1_1_2_1_1_1_2 = new JPanel();
		panel_6_1_1_1_1_2_1_1_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_1_1_1_2_1_1_1_2.setLayout(null);
		panel_6_1_1_1_1_2_1_1_1_2.setBounds(54, 157, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_2_1_1_1_2);

		final JLabel rtLabel_2_2_1_1_1_2 = new JLabel();
		rtLabel_2_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_1_2.setText("  Rt");
		rtLabel_2_2_1_1_1_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_2.add(rtLabel_2_2_1_1_1_2);

		final JLabel rtLabel_1_1_2_1_1_1_2 = new JLabel();
		rtLabel_1_1_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_1_2.setText(" Lt");
		rtLabel_1_1_2_1_1_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_2.add(rtLabel_1_1_2_1_1_1_2);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_2_1 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_2_1.setText("Tibia-Fibula");
		abdomenLabel_2_1_1_1_2_1_1_2_1.setBounds(0, 0, 104, 19);
		panel_6_1_1_1_1_2_1_1_1_2.add(abdomenLabel_2_1_1_1_2_1_1_2_1);

		final JPanel panel_1_2_1_1_1_3_1_1_2 = new JPanel();
		panel_1_2_1_1_1_3_1_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1_1_1_3_1_1_2.setLayout(null);
		panel_1_2_1_1_1_3_1_1_2.setBounds(157, 157, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_3_1_1_2);

		final JLabel label_4_1_1_1_1_3_1_1_2 = new JLabel();
		label_4_1_1_1_1_3_1_1_2.setText("        2");
		label_4_1_1_1_1_3_1_1_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_1_2.add(label_4_1_1_1_1_3_1_1_2);

		final JPanel panel_5_1_1_1_1_3_1_1_2 = new JPanel();
		panel_5_1_1_1_1_3_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_1_1_3_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_3_1_1_2.setLayout(null);
		panel_5_1_1_1_1_3_1_1_2.setBounds(0, 176, 54, 19);
		panel_3_1_1_1.add(panel_5_1_1_1_1_3_1_1_2);

		final JLabel label_3_1_1_1_3_1_1_2 = new JLabel();
		label_3_1_1_1_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		label_3_1_1_1_3_1_1_2.setText("  400");
		label_3_1_1_1_3_1_1_2.setBounds(0, 0, 54, 19);
		panel_5_1_1_1_1_3_1_1_2.add(label_3_1_1_1_3_1_1_2);

		final JPanel panel_6_1_1_1_1_2_1_1_1_1_2 = new JPanel();
		panel_6_1_1_1_1_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_6_1_1_1_1_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_1_1_1_2_1_1_1_1_2.setLayout(null);
		panel_6_1_1_1_1_2_1_1_1_1_2.setBounds(54, 176, 104, 19);
		panel_3_1_1_1.add(panel_6_1_1_1_1_2_1_1_1_1_2);

		final JLabel abdomenLabel_2_1_1_1_2_1_1_1_1_2 = new JLabel();
		abdomenLabel_2_1_1_1_2_1_1_1_1_2.setText("  Toes");
		abdomenLabel_2_1_1_1_2_1_1_1_1_2.setBounds(0, 0, 54, 19);
		panel_6_1_1_1_1_2_1_1_1_1_2.add(abdomenLabel_2_1_1_1_2_1_1_1_1_2);

		final JLabel rtLabel_2_2_1_1_1_1_2 = new JLabel();
		rtLabel_2_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_2_2_1_1_1_1_2.setText("  Rt");
		rtLabel_2_2_1_1_1_1_2.setBounds(60, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1_2.add(rtLabel_2_2_1_1_1_1_2);

		final JLabel rtLabel_1_1_2_1_1_1_1_2 = new JLabel();
		rtLabel_1_1_2_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		rtLabel_1_1_2_1_1_1_1_2.setText(" Lt");
		rtLabel_1_1_2_1_1_1_1_2.setBounds(82, 0, 22, 19);
		panel_6_1_1_1_1_2_1_1_1_1_2.add(rtLabel_1_1_2_1_1_1_1_2);

		final JPanel panel_1_2_1_1_1_3_1_1_1_2 = new JPanel();
		panel_1_2_1_1_1_3_1_1_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_1_3_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_1_2_1_1_1_3_1_1_1_2.setLayout(null);
		panel_1_2_1_1_1_3_1_1_1_2.setBounds(158, 176, 67, 19);
		panel_3_1_1_1.add(panel_1_2_1_1_1_3_1_1_1_2);

		final JLabel label_4_1_1_1_1_3_1_1_1_2 = new JLabel();
		label_4_1_1_1_1_3_1_1_1_2.setText("        3");
		label_4_1_1_1_1_3_1_1_1_2.setBounds(0, 0, 67, 19);
		panel_1_2_1_1_1_3_1_1_1_2.add(label_4_1_1_1_1_3_1_1_1_2);

		final JPanel panel_13_2 = new JPanel();
		panel_13_2.setBackground(Color.WHITE);
		panel_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2.setLayout(null);
		panel_13_2.setBounds(0, 195, 225, 24);
		panel_3_1_1_1.add(panel_13_2);

		final JLabel label_5_2 = new JLabel();
		label_5_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5_2.setBounds(0, 0, 225, 24);
		panel_13_2.add(label_5_2);
		label_5_2.setBorder(new LineBorder(Color.black, 1, false));
		label_5_2.setText("               1   2   3   4   5 ");

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBounds(0, 507, 225, 98);
		panel_2_1.add(panel_14);

		final JPanel panel_5_1_3_1 = new JPanel();
		panel_5_1_3_1.setBackground(Color.WHITE);
		panel_5_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3_1.setLayout(null);
		panel_5_1_3_1.setBounds(0, 19, 54, 19);
		panel_14.add(panel_5_1_3_1);

		final JLabel label_3_3_1 = new JLabel();
		label_3_3_1.setText("  440");
		label_3_3_1.setBounds(0, 0, 54, 19);
		panel_5_1_3_1.add(label_3_3_1);

		final JPanel panel_6_1_2_1 = new JPanel();
		panel_6_1_2_1.setBackground(Color.WHITE);
		panel_6_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1.setLayout(null);
		panel_6_1_2_1.setBounds(54, 19, 104, 19);
		panel_14.add(panel_6_1_2_1);

		final JLabel abdomenLabel_2_2_1 = new JLabel();
		abdomenLabel_2_2_1.setText("  Cervical");
		abdomenLabel_2_2_1.setBounds(0, 0, 104, 19);
		panel_6_1_2_1.add(abdomenLabel_2_2_1);

		final JPanel panel_1_2_3_1 = new JPanel();
		panel_1_2_3_1.setBackground(Color.WHITE);
		panel_1_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_3_1.setLayout(null);
		panel_1_2_3_1.setBounds(158, 19, 67, 19);
		panel_14.add(panel_1_2_3_1);

		final JLabel label_4_3_1 = new JLabel();
		label_4_3_1.setText("        3");
		label_4_3_1.setBounds(0, 0, 67, 19);
		panel_1_2_3_1.add(label_4_3_1);

		final JPanel panel_5_1_3_1_1 = new JPanel();
		panel_5_1_3_1_1.setBackground(Color.WHITE);
		panel_5_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3_1_1.setLayout(null);
		panel_5_1_3_1_1.setBounds(0, 38, 54, 19);
		panel_14.add(panel_5_1_3_1_1);

		final JLabel label_3_3_1_1 = new JLabel();
		label_3_3_1_1.setText("  450");
		label_3_3_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_3_1_1.add(label_3_3_1_1);

		final JPanel panel_6_1_2_1_1 = new JPanel();
		panel_6_1_2_1_1.setBackground(Color.WHITE);
		panel_6_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1.setLayout(null);
		panel_6_1_2_1_1.setBounds(54, 38, 104, 19);
		panel_14.add(panel_6_1_2_1_1);

		final JLabel abdomenLabel_2_2_1_1 = new JLabel();
		abdomenLabel_2_2_1_1.setText("  Lumbosacral");
		abdomenLabel_2_2_1_1.setBounds(0, 0, 104, 19);
		panel_6_1_2_1_1.add(abdomenLabel_2_2_1_1);

		final JPanel panel_1_2_3_1_1 = new JPanel();
		panel_1_2_3_1_1.setBackground(Color.WHITE);
		panel_1_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_3_1_1.setLayout(null);
		panel_1_2_3_1_1.setBounds(158, 38, 67, 19);
		panel_14.add(panel_1_2_3_1_1);

		final JLabel label_4_3_1_1 = new JLabel();
		label_4_3_1_1.setText("        3");
		label_4_3_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_3_1_1.add(label_4_3_1_1);

		final JPanel panel_5_1_3_1_1_1 = new JPanel();
		panel_5_1_3_1_1_1.setBackground(Color.WHITE);
		panel_5_1_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3_1_1_1.setLayout(null);
		panel_5_1_3_1_1_1.setBounds(0, 57, 54, 19);
		panel_14.add(panel_5_1_3_1_1_1);

		final JLabel label_3_3_1_1_1 = new JLabel();
		label_3_3_1_1_1.setText("  460");
		label_3_3_1_1_1.setBounds(0, 0, 54, 19);
		panel_5_1_3_1_1_1.add(label_3_3_1_1_1);

		final JPanel panel_6_1_2_1_1_1 = new JPanel();
		panel_6_1_2_1_1_1.setBackground(Color.WHITE);
		panel_6_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1_1.setLayout(null);
		panel_6_1_2_1_1_1.setBounds(54, 57, 104, 19);
		panel_14.add(panel_6_1_2_1_1_1);

		final JLabel abdomenLabel_2_2_1_1_1 = new JLabel();
		abdomenLabel_2_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		abdomenLabel_2_2_1_1_1.setText("  Sacrum/Coccyx");
		abdomenLabel_2_2_1_1_1.setBounds(0, 0, 104, 19);
		panel_6_1_2_1_1_1.add(abdomenLabel_2_2_1_1_1);

		final JPanel panel_1_2_3_1_1_1 = new JPanel();
		panel_1_2_3_1_1_1.setBackground(Color.WHITE);
		panel_1_2_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_3_1_1_1.setLayout(null);
		panel_1_2_3_1_1_1.setBounds(158, 57, 67, 19);
		panel_14.add(panel_1_2_3_1_1_1);

		final JLabel label_4_3_1_1_1 = new JLabel();
		label_4_3_1_1_1.setText("        2");
		label_4_3_1_1_1.setBounds(0, 0, 67, 19);
		panel_1_2_3_1_1_1.add(label_4_3_1_1_1);

		final JPanel panel_5_1_3_2 = new JPanel();
		panel_5_1_3_2.setBackground(Color.WHITE);
		panel_5_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3_2.setLayout(null);
		panel_5_1_3_2.setBounds(0, 76, 54, 19);
		panel_14.add(panel_5_1_3_2);

		final JLabel label_3_3_2 = new JLabel();
		label_3_3_2.setText("  520");
		label_3_3_2.setBounds(0, 0, 54, 19);
		panel_5_1_3_2.add(label_3_3_2);

		final JPanel panel_6_1_2_2 = new JPanel();
		panel_6_1_2_2.setBackground(Color.WHITE);
		panel_6_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_2.setLayout(null);
		panel_6_1_2_2.setBounds(54, 76, 104, 19);
		panel_14.add(panel_6_1_2_2);

		final JLabel abdomenLabel_2_2_2 = new JLabel();
		abdomenLabel_2_2_2.setText("  Thoracic");
		abdomenLabel_2_2_2.setBounds(0, 0, 104, 19);
		panel_6_1_2_2.add(abdomenLabel_2_2_2);

		final JPanel panel_1_2_3_2 = new JPanel();
		panel_1_2_3_2.setBackground(Color.WHITE);
		panel_1_2_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_3_2.setLayout(null);
		panel_1_2_3_2.setBounds(158, 76, 67, 19);
		panel_14.add(panel_1_2_3_2);

		final JLabel label_4_3_2 = new JLabel();
		label_4_3_2.setText("        3");
		label_4_3_2.setBounds(0, 0, 67, 19);
		panel_1_2_3_2.add(label_4_3_2);

		final JPanel panel_4_1_1_2 = new JPanel();
		panel_4_1_1_2.setBackground(Color.LIGHT_GRAY);
		panel_4_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_2.setLayout(null);
		panel_4_1_1_2.setBounds(0, 0, 158, 19);
		panel_14.add(panel_4_1_1_2);

		final JLabel xrayExamsLabel_1_2 = new JLabel();
		xrayExamsLabel_1_2.setBackground(Color.LIGHT_GRAY);
		xrayExamsLabel_1_2.setText("  SPINE EXAMS");
		xrayExamsLabel_1_2.setBounds(0, 0, 158, 19);
		panel_4_1_1_2.add(xrayExamsLabel_1_2);

		final JPanel panel_12_1_1_1 = new JPanel();
		panel_12_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_12_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_1_1.setLayout(null);
		panel_12_1_1_1.setBounds(158, 0, 67, 19);
		panel_14.add(panel_12_1_1_1);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_10_1.setBackground(Color.WHITE);
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(566, 1037, 264, 373);
		add(panel_10_1);

		final JPanel panel_60_1 = new JPanel();
		panel_60_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_60_1.setLayout(null);
		panel_60_1.setBounds(193, 0, 71, 260);
		panel_10_1.add(panel_60_1);

		final JPanel panel_64_1 = new JPanel();
		panel_64_1.setBackground(Color.LIGHT_GRAY);
		panel_64_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_64_1.setLayout(null);
		panel_64_1.setBounds(0, 0, 71, 20);
		panel_60_1.add(panel_64_1);

		final JLabel diagCodeLabel_1_1 = new JLabel();
		diagCodeLabel_1_1.setText(" DIAG. CODE");
		diagCodeLabel_1_1.setBounds(0, 0, 71, 20);
		panel_64_1.add(diagCodeLabel_1_1);

		final JPanel panel_65_11 = new JPanel();
		panel_65_11.setBackground(Color.WHITE);
		panel_65_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_11.setLayout(null);
		panel_65_11.setBounds(0, 20, 71, 20);
		panel_60_1.add(panel_65_11);

		final JPanel panel_65_1_1 = new JPanel();
		panel_65_1_1.setBackground(Color.WHITE);
		panel_65_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_1_1.setLayout(null);
		panel_65_1_1.setBounds(0, 40, 71, 20);
		panel_60_1.add(panel_65_1_1);

		final JLabel label_40_1 = new JLabel();
		label_40_1.setText("       924.5");
		label_40_1.setBounds(0, 0, 71, 20);
		panel_65_1_1.add(label_40_1);

		final JPanel panel_65_2_1 = new JPanel();
		panel_65_2_1.setBackground(Color.WHITE);
		panel_65_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_2_1.setLayout(null);
		panel_65_2_1.setBounds(0, 60, 71, 20);
		panel_60_1.add(panel_65_2_1);

		final JLabel label_45_1 = new JLabel();
		label_45_1.setText("       923.9");
		label_45_1.setBounds(0, 0, 71, 20);
		panel_65_2_1.add(label_45_1);

		final JPanel panel_65_3_1 = new JPanel();
		panel_65_3_1.setBackground(Color.WHITE);
		panel_65_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_3_1.setLayout(null);
		panel_65_3_1.setBounds(0, 80, 71, 20);
		panel_60_1.add(panel_65_3_1);

		final JLabel label_46_1 = new JLabel();
		label_46_1.setText("       782.3");
		label_46_1.setBounds(0, 0, 71, 20);
		panel_65_3_1.add(label_46_1);

		final JPanel panel_65_4_1 = new JPanel();
		panel_65_4_1.setBackground(Color.WHITE);
		panel_65_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_4_1.setLayout(null);
		panel_65_4_1.setBounds(0, 100, 71, 20);
		panel_60_1.add(panel_65_4_1);

		final JLabel label_47_1 = new JLabel();
		label_47_1.setText("       719.47");
		label_47_1.setBounds(0, 0, 71, 20);
		panel_65_4_1.add(label_47_1);

		final JPanel panel_65_5_1 = new JPanel();
		panel_65_5_1.setBackground(Color.WHITE);
		panel_65_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_5_1.setLayout(null);
		panel_65_5_1.setBounds(0, 120, 71, 20);
		panel_60_1.add(panel_65_5_1);

		final JLabel label_48_1 = new JLabel();
		label_48_1.setText("       723.1");
		label_48_1.setBounds(0, 0, 71, 20);
		panel_65_5_1.add(label_48_1);

		final JPanel panel_65_6_1 = new JPanel();
		panel_65_6_1.setBackground(Color.WHITE);
		panel_65_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_6_1.setLayout(null);
		panel_65_6_1.setBounds(0, 140, 71, 20);
		panel_60_1.add(panel_65_6_1);

		final JLabel label_49_1 = new JLabel();
		label_49_1.setText("       729.5");
		label_49_1.setBounds(0, 0, 71, 20);
		panel_65_6_1.add(label_49_1);

		final JPanel panel_65_7_1 = new JPanel();
		panel_65_7_1.setBackground(Color.WHITE);
		panel_65_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_7_1.setLayout(null);
		panel_65_7_1.setBounds(0, 160, 71, 20);
		panel_60_1.add(panel_65_7_1);

		final JLabel label_50_1 = new JLabel();
		label_50_1.setText("       784.0");
		label_50_1.setBounds(0, 0, 71, 20);
		panel_65_7_1.add(label_50_1);

		final JPanel panel_65_8_1 = new JPanel();
		panel_65_8_1.setBackground(Color.WHITE);
		panel_65_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_8_1.setLayout(null);
		panel_65_8_1.setBounds(0, 180, 71, 20);
		panel_60_1.add(panel_65_8_1);

		final JLabel label_51_1 = new JLabel();
		label_51_1.setText("       719.45");
		label_51_1.setBounds(0, 0, 71, 20);
		panel_65_8_1.add(label_51_1);

		final JPanel panel_65_9_1 = new JPanel();
		panel_65_9_1.setBackground(Color.WHITE);
		panel_65_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_9_1.setLayout(null);
		panel_65_9_1.setBounds(0, 200, 71, 20);
		panel_60_1.add(panel_65_9_1);

		final JLabel label_52_1 = new JLabel();
		label_52_1.setText("       719.40");
		label_52_1.setBounds(0, 0, 71, 20);
		panel_65_9_1.add(label_52_1);

		final JPanel panel_65_10_2 = new JPanel();
		panel_65_10_2.setBackground(Color.WHITE);
		panel_65_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_2.setLayout(null);
		panel_65_10_2.setBounds(0, 220, 71, 20);
		panel_60_1.add(panel_65_10_2);

		final JLabel label_53_1 = new JLabel();
		label_53_1.setText("       719.46");
		label_53_1.setBounds(0, 0, 71, 20);
		panel_65_10_2.add(label_53_1);

		final JPanel panel_65_10_1_1 = new JPanel();
		panel_65_10_1_1.setBackground(Color.WHITE);
		panel_65_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1.setLayout(null);
		panel_65_10_1_1.setBounds(0, 240, 71, 20);
		panel_60_1.add(panel_65_10_1_1);

		final JLabel label_54_1 = new JLabel();
		label_54_1.setText("       724.2");
		label_54_1.setBounds(0, 0, 71, 20);
		panel_65_10_1_1.add(label_54_1);

		final JPanel panel_66_1_11 = new JPanel();
		panel_66_1_11.setBackground(Color.WHITE);
		panel_66_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_11.setLayout(null);
		panel_66_1_11.setBounds(0, 20, 193, 20);
		panel_10_1.add(panel_66_1_11);

		final JLabel abnormalDisentionLabel_2 = new JLabel();
		abnormalDisentionLabel_2.setText("  Skeletal/Bone");
		abnormalDisentionLabel_2.setBounds(0, 0, 193, 19);
		panel_66_1_11.add(abnormalDisentionLabel_2);

		final JPanel panel_66_1_1_1 = new JPanel();
		panel_66_1_1_1.setBackground(Color.WHITE);
		panel_66_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_1_1.setLayout(null);
		panel_66_1_1_1.setBounds(0, 40, 193, 20);
		panel_10_1.add(panel_66_1_1_1);

		final JLabel abnormalDisentionLabel_1_4 = new JLabel();
		abnormalDisentionLabel_1_4.setText("  Bruise/Contusion Lower Limb");
		abnormalDisentionLabel_1_4.setBounds(0, 0, 193, 20);
		panel_66_1_1_1.add(abnormalDisentionLabel_1_4);

		final JPanel panel_66_1_2_1 = new JPanel();
		panel_66_1_2_1.setBackground(Color.WHITE);
		panel_66_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_2_1.setLayout(null);
		panel_66_1_2_1.setBounds(0, 60, 193, 20);
		panel_10_1.add(panel_66_1_2_1);

		final JLabel abnormalDisentionLabel_1_1_1 = new JLabel();
		abnormalDisentionLabel_1_1_1.setText("  Bruise/Contusion Upper Limb");
		abnormalDisentionLabel_1_1_1.setBounds(0, 0, 193, 20);
		panel_66_1_2_1.add(abnormalDisentionLabel_1_1_1);

		final JPanel panel_66_1_3_1 = new JPanel();
		panel_66_1_3_1.setBackground(Color.WHITE);
		panel_66_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_3_1.setLayout(null);
		panel_66_1_3_1.setBounds(0, 80, 193, 20);
		panel_10_1.add(panel_66_1_3_1);

		final JLabel abnormalDisentionLabel_1_2_2 = new JLabel();
		abnormalDisentionLabel_1_2_2.setText("  Edema");
		abnormalDisentionLabel_1_2_2.setBounds(0, 0, 193, 20);
		panel_66_1_3_1.add(abnormalDisentionLabel_1_2_2);

		final JPanel panel_66_1_4_1 = new JPanel();
		panel_66_1_4_1.setBackground(Color.WHITE);
		panel_66_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_4_1.setLayout(null);
		panel_66_1_4_1.setBounds(0, 100, 193, 20);
		panel_10_1.add(panel_66_1_4_1);

		final JLabel abnormalDisentionLabel_1_3_2 = new JLabel();
		abnormalDisentionLabel_1_3_2.setText("  Pain-Ankle");
		abnormalDisentionLabel_1_3_2.setBounds(0, 0, 193, 20);
		panel_66_1_4_1.add(abnormalDisentionLabel_1_3_2);

		final JPanel panel_66_1_5_1 = new JPanel();
		panel_66_1_5_1.setBackground(Color.WHITE);
		panel_66_1_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_5_1.setLayout(null);
		panel_66_1_5_1.setBounds(0, 120, 193, 20);
		panel_10_1.add(panel_66_1_5_1);

		final JLabel abnormalDisentionLabel_1_3_1_1 = new JLabel();
		abnormalDisentionLabel_1_3_1_1.setBackground(Color.WHITE);
		abnormalDisentionLabel_1_3_1_1.setText("  Pain-Cervical");
		abnormalDisentionLabel_1_3_1_1.setBounds(0, 0, 193, 20);
		panel_66_1_5_1.add(abnormalDisentionLabel_1_3_1_1);

		final JPanel panel_66_1_6_1 = new JPanel();
		panel_66_1_6_1.setBackground(Color.WHITE);
		panel_66_1_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_6_1.setLayout(null);
		panel_66_1_6_1.setBounds(0, 140, 193, 20);
		panel_10_1.add(panel_66_1_6_1);

		final JLabel abnormalDisentionLabel_1_2_1_1 = new JLabel();
		abnormalDisentionLabel_1_2_1_1.setText("  Pain-in Limb");
		abnormalDisentionLabel_1_2_1_1.setBounds(0, 0, 193, 20);
		panel_66_1_6_1.add(abnormalDisentionLabel_1_2_1_1);

		final JPanel panel_66_1_7_1 = new JPanel();
		panel_66_1_7_1.setBackground(Color.WHITE);
		panel_66_1_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_7_1.setLayout(null);
		panel_66_1_7_1.setBounds(0, 160, 193, 20);
		panel_10_1.add(panel_66_1_7_1);

		final JLabel abnormalDisentionLabel_1_3_3_1 = new JLabel();
		abnormalDisentionLabel_1_3_3_1
				.setText("  Pain-Head (skull, facial area)");
		abnormalDisentionLabel_1_3_3_1.setBounds(0, 0, 193, 20);
		panel_66_1_7_1.add(abnormalDisentionLabel_1_3_3_1);

		final JPanel panel_66_1_8_1 = new JPanel();
		panel_66_1_8_1.setBackground(Color.WHITE);
		panel_66_1_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_8_1.setLayout(null);
		panel_66_1_8_1.setBounds(0, 180, 193, 20);
		panel_10_1.add(panel_66_1_8_1);

		final JLabel abnormalDisentionLabel_1_3_6_1 = new JLabel();
		abnormalDisentionLabel_1_3_6_1.setText("  Pain-Hip");
		abnormalDisentionLabel_1_3_6_1.setBounds(0, 0, 193, 20);
		panel_66_1_8_1.add(abnormalDisentionLabel_1_3_6_1);

		final JPanel panel_66_1_9_1 = new JPanel();
		panel_66_1_9_1.setBackground(Color.WHITE);
		panel_66_1_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_9_1.setLayout(null);
		panel_66_1_9_1.setBounds(0, 200, 193, 20);
		panel_10_1.add(panel_66_1_9_1);

		final JLabel abnormalDisentionLabel_1_3_4_1 = new JLabel();
		abnormalDisentionLabel_1_3_4_1.setText("  Pain-Joint");
		abnormalDisentionLabel_1_3_4_1.setBounds(0, 0, 193, 20);
		panel_66_1_9_1.add(abnormalDisentionLabel_1_3_4_1);

		final JPanel panel_66_1_10_2 = new JPanel();
		panel_66_1_10_2.setBackground(Color.WHITE);
		panel_66_1_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_2.setLayout(null);
		panel_66_1_10_2.setBounds(0, 220, 193, 20);
		panel_10_1.add(panel_66_1_10_2);

		final JLabel abnormalDisentionLabel_1_3_5_1 = new JLabel();
		abnormalDisentionLabel_1_3_5_1.setText("  Pain-Knee");
		abnormalDisentionLabel_1_3_5_1.setBounds(0, 0, 193, 20);
		panel_66_1_10_2.add(abnormalDisentionLabel_1_3_5_1);

		final JPanel panel_34_1_1_1 = new JPanel();
		panel_34_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_34_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_34_1_1_1.setLayout(null);
		panel_34_1_1_1.setBounds(0, 0, 193, 20);
		panel_10_1.add(panel_34_1_1_1);

		final JLabel chestribsLabel_2_1_1 = new JLabel();
		chestribsLabel_2_1_1.setText("  SYMPTOMS/DIAGNOSIS/REASON");
		chestribsLabel_2_1_1.setBounds(0, 0, 193, 20);
		panel_34_1_1_1.add(chestribsLabel_2_1_1);

		final JPanel panel_66_1_10_1_1 = new JPanel();
		panel_66_1_10_1_1.setBackground(Color.WHITE);
		panel_66_1_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1.setLayout(null);
		panel_66_1_10_1_1.setBounds(0, 240, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1);

		final JLabel abnormalDisentionLabel_1_3_5_2_1 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1.setText("  Pain-Low Back");
		abnormalDisentionLabel_1_3_5_2_1.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1.add(abnormalDisentionLabel_1_3_5_2_1);

		final JPanel panel_66_1_10_1_1_1 = new JPanel();
		panel_66_1_10_1_1_1.setBackground(Color.WHITE);
		panel_66_1_10_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1_1.setLayout(null);
		panel_66_1_10_1_1_1.setBounds(0, 260, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1_1);

		final JLabel abnormalDisentionLabel_1_3_5_2_1_1 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1_1.setText("  Pain-Shoulder");
		abnormalDisentionLabel_1_3_5_2_1_1.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1_1.add(abnormalDisentionLabel_1_3_5_2_1_1);

		final JPanel panel_66_1_10_1_1_2 = new JPanel();
		panel_66_1_10_1_1_2.setBackground(Color.WHITE);
		panel_66_1_10_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1_2.setLayout(null);
		panel_66_1_10_1_1_2.setBounds(0, 280, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1_2);

		final JLabel abnormalDisentionLabel_1_3_5_2_1_2 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1_2.setText("  Pain-Thoracic");
		abnormalDisentionLabel_1_3_5_2_1_2.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1_2.add(abnormalDisentionLabel_1_3_5_2_1_2);

		final JPanel panel_66_1_10_1_1_3 = new JPanel();
		panel_66_1_10_1_1_3.setBackground(Color.WHITE);
		panel_66_1_10_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1_3.setLayout(null);
		panel_66_1_10_1_1_3.setBounds(0, 300, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1_3);

		final JLabel abnormalDisentionLabel_1_3_5_2_1_3 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1_3.setText("  Pain-Wrist");
		abnormalDisentionLabel_1_3_5_2_1_3.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1_3.add(abnormalDisentionLabel_1_3_5_2_1_3);

		final JPanel panel_66_1_10_1_1_4 = new JPanel();
		panel_66_1_10_1_1_4.setBackground(Color.WHITE);
		panel_66_1_10_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1_4.setLayout(null);
		panel_66_1_10_1_1_4.setBounds(0, 320, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1_4);

		final JLabel abnormalDisentionLabel_1_3_5_2_1_4 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1_4
				.setText("  Sprain/Strain, Unspecified Site");
		abnormalDisentionLabel_1_3_5_2_1_4.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1_4.add(abnormalDisentionLabel_1_3_5_2_1_4);

		final JPanel panel_66_1_10_1_1_5 = new JPanel();
		panel_66_1_10_1_1_5.setBackground(Color.WHITE);
		panel_66_1_10_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_10_1_1_5.setLayout(null);
		panel_66_1_10_1_1_5.setBounds(0, 340, 193, 20);
		panel_10_1.add(panel_66_1_10_1_1_5);

		final JLabel abnormalDisentionLabel_1_3_5_2_1_5 = new JLabel();
		abnormalDisentionLabel_1_3_5_2_1_5.setText("  Swelling Limbs");
		abnormalDisentionLabel_1_3_5_2_1_5.setBounds(0, 0, 193, 20);
		panel_66_1_10_1_1_5.add(abnormalDisentionLabel_1_3_5_2_1_5);

		final JPanel panel_65_10_1_1_1 = new JPanel();
		panel_65_10_1_1_1.setBackground(Color.WHITE);
		panel_65_10_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1_1.setLayout(null);
		panel_65_10_1_1_1.setBounds(193, 260, 71, 20);
		panel_10_1.add(panel_65_10_1_1_1);

		final JLabel label_54_1_1 = new JLabel();
		label_54_1_1.setText("       719.41");
		label_54_1_1.setBounds(0, 0, 71, 20);
		panel_65_10_1_1_1.add(label_54_1_1);

		final JPanel panel_65_10_1_1_2 = new JPanel();
		panel_65_10_1_1_2.setBackground(Color.WHITE);
		panel_65_10_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1_2.setLayout(null);
		panel_65_10_1_1_2.setBounds(193, 280, 71, 20);
		panel_10_1.add(panel_65_10_1_1_2);

		final JLabel label_54_1_2 = new JLabel();
		label_54_1_2.setText("       724.1");
		label_54_1_2.setBounds(0, 0, 71, 20);
		panel_65_10_1_1_2.add(label_54_1_2);

		final JPanel panel_65_10_1_1_3 = new JPanel();
		panel_65_10_1_1_3.setBackground(Color.WHITE);
		panel_65_10_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1_3.setLayout(null);
		panel_65_10_1_1_3.setBounds(193, 300, 71, 20);
		panel_10_1.add(panel_65_10_1_1_3);

		final JLabel label_54_1_3 = new JLabel();
		label_54_1_3.setText("       719.48");
		label_54_1_3.setBounds(0, 0, 71, 20);
		panel_65_10_1_1_3.add(label_54_1_3);

		final JPanel panel_65_10_1_1_4 = new JPanel();
		panel_65_10_1_1_4.setBackground(Color.WHITE);
		panel_65_10_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1_4.setLayout(null);
		panel_65_10_1_1_4.setBounds(193, 320, 71, 20);
		panel_10_1.add(panel_65_10_1_1_4);

		final JLabel label_54_1_4 = new JLabel();
		label_54_1_4.setText("       848.9");
		label_54_1_4.setBounds(0, 0, 71, 20);
		panel_65_10_1_1_4.add(label_54_1_4);

		final JPanel panel_65_10_1_1_5 = new JPanel();
		panel_65_10_1_1_5.setBackground(Color.WHITE);
		panel_65_10_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_10_1_1_5.setLayout(null);
		panel_65_10_1_1_5.setBounds(193, 340, 71, 20);
		panel_10_1.add(panel_65_10_1_1_5);

		final JLabel label_54_1_5 = new JLabel();
		label_54_1_5.setText("       729.81");
		label_54_1_5.setBounds(0, 0, 71, 20);
		panel_65_10_1_1_5.add(label_54_1_5);

		final JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.BLACK);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(21, 1416, 819, 80);
		add(panel_16);

		final JTextArea personSigningBelowTextArea = new JTextArea();
		personSigningBelowTextArea.setFont(new Font("Arial", Font.PLAIN, 11));
		personSigningBelowTextArea.setBackground(Color.BLACK);
		personSigningBelowTextArea.setForeground(new Color(255, 255, 255));
		personSigningBelowTextArea
				.setText("  Person signing below verifies the medical necessity of the test being performed. The signature also verifies the presence of physicians’ order for the test being performed.\n      Doctor certifies that this patient, because of age, physical limitations, and for the care of the patient, the exam should not be conducted outside the above location.\r\n                                                                                                We will follow any physician modification to this form.");
		personSigningBelowTextArea.setBounds(0, 0, 823, 46);
		panel_16.add(personSigningBelowTextArea);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(10, 46, 800, 24);
		panel_16.add(panel_17);

		final JLabel lblSignatureRequired = new JLabel();
		lblSignatureRequired.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSignatureRequired.setText("    SIGNATURE REQUIRED");
		lblSignatureRequired.setBounds(0, 0, 418, 24);
		panel_17.add(lblSignatureRequired);

		final JPanel panel_10_2 = new JPanel();
		panel_10_2.setBackground(Color.WHITE);
		panel_10_2.setLayout(null);
		panel_10_2.setBounds(275, 770, 264, 214);
		add(panel_10_2);

		final JPanel panel_60_2 = new JPanel();
		panel_60_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_60_2.setLayout(null);
		panel_60_2.setBounds(193, 0, 71, 150);
		panel_10_2.add(panel_60_2);

		final JPanel panel_65_1_2 = new JPanel();
		panel_65_1_2.setBackground(Color.WHITE);
		panel_65_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_1_2.setLayout(null);
		panel_65_1_2.setBounds(0, 40, 71, 20);
		panel_60_2.add(panel_65_1_2);

		final JLabel label_40_2 = new JLabel();
		label_40_2.setText("        3");
		label_40_2.setBounds(0, 0, 71, 20);
		panel_65_1_2.add(label_40_2);

		final JPanel panel_65_2_2 = new JPanel();
		panel_65_2_2.setBackground(Color.WHITE);
		panel_65_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_2_2.setLayout(null);
		panel_65_2_2.setBounds(0, 60, 71, 20);
		panel_60_2.add(panel_65_2_2);

		final JLabel label_45_2 = new JLabel();
		label_45_2.setText("        3");
		label_45_2.setBounds(0, 0, 71, 20);
		panel_65_2_2.add(label_45_2);

		final JPanel panel_65_3_2 = new JPanel();
		panel_65_3_2.setBackground(Color.WHITE);
		panel_65_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_3_2.setLayout(null);
		panel_65_3_2.setBounds(0, 80, 71, 20);
		panel_60_2.add(panel_65_3_2);

		final JLabel label_46_2 = new JLabel();
		label_46_2.setText("        3");
		label_46_2.setBounds(0, 0, 71, 20);
		panel_65_3_2.add(label_46_2);

		final JPanel panel_65_4_2 = new JPanel();
		panel_65_4_2.setBackground(Color.WHITE);
		panel_65_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_4_2.setLayout(null);
		panel_65_4_2.setBounds(0, 100, 71, 20);
		panel_60_2.add(panel_65_4_2);

		final JLabel label_47_2 = new JLabel();
		label_47_2.setText("        3");
		label_47_2.setBounds(0, 0, 71, 20);
		panel_65_4_2.add(label_47_2);

		final JPanel panel_65_5_2 = new JPanel();
		panel_65_5_2.setBackground(Color.WHITE);
		panel_65_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_5_2.setLayout(null);
		panel_65_5_2.setBounds(0, 120, 71, 30);
		panel_60_2.add(panel_65_5_2);

		final JLabel label_48_2 = new JLabel();
		label_48_2.setText(" ");
		label_48_2.setBounds(0, 0, 71, 30);
		panel_65_5_2.add(label_48_2);

		final JPanel panel_65_7_2 = new JPanel();
		panel_65_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_7_2.setLayout(null);
		panel_65_7_2.setBounds(0, 160, 71, 20);
		panel_60_2.add(panel_65_7_2);

		final JLabel label_50_2 = new JLabel();
		label_50_2.setText("New JLabel");
		label_50_2.setBounds(0, 0, 71, 20);
		panel_65_7_2.add(label_50_2);

		final JPanel panel_65_8_2 = new JPanel();
		panel_65_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_8_2.setLayout(null);
		panel_65_8_2.setBounds(0, 180, 71, 20);
		panel_60_2.add(panel_65_8_2);

		final JLabel label_51_2 = new JLabel();
		label_51_2.setText("New JLabel");
		label_51_2.setBounds(0, 0, 71, 20);
		panel_65_8_2.add(label_51_2);

		final JPanel panel_64_2 = new JPanel();
		panel_64_2.setBackground(Color.LIGHT_GRAY);
		panel_64_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_64_2.setLayout(null);
		panel_64_2.setBounds(0, 0, 71, 20);
		panel_60_2.add(panel_64_2);

		final JLabel diagCodeLabel_1_2 = new JLabel();
		diagCodeLabel_1_2.setText("  # of Views");
		diagCodeLabel_1_2.setBounds(0, 0, 71, 20);
		panel_64_2.add(diagCodeLabel_1_2);

		final JPanel panel_65_2_2_1 = new JPanel();
		panel_65_2_2_1.setBackground(Color.WHITE);
		panel_65_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_65_2_2_1.setLayout(null);
		panel_65_2_2_1.setBounds(0, 20, 71, 20);
		panel_60_2.add(panel_65_2_2_1);

		final JLabel label_45_2_1 = new JLabel();
		label_45_2_1.setText("        3");
		label_45_2_1.setBounds(0, 0, 71, 20);
		panel_65_2_2_1.add(label_45_2_1);

		final JPanel panel_66_1_1_2 = new JPanel();
		panel_66_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_1_2.setLayout(null);
		panel_66_1_1_2.setBounds(0, 40, 54, 20);
		panel_10_2.add(panel_66_1_1_2);

		final JPanel panel_5_1_3 = new JPanel();
		panel_5_1_3.setBackground(Color.WHITE);
		panel_5_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3.setLayout(null);
		panel_5_1_3.setBounds(0, 0, 54, 20);
		panel_66_1_1_2.add(panel_5_1_3);

		final JLabel label_3_3 = new JLabel();
		label_3_3.setText("  480");
		label_3_3.setBounds(0, 0, 54, 20);
		panel_5_1_3.add(label_3_3);

		final JPanel panel_66_1_2_2 = new JPanel();
		panel_66_1_2_2.setBackground(Color.WHITE);
		panel_66_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_2_2.setLayout(null);
		panel_66_1_2_2.setBounds(0, 60, 54, 20);
		panel_10_2.add(panel_66_1_2_2);

		final JLabel abnormalDisentionLabel_1_1_2 = new JLabel();
		abnormalDisentionLabel_1_1_2.setText("  490");
		abnormalDisentionLabel_1_1_2.setBounds(0, 0, 54, 20);
		panel_66_1_2_2.add(abnormalDisentionLabel_1_1_2);

		final JPanel panel_66_1_3_2 = new JPanel();
		panel_66_1_3_2.setBackground(Color.WHITE);
		panel_66_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_3_2.setLayout(null);
		panel_66_1_3_2.setBounds(0, 80, 54, 20);
		panel_10_2.add(panel_66_1_3_2);

		final JLabel abnormalDisentionLabel_1_2_3 = new JLabel();
		abnormalDisentionLabel_1_2_3.setText("  500");
		abnormalDisentionLabel_1_2_3.setBounds(0, 0, 54, 20);
		panel_66_1_3_2.add(abnormalDisentionLabel_1_2_3);

		final JPanel panel_66_1_4_2 = new JPanel();
		panel_66_1_4_2.setBackground(Color.WHITE);
		panel_66_1_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_4_2.setLayout(null);
		panel_66_1_4_2.setBounds(0, 100, 54, 20);
		panel_10_2.add(panel_66_1_4_2);

		final JLabel abnormalDisentionLabel_1_3_7 = new JLabel();
		abnormalDisentionLabel_1_3_7.setText("  510");
		abnormalDisentionLabel_1_3_7.setBounds(0, 0, 54, 20);
		panel_66_1_4_2.add(abnormalDisentionLabel_1_3_7);

		final JPanel panel_66_1_5_2 = new JPanel();
		panel_66_1_5_2.setBackground(Color.WHITE);
		panel_66_1_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_66_1_5_2.setLayout(null);
		panel_66_1_5_2.setBounds(0, 120, 54, 30);
		panel_10_2.add(panel_66_1_5_2);

		final JLabel abnormalDisentionLabel_1_3_1_2 = new JLabel();
		abnormalDisentionLabel_1_3_1_2.setText("  900");
		abnormalDisentionLabel_1_3_1_2.setBounds(0, 0, 54, 30);
		panel_66_1_5_2.add(abnormalDisentionLabel_1_3_1_2);

		final JPanel panel_34_1_1_2 = new JPanel();
		panel_34_1_1_2.setBackground(Color.LIGHT_GRAY);
		panel_34_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_34_1_1_2.setLayout(null);
		panel_34_1_1_2.setBounds(0, 0, 193, 20);
		panel_10_2.add(panel_34_1_1_2);

		final JLabel chestribsLabel_2_1_2 = new JLabel();
		chestribsLabel_2_1_2.setBackground(Color.LIGHT_GRAY);
		chestribsLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		chestribsLabel_2_1_2.setText("  HEAD OR FACIAL EXAMS");
		chestribsLabel_2_1_2.setBounds(0, 0, 193, 20);
		panel_34_1_1_2.add(chestribsLabel_2_1_2);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(54, 20, 139, 20);
		panel_10_2.add(panel_8);

		final JLabel facialBonesLabel = new JLabel();
		facialBonesLabel.setText("  Facial Bones");
		facialBonesLabel.setBounds(0, 0, 139, 20);
		panel_8.add(facialBonesLabel);

		final JPanel panel_5_1_3_3 = new JPanel();
		panel_5_1_3_3.setBackground(Color.WHITE);
		panel_5_1_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_3_3.setLayout(null);
		panel_5_1_3_3.setBounds(0, 20, 54, 20);
		panel_10_2.add(panel_5_1_3_3);

		final JLabel label_3_3_3 = new JLabel();
		label_3_3_3.setText("  470");
		label_3_3_3.setBounds(0, 0, 54, 20);
		panel_5_1_3_3.add(label_3_3_3);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(54, 40, 139, 20);
		panel_10_2.add(panel_8_1);

		final JLabel mandibleLabel = new JLabel();
		mandibleLabel.setText("  Mandible");
		mandibleLabel.setBounds(0, 0, 139, 20);
		panel_8_1.add(mandibleLabel);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(54, 60, 139, 20);
		panel_10_2.add(panel_8_2);

		final JLabel nasalBoneLabel = new JLabel();
		nasalBoneLabel.setText("  Nasal Bone");
		nasalBoneLabel.setBounds(0, 0, 139, 20);
		panel_8_2.add(nasalBoneLabel);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setBackground(Color.WHITE);
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(54, 80, 139, 20);
		panel_10_2.add(panel_8_3);

		final JLabel sinusesLabel = new JLabel();
		sinusesLabel.setText("  Sinuses");
		sinusesLabel.setBounds(0, 0, 139, 20);
		panel_8_3.add(sinusesLabel);

		final JPanel panel_8_4 = new JPanel();
		panel_8_4.setBackground(Color.WHITE);
		panel_8_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4.setLayout(null);
		panel_8_4.setBounds(54, 100, 139, 20);
		panel_10_2.add(panel_8_4);

		final JLabel sLabel = new JLabel();
		sLabel.setText("  Skull");
		sLabel.setBounds(0, 0, 139, 20);
		panel_8_4.add(sLabel);

		final JPanel panel_8_4_1 = new JPanel();
		panel_8_4_1.setBackground(Color.WHITE);
		panel_8_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1.setLayout(null);
		panel_8_4_1.setBounds(54, 120, 139, 30);
		panel_10_2.add(panel_8_4_1);

		final JLabel sLabel_1 = new JLabel();
		sLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		sLabel_1.setText("EKG");
		sLabel_1.setBounds(0, 0, 139, 30);
		panel_8_4_1.add(sLabel_1);

		final JPanel panel_18 = new JPanel();
		panel_18.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBounds(0, 150, 264, 64);
		panel_10_2.add(panel_18);

		final JLabel ultrasoundSpecifyLabel = new JLabel();
		ultrasoundSpecifyLabel.setBackground(Color.WHITE);
		ultrasoundSpecifyLabel.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		ultrasoundSpecifyLabel.setText("  ULTRASOUND ");
		ultrasoundSpecifyLabel.setBounds(0, 0, 264, 64);
		panel_18.add(ultrasoundSpecifyLabel);

		final JLabel specifyLabel = new JLabel();
		specifyLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		specifyLabel.setText("SPECIFY");
		specifyLabel.setBounds(103, 27, 54, 14);
		panel_18.add(specifyLabel);

		final JLabel pleaseCircleLabel = new JLabel();
		pleaseCircleLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		pleaseCircleLabel.setText("      - Please circle Diag. Code -");
		pleaseCircleLabel.setBounds(275, 990, 236, 24);
		add(pleaseCircleLabel);

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
		PanelEkgxray panel = new PanelEkgxray();
		scroller.setViewportView(panel);
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
