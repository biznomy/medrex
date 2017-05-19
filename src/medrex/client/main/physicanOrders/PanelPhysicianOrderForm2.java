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
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderForm2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2933639668332536226L;
	private JTextField txt$ResidentDateOfBirth;
	private JTextField txt$ResidentAdmissionDate;
	private JLabel partnersLabel;
	private JDateChooser dcAboveOrdersNotedDate;
	private JLabel dateLabel_2;
	private JLabel rnlpnLabel_1;
	private JTextField txtAboveOrdersNoted;
	private JLabel aboveOrdersNotedLabel;
	private JDateChooser dcPhysicianSignDate;
	private JLabel dateLabel_1;
	private JComboBox cmbPhysicianSign;
	private JLabel physicianSignatureLabel;
	private JDateChooser dcAboveOrdersDate;
	private JLabel dateLabel;
	private JLabel rnlpnLabel;
	private JTextField txtAboveOrdersField;
	private JLabel aboveOrdersReviewedLabel;
	private JTextPane iReviewedTheTextPane;
	private JTextPane scheduleIiMedicationsTextPane;
	private JLabel aboveOrdersGoodLabel;
	private ButtonGroup bgFoleyDx = new ButtonGroup();
	private JTextField txtFoleyDxOtherField;
	private JRadioButton rbFoleyDxOther;
	private JRadioButton rbFoleyDxWound;
	private JRadioButton rbFoleyDxUrinary;
	private JRadioButton rbFoleyDxSacral;
	private JRadioButton rbFoleyDxNeuro;
	private JLabel dxLabel;
	private JLabel foleyCatheterLabel;
	private ButtonGroup bgWeigh = new ButtonGroup();
	private JRadioButton rbWeighWeekly;
	private JRadioButton rbWeighMonthly;
	private JLabel weighLabel;
	private JTextField txtDietaryConsult;
	private JLabel dietaryConsultLabel;
	private JLabel ml24HrsLabel;
	private JTextField txtFluidRest;
	private JLabel fluidRestrictionsLabel;
	private JTextField txtSupplements;
	private ButtonGroup bgThickLiquids = new ButtonGroup();
	private JLabel supplementsLabel;
	private JRadioButton rbThickLiquidsPudding;
	private JRadioButton rbThickLiquidsHoney;
	private JRadioButton rbThickLiquidsNectar;
	private JLabel thickLiquidsLabel;
	private ButtonGroup bgCircleOne = new ButtonGroup();
	private ButtonGroup bgDiet = new ButtonGroup();
	private JRadioButton rbDietRenal;
	private JRadioButton rbDietSoft;
	private JRadioButton rbDietHouseDiab;
	private JRadioButton rbDietChopped;
	private JRadioButton rbDietLactose;
	private JRadioButton rbDietLowCholesterol;
	private JRadioButton rbDietReducingNcs;
	private JRadioButton rbDietNas;
	private JRadioButton rbDietPureed;
	private JRadioButton rbDietBland;
	private JRadioButton rbDietRegular;
	private JLabel dietLabel;
	private JDateChooser dcDateOfBirth;
	private JLabel dateOfBirthLabel;
	private JTextField txtSsn03;
	private JLabel label_4;
	private JTextField txtSsn02;
	private JLabel label_2;
	private JTextField txtSsn01;
	private JLabel socialSecurityLabel;
	private ButtonGroup bgAdmission = new ButtonGroup();
	private JRadioButton rbCircleOneCaid;
	private JRadioButton rbCircleOneManaged;
	private JRadioButton rbCircleOnePvt;
	private JRadioButton rbCircleOneMedA;
	private JLabel circleOneLabel;
	private JRadioButton rbAdmissionRe;
	private JRadioButton rbAdmissionNew;
	private JLabel label_1;
	private JTextField txt$ResidentSex;
	private JLabel residentNumberLabel_1;
	private JSeparator separator_4;
	private JLabel residentNameLabel_1;
	private JSeparator separator_3;
	private JLabel roomNumberLabel_1;
	private JPanel panel_33;
	private JTextField txt$ResidentName;
	private JLabel physiciansNameLabel_6;
	private JPanel panel_31;
	private JTextField txt$PhysicianPhoneAlt;
	private JLabel physiciansNameLabel_5;
	private JPanel panel_30;
	private JTextField txt$PhysicianAddressAlt;
	private JLabel physiciansNameLabel_4;
	private JPanel panel_29;
	private JTextField txt$PhysicianAlt;
	private JLabel physiciansNameLabel_2;
	private JPanel panel_9;
	private JTextField txt$PhysicianPhone;
	private JLabel physiciansNameLabel_1;
	private JPanel panel_8;
	private JTextField txt$PhysicianAddress;
	private JLabel physiciansNameLabel;
	private JPanel panel_7;
	private JLabel label;
	private JTextArea txt$Diagnosis;
	private JLabel diagnosisLabel_1;
	private JPanel panel_2;
	private JLabel plazaNursingLabel;
	private JLabel plazaHealthCareLabel_2;
	private JLabel plazaHealthCareLabel_1;
	private JLabel plazaHealthCareLabel;
	private JTextPane physiciansOrderFormTextPane;
	private JPanel panel_38;
	private JTextField txt$ResidentMedRecord;
	private JTextField txt$ResidentRoom;
	private JLabel residentNumberLabel;
	private JSeparator separator_2;
	private JLabel residentNameLabel;
	private JSeparator separator;
	private JLabel roomNumberLabel;
	private JPanel panel_32;
	private JTextField txt$Physician;
	private JLabel physiciansNameLabel_3;
	private JPanel panel_35;
	private JTextArea txt$Allergies;
	private JLabel diagnosisLabel;
	private JPanel panel_28;
	private JPanel panel_27;
	private JPanel panel_11;
	private JPanel panel_10;
	private JLabel currentPlanOfLabel;
	private JLabel physiciansCurrentOrdersLabel;
	private JPanel panel_6;
	private JTextField txt$Period;
	private JLabel patientNameLabel_1;
	private JPanel panel_4;
	private JLabel patientNameLabel;
	private JPanel panel_3;
	private JPanel panel_1;
	private JPanel panel;
	private PanelPhysicianOrderForm2Row rowArr[];
	public static final Color FormColor = new Color(47, 79, 79);
	public static final Color FormColor2 = Color.LIGHT_GRAY;
	private static final int ROW_LEN = 5;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm2() {
		super();
		Global.panelPhysicianOrderForm2 = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 1150));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 60);
		add(panel);

		physiciansOrderFormTextPane = new JTextPane();
		physiciansOrderFormTextPane.setMargin(new Insets(0, 0, 0, 0));
		physiciansOrderFormTextPane.setForeground(FormColor);
		physiciansOrderFormTextPane.setFont(new Font("", Font.BOLD, 16));
		physiciansOrderFormTextPane.setText("PHYSICIAN'S ORDER FORM");
		physiciansOrderFormTextPane.setBounds(435, 10, 112, 42);
		panel.add(physiciansOrderFormTextPane);

		plazaHealthCareLabel_1 = new JLabel();
		plazaHealthCareLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		plazaHealthCareLabel_1.setText("PLAZA NURSING");
		plazaHealthCareLabel_1.setBounds(651, 10, 139, 14);
		panel.add(plazaHealthCareLabel_1);

		plazaHealthCareLabel_2 = new JLabel();
		plazaHealthCareLabel_2.setFont(new Font("Courier New", Font.PLAIN, 12));
		plazaHealthCareLabel_2.setText("456 RAHWAY AVENUE");
		plazaHealthCareLabel_2.setBounds(651, 30, 139, 14);
		panel.add(plazaHealthCareLabel_2);

		partnersLabel = new JLabel();
		partnersLabel.setForeground(FormColor);
		partnersLabel.setFont(new Font("Arial", Font.BOLD, 12));
		partnersLabel.setText("partners");
		partnersLabel.setBounds(300, 25, 54, 14);
		panel.add(partnersLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 60, 800, 45);
		add(panel_1);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 300, 22);
		panel_1.add(panel_3);

		patientNameLabel = new JLabel();
		patientNameLabel.setForeground(FormColor);
		patientNameLabel.setText("FACULTY NAME");
		patientNameLabel.setBounds(3, 3, 75, 14);
		panel_3.add(patientNameLabel);

		plazaNursingLabel = new JLabel();
		plazaNursingLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		plazaNursingLabel.setText("PLAZA NURSING");
		plazaNursingLabel.setBounds(84, 3, 214, 14);
		panel_3.add(plazaNursingLabel);

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(300, 0, 500, 22);
		panel_1.add(panel_4);

		patientNameLabel_1 = new JLabel();
		patientNameLabel_1.setForeground(FormColor);
		patientNameLabel_1.setText("PERIOD");
		patientNameLabel_1.setBounds(3, 3, 38, 14);
		panel_4.add(patientNameLabel_1);

		txt$Period = new JTextField();
		txt$Period.setBackground(Color.WHITE);
		txt$Period.setEditable(false);
		txt$Period.setBounds(47, 0, 192, 22);
		panel_4.add(txt$Period);

		plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		plazaHealthCareLabel.setText("ELIZABETH, NJ 07207");
		plazaHealthCareLabel.setBounds(351, 3, 139, 14);
		panel_4.add(plazaHealthCareLabel);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(FormColor, 1, false));
		panel_6.setForeground(Color.WHITE);
		panel_6.setBackground(FormColor);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 25, 800, 20);
		panel_1.add(panel_6);

		physiciansCurrentOrdersLabel = new JLabel();
		physiciansCurrentOrdersLabel.setForeground(Color.WHITE);
		physiciansCurrentOrdersLabel.setText("MEDICATION ORDERS");
		physiciansCurrentOrdersLabel.setBounds(98, 3, 108, 14);
		panel_6.add(physiciansCurrentOrdersLabel);

		currentPlanOfLabel = new JLabel();
		currentPlanOfLabel.setForeground(Color.WHITE);
		currentPlanOfLabel.setText("OTHER PHYSICIAN'S ORDERS");
		currentPlanOfLabel.setBounds(480, 3, 143, 14);
		panel_6.add(currentPlanOfLabel);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(FormColor, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 105, 305, 801);
		add(panel_10);

		rowArr = new PanelPhysicianOrderForm2Row[ROW_LEN];
		for (int i = 0; i < rowArr.length; i++) {
			rowArr[i] = new PanelPhysicianOrderForm2Row(i + 1);
			rowArr[i].setBounds(0, i * 160, 305, 161);
			panel_10.add(rowArr[i]);
		}

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(FormColor, 1, false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(304, 105, 496, 801);
		add(panel_11);

		panel_38 = new JPanel();
		panel_38.setBackground(Color.WHITE);
		panel_38.setLayout(null);
		panel_38.setBounds(5, 5, 484, 791);
		panel_11.add(panel_38);

		rbAdmissionNew = new JRadioButton();
		rbAdmissionNew.setActionCommand("1");
		bgAdmission.add(rbAdmissionNew);
		rbAdmissionNew.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbAdmissionNew.setBackground(Color.WHITE);
		rbAdmissionNew.setText("NEW ADMISSION");
		rbAdmissionNew.setBounds(10, 10, 121, 18);
		panel_38.add(rbAdmissionNew);

		rbAdmissionRe = new JRadioButton();
		bgAdmission.add(rbAdmissionRe);
		rbAdmissionRe.setActionCommand("2");
		rbAdmissionRe.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbAdmissionRe.setBackground(Color.WHITE);
		rbAdmissionRe.setText("READMISSION");
		rbAdmissionRe.setBounds(137, 10, 106, 18);
		panel_38.add(rbAdmissionRe);

		circleOneLabel = new JLabel();
		circleOneLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		circleOneLabel.setText("CIRCLE ONE:");
		circleOneLabel.setBounds(10, 39, 77, 14);
		panel_38.add(circleOneLabel);

		rbCircleOneMedA = new JRadioButton();
		bgCircleOne.add(rbCircleOneMedA);
		rbCircleOneMedA.setActionCommand("1");
		rbCircleOneMedA.setBackground(Color.WHITE);
		rbCircleOneMedA.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCircleOneMedA.setText("MED A");
		rbCircleOneMedA.setBounds(93, 36, 58, 18);
		panel_38.add(rbCircleOneMedA);

		rbCircleOnePvt = new JRadioButton();
		bgCircleOne.add(rbCircleOnePvt);
		rbCircleOnePvt.setActionCommand("2");
		rbCircleOnePvt.setBackground(Color.WHITE);
		rbCircleOnePvt.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCircleOnePvt.setText("PVT");
		rbCircleOnePvt.setBounds(157, 36, 58, 18);
		panel_38.add(rbCircleOnePvt);

		rbCircleOneManaged = new JRadioButton();
		bgCircleOne.add(rbCircleOneManaged);
		rbCircleOneManaged.setActionCommand("3");
		rbCircleOneManaged.setBackground(Color.WHITE);
		rbCircleOneManaged.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCircleOneManaged.setText("MANAGED CARE");
		rbCircleOneManaged.setBounds(221, 36, 106, 18);
		panel_38.add(rbCircleOneManaged);

		rbCircleOneCaid = new JRadioButton();
		bgCircleOne.add(rbCircleOneCaid);
		rbCircleOneCaid.setActionCommand("4");
		rbCircleOneCaid.setBackground(Color.WHITE);
		rbCircleOneCaid.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbCircleOneCaid.setText("CAID");
		rbCircleOneCaid.setBounds(333, 36, 58, 18);
		panel_38.add(rbCircleOneCaid);

		socialSecurityLabel = new JLabel();
		socialSecurityLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		socialSecurityLabel.setText("SOCIAL SECURITY #:");
		socialSecurityLabel.setBounds(10, 67, 126, 14);
		panel_38.add(socialSecurityLabel);

		txtSsn01 = new JTextField();
		txtSsn01.setBounds(140, 64, 58, 21);
		panel_38.add(txtSsn01);

		label_2 = new JLabel();
		label_2.setFont(new Font("Courier New", Font.PLAIN, 12));
		label_2.setText("-");
		label_2.setBounds(199, 67, 7, 14);
		panel_38.add(label_2);

		txtSsn02 = new JTextField();
		txtSsn02.setBounds(208, 64, 58, 21);
		panel_38.add(txtSsn02);

		label_4 = new JLabel();
		label_4.setFont(new Font("Courier New", Font.PLAIN, 12));
		label_4.setText("-");
		label_4.setBounds(267, 67, 7, 14);
		panel_38.add(label_4);

		txtSsn03 = new JTextField();
		txtSsn03.setBounds(276, 64, 198, 21);
		panel_38.add(txtSsn03);

		dateOfBirthLabel = new JLabel();
		dateOfBirthLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dateOfBirthLabel.setText("DATE OF BIRTH:");
		dateOfBirthLabel.setBounds(10, 96, 98, 14);
		panel_38.add(dateOfBirthLabel);

		dcDateOfBirth = new JDateChooser();
		dcDateOfBirth.setDateFormatString("MM/dd/yyyy");
		dcDateOfBirth.setBounds(114, 89, 152, 21);
		panel_38.add(dcDateOfBirth);

		dietLabel = new JLabel();
		dietLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dietLabel.setText("DIET:");
		dietLabel.setBounds(10, 125, 35, 14);
		panel_38.add(dietLabel);

		rbDietRegular = new JRadioButton();
		rbDietRegular.setActionCommand("1");
		bgDiet.add(rbDietRegular);
		rbDietRegular.setBackground(Color.WHITE);
		rbDietRegular.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietRegular.setText("REGULAR");
		rbDietRegular.setBounds(51, 122, 106, 18);
		panel_38.add(rbDietRegular);

		rbDietBland = new JRadioButton();
		rbDietBland.setActionCommand("3");
		bgDiet.add(rbDietBland);
		rbDietBland.setBackground(Color.WHITE);
		rbDietBland.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietBland.setText("BLAND");
		rbDietBland.setBounds(51, 142, 106, 18);
		panel_38.add(rbDietBland);

		rbDietPureed = new JRadioButton();
		rbDietPureed.setActionCommand("5");
		bgDiet.add(rbDietPureed);
		rbDietPureed.setBackground(Color.WHITE);
		rbDietPureed.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietPureed.setText("PUREED");
		rbDietPureed.setBounds(51, 162, 106, 18);
		panel_38.add(rbDietPureed);

		rbDietNas = new JRadioButton();
		rbDietNas.setActionCommand("7");
		bgDiet.add(rbDietNas);
		rbDietNas.setBackground(Color.WHITE);
		rbDietNas.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietNas.setText("NAS");
		rbDietNas.setBounds(51, 182, 106, 18);
		panel_38.add(rbDietNas);

		rbDietReducingNcs = new JRadioButton();
		rbDietReducingNcs.setActionCommand("9");
		bgDiet.add(rbDietReducingNcs);
		rbDietReducingNcs.setBackground(Color.WHITE);
		rbDietReducingNcs.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietReducingNcs.setText("REDUCING/NCS");
		rbDietReducingNcs.setBounds(51, 202, 106, 18);
		panel_38.add(rbDietReducingNcs);

		rbDietLowCholesterol = new JRadioButton();
		rbDietLowCholesterol.setActionCommand("10");
		bgDiet.add(rbDietLowCholesterol);
		rbDietLowCholesterol.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietLowCholesterol.setBackground(Color.WHITE);
		rbDietLowCholesterol.setText("LOW CHOLESTEROL");
		rbDietLowCholesterol.setBounds(163, 202, 164, 18);
		panel_38.add(rbDietLowCholesterol);

		rbDietLactose = new JRadioButton();
		rbDietLactose.setActionCommand("8");
		bgDiet.add(rbDietLactose);
		rbDietLactose.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietLactose.setBackground(Color.WHITE);
		rbDietLactose.setText("LACTOSE REDUCED");
		rbDietLactose.setBounds(163, 182, 164, 18);
		panel_38.add(rbDietLactose);

		rbDietChopped = new JRadioButton();
		rbDietChopped.setActionCommand("6");
		bgDiet.add(rbDietChopped);
		rbDietChopped.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietChopped.setBackground(Color.WHITE);
		rbDietChopped.setText("CHOPPED");
		rbDietChopped.setBounds(163, 162, 164, 18);
		panel_38.add(rbDietChopped);

		rbDietHouseDiab = new JRadioButton();
		rbDietHouseDiab.setActionCommand("4");
		bgDiet.add(rbDietHouseDiab);
		rbDietHouseDiab.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietHouseDiab.setBackground(Color.WHITE);
		rbDietHouseDiab.setText("HOUSE DIABETIC");
		rbDietHouseDiab.setBounds(163, 142, 164, 18);
		panel_38.add(rbDietHouseDiab);

		rbDietSoft = new JRadioButton();
		rbDietSoft.setActionCommand("2");
		bgDiet.add(rbDietSoft);
		rbDietSoft.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietSoft.setBackground(Color.WHITE);
		rbDietSoft.setText("SOFT");
		rbDietSoft.setBounds(163, 122, 164, 18);
		panel_38.add(rbDietSoft);

		rbDietRenal = new JRadioButton();
		rbDietRenal.setActionCommand("11");
		bgDiet.add(rbDietRenal);
		rbDietRenal.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbDietRenal.setBackground(Color.WHITE);
		rbDietRenal.setText("RENAL DIET");
		rbDietRenal.setBounds(163, 222, 164, 18);
		panel_38.add(rbDietRenal);

		thickLiquidsLabel = new JLabel();
		thickLiquidsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		thickLiquidsLabel.setText("THICK LIQUIDS:");
		thickLiquidsLabel.setBounds(10, 251, 98, 14);
		panel_38.add(thickLiquidsLabel);

		rbThickLiquidsNectar = new JRadioButton();
		rbThickLiquidsNectar.setActionCommand("1");
		rbThickLiquidsNectar.setBackground(Color.WHITE);
		rbThickLiquidsNectar.setFont(new Font("Courier New", Font.PLAIN, 12));
		bgThickLiquids.add(rbThickLiquidsNectar);
		rbThickLiquidsNectar.setText("NECTAR");
		rbThickLiquidsNectar.setBounds(114, 248, 77, 18);
		panel_38.add(rbThickLiquidsNectar);

		rbThickLiquidsHoney = new JRadioButton();
		rbThickLiquidsHoney.setActionCommand("2");
		rbThickLiquidsHoney.setBackground(Color.WHITE);
		bgThickLiquids.add(rbThickLiquidsHoney);
		rbThickLiquidsHoney.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbThickLiquidsHoney.setText("HONEY");
		rbThickLiquidsHoney.setBounds(114, 268, 77, 18);
		panel_38.add(rbThickLiquidsHoney);

		rbThickLiquidsPudding = new JRadioButton();
		rbThickLiquidsPudding.setActionCommand("3");
		rbThickLiquidsPudding.setBackground(Color.WHITE);
		bgThickLiquids.add(rbThickLiquidsPudding);
		rbThickLiquidsPudding.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbThickLiquidsPudding.setText("PUDDING");
		rbThickLiquidsPudding.setBounds(114, 288, 77, 18);
		panel_38.add(rbThickLiquidsPudding);

		supplementsLabel = new JLabel();
		supplementsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		supplementsLabel.setText("SUPPLEMENTS:");
		supplementsLabel.setBounds(199, 250, 84, 14);
		panel_38.add(supplementsLabel);

		txtSupplements = new JTextField();
		txtSupplements.setBounds(289, 247, 185, 21);
		panel_38.add(txtSupplements);

		fluidRestrictionsLabel = new JLabel();
		fluidRestrictionsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		fluidRestrictionsLabel.setText("FLUID RESTRICTION:");
		fluidRestrictionsLabel.setBounds(10, 317, 126, 14);
		panel_38.add(fluidRestrictionsLabel);

		txtFluidRest = new JTextField();
		txtFluidRest.setBounds(140, 313, 103, 21);
		panel_38.add(txtFluidRest);

		ml24HrsLabel = new JLabel();
		ml24HrsLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		ml24HrsLabel.setText("ML/24 HRS");
		ml24HrsLabel.setBounds(244, 316, 63, 14);
		panel_38.add(ml24HrsLabel);

		dietaryConsultLabel = new JLabel();
		dietaryConsultLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dietaryConsultLabel.setText("DIETARY CONSULT:");
		dietaryConsultLabel.setBounds(10, 346, 112, 14);
		panel_38.add(dietaryConsultLabel);

		txtDietaryConsult = new JTextField();
		txtDietaryConsult.setBounds(128, 342, 346, 21);
		panel_38.add(txtDietaryConsult);

		weighLabel = new JLabel();
		weighLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		weighLabel.setText("WEIGH:");
		weighLabel.setBounds(10, 375, 42, 14);
		panel_38.add(weighLabel);

		rbWeighMonthly = new JRadioButton();
		rbWeighMonthly.setActionCommand("1");
		rbWeighMonthly.setBackground(Color.WHITE);
		rbWeighMonthly.setFont(new Font("Courier New", Font.PLAIN, 12));
		bgWeigh.add(rbWeighMonthly);
		rbWeighMonthly.setText("MONTHLY");
		rbWeighMonthly.setBounds(58, 372, 73, 18);
		panel_38.add(rbWeighMonthly);

		rbWeighWeekly = new JRadioButton();
		rbWeighWeekly.setActionCommand("2");
		rbWeighWeekly.setBackground(Color.WHITE);
		bgWeigh.add(rbWeighWeekly);
		rbWeighWeekly.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbWeighWeekly.setText("WEEKLY");
		rbWeighWeekly.setBounds(137, 372, 77, 18);
		panel_38.add(rbWeighWeekly);

		foleyCatheterLabel = new JLabel();
		foleyCatheterLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		foleyCatheterLabel.setText("FOLEY CATHETER:");
		foleyCatheterLabel.setBounds(10, 404, 106, 14);
		panel_38.add(foleyCatheterLabel);

		dxLabel = new JLabel();
		dxLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dxLabel.setText("DX:");
		dxLabel.setBounds(10, 424, 21, 14);
		panel_38.add(dxLabel);

		rbFoleyDxNeuro = new JRadioButton();
		rbFoleyDxNeuro.setActionCommand("1");
		rbFoleyDxNeuro.setBackground(Color.WHITE);
		bgFoleyDx.add(rbFoleyDxNeuro);
		rbFoleyDxNeuro.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFoleyDxNeuro.setText("NEUROGENIC BLADDER");
		rbFoleyDxNeuro.setBounds(37, 422, 152, 18);
		panel_38.add(rbFoleyDxNeuro);

		rbFoleyDxSacral = new JRadioButton();
		rbFoleyDxSacral.setActionCommand("4");
		rbFoleyDxSacral.setBackground(Color.WHITE);
		bgFoleyDx.add(rbFoleyDxSacral);
		rbFoleyDxSacral.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFoleyDxSacral.setText("SACRAL STAGE III/IV");
		rbFoleyDxSacral.setBounds(37, 442, 152, 18);
		panel_38.add(rbFoleyDxSacral);

		rbFoleyDxUrinary = new JRadioButton();
		rbFoleyDxUrinary.setActionCommand("2");
		rbFoleyDxUrinary.setBackground(Color.WHITE);
		bgFoleyDx.add(rbFoleyDxUrinary);
		rbFoleyDxUrinary.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFoleyDxUrinary.setText("URINARY RETENTION");
		rbFoleyDxUrinary.setBounds(199, 422, 137, 18);
		panel_38.add(rbFoleyDxUrinary);

		rbFoleyDxWound = new JRadioButton();
		rbFoleyDxWound.setActionCommand("3");
		rbFoleyDxWound.setBackground(Color.WHITE);
		bgFoleyDx.add(rbFoleyDxWound);
		rbFoleyDxWound.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFoleyDxWound.setText("WOUND HEALING");
		rbFoleyDxWound.setBounds(342, 422, 112, 18);
		panel_38.add(rbFoleyDxWound);

		rbFoleyDxOther = new JRadioButton();
		rbFoleyDxOther.setActionCommand("5");
		rbFoleyDxOther.setBackground(Color.WHITE);
		bgFoleyDx.add(rbFoleyDxOther);
		rbFoleyDxOther.setFont(new Font("Courier New", Font.PLAIN, 12));
		rbFoleyDxOther.setText("OTHER:");
		rbFoleyDxOther.setBounds(199, 442, 60, 18);
		panel_38.add(rbFoleyDxOther);

		txtFoleyDxOtherField = new JTextField();
		txtFoleyDxOtherField.setBounds(260, 441, 214, 21);
		panel_38.add(txtFoleyDxOtherField);

		aboveOrdersGoodLabel = new JLabel();
		aboveOrdersGoodLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		aboveOrdersGoodLabel
				.setText("ABOVE ORDERS GOOD FOR 30 DAYS UNLESS OTHERWISE NOTED");
		aboveOrdersGoodLabel.setBounds(10, 529, 364, 14);
		panel_38.add(aboveOrdersGoodLabel);

		scheduleIiMedicationsTextPane = new JTextPane();
		scheduleIiMedicationsTextPane.setMargin(new Insets(0, 0, 0, 0));
		scheduleIiMedicationsTextPane.setFont(new Font("Courier New",
				Font.PLAIN, 12));
		scheduleIiMedicationsTextPane
				.setText("SCHEDULE II MEDICATIONS ARE VALID FOR PARTIAL FILLING FOR 60 DAYS FROM THE ISSUE DATE IF PRESENTED FOR FILLING WITHIN 30 DAYS OF THAT DATE PURSUANT TO NJAC 8:65-7.5(A), NJAC 8:65-7.10(D)");
		scheduleIiMedicationsTextPane.setBounds(10, 558, 464, 42);
		panel_38.add(scheduleIiMedicationsTextPane);

		iReviewedTheTextPane = new JTextPane();
		iReviewedTheTextPane.setMargin(new Insets(0, 0, 0, 0));
		iReviewedTheTextPane.setFont(new Font("Courier New", Font.PLAIN, 12));
		iReviewedTheTextPane
				.setText("I REVIEWED THE PLAN OF CARE INCLUDING GOALS & CERTIFY THIS RESIDENT REQUIRES CARE IN THIS NURSING FACILITY");
		iReviewedTheTextPane.setBounds(10, 615, 464, 28);
		panel_38.add(iReviewedTheTextPane);

		aboveOrdersReviewedLabel = new JLabel();
		aboveOrdersReviewedLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		aboveOrdersReviewedLabel.setText("ABOVE ORDERS REVIEWED BY");
		aboveOrdersReviewedLabel.setBounds(10, 658, 168, 14);
		panel_38.add(aboveOrdersReviewedLabel);

		txtAboveOrdersField = new JTextField();
		txtAboveOrdersField.setBounds(184, 655, 106, 21);
		panel_38.add(txtAboveOrdersField);

		rnlpnLabel = new JLabel();
		rnlpnLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		rnlpnLabel.setText("RN/LPN");
		rnlpnLabel.setBounds(290, 658, 42, 14);
		panel_38.add(rnlpnLabel);

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dateLabel.setText("DATE");
		dateLabel.setBounds(353, 658, 28, 14);
		panel_38.add(dateLabel);

		dcAboveOrdersDate = new JDateChooser();
		dcAboveOrdersDate.setDateFormatString("MM/dd/yyyy");
		dcAboveOrdersDate.setBounds(387, 655, 87, 21);
		panel_38.add(dcAboveOrdersDate);

		physicianSignatureLabel = new JLabel();
		physicianSignatureLabel
				.setFont(new Font("Courier New", Font.PLAIN, 12));
		physicianSignatureLabel.setText("PHYSICIAN SIGNATURE");
		physicianSignatureLabel.setBounds(10, 687, 138, 14);
		panel_38.add(physicianSignatureLabel);

		cmbPhysicianSign = new JComboBox();
		cmbPhysicianSign.setBackground(Color.WHITE);
		cmbPhysicianSign.setBounds(157, 684, 179, 21);
		panel_38.add(cmbPhysicianSign);

		dateLabel_1 = new JLabel();
		dateLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		dateLabel_1.setText("DATE");
		dateLabel_1.setBounds(353, 687, 28, 14);
		panel_38.add(dateLabel_1);

		dcPhysicianSignDate = new JDateChooser();
		dcPhysicianSignDate.setDateFormatString("MM/dd/yyyy");
		dcPhysicianSignDate.setBounds(387, 684, 87, 21);
		panel_38.add(dcPhysicianSignDate);

		aboveOrdersNotedLabel = new JLabel();
		aboveOrdersNotedLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		aboveOrdersNotedLabel.setText("ABOVE ORDERS NOTED BY");
		aboveOrdersNotedLabel.setBounds(10, 716, 152, 14);
		panel_38.add(aboveOrdersNotedLabel);

		txtAboveOrdersNoted = new JTextField();
		txtAboveOrdersNoted.setBounds(167, 713, 123, 21);
		panel_38.add(txtAboveOrdersNoted);

		rnlpnLabel_1 = new JLabel();
		rnlpnLabel_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		rnlpnLabel_1.setText("RN/LPN");
		rnlpnLabel_1.setBounds(290, 716, 42, 14);
		panel_38.add(rnlpnLabel_1);

		dateLabel_2 = new JLabel();
		dateLabel_2.setFont(new Font("Courier New", Font.PLAIN, 12));
		dateLabel_2.setText("DATE");
		dateLabel_2.setBounds(353, 716, 28, 14);
		panel_38.add(dateLabel_2);

		dcAboveOrdersNotedDate = new JDateChooser();
		dcAboveOrdersNotedDate.setDateFormatString("MM/dd/yyyy");
		dcAboveOrdersNotedDate.setBounds(387, 713, 87, 21);
		panel_38.add(dcAboveOrdersNotedDate);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(FormColor, 1, false));
		panel_27.setBackground(Color.WHITE);
		panel_27.setLayout(null);
		panel_27.setBounds(0, 905, 800, 204);
		add(panel_27);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(FormColor, 1, false));
		panel_28.setBackground(Color.WHITE);
		panel_28.setLayout(null);
		panel_28.setBounds(0, 0, 305, 81);
		panel_27.add(panel_28);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(FormColor);
		diagnosisLabel.setFont(new Font("", Font.BOLD, 12));
		diagnosisLabel.setText("ALLERGIES");
		diagnosisLabel.setBounds(3, 3, 63, 14);
		panel_28.add(diagnosisLabel);

		txt$Allergies = new JTextArea();
		txt$Allergies.setEditable(false);
		txt$Allergies.setBounds(3, 18, 299, 61);
		panel_28.add(txt$Allergies);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(FormColor, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 80, 305, 42);
		panel_27.add(panel_35);

		physiciansNameLabel_3 = new JLabel();
		physiciansNameLabel_3.setForeground(FormColor);
		physiciansNameLabel_3.setText("PHYSICIAIN");
		physiciansNameLabel_3.setBounds(3, 3, 80, 14);
		panel_35.add(physiciansNameLabel_3);

		txt$Physician = new JTextField();
		txt$Physician.setBackground(Color.WHITE);
		txt$Physician.setEditable(false);
		txt$Physician.setBounds(26, 18, 277, 21);
		panel_35.add(txt$Physician);

		label = new JLabel();
		label.setForeground(FormColor);
		label.setText("#");
		label.setBounds(13, 21, 8, 14);
		panel_35.add(label);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(FormColor, 1, false));
		panel_32.setBackground(Color.WHITE);
		panel_32.setLayout(null);
		panel_32.setBounds(304, 162, 305, 42);
		panel_27.add(panel_32);

		roomNumberLabel = new JLabel();
		roomNumberLabel.setForeground(FormColor);
		roomNumberLabel.setText("ROOM/BED/WING");
		roomNumberLabel.setBounds(3, 3, 86, 14);
		panel_32.add(roomNumberLabel);

		separator = new JSeparator();
		separator.setForeground(FormColor);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(95, 0, 1, 42);
		panel_32.add(separator);

		residentNameLabel = new JLabel();
		residentNameLabel.setForeground(FormColor);
		residentNameLabel.setText("MED RECORD #");
		residentNameLabel.setBounds(100, 3, 80, 14);
		panel_32.add(residentNameLabel);

		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(FormColor);
		separator_2.setBounds(184, 1, 1, 42);
		panel_32.add(separator_2);

		residentNumberLabel = new JLabel();
		residentNumberLabel.setForeground(FormColor);
		residentNumberLabel.setText("ADMISSION DATE");
		residentNumberLabel.setBounds(189, 3, 86, 14);
		panel_32.add(residentNumberLabel);

		txt$ResidentRoom = new JTextField();
		txt$ResidentRoom.setBackground(Color.WHITE);
		txt$ResidentRoom.setEditable(false);
		txt$ResidentRoom.setBounds(3, 18, 89, 21);
		panel_32.add(txt$ResidentRoom);

		txt$ResidentMedRecord = new JTextField();
		txt$ResidentMedRecord.setBackground(Color.WHITE);
		txt$ResidentMedRecord.setEditable(false);
		txt$ResidentMedRecord.setBounds(100, 18, 80, 21);
		panel_32.add(txt$ResidentMedRecord);

		txt$ResidentAdmissionDate = new JTextField();
		txt$ResidentAdmissionDate.setBackground(Color.WHITE);
		txt$ResidentAdmissionDate.setEditable(false);
		txt$ResidentAdmissionDate.setBounds(189, 18, 113, 21);
		panel_32.add(txt$ResidentAdmissionDate);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(FormColor, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(304, 0, 496, 81);
		panel_27.add(panel_2);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setForeground(FormColor);
		diagnosisLabel_1.setFont(new Font("", Font.BOLD, 12));
		diagnosisLabel_1.setText("DIAGNOSIS");
		diagnosisLabel_1.setBounds(3, 3, 63, 14);
		panel_2.add(diagnosisLabel_1);

		txt$Diagnosis = new JTextArea();
		txt$Diagnosis.setEditable(false);
		txt$Diagnosis.setBounds(3, 18, 490, 61);
		panel_2.add(txt$Diagnosis);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(304, 80, 305, 42);
		panel_27.add(panel_7);

		physiciansNameLabel = new JLabel();
		physiciansNameLabel.setForeground(new Color(0, 51, 0));
		physiciansNameLabel.setText("PHYSICIAIN ADDRESS");
		physiciansNameLabel.setBounds(3, 3, 107, 14);
		panel_7.add(physiciansNameLabel);

		txt$PhysicianAddress = new JTextField();
		txt$PhysicianAddress.setBackground(Color.WHITE);
		txt$PhysicianAddress.setEditable(false);
		txt$PhysicianAddress.setBounds(3, 18, 300, 21);
		panel_7.add(txt$PhysicianAddress);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(608, 80, 192, 42);
		panel_27.add(panel_8);

		physiciansNameLabel_1 = new JLabel();
		physiciansNameLabel_1.setForeground(new Color(0, 51, 0));
		physiciansNameLabel_1.setText("PHYSICIAIN PHONE");
		physiciansNameLabel_1.setBounds(3, 3, 107, 14);
		panel_8.add(physiciansNameLabel_1);

		txt$PhysicianPhone = new JTextField();
		txt$PhysicianPhone.setBackground(Color.WHITE);
		txt$PhysicianPhone.setEditable(false);
		txt$PhysicianPhone.setBounds(3, 18, 187, 21);
		panel_8.add(txt$PhysicianPhone);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 121, 305, 42);
		panel_27.add(panel_9);

		physiciansNameLabel_2 = new JLabel();
		physiciansNameLabel_2.setForeground(new Color(0, 51, 0));
		physiciansNameLabel_2.setText("ALT. PHYSICIAIN");
		physiciansNameLabel_2.setBounds(3, 3, 83, 14);
		panel_9.add(physiciansNameLabel_2);

		txt$PhysicianAlt = new JTextField();
		txt$PhysicianAlt.setBackground(Color.WHITE);
		txt$PhysicianAlt.setEditable(false);
		txt$PhysicianAlt.setBounds(26, 18, 277, 21);
		panel_9.add(txt$PhysicianAlt);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(304, 121, 305, 42);
		panel_27.add(panel_29);

		physiciansNameLabel_4 = new JLabel();
		physiciansNameLabel_4.setForeground(new Color(0, 51, 0));
		physiciansNameLabel_4.setText("ALT. PHYSICIAIN ADDRESS");
		physiciansNameLabel_4.setBounds(3, 3, 132, 14);
		panel_29.add(physiciansNameLabel_4);

		txt$PhysicianAddressAlt = new JTextField();
		txt$PhysicianAddressAlt.setBackground(Color.WHITE);
		txt$PhysicianAddressAlt.setEditable(false);
		txt$PhysicianAddressAlt.setBounds(3, 18, 300, 21);
		panel_29.add(txt$PhysicianAddressAlt);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(608, 121, 192, 42);
		panel_27.add(panel_30);

		physiciansNameLabel_5 = new JLabel();
		physiciansNameLabel_5.setForeground(new Color(0, 51, 0));
		physiciansNameLabel_5.setText("ALT. PHYSICIAIN PHONE");
		physiciansNameLabel_5.setBounds(3, 3, 120, 14);
		panel_30.add(physiciansNameLabel_5);

		txt$PhysicianPhoneAlt = new JTextField();
		txt$PhysicianPhoneAlt.setBackground(Color.WHITE);
		txt$PhysicianPhoneAlt.setEditable(false);
		txt$PhysicianPhoneAlt.setBounds(3, 18, 187, 21);
		panel_30.add(txt$PhysicianPhoneAlt);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 162, 305, 42);
		panel_27.add(panel_31);

		physiciansNameLabel_6 = new JLabel();
		physiciansNameLabel_6.setForeground(new Color(0, 51, 0));
		physiciansNameLabel_6.setText("RESIDENT NAME");
		physiciansNameLabel_6.setBounds(3, 3, 83, 14);
		panel_31.add(physiciansNameLabel_6);

		txt$ResidentName = new JTextField();
		txt$ResidentName.setBackground(Color.WHITE);
		txt$ResidentName.setEditable(false);
		txt$ResidentName.setBounds(3, 18, 300, 21);
		panel_31.add(txt$ResidentName);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(0, 51, 0), 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(608, 162, 192, 42);
		panel_27.add(panel_33);

		roomNumberLabel_1 = new JLabel();
		roomNumberLabel_1.setForeground(new Color(0, 51, 0));
		roomNumberLabel_1.setText("SEX");
		roomNumberLabel_1.setBounds(3, 3, 18, 14);
		panel_33.add(roomNumberLabel_1);

		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(new Color(0, 51, 0));
		separator_3.setBounds(24, 0, 1, 42);
		panel_33.add(separator_3);

		residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setForeground(new Color(0, 51, 0));
		residentNameLabel_1.setText("DATE OF BIRTH");
		residentNameLabel_1.setBounds(27, 3, 80, 14);
		panel_33.add(residentNameLabel_1);

		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(new Color(0, 51, 0));
		separator_4.setBounds(110, 1, 1, 42);
		panel_33.add(separator_4);

		residentNumberLabel_1 = new JLabel();
		residentNumberLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		residentNumberLabel_1.setForeground(new Color(0, 51, 0));
		residentNumberLabel_1.setText("PAGE NO.");
		residentNumberLabel_1.setBounds(113, 3, 77, 14);
		panel_33.add(residentNumberLabel_1);

		txt$ResidentSex = new JTextField();
		txt$ResidentSex.setBackground(Color.WHITE);
		txt$ResidentSex.setEditable(false);
		txt$ResidentSex.setBounds(3, 18, 20, 21);
		panel_33.add(txt$ResidentSex);

		label_1 = new JLabel();
		label_1.setFont(new Font("Courier New", Font.PLAIN, 12));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setText("1 of 4");
		label_1.setBounds(113, 21, 77, 14);
		panel_33.add(label_1);

		txt$ResidentDateOfBirth = new JTextField();
		txt$ResidentDateOfBirth.setBackground(Color.WHITE);
		txt$ResidentDateOfBirth.setEditable(false);
		txt$ResidentDateOfBirth.setBounds(27, 18, 82, 21);
		panel_33.add(txt$ResidentDateOfBirth);
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
		cmbPhysicianSign.addItem(user.getUserName());
		// cmbPhysicianSign.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "Tom", "John" }));

	}

	public void updateData() {
		PhysicianOrderForm2 refPhysicianOrderForm2 = null;

		if (Global.currentPhysicianOrderForm2Key != 0) {
			try {
				refPhysicianOrderForm2 = MedrexClientManager.getInstance()
						.getPhysicianOrderForm2(
								Global.currentPhysicianOrderForm2Key);
			} catch (Exception e) {

			}
			dcAboveOrdersNotedDate.setDate(refPhysicianOrderForm2
					.getAboveOrdersNotedDate());
			txtAboveOrdersNoted.setText(refPhysicianOrderForm2
					.getAboveOrdersNoted());
			dcPhysicianSignDate.setDate(refPhysicianOrderForm2
					.getPhysicianSignDate());
			cmbPhysicianSign.setSelectedItem(refPhysicianOrderForm2
					.getPhysicianSign());
			dcAboveOrdersDate.setDate(refPhysicianOrderForm2
					.getAboveOrdersDate());
			txtAboveOrdersField.setText(refPhysicianOrderForm2
					.getAboveOrdersField());
			SwingUtils.setSelectedButton(bgFoleyDx, refPhysicianOrderForm2
					.getFoleyDx());
			txtFoleyDxOtherField.setText(refPhysicianOrderForm2
					.getFoleyDxOtherField());
			SwingUtils.setSelectedButton(bgWeigh, refPhysicianOrderForm2
					.getWeigh());
			txtDietaryConsult.setText(refPhysicianOrderForm2
					.getDietaryConsult());
			txtFluidRest.setText(refPhysicianOrderForm2.getFluidRest());
			txtSupplements.setText(refPhysicianOrderForm2.getSupplements());
			SwingUtils.setSelectedButton(bgThickLiquids, refPhysicianOrderForm2
					.getThickLiquids());
			SwingUtils.setSelectedButton(bgCircleOne, refPhysicianOrderForm2
					.getCircleOne());
			SwingUtils.setSelectedButton(bgDiet, refPhysicianOrderForm2
					.getDiet());
			dcDateOfBirth.setDate(refPhysicianOrderForm2.getDateOfBirth());
			txtSsn03.setText(refPhysicianOrderForm2.getSsn03());
			txtSsn02.setText(refPhysicianOrderForm2.getSsn02());
			txtSsn01.setText(refPhysicianOrderForm2.getSsn01());
			SwingUtils.setSelectedButton(bgAdmission, refPhysicianOrderForm2
					.getAdmission());
		}
		for (int i = 0; i < ROW_LEN; i++) {
			rowArr[i].updateData();
		}
	}

	public void doSave() {

		PhysicianOrderForm2 refPhysicianOrderForm2 = new PhysicianOrderForm2();
		refPhysicianOrderForm2.setSerial(Global.currentPhysicianOrderForm2Key);
		refPhysicianOrderForm2.setResidentId(Global.currentResidenceKey);

		refPhysicianOrderForm2.setAboveOrdersNotedDate(dcAboveOrdersNotedDate
				.getDate());
		refPhysicianOrderForm2.setAboveOrdersNoted(txtAboveOrdersNoted
				.getText());
		refPhysicianOrderForm2.setPhysicianSignDate(dcPhysicianSignDate
				.getDate());
		refPhysicianOrderForm2.setPhysicianSign((String) cmbPhysicianSign
				.getSelectedItem());
		refPhysicianOrderForm2.setAboveOrdersDate(dcAboveOrdersDate.getDate());
		refPhysicianOrderForm2.setAboveOrdersField(txtAboveOrdersField
				.getText());
		refPhysicianOrderForm2.setFoleyDx(SwingUtils
				.getSelectedButton(bgFoleyDx));
		refPhysicianOrderForm2.setFoleyDxOtherField(txtFoleyDxOtherField
				.getText());
		refPhysicianOrderForm2.setWeigh(SwingUtils.getSelectedButton(bgWeigh));
		refPhysicianOrderForm2.setDietaryConsult(txtDietaryConsult.getText());
		refPhysicianOrderForm2.setFluidRest(txtFluidRest.getText());
		refPhysicianOrderForm2.setSupplements(txtSupplements.getText());
		refPhysicianOrderForm2.setThickLiquids(SwingUtils
				.getSelectedButton(bgThickLiquids));
		refPhysicianOrderForm2.setCircleOne(SwingUtils
				.getSelectedButton(bgCircleOne));
		refPhysicianOrderForm2.setDiet(SwingUtils.getSelectedButton(bgDiet));
		refPhysicianOrderForm2.setDateOfBirth(dcDateOfBirth.getDate());
		refPhysicianOrderForm2.setSsn03(txtSsn03.getText());
		refPhysicianOrderForm2.setSsn02(txtSsn02.getText());
		refPhysicianOrderForm2.setSsn01(txtSsn01.getText());
		refPhysicianOrderForm2.setAdmission(SwingUtils
				.getSelectedButton(bgAdmission));

		try {
			Global.currentPhysicianOrderForm2Key = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderForm2(
							refPhysicianOrderForm2);
		} catch (Exception e) {

		}

		for (int i = 0; i < ROW_LEN; i++) {
			rowArr[i].doSave();
		}
	}

}
