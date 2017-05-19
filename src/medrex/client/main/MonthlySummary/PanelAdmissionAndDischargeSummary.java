package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.monthlySummary.AdmissionAndDischargeSummary;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.toedter.calendar.JDateChooser;

public class PanelAdmissionAndDischargeSummary extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1206733074936195137L;
	private ButtonGroup bgMaritalS = new ButtonGroup();
	private JTextArea txtAdmitingDiagnosis;
	private ButtonGroup bgSex = new ButtonGroup();
	private JCheckBox cbDied;
	private JRadioButton rbSexM2;
	private JCheckBox cbHospitalFacility;
	private JCheckBox cbAgainstApproval;
	private JPanel panel_28;
	private JCheckBox cbWithApproval;
	private JCheckBox cbTransffered;
	private JCheckBox cbFriendRelatives;
	private JDateChooser dcOriginalAdmitDate2;
	private JCheckBox cbOwnHome;
	private JDateChooser dcDate;
	private JDateChooser dcCurrentAdmitDate2;
	private JDateChooser dcDateOfStay;
	private JTextField txtIns1;
	private JTextField txtBcBs;
	private JTextField txtAddress1;
	private JTextField txtCity1;
	private JTextField txtCountry;
	private JTextField txtSpouse;
	private JTextField txtIns2;
	private JTextField txtVs;
	private JTextField txtMedicaidNo;
	private JTextField txtMedicareNo;
	private JRadioButton rbMaritalStatusD;
	private JTextField txtLevelOfCare;
	private JTextField txtNickName;
	private JTextField txtSsn;
	private JRadioButton rbMaritalStatusS;
	private JTextField txtReligion;
	private JTextField txtCitizen;
	private JTextField txtAge;
	private JDateChooser dcDateOfBirth;
	private JTextField txtPayType;
	private JDateChooser dcCurrentAdmitDate;
	private JDateChooser dcOriginalAdmitDate;
	private JTextField txtMedRecNo;
	private JTextField txtStationRoombed;
	private JRadioButton rbSexF;
	private JRadioButton rbSexM;
	private JTextField txtResidentName;
	private JTextField txtAdmittedForm;
	private JTextField txtHowTransferred;
	private JTextField txtPhone10;
	private JTextField txtPhone9;
	private JTextField txtFuneralHome;
	private JTextField txtDischarge2;
	private JTextField txtAdmissionNo;
	private JTextField txtStationRoom;
	private JTextField txtResidentName2;
	private JTextField txtTitle;
	private JComboBox combReviewedBy;
	private JTextField txtNoOfStayed;
	private JTextField txtDateAndTime;
	private JTextField txtOnSet2;
	private JTextField txtOnSet1;
	private JTextField txtComments;
	private JTextField txtCityStateZip;
	private JTextField txtPreviousAddress;
	private JTextField txtNursingAlert;
	private JTextField txtIndustry;
	private JTextField txtPreviousOccupation;
	private JTextField txtPrimaryLanguage;
	private JTextField txtEducationLevel;
	private JTextField txtPhone14;
	private JTextField txtPowerOfAttorney;
	private JTextField txtPhone16;
	private JTextField txtClergy;
	private JTextField txtPhone13;
	private JTextField txtNameOfChurch;
	private JTextField txtPhone15;
	private JTextField txtAmbulancePreference;
	private JTextField txtPhone12;
	private JTextField txtHospitalPreference;
	private JTextField txtReasons;
	private JTextField txtResidentsAwareOfPrimary;
	private JTextField txtCodeStatus;
	private JTextField txtPrognosis;
	private JTextField txtRehabPotential;
	private JTextField txtAllergies;
	private JTextField txtPhone8;
	private JTextField txtPharmacy;
	private JTextField txtPhone7;
	private JTextField txtZip7;
	private JTextField txtState7;
	private JTextField txtCity7;
	private JTextField txtAddress7;
	private JTextField txtDentist;
	private JTextField txtPhone6;
	private JTextField txtZip6;
	private JTextField txtState6;
	private JTextField txtCity6;
	private JTextField txtAddress6;
	private JTextField txtAlternatePhysician;
	private JTextField txtPhone5;
	private JTextField txtZip5;
	private JTextField txtState5;
	private JTextField txtCity5;
	private JTextField txtAddress5;
	private JTextField txtPhysician;
	private JTextField txtPhoneH4;
	private JTextField txtPhoneW4;
	private JTextField txtZip4;
	private JTextField txtState4;
	private JTextField txtCity4;
	private JTextField txtAddress4;
	private JTextField txtEmergencyContact2;
	private JTextField txtPhoneH3;
	private JTextField txtPhoneW3;
	private JTextField txtZip3;
	private JTextField txtState3;
	private JTextField txtCity3;
	private JTextField txtAddress3;
	private JTextField txtEmergencyContact1;
	private JTextField txtPhoneH2;
	private JTextField txtPhoneW2;
	private JTextField txtZip2;
	private JTextField txtState2;
	private JTextField txtCity2;
	private JTextField txtAddress2;
	private JTextField txtResponsibleParty;
	private JTextField txtPhoneH1;
	private JTextField txtPhoneW1;
	private JTextField txtZip1;
	private JTextField txtState1;
	private JTextField txtPlaceOfBirth;
	private JTextField txtDischarge;
	private JTextField txtRaceNationality;

	public PanelAdmissionAndDischargeSummary() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(new Dimension(1350, 1100));
		setPreferredSize(new Dimension(1344, 1100));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 1343, 1151);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(0, 0, 268, 30);
		panel.add(panel_1);

		final JLabel plazaRehabAndLabel = new JLabel();
		plazaRehabAndLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		plazaRehabAndLabel.setText("PLAZA REHAB AND NURSING CENTER");
		panel_1.add(plazaRehabAndLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(267, 0, 1075, 30);
		panel.add(panel_2);

		final JLabel admissionAndDischargeLabel = new JLabel();
		admissionAndDischargeLabel.setBounds(242, 10, 220, 14);
		panel_2.add(admissionAndDischargeLabel);
		admissionAndDischargeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissionAndDischargeLabel.setBackground(Color.BLACK);
		admissionAndDischargeLabel.setText("ADMISSION AND DISCHARGE SUMMARY");

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 28, 43, 200);
		panel.add(panel_3);

		final JLabel rLabel = new JLabel();
		rLabel.setBounds(10, 10, 27, 159);
		panel_3.add(rLabel);
		rLabel
				.setText("<HTML><BODY>R<BR>E<BR>S<BR>I<BR>D<BR>E<BR>N<BR>T<BR></BODY></HTML>");

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 227, 43, 142);
		panel.add(panel_3_1);

		final JLabel rLabel_1 = new JLabel();
		rLabel_1
				.setText("<HTML><BODY>C<BR>L<BR>I<BR>N<BR>I<BR>C<BR>A<BR>L<BR></BODY></HTML>");
		rLabel_1.setBounds(10, 2, 27, 137);
		panel_3_1.add(rLabel_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(0, 368, 43, 366);
		panel.add(panel_3_1_1);

		final JLabel rLabel_1_1 = new JLabel();
		rLabel_1_1
				.setText("<HTML><BODY>D<BR>I<BR>A<BR>G<BR>N<BR>O<BR>S<BR>E<BR>S</BODY></HTML>");
		rLabel_1_1.setBounds(10, 88, 27, 159);
		panel_3_1_1.add(rLabel_1_1);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(0, 733, 43, 147);
		panel.add(panel_3_1_1_1);

		final JLabel rLabel_1_1_1 = new JLabel();
		rLabel_1_1_1
				.setText("<HTML><BODY>P<BR>E<BR>R<BR>S<BR>O<BR>N<BR>A<BR>L<BR></BODY></HTML>");
		rLabel_1_1_1.setBounds(8, 5, 27, 131);
		panel_3_1_1_1.add(rLabel_1_1_1);

		final JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBounds(0, 879, 43, 193);
		panel.add(panel_3_1_1_1_1);

		final JLabel rLabel_1_1_1_1 = new JLabel();
		rLabel_1_1_1_1.setText("<HTML><BODY>D<BR>C<BR></BODY></HTML>");
		rLabel_1_1_1_1.setBounds(10, 10, 27, 67);
		panel_3_1_1_1_1.add(rLabel_1_1_1_1);

		final JLabel rLabel_1_1_1_1_1 = new JLabel();
		rLabel_1_1_1_1_1.setText("<HTML><BODY>D<BR>X<BR></BODY></HTML>");
		rLabel_1_1_1_1_1.setBounds(10, 72, 23, 52);
		panel_3_1_1_1_1.add(rLabel_1_1_1_1_1);

		final JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBounds(0, 1070, 43, 83);
		panel.add(panel_3_1_1_1_1_1);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(42, 28, 194, 30);
		panel.add(panel_4);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		residentNameLabel.setBounds(5, 5, 79, 20);
		residentNameLabel.setText("RESIDENT NAME");
		panel_4.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(93, 8, 91, 17);
		panel_4.add(txtResidentName);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(339, 28, 153, 30);
		panel.add(panel_6);

		final JLabel stationRoombedLabel = new JLabel();
		stationRoombedLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		stationRoombedLabel.setBounds(5, 5, 96, 18);
		stationRoombedLabel.setText("STATION ROOMBED");
		panel_6.add(stationRoombedLabel);

		txtStationRoombed = new JTextField();
		txtStationRoombed.setBounds(105, 5, 42, 18);
		panel_6.add(txtStationRoombed);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(491, 28, 124, 30);
		panel.add(panel_7);

		final JLabel medRecNoLabel = new JLabel();
		medRecNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		medRecNoLabel.setBounds(5, 0, 67, 24);
		panel_7.add(medRecNoLabel);
		medRecNoLabel.setText("MED REC. NO.");

		txtMedRecNo = new JTextField();
		txtMedRecNo.setBounds(73, 5, 47, 18);
		panel_7.add(txtMedRecNo);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(614, 28, 194, 30);
		panel.add(panel_8);

		final JLabel orignalAdmitDateLabel = new JLabel();
		orignalAdmitDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		orignalAdmitDateLabel.setBounds(5, 5, 107, 14);
		orignalAdmitDateLabel.setText("ORIGNAL ADMIT DATE");
		panel_8.add(orignalAdmitDateLabel);

		dcOriginalAdmitDate = new JDateChooser();
		dcOriginalAdmitDate.setBounds(113, 5, 67, 18);
		panel_8.add(dcOriginalAdmitDate);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(807, 28, 294, 30);
		panel.add(panel_8_1);

		final JLabel orignalAdmitDateLabel_1 = new JLabel();
		orignalAdmitDateLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		orignalAdmitDateLabel_1.setText("CURRENT ADMIT DATE");
		orignalAdmitDateLabel_1.setBounds(5, 5, 109, 14);
		panel_8_1.add(orignalAdmitDateLabel_1);

		dcCurrentAdmitDate = new JDateChooser();
		dcCurrentAdmitDate.setBounds(139, 5, 129, 18);
		panel_8_1.add(dcCurrentAdmitDate);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(1097, 28, 245, 30);
		panel.add(panel_8_1_1);

		final JLabel orignalAdmitDateLabel_1_1 = new JLabel();
		orignalAdmitDateLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		orignalAdmitDateLabel_1_1.setText("DISCHARGE");
		orignalAdmitDateLabel_1_1.setBounds(5, 3, 57, 14);
		panel_8_1_1.add(orignalAdmitDateLabel_1_1);

		txtDischarge = new JTextField();
		txtDischarge.setBounds(68, 5, 167, 18);
		panel_8_1_1.add(txtDischarge);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(41, 57, 195, 30);
		panel.add(panel_9);

		final JLabel nicknameLabel = new JLabel();
		nicknameLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		nicknameLabel.setBounds(7, 5, 54, 14);
		nicknameLabel.setText("NICKNAME");
		panel_9.add(nicknameLabel);

		txtNickName = new JTextField();
		txtNickName.setBounds(91, 5, 91, 19);
		panel_9.add(txtNickName);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(235, 57, 153, 30);
		panel.add(panel_10);

		final JLabel dateOfBirthLabel = new JLabel();
		dateOfBirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		dateOfBirthLabel.setBounds(5, 5, 75, 14);
		dateOfBirthLabel.setText("DATE OF BIRTH");
		panel_10.add(dateOfBirthLabel);

		dcDateOfBirth = new JDateChooser();
		dcDateOfBirth.setBounds(86, 5, 54, 15);
		panel_10.add(dcDateOfBirth);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(387, 57, 65, 30);
		panel.add(panel_11);

		final JLabel ageLabel = new JLabel();
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ageLabel.setBounds(5, 5, 20, 14);
		panel_11.add(ageLabel);
		ageLabel.setText("AGE");

		txtAge = new JTextField();
		txtAge.setBounds(38, 5, 20, 19);
		panel_11.add(txtAge);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(451, 57, 164, 30);
		panel.add(panel_11_1);

		final JLabel ageLabel_1 = new JLabel();
		ageLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ageLabel_1.setText("MARITAL STATUS");
		ageLabel_1.setBounds(5, 5, 98, 14);
		panel_11_1.add(ageLabel_1);

		rbMaritalStatusS = new JRadioButton();
		rbMaritalStatusS.setActionCommand("1");
		bgMaritalS.add(rbMaritalStatusS);
		rbMaritalStatusS.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rbMaritalStatusS.setBackground(Color.WHITE);
		rbMaritalStatusS.setText("S");
		rbMaritalStatusS.setBounds(90, 5, 33, 18);
		panel_11_1.add(rbMaritalStatusS);

		rbMaritalStatusD = new JRadioButton();
		rbMaritalStatusD.setActionCommand("2");
		bgMaritalS.add(rbMaritalStatusD);
		rbMaritalStatusD.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rbMaritalStatusD.setBackground(Color.WHITE);
		rbMaritalStatusD.setText("D");
		rbMaritalStatusD.setBounds(129, 5, 33, 18);
		panel_11_1.add(rbMaritalStatusD);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(614, 57, 65, 30);
		panel.add(panel_12);

		final JLabel ssnLabel = new JLabel();
		ssnLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ssnLabel.setBounds(10, 5, 24, 14);
		ssnLabel.setText("SSN");
		panel_12.add(ssnLabel);

		txtSsn = new JTextField();
		txtSsn.setBounds(32, 5, 32, 15);
		panel_12.add(txtSsn);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(678, 57, 93, 30);
		panel.add(panel_13);

		final JLabel payTypeLabel = new JLabel();
		payTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		payTypeLabel.setBounds(16, 5, 54, 14);
		payTypeLabel.setText("PAY TYPE");
		panel_13.add(payTypeLabel);

		txtPayType = new JTextField();
		txtPayType.setBounds(64, 5, 26, 14);
		panel_13.add(txtPayType);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(769, 57, 110, 30);
		panel.add(panel_14);

		final JLabel lavelOfCareLabel = new JLabel();
		lavelOfCareLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lavelOfCareLabel.setBounds(10, 5, 73, 14);
		lavelOfCareLabel.setText("LEVEL OF CARE");
		panel_14.add(lavelOfCareLabel);

		txtLevelOfCare = new JTextField();
		txtLevelOfCare.setBounds(89, 5, 18, 14);
		panel_14.add(txtLevelOfCare);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(877, 57, 138, 30);
		panel.add(panel_15);

		final JLabel placeOfBirthLabel = new JLabel();
		placeOfBirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		placeOfBirthLabel.setBounds(5, 5, 81, 14);
		placeOfBirthLabel.setText("PLACE OF BIRTH");
		panel_15.add(placeOfBirthLabel);

		txtPlaceOfBirth = new JTextField();
		txtPlaceOfBirth.setBounds(93, 5, 40, 15);
		panel_15.add(txtPlaceOfBirth);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(1014, 57, 86, 30);
		panel.add(panel_16);

		final JLabel citizenLabel = new JLabel();
		citizenLabel.setFont(new Font("", Font.BOLD, 9));
		citizenLabel.setBounds(10, 5, 39, 14);
		citizenLabel.setText("CITIZEN");
		panel_16.add(citizenLabel);

		txtCitizen = new JTextField();
		txtCitizen.setBounds(51, 5, 29, 15);
		panel_16.add(txtCitizen);

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(1243, 57, 99, 30);
		panel.add(panel_17);

		final JLabel religionLabel = new JLabel();
		religionLabel.setFont(new Font("", Font.BOLD, 9));
		religionLabel.setBounds(3, 5, 59, 14);
		religionLabel.setText("RELIGION");
		panel_17.add(religionLabel);

		txtReligion = new JTextField();
		txtReligion.setBounds(55, 5, 34, 16);
		panel_17.add(txtReligion);

		final JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(41, 86, 164, 30);
		panel.add(panel_18);

		final JLabel medicaidmedicalNoLabel = new JLabel();
		medicaidmedicalNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		medicaidmedicalNoLabel.setBounds(5, 0, 120, 20);
		medicaidmedicalNoLabel.setText("MEDICAID/MEDI-CAL. NO");
		panel_18.add(medicaidmedicalNoLabel);

		txtMedicaidNo = new JTextField();
		txtMedicaidNo.setBounds(129, 5, 33, 16);
		panel_18.add(txtMedicaidNo);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setBackground(Color.WHITE);
		panel_19.setLayout(null);
		panel_19.setBounds(204, 86, 131, 30);
		panel.add(panel_19);

		final JLabel countryLabel = new JLabel();
		countryLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		countryLabel.setBounds(5, 5, 48, 14);
		countryLabel.setText("COUNTRY");
		panel_19.add(countryLabel);

		txtCountry = new JTextField();
		txtCountry.setBounds(54, 5, 67, 15);
		panel_19.add(txtCountry);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(334, 86, 144, 30);
		panel.add(panel_20);

		final JLabel medicareNoLabel = new JLabel();
		medicareNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		medicareNoLabel.setBounds(5, 4, 74, 14);
		medicareNoLabel.setText("MEDICARE NO.");
		panel_20.add(medicareNoLabel);

		txtMedicareNo = new JTextField();
		txtMedicareNo.setBounds(79, 5, 57, 15);
		panel_20.add(txtMedicareNo);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setBackground(Color.WHITE);
		panel_21.setLayout(null);
		panel_21.setBounds(477, 86, 153, 30);
		panel.add(panel_21);

		final JLabel bcbsLabel = new JLabel();
		bcbsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		bcbsLabel.setBounds(10, 7, 39, 14);
		bcbsLabel.setText("BC/BS");
		panel_21.add(bcbsLabel);

		txtBcBs = new JTextField();
		txtBcBs.setBounds(63, 6, 60, 14);
		panel_21.add(txtBcBs);

		final JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBounds(629, 85, 243, 30);
		panel.add(panel_22);

		final JLabel vaLabel = new JLabel();
		vaLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		vaLabel.setBounds(8, 5, 37, 14);
		vaLabel.setText("V.A");
		panel_22.add(vaLabel);

		txtVs = new JTextField();
		txtVs.setBounds(34, 5, 137, 14);
		panel_22.add(txtVs);

		final JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setLayout(null);
		panel_23.setBounds(871, 86, 229, 30);
		panel.add(panel_23);

		final JLabel insLabel = new JLabel();
		insLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		insLabel.setBounds(8, 5, 30, 14);
		insLabel.setText("INS.");
		panel_23.add(insLabel);

		txtIns1 = new JTextField();
		txtIns1.setBounds(44, 5, 155, 21);
		panel_23.add(txtIns1);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setBackground(Color.WHITE);
		panel_24.setLayout(null);
		panel_24.setBounds(42, 115, 259, 30);
		panel.add(panel_24);

		final JLabel spouseLabel = new JLabel();
		spouseLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		spouseLabel.setBounds(10, 5, 46, 14);
		spouseLabel.setText("SPOUSE");
		panel_24.add(spouseLabel);

		txtSpouse = new JTextField();
		txtSpouse.setBounds(70, 5, 140, 19);
		panel_24.add(txtSpouse);

		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setBackground(Color.WHITE);
		panel_25.setLayout(null);
		panel_25.setBounds(300, 115, 215, 30);
		panel.add(panel_25);

		final JLabel addressLabel = new JLabel();
		addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		addressLabel.setText("ADDRESS");
		addressLabel.setBounds(3, 7, 54, 14);
		panel_25.add(addressLabel);

		txtAddress1 = new JTextField();
		txtAddress1.setBounds(61, 5, 144, 21);
		panel_25.add(txtAddress1);

		final JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setBackground(Color.WHITE);
		panel_26.setLayout(null);
		panel_26.setBounds(514, 114, 196, 30);
		panel.add(panel_26);

		final JLabel cityLabel = new JLabel();
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cityLabel.setBounds(5, 9, 32, 14);
		cityLabel.setText("CITY");
		panel_26.add(cityLabel);

		txtCity1 = new JTextField();
		txtCity1.setBounds(36, 6, 133, 18);
		panel_26.add(txtCity1);

		final JPanel panel_16_1 = new JPanel();
		panel_16_1.setBackground(Color.WHITE);
		panel_16_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_16_1.setLayout(null);
		panel_16_1.setBounds(1099, 57, 145, 30);
		panel.add(panel_16_1);

		final JLabel citizenLabel_1 = new JLabel();
		citizenLabel_1.setFont(new Font("", Font.BOLD, 9));
		citizenLabel_1.setText("RACE/NATIONALITY");
		citizenLabel_1.setBounds(4, 5, 95, 14);
		panel_16_1.add(citizenLabel_1);

		txtRaceNationality = new JTextField();
		txtRaceNationality.setBounds(104, 5, 34, 16);
		panel_16_1.add(txtRaceNationality);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(235, 28, 105, 30);
		panel.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);

		final JLabel sexLabel = new JLabel();
		sexLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		sexLabel.setBackground(Color.WHITE);
		sexLabel.setBounds(7, 7, 17, 11);
		sexLabel.setText("SEX");
		panel_5.add(sexLabel);

		rbSexM = new JRadioButton();
		bgSex.add(rbSexM);
		rbSexM.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rbSexM.setActionCommand("1");
		rbSexM.setBackground(Color.WHITE);
		rbSexM.setBounds(33, 5, 33, 18);
		panel_5.add(rbSexM);
		rbSexM.setText("M");

		rbSexF = new JRadioButton();
		rbSexF.setActionCommand("2");
		bgSex.add(rbSexF);
		rbSexF.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rbSexF.setBackground(Color.WHITE);
		rbSexF.setBounds(70, 5, 33, 18);
		panel_5.add(rbSexF);
		rbSexF.setText("F");

		final JPanel panel_23_1 = new JPanel();
		panel_23_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_23_1.setBackground(Color.WHITE);
		panel_23_1.setLayout(null);
		panel_23_1.setBounds(1099, 86, 243, 30);
		panel.add(panel_23_1);

		final JLabel insLabel_1 = new JLabel();
		insLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		insLabel_1.setText("INS.");
		insLabel_1.setBounds(6, 9, 29, 14);
		panel_23_1.add(insLabel_1);

		txtIns2 = new JTextField();
		txtIns2.setBounds(32, 5, 169, 21);
		panel_23_1.add(txtIns2);

		final JPanel panel_26_1 = new JPanel();
		panel_26_1.setBackground(Color.WHITE);
		panel_26_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1.setLayout(null);
		panel_26_1.setBounds(709, 114, 164, 30);
		panel.add(panel_26_1);

		final JLabel cityLabel_1 = new JLabel();
		cityLabel_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1.setText("STATE");
		cityLabel_1.setBounds(5, 9, 32, 14);
		panel_26_1.add(cityLabel_1);

		txtState1 = new JTextField();
		txtState1.setBounds(36, 6, 117, 18);
		panel_26_1.add(txtState1);

		final JPanel panel_26_1_1 = new JPanel();
		panel_26_1_1.setBackground(Color.WHITE);
		panel_26_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1.setLayout(null);
		panel_26_1_1.setBounds(871, 115, 229, 30);
		panel.add(panel_26_1_1);

		final JLabel cityLabel_1_1 = new JLabel();
		cityLabel_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1.setText("ZIP");
		cityLabel_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_1.add(cityLabel_1_1);

		txtZip1 = new JTextField();
		txtZip1.setBounds(45, 6, 154, 18);
		panel_26_1_1.add(txtZip1);

		final JPanel panel_26_1_1_1 = new JPanel();
		panel_26_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1.setLayout(null);
		panel_26_1_1_1.setBounds(1099, 115, 243, 30);
		panel.add(panel_26_1_1_1);

		final JLabel cityLabel_1_1_1 = new JLabel();
		cityLabel_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1.setText("PHONE");
		cityLabel_1_1_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1.add(cityLabel_1_1_1);

		txtPhoneW1 = new JTextField();
		txtPhoneW1.setBounds(75, 6, 57, 18);
		panel_26_1_1_1.add(txtPhoneW1);

		final JLabel cityLabel_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1.setText("W");
		cityLabel_1_1_1_1.setBounds(53, 9, 17, 14);
		panel_26_1_1_1.add(cityLabel_1_1_1_1);

		final JLabel cityLabel_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_1.setText("H");
		cityLabel_1_1_1_1_1.setBounds(135, 7, 17, 14);
		panel_26_1_1_1.add(cityLabel_1_1_1_1_1);

		txtPhoneH1 = new JTextField();
		txtPhoneH1.setBounds(153, 5, 57, 18);
		panel_26_1_1_1.add(txtPhoneH1);

		final JPanel panel_24_1 = new JPanel();
		panel_24_1.setBackground(Color.WHITE);
		panel_24_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1.setLayout(null);
		panel_24_1.setBounds(42, 142, 259, 30);
		panel.add(panel_24_1);

		final JLabel spouseLabel_1 = new JLabel();
		spouseLabel_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1.setText("RESPONSIBLE PARTY");
		spouseLabel_1.setBounds(10, 5, 98, 14);
		panel_24_1.add(spouseLabel_1);

		txtResponsibleParty = new JTextField();
		txtResponsibleParty.setBounds(123, 5, 87, 19);
		panel_24_1.add(txtResponsibleParty);

		final JPanel panel_25_1 = new JPanel();
		panel_25_1.setBackground(Color.WHITE);
		panel_25_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1.setLayout(null);
		panel_25_1.setBounds(300, 142, 215, 30);
		panel.add(panel_25_1);

		final JLabel addressLabel_1 = new JLabel();
		addressLabel_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1.setText("ADDRESS");
		addressLabel_1.setBounds(3, 7, 54, 14);
		panel_25_1.add(addressLabel_1);

		txtAddress2 = new JTextField();
		txtAddress2.setBounds(61, 5, 144, 21);
		panel_25_1.add(txtAddress2);

		final JPanel panel_26_2 = new JPanel();
		panel_26_2.setBackground(Color.WHITE);
		panel_26_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2.setLayout(null);
		panel_26_2.setBounds(514, 141, 196, 30);
		panel.add(panel_26_2);

		final JLabel cityLabel_2 = new JLabel();
		cityLabel_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2.setText("CITY");
		cityLabel_2.setBounds(5, 9, 32, 14);
		panel_26_2.add(cityLabel_2);

		txtCity2 = new JTextField();
		txtCity2.setBounds(36, 6, 133, 18);
		panel_26_2.add(txtCity2);

		final JPanel panel_26_1_2 = new JPanel();
		panel_26_1_2.setBackground(Color.WHITE);
		panel_26_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2.setLayout(null);
		panel_26_1_2.setBounds(709, 141, 164, 30);
		panel.add(panel_26_1_2);

		final JLabel cityLabel_1_2 = new JLabel();
		cityLabel_1_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2.setText("STATE");
		cityLabel_1_2.setBounds(5, 9, 32, 14);
		panel_26_1_2.add(cityLabel_1_2);

		txtState2 = new JTextField();
		txtState2.setBounds(36, 6, 117, 18);
		panel_26_1_2.add(txtState2);

		final JPanel panel_26_1_1_2 = new JPanel();
		panel_26_1_1_2.setBackground(Color.WHITE);
		panel_26_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2.setLayout(null);
		panel_26_1_1_2.setBounds(871, 142, 229, 30);
		panel.add(panel_26_1_1_2);

		final JLabel cityLabel_1_1_2 = new JLabel();
		cityLabel_1_1_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2.setText("ZIP");
		cityLabel_1_1_2.setBounds(5, 9, 32, 14);
		panel_26_1_1_2.add(cityLabel_1_1_2);

		txtZip2 = new JTextField();
		txtZip2.setBounds(45, 6, 154, 18);
		panel_26_1_1_2.add(txtZip2);

		final JPanel panel_26_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1.setBounds(1099, 142, 243, 30);
		panel.add(panel_26_1_1_1_1);

		final JLabel cityLabel_1_1_1_2 = new JLabel();
		cityLabel_1_1_1_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2.setText("PHONE");
		cityLabel_1_1_1_2.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1.add(cityLabel_1_1_1_2);

		txtPhoneW2 = new JTextField();
		txtPhoneW2.setBounds(75, 6, 57, 18);
		panel_26_1_1_1_1.add(txtPhoneW2);

		final JLabel cityLabel_1_1_1_1_2 = new JLabel();
		cityLabel_1_1_1_1_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_2.setText("W");
		cityLabel_1_1_1_1_2.setBounds(53, 9, 17, 14);
		panel_26_1_1_1_1.add(cityLabel_1_1_1_1_2);

		final JLabel cityLabel_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_1_1.setText("H");
		cityLabel_1_1_1_1_1_1.setBounds(135, 7, 17, 14);
		panel_26_1_1_1_1.add(cityLabel_1_1_1_1_1_1);

		txtPhoneH2 = new JTextField();
		txtPhoneH2.setBounds(153, 5, 57, 18);
		panel_26_1_1_1_1.add(txtPhoneH2);

		final JPanel panel_24_1_1 = new JPanel();
		panel_24_1_1.setBackground(Color.WHITE);
		panel_24_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1.setLayout(null);
		panel_24_1_1.setBounds(42, 171, 259, 30);
		panel.add(panel_24_1_1);

		final JLabel spouseLabel_1_1 = new JLabel();
		spouseLabel_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1.setText("EMERGENCY  CONTACT");
		spouseLabel_1_1.setBounds(10, 5, 107, 14);
		panel_24_1_1.add(spouseLabel_1_1);

		txtEmergencyContact1 = new JTextField();
		txtEmergencyContact1.setBounds(123, 5, 87, 19);
		panel_24_1_1.add(txtEmergencyContact1);

		final JPanel panel_25_1_1 = new JPanel();
		panel_25_1_1.setBackground(Color.WHITE);
		panel_25_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1.setLayout(null);
		panel_25_1_1.setBounds(300, 171, 215, 30);
		panel.add(panel_25_1_1);

		final JLabel addressLabel_1_1 = new JLabel();
		addressLabel_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1.setText("ADDRESS");
		addressLabel_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1.add(addressLabel_1_1);

		txtAddress3 = new JTextField();
		txtAddress3.setBounds(61, 5, 144, 21);
		panel_25_1_1.add(txtAddress3);

		final JPanel panel_26_2_1 = new JPanel();
		panel_26_2_1.setBackground(Color.WHITE);
		panel_26_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1.setLayout(null);
		panel_26_2_1.setBounds(514, 170, 196, 31);
		panel.add(panel_26_2_1);

		final JLabel cityLabel_2_1 = new JLabel();
		cityLabel_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1.setText("CITY");
		cityLabel_2_1.setBounds(5, 9, 32, 14);
		panel_26_2_1.add(cityLabel_2_1);

		txtCity3 = new JTextField();
		txtCity3.setBounds(36, 6, 133, 18);
		panel_26_2_1.add(txtCity3);

		final JPanel panel_26_1_2_1 = new JPanel();
		panel_26_1_2_1.setBackground(Color.WHITE);
		panel_26_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1.setLayout(null);
		panel_26_1_2_1.setBounds(709, 169, 164, 32);
		panel.add(panel_26_1_2_1);

		final JLabel cityLabel_1_2_1 = new JLabel();
		cityLabel_1_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1.setText("STATE");
		cityLabel_1_2_1.setBounds(5, 9, 32, 14);
		panel_26_1_2_1.add(cityLabel_1_2_1);

		txtState3 = new JTextField();
		txtState3.setBounds(36, 6, 117, 18);
		panel_26_1_2_1.add(txtState3);

		final JPanel panel_26_1_1_2_1 = new JPanel();
		panel_26_1_1_2_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2_1.setLayout(null);
		panel_26_1_1_2_1.setBounds(871, 171, 229, 30);
		panel.add(panel_26_1_1_2_1);

		final JLabel cityLabel_1_1_2_1 = new JLabel();
		cityLabel_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1.setText("ZIP");
		cityLabel_1_1_2_1.setBounds(5, 9, 32, 14);
		panel_26_1_1_2_1.add(cityLabel_1_1_2_1);

		txtZip3 = new JTextField();
		txtZip3.setBounds(45, 6, 154, 18);
		panel_26_1_1_2_1.add(txtZip3);

		final JPanel panel_26_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1.setBounds(1099, 171, 243, 30);
		panel.add(panel_26_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1 = new JLabel();
		cityLabel_1_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1.setText("PHONE");
		cityLabel_1_1_1_2_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1_1.add(cityLabel_1_1_1_2_1);

		txtPhoneW3 = new JTextField();
		txtPhoneW3.setBounds(75, 6, 57, 18);
		panel_26_1_1_1_1_1.add(txtPhoneW3);

		final JLabel cityLabel_1_1_1_1_2_1 = new JLabel();
		cityLabel_1_1_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_2_1.setText("W");
		cityLabel_1_1_1_1_2_1.setBounds(53, 9, 17, 14);
		panel_26_1_1_1_1_1.add(cityLabel_1_1_1_1_2_1);

		final JLabel cityLabel_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_1_1_1.setText("H");
		cityLabel_1_1_1_1_1_1_1.setBounds(135, 7, 17, 14);
		panel_26_1_1_1_1_1.add(cityLabel_1_1_1_1_1_1_1);

		txtPhoneH3 = new JTextField();
		txtPhoneH3.setBounds(153, 5, 57, 18);
		panel_26_1_1_1_1_1.add(txtPhoneH3);

		final JPanel panel_24_1_1_1 = new JPanel();
		panel_24_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1.setLayout(null);
		panel_24_1_1_1.setBounds(42, 199, 259, 30);
		panel.add(panel_24_1_1_1);

		final JLabel spouseLabel_1_1_1 = new JLabel();
		spouseLabel_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1.setText("EMERGENCY CONTACT");
		spouseLabel_1_1_1.setBounds(10, 5, 108, 14);
		panel_24_1_1_1.add(spouseLabel_1_1_1);

		txtEmergencyContact2 = new JTextField();
		txtEmergencyContact2.setBounds(124, 5, 86, 19);
		panel_24_1_1_1.add(txtEmergencyContact2);

		final JPanel panel_25_1_1_1 = new JPanel();
		panel_25_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1.setLayout(null);
		panel_25_1_1_1.setBounds(300, 199, 215, 30);
		panel.add(panel_25_1_1_1);

		final JLabel addressLabel_1_1_1 = new JLabel();
		addressLabel_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1.setText("ADDRESS");
		addressLabel_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1.add(addressLabel_1_1_1);

		txtAddress4 = new JTextField();
		txtAddress4.setBounds(61, 5, 144, 21);
		panel_25_1_1_1.add(txtAddress4);

		final JPanel panel_26_2_1_1 = new JPanel();
		panel_26_2_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1.setLayout(null);
		panel_26_2_1_1.setBounds(514, 199, 196, 30);
		panel.add(panel_26_2_1_1);

		final JLabel cityLabel_2_1_1 = new JLabel();
		cityLabel_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1.setText("CITY");
		cityLabel_2_1_1.setBounds(5, 9, 32, 14);
		panel_26_2_1_1.add(cityLabel_2_1_1);

		txtCity4 = new JTextField();
		txtCity4.setBounds(36, 6, 133, 18);
		panel_26_2_1_1.add(txtCity4);

		final JPanel panel_26_1_2_1_1 = new JPanel();
		panel_26_1_2_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1_1.setLayout(null);
		panel_26_1_2_1_1.setBounds(709, 199, 164, 30);
		panel.add(panel_26_1_2_1_1);

		final JLabel cityLabel_1_2_1_1 = new JLabel();
		cityLabel_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1.setText("STATE");
		cityLabel_1_2_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_2_1_1.add(cityLabel_1_2_1_1);

		txtState4 = new JTextField();
		txtState4.setBounds(36, 6, 117, 18);
		panel_26_1_2_1_1.add(txtState4);

		final JPanel panel_26_1_1_2_1_1 = new JPanel();
		panel_26_1_1_2_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2_1_1.setLayout(null);
		panel_26_1_1_2_1_1.setBounds(871, 199, 229, 30);
		panel.add(panel_26_1_1_2_1_1);

		final JLabel cityLabel_1_1_2_1_1 = new JLabel();
		cityLabel_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1.setText("ZIP");
		cityLabel_1_1_2_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_1_2_1_1.add(cityLabel_1_1_2_1_1);

		txtZip4 = new JTextField();
		txtZip4.setBounds(45, 6, 154, 18);
		panel_26_1_1_2_1_1.add(txtZip4);

		final JPanel panel_26_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1.setBounds(1099, 199, 243, 30);
		panel.add(panel_26_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1.setText("PHONE");
		cityLabel_1_1_1_2_1_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1);

		txtPhoneW4 = new JTextField();
		txtPhoneW4.setBounds(75, 6, 57, 18);
		panel_26_1_1_1_1_1_1.add(txtPhoneW4);

		final JLabel cityLabel_1_1_1_1_2_1_1 = new JLabel();
		cityLabel_1_1_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_2_1_1.setText("W");
		cityLabel_1_1_1_1_2_1_1.setBounds(53, 9, 17, 14);
		panel_26_1_1_1_1_1_1.add(cityLabel_1_1_1_1_2_1_1);

		final JLabel cityLabel_1_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_1_1_1_1_1.setText("H");
		cityLabel_1_1_1_1_1_1_1_1.setBounds(135, 7, 17, 14);
		panel_26_1_1_1_1_1_1.add(cityLabel_1_1_1_1_1_1_1_1);

		txtPhoneH4 = new JTextField();
		txtPhoneH4.setBounds(153, 5, 57, 18);
		panel_26_1_1_1_1_1_1.add(txtPhoneH4);

		final JPanel panel_24_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1.setBounds(42, 227, 259, 30);
		panel.add(panel_24_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1.setText("PHYSICIAN");
		spouseLabel_1_1_1_1.setBounds(10, 5, 54, 14);
		panel_24_1_1_1_1.add(spouseLabel_1_1_1_1);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(125, 5, 85, 19);
		panel_24_1_1_1_1.add(txtPhysician);

		final JPanel panel_25_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1.setBounds(300, 227, 215, 30);
		panel.add(panel_25_1_1_1_1);

		final JLabel addressLabel_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1.setText("ADDRESS");
		addressLabel_1_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1.add(addressLabel_1_1_1_1);

		txtAddress5 = new JTextField();
		txtAddress5.setBounds(61, 5, 144, 21);
		panel_25_1_1_1_1.add(txtAddress5);

		final JPanel panel_26_2_1_1_1 = new JPanel();
		panel_26_2_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1.setLayout(null);
		panel_26_2_1_1_1.setBounds(514, 227, 196, 30);
		panel.add(panel_26_2_1_1_1);

		final JLabel cityLabel_2_1_1_1 = new JLabel();
		cityLabel_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1.setText("CITY");
		cityLabel_2_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_2_1_1_1.add(cityLabel_2_1_1_1);

		txtCity5 = new JTextField();
		txtCity5.setBounds(36, 6, 133, 18);
		panel_26_2_1_1_1.add(txtCity5);

		final JPanel panel_26_1_2_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1.setBounds(709, 227, 164, 30);
		panel.add(panel_26_1_2_1_1_1);

		final JLabel cityLabel_1_2_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1.setText("STATE");
		cityLabel_1_2_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_2_1_1_1.add(cityLabel_1_2_1_1_1);

		txtState5 = new JTextField();
		txtState5.setBounds(36, 6, 117, 18);
		panel_26_1_2_1_1_1.add(txtState5);

		final JPanel panel_26_1_1_2_1_1_1 = new JPanel();
		panel_26_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2_1_1_1.setLayout(null);
		panel_26_1_1_2_1_1_1.setBounds(871, 227, 229, 30);
		panel.add(panel_26_1_1_2_1_1_1);

		final JLabel cityLabel_1_1_2_1_1_1 = new JLabel();
		cityLabel_1_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1_1.setText("ZIP");
		cityLabel_1_1_2_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_1_2_1_1_1.add(cityLabel_1_1_2_1_1_1);

		txtZip5 = new JTextField();
		txtZip5.setBounds(45, 6, 154, 18);
		panel_26_1_1_2_1_1_1.add(txtZip5);

		final JPanel panel_26_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1_1.setBounds(1099, 227, 243, 30);
		panel.add(panel_26_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1_1.setText("PHONE");
		cityLabel_1_1_1_2_1_1_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1_1);

		txtPhone5 = new JTextField();
		txtPhone5.setBounds(75, 6, 114, 18);
		panel_26_1_1_1_1_1_1_1.add(txtPhone5);

		final JPanel panel_24_1_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1.setBounds(42, 254, 259, 30);
		panel.add(panel_24_1_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1.setText("ALTERNATE PHYSICIAN");
		spouseLabel_1_1_1_1_1.setBounds(10, 5, 108, 14);
		panel_24_1_1_1_1_1.add(spouseLabel_1_1_1_1_1);

		txtAlternatePhysician = new JTextField();
		txtAlternatePhysician.setBounds(124, 5, 86, 19);
		panel_24_1_1_1_1_1.add(txtAlternatePhysician);

		final JPanel panel_25_1_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1.setBounds(300, 254, 215, 30);
		panel.add(panel_25_1_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1.setText("ADDRESS");
		addressLabel_1_1_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1.add(addressLabel_1_1_1_1_1);

		txtAddress6 = new JTextField();
		txtAddress6.setBounds(61, 5, 144, 21);
		panel_25_1_1_1_1_1.add(txtAddress6);

		final JPanel panel_26_2_1_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1.setBounds(514, 254, 196, 30);
		panel.add(panel_26_2_1_1_1_1);

		final JLabel cityLabel_2_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1.setText("CITY");
		cityLabel_2_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_2_1_1_1_1.add(cityLabel_2_1_1_1_1);

		txtCity6 = new JTextField();
		txtCity6.setBounds(36, 6, 133, 18);
		panel_26_2_1_1_1_1.add(txtCity6);

		final JPanel panel_26_1_2_1_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1_1.setBounds(709, 254, 164, 30);
		panel.add(panel_26_1_2_1_1_1_1);

		final JLabel cityLabel_1_2_1_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1_1.setText("STATE");
		cityLabel_1_2_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_2_1_1_1_1.add(cityLabel_1_2_1_1_1_1);

		txtState6 = new JTextField();
		txtState6.setBounds(36, 6, 117, 18);
		panel_26_1_2_1_1_1_1.add(txtState6);

		final JPanel panel_26_1_1_2_1_1_1_1 = new JPanel();
		panel_26_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2_1_1_1_1.setLayout(null);
		panel_26_1_1_2_1_1_1_1.setBounds(871, 254, 229, 30);
		panel.add(panel_26_1_1_2_1_1_1_1);

		final JLabel cityLabel_1_1_2_1_1_1_1 = new JLabel();
		cityLabel_1_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1_1_1.setText("ZIP");
		cityLabel_1_1_2_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_1_2_1_1_1_1.add(cityLabel_1_1_2_1_1_1_1);

		txtZip6 = new JTextField();
		txtZip6.setBounds(45, 6, 154, 18);
		panel_26_1_1_2_1_1_1_1.add(txtZip6);

		final JPanel panel_26_1_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1_1_1.setBounds(1099, 254, 243, 30);
		panel.add(panel_26_1_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1_1_1.setText("PHONE");
		cityLabel_1_1_1_2_1_1_1_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1_1_1);

		txtPhone6 = new JTextField();
		txtPhone6.setBounds(75, 6, 117, 18);
		panel_26_1_1_1_1_1_1_1_1.add(txtPhone6);

		final JPanel panel_24_1_1_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1.setBounds(42, 281, 259, 30);
		panel.add(panel_24_1_1_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1.setText("DENTIST");
		spouseLabel_1_1_1_1_1_1.setBounds(10, 5, 108, 14);
		panel_24_1_1_1_1_1_1.add(spouseLabel_1_1_1_1_1_1);

		txtDentist = new JTextField();
		txtDentist.setBounds(124, 5, 86, 19);
		panel_24_1_1_1_1_1_1.add(txtDentist);

		final JPanel panel_25_1_1_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1.setBounds(300, 281, 215, 30);
		panel.add(panel_25_1_1_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1.setText("ADDRESS");
		addressLabel_1_1_1_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1.add(addressLabel_1_1_1_1_1_1);

		txtAddress7 = new JTextField();
		txtAddress7.setBounds(61, 5, 144, 21);
		panel_25_1_1_1_1_1_1.add(txtAddress7);

		final JPanel panel_26_2_1_1_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1.setBounds(514, 281, 196, 30);
		panel.add(panel_26_2_1_1_1_1_1);

		final JLabel cityLabel_2_1_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1.setText("CITY");
		cityLabel_2_1_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_2_1_1_1_1_1.add(cityLabel_2_1_1_1_1_1);

		txtCity7 = new JTextField();
		txtCity7.setBounds(36, 6, 133, 18);
		panel_26_2_1_1_1_1_1.add(txtCity7);

		final JPanel panel_26_1_2_1_1_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1_1_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1_1_1.setBounds(709, 281, 164, 30);
		panel.add(panel_26_1_2_1_1_1_1_1);

		final JLabel cityLabel_1_2_1_1_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1_1_1.setText("STATE");
		cityLabel_1_2_1_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_2_1_1_1_1_1.add(cityLabel_1_2_1_1_1_1_1);

		txtState7 = new JTextField();
		txtState7.setBounds(36, 6, 117, 18);
		panel_26_1_2_1_1_1_1_1.add(txtState7);

		final JPanel panel_26_1_1_2_1_1_1_1_1 = new JPanel();
		panel_26_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_1_2_1_1_1_1_1.setLayout(null);
		panel_26_1_1_2_1_1_1_1_1.setBounds(871, 281, 229, 30);
		panel.add(panel_26_1_1_2_1_1_1_1_1);

		final JLabel cityLabel_1_1_2_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1_1_1_1.setText("ZIP");
		cityLabel_1_1_2_1_1_1_1_1.setBounds(5, 9, 32, 14);
		panel_26_1_1_2_1_1_1_1_1.add(cityLabel_1_1_2_1_1_1_1_1);

		txtZip7 = new JTextField();
		txtZip7.setBounds(45, 6, 154, 18);
		panel_26_1_1_2_1_1_1_1_1.add(txtZip7);

		final JPanel panel_26_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1_1_1_1.setBounds(1099, 281, 243, 30);
		panel.add(panel_26_1_1_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1_1_1_1.setText("PHONE");
		cityLabel_1_1_1_2_1_1_1_1_1.setBounds(5, 9, 42, 14);
		panel_26_1_1_1_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1_1_1_1);

		txtPhone7 = new JTextField();
		txtPhone7.setBounds(75, 6, 118, 18);
		panel_26_1_1_1_1_1_1_1_1_1.add(txtPhone7);

		final JPanel panel_24_1_1_1_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_1.setBounds(42, 309, 259, 30);
		panel.add(panel_24_1_1_1_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_1.setText("PHARMACY");
		spouseLabel_1_1_1_1_1_1_1.setBounds(10, 5, 108, 14);
		panel_24_1_1_1_1_1_1_1.add(spouseLabel_1_1_1_1_1_1_1);

		txtPharmacy = new JTextField();
		txtPharmacy.setBounds(124, 5, 86, 19);
		panel_24_1_1_1_1_1_1_1.add(txtPharmacy);

		final JPanel panel_25_1_1_1_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_1.setBounds(300, 309, 216, 30);
		panel.add(panel_25_1_1_1_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_1.setText("PHONE");
		addressLabel_1_1_1_1_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_1.add(addressLabel_1_1_1_1_1_1_1);

		txtPhone8 = new JTextField();
		txtPhone8.setBounds(61, 5, 142, 21);
		panel_25_1_1_1_1_1_1_1.add(txtPhone8);

		final JPanel panel_26_2_1_1_1_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1_1.setBounds(515, 309, 499, 30);
		panel.add(panel_26_2_1_1_1_1_1_1);

		final JLabel cityLabel_2_1_1_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_1.setText("ALLERGIES");
		cityLabel_2_1_1_1_1_1_1.setBounds(5, 9, 59, 14);
		panel_26_2_1_1_1_1_1_1.add(cityLabel_2_1_1_1_1_1_1);

		txtAllergies = new JTextField();
		txtAllergies.setBounds(64, 6, 408, 18);
		panel_26_2_1_1_1_1_1_1.add(txtAllergies);

		final JPanel panel_26_1_1_2_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_1_2_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_2_1_1_1_1_1_1.setBounds(1013, 309, 170, 30);
		panel.add(panel_26_1_1_2_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_2_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_2_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1_1_1_1_1.setText("REHAB POTENTIAL");
		cityLabel_1_1_2_1_1_1_1_1_1.setBounds(5, 9, 91, 14);
		panel_26_1_1_2_1_1_1_1_1_1.add(cityLabel_1_1_2_1_1_1_1_1_1);

		txtRehabPotential = new JTextField();
		txtRehabPotential.setBounds(102, 6, 31, 18);
		panel_26_1_1_2_1_1_1_1_1_1.add(txtRehabPotential);

		final JPanel panel_26_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1_1_1_1_1.setBounds(1182, 309, 160, 30);
		panel.add(panel_26_1_1_1_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1_1_1_1_1.setText("PROGNOSIS");
		cityLabel_1_1_1_2_1_1_1_1_1_1.setBounds(5, 9, 57, 14);
		panel_26_1_1_1_1_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1_1_1_1_1);

		txtPrognosis = new JTextField();
		txtPrognosis.setBounds(75, 6, 67, 18);
		panel_26_1_1_1_1_1_1_1_1_1_1.add(txtPrognosis);

		final JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(42, 365, 1299, 370);
		panel.add(panel_27);

		final JLabel admitingDiagnosisprimaryAndLabel = new JLabel();
		admitingDiagnosisprimaryAndLabel.setFont(new Font("", Font.BOLD, 9));
		admitingDiagnosisprimaryAndLabel.setBounds(5, 0, 258, 28);
		admitingDiagnosisprimaryAndLabel
				.setText("ADMITING DIAGNOSIS(PRIMARY AND SECONDARY)");
		panel_27.add(admitingDiagnosisprimaryAndLabel);

		final JLabel codeStatusLabel = new JLabel();
		codeStatusLabel.setFont(new Font("", Font.BOLD, 9));
		codeStatusLabel.setText("CODE STATUS");
		codeStatusLabel.setBounds(5, 296, 66, 16);
		panel_27.add(codeStatusLabel);

		txtCodeStatus = new JTextField();
		txtCodeStatus.setBounds(72, 293, 291, 19);
		panel_27.add(txtCodeStatus);

		final JLabel codeStatusLabel_1 = new JLabel();
		codeStatusLabel_1.setFont(new Font("", Font.BOLD, 9));
		codeStatusLabel_1.setText("RESIDENTS AWARE OF PRIMARY DIAGNOSIS");
		codeStatusLabel_1.setBounds(405, 296, 208, 16);
		panel_27.add(codeStatusLabel_1);

		txtResidentsAwareOfPrimary = new JTextField();
		txtResidentsAwareOfPrimary.setBounds(619, 292, 66, 19);
		panel_27.add(txtResidentsAwareOfPrimary);

		final JLabel reasonsLabel = new JLabel();
		reasonsLabel.setFont(new Font("", Font.BOLD, 9));
		reasonsLabel.setText("REASONS");
		reasonsLabel.setBounds(702, 294, 53, 16);
		panel_27.add(reasonsLabel);

		txtReasons = new JTextField();
		txtReasons.setBounds(755, 292, 535, 20);
		panel_27.add(txtReasons);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 34, 1298, 256);
		panel_27.add(scrollPane);

		txtAdmitingDiagnosis = new JTextArea();
		scrollPane.setViewportView(txtAdmitingDiagnosis);
		txtAdmitingDiagnosis.setBorder(new LineBorder(Color.black, 1, false));

		final JPanel panel_24_1_1_1_1_1_1_2 = new JPanel();
		panel_24_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1_1_2.setLayout(null);
		panel_24_1_1_1_1_1_1_2.setBounds(40, 734, 396, 30);
		panel.add(panel_24_1_1_1_1_1_1_2);

		final JLabel spouseLabel_1_1_1_1_1_1_2 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2.setText("HOSPITAL PREFERENCE");
		spouseLabel_1_1_1_1_1_1_2.setBounds(10, 5, 121, 14);
		panel_24_1_1_1_1_1_1_2.add(spouseLabel_1_1_1_1_1_1_2);

		txtHospitalPreference = new JTextField();
		txtHospitalPreference.setBounds(141, 5, 243, 19);
		panel_24_1_1_1_1_1_1_2.add(txtHospitalPreference);

		final JPanel panel_25_1_1_1_1_1_1_2 = new JPanel();
		panel_25_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1_1_2.setLayout(null);
		panel_25_1_1_1_1_1_1_2.setBounds(435, 734, 205, 30);
		panel.add(panel_25_1_1_1_1_1_1_2);

		final JLabel addressLabel_1_1_1_1_1_1_2 = new JLabel();
		addressLabel_1_1_1_1_1_1_2.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_2.setText("PHONE");
		addressLabel_1_1_1_1_1_1_2.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_2.add(addressLabel_1_1_1_1_1_1_2);

		txtPhone12 = new JTextField();
		txtPhone12.setBounds(61, 5, 121, 21);
		panel_25_1_1_1_1_1_1_2.add(txtPhone12);

		final JPanel panel_26_2_1_1_1_1_1_2 = new JPanel();
		panel_26_2_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1_1_2.setLayout(null);
		panel_26_2_1_1_1_1_1_2.setBounds(639, 734, 383, 30);
		panel.add(panel_26_2_1_1_1_1_1_2);

		final JLabel cityLabel_2_1_1_1_1_1_2 = new JLabel();
		cityLabel_2_1_1_1_1_1_2.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2.setText("AMBULANCE PREFERENCE");
		cityLabel_2_1_1_1_1_1_2.setBounds(5, 9, 134, 14);
		panel_26_2_1_1_1_1_1_2.add(cityLabel_2_1_1_1_1_1_2);

		txtAmbulancePreference = new JTextField();
		txtAmbulancePreference.setBounds(145, 6, 232, 18);
		panel_26_2_1_1_1_1_1_2.add(txtAmbulancePreference);

		final JPanel panel_26_1_2_1_1_1_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_2_1_1_1_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1_1_1_1.setBounds(1021, 734, 321, 30);
		panel.add(panel_26_1_2_1_1_1_1_1_1);

		final JLabel cityLabel_1_2_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1_1_1_1.setText("PHONE");
		cityLabel_1_2_1_1_1_1_1_1.setBounds(5, 9, 43, 14);
		panel_26_1_2_1_1_1_1_1_1.add(cityLabel_1_2_1_1_1_1_1_1);

		txtPhone15 = new JTextField();
		txtPhone15.setBounds(54, 5, 223, 18);
		panel_26_1_2_1_1_1_1_1_1.add(txtPhone15);

		final JPanel panel_24_1_1_1_1_1_1_2_1 = new JPanel();
		panel_24_1_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1_1_2_1.setLayout(null);
		panel_24_1_1_1_1_1_1_2_1.setBounds(42, 763, 394, 30);
		panel.add(panel_24_1_1_1_1_1_1_2_1);

		final JLabel spouseLabel_1_1_1_1_1_1_2_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2_1.setText("NAME OF CHURCH");
		spouseLabel_1_1_1_1_1_1_2_1.setBounds(10, 5, 121, 14);
		panel_24_1_1_1_1_1_1_2_1.add(spouseLabel_1_1_1_1_1_1_2_1);

		txtNameOfChurch = new JTextField();
		txtNameOfChurch.setBounds(141, 5, 243, 19);
		panel_24_1_1_1_1_1_1_2_1.add(txtNameOfChurch);

		final JPanel panel_25_1_1_1_1_1_1_2_1 = new JPanel();
		panel_25_1_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1_1_2_1.setLayout(null);
		panel_25_1_1_1_1_1_1_2_1.setBounds(435, 763, 205, 30);
		panel.add(panel_25_1_1_1_1_1_1_2_1);

		final JLabel addressLabel_1_1_1_1_1_1_2_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_2_1.setText("PHONE");
		addressLabel_1_1_1_1_1_1_2_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_2_1.add(addressLabel_1_1_1_1_1_1_2_1);

		txtPhone13 = new JTextField();
		txtPhone13.setBounds(61, 5, 121, 21);
		panel_25_1_1_1_1_1_1_2_1.add(txtPhone13);

		final JPanel panel_26_2_1_1_1_1_1_2_1 = new JPanel();
		panel_26_2_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1_1_2_1.setLayout(null);
		panel_26_2_1_1_1_1_1_2_1.setBounds(639, 763, 385, 30);
		panel.add(panel_26_2_1_1_1_1_1_2_1);

		final JLabel cityLabel_2_1_1_1_1_1_2_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_2_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2_1.setText("CLERGY");
		cityLabel_2_1_1_1_1_1_2_1.setBounds(5, 9, 134, 14);
		panel_26_2_1_1_1_1_1_2_1.add(cityLabel_2_1_1_1_1_1_2_1);

		txtClergy = new JTextField();
		txtClergy.setBounds(145, 6, 232, 18);
		panel_26_2_1_1_1_1_1_2_1.add(txtClergy);

		final JPanel panel_26_1_2_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_2_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1_1_1_1_1.setBounds(1022, 763, 320, 30);
		panel.add(panel_26_1_2_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_2_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1_1_1_1_1.setText("PHONE");
		cityLabel_1_2_1_1_1_1_1_1_1.setBounds(5, 9, 43, 14);
		panel_26_1_2_1_1_1_1_1_1_1.add(cityLabel_1_2_1_1_1_1_1_1_1);

		txtPhone16 = new JTextField();
		txtPhone16.setBounds(54, 5, 223, 18);
		panel_26_1_2_1_1_1_1_1_1_1.add(txtPhone16);

		final JPanel panel_24_1_1_1_1_1_1_2_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_24_1_1_1_1_1_1_2_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_2_1_1.setBounds(41, 792, 395, 30);
		panel.add(panel_24_1_1_1_1_1_1_2_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_2_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2_1_1.setText("POWER OF ATTORNEY");
		spouseLabel_1_1_1_1_1_1_2_1_1.setBounds(10, 5, 121, 14);
		panel_24_1_1_1_1_1_1_2_1_1.add(spouseLabel_1_1_1_1_1_1_2_1_1);

		txtPowerOfAttorney = new JTextField();
		txtPowerOfAttorney.setBounds(141, 5, 243, 19);
		panel_24_1_1_1_1_1_1_2_1_1.add(txtPowerOfAttorney);

		final JPanel panel_25_1_1_1_1_1_1_2_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_25_1_1_1_1_1_1_2_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_2_1_1.setBounds(435, 792, 205, 30);
		panel.add(panel_25_1_1_1_1_1_1_2_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_2_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_2_1_1.setText("PHONE");
		addressLabel_1_1_1_1_1_1_2_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_2_1_1.add(addressLabel_1_1_1_1_1_1_2_1_1);

		txtPhone14 = new JTextField();
		txtPhone14.setBounds(61, 5, 121, 21);
		panel_25_1_1_1_1_1_1_2_1_1.add(txtPhone14);

		final JPanel panel_26_2_1_1_1_1_1_2_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_2_1_1_1_1_1_2_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1_2_1_1.setBounds(639, 792, 294, 30);
		panel.add(panel_26_2_1_1_1_1_1_2_1_1);

		final JLabel cityLabel_2_1_1_1_1_1_2_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_2_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2_1_1.setText("EDUCATION LEVEL");
		cityLabel_2_1_1_1_1_1_2_1_1.setBounds(5, 9, 134, 14);
		panel_26_2_1_1_1_1_1_2_1_1.add(cityLabel_2_1_1_1_1_1_2_1_1);

		txtEducationLevel = new JTextField();
		txtEducationLevel.setBounds(145, 6, 142, 18);
		panel_26_2_1_1_1_1_1_2_1_1.add(txtEducationLevel);

		final JPanel panel_26_1_2_1_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_2_1_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_2_1_1_1_1_1_1_1_1.setBounds(932, 792, 410, 30);
		panel.add(panel_26_1_2_1_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_2_1_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_2_1_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_2_1_1_1_1_1_1_1_1.setText("PRIMARY LANGUAGE");
		cityLabel_1_2_1_1_1_1_1_1_1_1.setBounds(5, 9, 102, 14);
		panel_26_1_2_1_1_1_1_1_1_1_1.add(cityLabel_1_2_1_1_1_1_1_1_1_1);

		txtPrimaryLanguage = new JTextField();
		txtPrimaryLanguage.setBounds(116, 5, 252, 18);
		panel_26_1_2_1_1_1_1_1_1_1_1.add(txtPrimaryLanguage);

		final JPanel panel_24_1_1_1_1_1_1_2_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_24_1_1_1_1_1_1_2_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_2_1_1_1.setBounds(41, 821, 396, 30);
		panel.add(panel_24_1_1_1_1_1_1_2_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_2_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2_1_1_1.setText("PREVIOUS OCCUPATON");
		spouseLabel_1_1_1_1_1_1_2_1_1_1.setBounds(10, 5, 121, 14);
		panel_24_1_1_1_1_1_1_2_1_1_1.add(spouseLabel_1_1_1_1_1_1_2_1_1_1);

		txtPreviousOccupation = new JTextField();
		txtPreviousOccupation.setBounds(141, 5, 243, 19);
		panel_24_1_1_1_1_1_1_2_1_1_1.add(txtPreviousOccupation);

		final JPanel panel_25_1_1_1_1_1_1_2_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_25_1_1_1_1_1_1_2_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_2_1_1_1.setBounds(436, 820, 203, 32);
		panel.add(panel_25_1_1_1_1_1_1_2_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_2_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_2_1_1_1.setText("INDUSTRY");
		addressLabel_1_1_1_1_1_1_2_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_2_1_1_1.add(addressLabel_1_1_1_1_1_1_2_1_1_1);

		txtIndustry = new JTextField();
		txtIndustry.setBounds(61, 5, 121, 21);
		panel_25_1_1_1_1_1_1_2_1_1_1.add(txtIndustry);

		final JPanel panel_26_2_1_1_1_1_1_2_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_2_1_1_1_1_1_2_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1_2_1_1_1.setBounds(638, 820, 704, 30);
		panel.add(panel_26_2_1_1_1_1_1_2_1_1_1);

		final JLabel cityLabel_2_1_1_1_1_1_2_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_2_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2_1_1_1.setText("NURSING ALERT");
		cityLabel_2_1_1_1_1_1_2_1_1_1.setBounds(5, 9, 134, 14);
		panel_26_2_1_1_1_1_1_2_1_1_1.add(cityLabel_2_1_1_1_1_1_2_1_1_1);

		txtNursingAlert = new JTextField();
		txtNursingAlert.setBounds(145, 6, 516, 18);
		panel_26_2_1_1_1_1_1_2_1_1_1.add(txtNursingAlert);

		final JPanel panel_24_1_1_1_1_1_1_2_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_24_1_1_1_1_1_1_2_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_2_1_1_1_1.setBounds(42, 850, 316, 31);
		panel.add(panel_24_1_1_1_1_1_1_2_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_2_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1.setText("PREVIOUS  ADDRESS");
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1.setBounds(10, 5, 121, 14);
		panel_24_1_1_1_1_1_1_2_1_1_1_1.add(spouseLabel_1_1_1_1_1_1_2_1_1_1_1);

		txtPreviousAddress = new JTextField();
		txtPreviousAddress.setBounds(141, 5, 169, 19);
		panel_24_1_1_1_1_1_1_2_1_1_1_1.add(txtPreviousAddress);

		final JPanel panel_25_1_1_1_1_1_1_2_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_25_1_1_1_1_1_1_2_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_2_1_1_1_1.setBounds(356, 850, 281, 30);
		panel.add(panel_25_1_1_1_1_1_1_2_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_2_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_2_1_1_1_1.setText("CITY/STATE/ZIP");
		addressLabel_1_1_1_1_1_1_2_1_1_1_1.setBounds(3, 7, 73, 14);
		panel_25_1_1_1_1_1_1_2_1_1_1_1.add(addressLabel_1_1_1_1_1_1_2_1_1_1_1);

		txtCityStateZip = new JTextField();
		txtCityStateZip.setBounds(79, 5, 180, 21);
		panel_25_1_1_1_1_1_1_2_1_1_1_1.add(txtCityStateZip);

		final JPanel panel_26_2_1_1_1_1_1_2_1_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_2_1_1_1_1_1_2_1_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1_2_1_1_1_1.setBounds(636, 850, 706, 30);
		panel.add(panel_26_2_1_1_1_1_1_2_1_1_1_1);

		final JLabel cityLabel_2_1_1_1_1_1_2_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_2_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2_1_1_1_1.setText("COMMENTS");
		cityLabel_2_1_1_1_1_1_2_1_1_1_1.setBounds(5, 9, 134, 14);
		panel_26_2_1_1_1_1_1_2_1_1_1_1.add(cityLabel_2_1_1_1_1_1_2_1_1_1_1);

		txtComments = new JTextField();
		txtComments.setBounds(145, 6, 516, 18);
		panel_26_2_1_1_1_1_1_2_1_1_1_1.add(txtComments);

		final JPanel panel_24_1_1_1_1_1_1_2_1_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.setBounds(40, 880, 1302, 53);
		panel.add(panel_24_1_1_1_1_1_1_2_1_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_2_1_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1_1.setText("DISCHARGE DIAGNOSIS");
		spouseLabel_1_1_1_1_1_1_2_1_1_1_1_1.setBounds(10, 5, 141, 14);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1
				.add(spouseLabel_1_1_1_1_1_1_2_1_1_1_1_1);

		final JLabel onsetLabel = new JLabel();
		onsetLabel.setFont(new Font("", Font.BOLD, 9));
		onsetLabel.setText("ONSET");
		onsetLabel.setBounds(10, 25, 31, 16);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.add(onsetLabel);

		txtOnSet1 = new JTextField();
		txtOnSet1.setBounds(53, 25, 100, 19);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.add(txtOnSet1);

		final JLabel onsetLabel_1 = new JLabel();
		onsetLabel_1.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_1.setText("ONSET");
		onsetLabel_1.setBounds(484, 25, 31, 16);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.add(onsetLabel_1);

		txtOnSet2 = new JTextField();
		txtOnSet2.setBounds(521, 22, 100, 19);
		panel_24_1_1_1_1_1_1_2_1_1_1_1_1.add(txtOnSet2);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(40, 932, 1302, 141);
		panel.add(panel_28);

		final JLabel onsetLabel_2 = new JLabel();
		onsetLabel_2.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_2.setBounds(10, 22, 66, 16);
		onsetLabel_2.setText("DISCHARGED");
		panel_28.add(onsetLabel_2);

		final JLabel onsetLabel_2_1 = new JLabel();
		onsetLabel_2_1.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_2_1.setText("DISCHARGED TO:");
		onsetLabel_2_1.setBounds(10, 62, 86, 16);
		panel_28.add(onsetLabel_2_1);

		cbWithApproval = new JCheckBox();
		cbWithApproval.setBackground(Color.WHITE);
		cbWithApproval.setFont(new Font("", Font.BOLD, 9));
		cbWithApproval.setText("WITH APPROVAL");
		cbWithApproval.setBounds(100, 16, 100, 24);
		panel_28.add(cbWithApproval);

		cbOwnHome = new JCheckBox();
		cbOwnHome.setBackground(Color.WHITE);
		cbOwnHome.setFont(new Font("", Font.BOLD, 9));
		cbOwnHome.setText("OWN HOME");
		cbOwnHome.setBounds(101, 56, 78, 24);
		panel_28.add(cbOwnHome);

		cbAgainstApproval = new JCheckBox();
		cbAgainstApproval.setBackground(Color.WHITE);
		cbAgainstApproval.setFont(new Font("", Font.BOLD, 9));
		cbAgainstApproval.setText("AGAINST APPROVAL");
		cbAgainstApproval.setBounds(234, 16, 118, 24);
		panel_28.add(cbAgainstApproval);

		cbFriendRelatives = new JCheckBox();
		cbFriendRelatives.setBackground(Color.WHITE);
		cbFriendRelatives.setFont(new Font("", Font.BOLD, 9));
		cbFriendRelatives.setText("FRIEND RELATIVES HOME");
		cbFriendRelatives.setBounds(234, 56, 153, 24);
		panel_28.add(cbFriendRelatives);

		cbTransffered = new JCheckBox();
		cbTransffered.setBackground(Color.WHITE);
		cbTransffered.setFont(new Font("", Font.BOLD, 9));
		cbTransffered.setText("TRANSFERED");
		cbTransffered.setBounds(448, 18, 118, 24);
		panel_28.add(cbTransffered);

		cbHospitalFacility = new JCheckBox();
		cbHospitalFacility.setBackground(Color.WHITE);
		cbHospitalFacility.setFont(new Font("", Font.BOLD, 9));
		cbHospitalFacility.setText("HOSPITAL OTHER FACILITY");
		cbHospitalFacility.setBounds(462, 58, 153, 24);
		panel_28.add(cbHospitalFacility);

		cbDied = new JCheckBox();
		cbDied.setBackground(Color.WHITE);
		cbDied.setFont(new Font("", Font.BOLD, 9));
		cbDied.setText("DIED");
		cbDied.setBounds(572, 18, 48, 24);
		panel_28.add(cbDied);

		txtDateAndTime = new JTextField();
		txtDateAndTime.setBounds(633, 21, 180, 21);
		panel_28.add(txtDateAndTime);

		final JLabel cityLabel_2_1_1_1_1_1_2_1_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_2_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_2_1_1_1_1_1.setText("(DATE AND TIME)");
		cityLabel_2_1_1_1_1_1_2_1_1_1_1_1.setBounds(670, 44, 86, 14);
		panel_28.add(cityLabel_2_1_1_1_1_1_2_1_1_1_1_1);

		final JLabel noOfDaysLabel = new JLabel();
		noOfDaysLabel.setFont(new Font("", Font.BOLD, 9));
		noOfDaysLabel.setText("NO. OF DAYS STAYED");
		noOfDaysLabel.setBounds(841, 18, 100, 16);
		panel_28.add(noOfDaysLabel);

		txtNoOfStayed = new JTextField();
		txtNoOfStayed.setBounds(946, 18, 180, 21);
		panel_28.add(txtNoOfStayed);

		final JLabel onsetLabel_2_1_1 = new JLabel();
		onsetLabel_2_1_1.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_2_1_1.setText("REVIEWED BY :");
		onsetLabel_2_1_1.setBounds(244, 88, 86, 16);
		panel_28.add(onsetLabel_2_1_1);

		final JLabel onsetLabel_2_1_2 = new JLabel();
		onsetLabel_2_1_2.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_2_1_2.setText("TITLE");
		onsetLabel_2_1_2.setBounds(607, 115, 33, 16);
		panel_28.add(onsetLabel_2_1_2);

		final JLabel onsetLabel_2_1_2_1 = new JLabel();
		onsetLabel_2_1_2_1.setFont(new Font("", Font.BOLD, 9));
		onsetLabel_2_1_2_1.setText("SIGNATURE");
		onsetLabel_2_1_2_1.setBounds(335, 115, 66, 16);
		panel_28.add(onsetLabel_2_1_2_1);

		combReviewedBy = new JComboBox();
		combReviewedBy.setBackground(Color.WHITE);
		combReviewedBy.setFont(new Font("", Font.BOLD, 9));
		combReviewedBy.setBounds(334, 91, 106, 16);
		panel_28.add(combReviewedBy);

		txtTitle = new JTextField();
		txtTitle.setBounds(575, 88, 100, 19);
		panel_28.add(txtTitle);

		final JLabel dateOfBirthLabel_1 = new JLabel();
		dateOfBirthLabel_1.setFont(new Font("", Font.BOLD, 9));
		dateOfBirthLabel_1.setText("DATE");
		dateOfBirthLabel_1.setBounds(864, 85, 48, 14);
		panel_28.add(dateOfBirthLabel_1);

		dcDate = new JDateChooser();
		dcDate.setBounds(918, 85, 78, 15);
		panel_28.add(dcDate);

		final JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(42, 1072, 1300, 53);
		panel.add(panel_29);

		final JPanel panel_24_2 = new JPanel();
		panel_24_2.setBackground(Color.WHITE);
		panel_24_2.setFont(new Font("", Font.PLAIN, 9));
		panel_24_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_2.setLayout(null);
		panel_24_2.setBounds(40, 1124, 259, 30);
		panel.add(panel_24_2);

		final JLabel spouseLabel_2 = new JLabel();
		spouseLabel_2.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_2.setText("RESIDENT NAME");
		spouseLabel_2.setBounds(10, 5, 93, 14);
		panel_24_2.add(spouseLabel_2);

		txtResidentName2 = new JTextField();
		txtResidentName2.setBounds(109, 5, 140, 19);
		panel_24_2.add(txtResidentName2);

		final JPanel panel_25_2 = new JPanel();
		panel_25_2.setBackground(Color.WHITE);
		panel_25_2.setFont(new Font("", Font.PLAIN, 9));
		panel_25_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_2.setLayout(null);
		panel_25_2.setBounds(298, 1124, 118, 30);
		panel.add(panel_25_2);

		final JLabel addressLabel_2 = new JLabel();
		addressLabel_2.setFont(new Font("", Font.BOLD, 9));
		addressLabel_2.setText("SEX");
		addressLabel_2.setBounds(3, 7, 30, 14);
		panel_25_2.add(addressLabel_2);

		rbSexM2 = new JRadioButton();
		rbSexM2.setBackground(Color.WHITE);
		rbSexM2.setFont(new Font("", Font.BOLD, 9));
		rbSexM2.setText("M");
		rbSexM2.setBounds(39, 3, 33, 18);
		panel_25_2.add(rbSexM2);

		final JRadioButton rbSexF2 = new JRadioButton();
		rbSexF2.setBackground(Color.WHITE);
		rbSexF2.setFont(new Font("", Font.BOLD, 9));
		rbSexF2.setText("F");
		rbSexF2.setBounds(78, 5, 33, 18);
		panel_25_2.add(rbSexF2);

		final JPanel panel_26_3 = new JPanel();
		panel_26_3.setBackground(Color.WHITE);
		panel_26_3.setFont(new Font("", Font.PLAIN, 9));
		panel_26_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_3.setLayout(null);
		panel_26_3.setBounds(415, 1123, 196, 30);
		panel.add(panel_26_3);

		final JLabel cityLabel_3 = new JLabel();
		cityLabel_3.setFont(new Font("", Font.BOLD, 9));
		cityLabel_3.setText("STATION/ROOM/BED");
		cityLabel_3.setBounds(5, 9, 100, 14);
		panel_26_3.add(cityLabel_3);

		txtStationRoom = new JTextField();
		txtStationRoom.setBounds(125, 5, 61, 18);
		panel_26_3.add(txtStationRoom);

		final JPanel panel_26_1_3 = new JPanel();
		panel_26_1_3.setBackground(Color.WHITE);
		panel_26_1_3.setFont(new Font("", Font.PLAIN, 9));
		panel_26_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_3.setLayout(null);
		panel_26_1_3.setBounds(610, 1121, 138, 30);
		panel.add(panel_26_1_3);

		final JLabel cityLabel_1_3 = new JLabel();
		cityLabel_1_3.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_3.setText("ADMISSION NO.");
		cityLabel_1_3.setBounds(5, 9, 77, 14);
		panel_26_1_3.add(cityLabel_1_3);

		txtAdmissionNo = new JTextField();
		txtAdmissionNo.setBounds(88, 6, 44, 18);
		panel_26_1_3.add(txtAdmissionNo);

		final JPanel panel_26_1_3_1 = new JPanel();
		panel_26_1_3_1.setBackground(Color.WHITE);
		panel_26_1_3_1.setFont(new Font("", Font.PLAIN, 9));
		panel_26_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_3_1.setLayout(null);
		panel_26_1_3_1.setBounds(748, 1124, 185, 30);
		panel.add(panel_26_1_3_1);

		final JLabel cityLabel_1_3_1 = new JLabel();
		cityLabel_1_3_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_3_1.setText("ORIGINAL ADMIT DATE");
		cityLabel_1_3_1.setBounds(5, 9, 120, 14);
		panel_26_1_3_1.add(cityLabel_1_3_1);

		dcOriginalAdmitDate2 = new JDateChooser();
		dcOriginalAdmitDate2.setBounds(118, 5, 57, 18);
		panel_26_1_3_1.add(dcOriginalAdmitDate2);

		final JPanel panel_26_1_3_1_1 = new JPanel();
		panel_26_1_3_1_1.setBackground(Color.WHITE);
		panel_26_1_3_1_1.setFont(new Font("", Font.PLAIN, 9));
		panel_26_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_3_1_1.setLayout(null);
		panel_26_1_3_1_1.setBounds(932, 1122, 185, 30);
		panel.add(panel_26_1_3_1_1);

		final JLabel cityLabel_1_3_1_1 = new JLabel();
		cityLabel_1_3_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_3_1_1.setText("CURRENT ADMIT DATE");
		cityLabel_1_3_1_1.setBounds(5, 9, 102, 14);
		panel_26_1_3_1_1.add(cityLabel_1_3_1_1);

		dcCurrentAdmitDate2 = new JDateChooser();
		dcCurrentAdmitDate2.setBounds(118, 5, 57, 18);
		panel_26_1_3_1_1.add(dcCurrentAdmitDate2);

		final JPanel panel_26_1_3_1_1_1 = new JPanel();
		panel_26_1_3_1_1_1.setBackground(Color.WHITE);
		panel_26_1_3_1_1_1.setFont(new Font("", Font.PLAIN, 9));
		panel_26_1_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_1_3_1_1_1.setLayout(null);
		panel_26_1_3_1_1_1.setBounds(1117, 1124, 225, 30);
		panel.add(panel_26_1_3_1_1_1);

		final JLabel cityLabel_1_3_1_1_1 = new JLabel();
		cityLabel_1_3_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_3_1_1_1.setText("DISCHARGE");
		cityLabel_1_3_1_1_1.setBounds(5, 9, 66, 14);
		panel_26_1_3_1_1_1.add(cityLabel_1_3_1_1_1);

		txtDischarge2 = new JTextField();
		txtDischarge2.setBounds(77, 4, 138, 19);
		panel_26_1_3_1_1_1.add(txtDischarge2);

		final JPanel panel_24_1_1_1_1_1_1_1_1 = new JPanel();
		panel_24_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_24_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_24_1_1_1_1_1_1_1_1.setLayout(null);
		panel_24_1_1_1_1_1_1_1_1.setBounds(42, 337, 259, 30);
		panel.add(panel_24_1_1_1_1_1_1_1_1);

		final JLabel spouseLabel_1_1_1_1_1_1_1_1 = new JLabel();
		spouseLabel_1_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		spouseLabel_1_1_1_1_1_1_1_1.setText("FUNERAL HOME MORTUARY");
		spouseLabel_1_1_1_1_1_1_1_1.setBounds(10, 5, 135, 14);
		panel_24_1_1_1_1_1_1_1_1.add(spouseLabel_1_1_1_1_1_1_1_1);

		txtFuneralHome = new JTextField();
		txtFuneralHome.setBounds(151, 5, 59, 19);
		panel_24_1_1_1_1_1_1_1_1.add(txtFuneralHome);

		final JPanel panel_25_1_1_1_1_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_25_1_1_1_1_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_1_1.setBounds(300, 337, 118, 30);
		panel.add(panel_25_1_1_1_1_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_1_1.setText("PHONE");
		addressLabel_1_1_1_1_1_1_1_1.setBounds(3, 7, 54, 14);
		panel_25_1_1_1_1_1_1_1_1.add(addressLabel_1_1_1_1_1_1_1_1);

		txtPhone9 = new JTextField();
		txtPhone9.setBounds(61, 5, 54, 21);
		panel_25_1_1_1_1_1_1_1_1.add(txtPhone9);

		final JPanel panel_26_2_1_1_1_1_1_1_1 = new JPanel();
		panel_26_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_2_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_26_2_1_1_1_1_1_1_1.setLayout(null);
		panel_26_2_1_1_1_1_1_1_1.setBounds(610, 337, 245, 30);
		panel.add(panel_26_2_1_1_1_1_1_1_1);

		final JLabel cityLabel_2_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_2_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_2_1_1_1_1_1_1_1.setText("PHONE NO.");
		cityLabel_2_1_1_1_1_1_1_1.setBounds(5, 9, 59, 14);
		panel_26_2_1_1_1_1_1_1_1.add(cityLabel_2_1_1_1_1_1_1_1);

		txtPhone10 = new JTextField();
		txtPhone10.setBounds(64, 6, 171, 18);
		panel_26_2_1_1_1_1_1_1_1.add(txtPhone10);

		final JPanel panel_26_1_1_2_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_1_2_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_2_1_1_1_1_1_1_1.setBounds(854, 337, 244, 30);
		panel.add(panel_26_1_1_2_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_2_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_2_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_2_1_1_1_1_1_1_1.setText("HOW TRANSFERRED");
		cityLabel_1_1_2_1_1_1_1_1_1_1.setBounds(5, 9, 114, 14);
		panel_26_1_1_2_1_1_1_1_1_1_1.add(cityLabel_1_1_2_1_1_1_1_1_1_1);

		txtHowTransferred = new JTextField();
		txtHowTransferred.setBounds(136, 5, 69, 18);
		panel_26_1_1_2_1_1_1_1_1_1_1.add(txtHowTransferred);

		final JPanel panel_26_1_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_26_1_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_26_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_26_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_26_1_1_1_1_1_1_1_1_1_1_1.setBounds(1097, 338, 245, 30);
		panel.add(panel_26_1_1_1_1_1_1_1_1_1_1_1);

		final JLabel cityLabel_1_1_1_2_1_1_1_1_1_1_1 = new JLabel();
		cityLabel_1_1_1_2_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		cityLabel_1_1_1_2_1_1_1_1_1_1_1.setText("DATES OF STAY");
		cityLabel_1_1_1_2_1_1_1_1_1_1_1.setBounds(5, 9, 83, 14);
		panel_26_1_1_1_1_1_1_1_1_1_1_1.add(cityLabel_1_1_1_2_1_1_1_1_1_1_1);

		dcDateOfStay = new JDateChooser();
		dcDateOfStay.setBounds(95, 5, 129, 18);
		panel_26_1_1_1_1_1_1_1_1_1_1_1.add(dcDateOfStay);

		final JPanel panel_25_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_25_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_25_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_25_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_25_1_1_1_1_1_1_1_1_1.setBounds(416, 338, 195, 30);
		panel.add(panel_25_1_1_1_1_1_1_1_1_1);

		final JLabel addressLabel_1_1_1_1_1_1_1_1_1 = new JLabel();
		addressLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("", Font.BOLD, 9));
		addressLabel_1_1_1_1_1_1_1_1_1.setText("ADMITTED FORM");
		addressLabel_1_1_1_1_1_1_1_1_1.setBounds(6, 7, 81, 14);
		panel_25_1_1_1_1_1_1_1_1_1.add(addressLabel_1_1_1_1_1_1_1_1_1);

		txtAdmittedForm = new JTextField();
		txtAdmittedForm.setBounds(91, 5, 94, 21);
		panel_25_1_1_1_1_1_1_1_1_1.add(txtAdmittedForm);
	}

	/*
	 * public static void main(String arg[]){ SwingUtils.wrapInFrame(new
	 * PanelAdmissionAndDischargeSummary()).setVisible(true); }
	 */

	public void doLoad() {

	}

	public int doSave() {

		MonthlySummaryRecord msr = null;
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		AdmissionAndDischargeSummary refAdmissionAndDischargeSummary = new AdmissionAndDischargeSummary();
		refAdmissionAndDischargeSummary.setFormId(msr);
		refAdmissionAndDischargeSummary
				.setSerial(Global.currentAdmissionAndDischargeSummaryKey);
		// AdmissionAndDischargeSummary refAdmissionAndDischargeSummary = new
		// AdmissionAndDischargeSummary();
		refAdmissionAndDischargeSummary
				.setResidentId(Global.currentResidenceKey);

		refAdmissionAndDischargeSummary
				.setMaritalStatus(medrex.client.utils.SwingUtils
						.getSelectedButton(bgMaritalS));
		refAdmissionAndDischargeSummary.setSex(medrex.client.utils.SwingUtils
				.getSelectedButton(bgSex));
		refAdmissionAndDischargeSummary.setDied(cbDied.isSelected());
		refAdmissionAndDischargeSummary.setHospitalFacility(cbHospitalFacility
				.isSelected());
		refAdmissionAndDischargeSummary.setAgainstApproval(cbAgainstApproval
				.isSelected());
		refAdmissionAndDischargeSummary.setWithApproval(cbWithApproval
				.isSelected());
		refAdmissionAndDischargeSummary.setTransffered(cbTransffered
				.isSelected());
		refAdmissionAndDischargeSummary.setFriendRelatives(cbFriendRelatives
				.isSelected());
		refAdmissionAndDischargeSummary
				.settOriginalAdmitDate2(dcOriginalAdmitDate2.getDate());
		refAdmissionAndDischargeSummary.setOwnHome(cbOwnHome.isSelected());
		refAdmissionAndDischargeSummary.setDate(dcDate.getDate());
		refAdmissionAndDischargeSummary
				.setCurrentAdmitDate2(dcCurrentAdmitDate2.getDate());
		refAdmissionAndDischargeSummary
				.settOriginalAdmitDate2(dcOriginalAdmitDate2.getDate());

		refAdmissionAndDischargeSummary.setDateOfStay(dcDateOfStay.getDate());
		refAdmissionAndDischargeSummary.setIns1(txtIns1.getText());
		refAdmissionAndDischargeSummary.setBcBs(txtBcBs.getText());
		refAdmissionAndDischargeSummary.setAddress1(txtAddress1.getText());
		refAdmissionAndDischargeSummary.setCity1(txtCity1.getText());
		refAdmissionAndDischargeSummary.setCountry(txtCountry.getText());
		refAdmissionAndDischargeSummary.setSpouse(txtSpouse.getText());
		refAdmissionAndDischargeSummary.setIns2(txtIns2.getText());
		refAdmissionAndDischargeSummary.setVs(txtVs.getText());
		refAdmissionAndDischargeSummary.setMedicaidNo(txtMedicaidNo.getText());
		refAdmissionAndDischargeSummary.setMedicareNo(txtMedicareNo.getText());
		refAdmissionAndDischargeSummary
				.setLevelOfCare(txtLevelOfCare.getText());
		refAdmissionAndDischargeSummary.setNickName(txtNickName.getText());
		refAdmissionAndDischargeSummary.setSsn(txtSsn.getText());
		refAdmissionAndDischargeSummary.setReligion(txtReligion.getText());
		refAdmissionAndDischargeSummary.setCitizen(txtCitizen.getText());
		refAdmissionAndDischargeSummary.setAge(txtAge.getText());
		refAdmissionAndDischargeSummary.setDateOfBirth(dcDateOfBirth.getDate());
		refAdmissionAndDischargeSummary.setPayType(txtPayType.getText());
		refAdmissionAndDischargeSummary.setCurrentAdmitDate(dcCurrentAdmitDate
				.getDate());
		refAdmissionAndDischargeSummary
				.setOriginalAdmitDate(dcOriginalAdmitDate.getDate());
		refAdmissionAndDischargeSummary.setMedRecNo(txtMedRecNo.getText());
		refAdmissionAndDischargeSummary.setStationRoombed(txtStationRoombed
				.getText());
		refAdmissionAndDischargeSummary.setResidentName(txtResidentName
				.getText());
		refAdmissionAndDischargeSummary.setAdmittedForm(txtAdmittedForm
				.getText());
		refAdmissionAndDischargeSummary.setHowTransferred(txtHowTransferred
				.getText());
		refAdmissionAndDischargeSummary.setPhone10(txtPhone10.getText());
		refAdmissionAndDischargeSummary.setPhone9(txtPhone9.getText());
		refAdmissionAndDischargeSummary
				.setFuneralHome(txtFuneralHome.getText());
		refAdmissionAndDischargeSummary.setDischarge2(txtDischarge2.getText());
		refAdmissionAndDischargeSummary
				.setAdmissionNo(txtAdmissionNo.getText());
		refAdmissionAndDischargeSummary
				.setStationRoom(txtStationRoom.getText());
		refAdmissionAndDischargeSummary.setResidentName2(txtResidentName2
				.getText());
		refAdmissionAndDischargeSummary.setTitle(txtTitle.getText());
		// refAdmissionAndDischargeSummary.setbReviewedBy( (String)
		// cmbbReviewedBy.getSelectedItem());
		refAdmissionAndDischargeSummary.setNoOfStayed(txtNoOfStayed.getText());
		refAdmissionAndDischargeSummary
				.setDateAndTime(txtDateAndTime.getText());
		refAdmissionAndDischargeSummary.setOnSet2(txtOnSet2.getText());
		refAdmissionAndDischargeSummary.setOnSet1(txtOnSet1.getText());
		refAdmissionAndDischargeSummary.setComments(txtComments.getText());
		refAdmissionAndDischargeSummary.setCityStateZip(txtCityStateZip
				.getText());
		refAdmissionAndDischargeSummary.setPreviousAddress(txtPreviousAddress
				.getText());
		refAdmissionAndDischargeSummary.setNursingAlert(txtNursingAlert
				.getText());
		refAdmissionAndDischargeSummary.setIndustry(txtIndustry.getText());
		refAdmissionAndDischargeSummary
				.setPreviousOccupation(txtPreviousOccupation.getText());
		refAdmissionAndDischargeSummary.setPrimaryLanguage(txtPrimaryLanguage
				.getText());
		refAdmissionAndDischargeSummary.setEducationLevel(txtEducationLevel
				.getText());
		refAdmissionAndDischargeSummary.setPhone14(txtPhone14.getText());
		refAdmissionAndDischargeSummary.setPowerOfAttorney(txtPowerOfAttorney
				.getText());
		refAdmissionAndDischargeSummary.setPhone16(txtPhone16.getText());
		refAdmissionAndDischargeSummary.setClergy(txtClergy.getText());
		refAdmissionAndDischargeSummary.setPhone13(txtPhone13.getText());
		refAdmissionAndDischargeSummary.setNameOfChurch(txtNameOfChurch
				.getText());
		refAdmissionAndDischargeSummary.setPhone15(txtPhone15.getText());
		refAdmissionAndDischargeSummary
				.setAmbulancePreference(txtAmbulancePreference.getText());
		refAdmissionAndDischargeSummary.setPhone12(txtPhone12.getText());
		refAdmissionAndDischargeSummary
				.setHospitalPreference(txtHospitalPreference.getText());
		refAdmissionAndDischargeSummary.setReasons(txtReasons.getText());
		refAdmissionAndDischargeSummary
				.setResidentsAwareOfPrimary(txtResidentsAwareOfPrimary
						.getText());
		refAdmissionAndDischargeSummary.setCodeStatus(txtCodeStatus.getText());
		refAdmissionAndDischargeSummary.setPrognosis(txtPrognosis.getText());
		refAdmissionAndDischargeSummary.setRehabPotential(txtRehabPotential
				.getText());
		refAdmissionAndDischargeSummary.setAllergies(txtAllergies.getText());
		refAdmissionAndDischargeSummary.setPhone8(txtPhone8.getText());
		refAdmissionAndDischargeSummary.setPharmacy(txtPharmacy.getText());
		refAdmissionAndDischargeSummary.setPhone7(txtPhone7.getText());
		refAdmissionAndDischargeSummary.setZip7(txtZip7.getText());
		refAdmissionAndDischargeSummary.setState7(txtState7.getText());
		refAdmissionAndDischargeSummary.setCity7(txtCity7.getText());
		refAdmissionAndDischargeSummary.setAddress7(txtAddress7.getText());
		refAdmissionAndDischargeSummary.setDentist(txtDentist.getText());
		refAdmissionAndDischargeSummary.setPhone6(txtPhone6.getText());
		refAdmissionAndDischargeSummary.setZip6(txtZip6.getText());
		refAdmissionAndDischargeSummary.setState6(txtState6.getText());
		refAdmissionAndDischargeSummary.setCity6(txtCity6.getText());
		refAdmissionAndDischargeSummary.setAddress6(txtAddress6.getText());
		refAdmissionAndDischargeSummary
				.setAlternatePhysician(txtAlternatePhysician.getText());
		refAdmissionAndDischargeSummary.setPhone5(txtPhone5.getText());
		refAdmissionAndDischargeSummary.setZip5(txtZip5.getText());
		refAdmissionAndDischargeSummary.setState5(txtState5.getText());
		refAdmissionAndDischargeSummary.setCity5(txtCity5.getText());
		refAdmissionAndDischargeSummary.setAddress5(txtAddress5.getText());
		refAdmissionAndDischargeSummary.setPhysician(txtPhysician.getText());
		refAdmissionAndDischargeSummary.setPhoneH4(txtPhoneH4.getText());
		refAdmissionAndDischargeSummary.setPhoneW4(txtPhoneW4.getText());
		refAdmissionAndDischargeSummary.setZip4(txtZip4.getText());
		refAdmissionAndDischargeSummary.setState4(txtState4.getText());
		refAdmissionAndDischargeSummary.setCity4(txtCity4.getText());
		refAdmissionAndDischargeSummary.setAddress4(txtAddress4.getText());
		refAdmissionAndDischargeSummary
				.setEmergencyContact2(txtEmergencyContact2.getText());
		refAdmissionAndDischargeSummary.setPhoneH3(txtPhoneH3.getText());
		refAdmissionAndDischargeSummary.setPhoneW3(txtPhoneW3.getText());
		refAdmissionAndDischargeSummary.setZip3(txtZip3.getText());
		refAdmissionAndDischargeSummary.setState3(txtState3.getText());
		refAdmissionAndDischargeSummary.setCity3(txtCity3.getText());
		refAdmissionAndDischargeSummary.setAddress3(txtAddress3.getText());
		refAdmissionAndDischargeSummary
				.setEmergencyContact1(txtEmergencyContact1.getText());
		refAdmissionAndDischargeSummary.setPhoneH2(txtPhoneH2.getText());
		refAdmissionAndDischargeSummary.setPhoneW2(txtPhoneW2.getText());
		refAdmissionAndDischargeSummary.setZip2(txtZip2.getText());
		refAdmissionAndDischargeSummary.setState2(txtState2.getText());
		refAdmissionAndDischargeSummary.setCity2(txtCity2.getText());
		refAdmissionAndDischargeSummary.setAddress2(txtAddress2.getText());
		refAdmissionAndDischargeSummary.setResponsibleParty(txtResponsibleParty
				.getText());
		refAdmissionAndDischargeSummary.setPhoneH1(txtPhoneH1.getText());
		refAdmissionAndDischargeSummary.setPhoneW1(txtPhoneW1.getText());
		refAdmissionAndDischargeSummary.setZip1(txtZip1.getText());
		refAdmissionAndDischargeSummary.setState1(txtState1.getText());
		refAdmissionAndDischargeSummary.setPlaceOfBirth(txtPlaceOfBirth
				.getText());
		refAdmissionAndDischargeSummary.setDischarge(txtDischarge.getText());
		refAdmissionAndDischargeSummary.setRaceNationality(txtRaceNationality
				.getText());
		refAdmissionAndDischargeSummary
				.settOriginalAdmitDate2(dcOriginalAdmitDate2.getDate());
		refAdmissionAndDischargeSummary
				.setTOriginalAdmitDate2(dcOriginalAdmitDate2.getDate());

		// refAdmissionAndDischargeSummary.setDate(dcDate.getDate());
		refAdmissionAndDischargeSummary
				.setAdmitingDiagnosis(txtAdmitingDiagnosis.getText());
		try {
			Global.currentAdmissionAndDischargeSummaryKey = MedrexClientManager
					.getInstance().insertOrUpdateAdmissionDischargeSummary(
							refAdmissionAndDischargeSummary);
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		return Global.currentAdmissionAndDischargeSummaryKey;
	}

	public void doUpdate() {
		updateData();
	}

	public void updateData() {
		AdmissionAndDischargeSummary refAdmissionAndDischargeSummary = null;
		MonthlySummaryRecord msr = null;

		System.out.println("key is:" + Global.currentMonthlySummaryRecordKey
				+ "," + Global.currentAdmissionAndDischargeSummaryKey);
		System.out.println(" suresh  : CurrentMonthlySummaryRecordKey"
				+ Global.currentMonthlySummaryRecordKey);

		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentAdmissionAndDischargeSummaryKey != 0) {
			try {
				// refAdmissionAndDischargeSummary =
				// MedrexClientManager.getInstance().getAdmissionAndDischarge(Global.currentMonthlySummaryRecordKey);
				msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refAdmissionAndDischargeSummary = MedrexClientManager
						.getInstance().getAdmissionAndDischarge(msr);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			txtResidentName.setText(refAdmissionAndDischargeSummary
					.getResidentName());
			// ------------------------------------------------------
			medrex.client.utils.SwingUtils.setSelectedButton(bgSex,
					refAdmissionAndDischargeSummary.getSex());
			medrex.client.utils.SwingUtils.setSelectedButton(bgMaritalS,
					refAdmissionAndDischargeSummary.getMaritalStatus());
			cbDied.setSelected(refAdmissionAndDischargeSummary.isDied());
			cbHospitalFacility.setSelected(refAdmissionAndDischargeSummary
					.isHospitalFacility());
			cbAgainstApproval.setSelected(refAdmissionAndDischargeSummary
					.isAgainstApproval());
			cbWithApproval.setSelected(refAdmissionAndDischargeSummary
					.isWithApproval());
			cbTransffered.setSelected(refAdmissionAndDischargeSummary
					.isTransffered());
			cbFriendRelatives.setSelected(refAdmissionAndDischargeSummary
					.isFriendRelatives());
			dcOriginalAdmitDate2.setDate(refAdmissionAndDischargeSummary
					.gettOriginalAdmitDate2());
			cbOwnHome.setSelected(refAdmissionAndDischargeSummary.isOwnHome());
			dcDate.setDate(refAdmissionAndDischargeSummary.getDate());
			dcCurrentAdmitDate2.setDate(refAdmissionAndDischargeSummary
					.getCurrentAdmitDate2());
			dcDateOfStay.setDate(refAdmissionAndDischargeSummary
					.getDateOfStay());
			txtIns1.setText(refAdmissionAndDischargeSummary.getIns1());
			txtBcBs.setText(refAdmissionAndDischargeSummary.getBcBs());
			txtAddress1.setText(refAdmissionAndDischargeSummary.getAddress1());
			txtCity1.setText(refAdmissionAndDischargeSummary.getCity1());
			txtCountry.setText(refAdmissionAndDischargeSummary.getCountry());
			txtSpouse.setText(refAdmissionAndDischargeSummary.getSpouse());
			txtIns2.setText(refAdmissionAndDischargeSummary.getIns2());
			txtVs.setText(refAdmissionAndDischargeSummary.getVs());
			txtMedicaidNo.setText(refAdmissionAndDischargeSummary
					.getMedicaidNo());
			txtMedicareNo.setText(refAdmissionAndDischargeSummary
					.getMedicareNo());
			txtLevelOfCare.setText(refAdmissionAndDischargeSummary
					.getLevelOfCare());
			txtNickName.setText(refAdmissionAndDischargeSummary.getNickName());
			txtSsn.setText(refAdmissionAndDischargeSummary.getSsn());
			txtReligion.setText(refAdmissionAndDischargeSummary.getReligion());
			txtCitizen.setText(refAdmissionAndDischargeSummary.getCitizen());
			txtAge.setText(refAdmissionAndDischargeSummary.getAge());
			dcDateOfBirth.setDate(refAdmissionAndDischargeSummary
					.getDateOfBirth());
			txtPayType.setText(refAdmissionAndDischargeSummary.getPayType());
			dcCurrentAdmitDate.setDate(refAdmissionAndDischargeSummary
					.getCurrentAdmitDate());
			dcOriginalAdmitDate.setDate(refAdmissionAndDischargeSummary
					.getOriginalAdmitDate());
			txtMedRecNo.setText(refAdmissionAndDischargeSummary.getMedRecNo());
			txtStationRoombed.setText(refAdmissionAndDischargeSummary
					.getStationRoombed());
			txtResidentName.setText(refAdmissionAndDischargeSummary
					.getResidentName());
			txtAdmittedForm.setText(refAdmissionAndDischargeSummary
					.getAdmittedForm());
			txtHowTransferred.setText(refAdmissionAndDischargeSummary
					.getHowTransferred());
			txtPhone10.setText(refAdmissionAndDischargeSummary.getPhone10());
			txtPhone9.setText(refAdmissionAndDischargeSummary.getPhone9());
			txtFuneralHome.setText(refAdmissionAndDischargeSummary
					.getFuneralHome());
			txtDischarge2.setText(refAdmissionAndDischargeSummary
					.getDischarge2());
			txtAdmissionNo.setText(refAdmissionAndDischargeSummary
					.getAdmissionNo());
			txtStationRoom.setText(refAdmissionAndDischargeSummary
					.getStationRoom());
			txtResidentName2.setText(refAdmissionAndDischargeSummary
					.getResidentName2());
			txtTitle.setText(refAdmissionAndDischargeSummary.getTitle());
			combReviewedBy.setSelectedItem(refAdmissionAndDischargeSummary
					.getbReviewedBy());
			txtNoOfStayed.setText(refAdmissionAndDischargeSummary
					.getNoOfStayed());
			txtDateAndTime.setText(refAdmissionAndDischargeSummary
					.getDateAndTime());
			txtOnSet2.setText(refAdmissionAndDischargeSummary.getOnSet2());
			txtOnSet1.setText(refAdmissionAndDischargeSummary.getOnSet1());
			txtComments.setText(refAdmissionAndDischargeSummary.getComments());
			txtCityStateZip.setText(refAdmissionAndDischargeSummary
					.getCityStateZip());
			txtPreviousAddress.setText(refAdmissionAndDischargeSummary
					.getPreviousAddress());
			txtNursingAlert.setText(refAdmissionAndDischargeSummary
					.getNursingAlert());
			txtIndustry.setText(refAdmissionAndDischargeSummary.getIndustry());
			txtPreviousOccupation.setText(refAdmissionAndDischargeSummary
					.getPreviousOccupation());
			txtPrimaryLanguage.setText(refAdmissionAndDischargeSummary
					.getPrimaryLanguage());
			txtEducationLevel.setText(refAdmissionAndDischargeSummary
					.getEducationLevel());
			txtPhone14.setText(refAdmissionAndDischargeSummary.getPhone14());
			txtPowerOfAttorney.setText(refAdmissionAndDischargeSummary
					.getPowerOfAttorney());
			txtPhone16.setText(refAdmissionAndDischargeSummary.getPhone16());
			txtClergy.setText(refAdmissionAndDischargeSummary.getClergy());
			txtPhone13.setText(refAdmissionAndDischargeSummary.getPhone13());
			txtNameOfChurch.setText(refAdmissionAndDischargeSummary
					.getNameOfChurch());
			txtPhone15.setText(refAdmissionAndDischargeSummary.getPhone15());
			txtAmbulancePreference.setText(refAdmissionAndDischargeSummary
					.getAmbulancePreference());
			txtPhone12.setText(refAdmissionAndDischargeSummary.getPhone12());
			txtHospitalPreference.setText(refAdmissionAndDischargeSummary
					.getHospitalPreference());
			txtReasons.setText(refAdmissionAndDischargeSummary.getReasons());
			txtResidentsAwareOfPrimary.setText(refAdmissionAndDischargeSummary
					.getResidentsAwareOfPrimary());
			txtCodeStatus.setText(refAdmissionAndDischargeSummary
					.getCodeStatus());
			txtPrognosis
					.setText(refAdmissionAndDischargeSummary.getPrognosis());
			txtRehabPotential.setText(refAdmissionAndDischargeSummary
					.getRehabPotential());
			txtAllergies
					.setText(refAdmissionAndDischargeSummary.getAllergies());
			txtPhone8.setText(refAdmissionAndDischargeSummary.getPhone8());
			txtPharmacy.setText(refAdmissionAndDischargeSummary.getPharmacy());
			txtPhone7.setText(refAdmissionAndDischargeSummary.getPhone7());
			txtZip7.setText(refAdmissionAndDischargeSummary.getZip7());
			txtState7.setText(refAdmissionAndDischargeSummary.getState7());
			txtCity7.setText(refAdmissionAndDischargeSummary.getCity7());
			txtAddress7.setText(refAdmissionAndDischargeSummary.getAddress7());
			txtDentist.setText(refAdmissionAndDischargeSummary.getDentist());
			txtPhone6.setText(refAdmissionAndDischargeSummary.getPhone6());
			txtZip6.setText(refAdmissionAndDischargeSummary.getZip6());
			txtState6.setText(refAdmissionAndDischargeSummary.getState6());
			txtCity6.setText(refAdmissionAndDischargeSummary.getCity6());
			txtAddress6.setText(refAdmissionAndDischargeSummary.getAddress6());
			txtAlternatePhysician.setText(refAdmissionAndDischargeSummary
					.getAlternatePhysician());
			txtPhone5.setText(refAdmissionAndDischargeSummary.getPhone5());
			txtZip5.setText(refAdmissionAndDischargeSummary.getZip5());
			txtState5.setText(refAdmissionAndDischargeSummary.getState5());
			txtCity5.setText(refAdmissionAndDischargeSummary.getCity5());
			txtAddress5.setText(refAdmissionAndDischargeSummary.getAddress5());
			txtPhysician
					.setText(refAdmissionAndDischargeSummary.getPhysician());
			txtPhoneH4.setText(refAdmissionAndDischargeSummary.getPhoneH4());
			txtPhoneW4.setText(refAdmissionAndDischargeSummary.getPhoneW4());
			txtZip4.setText(refAdmissionAndDischargeSummary.getZip4());
			txtState4.setText(refAdmissionAndDischargeSummary.getState4());
			txtCity4.setText(refAdmissionAndDischargeSummary.getCity4());
			txtAddress4.setText(refAdmissionAndDischargeSummary.getAddress4());
			txtEmergencyContact2.setText(refAdmissionAndDischargeSummary
					.getEmergencyContact2());
			txtPhoneH3.setText(refAdmissionAndDischargeSummary.getPhoneH3());
			txtPhoneW3.setText(refAdmissionAndDischargeSummary.getPhoneW3());
			txtZip3.setText(refAdmissionAndDischargeSummary.getZip3());
			txtState3.setText(refAdmissionAndDischargeSummary.getState3());
			txtCity3.setText(refAdmissionAndDischargeSummary.getCity3());
			txtAddress3.setText(refAdmissionAndDischargeSummary.getAddress3());
			txtEmergencyContact1.setText(refAdmissionAndDischargeSummary
					.getEmergencyContact1());
			txtPhoneH2.setText(refAdmissionAndDischargeSummary.getPhoneH2());
			txtPhoneW2.setText(refAdmissionAndDischargeSummary.getPhoneW2());
			txtZip2.setText(refAdmissionAndDischargeSummary.getZip2());
			txtState2.setText(refAdmissionAndDischargeSummary.getState2());
			txtCity2.setText(refAdmissionAndDischargeSummary.getCity2());
			txtAddress2.setText(refAdmissionAndDischargeSummary.getAddress2());
			txtResponsibleParty.setText(refAdmissionAndDischargeSummary
					.getResponsibleParty());
			txtPhoneH1.setText(refAdmissionAndDischargeSummary.getPhoneH1());
			txtPhoneW1.setText(refAdmissionAndDischargeSummary.getPhoneW1());
			txtZip1.setText(refAdmissionAndDischargeSummary.getZip1());
			txtState1.setText(refAdmissionAndDischargeSummary.getState1());
			txtPlaceOfBirth.setText(refAdmissionAndDischargeSummary
					.getPlaceOfBirth());
			txtDischarge
					.setText(refAdmissionAndDischargeSummary.getDischarge());
			txtRaceNationality.setText(refAdmissionAndDischargeSummary
					.getRaceNationality());

			medrex.client.utils.SwingUtils.setSelectedButton(bgSex,
					refAdmissionAndDischargeSummary.getSex());

			txtAdmitingDiagnosis.setText(refAdmissionAndDischargeSummary
					.getAdmitingDiagnosis());

		} else {
			int residentId = Global.currentResidenceKey;
			ResidentMain rm = null;
			CensusStatus cs = null;
			TempRoomHistory cs1 = null;

			try {
				rm = MedrexClientManager.getInstance().getResident(residentId);
				cs = MedrexClientManager.getInstance()
						.getCensusOriginalAdmission(residentId);
				cs1 = MedrexClientManager.getInstance().getLastRoomHistory(
						residentId);
				List<ResidentContact> resContcatList = null;
				TempRoomHistory stationRoomBed = null;

				if (rm != null) {
					txtResidentName.setText(rm.getUserPass() + " , "
							+ rm.getUserName());
					int gen = 0;
					Sex sex = rm.getSex();
					if (sex.toString().equalsIgnoreCase("Male")) {
						gen = 1;
					} else if (sex.toString().equalsIgnoreCase("Female")) {
						gen = 2;
					}
					medrex.client.utils.SwingUtils
							.setSelectedButton(bgSex, gen);
					txtAge.setText(rm.getDob() + "");

					// int mstatus = 0;
					// Status status = (Status) rm.getMaritalStatus();
					// if(status.toString().equalsIgnoreCase(anotherString))
					// medrex.client.utils.SwingUtils.setSelectedButton(bgMaritalS,
					// mstatus);
					//					

					dcDateOfBirth.setDate(rm.getDob());
					txtPlaceOfBirth.setText(rm.getBirthPlace());
					txtMedRecNo.setText(rm.getMedicaidNum());
					txtCountry.setText(rm.getCounty() + "");
					txtMedicareNo.setText(rm.getMedicalRecordNum());

					// txtCity1.setText(rm.getCity());
					// txtStat

				}
				stationRoomBed = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(residentId);
				if (stationRoomBed != null) {
					txtStationRoombed.setText(stationRoomBed.getRoom());
				}

				resContcatList = MedrexClientManager.getInstance()
						.getResidentContacts(residentId);
				if (resContcatList != null) {
					for (ResidentContact rescont : resContcatList) {
						String spouse = "";
						String responsible = "";
						String emergency = "";
						if ("SPOUSE".equalsIgnoreCase(rescont.getRelationship()
								.toString())) {
							System.out.println("Name SPOUSE: "
									+ rescont.getLastName() + ", "
									+ rescont.getFirstName());
							spouse = rescont.getLastName() + ", "
									+ rescont.getFirstName();
							txtSpouse.setText(spouse);
							txtAddress1.setText(rescont.getAddress());
							txtCity1.setText(rescont.getCity());
							txtState1.setText(rescont.getState().toString());
							txtZip1.setText(rescont.getZip().toString());

						}
						if (rescont.getResponsibleParty() == 1) {
							responsible = rescont.getLastName() + ", "
									+ rescont.getFirstName();
							txtResponsibleParty.setText(responsible);
							txtAddress2.setText(rescont.getAddress());
							txtCity2.setText(rescont.getCity());
							txtState2.setText(rescont.getState().toString());
							txtZip1.setText(rescont.getZip().toString());
						}
						if (rescont.getEmergency() == 1) {
							emergency = rescont.getLastName() + ", "
									+ rescont.getFirstName();
							txtEmergencyContact1.setText(emergency);
							txtAddress3.setText(rescont.getAddress());
							txtCity3.setText(rescont.getCity());
							txtState3.setText(rescont.getState().toString());
							txtZip3.setText(rescont.getZip().toString());
						}
					}

				}

				if (cs != null) {
					System.out.println("cs.getDateAndTime(): "
							+ cs.getDateAndTime());
					dcOriginalAdmitDate.setDate(cs.getDateAndTime());

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (cs1 != null) {
				System.out
						.println("CS 1.getLastRoomHistory" + cs1.getEndDate());
				dcCurrentAdmitDate.setDate(cs1.getEndDate());

			}

		}
		// ----------------------------------------------------------------
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
