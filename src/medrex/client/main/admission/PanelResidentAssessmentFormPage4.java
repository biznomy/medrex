package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage4;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage4 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -222810269615790117L;

	Theme theme = new BlackOverWhiteTheme();

	private JxText txtCpapSetting;
	private JxText txtTrachSize;
	private JxText txtTrachType;
	private JxComboBox cmbOxygenVia;
	private JxCheckBox cbPortNA;
	private JxDateChooser dcPortDate;
	private JxText txtPortLocation;
	private JxText txtPortType;
	private JxCheckBox cbMidlineNA;
	private JxDateChooser dcMidlineDate;
	private JxText txtMidlineLocation;
	private JxText txtMidlineType;
	private JxText txtShuntThrill;
	private ButtonGroup bgPitting = new ButtonGroup();
	private ButtonGroup bgShortnessOfBreath = new ButtonGroup();
	private JxText txtShuntBruit;
	private JxText txtShuntLocation;
	private JxText txtShuntType;
	private JxCheckBox cbCentralLineNA;
	private JxDateChooser dcCentralLineDate;
	private JxText txtCentralLineLocation;
	private JxText txtCentralLineType;
	private JxCheckBox cbPeripheralNA;
	private JxDateChooser dcPeripheralDate;
	private JxText txtPeripheralLocation;
	private JxText txtPeripheralLineType;
	private JxCheckBox cbDryness;
	private JxRadioButton rbShortnessOfBreath;
	private JxRadioButton rbCongestion;
	private JxText textField_1;
	private JxText textField;
	private JxRadioButton rbNonProductive;
	private JxRadioButton rbProductive;
	private JxRadioButton rbCough;
	private JxText txtRalesLocation;
	private JxText txtInspiratoryWheezeLocation;
	private JxText txtBreathSoundLocation;
	private JxRadioButton rbPanpitaionNo;
	private JxRadioButton rbPanpitaionYes;
	private JxRadioButton rbShortnessOfBreathOnExertion;
	private JxRadioButton rbShortnessOfBreathAtRest;
	private JxRadioButton rbShortnessOfBreathNotPresent;
	private JxRadioButton rbShortnessOfBreathPresent;
	private JxCheckBox cbChestPain;
	private JxComboBox cmbPitting;
	private JxCheckBox cbJVD;
	private JxCheckBox cbPedal;
	private ButtonGroup bgPanpirations = new ButtonGroup();
	private ButtonGroup bgCaugh = new ButtonGroup();
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JxComboBox cmbDizinessOn;
	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	// private JxDateChooser dcNurseVisit;
	private JxLabel lblNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_11;
	private ButtonGroup bgDizziness = new ButtonGroup();
	private ButtonGroup bgFootConsultation = new ButtonGroup();
	private ButtonGroup bgFootToeNails = new ButtonGroup();
	private ButtonGroup bgFootToes = new ButtonGroup();
	private ButtonGroup bgFootHeels = new ButtonGroup();
	private ButtonGroup bgFootPain = new ButtonGroup();
	private ButtonGroup bgRespiratory = new ButtonGroup();
	private ButtonGroup bgEdemaPitting = new ButtonGroup();
	private ButtonGroup bgEdema = new ButtonGroup();
	private ButtonGroup bgCapillary = new ButtonGroup();
	private ButtonGroup bgDefibrillator = new ButtonGroup();
	private ButtonGroup bgPacemaker = new ButtonGroup();
	private ButtonGroup bgCardioRight = new ButtonGroup();
	private ButtonGroup bgCardioLeft = new ButtonGroup();
	// private JxNotes txtShunts;
	// private JxNotes txtCentralSites;
	// JxNotes txtPeriPherial;
	JxRadioButton rbDizzinessYes;
	JxRadioButton rbDizzinessNo;
	JxRadioButton rbCardioLeftPalpable;
	JxRadioButton rbCardioLeftNotPalpable;
	JxRadioButton rbCardioRightPalpable;
	JxRadioButton rbCardioRightNotPalpable;
	JxRadioButton rbPacemakerYes;
	JxRadioButton rbPacemakerNo;
	JxDateChooser dateLastCheck;
	JxRadioButton rbDefibrillatorYes;
	JxRadioButton rbDefibrillatorNo;
	JxRadioButton rbCapillaryBrisk;
	JxRadioButton rbCapillarySluggish;
	JxRadioButton rbEdemaYes;
	JxRadioButton rbEdemaNo;
	JxRadioButton rbEdemaPitting;
	JxRadioButton rbEdemaNonPitting;
	JxRadioButton rbRespiratoryClear;
	JxRadioButton rbRespiratoryDiminished;
	JxRadioButton rbRespiratoryInspiratory;
	JxRadioButton rbRespiratoryRales;
	JxRadioButton rbRespiratoryRonchi;
	JxRadioButton rbRespiratoryExpiratory;
	JxRadioButton rbRespiratoryOther;
	JxText txtRespiratoryOther;
	JxRadioButton rbFootPainYes;
	JxRadioButton rbFootPainNo;
	JxText txtFootPain;
	JxRadioButton rbFootHeelsYes;
	JxRadioButton rbFootHeelNo;
	JxText txtFootHeels;
	JxRadioButton rbFootToesYes;
	JxRadioButton rbFootToesNo;
	JxText txtFootToes;
	JxRadioButton rbFootToeNailsYes;
	JxRadioButton rbFootToeNailsNo;
	JxText txtFootToesNails;
	JxRadioButton rbFootConsultationYes;
	JxRadioButton rbFootConsultationNo;
	JxText txtFootConsultation;
	JxText txtEdemaLocation;

	private Notes notesPeripheral;
	private Notes notesCentralSites;
	private Notes notesShunts;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage4() {
		super();
		setOpaque(true);
		setForeground(Color.WHITE);

		Global.panelResidentAssessmentFormPage4 = this;
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, true));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1050));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.setBounds(0, 29, 930, 26);
		add(panel);

		final JxLabel infusionAccessLabel = new JxLabel();
		infusionAccessLabel.setTheme(theme);

		infusionAccessLabel.setFontSize(14);
		infusionAccessLabel.setFontStyle(Font.BOLD);
		infusionAccessLabel.setForeground(new Color(255, 255, 255));
		infusionAccessLabel.setBackground(Color.BLACK);
		infusionAccessLabel.setText("INFUSION / ACCESS SITES");
		infusionAccessLabel.setBounds(390, 0, 188, 26);
		panel.add(infusionAccessLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(5, 60, 920, 28);
		add(panel_1);

		JxLabel peripherialSiteLabel = new JxLabel();
		peripherialSiteLabel.setTheme(theme);
		peripherialSiteLabel.setTheme(theme);
		peripherialSiteLabel.setText("Peripherial Line");
		peripherialSiteLabel.setBounds(10, 10, 97, 16);
		panel_1.add(peripherialSiteLabel);

		final JxLabel typeLabel = new JxLabel();
		typeLabel.setTheme(theme);
		typeLabel.setTheme(theme);
		typeLabel.setText("Type:");
		typeLabel.setBounds(112, 10, 37, 16);
		panel_1.add(typeLabel);

		txtPeripheralLineType = new JxText();
		txtPeripheralLineType.setTheme(theme);
		txtPeripheralLineType.setBounds(150, 5, 160, 20);
		panel_1.add(txtPeripheralLineType);

		final JxLabel locationLabel_1 = new JxLabel();
		locationLabel_1.setTheme(theme);
		locationLabel_1.setTheme(theme);
		locationLabel_1.setText("Location:");
		locationLabel_1.setBounds(316, 10, 60, 16);
		panel_1.add(locationLabel_1);

		txtPeripheralLocation = new JxText();
		txtPeripheralLocation.setTheme(theme);
		txtPeripheralLocation.setTheme(theme);
		txtPeripheralLocation.setBounds(372, 5, 147, 20);
		panel_1.add(txtPeripheralLocation);

		final JxLabel dateOfInsertionLabel = new JxLabel();
		dateOfInsertionLabel.setTheme(theme);
		dateOfInsertionLabel.setTheme(theme);
		dateOfInsertionLabel.setText("Date of Insertion:");
		dateOfInsertionLabel.setBounds(525, 10, 104, 16);
		panel_1.add(dateOfInsertionLabel);

		dcPeripheralDate = new JxDateChooser();
		dcPeripheralDate.setTheme(theme);
		dcPeripheralDate.setTheme(theme);
		dcPeripheralDate.setDateFormatString("MM/dd/yyyy");
		dcPeripheralDate.setBounds(623, 5, 112, 20);
		panel_1.add(dcPeripheralDate);

		cbPeripheralNA = new JxCheckBox();
		cbPeripheralNA.setTheme(theme);
		cbPeripheralNA.setTheme(theme);

		cbPeripheralNA.setText("N/A");
		cbPeripheralNA.setBounds(755, 8, 60, 20);
		panel_1.add(cbPeripheralNA);

		// final JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(128, 5, 782, 32);
		// panel_1.add(scrollPane);

		/*
		 * notesPeripheral = new Notes();
		 * notesPeripheral.setFormName("Resident Assessment Form");
		 * notesPeripheral.setUserId(Global.currentLoggedInUserKey);
		 * notesPeripheral.setNoteText("");
		 */

		// txtPeriPherial = new JxNotes();
		// // scrollPane.setViewportView(txtPeriPherial);
		// txtPeriPherial.setBorder(new LineBorder(Color.black, 1, false));
		// txtPeriPherial.setNotes(notesPeripheral);
		// txtPeriPherial.setBounds(128, 5, 782, 32);
		// panel_1.add(txtPeriPherial);
		/*
		 * txtPeriPherial = new JxNotes(isCategories);
		 * txtPeriPherial.setBorder(new LineBorder(Color.black, 1, false));
		 * txtPeriPherial.setNotes(notesPeripheral);
		 * txtPeriPherial.setBounds(128, 5, 782, 32);
		 * panel_1.add(txtPeriPherial);
		 */

		// txtPeriPherial.setLineWrap(true);
		// txtPeriPherial.setBounds(128, 10, 782, 32);
		// panel_1.add(txtPeriPherial);
		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setTheme(theme);
		panel_1_1.setLayout(null);

		panel_1_1.setBounds(5, 130, 917, 28);
		add(panel_1_1);

		final JxLabel peripherialSiteLabel_1 = new JxLabel();
		peripherialSiteLabel_1.setTheme(theme);
		peripherialSiteLabel_1.setTheme(theme);
		peripherialSiteLabel_1.setText("Central Line");
		peripherialSiteLabel_1.setBounds(10, 10, 95, 16);
		panel_1_1.add(peripherialSiteLabel_1);

		final JxLabel typeLabel_1 = new JxLabel();
		typeLabel_1.setTheme(theme);
		typeLabel_1.setTheme(theme);
		typeLabel_1.setText("Type:");
		typeLabel_1.setBounds(112, 8, 37, 16);
		panel_1_1.add(typeLabel_1);

		txtCentralLineType = new JxText();
		txtCentralLineType.setTheme(theme);
		txtCentralLineType.setTheme(theme);
		txtCentralLineType.setBounds(150, 2, 160, 20);
		panel_1_1.add(txtCentralLineType);

		final JxLabel locationLabel_2 = new JxLabel();
		locationLabel_2.setTheme(theme);
		locationLabel_2.setTheme(theme);
		locationLabel_2.setText("Location:");
		locationLabel_2.setBounds(316, 10, 60, 16);
		panel_1_1.add(locationLabel_2);

		txtCentralLineLocation = new JxText();
		txtCentralLineLocation.setTheme(theme);
		txtCentralLineLocation.setTheme(theme);
		txtCentralLineLocation.setBounds(372, 5, 147, 20);
		panel_1_1.add(txtCentralLineLocation);

		final JxLabel dateOfInsertionLabel_1 = new JxLabel();
		dateOfInsertionLabel_1.setTheme(theme);
		dateOfInsertionLabel_1.setTheme(theme);
		dateOfInsertionLabel_1.setText("Date of Insertion:");
		dateOfInsertionLabel_1.setBounds(525, 10, 105, 16);
		panel_1_1.add(dateOfInsertionLabel_1);

		dcCentralLineDate = new JxDateChooser();
		dcCentralLineDate.setTheme(theme);
		dcCentralLineDate.setTheme(theme);
		dcCentralLineDate.setDateFormatString("MM/dd/yyyy");
		dcCentralLineDate.setBounds(623, 5, 112, 20);
		panel_1_1.add(dcCentralLineDate);

		cbCentralLineNA = new JxCheckBox();
		cbCentralLineNA.setTheme(theme);
		cbCentralLineNA.setTheme(theme);

		cbCentralLineNA.setText("N/A");
		cbCentralLineNA.setBounds(755, 9, 60, 19);
		panel_1_1.add(cbCentralLineNA);

		// final JScrollPane scrollPane1 = new JScrollPane();
		// scrollPane1.setBounds(128, 5, 782, 32);
		// panel_1_1.add(scrollPane1);

		/*
		 * notesCentralSites = new Notes();
		 * notesCentralSites.setFormName("Resident Assessment Form");
		 * notesCentralSites.setUserId(Global.currentLoggedInUserKey);
		 * notesCentralSites.setNoteText("");
		 */

		/*
		 * txtCentralSites = new JxNotes(isCategories);
		 * //scrollPane1.setViewportView(txtCentralSites);
		 * txtCentralSites.setBorder(new LineBorder(Color.black, 1, false));
		 * txtCentralSites.setNotes(notesCentralSites);
		 * txtCentralSites.setBounds(128, 10, 782, 32);
		 * panel_1_1.add(txtCentralSites);
		 */

		// final JScrollPane scrollPane2 = new JScrollPane();
		// scrollPane2.setBounds(128, 5, 782, 32);
		// panel_1_1_1.add(scrollPane2);
		//		
		/*
		 * notesShunts = new Notes();
		 * notesShunts.setFormName("Resident Assessment Form");
		 * notesShunts.setUserId(Global.currentLoggedInUserKey);
		 * notesShunts.setNoteText("");
		 */

		/*
		 * txtShunts = new JxNotes(isCategories);
		 * //scrollPane2.setViewportView(txtShunts); txtShunts.setBorder(new
		 * LineBorder(Color.black, 1, false));
		 * txtShunts.setNotes(txtShunts.getNotes());
		 * //txtShunts.setLineWrap(true); txtShunts.setBounds(128, 10, 782, 32);
		 * panel_1_1_1.add(txtShunts);
		 */

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);
		panel_2.setTheme(theme);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 200, 930, 26);
		add(panel_2);

		final JxLabel infusionAccessLabel_1 = new JxLabel();
		infusionAccessLabel_1.setTheme(theme);

		infusionAccessLabel_1.setFontSize(14);
		infusionAccessLabel_1.setFontStyle(Font.BOLD);
		infusionAccessLabel_1.setForeground(new Color(255, 255, 255));
		infusionAccessLabel_1.setBackground(Color.BLACK);
		infusionAccessLabel_1.setText("CARDIOVASCULAR ASSESSMENT");
		infusionAccessLabel_1.setBounds(390, 0, 243, 26);
		panel_2.add(infusionAccessLabel_1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setTheme(theme);
		panel_3.setForeground(Color.WHITE);

		panel_3.setLayout(null);
		panel_3.setBounds(5, 232, 372, 31);
		Border lineBdr = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_3.setBorder(lineBdr);
		add(panel_3);

		final JxLabel txtdizziness = new JxLabel();
		txtdizziness.setTheme(theme);
		txtdizziness.setTheme(theme);
		txtdizziness.setText("Dizziness");
		txtdizziness.setBounds(10, 10, 64, 16);
		panel_3.add(txtdizziness);

		rbDizzinessYes = new JxRadioButton();
		rbDizzinessYes.setTheme(theme);
		rbDizzinessYes.setTheme(theme);
		rbDizzinessYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doEnabledCombo();
			}
		});
		bgDizziness.add(rbDizzinessYes);

		rbDizzinessYes.setText("Yes");
		rbDizzinessYes.setBounds(112, 6, 46, 24);
		panel_3.add(rbDizzinessYes);

		rbDizzinessNo = new JxRadioButton();
		rbDizzinessNo.setTheme(theme);
		rbDizzinessNo.setTheme(theme);
		rbDizzinessNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doDisabledCombo();
			}
		});
		bgDizziness.add(rbDizzinessNo);

		rbDizzinessNo.setText("No");
		rbDizzinessNo.setBounds(163, 6, 40, 24);
		panel_3.add(rbDizzinessNo);

		cmbDizinessOn = new JxComboBox();
		cmbDizinessOn.setTheme(theme);
		cmbDizinessOn.setTheme(theme);
		cmbDizinessOn.setEnabled(false);

		cmbDizinessOn.setModel(new DefaultComboBoxModel(new String[] {
				"At rest", "Upon standing", "With change in position" }));
		cmbDizinessOn.setBounds(241, 8, 121, 21);
		panel_3.add(cmbDizinessOn);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setTheme(theme);

		panel_5.setLayout(null);
		panel_5.setBounds(5, 303, 383, 55);
		Border lineBdr3 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_5.setBorder(lineBdr3);
		add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setTheme(theme);

		panel_6.setLayout(null);
		panel_6.setBounds(83, 10, 290, 20);
		panel_5.add(panel_6);

		rbCardioLeftPalpable = new JxRadioButton();
		rbCardioLeftPalpable.setTheme(theme);
		rbCardioLeftPalpable.setTheme(theme);
		bgCardioLeft.add(rbCardioLeftPalpable);

		rbCardioLeftPalpable.setText("Palpable");
		rbCardioLeftPalpable.setBounds(56, 4, 75, 18);
		panel_6.add(rbCardioLeftPalpable);

		rbCardioLeftNotPalpable = new JxRadioButton();
		rbCardioLeftNotPalpable.setTheme(theme);
		rbCardioLeftNotPalpable.setTheme(theme);
		bgCardioLeft.add(rbCardioLeftNotPalpable);

		rbCardioLeftNotPalpable.setText("Not Palpable");
		rbCardioLeftNotPalpable.setBounds(147, 5, 85, 17);
		panel_6.add(rbCardioLeftNotPalpable);

		final JxLabel leftLabel = new JxLabel();
		leftLabel.setTheme(theme);
		leftLabel.setTheme(theme);
		leftLabel.setText("Left:");
		leftLabel.setBounds(10, 8, 38, 12);
		panel_6.add(leftLabel);

		cbJVD = new JxCheckBox();
		cbJVD.setTheme(theme);
		cbJVD.setTheme(theme);

		cbJVD.setText("JVD");
		cbJVD.setBounds(240, 5, 49, 17);
		panel_6.add(cbJVD);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);

		panel_6_1.setBounds(83, 31, 290, 20);
		panel_5.add(panel_6_1);

		rbCardioRightPalpable = new JxRadioButton();
		rbCardioRightPalpable.setTheme(theme);
		rbCardioRightPalpable.setTheme(theme);
		bgCardioRight.add(rbCardioRightPalpable);

		rbCardioRightPalpable.setText("Palpable");
		rbCardioRightPalpable.setBounds(55, 4, 75, 12);
		panel_6_1.add(rbCardioRightPalpable);

		rbCardioRightNotPalpable = new JxRadioButton();
		rbCardioRightNotPalpable.setTheme(theme);
		rbCardioRightNotPalpable.setTheme(theme);
		bgCardioRight.add(rbCardioRightNotPalpable);

		rbCardioRightNotPalpable.setText("Not Palpable");
		rbCardioRightNotPalpable.setBounds(147, 4, 104, 12);
		panel_6_1.add(rbCardioRightNotPalpable);

		final JxLabel rightLabel = new JxLabel();
		rightLabel.setTheme(theme);
		rightLabel.setTheme(theme);
		rightLabel.setText("Right:");
		rightLabel.setBounds(10, 4, 37, 14);
		panel_6_1.add(rightLabel);

		cbPedal = new JxCheckBox();
		cbPedal.setTheme(theme);
		cbPedal.setTheme(theme);

		cbPedal.setText("Pedal");
		cbPedal.setBounds(10, 20, 53, 18);
		panel_5.add(cbPedal);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setTheme(theme);
		panel_7.setLayout(null);

		panel_7.setBounds(399, 303, 524, 26);
		Border lineBdr4 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_7.setBorder(lineBdr4);
		add(panel_7);

		final JxLabel pacemakerLabel = new JxLabel();
		pacemakerLabel.setTheme(theme);
		pacemakerLabel.setTheme(theme);
		pacemakerLabel.setText("Pacemaker");
		pacemakerLabel.setBounds(10, 3, 78, 23);
		panel_7.add(pacemakerLabel);

		rbPacemakerYes = new JxRadioButton();
		rbPacemakerYes.setTheme(theme);
		rbPacemakerYes.setTheme(theme);
		/*
		 * rbPacemakerYes.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(final MouseEvent e) { txtPacemakerRate.setEnabled(true);
		 * txtPacemakerRate.requestFocus(); } });
		 */
		bgPacemaker.add(rbPacemakerYes);

		rbPacemakerYes.setText("Yes");
		rbPacemakerYes.setBounds(94, 1, 52, 24);
		panel_7.add(rbPacemakerYes);

		rbPacemakerNo = new JxRadioButton();
		rbPacemakerNo.setTheme(theme);
		rbPacemakerNo.setTheme(theme);
		/*
		 * rbPacemakerNo.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(final MouseEvent e) { txtPacemakerRate.setText("");
		 * txtPacemakerRate.setEnabled(false); } });
		 */
		bgPacemaker.add(rbPacemakerNo);

		rbPacemakerNo.setText("No");
		rbPacemakerNo.setBounds(152, 1, 43, 24);
		panel_7.add(rbPacemakerNo);

		final JxLabel ifYesLabel = new JxLabel();
		ifYesLabel.setTheme(theme);
		ifYesLabel.setTheme(theme);
		ifYesLabel.setText("If Yes,");
		ifYesLabel.setBounds(201, 5, 43, 16);
		panel_7.add(ifYesLabel);

		final JxLabel dateLastCheckLabel = new JxLabel();
		dateLastCheckLabel.setTheme(theme);
		dateLastCheckLabel.setTheme(theme);
		dateLastCheckLabel.setText("Date Last Checked");
		dateLastCheckLabel.setBounds(250, 5, 116, 16);
		panel_7.add(dateLastCheckLabel);

		dateLastCheck = new JxDateChooser();
		dateLastCheck.setTheme(theme);
		dateLastCheck.setTheme(theme);
		dateLastCheck.setDateFormatString("MM/dd/yyyy");
		dateLastCheck.setBounds(370, 3, 134, 21);
		panel_7.add(dateLastCheck);

		final JxLabel capillaryRefillLabel = new JxLabel();
		capillaryRefillLabel.setTheme(theme);
		capillaryRefillLabel.setTheme(theme);
		capillaryRefillLabel.setText("Capillary Refill :");
		capillaryRefillLabel.setBounds(568, 400, 86, 16);
		add(capillaryRefillLabel);

		rbCapillaryBrisk = new JxRadioButton();
		rbCapillaryBrisk.setTheme(theme);
		rbCapillaryBrisk.setTheme(theme);
		bgCapillary.add(rbCapillaryBrisk);

		rbCapillaryBrisk.setText("Brisk (< 8 sec.)");
		rbCapillaryBrisk.setBounds(660, 400, 101, 16);
		add(rbCapillaryBrisk);

		rbCapillarySluggish = new JxRadioButton();
		rbCapillarySluggish.setTheme(theme);
		rbCapillarySluggish.setTheme(theme);
		bgCapillary.add(rbCapillarySluggish);

		rbCapillarySluggish.setText("Sluggish ( > 8 sec. )");
		rbCapillarySluggish.setBounds(775, 400, 120, 16);
		add(rbCapillarySluggish);

		final JxLabel edemaLabel = new JxLabel();
		edemaLabel.setTheme(theme);
		edemaLabel.setTheme(theme);
		edemaLabel.setText("Edema :");
		edemaLabel.setBounds(20, 432, 43, 12);
		add(edemaLabel);

		rbEdemaYes = new JxRadioButton();
		rbEdemaYes.setTheme(theme);
		rbEdemaYes.setTheme(theme);
		rbEdemaYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtEdemaLocation.setEditable(true);
				txtEdemaLocation.requestFocus();
			}
		});
		bgEdema.add(rbEdemaYes);

		rbEdemaYes.setText("Yes");
		rbEdemaYes.setBounds(72, 432, 43, 12);
		add(rbEdemaYes);

		rbEdemaNo = new JxRadioButton();
		rbEdemaNo.setTheme(theme);
		rbEdemaNo.setTheme(theme);
		rbEdemaNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				txtEdemaLocation.setText("");
				txtEdemaLocation.setEnabled(false);
			}
		});
		bgEdema.add(rbEdemaNo);

		rbEdemaNo.setText("No");
		rbEdemaNo.setBounds(121, 432, 43, 12);
		add(rbEdemaNo);

		final JxLabel ifYesLabel_1 = new JxLabel();
		ifYesLabel_1.setTheme(theme);
		ifYesLabel_1.setTheme(theme);
		ifYesLabel_1.setText("If Yes,");
		ifYesLabel_1.setBounds(170, 432, 38, 12);
		add(ifYesLabel_1);

		final JxLabel locationLabel = new JxLabel();
		locationLabel.setTheme(theme);
		locationLabel.setTheme(theme);
		locationLabel.setText("Location");
		locationLabel.setBounds(222, 432, 45, 12);
		add(locationLabel);

		txtEdemaLocation = new JxText();
		txtEdemaLocation.setTheme(theme);
		txtEdemaLocation.setTheme(theme);
		txtEdemaLocation.setBounds(280, 430, 640, 20);
		txtEdemaLocation.setEnabled(false);
		add(txtEdemaLocation);

		rbEdemaPitting = new JxRadioButton();
		rbEdemaPitting.setTheme(theme);
		rbEdemaPitting.setTheme(theme);
		rbEdemaPitting.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		bgPitting.add(rbEdemaPitting);

		rbEdemaPitting.setText("Pitting");
		rbEdemaPitting.setBounds(15, 369, 52, 16);
		add(rbEdemaPitting);

		rbEdemaNonPitting = new JxRadioButton();
		rbEdemaNonPitting.setTheme(theme);
		rbEdemaNonPitting.setTheme(theme);
		bgEdemaPitting.add(rbEdemaNonPitting);
		bgEdemaPitting.add(rbEdemaPitting);

		rbEdemaNonPitting.setText("Non Pitting");
		rbEdemaNonPitting.setBounds(143, 369, 94, 16);
		add(rbEdemaNonPitting);

		final JxPanel panel_2_1 = new JxPanel();
		panel_2_1.setTheme(theme);
		panel_2_1.setTheme(theme);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(0, 456, 930, 26);
		add(panel_2_1);

		final JxLabel infusionAccessLabel_1_1 = new JxLabel();
		infusionAccessLabel_1_1.setTheme(theme);

		infusionAccessLabel_1_1.setFontSize(14);
		infusionAccessLabel_1_1.setFontStyle(Font.BOLD);
		infusionAccessLabel_1_1.setForeground(new Color(255, 255, 255));
		infusionAccessLabel_1_1.setBackground(Color.BLACK);
		infusionAccessLabel_1_1.setText("RESPIRATORY ASSESSMENT");
		infusionAccessLabel_1_1.setBounds(390, 0, 243, 26);
		panel_2_1.add(infusionAccessLabel_1_1);

		final JxPanel panelCaugh = new JxPanel();
		panelCaugh.setTheme(theme);
		panelCaugh.setTheme(theme);
		// panelCaugh.setVisible(false);
		panelCaugh.setOpaque(false);
		panelCaugh.setLayout(null);
		panelCaugh.setBounds(335, 516, 232, 26);
		add(panelCaugh);

		rbRespiratoryClear = new JxRadioButton();
		rbRespiratoryClear.setTheme(theme);
		rbRespiratoryClear.setTheme(theme);
		rbRespiratoryClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryClear.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryClear);

		rbRespiratoryClear.setText("Clear");
		rbRespiratoryClear.setBounds(10, 488, 54, 24);
		add(rbRespiratoryClear);

		rbRespiratoryDiminished = new JxRadioButton();
		rbRespiratoryDiminished.setTheme(theme);
		rbRespiratoryDiminished.setTheme(theme);
		rbRespiratoryDiminished.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryDiminished.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryDiminished);

		rbRespiratoryDiminished.setText("Diminished Breath Sounds Location");
		rbRespiratoryDiminished.setBounds(68, 488, 195, 24);
		add(rbRespiratoryDiminished);

		rbRespiratoryInspiratory = new JxRadioButton();
		rbRespiratoryInspiratory.setTheme(theme);
		rbRespiratoryInspiratory.setTheme(theme);
		rbRespiratoryInspiratory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryInspiratory.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryInspiratory);

		rbRespiratoryInspiratory.setText("Inspiratory Wheeze Location");
		rbRespiratoryInspiratory.setBounds(335, 488, 165, 24);
		add(rbRespiratoryInspiratory);

		rbRespiratoryRales = new JxRadioButton();
		rbRespiratoryRales.setTheme(theme);
		rbRespiratoryRales.setTheme(theme);
		rbRespiratoryRales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryRales.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryRales);

		rbRespiratoryRales.setText("Rales Location");
		rbRespiratoryRales.setBounds(753, 488, 101, 24);
		add(rbRespiratoryRales);

		rbRespiratoryRonchi = new JxRadioButton();
		rbRespiratoryRonchi.setTheme(theme);
		rbRespiratoryRonchi.setTheme(theme);
		rbRespiratoryRonchi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryRonchi.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryRonchi);

		rbRespiratoryRonchi.setText("Ronchi (Location)");
		rbRespiratoryRonchi.setBounds(10, 518, 113, 24);
		add(rbRespiratoryRonchi);

		rbRespiratoryExpiratory = new JxRadioButton();
		rbRespiratoryExpiratory.setTheme(theme);
		rbRespiratoryExpiratory.setTheme(theme);
		rbRespiratoryExpiratory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryExpiratory.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryExpiratory);

		rbRespiratoryExpiratory.setText("Expiratory Wheeze");
		rbRespiratoryExpiratory.setBounds(581, 488, 120, 24);
		add(rbRespiratoryExpiratory);

		rbRespiratoryOther = new JxRadioButton();
		rbRespiratoryOther.setTheme(theme);
		rbRespiratoryOther.setTheme(theme);
		rbRespiratoryOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbRespiratoryOther.isSelected()) {
					// panelCaugh.setVisible(false);
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}
			}
		});
		bgRespiratory.add(rbRespiratoryOther);

		rbRespiratoryOther.setText("Other");
		rbRespiratoryOther.setBounds(10, 548, 66, 24);
		add(rbRespiratoryOther);

		txtRespiratoryOther = new JxText();
		txtRespiratoryOther.setTheme(theme);
		txtRespiratoryOther.setTheme(theme);

		txtRespiratoryOther.setBounds(135, 550, 66, 20);
		add(txtRespiratoryOther);

		final JxPanel panel_2_1_1 = new JxPanel();
		panel_2_1_1.setTheme(theme);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(0, 578, 930, 26);
		add(panel_2_1_1);

		final JxLabel infusionAccessLabel_1_1_1 = new JxLabel();
		infusionAccessLabel_1_1_1.setTheme(theme);

		infusionAccessLabel_1_1_1.setFontSize(14);
		infusionAccessLabel_1_1_1.setFontStyle(Font.BOLD);
		infusionAccessLabel_1_1_1.setForeground(new Color(255, 255, 255));
		infusionAccessLabel_1_1_1.setBackground(Color.BLACK);
		infusionAccessLabel_1_1_1.setText("FOOT ASSESSMENT");
		infusionAccessLabel_1_1_1.setBounds(390, 0, 243, 26);
		panel_2_1_1.add(infusionAccessLabel_1_1_1);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setTheme(theme);
		panel_8.setLayout(null);

		panel_8.setBounds(5, 610, 910, 62);
		add(panel_8);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setTheme(theme);
		label.setBounds(10, 5, 221, 16);
		label.setText("1. Is the resident experiencing pain?");
		panel_8.add(label);

		rbFootPainYes = new JxRadioButton();
		rbFootPainYes.setTheme(theme);
		rbFootPainYes.setTheme(theme);
		rbFootPainYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootPain.setEnabled(true);
				txtFootPain.requestFocus();
			}
		});
		bgFootPain.add(rbFootPainYes);

		rbFootPainYes.setText("Yes");
		rbFootPainYes.setBounds(350, 0, 54, 24);
		panel_8.add(rbFootPainYes);

		rbFootPainNo = new JxRadioButton();
		rbFootPainNo.setTheme(theme);
		rbFootPainNo.setTheme(theme);
		rbFootPainNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootPain.setText("");
				txtFootPain.setEnabled(false);
			}
		});
		bgFootPain.add(rbFootPainNo);

		rbFootPainNo.setText("No");
		rbFootPainNo.setBounds(410, 1, 64, 24);
		panel_8.add(rbFootPainNo);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setTheme(theme);
		panel_9.setLayout(null);

		panel_9.setBounds(10, 27, 890, 25);
		panel_8.add(panel_9);

		final JxLabel ifYesPleaseLabel = new JxLabel();
		ifYesPleaseLabel.setTheme(theme);
		ifYesPleaseLabel.setTheme(theme);
		ifYesPleaseLabel.setBounds(5, 5, 131, 16);
		ifYesPleaseLabel.setText("If yes, please explain");
		panel_9.add(ifYesPleaseLabel);

		txtFootPain = new JxText();
		txtFootPain.setTheme(theme);
		txtFootPain.setTheme(theme);
		txtFootPain.setBounds(144, 3, 736, 20);
		txtFootPain.setEnabled(false);
		panel_9.add(txtFootPain);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setTheme(theme);
		panel_8_1.setLayout(null);

		panel_8_1.setBounds(5, 678, 910, 62);
		add(panel_8_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setTheme(theme);
		label_1.setText("2. Any breaksown of skin or redness of heels ?");
		label_1.setBounds(10, 5, 289, 16);
		panel_8_1.add(label_1);

		rbFootHeelsYes = new JxRadioButton();
		rbFootHeelsYes.setTheme(theme);
		rbFootHeelsYes.setTheme(theme);
		rbFootHeelsYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootHeels.setEnabled(true);
				txtFootHeels.requestFocus();
			}
		});
		bgFootHeels.add(rbFootHeelsYes);

		rbFootHeelsYes.setText("Yes");
		rbFootHeelsYes.setBounds(350, 1, 54, 24);
		panel_8_1.add(rbFootHeelsYes);

		rbFootHeelNo = new JxRadioButton();
		rbFootHeelNo.setTheme(theme);
		rbFootHeelNo.setTheme(theme);
		rbFootHeelNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootHeels.setText("");
				txtFootHeels.setEnabled(false);
			}
		});
		bgFootHeels.add(rbFootHeelNo);

		rbFootHeelNo.setText("No");
		rbFootHeelNo.setBounds(410, 0, 58, 24);
		panel_8_1.add(rbFootHeelNo);

		final JxPanel panel_9_1 = new JxPanel();
		panel_9_1.setTheme(theme);
		panel_9_1.setTheme(theme);
		panel_9_1.setLayout(null);

		panel_9_1.setBounds(10, 27, 890, 25);
		panel_8_1.add(panel_9_1);

		final JxLabel ifYesPleaseLabel_1 = new JxLabel();
		ifYesPleaseLabel_1.setTheme(theme);
		ifYesPleaseLabel_1.setTheme(theme);
		ifYesPleaseLabel_1.setText("If yes, please explain");
		ifYesPleaseLabel_1.setBounds(5, 5, 127, 16);
		panel_9_1.add(ifYesPleaseLabel_1);

		txtFootHeels = new JxText();
		txtFootHeels.setTheme(theme);
		txtFootHeels.setTheme(theme);
		txtFootHeels.setBounds(144, 3, 736, 20);
		txtFootHeels.setEnabled(false);
		panel_9_1.add(txtFootHeels);

		final JxPanel panel_8_1_1 = new JxPanel();
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setLayout(null);

		panel_8_1_1.setBounds(5, 746, 910, 62);
		add(panel_8_1_1);

		final JxLabel anyBreaksownRLabel = new JxLabel();
		anyBreaksownRLabel.setTheme(theme);
		anyBreaksownRLabel.setTheme(theme);
		anyBreaksownRLabel
				.setText("3. Any break down or maceration between toes ?");
		anyBreaksownRLabel.setBounds(10, 5, 301, 16);
		panel_8_1_1.add(anyBreaksownRLabel);

		rbFootToesYes = new JxRadioButton();
		rbFootToesYes.setTheme(theme);
		rbFootToesYes.setTheme(theme);
		rbFootToesYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootToes.setEnabled(true);
				txtFootToes.requestFocus();
			}
		});
		bgFootToes.add(rbFootToesYes);

		rbFootToesYes.setText("Yes");
		rbFootToesYes.setBounds(350, 1, 54, 24);
		panel_8_1_1.add(rbFootToesYes);

		rbFootToesNo = new JxRadioButton();
		rbFootToesNo.setTheme(theme);
		rbFootToesNo.setTheme(theme);
		rbFootToesNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootToes.setText("");
				txtFootToes.setEnabled(false);
			}
		});
		bgFootToes.add(rbFootToesNo);

		rbFootToesNo.setText("No");
		rbFootToesNo.setBounds(410, 1, 54, 24);
		panel_8_1_1.add(rbFootToesNo);

		final JxPanel panel_9_1_1 = new JxPanel();
		panel_9_1_1.setTheme(theme);
		panel_9_1_1.setTheme(theme);
		panel_9_1_1.setLayout(null);

		panel_9_1_1.setBounds(10, 27, 890, 25);
		panel_8_1_1.add(panel_9_1_1);

		final JxLabel ifYesPleaseLabel_1_1 = new JxLabel();
		ifYesPleaseLabel_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1.setText("If yes, please explain");
		ifYesPleaseLabel_1_1.setBounds(5, 5, 134, 16);
		panel_9_1_1.add(ifYesPleaseLabel_1_1);

		txtFootToes = new JxText();
		txtFootToes.setTheme(theme);
		txtFootToes.setTheme(theme);
		txtFootToes.setBounds(144, 3, 736, 20);
		txtFootToes.setEnabled(false);
		panel_9_1_1.add(txtFootToes);

		final JxPanel panel_8_1_1_1 = new JxPanel();
		panel_8_1_1_1.setTheme(theme);
		panel_8_1_1_1.setTheme(theme);
		panel_8_1_1_1.setLayout(null);

		panel_8_1_1_1.setBounds(5, 815, 910, 62);
		add(panel_8_1_1_1);

		final JxLabel anyBreaksownRLabel_1 = new JxLabel();
		anyBreaksownRLabel_1.setTheme(theme);
		anyBreaksownRLabel_1.setTheme(theme);
		anyBreaksownRLabel_1.setText("4. Any sign of ingrown toenails ? ");
		anyBreaksownRLabel_1.setBounds(10, 5, 315, 16);
		panel_8_1_1_1.add(anyBreaksownRLabel_1);

		rbFootToeNailsYes = new JxRadioButton();
		rbFootToeNailsYes.setTheme(theme);
		rbFootToeNailsYes.setTheme(theme);
		rbFootToeNailsYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootToesNails.setEnabled(true);
				txtFootToesNails.requestFocus();
			}
		});
		bgFootToeNails.add(rbFootToeNailsYes);

		rbFootToeNailsYes.setText("Yes");
		rbFootToeNailsYes.setBounds(350, 0, 54, 24);
		panel_8_1_1_1.add(rbFootToeNailsYes);

		rbFootToeNailsNo = new JxRadioButton();
		rbFootToeNailsNo.setTheme(theme);
		rbFootToeNailsNo.setTheme(theme);
		rbFootToeNailsNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootToesNails.setText("");
				txtFootToesNails.setEnabled(false);
			}
		});
		bgFootToeNails.add(rbFootToeNailsNo);

		rbFootToeNailsNo.setText("No");
		rbFootToeNailsNo.setBounds(410, 0, 54, 24);
		panel_8_1_1_1.add(rbFootToeNailsNo);

		final JxPanel panel_9_1_1_1 = new JxPanel();
		panel_9_1_1_1.setTheme(theme);
		panel_9_1_1_1.setTheme(theme);
		panel_9_1_1_1.setLayout(null);

		panel_9_1_1_1.setBounds(10, 27, 890, 25);
		panel_8_1_1_1.add(panel_9_1_1_1);

		final JxLabel ifYesPleaseLabel_1_1_1 = new JxLabel();
		ifYesPleaseLabel_1_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1_1.setText("If yes, please explain");
		ifYesPleaseLabel_1_1_1.setBounds(5, 5, 126, 16);
		panel_9_1_1_1.add(ifYesPleaseLabel_1_1_1);

		txtFootToesNails = new JxText();
		txtFootToesNails.setTheme(theme);
		txtFootToesNails.setTheme(theme);
		txtFootToesNails.setBounds(144, 3, 736, 20);
		txtFootToesNails.setEnabled(false);
		panel_9_1_1_1.add(txtFootToesNails);

		final JxPanel panel_8_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1.setBounds(5, 883, 910, 62);
		add(panel_8_1_1_1_1);

		final JxLabel anyBreaksownRLabel_1_1 = new JxLabel();
		anyBreaksownRLabel_1_1.setTheme(theme);
		anyBreaksownRLabel_1_1.setTheme(theme);
		anyBreaksownRLabel_1_1.setText("5. Podiatry Consultation");
		anyBreaksownRLabel_1_1.setBounds(10, 5, 157, 16);
		panel_8_1_1_1_1.add(anyBreaksownRLabel_1_1);

		rbFootConsultationYes = new JxRadioButton();
		rbFootConsultationYes.setTheme(theme);
		rbFootConsultationYes.setTheme(theme);
		rbFootConsultationYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootConsultation.setEnabled(true);
				txtFootConsultation.requestFocus();
			}
		});
		bgFootConsultation.add(rbFootConsultationYes);

		rbFootConsultationYes.setText("Yes");
		rbFootConsultationYes.setBounds(350, 0, 54, 24);
		panel_8_1_1_1_1.add(rbFootConsultationYes);

		rbFootConsultationNo = new JxRadioButton();
		rbFootConsultationNo.setTheme(theme);
		rbFootConsultationNo.setTheme(theme);
		rbFootConsultationNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtFootConsultation.setText("");
				txtFootConsultation.setEnabled(false);
			}
		});
		bgFootConsultation.add(rbFootConsultationNo);

		rbFootConsultationNo.setText("No");
		rbFootConsultationNo.setBounds(410, 0, 54, 24);
		panel_8_1_1_1_1.add(rbFootConsultationNo);

		final JxPanel panel_9_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1.setBounds(10, 27, 890, 25);
		panel_8_1_1_1_1.add(panel_9_1_1_1_1);

		final JxLabel ifYesPleaseLabel_1_1_1_1 = new JxLabel();
		ifYesPleaseLabel_1_1_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1_1_1.setTheme(theme);
		ifYesPleaseLabel_1_1_1_1.setText("If yes, please explain");
		ifYesPleaseLabel_1_1_1_1.setBounds(5, 5, 130, 16);
		panel_9_1_1_1_1.add(ifYesPleaseLabel_1_1_1_1);

		txtFootConsultation = new JxText();
		txtFootConsultation.setTheme(theme);
		txtFootConsultation.setTheme(theme);
		txtFootConsultation.setBounds(144, 3, 736, 20);
		txtFootConsultation.setEnabled(false);
		panel_9_1_1_1_1.add(txtFootConsultation);

		panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setTheme(theme);
		panel_11.setLayout(null);

		panel_11.setBounds(5, 988, 910, 30);
		add(panel_11);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);
		ifSoWhatLabel.setTheme(theme);
		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 121, 16);
		panel_11.add(ifSoWhatLabel);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setTheme(theme);
		dateLabel.setText("Date :");
		dateLabel.setBounds(648, 5, 42, 16);
		panel_11.add(dateLabel);

		lblNurseVisit = new JxLabel();
		lblNurseVisit.setTheme(theme);
		lblNurseVisit.setTheme(theme);

		lblNurseVisit.setFontStyle(Font.BOLD);
		// dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		// dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		lblNurseVisit.setText(sdf.format(MedrexClientManager.getServerTime()));
		lblNurseVisit.setBounds(696, 2, 168, 26);
		panel_11.add(lblNurseVisit);

		final PanelloggedInUser panel_10 = new PanelloggedInUser();
		panel_10.setBounds(286, 1, 298, 29);
		panel_11.add(panel_10);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);
		cmbNurse.setTheme(theme);
		cmbNurse.setBounds(10, 5, 205, 20);
		panel_10.add(cmbNurse);

		cmbNurse.setVisible(false);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setTheme(theme);
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(15, 7, 93, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(112, 5, 196, 18);
		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setTheme(theme);
		roomLabel.setText("Room # :");
		roomLabel.setBounds(320, 7, 54, 14);
		add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setTheme(theme);

		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(372, 5, 147, 18);
		add(lblRoom);

		txtBreathSoundLocation = new JxText();
		txtBreathSoundLocation.setTheme(theme);
		txtBreathSoundLocation.setTheme(theme);
		txtBreathSoundLocation.setBounds(270, 488, 60, 21);
		add(txtBreathSoundLocation);

		txtInspiratoryWheezeLocation = new JxText();
		txtInspiratoryWheezeLocation.setTheme(theme);
		txtInspiratoryWheezeLocation.setTheme(theme);
		txtInspiratoryWheezeLocation.setBounds(500, 490, 79, 21);
		add(txtInspiratoryWheezeLocation);

		textField = new JxText();
		textField.setTheme(theme);
		textField.setTheme(theme);
		textField.setBounds(135, 518, 66, 21);
		add(textField);

		textField_1 = new JxText();
		textField_1.setTheme(theme);
		textField_1.setTheme(theme);

		textField_1.setBounds(709, 490, 43, 21);
		add(textField_1);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setTheme(theme);
		// panel_12.setVisible(false);

		panel_12.setLayout(null);
		panel_12.setBounds(541, 232, 383, 53);
		Border lineBdr1 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_12.setBorder(lineBdr1);
		add(panel_12);

		cbChestPain = new JxCheckBox();
		cbChestPain.setTheme(theme);
		cbChestPain.setTheme(theme);
		/*
		 * cbChestPain.addActionListener(new ActionListener(){ public void
		 * actionPerformed(ActionEvent e) { if(cbChestPain.isSelected()){
		 * panel_12.setVisible(true); }else{ panel_12.setVisible(false); } } });
		 */

		cbChestPain.setText("Chest pain");
		cbChestPain.setBounds(568, 367, 99, 20);
		add(cbChestPain);

		final JxLabel shortnessOfBreathLabel = new JxLabel();
		shortnessOfBreathLabel.setTheme(theme);
		shortnessOfBreathLabel.setTheme(theme);
		shortnessOfBreathLabel.setText("Shortness of Breath:");
		shortnessOfBreathLabel.setBounds(32, 10, 120, 33);
		panel_12.add(shortnessOfBreathLabel);

		rbShortnessOfBreathPresent = new JxRadioButton();
		rbShortnessOfBreathPresent.setTheme(theme);
		rbShortnessOfBreathPresent.setTheme(theme);
		rbShortnessOfBreathPresent.setActionCommand("1");
		bgShortnessOfBreath.add(rbShortnessOfBreathPresent);

		rbShortnessOfBreathPresent.setText("Present");
		rbShortnessOfBreathPresent.setBounds(178, 10, 68, 18);
		rbShortnessOfBreathPresent.setEnabled(false);
		panel_12.add(rbShortnessOfBreathPresent);

		rbShortnessOfBreathNotPresent = new JxRadioButton();
		rbShortnessOfBreathNotPresent.setTheme(theme);
		rbShortnessOfBreathNotPresent.setTheme(theme);
		rbShortnessOfBreathNotPresent.setActionCommand("2");
		bgShortnessOfBreath.add(rbShortnessOfBreathNotPresent);

		rbShortnessOfBreathNotPresent.setText("Not persent");
		rbShortnessOfBreathNotPresent.setBounds(273, 10, 100, 18);
		rbShortnessOfBreathNotPresent.setEnabled(false);
		panel_12.add(rbShortnessOfBreathNotPresent);

		rbShortnessOfBreathAtRest = new JxRadioButton();
		rbShortnessOfBreathAtRest.setTheme(theme);
		rbShortnessOfBreathAtRest.setTheme(theme);
		rbShortnessOfBreathAtRest.setActionCommand("3");
		bgShortnessOfBreath.add(rbShortnessOfBreathAtRest);

		rbShortnessOfBreathAtRest.setText("At rest");
		rbShortnessOfBreathAtRest.setBounds(178, 30, 68, 18);
		rbShortnessOfBreathAtRest.setEnabled(false);
		panel_12.add(rbShortnessOfBreathAtRest);

		rbShortnessOfBreathOnExertion = new JxRadioButton();
		rbShortnessOfBreathOnExertion.setTheme(theme);
		rbShortnessOfBreathOnExertion.setTheme(theme);
		rbShortnessOfBreathOnExertion.setActionCommand("4");
		bgShortnessOfBreath.add(rbShortnessOfBreathOnExertion);

		rbShortnessOfBreathOnExertion.setText("On exertion");
		rbShortnessOfBreathOnExertion.setBounds(273, 30, 100, 18);
		rbShortnessOfBreathOnExertion.setEnabled(false);
		panel_12.add(rbShortnessOfBreathOnExertion);

		cbChestPain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbChestPain.isSelected()) {
					rbShortnessOfBreathPresent.setEnabled(true);
					rbShortnessOfBreathNotPresent.setEnabled(true);
					rbShortnessOfBreathAtRest.setEnabled(true);
					rbShortnessOfBreathOnExertion.setEnabled(true);
				} else {
					rbShortnessOfBreathPresent.setEnabled(false);
					rbShortnessOfBreathNotPresent.setEnabled(false);
					rbShortnessOfBreathAtRest.setEnabled(false);
					rbShortnessOfBreathOnExertion.setEnabled(false);

				}
			}
		});

		final JxLabel panpirationsLabel = new JxLabel();
		panpirationsLabel.setTheme(theme);
		panpirationsLabel.setTheme(theme);
		panpirationsLabel.setText("Palpitions:");
		panpirationsLabel.setBounds(280, 366, 52, 21);
		add(panpirationsLabel);

		rbPanpitaionYes = new JxRadioButton();
		rbPanpitaionYes.setTheme(theme);
		rbPanpitaionYes.setTheme(theme);
		rbPanpitaionYes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbPanpitaionYes.setActionCommand("1");
		bgPanpirations.add(rbPanpitaionYes);

		rbPanpitaionYes.setText("Yes");
		rbPanpitaionYes.setBounds(335, 367, 53, 18);
		add(rbPanpitaionYes);

		rbPanpitaionNo = new JxRadioButton();
		rbPanpitaionNo.setTheme(theme);
		rbPanpitaionNo.setTheme(theme);
		rbPanpitaionNo.setActionCommand("2");
		bgPanpirations.add(rbPanpitaionNo);

		rbPanpitaionNo.setText("No");
		rbPanpitaionNo.setBounds(395, 367, 43, 18);
		add(rbPanpitaionNo);

		rbCongestion = new JxRadioButton();
		rbCongestion.setTheme(theme);
		rbCongestion.setTheme(theme);
		bgRespiratory.add(rbCongestion);

		rbCongestion.setText("Congestion");
		rbCongestion.setBounds(581, 518, 86, 24);
		add(rbCongestion);

		rbShortnessOfBreath = new JxRadioButton();
		rbShortnessOfBreath.setTheme(theme);
		rbShortnessOfBreath.setTheme(theme);
		rbShortnessOfBreath.setActionCommand("Shortness");
		/*
		 * rbShortnessOfBreath.addActionListener(new ActionListener(){ public
		 * void actionPerformed(ActionEvent e) {
		 * if(rbShortnessOfBreath.isSelected()){ panelCaugh.setVisible(false); }
		 * 
		 * } });
		 */
		bgRespiratory.add(rbShortnessOfBreath);

		rbShortnessOfBreath.setText("Shortness of Breath");
		rbShortnessOfBreath.setBounds(753, 518, 147, 24);
		add(rbShortnessOfBreath);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setTheme(theme);
		panel_13.setOpaque(false);
		panel_13.setLayout(null);
		panel_13.setBounds(5, 951, 907, 26);
		add(panel_13);

		cbDryness = new JxCheckBox();
		cbDryness.setTheme(theme);
		cbDryness.setTheme(theme);

		cbDryness.setText("Dryness after six months");
		cbDryness.setBounds(26, 0, 181, 18);
		panel_13.add(cbDryness);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setTheme(theme);
		label_2.setText("6.");
		label_2.setBounds(10, 2, 10, 14);
		panel_13.add(label_2);

		cmbPitting = new JxComboBox();
		cmbPitting.setTheme(theme);
		cmbPitting.setTheme(theme);

		cmbPitting.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4" }));
		cmbPitting.setBounds(75, 369, 43, 15);
		add(cmbPitting);

		rbCough = new JxRadioButton();
		rbCough.setTheme(theme);
		rbCough.setTheme(theme);
		rbCough.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbCough.isSelected()) {
					// panelCaugh.setVisible(true);
					rbProductive.setEnabled(true);
					rbNonProductive.setEnabled(true);
				}
			}
		});
		bgRespiratory.add(rbCough);

		rbCough.setText("Caugh");
		rbCough.setBounds(239, 518, 66, 24);
		add(rbCough);

		rbProductive = new JxRadioButton();
		rbProductive.setTheme(theme);
		rbProductive.setTheme(theme);
		rbProductive.setActionCommand("1");
		rbProductive.setBounds(0, 2, 96, 24);
		bgCaugh.add(rbProductive);

		rbProductive.setText("Productive");
		rbProductive.setEnabled(false);
		panelCaugh.add(rbProductive);

		rbNonProductive = new JxRadioButton();
		rbNonProductive.setTheme(theme);
		rbNonProductive.setTheme(theme);
		rbNonProductive.setActionCommand("2");
		rbNonProductive.setBounds(128, 2, 110, 24);
		bgCaugh.add(rbNonProductive);

		rbNonProductive.setText("Non productive");
		rbNonProductive.setEnabled(false);
		panelCaugh.add(rbNonProductive);

		rbShortnessOfBreath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbShortnessOfBreath.isSelected()) {
					rbProductive.setEnabled(false);
					rbNonProductive.setEnabled(false);
				}

			}
		});

		txtRalesLocation = new JxText();
		txtRalesLocation.setTheme(theme);
		txtRalesLocation.setTheme(theme);
		txtRalesLocation.setBounds(860, 488, 66, 21);
		add(txtRalesLocation);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setTheme(theme);

		panel_1_2.setLayout(null);
		panel_1_2.setBounds(5, 95, 920, 28);
		add(panel_1_2);

		final JxLabel peripherialSiteLabel_2 = new JxLabel();
		peripherialSiteLabel_2.setTheme(theme);
		peripherialSiteLabel_2.setTheme(theme);
		peripherialSiteLabel_2.setText("Midline/Picc Line");
		peripherialSiteLabel_2.setBounds(10, 10, 97, 16);
		panel_1_2.add(peripherialSiteLabel_2);

		final JxLabel typeLabel_3 = new JxLabel();
		typeLabel_3.setTheme(theme);
		typeLabel_3.setTheme(theme);
		typeLabel_3.setText("Type:");
		typeLabel_3.setBounds(112, 10, 37, 16);
		panel_1_2.add(typeLabel_3);

		txtMidlineType = new JxText();
		txtMidlineType.setTheme(theme);
		txtMidlineType.setTheme(theme);
		txtMidlineType.setBounds(150, 5, 160, 20);
		panel_1_2.add(txtMidlineType);

		final JxLabel locationLabel_1_1 = new JxLabel();
		locationLabel_1_1.setTheme(theme);
		locationLabel_1_1.setTheme(theme);
		locationLabel_1_1.setText("Location:");
		locationLabel_1_1.setBounds(316, 10, 60, 16);
		panel_1_2.add(locationLabel_1_1);

		txtMidlineLocation = new JxText();
		txtMidlineLocation.setTheme(theme);
		txtMidlineLocation.setTheme(theme);
		txtMidlineLocation.setBounds(372, 5, 147, 20);
		panel_1_2.add(txtMidlineLocation);

		final JxLabel dateOfInsertionLabel_2 = new JxLabel();
		dateOfInsertionLabel_2.setTheme(theme);
		dateOfInsertionLabel_2.setTheme(theme);
		dateOfInsertionLabel_2.setText("Date of Insertion:");
		dateOfInsertionLabel_2.setBounds(525, 10, 104, 16);
		panel_1_2.add(dateOfInsertionLabel_2);

		dcMidlineDate = new JxDateChooser();
		dcMidlineDate.setTheme(theme);
		dcMidlineDate.setTheme(theme);
		dcMidlineDate.setDateFormatString("MM/dd/yyyy");
		dcMidlineDate.setBounds(623, 5, 112, 20);
		panel_1_2.add(dcMidlineDate);

		cbMidlineNA = new JxCheckBox();
		cbMidlineNA.setTheme(theme);
		cbMidlineNA.setTheme(theme);

		cbMidlineNA.setText("N/A");
		cbMidlineNA.setBounds(755, 8, 60, 20);
		panel_1_2.add(cbMidlineNA);

		final JxPanel panel_1_2_1 = new JxPanel();
		panel_1_2_1.setTheme(theme);
		panel_1_2_1.setTheme(theme);

		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(5, 165, 920, 28);
		add(panel_1_2_1);

		final JxLabel peripherialSiteLabel_2_1 = new JxLabel();
		peripherialSiteLabel_2_1.setTheme(theme);
		peripherialSiteLabel_2_1.setTheme(theme);
		peripherialSiteLabel_2_1.setText("Port a cath");
		peripherialSiteLabel_2_1.setBounds(10, 10, 97, 16);
		panel_1_2_1.add(peripherialSiteLabel_2_1);

		final JxLabel typeLabel_3_1 = new JxLabel();
		typeLabel_3_1.setTheme(theme);
		typeLabel_3_1.setTheme(theme);
		typeLabel_3_1.setText("Type:");
		typeLabel_3_1.setBounds(112, 10, 37, 16);
		panel_1_2_1.add(typeLabel_3_1);

		txtPortType = new JxText();
		txtPortType.setTheme(theme);
		txtPortType.setTheme(theme);
		txtPortType.setBounds(150, 5, 160, 20);
		panel_1_2_1.add(txtPortType);

		final JxLabel locationLabel_1_1_1 = new JxLabel();
		locationLabel_1_1_1.setTheme(theme);
		locationLabel_1_1_1.setTheme(theme);
		locationLabel_1_1_1.setText("Location:");
		locationLabel_1_1_1.setBounds(316, 10, 60, 16);
		panel_1_2_1.add(locationLabel_1_1_1);

		txtPortLocation = new JxText();
		txtPortLocation.setTheme(theme);
		txtPortLocation.setTheme(theme);
		txtPortLocation.setBounds(372, 5, 147, 20);
		panel_1_2_1.add(txtPortLocation);

		final JxLabel dateOfInsertionLabel_2_1 = new JxLabel();
		dateOfInsertionLabel_2_1.setTheme(theme);
		dateOfInsertionLabel_2_1.setTheme(theme);
		dateOfInsertionLabel_2_1.setText("Date of Insertion:");
		dateOfInsertionLabel_2_1.setBounds(525, 10, 105, 16);
		panel_1_2_1.add(dateOfInsertionLabel_2_1);

		cbPortNA = new JxCheckBox();
		cbPortNA.setTheme(theme);
		cbPortNA.setTheme(theme);

		cbPortNA.setText("N/A");
		cbPortNA.setBounds(755, 8, 60, 20);
		panel_1_2_1.add(cbPortNA);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(10, 32, 917, 23);
		panel_1_2_1.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		final JxLabel peripherialSiteLabel_1_1 = new JxLabel();
		peripherialSiteLabel_1_1.setTheme(theme);
		peripherialSiteLabel_1_1.setTheme(theme);
		peripherialSiteLabel_1_1.setText("Shunt (s)");
		peripherialSiteLabel_1_1.setBounds(10, 10, 112, 16);
		panel_1_1_1.add(peripherialSiteLabel_1_1);

		final JxLabel typeLabel_2 = new JxLabel();
		typeLabel_2.setTheme(theme);
		typeLabel_2.setTheme(theme);
		typeLabel_2.setText("Type:");
		typeLabel_2.setBounds(125, 6, 37, 16);
		panel_1_1_1.add(typeLabel_2);

		txtShuntType = new JxText();
		txtShuntType.setTheme(theme);
		txtShuntType.setTheme(theme);
		txtShuntType.setBounds(163, 2, 147, 20);
		panel_1_1_1.add(txtShuntType);

		final JxLabel locationLabel_3 = new JxLabel();
		locationLabel_3.setTheme(theme);
		locationLabel_3.setTheme(theme);
		locationLabel_3.setText("Location:");
		locationLabel_3.setBounds(316, 6, 46, 16);
		panel_1_1_1.add(locationLabel_3);

		txtShuntLocation = new JxText();
		txtShuntLocation.setTheme(theme);
		txtShuntLocation.setTheme(theme);
		txtShuntLocation.setBounds(368, 3, 147, 20);
		panel_1_1_1.add(txtShuntLocation);

		final JxLabel bruitLabel = new JxLabel();
		bruitLabel.setTheme(theme);
		bruitLabel.setTheme(theme);
		bruitLabel.setText("Bruit:");
		bruitLabel.setBounds(528, 4, 46, 16);
		panel_1_1_1.add(bruitLabel);

		txtShuntBruit = new JxText();
		txtShuntBruit.setTheme(theme);
		txtShuntBruit.setTheme(theme);
		txtShuntBruit.setBounds(556, 3, 123, 20);
		panel_1_1_1.add(txtShuntBruit);

		final JxLabel thrillLabel = new JxLabel();
		thrillLabel.setTheme(theme);
		thrillLabel.setTheme(theme);
		thrillLabel.setText("Thrill:");
		thrillLabel.setBounds(685, 5, 26, 14);
		panel_1_1_1.add(thrillLabel);

		txtShuntThrill = new JxText();
		txtShuntThrill.setTheme(theme);
		txtShuntThrill.setTheme(theme);
		txtShuntThrill.setBounds(717, 2, 78, 21);
		panel_1_1_1.add(txtShuntThrill);

		dcPortDate = new JxDateChooser();
		dcPortDate.setTheme(theme);
		dcPortDate.setTheme(theme);
		dcPortDate.setBounds(623, 5, 112, 20);
		panel_1_2_1.add(dcPortDate);
		dcPortDate.setDateFormatString("MM/dd/yyyy");

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setTheme(theme);
		panel_4.setLayout(null);

		panel_4.setBounds(217, 548, 160, 23);
		add(panel_4);

		cmbOxygenVia = new JxComboBox();
		cmbOxygenVia.setTheme(theme);
		cmbOxygenVia.setTheme(theme);

		cmbOxygenVia.setModel(new DefaultComboBoxModel(new String[] { "",
				"Nasal Cannula", "Face Mask", "Trace Couse" }));
		cmbOxygenVia.setBounds(73, 0, 82, 19);
		panel_4.add(cmbOxygenVia);

		final JxLabel oxygenViaLabel = new JxLabel();
		oxygenViaLabel.setTheme(theme);
		oxygenViaLabel.setTheme(theme);
		oxygenViaLabel.setText("Oxygen Via");
		oxygenViaLabel.setBounds(1, 1, 66, 16);
		panel_4.add(oxygenViaLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setTheme(theme);
		panel_14.setLayout(null);

		panel_14.setBounds(435, 545, 245, 23);
		add(panel_14);

		final JxLabel trachTypeLabel = new JxLabel();
		trachTypeLabel.setTheme(theme);
		trachTypeLabel.setTheme(theme);
		trachTypeLabel.setText("Trach:        Type");
		trachTypeLabel.setBounds(0, 4, 93, 16);
		panel_14.add(trachTypeLabel);

		txtTrachType = new JxText();
		txtTrachType.setTheme(theme);
		txtTrachType.setTheme(theme);
		txtTrachType.setBounds(101, 2, 39, 20);
		panel_14.add(txtTrachType);

		final JxLabel sizeLabel = new JxLabel();
		sizeLabel.setTheme(theme);
		sizeLabel.setTheme(theme);
		sizeLabel.setText("size");
		sizeLabel.setBounds(146, 4, 31, 16);
		panel_14.add(sizeLabel);

		txtTrachSize = new JxText();
		txtTrachSize.setTheme(theme);
		txtTrachSize.setTheme(theme);
		txtTrachSize.setBounds(174, 2, 46, 20);
		panel_14.add(txtTrachSize);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setTheme(theme);
		panel_15.setLayout(null);

		panel_15.setBounds(685, 545, 242, 24);
		add(panel_15);

		final JxLabel cpapbipapSettingLabel = new JxLabel();
		cpapbipapSettingLabel.setTheme(theme);
		cpapbipapSettingLabel.setTheme(theme);
		cpapbipapSettingLabel.setText("Cpap/bipap Setting");
		cpapbipapSettingLabel.setBounds(10, 2, 119, 16);
		panel_15.add(cpapbipapSettingLabel);

		txtCpapSetting = new JxText();
		txtCpapSetting.setTheme(theme);
		txtCpapSetting.setTheme(theme);
		txtCpapSetting.setBounds(133, 2, 107, 20);
		panel_15.add(txtCpapSetting);

		final JxLabel automaticImplantCardiacLabel = new JxLabel();
		automaticImplantCardiacLabel.setTheme(theme);
		automaticImplantCardiacLabel.setTheme(theme);
		automaticImplantCardiacLabel.setBounds(20, 400, 217, 16);
		add(automaticImplantCardiacLabel);
		automaticImplantCardiacLabel
				.setText("Automatic Implant Cardiac Defibrillator (ICD)");

		rbDefibrillatorYes = new JxRadioButton();
		rbDefibrillatorYes.setTheme(theme);
		rbDefibrillatorYes.setTheme(theme);
		rbDefibrillatorYes.setBounds(335, 400, 49, 15);
		add(rbDefibrillatorYes);
		bgDefibrillator.add(rbDefibrillatorYes);

		rbDefibrillatorYes.setText("Yes");

		rbDefibrillatorNo = new JxRadioButton();
		rbDefibrillatorNo.setTheme(theme);
		rbDefibrillatorNo.setTheme(theme);
		rbDefibrillatorNo.setBounds(395, 400, 41, 15);
		add(rbDefibrillatorNo);
		bgDefibrillator.add(rbDefibrillatorNo);

		rbDefibrillatorNo.setText("No");
		doLoad();

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setTheme(theme);

		panel_16.setLayout(null);
		panel_16.setBounds(5, 364, 245, 26);
		Border lineBdr5 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16.setBorder(lineBdr5);
		add(panel_16);

		final JxPanel panel_16_1 = new JxPanel();
		panel_16_1.setTheme(theme);
		panel_16_1.setTheme(theme);

		panel_16_1.setLayout(null);
		panel_16_1.setBounds(270, 364, 176, 26);
		Border lineBdr6 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16_1.setBorder(lineBdr6);
		add(panel_16_1);

		final JxPanel panel_16_2 = new JxPanel();
		panel_16_2.setTheme(theme);
		panel_16_2.setTheme(theme);

		panel_16_2.setLayout(null);
		panel_16_2.setBounds(5, 400, 441, 26);
		Border lineBdr7 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16_1.setBorder(lineBdr7);
		add(panel_16_1);

		final JxPanel panel_16_3 = new JxPanel();
		panel_16_3.setTheme(theme);
		panel_16_3.setTheme(theme);

		panel_16_3.setLayout(null);
		panel_16_3.setBounds(541, 364, 379, 58);
		Border lineBdr9 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16_3.setBorder(lineBdr9);
		add(panel_16_3);

		final JxPanel panel_16_4 = new JxPanel();
		panel_16_4.setTheme(theme);
		panel_16_4.setTheme(theme);
		panel_16_4.setOpaque(false);

		panel_16_4.setLayout(null);
		panel_16_4.setBounds(5, 425, 918, 28);
		Border lineBdr10 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16_4.setBorder(lineBdr10);
		add(panel_16_4);

		final JxPanel panel_16_5 = new JxPanel();
		panel_16_5.setTheme(theme);
		panel_16_5.setTheme(theme);

		panel_16_5.setLayout(null);
		panel_16_5.setBounds(5, 394, 441, 26);
		Border lineBdr8 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		panel_16_5.setBorder(lineBdr8);
		add(panel_16_5);
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
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

	private void doEnabledCombo() {
		cmbDizinessOn.setEnabled(true);
	}

	private void doDisabledCombo() {
		cmbDizinessOn.setEnabled(false);
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
		} catch (Exception e) {
		}
		lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
		/* TODO: Migrating to room history ----- Done */
		// txtRoom.setText(rm.getRoom());
		if (roomHist != null) {
			lblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormPage1Key == 0) {
			Global.currentResidentAssessmentFormPage4Key = 0;
			// txtPeriPherial.setNotes(notesPeripheral);
			// txtCentralSites.setNotes(notesCentralSites);
			// txtShunts.setNotes(notesShunts);
			rbDizzinessYes.setSelected(false);
			rbDizzinessNo.setSelected(false);

			// txtPacemakerRate.setText("");
			dateLastCheck.setDate(null);
			rbDefibrillatorYes.setSelected(false);
			rbDefibrillatorNo.setSelected(false);
			rbCapillaryBrisk.setSelected(false);
			rbCapillarySluggish.setSelected(false);
			rbEdemaYes.setSelected(false);
			rbEdemaNo.setSelected(false);
			// txtEdemaLocation.setText("");
			rbEdemaPitting.setSelected(false);
			rbEdemaNonPitting.setSelected(false);
			rbRespiratoryClear.setSelected(false);
			rbRespiratoryDiminished.setSelected(false);
			rbRespiratoryInspiratory.setSelected(false);
			rbRespiratoryRales.setSelected(false);
			rbRespiratoryRonchi.setSelected(false);
			rbRespiratoryExpiratory.setSelected(false);
			rbRespiratoryOther.setSelected(false);
			txtRespiratoryOther.setText("");

			/*
			 * Users users = null;
			 * 
			 * try { users =MedrexClientManager.getInstance().getUser(Global.
			 * currentLoggedInUserKey);
			 * 
			 * if (users.getUserType().equalsIgnoreCase("Nurse")) {
			 * 
			 * Nurse n = (Nurse)
			 * MedrexClientManager.getInstance().getNurseRecord(users
			 * .getUserId());
			 * 
			 * cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(n.getNurseName() + " " + n.getNurseSurName());
			 * 
			 * }
			 * 
			 * else { cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(""); } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		} else {
			ResidentAssessmentFormPage4 rafp4 = null;
			// txtPeriPherial.setNotes(new Notes());
			// txtCentralSites.setNotes(new Notes());
			// txtShunts.setNotes(new Notes());
			rbDizzinessYes.setSelected(false);
			rbDizzinessNo.setSelected(false);
			// txtPulses.setText("");

			// txtPacemakerRate.setText("");
			dateLastCheck.setDate(null);
			rbDefibrillatorYes.setSelected(false);
			rbDefibrillatorNo.setSelected(false);
			rbCapillaryBrisk.setSelected(false);
			rbCapillarySluggish.setSelected(false);
			rbEdemaYes.setSelected(false);

			// rbEdemaNo.setSelected(false);

			txtEdemaLocation.setText("");
			// txtEdemaPitting.setText("");
			rbEdemaPitting.setSelected(false);
			rbEdemaNonPitting.setSelected(false);
			rbRespiratoryClear.setSelected(false);
			rbRespiratoryDiminished.setSelected(false);
			rbRespiratoryInspiratory.setSelected(false);
			rbRespiratoryRales.setSelected(false);
			rbRespiratoryRonchi.setSelected(false);
			rbRespiratoryExpiratory.setSelected(false);
			rbRespiratoryOther.setSelected(false);
			txtRespiratoryOther.setText("");

			try {
				rafp4 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage4(
								Global.currentResidentAssessmentFormPage1Key);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage4Key = rafp4.getSerial();
			// dcNurseVisit.setDate(rafp4.getNurseVisit());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			lblNurseVisit.setText(sdf.format(rafp4.getNurseVisit()));
			cmbNurse.setSelectedItem(rafp4.getNurse());

			// txtPeriPherial.setNotes(rafp4.getPeripherial());
			// txtCentralSites.setNotes(rafp4.getCentral());
			// txtShunts.setNotes(rafp4.getShunt());

			switch (rafp4.getDizziness()) {
			case 1:
				rbDizzinessYes.setSelected(true);
				break;
			case 2:
				rbDizzinessNo.setSelected(true);
				break;
			}

			// txtPulses.setText(rafp4.getPulses());

			switch (rafp4.getPedalLeft()) {
			case 1:
				// rbCardioLeft.setSelected(true);
				break;
			case 2:
				rbCardioLeftPalpable.setSelected(true);
				break;
			case 3:
				rbCardioLeftNotPalpable.setSelected(true);
				break;
			}

			switch (rafp4.getPedalRight()) {
			case 1:
				// rbCardioRight.setSelected(true);
				break;
			case 2:
				rbCardioRightPalpable.setSelected(true);
				break;
			case 3:
				rbCardioRightNotPalpable.setSelected(true);
				break;
			}

			switch (rafp4.getPacemaker()) {
			case 1:
				rbPacemakerYes.setSelected(true);
				// txtPacemakerRate.setEditable(true);
				// txtPacemakerRate.setText(rafp4.getPacemakerRate());

				break;
			case 2:
				rbPacemakerNo.setSelected(true);
				// txtPacemakerRate.setEditable(false);

				break;
			}
			dateLastCheck.setDate(rafp4.getPacemakerDate());

			switch (rafp4.getDefibrillator()) {
			case 1:
				rbDefibrillatorYes.setSelected(true);
				break;
			case 2:
				rbDefibrillatorNo.setSelected(true);
				break;
			}

			switch (rafp4.getCapillary()) {
			case 1:
				rbCapillaryBrisk.setSelected(true);
				break;
			case 2:
				rbCapillarySluggish.setSelected(true);
				break;
			}

			switch (rafp4.getEdema()) {
			case 1:
				rbEdemaYes.setSelected(true);
				txtEdemaLocation.setEditable(true);
				txtEdemaLocation.setText(rafp4.getEdemaLocation());
				txtEdemaLocation.setSelectionStart(0);
				txtEdemaLocation.setSelectionEnd(0);

				break;
			case 2:
				rbEdemaNo.setSelected(true);
				txtEdemaLocation.setEditable(false);
				break;
			}

			// txtEdemaPitting.setText(rafp4.getEdemaPittingText());

			switch (rafp4.getEdemaPitting()) {
			case 1:
				rbEdemaPitting.setSelected(true);
				break;
			case 2:
				rbEdemaNonPitting.setSelected(true);
				break;
			}

			switch (rafp4.getRespiratory()) {
			case 1:
				rbRespiratoryClear.setSelected(true);
				break;
			case 2:
				rbRespiratoryDiminished.setSelected(true);
				break;
			case 3:
				rbRespiratoryInspiratory.setSelected(true);
				break;
			case 4:
				rbRespiratoryRales.setSelected(true);
				break;
			case 5:
				rbRespiratoryRonchi.setSelected(true);
				break;
			case 6:
				rbRespiratoryExpiratory.setSelected(true);
				break;
			case 7:
				rbRespiratoryOther.setSelected(true);
				break;
			case 8:
				rbCongestion.setSelected(true);
				break;
			case 9:
				rbShortnessOfBreath.setSelected(true);
			}

			txtRespiratoryOther.setText(rafp4.getRespiratoryOther());

			switch (rafp4.getFootPain()) {
			case 1:
				rbFootPainYes.setSelected(true);
				txtFootPain.setEditable(true);
				txtFootPain.setText(rafp4.getFootPainText());

				break;
			case 2:
				rbFootPainNo.setSelected(true);
				txtFootPain.setEditable(false);
				break;
			}

			switch (rafp4.getFootHeels()) {
			case 1:
				rbFootHeelsYes.setSelected(true);
				txtFootHeels.setEditable(true);
				txtFootHeels.setText(rafp4.getFootHeelsText());
				break;
			case 2:
				rbFootHeelNo.setSelected(true);
				txtFootHeels.setEditable(false);
				break;
			}

			switch (rafp4.getFootToes()) {
			case 1:
				rbFootToesYes.setSelected(true);
				txtFootToes.setEditable(true);
				txtFootToes.setText(rafp4.getFootToesText());
				break;
			case 2:
				rbFootToesNo.setSelected(true);
				txtFootToes.setEditable(false);
				break;
			}

			switch (rafp4.getFootToeNails()) {
			case 1:
				rbFootToeNailsYes.setSelected(true);
				txtFootToesNails.setEditable(true);
				txtFootToesNails.setText(rafp4.getFootToeNailsText());
				break;
			case 2:
				rbFootToeNailsNo.setSelected(true);
				txtFootToesNails.setEditable(false);
				break;
			}

			switch (rafp4.getFootConsultaion()) {
			case 1:
				rbFootConsultationYes.setSelected(true);
				txtFootConsultation.setEditable(true);
				txtFootConsultation.setText(rafp4.getFootConsultationText());
				break;
			case 2:
				rbFootConsultationNo.setSelected(true);
				txtFootConsultation.setEditable(false);
				break;
			}
			// new Fields

			txtPeripheralLineType.setText(rafp4.getPeripheralType());
			txtPeripheralLocation.setText(rafp4.getPeripheralLocation());
			dcPeripheralDate.setDate(rafp4.getPeripheralDate());
			cbPeripheralNA.setSelected(rafp4.isPeripheralNA());
			txtMidlineType.setText(rafp4.getMidlineType());
			txtMidlineLocation.setText(rafp4.getMidlineLocation());
			dcMidlineDate.setDate(rafp4.getMidlineDate());
			cbMidlineNA.setSelected(rafp4.isMidlineNA());
			txtPortType.setText(rafp4.getPortType());
			txtPortLocation.setText(rafp4.getPortLocation());
			dcPortDate.setDate(rafp4.getPortDate());
			cbPortNA.setSelected(rafp4.isPortNA());
			txtCentralLineType.setText(rafp4.getCentralLineType());
			txtCentralLineLocation.setText(rafp4.getCentralLineLocation());
			dcCentralLineDate.setDate(rafp4.getCentralLineDate());
			cbCentralLineNA.setSelected(rafp4.isCentralLineNA());
			txtShuntType.setText(rafp4.getShuntType());
			txtShuntLocation.setText(rafp4.getShuntLocation());
			txtShuntBruit.setText(rafp4.getShuntBruit());
			txtShuntThrill.setText(rafp4.getShuntThrill());
			cmbDizinessOn.setSelectedItem(rafp4.getDizzinessOn());
			cmbOxygenVia.setSelectedItem(rafp4.getOxygenVia());
			txtCpapSetting.setText(rafp4.getCpapSetting());

			cbJVD.setSelected(rafp4.isJVd());
			System.out.println("chest pain" + rafp4.isChestPain());
			cbChestPain.setSelected(rafp4.isChestPain());
			SwingUtils.setSelectedButton(bgShortnessOfBreath, rafp4
					.getShortnessOfBreath());
			cmbPitting.setSelectedItem(rafp4.getPittingValue());
			SwingUtils.setSelectedButton(bgEdemaPitting, rafp4
					.getEdemaPitting());
			txtBreathSoundLocation.setText(rafp4.getSoundLocation());
			txtInspiratoryWheezeLocation.setText(rafp4.getWheezeLocation());
			txtRalesLocation.setText(rafp4.getRalesLocation());
			SwingUtils.setSelectedButton(bgCaugh, rafp4.getCoughType());
			cbDryness.setSelected(rafp4.isDryness());
			txtTrachSize.setText(rafp4.getTrachSize());
			txtTrachType.setText(rafp4.getTrachType());

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage4 rafp4 = new ResidentAssessmentFormPage4();
		rafp4.setSerial(Global.currentResidentAssessmentFormPage4Key);
		rafp4.setFormId(Global.currentResidentAssessmentFormPage1Key);

		// rafp4.setNurseVisit(dcNurseVisit.getDate());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		try {
			rafp4.setNurseVisit(sdf.parse(lblNurseVisit.getText()));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		rafp4.setNurse((String) cmbNurse.getSelectedItem());

		// rafp4.setPeripherial(txtPeriPherial.getNotes());
		// rafp4.setCentral(txtCentralSites.getNotes());
		// rafp4.setShunt(txtShunts.getNotes());

		if (rbDizzinessYes.isSelected()) {
			rafp4.setDizziness(1);
		}

		if (rbDizzinessNo.isSelected()) {
			rafp4.setDizziness(2);
		}
		if (rbCardioLeftPalpable.isSelected()) {
			rafp4.setPedalLeft(2);
		}
		if (rbCardioLeftNotPalpable.isSelected()) {
			rafp4.setPedalLeft(3);
		}
		if (rbCardioRightPalpable.isSelected()) {
			rafp4.setPedalRight(2);
		}
		if (rbCardioRightNotPalpable.isSelected()) {
			rafp4.setPedalRight(3);
		}

		if (rbPacemakerYes.isSelected()) {
			rafp4.setPacemaker(1);
		}
		if (rbPacemakerNo.isSelected()) {
			rafp4.setPacemaker(2);
		}
		rafp4.setPacemakerDate(dateLastCheck.getDate());

		if (rbDefibrillatorYes.isSelected()) {
			rafp4.setDefibrillator(1);
		}
		if (rbDefibrillatorNo.isSelected()) {
			rafp4.setDefibrillator(2);
		}

		if (rbCapillaryBrisk.isSelected()) {
			rafp4.setCapillary(1);
		}
		if (rbCapillarySluggish.isSelected()) {
			rafp4.setCapillary(2);
		}

		if (rbEdemaYes.isSelected()) {
			rafp4.setEdema(1);
		}
		if (rbEdemaNo.isSelected()) {
			rafp4.setEdema(2);

		}

		rafp4.setEdemaLocation(txtEdemaLocation.getText());

		if (rbEdemaPitting.isSelected()) {
			rafp4.setEdemaPitting(1);
		}
		if (rbEdemaNonPitting.isSelected()) {
			rafp4.setEdemaPitting(2);
		}

		if (rbRespiratoryClear.isSelected()) {
			rafp4.setRespiratory(1);
		}
		if (rbRespiratoryDiminished.isSelected()) {
			rafp4.setRespiratory(2);
		}
		if (rbRespiratoryInspiratory.isSelected()) {
			rafp4.setRespiratory(3);
		}
		if (rbRespiratoryRales.isSelected()) {
			rafp4.setRespiratory(4);
		}
		if (rbRespiratoryRonchi.isSelected()) {
			rafp4.setRespiratory(5);
		}
		if (rbRespiratoryExpiratory.isSelected()) {
			rafp4.setRespiratory(6);
		}
		if (rbRespiratoryOther.isSelected()) {
			rafp4.setRespiratory(7);
		}
		if (rbCongestion.isSelected()) {
			rafp4.setRespiratory(8);
		}
		if (rbShortnessOfBreath.isSelected()) {
			rafp4.setRespiratory(9);
		}

		rafp4.setRespiratoryOther(txtRespiratoryOther.getText());

		if (rbFootPainYes.isSelected()) {
			rafp4.setFootPain(1);
		}
		if (rbFootPainNo.isSelected()) {
			rafp4.setFootPain(2);
		}
		rafp4.setFootPainText(txtFootPain.getText());

		if (rbFootHeelsYes.isSelected()) {
			rafp4.setFootHeels(1);
		}
		if (rbFootHeelNo.isSelected()) {
			rafp4.setFootHeels(2);
		}
		rafp4.setFootHeelsText(txtFootHeels.getText());

		if (rbFootToesYes.isSelected()) {
			rafp4.setFootToes(1);
		}
		if (rbFootToesNo.isSelected()) {
			rafp4.setFootToes(2);
		}
		rafp4.setFootToesText(txtFootToes.getText());

		if (rbFootToeNailsYes.isSelected()) {
			rafp4.setFootToeNails(1);
		}
		if (rbFootToeNailsNo.isSelected()) {
			rafp4.setFootToeNails(2);
		}
		rafp4.setFootToeNailsText(txtFootToesNails.getText());

		if (rbFootConsultationYes.isSelected()) {
			rafp4.setFootConsultaion(1);
		}
		if (rbFootConsultationNo.isSelected()) {
			rafp4.setFootConsultaion(2);
		}
		rafp4.setFootConsultationText(txtFootConsultation.getText());
		rafp4.setPeripheralType(txtPeripheralLineType.getText());
		rafp4.setPeripheralLocation(txtPeripheralLocation.getText());
		rafp4.setPeripheralDate(dcPeripheralDate.getDate());
		rafp4.setPeripheralNA(cbPeripheralNA.isSelected());
		rafp4.setMidlineType(txtMidlineType.getText());
		rafp4.setMidlineLocation(txtMidlineLocation.getText());
		rafp4.setMidlineDate(dcMidlineDate.getDate());
		rafp4.setMidlineNA(cbMidlineNA.isSelected());
		rafp4.setPortType(txtPortType.getText());
		rafp4.setPortLocation(txtPortLocation.getText());
		rafp4.setPortDate(dcPortDate.getDate());
		rafp4.setPortNA(cbPortNA.isSelected());
		rafp4.setCentralLineType(txtCentralLineType.getText());
		rafp4.setCentralLineLocation(txtCentralLineLocation.getText());
		rafp4.setCentralLineDate(dcCentralLineDate.getDate());
		rafp4.setCentralLineNA(cbCentralLineNA.isSelected());
		rafp4.setShuntType(txtShuntType.getText());
		rafp4.setShuntLocation(txtShuntLocation.getText());
		rafp4.setShuntBruit(txtShuntBruit.getText());
		rafp4.setShuntThrill(txtShuntThrill.getText());
		rafp4.setDizzinessOn(cmbDizinessOn.getSelectedItem().toString());

		rafp4.setOxygenVia(cmbOxygenVia.getSelectedItem().toString());
		rafp4.setTrachType(txtTrachType.getText());
		rafp4.setTrachSize(txtTrachSize.getText());
		rafp4.setCpapSetting(txtCpapSetting.getText());

		rafp4.setJVd(cbJVD.isSelected());
		rafp4.setChestPain(cbChestPain.isSelected());
		rafp4.setShortnessOfBreath(SwingUtils
				.getSelectedButton(bgShortnessOfBreath));
		rafp4.setPittingValue(cmbPitting.getSelectedItem().toString());
		rafp4.setSoundLocation(txtBreathSoundLocation.getText());
		rafp4.setWheezeLocation(txtInspiratoryWheezeLocation.getText());
		rafp4.setRalesLocation(txtRalesLocation.getText());
		rafp4.setCoughType(SwingUtils.getSelectedButton(bgCaugh));
		rafp4.setDryness(cbDryness.isSelected());
		try {
			Global.currentResidentAssessmentFormPage4Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage4(
							rafp4);

			// for sending trigger word message
			// String str = txtPeriPherial.getTriggerWord();
			// if(str == null){
			// str = txtCentralSites.getTriggerWord();
			// }else{
			// str += txtCentralSites.getTriggerWord();
			// }
			// if(str == null){
			// str = txtShunts.getTriggerWord();
			// }else{
			// str += txtShunts.getTriggerWord();
			// }
			//			
			// if (str != null) {
			// txtShunts.sendMail(str);
			// }

			return (0);
		} catch (Exception e) {
			return (0);
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 4");
			return false;
		} else {
			return true;
		}
	}

}
