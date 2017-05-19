package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStTherapyPhysical;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxRichTextField;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStTherapyPhysical extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 553446936614575411L;
	private ButtonGroup bgCertificationType;
	private ButtonGroup bgMed = new ButtonGroup();
	private ButtonGroup bgImprovement = new ButtonGroup();
	private JDateChooser dcReCertDcDate;
	private JLabel dateLabel_1;
	private JComboBox cmbMdSign;
	private JLabel mdSignLabel;
	private JTextField txtMdName;
	private JLabel mdNameLabel;
	private JLabel progressNoteAndLabel_3;
	private JComboBox cmbTherapySignature;
	private JLabel dateLabel;
	private JDateChooser dcTherapyDate;
	private JTextField txtLicenseNo;
	private JLabel licenseLabel;
	private JLabel therapySignatureLabel;
	private JSeparator separator;
	private JLabel dischargeDateLabel;
	private JDateChooser dcDischargeDate;
	private JxNotes txtDischargeRecommend;
	private JLabel includeDischargeInstructionsLabel;
	private JLabel dischargeRecommendationsLabel;
	private JxRichTextField txtDischargeLoc;
	private JLabel dischargeLocationLabel;
	private JxNotes txtReasonForDischarge;
	private JLabel includePtResponseLabel;
	private JLabel summaryOfPtLabel_3;
	private JLabel progressNoteAndLabel_2;
	private JCheckBox cbDischargeOnly;
	private JLabel recertDatesFromLabel;
	private JDateChooser dcReCertFromDate;
	private JLabel toLabel_1;
	private JDateChooser dcReCertToDate;
	private JxNotes txtReCertPlanOfCare;
	private JLabel summaryOfPtLabel_2;
	private JxNotes txtReCertOrUpdateLtg;
	private JLabel summaryOfPtLabel_1;
	private JLabel progressNoteAndLabel_1;
	private JCheckBox cbReCert;
	private JCheckBox cbJustificationReached;
	private JxNotes txtJustificationToCont;
	private JLabel indicateOutstandingGoalsLabel;
	private JLabel justificationToContinueLabel;
	private JxNotes txtSummaryOfPtResp;
	private JLabel focusOnAreasLabel;
	private JLabel summaryOfPtLabel;
	private JLabel progressNoteAndLabel;
	private JCheckBox cbProgressNoteAndReCert;
	private JxRichTextField txtComplaintsOf;
	private JCheckBox cbComplaintsNone;
	private JLabel complaintsOfLabel;
	private JxNotes txtImprovementNoField;
	private JRadioButton rbImprovementNo;
	private JRadioButton rbImprovementYes;
	private JLabel improvementNotedLabel;
	private JPanel panel_15;
	private JTextArea txtUpdatedStg05;
	private JPanel panel_28;
	private JTextArea txtUpdatedStg04;
	private JPanel panel_27;
	private JTextArea txtUpdatedStg03;
	private JPanel panel_26;
	private JTextArea txtUpdatedStg02;
	private JPanel panel_25;
	private JTextArea txtUpdatedStg01;
	private JPanel panel_24;
	private JLabel problemLabel_3;
	private JPanel panel_23;
	private JDateChooser dcStatusTo;
	private JLabel toLabel;
	private JDateChooser dcStatusFrom;
	private JLabel endDateLabel_1;
	private JLabel problemLabel_2;
	private JPanel panel_22;
	private JxNotes txtCurPeriod05;
	private JPanel panel_21;
	private JxNotes txtCurPeriod04;
	private JPanel panel_20;
	private JxNotes txtCurPeriod03;
	private JPanel panel_19;
	private JxNotes txtCurPeriod02;
	private JPanel panel_18;
	private JxNotes txtCurPeriod01;
	private JPanel panel_17;
	private JPanel panel_16;
	private JDateChooser dcStatusEnd;
	private JLabel endDateLabel;
	private JLabel problemLabel_1;
	private JPanel panel_4;
	private JxNotes txtLastPeriod05;
	private JPanel panel_14;
	private JxNotes txtLastPeriod04;
	private JPanel panel_13;
	private JxNotes txtLastPeriod03;
	private JPanel panel_12;
	private JxNotes txtLastPeriod02;
	private JPanel panel_11;
	private JxNotes txtLastPeriod01;
	private JPanel panel_10;
	private JPanel panel_9;
	private JTextArea txtProblem05;
	private JPanel panel_8;
	private JTextArea txtProblem04;
	private JPanel panel_7;
	private JTextArea txtProblem03;
	private JPanel panel_6;
	private JTextArea txtProblem02;
	private JPanel panel_5;
	private JTextArea txtProblem01;
	private JPanel panel_3;
	private JLabel problemLabel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JTextField txtSoc;
	private JLabel socLabel;
	private JTextField txtDx;
	private JLabel dxLabel;
	private JTextField txtOtherField;
	private JRadioButton rbHmo;
	private JRadioButton rbMedB;
	private JRadioButton rbMedA;
	private JxRichTextField txtPrecautionsWbs;
	private JLabel precautionswbsLabel;
	private JTextField txtHicNo;
	private JLabel hicLabel;
	private JTextField txt$PatientName;
	private JLabel patientNameLabel;
	private JTextField txt$Year;
	private JLabel yearLabel;
	private JRadioButton rbDischarge;
	private JRadioButton rbReCertification;
	private JRadioButton rbProgressNote;
	private JComboBox cmbPtOtStTherapy;
	private JPanel panel;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	/**
	 * Create the panel
	 */
	public PanelPtOtStTherapyPhysical() {
		super();
		Global.panelPtOtStTherapyPhysical = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1000, 800));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 130);
		add(panel);

		cmbPtOtStTherapy = new JComboBox();
		cmbPtOtStTherapy.setFont(new Font("", Font.PLAIN, 22));
		cmbPtOtStTherapy.setBackground(Color.WHITE);
		cmbPtOtStTherapy
				.setModel(new DefaultComboBoxModel(new String[] {
						"PHYSICAL THERAPY", "OCCUPATIONAL THERAPY",
						"SPEECH THERAPY" }));
		cmbPtOtStTherapy.setBounds(10, 10, 332, 38);
		panel.add(cmbPtOtStTherapy);

		bgCertificationType = new ButtonGroup();
		rbProgressNote = new JRadioButton();
		rbProgressNote.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				dcReCertFromDate.setEnabled(false);
				dcReCertToDate.setEnabled(false);
			}
		});
		rbProgressNote.setActionCommand("1");
		bgCertificationType.add(rbProgressNote);
		rbProgressNote.setBackground(Color.WHITE);
		rbProgressNote.setFont(new Font("", Font.BOLD, 16));
		rbProgressNote.setText("PROGRESS NOTE");
		rbProgressNote.setBounds(348, 18, 166, 22);
		panel.add(rbProgressNote);

		rbReCertification = new JRadioButton();
		rbReCertification.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				dcReCertFromDate.setEnabled(true);
				dcReCertToDate.setEnabled(true);
			}
		});
		rbReCertification.setActionCommand("2");
		bgCertificationType.add(rbReCertification);
		rbReCertification.setBackground(Color.WHITE);
		rbReCertification.setFont(new Font("Dialog", Font.BOLD, 16));
		rbReCertification.setText("RE-CERTIFICATION");
		rbReCertification.setBounds(520, 18, 170, 22);
		panel.add(rbReCertification);

		rbDischarge = new JRadioButton();
		rbDischarge.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				dcReCertFromDate.setEnabled(false);
				dcReCertToDate.setEnabled(false);
			}
		});
		rbDischarge.setActionCommand("3");
		bgCertificationType.add(rbDischarge);
		rbDischarge.setBackground(Color.WHITE);
		rbDischarge.setFont(new Font("Dialog", Font.BOLD, 16));
		rbDischarge.setText("DISCHARGE");
		rbDischarge.setBounds(696, 18, 115, 22);
		panel.add(rbDischarge);

		yearLabel = new JLabel();
		yearLabel.setFont(new Font("", Font.BOLD, 12));
		yearLabel.setText("YEAR:");
		yearLabel.setBounds(872, 22, 33, 14);
		panel.add(yearLabel);

		txt$Year = new JTextField();
		txt$Year.setBackground(Color.WHITE);
		txt$Year.setEditable(false);
		txt$Year.setBounds(911, 19, 79, 21);
		panel.add(txt$Year);

		patientNameLabel = new JLabel();
		patientNameLabel.setFont(new Font("", Font.BOLD, 12));
		patientNameLabel.setText("PATIENT NAME:");
		patientNameLabel.setBounds(10, 77, 87, 14);
		panel.add(patientNameLabel);

		txt$PatientName = new JTextField();
		txt$PatientName.setBackground(Color.WHITE);
		txt$PatientName.setEditable(false);
		txt$PatientName.setBounds(103, 75, 239, 21);
		panel.add(txt$PatientName);

		hicLabel = new JLabel();
		hicLabel.setFont(new Font("", Font.BOLD, 12));
		hicLabel.setText("HIC #");
		hicLabel.setBounds(348, 78, 33, 14);
		panel.add(hicLabel);

		txtHicNo = new JTextField();
		txtHicNo.setEnabled(false);
		txtHicNo.setBounds(387, 75, 180, 21);
		panel.add(txtHicNo);

		precautionswbsLabel = new JLabel();
		precautionswbsLabel.setFont(new Font("", Font.BOLD, 12));
		precautionswbsLabel.setText("PRECAUTIONS/WBS:");
		precautionswbsLabel.setBounds(573, 78, 117, 14);
		panel.add(precautionswbsLabel);

		txtPrecautionsWbs = new JxRichTextField();
		txtPrecautionsWbs.setArc(0.1f);
		txtPrecautionsWbs.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtPrecautionsWbs.setRichTextFieldModel(txtPrecautionsWbs,
				"PtOtStPhysicalTherapy: Precautions Wbs");
		txtPrecautionsWbs.setBounds(696, 75, 294, 21);
		panel.add(txtPrecautionsWbs);

		rbMedA = new JRadioButton();
		rbMedA.setActionCommand("1");
		bgMed.add(rbMedA);
		rbMedA.setBackground(Color.WHITE);
		rbMedA.setFont(new Font("", Font.BOLD, 12));
		rbMedA.setText("MED A");
		rbMedA.setBounds(20, 102, 54, 18);
		panel.add(rbMedA);

		rbMedB = new JRadioButton();
		rbMedB.setActionCommand("2");
		bgMed.add(rbMedB);
		rbMedB.setFont(new Font("Dialog", Font.BOLD, 12));
		rbMedB.setBackground(Color.WHITE);
		rbMedB.setText("MED B");
		rbMedB.setBounds(87, 102, 54, 18);
		panel.add(rbMedB);

		rbHmo = new JRadioButton();
		rbHmo.setActionCommand("3");
		bgMed.add(rbHmo);
		rbHmo.setFont(new Font("Dialog", Font.BOLD, 12));
		rbHmo.setBackground(Color.WHITE);
		rbHmo.setText("HMO");
		rbHmo.setBounds(160, 102, 45, 18);
		panel.add(rbHmo);

		txtOtherField = new JTextField();
		txtOtherField.setBounds(283, 102, 148, 21);
		panel.add(txtOtherField);

		dxLabel = new JLabel();
		dxLabel.setFont(new Font("", Font.BOLD, 12));
		dxLabel.setText("DX:");
		dxLabel.setBounds(437, 105, 19, 14);
		panel.add(dxLabel);

		txtDx = new JTextField();
		txtDx.setBounds(462, 102, 180, 21);
		panel.add(txtDx);

		socLabel = new JLabel();
		socLabel.setFont(new Font("", Font.BOLD, 12));
		socLabel.setText("SOC:");
		socLabel.setBounds(648, 105, 33, 14);
		panel.add(socLabel);

		txtSoc = new JTextField();
		txtSoc.setBounds(687, 102, 303, 21);
		panel.add(txtSoc);

		final JLabel othersLabel = new JLabel();
		othersLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		othersLabel.setText("OTHERS");
		othersLabel.setBounds(223, 105, 54, 14);
		panel.add(othersLabel);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 130, 1000, 295);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 100, 295);
		panel_1.add(panel_2);

		problemLabel = new JLabel();
		problemLabel.setBorder(new LineBorder(Color.black, 1, false));
		problemLabel.setHorizontalAlignment(SwingConstants.CENTER);
		problemLabel.setFont(new Font("", Font.BOLD, 12));
		problemLabel.setText("PROBLEM");
		problemLabel.setBounds(0, 0, 100, 50);
		panel_2.add(problemLabel);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 49, 100, 50);
		panel_2.add(panel_3);

		txtProblem01 = new JTextArea();
		txtProblem01.setLineWrap(true);
		txtProblem01.setWrapStyleWord(true);
		txtProblem01.setBounds(3, 3, 94, 44);
		panel_3.add(txtProblem01);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 98, 100, 50);
		panel_2.add(panel_5);

		txtProblem02 = new JTextArea();
		txtProblem02.setLineWrap(true);
		txtProblem02.setWrapStyleWord(true);
		txtProblem02.setBounds(3, 3, 94, 44);
		panel_5.add(txtProblem02);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 147, 100, 50);
		panel_2.add(panel_6);

		txtProblem03 = new JTextArea();
		txtProblem03.setLineWrap(true);
		txtProblem03.setWrapStyleWord(true);
		txtProblem03.setBounds(3, 3, 94, 44);
		panel_6.add(txtProblem03);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 196, 100, 50);
		panel_2.add(panel_7);

		txtProblem04 = new JTextArea();
		txtProblem04.setLineWrap(true);
		txtProblem04.setWrapStyleWord(true);
		txtProblem04.setBounds(3, 3, 94, 44);
		panel_7.add(txtProblem04);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 245, 100, 50);
		panel_2.add(panel_8);

		txtProblem05 = new JTextArea();
		txtProblem05.setLineWrap(true);
		txtProblem05.setWrapStyleWord(true);
		txtProblem05.setBounds(3, 3, 94, 44);
		panel_8.add(txtProblem05);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(99, 0, 325, 295);
		panel_1.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 49, 325, 50);
		panel_9.add(panel_10);

		Notes defaultNotes1 = new Notes();
		defaultNotes1
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes1.setUserId(Global.currentLoggedInUserKey);
		defaultNotes1.setNoteText("");

		txtLastPeriod01 = new JxNotes(isCategories);
		txtLastPeriod01.setNotes(defaultNotes1);
		// txtLastPeriod01.setLineWrap(true);
		// txtLastPeriod01.setWrapStyleWord(true);
		txtLastPeriod01.setBounds(3, 3, 319, 44);
		panel_10.add(txtLastPeriod01);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 98, 325, 50);
		panel_9.add(panel_11);

		Notes defaultNotes2 = new Notes();
		defaultNotes2
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes2.setUserId(Global.currentLoggedInUserKey);
		defaultNotes2.setNoteText("");

		txtLastPeriod02 = new JxNotes(isCategories);
		txtLastPeriod02.setNotes(defaultNotes2);
		// txtLastPeriod02.setLineWrap(true);
		// txtLastPeriod02.setWrapStyleWord(true);
		txtLastPeriod02.setBounds(3, 3, 319, 44);
		panel_11.add(txtLastPeriod02);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 147, 325, 50);
		panel_9.add(panel_12);

		Notes defaultNotes3 = new Notes();
		defaultNotes3
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes3.setUserId(Global.currentLoggedInUserKey);
		defaultNotes3.setNoteText("");

		txtLastPeriod03 = new JxNotes(isCategories);
		txtLastPeriod03.setNotes(defaultNotes3);
		txtLastPeriod03.setBounds(3, 3, 319, 44);
		panel_12.add(txtLastPeriod03);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 196, 325, 50);
		panel_9.add(panel_13);

		Notes defaultNotes4 = new Notes();
		defaultNotes4
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes4.setUserId(Global.currentLoggedInUserKey);
		defaultNotes4.setNoteText("");

		txtLastPeriod04 = new JxNotes(isCategories);
		txtLastPeriod04.setNotes(defaultNotes4);
		// txtLastPeriod04.setLineWrap(true);
		// txtLastPeriod04.setWrapStyleWord(true);
		txtLastPeriod04.setBounds(3, 3, 319, 44);
		panel_13.add(txtLastPeriod04);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 245, 325, 50);
		panel_9.add(panel_14);

		Notes defaultNotes5 = new Notes();
		defaultNotes5
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes5.setUserId(Global.currentLoggedInUserKey);
		defaultNotes5.setNoteText("");

		txtLastPeriod05 = new JxNotes(isCategories);
		txtLastPeriod05.setNotes(defaultNotes5);
		// txtLastPeriod05.setLineWrap(true);
		// txtLastPeriod05.setWrapStyleWord(true);
		txtLastPeriod05.setBounds(3, 3, 319, 44);
		panel_14.add(txtLastPeriod05);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 325, 50);
		panel_9.add(panel_4);

		problemLabel_1 = new JLabel();
		problemLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		problemLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		problemLabel_1.setText("LAST PERIOD'S STATUS");
		problemLabel_1.setBounds(0, 6, 325, 18);
		panel_4.add(problemLabel_1);

		endDateLabel = new JLabel();
		endDateLabel.setFont(new Font("", Font.BOLD, 12));
		endDateLabel.setText("End Date:");
		endDateLabel.setBounds(40, 28, 54, 14);
		panel_4.add(endDateLabel);

		dcStatusEnd = new JDateChooser();
		dcStatusEnd.setDateFormatString("MM/dd/yyyy");
		dcStatusEnd.setBounds(100, 25, 185, 20);
		panel_4.add(dcStatusEnd);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(423, 0, 325, 295);
		panel_1.add(panel_16);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(0, 49, 325, 50);
		panel_16.add(panel_17);

		Notes defaultNotes01 = new Notes();
		defaultNotes01
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes01.setUserId(Global.currentLoggedInUserKey);
		defaultNotes01.setNoteText("");

		txtCurPeriod01 = new JxNotes(isCategories);
		txtCurPeriod01.setNotes(defaultNotes01);
		// txtCurPeriod01.setLineWrap(true);
		// txtCurPeriod01.setWrapStyleWord(true);
		txtCurPeriod01.setBounds(3, 3, 319, 44);
		panel_17.add(txtCurPeriod01);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 98, 325, 50);
		panel_16.add(panel_18);

		Notes defaultNotes02 = new Notes();
		defaultNotes02
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes02.setUserId(Global.currentLoggedInUserKey);
		defaultNotes02.setNoteText("");

		txtCurPeriod02 = new JxNotes(isCategories);
		txtCurPeriod02.setNotes(defaultNotes02);
		// txtCurPeriod02.setLineWrap(true);
		// txtCurPeriod02.setWrapStyleWord(true);
		txtCurPeriod02.setBounds(3, 3, 319, 44);
		panel_18.add(txtCurPeriod02);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 147, 325, 50);
		panel_16.add(panel_19);

		Notes defaultNotes03 = new Notes();
		defaultNotes03
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes03.setUserId(Global.currentLoggedInUserKey);
		defaultNotes03.setNoteText("");

		txtCurPeriod03 = new JxNotes(isCategories);
		txtCurPeriod03.setNotes(defaultNotes03);
		// txtCurPeriod03.setLineWrap(true);
		// txtCurPeriod03.setWrapStyleWord(true);
		txtCurPeriod03.setBounds(3, 3, 319, 44);
		panel_19.add(txtCurPeriod03);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 196, 325, 50);
		panel_16.add(panel_20);

		Notes defaultNotes04 = new Notes();
		defaultNotes04
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes04.setUserId(Global.currentLoggedInUserKey);
		defaultNotes04.setNoteText("");

		txtCurPeriod04 = new JxNotes(isCategories);
		txtCurPeriod04.setNotes(defaultNotes04);
		// txtCurPeriod04.setLineWrap(true);
		// txtCurPeriod04.setWrapStyleWord(true);
		txtCurPeriod04.setBounds(3, 3, 319, 44);
		panel_20.add(txtCurPeriod04);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 245, 325, 50);
		panel_16.add(panel_21);

		Notes defaultNotes05 = new Notes();
		defaultNotes05
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultNotes05.setUserId(Global.currentLoggedInUserKey);
		defaultNotes05.setNoteText("");

		txtCurPeriod05 = new JxNotes(isCategories);
		txtCurPeriod05.setNotes(defaultNotes05);
		// txtCurPeriod05.setLineWrap(true);
		// txtCurPeriod05.setWrapStyleWord(true);
		txtCurPeriod05.setBounds(3, 3, 319, 44);
		panel_21.add(txtCurPeriod05);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 0, 325, 50);
		panel_16.add(panel_22);

		problemLabel_2 = new JLabel();
		problemLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		problemLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		problemLabel_2.setText("CURRENT STATUS");
		problemLabel_2.setBounds(0, 6, 325, 18);
		panel_22.add(problemLabel_2);

		endDateLabel_1 = new JLabel();
		endDateLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		endDateLabel_1.setText("From:");
		endDateLabel_1.setBounds(40, 28, 32, 14);
		panel_22.add(endDateLabel_1);

		dcStatusFrom = new JDateChooser();
		dcStatusFrom.setDateFormatString("MM/dd/yyyy");
		dcStatusFrom.setBounds(78, 25, 92, 20);
		panel_22.add(dcStatusFrom);

		toLabel = new JLabel();
		toLabel.setFont(new Font("", Font.BOLD, 12));
		toLabel.setText("To:");
		toLabel.setBounds(176, 28, 17, 14);
		panel_22.add(toLabel);

		dcStatusTo = new JDateChooser();
		dcStatusTo.setDateFormatString("MM/dd/yyyy");
		dcStatusTo.setBounds(199, 25, 92, 20);
		panel_22.add(dcStatusTo);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(747, 0, 253, 295);
		panel_1.add(panel_23);

		problemLabel_3 = new JLabel();
		problemLabel_3.setBorder(new LineBorder(Color.black, 1, false));
		problemLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		problemLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		problemLabel_3.setText("UPDATED STG");
		problemLabel_3.setBounds(0, 0, 253, 50);
		panel_23.add(problemLabel_3);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 49, 253, 50);
		panel_23.add(panel_24);

		txtUpdatedStg01 = new JTextArea();
		txtUpdatedStg01.setLineWrap(true);
		txtUpdatedStg01.setWrapStyleWord(true);
		txtUpdatedStg01.setBounds(3, 3, 247, 44);
		panel_24.add(txtUpdatedStg01);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 98, 253, 50);
		panel_23.add(panel_25);

		txtUpdatedStg02 = new JTextArea();
		txtUpdatedStg02.setLineWrap(true);
		txtUpdatedStg02.setWrapStyleWord(true);
		txtUpdatedStg02.setBounds(3, 3, 247, 44);
		panel_25.add(txtUpdatedStg02);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 147, 253, 50);
		panel_23.add(panel_26);

		txtUpdatedStg03 = new JTextArea();
		txtUpdatedStg03.setLineWrap(true);
		txtUpdatedStg03.setWrapStyleWord(true);
		txtUpdatedStg03.setBounds(3, 3, 247, 44);
		panel_26.add(txtUpdatedStg03);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 196, 253, 50);
		panel_23.add(panel_27);

		txtUpdatedStg04 = new JTextArea();
		txtUpdatedStg04.setLineWrap(true);
		txtUpdatedStg04.setWrapStyleWord(true);
		txtUpdatedStg04.setBounds(3, 3, 247, 44);
		panel_27.add(txtUpdatedStg04);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 245, 253, 50);
		panel_23.add(panel_28);

		txtUpdatedStg05 = new JTextArea();
		txtUpdatedStg05.setLineWrap(true);
		txtUpdatedStg05.setWrapStyleWord(true);
		txtUpdatedStg05.setBounds(3, 3, 247, 44);
		panel_28.add(txtUpdatedStg05);

		panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(0, 424, 1000, 348);
		add(panel_15);

		improvementNotedLabel = new JLabel();
		improvementNotedLabel.setFont(new Font("", Font.BOLD, 12));
		improvementNotedLabel.setText("Improvement noted:");
		improvementNotedLabel.setBounds(20, 10, 113, 14);
		panel_15.add(improvementNotedLabel);

		rbImprovementYes = new JRadioButton();
		rbImprovementYes.setActionCommand("1");
		bgImprovement.add(rbImprovementYes);
		rbImprovementYes.setBackground(Color.WHITE);
		rbImprovementYes.setFont(new Font("", Font.BOLD, 12));
		rbImprovementYes.setText("yes");
		rbImprovementYes.setBounds(139, 9, 38, 18);
		panel_15.add(rbImprovementYes);

		rbImprovementNo = new JRadioButton();
		rbImprovementNo.setActionCommand("2");
		bgImprovement.add(rbImprovementNo);
		rbImprovementNo.setBackground(Color.WHITE);
		rbImprovementNo.setFont(new Font("", Font.BOLD, 12));
		rbImprovementNo.setText("no:");
		rbImprovementNo.setBounds(183, 9, 35, 18);
		panel_15.add(rbImprovementNo);

		Notes defaultImprovementNotes = new Notes();
		defaultImprovementNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultImprovementNotes.setUserId(Global.currentLoggedInUserKey);
		defaultImprovementNotes.setNoteText("");

		txtImprovementNoField = new JxNotes(isCategories);
		txtImprovementNoField.setNotes(defaultImprovementNotes);
		txtImprovementNoField.setBounds(224, 8, 354, 21);
		panel_15.add(txtImprovementNoField);

		complaintsOfLabel = new JLabel();
		complaintsOfLabel.setFont(new Font("", Font.BOLD, 12));
		complaintsOfLabel.setText("Complaints Of:");
		complaintsOfLabel.setBounds(584, 11, 83, 14);
		panel_15.add(complaintsOfLabel);

		cbComplaintsNone = new JCheckBox();
		cbComplaintsNone.setBackground(Color.WHITE);
		cbComplaintsNone.setFont(new Font("", Font.BOLD, 12));
		cbComplaintsNone.setText("None");
		cbComplaintsNone.setBounds(943, 9, 47, 18);
		panel_15.add(cbComplaintsNone);

		txtComplaintsOf = new JxRichTextField();
		txtComplaintsOf.setArc(0.1f);
		txtComplaintsOf.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtComplaintsOf.setRichTextFieldModel(txtComplaintsOf,
				"PtOtStPhysicalTherapy: Complaints Of");
		txtComplaintsOf.setBounds(673, 8, 264, 21);
		panel_15.add(txtComplaintsOf);

		cbProgressNoteAndReCert = new JCheckBox();
		cbProgressNoteAndReCert.setBackground(Color.WHITE);
		cbProgressNoteAndReCert.setBounds(10, 36, 14, 18);
		panel_15.add(cbProgressNoteAndReCert);

		progressNoteAndLabel = new JLabel();
		progressNoteAndLabel.setBorder(new LineBorder(Color.black, 1, false));
		progressNoteAndLabel.setHorizontalAlignment(SwingConstants.CENTER);
		progressNoteAndLabel.setFont(new Font("", Font.BOLD, 12));
		progressNoteAndLabel.setText("PROGRESS NOTE AND RE-CERTIFICATION");
		progressNoteAndLabel.setBounds(30, 32, 249, 27);
		panel_15.add(progressNoteAndLabel);

		summaryOfPtLabel = new JLabel();
		summaryOfPtLabel.setFont(new Font("", Font.BOLD, 12));
		summaryOfPtLabel.setText("Summary of Pt Resp to Tx");
		summaryOfPtLabel.setBounds(285, 38, 147, 14);
		panel_15.add(summaryOfPtLabel);

		focusOnAreasLabel = new JLabel();
		focusOnAreasLabel.setText("(focus on areas of improvement)");
		focusOnAreasLabel.setBounds(438, 38, 157, 14);
		panel_15.add(focusOnAreasLabel);

		Notes defaultSummaryNotes = new Notes();
		defaultSummaryNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultSummaryNotes.setUserId(Global.currentLoggedInUserKey);
		defaultSummaryNotes.setNoteText("");

		txtSummaryOfPtResp = new JxNotes(isCategories);
		txtSummaryOfPtResp.setNotes(defaultSummaryNotes);
		// txtSummaryOfPtResp.setLineWrap(true);
		// txtSummaryOfPtResp.setWrapStyleWord(true);
		txtSummaryOfPtResp.setBounds(30, 60, 960, 36);
		panel_15.add(txtSummaryOfPtResp);

		justificationToContinueLabel = new JLabel();
		justificationToContinueLabel.setFont(new Font("", Font.BOLD, 12));
		justificationToContinueLabel
				.setText("Justification to Continue Services");
		justificationToContinueLabel.setBounds(30, 97, 190, 14);
		panel_15.add(justificationToContinueLabel);

		indicateOutstandingGoalsLabel = new JLabel();
		indicateOutstandingGoalsLabel
				.setText("(Indicate outstanding goals & complexities affecting progress):");
		indicateOutstandingGoalsLabel.setBounds(224, 98, 301, 14);
		panel_15.add(indicateOutstandingGoalsLabel);

		Notes defaultJustificationNotes = new Notes();
		defaultJustificationNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultJustificationNotes.setUserId(Global.currentLoggedInUserKey);
		defaultJustificationNotes.setNoteText("");

		txtJustificationToCont = new JxNotes(isCategories);
		txtJustificationToCont.setNotes(defaultJustificationNotes);
		// txtJustificationToCont.setLineWrap(true);
		// txtJustificationToCont.setWrapStyleWord(true);
		txtJustificationToCont.setBounds(30, 112, 820, 18);
		panel_15.add(txtJustificationToCont);

		cbJustificationReached = new JCheckBox();
		cbJustificationReached.setBackground(Color.WHITE);
		cbJustificationReached.setFont(new Font("", Font.BOLD, 12));
		cbJustificationReached.setText("Reached med B CAP");
		cbJustificationReached.setBounds(856, 110, 134, 18);
		panel_15.add(cbJustificationReached);

		cbReCert = new JCheckBox();
		cbReCert.setBackground(Color.WHITE);
		cbReCert.setText("New JCheckBox");
		cbReCert.setBounds(10, 136, 14, 18);
		panel_15.add(cbReCert);

		progressNoteAndLabel_1 = new JLabel();
		progressNoteAndLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		progressNoteAndLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		progressNoteAndLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		progressNoteAndLabel_1.setText("RE-CERTIFICATION");
		progressNoteAndLabel_1.setBounds(30, 132, 126, 27);
		panel_15.add(progressNoteAndLabel_1);

		summaryOfPtLabel_1 = new JLabel();
		summaryOfPtLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		summaryOfPtLabel_1.setText("Re-certified or updated LTG:");
		summaryOfPtLabel_1.setBounds(162, 137, 158, 14);
		panel_15.add(summaryOfPtLabel_1);

		Notes defaultRecertOrUpdateNotes = new Notes();
		defaultRecertOrUpdateNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultRecertOrUpdateNotes.setUserId(Global.currentLoggedInUserKey);
		defaultRecertOrUpdateNotes.setNoteText("");

		txtReCertOrUpdateLtg = new JxNotes(isCategories);
		txtReCertOrUpdateLtg.setNotes(defaultRecertOrUpdateNotes);
		txtReCertOrUpdateLtg.setBounds(326, 135, 664, 21);
		panel_15.add(txtReCertOrUpdateLtg);

		summaryOfPtLabel_2 = new JLabel();
		summaryOfPtLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		summaryOfPtLabel_2.setText("Re-certified or updated Plan of Care:");
		summaryOfPtLabel_2.setBounds(30, 165, 205, 14);
		panel_15.add(summaryOfPtLabel_2);

		Notes defaultRecertPlanOfCareNotes = new Notes();
		defaultRecertPlanOfCareNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultRecertPlanOfCareNotes.setUserId(Global.currentLoggedInUserKey);
		defaultRecertPlanOfCareNotes.setNoteText("");

		txtReCertPlanOfCare = new JxNotes(isCategories);
		txtReCertPlanOfCare.setNotes(defaultRecertPlanOfCareNotes);
		txtReCertPlanOfCare.setBounds(241, 162, 405, 20);
		panel_15.add(txtReCertPlanOfCare);

		dcReCertToDate = new JDateChooser();
		dcReCertToDate.setEnabled(false);
		dcReCertToDate.setDateFormatString("MM/dd/yyyy");
		// dcReCertToDate.setDate(MedrexClientManager.getServerTime());
		dcReCertToDate.setBounds(898, 162, 92, 20);
		panel_15.add(dcReCertToDate);

		toLabel_1 = new JLabel();
		toLabel_1.setFont(new Font("", Font.BOLD, 12));
		toLabel_1.setText("To:");
		toLabel_1.setBounds(874, 165, 18, 14);
		panel_15.add(toLabel_1);

		dcReCertFromDate = new JDateChooser();
		dcReCertFromDate.setDate(MedrexClientManager.getServerTime());
		dcReCertFromDate
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent evt) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(dcReCertFromDate.getDate());
						cal.add(cal.MONTH, 1);
						dcReCertToDate.setDate(cal.getTime());
					}
				});
		dcReCertFromDate.setEnabled(false);
		dcReCertFromDate.setDateFormatString("MM/dd/yyyy");

		dcReCertFromDate.setBounds(776, 162, 92, 20);
		panel_15.add(dcReCertFromDate);

		recertDatesFromLabel = new JLabel();
		recertDatesFromLabel.setFont(new Font("", Font.BOLD, 12));
		recertDatesFromLabel.setText("Re-cert Dates: From:");
		recertDatesFromLabel.setBounds(652, 165, 118, 14);
		panel_15.add(recertDatesFromLabel);

		cbDischargeOnly = new JCheckBox();
		cbDischargeOnly.setBackground(Color.WHITE);
		cbDischargeOnly.setText("New JCheckBox");
		cbDischargeOnly.setBounds(10, 185, 14, 18);
		panel_15.add(cbDischargeOnly);

		progressNoteAndLabel_2 = new JLabel();
		progressNoteAndLabel_2.setBorder(new LineBorder(Color.black, 1, false));
		progressNoteAndLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		progressNoteAndLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		progressNoteAndLabel_2.setText("DISCHARGE ONLY");
		progressNoteAndLabel_2.setBounds(30, 181, 126, 27);
		panel_15.add(progressNoteAndLabel_2);

		summaryOfPtLabel_3 = new JLabel();
		summaryOfPtLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		summaryOfPtLabel_3.setText("Reason for discharge");
		summaryOfPtLabel_3.setBounds(162, 187, 122, 14);
		panel_15.add(summaryOfPtLabel_3);

		includePtResponseLabel = new JLabel();
		includePtResponseLabel
				.setText("(include pt response to tx & areas of improvement)");
		includePtResponseLabel.setBounds(288, 187, 246, 14);
		panel_15.add(includePtResponseLabel);

		Notes defaultReasonNotes = new Notes();
		defaultReasonNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultReasonNotes.setUserId(Global.currentLoggedInUserKey);
		defaultReasonNotes.setNoteText("");

		txtReasonForDischarge = new JxNotes(isCategories);
		txtReasonForDischarge.setNotes(defaultReasonNotes);
		// txtReasonForDischarge.setLineWrap(true);
		// txtReasonForDischarge.setWrapStyleWord(true);
		txtReasonForDischarge.setBounds(30, 209, 699, 20);
		panel_15.add(txtReasonForDischarge);

		dischargeLocationLabel = new JLabel();
		dischargeLocationLabel.setFont(new Font("", Font.BOLD, 12));
		dischargeLocationLabel.setText("Discharge Location:");
		dischargeLocationLabel.setBounds(735, 212, 115, 14);
		panel_15.add(dischargeLocationLabel);

		txtDischargeLoc = new JxRichTextField();
		txtDischargeLoc.setBounds(856, 209, 134, 20);
		txtDischargeLoc.setArc(0.1f);
		txtDischargeLoc.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtDischargeLoc.setRichTextFieldModel(txtDischargeLoc,
				"PtOtStPhysicalTherapy: Discharge Loc");
		panel_15.add(txtDischargeLoc);

		dischargeRecommendationsLabel = new JLabel();
		dischargeRecommendationsLabel.setFont(new Font("", Font.BOLD, 12));
		dischargeRecommendationsLabel.setText("Discharge Recommendations");
		dischargeRecommendationsLabel.setBounds(30, 235, 168, 14);
		panel_15.add(dischargeRecommendationsLabel);

		includeDischargeInstructionsLabel = new JLabel();
		includeDischargeInstructionsLabel
				.setText("(include discharge instructions, caregiver training and equipment):");
		includeDischargeInstructionsLabel.setBounds(204, 236, 317, 14);
		panel_15.add(includeDischargeInstructionsLabel);

		Notes defaultDischargeRecNotes = new Notes();
		defaultDischargeRecNotes
				.setFormName("Therapy ProgressNote/Re-certification/Discharge");
		defaultDischargeRecNotes.setUserId(Global.currentLoggedInUserKey);
		defaultDischargeRecNotes.setNoteText("");

		txtDischargeRecommend = new JxNotes(isCategories);
		txtDischargeRecommend.setNotes(defaultDischargeRecNotes);
		// txtDischargeRecommend.setLineWrap(true);
		// txtDischargeRecommend.setWrapStyleWord(true);
		txtDischargeRecommend.setBounds(30, 255, 764, 20);
		panel_15.add(txtDischargeRecommend);

		dcDischargeDate = new JDateChooser();
		dcDischargeDate.setDateFormatString("MM/dd/yyyy");
		dcDischargeDate.setBounds(898, 255, 92, 20);
		panel_15.add(dcDischargeDate);

		dischargeDateLabel = new JLabel();
		dischargeDateLabel.setFont(new Font("", Font.BOLD, 12));
		dischargeDateLabel.setText("Discharge Date:");
		dischargeDateLabel.setBounds(800, 258, 92, 14);
		panel_15.add(dischargeDateLabel);

		separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setOpaque(true);
		separator.setForeground(Color.BLACK);
		separator.setBounds(5, 281, 990, 3);
		panel_15.add(separator);

		therapySignatureLabel = new JLabel();
		therapySignatureLabel.setFont(new Font("", Font.BOLD, 12));
		therapySignatureLabel.setText("Therapy Signature:");
		therapySignatureLabel.setBounds(30, 296, 107, 14);
		panel_15.add(therapySignatureLabel);

		licenseLabel = new JLabel();
		licenseLabel.setFont(new Font("", Font.BOLD, 12));
		licenseLabel.setText("License #:");
		licenseLabel.setBounds(506, 296, 58, 14);
		panel_15.add(licenseLabel);

		txtLicenseNo = new JTextField();
		txtLicenseNo.setBounds(570, 293, 284, 21);
		panel_15.add(txtLicenseNo);

		dcTherapyDate = new JDateChooser();
		dcTherapyDate.setDateFormatString("MM/dd/yyyy");
		dcTherapyDate.setBounds(898, 293, 92, 21);
		panel_15.add(dcTherapyDate);

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setText("Date:");
		dateLabel.setBounds(863, 296, 29, 14);
		panel_15.add(dateLabel);

		cmbTherapySignature = new JComboBox();
		cmbTherapySignature.setBackground(Color.WHITE);
		cmbTherapySignature.setBounds(139, 293, 361, 21);
		panel_15.add(cmbTherapySignature);

		progressNoteAndLabel_3 = new JLabel();
		progressNoteAndLabel_3.setBorder(new LineBorder(Color.black, 1, false));
		progressNoteAndLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		progressNoteAndLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		progressNoteAndLabel_3.setText("FOR RE-CERT / DC ONLY");
		progressNoteAndLabel_3.setBounds(30, 316, 168, 27);
		panel_15.add(progressNoteAndLabel_3);

		mdNameLabel = new JLabel();
		mdNameLabel.setFont(new Font("", Font.BOLD, 12));
		mdNameLabel.setText("MD Name:");
		mdNameLabel.setBounds(204, 323, 58, 14);
		panel_15.add(mdNameLabel);

		txtMdName = new JTextField();
		txtMdName.setBounds(268, 320, 232, 21);
		panel_15.add(txtMdName);

		mdSignLabel = new JLabel();
		mdSignLabel.setFont(new Font("", Font.BOLD, 12));
		mdSignLabel.setText("MD Sign:");
		mdSignLabel.setBounds(506, 323, 50, 14);
		panel_15.add(mdSignLabel);

		cmbMdSign = new JComboBox();
		cmbMdSign.setBackground(Color.WHITE);
		cmbMdSign.setBounds(562, 320, 292, 21);
		panel_15.add(cmbMdSign);

		dateLabel_1 = new JLabel();
		dateLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1.setText("Date:");
		dateLabel_1.setBounds(863, 320, 29, 14);
		panel_15.add(dateLabel_1);

		dcReCertDcDate = new JDateChooser();
		dcReCertDcDate.setDateFormatString("MM/dd/yyyy");
		dcReCertDcDate.setBounds(898, 317, 92, 21);
		panel_15.add(dcReCertDcDate);

		fillcombo();
	}

	private void fillcombo() {
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
		cmbMdSign.addItem(user.getUserName());
		txtMdName.setText(user.getUserName());
		cmbTherapySignature.addItem(user.getUserName());
	}

	public void doSave() {

		PtOtStTherapyPhysical refPtOtStTherapyPhysical = new PtOtStTherapyPhysical();
		if (!(txtPrecautionsWbs.getText().equalsIgnoreCase(""))) {
			txtPrecautionsWbs
					.setRichTextFieldData("PtOtStPhysicalTherapy: Precautions Wbs");
			refPtOtStTherapyPhysical.setPrecautionsWbs(txtPrecautionsWbs
					.getField());
		}
		if (!(txtComplaintsOf.getText().equalsIgnoreCase(""))) {
			txtComplaintsOf
					.setRichTextFieldData("PtOtStPhysicalTherapy: Complaints Of");
			refPtOtStTherapyPhysical
					.setComplaintsOf(txtComplaintsOf.getField());
		}
		if (!(txtDischargeLoc.getText().equalsIgnoreCase(""))) {
			txtDischargeLoc
					.setRichTextFieldData("PtOtStPhysicalTherapy: Discharge Loc");
			refPtOtStTherapyPhysical
					.setDischargeLoc(txtDischargeLoc.getField());
		}
		refPtOtStTherapyPhysical.setResidentId(Global.currentResidenceKey);

		refPtOtStTherapyPhysical.setImprovement(SwingUtils
				.getSelectedButton(bgImprovement));
		refPtOtStTherapyPhysical.setReCertDcDate(dcReCertDcDate.getDate());
		refPtOtStTherapyPhysical
				.setMdSign((String) cmbMdSign.getSelectedItem());
		refPtOtStTherapyPhysical.setMdName(txtMdName.getText());
		refPtOtStTherapyPhysical
				.setTherapySignature((String) cmbTherapySignature
						.getSelectedItem());
		refPtOtStTherapyPhysical.setTherapyDate(dcTherapyDate.getDate());
		refPtOtStTherapyPhysical.setLicenseNo(txtLicenseNo.getText());
		refPtOtStTherapyPhysical.setDischargeDate(dcDischargeDate.getDate());
		refPtOtStTherapyPhysical.setDischargeRecommend(txtDischargeRecommend
				.getNotes());
		// refPtOtStTherapyPhysical.setDischargeLoc(txtDischargeLoc.getText());
		refPtOtStTherapyPhysical.setReasonForDischarge(txtReasonForDischarge
				.getNotes());
		refPtOtStTherapyPhysical.setDischargeOnly(cbDischargeOnly.isSelected());
		refPtOtStTherapyPhysical.setReCertFromDate(dcReCertFromDate.getDate());
		refPtOtStTherapyPhysical.setReCertToDate(dcReCertToDate.getDate());
		refPtOtStTherapyPhysical.setReCertPlanOfCare(txtReCertPlanOfCare
				.getNotes());
		refPtOtStTherapyPhysical.setReCertOrUpdateLtg(txtReCertOrUpdateLtg
				.getNotes());
		refPtOtStTherapyPhysical.setReCert(cbReCert.isSelected());
		refPtOtStTherapyPhysical.setJustificationReached(cbJustificationReached
				.isSelected());
		refPtOtStTherapyPhysical.setJustificationToCont(txtJustificationToCont
				.getNotes());
		refPtOtStTherapyPhysical.setSummaryOfPtResp(txtSummaryOfPtResp
				.getNotes());
		refPtOtStTherapyPhysical
				.setProgressNoteAndReCert(cbProgressNoteAndReCert.isSelected());
		// refPtOtStTherapyPhysical.setComplaintsOf(txtComplaintsOf.getText());
		refPtOtStTherapyPhysical.setComplaintsNone(cbComplaintsNone
				.isSelected());
		refPtOtStTherapyPhysical.setImprovementNoField(txtImprovementNoField
				.getNotes());
		refPtOtStTherapyPhysical.setUpdatedStg05(txtUpdatedStg05.getText());
		refPtOtStTherapyPhysical.setUpdatedStg04(txtUpdatedStg04.getText());
		refPtOtStTherapyPhysical.setUpdatedStg03(txtUpdatedStg03.getText());
		refPtOtStTherapyPhysical.setUpdatedStg02(txtUpdatedStg02.getText());
		refPtOtStTherapyPhysical.setUpdatedStg01(txtUpdatedStg01.getText());
		refPtOtStTherapyPhysical.setStatusTo(dcStatusTo.getDate());
		refPtOtStTherapyPhysical.setStatusFrom(dcStatusFrom.getDate());
		refPtOtStTherapyPhysical.setCurPeriod05(txtCurPeriod05.getNotes());
		refPtOtStTherapyPhysical.setCurPeriod04(txtCurPeriod04.getNotes());
		refPtOtStTherapyPhysical.setCurPeriod03(txtCurPeriod03.getNotes());
		refPtOtStTherapyPhysical.setCurPeriod02(txtCurPeriod02.getNotes());
		refPtOtStTherapyPhysical.setCurPeriod01(txtCurPeriod01.getNotes());
		refPtOtStTherapyPhysical.setStatusEnd(dcStatusEnd.getDate());
		refPtOtStTherapyPhysical.setLastPeriod05(txtLastPeriod05.getNotes());
		refPtOtStTherapyPhysical.setLastPeriod04(txtLastPeriod04.getNotes());
		refPtOtStTherapyPhysical.setLastPeriod03(txtLastPeriod03.getNotes());
		refPtOtStTherapyPhysical.setLastPeriod02(txtLastPeriod02.getNotes());
		refPtOtStTherapyPhysical.setLastPeriod01(txtLastPeriod01.getNotes());
		refPtOtStTherapyPhysical.setProblem05(txtProblem05.getText());
		refPtOtStTherapyPhysical.setProblem04(txtProblem04.getText());
		refPtOtStTherapyPhysical.setProblem03(txtProblem03.getText());
		refPtOtStTherapyPhysical.setProblem02(txtProblem02.getText());
		refPtOtStTherapyPhysical.setProblem01(txtProblem01.getText());
		refPtOtStTherapyPhysical.setSoc(txtSoc.getText());
		refPtOtStTherapyPhysical.setDx(txtDx.getText());
		refPtOtStTherapyPhysical.setOtherField(txtOtherField.getText());
		refPtOtStTherapyPhysical.setMed(SwingUtils.getSelectedButton(bgMed));
		// refPtOtStTherapyPhysical.setPrecautionsWbs(txtPrecautionsWbs.getText());
		refPtOtStTherapyPhysical.setHicNo(txtHicNo.getText());
		refPtOtStTherapyPhysical.setCertificationType(SwingUtils
				.getSelectedButton(bgCertificationType));
		// refPtOtStTherapyPhysical.setDischarge(rbDischarge.isSelected());
		// refPtOtStTherapyPhysical.setReCertification(rbReCertification
		// .isSelected());
		// refPtOtStTherapyPhysical.setProgressNote(rbProgressNote.isSelected());
		refPtOtStTherapyPhysical.setPtOtStTherapy((String) cmbPtOtStTherapy
				.getSelectedItem());
		try {
			Global.currentPtOtStTherapyPhysicalKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStTherapyPhysical(
							refPtOtStTherapyPhysical);
		} catch (Exception e) {
		}
	}

	public List<String> doValidate() {
		List<String> errorList = null;
		errorList = new ArrayList<String>();
		if (txtImprovementNoField.getNotes().getNoteText().equalsIgnoreCase("")) {
			errorList.add("Improvement Field cannot be left Blank");
		}
		if (txtLastPeriod01.getNotes().getNoteText().equalsIgnoreCase("")) {
			errorList.add("last period Field cannot be left Blank");
		}
		return errorList;
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			if (rm != null) {
				txt$PatientName.setText(rm.getUserName() + " "
						+ rm.getUserPass());
				txtHicNo.setText(rm.getMedicaidNum());
			}

		} catch (Exception e) {

		}
		PtOtStTherapyPhysical refPtOtStTherapyPhysical = null;

		if (Global.currentPtOtStTherapyPhysicalKey != 0) {

			try {
				refPtOtStTherapyPhysical = MedrexClientManager.getInstance()
						.getPtOtStTherapyPhysical(
								Global.currentPtOtStTherapyPhysicalKey);
			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgImprovement,
					refPtOtStTherapyPhysical.getImprovement());
			dcReCertDcDate.setDate(refPtOtStTherapyPhysical.getReCertDcDate());
			cmbMdSign.setSelectedItem(refPtOtStTherapyPhysical.getMdSign());
			txtMdName.setText(refPtOtStTherapyPhysical.getMdName());
			cmbTherapySignature.setSelectedItem(refPtOtStTherapyPhysical
					.getTherapySignature());
			dcTherapyDate.setDate(refPtOtStTherapyPhysical.getTherapyDate());
			txtLicenseNo.setText(refPtOtStTherapyPhysical.getLicenseNo());
			dcDischargeDate
					.setDate(refPtOtStTherapyPhysical.getDischargeDate());
			txtDischargeRecommend.setNotes(refPtOtStTherapyPhysical
					.getDischargeRecommend());
			txtDischargeLoc
					.setField(refPtOtStTherapyPhysical.getDischargeLoc());
			txtReasonForDischarge.setNotes(refPtOtStTherapyPhysical
					.getReasonForDischarge());
			cbDischargeOnly.setSelected(refPtOtStTherapyPhysical
					.isDischargeOnly());
			dcReCertFromDate.setDate(refPtOtStTherapyPhysical
					.getReCertFromDate());
			dcReCertToDate.setDate(refPtOtStTherapyPhysical.getReCertToDate());
			txtReCertPlanOfCare.setNotes(refPtOtStTherapyPhysical
					.getReCertPlanOfCare());
			txtReCertOrUpdateLtg.setNotes(refPtOtStTherapyPhysical
					.getReCertOrUpdateLtg());
			cbReCert.setSelected(refPtOtStTherapyPhysical.isReCert());
			cbJustificationReached.setSelected(refPtOtStTherapyPhysical
					.isJustificationReached());
			txtJustificationToCont.setNotes(refPtOtStTherapyPhysical
					.getJustificationToCont());
			txtSummaryOfPtResp.setNotes(refPtOtStTherapyPhysical
					.getSummaryOfPtResp());
			cbProgressNoteAndReCert.setSelected(refPtOtStTherapyPhysical
					.isProgressNoteAndReCert());
			txtComplaintsOf
					.setField(refPtOtStTherapyPhysical.getComplaintsOf());
			cbComplaintsNone.setSelected(refPtOtStTherapyPhysical
					.isComplaintsNone());
			txtImprovementNoField.setNotes(refPtOtStTherapyPhysical
					.getImprovementNoField());
			txtUpdatedStg05.setText(refPtOtStTherapyPhysical.getUpdatedStg05());
			txtUpdatedStg04.setText(refPtOtStTherapyPhysical.getUpdatedStg04());
			txtUpdatedStg03.setText(refPtOtStTherapyPhysical.getUpdatedStg03());
			txtUpdatedStg02.setText(refPtOtStTherapyPhysical.getUpdatedStg02());
			txtUpdatedStg01.setText(refPtOtStTherapyPhysical.getUpdatedStg01());
			dcStatusTo.setDate(refPtOtStTherapyPhysical.getStatusTo());
			dcStatusFrom.setDate(refPtOtStTherapyPhysical.getStatusFrom());
			txtCurPeriod05.setNotes(refPtOtStTherapyPhysical.getCurPeriod05());
			txtCurPeriod04.setNotes(refPtOtStTherapyPhysical.getCurPeriod04());
			txtCurPeriod03.setNotes(refPtOtStTherapyPhysical.getCurPeriod03());
			txtCurPeriod02.setNotes(refPtOtStTherapyPhysical.getCurPeriod02());
			txtCurPeriod01.setNotes(refPtOtStTherapyPhysical.getCurPeriod01());
			dcStatusEnd.setDate(refPtOtStTherapyPhysical.getStatusEnd());
			txtLastPeriod05
					.setNotes(refPtOtStTherapyPhysical.getLastPeriod05());
			txtLastPeriod04
					.setNotes(refPtOtStTherapyPhysical.getLastPeriod04());
			txtLastPeriod03
					.setNotes(refPtOtStTherapyPhysical.getLastPeriod03());
			txtLastPeriod02
					.setNotes(refPtOtStTherapyPhysical.getLastPeriod02());
			txtLastPeriod01
					.setNotes(refPtOtStTherapyPhysical.getLastPeriod01());
			txtProblem05.setText(refPtOtStTherapyPhysical.getProblem05());
			txtProblem04.setText(refPtOtStTherapyPhysical.getProblem04());
			txtProblem03.setText(refPtOtStTherapyPhysical.getProblem03());
			txtProblem02.setText(refPtOtStTherapyPhysical.getProblem02());
			txtProblem01.setText(refPtOtStTherapyPhysical.getProblem01());
			txtSoc.setText(refPtOtStTherapyPhysical.getSoc());
			txtDx.setText(refPtOtStTherapyPhysical.getDx());
			txtOtherField.setText(refPtOtStTherapyPhysical.getOtherField());
			// cbHmo.setSelected(refPtOtStTherapyPhysical.isHmo());
			SwingUtils.setSelectedButton(bgMed, refPtOtStTherapyPhysical
					.getMed());
			txtPrecautionsWbs.setField(refPtOtStTherapyPhysical
					.getPrecautionsWbs());
			// txtHicNo.setText(refPtOtStTherapyPhysical.getHicNo());
			SwingUtils.setSelectedButton(bgCertificationType,
					refPtOtStTherapyPhysical.getCertificationType());
			cmbPtOtStTherapy.setSelectedItem(refPtOtStTherapyPhysical
					.getPtOtStTherapy());
		}
	}
}
