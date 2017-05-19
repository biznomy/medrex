package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.diagnosis.FrameResidentDiagnosisConfirm;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalDailyRecord;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxRichTextField;
import com.sX.swing.JxTextArea;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStOccupationalDailyRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9223010026284272280L;
	private JButton btnNextWeek;
	private JButton btnPreviousWeek;
	private JButton btnSat;
	private JButton btnFri;
	private JButton btnThuAdd;
	private JButton btnWedAdd;
	private JButton btnTuesdayAdd;
	private JButton btnMondayAdd;
	private JButton btnSundayAdd;
	private JButton btnAddDiagnosis;
	private JButton btnPlus_62;
	private JButton btnPlus_61;
	private JButton btnPlus_60;
	private JButton btnPlus_59;
	private JButton btnPlus_58;
	private JButton btnPlus_57;
	private JButton btnPlus_56;
	private JLabel therapyLabel_15;
	private JLabel therapyLabel_6;
	private JLabel therapyLabel_5;
	private JLabel therapyLabel_4;
	private JDateChooser dcCoSignLicDate;
	private JTextField txtLicenseNo03;
	private JComboBox cmbSignature03;
	private JComboBox cmbPrintTherapInitials03;
	private JTextField txtLicenseNo02;
	private JComboBox cmbSignature02;
	private JComboBox cmbPrintTherapInitials02;
	private JTextField txtCoSignLic;
	private JTextField txtLicenseNo01;
	private JComboBox cmbSignature01;
	private JComboBox cmbPrintTherapInitials01;
	private JCheckBox cbCosignNa;
	private JLabel cosignLicLabel;
	private JLabel licenseLabel;
	private JLabel signatureLabel;
	private JLabel printTherapNameLabel;
	private JPanel panel_17;
	private JComboBox cmbInitialsSat;
	private JPanel panel_98;
	private JTextArea txtTotalMinSat;
	private JPanel panel_97;
	private JxTextArea txtIncidentsSat;
	private JPanel panel_96;
	private JxTextArea txtOther02Sat;
	private JPanel panel_95;
	private JxTextArea txtOther01Sat;
	private JPanel panel_94;
	private JxTextArea txtOdr97535Sat;
	private JPanel panel_93;
	private JxTextArea txtOdr97530Sat;
	private JPanel panel_92;
	private JPanel panel_91;
	private JxTextArea txtOdr97110Saturday;
	private JPanel panel_90;
	private JCheckBox cbOdr97003Satuday;
	private JPanel panel_89;
	private JDateChooser dcDateSaturday;
	private JLabel sundayLabel_6;
	private JPanel panel_88;
	private JPanel panel_87;
	private JComboBox cmbInitialsFri;
	private JPanel panel_86;
	private JTextArea txtTotalMinFri;
	private JPanel panel_85;
	private JxTextArea txtIncidentsFri;
	private JPanel panel_84;
	private JxTextArea txtOther02Fri;
	private JPanel panel_83;
	private JxTextArea txtOther01Fri;
	private JPanel panel_82;
	private JxTextArea txtOdr97535Fri;
	private JPanel panel_81;
	private JxTextArea txtOdr97530Fri;
	private JPanel panel_80;
	private JxTextArea txtOdr97112Fri;
	private JPanel panel_79;
	private JxTextArea txtOdr97110Friday;
	private JPanel panel_78;
	private JCheckBox cbOdr97003Friday;
	private JPanel panel_77;
	private JDateChooser dcDateFriday;
	private JLabel sundayLabel_5;
	private JPanel panel_76;
	private JPanel panel_75;
	private JComboBox cmbInitialsThu;
	private JPanel panel_74;
	private JTextArea txtTotalMinThu;
	private JPanel panel_73;
	private JxTextArea txtIncidentsThu;
	private JPanel panel_72;
	private JxTextArea txtOther02Thu;
	private JPanel panel_71;
	private JxTextArea txtOther01Thu;
	private JPanel panel_70;
	private JxTextArea txtOdr97535Thu;
	private JPanel panel_69;
	private JxTextArea txtOdr97530Thu;
	private JPanel panel_68;
	private JxTextArea txtOdr97112Thu;
	private JPanel panel_67;
	private JxTextArea txtOdr97110Thursday;
	private JPanel panel_66;
	private JCheckBox cbOdr97003Thursday;
	private JPanel panel_65;
	private JDateChooser dcDateThursday;
	private JLabel sundayLabel_4;
	private JPanel panel_64;
	private JPanel panel_63;
	private JComboBox cmbInitialsWed;
	private JPanel panel_62;
	private JTextArea txtTotalMinWed;
	private JPanel panel_61;
	private JxTextArea txtIncidentsWed;
	private JPanel panel_60;
	private JxTextArea txtOther02Wed;
	private JPanel panel_59;
	private JxTextArea txtOther01Wed;
	private JPanel panel_58;
	private JxTextArea txtOdr97535Wed;
	private JPanel panel_57;
	private JxTextArea txtOdr97530Wed;
	private JPanel panel_56;
	private JxTextArea txtOdr97112Wed;
	private JPanel panel_55;
	private JxTextArea txtOdr97110Wednesday;
	private JPanel panel_54;
	private JCheckBox cbOdr97003Wednesday;
	private JPanel panel_53;
	private JDateChooser dcDateWednesday;
	private JLabel sundayLabel_3;
	private JPanel panel_52;
	private JPanel panel_51;
	private JComboBox cmbInitialsTue;
	private JPanel panel_50;
	private JTextArea txtTotalMinTue;
	private JPanel panel_49;
	private JxTextArea txtIncidentsTue;
	private JPanel panel_48;
	private JxTextArea txtOther02Tue;
	private JPanel panel_47;
	private JxTextArea txtOther01Tue;
	private JPanel panel_46;
	private JxTextArea txtOdr97535Tue;
	private JPanel panel_45;
	private JxTextArea txtOdr97530Tue;
	private JPanel panel_44;
	private JxTextArea txtOdr97112Tue;
	private JPanel panel_43;
	private JxTextArea txtOdr97110Tuesday;
	private JPanel panel_42;
	private JCheckBox cbOdr97003Tuesday;
	private JPanel panel_41;
	private JDateChooser dcDateTuesday;
	private JLabel sundayLabel_2;
	private JPanel panel_40;
	private JPanel panel_39;
	private JComboBox cmbInitialsMon;
	private JPanel panel_38;
	private JTextArea txtTotalMinMon;
	private JPanel panel_37;
	private JxTextArea txtIncidentsMon;
	private JPanel panel_36;
	private JxTextArea txtOther02Mon;
	private JPanel panel_35;
	private JxTextArea txtOther01Mon;
	private JPanel panel_34;
	private JxTextArea txtOdr97535Mon;
	private JPanel panel_33;
	private JxTextArea txtOdr97530Mon;
	private JPanel panel_32;
	private JxTextArea txtOdr97112Mon;
	private JPanel panel_31;
	private JxTextArea txtOdr97110Monday;
	private JPanel panel_30;
	private JCheckBox cbOdr97003Monday;
	private JPanel panel_29;
	private JDateChooser dcDateMonday;
	private JLabel sundayLabel_1;
	private JPanel panel_28;
	private JPanel panel_27;
	private JComboBox cmbInitialsSun;
	private JPanel panel_26;
	private JTextArea txtTotalMinSun;
	private JPanel panel_25;
	private JxTextArea txtIncidentsSun;
	private JPanel panel_24;
	private JxTextArea txtOther02Sun;
	private JPanel panel_23;
	private JxTextArea txtOther01Sun;
	private JPanel panel_22;
	private JxTextArea txtOdr97535Sun;
	private JPanel panel_21;
	private JxTextArea txtOdr97530Sun;
	private JPanel panel_20;
	private JxTextArea txtOdr97112Sun;
	private JPanel panel_19;
	private JxTextArea txtOdr97110Sunday;
	private JPanel panel_18;
	private JCheckBox cbOdr97003Sunday;
	private JPanel panel_16;
	private JDateChooser dcDateSunday;
	private JLabel sundayLabel;
	private JPanel panel_15;
	private JPanel panel_5;
	private JLabel eval97003Label_2;
	private JPanel panel_14;
	private JLabel eval97003Label_1;
	private JPanel panel_13;
	private JLabel therapyLabel_14;
	private JLabel therapyLabel_13;
	private JLabel therapyLabel_12;
	private JLabel therapyLabel_11;
	private JLabel incidentsLabel;
	private JPanel panel_12;
	private JTextArea txtOtherRowField02;
	private JLabel otherLabel_1;
	private JPanel panel_11;
	private JTextArea txtOtherRowField01;
	private JLabel otherLabel;
	private JPanel panel_10;
	private JLabel therapyLabel_7;
	private JLabel label_4;
	private JPanel panel_9;
	private JLabel label_3;
	private JPanel panel_8;
	private JLabel therapyLabel_3;
	private JLabel therapyLabel_2;
	private JLabel label_2;
	private JPanel panel_7;
	private JLabel therapyLabel_1;
	private JLabel therapyLabel;
	private JLabel label;
	private JLabel eval97003Label;
	private JPanel panel_6;
	private JPanel panel_4;
	private JLabel daydateLabel;
	private JPanel panel_3;
	private JPanel panel_2;
	private JxRichTextField txtPrecautions;
	private JLabel patientNameLabel_6;
	private JTextField txtDx;
	private JLabel patientNameLabel_5;
	private JTextField txtOtherField;
	private JCheckBox cbOther;
	private JCheckBox cbHmo;
	private JCheckBox cbMedB;
	private JCheckBox cbMedA;
	private JTextField txt$Year;
	private JLabel patientNameLabel_4;
	private JComboBox cmbFrequency;
	private JLabel patientNameLabel_3;
	private JTextField txt$RoomNo;
	private JLabel patientNameLabel_2;
	private JTextField txtHicNo;
	private JLabel patientNameLabel_1;
	private JTextField txt$PatientName;
	private JLabel patientNameLabel;
	private JPanel panel_1;
	private JLabel physicalTherapyDailyLabel;
	private JPanel panel;
	private JxTextArea txtOdr97112Sat;
	private Calendar calendar;
	private int key = 0;
	private Notes defaultNotesSun1;
	private Notes defaultNotesSun2;
	private Notes defaultNotesSun3;
	private Notes defaultNotesSun4;
	private Notes defaultNotesSun5;
	private Notes defaultNotesSun6;
	private Notes defaultNotesSun7;
	private Notes defaultNotesMon1;
	private Notes defaultNotesMon2;
	private Notes defaultNotesMon3;
	private Notes defaultNotesMon4;
	private Notes defaultNotesMon5;
	private Notes defaultNotesMon6;
	private Notes defaultNotesMon7;
	private Notes defaultNotesTue1;
	private Notes defaultNotesTue2;
	private Notes defaultNotesTue3;
	private Notes defaultNotesTue4;
	private Notes defaultNotesTue5;
	private Notes defaultNotesTue6;
	private Notes defaultNotesTue7;
	private Notes defaultNotesWed1;
	private Notes defaultNotesWed2;
	private Notes defaultNotesWed3;
	private Notes defaultNotesWed4;
	private Notes defaultNotesWed5;
	private Notes defaultNotesWed6;
	private Notes defaultNotesWed7;
	private Notes defaultNotesThu1;
	private Notes defaultNotesThu2;
	private Notes defaultNotesThu3;
	private Notes defaultNotesThu4;
	private Notes defaultNotesThu5;
	private Notes defaultNotesThu6;
	private Notes defaultNotesThu7;
	private Notes defaultNotesFri1;
	private Notes defaultNotesFri2;
	private Notes defaultNotesFri3;
	private Notes defaultNotesFri4;
	private Notes defaultNotesFri5;
	private Notes defaultNotesFri6;
	private Notes defaultNotesFri7;
	private Notes defaultNotesSat1;
	private Notes defaultNotesSat2;
	private Notes defaultNotesSat3;
	private Notes defaultNotesSat4;
	private Notes defaultNotesSat5;
	private Notes defaultNotesSat6;
	private Notes defaultNotesSat7;
	private Notes defaultNotes;

	/**
	 * Create the panel
	 */
	public PanelPtOtStOccupationalDailyRecord() {
		super();
		Global.panelPtOtStOccupationalDailyRecord = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1328, 1100));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1327, 101);
		add(panel);

		physicalTherapyDailyLabel = new JLabel();
		physicalTherapyDailyLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 20));
		physicalTherapyDailyLabel
				.setText("Occupational Therapy: Daily Treament Record");
		physicalTherapyDailyLabel.setBounds(465, 10, 397, 22);
		panel.add(physicalTherapyDailyLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 38, 1327, 63);
		panel.add(panel_1);

		patientNameLabel = new JLabel();
		patientNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel.setText("PATIENT NAME:");
		patientNameLabel.setBounds(10, 10, 93, 14);
		panel_1.add(patientNameLabel);

		txt$PatientName = new JTextField();
		txt$PatientName.setBackground(Color.WHITE);
		txt$PatientName.setEditable(false);
		txt$PatientName.setBounds(109, 7, 345, 21);
		panel_1.add(txt$PatientName);

		patientNameLabel_1 = new JLabel();
		patientNameLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_1.setText("HIC #");
		patientNameLabel_1.setBounds(460, 10, 31, 14);
		panel_1.add(patientNameLabel_1);

		txtHicNo = new JTextField();
		txtHicNo.setBounds(497, 7, 301, 21);
		panel_1.add(txtHicNo);

		patientNameLabel_2 = new JLabel();
		patientNameLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_2.setText("ROOM #:");
		patientNameLabel_2.setBounds(804, 10, 52, 14);
		panel_1.add(patientNameLabel_2);

		txt$RoomNo = new JTextField();
		txt$RoomNo.setBackground(Color.WHITE);
		txt$RoomNo.setEditable(false);
		txt$RoomNo.setBounds(862, 7, 93, 21);
		panel_1.add(txt$RoomNo);

		patientNameLabel_3 = new JLabel();
		patientNameLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_3.setText("FREQUENCY:");
		patientNameLabel_3.setBounds(961, 10, 77, 14);
		panel_1.add(patientNameLabel_3);

		cmbFrequency = new JComboBox();
		cmbFrequency.setModel(new DefaultComboBoxModel(new String[] { "",
				"3-5 Weeks", "5-6 Weeks" }));
		cmbFrequency.setBackground(Color.WHITE);
		cmbFrequency.setEditable(false);
		cmbFrequency.setBounds(1044, 7, 135, 21);
		panel_1.add(cmbFrequency);

		cbMedA = new JCheckBox();
		cbMedA.setBackground(Color.WHITE);
		cbMedA.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbMedA.setText("MED A");
		cbMedA.setBounds(20, 36, 56, 18);
		panel_1.add(cbMedA);

		cbMedB = new JCheckBox();
		cbMedB.setBackground(Color.WHITE);
		cbMedB.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbMedB.setText("MED B");
		cbMedB.setBounds(82, 36, 56, 18);
		panel_1.add(cbMedB);

		cbHmo = new JCheckBox();
		cbHmo.setBackground(Color.WHITE);
		cbHmo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbHmo.setText("HMO");
		cbHmo.setBounds(144, 36, 56, 18);
		panel_1.add(cbHmo);

		cbOther = new JCheckBox();
		cbOther.setBackground(Color.WHITE);
		cbOther.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbOther.setText("OTHER");
		cbOther.setBounds(206, 36, 60, 18);
		panel_1.add(cbOther);

		txtOtherField = new JTextField();
		txtOtherField.setBounds(272, 35, 219, 21);
		panel_1.add(txtOtherField);

		patientNameLabel_5 = new JLabel();
		patientNameLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_5.setText("DX:");
		patientNameLabel_5.setBounds(497, 38, 21, 14);
		panel_1.add(patientNameLabel_5);

		txtDx = new JTextField();
		txtDx.setBounds(524, 35, 256, 21);
		panel_1.add(txtDx);

		patientNameLabel_6 = new JLabel();
		patientNameLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_6.setText("PRECAUTIONS/WBS:");
		patientNameLabel_6.setBounds(831, 38, 120, 14);
		panel_1.add(patientNameLabel_6);

		txtPrecautions = new JxRichTextField();
		txtPrecautions.setBounds(961, 35, 356, 21);
		txtPrecautions.setArc(0.1f);
		txtPrecautions.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtPrecautions.setRichTextFieldModel(txtPrecautions,
				"PtOtStOccupationalDailyRecord: Precautions");
		panel_1.add(txtPrecautions);

		btnAddDiagnosis = new JButton();
		btnAddDiagnosis.setBackground(Color.WHITE);
		btnAddDiagnosis.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		btnAddDiagnosis.setText("+");
		btnAddDiagnosis.setBounds(786, 35, 31, 21);
		panel_1.add(btnAddDiagnosis);

		patientNameLabel_4 = new JLabel();
		patientNameLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_4.setText("YEAR:");
		patientNameLabel_4.setBounds(1026, 17, 35, 14);
		panel.add(patientNameLabel_4);

		final JLabel lblYear = new JLabel();
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblYear.setText(new SimpleDateFormat("yyyy").format(MedrexClientManager
				.getServerTime()));
		lblYear.setBounds(1067, 14, 99, 21);
		panel.add(lblYear);

		/*
		 * txt$Year = new JTextField(); txt$Year.setBackground(Color.WHITE);
		 * txt$Year.setEditable(false); txt$Year.setBounds(1218, 11, 99, 21);
		 * panel.add(txt$Year);
		 */

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 135, 1328, 798);
		add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 50, 110, 732);
		panel_2.add(panel_3);

		daydateLabel = new JLabel();
		daydateLabel.setFont(new Font("", Font.BOLD, 12));
		daydateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		daydateLabel.setBorder(new LineBorder(Color.black, 1, false));
		daydateLabel.setText("DAY/ DATE");
		daydateLabel.setBounds(0, 0, 110, 28);
		panel_3.add(daydateLabel);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 27, 110, 28);
		panel_3.add(panel_4);

		eval97003Label = new JLabel();
		eval97003Label.setFont(new Font("", Font.BOLD, 12));
		eval97003Label.setText("EVAL 97003");
		eval97003Label.setBounds(20, 7, 70, 14);
		panel_4.add(eval97003Label);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 54, 110, 84);
		panel_3.add(panel_6);

		label = new JLabel();
		label.setFont(new Font("", Font.BOLD, 12));
		label.setText("97110");
		label.setBounds(37, 20, 35, 14);
		panel_6.add(label);

		therapyLabel = new JLabel();
		therapyLabel.setFont(new Font("", Font.BOLD, 12));
		therapyLabel.setText("THERAPY");
		therapyLabel.setBounds(28, 35, 54, 14);
		panel_6.add(therapyLabel);

		therapyLabel_1 = new JLabel();
		therapyLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_1.setText("EXERCISES");
		therapyLabel_1.setBounds(23, 50, 64, 14);
		panel_6.add(therapyLabel_1);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 137, 110, 84);
		panel_3.add(panel_7);

		label_2 = new JLabel();
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setText("97112");
		label_2.setBounds(37, 20, 35, 14);
		panel_7.add(label_2);

		therapyLabel_2 = new JLabel();
		therapyLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_2.setText("NEUROMUSC.");
		therapyLabel_2.setBounds(16, 35, 77, 14);
		panel_7.add(therapyLabel_2);

		therapyLabel_3 = new JLabel();
		therapyLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_3.setText("RE-ED/BALANCE");
		therapyLabel_3.setBounds(9, 50, 91, 14);
		panel_7.add(therapyLabel_3);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 220, 110, 122);
		panel_3.add(panel_8);

		label_3 = new JLabel();
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setText("97530");
		label_3.setBounds(37, 20, 35, 14);
		panel_8.add(label_3);

		therapyLabel_4 = new JLabel();
		therapyLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_4.setText("THERAPEUTIC");
		therapyLabel_4.setBounds(10, 35, 85, 14);
		panel_8.add(therapyLabel_4);

		therapyLabel_5 = new JLabel();
		therapyLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_5.setText("ACTIVITIES TO");
		therapyLabel_5.setBounds(12, 50, 81, 14);
		panel_8.add(therapyLabel_5);

		therapyLabel_6 = new JLabel();
		therapyLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_6.setText("INCR FXNL");
		therapyLabel_6.setBounds(23, 65, 59, 14);
		panel_8.add(therapyLabel_6);

		therapyLabel_15 = new JLabel();
		therapyLabel_15.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_15.setText("PERFORMANCE");
		therapyLabel_15.setBounds(9, 80, 88, 14);
		panel_8.add(therapyLabel_15);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.BLACK, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 341, 110, 108);
		panel_3.add(panel_9);

		label_4 = new JLabel();
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setText("97535");
		label_4.setBounds(37, 39, 35, 14);
		panel_9.add(label_4);

		therapyLabel_7 = new JLabel();
		therapyLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_7.setText("SELF CARE/ADL");
		therapyLabel_7.setBounds(11, 54, 88, 14);
		panel_9.add(therapyLabel_7);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 448, 110, 51);
		panel_3.add(panel_10);

		otherLabel = new JLabel();
		otherLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		otherLabel.setText("OTHER");
		otherLabel.setBounds(3, 3, 39, 14);
		panel_10.add(otherLabel);

		txtOtherRowField01 = new JTextArea();
		txtOtherRowField01.setWrapStyleWord(true);
		txtOtherRowField01.setLineWrap(true);
		txtOtherRowField01.setBounds(3, 18, 104, 28);
		panel_10.add(txtOtherRowField01);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 498, 110, 51);
		panel_3.add(panel_11);

		otherLabel_1 = new JLabel();
		otherLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		otherLabel_1.setText("OTHER");
		otherLabel_1.setBounds(3, 3, 39, 14);
		panel_11.add(otherLabel_1);

		txtOtherRowField02 = new JTextArea();
		txtOtherRowField02.setWrapStyleWord(true);
		txtOtherRowField02.setLineWrap(true);
		txtOtherRowField02.setBounds(3, 18, 104, 28);
		panel_11.add(txtOtherRowField02);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 548, 110, 130);
		panel_3.add(panel_12);

		incidentsLabel = new JLabel();
		incidentsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		incidentsLabel.setText("INCIDENTS/");
		incidentsLabel.setBounds(23, 28, 63, 14);
		panel_12.add(incidentsLabel);

		therapyLabel_11 = new JLabel();
		therapyLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_11.setText("EQUIPMENT/");
		therapyLabel_11.setBounds(20, 43, 70, 14);
		panel_12.add(therapyLabel_11);

		therapyLabel_12 = new JLabel();
		therapyLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_12.setText("DEVICES/");
		therapyLabel_12.setBounds(29, 58, 52, 14);
		panel_12.add(therapyLabel_12);

		therapyLabel_13 = new JLabel();
		therapyLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_13.setText("CONSULTS/NEW");
		therapyLabel_13.setBounds(8, 73, 94, 14);
		panel_12.add(therapyLabel_13);

		therapyLabel_14 = new JLabel();
		therapyLabel_14.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_14.setText("ORDERS");
		therapyLabel_14.setBounds(31, 88, 48, 14);
		panel_12.add(therapyLabel_14);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 677, 110, 28);
		panel_3.add(panel_13);

		eval97003Label_1 = new JLabel();
		eval97003Label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		eval97003Label_1.setText("TOTAL MINUTES");
		eval97003Label_1.setBounds(9, 7, 92, 14);
		panel_13.add(eval97003Label_1);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 704, 110, 28);
		panel_3.add(panel_14);

		eval97003Label_2 = new JLabel();
		eval97003Label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		eval97003Label_2.setText("INITIALS");
		eval97003Label_2.setBounds(31, 7, 47, 14);
		panel_14.add(eval97003Label_2);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(109, 50, 175, 732);
		panel_2.add(panel_5);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 175, 28);
		panel_5.add(panel_15);

		sundayLabel = new JLabel();
		sundayLabel.setFont(new Font("", Font.BOLD, 12));
		sundayLabel.setText("SUNDAY");
		sundayLabel.setBounds(3, 7, 47, 14);
		panel_15.add(sundayLabel);

		dcDateSunday = new JDateChooser();
		dcDateSunday.setDateFormatString("MM/dd/yyyy");
		dcDateSunday.setBounds(80, 4, 92, 21);
		panel_15.add(dcDateSunday);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(0, 27, 175, 28);
		panel_5.add(panel_16);

		cbOdr97003Sunday = new JCheckBox();
		cbOdr97003Sunday.setBackground(Color.WHITE);
		cbOdr97003Sunday.setEnabled(false);
		cbOdr97003Sunday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Sunday.setBounds(85, 3, 15, 22);
		panel_16.add(cbOdr97003Sunday);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 54, 175, 84);
		panel_5.add(panel_18);

		defaultNotesSun1 = new Notes();
		defaultNotesSun1.setFormName("Occupational Daily Record");
		defaultNotesSun1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun1.setNoteText("");

		txtOdr97110Sunday = new JxTextArea();
		txtOdr97110Sunday.setNotes(defaultNotesSun1);
		txtOdr97110Sunday.setBackground(Color.WHITE);
		txtOdr97110Sunday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Sunday.setBounds(3, 3, 169, 78);
		txtOdr97110Sunday.setEditable(false);
		panel_18.add(txtOdr97110Sunday);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 137, 175, 84);
		panel_5.add(panel_19);

		defaultNotesSun2 = new Notes();
		defaultNotesSun2.setFormName("Occupational Daily Record");
		defaultNotesSun2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun2.setNoteText("");

		txtOdr97112Sun = new JxTextArea();
		txtOdr97112Sun.setNotes(defaultNotesSun2);
		txtOdr97112Sun.setBackground(Color.WHITE);
		txtOdr97112Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97112Sun.setWrapStyleWord(true);
		// txtOdr97112Sun.setLineWrap(true);
		txtOdr97112Sun.setBounds(3, 3, 169, 78);
		txtOdr97112Sun.setEditable(false);
		panel_19.add(txtOdr97112Sun);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 220, 175, 122);
		panel_5.add(panel_20);

		defaultNotesSun3 = new Notes();
		defaultNotesSun3.setFormName("Occupational Daily Record");
		defaultNotesSun3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun3.setNoteText("");

		txtOdr97530Sun = new JxTextArea();
		txtOdr97530Sun.setNotes(defaultNotesSun3);
		txtOdr97530Sun.setBackground(Color.WHITE);
		txtOdr97530Sun.setEditable(false);
		txtOdr97530Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97530Sun.setWrapStyleWord(true);
		// txtOdr97530Sun.setLineWrap(true);
		txtOdr97530Sun.setBounds(3, 3, 169, 116);
		panel_20.add(txtOdr97530Sun);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 341, 175, 108);
		panel_5.add(panel_21);

		defaultNotesSun4 = new Notes();
		defaultNotesSun4.setFormName("Occupational Daily Record");
		defaultNotesSun4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun4.setNoteText("");

		txtOdr97535Sun = new JxTextArea();
		txtOdr97535Sun.setNotes(defaultNotesSun4);
		txtOdr97535Sun.setBackground(Color.WHITE);
		txtOdr97535Sun.setEditable(false);
		txtOdr97535Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97535Sun.setWrapStyleWord(true);
		// txtOdr97535Sun.setLineWrap(true);
		txtOdr97535Sun.setBounds(3, 3, 169, 102);
		panel_21.add(txtOdr97535Sun);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 448, 175, 51);
		panel_5.add(panel_22);

		defaultNotesSun5 = new Notes();
		defaultNotesSun5.setFormName("Occupational Daily Record");
		defaultNotesSun5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun5.setNoteText("");

		txtOther01Sun = new JxTextArea();
		txtOther01Sun.setNotes(defaultNotesSun5);
		txtOther01Sun.setEditable(false);
		txtOther01Sun.setBackground(Color.WHITE);
		txtOther01Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Sun.setWrapStyleWord(true);
		// txtOther01Sun.setLineWrap(true);
		txtOther01Sun.setBounds(3, 3, 169, 45);
		panel_22.add(txtOther01Sun);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(0, 498, 175, 51);
		panel_5.add(panel_23);

		defaultNotesSun6 = new Notes();
		defaultNotesSun6.setFormName("Occupational Daily Record");
		defaultNotesSun6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun6.setNoteText("");

		txtOther02Sun = new JxTextArea();
		txtOther02Sun.setNotes(defaultNotesSun6);
		txtOther02Sun.setEditable(false);
		txtOther02Sun.setBackground(Color.WHITE);
		txtOther02Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Sun.setWrapStyleWord(true);
		// txtOther02Sun.setLineWrap(true);
		txtOther02Sun.setBounds(3, 3, 169, 45);
		panel_23.add(txtOther02Sun);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 548, 175, 130);
		panel_5.add(panel_24);

		defaultNotesSun7 = new Notes();
		defaultNotesSun7.setFormName("Occupational Daily Record");
		defaultNotesSun7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSun7.setNoteText("");

		txtIncidentsSun = new JxTextArea();
		txtIncidentsSun.setNotes(defaultNotesSun7);
		txtIncidentsSun.setEditable(false);
		txtIncidentsSun.setBackground(Color.WHITE);
		txtIncidentsSun.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsSun.setWrapStyleWord(true);
		// txtIncidentsSun.setLineWrap(true);
		txtIncidentsSun.setBounds(3, 3, 169, 126);
		panel_24.add(txtIncidentsSun);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 677, 175, 28);
		panel_5.add(panel_25);

		txtTotalMinSun = new JTextArea();
		txtTotalMinSun.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinSun.setEditable(false);
		txtTotalMinSun.setBackground(Color.WHITE);
		txtTotalMinSun.setWrapStyleWord(true);
		txtTotalMinSun.setLineWrap(true);
		txtTotalMinSun.setBounds(3, 3, 140, 22);
		panel_25.add(txtTotalMinSun);

		btnPlus_56 = new JButton();
		btnPlus_56.setBackground(Color.WHITE);
		btnPlus_56.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinSun.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinSun.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_56.setText("+");
		btnPlus_56.setBounds(145, 1, 26, 22);
		panel_25.add(btnPlus_56);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 704, 175, 28);
		panel_5.add(panel_26);

		cmbInitialsSun = new JComboBox();
		cmbInitialsSun.setBackground(Color.WHITE);
		cmbInitialsSun.setBounds(3, 3, 169, 22);
		panel_26.add(cmbInitialsSun);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(283, 50, 175, 732);
		panel_2.add(panel_27);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 0, 175, 28);
		panel_27.add(panel_28);

		sundayLabel_1 = new JLabel();
		sundayLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_1.setText("MONDAY");
		sundayLabel_1.setBounds(3, 7, 75, 14);
		panel_28.add(sundayLabel_1);

		dcDateMonday = new JDateChooser();
		dcDateMonday.setDateFormatString("MM/dd/yyyy");
		dcDateMonday.setBounds(80, 4, 92, 21);
		panel_28.add(dcDateMonday);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 27, 175, 28);
		panel_27.add(panel_29);

		cbOdr97003Monday = new JCheckBox();
		cbOdr97003Monday.setEnabled(false);
		cbOdr97003Monday.setBackground(Color.WHITE);
		cbOdr97003Monday.setBorder(new LineBorder(Color.black, 1, false));
		// cdOdr97003Monday.setWrapStyleWord(true);
		// cdOdr97003Monday.setLineWrap(true);
		cbOdr97003Monday.setBounds(85, 3, 15, 22);
		panel_29.add(cbOdr97003Monday);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 54, 175, 84);
		panel_27.add(panel_30);

		defaultNotesMon1 = new Notes();
		defaultNotesMon1.setFormName("Occupational Daily Record");
		defaultNotesMon1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon1.setNoteText("");

		txtOdr97110Monday = new JxTextArea();
		txtOdr97110Monday.setNotes(defaultNotesMon1);
		txtOdr97110Monday.setEditable(false);
		txtOdr97110Monday.setBackground(Color.WHITE);
		txtOdr97110Monday.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97110Monday.setWrapStyleWord(true);
		// txtOdr97110Monday.setLineWrap(true);
		txtOdr97110Monday.setBounds(3, 3, 169, 78);
		panel_30.add(txtOdr97110Monday);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 137, 175, 84);
		panel_27.add(panel_31);

		defaultNotesMon2 = new Notes();
		defaultNotesMon2.setFormName("Occupational Daily Record");
		defaultNotesMon2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon2.setNoteText("");

		txtOdr97112Mon = new JxTextArea();
		txtOdr97112Mon.setNotes(defaultNotesMon2);
		txtOdr97112Mon.setBackground(Color.WHITE);
		txtOdr97112Mon.setEditable(false);
		txtOdr97112Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97112Mon.setWrapStyleWord(true);
		// txtOdr97112Mon.setLineWrap(true);
		txtOdr97112Mon.setBounds(3, 3, 169, 78);
		panel_31.add(txtOdr97112Mon);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 220, 175, 122);
		panel_27.add(panel_32);

		defaultNotesMon3 = new Notes();
		defaultNotesMon3.setFormName("Occupational Daily Record");
		defaultNotesMon3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon3.setNoteText("");

		txtOdr97530Mon = new JxTextArea();
		txtOdr97530Mon.setNotes(defaultNotesMon3);
		txtOdr97530Mon.setEditable(false);
		txtOdr97530Mon.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Mon.setBackground(Color.WHITE);
		// txtOdr97530Mon.setWrapStyleWord(true);
		// txtOdr97530Mon.setLineWrap(true);
		txtOdr97530Mon.setBounds(3, 3, 169, 116);
		panel_32.add(txtOdr97530Mon);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 341, 175, 108);
		panel_27.add(panel_33);

		defaultNotesMon4 = new Notes();
		defaultNotesMon4.setFormName("Occupational Daily Record");
		defaultNotesMon4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon4.setNoteText("");

		txtOdr97535Mon = new JxTextArea();
		txtOdr97535Mon.setNotes(defaultNotesMon4);
		txtOdr97535Mon.setEditable(false);
		txtOdr97535Mon.setBackground(Color.WHITE);
		txtOdr97535Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOdr97535Mon.setWrapStyleWord(true);
		// txtOdr97535Mon.setLineWrap(true);
		txtOdr97535Mon.setBounds(3, 3, 169, 102);
		panel_33.add(txtOdr97535Mon);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 448, 175, 51);
		panel_27.add(panel_34);

		defaultNotesMon5 = new Notes();
		defaultNotesMon5.setFormName("Occupational Daily Record");
		defaultNotesMon5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon5.setNoteText("");

		txtOther01Mon = new JxTextArea();
		txtOther01Mon.setNotes(defaultNotesMon5);
		txtOther01Mon.setEditable(false);
		txtOther01Mon.setBackground(Color.WHITE);
		txtOther01Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Mon.setWrapStyleWord(true);
		// txtOther01Mon.setLineWrap(true);
		txtOther01Mon.setBounds(3, 3, 169, 45);
		panel_34.add(txtOther01Mon);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 498, 175, 51);
		panel_27.add(panel_35);

		defaultNotesMon6 = new Notes();
		defaultNotesMon6.setFormName("Occupational Daily Record");
		defaultNotesMon6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon6.setNoteText("");

		txtOther02Mon = new JxTextArea();
		txtOther02Mon.setNotes(defaultNotesMon6);
		txtOther02Mon.setEditable(false);
		txtOther02Mon.setBackground(Color.WHITE);
		txtOther02Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Mon.setWrapStyleWord(true);
		// txtOther02Mon.setLineWrap(true);
		txtOther02Mon.setBounds(3, 3, 169, 45);
		panel_35.add(txtOther02Mon);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 548, 175, 130);
		panel_27.add(panel_36);

		defaultNotesMon7 = new Notes();
		defaultNotesMon7.setFormName("Occupational Daily Record");
		defaultNotesMon7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesMon7.setNoteText("");

		txtIncidentsMon = new JxTextArea();
		txtIncidentsMon.setNotes(defaultNotesMon7);
		txtIncidentsMon.setEditable(false);
		txtIncidentsMon.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsMon.setBackground(Color.WHITE);
		// txtIncidentsMon.setWrapStyleWord(true);
		// txtIncidentsMon.setLineWrap(true);
		txtIncidentsMon.setBounds(3, 3, 169, 126);
		panel_36.add(txtIncidentsMon);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 677, 175, 28);
		panel_27.add(panel_37);

		txtTotalMinMon = new JTextArea();
		txtTotalMinMon.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinMon.setEditable(false);
		txtTotalMinMon.setBackground(Color.WHITE);
		txtTotalMinMon.setWrapStyleWord(true);
		txtTotalMinMon.setLineWrap(true);
		txtTotalMinMon.setBounds(3, 3, 140, 22);
		panel_37.add(txtTotalMinMon);

		btnPlus_57 = new JButton();
		btnPlus_57.setBackground(Color.WHITE);
		btnPlus_57.setText("+");
		btnPlus_57.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinMon.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinMon.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_57.setBounds(145, 1, 26, 22);
		panel_37.add(btnPlus_57);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 704, 175, 28);
		panel_27.add(panel_38);

		cmbInitialsMon = new JComboBox();
		cmbInitialsMon.setBackground(Color.WHITE);
		cmbInitialsMon.setBounds(3, 3, 169, 22);
		panel_38.add(cmbInitialsMon);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(457, 50, 175, 732);
		panel_2.add(panel_39);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(0, 0, 175, 28);
		panel_39.add(panel_40);

		sundayLabel_2 = new JLabel();
		sundayLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_2.setText("TUESDAY");
		sundayLabel_2.setBounds(3, 7, 75, 14);
		panel_40.add(sundayLabel_2);

		dcDateTuesday = new JDateChooser();
		dcDateTuesday.setDateFormatString("MM/dd/yyyy");
		dcDateTuesday.setBounds(80, 4, 92, 21);
		panel_40.add(dcDateTuesday);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(0, 27, 175, 28);
		panel_39.add(panel_41);

		cbOdr97003Tuesday = new JCheckBox();
		cbOdr97003Tuesday.setEnabled(false);
		cbOdr97003Tuesday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Tuesday.setBackground(Color.WHITE);
		// cbOdr97003Tuesday.setWrapStyleWord(true);
		// cbOdr97003Tuesday.setLineWrap(true);
		cbOdr97003Tuesday.setBounds(85, 3, 15, 22);
		panel_41.add(cbOdr97003Tuesday);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 54, 175, 84);
		panel_39.add(panel_42);

		defaultNotesTue1 = new Notes();
		defaultNotesTue1.setFormName("Occupational Daily Record");
		defaultNotesTue1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue1.setNoteText("");

		txtOdr97110Tuesday = new JxTextArea();
		txtOdr97110Tuesday.setNotes(defaultNotesTue1);
		txtOdr97110Tuesday.setEditable(false);
		txtOdr97110Tuesday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Tuesday.setBackground(Color.WHITE);
		// txtOdr97110Tuesday.setWrapStyleWord(true);
		// txtOdr97110Tuesday.setLineWrap(true);
		txtOdr97110Tuesday.setBounds(3, 3, 169, 78);
		panel_42.add(txtOdr97110Tuesday);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 137, 175, 84);
		panel_39.add(panel_43);

		defaultNotesTue2 = new Notes();
		defaultNotesTue2.setFormName("Occupational Daily Record");
		defaultNotesTue2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue2.setNoteText("");

		txtOdr97112Tue = new JxTextArea();
		txtOdr97112Tue.setNotes(defaultNotesTue2);
		txtOdr97112Tue.setEditable(false);
		txtOdr97112Tue.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97112Tue.setBackground(Color.WHITE);
		// txtOdr97112Tue.setWrapStyleWord(true);
		// txtOdr97112Tue.setLineWrap(true);
		txtOdr97112Tue.setBounds(3, 3, 169, 78);
		panel_43.add(txtOdr97112Tue);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(0, 220, 175, 122);
		panel_39.add(panel_44);

		defaultNotesTue3 = new Notes();
		defaultNotesTue3.setFormName("Occupational Daily Record");
		defaultNotesTue3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue3.setNoteText("");

		txtOdr97530Tue = new JxTextArea();
		txtOdr97530Tue.setNotes(defaultNotesTue3);
		txtOdr97530Tue.setEditable(false);
		txtOdr97530Tue.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Tue.setBackground(Color.WHITE);
		// txtOdr97530Tue.setWrapStyleWord(true);
		// txtOdr97530Tue.setLineWrap(true);
		txtOdr97530Tue.setBounds(3, 3, 169, 116);
		panel_44.add(txtOdr97530Tue);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 341, 175, 108);
		panel_39.add(panel_45);

		defaultNotesTue4 = new Notes();
		defaultNotesTue4.setFormName("Occupational Daily Record");
		defaultNotesTue4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue4.setNoteText("");

		txtOdr97535Tue = new JxTextArea();
		txtOdr97535Tue.setNotes(defaultNotesTue4);
		txtOdr97535Tue.setEditable(false);
		txtOdr97535Tue.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97535Tue.setBackground(Color.WHITE);
		// txtOdr97535Tue.setWrapStyleWord(true);
		// txtOdr97535Tue.setLineWrap(true);
		txtOdr97535Tue.setBounds(3, 3, 169, 102);
		panel_45.add(txtOdr97535Tue);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 448, 175, 51);
		panel_39.add(panel_46);

		defaultNotesTue5 = new Notes();
		defaultNotesTue5.setFormName("Occupational Daily Record");
		defaultNotesTue5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue5.setNoteText("");

		txtOther01Tue = new JxTextArea();
		txtOther01Tue.setNotes(defaultNotesTue5);
		txtOther01Tue.setEditable(false);
		txtOther01Tue.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Tue.setBackground(Color.WHITE);
		// txtOther01Tue.setWrapStyleWord(true);
		// txtOther01Tue.setLineWrap(true);
		txtOther01Tue.setBounds(3, 3, 169, 45);
		panel_46.add(txtOther01Tue);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 498, 175, 51);
		panel_39.add(panel_47);

		defaultNotesTue6 = new Notes();
		defaultNotesTue6.setFormName("Occupational Daily Record");
		defaultNotesTue6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue6.setNoteText("");

		txtOther02Tue = new JxTextArea();
		txtOther02Tue.setNotes(defaultNotesTue6);
		txtOther02Tue.setEditable(false);
		txtOther02Tue.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Tue.setBackground(Color.WHITE);
		// txtOther02Tue.setWrapStyleWord(true);
		// txtOther02Tue.setLineWrap(true);
		txtOther02Tue.setBounds(3, 3, 169, 45);
		panel_47.add(txtOther02Tue);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 548, 175, 130);
		panel_39.add(panel_48);

		defaultNotesTue7 = new Notes();
		defaultNotesTue7.setFormName("Occupational Daily Record");
		defaultNotesTue7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesTue7.setNoteText("");

		txtIncidentsTue = new JxTextArea();
		txtIncidentsTue.setNotes(defaultNotesTue7);
		txtIncidentsTue.setEditable(false);
		txtIncidentsTue.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsTue.setBackground(Color.WHITE);
		// txtIncidentsTue.setWrapStyleWord(true);
		// txtIncidentsTue.setLineWrap(true);
		txtIncidentsTue.setBounds(3, 3, 169, 126);
		panel_48.add(txtIncidentsTue);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(0, 677, 175, 28);
		panel_39.add(panel_49);

		txtTotalMinTue = new JTextArea();
		txtTotalMinTue.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinTue.setEditable(false);
		txtTotalMinTue.setBackground(Color.WHITE);
		txtTotalMinTue.setWrapStyleWord(true);
		txtTotalMinTue.setLineWrap(true);
		txtTotalMinTue.setBounds(3, 3, 140, 22);
		panel_49.add(txtTotalMinTue);

		btnPlus_58 = new JButton();
		btnPlus_58.setBackground(Color.WHITE);
		btnPlus_58.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinTue.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinTue.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_58.setText("+");
		btnPlus_58.setBounds(145, 3, 26, 22);
		panel_49.add(btnPlus_58);

		panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(Color.black, 1, false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(0, 704, 175, 28);
		panel_39.add(panel_50);

		cmbInitialsTue = new JComboBox();
		cmbInitialsTue.setBackground(Color.WHITE);
		cmbInitialsTue.setBounds(3, 3, 169, 22);
		panel_50.add(cmbInitialsTue);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(631, 50, 175, 732);
		panel_2.add(panel_51);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(0, 0, 175, 28);
		panel_51.add(panel_52);

		sundayLabel_3 = new JLabel();
		sundayLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_3.setText("WEDNESDAY");
		sundayLabel_3.setBounds(3, 7, 75, 14);
		panel_52.add(sundayLabel_3);

		dcDateWednesday = new JDateChooser();
		dcDateWednesday.setDateFormatString("MM/dd/yyyy");
		dcDateWednesday.setBounds(80, 4, 92, 21);
		panel_52.add(dcDateWednesday);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(0, 27, 175, 28);
		panel_51.add(panel_53);

		cbOdr97003Wednesday = new JCheckBox();
		cbOdr97003Wednesday.setEnabled(false);
		cbOdr97003Wednesday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Wednesday.setBackground(Color.WHITE);
		// cbOdr97003Wednesday.setWrapStyleWord(true);
		// cbOdr97003Wednesday.setLineWrap(true);
		cbOdr97003Wednesday.setBounds(85, 3, 15, 22);
		panel_53.add(cbOdr97003Wednesday);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(0, 54, 175, 84);
		panel_51.add(panel_54);

		defaultNotesWed1 = new Notes();
		defaultNotesWed1.setFormName("Occupational Daily Record");
		defaultNotesWed1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed1.setNoteText("");

		txtOdr97110Wednesday = new JxTextArea();
		txtOdr97110Wednesday.setNotes(defaultNotesWed1);
		txtOdr97110Wednesday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Wednesday.setEditable(false);
		txtOdr97110Wednesday.setBackground(Color.WHITE);
		// txtOdr97110Wednesday.setWrapStyleWord(true);
		// txtOdr97110Wednesday.setLineWrap(true);
		txtOdr97110Wednesday.setBounds(3, 3, 169, 78);
		panel_54.add(txtOdr97110Wednesday);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 137, 175, 84);
		panel_51.add(panel_55);

		defaultNotesWed2 = new Notes();
		defaultNotesWed2.setFormName("Occupational Daily Record");
		defaultNotesWed2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed2.setNoteText("");

		txtOdr97112Wed = new JxTextArea();
		txtOdr97112Wed.setNotes(defaultNotesWed2);
		txtOdr97112Wed.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97112Wed.setEditable(false);
		txtOdr97112Wed.setBackground(Color.WHITE);
		// txtOdr97112Wed.setWrapStyleWord(true);
		// txtOdr97112Wed.setLineWrap(true);
		txtOdr97112Wed.setBounds(3, 3, 169, 78);
		panel_55.add(txtOdr97112Wed);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(0, 220, 175, 122);
		panel_51.add(panel_56);

		defaultNotesWed3 = new Notes();
		defaultNotesWed3.setFormName("Occupational Daily Record");
		defaultNotesWed3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed3.setNoteText("");

		txtOdr97530Wed = new JxTextArea();
		txtOdr97530Wed.setNotes(defaultNotesWed3);
		txtOdr97530Wed.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Wed.setEditable(false);
		txtOdr97530Wed.setBackground(Color.WHITE);
		// txtOdr97530Wed.setWrapStyleWord(true);
		// txtOdr97530Wed.setLineWrap(true);
		txtOdr97530Wed.setBounds(3, 3, 169, 116);
		panel_56.add(txtOdr97530Wed);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 341, 175, 108);
		panel_51.add(panel_57);

		defaultNotesWed4 = new Notes();
		defaultNotesWed4.setFormName("Occupational Daily Record");
		defaultNotesWed4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed4.setNoteText("");

		txtOdr97535Wed = new JxTextArea();
		txtOdr97535Wed.setNotes(defaultNotesWed4);
		txtOdr97535Wed.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97535Wed.setEditable(false);
		txtOdr97535Wed.setBackground(Color.WHITE);
		// txtOdr97535Wed.setWrapStyleWord(true);
		// txtOdr97535Wed.setLineWrap(true);
		txtOdr97535Wed.setBounds(3, 3, 169, 102);
		panel_57.add(txtOdr97535Wed);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 448, 175, 51);
		panel_51.add(panel_58);

		defaultNotesWed5 = new Notes();
		defaultNotesWed5.setFormName("Occupational Daily Record");
		defaultNotesWed5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed5.setNoteText("");

		txtOther01Wed = new JxTextArea();
		txtOther01Wed.setNotes(defaultNotesWed5);
		txtOther01Wed.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Wed.setEditable(false);
		txtOther01Wed.setBackground(Color.WHITE);
		// txtOther01Wed.setWrapStyleWord(true);
		// txtOther01Wed.setLineWrap(true);
		txtOther01Wed.setBounds(3, 3, 169, 45);
		panel_58.add(txtOther01Wed);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(0, 498, 175, 51);
		panel_51.add(panel_59);

		defaultNotesWed6 = new Notes();
		defaultNotesWed6.setFormName("Occupational Daily Record");
		defaultNotesWed6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed6.setNoteText("");

		txtOther02Wed = new JxTextArea();
		txtOther02Wed.setNotes(defaultNotesWed6);
		txtOther02Wed.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Wed.setEditable(false);
		txtOther02Wed.setBackground(Color.WHITE);
		// txtOther02Wed.setWrapStyleWord(true);
		// txtOther02Wed.setLineWrap(true);
		txtOther02Wed.setBounds(3, 3, 169, 45);
		panel_59.add(txtOther02Wed);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 548, 175, 130);
		panel_51.add(panel_60);

		defaultNotesWed7 = new Notes();
		defaultNotesWed7.setFormName("Occupational Daily Record");
		defaultNotesWed7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesWed7.setNoteText("");

		txtIncidentsWed = new JxTextArea();
		txtIncidentsWed.setNotes(defaultNotesWed7);
		txtIncidentsWed.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsWed.setEditable(false);
		txtIncidentsWed.setBackground(Color.WHITE);
		// txtIncidentsWed.setWrapStyleWord(true);
		// txtIncidentsWed.setLineWrap(true);
		txtIncidentsWed.setBounds(3, 3, 169, 126);
		panel_60.add(txtIncidentsWed);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(0, 677, 175, 28);
		panel_51.add(panel_61);

		txtTotalMinWed = new JTextArea();
		txtTotalMinWed.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinWed.setEditable(false);
		txtTotalMinWed.setBackground(Color.WHITE);
		txtTotalMinWed.setWrapStyleWord(true);
		txtTotalMinWed.setLineWrap(true);
		txtTotalMinWed.setBounds(3, 3, 140, 22);
		panel_61.add(txtTotalMinWed);

		btnPlus_59 = new JButton();
		btnPlus_59.setBackground(Color.WHITE);
		btnPlus_59.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinWed.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinWed.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_59.setText("+");
		btnPlus_59.setBounds(145, 1, 26, 22);
		panel_61.add(btnPlus_59);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 704, 175, 28);
		panel_51.add(panel_62);

		cmbInitialsWed = new JComboBox();
		cmbInitialsWed.setBackground(Color.WHITE);
		cmbInitialsWed.setBounds(3, 3, 169, 22);
		panel_62.add(cmbInitialsWed);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(805, 50, 175, 732);
		panel_2.add(panel_63);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(0, 0, 175, 28);
		panel_63.add(panel_64);

		sundayLabel_4 = new JLabel();
		sundayLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_4.setText("THURSDAY");
		sundayLabel_4.setBounds(3, 7, 75, 14);
		panel_64.add(sundayLabel_4);

		dcDateThursday = new JDateChooser();
		dcDateThursday.setDateFormatString("MM/dd/yyyy");
		dcDateThursday.setBounds(80, 4, 92, 21);
		panel_64.add(dcDateThursday);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(0, 27, 175, 28);
		panel_63.add(panel_65);

		cbOdr97003Thursday = new JCheckBox();
		cbOdr97003Thursday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Thursday.setEnabled(false);
		cbOdr97003Thursday.setBackground(Color.WHITE);
		// cbOdr97003Thursday.setWrapStyleWord(true);
		// cbOdr97003Thursday.setLineWrap(true);
		cbOdr97003Thursday.setBounds(85, 3, 15, 22);
		panel_65.add(cbOdr97003Thursday);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 54, 175, 84);
		panel_63.add(panel_66);

		defaultNotesThu1 = new Notes();
		defaultNotesThu1.setFormName("Occupational Daily Record");
		defaultNotesThu1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu1.setNoteText("");

		txtOdr97110Thursday = new JxTextArea();
		txtOdr97110Thursday.setNotes(defaultNotesThu1);
		txtOdr97110Thursday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Thursday.setEditable(false);
		txtOdr97110Thursday.setBackground(Color.WHITE);
		// txtOdr97110Thursday.setWrapStyleWord(true);
		// txtOdr97110Thursday.setLineWrap(true);
		txtOdr97110Thursday.setBounds(3, 3, 169, 78);
		panel_66.add(txtOdr97110Thursday);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 137, 175, 84);
		panel_63.add(panel_67);

		defaultNotesThu2 = new Notes();
		defaultNotesThu2.setFormName("Occupational Daily Record");
		defaultNotesThu2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu2.setNoteText("");

		txtOdr97112Thu = new JxTextArea();
		txtOdr97112Thu.setNotes(defaultNotesThu2);
		txtOdr97112Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97112Thu.setEditable(false);
		txtOdr97112Thu.setBackground(Color.WHITE);
		// txtOdr97112Thu.setWrapStyleWord(true);
		// txtOdr97112Thu.setLineWrap(true);
		txtOdr97112Thu.setBounds(3, 3, 169, 78);
		panel_67.add(txtOdr97112Thu);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 220, 175, 122);
		panel_63.add(panel_68);

		defaultNotesThu3 = new Notes();
		defaultNotesThu3.setFormName("Occupational Daily Record");
		defaultNotesThu3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu3.setNoteText("");

		txtOdr97530Thu = new JxTextArea();
		txtOdr97530Thu.setNotes(defaultNotesThu3);
		txtOdr97530Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Thu.setEditable(false);
		txtOdr97530Thu.setBackground(Color.WHITE);
		// txtOdr97530Thu.setWrapStyleWord(true);
		// txtOdr97530Thu.setLineWrap(true);
		txtOdr97530Thu.setBounds(3, 3, 169, 116);
		panel_68.add(txtOdr97530Thu);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 341, 175, 108);
		panel_63.add(panel_69);

		defaultNotesThu4 = new Notes();
		defaultNotesThu4.setFormName("Occupational Daily Record");
		defaultNotesThu4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu4.setNoteText("");

		txtOdr97535Thu = new JxTextArea();
		txtOdr97535Thu.setNotes(defaultNotesThu4);
		txtOdr97535Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97535Thu.setEditable(false);
		txtOdr97535Thu.setBackground(Color.WHITE);
		// txtOdr97535Thu.setWrapStyleWord(true);
		// txtOdr97535Thu.setLineWrap(true);
		txtOdr97535Thu.setBounds(3, 3, 169, 102);
		panel_69.add(txtOdr97535Thu);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(0, 448, 175, 51);
		panel_63.add(panel_70);

		defaultNotesThu5 = new Notes();
		defaultNotesThu5.setFormName("Occupational Daily Record");
		defaultNotesThu5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu5.setNoteText("");

		txtOther01Thu = new JxTextArea();
		txtOther01Thu.setNotes(defaultNotesThu5);
		txtOther01Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Thu.setEditable(false);
		txtOther01Thu.setBackground(Color.WHITE);
		// txtOther01Thu.setWrapStyleWord(true);
		// txtOther01Thu.setLineWrap(true);
		txtOther01Thu.setBounds(3, 3, 169, 45);
		panel_70.add(txtOther01Thu);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(0, 498, 175, 51);
		panel_63.add(panel_71);

		defaultNotesThu6 = new Notes();
		defaultNotesThu6.setFormName("Occupational Daily Record");
		defaultNotesThu6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu6.setNoteText("");

		txtOther02Thu = new JxTextArea();
		txtOther02Thu.setNotes(defaultNotesThu6);
		txtOther02Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Thu.setEditable(false);
		txtOther02Thu.setBackground(Color.WHITE);
		// txtOther02Thu.setWrapStyleWord(true);
		// txtOther02Thu.setLineWrap(true);
		txtOther02Thu.setBounds(3, 3, 169, 45);
		panel_71.add(txtOther02Thu);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(0, 548, 175, 130);
		panel_63.add(panel_72);

		defaultNotesThu7 = new Notes();
		defaultNotesThu7.setFormName("Occupational Daily Record");
		defaultNotesThu7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesThu7.setNoteText("");

		txtIncidentsThu = new JxTextArea();
		txtIncidentsThu.setNotes(defaultNotesThu7);
		txtIncidentsThu.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsThu.setEditable(false);
		txtIncidentsThu.setBackground(Color.WHITE);
		// txtIncidentsThu.setWrapStyleWord(true);
		// txtIncidentsThu.setLineWrap(true);
		txtIncidentsThu.setBounds(3, 3, 169, 126);
		panel_72.add(txtIncidentsThu);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(0, 677, 175, 28);
		panel_63.add(panel_73);

		txtTotalMinThu = new JTextArea();
		txtTotalMinThu.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinThu.setEditable(false);
		txtTotalMinThu.setBackground(Color.WHITE);
		txtTotalMinThu.setWrapStyleWord(true);
		txtTotalMinThu.setLineWrap(true);
		txtTotalMinThu.setBounds(3, 3, 140, 22);
		panel_73.add(txtTotalMinThu);

		btnPlus_60 = new JButton();
		btnPlus_60.setBackground(Color.WHITE);
		btnPlus_60.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinThu.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinThu.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_60.setText("+");
		btnPlus_60.setBounds(145, 1, 26, 22);
		panel_73.add(btnPlus_60);

		panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(Color.black, 1, false));
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(0, 704, 175, 28);
		panel_63.add(panel_74);

		cmbInitialsThu = new JComboBox();
		cmbInitialsThu.setBackground(Color.WHITE);
		cmbInitialsThu.setBounds(3, 3, 169, 22);
		panel_74.add(cmbInitialsThu);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(979, 50, 175, 732);
		panel_2.add(panel_75);

		panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(Color.black, 1, false));
		panel_76.setLayout(null);
		panel_76.setBackground(Color.WHITE);
		panel_76.setBounds(0, 0, 175, 28);
		panel_75.add(panel_76);

		sundayLabel_5 = new JLabel();
		sundayLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_5.setText("FRIDAY");
		sundayLabel_5.setBounds(3, 7, 75, 14);
		panel_76.add(sundayLabel_5);

		dcDateFriday = new JDateChooser();
		dcDateFriday.setDateFormatString("MM/dd/yyyy");
		dcDateFriday.setBounds(80, 4, 92, 21);
		panel_76.add(dcDateFriday);

		panel_77 = new JPanel();
		panel_77.setBorder(new LineBorder(Color.black, 1, false));
		panel_77.setLayout(null);
		panel_77.setBackground(Color.WHITE);
		panel_77.setBounds(0, 27, 175, 28);
		panel_75.add(panel_77);

		cbOdr97003Friday = new JCheckBox();
		cbOdr97003Friday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Friday.setEnabled(false);
		cbOdr97003Friday.setBackground(Color.WHITE);
		// cbOdr97003Friday.setWrapStyleWord(true);
		// cbOdr97003Friday.setLineWrap(true);
		cbOdr97003Friday.setBounds(85, 3, 15, 22);
		panel_77.add(cbOdr97003Friday);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(0, 54, 175, 84);
		panel_75.add(panel_78);

		defaultNotesFri1 = new Notes();
		defaultNotesFri1.setFormName("Occupational Daily Record");
		defaultNotesFri1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri1.setNoteText("");

		txtOdr97110Friday = new JxTextArea();
		txtOdr97110Friday.setNotes(defaultNotesFri1);
		txtOdr97110Friday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Friday.setEditable(false);
		txtOdr97110Friday.setBackground(Color.WHITE);
		// txtOdr97110Friday.setWrapStyleWord(true);
		// txtOdr97110Friday.setLineWrap(true);
		txtOdr97110Friday.setBounds(3, 3, 169, 78);
		panel_78.add(txtOdr97110Friday);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(Color.black, 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 137, 175, 84);
		panel_75.add(panel_79);

		defaultNotesFri2 = new Notes();
		defaultNotesFri2.setFormName("Occupational Daily Record");
		defaultNotesFri2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri2.setNoteText("");

		txtOdr97112Fri = new JxTextArea();
		txtOdr97112Fri.setNotes(defaultNotesFri2);
		txtOdr97112Fri.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97112Fri.setEditable(false);
		txtOdr97112Fri.setBackground(Color.WHITE);
		// txtOdr97112Fri.setWrapStyleWord(true);
		// txtOdr97112Fri.setLineWrap(true);
		txtOdr97112Fri.setBounds(3, 3, 169, 78);
		panel_79.add(txtOdr97112Fri);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(0, 220, 175, 122);
		panel_75.add(panel_80);

		defaultNotesFri3 = new Notes();
		defaultNotesFri3.setFormName("Occupational Daily Record");
		defaultNotesFri3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri3.setNoteText("");

		txtOdr97530Fri = new JxTextArea();
		txtOdr97530Fri.setNotes(defaultNotesFri3);
		txtOdr97530Fri.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Fri.setEditable(false);
		txtOdr97530Fri.setBackground(Color.WHITE);
		// txtOdr97530Fri.setWrapStyleWord(true);
		// txtOdr97530Fri.setLineWrap(true);
		txtOdr97530Fri.setBounds(3, 3, 169, 116);
		panel_80.add(txtOdr97530Fri);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(0, 341, 175, 108);
		panel_75.add(panel_81);

		defaultNotesFri4 = new Notes();
		defaultNotesFri4.setFormName("Occupational Daily Record");
		defaultNotesFri4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri4.setNoteText("");

		txtOdr97535Fri = new JxTextArea();
		txtOdr97535Fri.setNotes(defaultNotesFri4);
		txtOdr97535Fri.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97535Fri.setEditable(false);
		txtOdr97535Fri.setBackground(Color.WHITE);
		// txtOdr97535Fri.setWrapStyleWord(true);
		// txtOdr97535Fri.setLineWrap(true);
		txtOdr97535Fri.setBounds(3, 3, 169, 102);
		panel_81.add(txtOdr97535Fri);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 448, 175, 51);
		panel_75.add(panel_82);

		defaultNotesFri5 = new Notes();
		defaultNotesFri5.setFormName("Occupational Daily Record");
		defaultNotesFri5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri5.setNoteText("");

		txtOther01Fri = new JxTextArea();
		txtOther01Fri.setNotes(defaultNotesFri5);
		txtOther01Fri.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Fri.setEditable(false);
		txtOther01Fri.setBackground(Color.WHITE);
		// txtOther01Fri.setWrapStyleWord(true);
		// txtOther01Fri.setLineWrap(true);
		txtOther01Fri.setBounds(3, 3, 169, 45);
		panel_82.add(txtOther01Fri);

		panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(Color.black, 1, false));
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 498, 175, 51);
		panel_75.add(panel_83);

		defaultNotesFri6 = new Notes();
		defaultNotesFri6.setFormName("Occupational Daily Record");
		defaultNotesFri6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri6.setNoteText("");

		txtOther02Fri = new JxTextArea();
		txtOther02Fri.setNotes(defaultNotesFri6);
		txtOther02Fri.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Fri.setEditable(false);
		txtOther02Fri.setBackground(Color.WHITE);
		// txtOther02Fri.setWrapStyleWord(true);
		// txtOther02Fri.setLineWrap(true);
		txtOther02Fri.setBounds(3, 3, 169, 45);
		panel_83.add(txtOther02Fri);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 548, 175, 130);
		panel_75.add(panel_84);

		defaultNotesFri7 = new Notes();
		defaultNotesFri7.setFormName("Occupational Daily Record");
		defaultNotesFri7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesFri7.setNoteText("");

		txtIncidentsFri = new JxTextArea();
		txtIncidentsFri.setNotes(defaultNotesFri7);
		txtIncidentsFri.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsFri.setEditable(false);
		txtIncidentsFri.setBackground(Color.WHITE);
		// txtIncidentsFri.setWrapStyleWord(true);
		// txtIncidentsFri.setLineWrap(true);
		txtIncidentsFri.setBounds(3, 3, 169, 126);
		panel_84.add(txtIncidentsFri);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 677, 175, 28);
		panel_75.add(panel_85);

		txtTotalMinFri = new JTextArea();
		txtTotalMinFri.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinFri.setEditable(false);
		txtTotalMinFri.setBackground(Color.WHITE);
		txtTotalMinFri.setWrapStyleWord(true);
		txtTotalMinFri.setLineWrap(true);
		txtTotalMinFri.setBounds(3, 3, 140, 22);
		panel_85.add(txtTotalMinFri);

		btnPlus_61 = new JButton();
		btnPlus_61.setBackground(Color.WHITE);
		btnPlus_61.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinFri.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinFri.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_61.setText("+");
		btnPlus_61.setBounds(145, 3, 26, 22);
		panel_85.add(btnPlus_61);

		panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(Color.black, 1, false));
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(0, 704, 175, 28);
		panel_75.add(panel_86);

		cmbInitialsFri = new JComboBox();
		cmbInitialsFri.setBackground(Color.WHITE);
		cmbInitialsFri.setBounds(3, 3, 169, 22);
		panel_86.add(cmbInitialsFri);

		panel_87 = new JPanel();
		panel_87.setBorder(new LineBorder(Color.black, 1, false));
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(1153, 50, 175, 732);
		panel_2.add(panel_87);

		panel_88 = new JPanel();
		panel_88.setBorder(new LineBorder(Color.black, 1, false));
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(0, 0, 175, 28);
		panel_87.add(panel_88);

		sundayLabel_6 = new JLabel();
		sundayLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		sundayLabel_6.setText("SATURDAY");
		sundayLabel_6.setBounds(3, 7, 75, 14);
		panel_88.add(sundayLabel_6);

		dcDateSaturday = new JDateChooser();
		dcDateSaturday.setDateFormatString("MM/dd/yyyy");
		dcDateSaturday.setBounds(80, 4, 92, 21);
		panel_88.add(dcDateSaturday);

		panel_89 = new JPanel();
		panel_89.setBorder(new LineBorder(Color.black, 1, false));
		panel_89.setLayout(null);
		panel_89.setBackground(Color.WHITE);
		panel_89.setBounds(0, 27, 175, 28);
		panel_87.add(panel_89);

		cbOdr97003Satuday = new JCheckBox();
		cbOdr97003Satuday.setBorder(new LineBorder(Color.black, 1, false));
		cbOdr97003Satuday.setEnabled(false);
		cbOdr97003Satuday.setBackground(Color.WHITE);
		// cbOdr97003Satuday.setWrapStyleWord(true);
		// cbOdr97003Satuday.setLineWrap(true);
		cbOdr97003Satuday.setBounds(85, 3, 15, 22);
		panel_89.add(cbOdr97003Satuday);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(Color.black, 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(0, 54, 175, 84);
		panel_87.add(panel_90);

		defaultNotesSat1 = new Notes();
		defaultNotesSat1.setFormName("Occupational Daily Record");
		defaultNotesSat1.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat1.setNoteText("");

		txtOdr97110Saturday = new JxTextArea();
		txtOdr97110Saturday.setNotes(defaultNotesSat1);
		txtOdr97110Saturday.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97110Saturday.setEditable(false);
		txtOdr97110Saturday.setBackground(Color.WHITE);
		// txtOdr97110Saturday.setWrapStyleWord(true);
		// txtOdr97110Saturday.setLineWrap(true);
		txtOdr97110Saturday.setBounds(3, 3, 169, 78);
		panel_90.add(txtOdr97110Saturday);

		panel_91 = new JPanel();
		panel_91.setBorder(new LineBorder(Color.black, 1, false));
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 137, 175, 84);
		panel_87.add(panel_91);

		defaultNotesSat2 = new Notes();
		defaultNotesSat2.setFormName("Occupational Daily Record");
		defaultNotesSat2.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat2.setNoteText("");

		txtOdr97112Sat = new JxTextArea();
		txtOdr97112Sat.setNotes(defaultNotesSat2);
		txtOdr97112Sat.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97112Sat.setEditable(false);
		txtOdr97112Sat.setBackground(Color.WHITE);
		txtOdr97112Sat.setBounds(3, 3, 169, 78);
		panel_91.add(txtOdr97112Sat);

		panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(0, 220, 175, 122);
		panel_87.add(panel_92);

		defaultNotesSat3 = new Notes();
		defaultNotesSat3.setFormName("Occupational Daily Record");
		defaultNotesSat3.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat3.setNoteText("");

		txtOdr97530Sat = new JxTextArea();
		txtOdr97530Sat.setNotes(defaultNotesSat3);
		txtOdr97530Sat.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97530Sat.setEditable(false);
		txtOdr97530Sat.setBackground(Color.WHITE);
		// txtOdr97530Sat.setWrapStyleWord(true);
		// txtOdr97530Sat.setLineWrap(true);
		txtOdr97530Sat.setBounds(3, 3, 169, 116);
		panel_92.add(txtOdr97530Sat);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 341, 175, 108);
		panel_87.add(panel_93);

		defaultNotesSat4 = new Notes();
		defaultNotesSat4.setFormName("Occupational Daily Record");
		defaultNotesSat4.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat4.setNoteText("");

		txtOdr97535Sat = new JxTextArea();
		txtOdr97535Sat.setNotes(defaultNotesSat4);
		txtOdr97535Sat.setBorder(new LineBorder(Color.black, 1, false));
		txtOdr97535Sat.setEditable(false);
		txtOdr97535Sat.setBackground(Color.WHITE);
		// txtOdr97535Sat.setWrapStyleWord(true);
		// txtOdr97535Sat.setLineWrap(true);
		txtOdr97535Sat.setBounds(3, 3, 169, 102);
		panel_93.add(txtOdr97535Sat);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 448, 175, 51);
		panel_87.add(panel_94);

		defaultNotesSat5 = new Notes();
		defaultNotesSat5.setFormName("Occupational Daily Record");
		defaultNotesSat5.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat5.setNoteText("");

		txtOther01Sat = new JxTextArea();
		txtOther01Sat.setNotes(defaultNotesSat5);
		txtOther01Sat.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Sat.setEditable(false);
		txtOther01Sat.setBackground(Color.WHITE);
		// txtOther01Sat.setWrapStyleWord(true);
		// txtOther01Sat.setLineWrap(true);
		txtOther01Sat.setBounds(3, 3, 169, 45);
		panel_94.add(txtOther01Sat);

		panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(Color.black, 1, false));
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 498, 175, 51);
		panel_87.add(panel_95);

		defaultNotesSat6 = new Notes();
		defaultNotesSat6.setFormName("Occupational Daily Record");
		defaultNotesSat6.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat6.setNoteText("");

		txtOther02Sat = new JxTextArea();
		txtOther02Sat.setNotes(defaultNotesSat6);
		txtOther02Sat.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Sat.setEditable(false);
		txtOther02Sat.setBackground(Color.WHITE);
		// txtOther02Sat.setWrapStyleWord(true);
		// txtOther02Sat.setLineWrap(true);
		txtOther02Sat.setBounds(3, 3, 169, 45);
		panel_95.add(txtOther02Sat);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 548, 175, 130);
		panel_87.add(panel_96);

		defaultNotesSat7 = new Notes();
		defaultNotesSat7.setFormName("Occupational Daily Record");
		defaultNotesSat7.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSat7.setNoteText("");

		txtIncidentsSat = new JxTextArea();
		txtIncidentsSat.setNotes(defaultNotesSat7);
		txtIncidentsSat.setBorder(new LineBorder(Color.black, 1, false));
		txtIncidentsSat.setEditable(false);
		txtIncidentsSat.setBackground(Color.WHITE);
		// txtIncidentsSat.setWrapStyleWord(true);
		// txtIncidentsSat.setLineWrap(true);
		txtIncidentsSat.setBounds(3, 3, 169, 126);
		panel_96.add(txtIncidentsSat);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(0, 677, 175, 28);
		panel_87.add(panel_97);

		txtTotalMinSat = new JTextArea();
		txtTotalMinSat.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinSat.setEditable(false);
		txtTotalMinSat.setBackground(Color.WHITE);
		txtTotalMinSat.setWrapStyleWord(true);
		txtTotalMinSat.setLineWrap(true);
		txtTotalMinSat.setBounds(3, 3, 140, 22);
		panel_97.add(txtTotalMinSat);

		btnPlus_62 = new JButton();
		btnPlus_62.setBackground(Color.WHITE);
		btnPlus_62.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				frameAddTextArea.setTxtString(txtTotalMinSat.getText());
				frameAddTextArea.setLabel("TOTAL MINUTES");
				frameAddTextArea.setVisible(true);
				txtTotalMinSat.setText(frameAddTextArea.getTxtString());
			}
		});
		btnPlus_62.setText("+");
		btnPlus_62.setBounds(145, 3, 26, 22);
		panel_97.add(btnPlus_62);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(Color.black, 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(0, 704, 175, 28);
		panel_87.add(panel_98);

		cmbInitialsSat = new JComboBox();
		cmbInitialsSat.setBackground(Color.WHITE);
		cmbInitialsSat.setBounds(3, 3, 169, 22);
		panel_98.add(cmbInitialsSat);

		btnSundayAdd = new JButton();
		btnSundayAdd.setBackground(Color.WHITE);
		btnSundayAdd.setBounds(154, 10, 75, 21);
		panel_2.add(btnSundayAdd);
		btnSundayAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Sunday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				if (txtOdr97110Sunday.getNotes() != null)
					frameAddTextArea.setRow2(txtOdr97110Sunday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Sun.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Sun.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Sun.getNotes());
				frameAddTextArea.setRow6(txtOther01Sun.getNotes());
				frameAddTextArea.setRow7(txtOther02Sun.getNotes());
				frameAddTextArea.setRow8(txtIncidentsSun.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Sunday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Sunday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Sun.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Sun.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Sun.setNotes(frameAddTextArea.getRow5());
					txtOther01Sun.setNotes(frameAddTextArea.getRow6());
					txtOther02Sun.setNotes(frameAddTextArea.getRow7());
					txtIncidentsSun.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnSundayAdd.setText("Add");

		btnMondayAdd = new JButton();
		btnMondayAdd.setBackground(Color.WHITE);
		btnMondayAdd.setBounds(329, 10, 75, 21);
		panel_2.add(btnMondayAdd);
		btnMondayAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Monday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Monday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Mon.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Mon.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Mon.getNotes());
				frameAddTextArea.setRow6(txtOther01Mon.getNotes());
				frameAddTextArea.setRow7(txtOther02Mon.getNotes());
				frameAddTextArea.setRow8(txtIncidentsMon.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Monday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Monday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Mon.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Mon.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Mon.setNotes(frameAddTextArea.getRow5());
					txtOther01Mon.setNotes(frameAddTextArea.getRow6());
					txtOther02Mon.setNotes(frameAddTextArea.getRow7());
					txtIncidentsMon.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnMondayAdd.setText("Add");

		btnTuesdayAdd = new JButton();
		btnTuesdayAdd.setBackground(Color.WHITE);
		btnTuesdayAdd.setBounds(512, 10, 75, 21);
		panel_2.add(btnTuesdayAdd);
		btnTuesdayAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Tuesday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Tuesday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Tue.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Tue.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Tue.getNotes());
				frameAddTextArea.setRow6(txtOther01Tue.getNotes());
				frameAddTextArea.setRow7(txtOther02Tue.getNotes());
				frameAddTextArea.setRow8(txtIncidentsTue.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Tuesday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Tuesday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Tue.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Tue.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Tue.setNotes(frameAddTextArea.getRow5());
					txtOther01Tue.setNotes(frameAddTextArea.getRow6());
					txtOther02Tue.setNotes(frameAddTextArea.getRow7());
					txtIncidentsTue.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnTuesdayAdd.setText("Add");

		btnWedAdd = new JButton();
		btnWedAdd.setBackground(Color.WHITE);
		btnWedAdd.setBounds(682, 10, 75, 21);
		panel_2.add(btnWedAdd);
		btnWedAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Wednesday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Wednesday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Wed.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Wed.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Wed.getNotes());
				frameAddTextArea.setRow6(txtOther01Wed.getNotes());
				frameAddTextArea.setRow7(txtOther02Wed.getNotes());
				frameAddTextArea.setRow8(txtIncidentsWed.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Wednesday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Wednesday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Wed.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Wed.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Wed.setNotes(frameAddTextArea.getRow5());
					txtOther01Wed.setNotes(frameAddTextArea.getRow6());
					txtOther02Wed.setNotes(frameAddTextArea.getRow7());
					txtIncidentsWed.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnWedAdd.setText("Add");

		btnThuAdd = new JButton();
		btnThuAdd.setBackground(Color.WHITE);
		btnThuAdd.setBounds(851, 10, 75, 21);
		panel_2.add(btnThuAdd);
		btnThuAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Thursday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Thursday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Thu.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Thu.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Thu.getNotes());
				frameAddTextArea.setRow6(txtOther01Thu.getNotes());
				frameAddTextArea.setRow7(txtOther02Thu.getNotes());
				frameAddTextArea.setRow8(txtIncidentsThu.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Thursday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Thursday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Thu.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Thu.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Thu.setNotes(frameAddTextArea.getRow5());
					txtOther01Thu.setNotes(frameAddTextArea.getRow6());
					txtOther02Thu.setNotes(frameAddTextArea.getRow7());
					txtIncidentsThu.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnThuAdd.setText("Add");

		btnFri = new JButton();
		btnFri.setBackground(Color.WHITE);
		btnFri.setBounds(1033, 10, 75, 21);
		panel_2.add(btnFri);
		btnFri.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Friday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Friday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Fri.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Fri.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Fri.getNotes());
				frameAddTextArea.setRow6(txtOther01Fri.getNotes());
				frameAddTextArea.setRow7(txtOther02Fri.getNotes());
				frameAddTextArea.setRow8(txtIncidentsFri.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Friday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Friday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Fri.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Fri.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Fri.setNotes(frameAddTextArea.getRow5());
					txtOther01Fri.setNotes(frameAddTextArea.getRow6());
					txtOther02Fri.setNotes(frameAddTextArea.getRow7());
					txtIncidentsFri.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnFri.setText("Add");

		btnSat = new JButton();
		btnSat.setBackground(Color.WHITE);
		btnSat.setBounds(1200, 10, 75, 21);
		panel_2.add(btnSat);
		btnSat.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAddTextArea frameAddTextArea = (FrameAddTextArea) FrameFactory
						.createWindowOfType(FrameAddTextArea.class);
				if (cbOdr97003Satuday.isSelected()) {
					frameAddTextArea.setCbChecked(true);
				} else {
					frameAddTextArea.setCbChecked(false);
				}
				frameAddTextArea.setRow2(txtOdr97110Saturday.getNotes());
				frameAddTextArea.setRow3(txtOdr97112Sat.getNotes());
				frameAddTextArea.setRow4(txtOdr97530Sat.getNotes());
				frameAddTextArea.setRow5(txtOdr97535Sat.getNotes());
				frameAddTextArea.setRow6(txtOther01Sat.getNotes());
				frameAddTextArea.setRow7(txtOther02Sat.getNotes());
				frameAddTextArea.setRow8(txtIncidentsSat.getNotes());
				frameAddTextArea.setVisible(true);
				frameAddTextArea.setTitle("Sunday");
				if (frameAddTextArea.isSaved()) {
					cbOdr97003Satuday.setSelected(frameAddTextArea
							.isCbSelected());
					txtOdr97110Saturday.setNotes(frameAddTextArea.getRow2());
					txtOdr97112Sat.setNotes(frameAddTextArea.getRow3());
					txtOdr97530Sat.setNotes(frameAddTextArea.getRow4());
					txtOdr97535Sat.setNotes(frameAddTextArea.getRow5());
					txtOther01Sat.setNotes(frameAddTextArea.getRow6());
					txtOther02Sat.setNotes(frameAddTextArea.getRow7());
					txtIncidentsSat.setNotes(frameAddTextArea.getRow8());
				}
			}
		});
		btnSat.setText("Add");

		panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 945, 1327, 98);
		add(panel_17);

		printTherapNameLabel = new JLabel();
		printTherapNameLabel.setFont(new Font("", Font.BOLD, 12));
		printTherapNameLabel.setText("PRINT THERAP NAME/ INITIALS:");
		printTherapNameLabel.setBounds(10, 10, 175, 14);
		panel_17.add(printTherapNameLabel);

		signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("", Font.BOLD, 12));
		signatureLabel.setText("SIGNATURE:");
		signatureLabel.setBounds(10, 30, 68, 14);
		panel_17.add(signatureLabel);

		licenseLabel = new JLabel();
		licenseLabel.setFont(new Font("", Font.BOLD, 12));
		licenseLabel.setText("LICENSE #:");
		licenseLabel.setBounds(10, 50, 68, 14);
		panel_17.add(licenseLabel);

		cosignLicLabel = new JLabel();
		cosignLicLabel.setFont(new Font("", Font.BOLD, 12));
		cosignLicLabel.setText("CO-SIGN / LIC # /DATE:");
		cosignLicLabel.setBounds(10, 70, 124, 14);
		panel_17.add(cosignLicLabel);

		cbCosignNa = new JCheckBox();
		cbCosignNa.setBackground(Color.WHITE);
		cbCosignNa.setFont(new Font("", Font.BOLD, 12));
		cbCosignNa.setText("N/A");
		cbCosignNa.setBounds(148, 69, 37, 18);
		panel_17.add(cbCosignNa);

		cmbPrintTherapInitials01 = new JComboBox();
		cmbPrintTherapInitials01.setBackground(Color.WHITE);
		cmbPrintTherapInitials01.setBounds(191, 8, 367, 20);
		panel_17.add(cmbPrintTherapInitials01);

		cmbSignature01 = new JComboBox();
		cmbSignature01.setBackground(Color.WHITE);
		cmbSignature01.setBounds(191, 28, 367, 20);
		panel_17.add(cmbSignature01);

		txtLicenseNo01 = new JTextField();
		txtLicenseNo01.setBounds(191, 48, 367, 20);
		panel_17.add(txtLicenseNo01);

		txtCoSignLic = new JTextField();
		txtCoSignLic.setBounds(191, 68, 960, 20);
		panel_17.add(txtCoSignLic);

		cmbPrintTherapInitials02 = new JComboBox();
		cmbPrintTherapInitials02.setBackground(Color.WHITE);
		cmbPrintTherapInitials02.setBounds(568, 8, 367, 20);
		panel_17.add(cmbPrintTherapInitials02);

		cmbSignature02 = new JComboBox();
		cmbSignature02.setBackground(Color.WHITE);
		cmbSignature02.setBounds(568, 28, 367, 20);
		panel_17.add(cmbSignature02);

		txtLicenseNo02 = new JTextField();
		txtLicenseNo02.setBounds(568, 48, 367, 20);
		panel_17.add(txtLicenseNo02);

		cmbPrintTherapInitials03 = new JComboBox();
		cmbPrintTherapInitials03.setBackground(Color.WHITE);
		cmbPrintTherapInitials03.setBounds(945, 8, 367, 20);
		panel_17.add(cmbPrintTherapInitials03);

		cmbSignature03 = new JComboBox();
		cmbSignature03.setBackground(Color.WHITE);
		cmbSignature03.setBounds(945, 28, 367, 20);
		panel_17.add(cmbSignature03);

		txtLicenseNo03 = new JTextField();
		txtLicenseNo03.setBounds(945, 48, 367, 20);
		panel_17.add(txtLicenseNo03);

		dcCoSignLicDate = new JDateChooser();
		dcCoSignLicDate.setDateFormatString("MM/dd/yyyy");
		dcCoSignLicDate.setBounds(1162, 68, 150, 20);
		panel_17.add(dcCoSignLicDate);

		final JPanel panel_99 = new JPanel();
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(0, 102, 1327, 32);
		add(panel_99);

		btnPreviousWeek = new JButton();
		btnPreviousWeek.setBackground(Color.WHITE);
		btnPreviousWeek.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				getCalendar();
				calendar.add(Calendar.DATE, -7);
				setCalendar(calendar);
				updateData();

			}
		});
		btnPreviousWeek.setBounds(526, 5, 135, 21);
		btnPreviousWeek.setText("Previous Week");
		panel_99.add(btnPreviousWeek);

		btnNextWeek = new JButton();
		btnNextWeek.setBackground(Color.WHITE);
		btnNextWeek.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				getCalendar();
				calendar.add(Calendar.DATE, 7);
				setCalendar(calendar);
				updateData();
			}
		});
		btnNextWeek.setBounds(666, 5, 135, 21);
		btnNextWeek.setText("Next Week");
		panel_99.add(btnNextWeek);

		fillcombo();
		updateDiagnosis();
		setCalendar(calendar.getInstance());

		// updateData();

	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		int days = Calendar.SUNDAY - weekday;
		calendar.add(Calendar.DAY_OF_YEAR, days);
		dcDateSunday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateMonday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateTuesday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateWednesday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateThursday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateFriday.setDate(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		dcDateSaturday.setDate(calendar.getTime());
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
		txtDx.setText(tmp);
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
		cmbSignature01.addItem(user.getUserName());
		cmbSignature02.addItem(user.getUserName());
		cmbSignature03.addItem(user.getUserName());
	}

	public void doSave() {

		PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord = new PtOtStOccupationalDailyRecord();

		if (!(txtPrecautions.getText().equalsIgnoreCase(""))) {
			txtPrecautions
					.setRichTextFieldData("PtOtStOccupationalDailyRecord: Precautions");
			refPtOtStOccupationalDailyRecord.setPrecautions(txtPrecautions
					.getField());
		}

		try {
			key = MedrexClientManager.getInstance().getKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		refPtOtStOccupationalDailyRecord.setSerial(key);

		refPtOtStOccupationalDailyRecord
				.setResidentId(Global.currentResidenceKey);

		refPtOtStOccupationalDailyRecord.setCoSignLicDate(dcCoSignLicDate
				.getDate());
		refPtOtStOccupationalDailyRecord.setLicenseNo03(txtLicenseNo03
				.getText());
		refPtOtStOccupationalDailyRecord.setSignature03((String) cmbSignature03
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord
				.setPrintTherapInitials03((String) cmbPrintTherapInitials03
						.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setLicenseNo02(txtLicenseNo02
				.getText());
		refPtOtStOccupationalDailyRecord.setSignature02((String) cmbSignature02
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord
				.setPrintTherapInitials02((String) cmbPrintTherapInitials02
						.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setCoSignLic(txtCoSignLic.getText());
		refPtOtStOccupationalDailyRecord.setLicenseNo01(txtLicenseNo01
				.getText());
		refPtOtStOccupationalDailyRecord.setSignature01((String) cmbSignature01
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord
				.setPrintTherapInitials01((String) cmbPrintTherapInitials01
						.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setCosignNa(cbCosignNa.isSelected());
		refPtOtStOccupationalDailyRecord.setInitialsSat((String) cmbInitialsSat
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinSat(txtTotalMinSat
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsSat(txtIncidentsSat
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Sat(txtOther02Sat.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Sat(txtOther01Sat.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Sat(txtOdr97535Sat
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Sat(txtOdr97530Sat
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOdr97110Saturday(txtOdr97110Saturday.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Satuday(cbOdr97003Satuday
				.isSelected());
		refPtOtStOccupationalDailyRecord.setDateSaturday(dcDateSaturday
				.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsFri((String) cmbInitialsFri
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinFri(txtTotalMinFri
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsFri(txtIncidentsFri
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Fri(txtOther02Fri.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Fri(txtOther01Fri.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Fri(txtOdr97535Fri
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Fri(txtOdr97530Fri
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Fri(txtOdr97112Fri
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97110Friday(txtOdr97110Friday
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Friday(cbOdr97003Friday
				.isSelected());
		refPtOtStOccupationalDailyRecord.setDateFriday(dcDateFriday.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsThu((String) cmbInitialsThu
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinThu(txtTotalMinThu
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsThu(txtIncidentsThu
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Thu(txtOther02Thu.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Thu(txtOther01Thu.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Thu(txtOdr97535Thu
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Thu(txtOdr97530Thu
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Thu(txtOdr97112Thu
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOdr97110Thursday(txtOdr97110Thursday.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Thursday(cbOdr97003Thursday
				.isSelected());
		refPtOtStOccupationalDailyRecord.setDateThursday(dcDateThursday
				.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsWed((String) cmbInitialsWed
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinWed(txtTotalMinWed
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsWed(txtIncidentsWed
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Wed(txtOther02Wed.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Wed(txtOther01Wed.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Wed(txtOdr97535Wed
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Wed(txtOdr97530Wed
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Wed(txtOdr97112Wed
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOdr97110Wednesday(txtOdr97110Wednesday.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOdr97003Wednesday(cbOdr97003Wednesday.isSelected());
		refPtOtStOccupationalDailyRecord.setDateWednesday(dcDateWednesday
				.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsTue((String) cmbInitialsTue
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinTue(txtTotalMinTue
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsTue(txtIncidentsTue
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Tue(txtOther02Tue.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Tue(txtOther01Tue.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Tue(txtOdr97535Tue
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Tue(txtOdr97530Tue
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Tue(txtOdr97112Tue
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97110Tuesday(txtOdr97110Tuesday
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Monday(cbOdr97003Tuesday
				.isSelected());
		refPtOtStOccupationalDailyRecord
				.setDateTuesday(dcDateTuesday.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsMon((String) cmbInitialsMon
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinMon(txtTotalMinMon
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsMon(txtIncidentsMon
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Mon(txtOther02Mon.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Mon(txtOther01Mon.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Mon(txtOdr97535Mon
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Mon(txtOdr97530Mon
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Mon(txtOdr97112Mon
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97110Monday(txtOdr97110Monday
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Monday(cbOdr97003Monday
				.isSelected());
		refPtOtStOccupationalDailyRecord.setDateMonday(dcDateMonday.getDate());
		refPtOtStOccupationalDailyRecord.setInitialsSun((String) cmbInitialsSun
				.getSelectedItem());
		refPtOtStOccupationalDailyRecord.setTotalMinSun(txtTotalMinSun
				.getText());
		refPtOtStOccupationalDailyRecord.setIncidentsSun(txtIncidentsSun
				.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther02Sun(txtOther02Sun.getNotes());
		refPtOtStOccupationalDailyRecord
				.setOther01Sun(txtOther01Sun.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97535Sun(txtOdr97535Sun
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97530Sun(txtOdr97530Sun
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97112Sun(txtOdr97112Sun
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97110Sunday(txtOdr97110Sunday
				.getNotes());
		refPtOtStOccupationalDailyRecord.setOdr97003Sunday(cbOdr97003Sunday
				.isSelected());
		refPtOtStOccupationalDailyRecord.setDateSunday(dcDateSunday.getDate());
		refPtOtStOccupationalDailyRecord.setOtherRowField02(txtOtherRowField02
				.getText());
		refPtOtStOccupationalDailyRecord.setOtherRowField01(txtOtherRowField01
				.getText());
		// refPtOtStOccupationalDailyRecord.setPrecautions(txtPrecautions
		// .getText());
		refPtOtStOccupationalDailyRecord.setDx(txtDx.getText());
		refPtOtStOccupationalDailyRecord.setOtherField(txtOtherField.getText());
		refPtOtStOccupationalDailyRecord.setOther(cbOther.isSelected());
		refPtOtStOccupationalDailyRecord.setHmo(cbHmo.isSelected());
		refPtOtStOccupationalDailyRecord.setMedB(cbMedB.isSelected());
		refPtOtStOccupationalDailyRecord.setMedA(cbMedA.isSelected());
		refPtOtStOccupationalDailyRecord.setHicNo(txtHicNo.getText());
		refPtOtStOccupationalDailyRecord.setFrequency((String) cmbFrequency
				.getSelectedItem());

		try {
			key = MedrexClientManager.getInstance()
					.insertOrUpdatePtOtStOccupationalDailyRecord(
							refPtOtStOccupationalDailyRecord);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txt$PatientName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txt$RoomNo.setText(rm.getRoom());
			txtHicNo.setText(rm.getMedicalRecordNum());
			cbMedA.setSelected(rm.isPartA());
			cbMedB.setSelected(rm.isPartB());

		} catch (Exception e) {

		}
		try {
			System.out.println("Sunday is :" + dcDateSunday.getDate());
			key = MedrexClientManager.getInstance().getKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Ket is" + key);

		PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord = null;

		if (key != 0) {
			try {
				refPtOtStOccupationalDailyRecord = MedrexClientManager
						.getInstance().getPtOtStOccupationalDailyRecord(key);
			} catch (Exception e) {

			}
			dcCoSignLicDate.setDate(refPtOtStOccupationalDailyRecord
					.getCoSignLicDate());
			txtLicenseNo03.setText(refPtOtStOccupationalDailyRecord
					.getLicenseNo03());
			cmbSignature03.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getSignature03());
			cmbPrintTherapInitials03
					.setSelectedItem(refPtOtStOccupationalDailyRecord
							.getPrintTherapInitials03());
			txtLicenseNo02.setText(refPtOtStOccupationalDailyRecord
					.getLicenseNo02());
			cmbSignature02.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getSignature02());
			cmbPrintTherapInitials02
					.setSelectedItem(refPtOtStOccupationalDailyRecord
							.getPrintTherapInitials02());
			txtCoSignLic.setText(refPtOtStOccupationalDailyRecord
					.getCoSignLic());
			txtLicenseNo01.setText(refPtOtStOccupationalDailyRecord
					.getLicenseNo01());
			cmbSignature01.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getSignature01());
			cmbPrintTherapInitials01
					.setSelectedItem(refPtOtStOccupationalDailyRecord
							.getPrintTherapInitials01());
			cbCosignNa.setSelected(refPtOtStOccupationalDailyRecord
					.isCosignNa());
			cmbInitialsSat.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsSat());
			txtTotalMinSat.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinSat());
			txtIncidentsSat.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsSat());
			txtOther02Sat.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Sat());
			txtOther01Sat.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Sat());
			txtOdr97535Sat.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Sat());
			txtOdr97530Sat.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Sat());
			txtOdr97112Sat.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Sat());
			txtOdr97110Saturday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Saturday());
			cbOdr97003Satuday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Satuday());
			dcDateSaturday.setDate(refPtOtStOccupationalDailyRecord
					.getDateSaturday());
			cmbInitialsFri.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsFri());
			txtTotalMinFri.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinFri());
			txtIncidentsFri.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsFri());
			txtOther02Fri.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Fri());
			txtOther01Fri.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Fri());
			txtOdr97535Fri.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Fri());
			txtOdr97530Fri.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Fri());
			txtOdr97112Fri.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Fri());
			txtOdr97110Friday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Friday());
			cbOdr97003Friday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Friday());
			dcDateFriday.setDate(refPtOtStOccupationalDailyRecord
					.getDateFriday());
			cmbInitialsThu.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsThu());
			txtTotalMinThu.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinThu());
			txtIncidentsThu.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsThu());
			txtOther02Thu.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Thu());
			txtOther01Thu.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Thu());
			txtOdr97535Thu.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Thu());
			txtOdr97530Thu.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Thu());
			txtOdr97112Thu.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Thu());
			txtOdr97110Thursday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Thursday());
			cbOdr97003Thursday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Thursday());
			dcDateThursday.setDate(refPtOtStOccupationalDailyRecord
					.getDateThursday());
			cmbInitialsWed.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsWed());
			txtTotalMinWed.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinWed());
			txtIncidentsWed.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsWed());
			txtOther02Wed.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Wed());
			txtOther01Wed.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Wed());
			txtOdr97535Wed.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Wed());
			txtOdr97530Wed.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Wed());
			txtOdr97112Wed.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Wed());
			txtOdr97110Wednesday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Wednesday());
			cbOdr97003Wednesday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Wednesday());
			dcDateWednesday.setDate(refPtOtStOccupationalDailyRecord
					.getDateWednesday());
			cmbInitialsTue.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsTue());
			txtTotalMinTue.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinTue());
			txtIncidentsTue.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsTue());
			txtOther02Tue.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Tue());
			txtOther01Tue.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Tue());
			txtOdr97535Tue.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Tue());
			txtOdr97530Tue.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Tue());
			txtOdr97112Tue.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Tue());
			txtOdr97110Tuesday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Tuesday());
			cbOdr97003Tuesday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Monday());
			dcDateTuesday.setDate(refPtOtStOccupationalDailyRecord
					.getDateTuesday());
			cmbInitialsMon.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsMon());
			txtTotalMinMon.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinMon());
			txtIncidentsMon.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsMon());
			txtOther02Mon.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Mon());
			txtOther01Mon.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Mon());
			txtOdr97535Mon.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Mon());
			txtOdr97530Mon.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Mon());
			txtOdr97112Mon.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Mon());
			txtOdr97110Monday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Monday());
			cbOdr97003Monday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Monday());
			dcDateMonday.setDate(refPtOtStOccupationalDailyRecord
					.getDateMonday());
			cmbInitialsSun.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getInitialsSun());
			txtTotalMinSun.setText(refPtOtStOccupationalDailyRecord
					.getTotalMinSun());
			txtIncidentsSun.setNotes(refPtOtStOccupationalDailyRecord
					.getIncidentsSun());
			txtOther02Sun.setNotes(refPtOtStOccupationalDailyRecord
					.getOther02Sun());
			txtOther01Sun.setNotes(refPtOtStOccupationalDailyRecord
					.getOther01Sun());
			txtOdr97535Sun.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97535Sun());
			txtOdr97530Sun.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97530Sun());
			txtOdr97112Sun.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97112Sun());
			txtOdr97110Sunday.setNotes(refPtOtStOccupationalDailyRecord
					.getOdr97110Sunday());
			cbOdr97003Sunday.setSelected(refPtOtStOccupationalDailyRecord
					.isOdr97003Sunday());
			dcDateSunday.setDate(refPtOtStOccupationalDailyRecord
					.getDateSunday());
			txtOtherRowField02.setText(refPtOtStOccupationalDailyRecord
					.getOtherRowField02());
			txtOtherRowField01.setText(refPtOtStOccupationalDailyRecord
					.getOtherRowField01());
			txtPrecautions.setField(refPtOtStOccupationalDailyRecord
					.getPrecautions());
			txtDx.setText(refPtOtStOccupationalDailyRecord.getDx());
			txtOtherField.setText(refPtOtStOccupationalDailyRecord
					.getOtherField());
			cbOther.setSelected(refPtOtStOccupationalDailyRecord.isOther());
			cbHmo.setSelected(refPtOtStOccupationalDailyRecord.isHmo());
			cbMedB.setSelected(refPtOtStOccupationalDailyRecord.isMedB());
			cbMedA.setSelected(refPtOtStOccupationalDailyRecord.isMedA());
			txtHicNo.setText(refPtOtStOccupationalDailyRecord.getHicNo());
			cmbFrequency.setSelectedItem(refPtOtStOccupationalDailyRecord
					.getFrequency());
		} else {

			defaultNotesSat7 = new Notes();
			defaultNotesSat7.setFormName("Occupational Daily Record");
			defaultNotesSat7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat7.setNoteText("");

			defaultNotesSat6 = new Notes();
			defaultNotesSat6.setFormName("Occupational Daily Record");
			defaultNotesSat6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat6.setNoteText("");

			defaultNotesSat5 = new Notes();
			defaultNotesSat5.setFormName("Occupational Daily Record");
			defaultNotesSat5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat5.setNoteText("");

			defaultNotesSat4 = new Notes();
			defaultNotesSat4.setFormName("Occupational Daily Record");
			defaultNotesSat4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat4.setNoteText("");

			defaultNotesSat3 = new Notes();
			defaultNotesSat3.setFormName("Occupational Daily Record");
			defaultNotesSat3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat3.setNoteText("");

			defaultNotesSat2 = new Notes();
			defaultNotesSat2.setFormName("Occupational Daily Record");
			defaultNotesSat2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat2.setNoteText("");

			defaultNotesSat1 = new Notes();
			defaultNotesSat1.setFormName("Occupational Daily Record");
			defaultNotesSat1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSat1.setNoteText("");

			defaultNotesFri7 = new Notes();
			defaultNotesFri7.setFormName("Occupational Daily Record");
			defaultNotesFri7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri7.setNoteText("");

			defaultNotesFri6 = new Notes();
			defaultNotesFri6.setFormName("Occupational Daily Record");
			defaultNotesFri6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri6.setNoteText("");

			defaultNotesFri5 = new Notes();
			defaultNotesFri5.setFormName("Occupational Daily Record");
			defaultNotesFri5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri5.setNoteText("");

			defaultNotesFri4 = new Notes();
			defaultNotesFri4.setFormName("Occupational Daily Record");
			defaultNotesFri4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri4.setNoteText("");

			defaultNotesFri3 = new Notes();
			defaultNotesFri3.setFormName("Occupational Daily Record");
			defaultNotesFri3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri3.setNoteText("");

			defaultNotesFri2 = new Notes();
			defaultNotesFri2.setFormName("Occupational Daily Record");
			defaultNotesFri2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri2.setNoteText("");

			defaultNotesFri1 = new Notes();
			defaultNotesFri1.setFormName("Occupational Daily Record");
			defaultNotesFri1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesFri1.setNoteText("");

			defaultNotesThu7 = new Notes();
			defaultNotesThu7.setFormName("Occupational Daily Record");
			defaultNotesThu7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu7.setNoteText("");

			defaultNotesThu6 = new Notes();
			defaultNotesThu6.setFormName("Occupational Daily Record");
			defaultNotesThu6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu6.setNoteText("");

			defaultNotesThu5 = new Notes();
			defaultNotesThu5.setFormName("Occupational Daily Record");
			defaultNotesThu5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu5.setNoteText("");

			defaultNotesThu4 = new Notes();
			defaultNotesThu4.setFormName("Occupational Daily Record");
			defaultNotesThu4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu4.setNoteText("");

			defaultNotesThu3 = new Notes();
			defaultNotesThu3.setFormName("Occupational Daily Record");
			defaultNotesThu3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu3.setNoteText("");

			defaultNotesThu2 = new Notes();
			defaultNotesThu2.setFormName("Occupational Daily Record");
			defaultNotesThu2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu2.setNoteText("");

			defaultNotesThu1 = new Notes();
			defaultNotesThu1.setFormName("Occupational Daily Record");
			defaultNotesThu1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesThu1.setNoteText("");

			defaultNotesWed7 = new Notes();
			defaultNotesWed7.setFormName("Occupational Daily Record");
			defaultNotesWed7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed7.setNoteText("");

			defaultNotesWed6 = new Notes();
			defaultNotesWed6.setFormName("Occupational Daily Record");
			defaultNotesWed6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed6.setNoteText("");

			defaultNotesWed5 = new Notes();
			defaultNotesWed5.setFormName("Occupational Daily Record");
			defaultNotesWed5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed5.setNoteText("");

			defaultNotesWed4 = new Notes();
			defaultNotesWed4.setFormName("Occupational Daily Record");
			defaultNotesWed4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed4.setNoteText("");

			defaultNotesWed3 = new Notes();
			defaultNotesWed3.setFormName("Occupational Daily Record");
			defaultNotesWed3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed3.setNoteText("");

			defaultNotesWed2 = new Notes();
			defaultNotesWed2.setFormName("Occupational Daily Record");
			defaultNotesWed2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed2.setNoteText("");

			defaultNotesWed1 = new Notes();
			defaultNotesWed1.setFormName("Occupational Daily Record");
			defaultNotesWed1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesWed1.setNoteText("");

			defaultNotesTue7 = new Notes();
			defaultNotesTue7.setFormName("Occupational Daily Record");
			defaultNotesTue7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue7.setNoteText("");

			defaultNotesTue6 = new Notes();
			defaultNotesTue6.setFormName("Occupational Daily Record");
			defaultNotesTue6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue6.setNoteText("");

			defaultNotesTue5 = new Notes();
			defaultNotesTue5.setFormName("Occupational Daily Record");
			defaultNotesTue5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue5.setNoteText("");

			defaultNotesTue4 = new Notes();
			defaultNotesTue4.setFormName("Occupational Daily Record");
			defaultNotesTue4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue4.setNoteText("");

			defaultNotesTue3 = new Notes();
			defaultNotesTue3.setFormName("Occupational Daily Record");
			defaultNotesTue3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue3.setNoteText("");

			defaultNotesTue2 = new Notes();
			defaultNotesTue2.setFormName("Occupational Daily Record");
			defaultNotesTue2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue2.setNoteText("");

			defaultNotesTue1 = new Notes();
			defaultNotesTue1.setFormName("Occupational Daily Record");
			defaultNotesTue1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesTue1.setNoteText("");

			defaultNotesMon7 = new Notes();
			defaultNotesMon7.setFormName("Occupational Daily Record");
			defaultNotesMon7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon7.setNoteText("");

			defaultNotesMon6 = new Notes();
			defaultNotesMon6.setFormName("Occupational Daily Record");
			defaultNotesMon6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon6.setNoteText("");

			defaultNotesMon5 = new Notes();
			defaultNotesMon5.setFormName("Occupational Daily Record");
			defaultNotesMon5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon5.setNoteText("");

			defaultNotesMon4 = new Notes();
			defaultNotesMon4.setFormName("Occupational Daily Record");
			defaultNotesMon4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon4.setNoteText("");

			defaultNotesMon3 = new Notes();
			defaultNotesMon3.setFormName("Occupational Daily Record");
			defaultNotesMon3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon3.setNoteText("");

			defaultNotesMon2 = new Notes();
			defaultNotesMon2.setFormName("Occupational Daily Record");
			defaultNotesMon2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon2.setNoteText("");

			defaultNotesMon1 = new Notes();
			defaultNotesMon1.setFormName("Occupational Daily Record");
			defaultNotesMon1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon1.setNoteText("");

			defaultNotesMon7 = new Notes();
			defaultNotesMon7.setFormName("Occupational Daily Record");
			defaultNotesMon7.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon7.setNoteText("");

			defaultNotesMon6 = new Notes();
			defaultNotesMon6.setFormName("Occupational Daily Record");
			defaultNotesMon6.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon6.setNoteText("");

			defaultNotesMon5 = new Notes();
			defaultNotesMon5.setFormName("Occupational Daily Record");
			defaultNotesMon5.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon5.setNoteText("");

			defaultNotesMon4 = new Notes();
			defaultNotesMon4.setFormName("Occupational Daily Record");
			defaultNotesMon4.setUserId(Global.currentLoggedInUserKey);
			defaultNotesMon4.setNoteText("");

			defaultNotesSun3 = new Notes();
			defaultNotesSun3.setFormName("Occupational Daily Record");
			defaultNotesSun3.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSun3.setNoteText("");

			defaultNotesSun2 = new Notes();
			defaultNotesSun2.setFormName("Occupational Daily Record");
			defaultNotesSun2.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSun2.setNoteText("");

			defaultNotesSun1 = new Notes();
			defaultNotesSun1.setFormName("Occupational Daily Record");
			defaultNotesSun1.setUserId(Global.currentLoggedInUserKey);
			defaultNotesSun1.setNoteText("");

			dcCoSignLicDate.setDate(null);
			txtLicenseNo03.setText("");
			cmbSignature03.setSelectedItem(null);
			cmbPrintTherapInitials03.setSelectedItem(null);
			txtLicenseNo02.setText("");
			cmbSignature02.setSelectedItem(null);
			cmbPrintTherapInitials02.setSelectedItem(null);
			txtCoSignLic.setText("");
			txtLicenseNo01.setText("");
			cmbSignature01.setSelectedItem(null);
			cmbPrintTherapInitials01.setSelectedItem(null);
			cbCosignNa.setSelected(false);
			cmbInitialsSat.setSelectedItem(null);
			txtTotalMinSat.setText("");
			txtIncidentsSat.setNotes(defaultNotesSat7);
			txtOther02Sat.setNotes(defaultNotesSat6);
			txtOther01Sat.setNotes(defaultNotesSat5);
			txtOdr97535Sat.setNotes(defaultNotesSat4);
			txtOdr97530Sat.setNotes(defaultNotesSat3);
			txtOdr97112Sat.setNotes(defaultNotesSat2);
			txtOdr97110Saturday.setNotes(defaultNotesSat1);
			cbOdr97003Satuday.setSelected(false);
			// dcDateSaturday.setDate(null);
			cmbInitialsFri.setSelectedItem(null);
			txtTotalMinFri.setText("");
			txtIncidentsFri.setNotes(defaultNotesFri7);
			txtOther02Fri.setNotes(defaultNotesFri6);
			txtOther01Fri.setNotes(defaultNotesFri5);
			txtOdr97535Fri.setNotes(defaultNotesFri4);
			txtOdr97530Fri.setNotes(defaultNotesFri3);
			txtOdr97112Fri.setNotes(defaultNotesFri2);
			txtOdr97110Friday.setNotes(defaultNotesFri1);
			cbOdr97003Friday.setSelected(false);
			// dcDateFriday.setDate(null);
			cmbInitialsThu.setSelectedItem(null);
			txtTotalMinThu.setText("");
			txtIncidentsThu.setNotes(defaultNotesThu7);
			txtOther02Thu.setNotes(defaultNotesThu6);
			txtOther01Thu.setNotes(defaultNotesThu5);
			txtOdr97535Thu.setNotes(defaultNotesThu4);
			txtOdr97530Thu.setNotes(defaultNotesThu3);
			txtOdr97112Thu.setNotes(defaultNotesThu2);
			txtOdr97110Thursday.setNotes(defaultNotesThu1);
			cbOdr97003Thursday.setSelected(false);
			// dcDateThursday.setDate(null);
			cmbInitialsWed.setSelectedItem(null);
			txtTotalMinWed.setText("");
			txtIncidentsWed.setNotes(defaultNotesWed7);
			txtOther02Wed.setNotes(defaultNotesWed6);
			txtOther01Wed.setNotes(defaultNotesWed5);
			txtOdr97535Wed.setNotes(defaultNotesWed4);
			txtOdr97530Wed.setNotes(defaultNotesWed3);
			txtOdr97112Wed.setNotes(defaultNotesWed2);
			txtOdr97110Wednesday.setNotes(defaultNotesWed1);
			cbOdr97003Wednesday.setSelected(false);
			// dcDateWednesday.setDate(null);
			cmbInitialsTue.setSelectedItem(null);
			txtTotalMinTue.setText("");
			txtIncidentsTue.setNotes(defaultNotesTue7);
			txtOther02Tue.setNotes(defaultNotesTue6);
			txtOther01Tue.setNotes(defaultNotesTue5);
			txtOdr97535Tue.setNotes(defaultNotesTue4);
			txtOdr97530Tue.setNotes(defaultNotesTue3);
			txtOdr97112Tue.setNotes(defaultNotesTue2);
			txtOdr97110Tuesday.setNotes(defaultNotesTue1);
			cbOdr97003Tuesday.setSelected(false);
			// dcDateTuesday.setDate(null);
			cmbInitialsMon.setSelectedItem(null);
			txtTotalMinMon.setText("");
			txtIncidentsMon.setNotes(defaultNotesMon7);
			txtOther02Mon.setNotes(defaultNotesMon6);
			txtOther01Mon.setNotes(defaultNotesMon5);
			txtOdr97535Mon.setNotes(defaultNotesMon4);
			txtOdr97530Mon.setNotes(defaultNotesMon3);
			txtOdr97112Mon.setNotes(defaultNotesMon2);
			txtOdr97110Monday.setNotes(defaultNotesMon1);
			cbOdr97003Monday.setSelected(false);
			// dcDateMonday.setDate(null);
			cmbInitialsSun.setSelectedItem(null);
			txtTotalMinSun.setText("");
			txtIncidentsSun.setNotes(defaultNotesSun7);
			txtOther02Sun.setNotes(defaultNotesSun6);
			txtOther01Sun.setNotes(defaultNotesSun5);
			txtOdr97535Sun.setNotes(defaultNotesSun4);
			txtOdr97530Sun.setNotes(defaultNotesSun3);
			txtOdr97112Sun.setNotes(defaultNotesSun2);
			txtOdr97110Sunday.setNotes(defaultNotesSun1);
			cbOdr97003Sunday.setSelected(false);
			// dcDateSunday.setDate(null);
			txtOtherRowField02.setText("");
			txtOtherRowField01.setText("");
			// txtPrecautions.setField(null);
			// txtDx.setText("");
			// txtOtherField.setText("");
			// cbOther.setSelected(false);
			// cbHmo.setSelected(false);
			// cbMedB.setSelected(false);
			// cbMedA.setSelected(false);
			// txtHicNo.setText("");
			// cmbFrequency.setSelectedItem(null);

		}
	}

}
