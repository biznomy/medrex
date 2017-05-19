package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import medrex.client.utils.controls.PhoneField;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxDrawPanel;
import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderForm3 extends JPanel {
	private JButton button_8;
	List<PhysicianOrderForm3Row> rows;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton button_7;

	private JButton button_6;

	private JButton button_5;

	private JButton button_4;

	private JButton button_3;

	private JButton button_2;

	private JButton button_1;

	private JButton button;

	private JDateChooser txt$DateAdmitted;

	private JTextPane lblMoreFrequent;

	private JTextField txtHctOrCbcOr;

	private JLabel asOrderedByLabel;

	private JLabel thenHgcLabel;

	private JDateChooser dcBaselineSchedule;

	private JLabel ifNoBaselineLabel;

	private ButtonGroup bgBaselineCbc = new ButtonGroup();

	private JRadioButton rbBaselineCbcNo;

	private JRadioButton rbBaselineCbcYes;

	private JLabel baselineCbcCollectedLabel;

	private JLabel egAranespEpogenLabel;

	private ButtonGroup bgHemoAgent = new ButtonGroup();

	private JRadioButton rbHemoAgentNo;

	private JRadioButton rbHemoAgentYes;

	private JLabel aHemotopieticAgentLabel;

	private ButtonGroup bgDuration = new ButtonGroup();

	private JTextField txtDurationOtherField;

	private JRadioButton rbDurationOther;

	private JRadioButton rbDuration14Days;

	private JLabel durationLabel;

	private ButtonGroup bgFrequency = new ButtonGroup();

	private JTextField txtFrequencyOtherField;

	private JRadioButton rbFrequencyOther;

	private JRadioButton rbFrequencyEveryShift;

	private JRadioButton rbFrequencyTwiceDaily;

	private JRadioButton rbFrequencyDailyAndPrn;

	private JLabel frequencyLabel;

	private JCheckBox cbWrapLooselyKling;

	private JLabel wrapLooselyWithLabel;

	private ButtonGroup bgCleanseWoundThen = new ButtonGroup();

	private ButtonGroup bgCleanse = new ButtonGroup();

	private JTextField txtCoverWithOtherField;

	private JRadioButton rbCoverWithOther;

	private JRadioButton rbCoverWithCombine;

	private JRadioButton rbCoverWith4X4Gauze;

	private JRadioButton rbCoverWithBorderGauze;

	private JLabel coverWithLabel;

	private JTextField txtCleanseWithOther;

	private JRadioButton rbCleanseAccuzyme;

	private JRadioButton rbCleanseHydrogel;

	private JRadioButton rbCleanseSilvasorbGel;

	private JRadioButton rbCleansePanafil;

	private JRadioButton rbCleanseOther;

	private JRadioButton rbCleanseIsosorbGel;

	private JRadioButton rbCleanseZincOxide;

	private JLabel patDryApplyLabel;

	private JRadioButton woundCleanserThenRadioButton;

	private JRadioButton rbCleanseNs;

	private JLabel cleanseWithLabel;

	private JTextField txtSite;

	private JLabel siteLabel;

	private JLabel treatmentsLabel;

	private JPanel panel_38;

	private JLabel plazaHealthCareLabel;

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

	// private JTextField txt$PhysicianTelNumber;
	private PhoneField txt$PhysicianTelNumber;

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

	private JxDrawPanel panel_13;

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

	private PanelPhysicianOrderForm3Row rowArr[];

	public static final Color FormColor = new Color(51, 0, 204);

	private static final int ROW_LEN = 9;

	public static FramePhysicianOrderForm3Dialog framePhysicianOrderForm3Dialog;

	boolean drawMode;

	int x;

	int y;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm3() {
		super();
		Global.panelPhysicianOrderForm3 = this;
		setBorder(new LineBorder(Color.black, 1, false));
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
		lblTitleLabel_1.setFocusable(false);
		lblTitleLabel_1.setBackground(Color.WHITE);
		lblTitleLabel_1.setEditable(false);
		lblTitleLabel_1.setBorder(new LineBorder(FormColor, 1, false));
		lblTitleLabel_1.setBounds(160, 40, 185, 32);
		panel.add(lblTitleLabel_1);

		lblTitleLable_2 = new JTextField();
		lblTitleLable_2.setFocusable(false);
		lblTitleLable_2.setBackground(Color.WHITE);
		lblTitleLable_2.setEditable(false);
		lblTitleLable_2.setBorder(new LineBorder(FormColor, 1, false));
		lblTitleLable_2.setBounds(380, 40, 185, 32);
		panel.add(lblTitleLable_2);

		plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		plazaHealthCareLabel
				.setText("PLAZA HEALTH CARE AND REHAB CENTER    ADMISSION/READMISSION ORDER - PAGE 3");
		plazaHealthCareLabel.setBounds(10, 75, 556, 14);
		panel.add(plazaHealthCareLabel);

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

		//		
		rowArr = new PanelPhysicianOrderForm3Row[ROW_LEN];
		for (int i = 0; i < rowArr.length; i++) {
			rowArr[i] = new PanelPhysicianOrderForm3Row(i + 1);
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
		dcReviewedDate03.setDateFormatString("MM/dd/yyyy");
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

		panel_13 = new JxDrawPanel(75, 65);
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
		dcReviewedDate02.setDateFormatString("MM/dd/yyyy");
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
		dcReviewedDate01.setDateFormatString("MM/dd/yyyy");
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
		panel_38.setBounds(5, 5, 484, 750);
		panel_11.add(panel_38);

		treatmentsLabel = new JLabel();
		treatmentsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		treatmentsLabel.setText("TREATMENTS:");
		treatmentsLabel.setBounds(54, 7, 77, 14);
		panel_38.add(treatmentsLabel);

		siteLabel = new JLabel();
		siteLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		siteLabel.setText("SITE:");
		siteLabel.setBounds(10, 39, 35, 14);
		panel_38.add(siteLabel);

		txtSite = new JTextField();
		txtSite.setBounds(51, 35, 423, 21);
		panel_38.add(txtSite);

		cleanseWithLabel = new JLabel();
		cleanseWithLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		cleanseWithLabel.setText("CLEANSE WITH:");
		cleanseWithLabel.setBounds(10, 68, 91, 14);
		panel_38.add(cleanseWithLabel);

		rbCleanseNs = new JRadioButton();
		rbCleanseNs.setActionCommand("1");
		bgCleanse.add(rbCleanseNs);
		rbCleanseNs.setBackground(Color.WHITE);
		rbCleanseNs.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseNs.setText("N/S");
		rbCleanseNs.setBounds(107, 65, 45, 18);
		panel_38.add(rbCleanseNs);

		woundCleanserThenRadioButton = new JRadioButton();
		woundCleanserThenRadioButton.setActionCommand("2");
		bgCleanse.add(woundCleanserThenRadioButton);
		woundCleanserThenRadioButton.setBackground(Color.WHITE);
		woundCleanserThenRadioButton.setFont(new Font("Courier New",
				Font.PLAIN, 12));
		woundCleanserThenRadioButton.setText("WOUND CLEANSER, THEN");
		woundCleanserThenRadioButton.setBounds(158, 65, 219, 18);
		panel_38.add(woundCleanserThenRadioButton);

		patDryApplyLabel = new JLabel();
		patDryApplyLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		patDryApplyLabel.setText("PAT DRY, APPLY A THIN LAYER OF:");
		patDryApplyLabel.setBounds(34, 88, 217, 14);
		panel_38.add(patDryApplyLabel);

		rbCleanseZincOxide = new JRadioButton();
		rbCleanseZincOxide.setActionCommand("1");
		bgCleanseWoundThen.add(rbCleanseZincOxide);
		rbCleanseZincOxide.setBackground(Color.WHITE);
		rbCleanseZincOxide.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseZincOxide.setText("ZINC OXIDE");
		rbCleanseZincOxide.setBounds(34, 108, 97, 18);
		panel_38.add(rbCleanseZincOxide);

		rbCleanseIsosorbGel = new JRadioButton();
		rbCleanseIsosorbGel.setActionCommand("4");
		bgCleanseWoundThen.add(rbCleanseIsosorbGel);
		rbCleanseIsosorbGel.setBackground(Color.WHITE);
		rbCleanseIsosorbGel.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseIsosorbGel.setText("ISOSORB GEL");
		rbCleanseIsosorbGel.setBounds(34, 128, 97, 18);
		panel_38.add(rbCleanseIsosorbGel);

		rbCleanseOther = new JRadioButton();
		rbCleanseOther.setActionCommand("7");
		bgCleanseWoundThen.add(rbCleanseOther);
		rbCleanseOther.setBackground(Color.WHITE);
		rbCleanseOther.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseOther.setText("OTHER:");
		rbCleanseOther.setBounds(34, 148, 60, 18);
		panel_38.add(rbCleanseOther);

		rbCleansePanafil = new JRadioButton();
		rbCleansePanafil.setActionCommand("2");
		bgCleanseWoundThen.add(rbCleansePanafil);
		rbCleansePanafil.setBackground(Color.WHITE);
		rbCleansePanafil.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleansePanafil.setText("PANAFIL");
		rbCleansePanafil.setBounds(137, 108, 97, 18);
		panel_38.add(rbCleansePanafil);

		rbCleanseSilvasorbGel = new JRadioButton();
		rbCleanseSilvasorbGel.setActionCommand("5");
		bgCleanseWoundThen.add(rbCleanseSilvasorbGel);
		rbCleanseSilvasorbGel.setBackground(Color.WHITE);
		rbCleanseSilvasorbGel.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseSilvasorbGel.setText("SILVASORB GEL");
		rbCleanseSilvasorbGel.setBounds(137, 128, 109, 18);
		panel_38.add(rbCleanseSilvasorbGel);

		rbCleanseHydrogel = new JRadioButton();
		rbCleanseHydrogel.setActionCommand("3");
		bgCleanseWoundThen.add(rbCleanseHydrogel);
		rbCleanseHydrogel.setBackground(Color.WHITE);
		rbCleanseHydrogel.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseHydrogel.setText("HYDROGEL");
		rbCleanseHydrogel.setBounds(252, 108, 97, 18);
		panel_38.add(rbCleanseHydrogel);

		rbCleanseAccuzyme = new JRadioButton();
		rbCleanseAccuzyme.setActionCommand("6");
		bgCleanseWoundThen.add(rbCleanseAccuzyme);
		rbCleanseAccuzyme.setBackground(Color.WHITE);
		rbCleanseAccuzyme.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCleanseAccuzyme.setText("ACCUZYME");
		rbCleanseAccuzyme.setBounds(252, 128, 97, 18);
		panel_38.add(rbCleanseAccuzyme);

		txtCleanseWithOther = new JTextField();
		txtCleanseWithOther.setBounds(100, 146, 249, 21);
		panel_38.add(txtCleanseWithOther);

		coverWithLabel = new JLabel();
		coverWithLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		coverWithLabel.setText("COVER WITH:");
		coverWithLabel.setBounds(10, 177, 77, 14);
		panel_38.add(coverWithLabel);

		rbCoverWithBorderGauze = new JRadioButton();
		rbCoverWithBorderGauze.setActionCommand("1");
		rbCoverWithBorderGauze.setBackground(Color.WHITE);
		rbCoverWithBorderGauze.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCoverWithBorderGauze.setText("BORDER GAUZE");
		rbCoverWithBorderGauze.setBounds(100, 174, 109, 18);
		panel_38.add(rbCoverWithBorderGauze);

		rbCoverWith4X4Gauze = new JRadioButton();
		rbCoverWith4X4Gauze.setActionCommand("2");
		rbCoverWith4X4Gauze.setText("4X4 GAUZE");
		rbCoverWith4X4Gauze.setBackground(Color.WHITE);
		rbCoverWith4X4Gauze.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCoverWith4X4Gauze.setBounds(215, 174, 106, 18);
		panel_38.add(rbCoverWith4X4Gauze);

		rbCoverWithCombine = new JRadioButton();
		rbCoverWithCombine.setActionCommand("3");
		rbCoverWithCombine.setBackground(Color.WHITE);
		rbCoverWithCombine.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCoverWithCombine.setText("COMBINE");
		rbCoverWithCombine.setBounds(100, 194, 106, 18);
		panel_38.add(rbCoverWithCombine);

		rbCoverWithOther = new JRadioButton();
		rbCoverWithOther.setActionCommand("4");
		rbCoverWithOther.setBackground(Color.WHITE);
		rbCoverWithOther.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCoverWithOther.setText("OTHER:");
		rbCoverWithOther.setBounds(215, 194, 60, 18);
		panel_38.add(rbCoverWithOther);

		txtCoverWithOtherField = new JTextField();
		txtCoverWithOtherField.setBounds(281, 193, 193, 21);
		panel_38.add(txtCoverWithOtherField);

		wrapLooselyWithLabel = new JLabel();
		wrapLooselyWithLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		wrapLooselyWithLabel.setText("WRAP LOOSELY WITH:");
		wrapLooselyWithLabel.setBounds(10, 223, 126, 14);
		panel_38.add(wrapLooselyWithLabel);

		cbWrapLooselyKling = new JCheckBox();
		cbWrapLooselyKling.setBackground(Color.WHITE);
		cbWrapLooselyKling.setFont(new Font("Courier New", Font.PLAIN, 12));
		cbWrapLooselyKling.setText("KLING");
		cbWrapLooselyKling.setBounds(147, 220, 60, 18);
		panel_38.add(cbWrapLooselyKling);

		frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		frequencyLabel.setText("FREQUENCY:");
		frequencyLabel.setBounds(10, 252, 70, 14);
		panel_38.add(frequencyLabel);

		rbFrequencyDailyAndPrn = new JRadioButton();
		rbFrequencyDailyAndPrn.setActionCommand("1");
		bgFrequency.add(rbFrequencyDailyAndPrn);
		rbFrequencyDailyAndPrn.setBackground(Color.WHITE);
		rbFrequencyDailyAndPrn.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFrequencyDailyAndPrn.setText("DAILY AND PRN");
		rbFrequencyDailyAndPrn.setBounds(100, 249, 151, 18);
		panel_38.add(rbFrequencyDailyAndPrn);

		rbFrequencyTwiceDaily = new JRadioButton();
		rbFrequencyTwiceDaily.setActionCommand("2");
		bgFrequency.add(rbFrequencyTwiceDaily);
		rbFrequencyTwiceDaily.setBackground(Color.WHITE);
		rbFrequencyTwiceDaily.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFrequencyTwiceDaily.setText("TWICE DAILY AND PRN");
		rbFrequencyTwiceDaily.setBounds(100, 269, 151, 18);
		panel_38.add(rbFrequencyTwiceDaily);

		rbFrequencyEveryShift = new JRadioButton();
		rbFrequencyEveryShift.setActionCommand("3");
		bgFrequency.add(rbFrequencyEveryShift);
		rbFrequencyEveryShift.setBackground(Color.WHITE);
		rbFrequencyEveryShift.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFrequencyEveryShift.setText("EVERY SHIFT AND PRN");
		rbFrequencyEveryShift.setBounds(100, 289, 151, 18);
		panel_38.add(rbFrequencyEveryShift);

		rbFrequencyOther = new JRadioButton();
		rbFrequencyOther.setActionCommand("4");
		bgFrequency.add(rbFrequencyOther);
		rbFrequencyOther.setBackground(Color.WHITE);
		rbFrequencyOther.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFrequencyOther.setText("OTHER:");
		rbFrequencyOther.setBounds(100, 309, 60, 18);
		panel_38.add(rbFrequencyOther);

		txtFrequencyOtherField = new JTextField();
		txtFrequencyOtherField.setBounds(166, 308, 308, 21);
		panel_38.add(txtFrequencyOtherField);

		durationLabel = new JLabel();
		durationLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		durationLabel.setText("DURATION:");
		durationLabel.setBounds(10, 338, 70, 14);
		panel_38.add(durationLabel);

		rbDuration14Days = new JRadioButton();
		rbDuration14Days.setActionCommand("1");
		bgDuration.add(rbDuration14Days);
		rbDuration14Days.setBackground(Color.WHITE);
		rbDuration14Days.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDuration14Days.setText("14 Days");
		rbDuration14Days.setBounds(100, 335, 70, 18);
		panel_38.add(rbDuration14Days);

		rbDurationOther = new JRadioButton();
		rbDurationOther.setActionCommand("2");
		bgDuration.add(rbDurationOther);
		rbDurationOther.setBackground(Color.WHITE);
		rbDurationOther.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDurationOther.setText("Other:");
		rbDurationOther.setBounds(176, 335, 60, 18);
		panel_38.add(rbDurationOther);

		txtDurationOtherField = new JTextField();
		txtDurationOtherField.setBounds(242, 334, 232, 21);
		panel_38.add(txtDurationOtherField);

		aHemotopieticAgentLabel = new JLabel();
		aHemotopieticAgentLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		aHemotopieticAgentLabel.setText("A HEMOTOPIETIC AGENT PRESCRIBED?");
		aHemotopieticAgentLabel.setBounds(10, 367, 224, 14);
		panel_38.add(aHemotopieticAgentLabel);

		rbHemoAgentYes = new JRadioButton();
		rbHemoAgentYes.setActionCommand("1");
		bgHemoAgent.add(rbHemoAgentYes);
		rbHemoAgentYes.setBackground(Color.WHITE);
		rbHemoAgentYes.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbHemoAgentYes.setText("YES");
		rbHemoAgentYes.setBounds(243, 364, 53, 18);
		panel_38.add(rbHemoAgentYes);

		rbHemoAgentNo = new JRadioButton();
		rbHemoAgentNo.setActionCommand("2");
		bgHemoAgent.add(rbHemoAgentNo);
		rbHemoAgentNo.setBackground(Color.WHITE);
		rbHemoAgentNo.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbHemoAgentNo.setText("NO");
		rbHemoAgentNo.setBounds(302, 364, 53, 18);
		panel_38.add(rbHemoAgentNo);

		egAranespEpogenLabel = new JLabel();
		egAranespEpogenLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		egAranespEpogenLabel
				.setText("(E.G. ARANESP, EPOGEN, NEUPOGEN, NEULASTA, PROCRIT)");
		egAranespEpogenLabel.setBounds(68, 387, 406, 14);
		panel_38.add(egAranespEpogenLabel);

		baselineCbcCollectedLabel = new JLabel();
		baselineCbcCollectedLabel.setFont(new Font("Courier New", Font.PLAIN,
				12));
		baselineCbcCollectedLabel
				.setText("BASELINE CBC COLLECTED ON ADMISSION?");
		baselineCbcCollectedLabel.setBounds(10, 407, 252, 14);
		panel_38.add(baselineCbcCollectedLabel);

		rbBaselineCbcYes = new JRadioButton();
		rbBaselineCbcYes.setActionCommand("1");
		bgBaselineCbc.add(rbBaselineCbcYes);
		rbBaselineCbcYes.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbBaselineCbcYes.setBackground(Color.WHITE);
		rbBaselineCbcYes.setText("YES");
		rbBaselineCbcYes.setBounds(281, 405, 53, 18);
		panel_38.add(rbBaselineCbcYes);

		rbBaselineCbcNo = new JRadioButton();
		rbBaselineCbcNo.setActionCommand("2");
		bgBaselineCbc.add(rbBaselineCbcNo);
		rbBaselineCbcNo.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbBaselineCbcNo.setBackground(Color.WHITE);
		rbBaselineCbcNo.setText("NO");
		rbBaselineCbcNo.setBounds(340, 405, 53, 18);
		panel_38.add(rbBaselineCbcNo);

		ifNoBaselineLabel = new JLabel();
		ifNoBaselineLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		ifNoBaselineLabel.setText("IF NO BASELINE, SCHEDULE CBC ON");
		ifNoBaselineLabel.setBounds(10, 427, 224, 14);
		panel_38.add(ifNoBaselineLabel);

		dcBaselineSchedule = new JDateChooser();
		dcBaselineSchedule.setDateFormatString("MM/dd/yyyy");
		dcBaselineSchedule.setBounds(242, 424, 232, 21);
		panel_38.add(dcBaselineSchedule);

		thenHgcLabel = new JLabel();
		thenHgcLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		thenHgcLabel
				.setText("THEN HGC & HCT OR CBC (CIRCLE ON EVERY WEEK FOR 4 WEEKS) OR");
		thenHgcLabel.setBounds(10, 447, 464, 14);
		panel_38.add(thenHgcLabel);

		asOrderedByLabel = new JLabel();
		asOrderedByLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		asOrderedByLabel.setText("AS ORDERED BY MD.");
		asOrderedByLabel.setBounds(355, 467, 119, 14);
		panel_38.add(asOrderedByLabel);

		txtHctOrCbcOr = new JTextField();
		txtHctOrCbcOr.setBounds(10, 463, 339, 21);
		panel_38.add(txtHctOrCbcOr);

		lblMoreFrequent = new JTextPane();
		lblMoreFrequent.setMargin(new Insets(0, 0, 0, 0));
		lblMoreFrequent.setFont(new Font("Courier New", Font.PLAIN, 12));
		lblMoreFrequent
				.setText("x (MORE FREQUENT CBC AND PLATELET COUNTS NECESSARY FOR NEUPOGEN/ NEULASTA-TYPE AGENTS).");
		lblMoreFrequent.setBounds(10, 490, 464, 28);
		panel_38.add(lblMoreFrequent);

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
		txt$Diagnosis.setWrapStyleWord(true);
		txt$Diagnosis.setLineWrap(true);
		txt$Diagnosis.setBackground(Color.WHITE);
		txt$Diagnosis.setEditable(false);
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
		txt$Allergies.setWrapStyleWord(true);
		txt$Allergies.setLineWrap(true);
		txt$Allergies.setBackground(Color.WHITE);
		txt$Allergies.setEditable(false);
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

		txt$PhysicianTelNumber = new PhoneField();
		txt$PhysicianTelNumber.setBackground(Color.WHITE);
		txt$PhysicianTelNumber.setEditable(false);
		txt$PhysicianTelNumber.setBounds(3, 18, 97, 22);
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

		txt$DateAdmitted = new JDateChooser();
		txt$DateAdmitted.setBackground(Color.WHITE);
		// txt$DateAdmitted.setEditable(false);
		txt$DateAdmitted.setBounds(97, 4, 212, 21);
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

	public void openDialog(int selected) {
		PhysicianOrderForm3Row p = new PhysicianOrderForm3Row();

		p.setPhyMedication(rowArr[selected].txtPhyMedication.getText());
		p.setPhyDosage(rowArr[selected].txtPhyDosage.getText());

		p.setPhyRoute(rowArr[selected].txtPhyRoute.getText());
		p.setPhyFrequency(rowArr[selected].txtPhyFrequency.getText());

		p.setPrnIndicator(rowArr[selected].txtPrnIndicator.getText());
		p.setDiagnosis(rowArr[selected].txtDiagnosis.getText());
		p.setPhyDcDate(rowArr[selected].dcPhyDcDate.getDate());
		p.setPhyOrderDate(rowArr[selected].dcPhyOrderDate.getDate());
		p.setDuplicate(rowArr[selected].txtDuplicate.getText());
		p.setDuplicateDc(rowArr[selected].txtDuplecateDc.getText());
		Global.currentPhysicianOrderForm3row = p;

		framePhysicianOrderForm3Dialog = (FramePhysicianOrderForm3Dialog) FrameFactory
				.createWindowOfType(FramePhysicianOrderForm3Dialog.class);
		SwingUtils.center(framePhysicianOrderForm3Dialog);
		framePhysicianOrderForm3Dialog.setTitle("Add Medication Record");
		framePhysicianOrderForm3Dialog.setModal(true);
		framePhysicianOrderForm3Dialog.setVisible(true);

		rowArr[selected].txtPhyMedication
				.setText(Global.currentPhysicianOrderForm3row
						.getPhyMedication());
		rowArr[selected].txtPhyDosage
				.setText(Global.currentPhysicianOrderForm3row.getPhyDosage());

		rowArr[selected].txtPhyRoute
				.setText(Global.currentPhysicianOrderForm3row.getPhyRoute());

		rowArr[selected].txtPhyFrequency
				.setText(Global.currentPhysicianOrderForm3row.getPhyFrequency());

		/*
		 * rowArr[selected].cmbPhyRoute
		 * .setSelectedItem(Global.currentPhysicianOrderForm3row.getPhyRoute());
		 * 
		 * rowArr[selected].cmbPhyFrequency
		 * .setSelectedItem(Global.currentPhysicianOrderForm3row
		 * .getPhyFrequency());
		 */
		rowArr[selected].txtPrnIndicator
				.setText(Global.currentPhysicianOrderForm3row.getPrnIndicator());
		rowArr[selected].txtDiagnosis
				.setText(Global.currentPhysicianOrderForm3row.getDiagnosis());
		rowArr[selected].dcPhyDcDate
				.setDate(Global.currentPhysicianOrderForm3row.getPhyDcDate());
		rowArr[selected].dcPhyOrderDate
				.setDate(Global.currentPhysicianOrderForm3row.getPhyOrderDate());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		try {
			rowArr[selected].txtDuplicate.setText(sdf
					.format(Global.currentPhysicianOrderForm3row
							.getPhyOrderDate()));

			rowArr[selected].txtDuplecateDc
					.setText(sdf.format(Global.currentPhysicianOrderForm3row
							.getPhyDcDate()));
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	public void doSave() {

		PhysicianOrderForm3 refPhysicianOrderForm3 = new PhysicianOrderForm3();
		refPhysicianOrderForm3.setSerial(Global.currentPhysicianOrderForm3Key);
		refPhysicianOrderForm3.setResidentId(Global.currentResidenceKey);

		refPhysicianOrderForm3.setHctOrCbcOr(txtHctOrCbcOr.getText());
		refPhysicianOrderForm3
				.setBaselineSchedule(dcBaselineSchedule.getDate());
		refPhysicianOrderForm3.setBaselineCbc(SwingUtils
				.getSelectedButton(bgBaselineCbc));
		refPhysicianOrderForm3.setHemoAgent(SwingUtils
				.getSelectedButton(bgHemoAgent));
		refPhysicianOrderForm3.setDuration(SwingUtils
				.getSelectedButton(bgDuration));
		refPhysicianOrderForm3.setDurationOtherField(txtDurationOtherField
				.getText());
		refPhysicianOrderForm3.setFrequency(SwingUtils
				.getSelectedButton(bgFrequency));
		refPhysicianOrderForm3.setFrequencyOtherField(txtFrequencyOtherField
				.getText());
		refPhysicianOrderForm3.setWrapLooselyKling(cbWrapLooselyKling
				.isSelected());
		refPhysicianOrderForm3.setCleanseWoundThen(SwingUtils
				.getSelectedButton(bgCleanseWoundThen));
		refPhysicianOrderForm3.setCleanse(SwingUtils
				.getSelectedButton(bgCleanse));
		refPhysicianOrderForm3.setCoverWithOtherField(txtCoverWithOtherField
				.getText());
		refPhysicianOrderForm3.setCleanseWithOther(txtCleanseWithOther
				.getText());
		refPhysicianOrderForm3.setSite(txtSite.getText());
		refPhysicianOrderForm3
				.setPharmacyConsultantSign((String) cmbPharmacyConsultantSign
						.getSelectedItem());
		refPhysicianOrderForm3.setDoctorSignature((String) cmbDoctorSignature
				.getSelectedItem());
		refPhysicianOrderForm3.setMdSignDate(dcMdSignDate.getDate());
		refPhysicianOrderForm3.setMdSignature((String) cmbMdSignature
				.getSelectedItem());
		refPhysicianOrderForm3.setReviewedTime01(txtReviewedTime01.getText());
		refPhysicianOrderForm3.setReviewedDate01(dcReviewedDate01.getDate());
		refPhysicianOrderForm3.setReviewedBy01(txtReviewedBy01.getText());
		refPhysicianOrderForm3.setReviewedTime02(txtReviewedTime02.getText());
		refPhysicianOrderForm3.setReviewedDate02(dcReviewedDate02.getDate());
		refPhysicianOrderForm3.setReviewedBy02(txtReviewedBy02.getText());
		refPhysicianOrderForm3.setReviewedTime03(txtReviewedTime03.getText());
		refPhysicianOrderForm3.setReviewedDate03(dcReviewedDate03.getDate());
		refPhysicianOrderForm3.setReviewedBy03(txtReviewedBy03.getText());
		try {
			Global.currentPhysicianOrderForm3Key = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderForm3(
							refPhysicianOrderForm3);
			for (int i = 0; i < ROW_LEN; i++) {
				rowArr[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdatePhysicianOrderForm3Rows(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData() {

		ResidentMain rm = null;
		ResidentAssessmentFormPage1 ras = null;
		PhysicianForm pf = null;
		List physiciansList = null;
		try {
			physiciansList = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);

			Iterator ilist = physiciansList.iterator();
			while (ilist.hasNext()) {
				pf = (PhysicianForm) ilist.next();
				/*
				 * Doctors d =
				 * MedrexClientManager.getInstance().getDoctorsRecord(pf
				 * .getPhysicianId());
				 */
				Doctors d = pf.getPhysician();
				if (d.getDoctorType().toString().equalsIgnoreCase("Physicians")) {
					txt$PhysiciansName.setText(d.getPhysicianName()
							+ d.getPhysicianSurName());
					txt$PhysicianTelNumber.setNumber(d.getPhoneNumber());

					txt$PhysiciansNumber.setText(d.getSerial() + "");
					break;
				}
			}

		} catch (Exception ex) {

		}

		try {
			List abc = MedrexClientManager
					.getInstance()
					.getResidentAssessmentFormPage1s(Global.currentResidenceKey);
			ras = (ResidentAssessmentFormPage1) abc.iterator().next();
			txt$Diagnosis.setText(ras.getPrimaryDiagnosis());
			txt$Allergies.setText(ras.getAllergies());
			txt$DateAdmitted.setDate(ras.getAdmissionDate());
		} catch (Exception ex) {
		}

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {

		}
		txt$PatientName.setText(rm.getUserName() + " " + rm.getUserPass());
		txt$Sex.setText(rm.getSex().toString());
		txt$ResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
		txt$PatientNumber.setText(rm.getSerial() + "");
		/* TODO: Migrating to room history */
		// txt$ResidentRoomNumber.setText(rm.getRoom());
		txt$ResidentName02.setText(rm.getUserName() + " " + rm.getUserPass());
		txt$ResidentNumber.setText(rm.getSerial() + "");

		PhysicianOrderForm3 refPhysicianOrderForm3 = null;
		rows = new ArrayList<PhysicianOrderForm3Row>();

		if (Global.currentPhysicianOrderForm3Key != 0) {
			try {
				refPhysicianOrderForm3 = MedrexClientManager.getInstance()
						.getPhysicianOrderForm3(
								Global.currentPhysicianOrderForm3Key);
				rows = MedrexClientManager.getInstance()
						.getPhysicianOrderForm3Rows(
								Global.currentPhysicianOrderForm3Key);

			} catch (Exception e) {
				e.printStackTrace();
			}
			txtHctOrCbcOr.setText(refPhysicianOrderForm3.getHctOrCbcOr());
			dcBaselineSchedule.setDate(refPhysicianOrderForm3
					.getBaselineSchedule());
			SwingUtils.setSelectedButton(bgBaselineCbc, refPhysicianOrderForm3
					.getBaselineCbc());
			SwingUtils.setSelectedButton(bgHemoAgent, refPhysicianOrderForm3
					.getHemoAgent());
			SwingUtils.setSelectedButton(bgDuration, refPhysicianOrderForm3
					.getDuration());
			txtDurationOtherField.setText(refPhysicianOrderForm3
					.getDurationOtherField());
			SwingUtils.setSelectedButton(bgFrequency, refPhysicianOrderForm3
					.getFrequency());
			txtFrequencyOtherField.setText(refPhysicianOrderForm3
					.getFrequencyOtherField());
			cbWrapLooselyKling.setSelected(refPhysicianOrderForm3
					.isWrapLooselyKling());
			SwingUtils.setSelectedButton(bgCleanseWoundThen,
					refPhysicianOrderForm3.getCleanseWoundThen());
			SwingUtils.setSelectedButton(bgCleanse, refPhysicianOrderForm3
					.getCleanse());
			txtCoverWithOtherField.setText(refPhysicianOrderForm3
					.getCoverWithOtherField());
			txtCleanseWithOther.setText(refPhysicianOrderForm3
					.getCleanseWithOther());
			txtSite.setText(refPhysicianOrderForm3.getSite());
			cmbPharmacyConsultantSign.setSelectedItem(refPhysicianOrderForm3
					.getPharmacyConsultantSign());
			cmbDoctorSignature.setSelectedItem(refPhysicianOrderForm3
					.getDoctorSignature());
			dcMdSignDate.setDate(refPhysicianOrderForm3.getMdSignDate());
			cmbMdSignature.setSelectedItem(refPhysicianOrderForm3
					.getMdSignature());
			txtReviewedTime01.setText(refPhysicianOrderForm3
					.getReviewedTime01());
			dcReviewedDate01
					.setDate(refPhysicianOrderForm3.getReviewedDate01());
			txtReviewedBy01.setText(refPhysicianOrderForm3.getReviewedBy01());
			txtReviewedTime02.setText(refPhysicianOrderForm3
					.getReviewedTime02());
			dcReviewedDate02
					.setDate(refPhysicianOrderForm3.getReviewedDate02());
			txtReviewedBy02.setText(refPhysicianOrderForm3.getReviewedBy02());
			txtReviewedTime03.setText(refPhysicianOrderForm3
					.getReviewedTime03());
			dcReviewedDate03
					.setDate(refPhysicianOrderForm3.getReviewedDate03());
			txtReviewedBy03.setText(refPhysicianOrderForm3.getReviewedBy03());

			for (int i = 0, j = 0; i < ROW_LEN; i++) {
				PhysicianOrderForm3Row r = null;
				if (rows.size() > 0 && j < rows.size()) {
					r = rows.get(j);
				}
				if (r != null) {
					if (i + 1 == r.getPhysicianOrderForm3RowSerial()) {
						rowArr[i].updateData(r);
						j++;
					}
				} else {
					rowArr[i].updateData(null);
				}
			}
		}
	}

}
