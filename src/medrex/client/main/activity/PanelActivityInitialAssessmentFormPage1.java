package medrex.client.main.activity;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.admin.formConfig.FormConfigValidation;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelActivityInitialAssessmentFormPage1 extends JPanel implements
		Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2336569019608927440L;

	private Map<String, String> presentationMap;

	private ButtonGroup bgTerm = new ButtonGroup();
	private JRadioButton rbLongTerm;
	private JRadioButton rbShortTerm;
	private static final Object[][] Object = null;
	private JTextField txtReligion;
	private ButtonGroup bgAmbulations = new ButtonGroup();
	private ButtonGroup bgExtremetiesRLE = new ButtonGroup();
	private ButtonGroup bgExtremitiesLLE = new ButtonGroup();
	private ButtonGroup bgExtremitiesRUE = new ButtonGroup();
	private ButtonGroup bgExtremitiesLUE = new ButtonGroup();
	private ButtonGroup bgHearingLeft = new ButtonGroup();
	private ButtonGroup bgHearingRight = new ButtonGroup();
	private ButtonGroup bgVisionLeft = new ButtonGroup();
	private ButtonGroup bgVisionRight = new ButtonGroup();
	private ButtonGroup bgRegularlyNaps = new ButtonGroup();
	private ButtonGroup bgNaps = new ButtonGroup();
	private ButtonGroup bgCandidate11 = new ButtonGroup();
	private ButtonGroup bgWishesNewspaper = new ButtonGroup();
	private ButtonGroup bgPrefferedActivity = new ButtonGroup();
	private ButtonGroup bgPrefers = new ButtonGroup();
	private ButtonGroup bgVeteran = new ButtonGroup();
	private ButtonGroup bgVote = new ButtonGroup();
	private ButtonGroup bgAttendingService = new ButtonGroup();
	private JTextField txtLanguage;
	private JTextField txtMaritalStatus;
	private JRadioButton rbAmbOther;
	private JLabel pastPLabel_1;
	private JLabel pastPLabel;
	private JLabel recreationalPursuitPatternsLabel;
	private JPanel panel_117;
	private JLabel nameLabel_8;
	private JRadioButton rbAmbIndependent;
	private JRadioButton rbAmbNonAmbulatory;
	private JRadioButton rbAmbContactGuard;
	private JRadioButton rbAmbStandBy;
	private JRadioButton rbAmbAssistance;
	private JRadioButton rbAmbCane;
	private JRadioButton rbAmbWalker;
	private JRadioButton rbAmbWheelchair;
	private JRadioButton rbAmbGerichair;
	private JPanel panel_121;
	private JLabel shortTermLabel_19;
	private JPanel panel_120;
	private JRadioButton rbRUENone;
	private JRadioButton rbRLENone;
	private JRadioButton rbExLLENone;
	private JRadioButton rbLUENone;
	private JLabel shortTermLabel_18;
	private JLabel shortTermLabel_17;
	private JLabel shortTermLabel_16;
	private JRadioButton rbRLEPartial;
	private JRadioButton rbRLEFull;
	private JRadioButton rbExLLEPartial;
	private JRadioButton rbExLLEFull;
	private JRadioButton rbRUEPartial;
	private JRadioButton rbRUEFull;
	private JRadioButton rbLUEPartial;
	private JRadioButton rbLUEFull;
	private JLabel shortTermLabel_15;
	private JLabel shortTermLabel_14;
	private JPanel panel_119;
	private JRadioButton rbHearingLeftDeaf;
	private JRadioButton rbHearingRightDeaf;
	private JLabel shortTermLabel_13;
	private JLabel shortTermLabel_12;
	private JLabel shortTermLabel_11;
	private JRadioButton rbLeftHearingAidNo;
	private JRadioButton rbLeftHearingAidYes;
	private JRadioButton rbHearingLeftPoor;
	private JRadioButton rbHearingLeftAdequate;
	private JRadioButton rbRightHearingAidNo;
	private JRadioButton rbRightHearingAidYes;
	private JRadioButton rbHearingRightPoor;
	private JRadioButton rbHearingRightAdequate;
	private JLabel shortTermLabel_10;
	private JLabel shortTermLabel_9;
	private JPanel panel_118;
	private JLabel shortTermLabel_8;
	private JRadioButton rbVisionLeftBlind;
	private JRadioButton rbVisionLeftPoor;
	private JRadioButton rbVisionLeftGlasses;
	private JRadioButton rbVisionLeftAdequate;
	private JRadioButton rbVisionRightBlind;
	private JRadioButton rbVisionRightPoor;
	private JRadioButton rbVisionRightGlasses;
	private JRadioButton rbVisionRightAdequate;
	private JLabel shortTermLabel_7;
	private JLabel shortTermLabel_6;
	private JPanel panel_116;
	private JLabel shortTermLabel_5;
	private JPanel panel_6;
	private JRadioButton rbRegularlyNapsNO;
	private JRadioButton rbRegularlyNapsYes;
	private JLabel pLabel_38;
	private JRadioButton rbNapsEvenings;
	private JRadioButton rbNapsAfternoons;
	private JRadioButton rbNapsMornings;
	private JRadioButton rbNapsDesired;
	private JLabel pLabel_37;
	private JTextField txtFrequency;
	private JLabel shortTermLabel_4;
	private JRadioButton rbCandidateNo;
	private JRadioButton rbCandidateYes;
	private JLabel pLabel_36;
	private JRadioButton rbNewspaperNotAtAll;
	private JRadioButton rbNewspaperSunday;
	private JRadioButton rbNewspaperDaily;
	private JRadioButton rbActivitySettingsOutsidefacility;
	private JRadioButton rbActivitySettingsOfUnit;
	private JRadioButton rbActivitySettingsOutdoors;
	private JRadioButton rbActivitySettingsDayRoom;
	private JRadioButton rbActivitySettingOwnRoom;
	private JLabel pLabel_35;
	private JLabel pLabel_34;
	private JRadioButton rbPrefersIndependent;
	private JRadioButton rbPrefers11;
	private JRadioButton rbPrefersSmallGroup;
	private JRadioButton rbPrefersLargeGroup;
	private JLabel pLabel_33;
	private JPanel panel_115;
	private JLabel pLabel_32;
	private JPanel panel_114;
	private JCheckBox cbC24;
	private JPanel panel_113;
	private JCheckBox cbP24;
	private JPanel panel_112;
	private JPanel panel_111;
	private JLabel pLabel_31;
	private JPanel panel_110;
	private JCheckBox cbC23;
	private JPanel panel_109;
	private JCheckBox cbP23;
	private JPanel panel_108;
	private JPanel panel_107;
	private JLabel pLabel_30;
	private JPanel panel_106;
	private JCheckBox cbC22;
	private JPanel panel_105;
	private JCheckBox cbP22;
	private JPanel panel_104;
	private JPanel panel_103;
	private JLabel pLabel_29;
	private JPanel panel_102;
	private JCheckBox cbC21;
	private JPanel panel_101;
	private JCheckBox cbP21;
	private JPanel panel_100;
	private JPanel panel_99;
	private JLabel pLabel_28;
	private JPanel panel_98;
	private JCheckBox cbC20;
	private JPanel panel_97;
	private JCheckBox cbP20;
	private JPanel panel_96;
	private JPanel panel_95;
	private JLabel pLabel_27;
	private JPanel panel_94;
	private JCheckBox cbC19;
	private JPanel panel_93;
	private JCheckBox cbP19;
	private JPanel panel_92;
	private JPanel panel_91;
	private JLabel pLabel_26;
	private JPanel panel_90;
	private JCheckBox cbC18;
	private JPanel panel_89;
	private JCheckBox cbP18;
	private JPanel panel_88;
	private JPanel panel_87;
	private JLabel pLabel_25;
	private JPanel panel_86;
	private JCheckBox cbC17;
	private JPanel panel_85;
	private JCheckBox cbP17;
	private JPanel panel_84;
	private JPanel panel_83;
	private JLabel pLabel_24;
	private JPanel panel_82;
	private JLabel pLabel_23;
	private JPanel panel_81;
	private JLabel pLabel_22;
	private JPanel panel_80;
	private JPanel panel_79;
	private JPanel panel_78;
	private JLabel pLabel_21;
	private JPanel panel_77;
	private JCheckBox cbC16;
	private JPanel panel_76;
	private JCheckBox cbP16;
	private JPanel panel_75;
	private JPanel panel_74;
	private JLabel pLabel_20;
	private JPanel panel_73;
	private JCheckBox cbC15;
	private JPanel panel_72;
	private JCheckBox cbP15;
	private JPanel panel_71;
	private JPanel panel_70;
	private JLabel pLabel_19;
	private JPanel panel_69;
	private JCheckBox cbC14;
	private JPanel panel_68;
	private JCheckBox cbP14;
	private JPanel panel_67;
	private JPanel panel_66;
	private JLabel pLabel_18;
	private JPanel panel_65;
	private JCheckBox cbC13;
	private JPanel panel_64;
	private JCheckBox cbP13;
	private JPanel panel_63;
	private JPanel panel_62;
	private JLabel pLabel_17;
	private JPanel panel_61;
	private JCheckBox cbC12;
	private JPanel panel_60;
	private JCheckBox cbP12;
	private JPanel panel_59;
	private JPanel panel_58;
	private JLabel pLabel_16;
	private JPanel panel_57;
	private JCheckBox cbC11;
	private JPanel panel_56;
	private JCheckBox cbP11;
	private JPanel panel_55;
	private JPanel panel_54;
	private JLabel pLabel_15;
	private JPanel panel_53;
	private JCheckBox cbC10;
	private JPanel panel_52;
	private JCheckBox cbP10;
	private JPanel panel_51;
	private JPanel panel_50;
	private JLabel pLabel_14;
	private JPanel panel_49;
	private JCheckBox cbC9;
	private JPanel panel_48;
	private JCheckBox cbP9;
	private JPanel panel_47;
	private JPanel panel_46;
	private JLabel pLabel_13;
	private JPanel panel_45;
	private JLabel pLabel_12;
	private JPanel panel_44;
	private JLabel pLabel_11;
	private JPanel panel_43;
	private JPanel panel_42;
	private JPanel panel_41;
	private JLabel pLabel_10;
	private JPanel panel_40;
	private JCheckBox cbC8;
	private JPanel panel_39;
	private JCheckBox cbP8;
	private JPanel panel_38;
	private JPanel panel_37;
	private JLabel pLabel_9;
	private JPanel panel_36;
	private JCheckBox cbC7;
	private JPanel panel_35;
	private JCheckBox cbP7;
	private JPanel panel_34;
	private JPanel panel_33;
	private JLabel pLabel_8;
	private JPanel panel_32;
	private JCheckBox cbC6;
	private JPanel panel_31;
	private JCheckBox cbP6;
	private JPanel panel_30;
	private JPanel panel_29;
	private JLabel pLabel_7;
	private JPanel panel_28;
	private JCheckBox cbC5;
	private JPanel panel_27;
	private JCheckBox cbP5;
	private JPanel panel_26;
	private JPanel panel_25;
	private JLabel pLabel_6;
	private JPanel panel_24;
	private JCheckBox cbC4;
	private JPanel panel_23;
	private JCheckBox cbP4;
	private JPanel panel_22;
	private JPanel panel_21;
	private JLabel pLabel_4;
	private JPanel panel_20;
	private JCheckBox cbC3;
	private JPanel panel_19;
	private JCheckBox cbP3;
	private JPanel panel_18;
	private JPanel panel_17;
	private JLabel pLabel_3;
	private JPanel panel_16;
	private JCheckBox cbC2;
	private JPanel panel_15;
	private JCheckBox cbP2;
	private JPanel panel_14;
	private JPanel panel_13;
	private JCheckBox cbC1;
	private JCheckBox cbP1;
	private JLabel pLabel_5;
	private JPanel panel_12;
	private JPanel panel_11;
	private JPanel panel_10;
	private JPanel panel_9;
	private JLabel pLabel_2;
	private JPanel panel_8;
	private JLabel pLabel_1;
	private JPanel panel_7;
	private JLabel pLabel;
	private JPanel panel_5;
	private JPanel panel_4;
	private JPanel panel_2;
	private JPanel panel_3;
	private JRadioButton rbAttendServicesYes;
	private JRadioButton rbAttendServicesNo;
	private JLabel shortTermLabel_3;
	private JTextField txtVoteSpecify;
	private JRadioButton rbVoteSpecifyNo;
	private JRadioButton rbVeteranYes;
	private JLabel nameLabel_11;
	private JRadioButton rbWantsToVoteNo;
	private JRadioButton rbWantsToVoteYes;
	private JTextField txtRelationship;
	private JLabel nameLabel_15;
	private JLabel nameLabel_14;
	private JTextField txtResponsibleParty;
	private JTextField txtOccupation;
	private JLabel nameLabel_13;
	private JLabel nameLabel_12;
	private JLabel nameLabel_10;
	private JTextField txtBirthplace;
	private JDateChooser dcBirthdate;
	private JLabel nameLabel_7;
	private JLabel nameLabel_6;
	private JLabel nameLabel_5;
	private JLabel nameLabel_4;
	private JTextField txtAllergies;
	private JLabel nameLabel_3;
	private JTextArea textAreaDiagnosis;
	private JLabel nameLabel_2;
	private JDateChooser dcAdmissionDate;
	private JLabel nameLabel_1;
	private JTextField txtName;
	private JLabel nameLabel;
	private JPanel panel_1;
	private JLabel shortTermLabel_2;
	private JLabel shortTermLabel_1;
	private JPanel panel;
	ResidentAssessmentFormPage1 rafp1 = null;

	/**
	 * Create the panel
	 */
	public PanelActivityInitialAssessmentFormPage1() {
		super();
		setPreferredSize(new Dimension(800, 1000));

		Global.panelActivityInitalAssessmentFormPage1 = this;

		setLayout(null);
		setSize(800, 1200);
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setMinimumSize(new Dimension(600, 200));
		panel.setLayout(null);
		panel.setBounds(211, 10, 375, 72);
		add(panel);

		shortTermLabel_1 = new JLabel();
		shortTermLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		shortTermLabel_1.setText("Plaza Healthcare & Rehabilitation Center");
		shortTermLabel_1.setBounds(38, 10, 298, 14);
		panel.add(shortTermLabel_1);

		shortTermLabel_2 = new JLabel();
		shortTermLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_2.setText("Activity Initial Assessment");
		shortTermLabel_2.setBounds(105, 30, 210, 17);
		panel.add(shortTermLabel_2);

		rbShortTerm = new JRadioButton();
		rbShortTerm.setFont(new Font("Arial", Font.PLAIN, 12));
		bgTerm.add(rbShortTerm);
		rbShortTerm.setActionCommand("1");
		rbShortTerm.setBackground(Color.WHITE);
		rbShortTerm.setOpaque(false);
		rbShortTerm.setText("Short Term");
		rbShortTerm.setBounds(55, 51, 94, 18);
		panel.add(rbShortTerm);

		rbLongTerm = new JRadioButton();
		rbLongTerm.setFont(new Font("Arial", Font.PLAIN, 12));
		bgTerm.add(rbLongTerm);
		rbLongTerm.setActionCommand("2");
		rbLongTerm.setBackground(Color.WHITE);
		rbLongTerm.setText("Long Term ");
		rbLongTerm.setBounds(205, 51, 94, 18);
		panel.add(rbLongTerm);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(20, 90, 767, 244);
		add(panel_1);

		nameLabel = new JLabel();
		nameLabel.setText("Name:");
		nameLabel.setBounds(10, 10, 54, 14);
		panel_1.add(nameLabel);

		txtName = new JTextField();
		txtName.setBounds(100, 7, 283, 21);
		panel_1.add(txtName);

		nameLabel_1 = new JLabel();
		nameLabel_1.setText("Admission Date:");
		nameLabel_1.setBounds(415, 10, 99, 14);
		panel_1.add(nameLabel_1);

		dcAdmissionDate = new JDateChooser();
		dcAdmissionDate.setDateFormatString("MM/dd/yyyy");
		dcAdmissionDate.setBounds(520, 5, 155, 21);
		panel_1.add(dcAdmissionDate);

		nameLabel_2 = new JLabel();
		nameLabel_2.setText("Diagnosis:");
		nameLabel_2.setBounds(10, 35, 73, 14);
		panel_1.add(nameLabel_2);

		textAreaDiagnosis = new JTextArea();
		textAreaDiagnosis.setWrapStyleWord(true);
		textAreaDiagnosis.setLineWrap(true);
		textAreaDiagnosis.setBorder(new LineBorder(Color.black, 1, false));
		textAreaDiagnosis.setBounds(100, 32, 283, 53);
		panel_1.add(textAreaDiagnosis);

		nameLabel_3 = new JLabel();
		nameLabel_3.setText("Allergies:");
		nameLabel_3.setBounds(415, 36, 73, 14);
		panel_1.add(nameLabel_3);

		txtAllergies = new JTextField();
		txtAllergies.setBounds(520, 32, 155, 21);
		panel_1.add(txtAllergies);

		nameLabel_4 = new JLabel();
		nameLabel_4.setText("Language");
		nameLabel_4.setBounds(10, 120, 65, 14);
		panel_1.add(nameLabel_4);

		nameLabel_5 = new JLabel();
		nameLabel_5.setText("Marital Status");
		nameLabel_5.setBounds(415, 90, 100, 14);
		panel_1.add(nameLabel_5);

		nameLabel_6 = new JLabel();
		nameLabel_6.setText("Birthdate:");
		nameLabel_6.setBounds(10, 95, 64, 14);
		panel_1.add(nameLabel_6);

		nameLabel_7 = new JLabel();
		nameLabel_7.setText("Birthplace:");
		nameLabel_7.setBounds(415, 62, 73, 14);
		panel_1.add(nameLabel_7);

		dcBirthdate = new JDateChooser();
		dcBirthdate.setBounds(100, 91, 283, 21);
		dcBirthdate.setDateFormatString("MM/dd/yyyy");
		panel_1.add(dcBirthdate);

		txtBirthplace = new JTextField();
		txtBirthplace.setBounds(520, 64, 155, 21);
		panel_1.add(txtBirthplace);

		nameLabel_10 = new JLabel();
		nameLabel_10.setText("Wants to Vote?");
		nameLabel_10.setBounds(10, 142, 100, 14);
		panel_1.add(nameLabel_10);

		nameLabel_12 = new JLabel();
		nameLabel_12.setText("Responsible Party:");
		nameLabel_12.setBounds(10, 217, 115, 14);
		panel_1.add(nameLabel_12);

		nameLabel_13 = new JLabel();
		nameLabel_13.setText("Occupation:");
		nameLabel_13.setBounds(10, 192, 86, 14);
		panel_1.add(nameLabel_13);

		txtOccupation = new JTextField();
		txtOccupation.setBounds(100, 188, 575, 21);
		panel_1.add(txtOccupation);

		txtResponsibleParty = new JTextField();
		txtResponsibleParty.setBounds(135, 212, 248, 21);
		panel_1.add(txtResponsibleParty);

		nameLabel_14 = new JLabel();
		nameLabel_14.setText("Relationship:");
		nameLabel_14.setBounds(415, 217, 80, 14);
		panel_1.add(nameLabel_14);

		nameLabel_15 = new JLabel();
		nameLabel_15.setText("Attend Services:");
		nameLabel_15.setBounds(415, 164, 103, 14);
		panel_1.add(nameLabel_15);

		txtRelationship = new JTextField();
		txtRelationship.setBounds(520, 214, 155, 21);
		panel_1.add(txtRelationship);

		rbWantsToVoteYes = new JRadioButton();
		rbWantsToVoteYes.setActionCommand("1");
		bgVote.add(rbWantsToVoteYes);
		rbWantsToVoteYes.setBackground(Color.WHITE);
		rbWantsToVoteYes.setText("Yes");
		rbWantsToVoteYes.setBounds(110, 142, 53, 18);
		panel_1.add(rbWantsToVoteYes);

		rbWantsToVoteNo = new JRadioButton();
		rbWantsToVoteNo.setActionCommand("2");
		bgVote.add(rbWantsToVoteNo);
		rbWantsToVoteNo.setBackground(Color.WHITE);
		rbWantsToVoteNo.setText("No ");
		rbWantsToVoteNo.setBounds(165, 142, 39, 18);
		panel_1.add(rbWantsToVoteNo);

		nameLabel_11 = new JLabel();
		nameLabel_11.setText("Veteran?");
		nameLabel_11.setBounds(364, 142, 60, 14);
		panel_1.add(nameLabel_11);

		rbVeteranYes = new JRadioButton();
		rbVeteranYes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbVeteranYes.isSelected()) {
					txtVoteSpecify.setEnabled(true);
				}
			}
		});
		rbVeteranYes.setActionCommand("1");
		bgVeteran.add(rbVeteranYes);
		rbVeteranYes.setBackground(Color.WHITE);
		rbVeteranYes.setText("Yes");
		rbVeteranYes.setBounds(430, 140, 46, 18);
		panel_1.add(rbVeteranYes);

		rbVoteSpecifyNo = new JRadioButton();
		rbVoteSpecifyNo.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbVoteSpecifyNo.isSelected())
					txtVoteSpecify.setEnabled(false);
				txtVoteSpecify.setText("");
			}
		});
		rbVoteSpecifyNo.setActionCommand("2");
		bgVeteran.add(rbVoteSpecifyNo);
		rbVoteSpecifyNo.setBackground(Color.WHITE);
		rbVoteSpecifyNo.setText("No");
		rbVoteSpecifyNo.setBounds(703, 140, 54, 18);
		panel_1.add(rbVoteSpecifyNo);

		txtVoteSpecify = new JTextField();
		txtVoteSpecify.setBounds(542, 139, 155, 21);
		panel_1.add(txtVoteSpecify);

		shortTermLabel_3 = new JLabel();
		shortTermLabel_3.setText("(Specify)");
		shortTermLabel_3.setBounds(482, 141, 54, 17);
		panel_1.add(shortTermLabel_3);

		rbAttendServicesNo = new JRadioButton();
		rbAttendServicesNo.setActionCommand("2");
		bgAttendingService.add(rbAttendServicesNo);
		rbAttendServicesNo.setBackground(Color.WHITE);
		rbAttendServicesNo.setText("No");
		rbAttendServicesNo.setBounds(580, 164, 80, 18);
		panel_1.add(rbAttendServicesNo);

		rbAttendServicesYes = new JRadioButton();
		rbAttendServicesYes.setActionCommand("1");
		bgAttendingService.add(rbAttendServicesYes);
		rbAttendServicesYes.setBackground(Color.WHITE);
		rbAttendServicesYes.setText("Yes");
		rbAttendServicesYes.setBounds(518, 164, 53, 18);
		panel_1.add(rbAttendServicesYes);

		nameLabel_8 = new JLabel();
		nameLabel_8.setText("Religion:");
		nameLabel_8.setBounds(10, 167, 54, 14);
		panel_1.add(nameLabel_8);

		txtMaritalStatus = new JTextField();
		txtMaritalStatus.setBounds(520, 90, 155, 21);
		panel_1.add(txtMaritalStatus);

		txtLanguage = new JTextField();
		txtLanguage.setBounds(100, 117, 283, 21);
		panel_1.add(txtLanguage);

		txtReligion = new JTextField();
		txtReligion.setBounds(100, 162, 283, 21);
		panel_1.add(txtReligion);

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setMinimumSize(new Dimension(600, 200));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 400, 767, 195);
		add(panel_3);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 255, 195);
		panel_3.add(panel_2);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 255, 23);
		panel_2.add(panel_4);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 36, 23);
		panel_4.add(panel_5);

		pLabel = new JLabel();
		pLabel.setFont(new Font("", Font.BOLD, 12));
		pLabel.setBounds(13, 1, 13, 20);
		panel_5.add(pLabel);
		pLabel.setText("P");

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(35, 0, 36, 23);
		panel_4.add(panel_7);

		pLabel_1 = new JLabel();
		pLabel_1.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_1.setText("C");
		pLabel_1.setBounds(13, 1, 13, 20);
		panel_7.add(pLabel_1);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(69, 0, 186, 23);
		panel_4.add(panel_8);

		pLabel_2 = new JLabel();
		pLabel_2.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_2.setText("Pursuit");
		pLabel_2.setBounds(10, 1, 71, 20);
		panel_8.add(pLabel_2);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 22, 255, 23);
		panel_2.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 36, 23);
		panel_9.add(panel_10);

		cbP1 = new JCheckBox();
		cbP1.setBackground(Color.WHITE);
		cbP1.setBounds(10, 2, 16, 18);
		panel_10.add(cbP1);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(35, 0, 36, 23);
		panel_9.add(panel_11);

		cbC1 = new JCheckBox();
		cbC1.setBackground(Color.WHITE);
		cbC1.setBounds(10, 2, 22, 18);
		panel_11.add(cbC1);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(69, 0, 186, 23);
		panel_9.add(panel_12);

		pLabel_5 = new JLabel();
		pLabel_5.setText("Cards");
		pLabel_5.setBounds(10, 1, 166, 20);
		panel_12.add(pLabel_5);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 43, 255, 23);
		panel_2.add(panel_13);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 0, 36, 23);
		panel_13.add(panel_14);

		cbP2 = new JCheckBox();
		cbP2.setBackground(Color.WHITE);
		cbP2.setText("New JCheckBox");
		cbP2.setBounds(10, 2, 16, 18);
		panel_14.add(cbP2);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(35, 0, 36, 23);
		panel_13.add(panel_15);

		cbC2 = new JCheckBox();
		cbC2.setBackground(Color.WHITE);
		cbC2.setText("New JCheckBox");
		cbC2.setBounds(10, 2, 16, 18);
		panel_15.add(cbC2);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(69, 0, 186, 23);
		panel_13.add(panel_16);

		pLabel_3 = new JLabel();
		pLabel_3.setText("Games");
		pLabel_3.setBounds(10, 1, 166, 20);
		panel_16.add(pLabel_3);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(0, 64, 255, 23);
		panel_2.add(panel_17);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 0, 36, 23);
		panel_17.add(panel_18);

		cbP3 = new JCheckBox();
		cbP3.setBackground(Color.WHITE);
		cbP3.setText("New JCheckBox");
		cbP3.setBounds(10, 2, 16, 18);
		panel_18.add(cbP3);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(35, 0, 36, 23);
		panel_17.add(panel_19);

		cbC3 = new JCheckBox();
		cbC3.setBackground(Color.WHITE);
		cbC3.setText("New JCheckBox");
		cbC3.setBounds(10, 2, 16, 18);
		panel_19.add(cbC3);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(69, 0, 186, 23);
		panel_17.add(panel_20);

		pLabel_4 = new JLabel();
		pLabel_4.setText("Arts & Crafts");
		pLabel_4.setBounds(10, 1, 166, 20);
		panel_20.add(pLabel_4);

		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 85, 255, 23);
		panel_2.add(panel_21);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 0, 36, 23);
		panel_21.add(panel_22);

		cbP4 = new JCheckBox();
		cbP4.setBackground(Color.WHITE);
		cbP4.setText("New JCheckBox");
		cbP4.setBounds(10, 2, 16, 18);
		panel_22.add(cbP4);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(35, 0, 36, 23);
		panel_21.add(panel_23);

		cbC4 = new JCheckBox();
		cbC4.setBackground(Color.WHITE);
		cbC4.setText("New JCheckBox");
		cbC4.setBounds(10, 2, 16, 18);
		panel_23.add(cbC4);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(69, 0, 186, 23);
		panel_21.add(panel_24);

		pLabel_6 = new JLabel();
		pLabel_6.setText("Excercise / Sports");
		pLabel_6.setBounds(10, 1, 166, 20);
		panel_24.add(pLabel_6);

		panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 106, 255, 23);
		panel_2.add(panel_25);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 0, 36, 23);
		panel_25.add(panel_26);

		cbP5 = new JCheckBox();
		cbP5.setBackground(Color.WHITE);
		cbP5.setText("New JCheckBox");
		cbP5.setBounds(10, 2, 16, 18);
		panel_26.add(cbP5);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(35, 0, 36, 23);
		panel_25.add(panel_27);

		cbC5 = new JCheckBox();
		cbC5.setBackground(Color.WHITE);
		cbC5.setText("New JCheckBox");
		cbC5.setBounds(10, 2, 16, 18);
		panel_27.add(cbC5);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(69, 0, 186, 23);
		panel_25.add(panel_28);

		pLabel_7 = new JLabel();
		pLabel_7.setText("View Sports");
		pLabel_7.setBounds(10, 1, 166, 20);
		panel_28.add(pLabel_7);

		panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 128, 255, 23);
		panel_2.add(panel_29);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 0, 36, 23);
		panel_29.add(panel_30);

		cbP6 = new JCheckBox();
		cbP6.setBackground(Color.WHITE);
		cbP6.setText("New JCheckBox");
		cbP6.setBounds(10, 2, 16, 18);
		panel_30.add(cbP6);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(35, 0, 36, 23);
		panel_29.add(panel_31);

		cbC6 = new JCheckBox();
		cbC6.setBackground(Color.WHITE);
		cbC6.setText("New JCheckBox");
		cbC6.setBounds(10, 2, 16, 18);
		panel_31.add(cbC6);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(69, 0, 186, 23);
		panel_29.add(panel_32);

		pLabel_8 = new JLabel();
		pLabel_8.setText("Music");
		pLabel_8.setBounds(10, 1, 166, 20);
		panel_32.add(pLabel_8);

		panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 150, 255, 23);
		panel_2.add(panel_33);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 0, 36, 23);
		panel_33.add(panel_34);

		cbP7 = new JCheckBox();
		cbP7.setBackground(Color.WHITE);
		cbP7.setText("New JCheckBox");
		cbP7.setBounds(10, 2, 16, 18);
		panel_34.add(cbP7);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(35, 0, 36, 23);
		panel_33.add(panel_35);

		cbC7 = new JCheckBox();
		cbC7.setBackground(Color.WHITE);
		cbC7.setText("New JCheckBox");
		cbC7.setBounds(10, 2, 16, 18);
		panel_35.add(cbC7);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(69, 0, 186, 23);
		panel_33.add(panel_36);

		pLabel_9 = new JLabel();
		pLabel_9.setText("Dance");
		pLabel_9.setBounds(10, 1, 166, 20);
		panel_36.add(pLabel_9);

		panel_37 = new JPanel();
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 172, 255, 23);
		panel_2.add(panel_37);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 0, 36, 23);
		panel_37.add(panel_38);

		cbP8 = new JCheckBox();
		cbP8.setBackground(Color.WHITE);
		cbP8.setText("New JCheckBox");
		cbP8.setBounds(10, 2, 16, 18);
		panel_38.add(cbP8);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(35, 0, 36, 23);
		panel_37.add(panel_39);

		cbC8 = new JCheckBox();
		cbC8.setBackground(Color.WHITE);
		cbC8.setText("New JCheckBox");
		cbC8.setBounds(10, 2, 16, 18);
		panel_39.add(cbC8);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(69, 0, 186, 23);
		panel_37.add(panel_40);

		pLabel_10 = new JLabel();
		pLabel_10.setText("Reading");
		pLabel_10.setBounds(10, 1, 166, 20);
		panel_40.add(pLabel_10);

		panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(253, 0, 255, 195);
		panel_3.add(panel_41);

		panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 0, 255, 23);
		panel_41.add(panel_42);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 0, 36, 23);
		panel_42.add(panel_43);

		pLabel_11 = new JLabel();
		pLabel_11.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_11.setText("P");
		pLabel_11.setBounds(13, 1, 13, 20);
		panel_43.add(pLabel_11);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(35, 0, 36, 23);
		panel_42.add(panel_44);

		pLabel_12 = new JLabel();
		pLabel_12.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_12.setText("C");
		pLabel_12.setBounds(13, 1, 13, 20);
		panel_44.add(pLabel_12);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(69, 0, 186, 23);
		panel_42.add(panel_45);

		pLabel_13 = new JLabel();
		pLabel_13.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_13.setText("Pursuit");
		pLabel_13.setBounds(10, 1, 71, 20);
		panel_45.add(pLabel_13);

		panel_46 = new JPanel();
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 22, 255, 23);
		panel_41.add(panel_46);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 0, 36, 23);
		panel_46.add(panel_47);

		cbP9 = new JCheckBox();
		cbP9.setBackground(Color.WHITE);
		cbP9.setText("New JCheckBox");
		cbP9.setBounds(10, 2, 16, 18);
		panel_47.add(cbP9);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(35, 0, 36, 23);
		panel_46.add(panel_48);

		cbC9 = new JCheckBox();
		cbC9.setBackground(Color.WHITE);
		cbC9.setBounds(10, 2, 22, 18);
		panel_48.add(cbC9);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(69, 0, 186, 23);
		panel_46.add(panel_49);

		pLabel_14 = new JLabel();
		pLabel_14.setText("Writing");
		pLabel_14.setBounds(10, 1, 166, 20);
		panel_49.add(pLabel_14);

		panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(0, 43, 255, 23);
		panel_41.add(panel_50);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(0, 0, 36, 23);
		panel_50.add(panel_51);

		cbP10 = new JCheckBox();
		cbP10.setBackground(Color.WHITE);
		cbP10.setText("New JCheckBox");
		cbP10.setBounds(10, 2, 16, 18);
		panel_51.add(cbP10);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(35, 0, 36, 23);
		panel_50.add(panel_52);

		cbC10 = new JCheckBox();
		cbC10.setBackground(Color.WHITE);
		cbC10.setText("New JCheckBox");
		cbC10.setBounds(10, 2, 16, 18);
		panel_52.add(cbC10);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(69, 0, 186, 23);
		panel_50.add(panel_53);

		pLabel_15 = new JLabel();
		pLabel_15.setText("Spiritual / Religion");
		pLabel_15.setBounds(10, 1, 166, 20);
		panel_53.add(pLabel_15);

		panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(0, 64, 255, 23);
		panel_41.add(panel_54);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 0, 36, 23);
		panel_54.add(panel_55);

		cbP11 = new JCheckBox();
		cbP11.setBackground(Color.WHITE);
		cbP11.setText("New JCheckBox");
		cbP11.setBounds(10, 2, 16, 18);
		panel_55.add(cbP11);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(35, 0, 36, 23);
		panel_54.add(panel_56);

		cbC11 = new JCheckBox();
		cbC11.setBackground(Color.WHITE);
		cbC11.setText("New JCheckBox");
		cbC11.setBounds(10, 2, 16, 18);
		panel_56.add(cbC11);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(69, 0, 186, 23);
		panel_54.add(panel_57);

		pLabel_16 = new JLabel();
		pLabel_16.setText("Trips / Outings");
		pLabel_16.setBounds(10, 1, 166, 20);
		panel_57.add(pLabel_16);

		panel_58 = new JPanel();
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 85, 255, 23);
		panel_41.add(panel_58);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(0, 0, 36, 23);
		panel_58.add(panel_59);

		cbP12 = new JCheckBox();
		cbP12.setBackground(Color.WHITE);
		cbP12.setText("New JCheckBox");
		cbP12.setBounds(10, 2, 16, 18);
		panel_59.add(cbP12);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(35, 0, 36, 23);
		panel_58.add(panel_60);

		cbC12 = new JCheckBox();
		cbC12.setBackground(Color.WHITE);
		cbC12.setText("New JCheckBox");
		cbC12.setBounds(10, 2, 16, 18);
		panel_60.add(cbC12);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(69, 0, 186, 23);
		panel_58.add(panel_61);

		pLabel_17 = new JLabel();
		pLabel_17.setText("Outdoor / Nature");
		pLabel_17.setBounds(10, 1, 166, 20);
		panel_61.add(pLabel_17);

		panel_62 = new JPanel();
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 106, 255, 23);
		panel_41.add(panel_62);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(0, 0, 36, 23);
		panel_62.add(panel_63);

		cbP13 = new JCheckBox();
		cbP13.setBackground(Color.WHITE);
		cbP13.setText("New JCheckBox");
		cbP13.setBounds(10, 2, 16, 18);
		panel_63.add(cbP13);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(35, 0, 36, 23);
		panel_62.add(panel_64);

		cbC13 = new JCheckBox();
		cbC13.setBackground(Color.WHITE);
		cbC13.setText("New JCheckBox");
		cbC13.setBounds(10, 2, 16, 18);
		panel_64.add(cbC13);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(69, 0, 186, 23);
		panel_62.add(panel_65);

		pLabel_18 = new JLabel();
		pLabel_18.setText("TV");
		pLabel_18.setBounds(10, 1, 166, 20);
		panel_65.add(pLabel_18);

		panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 128, 255, 23);
		panel_41.add(panel_66);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 0, 36, 23);
		panel_66.add(panel_67);

		cbP14 = new JCheckBox();
		cbP14.setBackground(Color.WHITE);
		cbP14.setText("New JCheckBox");
		cbP14.setBounds(10, 2, 16, 18);
		panel_67.add(cbP14);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(35, 0, 36, 23);
		panel_66.add(panel_68);

		cbC14 = new JCheckBox();
		cbC14.setBackground(Color.WHITE);
		cbC14.setText("New JCheckBox");
		cbC14.setBounds(10, 2, 16, 18);
		panel_68.add(cbC14);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(69, 0, 186, 23);
		panel_66.add(panel_69);

		pLabel_19 = new JLabel();
		pLabel_19.setText("Movies");
		pLabel_19.setBounds(10, 1, 166, 20);
		panel_69.add(pLabel_19);

		panel_70 = new JPanel();
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(0, 150, 255, 23);
		panel_41.add(panel_70);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(0, 0, 36, 23);
		panel_70.add(panel_71);

		cbP15 = new JCheckBox();
		cbP15.setBackground(Color.WHITE);
		cbP15.setText("New JCheckBox");
		cbP15.setBounds(10, 2, 16, 18);
		panel_71.add(cbP15);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(35, 0, 36, 23);
		panel_70.add(panel_72);

		cbC15 = new JCheckBox();
		cbC15.setBackground(Color.WHITE);
		cbC15.setText("New JCheckBox");
		cbC15.setBounds(10, 2, 16, 18);
		panel_72.add(cbC15);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(69, 0, 186, 23);
		panel_70.add(panel_73);

		pLabel_20 = new JLabel();
		pLabel_20.setText("Gardening / Plants");
		pLabel_20.setBounds(10, 1, 166, 20);
		panel_73.add(pLabel_20);

		panel_74 = new JPanel();
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(0, 172, 255, 23);
		panel_41.add(panel_74);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(0, 0, 36, 23);
		panel_74.add(panel_75);

		cbP16 = new JCheckBox();
		cbP16.setBackground(Color.WHITE);
		cbP16.setText("New JCheckBox");
		cbP16.setBounds(10, 2, 16, 18);
		panel_75.add(cbP16);

		panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(Color.black, 1, false));
		panel_76.setLayout(null);
		panel_76.setBackground(Color.WHITE);
		panel_76.setBounds(35, 0, 36, 23);
		panel_74.add(panel_76);

		cbC16 = new JCheckBox();
		cbC16.setBackground(Color.WHITE);
		cbC16.setText("New JCheckBox");
		cbC16.setBounds(10, 2, 16, 18);
		panel_76.add(cbC16);

		panel_77 = new JPanel();
		panel_77.setBorder(new LineBorder(Color.black, 1, false));
		panel_77.setLayout(null);
		panel_77.setBackground(Color.WHITE);
		panel_77.setBounds(69, 0, 186, 23);
		panel_74.add(panel_77);

		pLabel_21 = new JLabel();
		pLabel_21.setText("Talking / Socializing");
		pLabel_21.setBounds(10, 1, 166, 20);
		panel_77.add(pLabel_21);

		panel_78 = new JPanel();
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(507, 0, 255, 195);
		panel_3.add(panel_78);

		panel_79 = new JPanel();
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 0, 255, 23);
		panel_78.add(panel_79);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(0, 0, 36, 23);
		panel_79.add(panel_80);

		pLabel_22 = new JLabel();
		pLabel_22.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_22.setText("P");
		pLabel_22.setBounds(13, 1, 13, 20);
		panel_80.add(pLabel_22);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(35, 0, 36, 23);
		panel_79.add(panel_81);

		pLabel_23 = new JLabel();
		pLabel_23.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_23.setText("C");
		pLabel_23.setBounds(13, 1, 13, 20);
		panel_81.add(pLabel_23);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(69, 0, 186, 23);
		panel_79.add(panel_82);

		pLabel_24 = new JLabel();
		pLabel_24.setFont(new Font("dialog", Font.BOLD, 12));
		pLabel_24.setText("Pursuit");
		pLabel_24.setBounds(10, 1, 71, 20);
		panel_82.add(pLabel_24);

		panel_83 = new JPanel();
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 22, 255, 23);
		panel_78.add(panel_83);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 0, 36, 23);
		panel_83.add(panel_84);

		cbP17 = new JCheckBox();
		cbP17.setBackground(Color.WHITE);
		cbP17.setText("New JCheckBox");
		cbP17.setBounds(10, 2, 16, 18);
		panel_84.add(cbP17);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(35, 0, 36, 23);
		panel_83.add(panel_85);

		cbC17 = new JCheckBox();
		cbC17.setBackground(Color.WHITE);
		cbC17.setBounds(10, 2, 22, 18);
		panel_85.add(cbC17);

		panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(Color.black, 1, false));
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(69, 0, 186, 23);
		panel_83.add(panel_86);

		pLabel_25 = new JLabel();
		pLabel_25.setText("Puzzles");
		pLabel_25.setBounds(10, 1, 166, 20);
		panel_86.add(pLabel_25);

		panel_87 = new JPanel();
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(0, 43, 255, 23);
		panel_78.add(panel_87);

		panel_88 = new JPanel();
		panel_88.setBorder(new LineBorder(Color.black, 1, false));
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(0, 0, 36, 23);
		panel_87.add(panel_88);

		cbP18 = new JCheckBox();
		cbP18.setBackground(Color.WHITE);
		cbP18.setText("New JCheckBox");
		cbP18.setBounds(10, 2, 16, 18);
		panel_88.add(cbP18);

		panel_89 = new JPanel();
		panel_89.setBorder(new LineBorder(Color.black, 1, false));
		panel_89.setLayout(null);
		panel_89.setBackground(Color.WHITE);
		panel_89.setBounds(35, 0, 36, 23);
		panel_87.add(panel_89);

		cbC18 = new JCheckBox();
		cbC18.setBackground(Color.WHITE);
		cbC18.setText("New JCheckBox");
		cbC18.setBounds(10, 2, 16, 18);
		panel_89.add(cbC18);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(Color.black, 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(69, 0, 186, 23);
		panel_87.add(panel_90);

		pLabel_26 = new JLabel();
		pLabel_26.setText("Animals / Pets");
		pLabel_26.setBounds(10, 1, 166, 20);
		panel_90.add(pLabel_26);

		panel_91 = new JPanel();
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 64, 255, 23);
		panel_78.add(panel_91);

		panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(0, 0, 36, 23);
		panel_91.add(panel_92);

		cbP19 = new JCheckBox();
		cbP19.setBackground(Color.WHITE);
		cbP19.setText("New JCheckBox");
		cbP19.setBounds(10, 2, 16, 18);
		panel_92.add(cbP19);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(35, 0, 36, 23);
		panel_91.add(panel_93);

		cbC19 = new JCheckBox();
		cbC19.setBackground(Color.WHITE);
		cbC19.setText("New JCheckBox");
		cbC19.setBounds(10, 2, 16, 18);
		panel_93.add(cbC19);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(69, 0, 186, 23);
		panel_91.add(panel_94);

		pLabel_27 = new JLabel();
		pLabel_27.setText("Radio");
		pLabel_27.setBounds(10, 1, 166, 20);
		panel_94.add(pLabel_27);

		panel_95 = new JPanel();
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 85, 255, 23);
		panel_78.add(panel_95);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 0, 36, 23);
		panel_95.add(panel_96);

		cbP20 = new JCheckBox();
		cbP20.setBackground(Color.WHITE);
		cbP20.setText("New JCheckBox");
		cbP20.setBounds(10, 2, 16, 18);
		panel_96.add(cbP20);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(35, 0, 36, 23);
		panel_95.add(panel_97);

		cbC20 = new JCheckBox();
		cbC20.setBackground(Color.WHITE);
		cbC20.setText("New JCheckBox");
		cbC20.setBounds(10, 2, 16, 18);
		panel_97.add(cbC20);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(Color.black, 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(69, 0, 186, 23);
		panel_95.add(panel_98);

		pLabel_28 = new JLabel();
		pLabel_28.setText("Cooking");
		pLabel_28.setBounds(10, 1, 166, 20);
		panel_98.add(pLabel_28);

		panel_99 = new JPanel();
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(0, 106, 255, 23);
		panel_78.add(panel_99);

		panel_100 = new JPanel();
		panel_100.setBorder(new LineBorder(Color.black, 1, false));
		panel_100.setLayout(null);
		panel_100.setBackground(Color.WHITE);
		panel_100.setBounds(0, 0, 36, 23);
		panel_99.add(panel_100);

		cbP21 = new JCheckBox();
		cbP21.setBackground(Color.WHITE);
		cbP21.setText("New JCheckBox");
		cbP21.setBounds(10, 2, 16, 18);
		panel_100.add(cbP21);

		panel_101 = new JPanel();
		panel_101.setBorder(new LineBorder(Color.black, 1, false));
		panel_101.setLayout(null);
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(35, 0, 36, 23);
		panel_99.add(panel_101);

		cbC21 = new JCheckBox();
		cbC21.setBackground(Color.WHITE);
		cbC21.setText("New JCheckBox");
		cbC21.setBounds(10, 2, 16, 18);
		panel_101.add(cbC21);

		panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(Color.black, 1, false));
		panel_102.setLayout(null);
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(69, 0, 186, 23);
		panel_99.add(panel_102);

		pLabel_29 = new JLabel();
		pLabel_29.setText("Helping Others");
		pLabel_29.setBounds(10, 1, 166, 20);
		panel_102.add(pLabel_29);

		panel_103 = new JPanel();
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(0, 128, 255, 23);
		panel_78.add(panel_103);

		panel_104 = new JPanel();
		panel_104.setBorder(new LineBorder(Color.black, 1, false));
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(0, 0, 36, 23);
		panel_103.add(panel_104);

		cbP22 = new JCheckBox();
		cbP22.setBackground(Color.WHITE);
		cbP22.setText("New JCheckBox");
		cbP22.setBounds(10, 2, 16, 18);
		panel_104.add(cbP22);

		panel_105 = new JPanel();
		panel_105.setBorder(new LineBorder(Color.black, 1, false));
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(35, 0, 36, 23);
		panel_103.add(panel_105);

		cbC22 = new JCheckBox();
		cbC22.setBackground(Color.WHITE);
		cbC22.setText("New JCheckBox");
		cbC22.setBounds(10, 2, 16, 18);
		panel_105.add(cbC22);

		panel_106 = new JPanel();
		panel_106.setBorder(new LineBorder(Color.black, 1, false));
		panel_106.setLayout(null);
		panel_106.setBackground(Color.WHITE);
		panel_106.setBounds(69, 0, 186, 23);
		panel_103.add(panel_106);

		pLabel_30 = new JLabel();
		pLabel_30.setText("Organizations");
		pLabel_30.setBounds(10, 1, 166, 20);
		panel_106.add(pLabel_30);

		panel_107 = new JPanel();
		panel_107.setLayout(null);
		panel_107.setBackground(Color.WHITE);
		panel_107.setBounds(0, 150, 255, 23);
		panel_78.add(panel_107);

		panel_108 = new JPanel();
		panel_108.setBorder(new LineBorder(Color.black, 1, false));
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(0, 0, 36, 23);
		panel_107.add(panel_108);

		cbP23 = new JCheckBox();
		cbP23.setBackground(Color.WHITE);
		cbP23.setText("New JCheckBox");
		cbP23.setBounds(10, 2, 16, 18);
		panel_108.add(cbP23);

		panel_109 = new JPanel();
		panel_109.setBorder(new LineBorder(Color.black, 1, false));
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(35, 0, 36, 23);
		panel_107.add(panel_109);

		cbC23 = new JCheckBox();
		cbC23.setBackground(Color.WHITE);
		cbC23.setText("New JCheckBox");
		cbC23.setBounds(10, 2, 16, 18);
		panel_109.add(cbC23);

		panel_110 = new JPanel();
		panel_110.setBorder(new LineBorder(Color.black, 1, false));
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(69, 0, 186, 23);
		panel_107.add(panel_110);

		pLabel_31 = new JLabel();
		pLabel_31.setText("Other");
		pLabel_31.setBounds(10, 1, 166, 20);
		panel_110.add(pLabel_31);

		panel_111 = new JPanel();
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(0, 172, 255, 23);
		panel_78.add(panel_111);

		panel_112 = new JPanel();
		panel_112.setBorder(new LineBorder(Color.black, 1, false));
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(0, 0, 36, 23);
		panel_111.add(panel_112);

		cbP24 = new JCheckBox();
		cbP24.setBackground(Color.WHITE);
		cbP24.setText("New JCheckBox");
		cbP24.setBounds(10, 2, 16, 18);
		panel_112.add(cbP24);

		panel_113 = new JPanel();
		panel_113.setBorder(new LineBorder(Color.black, 1, false));
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(35, 0, 36, 23);
		panel_111.add(panel_113);

		cbC24 = new JCheckBox();
		cbC24.setBackground(Color.WHITE);
		cbC24.setText("New JCheckBox");
		cbC24.setBounds(10, 2, 16, 18);
		panel_113.add(cbC24);

		panel_114 = new JPanel();
		panel_114.setBorder(new LineBorder(Color.black, 1, false));
		panel_114.setLayout(null);
		panel_114.setBackground(Color.WHITE);
		panel_114.setBounds(69, 0, 186, 23);
		panel_111.add(panel_114);

		pLabel_32 = new JLabel();
		pLabel_32.setText("Other");
		pLabel_32.setBounds(10, 1, 166, 20);
		panel_114.add(pLabel_32);

		panel_115 = new JPanel();
		panel_115.setLayout(null);
		panel_115.setBackground(Color.WHITE);
		panel_115.setBounds(20, 610, 767, 190);
		add(panel_115);

		pLabel_33 = new JLabel();
		pLabel_33.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_33.setText(" Prefers");
		pLabel_33.setBounds(0, 0, 767, 20);
		panel_115.add(pLabel_33);

		rbPrefersLargeGroup = new JRadioButton();
		rbPrefersLargeGroup.setActionCommand("1");
		bgPrefers.add(rbPrefersLargeGroup);
		rbPrefersLargeGroup.setBackground(Color.WHITE);
		rbPrefersLargeGroup.setText("Large Group");
		rbPrefersLargeGroup.setBounds(100, 1, 106, 18);
		panel_115.add(rbPrefersLargeGroup);

		rbPrefersSmallGroup = new JRadioButton();
		rbPrefersSmallGroup.setActionCommand("2");
		bgPrefers.add(rbPrefersSmallGroup);
		rbPrefersSmallGroup.setBackground(Color.WHITE);
		rbPrefersSmallGroup.setText("Small Group");
		rbPrefersSmallGroup.setBounds(212, 0, 106, 18);
		panel_115.add(rbPrefersSmallGroup);

		rbPrefers11 = new JRadioButton();
		rbPrefers11.setActionCommand("3");
		bgPrefers.add(rbPrefers11);
		rbPrefers11.setBackground(Color.WHITE);
		rbPrefers11.setText("1:1");
		rbPrefers11.setBounds(327, 0, 106, 18);
		panel_115.add(rbPrefers11);

		rbPrefersIndependent = new JRadioButton();
		rbPrefersIndependent.setActionCommand("4");
		bgPrefers.add(rbPrefersIndependent);
		rbPrefersIndependent.setBackground(Color.WHITE);
		rbPrefersIndependent.setText("Independent");
		rbPrefersIndependent.setBounds(439, 0, 106, 18);
		panel_115.add(rbPrefersIndependent);

		pLabel_34 = new JLabel();
		pLabel_34.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_34.setText(" Preferred Activity Settings ");
		pLabel_34.setBounds(0, 30, 767, 32);
		panel_115.add(pLabel_34);

		pLabel_35 = new JLabel();
		pLabel_35.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_35.setText(" Wishes to Recieve Newspaper?");
		pLabel_35.setBounds(0, 70, 767, 20);
		panel_115.add(pLabel_35);

		rbActivitySettingOwnRoom = new JRadioButton();
		rbActivitySettingOwnRoom.setActionCommand("1");
		bgPrefferedActivity.add(rbActivitySettingOwnRoom);
		rbActivitySettingOwnRoom.setBackground(Color.WHITE);
		rbActivitySettingOwnRoom.setText("Own Room");
		rbActivitySettingOwnRoom.setBounds(212, 29, 106, 18);
		panel_115.add(rbActivitySettingOwnRoom);

		rbActivitySettingsDayRoom = new JRadioButton();
		rbActivitySettingsDayRoom.setActionCommand("2");
		bgPrefferedActivity.add(rbActivitySettingsDayRoom);
		rbActivitySettingsDayRoom.setBackground(Color.WHITE);
		rbActivitySettingsDayRoom.setText("Day Room");
		rbActivitySettingsDayRoom.setBounds(327, 29, 106, 18);
		panel_115.add(rbActivitySettingsDayRoom);

		rbActivitySettingsOutdoors = new JRadioButton();
		rbActivitySettingsOutdoors.setActionCommand("3");
		bgPrefferedActivity.add(rbActivitySettingsOutdoors);
		rbActivitySettingsOutdoors.setBackground(Color.WHITE);
		rbActivitySettingsOutdoors.setText("Outdoors");
		rbActivitySettingsOutdoors.setBounds(440, 29, 106, 18);
		panel_115.add(rbActivitySettingsOutdoors);

		rbActivitySettingsOfUnit = new JRadioButton();
		rbActivitySettingsOfUnit.setActionCommand("4");
		bgPrefferedActivity.add(rbActivitySettingsOfUnit);
		rbActivitySettingsOfUnit.setBackground(Color.WHITE);
		rbActivitySettingsOfUnit.setText("Of Unit");
		rbActivitySettingsOfUnit.setBounds(212, 48, 106, 18);
		panel_115.add(rbActivitySettingsOfUnit);

		rbActivitySettingsOutsidefacility = new JRadioButton();
		rbActivitySettingsOutsidefacility.setActionCommand("5");
		bgPrefferedActivity.add(rbActivitySettingsOutsidefacility);
		rbActivitySettingsOutsidefacility.setBackground(Color.WHITE);
		rbActivitySettingsOutsidefacility.setText("Outside the Facility");
		rbActivitySettingsOutsidefacility.setBounds(327, 48, 150, 18);
		panel_115.add(rbActivitySettingsOutsidefacility);

		rbNewspaperDaily = new JRadioButton();
		bgWishesNewspaper.add(rbNewspaperDaily);
		rbNewspaperDaily.setActionCommand("1");
		rbNewspaperDaily.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbNewspaperDaily.setBackground(Color.WHITE);
		rbNewspaperDaily.setText("Daily");
		rbNewspaperDaily.setBounds(212, 70, 106, 18);
		panel_115.add(rbNewspaperDaily);

		rbNewspaperSunday = new JRadioButton();
		bgWishesNewspaper.add(rbNewspaperSunday);
		rbNewspaperSunday.setActionCommand("2");
		rbNewspaperSunday.setBackground(Color.WHITE);
		rbNewspaperSunday.setText("Sunday");
		rbNewspaperSunday.setBounds(327, 70, 106, 18);
		panel_115.add(rbNewspaperSunday);

		rbNewspaperNotAtAll = new JRadioButton();
		bgWishesNewspaper.add(rbNewspaperNotAtAll);
		rbNewspaperNotAtAll.setActionCommand("3");
		rbNewspaperNotAtAll.setBackground(Color.WHITE);
		rbNewspaperNotAtAll.setText("Not At All");
		rbNewspaperNotAtAll.setBounds(440, 70, 106, 18);
		panel_115.add(rbNewspaperNotAtAll);

		pLabel_36 = new JLabel();
		pLabel_36.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_36.setText(" Candidate for 1:1");
		pLabel_36.setBounds(0, 105, 767, 20);
		panel_115.add(pLabel_36);

		rbCandidateYes = new JRadioButton();
		bgCandidate11.add(rbCandidateYes);
		rbCandidateYes.setActionCommand("1");
		rbCandidateYes.setBackground(Color.WHITE);
		rbCandidateYes.setText("Yes");
		rbCandidateYes.setBounds(212, 105, 106, 18);
		panel_115.add(rbCandidateYes);

		rbCandidateNo = new JRadioButton();
		bgCandidate11.add(rbCandidateNo);
		rbCandidateNo.setActionCommand("2");
		rbCandidateNo.setBackground(Color.WHITE);
		rbCandidateNo.setText("No");
		rbCandidateNo.setBounds(327, 105, 106, 18);
		panel_115.add(rbCandidateNo);

		shortTermLabel_4 = new JLabel();
		shortTermLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_4.setText("Frequency / Duration");
		shortTermLabel_4.setBounds(439, 105, 122, 17);
		panel_115.add(shortTermLabel_4);

		txtFrequency = new JTextField();
		txtFrequency.setBounds(580, 105, 175, 20);
		panel_115.add(txtFrequency);

		pLabel_37 = new JLabel();
		pLabel_37.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_37.setText(" Naps :");
		pLabel_37.setBounds(0, 135, 767, 20);
		panel_115.add(pLabel_37);

		rbNapsDesired = new JRadioButton();
		bgNaps.add(rbNapsDesired);
		rbNapsDesired.setActionCommand("1");
		rbNapsDesired.setBackground(Color.WHITE);
		rbNapsDesired.setText("As Desired");
		rbNapsDesired.setBounds(100, 135, 106, 18);
		panel_115.add(rbNapsDesired);

		rbNapsMornings = new JRadioButton();
		bgNaps.add(rbNapsMornings);
		rbNapsMornings.setActionCommand("2");
		rbNapsMornings.setBackground(Color.WHITE);
		rbNapsMornings.setText("Mornings");
		rbNapsMornings.setBounds(212, 135, 106, 18);
		panel_115.add(rbNapsMornings);

		rbNapsAfternoons = new JRadioButton();
		bgNaps.add(rbNapsAfternoons);
		rbNapsAfternoons.setActionCommand("3");
		rbNapsAfternoons.setBackground(Color.WHITE);
		rbNapsAfternoons.setText("Afternoons");
		rbNapsAfternoons.setBounds(327, 135, 106, 18);
		panel_115.add(rbNapsAfternoons);

		rbNapsEvenings = new JRadioButton();
		bgNaps.add(rbNapsEvenings);
		rbNapsEvenings.setActionCommand("4");
		rbNapsEvenings.setBackground(Color.WHITE);
		rbNapsEvenings.setText("Evenings");
		rbNapsEvenings.setBounds(439, 135, 106, 18);
		panel_115.add(rbNapsEvenings);

		pLabel_38 = new JLabel();
		pLabel_38.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_38.setText(" Reagularly Naps for More than an Hour");
		pLabel_38.setBounds(0, 165, 767, 20);
		panel_115.add(pLabel_38);

		rbRegularlyNapsYes = new JRadioButton();
		bgRegularlyNaps.add(rbRegularlyNapsYes);
		rbRegularlyNapsYes.setActionCommand("1");
		rbRegularlyNapsYes.setBackground(Color.WHITE);
		rbRegularlyNapsYes.setText("Yes");
		rbRegularlyNapsYes.setBounds(327, 165, 49, 18);
		panel_115.add(rbRegularlyNapsYes);

		rbRegularlyNapsNO = new JRadioButton();
		bgRegularlyNaps.add(rbRegularlyNapsNO);
		rbRegularlyNapsNO.setActionCommand("2");
		rbRegularlyNapsNO.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbRegularlyNapsNO.setBackground(Color.WHITE);
		rbRegularlyNapsNO.setText("No");
		rbRegularlyNapsNO.setBounds(439, 165, 106, 18);
		panel_115.add(rbRegularlyNapsNO);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(20, 820, 767, 165);
		add(panel_6);

		shortTermLabel_5 = new JLabel();
		shortTermLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
		shortTermLabel_5.setText(" Physical Status");
		shortTermLabel_5.setBounds(0, 0, 127, 17);
		panel_6.add(shortTermLabel_5);

		panel_116 = new JPanel();
		panel_116.setBounds(10, 23, 747, 45);
		panel_6.add(panel_116);
		panel_116.setBackground(Color.WHITE);
		panel_116.setLayout(null);

		shortTermLabel_6 = new JLabel();
		shortTermLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		shortTermLabel_6.setText(" Vision");
		shortTermLabel_6.setBounds(0, 0, 55, 20);
		panel_116.add(shortTermLabel_6);

		shortTermLabel_7 = new JLabel();
		shortTermLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_7.setText("Right Eye :");
		shortTermLabel_7.setBounds(90, 0, 79, 20);
		panel_116.add(shortTermLabel_7);

		rbVisionRightAdequate = new JRadioButton();
		bgVisionRight.add(rbVisionRightAdequate);
		rbVisionRightAdequate.setActionCommand("1");
		rbVisionRightAdequate.setBackground(Color.WHITE);
		rbVisionRightAdequate.setText("Adequate");
		rbVisionRightAdequate.setBounds(163, 2, 106, 18);
		panel_116.add(rbVisionRightAdequate);

		rbVisionRightGlasses = new JRadioButton();
		bgVisionRight.add(rbVisionRightGlasses);
		rbVisionRightGlasses.setActionCommand("2");
		rbVisionRightGlasses.setBackground(Color.WHITE);
		rbVisionRightGlasses.setText("Adequate with Glasses");
		rbVisionRightGlasses.setBounds(275, 1, 147, 18);
		panel_116.add(rbVisionRightGlasses);

		rbVisionRightPoor = new JRadioButton();
		bgVisionRight.add(rbVisionRightPoor);
		rbVisionRightPoor.setActionCommand("3");
		rbVisionRightPoor.setBackground(Color.WHITE);
		rbVisionRightPoor.setText("Poor");
		rbVisionRightPoor.setBounds(450, 0, 106, 18);
		panel_116.add(rbVisionRightPoor);

		rbVisionRightBlind = new JRadioButton();
		bgVisionRight.add(rbVisionRightBlind);
		rbVisionRightBlind.setActionCommand("4");
		rbVisionRightBlind.setBackground(Color.WHITE);
		rbVisionRightBlind.setText("Blind");
		rbVisionRightBlind.setBounds(562, 0, 106, 18);
		panel_116.add(rbVisionRightBlind);

		rbVisionLeftAdequate = new JRadioButton();
		bgVisionLeft.add(rbVisionLeftAdequate);
		rbVisionLeftAdequate.setActionCommand("1");
		rbVisionLeftAdequate.setBackground(Color.WHITE);
		rbVisionLeftAdequate.setText("Adequate");
		rbVisionLeftAdequate.setBounds(163, 25, 106, 18);
		panel_116.add(rbVisionLeftAdequate);

		rbVisionLeftGlasses = new JRadioButton();
		bgVisionLeft.add(rbVisionLeftGlasses);
		rbVisionLeftGlasses.setActionCommand("2");
		rbVisionLeftGlasses.setBackground(Color.WHITE);
		rbVisionLeftGlasses.setText("Adequate with Glass");
		rbVisionLeftGlasses.setBounds(275, 24, 147, 18);
		panel_116.add(rbVisionLeftGlasses);

		rbVisionLeftPoor = new JRadioButton();
		bgVisionLeft.add(rbVisionLeftPoor);
		rbVisionLeftPoor.setActionCommand("3");
		rbVisionLeftPoor.setBackground(Color.WHITE);
		rbVisionLeftPoor.setText("Poor");
		rbVisionLeftPoor.setBounds(450, 23, 106, 18);
		panel_116.add(rbVisionLeftPoor);

		rbVisionLeftBlind = new JRadioButton();
		bgVisionLeft.add(rbVisionLeftBlind);
		rbVisionLeftBlind.setActionCommand("4");
		rbVisionLeftBlind.setBackground(Color.WHITE);
		rbVisionLeftBlind.setText("Blind");
		rbVisionLeftBlind.setBounds(562, 23, 106, 18);
		panel_116.add(rbVisionLeftBlind);

		shortTermLabel_8 = new JLabel();
		shortTermLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_8.setText("Left Eye :");
		shortTermLabel_8.setBounds(90, 23, 79, 20);
		panel_116.add(shortTermLabel_8);

		panel_118 = new JPanel();
		panel_118.setLayout(null);
		panel_118.setBackground(Color.WHITE);
		panel_118.setBounds(10, 69, 747, 45);
		panel_6.add(panel_118);

		shortTermLabel_9 = new JLabel();
		shortTermLabel_9.setFont(new Font("Arial", Font.PLAIN, 14));
		shortTermLabel_9.setText(" Hearing");
		shortTermLabel_9.setBounds(0, 0, 55, 20);
		panel_118.add(shortTermLabel_9);

		shortTermLabel_10 = new JLabel();
		shortTermLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_10.setText("Right Ear :");
		shortTermLabel_10.setBounds(90, 0, 79, 20);
		panel_118.add(shortTermLabel_10);

		rbHearingRightAdequate = new JRadioButton();
		bgHearingRight.add(rbHearingRightAdequate);
		rbHearingRightAdequate.setActionCommand("1");
		rbHearingRightAdequate.setBackground(Color.WHITE);
		rbHearingRightAdequate.setText("Adequate");
		rbHearingRightAdequate.setBounds(163, 2, 76, 18);
		panel_118.add(rbHearingRightAdequate);

		rbHearingRightPoor = new JRadioButton();
		bgHearingRight.add(rbHearingRightPoor);
		rbHearingRightPoor.setActionCommand("2");
		rbHearingRightPoor.setBackground(Color.WHITE);
		rbHearingRightPoor.setText("Poor");
		rbHearingRightPoor.setBounds(250, 2, 47, 18);
		panel_118.add(rbHearingRightPoor);

		rbRightHearingAidYes = new JRadioButton();
		rbRightHearingAidYes.setActionCommand("4");
		bgHearingRight.add(rbRightHearingAidYes);
		rbRightHearingAidYes.setBackground(Color.WHITE);
		rbRightHearingAidYes.setText("Yes");
		rbRightHearingAidYes.setBounds(562, 2, 47, 18);
		panel_118.add(rbRightHearingAidYes);

		rbRightHearingAidNo = new JRadioButton();
		bgHearingRight.add(rbRightHearingAidNo);
		rbRightHearingAidNo.setBackground(Color.WHITE);
		rbRightHearingAidNo.setText("No");
		rbRightHearingAidNo.setBounds(620, 2, 106, 18);
		panel_118.add(rbRightHearingAidNo);

		rbHearingLeftAdequate = new JRadioButton();
		bgHearingLeft.add(rbHearingLeftAdequate);
		rbHearingLeftAdequate.setActionCommand("1");
		rbHearingLeftAdequate.setBackground(Color.WHITE);
		rbHearingLeftAdequate.setText("Adequate");
		rbHearingLeftAdequate.setBounds(163, 25, 79, 18);
		panel_118.add(rbHearingLeftAdequate);

		rbHearingLeftPoor = new JRadioButton();
		bgHearingLeft.add(rbHearingLeftPoor);
		rbHearingLeftPoor.setActionCommand("2");
		rbHearingLeftPoor.setBackground(Color.WHITE);
		rbHearingLeftPoor.setText("Poor");
		rbHearingLeftPoor.setBounds(250, 25, 47, 18);
		panel_118.add(rbHearingLeftPoor);

		rbLeftHearingAidYes = new JRadioButton();
		rbLeftHearingAidYes.setActionCommand("4");
		bgHearingLeft.add(rbLeftHearingAidYes);
		rbLeftHearingAidYes.setBackground(Color.WHITE);
		rbLeftHearingAidYes.setText("Yes");
		rbLeftHearingAidYes.setBounds(562, 25, 55, 18);
		panel_118.add(rbLeftHearingAidYes);

		rbLeftHearingAidNo = new JRadioButton();
		bgHearingLeft.add(rbLeftHearingAidNo);
		rbLeftHearingAidNo.setBackground(Color.WHITE);
		rbLeftHearingAidNo.setText("No");
		rbLeftHearingAidNo.setBounds(620, 25, 106, 18);
		panel_118.add(rbLeftHearingAidNo);

		shortTermLabel_11 = new JLabel();
		shortTermLabel_11.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_11.setText("Left Ear :");
		shortTermLabel_11.setBounds(90, 23, 79, 20);
		panel_118.add(shortTermLabel_11);

		shortTermLabel_12 = new JLabel();
		shortTermLabel_12.setFont(new Font("Arial", Font.PLAIN, 14));
		shortTermLabel_12.setText("Uses Hearing Aid");
		shortTermLabel_12.setBounds(392, 2, 117, 20);
		panel_118.add(shortTermLabel_12);

		shortTermLabel_13 = new JLabel();
		shortTermLabel_13.setFont(new Font("Arial", Font.PLAIN, 14));
		shortTermLabel_13.setText("Uses Hearing Aid");
		shortTermLabel_13.setBounds(392, 25, 117, 20);
		panel_118.add(shortTermLabel_13);

		rbHearingRightDeaf = new JRadioButton();
		bgHearingRight.add(rbHearingRightDeaf);
		rbHearingRightDeaf.setActionCommand("3");
		rbHearingRightDeaf.setBackground(Color.WHITE);
		rbHearingRightDeaf.setText("Deaf");
		rbHearingRightDeaf.setBounds(310, 2, 55, 18);
		panel_118.add(rbHearingRightDeaf);

		rbHearingLeftDeaf = new JRadioButton();
		bgHearingLeft.add(rbHearingLeftDeaf);
		rbHearingLeftDeaf.setActionCommand("3");
		rbHearingLeftDeaf.setBackground(Color.WHITE);
		rbHearingLeftDeaf.setText("Deaf");
		rbHearingLeftDeaf.setBounds(310, 25, 55, 18);
		panel_118.add(rbHearingLeftDeaf);

		panel_119 = new JPanel();
		panel_119.setLayout(null);
		panel_119.setBackground(Color.WHITE);
		panel_119.setBounds(10, 115, 747, 45);
		panel_6.add(panel_119);

		shortTermLabel_14 = new JLabel();
		shortTermLabel_14.setFont(new Font("Arial", Font.PLAIN, 14));
		shortTermLabel_14.setText("Extremities");
		shortTermLabel_14.setBounds(0, 0, 84, 20);
		panel_119.add(shortTermLabel_14);

		shortTermLabel_15 = new JLabel();
		shortTermLabel_15.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_15.setText("LUE:");
		shortTermLabel_15.setBounds(90, 0, 36, 20);
		panel_119.add(shortTermLabel_15);

		rbLUEFull = new JRadioButton();
		bgExtremitiesLUE.add(rbLUEFull);
		rbLUEFull.setActionCommand("1");
		rbLUEFull.setBackground(Color.WHITE);
		rbLUEFull.setText("Full");
		rbLUEFull.setBounds(163, 0, 55, 18);
		panel_119.add(rbLUEFull);

		rbLUEPartial = new JRadioButton();
		bgExtremitiesLUE.add(rbLUEPartial);
		rbLUEPartial.setActionCommand("2");
		rbLUEPartial.setBackground(Color.WHITE);
		rbLUEPartial.setText("Partial");
		rbLUEPartial.setBounds(230, 0, 55, 18);
		panel_119.add(rbLUEPartial);

		rbRUEFull = new JRadioButton();
		bgExtremitiesRUE.add(rbRUEFull);
		rbRUEFull.setActionCommand("1");
		rbRUEFull.setBackground(Color.WHITE);
		rbRUEFull.setText("Full");
		rbRUEFull.setBounds(475, 2, 47, 18);
		panel_119.add(rbRUEFull);

		rbRUEPartial = new JRadioButton();
		bgExtremitiesRUE.add(rbRUEPartial);
		rbRUEPartial.setActionCommand("2");
		rbRUEPartial.setBackground(Color.WHITE);
		rbRUEPartial.setText("Partial");
		rbRUEPartial.setBounds(532, 0, 55, 18);
		panel_119.add(rbRUEPartial);

		rbExLLEFull = new JRadioButton();
		bgExtremitiesLLE.add(rbExLLEFull);
		rbExLLEFull.setActionCommand("1");
		rbExLLEFull.setBackground(Color.WHITE);
		rbExLLEFull.setText("Full");
		rbExLLEFull.setBounds(163, 25, 55, 18);
		panel_119.add(rbExLLEFull);

		rbExLLEPartial = new JRadioButton();
		bgExtremitiesLLE.add(rbExLLEPartial);
		rbExLLEPartial.setActionCommand("2");
		rbExLLEPartial.setBackground(Color.WHITE);
		rbExLLEPartial.setText("Partial");
		rbExLLEPartial.setBounds(230, 25, 55, 18);
		panel_119.add(rbExLLEPartial);

		rbRLEFull = new JRadioButton();
		bgExtremetiesRLE.add(rbRLEFull);
		rbRLEFull.setActionCommand("1");
		rbRLEFull.setBackground(Color.WHITE);
		rbRLEFull.setText("Full");
		rbRLEFull.setBounds(475, 25, 55, 18);
		panel_119.add(rbRLEFull);

		rbRLEPartial = new JRadioButton();
		bgExtremetiesRLE.add(rbRLEPartial);
		rbRLEPartial.setActionCommand("2");
		rbRLEPartial.setBackground(Color.WHITE);
		rbRLEPartial.setText("Partail");
		rbRLEPartial.setBounds(532, 25, 55, 18);
		panel_119.add(rbRLEPartial);

		shortTermLabel_16 = new JLabel();
		shortTermLabel_16.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_16.setText("LLE");
		shortTermLabel_16.setBounds(90, 23, 79, 20);
		panel_119.add(shortTermLabel_16);

		shortTermLabel_17 = new JLabel();
		shortTermLabel_17.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_17.setText("RUE:");
		shortTermLabel_17.setBounds(410, 2, 47, 20);
		panel_119.add(shortTermLabel_17);

		shortTermLabel_18 = new JLabel();
		shortTermLabel_18.setFont(new Font("Arial", Font.PLAIN, 12));
		shortTermLabel_18.setText("RLE:");
		shortTermLabel_18.setBounds(410, 25, 47, 20);
		panel_119.add(shortTermLabel_18);

		rbLUENone = new JRadioButton();
		bgExtremitiesLUE.add(rbLUENone);
		rbLUENone.setActionCommand("3");
		rbLUENone.setBackground(Color.WHITE);
		rbLUENone.setText("None");
		rbLUENone.setBounds(310, 2, 55, 18);
		panel_119.add(rbLUENone);

		rbExLLENone = new JRadioButton();
		bgExtremitiesLLE.add(rbExLLENone);
		rbExLLENone.setActionCommand("3");
		rbExLLENone.setBackground(Color.WHITE);
		rbExLLENone.setText("None");
		rbExLLENone.setBounds(310, 25, 55, 18);
		panel_119.add(rbExLLENone);

		rbRLENone = new JRadioButton();
		bgExtremetiesRLE.add(rbRLENone);
		rbRLENone.setActionCommand("3");
		rbRLENone.setBackground(Color.WHITE);
		rbRLENone.setText("None");
		rbRLENone.setBounds(605, 25, 55, 18);
		panel_119.add(rbRLENone);

		rbRUENone = new JRadioButton();
		bgExtremitiesRUE.add(rbRUENone);
		rbRUENone.setActionCommand("3");
		rbRUENone.setBackground(Color.WHITE);
		rbRUENone.setText("None");
		rbRUENone.setBounds(605, 2, 106, 18);
		panel_119.add(rbRUENone);

		panel_120 = new JPanel();
		panel_120.setLayout(null);
		panel_120.setBackground(Color.WHITE);
		panel_120.setBounds(20, 1000, 767, 72);
		add(panel_120);

		shortTermLabel_19 = new JLabel();
		shortTermLabel_19.setFont(new Font("Arial", Font.BOLD, 14));
		shortTermLabel_19.setText("Ambulations :");
		shortTermLabel_19.setBounds(0, 0, 127, 17);
		panel_120.add(shortTermLabel_19);

		panel_121 = new JPanel();
		panel_121.setLayout(null);
		panel_121.setBackground(Color.WHITE);
		panel_121.setBounds(10, 23, 747, 45);
		panel_120.add(panel_121);

		rbAmbGerichair = new JRadioButton();
		bgAmbulations.add(rbAmbGerichair);
		rbAmbGerichair.setActionCommand("1");
		rbAmbGerichair.setBackground(Color.WHITE);
		rbAmbGerichair.setText("Gerichair");
		rbAmbGerichair.setBounds(55, 2, 89, 18);
		panel_121.add(rbAmbGerichair);

		rbAmbWheelchair = new JRadioButton();
		bgAmbulations.add(rbAmbWheelchair);
		rbAmbWheelchair.setActionCommand("2");
		rbAmbWheelchair.setBackground(Color.WHITE);
		rbAmbWheelchair.setText("Wheelchair");
		rbAmbWheelchair.setBounds(170, 2, 89, 18);
		panel_121.add(rbAmbWheelchair);

		rbAmbWalker = new JRadioButton();
		bgAmbulations.add(rbAmbWalker);
		rbAmbWalker.setActionCommand("3");
		rbAmbWalker.setBackground(Color.WHITE);
		rbAmbWalker.setText("Walker");
		rbAmbWalker.setBounds(285, 2, 106, 18);
		panel_121.add(rbAmbWalker);

		rbAmbCane = new JRadioButton();
		bgAmbulations.add(rbAmbCane);
		rbAmbCane.setActionCommand("4");
		rbAmbCane.setBackground(Color.WHITE);
		rbAmbCane.setText("Cane");
		rbAmbCane.setBounds(400, 2, 61, 18);
		panel_121.add(rbAmbCane);

		rbAmbAssistance = new JRadioButton();
		bgAmbulations.add(rbAmbAssistance);
		rbAmbAssistance.setActionCommand("7");
		rbAmbAssistance.setBackground(Color.WHITE);
		rbAmbAssistance.setText("Assistance");
		rbAmbAssistance.setBounds(170, 20, 89, 18);
		panel_121.add(rbAmbAssistance);

		rbAmbStandBy = new JRadioButton();
		bgAmbulations.add(rbAmbStandBy);
		rbAmbStandBy.setActionCommand("8");
		rbAmbStandBy.setBackground(Color.WHITE);
		rbAmbStandBy.setText("Stand By");
		rbAmbStandBy.setBounds(285, 20, 89, 18);
		panel_121.add(rbAmbStandBy);

		rbAmbContactGuard = new JRadioButton();
		bgAmbulations.add(rbAmbContactGuard);
		rbAmbContactGuard.setActionCommand("9");
		rbAmbContactGuard.setBackground(Color.WHITE);
		rbAmbContactGuard.setText("Contact Guard");
		rbAmbContactGuard.setBounds(400, 20, 106, 18);
		panel_121.add(rbAmbContactGuard);

		rbAmbNonAmbulatory = new JRadioButton();
		bgAmbulations.add(rbAmbNonAmbulatory);
		rbAmbNonAmbulatory.setActionCommand("10");
		rbAmbNonAmbulatory.setBackground(Color.WHITE);
		rbAmbNonAmbulatory.setText("Non-Ambulatory");
		rbAmbNonAmbulatory.setBounds(515, 20, 129, 18);
		panel_121.add(rbAmbNonAmbulatory);

		rbAmbIndependent = new JRadioButton();
		bgAmbulations.add(rbAmbIndependent);
		rbAmbIndependent.setActionCommand("6");
		rbAmbIndependent.setBackground(Color.WHITE);
		rbAmbIndependent.setText("Independent");
		rbAmbIndependent.setBounds(55, 20, 106, 18);
		panel_121.add(rbAmbIndependent);

		rbAmbOther = new JRadioButton();
		bgAmbulations.add(rbAmbOther);
		rbAmbOther.setActionCommand("5");
		rbAmbOther.setBackground(Color.WHITE);
		rbAmbOther.setText("Other");
		rbAmbOther.setBounds(515, 2, 61, 18);
		panel_121.add(rbAmbOther);

		panel_117 = new JPanel();
		panel_117.setBackground(Color.WHITE);
		panel_117.setLayout(null);
		panel_117.setBounds(20, 360, 767, 30);
		add(panel_117);

		recreationalPursuitPatternsLabel = new JLabel();
		recreationalPursuitPatternsLabel.setFont(new Font("", Font.BOLD, 14));
		recreationalPursuitPatternsLabel
				.setText("Recreational Pursuit Patterns");
		recreationalPursuitPatternsLabel.setBounds(10, 2, 218, 25);
		panel_117.add(recreationalPursuitPatternsLabel);

		pastPLabel = new JLabel();
		pastPLabel.setBackground(Color.WHITE);
		pastPLabel.setFont(new Font("", Font.PLAIN, 14));
		pastPLabel.setText("Past = P");
		pastPLabel.setBounds(324, 2, 67, 25);
		panel_117.add(pastPLabel);

		pastPLabel_1 = new JLabel();
		pastPLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		pastPLabel_1.setBackground(Color.WHITE);
		pastPLabel_1.setText("Current = C");
		pastPLabel_1.setBounds(496, 2, 98, 25);
		panel_117.add(pastPLabel_1);

		doLoad();
		updateDiagnosis();
	}

	public void doLoad() {
		doUpdate();
	}

	public void doUpdate() {
		if (Global.currentActivitysInitAssmntKey == 0) {
			if (Global.currentResidenceKey != 0) {
				ResidentMain rm = null;
				try {
					rm = MedrexClientManager.getInstance().getResident(
							Global.currentResidenceKey);
					txtName.setText(rm.getUserName() + " " + rm.getUserPass());
					txtBirthplace.setText(rm.getBirthPlace());
					dcBirthdate.setDate(rm.getDob());
					txtMaritalStatus.setText(rm.getMaritalStatus().toString());
					txtLanguage.setText(rm.getLanguage() + "");
					if (rm.getCurrentAdmitDate() != null) {
						dcAdmissionDate.setDate(rm.getCurrentAdmitDate());
					}
					txtReligion.setText(rm.getReligion().toString());

				} catch (Exception e) {

				}
				List rc = null;
				try {
					rc = MedrexClientManager.getInstance().getResidentContacts(
							Global.currentResidenceKey);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// System.out.println("ArrayList :" + rc.size());
				if (rc.size() > 1) {
					ResidentContact rr = (ResidentContact) rc.get(0);

					txtResponsibleParty.setText(rr.getFirstName() + ", "
							+ rr.getLastName());
					txtRelationship.setText(rr.getRelationship().toString());
				}
				CensusStatus refCensusStatus = null;
				try {
					refCensusStatus = MedrexClientManager.getInstance()
							.getCensusLastAdmission(Global.currentResidenceKey);
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				// SimpleDateFormat df=new SimpleDateFormat();
				// df.applyPattern("MM / dd / yyyy");
				if (refCensusStatus != null) {
					dcAdmissionDate.setDate(refCensusStatus.getTimestamp());
				}

				try {
					rafp1 = MedrexClientManager.getInstance()
							.getLatestResidentAssessmentFormPage1(
									Global.currentResidenceKey);
				} catch (Exception e) {
				}
				if (rafp1 != null) {
					txtAllergies.setText(rafp1.getAllergies());
					updateHearingAndVision();// method to prepopulate hearing
					// and vision from
					// ResidentAssessmentformPage1
				}
				txtVoteSpecify.setEnabled(false);
				// SwingUtils.setSelectedButton(bgVote, 0);
				// SwingUtils.setSelectedButton(bgTerm, 0);
				// SwingUtils.setSelectedButton(bgVeteran, 0);
				// SwingUtils.setSelectedButton(bgPrefers, 0);
				// SwingUtils.setSelectedButton(bgPrefferedActivity, 0);
				// SwingUtils.setSelectedButton(bgWishesNewspaper, 0);
				// SwingUtils.setSelectedButton(bgCandidate11, 0);
				// SwingUtils.setSelectedButton(bgNaps, 0);
				// SwingUtils.setSelectedButton(bgRegularlyNaps, 0);
				// SwingUtils.setSelectedButton(bgVisionRight, 0);
				// SwingUtils.setSelectedButton(bgVisionLeft, 0);
				// SwingUtils.setSelectedButton(bgHearingLeft, 0);
				// SwingUtils.setSelectedButton(bgHearingRight, 0);
				// SwingUtils.setSelectedButton(bgExtremetiesRLE, 0);
				// SwingUtils.setSelectedButton(bgExtremitiesLLE, 0);
				// SwingUtils.setSelectedButton(bgExtremitiesLUE, 0);
				// SwingUtils.setSelectedButton(bgExtremitiesRUE, 0);
				// SwingUtils.setSelectedButton(bgAmbulations, 0);
				//
				// cbP1.setSelected(false);
				// cbP2.setSelected(false);
				// cbP3.setSelected(false);
				// cbP4.setSelected(false);
				// cbP5.setSelected(false);
				// cbP6.setSelected(false);
				// cbP7.setSelected(false);
				// cbP8.setSelected(false);
				// cbP9.setSelected(false);
				// cbP10.setSelected(false);
				// cbP11.setSelected(false);
				// cbP12.setSelected(false);
				// cbP13.setSelected(false);
				// cbP14.setSelected(false);
				// cbP15.setSelected(false);
				// cbP16.setSelected(false);
				// cbP17.setSelected(false);
				// cbP18.setSelected(false);
				// cbP19.setSelected(false);
				// cbP20.setSelected(false);
				// cbP21.setSelected(false);
				// cbP22.setSelected(false);
				// cbP23.setSelected(false);
				// cbP24.setSelected(false);
				//
				// cbC1.setSelected(false);
				// cbC2.setSelected(false);
				// cbC3.setSelected(false);
				// cbC4.setSelected(false);
				// cbC5.setSelected(false);
				// cbC6.setSelected(false);
				// cbC7.setSelected(false);
				// cbC8.setSelected(false);
				// cbC9.setSelected(false);
				// cbC10.setSelected(false);
				// cbC11.setSelected(false);
				// cbC12.setSelected(false);
				// cbC13.setSelected(false);
				// cbC14.setSelected(false);
				// cbC15.setSelected(false);
				// cbC16.setSelected(false);
				// cbC17.setSelected(false);
				// cbC18.setSelected(false);
				// cbC19.setSelected(false);
				// cbC20.setSelected(false);
				// cbC21.setSelected(false);
				// cbC22.setSelected(false);
				// cbC23.setSelected(false);
				// cbC24.setSelected(false);
			}
		} else {
			if (Global.currentResidenceKey != 0) {
				ActivityInitialAssessmentFormPage1 aiafP1 = null;
				try {
					aiafP1 = MedrexClientManager.getInstance()
							.getActivityInitialAssessmentFormPage1(
									(Global.currentActivitysInitAssmntKey));
				} catch (Exception e) {

				}

				txtName.setText(aiafP1.getResidentName());
				dcAdmissionDate.setDate(aiafP1.getAdmitDate());
				textAreaDiagnosis.setText(aiafP1.getDiagnosis());
				txtBirthplace.setText(aiafP1.getBirthPlace());
				dcBirthdate.setDate(aiafP1.getBirthDate());
				txtMaritalStatus.setText(aiafP1.getMaritalStatus());
				txtLanguage.setText(aiafP1.getLanguage());
				txtReligion.setText(aiafP1.getReligion());
				txtOccupation.setText(aiafP1.getOccupation());
				txtResponsibleParty.setText(aiafP1.getResponsibleParty());
				txtRelationship.setText(aiafP1.getRelationship());
				txtAllergies.setText(aiafP1.getAllergies());
				txtVoteSpecify.setText(aiafP1.getVoteSpecify());
				SwingUtils.setSelectedButton(bgAttendingService, aiafP1
						.getAttendiveService());

				SwingUtils.setSelectedButton(bgVote, aiafP1.getWantsToVote());
				SwingUtils.setSelectedButton(bgTerm, aiafP1.getTerm());
				SwingUtils.setSelectedButton(bgVeteran, aiafP1.getVeteran());
				SwingUtils.setSelectedButton(bgPrefers, aiafP1.getPrefers());
				SwingUtils.setSelectedButton(bgPrefferedActivity, aiafP1
						.getPreferredActivity());
				SwingUtils.setSelectedButton(bgWishesNewspaper, aiafP1
						.getWishesNewspaper());
				SwingUtils.setSelectedButton(bgCandidate11, aiafP1
						.getCandidate11());
				SwingUtils.setSelectedButton(bgNaps, aiafP1.getNaps());
				SwingUtils.setSelectedButton(bgRegularlyNaps, aiafP1
						.getRegularNaps());
				SwingUtils.setSelectedButton(bgVisionRight, aiafP1
						.getVisionRight());
				SwingUtils.setSelectedButton(bgVisionLeft, aiafP1
						.getVisionLeft());
				SwingUtils.setSelectedButton(bgHearingLeft, aiafP1
						.getHearingLeft());
				SwingUtils.setSelectedButton(bgHearingRight, aiafP1
						.getHearingRight());
				SwingUtils.setSelectedButton(bgExtremetiesRLE, aiafP1
						.getExtremitiesRLE());
				SwingUtils.setSelectedButton(bgExtremitiesLLE, aiafP1
						.getExtremitiesLLE());
				SwingUtils.setSelectedButton(bgExtremitiesLUE, aiafP1
						.getExtremitiesLUE());
				SwingUtils.setSelectedButton(bgExtremitiesRUE, aiafP1
						.getExtremitiesRUE());
				SwingUtils.setSelectedButton(bgAmbulations, aiafP1
						.getAmbulations());

				cbP1.setSelected(aiafP1.isPursuitP1());
				cbP2.setSelected(aiafP1.isPursuitP2());
				cbP3.setSelected(aiafP1.isPursuitP3());
				cbP4.setSelected(aiafP1.isPursuitP4());
				cbP5.setSelected(aiafP1.isPursuitP5());
				cbP6.setSelected(aiafP1.isPursuitP6());
				cbP7.setSelected(aiafP1.isPursuitP7());
				cbP8.setSelected(aiafP1.isPursuitP8());
				cbP9.setSelected(aiafP1.isPursuitP9());
				cbP10.setSelected(aiafP1.isPursuitP10());
				cbP11.setSelected(aiafP1.isPursuitP11());
				cbP12.setSelected(aiafP1.isPursuitP12());
				cbP13.setSelected(aiafP1.isPursuitP13());
				cbP14.setSelected(aiafP1.isPursuitP14());
				cbP15.setSelected(aiafP1.isPursuitP15());
				cbP16.setSelected(aiafP1.isPursuitP16());
				cbP17.setSelected(aiafP1.isPursuitP17());
				cbP18.setSelected(aiafP1.isPursuitP18());
				cbP19.setSelected(aiafP1.isPursuitP19());
				cbP20.setSelected(aiafP1.isPursuitP20());
				cbP21.setSelected(aiafP1.isPursuitP21());
				cbP22.setSelected(aiafP1.isPursuitP22());
				cbP23.setSelected(aiafP1.isPursuitP23());
				cbP24.setSelected(aiafP1.isPursuitP24());

				cbC1.setSelected(aiafP1.isPursuitC1());
				cbC2.setSelected(aiafP1.isPursuitC2());
				cbC3.setSelected(aiafP1.isPursuitC3());
				cbC4.setSelected(aiafP1.isPursuitC4());
				cbC5.setSelected(aiafP1.isPursuitC5());
				cbC6.setSelected(aiafP1.isPursuitC6());
				cbC7.setSelected(aiafP1.isPursuitC7());
				cbC8.setSelected(aiafP1.isPursuitC8());
				cbC9.setSelected(aiafP1.isPursuitC9());
				cbC10.setSelected(aiafP1.isPursuitC10());
				cbC11.setSelected(aiafP1.isPursuitC11());
				cbC12.setSelected(aiafP1.isPursuitC12());
				cbC13.setSelected(aiafP1.isPursuitC13());
				cbC14.setSelected(aiafP1.isPursuitC14());
				cbC15.setSelected(aiafP1.isPursuitC15());
				cbC16.setSelected(aiafP1.isPursuitC16());
				cbC17.setSelected(aiafP1.isPursuitC17());
				cbC18.setSelected(aiafP1.isPursuitC18());
				cbC19.setSelected(aiafP1.isPursuitC19());
				cbC20.setSelected(aiafP1.isPursuitC20());
				cbC21.setSelected(aiafP1.isPursuitC21());
				cbC22.setSelected(aiafP1.isPursuitC22());
				cbC23.setSelected(aiafP1.isPursuitC23());
				cbC24.setSelected(aiafP1.isPursuitC24());

			}
		}

		try {
			// Global.panelResidentAssessmentFormPage2.updateData();
			FormConfigValidation.updateComponents(this);
		} catch (Exception e) {

		}

	}

	private void updateDiagnosis() {
		List diagList = null; // new ArrayList();
		String tmp = "";
		try {
			diagList = MedrexClientManager.getInstance().getResidentDiagnosiss(
					Global.currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < diagList.size(); i++) {
			ResidentDiagnosis diag = (ResidentDiagnosis) diagList.get(i);
			if (diag.isConfirmed()) {
				tmp += diag.getName();
				if (i != diagList.size() - 1) {
					tmp += ", ";
				}
			}
		}
		textAreaDiagnosis.setText(tmp);
	}

	private void updateHearingAndVision() {
		// for ears
		int ActionEarRight = 0;
		int ActionEarLeft = 0;
		if (rafp1.isHearingAdequateRight()) {
			ActionEarRight = 1;
		}
		if (rafp1.isHearingAdequateAidRight()) {
			ActionEarRight = 4;
		}
		if (rafp1.isHearingPoorRight()) {
			ActionEarRight = 2;
		}
		if (rafp1.isHearingDeafRight()) {
			ActionEarRight = 3;
		}
		SwingUtils.setSelectedButton(bgHearingRight, ActionEarRight);

		if (rafp1.isHearingAdequateLeft()) {
			ActionEarLeft = 1;
		}
		if (rafp1.isHearingAdequateAidLeft()) {
			ActionEarLeft = 4;
		}
		if (rafp1.isHearingPoorLeft()) {
			ActionEarLeft = 2;
		}
		if (rafp1.isHearingDeafLeft()) {
			ActionEarLeft = 3;
		}
		SwingUtils.setSelectedButton(bgHearingLeft, ActionEarLeft);
		// for eyes
		int ActionEyeRight = 0;
		int ActionEyeLeft = 0;
		if (rafp1.isVisionAdequateRight()) {
			ActionEyeRight = 1;
		}
		if (rafp1.isVisionAdequateGlassesRight()) {
			ActionEyeRight = 2;
		}
		if (rafp1.isVisionPoorRight()) {
			ActionEyeRight = 3;
		}
		if (rafp1.isVisionBlindRight()) {
			ActionEyeRight = 4;
		}
		SwingUtils.setSelectedButton(bgVisionRight, ActionEyeRight);

		if (rafp1.isVisionAdequateLeft()) {
			ActionEyeLeft = 1;
		}
		if (rafp1.isVisionAdequateGlassesLeft()) {
			ActionEyeLeft = 2;
		}
		if (rafp1.isVisionPoorLeft()) {
			ActionEyeLeft = 3;
		}
		if (rafp1.isVisionBlindLeft()) {
			ActionEyeLeft = 4;
		}
		SwingUtils.setSelectedButton(bgVisionLeft, ActionEyeLeft);
	}

	public int doSave() {
		// ResidentAssessmentFormPage1 rafp1 = new
		// ResidentAssessmentFormPage1();
		ActivityInitialAssessmentFormPage1 aiafP1 = new ActivityInitialAssessmentFormPage1();

		aiafP1.setSerial(Global.currentActivitysInitAssmntKey);
		aiafP1.setResidentId(Global.currentResidenceKey);
		aiafP1.setResidentName(txtName.getText());
		aiafP1.setAdmitDate(dcAdmissionDate.getDate());
		aiafP1.setDiagnosis(textAreaDiagnosis.getText());
		aiafP1.setBirthPlace(txtBirthplace.getText());
		aiafP1.setBirthDate(dcAdmissionDate.getDate());
		aiafP1.setMaritalStatus(txtMaritalStatus.getText());
		aiafP1.setLanguage(txtLanguage.getText());
		aiafP1.setReligion(txtReligion.getText());
		aiafP1.setOccupation(txtOccupation.getText());
		aiafP1.setResponsibleParty(txtResponsibleParty.getText());
		aiafP1.setRelationship(txtRelationship.getText());
		aiafP1.setVoteSpecify(txtVoteSpecify.getText());
		aiafP1.setAttendiveService(SwingUtils
				.getSelectedButton(bgAttendingService));

		aiafP1.setWantsToVote(SwingUtils.getSelectedButton(bgVote));
		aiafP1.setAllergies(txtAllergies.getText());
		aiafP1.setTerm(SwingUtils.getSelectedButton(bgTerm));
		aiafP1.setVeteran(SwingUtils.getSelectedButton(bgVeteran));
		aiafP1.setPrefers(SwingUtils.getSelectedButton(bgPrefers));
		aiafP1.setPreferredActivity(SwingUtils
				.getSelectedButton(bgPrefferedActivity));
		aiafP1.setWishesNewspaper(SwingUtils
				.getSelectedButton(bgWishesNewspaper));
		aiafP1.setCandidate11(SwingUtils.getSelectedButton(bgCandidate11));
		aiafP1.setNaps(SwingUtils.getSelectedButton(bgNaps));
		aiafP1.setRegularNaps(SwingUtils.getSelectedButton(bgRegularlyNaps));
		aiafP1.setVisionRight(SwingUtils.getSelectedButton(bgVisionRight));
		aiafP1.setVisionLeft(SwingUtils.getSelectedButton(bgVisionLeft));
		aiafP1.setHearingRight(SwingUtils.getSelectedButton(bgHearingRight));
		aiafP1.setHearingLeft(SwingUtils.getSelectedButton(bgHearingLeft));
		aiafP1
				.setExtremitiesLLE(SwingUtils
						.getSelectedButton(bgExtremitiesLLE));
		aiafP1
				.setExtremitiesLUE(SwingUtils
						.getSelectedButton(bgExtremitiesLUE));
		aiafP1
				.setExtremitiesRLE(SwingUtils
						.getSelectedButton(bgExtremetiesRLE));
		aiafP1
				.setExtremitiesRUE(SwingUtils
						.getSelectedButton(bgExtremitiesRUE));
		aiafP1.setAmbulations(SwingUtils.getSelectedButton(bgAmbulations));

		aiafP1.setPursuitP1(cbP1.isSelected());
		aiafP1.setPursuitP2(cbP2.isSelected());
		aiafP1.setPursuitP3(cbP3.isSelected());
		aiafP1.setPursuitP4(cbP4.isSelected());
		aiafP1.setPursuitP5(cbP5.isSelected());
		aiafP1.setPursuitP6(cbP6.isSelected());
		aiafP1.setPursuitP7(cbP7.isSelected());
		aiafP1.setPursuitP8(cbP8.isSelected());
		aiafP1.setPursuitP9(cbP9.isSelected());
		aiafP1.setPursuitP10(cbP10.isSelected());
		aiafP1.setPursuitP11(cbP11.isSelected());
		aiafP1.setPursuitP12(cbP12.isSelected());
		aiafP1.setPursuitP13(cbP13.isSelected());
		aiafP1.setPursuitP14(cbP14.isSelected());
		aiafP1.setPursuitP15(cbP15.isSelected());
		aiafP1.setPursuitP16(cbP16.isSelected());
		aiafP1.setPursuitP17(cbP17.isSelected());
		aiafP1.setPursuitP18(cbP18.isSelected());
		aiafP1.setPursuitP19(cbP19.isSelected());
		aiafP1.setPursuitP20(cbP20.isSelected());
		aiafP1.setPursuitP21(cbP21.isSelected());
		aiafP1.setPursuitP22(cbP22.isSelected());
		aiafP1.setPursuitP23(cbP23.isSelected());
		aiafP1.setPursuitP24(cbP24.isSelected());

		aiafP1.setPursuitC1(cbC1.isSelected());
		aiafP1.setPursuitC2(cbC2.isSelected());
		aiafP1.setPursuitC3(cbC3.isSelected());
		aiafP1.setPursuitC4(cbC4.isSelected());
		aiafP1.setPursuitC5(cbC5.isSelected());
		aiafP1.setPursuitC6(cbC6.isSelected());
		aiafP1.setPursuitC7(cbC7.isSelected());
		aiafP1.setPursuitC8(cbC8.isSelected());
		aiafP1.setPursuitC9(cbC9.isSelected());
		aiafP1.setPursuitC10(cbC10.isSelected());
		aiafP1.setPursuitC11(cbC11.isSelected());
		aiafP1.setPursuitC12(cbC12.isSelected());
		aiafP1.setPursuitC13(cbC13.isSelected());
		aiafP1.setPursuitC14(cbC14.isSelected());
		aiafP1.setPursuitC15(cbC15.isSelected());
		aiafP1.setPursuitC16(cbC16.isSelected());
		aiafP1.setPursuitC17(cbC17.isSelected());
		aiafP1.setPursuitC18(cbC18.isSelected());
		aiafP1.setPursuitC19(cbC19.isSelected());
		aiafP1.setPursuitC20(cbC20.isSelected());
		aiafP1.setPursuitC21(cbC21.isSelected());
		aiafP1.setPursuitC22(cbC22.isSelected());
		aiafP1.setPursuitC23(cbC23.isSelected());
		aiafP1.setPursuitC24(cbC24.isSelected());

		try {
			Global.currentActivitysInitAssmntKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateActivityInitialAssessmentFormPage1(aiafP1);
			FormConfigValidation.saveAlertMessages(
					"Activity Initial Assessment Form Page 1", this);
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return Global.currentActivitysInitAssmntKey;
	}

	public boolean doValidate() {
		return FormConfigValidation.validate(this);
	}

}
