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
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalDailyRecord;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxTextArea;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStPhysicalDailyRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7096714565044670849L;
	private JCheckBox cbEvalSat;
	private JCheckBox cbEvalFri;
	private JCheckBox cbEvalThu;
	private JCheckBox cbEvalWed;
	private JCheckBox cbEvalTue;
	private JCheckBox cbEvalMon;
	private JCheckBox cbEvalSun;
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
	private JCheckBox cbCoSignNa;
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
	private JxTextArea txtPdr97530Sat;
	private JPanel panel_93;
	private JxTextArea txtPdr97116Sat;
	private JPanel panel_92;
	private JxTextArea txtPdr97112Sat;
	private JPanel panel_91;
	private JxTextArea txtPdr97110Saturday;
	private JPanel panel_90;
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
	private JxTextArea txtPdr97530Fri;
	private JPanel panel_81;
	private JxTextArea txtPdr97116Fri;
	private JPanel panel_80;
	private JxTextArea txtPdr97112Fri;
	private JPanel panel_79;
	private JxTextArea txtPdr97110Friday;
	private JPanel panel_78;
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
	private JxTextArea txtPdr97530Thu;
	private JPanel panel_69;
	private JxTextArea txtPdr97116Thu;
	private JPanel panel_68;
	private JxTextArea txtPdr97112Thu;
	private JPanel panel_67;
	private JxTextArea txtPdr97110Thursday;
	private JPanel panel_66;
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
	private JxTextArea txtPdr97530Wed;
	private JPanel panel_57;
	private JxTextArea txtPdr97116Wed;
	private JPanel panel_56;
	private JxTextArea txtPdr97112Wed;
	private JPanel panel_55;
	private JxTextArea txtPdr97110Wednesday;
	private JPanel panel_54;
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
	private JxTextArea txtPdr97530Tue;
	private JPanel panel_45;
	private JxTextArea txtPdr97116Tue;
	private JPanel panel_44;
	private JxTextArea txtPdr97112Tue;
	private JPanel panel_43;
	private JxTextArea txtPdr97110Tuesday;
	private JPanel panel_42;
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
	private JxTextArea txtPdr97530Mon;
	private JPanel panel_33;
	private JxTextArea txtPdr97116Mon;
	private JPanel panel_32;
	private JxTextArea txtPdr97112Mon;
	private JPanel panel_31;
	private JxTextArea txtPdr97110Monday;
	private JPanel panel_30;
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
	private JxTextArea txtPdr97530Sun;
	private JPanel panel_21;
	private JxTextArea txtPdr97116Sun;
	private JPanel panel_20;
	private JxTextArea txtPdr97112Sun;
	private JPanel panel_19;
	private JxTextArea txtPdr97110Sunday;
	private JPanel panel_18;
	private JPanel panel_16;
	private JDateChooser dcDateSunday;
	private JLabel sundayLabel;
	private JPanel panel_15;
	private JPanel panel_5;
	private JLabel eval97001Label_2;
	private JPanel panel_14;
	private JLabel eval97001Label_1;
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
	private JLabel therapyLabel_10;
	private JLabel therapyLabel_9;
	private JLabel therapyLabel_8;
	private JLabel therapyLabel_7;
	private JLabel label_4;
	private JPanel panel_9;
	private JLabel therapyLabel_6;
	private JLabel therapyLabel_5;
	private JLabel therapyLabel_4;
	private JLabel label_3;
	private JPanel panel_8;
	private JLabel therapyLabel_3;
	private JLabel therapyLabel_2;
	private JLabel label_2;
	private JPanel panel_7;
	private JLabel therapyLabel_1;
	private JLabel therapyLabel;
	private JLabel label;
	private JLabel eval97001Label;
	private JPanel panel_6;
	private JPanel panel_4;
	private JLabel daydateLabel;
	private JPanel panel_3;
	private JPanel panel_2;
	private JTextField txtPrecautions;
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
	private JTextField txt$Frequency;
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
	private Notes defaultNoteSun1;
	private Notes defaultNoteSun2;
	private Notes defaultNoteSun3;
	private Notes defaultNoteSun4;
	private Notes defaultNoteSun5;
	private Notes defaultNoteSun6;
	private Notes defaultNoteSun7;
	private Notes defaultNoteSun8;

	private Notes defaultNoteMon1;
	private Notes defaultNoteMon2;
	private Notes defaultNoteMon3;
	private Notes defaultNoteMon4;
	private Notes defaultNoteMon5;
	private Notes defaultNoteMon6;
	private Notes defaultNoteMon7;
	private Notes defaultNoteMon8;

	private Notes defaultNoteTue1;
	private Notes defaultNoteTue2;
	private Notes defaultNoteTue3;
	private Notes defaultNoteTue4;
	private Notes defaultNoteTue5;
	private Notes defaultNoteTue6;
	private Notes defaultNoteTue7;
	private Notes defaultNoteTue8;

	private Notes defaultNoteWed1;
	private Notes defaultNoteWed2;
	private Notes defaultNoteWed3;
	private Notes defaultNoteWed4;
	private Notes defaultNoteWed5;
	private Notes defaultNoteWed6;
	private Notes defaultNoteWed7;
	private Notes defaultNoteWed8;

	private Notes defaultNoteThur1;
	private Notes defaultNoteThur2;
	private Notes defaultNoteThur3;
	private Notes defaultNoteThur4;
	private Notes defaultNoteThur5;
	private Notes defaultNoteThur6;
	private Notes defaultNoteThur7;
	private Notes defaultNoteThur8;

	private Notes defaultNoteFri1;
	private Notes defaultNoteFri2;
	private Notes defaultNoteFri3;
	private Notes defaultNoteFri4;
	private Notes defaultNoteFri5;
	private Notes defaultNoteFri6;
	private Notes defaultNoteFri7;
	private Notes defaultNoteFri8;

	private Notes defaultNoteSat1;
	private Notes defaultNoteSat2;
	private Notes defaultNoteSat3;
	private Notes defaultNoteSat4;
	private Notes defaultNoteSat5;
	private Notes defaultNoteSat6;
	private Notes defaultNoteSat7;
	private Notes defaultNoteSat8;

	private Calendar calendar;
	private int key = 0;
	private JComboBox cmbFrequency;

	/**
	 * Create the panel
	 */
	public PanelPtOtStPhysicalDailyRecord() {
		super();
		Global.panelPtOtStPhysicalDailyRecord = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1340, 1000));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1327, 101);
		add(panel);
		setDefaultNotes();
		physicalTherapyDailyLabel = new JLabel();
		physicalTherapyDailyLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 20));
		physicalTherapyDailyLabel
				.setText("Physical Therapy: Daily Treament Record");
		physicalTherapyDailyLabel.setBounds(486, 10, 355, 22);
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

		/*
		 * txt$Frequency = new JTextField();
		 * txt$Frequency.setBackground(Color.WHITE);
		 * txt$Frequency.setEditable(false); txt$Frequency.setBounds(1044, 7,
		 * 273, 21); panel_1.add(txt$Frequency);
		 */

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
		txtDx.setBounds(524, 35, 260, 21);
		panel_1.add(txtDx);

		patientNameLabel_6 = new JLabel();
		patientNameLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_6.setText("PRECAUTIONS/WBS:");
		patientNameLabel_6.setBounds(831, 38, 120, 14);
		panel_1.add(patientNameLabel_6);

		txtPrecautions = new JTextField();
		txtPrecautions.setBounds(961, 35, 356, 21);
		panel_1.add(txtPrecautions);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		button.setBackground(Color.WHITE);
		button.setText("+");
		button.setBounds(790, 34, 31, 24);
		panel_1.add(button);

		patientNameLabel_4 = new JLabel();
		patientNameLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_4.setText("YEAR:");
		patientNameLabel_4.setBounds(1026, 15, 35, 14);
		panel.add(patientNameLabel_4);

		final JLabel lblYear = new JLabel();
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblYear.setText(new SimpleDateFormat("yyyy").format(MedrexClientManager
				.getServerTime()));
		lblYear.setBounds(1067, 11, 99, 21);
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
		panel_2.setBounds(0, 172, 1328, 732);
		add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 110, 732);
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

		eval97001Label = new JLabel();
		eval97001Label.setFont(new Font("", Font.BOLD, 12));
		eval97001Label.setText("EVAL 97001");
		eval97001Label.setBounds(20, 7, 70, 14);
		panel_4.add(eval97001Label);

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
		panel_8.setBounds(0, 220, 110, 100);
		panel_3.add(panel_8);

		label_3 = new JLabel();
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setText("97116");
		label_3.setBounds(37, 20, 35, 14);
		panel_8.add(label_3);

		therapyLabel_4 = new JLabel();
		therapyLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_4.setText("GAIT TRAINING/");
		therapyLabel_4.setBounds(12, 35, 85, 14);
		panel_8.add(therapyLabel_4);

		therapyLabel_5 = new JLabel();
		therapyLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_5.setText("PATTERN/");
		therapyLabel_5.setBounds(27, 50, 56, 14);
		panel_8.add(therapyLabel_5);

		therapyLabel_6 = new JLabel();
		therapyLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_6.setText("POSTURE DEV.");
		therapyLabel_6.setBounds(12, 65, 85, 14);
		panel_8.add(therapyLabel_6);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 319, 110, 130);
		panel_3.add(panel_9);

		label_4 = new JLabel();
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setText("97530");
		label_4.setBounds(37, 28, 35, 14);
		panel_9.add(label_4);

		therapyLabel_7 = new JLabel();
		therapyLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_7.setText("THERAPEUTIC");
		therapyLabel_7.setBounds(12, 43, 85, 14);
		panel_9.add(therapyLabel_7);

		therapyLabel_8 = new JLabel();
		therapyLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_8.setText("ACTIVITIES TO");
		therapyLabel_8.setBounds(14, 58, 81, 14);
		panel_9.add(therapyLabel_8);

		therapyLabel_9 = new JLabel();
		therapyLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_9.setText("INCR FXNL");
		therapyLabel_9.setBounds(25, 73, 59, 14);
		panel_9.add(therapyLabel_9);

		therapyLabel_10 = new JLabel();
		therapyLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_10.setText("PERFORMANCE");
		therapyLabel_10.setBounds(11, 88, 88, 14);
		panel_9.add(therapyLabel_10);

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

		eval97001Label_1 = new JLabel();
		eval97001Label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		eval97001Label_1.setText("TOTAL MINUTES");
		eval97001Label_1.setBounds(9, 7, 92, 14);
		panel_13.add(eval97001Label_1);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 704, 110, 28);
		panel_3.add(panel_14);

		eval97001Label_2 = new JLabel();
		eval97001Label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		eval97001Label_2.setText("INITIALS");
		eval97001Label_2.setBounds(31, 7, 47, 14);
		panel_14.add(eval97001Label_2);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(109, 0, 175, 732);
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

		cbEvalSun = new JCheckBox();
		cbEvalSun.setBackground(Color.WHITE);
		cbEvalSun.setText("");
		cbEvalSun.setEnabled(false);
		cbEvalSun.setBounds(64, 10, 101, 12);
		panel_16.add(cbEvalSun);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 54, 175, 84);
		panel_5.add(panel_18);

		txtPdr97110Sunday = new JxTextArea();
		txtPdr97110Sunday.setNotes(defaultNoteSun1);
		txtPdr97110Sunday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Sunday.setWrapStyleWord(true);
		// txtPdr97110Sunday.setLineWrap(true);
		txtPdr97110Sunday.setBounds(3, 3, 168, 78);
		txtPdr97110Sunday.setEditable(false);
		txtPdr97110Sunday.setBackground(Color.WHITE);
		panel_18.add(txtPdr97110Sunday);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 137, 175, 84);
		panel_5.add(panel_19);

		txtPdr97112Sun = new JxTextArea();
		txtPdr97112Sun.setNotes(defaultNoteSun2);
		txtPdr97112Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Sun.setWrapStyleWord(true);
		// txtPdr97112Sun.setLineWrap(true);
		txtPdr97112Sun.setBounds(3, 3, 168, 78);
		txtPdr97112Sun.setEditable(false);
		txtPdr97112Sun.setBackground(Color.WHITE);
		panel_19.add(txtPdr97112Sun);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 220, 175, 100);
		panel_5.add(panel_20);

		txtPdr97116Sun = new JxTextArea();
		txtPdr97116Sun.setNotes(defaultNoteSun3);
		txtPdr97116Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Sun.setWrapStyleWord(true);
		// txtPdr97116Sun.setLineWrap(true);
		txtPdr97116Sun.setBounds(3, 3, 168, 94);
		txtPdr97116Sun.setEditable(false);
		txtPdr97116Sun.setBackground(Color.WHITE);
		panel_20.add(txtPdr97116Sun);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 319, 175, 130);
		panel_5.add(panel_21);

		txtPdr97530Sun = new JxTextArea();
		txtPdr97530Sun.setNotes(defaultNoteSun4);
		txtPdr97530Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Sun.setWrapStyleWord(true);
		// txtPdr97530Sun.setLineWrap(true);
		txtPdr97530Sun.setBounds(3, 3, 168, 125);
		txtPdr97530Sun.setEditable(false);
		txtPdr97530Sun.setBackground(Color.WHITE);
		panel_21.add(txtPdr97530Sun);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 448, 175, 51);
		panel_5.add(panel_22);

		txtOther01Sun = new JxTextArea();
		txtOther01Sun.setBorder(new LineBorder(Color.black, 1, false));
		txtOther01Sun.setNotes(defaultNoteSun5);
		// txtOther01Sun.setWrapStyleWord(true);
		// txtOther01Sun.setLineWrap(true);
		txtOther01Sun.setBounds(3, 3, 168, 45);
		txtOther01Sun.setEditable(false);
		txtOther01Sun.setBackground(Color.WHITE);
		panel_22.add(txtOther01Sun);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(0, 498, 175, 51);
		panel_5.add(panel_23);

		txtOther02Sun = new JxTextArea();
		txtOther02Sun.setBorder(new LineBorder(Color.black, 1, false));
		txtOther02Sun.setNotes(defaultNoteSun6);
		// txtOther02Sun.setWrapStyleWord(true);
		// txtOther02Sun.setLineWrap(true);
		txtOther02Sun.setBounds(3, 3, 168, 45);
		txtOther02Sun.setEditable(false);
		txtOther02Sun.setBackground(Color.WHITE);
		panel_23.add(txtOther02Sun);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 548, 175, 130);
		panel_5.add(panel_24);

		txtIncidentsSun = new JxTextArea();
		txtIncidentsSun.setNotes(defaultNoteSun7);
		txtIncidentsSun.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsSun.setWrapStyleWord(true);
		// txtIncidentsSun.setLineWrap(true);
		txtIncidentsSun.setBounds(3, 3, 168, 125);
		txtIncidentsSun.setEditable(false);
		txtIncidentsSun.setBackground(Color.WHITE);
		panel_24.add(txtIncidentsSun);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 677, 175, 28);
		panel_5.add(panel_25);

		txtTotalMinSun = new JTextArea();
		txtTotalMinSun.setWrapStyleWord(true);
		txtTotalMinSun.setLineWrap(true);
		txtTotalMinSun.setBounds(3, 3, 169, 22);
		panel_25.add(txtTotalMinSun);

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
		panel_27.setBounds(283, 0, 175, 732);
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

		cbEvalMon = new JCheckBox();
		cbEvalMon.setBackground(Color.WHITE);
		cbEvalMon.setText("");
		cbEvalMon.setEnabled(false);
		cbEvalMon.setBounds(74, 10, 91, 12);
		panel_29.add(cbEvalMon);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 54, 175, 84);
		panel_27.add(panel_30);

		txtPdr97110Monday = new JxTextArea();
		txtPdr97110Monday.setNotes(defaultNoteMon1);
		txtPdr97110Monday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Monday.setWrapStyleWord(true);
		// txtPdr97110Monday.setLineWrap(true);
		txtPdr97110Monday.setBounds(3, 3, 168, 78);
		txtPdr97110Monday.setEditable(false);
		txtPdr97110Monday.setBackground(Color.WHITE);
		panel_30.add(txtPdr97110Monday);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 137, 175, 84);
		panel_27.add(panel_31);

		txtPdr97112Mon = new JxTextArea();
		txtPdr97112Mon.setNotes(defaultNoteMon2);
		txtPdr97112Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Mon.setWrapStyleWord(true);
		// txtPdr97112Mon.setLineWrap(true);
		txtPdr97112Mon.setBounds(3, 3, 168, 78);
		txtPdr97112Mon.setEditable(false);
		txtPdr97112Mon.setBackground(Color.WHITE);
		panel_31.add(txtPdr97112Mon);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 220, 175, 100);
		panel_27.add(panel_32);

		txtPdr97116Mon = new JxTextArea();
		txtPdr97116Mon.setNotes(defaultNoteMon3);
		txtPdr97116Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Mon.setWrapStyleWord(true);
		// txtPdr97116Mon.setLineWrap(true);
		txtPdr97116Mon.setBounds(3, 3, 168, 94);
		txtPdr97116Mon.setEditable(false);
		txtPdr97116Mon.setBackground(Color.WHITE);
		panel_32.add(txtPdr97116Mon);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 319, 175, 130);
		panel_27.add(panel_33);

		txtPdr97530Mon = new JxTextArea();
		txtPdr97530Mon.setNotes(defaultNoteMon4);
		txtPdr97530Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Mon.setWrapStyleWord(true);
		// txtPdr97530Mon.setLineWrap(true);
		txtPdr97530Mon.setBounds(3, 3, 168, 125);
		txtPdr97530Mon.setEditable(false);
		txtPdr97530Mon.setBackground(Color.WHITE);
		panel_33.add(txtPdr97530Mon);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 448, 175, 51);
		panel_27.add(panel_34);

		txtOther01Mon = new JxTextArea();
		txtOther01Mon.setNotes(defaultNoteMon5);
		txtOther01Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Mon.setWrapStyleWord(true);
		// txtOther01Mon.setLineWrap(true);
		txtOther01Mon.setBounds(3, 3, 168, 45);
		txtOther01Mon.setEditable(false);
		txtOther01Mon.setBackground(Color.WHITE);
		panel_34.add(txtOther01Mon);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 498, 175, 51);
		panel_27.add(panel_35);

		txtOther02Mon = new JxTextArea();
		txtOther02Mon.setNotes(defaultNoteMon6);
		txtOther02Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Mon.setWrapStyleWord(true);
		// txtOther02Mon.setLineWrap(true);
		txtOther02Mon.setBounds(3, 3, 168, 45);
		txtOther02Mon.setEditable(false);
		txtOther02Mon.setBackground(Color.WHITE);
		panel_35.add(txtOther02Mon);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 548, 175, 130);
		panel_27.add(panel_36);

		txtIncidentsMon = new JxTextArea();
		txtIncidentsMon.setNotes(defaultNoteMon7);
		txtIncidentsMon.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsMon.setWrapStyleWord(true);
		// txtIncidentsMon.setLineWrap(true);
		txtIncidentsMon.setBounds(3, 3, 168, 125);
		txtIncidentsMon.setEditable(false);
		txtIncidentsMon.setBackground(Color.WHITE);
		panel_36.add(txtIncidentsMon);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 677, 175, 28);
		panel_27.add(panel_37);

		txtTotalMinMon = new JTextArea();
		txtTotalMinMon.setWrapStyleWord(true);
		txtTotalMinMon.setLineWrap(true);
		txtTotalMinMon.setBounds(3, 3, 169, 22);
		panel_37.add(txtTotalMinMon);

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
		panel_39.setBounds(457, 0, 175, 732);
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

		cbEvalTue = new JCheckBox();
		cbEvalTue.setBackground(Color.WHITE);
		cbEvalTue.setText("");
		cbEvalTue.setEnabled(false);
		cbEvalTue.setBounds(64, 10, 101, 12);
		panel_41.add(cbEvalTue);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 54, 175, 84);
		panel_39.add(panel_42);

		txtPdr97110Tuesday = new JxTextArea();
		txtPdr97110Tuesday.setNotes(defaultNoteTue1);
		txtPdr97110Tuesday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Tuesday.setWrapStyleWord(true);
		// txtPdr97110Tuesday.setLineWrap(true);
		txtPdr97110Tuesday.setBounds(3, 3, 168, 78);
		txtPdr97110Tuesday.setEditable(false);
		txtPdr97110Tuesday.setBackground(Color.WHITE);
		panel_42.add(txtPdr97110Tuesday);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 137, 175, 84);
		panel_39.add(panel_43);

		txtPdr97112Tue = new JxTextArea();
		txtPdr97112Tue.setNotes(defaultNoteTue2);
		txtPdr97112Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Tue.setWrapStyleWord(true);
		// txtPdr97112Tue.setLineWrap(true);
		txtPdr97112Tue.setBounds(3, 3, 168, 78);
		txtPdr97112Tue.setEditable(false);
		txtPdr97112Tue.setBackground(Color.WHITE);
		panel_43.add(txtPdr97112Tue);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(0, 220, 175, 100);
		panel_39.add(panel_44);

		txtPdr97116Tue = new JxTextArea();
		txtPdr97116Tue.setNotes(defaultNoteTue3);
		txtPdr97116Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Tue.setWrapStyleWord(true);
		// txtPdr97116Tue.setLineWrap(true);
		txtPdr97116Tue.setBounds(3, 3, 168, 94);
		txtPdr97116Tue.setEditable(false);
		txtPdr97116Tue.setBackground(Color.WHITE);
		panel_44.add(txtPdr97116Tue);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 319, 175, 130);
		panel_39.add(panel_45);

		txtPdr97530Tue = new JxTextArea();
		txtPdr97530Tue.setNotes(defaultNoteTue4);
		txtPdr97530Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Tue.setWrapStyleWord(true);
		// txtPdr97530Tue.setLineWrap(true);
		txtPdr97530Tue.setBounds(3, 3, 168, 125);
		txtPdr97530Tue.setEditable(false);
		txtPdr97530Tue.setBackground(Color.WHITE);
		panel_45.add(txtPdr97530Tue);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 448, 175, 51);
		panel_39.add(panel_46);

		txtOther01Tue = new JxTextArea();
		txtOther01Tue.setNotes(defaultNoteTue5);
		txtOther01Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Tue.setWrapStyleWord(true);
		// txtOther01Tue.setLineWrap(true);
		txtOther01Tue.setBounds(3, 3, 168, 45);
		txtOther01Tue.setEditable(false);
		txtOther01Tue.setBackground(Color.WHITE);
		panel_46.add(txtOther01Tue);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 498, 175, 51);
		panel_39.add(panel_47);

		txtOther02Tue = new JxTextArea();
		txtOther02Tue.setNotes(defaultNoteTue6);
		txtOther02Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Tue.setWrapStyleWord(true);
		// txtOther02Tue.setLineWrap(true);
		txtOther02Tue.setBounds(3, 3, 168, 45);
		txtOther02Tue.setEditable(false);
		txtOther02Tue.setBackground(Color.WHITE);
		panel_47.add(txtOther02Tue);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 548, 175, 130);
		panel_39.add(panel_48);

		txtIncidentsTue = new JxTextArea();
		txtIncidentsTue.setNotes(defaultNoteTue7);
		txtIncidentsTue.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsTue.setWrapStyleWord(true);
		// txtIncidentsTue.setLineWrap(true);
		txtIncidentsTue.setBounds(3, 3, 168, 125);
		txtIncidentsTue.setEditable(false);
		txtIncidentsTue.setBackground(Color.WHITE);
		panel_48.add(txtIncidentsTue);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(0, 677, 175, 28);
		panel_39.add(panel_49);

		txtTotalMinTue = new JTextArea();
		txtTotalMinTue.setWrapStyleWord(true);
		txtTotalMinTue.setLineWrap(true);
		txtTotalMinTue.setBounds(3, 3, 169, 22);
		panel_49.add(txtTotalMinTue);

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
		panel_51.setBounds(631, 0, 175, 732);
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

		cbEvalWed = new JCheckBox();
		cbEvalWed.setBackground(Color.WHITE);
		cbEvalWed.setText("");
		cbEvalWed.setEnabled(false);
		cbEvalWed.setBounds(74, 10, 91, 12);
		panel_53.add(cbEvalWed);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(0, 54, 175, 84);
		panel_51.add(panel_54);

		txtPdr97110Wednesday = new JxTextArea();
		txtPdr97110Wednesday.setNotes(defaultNoteWed1);
		txtPdr97110Wednesday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Wednesday.setWrapStyleWord(true);
		// txtPdr97110Wednesday.setLineWrap(true);
		txtPdr97110Wednesday.setBounds(3, 3, 168, 78);
		txtPdr97110Wednesday.setEditable(false);
		txtPdr97110Wednesday.setBackground(Color.WHITE);
		panel_54.add(txtPdr97110Wednesday);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 137, 175, 84);
		panel_51.add(panel_55);

		txtPdr97112Wed = new JxTextArea();
		txtPdr97112Wed.setNotes(defaultNoteWed2);
		txtPdr97112Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Wed.setWrapStyleWord(true);
		// txtPdr97112Wed.setLineWrap(true);
		txtPdr97112Wed.setBounds(3, 3, 168, 78);
		txtPdr97112Wed.setEditable(false);
		txtPdr97112Wed.setBackground(Color.WHITE);
		panel_55.add(txtPdr97112Wed);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(0, 220, 175, 100);
		panel_51.add(panel_56);

		txtPdr97116Wed = new JxTextArea();
		txtPdr97116Wed.setNotes(defaultNoteWed3);
		txtPdr97116Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Wed.setWrapStyleWord(true);
		// txtPdr97116Wed.setLineWrap(true);
		txtPdr97116Wed.setBounds(3, 3, 168, 94);
		txtPdr97116Wed.setEditable(false);
		txtPdr97116Wed.setBackground(Color.WHITE);
		panel_56.add(txtPdr97116Wed);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 319, 175, 130);
		panel_51.add(panel_57);

		txtPdr97530Wed = new JxTextArea();
		txtPdr97530Wed.setNotes(defaultNoteWed4);
		txtPdr97530Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Wed.setWrapStyleWord(true);
		// txtPdr97530Wed.setLineWrap(true);
		txtPdr97530Wed.setBounds(3, 3, 168, 125);
		txtPdr97530Wed.setEditable(false);
		txtPdr97530Wed.setBackground(Color.WHITE);
		panel_57.add(txtPdr97530Wed);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 448, 175, 51);
		panel_51.add(panel_58);

		txtOther01Wed = new JxTextArea();
		txtOther01Wed.setNotes(defaultNoteWed5);
		txtOther01Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Wed.setWrapStyleWord(true);
		// txtOther01Wed.setLineWrap(true);
		txtOther01Wed.setBounds(3, 3, 168, 45);
		txtOther01Wed.setEditable(false);
		txtOther01Wed.setBackground(Color.WHITE);
		panel_58.add(txtOther01Wed);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(0, 498, 175, 51);
		panel_51.add(panel_59);

		txtOther02Wed = new JxTextArea();
		txtOther02Wed.setNotes(defaultNoteWed6);
		txtOther02Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Wed.setWrapStyleWord(true);
		// txtOther02Wed.setLineWrap(true);
		txtOther02Wed.setBounds(3, 3, 168, 45);
		txtOther02Wed.setEditable(false);
		txtOther02Wed.setBackground(Color.WHITE);
		panel_59.add(txtOther02Wed);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 548, 175, 130);
		panel_51.add(panel_60);

		txtIncidentsWed = new JxTextArea();
		txtIncidentsWed.setNotes(defaultNoteWed7);
		txtIncidentsWed.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsWed.setWrapStyleWord(true);
		// txtIncidentsWed.setLineWrap(true);
		txtIncidentsWed.setBounds(3, 3, 168, 125);
		txtIncidentsWed.setEditable(false);
		txtIncidentsWed.setBackground(Color.WHITE);
		panel_60.add(txtIncidentsWed);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(0, 677, 175, 28);
		panel_51.add(panel_61);

		txtTotalMinWed = new JTextArea();
		txtTotalMinWed.setWrapStyleWord(true);
		txtTotalMinWed.setLineWrap(true);
		txtTotalMinWed.setBounds(3, 3, 169, 22);
		panel_61.add(txtTotalMinWed);

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
		panel_63.setBounds(805, 0, 175, 732);
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

		cbEvalThu = new JCheckBox();
		cbEvalThu.setBackground(Color.WHITE);
		cbEvalThu.setText("");
		cbEvalThu.setEnabled(false);
		cbEvalThu.setBounds(64, 10, 101, 12);
		panel_65.add(cbEvalThu);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 54, 175, 84);
		panel_63.add(panel_66);

		txtPdr97110Thursday = new JxTextArea();
		txtPdr97110Thursday.setNotes(defaultNoteThur1);
		txtPdr97110Thursday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Thursday.setWrapStyleWord(true);
		// txtPdr97110Thursday.setLineWrap(true);
		txtPdr97110Thursday.setBounds(3, 3, 168, 78);
		txtPdr97110Thursday.setEditable(false);
		txtPdr97110Thursday.setBackground(Color.WHITE);
		panel_66.add(txtPdr97110Thursday);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 137, 175, 84);
		panel_63.add(panel_67);

		txtPdr97112Thu = new JxTextArea();
		txtPdr97112Thu.setNotes(defaultNoteThur2);
		txtPdr97112Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Thu.setWrapStyleWord(true);
		// txtPdr97112Thu.setLineWrap(true);
		txtPdr97112Thu.setBounds(3, 3, 168, 78);
		txtPdr97112Thu.setEditable(false);
		txtPdr97112Thu.setBackground(Color.WHITE);
		panel_67.add(txtPdr97112Thu);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 220, 175, 100);
		panel_63.add(panel_68);

		txtPdr97116Thu = new JxTextArea();
		txtPdr97116Thu.setNotes(defaultNoteThur3);
		txtPdr97116Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Thu.setWrapStyleWord(true);
		// txtPdr97116Thu.setLineWrap(true);
		txtPdr97116Thu.setBounds(3, 3, 168, 94);
		txtPdr97116Thu.setEditable(false);
		txtPdr97116Thu.setBackground(Color.WHITE);
		panel_68.add(txtPdr97116Thu);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 319, 175, 130);
		panel_63.add(panel_69);

		txtPdr97530Thu = new JxTextArea();
		txtPdr97530Thu.setNotes(defaultNoteThur4);
		txtPdr97530Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Thu.setWrapStyleWord(true);
		// txtPdr97530Thu.setLineWrap(true);
		txtPdr97530Thu.setBounds(3, 3, 168, 125);
		txtPdr97530Thu.setEditable(false);
		txtPdr97530Thu.setBackground(Color.WHITE);
		panel_69.add(txtPdr97530Thu);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(0, 448, 175, 51);
		panel_63.add(panel_70);

		txtOther01Thu = new JxTextArea();
		txtOther01Thu.setNotes(defaultNoteThur5);
		txtOther01Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Thu.setWrapStyleWord(true);
		// txtOther01Thu.setLineWrap(true);
		txtOther01Thu.setBounds(3, 3, 168, 45);
		txtOther01Thu.setEditable(false);
		txtOther01Thu.setBackground(Color.WHITE);
		panel_70.add(txtOther01Thu);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(0, 498, 175, 51);
		panel_63.add(panel_71);

		txtOther02Thu = new JxTextArea();
		txtOther02Thu.setNotes(defaultNoteThur6);
		txtOther02Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Thu.setWrapStyleWord(true);
		// txtOther02Thu.setLineWrap(true);
		txtOther02Thu.setBounds(3, 3, 168, 45);
		txtOther02Thu.setEditable(false);
		txtOther02Thu.setBackground(Color.WHITE);
		panel_71.add(txtOther02Thu);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(0, 548, 175, 130);
		panel_63.add(panel_72);

		txtIncidentsThu = new JxTextArea();
		txtIncidentsThu.setNotes(defaultNoteThur7);
		txtIncidentsThu.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsThu.setWrapStyleWord(true);
		// txtIncidentsThu.setLineWrap(true);
		txtIncidentsThu.setBounds(3, 3, 168, 125);
		txtIncidentsThu.setEditable(false);
		txtIncidentsThu.setBackground(Color.WHITE);
		panel_72.add(txtIncidentsThu);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(0, 677, 175, 28);
		panel_63.add(panel_73);

		txtTotalMinThu = new JTextArea();
		txtTotalMinThu.setWrapStyleWord(true);
		txtTotalMinThu.setLineWrap(true);
		txtTotalMinThu.setBounds(3, 3, 169, 22);
		panel_73.add(txtTotalMinThu);

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
		panel_75.setBounds(979, 0, 175, 732);
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

		cbEvalFri = new JCheckBox();
		cbEvalFri.setBackground(Color.WHITE);
		cbEvalFri.setText("");
		cbEvalFri.setEnabled(false);
		cbEvalFri.setBounds(64, 10, 101, 12);
		panel_77.add(cbEvalFri);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(0, 54, 175, 84);
		panel_75.add(panel_78);

		txtPdr97110Friday = new JxTextArea();
		txtPdr97110Friday.setNotes(defaultNoteFri1);
		txtPdr97110Friday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Friday.setWrapStyleWord(true);
		// txtPdr97110Friday.setLineWrap(true);
		txtPdr97110Friday.setBounds(3, 3, 168, 78);
		txtPdr97110Friday.setEditable(false);
		txtPdr97110Friday.setBackground(Color.WHITE);
		panel_78.add(txtPdr97110Friday);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(Color.black, 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 137, 175, 84);
		panel_75.add(panel_79);

		txtPdr97112Fri = new JxTextArea();
		txtPdr97112Fri.setNotes(defaultNoteFri2);

		txtPdr97112Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Fri.setWrapStyleWord(true);
		// txtPdr97112Fri.setLineWrap(true);
		txtPdr97112Fri.setBounds(3, 3, 168, 78);
		txtPdr97112Fri.setEditable(false);
		txtPdr97112Fri.setBackground(Color.WHITE);
		panel_79.add(txtPdr97112Fri);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(0, 220, 175, 100);
		panel_75.add(panel_80);

		txtPdr97116Fri = new JxTextArea();
		txtPdr97116Fri.setNotes(defaultNoteFri3);
		txtPdr97116Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Fri.setWrapStyleWord(true);
		// txtPdr97116Fri.setLineWrap(true);
		txtPdr97116Fri.setBounds(3, 3, 168, 94);
		txtPdr97116Fri.setEditable(false);
		txtPdr97116Fri.setBackground(Color.WHITE);
		panel_80.add(txtPdr97116Fri);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(0, 319, 175, 130);
		panel_75.add(panel_81);

		txtPdr97530Fri = new JxTextArea();
		txtPdr97530Fri.setNotes(defaultNoteFri4);
		txtPdr97530Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Fri.setWrapStyleWord(true);
		// txtPdr97530Fri.setLineWrap(true);
		txtPdr97530Fri.setBounds(3, 3, 168, 125);
		txtPdr97530Fri.setEditable(false);
		txtPdr97530Fri.setBackground(Color.WHITE);
		panel_81.add(txtPdr97530Fri);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 448, 175, 51);
		panel_75.add(panel_82);

		txtOther01Fri = new JxTextArea();
		txtOther01Fri.setNotes(defaultNoteFri5);
		txtOther01Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Fri.setWrapStyleWord(true);
		// txtOther01Fri.setLineWrap(true);
		txtOther01Fri.setBounds(3, 3, 168, 45);
		txtOther01Fri.setEditable(false);
		txtOther01Fri.setBackground(Color.WHITE);
		panel_82.add(txtOther01Fri);

		panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(Color.black, 1, false));
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 498, 175, 51);
		panel_75.add(panel_83);

		txtOther02Fri = new JxTextArea();
		txtOther02Fri.setNotes(defaultNoteFri6);
		txtOther02Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Fri.setWrapStyleWord(true);
		// txtOther02Fri.setLineWrap(true);
		txtOther02Fri.setBounds(3, 3, 168, 45);
		txtOther02Fri.setEditable(false);
		txtOther02Fri.setBackground(Color.WHITE);
		panel_83.add(txtOther02Fri);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 548, 175, 130);
		panel_75.add(panel_84);

		txtIncidentsFri = new JxTextArea();
		txtIncidentsFri.setNotes(defaultNoteFri7);
		txtIncidentsFri.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsFri.setWrapStyleWord(true);
		// txtIncidentsFri.setLineWrap(true);
		txtIncidentsFri.setBounds(3, 3, 168, 125);
		txtIncidentsFri.setEditable(false);
		txtIncidentsFri.setBackground(Color.WHITE);
		panel_84.add(txtIncidentsFri);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 677, 175, 28);
		panel_75.add(panel_85);

		txtTotalMinFri = new JTextArea();
		txtTotalMinFri.setWrapStyleWord(true);
		txtTotalMinFri.setLineWrap(true);
		txtTotalMinFri.setBounds(3, 3, 169, 22);
		panel_85.add(txtTotalMinFri);

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
		panel_87.setBounds(1153, 0, 175, 732);
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

		cbEvalSat = new JCheckBox();
		cbEvalSat.setBackground(Color.WHITE);
		cbEvalSat.setText("");
		cbEvalSat.setEnabled(false);
		cbEvalSat.setBounds(64, 10, 74, 12);
		panel_89.add(cbEvalSat);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(Color.black, 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(0, 54, 175, 84);
		panel_87.add(panel_90);

		txtPdr97110Saturday = new JxTextArea();
		txtPdr97110Saturday.setNotes(defaultNoteSat1);
		txtPdr97110Saturday.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97110Saturday.setWrapStyleWord(true);
		// txtPdr97110Saturday.setLineWrap(true);
		txtPdr97110Saturday.setBounds(3, 3, 168, 78);
		txtPdr97110Saturday.setEditable(false);
		txtPdr97110Saturday.setBackground(Color.WHITE);
		panel_90.add(txtPdr97110Saturday);

		panel_91 = new JPanel();
		panel_91.setBorder(new LineBorder(Color.black, 1, false));
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 137, 175, 84);
		panel_87.add(panel_91);

		txtPdr97112Sat = new JxTextArea();
		txtPdr97112Sat.setNotes(defaultNoteSat2);
		txtPdr97112Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97112Sat.setWrapStyleWord(true);
		// txtPdr97112Sat.setLineWrap(true);
		txtPdr97112Sat.setBounds(3, 3, 168, 78);
		txtPdr97112Sat.setEditable(false);
		txtPdr97112Sat.setBackground(Color.WHITE);
		panel_91.add(txtPdr97112Sat);

		panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(0, 220, 175, 100);
		panel_87.add(panel_92);

		txtPdr97116Sat = new JxTextArea();
		txtPdr97116Sat.setNotes(defaultNoteSat3);
		txtPdr97116Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97116Sat.setWrapStyleWord(true);
		// txtPdr97116Sat.setLineWrap(true);
		txtPdr97116Sat.setBounds(3, 3, 168, 94);
		txtPdr97116Sat.setEditable(false);
		txtPdr97116Sat.setBackground(Color.WHITE);
		panel_92.add(txtPdr97116Sat);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 319, 175, 130);
		panel_87.add(panel_93);

		txtPdr97530Sat = new JxTextArea();
		txtPdr97530Sat.setNotes(defaultNoteSat4);
		txtPdr97530Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtPdr97530Sat.setWrapStyleWord(true);
		// txtPdr97530Sat.setLineWrap(true);
		txtPdr97530Sat.setBounds(3, 3, 168, 125);
		txtPdr97530Sat.setEditable(false);
		txtPdr97530Sat.setBackground(Color.WHITE);
		panel_93.add(txtPdr97530Sat);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 448, 175, 51);
		panel_87.add(panel_94);

		txtOther01Sat = new JxTextArea();
		txtOther01Sat.setNotes(defaultNoteSat5);
		txtOther01Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Sat.setWrapStyleWord(true);
		// txtOther01Sat.setLineWrap(true);
		txtOther01Sat.setBounds(3, 3, 168, 45);
		txtOther01Sat.setEditable(false);
		txtOther01Sat.setBackground(Color.WHITE);
		panel_94.add(txtOther01Sat);

		panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(Color.black, 1, false));
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 498, 175, 51);
		panel_87.add(panel_95);

		txtOther02Sat = new JxTextArea();
		txtOther02Sat.setNotes(defaultNoteSat6);
		txtOther02Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther02Sat.setWrapStyleWord(true);
		// txtOther02Sat.setLineWrap(true);
		txtOther02Sat.setBounds(3, 3, 168, 45);
		txtOther02Sat.setEditable(false);
		txtOther02Sat.setBackground(Color.WHITE);
		panel_95.add(txtOther02Sat);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 548, 175, 130);
		panel_87.add(panel_96);

		txtIncidentsSat = new JxTextArea();
		txtIncidentsSat.setNotes(defaultNoteSat7);
		txtIncidentsSat.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsSat.setWrapStyleWord(true);
		// txtIncidentsSat.setLineWrap(true);
		txtIncidentsSat.setBounds(3, 3, 168, 125);
		txtIncidentsSat.setEditable(false);
		txtIncidentsSat.setBackground(Color.WHITE);
		panel_96.add(txtIncidentsSat);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(0, 677, 175, 28);
		panel_87.add(panel_97);

		txtTotalMinSat = new JTextArea();
		txtTotalMinSat.setWrapStyleWord(true);
		txtTotalMinSat.setLineWrap(true);
		txtTotalMinSat.setBounds(3, 3, 169, 22);
		panel_97.add(txtTotalMinSat);

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

		panel_17 = new JPanel();
		panel_17.setBounds(0, 905, 1327, 98);
		add(panel_17);
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);

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

		cbCoSignNa = new JCheckBox();
		cbCoSignNa.setBackground(Color.WHITE);
		cbCoSignNa.setFont(new Font("", Font.BOLD, 12));
		cbCoSignNa.setText("N/A");
		cbCoSignNa.setBounds(148, 69, 37, 18);
		panel_17.add(cbCoSignNa);

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
		panel_99.setBackground(Color.WHITE);
		panel_99.setLayout(null);
		panel_99.setBounds(0, 101, 1327, 65);
		add(panel_99);

		final JButton btnSun = new JButton();
		btnSun.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalSun.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Sunday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Sunday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Sun.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Sun.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Sun.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Sun.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Sun.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsSun.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Sunday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalSun.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Sunday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Sun.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Sun.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Sun.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Sun
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Sun
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsSun.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnSun.setBackground(Color.WHITE);
		btnSun.setForeground(Color.BLACK);
		btnSun.setText("Add");
		btnSun.setBounds(142, 35, 95, 24);
		panel_99.add(btnSun);

		final JButton btnMon = new JButton();
		btnMon.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalMon.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Monday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Monday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Mon.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Mon.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Mon.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Mon.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Mon.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsMon.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Monday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalMon.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Monday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Mon.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Mon.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Mon.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Mon
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Mon
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsMon.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnMon.setBackground(Color.WHITE);
		btnMon.setText("Add");
		btnMon.setBounds(317, 35, 95, 24);
		panel_99.add(btnMon);

		final JButton btnTue = new JButton();
		btnTue.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalTue.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Tuesday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Tuesday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Tue.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Tue.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Tue.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Tue.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Tue.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsTue.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Tuesday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalTue.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Tuesday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Tue.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Tue.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Tue.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Tue
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Tue
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsTue.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnTue.setBackground(Color.WHITE);
		btnTue.setText("Add");
		btnTue.setBounds(497, 35, 95, 24);
		panel_99.add(btnTue);

		final JButton btnWed = new JButton();
		btnWed.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalWed.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Wednesday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Wednesday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Wed.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Wed.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Wed.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Wed.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Wed.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsWed.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Wednesday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalWed.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Wednesday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Wed.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Wed.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Wed.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Wed
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Wed
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsWed.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnWed.setBackground(Color.WHITE);
		btnWed.setText("Add");
		btnWed.setBounds(674, 35, 95, 24);
		panel_99.add(btnWed);

		final JButton btnThu = new JButton();
		btnThu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalThu.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Thursday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Thursday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Thu.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Thu.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Thu.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Thu.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Thu.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsThu.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Thursday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalThu.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Thursday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Thu.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Thu.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Thu.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Thu
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Thu
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsThu.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnThu.setBackground(Color.WHITE);
		btnThu.setText("Add");
		btnThu.setBounds(846, 35, 95, 24);
		panel_99.add(btnThu);

		final JButton btnFri = new JButton();
		btnFri.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalFri.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Friday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Friday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Fri.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Fri.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Fri.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Fri.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Fri.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsFri.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Friday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalFri.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Friday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Fri.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Fri.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Fri.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Fri
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Fri
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsFri.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnFri.setBackground(Color.WHITE);
		btnFri.setText("Add");
		btnFri.setBounds(1010, 35, 95, 24);
		panel_99.add(btnFri);

		final JButton btnSat = new JButton();
		btnSat.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FramePhysicalDailyTextArea framePhysicalDailyTextArea = (FramePhysicalDailyTextArea) FrameFactory
						.createWindowOfType(FramePhysicalDailyTextArea.class);
				if (cbEvalSat.isSelected()) {
					framePhysicalDailyTextArea.setCbChecked(true);
				} else {
					framePhysicalDailyTextArea.setCbChecked(false);
				}
				if (txtPdr97110Saturday.getNotes() != null)
					framePhysicalDailyTextArea.setRow2(txtPdr97110Saturday
							.getNotes());
				framePhysicalDailyTextArea.setRow3(txtPdr97112Sat.getNotes());
				framePhysicalDailyTextArea.setRow4(txtPdr97116Sat.getNotes());
				framePhysicalDailyTextArea.setRow5(txtPdr97530Sat.getNotes());
				framePhysicalDailyTextArea.setRow6(txtOther01Sat.getNotes());
				framePhysicalDailyTextArea.setRow7(txtOther02Sat.getNotes());
				framePhysicalDailyTextArea.setRow8(txtIncidentsSat.getNotes());
				framePhysicalDailyTextArea.setVisible(true);
				framePhysicalDailyTextArea.setTitle("Saturday");
				if (framePhysicalDailyTextArea.isSaved()) {
					cbEvalSat.setSelected(framePhysicalDailyTextArea
							.isCbSelected());
					txtPdr97110Saturday.setNotes(framePhysicalDailyTextArea
							.getRow2());
					txtPdr97112Sat.setNotes(framePhysicalDailyTextArea
							.getRow3());
					txtPdr97116Sat.setNotes(framePhysicalDailyTextArea
							.getRow4());
					txtPdr97530Sat.setNotes(framePhysicalDailyTextArea
							.getRow5());
					txtOther01Sat
							.setNotes(framePhysicalDailyTextArea.getRow6());
					txtOther02Sat
							.setNotes(framePhysicalDailyTextArea.getRow7());
					txtIncidentsSat.setNotes(framePhysicalDailyTextArea
							.getRow8());
				}
			}
		});
		btnSat.setBackground(Color.WHITE);
		btnSat.setText("Add");
		btnSat.setBounds(1189, 35, 95, 24);
		panel_99.add(btnSat);

		final JButton previousWeekButton = new JButton();
		previousWeekButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				getCalendar();
				calendar.add(Calendar.DATE, -7);
				setCalendar(calendar);
				updateData();
			}
		});
		previousWeekButton.setBackground(Color.WHITE);
		previousWeekButton.setText("Previous Week");
		previousWeekButton.setBounds(527, 2, 148, 24);
		panel_99.add(previousWeekButton);

		final JButton nextWeekButton = new JButton();
		nextWeekButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				getCalendar();
				calendar.add(Calendar.DATE, 7);
				setCalendar(calendar);
				updateData();
			}
		});
		nextWeekButton.setBackground(Color.WHITE);
		nextWeekButton.setText("Next Week");
		nextWeekButton.setBounds(703, 2, 140, 24);
		panel_99.add(nextWeekButton);
		setCalendar(calendar.getInstance());
		fillcombos();
		updateDiagnosis();
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

	private void fillcombos() {
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
		try {
			key = MedrexClientManager.getInstance().getPhysicalDailyKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord = new PtOtStPhysicalDailyRecord();
		refPtOtStPhysicalDailyRecord.setResidentId(Global.currentResidenceKey);
		refPtOtStPhysicalDailyRecord.setSerial(key);
		refPtOtStPhysicalDailyRecord
				.setCoSignLicDate(dcCoSignLicDate.getDate());
		refPtOtStPhysicalDailyRecord.setLicenseNo03(txtLicenseNo03.getText());
		refPtOtStPhysicalDailyRecord.setSignature03((String) cmbSignature03
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord
				.setPrintTherapInitials03((String) cmbPrintTherapInitials03
						.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setLicenseNo02(txtLicenseNo02.getText());
		refPtOtStPhysicalDailyRecord.setSignature02((String) cmbSignature02
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord
				.setPrintTherapInitials02((String) cmbPrintTherapInitials02
						.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setCoSignLic(txtCoSignLic.getText());
		refPtOtStPhysicalDailyRecord.setLicenseNo01(txtLicenseNo01.getText());
		refPtOtStPhysicalDailyRecord.setSignature01((String) cmbSignature01
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord
				.setPrintTherapInitials01((String) cmbPrintTherapInitials01
						.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setCoSignNa(cbCoSignNa.isSelected());
		refPtOtStPhysicalDailyRecord.setInitialsSat((String) cmbInitialsSat
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinSat(txtTotalMinSat.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsSat(txtIncidentsSat.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Sat(txtOther02Sat.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Sat(txtOther01Sat.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Sat(txtPdr97530Sat.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Sat(txtPdr97116Sat.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Sat(txtPdr97112Sat.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Saturday(txtPdr97110Saturday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateSaturday(dcDateSaturday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsFri((String) cmbInitialsFri
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinFri(txtTotalMinFri.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsFri(txtIncidentsFri.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Fri(txtOther02Fri.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Fri(txtOther01Fri.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Fri(txtPdr97530Fri.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Fri(txtPdr97116Fri.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Fri(txtPdr97112Fri.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Friday(txtPdr97110Friday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateFriday(dcDateFriday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsThu((String) cmbInitialsThu
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinThu(txtTotalMinThu.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsThu(txtIncidentsThu.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Thu(txtOther02Thu.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Thu(txtOther01Thu.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Thu(txtPdr97530Thu.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Thu(txtPdr97116Thu.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Thu(txtPdr97112Thu.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Thursday(txtPdr97110Thursday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateThursday(dcDateThursday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsWed((String) cmbInitialsWed
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinWed(txtTotalMinWed.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsWed(txtIncidentsWed.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Wed(txtOther02Wed.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Wed(txtOther01Wed.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Wed(txtPdr97530Wed.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Wed(txtPdr97116Wed.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Wed(txtPdr97112Wed.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Wednesday(txtPdr97110Wednesday
				.getNotes());
		refPtOtStPhysicalDailyRecord
				.setDateWednesday(dcDateWednesday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsTue((String) cmbInitialsTue
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinTue(txtTotalMinTue.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsTue(txtIncidentsTue.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Tue(txtOther02Tue.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Tue(txtOther01Tue.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Tue(txtPdr97530Tue.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Tue(txtPdr97116Tue.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Tue(txtPdr97112Tue.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Tuesday(txtPdr97110Tuesday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateTuesday(dcDateTuesday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsMon((String) cmbInitialsMon
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinMon(txtTotalMinMon.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsMon(txtIncidentsMon.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Mon(txtOther02Mon.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Mon(txtOther01Mon.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Mon(txtPdr97530Mon.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Mon(txtPdr97116Mon.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Mon(txtPdr97112Mon.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Monday(txtPdr97110Monday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateMonday(dcDateMonday.getDate());
		refPtOtStPhysicalDailyRecord.setInitialsSun((String) cmbInitialsSun
				.getSelectedItem());
		refPtOtStPhysicalDailyRecord.setTotalMinSun(txtTotalMinSun.getText());
		refPtOtStPhysicalDailyRecord
				.setIncidentsSun(txtIncidentsSun.getNotes());
		refPtOtStPhysicalDailyRecord.setOther02Sun(txtOther02Sun.getNotes());
		refPtOtStPhysicalDailyRecord.setOther01Sun(txtOther01Sun.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97530Sun(txtPdr97530Sun.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97116Sun(txtPdr97116Sun.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97112Sun(txtPdr97112Sun.getNotes());
		refPtOtStPhysicalDailyRecord.setPdr97110Sunday(txtPdr97110Sunday
				.getNotes());
		refPtOtStPhysicalDailyRecord.setDateSunday(dcDateSunday.getDate());
		refPtOtStPhysicalDailyRecord.setOtherRowField02(txtOtherRowField02
				.getText());
		refPtOtStPhysicalDailyRecord.setOtherRowField01(txtOtherRowField01
				.getText());
		refPtOtStPhysicalDailyRecord.setPrecautions(txtPrecautions.getText());
		refPtOtStPhysicalDailyRecord.setDx(txtDx.getText());
		refPtOtStPhysicalDailyRecord.setOtherField(txtOtherField.getText());
		refPtOtStPhysicalDailyRecord.setOther(cbOther.isSelected());
		refPtOtStPhysicalDailyRecord.setHmo(cbHmo.isSelected());
		refPtOtStPhysicalDailyRecord.setMedB(cbMedB.isSelected());
		refPtOtStPhysicalDailyRecord.setMedA(cbMedA.isSelected());
		refPtOtStPhysicalDailyRecord.setHicNo(txtHicNo.getText());
		refPtOtStPhysicalDailyRecord.setPdr97001Sunday(cbEvalSun.isSelected());
		refPtOtStPhysicalDailyRecord.setPdr97001Monday(cbEvalMon.isSelected());
		refPtOtStPhysicalDailyRecord.setPdr97001Tuesday(cbEvalTue.isSelected());
		refPtOtStPhysicalDailyRecord.setPdr97001Wednesday(cbEvalWed
				.isSelected());
		refPtOtStPhysicalDailyRecord
				.setPdr97001Thursday(cbEvalThu.isSelected());
		refPtOtStPhysicalDailyRecord.setPdr97001Friday(cbEvalFri.isSelected());
		refPtOtStPhysicalDailyRecord.setPdr97001Satuday(cbEvalSat.isSelected());
		try {
			Global.currentPtOtStPhysicalDailyRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStPhysicalDailyRecord(
							refPtOtStPhysicalDailyRecord);
		} catch (Exception e) {
		}
	}

	public void updateData() {

		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			System.out.println("name is :" + rm.getUserName() + " "
					+ rm.getUserPass());
			// System.out.println("room is :" + rm.getRoom());
			System.out.println("medi is :" + rm.getMedicareNum());
			txt$PatientName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txt$RoomNo.setText(rm.getRoom());
			txtHicNo.setText(rm.getMedicalRecordNum());
		} catch (Exception e) {

		}
		try {
			key = MedrexClientManager.getInstance().getPhysicalDailyKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord = null;

		if (key != 0) {
			try {
				refPtOtStPhysicalDailyRecord = MedrexClientManager
						.getInstance().getPtOtStPhysicalDailyRecord(key);
			} catch (Exception e) {

			}
			dcCoSignLicDate.setDate(refPtOtStPhysicalDailyRecord
					.getCoSignLicDate());
			txtLicenseNo03.setText(refPtOtStPhysicalDailyRecord
					.getLicenseNo03());
			cmbSignature03.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getSignature03());
			cmbPrintTherapInitials03
					.setSelectedItem(refPtOtStPhysicalDailyRecord
							.getPrintTherapInitials03());
			txtLicenseNo02.setText(refPtOtStPhysicalDailyRecord
					.getLicenseNo02());
			cmbSignature02.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getSignature02());
			cmbPrintTherapInitials02
					.setSelectedItem(refPtOtStPhysicalDailyRecord
							.getPrintTherapInitials02());
			txtCoSignLic.setText(refPtOtStPhysicalDailyRecord.getCoSignLic());
			txtLicenseNo01.setText(refPtOtStPhysicalDailyRecord
					.getLicenseNo01());
			cmbSignature01.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getSignature01());
			cmbPrintTherapInitials01
					.setSelectedItem(refPtOtStPhysicalDailyRecord
							.getPrintTherapInitials01());
			cbCoSignNa.setSelected(refPtOtStPhysicalDailyRecord.isCoSignNa());
			cmbInitialsSat.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsSat());
			txtTotalMinSat.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinSat());
			txtIncidentsSat.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsSat());
			txtOther02Sat
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Sat());
			txtOther01Sat
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Sat());
			txtPdr97530Sat.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Sat());
			txtPdr97116Sat.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Sat());
			txtPdr97112Sat.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Sat());
			txtPdr97110Saturday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Saturday());
			dcDateSaturday.setDate(refPtOtStPhysicalDailyRecord
					.getDateSaturday());
			cmbInitialsFri.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsFri());
			txtTotalMinFri.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinFri());
			txtIncidentsFri.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsFri());
			txtOther02Fri
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Fri());
			txtOther01Fri
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Fri());
			txtPdr97530Fri.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Fri());
			txtPdr97116Fri.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Fri());
			txtPdr97112Fri.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Fri());
			txtPdr97110Friday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Friday());
			dcDateFriday.setDate(refPtOtStPhysicalDailyRecord.getDateFriday());
			cmbInitialsThu.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsThu());
			txtTotalMinThu.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinThu());
			txtIncidentsThu.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsThu());
			txtOther02Thu
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Thu());
			txtOther01Thu
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Thu());
			txtPdr97530Thu.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Thu());
			txtPdr97116Thu.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Thu());
			txtPdr97112Thu.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Thu());
			txtPdr97110Thursday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Thursday());
			dcDateThursday.setDate(refPtOtStPhysicalDailyRecord
					.getDateThursday());
			cmbInitialsWed.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsWed());
			txtTotalMinWed.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinWed());
			txtIncidentsWed.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsWed());
			txtOther02Wed
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Wed());
			txtOther01Wed
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Wed());
			txtPdr97530Wed.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Wed());
			txtPdr97116Wed.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Wed());
			txtPdr97112Wed.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Wed());
			txtPdr97110Wednesday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Wednesday());
			dcDateWednesday.setDate(refPtOtStPhysicalDailyRecord
					.getDateWednesday());
			cmbInitialsTue.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsTue());
			txtTotalMinTue.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinTue());
			txtIncidentsTue.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsTue());
			txtOther02Tue
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Tue());
			txtOther01Tue
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Tue());
			txtPdr97530Tue.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Tue());
			txtPdr97116Tue.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Tue());
			txtPdr97112Tue.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Tue());
			txtPdr97110Tuesday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Tuesday());
			dcDateTuesday
					.setDate(refPtOtStPhysicalDailyRecord.getDateTuesday());
			cmbInitialsMon.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsMon());
			txtTotalMinMon.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinMon());
			txtIncidentsMon.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsMon());
			txtOther02Mon
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Mon());
			txtOther01Mon
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Mon());
			txtPdr97530Mon.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Mon());
			txtPdr97116Mon.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Mon());
			txtPdr97112Mon.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Mon());
			txtPdr97110Monday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Monday());
			dcDateMonday.setDate(refPtOtStPhysicalDailyRecord.getDateMonday());
			cmbInitialsSun.setSelectedItem(refPtOtStPhysicalDailyRecord
					.getInitialsSun());
			txtTotalMinSun.setText(refPtOtStPhysicalDailyRecord
					.getTotalMinSun());
			txtIncidentsSun.setNotes(refPtOtStPhysicalDailyRecord
					.getIncidentsSun());
			txtOther02Sun
					.setNotes(refPtOtStPhysicalDailyRecord.getOther02Sun());
			txtOther01Sun
					.setNotes(refPtOtStPhysicalDailyRecord.getOther01Sun());
			txtPdr97530Sun.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97530Sun());
			txtPdr97116Sun.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97116Sun());
			txtPdr97112Sun.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97112Sun());
			txtPdr97110Sunday.setNotes(refPtOtStPhysicalDailyRecord
					.getPdr97110Sunday());
			dcDateSunday.setDate(refPtOtStPhysicalDailyRecord.getDateSunday());
			txtOtherRowField02.setText(refPtOtStPhysicalDailyRecord
					.getOtherRowField02());
			txtOtherRowField01.setText(refPtOtStPhysicalDailyRecord
					.getOtherRowField01());
			txtPrecautions.setText(refPtOtStPhysicalDailyRecord
					.getPrecautions());
			txtDx.setText(refPtOtStPhysicalDailyRecord.getDx());
			txtOtherField.setText(refPtOtStPhysicalDailyRecord.getOtherField());
			cbOther.setSelected(refPtOtStPhysicalDailyRecord.isOther());
			cbHmo.setSelected(refPtOtStPhysicalDailyRecord.isHmo());
			cbMedB.setSelected(refPtOtStPhysicalDailyRecord.isMedB());
			cbMedA.setSelected(refPtOtStPhysicalDailyRecord.isMedA());
			txtHicNo.setText(refPtOtStPhysicalDailyRecord.getHicNo());
			cbEvalSun.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Sunday());
			cbEvalMon.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Monday());
			cbEvalTue.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Tuesday());
			cbEvalWed.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Wednesday());
			cbEvalThu.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Thursday());
			cbEvalFri.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Friday());
			cbEvalSat.setSelected(refPtOtStPhysicalDailyRecord
					.isPdr97001Satuday());
		} else {
			setDefaultNotes();
			cbEvalSun.setSelected(false);
			txtPdr97110Sunday.setNotes(defaultNoteSun1);
			txtPdr97112Sun.setNotes(defaultNoteSun2);
			txtPdr97116Sun.setNotes(defaultNoteSun3);
			txtPdr97530Sun.setNotes(defaultNoteSun4);
			txtOther01Sun.setNotes(defaultNoteSun5);
			txtOther02Sun.setNotes(defaultNoteSun6);
			txtIncidentsSun.setNotes(defaultNoteSun7);

			cbEvalMon.setSelected(false);
			txtPdr97110Monday.setNotes(defaultNoteMon1);
			txtPdr97112Mon.setNotes(defaultNoteMon2);
			txtPdr97116Mon.setNotes(defaultNoteMon3);
			txtPdr97530Mon.setNotes(defaultNoteMon4);
			txtOther01Mon.setNotes(defaultNoteMon5);
			txtOther02Mon.setNotes(defaultNoteMon6);
			txtIncidentsMon.setNotes(defaultNoteMon7);

			cbEvalTue.setSelected(false);
			txtPdr97110Tuesday.setNotes(defaultNoteTue1);
			txtPdr97112Tue.setNotes(defaultNoteTue2);
			txtPdr97116Tue.setNotes(defaultNoteTue3);
			txtPdr97530Tue.setNotes(defaultNoteTue4);
			txtOther01Tue.setNotes(defaultNoteTue5);
			txtOther02Tue.setNotes(defaultNoteTue6);
			txtIncidentsTue.setNotes(defaultNoteTue7);

			cbEvalWed.setSelected(false);
			txtPdr97110Wednesday.setNotes(defaultNoteWed1);
			txtPdr97112Wed.setNotes(defaultNoteWed2);
			txtPdr97116Wed.setNotes(defaultNoteWed3);
			txtPdr97530Wed.setNotes(defaultNoteWed4);
			txtOther01Wed.setNotes(defaultNoteWed5);
			txtOther02Wed.setNotes(defaultNoteWed6);
			txtIncidentsWed.setNotes(defaultNoteWed7);

			cbEvalThu.setSelected(false);
			txtPdr97110Thursday.setNotes(defaultNoteThur1);
			txtPdr97112Thu.setNotes(defaultNoteThur2);
			txtPdr97116Thu.setNotes(defaultNoteThur3);
			txtPdr97530Thu.setNotes(defaultNoteThur4);
			txtOther01Thu.setNotes(defaultNoteThur5);
			txtOther02Thu.setNotes(defaultNoteThur6);
			txtIncidentsThu.setNotes(defaultNoteThur7);

			cbEvalFri.setSelected(false);
			txtPdr97110Friday.setNotes(defaultNoteFri1);
			txtPdr97112Fri.setNotes(defaultNoteFri2);
			txtPdr97116Fri.setNotes(defaultNoteFri3);
			txtPdr97530Fri.setNotes(defaultNoteFri4);
			txtOther01Fri.setNotes(defaultNoteFri5);
			txtOther02Fri.setNotes(defaultNoteFri6);
			txtIncidentsFri.setNotes(defaultNoteFri7);

			cbEvalSat.setSelected(false);
			txtPdr97110Saturday.setNotes(defaultNoteSat1);
			txtPdr97112Sat.setNotes(defaultNoteSat2);
			txtPdr97116Sat.setNotes(defaultNoteSat3);
			txtPdr97530Sat.setNotes(defaultNoteSat4);
			txtOther01Sat.setNotes(defaultNoteSat5);
			txtOther02Sat.setNotes(defaultNoteSat6);
			txtIncidentsSat.setNotes(defaultNoteSat7);
		}
		updateUI();
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

	public void setDefaultNotes() {
		defaultNoteSun1 = new Notes();
		defaultNoteSun1.setFormName("Physical Daily Record");
		defaultNoteSun1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun1.setNoteText("");

		defaultNoteSun2 = new Notes();
		defaultNoteSun2.setFormName("Physical Daily Record");
		defaultNoteSun2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun2.setNoteText("");

		defaultNoteSun3 = new Notes();
		defaultNoteSun3.setFormName("Physical Daily Record");
		defaultNoteSun3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun3.setNoteText("");

		defaultNoteSun4 = new Notes();
		defaultNoteSun4.setFormName("Physical Daily Record");
		defaultNoteSun4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun4.setNoteText("");

		defaultNoteSun5 = new Notes();
		defaultNoteSun5.setFormName("Physical Daily Record");
		defaultNoteSun5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun5.setNoteText("");

		defaultNoteSun6 = new Notes();
		defaultNoteSun6.setFormName("Physical Daily Record");
		defaultNoteSun6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun6.setNoteText("");

		defaultNoteSun7 = new Notes();
		defaultNoteSun7.setFormName("Physical Daily Record");
		defaultNoteSun7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun7.setNoteText("");

		defaultNoteSun8 = new Notes();
		defaultNoteSun8.setFormName("Physical Daily Record");
		defaultNoteSun8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun8.setNoteText("");

		defaultNoteMon1 = new Notes();
		defaultNoteMon1.setFormName("Physical Daily Record");
		defaultNoteMon1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon1.setNoteText("");

		defaultNoteMon2 = new Notes();
		defaultNoteMon2.setFormName("Physical Daily Record");
		defaultNoteMon2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon2.setNoteText("");

		defaultNoteMon3 = new Notes();
		defaultNoteMon3.setFormName("Physical Daily Record");
		defaultNoteMon3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon3.setNoteText("");

		defaultNoteMon4 = new Notes();
		defaultNoteMon4.setFormName("Physical Daily Record");
		defaultNoteMon4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon4.setNoteText("");

		defaultNoteMon5 = new Notes();
		defaultNoteMon5.setFormName("Physical Daily Record");
		defaultNoteMon5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon5.setNoteText("");

		defaultNoteMon6 = new Notes();
		defaultNoteMon6.setFormName("Physical Daily Record");
		defaultNoteMon6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon6.setNoteText("");

		defaultNoteMon7 = new Notes();
		defaultNoteMon7.setFormName("Physical Daily Record");
		defaultNoteMon7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon7.setNoteText("");

		defaultNoteMon8 = new Notes();
		defaultNoteMon8.setFormName("Physical Daily Record");
		defaultNoteMon8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon8.setNoteText("");

		defaultNoteTue1 = new Notes();
		defaultNoteTue1.setFormName("Physical Daily Record");
		defaultNoteTue1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue1.setNoteText("");

		defaultNoteTue2 = new Notes();
		defaultNoteTue2.setFormName("Physical Daily Record");
		defaultNoteTue2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue2.setNoteText("");

		defaultNoteTue3 = new Notes();
		defaultNoteTue3.setFormName("Physical Daily Record");
		defaultNoteTue3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue3.setNoteText("");

		defaultNoteTue4 = new Notes();
		defaultNoteTue4.setFormName("Physical Daily Record");
		defaultNoteTue4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue4.setNoteText("");

		defaultNoteTue5 = new Notes();
		defaultNoteTue5.setFormName("Physical Daily Record");
		defaultNoteTue5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue5.setNoteText("");

		defaultNoteTue6 = new Notes();
		defaultNoteTue6.setFormName("Physical Daily Record");
		defaultNoteTue6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue6.setNoteText("");

		defaultNoteTue7 = new Notes();
		defaultNoteTue7.setFormName("Physical Daily Record");
		defaultNoteTue7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue7.setNoteText("");

		defaultNoteTue8 = new Notes();
		defaultNoteTue8.setFormName("Physical Daily Record");
		defaultNoteTue8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue8.setNoteText("");

		defaultNoteWed1 = new Notes();
		defaultNoteWed1.setFormName("Physical Daily Record");
		defaultNoteWed1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed1.setNoteText("");

		defaultNoteWed2 = new Notes();
		defaultNoteWed2.setFormName("Physical Daily Record");
		defaultNoteWed2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed2.setNoteText("");

		defaultNoteWed3 = new Notes();
		defaultNoteWed3.setFormName("Physical Daily Record");
		defaultNoteWed3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed3.setNoteText("");

		defaultNoteWed4 = new Notes();
		defaultNoteWed4.setFormName("Physical Daily Record");
		defaultNoteWed4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed4.setNoteText("");

		defaultNoteWed5 = new Notes();
		defaultNoteWed5.setFormName("Physical Daily Record");
		defaultNoteWed5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed5.setNoteText("");

		defaultNoteWed6 = new Notes();
		defaultNoteWed6.setFormName("Physical Daily Record");
		defaultNoteWed6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed6.setNoteText("");

		defaultNoteWed7 = new Notes();
		defaultNoteWed7.setFormName("Physical Daily Record");
		defaultNoteWed7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed7.setNoteText("");

		defaultNoteWed8 = new Notes();
		defaultNoteWed8.setFormName("Physical Daily Record");
		defaultNoteWed8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed8.setNoteText("");

		defaultNoteThur1 = new Notes();
		defaultNoteThur1.setFormName("Physical Daily Record");
		defaultNoteThur1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur1.setNoteText("");

		defaultNoteThur2 = new Notes();
		defaultNoteThur2.setFormName("Physical Daily Record");
		defaultNoteThur2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur2.setNoteText("");

		defaultNoteThur3 = new Notes();
		defaultNoteThur3.setFormName("Physical Daily Record");
		defaultNoteThur3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur3.setNoteText("");

		defaultNoteThur4 = new Notes();
		defaultNoteThur4.setFormName("Physical Daily Record");
		defaultNoteThur4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur4.setNoteText("");

		defaultNoteThur5 = new Notes();
		defaultNoteThur5.setFormName("Physical Daily Record");
		defaultNoteThur5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur5.setNoteText("");

		defaultNoteThur6 = new Notes();
		defaultNoteThur6.setFormName("Physical Daily Record");
		defaultNoteThur6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur6.setNoteText("");

		defaultNoteThur7 = new Notes();
		defaultNoteThur7.setFormName("Physical Daily Record");
		defaultNoteThur7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur7.setNoteText("");

		defaultNoteThur8 = new Notes();
		defaultNoteThur8.setFormName("Physical Daily Record");
		defaultNoteThur8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur8.setNoteText("");

		defaultNoteFri1 = new Notes();
		defaultNoteFri1.setFormName("Physical Daily Record");
		defaultNoteFri1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri1.setNoteText("");

		defaultNoteFri2 = new Notes();
		defaultNoteFri2.setFormName("Physical Daily Record");
		defaultNoteFri2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri2.setNoteText("");

		defaultNoteFri3 = new Notes();
		defaultNoteFri3.setFormName("Physical Daily Record");
		defaultNoteFri3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri3.setNoteText("");

		defaultNoteFri4 = new Notes();
		defaultNoteFri4.setFormName("Physical Daily Record");
		defaultNoteFri4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri4.setNoteText("");

		defaultNoteFri5 = new Notes();
		defaultNoteFri5.setFormName("Physical Daily Record");
		defaultNoteFri5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri5.setNoteText("");

		defaultNoteFri6 = new Notes();
		defaultNoteFri6.setFormName("Physical Daily Record");
		defaultNoteFri6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri6.setNoteText("");

		defaultNoteFri7 = new Notes();
		defaultNoteFri7.setFormName("Physical Daily Record");
		defaultNoteFri7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri7.setNoteText("");

		defaultNoteFri8 = new Notes();
		defaultNoteFri8.setFormName("Physical Daily Record");
		defaultNoteFri8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri8.setNoteText("");

		defaultNoteSat1 = new Notes();
		defaultNoteSat1.setFormName("Physical Daily Record");
		defaultNoteSat1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat1.setNoteText("");

		defaultNoteSat2 = new Notes();
		defaultNoteSat2.setFormName("Physical Daily Record");
		defaultNoteSat2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat2.setNoteText("");

		defaultNoteSat3 = new Notes();
		defaultNoteSat3.setFormName("Physical Daily Record");
		defaultNoteSat3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat3.setNoteText("");

		defaultNoteSat4 = new Notes();
		defaultNoteSat4.setFormName("Physical Daily Record");
		defaultNoteSat4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat4.setNoteText("");

		defaultNoteSat5 = new Notes();
		defaultNoteSat5.setFormName("Physical Daily Record");
		defaultNoteSat5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat5.setNoteText("");

		defaultNoteSat6 = new Notes();
		defaultNoteSat6.setFormName("Physical Daily Record");
		defaultNoteSat6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat6.setNoteText("");

		defaultNoteSat7 = new Notes();
		defaultNoteSat7.setFormName("Physical Daily Record");
		defaultNoteSat7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat7.setNoteText("");

		defaultNoteSat8 = new Notes();
		defaultNoteSat8.setFormName("Physical Daily Record");
		defaultNoteSat8.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat8.setNoteText("");
	}

}
