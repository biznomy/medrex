package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.rmi.RemoteException;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderForm1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2302676840076730017L;
	private JTextField txt$DateAdmitted;
	private static final int ROW_LIMIT = 9;

	private ButtonGroup bgFlush = new ButtonGroup();
	private JTextField txtFlushAdditionalAt;
	private JLabel mlH20FlushLabel;
	private JTextField txtFlushAdditionalMl;
	private JRadioButton rbFlushAdditional;
	private JLabel mlBeforeLabel;
	private JTextField txtFlushH20Ml;
	private JRadioButton rbFlushH20;
	private JLabel xChangeFeedingLabel;
	private JTextField txtStomaCare;
	private JLabel xStomaCareLabel;
	private JTextPane xChkGastricTextPane;
	private JTextPane xCheckTubeTextPane;
	private JLabel xMaintainResidentsLabel;
	private JLabel mlLabel_2;
	private JTextField txtTotalVolFluidsMl;
	private JLabel totalVolumeOfLabel;
	private JLabel calLabel_1;
	private JTextField txtTotalProteinGrams;
	private JLabel totalCalories24HrsLabel_1;
	private JLabel calLabel;
	private JTextField txtTotalCaloriesCal;
	private JLabel totalCalories24HrsLabel;
	private JLabel chooseFlushLabel;
	private JTextField txtAdditionalSupp;
	private JLabel additionalSupplementLabel;
	private JTextField txtBolusVolFeedingFrequency;
	private JLabel frequencyLabel;
	private JLabel mlLabel_1;
	private JTextField txtBolusVolFeeding;
	private JLabel bolusVolumeFeedingLabel;
	private JLabel mlhrLabel;
	private JTextField txtFeedingAt;
	private JLabel atLabel;
	private JTextField txtFeedingFrom02;
	private JLabel label;
	private JTextField txtFeedingFrom01;
	private ButtonGroup bgMethodAdmin = new ButtonGroup();
	private JLabel fromLabel;
	private JLabel hrsLabel;
	private JTextField txtVolOfFeedingsHrs;
	private JLabel mlLabel;
	private JTextField txtVolOfFeedingsMl;
	private JLabel volumeOfFeedings24Label;
	private JTextField txtNumberOfFeedings;
	private JLabel numberOfFeedings24Label;
	private JTextField txtMethodRationale;
	private JLabel rationaleLabel_1;
	private JRadioButton rbMethodAdminBolus;
	private JRadioButton rbMethodAdminGravity;
	private JRadioButton rbMethodAdminPump;
	private JLabel methodOfAdministrationsLabel;
	private JTextField txtRouteRationale;
	private JLabel rationaleLabel;
	private JTextField txtAdminSize;
	private JLabel sizeLabel;
	private ButtonGroup bgRouteAdmin = new ButtonGroup();
	private JRadioButton rbRouteAdminJt;
	private JRadioButton rbRouteAdminGt;
	private JLabel routeOfAdministrationLabel;
	private JTextField txtFormulaStrength;
	private JLabel formulastrength_Label;
	private ButtonGroup bgPoSnacks = new ButtonGroup();
	private JRadioButton rbPoSnacksNo;
	private JRadioButton rbPoSnacksYes;
	private JLabel poSnacksForLabel;
	private ButtonGroup bgNpo = new ButtonGroup();
	private JRadioButton rbNpoNo;
	private JRadioButton rbNpoYes;
	private JLabel npoLabel;
	private JPanel panel_38;
	private JLabel retainWhiteCopyLabel;
	private JPanel panel_37;
	private JPanel panel_36;
	private JTextField txt$ResidentNumber;
	private JTextField txt$ResidentName02;
	private JTextField txt$ResidentRoomNumber;
	private JLabel residentNumberLabel;
	private JSeparator separator_2;
	private JLabel residentNameLabel;
	private JSeparator separator;
	private JLabel roomNumberLabel;
	private JPanel panel_32;
	private JTextField txt$ResidentName;
	private JLabel physiciansNameLabel_3;
	private JPanel panel_35;
	private JLabel physiciansNameLabel_2;
	private JPanel panel_34;
	private JTextField txt$PhysicianTelNumber;
	private JLabel physiciansNameLabel_1;
	private JPanel panel_33;
	private JTextField txt$PhysiciansNumber;
	private JLabel numberLabel;
	private JTextField txt$PhysiciansName;
	private JLabel physiciansNameLabel;
	private JPanel panel_31;
	private JTextArea txt$Allergies;
	private JLabel allergiesLabel;
	private JPanel panel_30;
	private JTextArea txt$Diet;
	private JLabel dietLabel;
	private JPanel panel_29;
	private JTextArea txt$Diagnosis;
	private JLabel diagnosisLabel;
	private JPanel panel_28;
	private JPanel panel_27;
	private JComboBox cmbPharmacyConsultantSign;
	private JLabel pharmacyConsultantSignatureLabel;
	private JPanel panel_26;
	private JComboBox cmbDoctorSignature;
	private JTextPane thisPrescriptionWillTextPane;
	private JLabel dispenseAsWrittenLabel;
	private JTextPane iCertifyTheTextPane;
	private JDateChooser dcMdSignDate;
	private JLabel dateLabel_7;
	private JComboBox cmbMdSignature;
	private JLabel mDSignatureLabel;
	private JPanel panel_16;
	private JTextField txtReviewedTime01;
	private JLabel dateLabel_6;
	private JPanel panel_25;
	private JDateChooser dcReviewedDate01;
	private JLabel dateLabel_5;
	private JPanel panel_24;
	private JTextField txtReviewedBy01;
	private JLabel reviewedByLabel_2;
	private JPanel panel_23;
	private JPanel panel_22;
	private JTextField txtReviewedTime02;
	private JLabel dateLabel_4;
	private JPanel panel_21;
	private JDateChooser dcReviewedDate02;
	private JLabel dateLabel_3;
	private JPanel panel_20;
	private JTextField txtReviewedBy02;
	private JLabel reviewedByLabel_1;
	private JPanel panel_19;
	private JPanel panel_18;
	private JTextField txtReviewedTime03;
	private JLabel dateLabel_2;
	private JPanel panel_17;
	private JDateChooser dcReviewedDate03;
	private JLabel dateLabel_1;
	private JPanel panel_15;
	private JTextField txtReviewedBy03;
	private JLabel reviewedByLabel;
	private JPanel panel_14;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_11;
	private JPanel panel_10;
	private JLabel currentPlanOfLabel;
	private JLabel dateLabel;
	private JLabel hrLabel;
	private JLabel physiciansCurrentOrdersLabel;
	private JPanel panel_6;
	private JTextField txt$PatientNumber;
	private JLabel patientNameLabel_2;
	private JPanel panel_9;
	private JTextField txt$Year;
	private JLabel sexLabel_2;
	private JPanel panel_8;
	private JTextField txt$Month;
	private JLabel sexLabel_1;
	private JPanel panel_7;
	private JTextField txt$Sex;
	private JLabel sexLabel;
	private JPanel panel_5;
	private JPanel panel_2;
	private JTextField txt$Location;
	private JLabel patientNameLabel_1;
	private JPanel panel_4;
	private JTextField txt$PatientName;
	private JLabel patientNameLabel;
	private JPanel panel_3;
	private JPanel panel_1;
	private JTextField lblTitleLable_2;
	private JTextField lblTitleLabel_1;
	private JLabel t9082416337Label_1;
	private JLabel t9082416337Label;
	private JLabel physiciansOrderFormLabel_1;
	private JLabel physiciansOrderFormLabel;
	private JPanel panel;
	private PanelPhysicianOrderForm1Row rowArr[];
	public static final Color FormColor = new Color(51, 0, 204);

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm1() {
		super();
		Global.panelPhysicianOrderForm1 = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 1300));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 92);
		add(panel);

		physiciansOrderFormLabel = new JLabel();
		physiciansOrderFormLabel.setForeground(FormColor);
		physiciansOrderFormLabel.setFont(new Font("", Font.BOLD, 16));
		physiciansOrderFormLabel.setText("Physician's Order Form");
		physiciansOrderFormLabel.setBounds(10, 10, 179, 21);
		panel.add(physiciansOrderFormLabel);

		physiciansOrderFormLabel_1 = new JLabel();
		physiciansOrderFormLabel_1.setForeground(FormColor);
		physiciansOrderFormLabel_1.setFont(new Font("", Font.BOLD, 14));
		physiciansOrderFormLabel_1.setText("Specialty");
		physiciansOrderFormLabel_1.setBounds(608, 28, 63, 21);
		panel.add(physiciansOrderFormLabel_1);

		t9082416337Label = new JLabel();
		t9082416337Label.setForeground(FormColor);
		t9082416337Label.setText("T (908) 241-6337");
		t9082416337Label.setBounds(618, 48, 84, 16);
		panel.add(t9082416337Label);

		t9082416337Label_1 = new JLabel();
		t9082416337Label_1.setForeground(FormColor);
		t9082416337Label_1.setText("F (908) 241-6338");
		t9082416337Label_1.setBounds(618, 62, 84, 16);
		panel.add(t9082416337Label_1);

		lblTitleLabel_1 = new JTextField();
		lblTitleLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		lblTitleLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleLabel_1.setText("PLAZA HEALTHCARE REHAB");
		lblTitleLabel_1.setFocusable(false);
		lblTitleLabel_1.setBackground(Color.WHITE);
		lblTitleLabel_1.setEditable(false);
		lblTitleLabel_1.setBorder(new LineBorder(FormColor, 1, false));
		lblTitleLabel_1.setBounds(160, 48, 185, 32);
		panel.add(lblTitleLabel_1);

		lblTitleLable_2 = new JTextField();
		lblTitleLable_2.setFocusable(false);
		lblTitleLable_2.setBackground(Color.WHITE);
		lblTitleLable_2.setEditable(false);
		lblTitleLable_2.setBorder(new LineBorder(FormColor, 1, false));
		lblTitleLable_2.setBounds(380, 48, 185, 32);
		panel.add(lblTitleLable_2);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(FormColor, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 92, 800, 64);
		add(panel_1);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(FormColor, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 208, 45);
		panel_1.add(panel_3);

		patientNameLabel = new JLabel();
		patientNameLabel.setForeground(FormColor);
		patientNameLabel.setText("PATIENT NAME");
		patientNameLabel.setBounds(3, 3, 73, 14);
		panel_3.add(patientNameLabel);

		txt$PatientName = new JTextField();
		txt$PatientName.setBackground(Color.WHITE);
		txt$PatientName.setEditable(false);
		txt$PatientName.setBounds(3, 20, 202, 22);
		panel_3.add(txt$PatientName);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(FormColor, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(207, 0, 198, 45);
		panel_1.add(panel_4);

		patientNameLabel_1 = new JLabel();
		patientNameLabel_1.setForeground(FormColor);
		patientNameLabel_1.setText("LOCATION");
		patientNameLabel_1.setBounds(3, 3, 73, 14);
		panel_4.add(patientNameLabel_1);

		txt$Location = new JTextField();
		txt$Location.setBackground(Color.WHITE);
		txt$Location.setEditable(false);
		txt$Location.setBounds(3, 20, 192, 22);
		panel_4.add(txt$Location);

		panel_2 = new JPanel();
		panel_2.setBackground(FormColor);
		panel_2.setBorder(new LineBorder(FormColor, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(404, 0, 87, 45);
		panel_1.add(panel_2);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(FormColor, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(490, 0, 35, 45);
		panel_1.add(panel_5);

		sexLabel = new JLabel();
		sexLabel.setForeground(FormColor);
		sexLabel.setText("SEX");
		sexLabel.setBounds(9, 3, 18, 14);
		panel_5.add(sexLabel);

		txt$Sex = new JTextField();
		txt$Sex.setBackground(Color.WHITE);
		txt$Sex.setEditable(false);
		txt$Sex.setBounds(3, 20, 30, 22);
		panel_5.add(txt$Sex);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(FormColor, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(524, 0, 35, 45);
		panel_1.add(panel_7);

		sexLabel_1 = new JLabel();
		sexLabel_1.setForeground(FormColor);
		sexLabel_1.setText("MO");
		sexLabel_1.setBounds(10, 3, 16, 14);
		panel_7.add(sexLabel_1);

		txt$Month = new JTextField();
		txt$Month.setBackground(Color.WHITE);
		txt$Month.setEditable(false);
		txt$Month.setBounds(3, 20, 30, 22);
		panel_7.add(txt$Month);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(FormColor, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(558, 0, 45, 45);
		panel_1.add(panel_8);

		sexLabel_2 = new JLabel();
		sexLabel_2.setForeground(FormColor);
		sexLabel_2.setText("YEAR");
		sexLabel_2.setBounds(9, 3, 26, 14);
		panel_8.add(sexLabel_2);

		txt$Year = new JTextField();
		txt$Year.setBackground(Color.WHITE);
		txt$Year.setEditable(false);
		txt$Year.setBounds(3, 20, 40, 22);
		panel_8.add(txt$Year);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(FormColor, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(602, 0, 198, 45);
		panel_1.add(panel_9);

		patientNameLabel_2 = new JLabel();
		patientNameLabel_2.setForeground(FormColor);
		patientNameLabel_2.setText("PATIENT NUMBER");
		patientNameLabel_2.setBounds(3, 3, 86, 14);
		panel_9.add(patientNameLabel_2);

		txt$PatientNumber = new JTextField();
		txt$PatientNumber.setBackground(Color.WHITE);
		txt$PatientNumber.setEditable(false);
		txt$PatientNumber.setBounds(3, 20, 192, 22);
		panel_9.add(txt$PatientNumber);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(FormColor, 1, false));
		panel_6.setForeground(Color.WHITE);
		panel_6.setBackground(FormColor);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 44, 800, 20);
		panel_1.add(panel_6);

		physiciansCurrentOrdersLabel = new JLabel();
		physiciansCurrentOrdersLabel.setForeground(Color.WHITE);
		physiciansCurrentOrdersLabel.setText("PHYSICIAN'S CURRENT ORDERS");
		physiciansCurrentOrdersLabel.setBounds(28, 3, 156, 14);
		panel_6.add(physiciansCurrentOrdersLabel);

		hrLabel = new JLabel();
		hrLabel.setForeground(Color.WHITE);
		hrLabel.setText("HR");
		hrLabel.setBounds(214, 3, 14, 14);
		panel_6.add(hrLabel);

		dateLabel = new JLabel();
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setText("DATE");
		dateLabel.setBounds(254, 3, 26, 14);
		panel_6.add(dateLabel);

		currentPlanOfLabel = new JLabel();
		currentPlanOfLabel.setForeground(Color.WHITE);
		currentPlanOfLabel.setText("CURRENT PLAN OF CARE");
		currentPlanOfLabel.setBounds(458, 3, 122, 14);
		panel_6.add(currentPlanOfLabel);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(FormColor, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 156, 305, 901);
		add(panel_10);

		rowArr = new PanelPhysicianOrderForm1Row[ROW_LIMIT];
		for (int i = 0; i < rowArr.length; i++) {
			rowArr[i] = new PanelPhysicianOrderForm1Row(i + 1);
			rowArr[i].setBounds(0, i * 100, 305, 101);
			panel_10.add(rowArr[i]);
		}

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(FormColor, 1, false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(304, 156, 496, 945);
		add(panel_11);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(FormColor, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(0, 923, 496, 22);
		panel_11.add(panel_12);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(FormColor, 1, false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 0, 286, 22);
		panel_12.add(panel_14);

		reviewedByLabel = new JLabel();
		reviewedByLabel.setForeground(FormColor);
		reviewedByLabel.setText("REVIEWED BY:");
		reviewedByLabel.setBounds(3, 4, 71, 14);
		panel_14.add(reviewedByLabel);

		txtReviewedBy03 = new JTextField();
		txtReviewedBy03.setBounds(80, 2, 205, 19);
		panel_14.add(txtReviewedBy03);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(FormColor, 1, false));
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(285, 0, 116, 22);
		panel_12.add(panel_15);

		dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(FormColor);
		dateLabel_1.setText("DATE:");
		dateLabel_1.setBounds(4, 4, 30, 14);
		panel_15.add(dateLabel_1);

		dcReviewedDate03 = new JDateChooser();
		dcReviewedDate03.setDateFormatString("MM/dd/YYYY");
		dcReviewedDate03.setBounds(39, 2, 75, 19);
		panel_15.add(dcReviewedDate03);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(FormColor, 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(399, 0, 97, 22);
		panel_12.add(panel_17);

		dateLabel_2 = new JLabel();
		dateLabel_2.setForeground(FormColor);
		dateLabel_2.setText("TIME:");
		dateLabel_2.setBounds(4, 4, 30, 14);
		panel_17.add(dateLabel_2);

		txtReviewedTime03 = new JTextField();
		txtReviewedTime03.setBounds(40, 2, 55, 19);
		panel_17.add(txtReviewedTime03);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(FormColor, 1, false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(285, 761, 75, 65);
		panel_11.add(panel_13);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(FormColor, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 902, 496, 22);
		panel_11.add(panel_18);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(FormColor, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 0, 286, 22);
		panel_18.add(panel_19);

		reviewedByLabel_1 = new JLabel();
		reviewedByLabel_1.setForeground(FormColor);
		reviewedByLabel_1.setText("REVIEWED BY:");
		reviewedByLabel_1.setBounds(3, 4, 71, 14);
		panel_19.add(reviewedByLabel_1);

		txtReviewedBy02 = new JTextField();
		txtReviewedBy02.setBounds(80, 2, 205, 19);
		panel_19.add(txtReviewedBy02);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(FormColor, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(285, 0, 116, 22);
		panel_18.add(panel_20);

		dateLabel_3 = new JLabel();
		dateLabel_3.setForeground(FormColor);
		dateLabel_3.setText("DATE:");
		dateLabel_3.setBounds(4, 4, 30, 14);
		panel_20.add(dateLabel_3);

		dcReviewedDate02 = new JDateChooser();
		dcReviewedDate02.setDateFormatString("MM/dd/YYYY");
		dcReviewedDate02.setBounds(39, 2, 75, 19);
		panel_20.add(dcReviewedDate02);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(FormColor, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(399, 0, 97, 22);
		panel_18.add(panel_21);

		dateLabel_4 = new JLabel();
		dateLabel_4.setForeground(FormColor);
		dateLabel_4.setText("TIME:");
		dateLabel_4.setBounds(4, 4, 30, 14);
		panel_21.add(dateLabel_4);

		txtReviewedTime02 = new JTextField();
		txtReviewedTime02.setBounds(40, 2, 55, 19);
		panel_21.add(txtReviewedTime02);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(FormColor, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 881, 496, 22);
		panel_11.add(panel_22);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(FormColor, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(0, 0, 286, 22);
		panel_22.add(panel_23);

		reviewedByLabel_2 = new JLabel();
		reviewedByLabel_2.setForeground(FormColor);
		reviewedByLabel_2.setText("REVIEWED BY:");
		reviewedByLabel_2.setBounds(3, 4, 71, 14);
		panel_23.add(reviewedByLabel_2);

		txtReviewedBy01 = new JTextField();
		txtReviewedBy01.setBounds(80, 2, 205, 19);
		panel_23.add(txtReviewedBy01);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(FormColor, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(285, 0, 116, 22);
		panel_22.add(panel_24);

		dateLabel_5 = new JLabel();
		dateLabel_5.setForeground(FormColor);
		dateLabel_5.setText("DATE:");
		dateLabel_5.setBounds(4, 4, 30, 14);
		panel_24.add(dateLabel_5);

		dcReviewedDate01 = new JDateChooser();
		dcReviewedDate01.setDateFormatString("MM/dd/YYYY");
		dcReviewedDate01.setBounds(39, 2, 75, 19);
		panel_24.add(dcReviewedDate01);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(FormColor, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(399, 0, 97, 22);
		panel_22.add(panel_25);

		dateLabel_6 = new JLabel();
		dateLabel_6.setForeground(FormColor);
		dateLabel_6.setText("TIME:");
		dateLabel_6.setBounds(4, 4, 30, 14);
		panel_25.add(dateLabel_6);

		txtReviewedTime01 = new JTextField();
		txtReviewedTime01.setBounds(40, 2, 55, 19);
		panel_25.add(txtReviewedTime01);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(FormColor, 1, false));
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(0, 852, 496, 30);
		panel_11.add(panel_16);

		mDSignatureLabel = new JLabel();
		mDSignatureLabel.setForeground(FormColor);
		mDSignatureLabel.setText("M. D. SIGNATURE");
		mDSignatureLabel.setBounds(3, 3, 86, 14);
		panel_16.add(mDSignatureLabel);

		cmbMdSignature = new JComboBox();
		cmbMdSignature.setBackground(Color.WHITE);
		cmbMdSignature.setBounds(95, 3, 214, 25);
		panel_16.add(cmbMdSignature);

		dateLabel_7 = new JLabel();
		dateLabel_7.setForeground(FormColor);
		dateLabel_7.setText("DATE:");
		dateLabel_7.setBounds(315, 3, 30, 14);
		panel_16.add(dateLabel_7);

		dcMdSignDate = new JDateChooser();
		dcMdSignDate.setDateFormatString("MM/dd/yyyy");
		dcMdSignDate.setBounds(351, 3, 142, 25);
		panel_16.add(dcMdSignDate);

		iCertifyTheTextPane = new JTextPane();
		iCertifyTheTextPane.setMargin(new Insets(0, 0, 0, 0));
		iCertifyTheTextPane.setFocusable(false);
		iCertifyTheTextPane.setEditable(false);
		iCertifyTheTextPane.setForeground(FormColor);
		iCertifyTheTextPane
				.setText("I CERTIFY THE ABOVE NAMED RESIDENT IS IN NEED OF CONTINUED (NF) CARE");
		iCertifyTheTextPane.setBounds(5, 770, 264, 30);
		panel_11.add(iCertifyTheTextPane);

		dispenseAsWrittenLabel = new JLabel();
		dispenseAsWrittenLabel.setFont(new Font("", Font.PLAIN, 10));
		dispenseAsWrittenLabel.setForeground(FormColor);
		dispenseAsWrittenLabel.setText("Dispense As Written");
		dispenseAsWrittenLabel.setBounds(276, 832, 92, 14);
		panel_11.add(dispenseAsWrittenLabel);

		thisPrescriptionWillTextPane = new JTextPane();
		thisPrescriptionWillTextPane
				.setText("This prescription will be filled generically unless prescriber writes d a w in the box.");
		thisPrescriptionWillTextPane.setForeground(FormColor);
		thisPrescriptionWillTextPane.setBounds(380, 761, 104, 72);
		panel_11.add(thisPrescriptionWillTextPane);

		cmbDoctorSignature = new JComboBox();
		cmbDoctorSignature.setBackground(Color.WHITE);
		cmbDoctorSignature.setBounds(10, 810, 260, 25);
		panel_11.add(cmbDoctorSignature);

		panel_38 = new JPanel();
		panel_38.setBackground(Color.WHITE);
		panel_38.setLayout(null);
		panel_38.setBounds(5, 5, 486, 750);
		panel_11.add(panel_38);

		npoLabel = new JLabel();
		npoLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		npoLabel.setText("NPO:");
		npoLabel.setBounds(10, 10, 28, 14);
		panel_38.add(npoLabel);

		rbNpoYes = new JRadioButton();
		rbNpoYes.setActionCommand("1");
		rbNpoYes.setBackground(Color.WHITE);
		bgNpo.add(rbNpoYes);
		rbNpoYes.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbNpoYes.setText("Yes");
		rbNpoYes.setBounds(56, 7, 51, 18);
		panel_38.add(rbNpoYes);

		rbNpoNo = new JRadioButton();
		rbNpoNo.setActionCommand("2");
		rbNpoNo.setBackground(Color.WHITE);
		bgNpo.add(rbNpoNo);
		rbNpoNo.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbNpoNo.setText("No");
		rbNpoNo.setBounds(113, 7, 51, 18);
		panel_38.add(rbNpoNo);

		poSnacksForLabel = new JLabel();
		poSnacksForLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		poSnacksForLabel.setText("PO SNACKS FOR QUALITY OF LIFE:");
		poSnacksForLabel.setBounds(10, 39, 210, 14);
		panel_38.add(poSnacksForLabel);

		rbPoSnacksYes = new JRadioButton();
		rbPoSnacksYes.setActionCommand("1");
		rbPoSnacksYes.setBackground(Color.WHITE);
		rbPoSnacksYes.setFont(new Font("Courier New", Font.PLAIN, 12));
		bgPoSnacks.add(rbPoSnacksYes);
		rbPoSnacksYes.setText("Yes");
		rbPoSnacksYes.setBounds(226, 36, 51, 18);
		panel_38.add(rbPoSnacksYes);

		rbPoSnacksNo = new JRadioButton();
		rbPoSnacksNo.setActionCommand("2");
		rbPoSnacksNo.setBackground(Color.WHITE);
		rbPoSnacksNo.setFont(new Font("Courier New", Font.PLAIN, 12));
		bgPoSnacks.add(rbPoSnacksNo);
		rbPoSnacksNo.setText("No");
		rbPoSnacksNo.setBounds(283, 36, 51, 18);
		panel_38.add(rbPoSnacksNo);

		formulastrength_Label = new JLabel();
		formulastrength_Label.setFont(new Font("Courier New", Font.PLAIN, 12));
		formulastrength_Label.setText("FORMULA/STRENGTH:");
		formulastrength_Label.setBounds(10, 68, 119, 14);
		panel_38.add(formulastrength_Label);

		txtFormulaStrength = new JTextField();
		txtFormulaStrength.setBounds(135, 65, 341, 21);
		panel_38.add(txtFormulaStrength);

		routeOfAdministrationLabel = new JLabel();
		routeOfAdministrationLabel.setFont(new Font("Courier New", Font.PLAIN,
				12));
		routeOfAdministrationLabel.setText("ROUTE OF ADMINISTRATION:");
		routeOfAdministrationLabel.setBounds(10, 97, 168, 14);
		panel_38.add(routeOfAdministrationLabel);

		rbRouteAdminGt = new JRadioButton();
		rbRouteAdminGt.setActionCommand("1");
		rbRouteAdminGt.setBackground(Color.WHITE);
		bgRouteAdmin.add(rbRouteAdminGt);
		rbRouteAdminGt.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbRouteAdminGt.setText("GT");
		rbRouteAdminGt.setBounds(184, 94, 51, 18);
		panel_38.add(rbRouteAdminGt);

		rbRouteAdminJt = new JRadioButton();
		rbRouteAdminJt.setActionCommand("2");
		rbRouteAdminJt.setBackground(Color.WHITE);
		rbRouteAdminJt.setFont(new Font("Courier New", Font.PLAIN, 12));
		bgRouteAdmin.add(rbRouteAdminJt);
		rbRouteAdminJt.setText("JT");
		rbRouteAdminJt.setBounds(241, 94, 51, 18);
		panel_38.add(rbRouteAdminJt);

		sizeLabel = new JLabel();
		sizeLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		sizeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		sizeLabel.setText("SIZE:");
		sizeLabel.setBounds(299, 97, 40, 14);
		panel_38.add(sizeLabel);

		txtAdminSize = new JTextField();
		txtAdminSize.setBounds(345, 93, 131, 21);
		panel_38.add(txtAdminSize);

		rationaleLabel = new JLabel();
		rationaleLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		rationaleLabel.setText("RATIONALE:");
		rationaleLabel.setBounds(108, 126, 70, 14);
		panel_38.add(rationaleLabel);

		txtRouteRationale = new JTextField();
		txtRouteRationale.setBounds(184, 121, 292, 21);
		panel_38.add(txtRouteRationale);

		methodOfAdministrationsLabel = new JLabel();
		methodOfAdministrationsLabel.setFont(new Font("Courier New",
				Font.PLAIN, 12));
		methodOfAdministrationsLabel.setText("METHOD OF ADMINISTRATIONS:");
		methodOfAdministrationsLabel.setBounds(10, 155, 182, 14);
		panel_38.add(methodOfAdministrationsLabel);

		rbMethodAdminPump = new JRadioButton();
		rbMethodAdminPump.setActionCommand("1");
		rbMethodAdminPump.setBackground(Color.WHITE);
		bgMethodAdmin.add(rbMethodAdminPump);
		rbMethodAdminPump.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbMethodAdminPump.setText("PUMP");
		rbMethodAdminPump.setBounds(198, 152, 51, 18);
		panel_38.add(rbMethodAdminPump);

		rbMethodAdminGravity = new JRadioButton();
		rbMethodAdminGravity.setActionCommand("2");
		rbMethodAdminGravity.setBackground(Color.WHITE);
		bgMethodAdmin.add(rbMethodAdminGravity);
		rbMethodAdminGravity.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbMethodAdminGravity.setText("GRAVITY");
		rbMethodAdminGravity.setBounds(255, 152, 70, 18);
		panel_38.add(rbMethodAdminGravity);

		rbMethodAdminBolus = new JRadioButton();
		rbMethodAdminBolus.setActionCommand("3");
		rbMethodAdminBolus.setBackground(Color.WHITE);
		bgMethodAdmin.add(rbMethodAdminBolus);
		rbMethodAdminBolus.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbMethodAdminBolus.setText("BOLUS");
		rbMethodAdminBolus.setBounds(331, 152, 53, 18);
		panel_38.add(rbMethodAdminBolus);

		rationaleLabel_1 = new JLabel();
		rationaleLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		rationaleLabel_1.setText("RATIONALE:");
		rationaleLabel_1.setBounds(108, 184, 70, 14);
		panel_38.add(rationaleLabel_1);

		txtMethodRationale = new JTextField();
		txtMethodRationale.setBounds(184, 179, 292, 21);
		panel_38.add(txtMethodRationale);

		numberOfFeedings24Label = new JLabel();
		numberOfFeedings24Label
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		numberOfFeedings24Label.setText("NUMBER OF FEEDINGS/24 HRS:");
		numberOfFeedings24Label.setBounds(10, 213, 182, 14);
		panel_38.add(numberOfFeedings24Label);

		txtNumberOfFeedings = new JTextField();
		txtNumberOfFeedings.setBounds(198, 209, 278, 21);
		panel_38.add(txtNumberOfFeedings);

		volumeOfFeedings24Label = new JLabel();
		volumeOfFeedings24Label
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		volumeOfFeedings24Label.setText("VOLUME OF FEEDINGS/24 HRS:");
		volumeOfFeedings24Label.setBounds(10, 242, 182, 14);
		panel_38.add(volumeOfFeedings24Label);

		txtVolOfFeedingsMl = new JTextField();
		txtVolOfFeedingsMl.setBounds(198, 238, 89, 21);
		panel_38.add(txtVolOfFeedingsMl);

		mlLabel = new JLabel();
		mlLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlLabel.setText("ML   X");
		mlLabel.setBounds(290, 241, 49, 14);
		panel_38.add(mlLabel);

		txtVolOfFeedingsHrs = new JTextField();
		txtVolOfFeedingsHrs.setBounds(345, 238, 105, 21);
		panel_38.add(txtVolOfFeedingsHrs);

		hrsLabel = new JLabel();
		hrsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		hrsLabel.setText("HRS");
		hrsLabel.setBounds(454, 241, 22, 14);
		panel_38.add(hrsLabel);

		fromLabel = new JLabel();
		fromLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		fromLabel.setText("FROM:");
		fromLabel.setBounds(10, 271, 35, 14);
		panel_38.add(fromLabel);

		txtFeedingFrom01 = new JTextField();
		txtFeedingFrom01.setBounds(56, 267, 89, 21);
		panel_38.add(txtFeedingFrom01);

		label = new JLabel();
		label.setFont(new Font("Courier New", Font.PLAIN, 12));
		label.setText("-");
		label.setBounds(148, 270, 7, 14);
		panel_38.add(label);

		txtFeedingFrom02 = new JTextField();
		txtFeedingFrom02.setBounds(158, 267, 89, 21);
		panel_38.add(txtFeedingFrom02);

		atLabel = new JLabel();
		atLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		atLabel.setText("AT");
		atLabel.setBounds(255, 270, 14, 14);
		panel_38.add(atLabel);

		txtFeedingAt = new JTextField();
		txtFeedingAt.setBounds(275, 267, 160, 21);
		panel_38.add(txtFeedingAt);

		mlhrLabel = new JLabel();
		mlhrLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlhrLabel.setText("ML/HR");
		mlhrLabel.setBounds(441, 270, 35, 14);
		panel_38.add(mlhrLabel);

		bolusVolumeFeedingLabel = new JLabel();
		bolusVolumeFeedingLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		bolusVolumeFeedingLabel.setText("BOLUS VOLUME FEEDING:");
		bolusVolumeFeedingLabel.setBounds(10, 300, 147, 14);
		panel_38.add(bolusVolumeFeedingLabel);

		txtBolusVolFeeding = new JTextField();
		txtBolusVolFeeding.setBounds(162, 296, 83, 21);
		panel_38.add(txtBolusVolFeeding);

		mlLabel_1 = new JLabel();
		mlLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlLabel_1.setText("ML");
		mlLabel_1.setBounds(250, 300, 14, 14);
		panel_38.add(mlLabel_1);

		frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		frequencyLabel.setText("FREQUENCY:");
		frequencyLabel.setBounds(283, 300, 70, 14);
		panel_38.add(frequencyLabel);

		txtBolusVolFeedingFrequency = new JTextField();
		txtBolusVolFeedingFrequency.setBounds(359, 296, 117, 21);
		panel_38.add(txtBolusVolFeedingFrequency);

		additionalSupplementLabel = new JLabel();
		additionalSupplementLabel.setFont(new Font("Courier New", Font.PLAIN,
				12));
		additionalSupplementLabel.setText("ADDITIONAL SUPPLEMENT:");
		additionalSupplementLabel.setBounds(10, 329, 154, 14);
		panel_38.add(additionalSupplementLabel);

		txtAdditionalSupp = new JTextField();
		txtAdditionalSupp.setBounds(170, 325, 306, 21);
		panel_38.add(txtAdditionalSupp);

		chooseFlushLabel = new JLabel();
		chooseFlushLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		chooseFlushLabel.setText("CHOOSE FLUSH:");
		chooseFlushLabel.setBounds(10, 358, 92, 14);
		panel_38.add(chooseFlushLabel);

		totalCalories24HrsLabel = new JLabel();
		totalCalories24HrsLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		totalCalories24HrsLabel.setText("TOTAL CALORIES/24 HRS:");
		totalCalories24HrsLabel.setBounds(10, 430, 154, 14);
		panel_38.add(totalCalories24HrsLabel);

		txtTotalCaloriesCal = new JTextField();
		txtTotalCaloriesCal.setBounds(170, 426, 164, 21);
		panel_38.add(txtTotalCaloriesCal);

		calLabel = new JLabel();
		calLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		calLabel.setText("CAL");
		calLabel.setBounds(341, 429, 28, 14);
		panel_38.add(calLabel);

		totalCalories24HrsLabel_1 = new JLabel();
		totalCalories24HrsLabel_1.setFont(new Font("Courier New", Font.PLAIN,
				12));
		totalCalories24HrsLabel_1.setText("TOTAL PROTEIN/24 HRS:");
		totalCalories24HrsLabel_1.setBounds(10, 459, 154, 14);
		panel_38.add(totalCalories24HrsLabel_1);

		txtTotalProteinGrams = new JTextField();
		txtTotalProteinGrams.setBounds(170, 455, 164, 21);
		panel_38.add(txtTotalProteinGrams);

		calLabel_1 = new JLabel();
		calLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		calLabel_1.setText("GRAMS");
		calLabel_1.setBounds(341, 459, 40, 14);
		panel_38.add(calLabel_1);

		totalVolumeOfLabel = new JLabel();
		totalVolumeOfLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		totalVolumeOfLabel.setText("TOTAL VOLUME OF FLUIDS VIA TUBE/24 HRS:");
		totalVolumeOfLabel.setBounds(10, 488, 273, 14);
		panel_38.add(totalVolumeOfLabel);

		txtTotalVolFluidsMl = new JTextField();
		txtTotalVolFluidsMl.setBounds(290, 484, 131, 21);
		panel_38.add(txtTotalVolFluidsMl);

		mlLabel_2 = new JLabel();
		mlLabel_2.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlLabel_2.setText("ML");
		mlLabel_2.setBounds(432, 487, 22, 14);
		panel_38.add(mlLabel_2);

		xMaintainResidentsLabel = new JLabel();
		xMaintainResidentsLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		xMaintainResidentsLabel
				.setText("X MAINTAIN RESIDENT'S HEAD AT 45 DEGREES AT ALL TIMES");
		xMaintainResidentsLabel.setBounds(10, 544, 466, 14);
		panel_38.add(xMaintainResidentsLabel);

		xCheckTubeTextPane = new JTextPane();
		xCheckTubeTextPane.setMargin(new Insets(0, 0, 0, 0));
		xCheckTubeTextPane.setFont(new Font("Courier New", Font.PLAIN, 12));
		xCheckTubeTextPane
				.setText("X CHECK TUBE PLACEMENT BEFORE EACH FEEDING, H20 FLUSH & ADMIN. OF MEDS");
		xCheckTubeTextPane.setBounds(10, 564, 466, 28);
		panel_38.add(xCheckTubeTextPane);

		xChkGastricTextPane = new JTextPane();
		xChkGastricTextPane.setMargin(new Insets(0, 0, 0, 0));
		xChkGastricTextPane.setFont(new Font("Courier New", Font.PLAIN, 12));
		xChkGastricTextPane
				.setText("X CHK GASTRIC RESIDUAL BEFORE EACH FEEDING & DELAY FEEDING IF RESIDUAL > 100ML");
		xChkGastricTextPane.setBounds(10, 598, 466, 28);
		panel_38.add(xChkGastricTextPane);

		xStomaCareLabel = new JLabel();
		xStomaCareLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		xStomaCareLabel.setText("X STOMA CARE:");
		xStomaCareLabel.setBounds(10, 632, 92, 14);
		panel_38.add(xStomaCareLabel);

		txtStomaCare = new JTextField();
		txtStomaCare.setBounds(113, 628, 363, 21);
		panel_38.add(txtStomaCare);

		xChangeFeedingLabel = new JLabel();
		xChangeFeedingLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		xChangeFeedingLabel.setText("X CHANGE FEEDING TUBE PRN");
		xChangeFeedingLabel.setBounds(10, 652, 466, 14);
		panel_38.add(xChangeFeedingLabel);

		rbFlushH20 = new JRadioButton();
		rbFlushH20.setActionCommand("1");
		bgFlush.add(rbFlushH20);
		rbFlushH20.setBackground(Color.WHITE);
		rbFlushH20.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFlushH20.setText("H20 FLUSH OF");
		rbFlushH20.setBounds(108, 355, 104, 18);
		panel_38.add(rbFlushH20);

		txtFlushH20Ml = new JTextField();
		txtFlushH20Ml.setBounds(213, 354, 50, 21);
		panel_38.add(txtFlushH20Ml);

		mlBeforeLabel = new JLabel();
		mlBeforeLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlBeforeLabel.setText("ML BEFORE & AFTER EACH FEEDING");
		mlBeforeLabel.setBounds(266, 357, 210, 14);
		panel_38.add(mlBeforeLabel);

		rbFlushAdditional = new JRadioButton();
		rbFlushAdditional.setActionCommand("2");
		bgFlush.add(rbFlushAdditional);
		rbFlushAdditional.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFlushAdditional.setBackground(Color.WHITE);
		rbFlushAdditional.setText("ADDITIONAL");
		rbFlushAdditional.setBounds(108, 384, 89, 18);
		panel_38.add(rbFlushAdditional);

		txtFlushAdditionalMl = new JTextField();
		txtFlushAdditionalMl.setBounds(198, 382, 61, 21);
		panel_38.add(txtFlushAdditionalMl);

		mlH20FlushLabel = new JLabel();
		mlH20FlushLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		mlH20FlushLabel.setText("ML H20 FLUSH AT");
		mlH20FlushLabel.setBounds(262, 385, 105, 14);
		panel_38.add(mlH20FlushLabel);

		txtFlushAdditionalAt = new JTextField();
		txtFlushAdditionalAt.setBounds(371, 382, 105, 21);
		panel_38.add(txtFlushAdditionalAt);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(FormColor, 1, false));
		panel_26.setBackground(Color.WHITE);
		panel_26.setLayout(null);
		panel_26.setBounds(0, 1056, 305, 45);
		add(panel_26);

		pharmacyConsultantSignatureLabel = new JLabel();
		pharmacyConsultantSignatureLabel.setForeground(FormColor);
		pharmacyConsultantSignatureLabel
				.setText("PHARMACY CONSULTANT SIGNATURE");
		pharmacyConsultantSignatureLabel.setBounds(3, 3, 184, 14);
		panel_26.add(pharmacyConsultantSignatureLabel);

		cmbPharmacyConsultantSign = new JComboBox();
		cmbPharmacyConsultantSign.setBackground(Color.WHITE);
		cmbPharmacyConsultantSign.setBounds(5, 20, 295, 21);
		panel_26.add(cmbPharmacyConsultantSign);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(FormColor, 1, false));
		panel_27.setBackground(Color.WHITE);
		panel_27.setLayout(null);
		panel_27.setBounds(0, 1100, 800, 150);
		add(panel_27);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(FormColor, 1, false));
		panel_28.setBackground(Color.WHITE);
		panel_28.setLayout(null);
		panel_28.setBounds(0, 0, 224, 109);
		panel_27.add(panel_28);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(FormColor);
		diagnosisLabel.setText("DIAGNOSIS");
		diagnosisLabel.setBounds(84, 3, 56, 14);
		panel_28.add(diagnosisLabel);

		txt$Diagnosis = new JTextArea();
		txt$Diagnosis.setBackground(Color.WHITE);
		txt$Diagnosis.setEditable(false);
		txt$Diagnosis.setWrapStyleWord(true);
		txt$Diagnosis.setLineWrap(true);
		txt$Diagnosis.setBounds(3, 18, 218, 88);
		panel_28.add(txt$Diagnosis);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(FormColor, 1, false));
		panel_29.setBackground(Color.WHITE);
		panel_29.setLayout(null);
		panel_29.setBounds(223, 0, 266, 49);
		panel_27.add(panel_29);

		dietLabel = new JLabel();
		dietLabel.setForeground(FormColor);
		dietLabel.setText("DIET");
		dietLabel.setBounds(121, 3, 23, 14);
		panel_29.add(dietLabel);

		txt$Diet = new JTextArea();
		txt$Diet.setBackground(Color.WHITE);
		txt$Diet.setEditable(false);
		txt$Diet.setWrapStyleWord(true);
		txt$Diet.setLineWrap(true);
		txt$Diet.setBounds(3, 18, 260, 28);
		panel_29.add(txt$Diet);

		panel_30 = new JPanel();
		panel_30.setBackground(Color.WHITE);
		panel_30.setBorder(new LineBorder(FormColor, 1, false));
		panel_30.setLayout(null);
		panel_30.setBounds(223, 48, 266, 61);
		panel_27.add(panel_30);

		allergiesLabel = new JLabel();
		allergiesLabel.setForeground(new Color(255, 102, 102));
		allergiesLabel.setFont(new Font("", Font.BOLD, 12));
		allergiesLabel.setText("ALLERGIES");
		allergiesLabel.setBounds(101, 0, 63, 14);
		panel_30.add(allergiesLabel);

		txt$Allergies = new JTextArea();
		txt$Allergies.setBackground(Color.WHITE);
		txt$Allergies.setEditable(false);
		txt$Allergies.setWrapStyleWord(true);
		txt$Allergies.setLineWrap(true);
		txt$Allergies.setBounds(3, 18, 260, 40);
		panel_30.add(txt$Allergies);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(FormColor, 1, false));
		panel_31.setBackground(Color.WHITE);
		panel_31.setLayout(null);
		panel_31.setBounds(488, 0, 312, 42);
		panel_27.add(panel_31);

		physiciansNameLabel = new JLabel();
		physiciansNameLabel.setForeground(FormColor);
		physiciansNameLabel.setText("PHYSICIAN'S NAME");
		physiciansNameLabel.setBounds(3, 3, 93, 14);
		panel_31.add(physiciansNameLabel);

		txt$PhysiciansName = new JTextField();
		txt$PhysiciansName.setBackground(Color.WHITE);
		txt$PhysiciansName.setEditable(false);
		txt$PhysiciansName.setBounds(3, 18, 249, 21);
		panel_31.add(txt$PhysiciansName);

		numberLabel = new JLabel();
		numberLabel.setForeground(FormColor);
		numberLabel.setText("NUMBER");
		numberLabel.setBounds(261, 3, 41, 14);
		panel_31.add(numberLabel);

		txt$PhysiciansNumber = new JTextField();
		txt$PhysiciansNumber.setBackground(Color.WHITE);
		txt$PhysiciansNumber.setEditable(false);
		txt$PhysiciansNumber.setBounds(258, 18, 51, 21);
		panel_31.add(txt$PhysiciansNumber);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(FormColor, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(488, 41, 312, 42);
		panel_27.add(panel_33);

		physiciansNameLabel_1 = new JLabel();
		physiciansNameLabel_1.setForeground(FormColor);
		physiciansNameLabel_1.setText("PHYSICIAN'S TELEPHONE NUMBER");
		physiciansNameLabel_1.setBounds(3, 3, 166, 14);
		panel_33.add(physiciansNameLabel_1);

		txt$PhysicianTelNumber = new JTextField();
		txt$PhysicianTelNumber.setBackground(Color.WHITE);
		txt$PhysicianTelNumber.setEditable(false);
		txt$PhysicianTelNumber.setBounds(3, 18, 306, 21);
		panel_33.add(txt$PhysicianTelNumber);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(FormColor, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(488, 82, 312, 27);
		panel_27.add(panel_34);

		physiciansNameLabel_2 = new JLabel();
		physiciansNameLabel_2.setForeground(FormColor);
		physiciansNameLabel_2.setText("DATE ADMITTED");
		physiciansNameLabel_2.setBounds(3, 3, 80, 14);
		panel_34.add(physiciansNameLabel_2);

		txt$DateAdmitted = new JTextField();
		txt$DateAdmitted.setBackground(Color.WHITE);
		txt$DateAdmitted.setEditable(false);
		txt$DateAdmitted.setBounds(103, 3, 199, 20);
		panel_34.add(txt$DateAdmitted);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(FormColor, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 108, 224, 42);
		panel_27.add(panel_35);

		physiciansNameLabel_3 = new JLabel();
		physiciansNameLabel_3.setForeground(FormColor);
		physiciansNameLabel_3.setText("RESIDENT NAME");
		physiciansNameLabel_3.setBounds(72, 3, 80, 14);
		panel_35.add(physiciansNameLabel_3);

		txt$ResidentName = new JTextField();
		txt$ResidentName.setBackground(Color.WHITE);
		txt$ResidentName.setEditable(false);
		txt$ResidentName.setBounds(3, 18, 218, 21);
		panel_35.add(txt$ResidentName);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(FormColor, 1, false));
		panel_32.setBackground(Color.WHITE);
		panel_32.setLayout(null);
		panel_32.setBounds(223, 108, 358, 42);
		panel_27.add(panel_32);

		roomNumberLabel = new JLabel();
		roomNumberLabel.setForeground(FormColor);
		roomNumberLabel.setText("ROOM NUMBER");
		roomNumberLabel.setBounds(3, 3, 75, 14);
		panel_32.add(roomNumberLabel);

		separator = new JSeparator();
		separator.setForeground(FormColor);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(95, 0, 5, 20);
		panel_32.add(separator);

		residentNameLabel = new JLabel();
		residentNameLabel.setForeground(FormColor);
		residentNameLabel.setText("RESIDENT NAME");
		residentNameLabel.setBounds(100, 3, 80, 14);
		panel_32.add(residentNameLabel);

		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(FormColor);
		separator_2.setBounds(234, 1, 5, 20);
		panel_32.add(separator_2);

		residentNumberLabel = new JLabel();
		residentNumberLabel.setForeground(FormColor);
		residentNumberLabel.setText("RESIDENT NUMBER");
		residentNumberLabel.setBounds(239, 3, 93, 14);
		panel_32.add(residentNumberLabel);

		txt$ResidentRoomNumber = new JTextField();
		txt$ResidentRoomNumber.setBackground(Color.WHITE);
		txt$ResidentRoomNumber.setEditable(false);
		txt$ResidentRoomNumber.setBounds(3, 18, 89, 21);
		panel_32.add(txt$ResidentRoomNumber);

		txt$ResidentName02 = new JTextField();
		txt$ResidentName02.setBackground(Color.WHITE);
		txt$ResidentName02.setEditable(false);
		txt$ResidentName02.setBounds(100, 18, 131, 21);
		panel_32.add(txt$ResidentName02);

		txt$ResidentNumber = new JTextField();
		txt$ResidentNumber.setBackground(Color.WHITE);
		txt$ResidentNumber.setEditable(false);
		txt$ResidentNumber.setBounds(239, 18, 116, 21);
		panel_32.add(txt$ResidentNumber);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(FormColor, 1, false));
		panel_36.setBackground(Color.WHITE);
		panel_36.setLayout(null);
		panel_36.setBounds(580, 108, 220, 21);
		panel_27.add(panel_36);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(FormColor, 1, false));
		panel_37.setBackground(Color.WHITE);
		panel_37.setLayout(null);
		panel_37.setBounds(580, 128, 220, 22);
		panel_27.add(panel_37);

		retainWhiteCopyLabel = new JLabel();
		retainWhiteCopyLabel.setForeground(new Color(255, 102, 102));
		retainWhiteCopyLabel.setFont(new Font("", Font.BOLD, 12));
		retainWhiteCopyLabel.setText("RETAIN WHITE COPY FOR CHART");
		retainWhiteCopyLabel.setBounds(308, 1255, 184, 14);
		add(retainWhiteCopyLabel);

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
		cmbMdSignature.addItem(user.getUserName());
		cmbPharmacyConsultantSign.addItem(user.getUserName());
		cmbDoctorSignature.addItem(user.getUserName());
		// cmbMdSignature.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "XYZ" }));
		//
		// cmbPharmacyConsultantSign
		// .setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// "", "Pharmacy 1", "Pharmacy 2" }));
		//
		// cmbDoctorSignature.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "Tom", "John" }));

	}

	public void updateData() {

		if (Global.currentPhysicianOrderForm1Key == 0) {
		} else {
			PhysicianOrderForm1 refPhysicianOrderForm1 = null;
			try {
				refPhysicianOrderForm1 = MedrexClientManager.getInstance()
						.getPhysicianOrderForm1(
								Global.currentPhysicianOrderForm1Key);

			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgFlush, refPhysicianOrderForm1
					.getFlush());
			txtFlushAdditionalAt.setText(refPhysicianOrderForm1
					.getFlushAdditionalAt());
			txtFlushAdditionalMl.setText(refPhysicianOrderForm1
					.getFlushAdditionalMl());
			txtFlushH20Ml.setText(refPhysicianOrderForm1.getFlushH20Ml());
			txtStomaCare.setText(refPhysicianOrderForm1.getStomaCare());
			txtTotalVolFluidsMl.setText(refPhysicianOrderForm1
					.getTotalVolFluidsMl());
			txtTotalProteinGrams.setText(refPhysicianOrderForm1
					.getTotalProteinGrams());
			txtTotalCaloriesCal.setText(refPhysicianOrderForm1
					.getTotalCaloriesCal());
			txtAdditionalSupp.setText(refPhysicianOrderForm1
					.getAdditionalSupp());
			txtBolusVolFeedingFrequency.setText(refPhysicianOrderForm1
					.getBolusVolFeedingFrequency());
			txtBolusVolFeeding.setText(refPhysicianOrderForm1
					.getBolusVolFeeding());
			txtFeedingAt.setText(refPhysicianOrderForm1.getFeedingAt());
			txtFeedingFrom02.setText(refPhysicianOrderForm1.getFeedingFrom02());
			txtFeedingFrom01.setText(refPhysicianOrderForm1.getFeedingFrom01());
			SwingUtils.setSelectedButton(bgMethodAdmin, refPhysicianOrderForm1
					.getMethodAdmin());
			txtVolOfFeedingsHrs.setText(refPhysicianOrderForm1
					.getVolOfFeedingsHrs());
			txtVolOfFeedingsMl.setText(refPhysicianOrderForm1
					.getVolOfFeedingsMl());
			txtNumberOfFeedings.setText(refPhysicianOrderForm1
					.getNumberOfFeedings());
			txtMethodRationale.setText(refPhysicianOrderForm1
					.getMethodRationale());
			txtRouteRationale.setText(refPhysicianOrderForm1
					.getRouteRationale());
			txtAdminSize.setText(refPhysicianOrderForm1.getAdminSize());
			SwingUtils.setSelectedButton(bgRouteAdmin, refPhysicianOrderForm1
					.getRouteAdmin());
			txtFormulaStrength.setText(refPhysicianOrderForm1
					.getFormulaStrength());
			SwingUtils.setSelectedButton(bgPoSnacks, refPhysicianOrderForm1
					.getPoSnacks());
			SwingUtils
					.setSelectedButton(bgNpo, refPhysicianOrderForm1.getNpo());
			cmbPharmacyConsultantSign.setSelectedItem(refPhysicianOrderForm1
					.getPharmacyConsultantSign());
			cmbDoctorSignature.setSelectedItem(refPhysicianOrderForm1
					.getDoctorSignature());
			dcMdSignDate.setDate(refPhysicianOrderForm1.getMdSignDate());
			cmbMdSignature.setSelectedItem(refPhysicianOrderForm1
					.getMdSignature());
			txtReviewedTime01.setText(refPhysicianOrderForm1
					.getReviewedTime01());
			dcReviewedDate01
					.setDate(refPhysicianOrderForm1.getReviewedDate01());
			txtReviewedBy01.setText(refPhysicianOrderForm1.getReviewedBy01());
			txtReviewedTime02.setText(refPhysicianOrderForm1
					.getReviewedTime02());
			dcReviewedDate02
					.setDate(refPhysicianOrderForm1.getReviewedDate02());
			txtReviewedBy02.setText(refPhysicianOrderForm1.getReviewedBy02());
			txtReviewedTime03.setText(refPhysicianOrderForm1
					.getReviewedTime03());
			dcReviewedDate03
					.setDate(refPhysicianOrderForm1.getReviewedDate03());
			txtReviewedBy03.setText(refPhysicianOrderForm1.getReviewedBy03());

		}
		for (int i = 0; i < ROW_LIMIT; i++) {
			rowArr[i].updateData();
		}

	}

	public void doSave() {

		PhysicianOrderForm1 refPhysicianOrderForm1 = new PhysicianOrderForm1();
		refPhysicianOrderForm1.setSerial(Global.currentPhysicianOrderForm1Key);
		refPhysicianOrderForm1.setResidentId(Global.currentResidenceKey);

		refPhysicianOrderForm1.setFlush(SwingUtils.getSelectedButton(bgFlush));
		refPhysicianOrderForm1.setFlushAdditionalAt(txtFlushAdditionalAt
				.getText());
		refPhysicianOrderForm1.setFlushAdditionalMl(txtFlushAdditionalMl
				.getText());
		refPhysicianOrderForm1.setFlushH20Ml(txtFlushH20Ml.getText());
		refPhysicianOrderForm1.setStomaCare(txtStomaCare.getText());
		refPhysicianOrderForm1.setTotalVolFluidsMl(txtTotalVolFluidsMl
				.getText());
		refPhysicianOrderForm1.setTotalProteinGrams(txtTotalProteinGrams
				.getText());
		refPhysicianOrderForm1.setTotalCaloriesCal(txtTotalCaloriesCal
				.getText());
		refPhysicianOrderForm1.setAdditionalSupp(txtAdditionalSupp.getText());
		refPhysicianOrderForm1
				.setBolusVolFeedingFrequency(txtBolusVolFeedingFrequency
						.getText());
		refPhysicianOrderForm1.setBolusVolFeeding(txtBolusVolFeeding.getText());
		refPhysicianOrderForm1.setFeedingAt(txtFeedingAt.getText());
		refPhysicianOrderForm1.setFeedingFrom02(txtFeedingFrom02.getText());
		refPhysicianOrderForm1.setFeedingFrom01(txtFeedingFrom01.getText());
		refPhysicianOrderForm1.setMethodAdmin(SwingUtils
				.getSelectedButton(bgMethodAdmin));
		refPhysicianOrderForm1.setVolOfFeedingsHrs(txtVolOfFeedingsHrs
				.getText());
		refPhysicianOrderForm1.setVolOfFeedingsMl(txtVolOfFeedingsMl.getText());
		refPhysicianOrderForm1.setNumberOfFeedings(txtNumberOfFeedings
				.getText());
		refPhysicianOrderForm1.setMethodRationale(txtMethodRationale.getText());
		refPhysicianOrderForm1.setRouteRationale(txtRouteRationale.getText());
		refPhysicianOrderForm1.setAdminSize(txtAdminSize.getText());
		refPhysicianOrderForm1.setRouteAdmin(SwingUtils
				.getSelectedButton(bgRouteAdmin));
		refPhysicianOrderForm1.setFormulaStrength(txtFormulaStrength.getText());
		refPhysicianOrderForm1.setPoSnacks(SwingUtils
				.getSelectedButton(bgPoSnacks));
		refPhysicianOrderForm1.setNpo(SwingUtils.getSelectedButton(bgNpo));
		refPhysicianOrderForm1
				.setPharmacyConsultantSign((String) cmbPharmacyConsultantSign
						.getSelectedItem());
		refPhysicianOrderForm1.setDoctorSignature((String) cmbDoctorSignature
				.getSelectedItem());
		refPhysicianOrderForm1.setMdSignDate(dcMdSignDate.getDate());
		refPhysicianOrderForm1.setMdSignature((String) cmbMdSignature
				.getSelectedItem());
		refPhysicianOrderForm1.setReviewedTime01(txtReviewedTime01.getText());
		refPhysicianOrderForm1.setReviewedDate01(dcReviewedDate01.getDate());
		refPhysicianOrderForm1.setReviewedBy01(txtReviewedBy01.getText());
		refPhysicianOrderForm1.setReviewedTime02(txtReviewedTime02.getText());
		refPhysicianOrderForm1.setReviewedDate02(dcReviewedDate02.getDate());
		refPhysicianOrderForm1.setReviewedBy02(txtReviewedBy02.getText());
		refPhysicianOrderForm1.setReviewedTime03(txtReviewedTime03.getText());
		refPhysicianOrderForm1.setReviewedDate03(dcReviewedDate03.getDate());
		refPhysicianOrderForm1.setReviewedBy03(txtReviewedBy03.getText());

		try {
			Global.currentPhysicianOrderForm1Key = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderForm1(
							refPhysicianOrderForm1);
		} catch (Exception e) {

		}

		for (int i = 0; i < ROW_LIMIT; i++) {
			rowArr[i].doSave();
		}
	}

}
