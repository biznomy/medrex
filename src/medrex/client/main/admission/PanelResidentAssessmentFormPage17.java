package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage17;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage17 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5292962376762739131L;

	Theme theme = new BlackOverWhiteTheme();

	private JxLabel lblRoom;
	private JxDateChooser dtInfluenzaDate;
	private JxText txtInfluenzaWitnessSignature;
	private JxComboBox cmbInfluenzaResponsiblePartySignature;
	private JxText txtResonForRefusal;
	private JxDateChooser dtDate1;
	private JxComboBox cmbResponsiblePartySignature1;
	private JxText txtWitnessSignature1;
	private JxDateChooser dtDate;
	private JxText txtWitnessSignature;
	private JxComboBox cmbResponsiblePartySignature;
	private JxLabel lblResidentName;

	public PanelResidentAssessmentFormPage17() {
		super();
		setPreferredSize(new Dimension(910, 1060));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(10, 10, 901, 1042);
		add(panel);

		final JxLabel plazaHealthcareAndLabel = new JxLabel();
		plazaHealthcareAndLabel.setTheme(theme);
		plazaHealthcareAndLabel.setFontSize(18);

		plazaHealthcareAndLabel.setFontStyle(Font.BOLD);
		plazaHealthcareAndLabel
				.setText("Plaza Healthcare And Rehabiliation Center");
		plazaHealthcareAndLabel.setBounds(208, 10, 400, 20);
		panel.add(plazaHealthcareAndLabel);

		final JxLabel idcpWoundsFlowLabel = new JxLabel();
		idcpWoundsFlowLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		idcpWoundsFlowLabel.setTheme(theme);

		idcpWoundsFlowLabel.setFontStyle(Font.BOLD);
		idcpWoundsFlowLabel.setText("CONSENT FORM");
		idcpWoundsFlowLabel.setBounds(285, 45, 185, 20);
		panel.add(idcpWoundsFlowLabel);

		final JxLabel tbPneumococcalInfluenzaLabel = new JxLabel();
		tbPneumococcalInfluenzaLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		tbPneumococcalInfluenzaLabel.setTheme(theme);

		tbPneumococcalInfluenzaLabel.setFontStyle(Font.BOLD);
		tbPneumococcalInfluenzaLabel
				.setText("<HTML><U>TB, PNEUMOCOCCAL, INFLUENZA IMMUNIZATION</U></HTML> ");
		tbPneumococcalInfluenzaLabel.setBounds(208, 75, 424, 20);
		panel.add(tbPneumococcalInfluenzaLabel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setFontStyle(Font.BOLD);
		residentNameLabel.setText("RESIDENT NAME :");
		residentNameLabel.setBounds(10, 107, 155, 20);
		panel.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(170, 100, 294, 18);
		panel.add(lblResidentName);

		final JxLabel tbScreeninhLabel = new JxLabel();
		tbScreeninhLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		tbScreeninhLabel.setTheme(theme);

		tbScreeninhLabel.setFontStyle(Font.BOLD);
		tbScreeninhLabel
				.setText("<html><u>TB SCREENING - (For Your Information)</u></html>");
		tbScreeninhLabel.setBounds(208, 145, 355, 20);
		panel.add(tbScreeninhLabel);

		final JxLabel dueToStateLabel = new JxLabel();
		dueToStateLabel.setTheme(theme);

		dueToStateLabel.setFontStyle(Font.BOLD);
		dueToStateLabel
				.setText("<HTML><P ALIGN =\"JUSTIFY\">DUE TO STATE AND FEDERAL REGULATIOS. IT IS THE POLICY OF PLAZA HEALTHCARE & REHABILITATION CENTER TO PERFORM TB SCREENING ON ALL OF THE NEW RESIDENTS UPON ADMISSION WHEN RESULTS ARE NEGATIVE. THE SCREENING PROCEDURE WILL BE DONE WITH THE CONSENT OF THE RESIDENT'S ATTENDING PHYSICIAN.</P></HTML>");
		dueToStateLabel.setBounds(10, 171, 842, 110);
		// dueToStateLabel.set
		panel.add(dueToStateLabel);

		final JxLabel pneumoccalLabel = new JxLabel();
		pneumoccalLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		pneumoccalLabel.setTheme(theme);

		pneumoccalLabel.setFontStyle(Font.BOLD);
		pneumoccalLabel.setText("<HTML><U>PNEUMOCCAL</U></HTML>");
		pneumoccalLabel.setBounds(308, 287, 142, 20);
		panel.add(pneumoccalLabel);

		final JxLabel iHerebyGiveLabel = new JxLabel();
		iHerebyGiveLabel.setTheme(theme);

		iHerebyGiveLabel.setFontStyle(Font.BOLD);
		iHerebyGiveLabel
				.setText("<HTML><P ALIGN = \"JUSTIFY\">I HEREBY GIVE PLAZA HEALTHCARE + REHABILITATION CENTER PERMISSION TO ADMINISTER A PNEUMOCOCCAL VACCINATION. I UNDERSTAND THAT THIS IMMUNIZATION IS TO BE GIVEN ONLY ONE (1) TIME. TO THE BEST OF MY KNOWLEDGE, I HAVE NOT RECEIVED A PNEUMOCOCCAL VACCINATION. I HAVE BEEN INSTRUCTED THAT AS A RESULT OF THIS VACCINATION, I <U>MAY</U> EXPERIENCE SOME SIDE EFFECTS, SUCH AS SLIGHT DISCOMFORT, SORENESS OF THE ARM, REDNESS OF THE ARM, SLIGHT FEVER, MUSCLE ACHES, JOINT ACHES AND RASH. <BR><BR>I <U>GIVE PERMISSION</U> FOR THE FACILITY TO ADMINISTER A ONE - TIME PNEUMOCOCCAL VACCINATION.</P></HTML> ");
		iHerebyGiveLabel.setBounds(10, 313, 842, 163);
		panel.add(iHerebyGiveLabel);

		final JxLabel responsibleSignatureLabel = new JxLabel();
		responsibleSignatureLabel.setTheme(theme);

		responsibleSignatureLabel.setFontStyle(Font.BOLD);
		responsibleSignatureLabel
				.setText("<HTML><P ALIGN = \"JUSTIFY\">RESIDENT / <BR>RESPONSIBLE PARTY SIGNATURE</P></HTML> ");
		responsibleSignatureLabel.setBounds(31, 482, 280, 46);
		panel.add(responsibleSignatureLabel);

		cmbResponsiblePartySignature = new JxComboBox();
		cmbResponsiblePartySignature.setTheme(theme);

		cmbResponsiblePartySignature.setBounds(31, 534, 267, 23);
		panel.add(cmbResponsiblePartySignature);

		final JxLabel witnessSignatureLabel = new JxLabel();
		witnessSignatureLabel.setTheme(theme);

		witnessSignatureLabel.setFontStyle(Font.BOLD);
		witnessSignatureLabel.setText("WITNESS SIGNATURE");
		witnessSignatureLabel.setBounds(363, 507, 200, 23);
		panel.add(witnessSignatureLabel);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setFontStyle(Font.BOLD);
		dateLabel.setText("DATE");
		dateLabel.setBounds(663, 509, 64, 18);
		panel.add(dateLabel);

		dtDate = new JxDateChooser();
		dtDate.setTheme(theme);

		dtDate.setFontSize(12);
		dtDate.setDateFormatString("MM/dd/yyyy");
		dtDate.setBounds(663, 534, 155, 20);
		panel.add(dtDate);

		txtWitnessSignature = new JxText();
		txtWitnessSignature.setTheme(theme);

		// txtWitnessSignature.setBackground(background);
		// txtWitnessSignature.setForeground(foreground);
		// txtWitnessSignature.setMargin(margin);
		// txtWitnessSignature.setBorder(border);
		txtWitnessSignature.setBounds(363, 534, 190, 21);
		panel.add(txtWitnessSignature);

		final JxLabel iRefusePermissionLabel = new JxLabel();
		iRefusePermissionLabel.setTheme(theme);

		iRefusePermissionLabel.setFontStyle(Font.BOLD);
		iRefusePermissionLabel
				.setText("<HTML>I <U>REFUSE PERMISSION</U> FOR THE FACILITY TO ADMINISTER THE PNEUMOCCAL VACCINATION.</HTML>");
		iRefusePermissionLabel.setBounds(10, 602, 752, 20);
		panel.add(iRefusePermissionLabel);

		final JxLabel responsibleSignatureLabel_1 = new JxLabel();
		responsibleSignatureLabel_1.setTheme(theme);

		responsibleSignatureLabel_1.setFontStyle(Font.BOLD);
		responsibleSignatureLabel_1
				.setText("<HTML><P ALIGN = \"JUSTIFY\">RESIDENT / <BR>RESPONSIBLE PARTY SIGNATURE</P></HTML> ");
		responsibleSignatureLabel_1.setBounds(31, 636, 280, 46);
		panel.add(responsibleSignatureLabel_1);

		// final JxLabel responsibleSignatureLabel_1 = new JxLabel();

		responsibleSignatureLabel_1.setFontStyle(Font.BOLD);
		// responsibleSignatureLabel_1.setText("<HTML><P ALIGN = \"JUSTIFY\">RESIDENT / <BR>RESPONSIBLE PARTY SIGNATURE</P></HTML> ");
		// responsibleSignatureLabel_1.setBounds(31, 628, 267, 46);
		// panel.add(responsibleSignatureLabel_1);

		final JxLabel witnessSignatureLabel_1 = new JxLabel();
		witnessSignatureLabel_1.setTheme(theme);

		witnessSignatureLabel_1.setFontStyle(Font.BOLD);
		witnessSignatureLabel_1.setText("WITNESS SIGNATURE");
		witnessSignatureLabel_1.setBounds(363, 661, 200, 23);
		panel.add(witnessSignatureLabel_1);

		final JxLabel dateLabel_1 = new JxLabel();
		dateLabel_1.setTheme(theme);

		dateLabel_1.setFontStyle(Font.BOLD);
		dateLabel_1.setText("DATE");
		dateLabel_1.setBounds(663, 665, 54, 15);
		panel.add(dateLabel_1);

		cmbResponsiblePartySignature1 = new JxComboBox();
		cmbResponsiblePartySignature1.setTheme(theme);

		cmbResponsiblePartySignature1.setBounds(31, 686, 218, 23);
		panel.add(cmbResponsiblePartySignature1);

		txtWitnessSignature1 = new JxText();
		txtWitnessSignature1.setTheme(theme);

		// txtWitnessSignature1.setBackground(background);
		// txtWitnessSignature1.setForeground(foreground);
		// txtWitnessSignature1.setMargin(margin);
		// txtWitnessSignature1.setBorder(border);
		txtWitnessSignature1.setBounds(363, 686, 190, 21);
		panel.add(txtWitnessSignature1);

		dtDate1 = new JxDateChooser();
		dtDate1.setTheme(theme);

		dtDate1.setFontSize(12);
		dtDate1.setDateFormatString("MM/dd/yyyy");
		dtDate1.setBounds(663, 686, 155, 20);
		panel.add(dtDate1);

		final JxLabel reasonForRefusalLabel = new JxLabel();
		reasonForRefusalLabel.setTheme(theme);

		reasonForRefusalLabel.setFontStyle(Font.BOLD);
		reasonForRefusalLabel.setText("REASON FOR REFUSAL");
		reasonForRefusalLabel.setBounds(10, 745, 190, 20);
		panel.add(reasonForRefusalLabel);

		txtResonForRefusal = new JxText();
		txtResonForRefusal.setTheme(theme);

		txtResonForRefusal.setBounds(215, 745, 634, 21);
		panel.add(txtResonForRefusal);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("..............................................................................................................................................................................................................................");
		label.setBounds(10, 771, 842, 14);
		panel.add(label);

		final JxLabel responsibleSignatureLabel_1_1 = new JxLabel();
		responsibleSignatureLabel_1_1.setTheme(theme);

		responsibleSignatureLabel_1_1.setFontStyle(Font.BOLD);
		responsibleSignatureLabel_1_1.setText("RESPONSIBLE SIGNATURE");
		responsibleSignatureLabel_1_1.setBounds(31, 980, 250, 20);
		panel.add(responsibleSignatureLabel_1_1);

		final JxLabel witnessSignatureLabel_2 = new JxLabel();
		witnessSignatureLabel_2.setTheme(theme);

		witnessSignatureLabel_2.setFontStyle(Font.BOLD);
		witnessSignatureLabel_2.setText("WITNESS SIGNATURE");
		witnessSignatureLabel_2.setBounds(363, 980, 190, 19);
		panel.add(witnessSignatureLabel_2);

		final JxLabel dateLabel_2 = new JxLabel();
		dateLabel_2.setTheme(theme);

		dateLabel_2.setFontStyle(Font.BOLD);
		dateLabel_2.setText("DATE");
		dateLabel_2.setBounds(663, 980, 64, 20);
		panel.add(dateLabel_2);

		cmbInfluenzaResponsiblePartySignature = new JxComboBox();
		cmbInfluenzaResponsiblePartySignature.setTheme(theme);

		cmbInfluenzaResponsiblePartySignature.setBounds(31, 1000, 218, 23);
		panel.add(cmbInfluenzaResponsiblePartySignature);

		txtInfluenzaWitnessSignature = new JxText();
		txtInfluenzaWitnessSignature.setTheme(theme);

		txtInfluenzaWitnessSignature.setBounds(363, 1000, 190, 21);
		panel.add(txtInfluenzaWitnessSignature);

		dtInfluenzaDate = new JxDateChooser();
		dtInfluenzaDate.setTheme(theme);

		dtInfluenzaDate.setFontSize(12);
		dtInfluenzaDate.setDateFormatString("MM/dd/yyyy");
		dtInfluenzaDate.setBounds(663, 1000, 155, 20);
		panel.add(dtInfluenzaDate);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setFontStyle(Font.BOLD);
		roomLabel.setText("ROOM # :");
		roomLabel.setBounds(547, 101, 95, 25);
		panel.add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);

		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(648, 97, 77, 18);
		panel.add(lblRoom);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 791, 839, 163);
		panel.add(panel_1);

		final JxLabel influenzaImmunizationLabel = new JxLabel();
		influenzaImmunizationLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		influenzaImmunizationLabel.setTheme(theme);

		influenzaImmunizationLabel.setFontStyle(Font.BOLD);
		influenzaImmunizationLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		influenzaImmunizationLabel.setText("INFLUENZA IMMUNIZATION");
		influenzaImmunizationLabel.setBounds(10, 10, 819, 21);
		panel_1.add(influenzaImmunizationLabel);

		final JxLabel iHerebyGiveLabel_1 = new JxLabel();
		iHerebyGiveLabel_1.setTheme(theme);

		iHerebyGiveLabel_1.setFontStyle(Font.BOLD);
		iHerebyGiveLabel_1
				.setText("<html>I HEREBY GIVE PLAZA HEALTHCARE & REHABILITATION CENTER PERMISSION TO ADMINISTER AN <BR> INFLUENZA VACCINATION ANNUALLY IN THE FALL. TO THE BEST OF MY KNOWLEDGE. I HAVE NOT <BR>HAD AB ANAPHYLATIC REACTION TO EGGS. I HAVE BEEN INSTRUCTED THAT AS A RESULT OF THIS <BR> VACCINATION, I MAY EXPERIENCE SOME SIDE EFFECTS SUCH AS SLIGHT DISCOMFORT, SORENCESS <BR> OF THE ARM REDESS OF THE ARM, SLIGHT ELEVATION OF TEMERATURE OR MUSCLE ACHES.<html>");
		iHerebyGiveLabel_1.setBounds(10, 37, 825, 105);
		panel_1.add(iHerebyGiveLabel_1);
	}

	public void doLoad() {

	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
			lblResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history ----- Done */
			// txtRoom.setText(rm.getRoom());
			if (roomHist != null) {
				lblRoom.setText(roomHist.getRoom());
			}
		} catch (Exception e) {
		}
		if (Global.currentResidentAssessmentFormKey != 0) {
			ResidentAssessmentFormPage17 rafp17 = null;
			try {
				rafp17 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage17(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage17Key = rafp17.getSerial();
			cmbResponsiblePartySignature.setSelectedItem(rafp17
					.getResponsiblePartySignature()
					+ "");
			txtWitnessSignature.setText(rafp17.getWitnessSignature());
			dtDate.setDate(rafp17.getDate());
			cmbResponsiblePartySignature1.setSelectedItem(rafp17
					.getResponsiblePartySignature1()
					+ "");
			txtWitnessSignature1.setText(rafp17.getWitnessSignature1());
			dtDate1.setDate(rafp17.getDate1());
			txtResonForRefusal.setText(rafp17.getResonForRefusal());
			cmbInfluenzaResponsiblePartySignature.setSelectedItem(rafp17
					.getInfluenzaResponsiblePartySignature()
					+ "");
			txtInfluenzaWitnessSignature.setText(rafp17
					.getInfluenzaWitnessSignature());
			dtInfluenzaDate.setDate(rafp17.getInfluenzaDate());
			lblResidentName.setText(rafp17.getResidentName());
		}
	}

	public int doSave() {

		ResidentAssessmentFormPage17 rafp17 = new ResidentAssessmentFormPage17();
		rafp17.setSerial(Global.currentResidentAssessmentFormPage17Key);
		rafp17.setFormId(Global.currentResidentAssessmentFormKey);

		rafp17.setResidentName(lblResidentName.getText());
		rafp17.setResponsiblePartySignature(cmbResponsiblePartySignature
				.getSelectedItem()
				+ "");
		rafp17.setWitnessSignature(txtWitnessSignature.getText());
		rafp17.setDate(dtDate.getDate());
		rafp17.setResponsiblePartySignature1(cmbResponsiblePartySignature1
				.getSelectedItem()
				+ "");
		rafp17.setWitnessSignature1(txtWitnessSignature1.getText());
		rafp17.setDate1(dtDate1.getDate());
		rafp17.setResonForRefusal(txtResonForRefusal.getText());
		rafp17
				.setInfluenzaResponsiblePartySignature(cmbInfluenzaResponsiblePartySignature
						.getSelectedItem()
						+ "");
		rafp17.setInfluenzaWitnessSignature(txtInfluenzaWitnessSignature
				.getText());
		rafp17.setInfluenzaDate(dtInfluenzaDate.getDate());
		try {
			Global.currentResidentAssessmentFormPage17Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage17(
							rafp17);
			return (0);
		} catch (Exception e) {
			return (0);

		}

	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(
		// lblResidentName, "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtWitnessSignature, "Witness Signature",
						0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 17");
			return false;
		} else {
			return true;
		}
	}

}
