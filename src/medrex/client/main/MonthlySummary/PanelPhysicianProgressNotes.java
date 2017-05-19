package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.PhysicianProgressNotes;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianProgressNotes extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2337995231102682535L;
	private JTextArea txtAdditionalOrder;
	private JCheckBox cbNotResuscitate;
	private JCheckBox cbEmphasis;
	private JTextArea txtDiscussion;
	private JTextField txtOtherSpecifyDetail;
	private JCheckBox cbOtherSpecifyDNR;
	private JCheckBox cbPhysician;
	private JCheckBox cbNursingStaff;
	private JCheckBox cbFamilyResponsibleParty;
	private JCheckBox cbResident;
	private JTextField txtOtherSpecify;
	private JCheckBox cbSelectOtherSpecify;
	private JCheckBox cbAdvanceDirective;
	private JCheckBox cbChronicDebilitatingDisorder;
	private JCheckBox cbLimitedLife;
	private JCheckBox cbConditionIrreversible;
	private JCheckBox cbCompetentResident;
	private JTextField txtResidentDiagnosis2;
	private JTextField txtResidentDiagnosis1;
	private JTextField txtResidentName;
	private JDateChooser dcDecisionMaker;
	private JDateChooser dcResidentSign;
	private JDateChooser dcPhysicianSig;

	public PanelPhysicianProgressNotes() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(810, 960));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 927, 960);
		add(panel);

		final JLabel plazaHealthcareAndLabel = new JLabel();
		plazaHealthcareAndLabel
				.setText("Plaza healthcare and Rehabilitation Center");
		plazaHealthcareAndLabel.setBounds(414, 21, 216, 14);
		panel.add(plazaHealthcareAndLabel);

		final JLabel physicianProgressNotesLabel = new JLabel();
		physicianProgressNotesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicianProgressNotesLabel.setText("PHYSICIAN PROGRESS NOTES");
		physicianProgressNotesLabel.setBounds(424, 41, 193, 14);
		panel.add(physicianProgressNotesLabel);

		final JLabel doNotResuscitateLabel = new JLabel();
		doNotResuscitateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doNotResuscitateLabel.setText("DO NOT RESUSCITATE/ DO NOT HOSPITALIZE");
		doNotResuscitateLabel.setBounds(375, 61, 275, 14);
		panel.add(doNotResuscitateLabel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel.setText("RESIDENT NAME : ");
		residentNameLabel.setBounds(10, 109, 118, 14);
		panel.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(122, 106, 279, 22);
		panel.add(txtResidentName);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		diagnosisLabel.setText("DIAGNOSIS :");
		diagnosisLabel.setBounds(10, 144, 107, 14);
		panel.add(diagnosisLabel);

		txtResidentDiagnosis1 = new JTextField();
		txtResidentDiagnosis1.setBounds(122, 142, 676, 21);
		panel.add(txtResidentDiagnosis1);

		txtResidentDiagnosis2 = new JTextField();
		txtResidentDiagnosis2.setBounds(10, 179, 788, 21);
		panel.add(txtResidentDiagnosis2);

		final JLabel label = new JLabel();
		label.setText("1.");
		label.setBounds(10, 216, 10, 14);
		panel.add(label);

		final JLabel reasonssForDnrLabel = new JLabel();
		reasonssForDnrLabel
				.setText("REASONS(s) for DNR and/or DNH (CHECK ALL THAT APPLY)");
		reasonssForDnrLabel.setBounds(26, 216, 772, 14);
		panel.add(reasonssForDnrLabel);

		cbCompetentResident = new JCheckBox();
		cbCompetentResident.setBackground(Color.WHITE);
		cbCompetentResident.setText("Requested by competent resident");
		cbCompetentResident.setBounds(10, 256, 264, 18);
		panel.add(cbCompetentResident);

		cbConditionIrreversible = new JCheckBox();
		cbConditionIrreversible.setBackground(Color.WHITE);
		cbConditionIrreversible
				.setText("Condition irreversible, death imminent");
		cbConditionIrreversible.setBounds(10, 280, 216, 18);
		panel.add(cbConditionIrreversible);

		cbLimitedLife = new JCheckBox();
		cbLimitedLife.setBackground(Color.WHITE);
		cbLimitedLife
				.setText("Condition irreversible, limited life expectancy(within six months)");
		cbLimitedLife.setBounds(10, 304, 367, 18);
		panel.add(cbLimitedLife);

		cbChronicDebilitatingDisorder = new JCheckBox();
		cbChronicDebilitatingDisorder.setBackground(Color.WHITE);
		cbChronicDebilitatingDisorder
				.setText("Chronic debilitating disorder, risks and burdens of medical intervation outweigh likely benefits.");
		cbChronicDebilitatingDisorder.setBounds(10, 328, 522, 18);
		panel.add(cbChronicDebilitatingDisorder);

		cbAdvanceDirective = new JCheckBox();
		cbAdvanceDirective.setBackground(Color.WHITE);
		cbAdvanceDirective
				.setText("Is consistent with the resident's Advance Directive/Living Will");
		cbAdvanceDirective.setBounds(10, 352, 353, 18);
		panel.add(cbAdvanceDirective);

		cbSelectOtherSpecify = new JCheckBox();
		cbSelectOtherSpecify.setBackground(Color.WHITE);
		cbSelectOtherSpecify.setText("Other (specify)");
		cbSelectOtherSpecify.setBounds(10, 376, 101, 18);
		panel.add(cbSelectOtherSpecify);

		txtOtherSpecify = new JTextField();
		txtOtherSpecify.setBounds(115, 376, 683, 21);
		panel.add(txtOtherSpecify);

		final JLabel label_1 = new JLabel();
		label_1.setText("2.");
		label_1.setBounds(10, 416, 10, 14);
		panel.add(label_1);

		final JLabel discussionLabel = new JLabel();
		discussionLabel
				.setText("DISCUSSION of DNR and /or DNH, status has occurred with : (CHECK ALL THAT APPLY)");
		discussionLabel.setBounds(26, 416, 534, 14);
		panel.add(discussionLabel);

		cbResident = new JCheckBox();
		cbResident.setBackground(Color.WHITE);
		cbResident.setText("Resident");
		cbResident.setBounds(10, 436, 71, 18);
		panel.add(cbResident);

		cbFamilyResponsibleParty = new JCheckBox();
		cbFamilyResponsibleParty.setBackground(Color.WHITE);
		cbFamilyResponsibleParty.setText("Family, Responsible Party(Specify).");
		cbFamilyResponsibleParty.setBounds(10, 460, 199, 18);
		panel.add(cbFamilyResponsibleParty);

		final JTextField textField_4 = new JTextField();
		textField_4.setBounds(215, 459, 583, 21);
		panel.add(textField_4);

		cbNursingStaff = new JCheckBox();
		cbNursingStaff.setBackground(Color.WHITE);
		cbNursingStaff.setText("Nursing Staff.");
		cbNursingStaff.setBounds(10, 484, 118, 18);
		panel.add(cbNursingStaff);

		cbPhysician = new JCheckBox();
		cbPhysician.setBackground(Color.WHITE);
		cbPhysician.setText("Physician");
		cbPhysician.setBounds(10, 508, 80, 18);
		panel.add(cbPhysician);

		cbOtherSpecifyDNR = new JCheckBox();
		cbOtherSpecifyDNR.setBackground(Color.WHITE);
		cbOtherSpecifyDNR.setText("Other(Specify)");
		cbOtherSpecifyDNR.setBounds(10, 532, 107, 18);
		panel.add(cbOtherSpecifyDNR);

		txtOtherSpecifyDetail = new JTextField();
		txtOtherSpecifyDetail.setBounds(122, 531, 676, 21);
		panel.add(txtOtherSpecifyDetail);

		final JLabel label_2 = new JLabel();
		label_2.setText("3.");
		label_2.setBounds(10, 563, 10, 14);
		panel.add(label_2);

		final JLabel discussionOfDnrLabel = new JLabel();
		discussionOfDnrLabel
				.setText("DISCUSSION OF DNR and/or DNH, order has not taken place with the family because:");
		discussionOfDnrLabel.setBounds(26, 563, 419, 14);
		panel.add(discussionOfDnrLabel);

		txtDiscussion = new JTextArea();
		txtDiscussion.setBorder(new LineBorder(Color.black, 1, false));
		txtDiscussion.setBounds(26, 583, 772, 86);
		panel.add(txtDiscussion);

		final JLabel label_3 = new JLabel();
		label_3.setText("4.");
		label_3.setBounds(10, 683, 10, 14);
		panel.add(label_3);

		final JLabel interventionLabel = new JLabel();
		interventionLabel
				.setText("<html><body>INTERVENTION aimed at curing the resident or restoring the resident to a better - than- present state of health <br> is deemed futile, of no medical benefit, and hence medically inappropriate. The dying process is irreversible. <br> Resuscitation to prevent or reverse death, when it occurs, would only impose additional burden and discomfort upon the resident without any reasonable hope of benefit. therefore I am ordering.</body></html>");
		interventionLabel.setBounds(26, 675, 772, 73);
		panel.add(interventionLabel);

		final JLabel label_4 = new JLabel();
		label_4.setText("A");
		label_4.setBounds(10, 771, 10, 14);
		panel.add(label_4);

		cbEmphasis = new JCheckBox();
		cbEmphasis.setBackground(Color.WHITE);
		cbEmphasis.setText("Emphasis on Comfort, Support and Symtom Control.");
		cbEmphasis.setBounds(26, 769, 275, 18);
		panel.add(cbEmphasis);

		final JLabel bLabel = new JLabel();
		bLabel.setText("B.");
		bLabel.setBounds(10, 800, 10, 14);
		panel.add(bLabel);

		cbNotResuscitate = new JCheckBox();
		cbNotResuscitate.setBackground(Color.WHITE);
		cbNotResuscitate
				.setText("Do Not Resuscitate and /or Do Not Hospitalize");
		cbNotResuscitate.setBounds(23, 798, 254, 18);
		panel.add(cbNotResuscitate);

		final JLabel cLabel = new JLabel();
		cLabel.setText("C.");
		cLabel.setBounds(10, 834, 18, 14);
		panel.add(cLabel);

		final JCheckBox cbNotDisturbedWithTests = new JCheckBox();
		cbNotDisturbedWithTests.setBackground(Color.WHITE);
		cbNotDisturbedWithTests
				.setText("<html><body>The resident is not to be disturbed with tests, unless the information thereby obtainable is<br> expected to be utilized to increase the resident comfort or otherwise benefit the resident</body></html>");
		cbNotDisturbedWithTests.setBounds(27, 827, 725, 32);
		panel.add(cbNotDisturbedWithTests);

		final JLabel dLabel = new JLabel();
		dLabel.setText("D.");
		dLabel.setBounds(10, 868, 16, 18);
		panel.add(dLabel);

		final JLabel additionalOrdersLabel = new JLabel();
		additionalOrdersLabel.setText("Additional orders :");
		additionalOrdersLabel.setBounds(30, 873, 101, 14);
		panel.add(additionalOrdersLabel);

		txtAdditionalOrder = new JTextArea();
		txtAdditionalOrder.setBorder(new LineBorder(Color.black, 1, false));
		txtAdditionalOrder.setBounds(137, 868, 661, 86);
		panel.add(txtAdditionalOrder);

		final JLabel theseOrdersAreLabel = new JLabel();
		theseOrdersAreLabel
				.setText("<html><body>These orders are based upon a sound medical assessment, after consultation with the resident and/ or<br> responsible party of the resident's condition.</body></html>");
		theseOrdersAreLabel.setBounds(10, 970, 788, 47);
		panel.add(theseOrdersAreLabel);

		final JCheckBox doNotResuscitateCheckBox_1 = new JCheckBox();
		doNotResuscitateCheckBox_1.setBackground(Color.WHITE);
		doNotResuscitateCheckBox_1.setText("DO NOT RESUSCITATE");
		doNotResuscitateCheckBox_1.setBounds(34, 1034, 128, 18);
		panel.add(doNotResuscitateCheckBox_1);

		final JCheckBox doNotHospitalizeCheckBox = new JCheckBox();
		doNotHospitalizeCheckBox.setBackground(Color.WHITE);
		doNotHospitalizeCheckBox.setText("DO NOT HOSPITALIZE");
		doNotHospitalizeCheckBox.setBounds(420, 1034, 179, 18);
		panel.add(doNotHospitalizeCheckBox);

		final JLabel physicianSignatureLabel = new JLabel();
		physicianSignatureLabel.setText("Physician Signature :");
		physicianSignatureLabel.setBounds(10, 1081, 107, 14);
		panel.add(physicianSignatureLabel);

		final JTextField textField_6 = new JTextField();
		textField_6.setBounds(122, 1078, 236, 21);
		panel.add(textField_6);

		final JLabel residentsSignatureLabel = new JLabel();
		residentsSignatureLabel.setText("Resident's Signature :");
		residentsSignatureLabel.setBounds(9, 1108, 108, 14);
		panel.add(residentsSignatureLabel);

		final JTextField textField_7 = new JTextField();
		textField_7.setBounds(122, 1105, 236, 21);
		panel.add(textField_7);

		final JLabel surrogateDecisionMakerLabel = new JLabel();
		surrogateDecisionMakerLabel
				.setText("Surrogate Decision Maker, and/or Responsible ");
		surrogateDecisionMakerLabel.setBounds(10, 1139, 236, 14);
		panel.add(surrogateDecisionMakerLabel);

		final JLabel familyMemberSignatureLabel = new JLabel();
		familyMemberSignatureLabel.setText("Family Member Signature :");
		familyMemberSignatureLabel.setBounds(10, 1170, 128, 14);
		panel.add(familyMemberSignatureLabel);

		final JTextField textField_8 = new JTextField();
		textField_8.setBounds(147, 1167, 211, 21);
		panel.add(textField_8);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(424, 1081, 39, 14);
		panel.add(dateLabel);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setText("Date :");
		dateLabel_1.setBounds(424, 1108, 54, 14);
		panel.add(dateLabel_1);

		final JLabel dateLabel_2 = new JLabel();
		dateLabel_2.setText("Date:");
		dateLabel_2.setBounds(424, 1170, 54, 14);
		panel.add(dateLabel_2);

		dcPhysicianSig = new JDateChooser();
		dcPhysicianSig.setDateFormatString("MMMMM d, yyyy");
		dcPhysicianSig.setBounds(455, 1079, 145, 20);
		panel.add(dcPhysicianSig);

		dcResidentSign = new JDateChooser();
		dcResidentSign.setDateFormatString("MMMMM d, yyyy");
		dcResidentSign.setBounds(455, 1106, 145, 20);
		panel.add(dcResidentSign);

		dcDecisionMaker = new JDateChooser();
		dcDecisionMaker.setDateFormatString("MMMMM d, yyyy");
		dcDecisionMaker.setBounds(455, 1164, 145, 20);
		panel.add(dcDecisionMaker);
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		PhysicianProgressNotes refPhysicianProgressNotes = new PhysicianProgressNotes();
		refPhysicianProgressNotes.setResidentId(Global.currentResidenceKey);
		refPhysicianProgressNotes.setFormId(Global.currentMsjnKey);
		refPhysicianProgressNotes
				.setSerial(Global.currentPhysicianProgressNotesKey);
		refPhysicianProgressNotes.setResidentId(Global.currentResidenceKey);
		refPhysicianProgressNotes.setDecisionMaker(dcDecisionMaker.getDate());
		refPhysicianProgressNotes.setResidentSign(dcResidentSign.getDate());
		refPhysicianProgressNotes.setPhysicianSig(dcPhysicianSig.getDate());
		refPhysicianProgressNotes.setResidentName(txtResidentName.getText());
		refPhysicianProgressNotes.setResidentDiagnosis1(txtResidentDiagnosis1
				.getText());
		refPhysicianProgressNotes.setResidentDiagnosis2(txtResidentDiagnosis2
				.getText());
		refPhysicianProgressNotes.setCompetentResident(cbCompetentResident
				.isSelected());
		refPhysicianProgressNotes
				.setConditionIrreversible(cbConditionIrreversible.isSelected());
		refPhysicianProgressNotes.setLimitedLife(cbLimitedLife.isSelected());
		refPhysicianProgressNotes
				.setChronicDebilitatingDisorder(cbChronicDebilitatingDisorder
						.isSelected());
		refPhysicianProgressNotes.setAdvanceDirective(cbAdvanceDirective
				.isSelected());
		refPhysicianProgressNotes.setSelectOtherSpecify(cbSelectOtherSpecify
				.isSelected());
		refPhysicianProgressNotes.setOtherSpecify(txtOtherSpecify.getText());
		refPhysicianProgressNotes.setResident(cbResident.isSelected());
		refPhysicianProgressNotes
				.setFamilyResponsibleParty(cbFamilyResponsibleParty
						.isSelected());
		refPhysicianProgressNotes.setNursingStaff(cbNursingStaff.isSelected());
		refPhysicianProgressNotes.setPhysician(cbPhysician.isSelected());
		refPhysicianProgressNotes.setOtherSpecifyDNR(cbOtherSpecifyDNR
				.isSelected());
		refPhysicianProgressNotes.setOtherSpecifyDetail(txtOtherSpecifyDetail
				.getText());
		refPhysicianProgressNotes.setDiscussion(txtDiscussion.getText());
		refPhysicianProgressNotes.setEmphasis(cbEmphasis.isSelected());
		refPhysicianProgressNotes.setNotResuscitate(cbNotResuscitate
				.isSelected());
		// refPhysicianProgressNotes.setNotDisturbedWithTests(cbNotDisturbedWithTests.isSelected());
		refPhysicianProgressNotes.setAdditionalOrder(txtAdditionalOrder
				.getText());
		// refPhysicianProgressNotes.setNotHospitalizeCheckBox(cbNotHospitalizeCheckBox.isSelected());

		try {
			Global.currentPhysicianProgressNotesKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianNotes(
							refPhysicianProgressNotes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentAssessingResident1;

	}

	@Override
	public void doUpdate() {
		PhysicianProgressNotes refphysicianProgressNotes = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refphysicianProgressNotes = MedrexClientManager.getInstance()
						.getPhysicianProgressNotes(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (refphysicianProgressNotes != null) {
				dcDecisionMaker.setDate(refphysicianProgressNotes
						.getDecisionMaker());
				dcResidentSign.setDate(refphysicianProgressNotes
						.getResidentSign());
				dcPhysicianSig.setDate(refphysicianProgressNotes
						.getPhysicianSig());
				txtResidentName.setText(refphysicianProgressNotes
						.getResidentName());
				txtResidentDiagnosis1.setText(refphysicianProgressNotes
						.getResidentDiagnosis1());
				txtResidentDiagnosis2.setText(refphysicianProgressNotes
						.getResidentDiagnosis2());
				cbCompetentResident.setSelected(refphysicianProgressNotes
						.isCompetentResident());
				cbConditionIrreversible.setSelected(refphysicianProgressNotes
						.isConditionIrreversible());
				cbLimitedLife.setSelected(refphysicianProgressNotes
						.isLimitedLife());
				cbChronicDebilitatingDisorder
						.setSelected(refphysicianProgressNotes
								.isChronicDebilitatingDisorder());
				cbAdvanceDirective.setSelected(refphysicianProgressNotes
						.isAdvanceDirective());
				cbSelectOtherSpecify.setSelected(refphysicianProgressNotes
						.isSelectOtherSpecify());
				txtOtherSpecify.setText(refphysicianProgressNotes
						.getOtherSpecify());
				cbResident.setSelected(refphysicianProgressNotes.isResident());
				cbFamilyResponsibleParty.setSelected(refphysicianProgressNotes
						.isFamilyResponsibleParty());
				cbNursingStaff.setSelected(refphysicianProgressNotes
						.isNursingStaff());
				cbPhysician
						.setSelected(refphysicianProgressNotes.isPhysician());
				cbOtherSpecifyDNR.setSelected(refphysicianProgressNotes
						.isOtherSpecifyDNR());
				txtOtherSpecifyDetail.setText(refphysicianProgressNotes
						.getOtherSpecifyDetail());
				txtDiscussion
						.setText(refphysicianProgressNotes.getDiscussion());
				cbEmphasis.setSelected(refphysicianProgressNotes.isEmphasis());
				cbNotResuscitate.setSelected(refphysicianProgressNotes
						.isNotResuscitate());
				// cbNotDisturbedWithTests.setSelected(refphysicianProgressNotes.isNotDisturbedWithTests());
				txtAdditionalOrder.setText(refphysicianProgressNotes
						.getAdditionalOrder());
				// doNotHospitalizeCheckBox.setSelected(refphysicianProgressNotes.isNotHospitalizeCheckBox());
			}

		}

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}
