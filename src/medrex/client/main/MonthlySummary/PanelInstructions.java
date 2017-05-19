package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.intf.Form;

public class PanelInstructions extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8429758062104491206L;

	public PanelInstructions() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(810, 910));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 804, 1120);
		add(panel);

		final JLabel instructionsForFirstLabel = new JLabel();
		instructionsForFirstLabel.setFont(new Font("Arial Black", Font.PLAIN,
				18));
		instructionsForFirstLabel
				.setText("INSTRUCTIONS FOR FIRST RESPONDERS/EMS");
		instructionsForFirstLabel.setBounds(211, 8, 474, 34);
		panel.add(instructionsForFirstLabel);

		final JLabel allPatientsHaveLabel = new JLabel();
		allPatientsHaveLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		allPatientsHaveLabel
				.setText("<HTML></BODY>ALL PATIENTS HAVE THE RIGHT TO MAKE HEALTHCARE DECISIONS INCLUDING THE RIGHT TO ACCEPT OR  <BR> REFUSE LIFE-SAVING MEDICAL TREATMENT.</BODY></HTML>");
		allPatientsHaveLabel.setBounds(11, 61, 770, 77);
		panel.add(allPatientsHaveLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 15));
		label
				.setText("<HTML></BODY>1. ASSESS THE PATIENT FOR THE ABSENCE OF BREATHING<BR> &nbsp;&nbsp;&nbsp;AND/OR HEARTBEAT.");
		label.setBounds(11, 150, 680, 45);
		panel.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		label_1
				.setText("<HTML><BODY>2. IF THE PATIENT<I><U>IS NOT</U></I> IN CARDIAC AND/OR RESPIRATORY ARREST,<BR>&nbsp;&nbsp;&nbsp;ARREST, PROVIDE <B><I>ALL</I></B> NECESSARY CARE, INCLUDING TRANSPORT<BR> &nbsp;&nbsp;&nbsp;IF REQUIRED. ");
		label_1.setBounds(12, 215, 565, 57);
		panel.add(label_1);

		final JLabel ifThePatientLabel = new JLabel();
		ifThePatientLabel.setFont(new Font("Arial", Font.BOLD, 15));
		ifThePatientLabel
				.setText("<HTML><BODY>3. IF THE PATIENT <I>IS</I> IN CARDIAC AND/OR RESPIRATORY ARREST,<BR> <B><I><U>&nbsp;&nbsp;&nbsp;DO NOT INITIATE CPR </B></I></U> AND RESUSCITATIVE EFFORTS.");
		ifThePatientLabel.setBounds(12, 301, 568, 49);
		panel.add(ifThePatientLabel);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		label_2.setText("4. FOLLOW LOCAL EMS PROTOCOLS FOR PRONOUNCEMENT");
		label_2.setBounds(12, 370, 549, 33);
		panel.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		label_3
				.setText("<HTML><BODY>5. DOCUMENT ALL PERTINENT INFORMATION ON YOUR RUN<BR> SHEET AND ATTACH  A COPY OF THIS OUT-OF-HOSPITAL DNR<BR>ORDER.</BODY></HTML>");
		label_3.setBounds(12, 437, 534, 59);
		panel.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.BOLD, 15));
		label_4
				.setText("<HTML><BODY>6.<I>ONLY</I> THE INDIVIDUAL(S) (PATIENT,SURROGATE, OR PYYSICIAN)<BR> &nbsp;&nbsp;&nbsp;WHO SIGNED THIS FORM MAY RESCIND IT AT ANY TIME</BODY><HTML>");
		label_4.setBounds(12, 516, 566, 64);
		panel.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.BOLD, 15));
		label_5
				.setText("<HTML><BODY>7. PHOTOCOPIES OF THIS DOCUMENT ARE <I><U>ARE PERMITTED</U></I> AND &nbsp;&nbsp;&nbsp;SHALL BE HONORED AT ALL TIMES. ");
		label_5.setBounds(12, 575, 580, 57);
		panel.add(label_5);

		final JLabel thisDocumentItsLabel = new JLabel();
		thisDocumentItsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		thisDocumentItsLabel
				.setText("<HTML><BODY>THIS DOCUMENT, ITS INTENT AND ASSOCIATED POLICIES ARE SUPPORTED BY:</BODY></HTML>");
		thisDocumentItsLabel.setBounds(147, 684, 455, 22);
		panel.add(thisDocumentItsLabel);

		final JLabel medicalSocietyOfLabel = new JLabel();
		medicalSocietyOfLabel.setText("Medical society of New Jersey");
		medicalSocietyOfLabel.setBounds(277, 717, 144, 14);
		panel.add(medicalSocietyOfLabel);

		final JLabel newJerseyDepartmentLabel = new JLabel();
		newJerseyDepartmentLabel
				.setText("New Jersey department of Health and Senior Services");
		newJerseyDepartmentLabel.setBounds(212, 734, 270, 14);
		panel.add(newJerseyDepartmentLabel);

		final JLabel officeOfEmsLabel = new JLabel();
		officeOfEmsLabel.setText("Office of EMS");
		officeOfEmsLabel.setBounds(322, 753, 73, 14);
		panel.add(officeOfEmsLabel);

		final JLabel americanCollegeOfLabel = new JLabel();
		americanCollegeOfLabel
				.setText("American College of Emergency Physicians, New Jersey Chapter");
		americanCollegeOfLabel.setBounds(211, 767, 347, 14);
		panel.add(americanCollegeOfLabel);

		final JLabel newJerseyHospiceLabel = new JLabel();
		newJerseyHospiceLabel
				.setText("New Jersey Hospice and Palliative Care Associatiion");
		newJerseyHospiceLabel.setBounds(239, 784, 260, 14);
		panel.add(newJerseyHospiceLabel);

		final JLabel newJerseyHospiceLabel_1 = new JLabel();
		newJerseyHospiceLabel_1.setText("New Jersey Health Decisions");
		newJerseyHospiceLabel_1.setBounds(289, 801, 143, 14);
		panel.add(newJerseyHospiceLabel_1);

		final JLabel newJerseyHospiceLabel_2 = new JLabel();
		newJerseyHospiceLabel_2
				.setText("New Jersey Hospice and Palliative Care Association");
		newJerseyHospiceLabel_2.setBounds(243, 816, 254, 14);
		panel.add(newJerseyHospiceLabel_2);

		final JLabel academyOfMedicineLabel = new JLabel();
		academyOfMedicineLabel.setText("Academy of Medicine of New Jersey");
		academyOfMedicineLabel.setBounds(274, 833, 178, 14);
		panel.add(academyOfMedicineLabel);

		final JLabel academyOfMedicineLabel_1 = new JLabel();
		academyOfMedicineLabel_1.setText("New Jersey MICU Advisory Council");
		academyOfMedicineLabel_1.setBounds(276, 849, 177, 14);
		panel.add(academyOfMedicineLabel_1);

		final JLabel newJerseyStateLabel = new JLabel();
		newJerseyStateLabel.setText("New Jersey  State First Aid Council");
		newJerseyStateLabel.setBounds(278, 868, 178, 14);
		panel.add(newJerseyStateLabel);

		final JLabel newJerseyStateLabel_1 = new JLabel();
		newJerseyStateLabel_1
				.setText("Office of the Ombudsman for the Institutiionalized Elderly");
		newJerseyStateLabel_1.setBounds(232, 885, 280, 14);
		panel.add(newJerseyStateLabel_1);

		final JLabel newJerseyStateLabel_2 = new JLabel();
		newJerseyStateLabel_2.setText("New Jersey Hospital Association");
		newJerseyStateLabel_2.setBounds(286, 902, 174, 14);
		panel.add(newJerseyStateLabel_2);

		final JLabel ifThereAreLabel = new JLabel();
		ifThereAreLabel
				.setText("<HTML><BODY>IF THERE ARE ANY QUESTIONS CONCERNING THE TREATMENT<BR> AND/OR PRONOUNCEMENT OF THIS PATIENT , CALL</BODY></HTML>");
		ifThereAreLabel.setBounds(216, 921, 319, 33);
		panel.add(ifThereAreLabel);

		final JLabel contactPersonLabel = new JLabel();
		contactPersonLabel.setText("CONTACT PERSON");
		contactPersonLabel.setBounds(22, 1011, 109, 14);
		panel.add(contactPersonLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(124, 1006, 182, 21);
		panel.add(textField);

		final JLabel telephoneLabel = new JLabel();
		telephoneLabel.setText("TELEPHONE");
		telephoneLabel.setBounds(329, 1008, 65, 14);
		panel.add(telephoneLabel);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(407, 1002, 56, 21);
		panel.add(textField_1);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(479, 1002, 56, 21);
		panel.add(textField_2);

		final JTextField textField_3 = new JTextField();
		textField_3.setBounds(550, 1001, 65, 21);
		panel.add(textField_3);

		final JLabel agencyLabel = new JLabel();
		agencyLabel.setText("AGENCY: ");
		agencyLabel.setBounds(25, 1050, 60, 14);
		panel.add(agencyLabel);

		final JTextField textField_4 = new JTextField();
		textField_4.setBounds(74, 1047, 657, 21);
		panel.add(textField_4);
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
