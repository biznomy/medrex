package medrex.client.main.MonthlySummary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.InfluenzaConsentForm;

import com.toedter.calendar.JDateChooser;

public class PanelConsentForm extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4208409916445114048L;
	private JDateChooser dcExpiry;
	private JDateChooser dcDateTimeGiven;
	private JTextField txtShiftNurseSignature3;
	private JTextField txtShiftNurseSignature2;
	private JTextField txtShiftNurseSignature1;
	private JTextField txtShiftTemprature3;
	private JTextField txtShiftTemprature2;
	private JTextField txtShiftTemprature1;
	private JTextField txtShiftShift3;
	private JTextField txtShiftShift2;
	private JTextField txtShiftShift1;
	private JDateChooser dcShiftDate3;
	private JDateChooser dcShiftDate2;
	private JDateChooser dcShiftDate1;
	private JDateChooser dcDateCalled;
	private JDateChooser dcResponsiblePartySignatureDate;
	private JDateChooser dcResidentSignatureDate;
	private JTextField txtSite;
	private JTextField txtLotNo;
	private JTextField txtTemprature;
	private JCheckBox cbResponseRefused;
	private JCheckBox cbResponseConsent;
	private JTextField txtCalledBy;
	private JTextField txtRelationship;
	private JTextField txtNameParty;
	private JTextField txtSignatureWitnessParty;
	private JTextField txtSignatureWitnessResident;
	private JTextField txtSignatureParty;
	private JTextField txtSignatureResident;
	private JTextField txtResidentName;

	public static void main(String[] args) {

	}

	public PanelConsentForm() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		setPreferredSize(new Dimension(818, 900));
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 818, 820);
		add(panel);

		final JLabel plazaHealthcareAndLabel = new JLabel();
		plazaHealthcareAndLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		plazaHealthcareAndLabel.setHorizontalAlignment(SwingConstants.CENTER);
		plazaHealthcareAndLabel
				.setText("PLAZA HEALTHCARE AND REHABILITATION CENTER");
		plazaHealthcareAndLabel.setBounds(132, 10, 479, 31);
		panel.add(plazaHealthcareAndLabel);

		final JLabel consentFormLabel = new JLabel();
		consentFormLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		consentFormLabel.setHorizontalAlignment(SwingConstants.CENTER);
		consentFormLabel.setText("CONSENT FORM");
		consentFormLabel.setBounds(265, 47, 182, 17);
		panel.add(consentFormLabel);

		final JLabel consentFormLabel_1 = new JLabel();
		consentFormLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		consentFormLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		consentFormLabel_1.setText("INFLUENZA VACCINE");
		consentFormLabel_1.setBounds(275, 70, 182, 17);
		panel.add(consentFormLabel_1);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 102, 767, 344);
		panel.add(panel_1);

		final JLabel iLabel = new JLabel();
		iLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		iLabel.setBounds(89, 13, 20, 14);
		panel_1.add(iLabel);
		iLabel.setText("I , ");

		txtResidentName = new JTextField();
		txtResidentName.setBounds(115, 12, 427, 21);
		panel_1.add(txtResidentName);

		final JLabel herebyGivePlazaLabel = new JLabel();
		herebyGivePlazaLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		herebyGivePlazaLabel.setBounds(557, 10, 149, 20);
		panel_1.add(herebyGivePlazaLabel);
		herebyGivePlazaLabel.setText("hereby give plaza ");

		final JLabel healthcareAndRehabilitationLabel = new JLabel();
		healthcareAndRehabilitationLabel.setFont(new Font("Tahoma", Font.BOLD,
				14));
		healthcareAndRehabilitationLabel
				.setText("Healthcare and rehabilitation center permission to administer the influenza Vaccine to me.");
		healthcareAndRehabilitationLabel.setBounds(89, 44, 644, 21);
		panel_1.add(healthcareAndRehabilitationLabel);

		final JLabel healthcareAndRehabilitationLabel_1 = new JLabel();
		healthcareAndRehabilitationLabel_1.setFont(new Font("Tahoma",
				Font.BOLD, 14));
		healthcareAndRehabilitationLabel_1
				.setText("To the best of my knowledge,I have not had an anaphylactic  reaction to eggs. I have been");
		healthcareAndRehabilitationLabel_1.setBounds(89, 71, 633, 21);
		panel_1.add(healthcareAndRehabilitationLabel_1);

		final JLabel healthcareAndRehabilitationLabel_1_1 = new JLabel();
		healthcareAndRehabilitationLabel_1_1.setFont(new Font("Tahoma",
				Font.BOLD, 14));
		healthcareAndRehabilitationLabel_1_1
				.setText("instructed that as a result of this vaccination I may experience some side effects such as ");
		healthcareAndRehabilitationLabel_1_1.setBounds(89, 98, 620, 21);
		panel_1.add(healthcareAndRehabilitationLabel_1_1);

		final JLabel healthcareAndRehabilitationLabel_1_1_1 = new JLabel();
		healthcareAndRehabilitationLabel_1_1_1.setFont(new Font("Tahoma",
				Font.BOLD, 14));
		healthcareAndRehabilitationLabel_1_1_1
				.setText("slight discomfort , soreness of the arm , redness of the arm. slight elevation of temprature");
		healthcareAndRehabilitationLabel_1_1_1.setBounds(89, 125, 633, 21);
		panel_1.add(healthcareAndRehabilitationLabel_1_1_1);

		final JLabel healthcareAndRehabilitationLabel_1_1_1_1 = new JLabel();
		healthcareAndRehabilitationLabel_1_1_1_1.setFont(new Font("Tahoma",
				Font.BOLD, 14));
		healthcareAndRehabilitationLabel_1_1_1_1.setText("or muscle ache.");
		healthcareAndRehabilitationLabel_1_1_1_1.setBounds(89, 152, 620, 21);
		panel_1.add(healthcareAndRehabilitationLabel_1_1_1_1);

		final JLabel signatureOfTheLabel = new JLabel();
		signatureOfTheLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel.setText("Signature of the Resident");
		signatureOfTheLabel.setBounds(89, 224, 189, 24);
		panel_1.add(signatureOfTheLabel);

		txtSignatureResident = new JTextField();
		txtSignatureResident.setBounds(97, 197, 170, 21);
		panel_1.add(txtSignatureResident);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel.setText("Date");
		dateLabel.setBounds(394, 229, 76, 14);
		panel_1.add(dateLabel);

		dcResidentSignatureDate = new JDateChooser();
		dcResidentSignatureDate.setBounds(359, 197, 111, 21);
		panel_1.add(dcResidentSignatureDate);

		final JLabel signatureOfTheLabel_1 = new JLabel();
		signatureOfTheLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel_1.setText("Signature of the witness");
		signatureOfTheLabel_1.setBounds(561, 227, 189, 24);
		panel_1.add(signatureOfTheLabel_1);

		txtSignatureWitnessResident = new JTextField();
		txtSignatureWitnessResident.setBounds(544, 197, 189, 21);
		panel_1.add(txtSignatureWitnessResident);

		txtSignatureParty = new JTextField();
		txtSignatureParty.setBounds(97, 280, 170, 21);
		panel_1.add(txtSignatureParty);

		dcResponsiblePartySignatureDate = new JDateChooser();
		dcResponsiblePartySignatureDate.setBounds(359, 280, 111, 21);
		panel_1.add(dcResponsiblePartySignatureDate);

		txtSignatureWitnessParty = new JTextField();
		txtSignatureWitnessParty.setBounds(544, 280, 189, 21);
		panel_1.add(txtSignatureWitnessParty);

		final JLabel signatureOfTheLabel_2 = new JLabel();
		signatureOfTheLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel_2.setText("Signature of the Responsible party");
		signatureOfTheLabel_2.setBounds(76, 307, 249, 24);
		panel_1.add(signatureOfTheLabel_2);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel_1.setText("Date");
		dateLabel_1.setBounds(394, 313, 76, 14);
		panel_1.add(dateLabel_1);

		final JLabel signatureOfTheLabel_1_1 = new JLabel();
		signatureOfTheLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel_1_1.setText("Signature Of Witness");
		signatureOfTheLabel_1_1.setBounds(561, 309, 189, 24);
		panel_1.add(signatureOfTheLabel_1_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 444, 767, 366);
		panel.add(panel_2);

		final JLabel signatureOfTheLabel_2_1 = new JLabel();
		signatureOfTheLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel_2_1.setText("Responsible Party Called");
		signatureOfTheLabel_2_1.setBounds(73, 26, 194, 24);
		panel_2.add(signatureOfTheLabel_2_1);

		txtNameParty = new JTextField();
		txtNameParty.setBounds(273, 30, 158, 21);
		panel_2.add(txtNameParty);

		final JLabel signatureOfTheLabel_2_1_1 = new JLabel();
		signatureOfTheLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureOfTheLabel_2_1_1.setText("Relationship");
		signatureOfTheLabel_2_1_1.setBounds(455, 26, 91, 24);
		panel_2.add(signatureOfTheLabel_2_1_1);

		txtRelationship = new JTextField();
		txtRelationship.setBounds(549, 30, 189, 21);
		panel_2.add(txtRelationship);

		final JLabel dateCalledLabel = new JLabel();
		dateCalledLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateCalledLabel.setText("Date Called");
		dateCalledLabel.setBounds(73, 56, 167, 24);
		panel_2.add(dateCalledLabel);

		dcDateCalled = new JDateChooser();
		dcDateCalled.setBounds(273, 57, 158, 21);
		panel_2.add(dcDateCalled);

		final JLabel dateCalledLabel_1 = new JLabel();
		dateCalledLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateCalledLabel_1.setText("Called By");
		dateCalledLabel_1.setBounds(455, 56, 91, 24);
		panel_2.add(dateCalledLabel_1);

		txtCalledBy = new JTextField();
		txtCalledBy.setBounds(549, 57, 189, 21);
		panel_2.add(txtCalledBy);

		final JLabel responseConsentLabel = new JLabel();
		responseConsentLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		responseConsentLabel.setText("Response:");
		responseConsentLabel.setBounds(73, 86, 91, 24);
		panel_2.add(responseConsentLabel);

		cbResponseConsent = new JCheckBox();
		cbResponseConsent.setBackground(Color.WHITE);
		cbResponseConsent.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbResponseConsent.setText("Consent");
		cbResponseConsent.setBounds(273, 84, 94, 18);
		panel_2.add(cbResponseConsent);

		cbResponseRefused = new JCheckBox();
		cbResponseRefused.setOpaque(false);
		cbResponseRefused.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbResponseRefused.setText("Refused");
		cbResponseRefused.setBounds(404, 84, 94, 18);
		panel_2.add(cbResponseRefused);

		final JLabel responseConsentLabel_1 = new JLabel();
		responseConsentLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		responseConsentLabel_1.setText("Pre-Flu Vac Temprature : ");
		responseConsentLabel_1.setBounds(73, 138, 194, 24);
		panel_2.add(responseConsentLabel_1);

		txtTemprature = new JTextField();
		txtTemprature.setBounds(276, 142, 158, 21);
		panel_2.add(txtTemprature);

		final JLabel responseConsentLabel_1_1 = new JLabel();
		responseConsentLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		responseConsentLabel_1_1.setText("Date And Time Given:");
		responseConsentLabel_1_1.setBounds(73, 163, 194, 24);
		panel_2.add(responseConsentLabel_1_1);

		dcDateTimeGiven = new JDateChooser();
		dcDateTimeGiven.setBounds(276, 167, 158, 21);
		panel_2.add(dcDateTimeGiven);

		final JLabel responseConsentLabel_1_1_1 = new JLabel();
		responseConsentLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		responseConsentLabel_1_1_1.setText("Site");
		responseConsentLabel_1_1_1.setBounds(455, 166, 82, 24);
		panel_2.add(responseConsentLabel_1_1_1);

		txtSite = new JTextField();
		txtSite.setBounds(549, 167, 189, 21);
		panel_2.add(txtSite);

		final JLabel lotNoLabel = new JLabel();
		lotNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lotNoLabel.setText("Lot No:");
		lotNoLabel.setBounds(73, 193, 54, 14);
		panel_2.add(lotNoLabel);

		txtLotNo = new JTextField();
		txtLotNo.setBounds(273, 193, 158, 21);
		panel_2.add(txtLotNo);

		final JLabel expiryLabel = new JLabel();
		expiryLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		expiryLabel.setText("Expiry");
		expiryLabel.setBounds(455, 196, 54, 18);
		panel_2.add(expiryLabel);

		dcExpiry = new JDateChooser();
		dcExpiry.setBounds(549, 194, 189, 21);
		panel_2.add(dcExpiry);

		final JLabel tempratureQShiftLabel = new JLabel();
		tempratureQShiftLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		tempratureQShiftLabel
				.setText("<html><body><u>Temprature Q Shift for next three shifts");
		tempratureQShiftLabel.setBounds(73, 235, 307, 18);
		panel_2.add(tempratureQShiftLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(69, 259, 664, 100);
		panel_2.add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(new BorderLayout());
		panel_4.setBounds(1, 1, 165, 24);
		panel_3.add(panel_4);

		final JLabel dateLabel_2 = new JLabel();
		dateLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel_2.setBorder(new LineBorder(Color.black, 1, false));
		dateLabel_2.setText("Date");
		panel_4.add(dateLabel_2, BorderLayout.CENTER);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(new BorderLayout());
		panel_4_1.setBounds(166, 1, 166, 24);
		panel_3.add(panel_4_1);

		final JLabel shiftLabel = new JLabel();
		shiftLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		shiftLabel.setHorizontalAlignment(SwingConstants.CENTER);
		shiftLabel.setBorder(new LineBorder(Color.black, 1, false));
		shiftLabel.setText("Shift");
		panel_4_1.add(shiftLabel, BorderLayout.CENTER);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setLayout(new BorderLayout());
		panel_4_2.setBounds(332, 1, 166, 24);
		panel_3.add(panel_4_2);

		final JLabel tempratureLabel = new JLabel();
		tempratureLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		tempratureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempratureLabel.setBorder(new LineBorder(Color.black, 1, false));
		tempratureLabel.setBackground(Color.WHITE);
		tempratureLabel.setText("Temprature");
		panel_4_2.add(tempratureLabel, BorderLayout.CENTER);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setLayout(new BorderLayout());
		panel_4_3.setBounds(498, 1, 165, 24);
		panel_3.add(panel_4_3);

		final JLabel nurseSignatureLabel = new JLabel();
		nurseSignatureLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		nurseSignatureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nurseSignatureLabel.setBorder(new LineBorder(Color.black, 1, false));
		nurseSignatureLabel.setText("Nurse Signature");
		panel_4_3.add(nurseSignatureLabel, BorderLayout.CENTER);

		final JPanel panel_4_4 = new JPanel();
		panel_4_4.setLayout(null);
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setBounds(1, 25, 165, 25);
		panel_3.add(panel_4_4);

		dcShiftDate1 = new JDateChooser();
		dcShiftDate1.setBounds(-1, -1, 166, 26);
		dcShiftDate1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4.add(dcShiftDate1);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(new BorderLayout());
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setBounds(166, 25, 166, 25);
		panel_3.add(panel_4_1_1);

		txtShiftShift1 = new JTextField();
		txtShiftShift1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.add(txtShiftShift1, BorderLayout.CENTER);

		final JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setLayout(new BorderLayout());
		panel_4_2_1.setBackground(Color.WHITE);
		panel_4_2_1.setBounds(332, 25, 166, 25);
		panel_3.add(panel_4_2_1);

		txtShiftTemprature1 = new JTextField();
		txtShiftTemprature1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1.add(txtShiftTemprature1, BorderLayout.CENTER);

		final JPanel panel_4_3_1 = new JPanel();
		panel_4_3_1.setLayout(new BorderLayout());
		panel_4_3_1.setBackground(Color.WHITE);
		panel_4_3_1.setBounds(498, 25, 165, 25);
		panel_3.add(panel_4_3_1);

		txtShiftNurseSignature1 = new JTextField();
		txtShiftNurseSignature1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1.add(txtShiftNurseSignature1, BorderLayout.CENTER);

		final JPanel panel_4_4_1 = new JPanel();
		panel_4_4_1.setLayout(null);
		panel_4_4_1.setBackground(Color.WHITE);
		panel_4_4_1.setBounds(1, 50, 165, 25);
		panel_3.add(panel_4_4_1);

		dcShiftDate2 = new JDateChooser();
		dcShiftDate2.setBounds(-1, -1, 166, 26);
		dcShiftDate2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4_1.add(dcShiftDate2);

		final JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setLayout(new BorderLayout());
		panel_4_1_1_1.setBackground(Color.WHITE);
		panel_4_1_1_1.setBounds(166, 50, 166, 25);
		panel_3.add(panel_4_1_1_1);

		txtShiftShift2 = new JTextField();
		txtShiftShift2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1.add(txtShiftShift2, BorderLayout.CENTER);

		final JPanel panel_4_2_1_1 = new JPanel();
		panel_4_2_1_1.setLayout(new BorderLayout());
		panel_4_2_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1.setBounds(332, 50, 166, 25);
		panel_3.add(panel_4_2_1_1);

		txtShiftTemprature2 = new JTextField();
		txtShiftTemprature2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1.add(txtShiftTemprature2, BorderLayout.CENTER);

		final JPanel panel_4_3_1_1 = new JPanel();
		panel_4_3_1_1.setLayout(new BorderLayout());
		panel_4_3_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1.setBounds(498, 50, 165, 25);
		panel_3.add(panel_4_3_1_1);

		txtShiftNurseSignature2 = new JTextField();
		txtShiftNurseSignature2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1.add(txtShiftNurseSignature2, BorderLayout.CENTER);

		final JPanel panel_4_4_1_1 = new JPanel();
		panel_4_4_1_1.setLayout(null);
		panel_4_4_1_1.setBackground(Color.WHITE);
		panel_4_4_1_1.setBounds(1, 75, 165, 24);
		panel_3.add(panel_4_4_1_1);

		dcShiftDate3 = new JDateChooser();
		dcShiftDate3.setBounds(-1, -1, 166, 25);
		dcShiftDate3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4_1_1.add(dcShiftDate3);

		final JPanel panel_4_1_1_1_1 = new JPanel();
		panel_4_1_1_1_1.setLayout(new BorderLayout());
		panel_4_1_1_1_1.setBackground(Color.WHITE);
		panel_4_1_1_1_1.setBounds(166, 75, 166, 24);
		panel_3.add(panel_4_1_1_1_1);

		txtShiftShift3 = new JTextField();
		txtShiftShift3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1_1.add(txtShiftShift3, BorderLayout.CENTER);

		final JPanel panel_4_2_1_1_1 = new JPanel();
		panel_4_2_1_1_1.setLayout(new BorderLayout());
		panel_4_2_1_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1_1.setBounds(332, 75, 166, 24);
		panel_3.add(panel_4_2_1_1_1);

		txtShiftTemprature3 = new JTextField();
		txtShiftTemprature3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1_1.add(txtShiftTemprature3, BorderLayout.CENTER);

		final JPanel panel_4_3_1_1_1 = new JPanel();
		panel_4_3_1_1_1.setLayout(new BorderLayout());
		panel_4_3_1_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1_1.setBounds(498, 75, 165, 24);
		panel_3.add(panel_4_3_1_1_1);

		txtShiftNurseSignature3 = new JTextField();
		txtShiftNurseSignature3
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1_1.add(txtShiftNurseSignature3, BorderLayout.CENTER);
		doUpdate();
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		InfluenzaConsentForm refInfluenzaConsentForm = new InfluenzaConsentForm();
		refInfluenzaConsentForm.setResidentId(Global.currentResidenceKey);

		refInfluenzaConsentForm
				.setSerial(Global.currentInfluenzaConsentFormKey);
		refInfluenzaConsentForm.setFormId(Global.currentMsjnKey);
		refInfluenzaConsentForm.setExpiryDate(dcExpiry.getDate());
		refInfluenzaConsentForm.setDateTimeGiven(dcDateTimeGiven.getDate());
		refInfluenzaConsentForm.setShiftNurseSignature3(txtShiftNurseSignature3
				.getText());
		refInfluenzaConsentForm.setShiftNurseSignature2(txtShiftNurseSignature2
				.getText());
		refInfluenzaConsentForm.setShiftNurseSignature1(txtShiftNurseSignature1
				.getText());
		refInfluenzaConsentForm.setShiftTemprature3(txtShiftTemprature3
				.getText());
		refInfluenzaConsentForm.setShiftTemprature2(txtShiftTemprature2
				.getText());
		refInfluenzaConsentForm.setShiftTemprature1(txtShiftTemprature1
				.getText());
		refInfluenzaConsentForm.setShiftShift3(txtShiftShift3.getText());
		refInfluenzaConsentForm.setShiftShift2(txtShiftShift2.getText());
		refInfluenzaConsentForm.setShiftShift1(txtShiftShift1.getText());
		refInfluenzaConsentForm.setShiftDate3(dcShiftDate3.getDate());
		refInfluenzaConsentForm.setShiftDate2(dcShiftDate2.getDate());
		refInfluenzaConsentForm.setShiftDate1(dcShiftDate1.getDate());
		refInfluenzaConsentForm.setDateCalled(dcDateCalled.getDate());
		refInfluenzaConsentForm
				.setResponsiblePartyDate(dcResponsiblePartySignatureDate
						.getDate());
		refInfluenzaConsentForm
				.setResidentSignatureDate(dcResidentSignatureDate.getDate());
		refInfluenzaConsentForm.setSite(txtSite.getText());
		refInfluenzaConsentForm.setLotNo(txtLotNo.getText());
		refInfluenzaConsentForm.setTemprature(txtTemprature.getText());
		refInfluenzaConsentForm.setResponseRefused(cbResponseRefused
				.isSelected());
		refInfluenzaConsentForm.setResponseConsent(cbResponseConsent
				.isSelected());
		refInfluenzaConsentForm.setCalledBy(txtCalledBy.getText());
		refInfluenzaConsentForm.setRelationship(txtRelationship.getText());
		refInfluenzaConsentForm.setNameParty(txtNameParty.getText());
		refInfluenzaConsentForm
				.setSignatureWitnessParty(txtSignatureWitnessParty.getText());
		refInfluenzaConsentForm
				.setSignatureWitnessResident(txtSignatureWitnessResident
						.getText());
		refInfluenzaConsentForm.setSignatureParty(txtSignatureParty.getText());
		refInfluenzaConsentForm.setSignatureResident(txtSignatureResident
				.getText());
		refInfluenzaConsentForm.setResidentName(txtResidentName.getText());

		try {
			Global.currentInfluenzaConsentFormKey = MedrexClientManager
					.getInstance().insertOrUpdateInfluenzaConsentForm(
							refInfluenzaConsentForm);
		} catch (Exception e) {
		}
		return Global.currentInfluenzaConsentFormKey;
	}

	public void doUpdate() {
		InfluenzaConsentForm refInfluenzaConsentForm = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refInfluenzaConsentForm = MedrexClientManager.getInstance()
						.getInfluenzaConsentForm(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentInfluenzaConsentFormKey = refInfluenzaConsentForm
					.getSerial();
			dcExpiry.setDate(refInfluenzaConsentForm.getExpiryDate());
			dcDateTimeGiven.setDate(refInfluenzaConsentForm.getDateTimeGiven());
			txtShiftNurseSignature3.setText(refInfluenzaConsentForm
					.getShiftNurseSignature3());
			txtShiftNurseSignature2.setText(refInfluenzaConsentForm
					.getShiftNurseSignature2());
			txtShiftNurseSignature1.setText(refInfluenzaConsentForm
					.getShiftNurseSignature1());
			txtShiftTemprature3.setText(refInfluenzaConsentForm
					.getShiftTemprature3());
			txtShiftTemprature2.setText(refInfluenzaConsentForm
					.getShiftTemprature2());
			txtShiftTemprature1.setText(refInfluenzaConsentForm
					.getShiftTemprature1());
			txtShiftShift3.setText(refInfluenzaConsentForm.getShiftShift3());
			txtShiftShift2.setText(refInfluenzaConsentForm.getShiftShift2());
			txtShiftShift1.setText(refInfluenzaConsentForm.getShiftShift1());
			dcShiftDate3.setDate(refInfluenzaConsentForm.getShiftDate3());
			dcShiftDate2.setDate(refInfluenzaConsentForm.getShiftDate2());
			dcShiftDate1.setDate(refInfluenzaConsentForm.getShiftDate1());
			dcDateCalled.setDate(refInfluenzaConsentForm.getDateCalled());
			dcResponsiblePartySignatureDate.setDate(refInfluenzaConsentForm
					.getResidentSignatureDate());
			dcResidentSignatureDate.setDate(refInfluenzaConsentForm
					.getResidentSignatureDate());
			txtSite.setText(refInfluenzaConsentForm.getSite());
			txtLotNo.setText(refInfluenzaConsentForm.getLotNo());
			txtTemprature.setText(refInfluenzaConsentForm.getTemprature());
			cbResponseRefused.setSelected(refInfluenzaConsentForm
					.isResponseRefused());
			cbResponseConsent.setSelected(refInfluenzaConsentForm
					.isResponseConsent());
			txtCalledBy.setText(refInfluenzaConsentForm.getCalledBy());
			txtRelationship.setText(refInfluenzaConsentForm.getRelationship());
			txtNameParty.setText(refInfluenzaConsentForm.getNameParty());
			txtSignatureWitnessParty.setText(refInfluenzaConsentForm
					.getSignatureWitnessParty());
			txtSignatureWitnessResident.setText(refInfluenzaConsentForm
					.getSignatureWitnessResident());
			txtSignatureParty.setText(refInfluenzaConsentForm
					.getSignatureParty());
			txtSignatureResident.setText(refInfluenzaConsentForm
					.getSignatureResident());
			txtResidentName.setText(refInfluenzaConsentForm.getResidentName());
		}

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
