package medrex.client.main.admission;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.message.MessageSender;
import medrex.client.main.resident.allergies.FrameResidentAllergiesConfirm;
import medrex.client.main.resident.diagnosis.FrameResidentDiagnosisConfirm;
import medrex.client.main.resident.vital.PanelVitalScreen;
import medrex.client.main.resident.vital.PanelVitalScreen.Mode;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentVitalSigns;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage1 extends JxPanel implements Form {
	Theme theme = new BlackOverWhiteTheme();

	/*
	 * Font font_Plain = new Font("Arial",Font.PLAIN,11);
	 * 
	 * Font font_Bold= font_Plain.deriveFont(Font.BOLD); Font font_ch =
	 * font_Plain.deriveFont(12f);
	 * 
	 * Insets margin = new Insets(0,2,0,0); Border border = new
	 * CompoundBorderUIResource(new LineBorder(Color.BLACK),new
	 * BasicBorders.MarginBorder()); Color background=Color.WHITE; Color
	 * foreground = Color.BLACK;
	 */

	private ButtonGroup bgAbilityUnderstand = new ButtonGroup();
	private JxRadioButton rbAbilityRarely;
	private JxRadioButton rbAbilitySometimesUnderstand;
	private JxRadioButton rbAbilityUsuallyUnderstand;
	private JxRadioButton rbAbilityUnderstand;
	private JxRadioButton rbAbilityMakesSelfUnderstand;
	private JxText txtNamePlaceOnDoor;
	private JxText txtNameBracelet;
	private JxRadioButton rbSometimesUnderstand;
	private JxRadioButton rbUsuallyUnderstand;
	private JxRadioButton rbUnderstand;
	private JxRadioButton rbMakesSelfUnderstand;
	private ButtonGroup bgUnderstand = new ButtonGroup();
	private JxCheckBox cbDoesUnderstandEnglish;
	private ButtonGroup bgHealthCareProxy = new ButtonGroup();
	private ButtonGroup bgLivingWill = new ButtonGroup();
	private ButtonGroup bgDNROrder = new ButtonGroup();
	private JxRadioButton rbHealthCareProxyNo;
	private JxRadioButton rbHealthCareProxyYes;
	private JxRadioButton rbLivingWillNo;
	private JxRadioButton rbLivingWillYes;
	private JxRadioButton rbDNRorderNo;
	private JxRadioButton rbDNRorderYes;
	private Map<String, String> validationMap = new HashMap<String, String>();
	Map<Integer, String> msgMap = new HashMap<Integer, String>();
	private ButtonGroup bgIsolationType = new ButtonGroup();
	private JxCheckBox cbEatingNA;
	private ButtonGroup bg25 = new ButtonGroup();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private JxLabel lblAttendingPhysician;

	private JxDateChooser dcAdmissionDate;

	private JxDateChooser dcNurseVisit;

	private JxLabel dateLabel;

	private JxComboBox cmbNurse;

	private JxLabel ifSoWhatLabel;

	private JxPanel panel_38;

	private ButtonGroup bgResidentAddmission = new ButtonGroup();

	private JxRadioButton rbSignificantChange;

	private JxRadioButton rbRreadmission;

	private JxRadioButton rbRadmission;

	private ButtonGroup bgVisionLeft = new ButtonGroup();

	private ButtonGroup bgVisionRight = new ButtonGroup();

	private ButtonGroup bgHearingLeft = new ButtonGroup();

	private ButtonGroup bgHearingRight = new ButtonGroup();

	private ButtonGroup bgBladderContinent = new ButtonGroup();

	private ButtonGroup bgBowelEnemas = new ButtonGroup();

	private ButtonGroup bgBowelLaxative = new ButtonGroup();

	private ButtonGroup bgBowelConstipated = new ButtonGroup();

	private ButtonGroup bgBowelContinent = new ButtonGroup();

	private ButtonGroup bgOralDoDentureFit = new ButtonGroup();

	private ButtonGroup bgOralLower = new ButtonGroup();

	private ButtonGroup bgOralUpper = new ButtonGroup();

	private ButtonGroup bgOralDentures = new ButtonGroup();

	private ButtonGroup bgOralOwnTeeth = new ButtonGroup();

	private ButtonGroup bgCommunicationOriented = new ButtonGroup();

	private ButtonGroup bgCommunication = new ButtonGroup();

	private ButtonGroup bgEatingNutrition1 = new ButtonGroup();
	private ButtonGroup bgContact = new ButtonGroup();
	private ButtonGroup bgDroplet = new ButtonGroup();
	private ButtonGroup bgRespiratory = new ButtonGroup();

	JxLabel lblLastName;

	JxLabel lblFirstName;

	JxLabel lblRoomNum;

	JxLabel lblAllergies;

	JxLabel lblTransferringFacility;

	JxLabel lblTransporteBy;

	JxLabel lblTimeAdmitted;

	JxLabel lblDOB;

	JxLabel lblAge;

	JxLabel lblSex;

	JxText lblPrimaryDiagnosis;

	JxText txtVitalSigns;

	// JxComboBox cmbPulse;

	JxText txtTemp;

	JxText txtResp;

	JxText txtO2Sat;

	JxText txtWeight;

	JxText txtHeight;

	JxRadioButton rbCommunicationClear;

	JxRadioButton rbCommunicationAphasic;

	JxRadioButton rbCommunicationDysphasic;

	JxComboBox cmbCommunicationLanguages;

	// JxRadioButton rbCommOrientedYes;
	//
	// JxRadioButton rbCommOrientedNo;

	JxCheckBox cbCommunicationTime;

	JxCheckBox cbCommunicationPlace;

	JxCheckBox cbCommunicationPerson;

	JxCheckBox cbHearingAdequateRight;

	JxCheckBox cbHearingAdequateLeft;

	JxCheckBox cbHearingAdequateWithAidRight;

	JxCheckBox cbHearingAdequateWithAidLeft;

	JxCheckBox cbHearingPoorRight;

	JxCheckBox cbHearingPoorLeft;

	JxCheckBox cbHearingDeafRight;

	JxCheckBox cbHearingDeafLef;

	JxCheckBox cbVisionAdequateRight;

	JxCheckBox cbVisionAdequateLeft;

	JxCheckBox cbVisionAdequateGlassesRight;

	JxCheckBox cbVisionAdequateGlassesLeft;

	JxCheckBox cbVisionPoorRight;

	JxCheckBox cbVisionPoorLeft;

	JxCheckBox cbVisionBlindRight;

	JxCheckBox cbVisionBlindLeft;

	JxRadioButton rbEatingTPN;

	JxRadioButton rbEatingNPO;

	JxText txtEatingAdaptive;

	JxRadioButton rbOralOwnTeethYes;

	JxRadioButton rbOralOwnTeethNo;

	JxText txtOralCondition;

	JxRadioButton rbOralDenturesYes;

	JxRadioButton rbOralDenturesNo;

	JxRadioButton rbOralUpperComplete;

	JxRadioButton rbOralLowerComplete;

	JxRadioButton rbOralUpperPartial;

	JxRadioButton rbOralLowerPartial;

	JxRadioButton rbOralUpperWornfull;

	JxRadioButton rbOralLowerWornFull;

	JxRadioButton rbOralUpperWornWhenEating;

	JxRadioButton rbOralLowerRemoved;

	JxRadioButton rbOralDoDenturesYes;

	JxRadioButton rbOralLowerDoDenturesNo;

	JxText txtOralResidentWillNot;

	JxCheckBox cbBowelToilet;

	JxCheckBox cbBowelUrinal;

	JxCheckBox cbBowelBedPan;

	JxCheckBox cbBowelBedside;

	JxRadioButton rbBowelContinentYes;

	JxRadioButton rbBowelContinentNo;

	JxRadioButton rbBowelConstipatedYes;

	JxRadioButton rbBowelLaxativeYes;

	JxRadioButton rbBowelEnemasYes;

	JxRadioButton rbBowelConstipatedNo;

	JxRadioButton rbBowelLaxativeNo;

	JxRadioButton rbBowelEnemasNo;

	JxText txtBowelMovement;

	JxRadioButton rbBladderContinentYes;

	JxRadioButton rbBladderContinentNo;

	JxText txtBladderUrineColor;

	JxText txtBladderUrineConsistency;

	JxCheckBox cbBladderDribble;

	JxCheckBox cbBladderCatheter;

	JxText txtBladderTime;
	private boolean isContinent;
	private boolean isCatheter;
	private String catherType;
	private int foleySize;
	private JxText txtPulse;
	private JxComboBox cmbCatherType;
	private ResidentVitalSigns vitals;

	/**
	 * Create the panel
	 */
	public PanelResidentAssessmentFormPage1() {
		super();


		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		setLayout(flowLayout_4);

		setLayout(null);


		Global.panelResidentAssessmentFormPage1 = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1305));

		final JxPanel panel_16 = new JxPanel();

		panel_16.setTheme(theme);

		panel_16.setBounds(5, 5, 910, 70);
		panel_16.setTheme (theme);

		panel_16.setPreferredSize(new Dimension(910, 70));

		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		panel_16.setLayout(flowLayout_2);
		add(panel_16);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setPreferredSize(new Dimension(500, 50));
		panel_16.add(panel_40);
		panel_40.setOpaque(false);
		panel_40.setLayout(null);

		JxLabel residentAssessmentFormLabel = new JxLabel();
		residentAssessmentFormLabel.setTheme(theme);
		residentAssessmentFormLabel.setBounds(37, 22, 292, 16);
		panel_40.add(residentAssessmentFormLabel);

		residentAssessmentFormLabel.setFontStyle(Font.BOLD);
		residentAssessmentFormLabel.setText("RESIDENT ASSESSMENT FORM");

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setOpaque(false);
		panel_17.setPreferredSize(new Dimension(120, 70));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_17.setLayout(flowLayout_1);
		panel_16.add(panel_17);

		rbRadmission = new JxRadioButton();
		rbRadmission.setTheme(theme);

		panel_17.add(rbRadmission);
		bgResidentAddmission.add(rbRadmission);
		rbRadmission.setActionCommand("1");

		rbRadmission.setText("Admission");

		rbRreadmission = new JxRadioButton();
		rbRreadmission.setTheme(theme);

		panel_17.add(rbRreadmission);
		bgResidentAddmission.add(rbRreadmission);
		rbRreadmission.setActionCommand("2");

		rbRreadmission.setText("Readmission");

		rbSignificantChange = new JxRadioButton();
		rbSignificantChange.setTheme(theme);

		panel_17.add(rbSignificantChange);
		bgResidentAddmission.add(rbSignificantChange);
		rbSignificantChange.setActionCommand("3");

		rbSignificantChange.setText("Significant Change");

		final JxPanel panel_21_1 = new JxPanel();

		panel_21_1.setTheme(theme);

		panel_21_1.setBounds(5, 80, 910, 70);
		panel_21_1.setTheme (theme);


		panel_21_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_21_1.setLayout(null);
		panel_21_1.setPreferredSize(new Dimension(910, 70));
		add(panel_21_1);

		final JxPanel panel_22_1 = new JxPanel();
		panel_22_1.setTheme(theme);
		panel_22_1.setBackground(Color.BLACK);
		panel_22_1.setLayout(null);
		panel_22_1.setBounds(0, 0, 1200, 26);
		panel_21_1.add(panel_22_1);

		final JxLabel communicationLabel_1 = new JxLabel();
		communicationLabel_1.setTheme(theme);

		communicationLabel_1.setFontStyle(Font.BOLD);
		communicationLabel_1.setForeground(Color.WHITE);
		communicationLabel_1.setText("ADVANCED DIRECTIVES");
		communicationLabel_1.setBounds(406, 0, 189, 26);
		panel_22_1.add(communicationLabel_1);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme(theme);
		panel_43.setLayout(null);

		panel_43.setBounds(2, 32, 880, 34);
		panel_21_1.add(panel_43);

		final JxLabel dnrOrderLabel = new JxLabel();
		dnrOrderLabel.setTheme(theme);

		dnrOrderLabel.setText("DNR Order");
		dnrOrderLabel.setBounds(6, 10, 82, 14);
		panel_43.add(dnrOrderLabel);

		final JxLabel livingWillLabel = new JxLabel();
		livingWillLabel.setTheme(theme);

		livingWillLabel.setText("Living Will");
		livingWillLabel.setBounds(298, 10, 66, 14);
		panel_43.add(livingWillLabel);

		final JxLabel livingWillLabel_1 = new JxLabel();
		livingWillLabel_1.setTheme(theme);

		livingWillLabel_1.setText("Health Care Proxy");
		livingWillLabel_1.setBounds(589, 10, 98, 14);
		panel_43.add(livingWillLabel_1);

		rbDNRorderYes = new JxRadioButton();
		rbDNRorderYes.setTheme(theme);

		rbDNRorderYes.setActionCommand("1");
		bgDNROrder.add(rbDNRorderYes);

		rbDNRorderYes.setText("Yes");
		rbDNRorderYes.setBounds(90, 8, 51, 18);
		panel_43.add(rbDNRorderYes);

		rbDNRorderNo = new JxRadioButton();
		rbDNRorderNo.setTheme(theme);

		rbDNRorderNo.setActionCommand("2");
		bgDNROrder.add(rbDNRorderNo);

		rbDNRorderNo.setText("No");
		rbDNRorderNo.setBounds(144, 8, 106, 18);
		panel_43.add(rbDNRorderNo);

		rbLivingWillYes = new JxRadioButton();
		rbLivingWillYes.setTheme(theme);

		rbLivingWillYes.setActionCommand("1");
		bgLivingWill.add(rbLivingWillYes);

		rbLivingWillYes.setText("Yes");
		rbLivingWillYes.setBounds(391, 8, 51, 18);
		panel_43.add(rbLivingWillYes);

		rbLivingWillNo = new JxRadioButton();
		rbLivingWillNo.setTheme(theme);

		rbLivingWillNo.setActionCommand("2");
		bgLivingWill.add(rbLivingWillNo);

		rbLivingWillNo.setText("No");
		rbLivingWillNo.setBounds(452, 8, 66, 18);
		panel_43.add(rbLivingWillNo);

		rbHealthCareProxyYes = new JxRadioButton();
		rbHealthCareProxyYes.setTheme(theme);

		rbHealthCareProxyYes.setActionCommand("1");
		bgHealthCareProxy.add(rbHealthCareProxyYes);

		rbHealthCareProxyYes.setText("Yes");
		rbHealthCareProxyYes.setBounds(693, 8, 51, 18);
		panel_43.add(rbHealthCareProxyYes);

		rbHealthCareProxyNo = new JxRadioButton();
		rbHealthCareProxyNo.setTheme(theme);

		rbHealthCareProxyNo.setActionCommand("2");
		bgHealthCareProxy.add(rbHealthCareProxyNo);

		rbHealthCareProxyNo.setText("No");
		rbHealthCareProxyNo.setBounds(750, 8, 66, 18);
		panel_43.add(rbHealthCareProxyNo);

		JxPanel panel_1 = new JxPanel();

		panel_1.setTheme(theme);

		panel_1.setBounds(5, 155, 910, 251);
		panel_1.setTheme (theme);

		panel_1.setPreferredSize(new Dimension(910, 251));
		panel_1.setLayout(null);

		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		add(panel_1);

		JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 293, 51);
		panel_1.add(panel_2);

		JxLabel lastNameLabel = new JxLabel();
		lastNameLabel.setTheme(theme);

		lastNameLabel.setText("Last Name:");
		lastNameLabel.setBounds(8, 5, 60, 16);
		panel_2.add(lastNameLabel);

		lblLastName = new JxLabel();
		lblLastName.setTheme(theme);

		lblLastName.setFontStyle(Font.BOLD);
		// lblLastName.setMargin(new Insets(1, 5, 2, 1));
		// Border myBorder = new CompoundBorderUIResource(new
		// LineBorder(Color.BLACK, 1, false), new BasicBorders.MarginBorder());
		// lblLastName.setBorder(myBorder);
		// lblLastName.setEditable(true);
		// lblLastName.setBorder(new LineBorder(Color.black, 1, false));

		lblLastName.setBounds(69, 5, 159, 16);
		panel_2.add(lblLastName);

		JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));

		panel_3.setBounds(292, 0, 408, 51);
		panel_1.add(panel_3);

		JxLabel firstNameLabel = new JxLabel();
		firstNameLabel.setTheme(theme);
		firstNameLabel.setBounds(10, 5, 66, 16);
		panel_3.add(firstNameLabel);
		firstNameLabel.setText("First Name:");

		lblFirstName = new JxLabel();
		lblFirstName.setTheme(theme);

		lblFirstName.setFontStyle(Font.BOLD);
		// lblFirstName.setBorder(new LineBorder(Color.black, 1, false));

		// lblFirstName.setEditable(true);
		lblFirstName.setBounds(114, 3, 159, 16);
		panel_3.add(lblFirstName);

		JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));

		panel_4.setLayout(null);
		panel_4.setBounds(699, 0, 211, 51);
		panel_1.add(panel_4);

		JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room #:");
		roomLabel.setBounds(10, 5, 42, 16);
		panel_4.add(roomLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);

		lblRoomNum.setFontStyle(Font.BOLD);
		// lblRoomNum.setBorder(new LineBorder(Color.black, 1, false));

		// lblRoomNum.setEditable(true);
		lblRoomNum.setBounds(57, 5, 87, 16);
		panel_4.add(lblRoomNum);

		JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);

		panel_5.setBounds(0, 50, 293, 50);
		panel_1.add(panel_5);

		JxLabel allergiesLabel = new JxLabel();
		allergiesLabel.setTheme(theme);

		allergiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		allergiesLabel.setText("Allergies:");
		allergiesLabel.setBounds(6, 2, 54, 16);
		panel_5.add(allergiesLabel);

		lblAllergies = new JxLabel();
		lblAllergies.setTheme(theme);
		// lblAllergies.setMargin(margin);

		// txtAllergies.setBorder(new LineBorder(Color.black, 1, false));

		lblAllergies.setBounds(69, 5, 159, 16);
		panel_5.add(lblAllergies);

		final JxButton btnAllergyConfirm = new JxButton();
		btnAllergyConfirm.setTheme(theme);

		btnAllergyConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				(FrameFactory
						.createWindowOfType(FrameResidentAllergiesConfirm.class))
						.setVisible(true);
				updateAllergies();
			}
		});
		btnAllergyConfirm.setBounds(235, 5, 24, 18);
		panel_5.add(btnAllergyConfirm);
		btnAllergyConfirm.setText("+");

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText("Reaction:");
		label.setBounds(6, 25, 54, 14);
		panel_5.add(label);

		final JxText textField_1 = new JxText();
		textField_1.setTheme(theme);

		// textField_1.setBorder(new LineBorder(Color.black, 1, false));
		/*
		 * textField_1.setMargin(margin); textField_1.setBorder(border);
		 */
		textField_1.setBounds(69, 28, 159, 16);
		panel_5.add(textField_1);

		JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));

		panel_6.setLayout(null);
		panel_6.setBounds(292, 50, 355, 50);
		panel_1.add(panel_6);

		JxLabel transferringFacilityLabel = new JxLabel();
		transferringFacilityLabel.setTheme(theme);

		transferringFacilityLabel.setText("Transferring Facility:");
		transferringFacilityLabel.setBounds(10, 5, 99, 16);
		panel_6.add(transferringFacilityLabel);

		lblTransferringFacility = new JxLabel();
		lblTransferringFacility.setTheme(theme);

		lblTransferringFacility.setFontStyle(Font.BOLD);
		// lblTransferringFacility
		// .setBorder(new LineBorder(Color.black, 1, false));

		lblTransferringFacility.setBounds(114, 5, 159, 16);
		panel_6.add(lblTransferringFacility);

		JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(643, 50, 267, 50);
		panel_1.add(panel_7);

		JxLabel transportedByLabel = new JxLabel();
		transportedByLabel.setTheme(theme);

		transportedByLabel.setText("Transported By:");
		transportedByLabel.setBounds(10, 5, 78, 16);
		panel_7.add(transportedByLabel);

		lblTransporteBy = new JxLabel();
		lblTransporteBy.setTheme(theme);

		lblTransporteBy.setFontStyle(Font.BOLD);
		// lblTransporteBy.setBorder(new LineBorder(Color.black, 1, false));

		lblTransporteBy.setBounds(114, 4, 124, 16);
		panel_7.add(lblTransporteBy);

		JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_8.setLayout(null);
		panel_8.setBounds(0, 91, 293, 42);
		panel_1.add(panel_8);

		JxLabel timeAdmittedLabel = new JxLabel();
		timeAdmittedLabel.setTheme(theme);

		timeAdmittedLabel.setText("Time Admitted :");
		timeAdmittedLabel.setBounds(10, 15, 81, 16);
		panel_8.add(timeAdmittedLabel);

		lblTimeAdmitted = new JxLabel();

		lblTimeAdmitted.setFontStyle(Font.BOLD);
		// txtTimeAdmitted.setEditable(false);
		// txtTimeAdmitted.setBorder(new LineBorder(Color.black, 1, false));

		lblTimeAdmitted.setBounds(97, 15, 130, 20);
		panel_8.add(lblTimeAdmitted);

		JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		panel_9.setLayout(null);
		panel_9.setBounds(292, 98, 618, 35);
		panel_1.add(panel_9);

		JxLabel admissionDateLabel = new JxLabel();
		admissionDateLabel.setTheme(theme);
		admissionDateLabel.setText("Admission Date:");
		admissionDateLabel.setBounds(10, 10, 80, 16);
		panel_9.add(admissionDateLabel);

		dcAdmissionDate = new JxDateChooser();
		dcAdmissionDate.setTheme(theme);
		dcAdmissionDate.setFontStyle(Font.BOLD);
		dcAdmissionDate.setDateFormatString("MMMMM d, yyyy");

		dcAdmissionDate.setBounds(114, 10, 132, 20);
		panel_9.add(dcAdmissionDate);

		JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBounds(0, 132, 166, 40);
		panel_1.add(panel_10);
		panel_10.setLayout(null);

		panel_10.setBorder(new LineBorder(Color.black, 1, false));

		JxLabel dobLabel = new JxLabel();
		dobLabel.setTheme(theme);

		dobLabel.setText("D.O.B");
		dobLabel.setBounds(10, 5, 36, 16);
		panel_10.add(dobLabel);

		lblDOB = new JxLabel();
		lblDOB.setTheme(theme);

		lblDOB.setFontStyle(Font.BOLD);
		// lblDOB.setEditable(false);
		// lblDOB.setBorder(new LineBorder(Color.black, 1, false));

		lblDOB.setBounds(51, 5, 84, 16);
		panel_10.add(lblDOB);

		JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);

		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(161, 132, 132, 40);
		panel_1.add(panel_11);

		JxLabel ageLabel = new JxLabel();
		ageLabel.setTheme(theme);

		ageLabel.setText("Age:");
		ageLabel.setBounds(10, 5, 23, 16);
		panel_11.add(ageLabel);

		lblAge = new JxLabel();
		lblAge.setTheme(theme);

		lblAge.setFontStyle(Font.BOLD);
		// lblAge.setEditable(false);
		// lblAge.setBorder(new LineBorder(Color.black, 1, false));

		lblAge.setBounds(42, 5, 58, 16);
		panel_11.add(lblAge);

		JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);

		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBounds(292, 132, 195, 40);
		panel_1.add(panel_12);

		JxLabel sexLabel = new JxLabel();
		sexLabel.setTheme(theme);

		sexLabel.setText("Sex :");
		sexLabel.setBounds(10, 5, 25, 16);
		panel_12.add(sexLabel);

		lblSex = new JxLabel();
		lblSex.setTheme(theme);

		lblSex.setFontStyle(Font.BOLD);
		// lblSex.setBorder(new LineBorder(Color.black, 1, false));

		lblSex.setBounds(41, 5, 85, 16);
		panel_12.add(lblSex);

		JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));

		panel_13.setLayout(null);
		panel_13.setBounds(486, 132, 424, 40);
		panel_1.add(panel_13);

		JxLabel attendingPhysicianLabel = new JxLabel();
		attendingPhysicianLabel.setTheme(theme);

		attendingPhysicianLabel.setText("Attending Physician :");
		attendingPhysicianLabel.setBounds(10, 5, 101, 16);
		panel_13.add(attendingPhysicianLabel);

		lblAttendingPhysician = new JxLabel();
		lblAttendingPhysician.setTheme(theme);

		lblAttendingPhysician.setFontStyle(Font.BOLD);

		lblAttendingPhysician.setBounds(116, 5, 149, 16);
		panel_13.add(lblAttendingPhysician);

		JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));

		panel_14.setLayout(null);
		panel_14.setBounds(0, 170, 910, 42);
		panel_1.add(panel_14);

		JxLabel primaryDiagnosisLabel = new JxLabel();
		primaryDiagnosisLabel.setTheme(theme);

		primaryDiagnosisLabel.setText("Primary Diagnosis :");
		primaryDiagnosisLabel.setBounds(10, 0, 132, 16);
		panel_14.add(primaryDiagnosisLabel);

		lblPrimaryDiagnosis = new JxText();
		lblPrimaryDiagnosis.setTheme(theme);

		lblPrimaryDiagnosis.setFontStyle(Font.BOLD);
		lblPrimaryDiagnosis.setFocusable(false);
		lblPrimaryDiagnosis.setBounds(10, 19, 334, 20);
		lblPrimaryDiagnosis.setEditable(true);
		lblPrimaryDiagnosis.setSelectionStart(0);
		lblPrimaryDiagnosis.setSelectionEnd(0);
		panel_14.add(lblPrimaryDiagnosis);

		final JxButton btnDiagnosisConfirm = new JxButton();
		btnDiagnosisConfirm.setTheme(theme);

		btnDiagnosisConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		btnDiagnosisConfirm.setText("+");
		btnDiagnosisConfirm.setMargin(new Insets(3, 3, 3, 3));
		btnDiagnosisConfirm.setBounds(350, 20, 28, 20);
		panel_14.add(btnDiagnosisConfirm);

		final JxLabel nameBraceletLabel = new JxLabel();
		nameBraceletLabel.setTheme(theme);

		nameBraceletLabel.setText("Name Bracelet");
		nameBraceletLabel.setBounds(400, 17, 75, 16);
		panel_14.add(nameBraceletLabel);

		txtNameBracelet = new JxText();
		txtNameBracelet.setTheme(theme);

		txtNameBracelet.setBounds(500, 16, 132, 20);
		panel_14.add(txtNameBracelet);

		final JxLabel nameBraceletLabel_1 = new JxLabel();
		nameBraceletLabel_1.setTheme(theme);

		nameBraceletLabel_1.setText("Name Place on door");
		nameBraceletLabel_1.setBounds(660, 17, 112, 16);
		panel_14.add(nameBraceletLabel_1);

		txtNamePlaceOnDoor = new JxText();
		txtNamePlaceOnDoor.setTheme(theme);

		txtNamePlaceOnDoor.setBounds(798, 16, 87, 20);
		panel_14.add(txtNamePlaceOnDoor);

		JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));

		panel_15.setLayout(null);
		panel_15.setBounds(0, 210, 427, 41);
		panel_1.add(panel_15);

		JxLabel vitalSignsLabel = new JxLabel();
		vitalSignsLabel.setTheme(theme);

		vitalSignsLabel.setText("Vital signs - B/P");
		vitalSignsLabel.setBounds(10, 0, 87, 16);
		panel_15.add(vitalSignsLabel);

		txtVitalSigns = new JxText(FieldFormatter.MAX3);
		txtVitalSigns.setTheme(theme);

		txtVitalSigns.setBounds(10, 19, 80, 20);
		txtVitalSigns.setEnabled(false);
		panel_15.add(txtVitalSigns);

		JxLabel pulseLabel = new JxLabel();
		pulseLabel.setTheme(theme);

		pulseLabel.setBounds(126, 0, 87, 16);
		panel_15.add(pulseLabel);
		pulseLabel.setText("Pulse :");

		txtPulse = new JxText(FieldFormatter.MAX3);
		txtPulse.setTheme(theme);

		txtPulse.setBounds(126, 19, 80, 20);
		panel_15.add(txtPulse);

		txtPulse.setEnabled(false);

		JxLabel tempLabel = new JxLabel();
		tempLabel.setTheme(theme);

		tempLabel.setBounds(242, 0, 66, 16);
		panel_15.add(tempLabel);
		tempLabel.setText("Temp:");

		txtTemp = new JxText(FieldFormatter.FLOAT3DizitWithPrec1);
		txtTemp.setTheme(theme);

		txtTemp.setBounds(242, 19, 80, 20);
		panel_15.add(txtTemp);
		txtTemp.setEnabled(false);

		final JxButton btnVital = new JxButton();
		btnVital.setTheme(theme);

		btnVital.setBounds(339, 18, 66, 20);
		panel_15.add(btnVital);
		btnVital.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				ResidentVitalSigns vit = new ResidentVitalSigns();
				if (!txtTemp.getText().equalsIgnoreCase("")) {
					vit.setTemprature(Double.parseDouble(txtTemp.getText()));
				}
				if (!txtVitalSigns.getText().equalsIgnoreCase("")) {
					vit.setBp(txtVitalSigns.getText());
				}
				if (!txtPulse.getText().equalsIgnoreCase("")) {
					vit.setPulse(Integer.parseInt(txtPulse.getText()));
				}
				if (!txtWeight.getText().equalsIgnoreCase("")) {
					vit.setWeight(Double.parseDouble(txtWeight.getText()));
				}
				setVitals(vit);
				PanelVitalScreen vSel = new PanelVitalScreen(
						Mode.RESIDENT_ASSESSMENT,
						PanelResidentAssessmentFormPage1.this);
				JDialog d = new JDialog();
				d.setSize(new Dimension(480, 350));
				d.setUndecorated(true);
				d.setResizable(false);
				d.setModal(true);
				vSel.setDialog(d);

				d.getContentPane().add(vSel, BorderLayout.CENTER);
				SwingUtils.center(d);
				d.setVisible(true);
			}
		});
		btnVital.setText("+");

		/*
		 * cmbPulse = new JxComboBox(); cmbPulse.setTheme (theme);
		 * cmbPulse.setActionCommand("cbPulse");
		 * 
		 * cmbPulse.setBounds(10, 18, 162, 20); panel_16.add(cmbPulse);
		 */

		JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setLayout(null);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));

		panel_18.setBounds(433, 209, 140, 42);
		panel_1.add(panel_18);

		JxLabel respLabel = new JxLabel();
		respLabel.setTheme(theme);

		respLabel.setBounds(10, 0, 66, 16);
		respLabel.setText("Resp:");
		panel_18.add(respLabel);

		txtResp = new JxText(FieldFormatter.MAX2);
		txtResp.setTheme(theme);

		txtResp.setBounds(10, 19, 87, 20);
		panel_18.add(txtResp);

		JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Color.black, 1, false));

		panel_19.setLayout(null);
		panel_19.setBounds(569, 210, 115, 41);
		panel_1.add(panel_19);

		JxLabel o2SatLabel = new JxLabel();
		o2SatLabel.setTheme(theme);

		o2SatLabel.setText("O2 Sat:");
		o2SatLabel.setBounds(10, 0, 66, 16);
		panel_19.add(o2SatLabel);

		txtO2Sat = new JxText(FieldFormatter.MAX3);
		txtO2Sat.setTheme(theme);

		txtO2Sat.setBounds(10, 19, 87, 20);
		panel_19.add(txtO2Sat);

		JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);

		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(681, 209, 115, 42);
		panel_1.add(panel_20);

		JxLabel weightLabel = new JxLabel();
		weightLabel.setTheme(theme);

		weightLabel.setText("Weight:");
		weightLabel.setBounds(10, 0, 66, 16);
		panel_20.add(weightLabel);

		txtWeight = new JxText();
		txtWeight.setTheme(theme);

		txtWeight.setBounds(10, 19, 87, 20);
		panel_20.add(txtWeight);

		JxLabel heightLabel = new JxLabel();
		heightLabel.setTheme(theme);

		heightLabel.setText("Height:");
		heightLabel.setBounds(802, 210, 66, 16);
		panel_1.add(heightLabel);

		txtHeight = new JxText();
		txtHeight.setTheme(theme);

		txtHeight.setBounds(802, 229, 87, 20);
		panel_1.add(txtHeight);

		final JxPanel panelOranism = new JxPanel();

		panelOranism.setTheme(theme);

		panelOranism.setBounds(5, 411, 910, 20);
		panelOranism.setTheme (theme);

		panelOranism.setPreferredSize(new Dimension(910, 20));
		panelOranism.setLayout(null);

		add(panelOranism);

		final JxRadioButton contactRadioButton = new JxRadioButton();
		contactRadioButton.setTheme(theme);

		contactRadioButton.setBounds(90, 0, 66, 20);
		contactRadioButton.setText("Contact");
		bgContact.add(contactRadioButton);
		panelOranism.add(contactRadioButton);

		final JxRadioButton dropletRadioButton = new JxRadioButton();
		dropletRadioButton.setTheme(theme);

		dropletRadioButton.setText("Droplet");
		dropletRadioButton.setBounds(184, 0, 76, 18);
		bgContact.add(dropletRadioButton);
		panelOranism.add(dropletRadioButton);

		final JxRadioButton respiratorRadioButton = new JxRadioButton();
		respiratorRadioButton.setTheme(theme);

		respiratorRadioButton.setText("Respiratory");
		respiratorRadioButton.setBounds(274, 0, 115, 18);
		bgContact.add(respiratorRadioButton);

		panelOranism.add(respiratorRadioButton);

		final JxLabel organismLabel = new JxLabel();
		organismLabel.setTheme(theme);

		organismLabel.setText("Organism:");
		organismLabel.setBounds(10, 2, 66, 14);
		panelOranism.add(organismLabel);

		/*
		 * rbCommOrientedYes = new JxRadioButton(); rbCommOrientedYes.setTheme
		 * (theme); rbCommOrientedYes.setActionCommand("1");
		 * bgCommunicationOriented.add(rbCommOrientedYes);
		 * 
		 * rbCommOrientedYes.setText("Yes"); rbCommOrientedYes.setBounds(128,
		 * -1, 66, 24); panel_26.add(rbCommOrientedYes);
		 * 
		 * rbCommOrientedNo = new JxRadioButton(); rbCommOrientedNo.setTheme
		 * (theme); rbCommOrientedNo.setActionCommand("2");
		 * bgCommunicationOriented.add(rbCommOrientedNo);
		 * 
		 * rbCommOrientedNo.setText("No"); rbCommOrientedNo.setBounds(215, -1,
		 * 66, 24); panel_26.add(rbCommOrientedNo);
		 */

		JxPanel panel_21 = new JxPanel();

		panel_21.setTheme(theme);

		panel_21.setBounds(5, 436, 910, 145);
		panel_21.setTheme (theme);

		panel_21.setPreferredSize(new Dimension(910, 145));
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);

		add(panel_21);

		JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setBounds(0, 0, 910, 26);
		panel_21.add(panel_22);
		panel_22.setBackground(Color.BLACK);
		panel_22.setLayout(null);

		JxLabel communicationLabel = new JxLabel();
		communicationLabel.setTheme(theme);
		communicationLabel.setBounds(406, 0, 189, 26);
		panel_22.add(communicationLabel);
		communicationLabel.setBackground(Color.BLACK);
		communicationLabel.setForeground(new Color(255, 255, 255));

		communicationLabel.setFontSize(14);
		communicationLabel.setFontStyle(Font.BOLD);
		communicationLabel.setText("COMMUNICATION");

		JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);

		panel_23.setLayout(null);
		panel_23.setBounds(10, 32, 297, 26);
		panel_21.add(panel_23);

		rbCommunicationClear = new JxRadioButton();
		rbCommunicationClear.setTheme(theme);

		rbCommunicationClear.setActionCommand("1");
		bgCommunication.add(rbCommunicationClear);

		rbCommunicationClear.setText("Clear");
		rbCommunicationClear.setBounds(10, 0, 65, 24);
		panel_23.add(rbCommunicationClear);

		rbCommunicationAphasic = new JxRadioButton();
		rbCommunicationAphasic.setTheme(theme);

		rbCommunicationAphasic.setActionCommand("2");
		bgCommunication.add(rbCommunicationAphasic);

		rbCommunicationAphasic.setText("Aphasic");
		rbCommunicationAphasic.setBounds(81, 0, 78, 24);
		panel_23.add(rbCommunicationAphasic);

		rbCommunicationDysphasic = new JxRadioButton();
		rbCommunicationDysphasic.setTheme(theme);

		rbCommunicationDysphasic.setActionCommand("3");
		bgCommunication.add(rbCommunicationDysphasic);

		rbCommunicationDysphasic.setText("Dysphagia");
		rbCommunicationDysphasic.setBounds(165, 0, 84, 24);
		panel_23.add(rbCommunicationDysphasic);

		JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);

		panel_24.setLayout(null);
		panel_24.setBounds(312, 31, 588, 26);
		panel_21.add(panel_24);

		JxLabel languagessSpokenLabel = new JxLabel();
		languagessSpokenLabel.setTheme(theme);

		languagessSpokenLabel.setBounds(10, 0, 108, 26);
		panel_24.add(languagessSpokenLabel);
		languagessSpokenLabel.setText("Languages Dominant");

		cmbCommunicationLanguages = new JxComboBox();
		cmbCommunicationLanguages.setTheme(theme);

		cmbCommunicationLanguages.setBounds(163, 3, 116, 20);
		panel_24.add(cmbCommunicationLanguages);

		final JxLabel doesResidentUnderstandLabel = new JxLabel();
		doesResidentUnderstandLabel.setTheme(theme);

		doesResidentUnderstandLabel.setText("Does resident understand English");
		doesResidentUnderstandLabel.setBounds(285, 4, 202, 16);
		panel_24.add(doesResidentUnderstandLabel);

		cbDoesUnderstandEnglish = new JxCheckBox();
		cbDoesUnderstandEnglish.setTheme(theme);

		cbDoesUnderstandEnglish.setText("");
		cbDoesUnderstandEnglish.setBounds(488, 1, 27, 24);
		panel_24.add(cbDoesUnderstandEnglish);

		JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setLayout(null);

		panel_25.setBounds(10, 58, 890, 26);
		panel_21.add(panel_25);

		rbMakesSelfUnderstand = new JxRadioButton();
		rbMakesSelfUnderstand.setTheme(theme);

		bgUnderstand.add(rbMakesSelfUnderstand);
		rbMakesSelfUnderstand.setActionCommand("1");

		rbMakesSelfUnderstand.setText("Makes self understand");
		rbMakesSelfUnderstand.setBounds(10, 0, 145, 24);
		panel_25.add(rbMakesSelfUnderstand);

		rbUnderstand = new JxRadioButton();
		rbUnderstand.setTheme(theme);

		bgUnderstand.add(rbUnderstand);
		rbUnderstand.setActionCommand("2");

		rbUnderstand.setText("Understand");
		rbUnderstand.setBounds(165, 0, 106, 24);
		panel_25.add(rbUnderstand);

		rbUsuallyUnderstand = new JxRadioButton();
		rbUsuallyUnderstand.setTheme(theme);

		bgUnderstand.add(rbUsuallyUnderstand);
		rbUsuallyUnderstand.setActionCommand("3");

		rbUsuallyUnderstand.setText("Usually understand");
		rbUsuallyUnderstand.setBounds(309, 3, 199, 18);
		panel_25.add(rbUsuallyUnderstand);

		rbSometimesUnderstand = new JxRadioButton();
		rbSometimesUnderstand.setTheme(theme);

		bgUnderstand.add(rbSometimesUnderstand);
		rbSometimesUnderstand.setActionCommand("4");

		rbSometimesUnderstand.setText("Sometimes understand");
		rbSometimesUnderstand.setBounds(514, 0, 181, 24);
		panel_25.add(rbSometimesUnderstand);

		final JxRadioButton rarelRadioButton = new JxRadioButton();
		rarelRadioButton.setTheme(theme);

		rarelRadioButton.setActionCommand("5");
		bgUnderstand.add(rarelRadioButton);

		rarelRadioButton.setText("Rarely / never understand");
		rarelRadioButton.setBounds(700, 3, 168, 18);
		panel_25.add(rarelRadioButton);

		JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);

		panel_26.setLayout(null);
		panel_26.setBounds(10, 86, 890, 26);
		panel_21.add(panel_26);

		JxLabel orientedLabel = new JxLabel();
		orientedLabel.setTheme(theme);

		orientedLabel.setText("Ability to understand:");
		orientedLabel.setBounds(10, 3, 110, 16);
		panel_26.add(orientedLabel);

		rbAbilityMakesSelfUnderstand = new JxRadioButton();
		rbAbilityMakesSelfUnderstand.setTheme(theme);

		bgAbilityUnderstand.add(rbAbilityMakesSelfUnderstand);
		rbAbilityMakesSelfUnderstand.setActionCommand("1");

		rbAbilityMakesSelfUnderstand.setText("Makes self understand");
		rbAbilityMakesSelfUnderstand.setBounds(123, 0, 130, 24);
		panel_26.add(rbAbilityMakesSelfUnderstand);

		rbAbilityUnderstand = new JxRadioButton();
		rbAbilityUnderstand.setTheme(theme);

		bgAbilityUnderstand.add(rbAbilityUnderstand);
		rbAbilityUnderstand.setActionCommand("2");

		rbAbilityUnderstand.setText("Understand");
		rbAbilityUnderstand.setBounds(258, 0, 82, 24);
		panel_26.add(rbAbilityUnderstand);

		rbAbilityUsuallyUnderstand = new JxRadioButton();
		rbAbilityUsuallyUnderstand.setTheme(theme);

		bgAbilityUnderstand.add(rbAbilityUsuallyUnderstand);
		rbAbilityUsuallyUnderstand.setActionCommand("3");

		rbAbilityUsuallyUnderstand.setText("Usually understand");
		rbAbilityUsuallyUnderstand.setBounds(350, 3, 130, 18);
		panel_26.add(rbAbilityUsuallyUnderstand);

		rbAbilitySometimesUnderstand = new JxRadioButton();
		rbAbilitySometimesUnderstand.setTheme(theme);

		bgAbilityUnderstand.add(rbAbilitySometimesUnderstand);
		rbAbilitySometimesUnderstand.setActionCommand("4");

		rbAbilitySometimesUnderstand.setText("Sometimes understand");
		rbAbilitySometimesUnderstand.setBounds(514, 0, 130, 24);
		panel_26.add(rbAbilitySometimesUnderstand);

		rbAbilityRarely = new JxRadioButton();
		rbAbilityRarely.setTheme(theme);

		bgAbilityUnderstand.add(rbAbilityRarely);
		rbAbilityRarely.setActionCommand("5");

		rbAbilityRarely.setText("Rarely / never understand");
		rbAbilityRarely.setBounds(700, 3, 146, 18);
		panel_26.add(rbAbilityRarely);

		JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setLayout(null);

		panel_27.setBounds(10, 115, 234, 26);
		panel_21.add(panel_27);

		cbCommunicationTime = new JxCheckBox();
		cbCommunicationTime.setTheme(theme);

		cbCommunicationTime.setText("Time");
		cbCommunicationTime.setBounds(10, 0, 45, 24);
		panel_27.add(cbCommunicationTime);

		cbCommunicationPlace = new JxCheckBox();
		cbCommunicationPlace.setTheme(theme);

		cbCommunicationPlace.setText("Place");
		cbCommunicationPlace.setBounds(60, 0, 55, 24);
		panel_27.add(cbCommunicationPlace);

		cbCommunicationPerson = new JxCheckBox();
		cbCommunicationPerson.setTheme(theme);

		cbCommunicationPerson.setText("Person");
		cbCommunicationPerson.setBounds(120, 0, 57, 24);
		panel_27.add(cbCommunicationPerson);

		final JxPanel panel_42 = new JxPanel();

		panel_42.setTheme(theme);

		panel_42.setBounds(5, 586, 920, 150);
		panel_42.setTheme (theme);

		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(0);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_42.setLayout(flowLayout_3);
		add(panel_42);

		JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setPreferredSize(new Dimension(455, 142));
		panel_42.add(panel_28);
		panel_28.setBorder(new LineBorder(Color.black, 1, false));

		panel_28.setLayout(null);

		JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setForeground(new Color(255, 255, 255));
		panel_30.setBackground(Color.BLACK);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 0, 455, 26);
		panel_28.add(panel_30);

		JxLabel hearingLabel = new JxLabel();
		hearingLabel.setTheme(theme);

		hearingLabel.setFontSize(14);
		hearingLabel.setFontStyle(Font.BOLD);
		hearingLabel.setBounds(181, 0, 71, 26);
		panel_30.add(hearingLabel);
		hearingLabel.setBackground(Color.BLACK);
		hearingLabel.setForeground(new Color(255, 255, 255));
		hearingLabel.setText("HEARING");

		JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);

		panel_31.setLayout(null);
		panel_31.setBounds(10, 28, 417, 26);
		panel_28.add(panel_31);

		JxLabel adequateLabel = new JxLabel();
		adequateLabel.setTheme(theme);

		adequateLabel.setText("Adequate");
		adequateLabel.setBounds(10, 4, 61, 16);
		panel_31.add(adequateLabel);

		cbHearingAdequateRight = new JxCheckBox();
		cbHearingAdequateRight.setTheme(theme);

		cbHearingAdequateRight.setActionCommand("1");
		bgHearingRight.add(cbHearingAdequateRight);

		cbHearingAdequateRight.setText("Right");
		cbHearingAdequateRight.setBounds(167, 0, 74, 24);
		panel_31.add(cbHearingAdequateRight);

		cbHearingAdequateLeft = new JxCheckBox();
		cbHearingAdequateLeft.setTheme(theme);

		cbHearingAdequateLeft.setActionCommand("1");
		bgHearingLeft.add(cbHearingAdequateLeft);

		cbHearingAdequateLeft.setText("Left");
		cbHearingAdequateLeft.setBounds(283, 0, 118, 24);
		panel_31.add(cbHearingAdequateLeft);

		JxPanel panel_31_1 = new JxPanel();
		panel_31_1.setTheme(theme);
		panel_31_1.setBounds(10, 55, 417, 30);
		panel_28.add(panel_31_1);
		panel_31_1.setLayout(null);

		JxLabel adequateLabel_1 = new JxLabel();
		adequateLabel_1.setTheme(theme);

		adequateLabel_1.setText("Adequate with aid");
		adequateLabel_1.setBounds(10, 4, 133, 16);
		panel_31_1.add(adequateLabel_1);

		cbHearingAdequateWithAidRight = new JxCheckBox();
		cbHearingAdequateWithAidRight.setTheme(theme);

		cbHearingAdequateWithAidRight.setActionCommand("2");
		bgHearingRight.add(cbHearingAdequateWithAidRight);

		cbHearingAdequateWithAidRight.setText("Right");
		cbHearingAdequateWithAidRight.setBounds(167, 0, 74, 24);
		panel_31_1.add(cbHearingAdequateWithAidRight);

		cbHearingAdequateWithAidLeft = new JxCheckBox();
		cbHearingAdequateWithAidLeft.setTheme(theme);

		cbHearingAdequateWithAidLeft.setActionCommand("2");
		bgHearingLeft.add(cbHearingAdequateWithAidLeft);

		cbHearingAdequateWithAidLeft.setText("Left");
		cbHearingAdequateWithAidLeft.setBounds(283, 0, 118, 24);
		panel_31_1.add(cbHearingAdequateWithAidLeft);

		JxPanel panel_31_1_1 = new JxPanel();
		panel_31_1_1.setTheme(theme);
		panel_31_1_1.setLayout(null);

		panel_31_1_1.setBounds(10, 85, 417, 30);
		panel_28.add(panel_31_1_1);

		JxLabel adequateLabel_1_1 = new JxLabel();
		adequateLabel_1_1.setTheme(theme);

		adequateLabel_1_1.setText("Poor");
		adequateLabel_1_1.setBounds(10, 4, 133, 16);
		panel_31_1_1.add(adequateLabel_1_1);

		cbHearingPoorRight = new JxCheckBox();
		cbHearingPoorRight.setTheme(theme);

		cbHearingPoorRight.setActionCommand("3");
		bgHearingRight.add(cbHearingPoorRight);

		cbHearingPoorRight.setText("Right");
		cbHearingPoorRight.setBounds(167, 0, 74, 24);
		panel_31_1_1.add(cbHearingPoorRight);

		cbHearingPoorLeft = new JxCheckBox();
		cbHearingPoorLeft.setTheme(theme);

		cbHearingPoorLeft.setActionCommand("3");
		bgHearingLeft.add(cbHearingPoorLeft);

		cbHearingPoorLeft.setText("Left");
		cbHearingPoorLeft.setBounds(283, 0, 118, 24);
		panel_31_1_1.add(cbHearingPoorLeft);

		JxPanel panel_31_1_1_1 = new JxPanel();
		panel_31_1_1_1.setTheme(theme);
		panel_31_1_1_1.setLayout(null);

		panel_31_1_1_1.setBounds(10, 115, 417, 24);
		panel_28.add(panel_31_1_1_1);

		JxLabel adequateLabel_1_1_1 = new JxLabel();
		adequateLabel_1_1_1.setTheme(theme);

		adequateLabel_1_1_1.setText("Deaf");
		adequateLabel_1_1_1.setBounds(10, 4, 133, 16);
		panel_31_1_1_1.add(adequateLabel_1_1_1);

		cbHearingDeafRight = new JxCheckBox();
		cbHearingDeafRight.setTheme(theme);

		cbHearingDeafRight.setActionCommand("4");
		bgHearingRight.add(cbHearingDeafRight);

		cbHearingDeafRight.setText("Right");
		cbHearingDeafRight.setBounds(167, 0, 74, 24);
		panel_31_1_1_1.add(cbHearingDeafRight);

		cbHearingDeafLef = new JxCheckBox();
		cbHearingDeafLef.setTheme(theme);

		cbHearingDeafLef.setActionCommand("4");
		bgHearingLeft.add(cbHearingDeafLef);

		cbHearingDeafLef.setText("Left");
		cbHearingDeafLef.setBounds(283, 0, 118, 24);
		panel_31_1_1_1.add(cbHearingDeafLef);

		JxPanel panel_28_1 = new JxPanel();
		panel_28_1.setTheme(theme);
		panel_28_1.setPreferredSize(new Dimension(455, 142));
		panel_42.add(panel_28_1);
		panel_28_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_28_1.setLayout(null);

		JxPanel panel_30_1 = new JxPanel();
		panel_30_1.setTheme(theme);
		panel_30_1.setLayout(null);
		panel_30_1.setForeground(new Color(255, 255, 255));
		panel_30_1.setBackground(Color.BLACK);
		panel_30_1.setBounds(0, 0, 477, 26);
		panel_28_1.add(panel_30_1);

		JxLabel hearingLabel_1 = new JxLabel();
		hearingLabel_1.setTheme(theme);
		hearingLabel_1.setForeground(new Color(255, 255, 255));

		hearingLabel_1.setFontSize(14);
		hearingLabel_1.setFontStyle(Font.BOLD);
		hearingLabel_1.setBackground(Color.BLACK);
		hearingLabel_1.setText("VISION");
		hearingLabel_1.setBounds(181, 0, 71, 26);
		panel_30_1.add(hearingLabel_1);

		JxPanel panel_31_2 = new JxPanel();
		panel_31_2.setTheme(theme);
		panel_31_2.setLayout(null);

		panel_31_2.setBounds(10, 32, 437, 26);
		panel_28_1.add(panel_31_2);

		JxLabel adequateLabel_2 = new JxLabel();
		adequateLabel_2.setTheme(theme);

		adequateLabel_2.setText("Adequate");
		adequateLabel_2.setBounds(10, 4, 61, 16);
		panel_31_2.add(adequateLabel_2);

		cbVisionAdequateRight = new JxCheckBox();
		cbVisionAdequateRight.setTheme(theme);

		cbVisionAdequateRight.setActionCommand("1");
		bgVisionRight.add(cbVisionAdequateRight);

		cbVisionAdequateRight.setText("Right");
		cbVisionAdequateRight.setBounds(168, 0, 74, 24);
		panel_31_2.add(cbVisionAdequateRight);

		cbVisionAdequateLeft = new JxCheckBox();
		cbVisionAdequateLeft.setTheme(theme);

		cbVisionAdequateLeft.setActionCommand("1");
		bgVisionLeft.add(cbVisionAdequateLeft);

		cbVisionAdequateLeft.setText("Left");
		cbVisionAdequateLeft.setBounds(283, 0, 118, 24);
		panel_31_2.add(cbVisionAdequateLeft);

		JxPanel panel_31_1_2 = new JxPanel();
		panel_31_1_2.setTheme(theme);
		panel_31_1_2.setLayout(null);

		panel_31_1_2.setBounds(10, 55, 437, 30);
		panel_28_1.add(panel_31_1_2);

		JxLabel adequateLabel_1_2 = new JxLabel();
		adequateLabel_1_2.setTheme(theme);

		adequateLabel_1_2.setText("Adequate with glasses");
		adequateLabel_1_2.setBounds(10, 4, 133, 16);
		panel_31_1_2.add(adequateLabel_1_2);

		cbVisionAdequateGlassesRight = new JxCheckBox();
		cbVisionAdequateGlassesRight.setTheme(theme);

		cbVisionAdequateGlassesRight.setActionCommand("2");
		bgVisionRight.add(cbVisionAdequateGlassesRight);

		cbVisionAdequateGlassesRight.setText("Right");
		cbVisionAdequateGlassesRight.setBounds(167, 0, 74, 24);
		panel_31_1_2.add(cbVisionAdequateGlassesRight);

		cbVisionAdequateGlassesLeft = new JxCheckBox();
		cbVisionAdequateGlassesLeft.setTheme(theme);

		cbVisionAdequateGlassesLeft.setActionCommand("2");
		bgVisionLeft.add(cbVisionAdequateGlassesLeft);

		cbVisionAdequateGlassesLeft.setText("Left");
		cbVisionAdequateGlassesLeft.setBounds(283, 0, 118, 24);
		panel_31_1_2.add(cbVisionAdequateGlassesLeft);

		JxPanel panel_31_1_1_2 = new JxPanel();
		panel_31_1_1_2.setTheme(theme);
		panel_31_1_1_2.setLayout(null);

		panel_31_1_1_2.setBounds(10, 85, 437, 30);
		panel_28_1.add(panel_31_1_1_2);

		JxLabel adequateLabel_1_1_2 = new JxLabel();
		adequateLabel_1_1_2.setTheme(theme);

		adequateLabel_1_1_2.setText("Poor");
		adequateLabel_1_1_2.setBounds(10, 4, 133, 16);
		panel_31_1_1_2.add(adequateLabel_1_1_2);

		cbVisionPoorRight = new JxCheckBox();
		cbVisionPoorRight.setTheme(theme);

		cbVisionPoorRight.setActionCommand("3");
		bgVisionRight.add(cbVisionPoorRight);

		cbVisionPoorRight.setText("Right");
		cbVisionPoorRight.setBounds(167, 0, 74, 24);
		panel_31_1_1_2.add(cbVisionPoorRight);

		cbVisionPoorLeft = new JxCheckBox();
		cbVisionPoorLeft.setTheme(theme);

		cbVisionPoorLeft.setActionCommand("3");
		bgVisionLeft.add(cbVisionPoorLeft);

		cbVisionPoorLeft.setText("Left");
		cbVisionPoorLeft.setBounds(283, 0, 118, 24);
		panel_31_1_1_2.add(cbVisionPoorLeft);

		JxPanel panel_31_1_1_1_1 = new JxPanel();
		panel_31_1_1_1_1.setTheme(theme);
		panel_31_1_1_1_1.setLayout(null);

		panel_31_1_1_1_1.setBounds(10, 115, 437, 24);
		panel_28_1.add(panel_31_1_1_1_1);

		JxLabel adequateLabel_1_1_1_1 = new JxLabel();
		adequateLabel_1_1_1_1.setTheme(theme);

		adequateLabel_1_1_1_1.setText("Blind");
		adequateLabel_1_1_1_1.setBounds(10, 4, 133, 16);
		panel_31_1_1_1_1.add(adequateLabel_1_1_1_1);

		cbVisionBlindRight = new JxCheckBox();
		cbVisionBlindRight.setTheme(theme);

		cbVisionBlindRight.setActionCommand("4");
		bgVisionRight.add(cbVisionBlindRight);

		cbVisionBlindRight.setText("Right");
		cbVisionBlindRight.setBounds(167, 0, 74, 24);
		panel_31_1_1_1_1.add(cbVisionBlindRight);

		cbVisionBlindLeft = new JxCheckBox();
		cbVisionBlindLeft.setTheme(theme);

		cbVisionBlindLeft.setActionCommand("4");
		bgVisionLeft.add(cbVisionBlindLeft);

		cbVisionBlindLeft.setText("Left");
		cbVisionBlindLeft.setBounds(283, 0, 118, 24);
		panel_31_1_1_1_1.add(cbVisionBlindLeft);

		JxPanel panel = new JxPanel();

		panel.setTheme(theme);

		panel.setBounds(5, 743, 910, 90);
		panel.setTheme (theme);

		panel.setPreferredSize(new Dimension(910, 90));
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);

		add(panel);

		JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setBackground(Color.BLACK);
		panel_29.setLayout(null);
		panel_29.setBounds(0, 0, 910, 26);
		panel.add(panel_29);

		JxLabel eatingNutritionLabel = new JxLabel();
		eatingNutritionLabel.setTheme(theme);
		eatingNutritionLabel.setBounds(381, 0, 160, 30);
		panel_29.add(eatingNutritionLabel);
		eatingNutritionLabel.setForeground(new Color(255, 255, 255));

		eatingNutritionLabel.setFontSize(14);
		eatingNutritionLabel.setFontStyle(Font.BOLD);
		eatingNutritionLabel.setText("EATING & NUTRITION");

		rbEatingTPN = new JxRadioButton();
		rbEatingTPN.setTheme(theme);

		rbEatingTPN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				// txtEatingReason.setEnabled(true);
			}
		});
		rbEatingTPN.setActionCommand("5");
		bgEatingNutrition1.add(rbEatingTPN);

		rbEatingTPN.setText("TPN");
		rbEatingTPN.setBounds(56, 32, 55, 24);
		panel.add(rbEatingTPN);

		rbEatingNPO = new JxRadioButton();
		rbEatingNPO.setTheme(theme);

		rbEatingNPO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				// txtEatingReason.setEnabled(true);
			}
		});
		rbEatingNPO.setActionCommand("6");
		bgEatingNutrition1.add(rbEatingNPO);

		rbEatingNPO.setText("NPO");
		rbEatingNPO.setBounds(115, 32, 67, 24);
		panel.add(rbEatingNPO);

		JxLabel adaptiveEquipmentLabel = new JxLabel();
		adaptiveEquipmentLabel.setTheme(theme);

		adaptiveEquipmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adaptiveEquipmentLabel.setText("Adaptive Equipment");
		adaptiveEquipmentLabel.setBounds(0, 62, 124, 16);
		panel.add(adaptiveEquipmentLabel);

		txtEatingAdaptive = new JxText();
		txtEatingAdaptive.setTheme(theme);

		txtEatingAdaptive.setBounds(130, 62, 681, 20);
		panel.add(txtEatingAdaptive);

		cbEatingNA = new JxCheckBox();
		cbEatingNA.setTheme(theme);

		cbEatingNA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (cbEatingNA.isSelected()) {
					// rbEatingDependent.setEnabled(false);
					// rbEatingIndependent.setEnabled(false);
					// rbEatingNeedAssist.setEnabled(false);
					// rbEatingGT.setEnabled(false);
					rbEatingTPN.setEnabled(false);
					rbEatingNPO.setEnabled(false);
					// rbEatingDysphagic.setEnabled(false);
					// txtEatingReason.setEnabled(false);
					txtEatingAdaptive.setEnabled(false);

					// rbEatingDependent.setSelected(false);
					// rbEatingIndependent.setSelected(false);
					// rbEatingNeedAssist.setSelected(false);
					// rbEatingGT.setSelected(false);
					// rbEatingTPN.setSelected(false);
					// rbEatingNPO.setSelected(false);
					bgEatingNutrition1.clearSelection();
					txtEatingAdaptive.setText("");
				} else {
					// rbEatingDependent.setEnabled(true);
					// rbEatingIndependent.setEnabled(true);
					// rbEatingNeedAssist.setEnabled(true);
					// rbEatingGT.setEnabled(true);
					rbEatingTPN.setEnabled(true);
					rbEatingNPO.setEnabled(true);
					// rbEatingDysphagic.setEnabled(true);
					txtEatingAdaptive.setEnabled(true);
				}
			}
		});

		cbEatingNA.setText("N/A");
		cbEatingNA.setBounds(10, 32, 46, 22);
		panel.add(cbEatingNA);

		JxPanel panel_32 = new JxPanel();

		panel_32.setTheme(theme);

		panel_32.setBounds(5, 838, 910, 180);
		panel_32.setTheme (theme);

		panel_32.setPreferredSize(new Dimension(910, 180));
		panel_32.setBorder(new LineBorder(Color.black, 1, false));

		panel_32.setLayout(null);
		add(panel_32);

		JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBackground(Color.BLACK);
		panel_33.setLayout(null);
		panel_33.setBounds(0, 0, 910, 26);
		panel_32.add(panel_33);

		JxLabel oralAssessmentLabel = new JxLabel();
		oralAssessmentLabel.setTheme(theme);
		oralAssessmentLabel.setForeground(new Color(255, 255, 255));

		oralAssessmentLabel.setFontSize(14);
		oralAssessmentLabel.setFontStyle(Font.BOLD);
		oralAssessmentLabel.setText("ORAL ASSESSMENT");
		oralAssessmentLabel.setBounds(390, 0, 147, 26);
		panel_33.add(oralAssessmentLabel);

		JxLabel ownTeethLabel = new JxLabel();
		ownTeethLabel.setTheme(theme);

		ownTeethLabel.setText("Own Teeth");
		ownTeethLabel.setBounds(10, 32, 74, 16);
		panel_32.add(ownTeethLabel);

		rbOralOwnTeethYes = new JxRadioButton();
		rbOralOwnTeethYes.setTheme(theme);

		rbOralOwnTeethYes.setActionCommand("1");
		rbOralOwnTeethYes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				doEnableDisable();

			}

		});
		bgOralOwnTeeth.add(rbOralOwnTeethYes);

		rbOralOwnTeethYes.setText("Yes");
		rbOralOwnTeethYes.setBounds(94, 28, 57, 24);
		panel_32.add(rbOralOwnTeethYes);

		rbOralOwnTeethNo = new JxRadioButton();
		rbOralOwnTeethNo.setTheme(theme);

		rbOralOwnTeethNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doEnableDisable();
			}
		});
		rbOralOwnTeethNo.setActionCommand("2");
		bgOralOwnTeeth.add(rbOralOwnTeethNo);

		rbOralOwnTeethNo.setText("No");
		rbOralOwnTeethNo.setBounds(157, 28, 57, 24);
		panel_32.add(rbOralOwnTeethNo);

		JxLabel conditionOfTeethLabel = new JxLabel();
		conditionOfTeethLabel.setTheme(theme);

		conditionOfTeethLabel.setText("Condition of teeth");
		conditionOfTeethLabel.setBounds(312, 32, 111, 16);
		panel_32.add(conditionOfTeethLabel);

		txtOralCondition = new JxText();
		txtOralCondition.setTheme(theme);

		txtOralCondition.setBounds(429, 30, 381, 20);
		panel_32.add(txtOralCondition);

		JxLabel denturesLabel = new JxLabel();
		denturesLabel.setTheme(theme);

		denturesLabel.setText("Dentures");
		denturesLabel.setBounds(10, 62, 66, 16);
		panel_32.add(denturesLabel);

		rbOralDenturesYes = new JxRadioButton();
		rbOralDenturesYes.setTheme(theme);

		bgOralDentures.add(rbOralDenturesYes);

		rbOralDenturesYes.setText("Yes");
		rbOralDenturesYes.setBounds(94, 58, 57, 24);
		panel_32.add(rbOralDenturesYes);

		rbOralDenturesNo = new JxRadioButton();
		rbOralDenturesNo.setTheme(theme);

		bgOralDentures.add(rbOralDenturesNo);

		rbOralDenturesNo.setText("No");
		rbOralDenturesNo.setBounds(157, 58, 57, 24);
		panel_32.add(rbOralDenturesNo);

		JxLabel upperLabel = new JxLabel();
		upperLabel.setTheme(theme);

		upperLabel.setText("Upper -");
		upperLabel.setBounds(94, 93, 50, 16);
		panel_32.add(upperLabel);

		JxLabel lowerLabel = new JxLabel();
		lowerLabel.setTheme(theme);

		lowerLabel.setText("Lower -");
		lowerLabel.setBounds(94, 115, 66, 16);
		panel_32.add(lowerLabel);

		rbOralUpperComplete = new JxRadioButton();
		rbOralUpperComplete.setTheme(theme);

		bgOralUpper.add(rbOralUpperComplete);

		rbOralUpperComplete.setText("Complete");
		rbOralUpperComplete.setBounds(157, 88, 130, 24);
		panel_32.add(rbOralUpperComplete);

		rbOralLowerComplete = new JxRadioButton();
		rbOralLowerComplete.setTheme(theme);

		bgOralLower.add(rbOralLowerComplete);

		rbOralLowerComplete.setText("Complete");
		rbOralLowerComplete.setBounds(157, 111, 130, 24);
		panel_32.add(rbOralLowerComplete);

		rbOralUpperPartial = new JxRadioButton();
		rbOralUpperPartial.setTheme(theme);

		bgOralUpper.add(rbOralUpperPartial);

		rbOralUpperPartial.setText("Partial");
		rbOralUpperPartial.setBounds(293, 89, 130, 24);
		panel_32.add(rbOralUpperPartial);

		rbOralLowerPartial = new JxRadioButton();
		rbOralLowerPartial.setTheme(theme);

		bgOralLower.add(rbOralLowerPartial);

		rbOralLowerPartial.setText("Partial");
		rbOralLowerPartial.setBounds(293, 111, 130, 24);
		panel_32.add(rbOralLowerPartial);

		rbOralUpperWornfull = new JxRadioButton();
		rbOralUpperWornfull.setTheme(theme);

		bgOralUpper.add(rbOralUpperWornfull);

		rbOralUpperWornfull.setText("Worn full time");
		rbOralUpperWornfull.setBounds(429, 89, 130, 24);
		panel_32.add(rbOralUpperWornfull);

		rbOralLowerWornFull = new JxRadioButton();
		rbOralLowerWornFull.setTheme(theme);

		bgOralLower.add(rbOralLowerWornFull);

		rbOralLowerWornFull.setText("Worn full time");
		rbOralLowerWornFull.setBounds(429, 111, 130, 24);
		panel_32.add(rbOralLowerWornFull);

		rbOralUpperWornWhenEating = new JxRadioButton();
		rbOralUpperWornWhenEating.setTheme(theme);

		bgOralUpper.add(rbOralUpperWornWhenEating);

		rbOralUpperWornWhenEating.setText("Worn only when eating");
		rbOralUpperWornWhenEating.setBounds(604, 89, 164, 24);
		panel_32.add(rbOralUpperWornWhenEating);

		rbOralLowerRemoved = new JxRadioButton();
		rbOralLowerRemoved.setTheme(theme);

		bgOralLower.add(rbOralLowerRemoved);

		rbOralLowerRemoved.setText("Removed for eating");
		rbOralLowerRemoved.setBounds(604, 111, 164, 24);
		panel_32.add(rbOralLowerRemoved);

		JxLabel doDenturesFitLabel = new JxLabel();
		doDenturesFitLabel.setTheme(theme);

		doDenturesFitLabel.setText("Do Dentures Fit ?");
		doDenturesFitLabel.setBounds(10, 146, 119, 16);
		panel_32.add(doDenturesFitLabel);

		rbOralDoDenturesYes = new JxRadioButton();
		rbOralDoDenturesYes.setTheme(theme);

		bgOralDoDentureFit.add(rbOralDoDenturesYes);

		rbOralDoDenturesYes.setText("Yes");
		rbOralDoDenturesYes.setBounds(120, 142, 66, 24);
		panel_32.add(rbOralDoDenturesYes);

		rbOralLowerDoDenturesNo = new JxRadioButton();
		rbOralLowerDoDenturesNo.setTheme(theme);

		bgOralDoDentureFit.add(rbOralLowerDoDenturesNo);

		rbOralLowerDoDenturesNo.setText("No");
		rbOralLowerDoDenturesNo.setBounds(189, 141, 57, 24);
		panel_32.add(rbOralLowerDoDenturesNo);

		JxLabel residentsWillNotLabel = new JxLabel();
		residentsWillNotLabel.setTheme(theme);

		residentsWillNotLabel.setText("Residents will not wear, explain");
		residentsWillNotLabel.setBounds(293, 146, 191, 16);
		panel_32.add(residentsWillNotLabel);

		txtOralResidentWillNot = new JxText();
		txtOralResidentWillNot.setTheme(theme);

		txtOralResidentWillNot.setBounds(460, 144, 320, 20);
		panel_32.add(txtOralResidentWillNot);

		JxPanel panel_34 = new JxPanel();

		panel_34.setTheme(theme);

		panel_34.setBounds(5, 1023, 910, 272);
		panel_34.setTheme (theme);

		panel_34.setPreferredSize(new Dimension(910, 285));
		panel_34.setBorder(new LineBorder(Color.black, 1, false));

		panel_34.setLayout(null);
		add(panel_34);

		JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBounds(0, 0, 910, 30);
		panel_34.add(panel_35);
		panel_35.setLayout(null);
		panel_35.setBackground(Color.BLACK);

		JxLabel bowelBladderLabel = new JxLabel();
		bowelBladderLabel.setTheme(theme);
		bowelBladderLabel.setForeground(new Color(255, 255, 255));

		bowelBladderLabel.setFontSize(14);
		bowelBladderLabel.setFontStyle(Font.BOLD);
		bowelBladderLabel.setText("BOWEL & BLADDER EVALUATION");
		bowelBladderLabel.setBounds(381, 10, 262, 16);
		panel_35.add(bowelBladderLabel);

		JxLabel usesLabel = new JxLabel();
		usesLabel.setTheme(theme);

		usesLabel.setText("Uses :");
		usesLabel.setBounds(10, 36, 66, 16);
		panel_34.add(usesLabel);

		cbBowelToilet = new JxCheckBox();
		cbBowelToilet.setTheme(theme);

		cbBowelToilet.setText("Toilet");
		cbBowelToilet.setBounds(58, 32, 66, 24);
		panel_34.add(cbBowelToilet);

		cbBowelUrinal = new JxCheckBox();
		cbBowelUrinal.setTheme(theme);

		cbBowelUrinal.setText("Urinal");
		cbBowelUrinal.setBounds(154, 32, 86, 24);
		panel_34.add(cbBowelUrinal);

		cbBowelBedPan = new JxCheckBox();
		cbBowelBedPan.setTheme(theme);

		cbBowelBedPan.setText("Bedpan");
		cbBowelBedPan.setBounds(259, 32, 86, 24);
		panel_34.add(cbBowelBedPan);

		cbBowelBedside = new JxCheckBox();
		cbBowelBedside.setTheme(theme);

		cbBowelBedside.setText("Bedside Commode");
		cbBowelBedside.setBounds(379, 32, 154, 24);
		panel_34.add(cbBowelBedside);

		JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);

		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBounds(10, 58, 345, 170);
		panel_34.add(panel_36);

		JxLabel bowelHabitsLabel = new JxLabel();
		bowelHabitsLabel.setTheme(theme);

		bowelHabitsLabel.setFontSize(12);
		bowelHabitsLabel.setFontStyle(Font.BOLD);
		bowelHabitsLabel.setText("BOWEL HABITS :");
		bowelHabitsLabel.setBounds(10, 10, 140, 16);
		panel_36.add(bowelHabitsLabel);

		JxLabel continentLabel = new JxLabel();
		continentLabel.setTheme(theme);

		continentLabel.setText("Continent");
		continentLabel.setBounds(20, 32, 66, 16);
		panel_36.add(continentLabel);

		rbBowelContinentYes = new JxRadioButton();
		rbBowelContinentYes.setTheme(theme);

		bgBowelContinent.add(rbBowelContinentYes);

		rbBowelContinentYes.setText("Yes");
		rbBowelContinentYes.setBounds(112, 28, 46, 24);
		panel_36.add(rbBowelContinentYes);

		rbBowelContinentNo = new JxRadioButton();
		rbBowelContinentNo.setTheme(theme);

		bgBowelContinent.add(rbBowelContinentNo);

		rbBowelContinentNo.setText("No");
		rbBowelContinentNo.setBounds(174, 28, 46, 24);
		panel_36.add(rbBowelContinentNo);

		JxLabel constipatedLabel = new JxLabel();
		constipatedLabel.setTheme(theme);

		constipatedLabel.setText("Constipated");
		constipatedLabel.setBounds(20, 54, 83, 16);
		panel_36.add(constipatedLabel);

		JxLabel laxativeUsedLabel = new JxLabel();
		laxativeUsedLabel.setTheme(theme);

		laxativeUsedLabel.setText("Laxative used");
		laxativeUsedLabel.setBounds(20, 76, 83, 16);
		panel_36.add(laxativeUsedLabel);

		JxLabel enemasUsedLabel = new JxLabel();
		enemasUsedLabel.setTheme(theme);

		enemasUsedLabel.setText("Enemas used");
		enemasUsedLabel.setBounds(20, 101, 83, 16);
		panel_36.add(enemasUsedLabel);

		rbBowelConstipatedYes = new JxRadioButton();
		rbBowelConstipatedYes.setTheme(theme);

		bgBowelConstipated.add(rbBowelConstipatedYes);

		rbBowelConstipatedYes.setText("Yes");
		rbBowelConstipatedYes.setBounds(112, 50, 46, 24);
		panel_36.add(rbBowelConstipatedYes);

		rbBowelLaxativeYes = new JxRadioButton();
		rbBowelLaxativeYes.setTheme(theme);

		bgBowelLaxative.add(rbBowelLaxativeYes);

		rbBowelLaxativeYes.setText("Yes");
		rbBowelLaxativeYes.setBounds(112, 72, 46, 24);
		panel_36.add(rbBowelLaxativeYes);

		rbBowelEnemasYes = new JxRadioButton();
		rbBowelEnemasYes.setTheme(theme);

		bgBowelEnemas.add(rbBowelEnemasYes);

		rbBowelEnemasYes.setText("Yes");
		rbBowelEnemasYes.setBounds(112, 97, 46, 24);
		panel_36.add(rbBowelEnemasYes);

		rbBowelConstipatedNo = new JxRadioButton();
		rbBowelConstipatedNo.setTheme(theme);

		bgBowelConstipated.add(rbBowelConstipatedNo);

		rbBowelConstipatedNo.setText("No");
		rbBowelConstipatedNo.setBounds(174, 50, 46, 24);
		panel_36.add(rbBowelConstipatedNo);

		rbBowelLaxativeNo = new JxRadioButton();
		rbBowelLaxativeNo.setTheme(theme);

		bgBowelLaxative.add(rbBowelLaxativeNo);

		rbBowelLaxativeNo.setText("No");
		rbBowelLaxativeNo.setBounds(174, 72, 46, 24);
		panel_36.add(rbBowelLaxativeNo);

		rbBowelEnemasNo = new JxRadioButton();
		rbBowelEnemasNo.setTheme(theme);

		bgBowelEnemas.add(rbBowelEnemasNo);

		rbBowelEnemasNo.setText("No");
		rbBowelEnemasNo.setBounds(174, 97, 46, 24);
		panel_36.add(rbBowelEnemasNo);

		JxLabel dailyBowelMoementLabel = new JxLabel();
		dailyBowelMoementLabel.setTheme(theme);

		dailyBowelMoementLabel.setText("Daily bowel movement");
		dailyBowelMoementLabel.setBounds(20, 145, 130, 16);
		panel_36.add(dailyBowelMoementLabel);

		txtBowelMovement = new JxText();
		txtBowelMovement.setTheme(theme);

		txtBowelMovement.setBounds(156, 145, 179, 20);
		panel_36.add(txtBowelMovement);

		JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBorder(new LineBorder(Color.black, 1, false));

		panel_37.setLayout(null);
		panel_37.setBounds(364, 58, 536, 170);
		panel_34.add(panel_37);

		JxLabel bladderHabitsLabel = new JxLabel();
		bladderHabitsLabel.setTheme(theme);

		bladderHabitsLabel.setFontSize(12);
		bladderHabitsLabel.setFontStyle(Font.BOLD);
		bladderHabitsLabel.setText("BLADDER HABITS :");
		bladderHabitsLabel.setBounds(10, 10, 237, 16);
		panel_37.add(bladderHabitsLabel);

		JxLabel continentLabel_1 = new JxLabel();
		continentLabel_1.setTheme(theme);

		continentLabel_1.setText("Continent");
		continentLabel_1.setBounds(10, 32, 66, 16);
		panel_37.add(continentLabel_1);

		rbBladderContinentYes = new JxRadioButton();
		rbBladderContinentYes.setTheme(theme);

		rbBladderContinentYes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setContinent(true);
				// doLoad();
			}
		});
		bgBladderContinent.add(rbBladderContinentYes);

		rbBladderContinentYes.setText("Yes");
		rbBladderContinentYes.setBounds(95, 28, 55, 24);
		panel_37.add(rbBladderContinentYes);

		rbBladderContinentNo = new JxRadioButton();
		rbBladderContinentNo.setTheme(theme);

		rbBladderContinentNo.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setContinent(false);
				// doLoad();
			}
		});
		bgBladderContinent.add(rbBladderContinentNo);

		rbBladderContinentNo.setText("No");
		rbBladderContinentNo.setBounds(163, 28, 46, 24);
		panel_37.add(rbBladderContinentNo);

		JxLabel urineColorLabel = new JxLabel();
		urineColorLabel.setTheme(theme);

		urineColorLabel.setText("Urine Color");
		urineColorLabel.setBounds(10, 54, 66, 16);
		panel_37.add(urineColorLabel);

		txtBladderUrineColor = new JxText();
		txtBladderUrineColor.setTheme(theme);

		txtBladderUrineColor.setBounds(95, 52, 187, 20);
		panel_37.add(txtBladderUrineColor);

		JxLabel consistencyLabel = new JxLabel();
		consistencyLabel.setTheme(theme);

		consistencyLabel.setText("Consistency");
		consistencyLabel.setBounds(288, 54, 78, 16);
		panel_37.add(consistencyLabel);

		txtBladderUrineConsistency = new JxText();
		txtBladderUrineConsistency.setTheme(theme);

		txtBladderUrineConsistency.setBounds(372, 52, 154, 20);
		panel_37.add(txtBladderUrineConsistency);

		cbBladderDribble = new JxCheckBox();
		cbBladderDribble.setTheme(theme);

		cbBladderDribble.setText("Dribble");
		cbBladderDribble.setBounds(10, 75, 72, 16);
		panel_37.add(cbBladderDribble);

		JxLabel timeOfLastLabel = new JxLabel();
		timeOfLastLabel.setTheme(theme);

		timeOfLastLabel.setText("Time of last voiding");
		timeOfLastLabel.setBounds(10, 145, 125, 16);
		panel_37.add(timeOfLastLabel);

		txtBladderTime = new JxText();
		txtBladderTime.setTheme(theme);

		txtBladderTime.setBounds(141, 145, 264, 20);
		panel_37.add(txtBladderTime);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme(theme);
		panel_41.setLayout(null);
		panel_41.setAutoscrolls(true);

		panel_41.setBounds(10, 100, 395, 39);
		panel_37.add(panel_41);

		final JxLabel sizeLabel_1 = new JxLabel();
		sizeLabel_1.setTheme(theme);
		sizeLabel_1.setBounds(204, 8, 21, 14);

		sizeLabel_1.setText("Size");
		sizeLabel_1.setVisible(false);

		final JxText textField = new JxText();
		textField.setTheme(theme);
		textField.setBounds(230, 5, 150, 20);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				if (!textField.getText().equalsIgnoreCase("")) {
					setFoleySize(Integer.parseInt(textField.getText()));
				}
			}
		});
		textField.setPreferredSize(new Dimension(150, 20));
		textField.setVisible(false);

		cbBladderCatheter = new JxCheckBox();
		cbBladderCatheter.setTheme(theme);
		cbBladderCatheter.setBounds(0, 6, 73, 23);

		cbBladderCatheter.setHorizontalAlignment(SwingConstants.LEFT);
		panel_41.add(cbBladderCatheter);
		cbBladderCatheter.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbBladderCatheter.isSelected()) {
					setCatheter(true);
					cmbCatherType.setVisible(true);
					if (cmbCatherType.getSelectedItem().toString()
							.equalsIgnoreCase("Foley")) {
						sizeLabel_1.setVisible(true);
						textField.setVisible(true);
					}
				} else {
					setCatheter(false);
					cmbCatherType.setVisible(false);
					sizeLabel_1.setVisible(false);
					textField.setVisible(false);
				}
			}
		});

		cbBladderCatheter.setText("Catheter");

		cmbCatherType = new JxComboBox();
		cmbCatherType.setTheme(theme);
		cmbCatherType.setBounds(79, 5, 120, 20);

		cmbCatherType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbCatherType.getSelectedItem().toString()
						.equalsIgnoreCase("Foley")) {
					sizeLabel_1.setVisible(true);
					textField.setVisible(true);
					setCatherType("Foley");
				} else {
					sizeLabel_1.setVisible(false);
					textField.setVisible(false);
					setCatherType(cmbCatherType.getSelectedItem() + "");
					setFoleySize(0);
				}
			}
		});
		cmbCatherType.setPreferredSize(new Dimension(120, 20));

		cmbCatherType.setModel(new DefaultComboBoxModel(new String[] { "",
				"Foley", "Superpubic", "Texas" }));
		cmbCatherType.setVisible(false);

		panel_41.add(cmbCatherType);
		panel_41.add(sizeLabel_1);
		panel_41.add(textField);

		JxLabel ifIncontinentCompleteLabel = new JxLabel();
		ifIncontinentCompleteLabel.setTheme(theme);
		ifIncontinentCompleteLabel
				.setText("IF INCONTINENT, COMPLETE INCONTINENCE ASSESSMENT - FORM N 106");
		ifIncontinentCompleteLabel.setBounds(10, 242, 694, 16);
		panel_34.add(ifIncontinentCompleteLabel);

		panel_38 = new JxPanel();

		panel_38.setTheme(theme);

		panel_38.setBounds(5, 1303, 910, 30);
		panel_38.setTheme (theme);

		panel_38.setPreferredSize(new Dimension(910, 30));

		panel_38.setLayout(null);
		add(panel_38);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);
		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_38.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);
		cmbNurse.setVisible(false);
		panel_38.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setText("Date :");
		dateLabel.setBounds(579, 5, 42, 16);
		panel_38.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(612, 1, 168, 26);
		panel_38.add(dcNurseVisit);

		final PanelloggedInUser panel_39 = new PanelloggedInUser();
		panel_39.setBounds(121, -1, 315, 22);
		panel_38.add(panel_39);

		doLoad();

		/*
		 * final JxRadioButton rbIsolationNo = new JxRadioButton();
		 * rbIsolationNo.setTheme (theme); rbIsolationNo.setActionCommand("2");
		 * bgIsolationType.add(rbIsolationNo);
		 * 
		 * rbIsolationNo.setFontSize(12);
		 * 
		 * rbIsolationNo.setOpaque(false); rbIsolationNo.setText("No");
		 * rbIsolationNo.setBounds(180, 21, 48, 17);
		 * panel_40.add(rbIsolationNo);
		 * 
		 * final JxRadioButton rbIsolationYes = new JxRadioButton();
		 * rbIsolationYes.setTheme (theme);
		 * rbIsolationYes.setActionCommand("1");
		 * bgIsolationType.add(rbIsolationYes);
		 * 
		 * rbIsolationYes.setFontSize(12);
		 * 
		 * rbIsolationYes.setOpaque(false); rbIsolationYes.setText("Yes");
		 * rbIsolationYes.setBounds(120, 20, 55, 18);
		 * panel_40.add(rbIsolationYes);
		 */

		/*
		 * final JxLabel isolationTypeLabel = new JxLabel();
		 * isolationTypeLabel.setTheme (theme);
		 * 
		 * isolationTypeLabel.setFontSize(14);
		 * isolationTypeLabel.setFontStyle(Font.BOLD);
		 * isolationTypeLabel.setText("Isolation Type");
		 * isolationTypeLabel.setBounds(122, 0, 144, 18);
		 * panel_40.add(isolationTypeLabel);
		 */

	}

	protected void doEnableDisable() {
		if (rbOralOwnTeethYes.isSelected()) {
			txtOralCondition.setEditable(true);
		} else {
			txtOralCondition.setEditable(false);
		}
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
		updateDiagnosis();
		updateAllergies();
	}

	public void fillCombos() {
		/*
		 * cmbPulse.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * "", "Regular", "Irregular" }));
		 */
		cmbCommunicationLanguages
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"English", "Spanish", "Portuguese", "Polish", "French",
						"German", "Other" }));

		String doctorName = "";
		List l = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				l = MedrexClientManager.getInstance().getPhysicianForms(
						Global.currentResidenceKey);
				Iterator<PhysicianForm> i = l.iterator();
				while (i.hasNext()) {
					PhysicianForm Phyform = i.next();
					Doctors d = MedrexClientManager.getInstance()
					// pavan changed
							.getDoctorsRecord(
									Phyform.getPhysician().getSerial());
					// System.out.println(d.getDoctorType());
					if (d.getDoctorType().getMsterName().equalsIgnoreCase(
							"PHYSICIAN")) {
						// System.out.println("in if");
						doctorName = d.getPhysicianSurName() + " , "
								+ d.getPhysicianName();
					}
				}
				lblAttendingPhysician.setText(doctorName);
			} catch (Exception e) {

			}
		}
		// UserLogon ul = new UserLogon();
		// try {
		// ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Users user = new Users();
		// try {
		// user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// cmbNurse.addItem(user.getUserName());
		try {
			List<Nurse> nurList = MedrexClientManager.getInstance()
					.getNurseRecords();
			Iterator<Nurse> i = nurList.iterator();
			while (i.hasNext()) {
				Nurse nur = i.next();
				cmbNurse.addItem(nur.getNurseSurName() + " , "
						+ nur.getNurseName());
			}
		} catch (Exception e) {
		}
	}

	private void updateAllergies() {
		List<ResidentAllergies> allergyList = null; // new ArrayList();
		String tmp = "";
		try {
			allergyList = MedrexClientManager
					.getInstance()
					.getResidentAllergiesforResident(Global.currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < allergyList.size(); i++) {
			ResidentAllergies allergy = allergyList.get(i);
			if (allergy.isConfirmed()) {
				tmp += allergy.getName();
				if (i != allergyList.size() - 1) {
					tmp += ", ";
				}
			}
		}
		lblAllergies.setText(tmp);
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
		lblPrimaryDiagnosis.setText(tmp);
		lblPrimaryDiagnosis.setToolTipText(tmp);
		lblPrimaryDiagnosis.setSelectionStart(0);
		lblPrimaryDiagnosis.setSelectionEnd(0);
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		dcAdmissionDate.setDate(null);
		lblLastName.setText(rm.getUserPass());
		lblFirstName.setText(rm.getUserName());

		if (rm.getLanguage().toString().equalsIgnoreCase("English")) {
			cmbCommunicationLanguages.setSelectedIndex(0);
		} else if (rm.getLanguage().toString().equalsIgnoreCase("Spanish")) {
			cmbCommunicationLanguages.setSelectedIndex(1);
		} else {
			cmbCommunicationLanguages.setSelectedIndex(6);
		}
		lblTransferringFacility.setText("");
		lblTransporteBy.setText("");
		lblTimeAdmitted.setText("");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		lblDOB.setText(sdf.format(rm.getDob()));

		lblAge.setText(Utils.getResidentAgeYear() + "");

		lblSex.setText(rm.getSex().toString());
		// lblPrimaryDiagnosis.setText("");
		txtVitalSigns.setText("");
		txtTemp.setText("");
		txtResp.setText("");
		txtO2Sat.setText("");
		txtWeight.setText("");
		txtHeight.setText("");

		CensusStatus refCensusStatus = null;
		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(Global.currentResidenceKey);
		} catch (Exception e) {
		}

		if (refCensusStatus != null) {
			dcAdmissionDate.setDate(refCensusStatus.getTimestamp());
			Format formatter = new SimpleDateFormat("yyyy/dd/MM hh:mm a");
			lblTimeAdmitted.setText("  "
					+ formatter.format(refCensusStatus.getTimestamp()));
			String AdmittedFrom = null;
			if (refCensusStatus.getFromId() == 1) {
				AdmittedFrom = "Hospital";
			}
			if (refCensusStatus.getFromId() == 2) {
				AdmittedFrom = "Home";
			}
			if (refCensusStatus.getFromId() == 3) {
				AdmittedFrom = "Other Facility";
			}
			if (refCensusStatus.getFromId() == 3) {
				AdmittedFrom = "Other";
			}
			AdmissionFromSubHead afsh = null;
			try {
				afsh = MedrexClientManager
						.getInstance()
						.getAdmissionFromSubHead(refCensusStatus.getFromSubId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			String AdmittedFromSubHeading = afsh.getName();
			if (AdmittedFrom == null) {
				AdmittedFrom = "Other";
				lblTransferringFacility.setText(AdmittedFrom + " : "
						+ AdmittedFromSubHeading);
			} else {
				lblTransferringFacility.setText(AdmittedFrom + " : "
						+ AdmittedFromSubHeading);
			}
			AdmissionTransportation at = null;
			if (refCensusStatus.getFromTransport() != 0) {
				try {
					at = MedrexClientManager.getInstance()
							.getAdmissionTransportation(
									refCensusStatus.getFromTransport());
				} catch (Exception e) {
					e.printStackTrace();
				}
				lblTransporteBy.setText(at.getName());
			} else {
				lblTransporteBy.setText("");
			}
		}
		if (Global.currentResidentAssessmentFormKey == 0) {

			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				lblRoomNum.setText(roomHist.getRoom());
			}
			rbCommunicationClear.setSelected(false);
			rbCommunicationAphasic.setSelected(false);
			rbCommunicationDysphasic.setSelected(false);
			// rbCommOrientedNo.setSelected(false);

			cbCommunicationTime.setSelected(false);
			;
			cbCommunicationPlace.setSelected(false);
			;
			cbCommunicationPerson.setSelected(false);
			;
			cbHearingAdequateRight.setSelected(false);
			;
			cbHearingAdequateLeft.setSelected(false);
			;
			cbHearingAdequateWithAidRight.setSelected(false);
			;
			cbHearingAdequateWithAidLeft.setSelected(false);
			;
			cbHearingPoorRight.setSelected(false);
			;
			cbHearingPoorLeft.setSelected(false);
			;
			cbHearingDeafRight.setSelected(false);
			;
			cbHearingDeafLef.setSelected(false);
			;
			cbVisionAdequateRight.setSelected(false);
			;
			cbVisionAdequateLeft.setSelected(false);
			;
			cbVisionAdequateGlassesRight.setSelected(false);
			;
			cbVisionAdequateGlassesLeft.setSelected(false);
			;
			cbVisionPoorRight.setSelected(false);
			;
			cbVisionPoorLeft.setSelected(false);
			;
			cbVisionBlindRight.setSelected(false);
			;
			cbVisionBlindLeft.setSelected(false);
			;
			rbEatingTPN.setSelected(false);
			rbEatingNPO.setSelected(false);
			txtEatingAdaptive.setText("");
			rbOralOwnTeethYes.setSelected(false);
			rbOralOwnTeethNo.setSelected(false);
			txtOralCondition.setText("");
			rbOralDenturesYes.setSelected(false);
			rbOralDenturesNo.setSelected(false);
			rbOralUpperComplete.setSelected(false);
			rbOralLowerComplete.setSelected(false);
			rbOralUpperPartial.setSelected(false);
			rbOralLowerPartial.setSelected(false);
			rbOralUpperWornfull.setSelected(false);
			rbOralLowerWornFull.setSelected(false);
			rbOralUpperWornWhenEating.setSelected(false);
			rbOralLowerRemoved.setSelected(false);
			rbOralDoDenturesYes.setSelected(false);
			rbOralLowerDoDenturesNo.setSelected(false);
			txtOralResidentWillNot.setText("");
			cbBowelToilet.setSelected(false);
			cbBowelUrinal.setSelected(false);
			cbBowelBedPan.setSelected(false);
			cbBowelBedside.setSelected(false);
			rbBowelContinentYes.setSelected(false);
			rbBowelContinentNo.setSelected(false);
			rbBowelConstipatedYes.setSelected(false);
			rbBowelLaxativeYes.setSelected(false);
			rbBowelEnemasYes.setSelected(false);
			rbBowelConstipatedNo.setSelected(false);
			rbBowelLaxativeNo.setSelected(false);
			rbBowelEnemasNo.setSelected(false);
			txtBowelMovement.setText("");
			rbBladderContinentYes.setSelected(false);
			rbBladderContinentNo.setSelected(false);
			txtBladderUrineColor.setText("");
			txtBladderUrineConsistency.setText("");
			cbBladderDribble.setSelected(false);
			cbBladderCatheter.setSelected(false);
			cmbCatherType.setSelectedItem("");
			txtBladderTime.setText("");
			txtPulse.setText("");
			/* cmbPulse.setSelectedIndex(0); */
			cbEatingNA.setSelected(false);

			// try {
			//				
			//				
			// list = MedrexClientManager.getInstance().getUsers();
			//				
			// Iterator it = list.iterator();
			// cmbNurse.removeAllItems();
			// while (it.hasNext()) {
			// Users u = (Users) it.next();
			// if (u.getUserType().equalsIgnoreCase("Nurse")){
			//
			// Nurse n = (Nurse)
			// MedrexClientManager.getInstance().getNurseRecord(u
			// .getSerial());
			//
			//					
			//
			// cmbNurse.addItem(n.getNurseName() + " "
			// + n.getNurseSurName());
			// }
			// else{
			//						
			// try {
			// u =
			// MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			// if (u.getUserType().equalsIgnoreCase("Nurse")) {
			// Nurse n = (Nurse)
			// MedrexClientManager.getInstance().getNurseRecord(u
			// .getUserId());
			// cmbNurse.removeAllItems();
			// cmbNurse.addItem(n.getNurseName() + " "
			// + n.getNurseSurName());
			// }
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
			// }
			// }
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
			doEnableDisable();
		} else {
			ResidentAssessmentFormPage1 rafp1 = null;
			try {
				rafp1 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage1(
								(Global.currentResidentAssessmentFormKey));
			} catch (Exception e) {

			}
			lblAllergies.setText(rafp1.getAllergies());
			// lblPrimaryDiagnosis.setText(rafp1.getPrimaryDiagnosis());

			SwingUtils.setSelectedButton(bgResidentAddmission, rafp1
					.getRadmission());
			SwingUtils.setSelectedButton(bgResidentAddmission, rafp1
					.getRreadmission());
			SwingUtils.setSelectedButton(bgResidentAddmission, rafp1
					.getSignificantChange());
			SwingUtils.setSelectedButton(bgIsolationType, rafp1
					.getIsolationType());

			switch (rafp1.getCommunicationType()) {
			case 1:
				rbCommunicationClear.setSelected(true);
				break;
			case 2:
				rbCommunicationAphasic.setSelected(true);
				break;
			case 3:
				rbCommunicationDysphasic.setSelected(true);
				break;
			}

			cmbCommunicationLanguages.setSelectedItem(rafp1
					.getCommunicationLanguage());

			rbMakesSelfUnderstand.setSelected(false);
			rbUnderstand.setSelected(false);
			rbUsuallyUnderstand.setSelected(false);
			// rbReadily.setSelected(false);
			// rbReluctantly.setSelected(false);
			// rbInappropriately.setSelected(false);

			switch (rafp1.getCommunicationAnswers()) {
			case 1:
				rbMakesSelfUnderstand.setSelected(true);
				break;
			case 2:
				rbUnderstand.setSelected(true);
				break;
			case 3:
				rbUsuallyUnderstand.setSelected(true);
				break;
			}

			// rbCommOrientedYes.setSelected(false);
			// rbCommOrientedNo.setSelected(false);

			// switch (rafp1.getCommunicationOriented()) {
			// case 1:
			// rbCommOrientedYes.setSelected(true);
			// break;
			// case 2:
			// rbCommOrientedNo.setSelected(true);
			// break;
			// }

			cbCommunicationTime.setSelected(rafp1
					.isCommunicationDisorientedTime());

			cbCommunicationPlace.setSelected(rafp1
					.isCommunicationDisorientedPlace());

			cbCommunicationPerson.setSelected(rafp1
					.isCommunicationDisorientedPerson());

			cbHearingAdequateRight.setSelected(rafp1.isHearingAdequateRight());

			cbHearingAdequateLeft.setSelected(rafp1.isHearingAdequateLeft());

			cbHearingAdequateWithAidRight.setSelected(rafp1
					.isHearingAdequateAidRight());

			cbHearingAdequateWithAidLeft.setSelected(rafp1
					.isHearingAdequateAidLeft());

			cbHearingPoorRight.setSelected(rafp1.isHearingPoorRight());

			cbHearingPoorLeft.setSelected(rafp1.isHearingPoorLeft());

			cbHearingDeafRight.setSelected(rafp1.isHearingDeafRight());

			cbHearingDeafLef.setSelected(rafp1.isHearingDeafLeft());

			cbVisionAdequateRight.setSelected(rafp1.isVisionAdequateRight());

			cbVisionAdequateLeft.setSelected(rafp1.isVisionAdequateLeft());

			cbVisionAdequateGlassesRight.setSelected(rafp1
					.isVisionAdequateGlassesRight());

			cbVisionAdequateGlassesLeft.setSelected(rafp1
					.isVisionAdequateGlassesLeft());

			cbVisionPoorRight.setSelected(rafp1.isVisionPoorRight());

			cbVisionPoorLeft.setSelected(rafp1.isVisionPoorLeft());

			cbVisionBlindRight.setSelected(rafp1.isVisionBlindRight());

			cbVisionBlindLeft.setSelected(rafp1.isVisionBlindLeft());

			// rbEatingDependent.setSelected(false);
			// rbEatingIndependent.setSelected(false);
			// rbEatingNeedAssist.setSelected(false);
			// rbEatingGT.setSelected(false);
			rbEatingTPN.setSelected(false);
			rbEatingNPO.setSelected(false);
			// rbEatingDysphagic.setSelected(false);

			switch (rafp1.getEatingType()) {
			case 1:
				// rbEatingDependent.setSelected(true);
				break;
			case 2:
				// rbEatingIndependent.setSelected(true);
				break;
			case 3:
				// rbEatingNeedAssist.setSelected(true);
				break;
			case 4:
				// rbEatingGT.setSelected(true);
				break;
			case 5:
				rbEatingTPN.setSelected(true);
				break;
			case 6:
				rbEatingNPO.setSelected(true);
				break;
			case 7:
				// rbEatingDysphagic.setSelected(true);
				break;

			}

			dcAdmissionDate.setDate(rafp1.getAdmissionDate());

			// txtEatingReason.setText(rafp1.getEatingReason());
			txtEatingAdaptive.setText(rafp1.getEatingAdaptive());

			rbOralOwnTeethYes.setSelected(false);
			rbOralOwnTeethNo.setSelected(false);

			switch (rafp1.getOralOwnTeeth()) {
			case 1:
				rbOralOwnTeethYes.setSelected(true);
				break;
			case 2:
				rbOralOwnTeethNo.setSelected(true);
				break;
			}

			txtOralCondition.setText("");

			rbOralDenturesYes.setSelected(false);
			rbOralDenturesNo.setSelected(false);

			switch (rafp1.getOralDentures()) {
			case 1:
				rbOralDenturesYes.setSelected(true);
				break;
			case 2:
				rbOralDenturesNo.setSelected(true);
				break;
			}

			rbOralUpperComplete.setSelected(false);
			rbOralLowerComplete.setSelected(false);
			rbOralUpperPartial.setSelected(false);
			rbOralLowerPartial.setSelected(false);
			rbOralUpperWornfull.setSelected(false);
			rbOralLowerWornFull.setSelected(false);
			rbOralUpperWornWhenEating.setSelected(false);
			rbOralLowerRemoved.setSelected(false);
			rbOralDoDenturesYes.setSelected(false);
			rbOralLowerDoDenturesNo.setSelected(false);
			txtOralResidentWillNot.setText("");

			switch (rafp1.getOralUpper()) {
			case 1:
				rbOralUpperComplete.setSelected(true);
				break;
			case 2:
				rbOralUpperPartial.setSelected(true);
				break;
			case 3:
				rbOralUpperWornfull.setSelected(true);
				break;
			case 4:
				rbOralUpperWornWhenEating.setSelected(true);
				break;
			}

			switch (rafp1.getOralLower()) {
			case 1:
				rbOralLowerComplete.setSelected(true);
				break;
			case 2:
				rbOralLowerPartial.setSelected(true);
				break;
			case 3:
				rbOralLowerWornFull.setSelected(true);
				break;
			case 4:
				rbOralLowerRemoved.setSelected(true);
				break;
			}

			switch (rafp1.getOralDentureFit()) {
			case 1:
				rbOralDoDenturesYes.setSelected(true);
				break;
			case 2:
				rbOralLowerDoDenturesNo.setSelected(true);
				break;
			}

			txtOralResidentWillNot.setText(rafp1.getOralResident());

			cbBowelToilet.setSelected(rafp1.isBowelTypeToilet());
			cbBowelUrinal.setSelected(rafp1.isBowelTypeUrinal());
			cbBowelBedPan.setSelected(rafp1.isBowelTypeBedpan());
			cbBowelBedside.setSelected(rafp1.isBowelTypeBedside());

			if (rafp1.isEatingNA()) {
				cbEatingNA.setSelected(rafp1.isEatingNA());

				// rbEatingDependent.setEnabled(false);
				// rbEatingIndependent.setEnabled(false);
				// rbEatingNeedAssist.setEnabled(false);
				// rbEatingGT.setEnabled(false);
				rbEatingTPN.setEnabled(false);
				rbEatingNPO.setEnabled(false);
				// rbEatingDysphagic.setEnabled(false);
				txtEatingAdaptive.setEnabled(false);

				// rbEatingDependent.setSelected(false);
				// rbEatingIndependent.setSelected(false);
				// rbEatingNeedAssist.setSelected(false);
				// rbEatingGT.setSelected(false);
				// rbEatingTPN.setSelected(false);
				// rbEatingNPO.setSelected(false);
				// rbEatingDysphagic.setSelected(false);
				txtEatingAdaptive.setText("");
			} else {
				// rbEatingDependent.setEnabled(true);
				// rbEatingIndependent.setEnabled(true);
				// rbEatingNeedAssist.setEnabled(true);
				// rbEatingGT.setEnabled(true);
				rbEatingTPN.setEnabled(true);
				rbEatingNPO.setEnabled(true);
				// rbEatingDysphagic.setEnabled(true);
				txtEatingAdaptive.setEnabled(true);
			}

			rbBowelContinentYes.setSelected(false);
			rbBowelContinentNo.setSelected(false);
			rbBowelConstipatedYes.setSelected(false);
			rbBowelLaxativeYes.setSelected(false);
			rbBowelEnemasYes.setSelected(false);
			rbBowelConstipatedNo.setSelected(false);
			rbBowelLaxativeNo.setSelected(false);
			rbBowelEnemasNo.setSelected(false);
			txtBowelMovement.setText("");

			switch (rafp1.getBowelContinent()) {
			case 1:
				rbBowelContinentYes.setSelected(true);
				break;
			case 2:
				rbBowelContinentNo.setSelected(true);
				break;
			}

			switch (rafp1.getBowelConstipated()) {
			case 1:
				rbBowelConstipatedYes.setSelected(true);
				break;
			case 2:
				rbBowelConstipatedNo.setSelected(true);
				break;
			}

			switch (rafp1.getBowelLaxative()) {
			case 1:
				rbBowelLaxativeYes.setSelected(true);
				break;
			case 2:
				rbBowelLaxativeNo.setSelected(true);
				break;
			}

			switch (rafp1.getBowelEnemas()) {
			case 1:
				rbBowelEnemasYes.setSelected(true);
				break;
			case 2:
				rbBowelEnemasNo.setSelected(true);
				break;
			}

			txtBowelMovement.setText(rafp1.getBowelMovement());

			rbBladderContinentYes.setSelected(false);
			rbBladderContinentNo.setSelected(false);

			switch (rafp1.getBladderContinent()) {
			case 1:
				rbBladderContinentYes.setSelected(true);
				break;
			case 2:
				rbBladderContinentNo.setSelected(true);
				break;
			}

			txtBladderUrineColor.setText(rafp1.getBladderUrineColor());
			txtBladderUrineConsistency.setText(rafp1
					.getBladderUrineConsistency());

			cbBladderDribble.setSelected(rafp1.isBladderDribble());
			cbBladderCatheter.setSelected(rafp1.isBladderCatheter());
			cmbCatherType.setSelectedItem(rafp1.getCatherType());
			// cbBladderFoley.setSelected(rafp1.isBladderFoley());
			// cbBladderSuprapubic.setSelected(rafp1.isBladderSuprapubic());
			// txtBladderSize.setText(rafp1.getBladderSize());
			txtBladderTime.setText(rafp1.getBladderTime());

			dcNurseVisit.setDate(rafp1.getNurseVisit());
			cmbNurse.setSelectedItem(rafp1.getNurse());
			// ---------------------
			// Fields That Are Added Later;
			lblLastName.setText(rafp1.getFirstName());
			lblFirstName.setText(rafp1.getFirstName());
			lblRoomNum.setText(rafp1.getRoomNo());
			lblTransferringFacility.setText(rafp1.getTransferringFacility());
			lblTransporteBy.setText(rafp1.getTransportedBy());
			lblTimeAdmitted.setText(rafp1.getTimeAddmitted());
			lblDOB.setText(rafp1.getDOB());
			lblAge.setText(rafp1.getAge());
			lblSex.setText(rafp1.getSex());
			lblAttendingPhysician.setText(rafp1.getAttendingPhysician());
			txtVitalSigns.setText(rafp1.getVitalSigns());
			/* cmbPulse.setSelectedItem(rafp1.getPulse()); */
			txtPulse.setText(rafp1.getPulse());
			txtTemp.setText(rafp1.getTemprature());
			txtResp.setText(rafp1.getRespiration());
			txtO2Sat.setText(rafp1.getO2Sat());
			txtWeight.setText(rafp1.getWeight());
			txtHeight.setText(rafp1.getHeight());
			SwingUtils.setSelectedButton(bgLivingWill, rafp1.getLivingWill());
			SwingUtils.setSelectedButton(bgDNROrder, rafp1.getDnrOrder());
			SwingUtils.setSelectedButton(bgHealthCareProxy, rafp1
					.getHealthCareProxy());
			txtNameBracelet.setText(rafp1.getNameBracelet());
			txtNamePlaceOnDoor.setText(rafp1.getNamePlaceOnDoor());
			SwingUtils.setSelectedButton(bgUnderstand, rafp1.getUnderstand());
			cbDoesUnderstandEnglish
					.setSelected(rafp1.isDoesUnderstandEnglish());
			SwingUtils.setSelectedButton(bgAbilityUnderstand, rafp1
					.getAbilityunderstand());
			System.out.println("Check selection"
					+ cbDoesUnderstandEnglish.isSelected());

			doEnableDisable();

		}

		try {
			Global.panelResidentAssessmentFormPage2.doUpdate();
			Global.panelResidentAssessmentFormPage3.doUpdate();
			Global.panelResidentAssessmentFormPage4.doUpdate();
			Global.panelResidentAssessmentFormPage5.doUpdate();
			Global.panelResidentAssessmentFormPage6.doUpdate();
			Global.panelResidentAssessmentFormPage7.doUpdate();
			Global.panelResidentAssessmentFormPage8.doUpdate();
			Global.panelResidentAssessmentFormPage9.doUpdate();
			Global.panelResidentAssessmentFormPage10.doUpdate();
		} catch (Exception e) {

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage1 rafp1 = new ResidentAssessmentFormPage1();

		rafp1.setSerial(Global.currentResidentAssessmentFormKey);

		rafp1.setAllergies(lblAllergies.getText());
		// rafp1.setPrimaryDiagnosis(lblPrimaryDiagnosis.getText());

		rafp1.setNurseVisit(dcNurseVisit.getDate());
		rafp1.setNurse((String) cmbNurse.getSelectedItem());

		rafp1.setRadmission(SwingUtils.getSelectedButton(bgResidentAddmission));
		rafp1.setRreadmission(SwingUtils
				.getSelectedButton(bgResidentAddmission));
		rafp1.setSignificantChange(SwingUtils
				.getSelectedButton(bgResidentAddmission));

		if (rbCommunicationClear.isSelected()) {
			rafp1.setCommunicationType(1);
		}

		if (rbCommunicationAphasic.isSelected()) {
			rafp1.setCommunicationType(2);
		}

		if (rbCommunicationDysphasic.isSelected()) {
			rafp1.setCommunicationType(3);
		}

		rafp1.setCommunicationLanguage((String) cmbCommunicationLanguages
				.getSelectedItem());

		/*
		 * if (rbCommOrientedYes.isSelected()) {
		 * rafp1.setCommunicationOriented(1); }
		 * 
		 * if (rbCommOrientedNo.isSelected()) {
		 * rafp1.setCommunicationOriented(2); }
		 */

		rafp1.setCommunicationDisorientedTime(cbCommunicationTime.isSelected());
		rafp1.setCommunicationDisorientedPlace(cbCommunicationPlace
				.isSelected());
		rafp1.setCommunicationDisorientedPerson(cbCommunicationPerson
				.isSelected());

		rafp1.setHearingAdequateRight(cbHearingAdequateRight.isSelected());
		rafp1.setHearingAdequateLeft(cbHearingAdequateLeft.isSelected());
		rafp1.setHearingAdequateAidRight(cbHearingAdequateWithAidRight
				.isSelected());
		rafp1.setHearingAdequateAidLeft(cbHearingAdequateWithAidLeft
				.isSelected());
		rafp1.setHearingPoorRight(cbHearingPoorRight.isSelected());
		rafp1.setHearingPoorLeft(cbHearingPoorLeft.isSelected());
		rafp1.setHearingDeafRight(cbHearingDeafRight.isSelected());
		rafp1.setHearingDeafLeft(cbHearingDeafLef.isSelected());

		rafp1.setVisionAdequateRight(cbVisionAdequateRight.isSelected());
		rafp1.setVisionAdequateLeft(cbVisionAdequateLeft.isSelected());
		rafp1.setVisionAdequateGlassesRight(cbVisionAdequateGlassesRight
				.isSelected());
		rafp1.setVisionAdequateGlassesLeft(cbVisionAdequateGlassesLeft
				.isSelected());
		rafp1.setVisionPoorRight(cbVisionPoorRight.isSelected());
		rafp1.setVisionPoorLeft(cbVisionPoorLeft.isSelected());
		rafp1.setVisionBlindRight(cbVisionBlindRight.isSelected());
		rafp1.setVisionBlindLeft(cbVisionBlindLeft.isSelected());
		rafp1.setIsolationType(SwingUtils.getSelectedButton(bgIsolationType));
		if (rbEatingTPN.isSelected()) {
			rafp1.setEatingType(5);
		}
		if (rbEatingNPO.isSelected()) {
			rafp1.setEatingType(6);
		}
		rafp1.setEatingAdaptive(txtEatingAdaptive.getText());

		if (rbOralOwnTeethYes.isSelected()) {
			rafp1.setOralOwnTeeth(1);
		}
		if (rbOralOwnTeethNo.isSelected()) {
			rafp1.setOralOwnTeeth(2);
		}

		txtOralCondition.setText(txtOralCondition.getText());

		if (rbOralOwnTeethYes.isSelected()) {
			rafp1.setOralOwnTeeth(1);
		}

		if (rbOralOwnTeethNo.isSelected()) {
			rafp1.setOralOwnTeeth(2);
		}

		if (rbOralUpperComplete.isSelected()) {
			rafp1.setOralUpper(1);
		}
		if (rbOralUpperPartial.isSelected()) {
			rafp1.setOralUpper(2);
		}
		if (rbOralUpperWornfull.isSelected()) {
			rafp1.setOralUpper(3);
		}
		if (rbOralUpperWornWhenEating.isSelected()) {
			rafp1.setOralUpper(4);
		}

		if (rbOralLowerComplete.isSelected()) {
			rafp1.setOralLower(1);
		}
		if (rbOralLowerPartial.isSelected()) {
			rafp1.setOralLower(2);
		}
		if (rbOralLowerWornFull.isSelected()) {
			rafp1.setOralLower(3);
		}
		if (rbOralLowerRemoved.isSelected()) {
			rafp1.setOralLower(4);
		}

		if (rbOralDoDenturesYes.isSelected()) {
			rafp1.setOralDentureFit(1);
		}
		if (rbOralLowerDoDenturesNo.isSelected()) {
			rafp1.setOralDentureFit(2);
		}

		rafp1.setOralResident(txtOralResidentWillNot.getText());

		rafp1.setBowelTypeToilet(cbBowelToilet.isSelected());
		rafp1.setBowelTypeUrinal(cbBowelUrinal.isSelected());
		rafp1.setBowelTypeBedpan(cbBowelBedPan.isSelected());
		rafp1.setBowelTypeBedside(cbBowelBedside.isSelected());

		if (rbBowelContinentYes.isSelected()) {
			rafp1.setBowelContinent(1);
		}
		if (rbBowelContinentNo.isSelected()) {
			rafp1.setBowelContinent(2);
		}

		if (rbBowelConstipatedYes.isSelected()) {
			rafp1.setBowelConstipated(1);
		}
		if (rbBowelConstipatedNo.isSelected()) {
			rafp1.setBowelConstipated(2);
		}

		if (rbBowelLaxativeYes.isSelected()) {
			rafp1.setBowelLaxative(1);
		}
		if (rbBowelLaxativeNo.isSelected()) {
			rafp1.setBowelLaxative(2);
		}

		if (rbBowelEnemasYes.isSelected()) {
			rafp1.setBowelEnemas(1);
		}
		if (rbBowelEnemasNo.isSelected()) {
			rafp1.setBowelEnemas(2);
		}

		rafp1.setBowelMovement(txtBowelMovement.getText());

		if (rbBladderContinentYes.isSelected()) {
			rafp1.setBladderContinent(1);
		}
		if (rbBladderContinentNo.isSelected()) {
			rafp1.setBladderContinent(2);
		}

		rafp1.setBladderUrineColor(txtBladderUrineColor.getText());
		rafp1.setBladderUrineConsistency(txtBladderUrineConsistency.getText());

		rafp1.setEatingNA(cbEatingNA.isSelected());
		rafp1.setBladderDribble(cbBladderDribble.isSelected());
		rafp1.setBladderCatheter(cbBladderCatheter.isSelected());
		rafp1.setCatherType(cmbCatherType.getSelectedItem() + "");
		rafp1.setBladderTime(txtBladderTime.getText());
		rafp1.setAdmissionDate(dcAdmissionDate.getDate());
		// fields that are added later
		rafp1.setLastName(lblLastName.getText());
		rafp1.setFirstName(lblFirstName.getText());
		rafp1.setRoomNo(lblRoomNum.getText());
		rafp1.setTransferringFacility(lblTransferringFacility.getText());
		rafp1.setTransportedBy(lblTransporteBy.getText());
		rafp1.setTimeAddmitted(lblTimeAdmitted.getText());
		rafp1.setDOB(lblDOB.getText());
		rafp1.setAge(lblAge.getText());
		rafp1.setSex(lblSex.getText());
		rafp1.setAttendingPhysician(lblAttendingPhysician.getText());
		rafp1.setVitalSigns(txtVitalSigns.getText());
		rafp1.setPulse(txtPulse.getText());
		rafp1.setTemprature(txtTemp.getText());
		rafp1.setRespiration(txtResp.getText());
		rafp1.setO2Sat(txtO2Sat.getText());
		rafp1.setWeight(txtWeight.getText());
		rafp1.setHeight(txtHeight.getText());
		rafp1.setNurseSignature(cmbNurse.getSelectedItem().toString());
		rafp1.setDnrOrder(SwingUtils.getSelectedButton(bgDNROrder));
		rafp1.setLivingWill(SwingUtils.getSelectedButton(bgLivingWill));
		rafp1.setHealthCareProxy(SwingUtils
				.getSelectedButton(bgHealthCareProxy));
		rafp1.setNameBracelet(txtNameBracelet.getText());
		rafp1.setNamePlaceOnDoor(txtNamePlaceOnDoor.getText());
		rafp1.setUnderstand(SwingUtils.getSelectedButton(bgUnderstand));
		rafp1.setDoesUnderstandEnglish(cbDoesUnderstandEnglish.isSelected());
		rafp1.setAbilityunderstand(SwingUtils
				.getSelectedButton(bgAbilityUnderstand));

		try {
			Global.currentResidentAssessmentFormKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage1(
							rafp1);
			saveAlertMessages("Resident Assessment Form Page 1 !!!!");
			// System.out.println("In Page1"+Global.currentResidentAssessmentFormKey);
			return (0);
		} catch (Exception e) {
			return (0);
		}

	}

	private void saveAlertMessages(String formName) {
		List<ValidationResult> vResList = new ArrayList<ValidationResult>();
		ValidationResult vResVital = FieldValidation.isNumericFieldWithRange(
				txtVitalSigns, "Vital Signs", 90, 170);
		ValidationResult vResPulse = FieldValidation.isNumericFieldWithRange(
				txtPulse, "Pulse", 50, 100);
		ValidationResult vResTemp = FieldValidation.isNumericFieldWithRange(
				txtTemp, "Temprature", 96, 100);
		ValidationResult vResResp = FieldValidation.isNumericFieldWithRange(
				txtResp, "Respiration", 12, 30);
		ValidationResult vResQ2Sat = FieldValidation
				.isNumericFieldWithMinimumRange(txtO2Sat, "Q2 Sat", 90);
		vResList.add(vResVital);
		vResList.add(vResPulse);
		vResList.add(vResTemp);
		vResList.add(vResResp);
		vResList.add(vResQ2Sat);

		/**
		 * Message Sender -class for sending messages containing Methods -
		 * getRecievers, send Message
		 **/
		MessageSender.sendMessage(vResList, formName, "Administrator");

	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				bgCommunication, "Commnunication Options"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				bgResidentAddmission, "Admission Options"))) {
			vRes.addAllFrom(temp);
		}
		/*
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * bgCommunicationOriented, "Commnunication Oriented Options"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isAnySelected( bgHearingRight,
		 * "Hearing Right Ear Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * bgHearingLeft, "Hearing Left Ear Options"))) { vRes.addAllFrom(temp);
		 * } if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * bgVisionRight, "Hearing Right Vision Options"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation.isAnySelected( bgVisionLeft,
		 * "Hearing Left Vision Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * bgEatingNutrition1, "Eating & Nutrition Options"))) {
		 * vRes.addAllFrom(temp); } if (!FieldValidation.isEmpty(temp =
		 * FieldValidation .isNonEmptyAlphaField(txtEatingReason,
		 * "Eating Reason Field", 0, 255))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation
		 * .isNonEmptyAlphaField(txtEatingAdaptive, "Eating Adaptive Field", 0,
		 * 255))) { vRes.addAllFrom(temp); }
		 */

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 1");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			// FieldValidation.Msgbox("Saved successfully!!!",
			// "Resident Assessment Form: Page 1");
			return true;
		}
	}

	public boolean isContinent() {
		return isContinent;
	}

	public void setContinent(boolean isContinent) {
		this.isContinent = isContinent;
	}

	public boolean isCatheter() {
		return isCatheter;
	}

	public void setCatheter(boolean isCatheter) {
		this.isCatheter = isCatheter;
	}

	public String getCatherType() {
		return catherType;
	}

	public void setCatherType(String catherType) {
		this.catherType = catherType;
	}

	public int getFoleySize() {
		return foleySize;
	}

	public void setFoleySize(int foleySize) {
		this.foleySize = foleySize;
	}

	public void setVitals(ResidentVitalSigns vital) {
		vitals = vital;
		updateVitals();

	}

	private void updateVitals() {
		txtVitalSigns.setText(vitals.getBp() + "");
		txtTemp.setText(vitals.getTemprature() + "");
		txtPulse.setText(vitals.getPulse() + "");
		txtWeight.setText(vitals.getWeight() + "");
	}

	public ResidentVitalSigns getVitals() {
		return vitals;
	}

}
