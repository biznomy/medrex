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
import medrex.commons.vo.ptOtSt.PtOtStSpeechDailyRecord;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxTextArea;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStSpeechDailyRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2674526012856673394L;
	private JCheckBox cbSwallowEvalSat;
	private JCheckBox cbSwallowEvalFri;
	private JCheckBox cbSwallowEvalThur;
	private JCheckBox cbSwallowEvalWed;
	private JCheckBox cbSwallowEvalTues;
	private JCheckBox cbSwallowEvalMon;
	private JCheckBox cbSwallowEvalSun;
	private JLabel therapyLabel_8;
	private JLabel therapyLabel_7;
	private JLabel therapyLabel_3;
	private JLabel label_4;
	private JLabel eval92610Label_3;
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
	private JxTextArea txtOther01Sat;
	private JPanel panel_94;
	private JxTextArea txtSdr92532Sat;
	private JPanel panel_93;
	private JxTextArea txtSdr92507Sat;
	private JPanel panel_92;
	private JxTextArea txtSdr92506Sat;
	private JPanel panel_91;
	private JxTextArea txtSdr92526Saturday;
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
	private JxTextArea txtOther01Fri;
	private JPanel panel_82;
	private JxTextArea txtSdr92532Fri;
	private JPanel panel_81;
	private JxTextArea txtSdr92507Fri;
	private JPanel panel_80;
	private JxTextArea txtSdr92506Fri;
	private JPanel panel_79;
	private JxTextArea txtSdr92526Friday;
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
	private JxTextArea txtOther01Thu;
	private JPanel panel_70;
	private JxTextArea txtSdr92532Thu;
	private JPanel panel_69;
	private JxTextArea txtSdr92507Thu;
	private JPanel panel_68;
	private JxTextArea txtSdr92506Thu;
	private JPanel panel_67;
	private JxTextArea txtSdr92526Thursday;
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
	private JxTextArea txtOther01Wed;
	private JPanel panel_58;
	private JxTextArea txtSdr92532Wed;
	private JPanel panel_57;
	private JxTextArea txtSdr92507Wed;
	private JPanel panel_56;
	private JxTextArea txtSdr92506Wed;
	private JPanel panel_55;
	private JxTextArea txtSdr92526Wednesday;
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
	private JxTextArea txtOther01Tue;
	private JPanel panel_46;
	private JxTextArea txtSdr92532Tue;
	private JPanel panel_45;
	private JxTextArea txtSdr92507Tue;
	private JPanel panel_44;
	private JxTextArea txtSdr92506Tue;
	private JPanel panel_43;
	private JxTextArea txtSdr92526Tuesday;
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
	private JxTextArea txtOther01Mon;
	private JPanel panel_34;
	private JxTextArea txtSdr92532Mon;
	private JPanel panel_33;
	private JxTextArea txtSdr92507Mon;
	private JPanel panel_32;
	private JxTextArea txtSdr92506Mon;
	private JPanel panel_31;
	private JxTextArea txtSdr92526Monday;
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
	private JxTextArea txtOther01Sun;
	private JPanel panel_22;
	private JxTextArea txtSdr92532Sun;
	private JPanel panel_21;
	private JxTextArea txtSdr92507Sun;
	private JPanel panel_20;
	private JxTextArea txtSdr92506Sun;
	private JPanel panel_19;
	private JxTextArea txtSdr92526Sunday;
	private JPanel panel_18;
	private JPanel panel_16;
	private JDateChooser dcDateSunday;
	private JLabel sundayLabel;
	private JPanel panel_15;
	private JPanel panel_5;
	private JLabel eval92610Label_2;
	private JPanel panel_14;
	private JLabel eval92610Label_1;
	private JPanel panel_13;
	private JLabel therapyLabel_14;
	private JLabel therapyLabel_13;
	private JLabel therapyLabel_12;
	private JLabel therapyLabel_11;
	private JLabel incidentsLabel;
	private JPanel panel_12;
	private JTextArea txtOtherRowField01;
	private JLabel otherLabel;
	private JPanel panel_10;
	private JPanel panel_9;
	private JLabel label_3;
	private JPanel panel_8;
	private JLabel therapyLabel_2;
	private JLabel label_2;
	private JPanel panel_7;
	private JLabel therapyLabel_1;
	private JLabel therapyLabel;
	private JLabel label;
	private JLabel eval92610Label;
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
	private JComboBox txt$Frequency;
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

	private Notes defaultNoteMon1;
	private Notes defaultNoteMon2;
	private Notes defaultNoteMon3;
	private Notes defaultNoteMon4;
	private Notes defaultNoteMon5;
	private Notes defaultNoteMon6;
	private Notes defaultNoteMon7;

	private Notes defaultNoteTue1;
	private Notes defaultNoteTue2;
	private Notes defaultNoteTue3;
	private Notes defaultNoteTue4;
	private Notes defaultNoteTue5;
	private Notes defaultNoteTue6;
	private Notes defaultNoteTue7;

	private Notes defaultNoteWed1;
	private Notes defaultNoteWed2;
	private Notes defaultNoteWed3;
	private Notes defaultNoteWed4;
	private Notes defaultNoteWed5;
	private Notes defaultNoteWed6;
	private Notes defaultNoteWed7;

	private Notes defaultNoteThur1;
	private Notes defaultNoteThur2;
	private Notes defaultNoteThur3;
	private Notes defaultNoteThur4;
	private Notes defaultNoteThur5;
	private Notes defaultNoteThur6;
	private Notes defaultNoteThur7;

	private Notes defaultNoteFri1;
	private Notes defaultNoteFri2;
	private Notes defaultNoteFri3;
	private Notes defaultNoteFri4;
	private Notes defaultNoteFri5;
	private Notes defaultNoteFri6;
	private Notes defaultNoteFri7;

	private Notes defaultNoteSat1;
	private Notes defaultNoteSat2;
	private Notes defaultNoteSat3;
	private Notes defaultNoteSat4;
	private Notes defaultNoteSat5;
	private Notes defaultNoteSat6;
	private Notes defaultNoteSat7;
	private Calendar calendar;
	private int key = 0;
	private Notes defaultNote;
	/**
	 * Create the panel
	 */
	private int min1;
	private int min2;
	private int min3;
	private int min4;
	private int min5;
	private int min6;

	public PanelPtOtStSpeechDailyRecord() {
		super();
		Global.panelPtOtStSpeechDailyRecord = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1328, 1100));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1327, 101);
		add(panel);

		defaultNoteMon1 = new Notes();
		defaultNoteMon1.setFormName("Speech Daily Record");
		defaultNoteMon1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon1.setNoteText("");

		defaultNoteMon2 = new Notes();
		defaultNoteMon2.setFormName("Speech Daily Record");
		defaultNoteMon2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon2.setNoteText("");

		defaultNoteMon3 = new Notes();
		defaultNoteMon3.setFormName("Speech Daily Record");
		defaultNoteMon3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon3.setNoteText("");

		defaultNoteMon4 = new Notes();
		defaultNoteMon4.setFormName("Speech Daily Record");
		defaultNoteMon4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon4.setNoteText("");

		defaultNoteMon5 = new Notes();
		defaultNoteMon5.setFormName("Speech Daily Record");
		defaultNoteMon5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon5.setNoteText("");

		defaultNoteMon6 = new Notes();
		defaultNoteMon6.setFormName("Speech Daily Record");
		defaultNoteMon6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon6.setNoteText("");

		defaultNoteMon7 = new Notes();
		defaultNoteMon7.setFormName("Speech Daily Record");
		defaultNoteMon7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon7.setNoteText("");

		defaultNoteTue1 = new Notes();
		defaultNoteTue1.setFormName("Speech Daily Record");
		defaultNoteTue1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue1.setNoteText("");

		defaultNoteTue2 = new Notes();
		defaultNoteTue2.setFormName("Speech Daily Record");
		defaultNoteTue2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue2.setNoteText("");

		defaultNoteTue3 = new Notes();
		defaultNoteTue3.setFormName("Speech Daily Record");
		defaultNoteTue3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue3.setNoteText("");

		defaultNoteTue4 = new Notes();
		defaultNoteTue4.setFormName("Speech Daily Record");
		defaultNoteTue4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue4.setNoteText("");

		defaultNoteTue5 = new Notes();
		defaultNoteTue5.setFormName("Speech Daily Record");
		defaultNoteTue5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue5.setNoteText("");

		defaultNoteTue6 = new Notes();
		defaultNoteTue6.setFormName("Speech Daily Record");
		defaultNoteTue6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue6.setNoteText("");

		defaultNoteTue7 = new Notes();
		defaultNoteTue7.setFormName("Speech Daily Record");
		defaultNoteTue7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue7.setNoteText("");

		defaultNoteWed1 = new Notes();
		defaultNoteWed1.setFormName("Speech Daily Record");
		defaultNoteWed1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed1.setNoteText("");

		defaultNoteWed2 = new Notes();
		defaultNoteWed2.setFormName("Speech Daily Record");
		defaultNoteWed2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed2.setNoteText("");

		defaultNoteWed3 = new Notes();
		defaultNoteWed3.setFormName("Speech Daily Record");
		defaultNoteWed3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed3.setNoteText("");

		defaultNoteWed4 = new Notes();
		defaultNoteWed4.setFormName("Speech Daily Record");
		defaultNoteWed4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed4.setNoteText("");

		defaultNoteWed5 = new Notes();
		defaultNoteWed5.setFormName("Speech Daily Record");
		defaultNoteWed5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed5.setNoteText("");

		defaultNoteWed6 = new Notes();
		defaultNoteWed6.setFormName("Speech Daily Record");
		defaultNoteWed6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed6.setNoteText("");

		defaultNoteWed7 = new Notes();
		defaultNoteWed7.setFormName("Speech Daily Record");
		defaultNoteWed7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed7.setNoteText("");

		defaultNoteThur1 = new Notes();
		defaultNoteThur1.setFormName("Speech Daily Record");
		defaultNoteThur1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur1.setNoteText("");

		defaultNoteThur2 = new Notes();
		defaultNoteThur2.setFormName("Speech Daily Record");
		defaultNoteThur2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur2.setNoteText("");

		defaultNoteThur3 = new Notes();
		defaultNoteThur3.setFormName("Speech Daily Record");
		defaultNoteThur3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur3.setNoteText("");

		defaultNoteThur4 = new Notes();
		defaultNoteThur4.setFormName("Speech Daily Record");
		defaultNoteThur4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur4.setNoteText("");

		defaultNoteThur5 = new Notes();
		defaultNoteThur5.setFormName("Speech Daily Record");
		defaultNoteThur5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur5.setNoteText("");

		defaultNoteThur6 = new Notes();
		defaultNoteThur6.setFormName("Speech Daily Record");
		defaultNoteThur6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur6.setNoteText("");

		defaultNoteThur7 = new Notes();
		defaultNoteThur7.setFormName("Speech Daily Record");
		defaultNoteThur7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur7.setNoteText("");

		defaultNoteFri1 = new Notes();
		defaultNoteFri1.setFormName("Speech Daily Record");
		defaultNoteFri1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri1.setNoteText("");

		defaultNoteFri2 = new Notes();
		defaultNoteFri2.setFormName("Speech Daily Record");
		defaultNoteFri2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri2.setNoteText("");

		defaultNoteFri3 = new Notes();
		defaultNoteFri3.setFormName("Speech Daily Record");
		defaultNoteFri3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri3.setNoteText("");

		defaultNoteFri4 = new Notes();
		defaultNoteFri4.setFormName("Speech Daily Record");
		defaultNoteFri4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri4.setNoteText("");

		defaultNoteFri5 = new Notes();
		defaultNoteFri5.setFormName("Speech Daily Record");
		defaultNoteFri5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri5.setNoteText("");

		defaultNoteFri6 = new Notes();
		defaultNoteFri6.setFormName("Speech Daily Record");
		defaultNoteFri6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri6.setNoteText("");

		defaultNoteFri7 = new Notes();
		defaultNoteFri7.setFormName("Speech Daily Record");
		defaultNoteFri7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri7.setNoteText("");

		defaultNoteSat1 = new Notes();
		defaultNoteSat1.setFormName("Speech Daily Record");
		defaultNoteSat1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat1.setNoteText("");

		defaultNoteSat2 = new Notes();
		defaultNoteSat2.setFormName("Speech Daily Record");
		defaultNoteSat2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat2.setNoteText("");

		defaultNoteSat3 = new Notes();
		defaultNoteSat3.setFormName("Speech Daily Record");
		defaultNoteSat3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat3.setNoteText("");

		defaultNoteSat4 = new Notes();
		defaultNoteSat4.setFormName("Speech Daily Record");
		defaultNoteSat4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat4.setNoteText("");

		defaultNoteSat5 = new Notes();
		defaultNoteSat5.setFormName("Speech Daily Record");
		defaultNoteSat5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat5.setNoteText("");

		defaultNoteSat6 = new Notes();
		defaultNoteSat6.setFormName("Speech Daily Record");
		defaultNoteSat6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat6.setNoteText("");

		defaultNoteSat7 = new Notes();
		defaultNoteSat7.setFormName("Speech Daily Record");
		defaultNoteSat7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat7.setNoteText("");

		physicalTherapyDailyLabel = new JLabel();
		physicalTherapyDailyLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 20));
		physicalTherapyDailyLabel
				.setText("Speech Therapy: Daily Treament Record");
		physicalTherapyDailyLabel.setBounds(490, 10, 346, 22);
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

		txt$Frequency = new JComboBox(new String[] { "", "3-5 Weeks",
				"5-6 Weeks" });
		txt$Frequency.setBackground(Color.WHITE);
		txt$Frequency.setEditable(false);
		txt$Frequency.setBounds(1044, 7, 150, 21);
		panel_1.add(txt$Frequency);

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
		txtDx.setBounds(524, 35, 258, 21);
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
		button.setBounds(788, 35, 31, 21);
		panel_1.add(button);

		patientNameLabel_4 = new JLabel();
		patientNameLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		patientNameLabel_4.setText("YEAR : "
				+ new SimpleDateFormat("yyyy").format(MedrexClientManager
						.getServerTime()));
		patientNameLabel_4.setBounds(1067, 17, 144, 14);
		panel.add(patientNameLabel_4);

		// txt$Year = new JTextField();
		// txt$Year.setBackground(Color.WHITE);
		// txt$Year.setEditable(false);
		// txt$Year.setBounds(1218, 11, 99, 21);
		// panel.add(txt$Year);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 192, 1328, 704);
		add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 110, 710);
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
		panel_4.setBounds(0, 27, 110, 56);
		panel_3.add(panel_4);

		eval92610Label = new JLabel();
		eval92610Label.setFont(new Font("", Font.BOLD, 12));
		eval92610Label.setText("SWALLOW EVAL");
		eval92610Label.setBounds(7, 14, 96, 14);
		panel_4.add(eval92610Label);

		eval92610Label_3 = new JLabel();
		eval92610Label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		eval92610Label_3.setText("92610");
		eval92610Label_3.setBounds(37, 27, 35, 14);
		panel_4.add(eval92610Label_3);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 82, 110, 84);
		panel_3.add(panel_6);

		label = new JLabel();
		label.setFont(new Font("", Font.BOLD, 12));
		label.setText("92526");
		label.setBounds(37, 20, 35, 14);
		panel_6.add(label);

		therapyLabel = new JLabel();
		therapyLabel.setFont(new Font("", Font.BOLD, 12));
		therapyLabel.setText("SWALLOW");
		therapyLabel.setBounds(23, 35, 64, 14);
		panel_6.add(therapyLabel);

		therapyLabel_1 = new JLabel();
		therapyLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_1.setText("TREATMENT");
		therapyLabel_1.setBounds(20, 50, 69, 14);
		panel_6.add(therapyLabel_1);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 165, 110, 84);
		panel_3.add(panel_7);

		label_2 = new JLabel();
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setText("92506");
		label_2.setBounds(37, 42, 35, 14);
		panel_7.add(label_2);

		therapyLabel_2 = new JLabel();
		therapyLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_2.setText("SPEECH EVAL");
		therapyLabel_2.setBounds(15, 28, 79, 14);
		panel_7.add(therapyLabel_2);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 248, 110, 122);
		panel_3.add(panel_8);

		label_3 = new JLabel();
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setText("92507");
		label_3.setBounds(37, 39, 35, 14);
		panel_8.add(label_3);

		therapyLabel_4 = new JLabel();
		therapyLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_4.setText("SPEECH/");
		therapyLabel_4.setBounds(30, 54, 49, 14);
		panel_8.add(therapyLabel_4);

		therapyLabel_5 = new JLabel();
		therapyLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_5.setText("LANGUAGE TX");
		therapyLabel_5.setBounds(14, 69, 81, 14);
		panel_8.add(therapyLabel_5);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.BLACK, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 369, 110, 108);
		panel_3.add(panel_9);

		label_4 = new JLabel();
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setText("92532");
		label_4.setBounds(37, 25, 35, 14);
		panel_9.add(label_4);

		therapyLabel_3 = new JLabel();
		therapyLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_3.setText("DEVELOPMENT");
		therapyLabel_3.setBounds(12, 40, 86, 14);
		panel_9.add(therapyLabel_3);

		therapyLabel_7 = new JLabel();
		therapyLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_7.setText("COGNITIVE");
		therapyLabel_7.setBounds(24, 54, 61, 14);
		panel_9.add(therapyLabel_7);

		therapyLabel_8 = new JLabel();
		therapyLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		therapyLabel_8.setText("SKILLS");
		therapyLabel_8.setBounds(34, 69, 41, 14);
		panel_9.add(therapyLabel_8);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 476, 110, 51);
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

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 526, 110, 130);
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
		panel_13.setBounds(0, 655, 110, 28);
		panel_3.add(panel_13);

		eval92610Label_1 = new JLabel();
		eval92610Label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		eval92610Label_1.setText("TOTAL MINUTES");
		eval92610Label_1.setBounds(9, 7, 92, 14);
		panel_13.add(eval92610Label_1);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 682, 110, 28);
		panel_3.add(panel_14);

		eval92610Label_2 = new JLabel();
		eval92610Label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		eval92610Label_2.setText("INITIALS");
		eval92610Label_2.setBounds(31, 7, 47, 14);
		panel_14.add(eval92610Label_2);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(109, 0, 175, 710);
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
		panel_16.setBounds(0, 27, 175, 56);
		panel_5.add(panel_16);

		cbSwallowEvalSun = new JCheckBox();
		cbSwallowEvalSun.setBackground(Color.WHITE);
		cbSwallowEvalSun.setText("");
		cbSwallowEvalSun.setEnabled(false);
		cbSwallowEvalSun.setBounds(76, 28, 21, 18);
		panel_16.add(cbSwallowEvalSun);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 82, 175, 84);
		panel_5.add(panel_18);

		defaultNoteSun1 = new Notes();
		defaultNoteSun1.setFormName("Speech Daily Record");
		defaultNoteSun1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun1.setNoteText("");

		txtSdr92526Sunday = new JxTextArea();
		txtSdr92526Sunday.setNotes(defaultNoteSun1);
		txtSdr92526Sunday.setEditable(false);
		txtSdr92526Sunday.setBackground(Color.WHITE);
		txtSdr92526Sunday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Sunday.setWrapStyleWord(true);
		// txtSdr92526Sunday.setLineWrap(true);
		txtSdr92526Sunday.setBounds(3, 3, 169, 78);
		panel_18.add(txtSdr92526Sunday);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 165, 175, 84);
		panel_5.add(panel_19);

		defaultNoteSun2 = new Notes();
		defaultNoteSun2.setFormName("Speech Daily Record");
		defaultNoteSun2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun2.setNoteText("");

		txtSdr92506Sun = new JxTextArea();
		txtSdr92506Sun.setNotes(defaultNoteSun2);
		txtSdr92506Sun.setEditable(false);
		txtSdr92506Sun.setBackground(Color.WHITE);
		txtSdr92506Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Sun.setWrapStyleWord(true);
		// txtSdr92506Sun.setLineWrap(true);
		txtSdr92506Sun.setBounds(3, 3, 169, 78);
		panel_19.add(txtSdr92506Sun);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 248, 175, 122);
		panel_5.add(panel_20);

		defaultNoteSun3 = new Notes();
		defaultNoteSun3.setFormName("Speech Daily Record");
		defaultNoteSun3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun3.setNoteText("");

		txtSdr92507Sun = new JxTextArea();
		txtSdr92507Sun.setNotes(defaultNoteSun3);
		txtSdr92507Sun.setEditable(false);
		txtSdr92507Sun.setBackground(Color.WHITE);
		txtSdr92507Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Sun.setWrapStyleWord(true);
		// txtSdr92507Sun.setLineWrap(true);
		txtSdr92507Sun.setBounds(3, 3, 169, 116);
		panel_20.add(txtSdr92507Sun);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 369, 175, 108);
		panel_5.add(panel_21);

		defaultNoteSun4 = new Notes();
		defaultNoteSun4.setFormName("Speech Daily Record");
		defaultNoteSun4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun4.setNoteText("");

		txtSdr92532Sun = new JxTextArea();
		txtSdr92532Sun.setNotes(defaultNoteSun4);
		txtSdr92532Sun.setEditable(false);
		txtSdr92532Sun.setBackground(Color.WHITE);
		txtSdr92532Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Sun.setWrapStyleWord(true);
		// txtSdr92532Sun.setLineWrap(true);
		txtSdr92532Sun.setBounds(3, 3, 169, 102);
		panel_21.add(txtSdr92532Sun);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 476, 175, 51);
		panel_5.add(panel_22);

		defaultNoteSun5 = new Notes();
		defaultNoteSun5.setFormName("Speech Daily Record");
		defaultNoteSun5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun5.setNoteText("");

		txtOther01Sun = new JxTextArea();
		txtOther01Sun.setNotes(defaultNoteSun5);
		txtOther01Sun.setEditable(false);
		txtOther01Sun.setBackground(Color.WHITE);
		txtOther01Sun.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Sun.setWrapStyleWord(true);
		// txtOther01Sun.setLineWrap(true);
		txtOther01Sun.setBounds(3, 3, 169, 45);
		panel_22.add(txtOther01Sun);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 526, 175, 130);
		panel_5.add(panel_24);

		defaultNoteSun6 = new Notes();
		defaultNoteSun6.setFormName("Speech Daily Record");
		defaultNoteSun6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun6.setNoteText("");

		txtIncidentsSun = new JxTextArea();
		txtIncidentsSun.setNotes(defaultNoteSun6);
		txtIncidentsSun.setEditable(false);
		txtIncidentsSun.setBackground(Color.WHITE);
		txtIncidentsSun.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsSun.setWrapStyleWord(true);
		// txtIncidentsSun.setLineWrap(true);
		txtIncidentsSun.setBounds(3, 3, 169, 125);
		panel_24.add(txtIncidentsSun);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 655, 175, 28);
		panel_5.add(panel_25);

		// defaultNoteSun7=new Notes();
		// defaultNoteSun7.setFormName("Speech Daily Record");
		// defaultNoteSun7.setUserId(Global.currentLoggedInUserKey);
		// defaultNoteSun7.setNoteText("");
		//		
		txtTotalMinSun = new JTextArea();
		// txtTotalMinSun.setNotes(defaultNoteSun7);
		txtTotalMinSun.setEditable(false);
		txtTotalMinSun.setBackground(Color.WHITE);
		txtTotalMinSun.setBorder(new LineBorder(Color.black, 1, false));
		// txtTotalMinSun.setWrapStyleWord(true);
		// txtTotalMinSun.setLineWrap(true);
		txtTotalMinSun.setBounds(3, 3, 169, 22);
		panel_25.add(txtTotalMinSun);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 682, 175, 28);
		panel_5.add(panel_26);

		cmbInitialsSun = new JComboBox();
		cmbInitialsSun.setBackground(Color.WHITE);
		cmbInitialsSun.setBounds(3, 3, 169, 22);
		panel_26.add(cmbInitialsSun);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(283, 0, 175, 710);
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
		panel_29.setBounds(0, 27, 175, 56);
		panel_27.add(panel_29);

		cbSwallowEvalMon = new JCheckBox();
		cbSwallowEvalMon.setBackground(Color.WHITE);
		cbSwallowEvalMon.setText("");
		cbSwallowEvalMon.setEnabled(false);
		cbSwallowEvalMon.setBounds(71, 28, 21, 18);
		panel_29.add(cbSwallowEvalMon);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 82, 175, 84);
		panel_27.add(panel_30);

		txtSdr92526Monday = new JxTextArea();
		txtSdr92526Monday.setNotes(defaultNoteMon1);
		txtSdr92526Monday.setEditable(false);
		txtSdr92526Monday.setBackground(Color.WHITE);
		txtSdr92526Monday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Monday.setWrapStyleWord(true);
		// txtSdr92526Monday.setLineWrap(true);
		txtSdr92526Monday.setBounds(3, 3, 169, 78);
		panel_30.add(txtSdr92526Monday);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 165, 175, 84);
		panel_27.add(panel_31);

		txtSdr92506Mon = new JxTextArea();
		txtSdr92506Mon.setNotes(defaultNoteMon2);
		txtSdr92506Mon.setEditable(false);
		txtSdr92506Mon.setBackground(Color.WHITE);
		txtSdr92506Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Mon.setWrapStyleWord(true);
		// txtSdr92506Mon.setLineWrap(true);
		txtSdr92506Mon.setBounds(3, 3, 169, 78);
		panel_31.add(txtSdr92506Mon);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 248, 175, 122);
		panel_27.add(panel_32);

		txtSdr92507Mon = new JxTextArea();
		txtSdr92507Mon.setNotes(defaultNoteMon3);
		txtSdr92507Mon.setEditable(false);
		txtSdr92507Mon.setBackground(Color.WHITE);
		txtSdr92507Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Mon.setWrapStyleWord(true);
		// txtSdr92507Mon.setLineWrap(true);
		txtSdr92507Mon.setBounds(3, 3, 169, 116);
		panel_32.add(txtSdr92507Mon);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 369, 175, 108);
		panel_27.add(panel_33);

		txtSdr92532Mon = new JxTextArea();
		txtSdr92532Mon.setNotes(defaultNoteMon4);
		txtSdr92532Mon.setEditable(false);
		txtSdr92532Mon.setBackground(Color.WHITE);
		txtSdr92532Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Mon.setWrapStyleWord(true);
		// txtSdr92532Mon.setLineWrap(true);
		txtSdr92532Mon.setBounds(3, 3, 169, 102);
		panel_33.add(txtSdr92532Mon);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 476, 175, 51);
		panel_27.add(panel_34);

		txtOther01Mon = new JxTextArea();
		txtOther01Mon.setNotes(defaultNoteMon5);
		txtOther01Mon.setEditable(false);
		txtOther01Mon.setBackground(Color.WHITE);
		txtOther01Mon.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Mon.setWrapStyleWord(true);
		// txtOther01Mon.setLineWrap(true);
		txtOther01Mon.setBounds(3, 3, 169, 45);
		panel_34.add(txtOther01Mon);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 526, 175, 130);
		panel_27.add(panel_36);

		txtIncidentsMon = new JxTextArea();
		txtIncidentsMon.setNotes(defaultNoteMon6);
		txtIncidentsMon.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsMon.setWrapStyleWord(true);
		// txtIncidentsMon.setLineWrap(true);
		txtIncidentsMon.setBounds(3, 3, 169, 125);
		txtIncidentsMon.setEditable(false);
		txtIncidentsMon.setBackground(Color.WHITE);
		panel_36.add(txtIncidentsMon);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 655, 175, 28);
		panel_27.add(panel_37);

		txtTotalMinMon = new JTextArea();
		// txtTotalMinMon.setNotes(defaultNoteMon7);
		txtTotalMinMon.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinMon.setEditable(false);
		txtTotalMinMon.setBackground(Color.WHITE);
		// txtTotalMinMon.setWrapStyleWord(true);
		// txtTotalMinMon.setLineWrap(true);
		txtTotalMinMon.setBounds(3, 3, 169, 22);
		panel_37.add(txtTotalMinMon);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 682, 175, 28);
		panel_27.add(panel_38);

		cmbInitialsMon = new JComboBox();
		cmbInitialsMon.setBackground(Color.WHITE);
		cmbInitialsMon.setBounds(3, 3, 169, 22);
		panel_38.add(cmbInitialsMon);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(457, 0, 175, 710);
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
		panel_41.setBounds(0, 27, 175, 56);
		panel_39.add(panel_41);

		cbSwallowEvalTues = new JCheckBox();
		cbSwallowEvalTues.setBackground(Color.WHITE);
		cbSwallowEvalTues.setText("");
		cbSwallowEvalTues.setEnabled(false);
		cbSwallowEvalTues.setBounds(71, 20, 21, 18);
		panel_41.add(cbSwallowEvalTues);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 82, 175, 84);
		panel_39.add(panel_42);

		txtSdr92526Tuesday = new JxTextArea();
		txtSdr92526Tuesday.setNotes(defaultNoteTue1);
		txtSdr92526Tuesday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Tuesday.setWrapStyleWord(true);
		// txtSdr92526Tuesday.setLineWrap(true);
		txtSdr92526Tuesday.setBounds(3, 3, 169, 78);
		txtSdr92526Tuesday.setEditable(false);
		txtSdr92526Tuesday.setBackground(Color.WHITE);
		panel_42.add(txtSdr92526Tuesday);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 165, 175, 84);
		panel_39.add(panel_43);

		txtSdr92506Tue = new JxTextArea();
		txtSdr92506Tue.setNotes(defaultNoteTue2);
		txtSdr92506Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Tue.setWrapStyleWord(true);
		// txtSdr92506Tue.setLineWrap(true);
		txtSdr92506Tue.setBounds(3, 3, 169, 78);
		txtSdr92506Tue.setEditable(false);
		txtSdr92506Tue.setBackground(Color.WHITE);
		panel_43.add(txtSdr92506Tue);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(0, 248, 175, 122);
		panel_39.add(panel_44);

		txtSdr92507Tue = new JxTextArea();
		txtSdr92507Tue.setNotes(defaultNoteTue3);
		txtSdr92507Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Tue.setWrapStyleWord(true);
		// txtSdr92507Tue.setLineWrap(true);
		txtSdr92507Tue.setBounds(3, 3, 169, 116);
		txtSdr92507Tue.setEditable(false);
		txtSdr92507Tue.setBackground(Color.WHITE);
		panel_44.add(txtSdr92507Tue);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 369, 175, 108);
		panel_39.add(panel_45);

		txtSdr92532Tue = new JxTextArea();
		txtSdr92532Tue.setNotes(defaultNoteTue4);
		txtSdr92532Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Tue.setWrapStyleWord(true);
		// txtSdr92532Tue.setLineWrap(true);
		txtSdr92532Tue.setBounds(3, 3, 169, 102);
		txtSdr92532Tue.setEditable(false);
		txtSdr92532Tue.setBackground(Color.WHITE);
		panel_45.add(txtSdr92532Tue);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 476, 175, 51);
		panel_39.add(panel_46);

		txtOther01Tue = new JxTextArea();
		txtOther01Tue.setNotes(defaultNoteTue5);
		txtOther01Tue.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Tue.setWrapStyleWord(true);
		// txtOther01Tue.setLineWrap(true);
		txtOther01Tue.setBounds(3, 3, 169, 45);
		txtOther01Tue.setEditable(false);
		txtOther01Tue.setBackground(Color.WHITE);
		panel_46.add(txtOther01Tue);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 526, 175, 130);
		panel_39.add(panel_48);

		txtIncidentsTue = new JxTextArea();
		txtIncidentsTue.setNotes(defaultNoteTue6);
		txtIncidentsTue.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsTue.setWrapStyleWord(true);
		// txtIncidentsTue.setLineWrap(true);
		txtIncidentsTue.setBounds(3, 3, 169, 125);
		txtIncidentsTue.setEditable(false);
		txtIncidentsTue.setBackground(Color.WHITE);
		panel_48.add(txtIncidentsTue);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(0, 655, 175, 28);
		panel_39.add(panel_49);

		txtTotalMinTue = new JTextArea();
		// txtTotalMinTue.setNotes(defaultNoteTue7);
		txtTotalMinTue.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinTue.setEditable(false);
		txtTotalMinTue.setBackground(Color.WHITE);
		// txtTotalMinTue.setWrapStyleWord(true);
		// txtTotalMinTue.setLineWrap(true);
		txtTotalMinTue.setBounds(3, 3, 169, 22);
		panel_49.add(txtTotalMinTue);

		panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(Color.black, 1, false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(0, 682, 175, 28);
		panel_39.add(panel_50);

		cmbInitialsTue = new JComboBox();
		cmbInitialsTue.setBackground(Color.WHITE);
		cmbInitialsTue.setBounds(3, 3, 169, 22);
		panel_50.add(cmbInitialsTue);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(631, 0, 175, 710);
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
		panel_53.setBounds(0, 27, 175, 56);
		panel_51.add(panel_53);

		cbSwallowEvalWed = new JCheckBox();
		cbSwallowEvalWed.setBackground(Color.WHITE);
		cbSwallowEvalWed.setText("");
		cbSwallowEvalWed.setEnabled(false);
		cbSwallowEvalWed.setBounds(71, 20, 21, 18);
		panel_53.add(cbSwallowEvalWed);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(0, 82, 175, 84);
		panel_51.add(panel_54);

		txtSdr92526Wednesday = new JxTextArea();
		txtSdr92526Wednesday.setNotes(defaultNoteWed1);
		txtSdr92526Wednesday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Wednesday.setWrapStyleWord(true);
		// txtSdr92526Wednesday.setLineWrap(true);
		txtSdr92526Wednesday.setBounds(3, 3, 169, 78);
		txtSdr92526Wednesday.setEditable(false);
		txtSdr92526Wednesday.setBackground(Color.WHITE);
		panel_54.add(txtSdr92526Wednesday);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 165, 175, 84);
		panel_51.add(panel_55);

		txtSdr92506Wed = new JxTextArea();
		txtSdr92506Wed.setNotes(defaultNoteWed2);
		txtSdr92506Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Wed.setWrapStyleWord(true);
		// txtSdr92506Wed.setLineWrap(true);
		txtSdr92506Wed.setBounds(3, 3, 169, 78);
		txtSdr92506Wed.setEditable(false);
		txtSdr92506Wed.setBackground(Color.WHITE);
		panel_55.add(txtSdr92506Wed);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(0, 248, 175, 122);
		panel_51.add(panel_56);

		txtSdr92507Wed = new JxTextArea();
		txtSdr92507Wed.setNotes(defaultNoteWed3);
		txtSdr92507Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Wed.setWrapStyleWord(true);
		// txtSdr92507Wed.setLineWrap(true);
		txtSdr92507Wed.setBounds(3, 3, 169, 116);
		txtSdr92507Wed.setEditable(false);
		txtSdr92507Wed.setBackground(Color.WHITE);
		panel_56.add(txtSdr92507Wed);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 369, 175, 108);
		panel_51.add(panel_57);

		txtSdr92532Wed = new JxTextArea();
		txtSdr92532Wed.setNotes(defaultNoteWed4);
		txtSdr92532Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Wed.setWrapStyleWord(true);
		// txtSdr92532Wed.setLineWrap(true);
		txtSdr92532Wed.setBounds(3, 3, 169, 102);
		txtSdr92532Wed.setEditable(false);
		txtSdr92532Wed.setBackground(Color.WHITE);
		panel_57.add(txtSdr92532Wed);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 476, 175, 51);
		panel_51.add(panel_58);

		txtOther01Wed = new JxTextArea();
		txtOther01Wed.setNotes(defaultNoteWed5);
		txtOther01Wed.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Wed.setWrapStyleWord(true);
		// txtOther01Wed.setLineWrap(true);
		txtOther01Wed.setBounds(3, 3, 169, 45);
		txtOther01Wed.setEditable(false);
		txtOther01Wed.setBackground(Color.WHITE);
		panel_58.add(txtOther01Wed);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 526, 175, 130);
		panel_51.add(panel_60);

		txtIncidentsWed = new JxTextArea();
		txtIncidentsWed.setNotes(defaultNoteWed6);
		txtIncidentsWed.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsWed.setWrapStyleWord(true);
		// txtIncidentsWed.setLineWrap(true);
		txtIncidentsWed.setBounds(3, 3, 169, 125);
		txtIncidentsWed.setEditable(false);
		txtIncidentsWed.setBackground(Color.WHITE);
		panel_60.add(txtIncidentsWed);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(0, 655, 175, 28);
		panel_51.add(panel_61);

		txtTotalMinWed = new JTextArea();
		// txtTotalMinWed.setNotes(defaultNoteWed7);
		txtTotalMinWed.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinWed.setEditable(false);
		txtTotalMinWed.setBackground(Color.WHITE);
		// txtTotalMinWed.setWrapStyleWord(true);
		// txtTotalMinWed.setLineWrap(true);
		txtTotalMinWed.setBounds(3, 3, 169, 22);
		panel_61.add(txtTotalMinWed);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 682, 175, 28);
		panel_51.add(panel_62);

		cmbInitialsWed = new JComboBox();
		cmbInitialsWed.setBackground(Color.WHITE);
		cmbInitialsWed.setBounds(3, 3, 169, 22);
		panel_62.add(cmbInitialsWed);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(805, 0, 175, 710);
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
		panel_65.setBounds(0, 27, 175, 56);
		panel_63.add(panel_65);

		cbSwallowEvalThur = new JCheckBox();
		cbSwallowEvalThur.setBackground(Color.WHITE);
		cbSwallowEvalThur.setText("");
		cbSwallowEvalThur.setEnabled(false);
		cbSwallowEvalThur.setBounds(71, 20, 21, 18);
		panel_65.add(cbSwallowEvalThur);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 82, 175, 84);
		panel_63.add(panel_66);

		txtSdr92526Thursday = new JxTextArea();
		txtSdr92526Thursday.setNotes(defaultNoteThur1);
		txtSdr92526Thursday.setBorder(new LineBorder(Color.black, 1, false));
		txtSdr92526Thursday.setBounds(3, 3, 169, 78);
		txtSdr92526Thursday.setEditable(false);
		txtSdr92526Thursday.setBackground(Color.WHITE);
		panel_66.add(txtSdr92526Thursday);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 165, 175, 84);
		panel_63.add(panel_67);

		txtSdr92506Thu = new JxTextArea();
		txtSdr92506Thu.setNotes(defaultNoteThur2);
		txtSdr92506Thu.setBorder(new LineBorder(Color.black, 1, false));
		txtSdr92506Thu.setBounds(3, 3, 169, 78);
		txtSdr92506Thu.setEditable(false);
		txtSdr92506Thu.setBackground(Color.WHITE);
		panel_67.add(txtSdr92506Thu);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 248, 175, 122);
		panel_63.add(panel_68);

		txtSdr92507Thu = new JxTextArea();
		txtSdr92507Thu.setNotes(defaultNoteThur3);
		txtSdr92507Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Thu.setWrapStyleWord(true);
		// txtSdr92507Thu.setLineWrap(true);
		txtSdr92507Thu.setBounds(3, 3, 169, 116);
		txtSdr92507Thu.setEditable(false);
		txtSdr92507Thu.setBackground(Color.WHITE);
		panel_68.add(txtSdr92507Thu);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 369, 175, 108);
		panel_63.add(panel_69);

		txtSdr92532Thu = new JxTextArea();
		txtSdr92532Thu.setNotes(defaultNoteThur4);
		txtSdr92532Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Thu.setWrapStyleWord(true);
		// txtSdr92532Thu.setLineWrap(true);
		txtSdr92532Thu.setBounds(3, 3, 169, 102);
		txtSdr92532Thu.setEditable(false);
		txtSdr92532Thu.setBackground(Color.WHITE);
		panel_69.add(txtSdr92532Thu);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(0, 476, 175, 51);
		panel_63.add(panel_70);

		txtOther01Thu = new JxTextArea();
		txtOther01Thu.setNotes(defaultNoteThur5);
		txtOther01Thu.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Thu.setWrapStyleWord(true);
		// txtOther01Thu.setLineWrap(true);
		txtOther01Thu.setBounds(3, 3, 169, 45);
		txtOther01Thu.setEditable(false);
		txtOther01Thu.setBackground(Color.WHITE);
		panel_70.add(txtOther01Thu);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(0, 526, 175, 130);
		panel_63.add(panel_72);

		txtIncidentsThu = new JxTextArea();
		txtIncidentsThu.setNotes(defaultNoteThur6);
		txtIncidentsThu.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsThu.setWrapStyleWord(true);
		// txtIncidentsThu.setLineWrap(true);
		txtIncidentsThu.setBounds(3, 3, 169, 125);
		txtIncidentsThu.setEditable(false);
		txtIncidentsThu.setBackground(Color.WHITE);
		panel_72.add(txtIncidentsThu);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(0, 655, 175, 28);
		panel_63.add(panel_73);

		txtTotalMinThu = new JTextArea();
		// txtTotalMinThu.setNotes(defaultNoteThur7);
		txtTotalMinThu.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinThu.setEditable(false);
		txtTotalMinThu.setBackground(Color.WHITE);
		// txtTotalMinThu.setWrapStyleWord(true);
		// txtTotalMinThu.setLineWrap(true);
		txtTotalMinThu.setBounds(3, 3, 169, 22);
		panel_73.add(txtTotalMinThu);

		panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(Color.black, 1, false));
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(0, 682, 175, 28);
		panel_63.add(panel_74);

		cmbInitialsThu = new JComboBox();
		cmbInitialsThu.setBackground(Color.WHITE);
		cmbInitialsThu.setBounds(3, 3, 169, 22);
		panel_74.add(cmbInitialsThu);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(979, 0, 175, 710);
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
		panel_77.setBounds(0, 27, 175, 56);
		panel_75.add(panel_77);

		cbSwallowEvalFri = new JCheckBox();
		cbSwallowEvalFri.setBackground(Color.WHITE);
		cbSwallowEvalFri.setText("");
		cbSwallowEvalFri.setEnabled(false);
		cbSwallowEvalFri.setBounds(71, 20, 21, 18);
		panel_77.add(cbSwallowEvalFri);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(0, 82, 175, 84);
		panel_75.add(panel_78);

		txtSdr92526Friday = new JxTextArea();
		txtSdr92526Friday.setNotes(defaultNoteFri1);
		txtSdr92526Friday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Friday.setWrapStyleWord(true);
		// txtSdr92526Friday.setLineWrap(true);
		txtSdr92526Friday.setBounds(3, 3, 169, 78);
		txtSdr92526Friday.setEditable(false);
		txtSdr92526Friday.setBackground(Color.WHITE);
		panel_78.add(txtSdr92526Friday);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(Color.black, 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 165, 175, 84);
		panel_75.add(panel_79);

		txtSdr92506Fri = new JxTextArea();
		txtSdr92506Fri.setNotes(defaultNoteFri2);
		txtSdr92506Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Fri.setWrapStyleWord(true);
		// txtSdr92506Fri.setLineWrap(true);
		txtSdr92506Fri.setBounds(3, 3, 169, 78);
		txtSdr92506Fri.setEditable(false);
		txtSdr92506Fri.setBackground(Color.WHITE);
		panel_79.add(txtSdr92506Fri);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(0, 248, 175, 122);
		panel_75.add(panel_80);

		txtSdr92507Fri = new JxTextArea();
		txtSdr92507Fri.setNotes(defaultNoteFri3);
		// txtSdr92507Fri.setWrapStyleWord(true);
		txtSdr92507Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Fri.setLineWrap(true);
		txtSdr92507Fri.setBounds(3, 3, 169, 116);
		txtSdr92507Fri.setEditable(false);
		txtSdr92507Fri.setBackground(Color.WHITE);
		panel_80.add(txtSdr92507Fri);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(0, 369, 175, 108);
		panel_75.add(panel_81);

		txtSdr92532Fri = new JxTextArea();
		txtSdr92532Fri.setNotes(defaultNoteFri4);
		txtSdr92532Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Fri.setWrapStyleWord(true);
		// txtSdr92532Fri.setLineWrap(true);
		txtSdr92532Fri.setBounds(3, 3, 169, 102);
		txtSdr92532Fri.setEditable(false);
		txtSdr92532Fri.setBackground(Color.WHITE);
		panel_81.add(txtSdr92532Fri);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 476, 175, 51);
		panel_75.add(panel_82);

		txtOther01Fri = new JxTextArea();
		txtOther01Fri.setNotes(defaultNoteFri5);
		txtOther01Fri.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Fri.setWrapStyleWord(true);
		// txtOther01Fri.setLineWrap(true);
		txtOther01Fri.setBounds(3, 3, 169, 45);
		txtOther01Fri.setEditable(false);
		txtOther01Fri.setBackground(Color.WHITE);
		panel_82.add(txtOther01Fri);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 526, 175, 130);
		panel_75.add(panel_84);

		txtIncidentsFri = new JxTextArea();
		txtIncidentsFri.setNotes(defaultNoteFri6);
		txtIncidentsFri.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsFri.setWrapStyleWord(true);
		// txtIncidentsFri.setLineWrap(true);
		txtIncidentsFri.setBounds(3, 3, 169, 125);
		txtIncidentsFri.setEditable(false);
		txtIncidentsFri.setBackground(Color.WHITE);
		panel_84.add(txtIncidentsFri);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 655, 175, 28);
		panel_75.add(panel_85);

		txtTotalMinFri = new JTextArea();
		// txtTotalMinFri.setNotes(defaultNoteFri7);
		txtTotalMinFri.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinFri.setEditable(false);
		txtTotalMinFri.setBackground(Color.WHITE);
		// txtTotalMinFri.setWrapStyleWord(true);
		// txtTotalMinFri.setLineWrap(true);
		txtTotalMinFri.setBounds(3, 3, 169, 22);
		panel_85.add(txtTotalMinFri);

		panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(Color.black, 1, false));
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(0, 682, 175, 28);
		panel_75.add(panel_86);

		cmbInitialsFri = new JComboBox();
		cmbInitialsFri.setBackground(Color.WHITE);
		cmbInitialsFri.setBounds(3, 3, 169, 22);
		panel_86.add(cmbInitialsFri);

		panel_87 = new JPanel();
		panel_87.setBorder(new LineBorder(Color.black, 1, false));
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(1153, 0, 175, 710);
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
		panel_89.setBounds(0, 27, 175, 56);
		panel_87.add(panel_89);

		cbSwallowEvalSat = new JCheckBox();
		cbSwallowEvalSat.setBackground(Color.WHITE);
		cbSwallowEvalSat.setText("");
		cbSwallowEvalSat.setEnabled(false);
		cbSwallowEvalSat.setBounds(71, 20, 21, 18);
		panel_89.add(cbSwallowEvalSat);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(Color.black, 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(0, 82, 175, 84);
		panel_87.add(panel_90);

		txtSdr92526Saturday = new JxTextArea();
		txtSdr92526Saturday.setNotes(defaultNoteSat1);
		txtSdr92526Saturday.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92526Saturday.setWrapStyleWord(true);
		// txtSdr92526Saturday.setLineWrap(true);
		txtSdr92526Saturday.setBounds(3, 3, 169, 78);
		txtSdr92526Saturday.setEditable(false);
		txtSdr92526Saturday.setBackground(Color.WHITE);
		panel_90.add(txtSdr92526Saturday);

		panel_91 = new JPanel();
		panel_91.setBorder(new LineBorder(Color.black, 1, false));
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 165, 175, 84);
		panel_87.add(panel_91);

		txtSdr92506Sat = new JxTextArea();
		txtSdr92506Sat.setNotes(defaultNoteSat2);
		txtSdr92506Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92506Sat.setWrapStyleWord(true);
		// txtSdr92506Sat.setLineWrap(true);
		txtSdr92506Sat.setBounds(3, 3, 169, 78);
		txtSdr92506Sat.setEditable(false);
		txtSdr92506Sat.setBackground(Color.WHITE);
		panel_91.add(txtSdr92506Sat);

		panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(0, 248, 175, 122);
		panel_87.add(panel_92);

		txtSdr92507Sat = new JxTextArea();
		txtSdr92507Sat.setNotes(defaultNoteSat3);
		txtSdr92507Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92507Sat.setWrapStyleWord(true);
		// txtSdr92507Sat.setLineWrap(true);
		txtSdr92507Sat.setBounds(3, 3, 169, 116);
		txtSdr92507Sat.setEditable(false);
		txtSdr92507Sat.setBackground(Color.WHITE);
		panel_92.add(txtSdr92507Sat);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 369, 175, 108);
		panel_87.add(panel_93);

		txtSdr92532Sat = new JxTextArea();
		txtSdr92532Sat.setNotes(defaultNoteSat4);
		txtSdr92532Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtSdr92532Sat.setWrapStyleWord(true);
		// txtSdr92532Sat.setLineWrap(true);
		txtSdr92532Sat.setBounds(3, 3, 169, 102);
		txtSdr92532Sat.setEditable(false);
		txtSdr92532Sat.setBackground(Color.WHITE);
		panel_93.add(txtSdr92532Sat);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 476, 175, 51);
		panel_87.add(panel_94);

		txtOther01Sat = new JxTextArea();
		txtOther01Sat.setNotes(defaultNoteSat5);
		txtOther01Sat.setBorder(new LineBorder(Color.black, 1, false));
		// txtOther01Sat.setWrapStyleWord(true);
		// txtOther01Sat.setLineWrap(true);
		txtOther01Sat.setBounds(3, 3, 169, 45);
		txtOther01Sat.setEditable(false);
		txtOther01Sat.setBackground(Color.WHITE);
		panel_94.add(txtOther01Sat);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 526, 175, 130);
		panel_87.add(panel_96);

		txtIncidentsSat = new JxTextArea();
		txtIncidentsSat.setNotes(defaultNoteSat6);
		txtIncidentsSat.setBorder(new LineBorder(Color.black, 1, false));
		// txtIncidentsSat.setWrapStyleWord(true);
		// txtIncidentsSat.setLineWrap(true);
		txtIncidentsSat.setBounds(3, 3, 169, 125);
		txtIncidentsSat.setEditable(false);
		txtIncidentsSat.setBackground(Color.WHITE);
		panel_96.add(txtIncidentsSat);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(0, 655, 175, 28);
		panel_87.add(panel_97);

		txtTotalMinSat = new JTextArea();
		// txtTotalMinSat.setNotes(defaultNoteSat7);
		txtTotalMinSat.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalMinSat.setEditable(false);
		txtTotalMinSat.setBackground(Color.WHITE);
		// txtTotalMinSat.setWrapStyleWord(true);
		// txtTotalMinSat.setLineWrap(true);
		txtTotalMinSat.setBounds(3, 3, 169, 22);
		panel_97.add(txtTotalMinSat);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(Color.black, 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(0, 682, 175, 28);
		panel_87.add(panel_98);

		cmbInitialsSat = new JComboBox();
		cmbInitialsSat.setBackground(Color.WHITE);
		cmbInitialsSat.setBounds(3, 3, 169, 22);
		panel_98.add(cmbInitialsSat);

		panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 931, 1327, 98);
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

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 107, 1328, 34);
		add(panel_11);

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
		previousWeekButton.setBounds(525, 10, 144, 21);
		panel_11.add(previousWeekButton);

		final JButton nextweekButton = new JButton();
		nextweekButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				getCalendar();
				calendar.add(Calendar.DATE, 7);
				setCalendar(calendar);
				updateData();
			}
		});
		nextweekButton.setBackground(Color.WHITE);
		nextweekButton.setText("NextWeek");
		nextweekButton.setBounds(678, 10, 144, 21);
		panel_11.add(nextweekButton);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setLayout(null);
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setBounds(0, 141, 1328, 45);
		add(panel_11_1);

		final JButton btnSun = new JButton();
		btnSun.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);

				if (cbSwallowEvalSun.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Sunday.getNotes() != null) {
					frameSpeechTextArea.setRow2(txtSdr92526Sunday.getNotes());
					frameSpeechTextArea.setRow3(txtSdr92506Sun.getNotes());
					frameSpeechTextArea.setRow4(txtSdr92507Sun.getNotes());
					frameSpeechTextArea.setRow5(txtSdr92532Sun.getNotes());
					frameSpeechTextArea.setRow6(txtOther01Sun.getNotes());
					frameSpeechTextArea.setRow7(txtIncidentsSun.getNotes());
					// System.out.println("min1"+getMin1());
					frameSpeechTextArea.setMin1(getMin1());
					frameSpeechTextArea.setMin2(getMin2());
					frameSpeechTextArea.setMin3(getMin3());
					frameSpeechTextArea.setMin4(getMin4());
					frameSpeechTextArea.setMin5(getMin5());
					frameSpeechTextArea.setMin6(getMin6());
					frameSpeechTextArea.setVisible(true);
					frameSpeechTextArea.setTitle("Sunday");
				}
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalSun.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Sunday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Sun.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Sun.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Sun.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Sun.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsSun.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinSun.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});
		btnSun.setBackground(Color.WHITE);
		btnSun.setText("Add");
		btnSun.setBounds(149, 10, 75, 21);
		panel_11_1.add(btnSun);

		final JButton btnMon = new JButton();
		btnMon.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalMon.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Monday.getNotes() != null)
					frameSpeechTextArea.setRow2(txtSdr92526Monday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Mon.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Mon.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Mon.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Mon.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsMon.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("Monday");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalMon.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Monday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Mon.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Mon.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Mon.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Mon.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsMon.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinMon.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});
		btnMon.setBackground(Color.WHITE);
		btnMon.setText("Add");
		btnMon.setBounds(329, 10, 75, 21);
		panel_11_1.add(btnMon);

		final JButton btnTues = new JButton();
		btnTues.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalTues.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Tuesday.getNotes() != null)
					frameSpeechTextArea.setRow2(txtSdr92526Tuesday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Tue.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Tue.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Tue.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Tue.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsTue.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("Tuesday");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalTues.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Tuesday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Tue.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Tue.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Tue.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Tue.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsTue.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinTue.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});
		btnTues.setBackground(Color.WHITE);
		btnTues.setText("Add");
		btnTues.setBounds(501, 10, 75, 21);
		panel_11_1.add(btnTues);

		final JButton btnWed = new JButton();
		btnWed.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalWed.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Wednesday.getNotes() != null)
					frameSpeechTextArea
							.setRow2(txtSdr92526Wednesday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Wed.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Wed.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Wed.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Wed.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsWed.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("Wednesday");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalWed.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Wednesday
							.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Wed.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Wed.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Wed.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Wed.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsWed.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinWed.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});

		btnWed.setBackground(Color.WHITE);
		btnWed.setText("Add");
		btnWed.setBounds(680, 10, 75, 21);
		panel_11_1.add(btnWed);

		final JButton btnThur = new JButton();
		btnThur.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalThur.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Thursday.getNotes() != null)
					frameSpeechTextArea.setRow2(txtSdr92526Thursday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Thu.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Thu.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Thu.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Thu.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsThu.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("ThursDay");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalThur.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Thursday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Thu.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Thu.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Thu.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Thu.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsThu.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinThu.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});

		btnThur.setBackground(Color.WHITE);
		btnThur.setText("Add");
		btnThur.setBounds(853, 10, 75, 21);
		panel_11_1.add(btnThur);

		final JButton btnFri = new JButton();
		btnFri.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalFri.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Friday.getNotes() != null)
					frameSpeechTextArea.setRow2(txtSdr92526Friday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Fri.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Fri.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Fri.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Fri.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsFri.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("Friday");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalFri.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Friday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Fri.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Fri.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Fri.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Fri.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsFri.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinFri.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});

		btnFri.setBackground(Color.WHITE);
		btnFri.setText("Add");
		btnFri.setBounds(1021, 10, 75, 21);
		panel_11_1.add(btnFri);

		final JButton btnSat = new JButton();
		btnSat.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameSpeechTextArea frameSpeechTextArea = (FrameSpeechTextArea) FrameFactory
						.createWindowOfType(FrameSpeechTextArea.class);
				if (cbSwallowEvalSat.isSelected()) {
					frameSpeechTextArea.setCbChecked(true);
				} else {
					frameSpeechTextArea.setCbChecked(false);
				}
				if (txtSdr92526Saturday.getNotes() != null)
					frameSpeechTextArea.setRow2(txtSdr92526Saturday.getNotes());
				frameSpeechTextArea.setRow3(txtSdr92506Sat.getNotes());
				frameSpeechTextArea.setRow4(txtSdr92507Sat.getNotes());
				frameSpeechTextArea.setRow5(txtSdr92532Sat.getNotes());
				frameSpeechTextArea.setRow6(txtOther01Sat.getNotes());
				frameSpeechTextArea.setRow7(txtIncidentsSat.getNotes());
				frameSpeechTextArea.setMin1(getMin1());
				frameSpeechTextArea.setMin2(getMin2());
				frameSpeechTextArea.setMin3(getMin3());
				frameSpeechTextArea.setMin4(getMin4());
				frameSpeechTextArea.setMin5(getMin5());
				frameSpeechTextArea.setMin6(getMin6());
				frameSpeechTextArea.setVisible(true);
				frameSpeechTextArea.setTitle("Saturday");
				if (frameSpeechTextArea.isSaved()) {
					cbSwallowEvalSat.setSelected(frameSpeechTextArea
							.isCbSelected());
					txtSdr92526Saturday.setNotes(frameSpeechTextArea.getRow2());
					txtSdr92506Sat.setNotes(frameSpeechTextArea.getRow3());
					txtSdr92507Sat.setNotes(frameSpeechTextArea.getRow4());
					txtSdr92532Sat.setNotes(frameSpeechTextArea.getRow5());
					txtOther01Sat.setNotes(frameSpeechTextArea.getRow6());
					txtIncidentsSat.setNotes(frameSpeechTextArea.getRow7());
					txtTotalMinSat.setText(frameSpeechTextArea.getTotalMin()
							+ "");
					setMin1(frameSpeechTextArea.getMin1());
					setMin2(frameSpeechTextArea.getMin2());
					setMin3(frameSpeechTextArea.getMin3());
					setMin4(frameSpeechTextArea.getMin4());
					setMin5(frameSpeechTextArea.getMin5());
					setMin6(frameSpeechTextArea.getMin6());
				}
			}
		});

		btnSat.setBackground(Color.WHITE);
		btnSat.setText("Add");
		btnSat.setBounds(1208, 10, 75, 21);
		panel_11_1.add(btnSat);
		setCalendar(calendar.getInstance());
		fillcombo();
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

	// private void doShowPopUp(JTextArea txtArea, String str) {
	// FrameAddTextArea frameAddTextArea = (FrameAddTextArea)
	// FrameFactory.createWindowOfType(FrameAddTextArea.class);
	// frameAddTextArea.setTxtString(txtArea.getText());
	// frameAddTextArea.setLabel(str);
	// frameAddTextArea.setVisible(true);
	// txtArea.setText(frameAddTextArea.getTxtString());
	//
	// }

	public void doSave() {
		try {
			key = MedrexClientManager.getInstance().getSpeechDailyKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord = new PtOtStSpeechDailyRecord();
		refPtOtStSpeechDailyRecord.setResidentId(Global.currentResidenceKey);
		refPtOtStSpeechDailyRecord.setSerial(key);
		refPtOtStSpeechDailyRecord.setCoSignLicDate(dcCoSignLicDate.getDate());
		refPtOtStSpeechDailyRecord.setLicenseNo03(txtLicenseNo03.getText());
		refPtOtStSpeechDailyRecord.setSignature03((String) cmbSignature03
				.getSelectedItem());
		refPtOtStSpeechDailyRecord
				.setPrintTherapInitials03((String) cmbPrintTherapInitials03
						.getSelectedItem());
		refPtOtStSpeechDailyRecord.setFrequency(txt$Frequency.getSelectedItem()
				.toString());
		refPtOtStSpeechDailyRecord.setLicenseNo02(txtLicenseNo02.getText());
		refPtOtStSpeechDailyRecord.setSignature02((String) cmbSignature02
				.getSelectedItem());
		refPtOtStSpeechDailyRecord
				.setPrintTherapInitials02((String) cmbPrintTherapInitials02
						.getSelectedItem());
		refPtOtStSpeechDailyRecord.setCoSignLic(txtCoSignLic.getText());
		refPtOtStSpeechDailyRecord.setLicenseNo01(txtLicenseNo01.getText());
		refPtOtStSpeechDailyRecord.setSignature01((String) cmbSignature01
				.getSelectedItem());
		refPtOtStSpeechDailyRecord
				.setPrintTherapInitials01((String) cmbPrintTherapInitials01
						.getSelectedItem());
		refPtOtStSpeechDailyRecord.setCoSignNa(cbCoSignNa.isSelected());
		refPtOtStSpeechDailyRecord.setInitialsSat((String) cmbInitialsSat
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinSat(txtTotalMinSat.getText());
		refPtOtStSpeechDailyRecord.setIncidentsSat(txtIncidentsSat.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Sat(txtOther01Sat.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Sat(txtSdr92532Sat.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Sat(txtSdr92507Sat.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Sat(txtSdr92506Sat.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Saturday(txtSdr92526Saturday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateSaturday(dcDateSaturday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsFri((String) cmbInitialsFri
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinFri(txtTotalMinFri.getText());
		refPtOtStSpeechDailyRecord.setIncidentsFri(txtIncidentsFri.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Fri(txtOther01Fri.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Fri(txtSdr92532Fri.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Fri(txtSdr92507Fri.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Fri(txtSdr92506Fri.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Friday(txtSdr92526Friday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateFriday(dcDateFriday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsThu((String) cmbInitialsThu
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinThu(txtTotalMinThu.getText());
		refPtOtStSpeechDailyRecord.setIncidentsThu(txtIncidentsThu.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Thu(txtOther01Thu.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Thu(txtSdr92532Thu.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Thu(txtSdr92507Thu.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Thu(txtSdr92506Thu.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Thursday(txtSdr92526Thursday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateThursday(dcDateThursday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsWed((String) cmbInitialsWed
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinWed(txtTotalMinWed.getText());
		refPtOtStSpeechDailyRecord.setIncidentsWed(txtIncidentsWed.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Wed(txtOther01Wed.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Wed(txtSdr92532Wed.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Wed(txtSdr92507Wed.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Wed(txtSdr92506Wed.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Wednesday(txtSdr92526Wednesday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateWednesday(dcDateWednesday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsTue((String) cmbInitialsTue
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinTue(txtTotalMinTue.getText());
		refPtOtStSpeechDailyRecord.setIncidentsTue(txtIncidentsTue.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Tue(txtOther01Tue.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Tue(txtSdr92532Tue.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Tue(txtSdr92507Tue.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Tue(txtSdr92506Tue.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Tuesday(txtSdr92526Tuesday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateTuesday(dcDateTuesday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsMon((String) cmbInitialsMon
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinMon(txtTotalMinMon.getText());
		refPtOtStSpeechDailyRecord.setIncidentsMon(txtIncidentsMon.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Mon(txtOther01Mon.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Mon(txtSdr92532Mon.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Mon(txtSdr92507Mon.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Mon(txtSdr92506Mon.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Monday(txtSdr92526Monday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateMonday(dcDateMonday.getDate());
		refPtOtStSpeechDailyRecord.setInitialsSun((String) cmbInitialsSun
				.getSelectedItem());
		refPtOtStSpeechDailyRecord.setTotalMinSun(txtTotalMinSun.getText());
		refPtOtStSpeechDailyRecord.setIncidentsSun(txtIncidentsSun.getNotes());
		refPtOtStSpeechDailyRecord.setOther01Sun(txtOther01Sun.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92532Sun(txtSdr92532Sun.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92507Sun(txtSdr92507Sun.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92506Sun(txtSdr92506Sun.getNotes());
		refPtOtStSpeechDailyRecord.setSdr92526Sunday(txtSdr92526Sunday
				.getNotes());
		refPtOtStSpeechDailyRecord.setDateSunday(dcDateSunday.getDate());
		refPtOtStSpeechDailyRecord.setOtherRowField01(txtOtherRowField01
				.getText());
		refPtOtStSpeechDailyRecord.setPrecautions(txtPrecautions.getText());
		refPtOtStSpeechDailyRecord.setDx(txtDx.getText());
		refPtOtStSpeechDailyRecord.setOtherField(txtOtherField.getText());
		refPtOtStSpeechDailyRecord.setOther(cbOther.isSelected());
		refPtOtStSpeechDailyRecord.setHmo(cbHmo.isSelected());
		refPtOtStSpeechDailyRecord.setMedB(cbMedB.isSelected());
		refPtOtStSpeechDailyRecord.setMedA(cbMedA.isSelected());
		refPtOtStSpeechDailyRecord.setHicNo(txtHicNo.getText());
		refPtOtStSpeechDailyRecord.setSdr92610Sunday(cbSwallowEvalSun
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Monday(cbSwallowEvalMon
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Tuesday(cbSwallowEvalTues
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Wednesday(cbSwallowEvalWed
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Thursday(cbSwallowEvalThur
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Friday(cbSwallowEvalFri
				.isSelected());
		refPtOtStSpeechDailyRecord.setSdr92610Satuday(cbSwallowEvalSat
				.isSelected());
		try {
			Global.currentPtOtStSpeechDailyRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStSpeechDailyRecord(
							refPtOtStSpeechDailyRecord);
		} catch (Exception e) {
		}
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

	public void updateData() {

		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txt$PatientName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txt$RoomNo.setText(rm.getRoom());
			txtHicNo.setText(rm.getMedicalRecordNum());

		} catch (Exception e) {

		}
		try {
			key = MedrexClientManager.getInstance().getSpeechDailyKeyByDate(
					dcDateSunday.getDate());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		System.out.println("Speech Key is:" + key);
		PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord = null;
		if (key != 0) {
			try {
				refPtOtStSpeechDailyRecord = MedrexClientManager.getInstance()
						.getPtOtStSpeechDailyRecord(key);
			} catch (Exception e) {

			}
			dcCoSignLicDate.setDate(refPtOtStSpeechDailyRecord
					.getCoSignLicDate());
			txtLicenseNo03.setText(refPtOtStSpeechDailyRecord.getLicenseNo03());
			cmbSignature03.setSelectedItem(refPtOtStSpeechDailyRecord
					.getSignature03());
			cmbPrintTherapInitials03.setSelectedItem(refPtOtStSpeechDailyRecord
					.getPrintTherapInitials03());
			txtLicenseNo02.setText(refPtOtStSpeechDailyRecord.getLicenseNo02());
			cmbSignature02.setSelectedItem(refPtOtStSpeechDailyRecord
					.getSignature02());
			cmbPrintTherapInitials02.setSelectedItem(refPtOtStSpeechDailyRecord
					.getPrintTherapInitials02());
			txtCoSignLic.setText(refPtOtStSpeechDailyRecord.getCoSignLic());
			txtLicenseNo01.setText(refPtOtStSpeechDailyRecord.getLicenseNo01());
			cmbSignature01.setSelectedItem(refPtOtStSpeechDailyRecord
					.getSignature01());
			cmbPrintTherapInitials01.setSelectedItem(refPtOtStSpeechDailyRecord

			.getPrintTherapInitials01());
			txt$Frequency.setSelectedItem(refPtOtStSpeechDailyRecord
					.getFrequency());
			cbCoSignNa.setSelected(refPtOtStSpeechDailyRecord.isCoSignNa());
			cmbInitialsSat.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsSat());
			txtTotalMinSat.setText(refPtOtStSpeechDailyRecord.getTotalMinSat());
			txtIncidentsSat.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsSat());
			txtOther01Sat.setNotes(refPtOtStSpeechDailyRecord.getOther01Sat());
			txtSdr92532Sat
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Sat());
			txtSdr92507Sat
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Sat());
			txtSdr92506Sat
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Sat());
			txtSdr92526Saturday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Saturday());
			dcDateSaturday
					.setDate(refPtOtStSpeechDailyRecord.getDateSaturday());
			cmbInitialsFri.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsFri());
			txtTotalMinFri.setText(refPtOtStSpeechDailyRecord.getTotalMinFri());
			txtIncidentsFri.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsFri());
			txtOther01Fri.setNotes(refPtOtStSpeechDailyRecord.getOther01Fri());
			txtSdr92532Fri
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Fri());
			txtSdr92507Fri
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Fri());
			txtSdr92506Fri
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Fri());
			txtSdr92526Friday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Friday());
			dcDateFriday.setDate(refPtOtStSpeechDailyRecord.getDateFriday());
			cmbInitialsThu.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsThu());
			txtTotalMinThu.setText(refPtOtStSpeechDailyRecord.getTotalMinThu());
			txtIncidentsThu.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsThu());
			txtOther01Thu.setNotes(refPtOtStSpeechDailyRecord.getOther01Thu());
			txtSdr92532Thu
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Thu());
			txtSdr92507Thu
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Thu());
			txtSdr92506Thu
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Thu());
			txtSdr92526Thursday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Thursday());
			dcDateThursday
					.setDate(refPtOtStSpeechDailyRecord.getDateThursday());
			cmbInitialsWed.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsWed());
			txtTotalMinWed.setText(refPtOtStSpeechDailyRecord.getTotalMinWed());
			txtIncidentsWed.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsWed());
			txtOther01Wed.setNotes(refPtOtStSpeechDailyRecord.getOther01Wed());
			txtSdr92532Wed
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Wed());
			txtSdr92507Wed
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Wed());
			txtSdr92506Wed
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Wed());
			txtSdr92526Wednesday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Wednesday());
			dcDateWednesday.setDate(refPtOtStSpeechDailyRecord
					.getDateWednesday());
			cmbInitialsTue.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsTue());
			txtTotalMinTue.setText(refPtOtStSpeechDailyRecord.getTotalMinTue());
			txtIncidentsTue.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsTue());
			txtOther01Tue.setNotes(refPtOtStSpeechDailyRecord.getOther01Tue());
			txtSdr92532Tue
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Tue());
			txtSdr92507Tue
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Tue());
			txtSdr92506Tue
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Tue());
			txtSdr92526Tuesday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Tuesday());
			dcDateTuesday.setDate(refPtOtStSpeechDailyRecord.getDateTuesday());
			cmbInitialsMon.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsMon());
			txtTotalMinMon.setText(refPtOtStSpeechDailyRecord.getTotalMinMon());
			txtIncidentsMon.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsMon());
			txtOther01Mon.setNotes(refPtOtStSpeechDailyRecord.getOther01Mon());
			txtSdr92532Mon
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Mon());
			txtSdr92507Mon
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Mon());
			txtSdr92506Mon
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Mon());
			txtSdr92526Monday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Monday());
			dcDateMonday.setDate(refPtOtStSpeechDailyRecord.getDateMonday());
			cmbInitialsSun.setSelectedItem(refPtOtStSpeechDailyRecord
					.getInitialsSun());
			txtTotalMinSun.setText(refPtOtStSpeechDailyRecord.getTotalMinSun());
			txtIncidentsSun.setNotes(refPtOtStSpeechDailyRecord
					.getIncidentsSun());
			txtOther01Sun.setNotes(refPtOtStSpeechDailyRecord.getOther01Sun());
			txtSdr92532Sun
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92532Sun());
			txtSdr92507Sun
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92507Sun());
			txtSdr92506Sun
					.setNotes(refPtOtStSpeechDailyRecord.getSdr92506Sun());
			txtSdr92526Sunday.setNotes(refPtOtStSpeechDailyRecord
					.getSdr92526Sunday());
			dcDateSunday.setDate(refPtOtStSpeechDailyRecord.getDateSunday());
			txtOtherRowField01.setText(refPtOtStSpeechDailyRecord
					.getOtherRowField01());
			txtPrecautions.setText(refPtOtStSpeechDailyRecord.getPrecautions());
			txtDx.setText(refPtOtStSpeechDailyRecord.getDx());
			txtOtherField.setText(refPtOtStSpeechDailyRecord.getOtherField());
			cbOther.setSelected(refPtOtStSpeechDailyRecord.isOther());
			cbHmo.setSelected(refPtOtStSpeechDailyRecord.isHmo());
			cbMedB.setSelected(refPtOtStSpeechDailyRecord.isMedB());
			cbMedA.setSelected(refPtOtStSpeechDailyRecord.isMedA());
			txtHicNo.setText(refPtOtStSpeechDailyRecord.getHicNo());
			cbSwallowEvalSun.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Sunday());
			cbSwallowEvalMon.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Monday());
			cbSwallowEvalTues.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Tuesday());
			cbSwallowEvalWed.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Wednesday());
			cbSwallowEvalThur.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Thursday());
			cbSwallowEvalFri.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Friday());
			cbSwallowEvalSat.setSelected(refPtOtStSpeechDailyRecord
					.getSdr92610Satuday());
		} else {
			setDefaultNotes();
			cbSwallowEvalSun.setSelected(false);
			txtSdr92526Sunday.setNotes(defaultNoteSun1);
			txtSdr92506Sun.setNotes(defaultNoteSun2);
			txtSdr92507Sun.setNotes(defaultNoteSun3);
			txtSdr92532Sun.setNotes(defaultNoteSun4);
			txtOther01Sun.setNotes(defaultNoteSun5);
			txtIncidentsSun.setNotes(defaultNoteSun6);

			cbSwallowEvalMon.setSelected(false);
			txtSdr92526Monday.setNotes(defaultNoteMon1);
			txtSdr92506Mon.setNotes(defaultNoteMon2);
			txtSdr92507Mon.setNotes(defaultNoteMon3);
			txtSdr92532Mon.setNotes(defaultNoteMon4);
			txtOther01Mon.setNotes(defaultNoteMon5);
			txtIncidentsMon.setNotes(defaultNoteMon6);

			cbSwallowEvalTues.setSelected(false);
			txtSdr92526Tuesday.setNotes(defaultNoteTue1);
			txtSdr92506Tue.setNotes(defaultNoteTue2);
			txtSdr92507Tue.setNotes(defaultNoteTue3);
			txtSdr92532Tue.setNotes(defaultNoteTue4);
			txtOther01Tue.setNotes(defaultNoteTue5);
			txtIncidentsTue.setNotes(defaultNoteTue6);

			cbSwallowEvalWed.setSelected(false);
			txtSdr92526Wednesday.setNotes(defaultNoteWed1);
			txtSdr92506Wed.setNotes(defaultNoteWed2);
			txtSdr92507Wed.setNotes(defaultNoteWed3);
			txtSdr92532Wed.setNotes(defaultNoteWed4);
			txtOther01Wed.setNotes(defaultNoteWed5);
			txtIncidentsWed.setNotes(defaultNoteWed6);

			cbSwallowEvalThur.setSelected(false);
			txtSdr92526Thursday.setNotes(defaultNoteThur1);
			txtSdr92506Thu.setNotes(defaultNoteThur2);
			txtSdr92507Thu.setNotes(defaultNoteThur3);
			txtSdr92532Thu.setNotes(defaultNoteThur4);
			txtOther01Thu.setNotes(defaultNoteThur5);
			txtIncidentsThu.setNotes(defaultNoteThur6);

			cbSwallowEvalFri.setSelected(false);
			txtSdr92526Friday.setNotes(defaultNoteFri1);
			txtSdr92506Fri.setNotes(defaultNoteFri2);
			txtSdr92507Fri.setNotes(defaultNoteFri3);
			txtSdr92532Fri.setNotes(defaultNoteFri4);
			txtOther01Fri.setNotes(defaultNoteFri5);
			txtIncidentsFri.setNotes(defaultNoteFri6);

			cbSwallowEvalSat.setSelected(false);
			txtSdr92526Saturday.setNotes(defaultNoteSat1);
			txtSdr92506Sat.setNotes(defaultNoteSat2);
			txtSdr92507Sat.setNotes(defaultNoteSat3);
			txtSdr92532Sat.setNotes(defaultNoteSat4);
			txtOther01Sat.setNotes(defaultNoteSat5);
			txtIncidentsSat.setNotes(defaultNoteSat6);
		}
	}

	public void setDefaultNotes() {
		defaultNoteSun1 = new Notes();
		defaultNoteSun1.setFormName("Speech Daily Record");
		defaultNoteSun1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun1.setNoteText("");

		defaultNoteSun2 = new Notes();
		defaultNoteSun2.setFormName("Speech Daily Record");
		defaultNoteSun2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun2.setNoteText("");

		defaultNoteSun3 = new Notes();
		defaultNoteSun3.setFormName("Speech Daily Record");
		defaultNoteSun3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun3.setNoteText("");

		defaultNoteSun4 = new Notes();
		defaultNoteSun4.setFormName("Speech Daily Record");
		defaultNoteSun4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun4.setNoteText("");

		defaultNoteSun5 = new Notes();
		defaultNoteSun5.setFormName("Speech Daily Record");
		defaultNoteSun5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun5.setNoteText("");

		defaultNoteSun6 = new Notes();
		defaultNoteSun6.setFormName("Speech Daily Record");
		defaultNoteSun6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun6.setNoteText("");

		defaultNoteSun7 = new Notes();
		defaultNoteSun7.setFormName("Speech Daily Record");
		defaultNoteSun7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSun7.setNoteText("");

		defaultNoteMon1 = new Notes();
		defaultNoteMon1.setFormName("Speech Daily Record");
		defaultNoteMon1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon1.setNoteText("");

		defaultNoteMon2 = new Notes();
		defaultNoteMon2.setFormName("Speech Daily Record");
		defaultNoteMon2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon2.setNoteText("");

		defaultNoteMon3 = new Notes();
		defaultNoteMon3.setFormName("Speech Daily Record");
		defaultNoteMon3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon3.setNoteText("");

		defaultNoteMon4 = new Notes();
		defaultNoteMon4.setFormName("Speech Daily Record");
		defaultNoteMon4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon4.setNoteText("");

		defaultNoteMon5 = new Notes();
		defaultNoteMon5.setFormName("Speech Daily Record");
		defaultNoteMon5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon5.setNoteText("");

		defaultNoteMon6 = new Notes();
		defaultNoteMon6.setFormName("Speech Daily Record");
		defaultNoteMon6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon6.setNoteText("");

		defaultNoteMon7 = new Notes();
		defaultNoteMon7.setFormName("Speech Daily Record");
		defaultNoteMon7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteMon7.setNoteText("");

		defaultNoteTue1 = new Notes();
		defaultNoteTue1.setFormName("Speech Daily Record");
		defaultNoteTue1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue1.setNoteText("");

		defaultNoteTue2 = new Notes();
		defaultNoteTue2.setFormName("Speech Daily Record");
		defaultNoteTue2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue2.setNoteText("");

		defaultNoteTue3 = new Notes();
		defaultNoteTue3.setFormName("Speech Daily Record");
		defaultNoteTue3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue3.setNoteText("");

		defaultNoteTue4 = new Notes();
		defaultNoteTue4.setFormName("Speech Daily Record");
		defaultNoteTue4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue4.setNoteText("");

		defaultNoteTue5 = new Notes();
		defaultNoteTue5.setFormName("Speech Daily Record");
		defaultNoteTue5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue5.setNoteText("");

		defaultNoteTue6 = new Notes();
		defaultNoteTue6.setFormName("Speech Daily Record");
		defaultNoteTue6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue6.setNoteText("");

		defaultNoteTue7 = new Notes();
		defaultNoteTue7.setFormName("Speech Daily Record");
		defaultNoteTue7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteTue7.setNoteText("");

		defaultNoteWed1 = new Notes();
		defaultNoteWed1.setFormName("Speech Daily Record");
		defaultNoteWed1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed1.setNoteText("");

		defaultNoteWed2 = new Notes();
		defaultNoteWed2.setFormName("Speech Daily Record");
		defaultNoteWed2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed2.setNoteText("");

		defaultNoteWed3 = new Notes();
		defaultNoteWed3.setFormName("Speech Daily Record");
		defaultNoteWed3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed3.setNoteText("");

		defaultNoteWed4 = new Notes();
		defaultNoteWed4.setFormName("Speech Daily Record");
		defaultNoteWed4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed4.setNoteText("");

		defaultNoteWed5 = new Notes();
		defaultNoteWed5.setFormName("Speech Daily Record");
		defaultNoteWed5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed5.setNoteText("");

		defaultNoteWed6 = new Notes();
		defaultNoteWed6.setFormName("Speech Daily Record");
		defaultNoteWed6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed6.setNoteText("");

		defaultNoteWed7 = new Notes();
		defaultNoteWed7.setFormName("Speech Daily Record");
		defaultNoteWed7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteWed7.setNoteText("");

		defaultNoteThur1 = new Notes();
		defaultNoteThur1.setFormName("Speech Daily Record");
		defaultNoteThur1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur1.setNoteText("");

		defaultNoteThur2 = new Notes();
		defaultNoteThur2.setFormName("Speech Daily Record");
		defaultNoteThur2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur2.setNoteText("");

		defaultNoteThur3 = new Notes();
		defaultNoteThur3.setFormName("Speech Daily Record");
		defaultNoteThur3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur3.setNoteText("");

		defaultNoteThur4 = new Notes();
		defaultNoteThur4.setFormName("Speech Daily Record");
		defaultNoteThur4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur4.setNoteText("");

		defaultNoteThur5 = new Notes();
		defaultNoteThur5.setFormName("Speech Daily Record");
		defaultNoteThur5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur5.setNoteText("");

		defaultNoteThur6 = new Notes();
		defaultNoteThur6.setFormName("Speech Daily Record");
		defaultNoteThur6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur6.setNoteText("");

		defaultNoteThur7 = new Notes();
		defaultNoteThur7.setFormName("Speech Daily Record");
		defaultNoteThur7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteThur7.setNoteText("");

		defaultNoteFri1 = new Notes();
		defaultNoteFri1.setFormName("Speech Daily Record");
		defaultNoteFri1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri1.setNoteText("");

		defaultNoteFri2 = new Notes();
		defaultNoteFri2.setFormName("Speech Daily Record");
		defaultNoteFri2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri2.setNoteText("");

		defaultNoteFri3 = new Notes();
		defaultNoteFri3.setFormName("Speech Daily Record");
		defaultNoteFri3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri3.setNoteText("");

		defaultNoteFri4 = new Notes();
		defaultNoteFri4.setFormName("Speech Daily Record");
		defaultNoteFri4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri4.setNoteText("");

		defaultNoteFri5 = new Notes();
		defaultNoteFri5.setFormName("Speech Daily Record");
		defaultNoteFri5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri5.setNoteText("");

		defaultNoteFri6 = new Notes();
		defaultNoteFri6.setFormName("Speech Daily Record");
		defaultNoteFri6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri6.setNoteText("");

		defaultNoteFri7 = new Notes();
		defaultNoteFri7.setFormName("Speech Daily Record");
		defaultNoteFri7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteFri7.setNoteText("");

		defaultNoteSat1 = new Notes();
		defaultNoteSat1.setFormName("Speech Daily Record");
		defaultNoteSat1.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat1.setNoteText("");

		defaultNoteSat2 = new Notes();
		defaultNoteSat2.setFormName("Speech Daily Record");
		defaultNoteSat2.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat2.setNoteText("");

		defaultNoteSat3 = new Notes();
		defaultNoteSat3.setFormName("Speech Daily Record");
		defaultNoteSat3.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat3.setNoteText("");

		defaultNoteSat4 = new Notes();
		defaultNoteSat4.setFormName("Speech Daily Record");
		defaultNoteSat4.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat4.setNoteText("");

		defaultNoteSat5 = new Notes();
		defaultNoteSat5.setFormName("Speech Daily Record");
		defaultNoteSat5.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat5.setNoteText("");

		defaultNoteSat6 = new Notes();
		defaultNoteSat6.setFormName("Speech Daily Record");
		defaultNoteSat6.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat6.setNoteText("");

		defaultNoteSat7 = new Notes();
		defaultNoteSat7.setFormName("Speech Daily Record");
		defaultNoteSat7.setUserId(Global.currentLoggedInUserKey);
		defaultNoteSat7.setNoteText("");

	}

	public int getMin1() {
		return min1;
	}

	public void setMin1(int min1) {
		this.min1 = min1;
	}

	public int getMin2() {
		return min2;
	}

	public void setMin2(int min2) {
		this.min2 = min2;
	}

	public int getMin3() {
		return min3;
	}

	public void setMin3(int min3) {
		this.min3 = min3;
	}

	public int getMin4() {
		return min4;
	}

	public void setMin4(int min4) {
		this.min4 = min4;
	}

	public int getMin5() {
		return min5;
	}

	public void setMin5(int min5) {
		this.min5 = min5;
	}

	public int getMin6() {
		return min6;
	}

	public void setMin6(int min6) {
		this.min6 = min6;
	}
}
