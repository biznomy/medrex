package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MSJN;

import com.toedter.calendar.JDateChooser;

public class PanelMSJN extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8305712696908931657L;
	private JTextField txtPhysicianSignature;
	private JTextField txtMedicalFacility;
	private JTextField txtPhoneNo;
	private JTextField txtPhoneCode;
	private JTextField txtPhysicianAddress;
	private JTextField txtPhysicianName;
	private JTextField txtAddress;
	private JTextField txtSurrogateSignature;
	private JTextField txtNoResuscitative;
	private JDateChooser dcDate;

	public PanelMSJN() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(810, 910));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 805, 907);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(263, 47, 184, 65);
		panel.add(panel_1);

		final JLabel msnjLabel = new JLabel();
		msnjLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		msnjLabel.setHorizontalAlignment(SwingConstants.CENTER);
		msnjLabel.setText("MSNJ");
		msnjLabel.setBounds(4, 0, 182, 60);
		panel_1.add(msnjLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(263, 16, 184, 26);
		panel.add(panel_2);

		final JLabel medicalSocietyOfLabel = new JLabel();
		medicalSocietyOfLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		medicalSocietyOfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicalSocietyOfLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		medicalSocietyOfLabel.setText("Medical Society of New Jersey");
		medicalSocietyOfLabel.setBounds(0, 3, 182, 24);
		panel_2.add(medicalSocietyOfLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 125, 776, 51);
		panel.add(panel_3);

		final JLabel doNotResuscitateLabel = new JLabel();
		doNotResuscitateLabel.setBackground(Color.WHITE);
		doNotResuscitateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		doNotResuscitateLabel.setFont(new Font("Tahoma", Font.BOLD, 48));
		doNotResuscitateLabel.setBounds(0, 5, 770, 40);
		doNotResuscitateLabel.setText("DO NOT RESUSCITATE");
		panel_3.add(doNotResuscitateLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 193, 774, 115);
		panel.add(panel_4);

		final JLabel allFirstRespondersLabel = new JLabel();
		allFirstRespondersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		allFirstRespondersLabel.setBackground(Color.WHITE);
		allFirstRespondersLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		allFirstRespondersLabel
				.setText("<HTML><BODY>ALL FIRST RESPONDERS AND EMERGENCY MEDICAL<BR>SERVICES PERSONNEL ARE AUTHORIZED TO COMPLY<BR>&nbsp;&nbsp;&nbsp;           WITH THIS OUT-OF-HOSPITAL DNR ORDER </BODY></HTML>");
		allFirstRespondersLabel.setBounds(3, 3, 759, 110);
		panel_4.add(allFirstRespondersLabel);

		final JLabel patientAddress_______________________________________________________________Label = new JLabel();
		patientAddress_______________________________________________________________Label
				.setFont(new Font("Arial", Font.PLAIN, 11));
		patientAddress_______________________________________________________________Label
				.setText("PATIENT ADDRESS:");
		patientAddress_______________________________________________________________Label
				.setBounds(12, 533, 103, 26);
		panel
				.add(patientAddress_______________________________________________________________Label);

		final JLabel theAboveNamedLabel = new JLabel();
		theAboveNamedLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		theAboveNamedLabel
				.setText("THE ABOVE NAMED PATIENT IS UNDER THE CARE OF:");
		theAboveNamedLabel.setBounds(169, 587, 385, 26);
		panel.add(theAboveNamedLabel);

		final JLabel physicianName_________________________________________________________________________________Label = new JLabel();
		physicianName_________________________________________________________________________________Label
				.setFont(new Font("Arial", Font.PLAIN, 11));
		physicianName_________________________________________________________________________________Label
				.setText("PHYSICIAN NAME: ");
		physicianName_________________________________________________________________________________Label
				.setBounds(12, 625, 95, 26);
		panel
				.add(physicianName_________________________________________________________________________________Label);

		final JLabel physicianAddress_____________________________________________________________________________________________________Label = new JLabel();
		physicianAddress_____________________________________________________________________________________________________Label
				.setFont(new Font("Arial", Font.PLAIN, 11));
		physicianAddress_____________________________________________________________________________________________________Label
				.setText("PHYSICIAN ADDRESS: ");
		physicianAddress_____________________________________________________________________________________________________Label
				.setBounds(12, 666, 112, 26);
		panel
				.add(physicianAddress_____________________________________________________________________________________________________Label);

		final JLabel telephoneNumberLabel = new JLabel();
		telephoneNumberLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		telephoneNumberLabel.setText("TELEPHONE NUMBER : ");
		telephoneNumberLabel.setBounds(12, 702, 119, 22);
		panel.add(telephoneNumberLabel);

		final JLabel medicalFacilityAffiliationLabel = new JLabel();
		medicalFacilityAffiliationLabel.setFont(new Font("Arial", Font.PLAIN,
				11));
		medicalFacilityAffiliationLabel
				.setText("MEDICAL FACILITY AFFILIATION :");
		medicalFacilityAffiliationLabel.setBounds(12, 734, 165, 26);
		panel.add(medicalFacilityAffiliationLabel);

		final JLabel physicianSignature___________________________________________________________________Label = new JLabel();
		physicianSignature___________________________________________________________________Label
				.setFont(new Font("Arial", Font.PLAIN, 11));
		physicianSignature___________________________________________________________________Label
				.setText("PHYSICIAN SIGNATURE:");
		physicianSignature___________________________________________________________________Label
				.setBounds(12, 773, 119, 27);
		panel
				.add(physicianSignature___________________________________________________________________Label);

		final JLabel thisRequestForLabel = new JLabel();
		thisRequestForLabel.setBounds(10, 312, 765, 26);
		panel.add(thisRequestForLabel);
		thisRequestForLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		thisRequestForLabel
				.setText("This request for no rosuscitative attempts in the event of a cardiac and/or respiratory arrest for:");

		final JLabel _______________________________________HasBeenLabel = new JLabel();
		_______________________________________HasBeenLabel.setBounds(307, 331,
				341, 32);
		panel.add(_______________________________________HasBeenLabel);
		_______________________________________HasBeenLabel.setFont(new Font(
				"Arial", Font.PLAIN, 14));
		_______________________________________HasBeenLabel
				.setText(" has been ordered by the physician whose signature");

		final JLabel appearsBelowThisLabel = new JLabel();
		appearsBelowThisLabel.setBounds(12, 369, 748, 52);
		panel.add(appearsBelowThisLabel);
		appearsBelowThisLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		appearsBelowThisLabel
				.setText("<html><body>appears below. this order is in compliance with the patient's/surrogate's wishes and it has been <BR> determined and documented by the physician below that resuscitation attempts for this patient would be <br>medically inappropriate.</body></html>");

		final JLabel itIsExpectedLabel = new JLabel();
		itIsExpectedLabel.setBounds(12, 427, 760, 53);
		panel.add(itIsExpectedLabel);
		itIsExpectedLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		itIsExpectedLabel
				.setText("<html><body>It is expected that this DNR order shall be honored by all <I>Emergency Medical Services(EMS)</I><br> personannel. First Responders, and other healthcare providers who may have contact with thispatient <br> during a medical emergency.</body></html>");

		final JLabel patientsurrogateSignature_______________________________________________________________Label = new JLabel();
		patientsurrogateSignature_______________________________________________________________Label
				.setBounds(12, 489, 178, 30);
		panel
				.add(patientsurrogateSignature_______________________________________________________________Label);
		patientsurrogateSignature_______________________________________________________________Label
				.setFont(new Font("Arial", Font.PLAIN, 11));
		patientsurrogateSignature_______________________________________________________________Label
				.setText("PATIENT/SURROGATE SIGNATURE.");

		txtNoResuscitative = new JTextField();
		txtNoResuscitative.setBounds(12, 341, 296, 20);
		panel.add(txtNoResuscitative);

		txtSurrogateSignature = new JTextField();
		txtSurrogateSignature.setBounds(204, 493, 546, 20);
		panel.add(txtSurrogateSignature);

		txtAddress = new JTextField();
		txtAddress.setBounds(127, 538, 623, 20);
		panel.add(txtAddress);

		txtPhysicianName = new JTextField();
		txtPhysicianName.setBounds(109, 627, 641, 20);
		panel.add(txtPhysicianName);

		txtPhysicianAddress = new JTextField();
		txtPhysicianAddress.setBounds(125, 671, 625, 20);
		panel.add(txtPhysicianAddress);

		txtPhoneCode = new JTextField();
		txtPhoneCode.setBounds(188, 702, 40, 20);
		panel.add(txtPhoneCode);

		final JLabel label = new JLabel();
		label.setText("-");
		label.setBounds(234, 704, 4, 16);
		panel.add(label);

		txtPhoneNo = new JTextField();
		txtPhoneNo.setBounds(243, 702, 57, 20);
		panel.add(txtPhoneNo);

		txtMedicalFacility = new JTextField();
		txtMedicalFacility.setBounds(174, 736, 576, 20);
		panel.add(txtMedicalFacility);

		txtPhysicianSignature = new JTextField();
		txtPhysicianSignature.setBounds(130, 775, 353, 20);
		panel.add(txtPhysicianSignature);

		final JLabel thisDocumentSchoolLabel = new JLabel();
		thisDocumentSchoolLabel.setFont(new Font("", Font.BOLD, 14));
		thisDocumentSchoolLabel
				.setText("<HTML><BODY>THIS DOCUMENT SCHOOL BE PROMINENTLY DISPLAYED<BR>&nbsp;&nbsp;&nbsp; AND READILY AVAILABLE TO EMS PERSONNEL</BODY><HTML>");
		thisDocumentSchoolLabel.setBounds(169, 824, 399, 44);
		panel.add(thisDocumentSchoolLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		dateLabel.setText("Date :");
		dateLabel.setBounds(500, 772, 40, 20);
		panel.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MMMMM d, yyyy");
		dcDate.setBounds(546, 773, 102, 20);
		panel.add(dcDate);
		updateData();
	}

	// public static void main(String args[]){
	// PanelMSJN p = new PanelMSJN();
	// JFrame frame = SwingUtils.wrapInFrame(p);
	// frame.setSize(400,400);
	//		
	// final JScrollPane scrollPane = new JScrollPane();
	// scrollPane.setBounds(0,0, 400, 400);
	// frame.add(scrollPane);
	// scrollPane.setViewportView(p);
	// scrollPane.updateUI();
	//		
	//		
	// frame.getContentPane().setBackground(Color.RED);
	// frame.setVisible(true);
	// }
	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		/*
		 * try{ msr =
		 * MedrexClientManager.getInstance().getMonthlySummaryRecord(Global
		 * .currentMonthlySummaryRecordKey); }catch(Exception ex ){
		 * ex.printStackTrace(); }
		 */
		MSJN refMSJN = new MSJN();
		refMSJN.setSerial(Global.currentMsjnKey);
		refMSJN.setResidentId(Global.currentResidenceKey);
		refMSJN.setFormId(Global.currentMonthlySummaryMainPageKey);
		refMSJN.setDate(dcDate.getDate());
		refMSJN.setNoResuscitative(txtNoResuscitative.getText());
		refMSJN.setSurrogateSignature(txtSurrogateSignature.getText());
		refMSJN.setAddress(txtAddress.getText());
		refMSJN.setPhysicianName(txtPhysicianName.getText());
		refMSJN.setPhysicianAddress(txtPhysicianAddress.getText());
		refMSJN.setPhoneCode(txtPhoneCode.getText());
		refMSJN.setPhoneNo(txtPhoneNo.getText());
		refMSJN.setMedicalFacility(txtMedicalFacility.getText());
		refMSJN.setPhysicianSignature(txtPhysicianSignature.getText());
		try {
			Global.currentMsjnKey = MedrexClientManager.getInstance()
					.insertOrUpdateMSJN(refMSJN);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentMsjnKey;
	}

	public void doUpdate() {
		// updateData();

	}

	private void updateData() {
		MSJN refMsnj = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refMsnj = MedrexClientManager.getInstance().getMsnj(
						Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (refMsnj != null) {
				dcDate.setDate(refMsnj.getDate());
				txtNoResuscitative.setText(refMsnj.getNoResuscitative());
				txtSurrogateSignature.setText(refMsnj.getSurrogateSignature());
				txtAddress.setText(refMsnj.getAddress());
				txtPhysicianName.setText(refMsnj.getPhysicianName());
				txtPhysicianAddress.setText(refMsnj.getPhysicianAddress());
				txtPhoneCode.setText(refMsnj.getPhoneCode());
				txtPhoneNo.setText(refMsnj.getPhoneNo());
				txtMedicalFacility.setText(refMsnj.getMedicalFacility());
				txtPhysicianSignature.setText(refMsnj.getPhysicianSignature());
			}

		}

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}
