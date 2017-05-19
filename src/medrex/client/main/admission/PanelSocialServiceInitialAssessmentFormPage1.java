package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage1;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelSocialServiceInitialAssessmentFormPage1 extends JxPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7408298056623599475L;
	private JxCheckBox cbOtherFamily;
	private JxCheckBox cbFriends;
	private JxCheckBox cbChildren;
	private JxCheckBox cbspouse;
	private JxCheckBox cbOther;
	private JxCheckBox cbHospice;
	private JxCheckBox cbPermanentPlacement;
	private JxCheckBox cbShortTermStay;
	private JxTextA txtPrimaryDiagnosis;
	private JxTextA textAreaReligionNotes;
	private JxDateChooser txtDOB;
	private JxRadioButton rbSeparated;
	private JxRadioButton rbWidowed;
	private JxRadioButton rbDivorced;
	private JxRadioButton rbMarried;
	private JxRadioButton rbSingle;
	private ButtonGroup buttonGroup = new ButtonGroup();
	// private JxTextA txtSocialHistory;
	private JxText txtFacility;
	// private JxText txtFamily;
	private JxText txtResident;
	private JxText txtPNAManagement;
	private JxText txtOccupation;
	private JxText txtEducation;
	private JxText txtBriefFamilyHistory;
	private JxText txtSiblings;
	private JxText txtPlaceofBirth;
	private JxText txtSex;
	private JxText txtReligion;
	private JxText txtAdmittedFrom;
	private JxText txtPhysician;
	private JxText txtPatientIdentificationNumber;
	private JxDateChooser dcDateofAdmission;
	private JxLabel lblResidentName;
	private JxText txtAdvancedDirectives;
	private JxNotes notes;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;
	Theme theme = new BlackOverWhiteTheme();

	public PanelSocialServiceInitialAssessmentFormPage1() {
		super();
		Global.panelSocialServiceInitialAssessmentFormPage1 = this;
		setBackground(Color.WHITE);
		setLayout(null);
		// setBackground(Color.WHITE);
		setBounds(0, 0, 851, 1021);
		setPreferredSize(new Dimension(900, 1035));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(188, 10, 448, 27);
		add(panel);

		final JxLabel plazaRehabilitationAndLabel = new JxLabel();
		plazaRehabilitationAndLabel.setTheme(theme);

		plazaRehabilitationAndLabel.setFontSize(12);
		plazaRehabilitationAndLabel.setFontStyle(Font.BOLD);
		plazaRehabilitationAndLabel
				.setText("Plaza Rehabilitation And Nursing Center");
		plazaRehabilitationAndLabel.setBounds(104, 5, 270, 16);
		panel.add(plazaRehabilitationAndLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(239, 42, 346, 27);
		add(panel_1);

		final JxLabel plazaRehabilitationAndLabel_1 = new JxLabel();
		plazaRehabilitationAndLabel_1.setTheme(theme);
		plazaRehabilitationAndLabel_1
				.setFont(new Font("Tahoma", Font.BOLD, 14));
		plazaRehabilitationAndLabel_1
				.setText("Social Service Initial Assessment");
		plazaRehabilitationAndLabel_1.setBounds(66, 5, 270, 16);
		panel_1.add(plazaRehabilitationAndLabel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(20, 75, 821, 946);
		add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(10, 10, 803, 30);
		panel_2.add(panel_3);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setBounds(10, 10, 99, 14);
		residentNameLabel.setText("Resident Name");
		panel_3.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(158, 5, 260, 21);
		panel_3.add(lblResidentName);

		final JxLabel dateOfAddmissionLabel = new JxLabel();
		dateOfAddmissionLabel.setTheme(theme);
		dateOfAddmissionLabel.setText("Date Of Addmission");
		dateOfAddmissionLabel.setBounds(424, 10, 112, 14);
		panel_3.add(dateOfAddmissionLabel);

		dcDateofAdmission = new JxDateChooser();
		dcDateofAdmission.setTheme(theme);
		dcDateofAdmission.setDateFormatString("MM/dd/yyyy");

		dcDateofAdmission.setBounds(537, 7, 260, 21);
		panel_3.add(dcDateofAdmission);

		final JxPanel panel_3_1 = new JxPanel();
		panel_3_1.setTheme(theme);

		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 40, 803, 30);
		panel_2.add(panel_3_1);

		final JxLabel residentNameLabel_1 = new JxLabel();
		residentNameLabel_1.setTheme(theme);
		residentNameLabel_1.setText("Patient Identification Number");
		residentNameLabel_1.setBounds(10, 10, 143, 14);
		panel_3_1.add(residentNameLabel_1);

		txtPatientIdentificationNumber = new JxText();
		txtPatientIdentificationNumber.setTheme(theme);

		txtPatientIdentificationNumber.setBounds(159, 5, 259, 21);
		panel_3_1.add(txtPatientIdentificationNumber);

		final JxLabel dateOfAddmissionLabel_1 = new JxLabel();
		dateOfAddmissionLabel_1.setTheme(theme);
		dateOfAddmissionLabel_1.setText("Physician");
		dateOfAddmissionLabel_1.setBounds(424, 10, 112, 14);
		panel_3_1.add(dateOfAddmissionLabel_1);

		txtPhysician = new JxText();
		txtPhysician.setTheme(theme);
		txtPhysician.setBounds(537, 7, 259, 21);
		panel_3_1.add(txtPhysician);

		final JxPanel panel_3_1_1 = new JxPanel();
		panel_3_1_1.setTheme(theme);

		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(10, 70, 803, 55);
		panel_2.add(panel_3_1_1);

		final JxLabel residentNameLabel_1_1 = new JxLabel();
		residentNameLabel_1_1.setTheme(theme);
		residentNameLabel_1_1.setText("Primary Diagnosis");
		residentNameLabel_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1.add(residentNameLabel_1_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_1.setBounds(159, 5, 637, 45);
		panel_3_1_1.add(scrollPane_1);

		txtPrimaryDiagnosis = new JxTextA();
		txtPrimaryDiagnosis.setTheme(theme);
		scrollPane_1.setViewportView(txtPrimaryDiagnosis);

		final JxPanel panel_3_1_1_1 = new JxPanel();
		panel_3_1_1_1.setTheme(theme);

		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(10, 125, 803, 30);
		panel_2.add(panel_3_1_1_1);

		final JxLabel residentNameLabel_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1.setText("Admitted From");
		residentNameLabel_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1.add(residentNameLabel_1_1_1);

		txtAdmittedFrom = new JxText();
		txtAdmittedFrom.setTheme(theme);
		txtAdmittedFrom.setBounds(159, 5, 636, 21);
		panel_3_1_1_1.add(txtAdmittedFrom);

		final JxPanel panel_3_2 = new JxPanel();
		panel_3_2.setTheme(theme);

		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 155, 803, 30);
		panel_2.add(panel_3_2);

		final JxLabel residentNameLabel_2 = new JxLabel();
		residentNameLabel_2.setTheme(theme);
		residentNameLabel_2.setText("Discharge Plan");
		residentNameLabel_2.setBounds(10, 10, 79, 14);
		panel_3_2.add(residentNameLabel_2);

		cbShortTermStay = new JxCheckBox();
		cbShortTermStay.setTheme(theme);

		cbShortTermStay.setText("Short Term Stay");
		cbShortTermStay.setBounds(159, 6, 132, 22);
		panel_3_2.add(cbShortTermStay);

		cbPermanentPlacement = new JxCheckBox();
		cbPermanentPlacement.setTheme(theme);

		cbPermanentPlacement.setText("Permanent Placement");
		cbPermanentPlacement.setBounds(343, 6, 151, 22);
		panel_3_2.add(cbPermanentPlacement);

		cbHospice = new JxCheckBox();
		cbHospice.setTheme(theme);

		cbHospice.setText("Hospice");
		cbHospice.setBounds(539, 6, 109, 22);
		panel_3_2.add(cbHospice);

		cbOther = new JxCheckBox();
		cbOther.setTheme(theme);

		cbOther.setText("Other");
		cbOther.setBounds(675, 6, 87, 22);
		panel_3_2.add(cbOther);

		final JxPanel panel_3_1_1_2 = new JxPanel();
		panel_3_1_1_2.setTheme(theme);

		panel_3_1_1_2.setLayout(null);
		panel_3_1_1_2.setBounds(10, 185, 803, 30);
		panel_2.add(panel_3_1_1_2);

		final JxLabel residentNameLabel_1_1_2 = new JxLabel();
		residentNameLabel_1_1_2.setTheme(theme);
		residentNameLabel_1_1_2.setText("Religion");
		residentNameLabel_1_1_2.setBounds(10, 10, 143, 14);
		panel_3_1_1_2.add(residentNameLabel_1_1_2);

		txtReligion = new JxText();
		txtReligion.setTheme(theme);
		txtReligion.setBounds(159, 5, 91, 20);
		panel_3_1_1_2.add(txtReligion);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setBounds(255, 5, 540, 20);
		panel_3_1_1_2.add(scrollPane);

		textAreaReligionNotes = new JxTextA();
		textAreaReligionNotes.setTheme(theme);
		scrollPane.setViewportView(textAreaReligionNotes);

		final JxPanel panel_3_1_2 = new JxPanel();
		panel_3_1_2.setTheme(theme);

		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(10, 240, 803, 30);
		panel_2.add(panel_3_1_2);

		final JxLabel residentNameLabel_1_2 = new JxLabel();
		residentNameLabel_1_2.setTheme(theme);
		residentNameLabel_1_2.setText("Date of Birth");
		residentNameLabel_1_2.setBounds(10, 10, 143, 14);
		panel_3_1_2.add(residentNameLabel_1_2);

		// //
		// dcAssessmentDate = new JxDateChooser();
		// dcAssessmentDate.setDateFormatString("MM/dd/yyyy");
		// dcAssessmentDate.setBackground(Color.WHITE);
		// ((JTextComponent)dcAssessmentDate.getComponent(1)).setFocusable(false);
		// dcAssessmentDate.remove(dcAssessmentDate.getComponent(0));
		// dcAssessmentDate.setBounds(2, 0, 43, 19);
		// panel_1_1.add(dcAssessmentDate);
		//

		txtDOB = new JxDateChooser();
		txtDOB.setTheme(theme);
		txtDOB.setDateFormatString("MM/dd/yyyy");

		txtDOB.setBounds(159, 5, 177, 21);
		panel_3_1_2.add(txtDOB);

		final JxLabel dateOfAddmissionLabel_1_1 = new JxLabel();
		dateOfAddmissionLabel_1_1.setTheme(theme);
		dateOfAddmissionLabel_1_1.setText("Sex");
		dateOfAddmissionLabel_1_1.setBounds(354, 10, 44, 14);
		panel_3_1_2.add(dateOfAddmissionLabel_1_1);

		txtSex = new JxText();
		txtSex.setTheme(theme);
		txtSex.setBounds(392, 7, 153, 21);
		panel_3_1_2.add(txtSex);

		final JxLabel residentNameLabel_1_2_1 = new JxLabel();
		residentNameLabel_1_2_1.setTheme(theme);
		residentNameLabel_1_2_1.setText("Place of birth");
		residentNameLabel_1_2_1.setBounds(551, 10, 80, 14);
		panel_3_1_2.add(residentNameLabel_1_2_1);

		txtPlaceofBirth = new JxText();
		txtPlaceofBirth.setTheme(theme);
		txtPlaceofBirth.setBounds(617, 7, 176, 21);
		panel_3_1_2.add(txtPlaceofBirth);

		final JxPanel panel_3_1_1_2_1 = new JxPanel();
		panel_3_1_1_2_1.setTheme(theme);

		panel_3_1_1_2_1.setLayout(null);
		panel_3_1_1_2_1.setBounds(10, 216, 803, 24);
		panel_2.add(panel_3_1_1_2_1);

		final JxLabel residentNameLabel_1_1_2_1 = new JxLabel();
		residentNameLabel_1_1_2_1.setTheme(theme);

		residentNameLabel_1_1_2_1.setFontStyle(Font.BOLD);
		residentNameLabel_1_1_2_1.setText("Resident data : ");
		residentNameLabel_1_1_2_1.setBounds(10, 5, 143, 14);
		panel_3_1_1_2_1.add(residentNameLabel_1_1_2_1);

		final JxPanel panel_3_1_1_2_2 = new JxPanel();
		panel_3_1_1_2_2.setTheme(theme);

		panel_3_1_1_2_2.setLayout(null);
		panel_3_1_1_2_2.setBounds(10, 270, 803, 30);
		panel_2.add(panel_3_1_1_2_2);

		final JxLabel residentNameLabel_1_1_2_2 = new JxLabel();
		residentNameLabel_1_1_2_2.setTheme(theme);
		residentNameLabel_1_1_2_2.setText("Siblings");
		residentNameLabel_1_1_2_2.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2.add(residentNameLabel_1_1_2_2);

		txtSiblings = new JxText();
		txtSiblings.setTheme(theme);
		txtSiblings.setBounds(159, 5, 635, 21);
		panel_3_1_1_2_2.add(txtSiblings);

		final JxPanel panel_3_2_1 = new JxPanel();
		panel_3_2_1.setTheme(theme);

		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBounds(10, 300, 803, 30);
		panel_2.add(panel_3_2_1);

		final JxLabel residentNameLabel_2_1 = new JxLabel();
		residentNameLabel_2_1.setTheme(theme);
		residentNameLabel_2_1.setText("Marital Status :");
		residentNameLabel_2_1.setBounds(10, 10, 79, 14);
		panel_3_2_1.add(residentNameLabel_2_1);

		rbSingle = new JxRadioButton();
		rbSingle.setTheme(theme);
		rbSingle.setActionCommand("1");
		buttonGroup.add(rbSingle);

		rbSingle.setText("Single");
		rbSingle.setBounds(159, 6, 91, 22);
		panel_3_2_1.add(rbSingle);

		rbMarried = new JxRadioButton();
		rbMarried.setTheme(theme);
		rbMarried.setActionCommand("2");
		buttonGroup.add(rbMarried);

		rbMarried.setText("Married");
		rbMarried.setBounds(260, 6, 91, 22);
		panel_3_2_1.add(rbMarried);

		rbDivorced = new JxRadioButton();
		rbDivorced.setTheme(theme);
		rbDivorced.setActionCommand("3");
		buttonGroup.add(rbDivorced);

		rbDivorced.setText("Divorced");
		rbDivorced.setBounds(375, 6, 91, 22);
		panel_3_2_1.add(rbDivorced);

		rbWidowed = new JxRadioButton();
		rbWidowed.setTheme(theme);
		rbWidowed.setActionCommand("4");
		buttonGroup.add(rbWidowed);

		rbWidowed.setText("Widowed");
		rbWidowed.setBounds(482, 4, 91, 24);
		panel_3_2_1.add(rbWidowed);

		rbSeparated = new JxRadioButton();
		rbSeparated.setTheme(theme);
		rbSeparated.setActionCommand("5");
		buttonGroup.add(rbSeparated);

		rbSeparated.setText("Separated");
		rbSeparated.setBounds(596, 6, 91, 20);
		panel_3_2_1.add(rbSeparated);

		final JxPanel panel_3_2_1_1 = new JxPanel();
		panel_3_2_1_1.setTheme(theme);

		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setBounds(10, 330, 803, 30);
		panel_2.add(panel_3_2_1_1);

		final JxLabel residentNameLabel_2_1_1 = new JxLabel();
		residentNameLabel_2_1_1.setTheme(theme);
		residentNameLabel_2_1_1.setText("Family Support : ");
		residentNameLabel_2_1_1.setBounds(10, 10, 89, 14);
		panel_3_2_1_1.add(residentNameLabel_2_1_1);

		cbspouse = new JxCheckBox();
		cbspouse.setTheme(theme);

		cbspouse.setText("Spouse");
		cbspouse.setBounds(161, 6, 101, 22);
		panel_3_2_1_1.add(cbspouse);

		cbChildren = new JxCheckBox();
		cbChildren.setTheme(theme);

		cbChildren.setText("Children");
		cbChildren.setBounds(315, 6, 101, 22);
		panel_3_2_1_1.add(cbChildren);

		cbFriends = new JxCheckBox();
		cbFriends.setTheme(theme);

		cbFriends.setText("Friends");
		cbFriends.setBounds(468, 6, 101, 22);
		panel_3_2_1_1.add(cbFriends);

		cbOtherFamily = new JxCheckBox();
		cbOtherFamily.setTheme(theme);

		cbOtherFamily.setText("Other");
		cbOtherFamily.setBounds(615, 6, 101, 22);
		panel_3_2_1_1.add(cbOtherFamily);

		final JxPanel panel_3_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1.setTheme(theme);

		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBounds(10, 360, 803, 30);
		panel_2.add(panel_3_1_1_1_1);

		final JxLabel residentNameLabel_1_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1_1.setText("Brief Family History");
		residentNameLabel_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1_1.add(residentNameLabel_1_1_1_1);

		txtBriefFamilyHistory = new JxText();
		txtBriefFamilyHistory.setTheme(theme);
		txtBriefFamilyHistory.setBounds(159, 5, 634, 21);
		panel_3_1_1_1_1.add(txtBriefFamilyHistory);

		final JxPanel panel_3_1_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1_1.setTheme(theme);

		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBounds(10, 390, 803, 30);
		panel_2.add(panel_3_1_1_1_1_1);

		final JxLabel residentNameLabel_1_1_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1_1_1.setText("Education");
		residentNameLabel_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1_1_1.add(residentNameLabel_1_1_1_1_1);

		txtEducation = new JxText();
		txtEducation.setTheme(theme);
		txtEducation.setBounds(159, 5, 634, 21);
		panel_3_1_1_1_1_1.add(txtEducation);

		final JxPanel panel_3_1_1_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1_1_1.setTheme(theme);

		panel_3_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1.setBounds(10, 420, 803, 30);
		panel_2.add(panel_3_1_1_1_1_1_1);

		final JxLabel residentNameLabel_1_1_1_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1_1_1_1.setText("Occupation");
		residentNameLabel_1_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1_1_1_1.add(residentNameLabel_1_1_1_1_1_1);

		txtOccupation = new JxText();
		txtOccupation.setTheme(theme);
		txtOccupation.setBounds(159, 5, 634, 21);
		panel_3_1_1_1_1_1_1.add(txtOccupation);

		final JxPanel panel_3_2_2 = new JxPanel();
		panel_3_2_2.setTheme(theme);

		panel_3_2_2.setLayout(null);
		panel_3_2_2.setBounds(10, 450, 803, 30);
		panel_2.add(panel_3_2_2);

		final JxLabel residentNameLabel_2_2 = new JxLabel();
		residentNameLabel_2_2.setTheme(theme);
		residentNameLabel_2_2.setText("PNA Management:");
		residentNameLabel_2_2.setBounds(10, 10, 112, 14);
		panel_3_2_2.add(residentNameLabel_2_2);

		txtPNAManagement = new JxText();
		txtPNAManagement.setTheme(theme);
		txtPNAManagement.setBounds(160, 5, 89, 21);
		panel_3_2_2.add(txtPNAManagement);

		final JxLabel dateOfAddmissionLabel_2_3 = new JxLabel();
		dateOfAddmissionLabel_2_3.setTheme(theme);
		dateOfAddmissionLabel_2_3.setText("Resident");
		dateOfAddmissionLabel_2_3.setBounds(255, 10, 72, 14);
		panel_3_2_2.add(dateOfAddmissionLabel_2_3);

		txtResident = new JxText();
		txtResident.setTheme(theme);
		txtResident.setBounds(317, 7, 80, 21);
		panel_3_2_2.add(txtResident);

		final JxLabel dateOfAddmissionLabel_2_1_3 = new JxLabel();
		dateOfAddmissionLabel_2_1_3.setTheme(theme);
		dateOfAddmissionLabel_2_1_3.setText("Family");
		dateOfAddmissionLabel_2_1_3.setBounds(419, 10, 72, 14);
		panel_3_2_2.add(dateOfAddmissionLabel_2_1_3);

		// txtFamily = new JxText();
		// txtFamily.setTheme (theme);
		// txtFamily.setBounds(469, 7, 80, 21);
		// panel_3_2_2.add(txtFamily);

		final JxLabel dateOfAddmissionLabel_2_1_1_3 = new JxLabel();
		dateOfAddmissionLabel_2_1_1_3.setTheme(theme);
		dateOfAddmissionLabel_2_1_1_3.setText("Facility");
		dateOfAddmissionLabel_2_1_1_3.setBounds(570, 10, 52, 14);
		panel_3_2_2.add(dateOfAddmissionLabel_2_1_1_3);

		txtFacility = new JxText();
		txtFacility.setTheme(theme);
		txtFacility.setBounds(614, 7, 80, 21);
		panel_3_2_2.add(txtFacility);

		final JxLabel dateOfAddmissionLabel_2_1_1_1_2 = new JxLabel();
		dateOfAddmissionLabel_2_1_1_1_2.setTheme(theme);
		dateOfAddmissionLabel_2_1_1_1_2.setText("Other");
		dateOfAddmissionLabel_2_1_1_1_2.setBounds(728, 10, 62, 14);
		panel_3_2_2.add(dateOfAddmissionLabel_2_1_1_1_2);

		final JxPanel panel_3_1_1_1_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1_1_1_1.setTheme(theme);

		panel_3_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1.setBounds(10, 480, 803, 30);
		panel_2.add(panel_3_1_1_1_1_1_1_1);

		final JxLabel residentNameLabel_1_1_1_1_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1_1_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1_1_1_1_1.setText("Advanced Directives");
		residentNameLabel_1_1_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1_1_1_1_1.add(residentNameLabel_1_1_1_1_1_1_1);

		txtAdvancedDirectives = new JxText();
		txtAdvancedDirectives.setTheme(theme);
		txtAdvancedDirectives.setBounds(159, 5, 634, 21);
		panel_3_1_1_1_1_1_1_1.add(txtAdvancedDirectives);

		final JxPanel panel_3_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1_1_1_1_1.setTheme(theme);

		panel_3_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1_1.setBounds(10, 510, 803, 429);
		panel_2.add(panel_3_1_1_1_1_1_1_1_1);

		final JxLabel residentNameLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		residentNameLabel_1_1_1_1_1_1_1_1.setTheme(theme);
		residentNameLabel_1_1_1_1_1_1_1_1.setText("Social History");
		residentNameLabel_1_1_1_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_1_1_1_1_1_1.add(residentNameLabel_1_1_1_1_1_1_1_1);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Social Service Initial Assessment Form");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		notes = new JxNotes(isCategories);
		notes.setNotes(defaultNotes);
		notes.setBounds(159, 8, 634, 412);
		panel_3_1_1_1_1_1_1_1_1.add(notes);

		// txtSocialHistory = new JxTextA();
		// txtSocialHistory.setTheme (theme);
		// txtSocialHistory.setBounds(159, 8, 634, 412);
		// panel_3_1_1_1_1_1_1_1_1.add(txtSocialHistory);
		doLoad();
	}

	public HashMap getDoctorsMap() {
		HashMap hm = new HashMap();
		List doctors = null;
		try {
			doctors = MedrexClientManager.getInstance().getDoctorsRecords();

			Iterator i = doctors.iterator();
			while (i.hasNext()) {
				Doctors d = (Doctors) i.next();
				hm.put(d.getSerial(), d);
			}

		} catch (Exception e) {

		}

		return hm;

	}

	public void updateData() {

		SocialServiceInitialAssessmentFormPage1 refSocialServiceInitialAssessmentFormPage1 = null;
		ResidentMain refResidentMain = null;
		CensusStatus refCensusStatus = null;
		if (Global.currentSocialServiceInitialAssessmentKey == 0) {
			try {
				refResidentMain = MedrexClientManager.getInstance()
						.getResident(Global.currentResidenceKey);
				refCensusStatus = MedrexClientManager.getInstance()
						.getCensusLastAdmission(Global.currentResidenceKey);
			} catch (Exception e) {
			}
			if (refResidentMain != null) {
				int maritalState = 0;
				if (refResidentMain.getMaritalStatus().toString()
						.equalsIgnoreCase("Single"))
					maritalState = 1;
				if (refResidentMain.getMaritalStatus().toString()
						.equalsIgnoreCase("Married"))
					maritalState = 2;
				if (refResidentMain.getMaritalStatus().toString()
						.equalsIgnoreCase("Divorced"))
					maritalState = 3;
				if (refResidentMain.getMaritalStatus().toString()
						.equalsIgnoreCase("Widowed"))
					maritalState = 4;
				if (refResidentMain.getMaritalStatus().toString()
						.equalsIgnoreCase("Separated"))
					maritalState = 5;
				SwingUtils.setSelectedButton(buttonGroup, maritalState);
				txtDOB.setDate(refResidentMain.getDob());
				txtPlaceofBirth.setText(refResidentMain.getBirthPlace());
				txtSex.setText("" + refResidentMain.getSex());
				lblResidentName.setText(refResidentMain.getUserName() + " "
						+ refResidentMain.getUserPass());
				txtReligion.setText(refResidentMain.getReligion().toString());
			}
			if (refCensusStatus != null) {
				dcDateofAdmission.setDate(refCensusStatus.getTimestamp());
				String AdmittedFrom = null;
				if (refCensusStatus.getFromId() == 1) {
					AdmittedFrom = "Hospital";
				}
				if (refCensusStatus.getFromId() == 2) {
					AdmittedFrom = "Home";
				}
				if (refCensusStatus.getFromId() == 3) {
					AdmittedFrom = "Other Facility";
				}
				if (refCensusStatus.getFromId() == 3) {
					AdmittedFrom = "Other";
				}
				AdmissionFromSubHead afsh = null;
				PhysicianForm pf = null;
				HashMap hm = getDoctorsMap();

				try {
					afsh = MedrexClientManager.getInstance()
							.getAdmissionFromSubHead(
									refCensusStatus.getFromSubId());
					List<PhysicianForm> list = MedrexClientManager
							.getInstance().getPhysicianForms(
									Global.currentResidenceKey);
					Iterator it = list.iterator();
					while (it.hasNext()) {
						pf = (PhysicianForm) it.next();
						// pavan changed
						String DocType = ((Doctors) hm.get(pf.getPhysician()))
								.getDoctorType().toString();
						if (DocType.equalsIgnoreCase("Physicians")) {
							txtPhysician.setText(((Doctors) hm.get(pf
							// pavan changed
									.getPhysician())).getPhysicianName()
									+ ","
									// pavan changed
									+ ((Doctors) hm.get(pf.getPhysician()))
											.getPhysicianSurName());
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				String AdmittedFromSubHeading = afsh.getName();
				txtAdmittedFrom.setText(AdmittedFrom + " : "
						+ AdmittedFromSubHeading);
			}
			updateDiagnosis();
			try {
				MedrexClientManager.getInstance().getResidentContacts(
						Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// if(rc != null) {
			// int noOfSiblings = 0;
			// // System.out.println("Contacts List Size-"+rc.size());
			// int size = rc.size();
			// while (size > 0) {
			// ResidentContact rr = (ResidentContact) rc.get(size-1 );
			// // System.out.println("Relation-" + rr.getRelationship());
			// if (rr.getRelationship().toString().equalsIgnoreCase(
			// "Brother")
			// || rr.getRelationship().toString()
			// .equalsIgnoreCase("Sister")) {
			// noOfSiblings++;
			// }
			// size--;
			// }
			// txtSiblings.setText(noOfSiblings + "");
			// }
		}
		if (Global.currentSocialServiceInitialAssessmentKey != 0) {
			try {
				refSocialServiceInitialAssessmentFormPage1 = MedrexClientManager
						.getInstance()
						.getSocialServiceInitialAssessmentFormPage1(
								Global.currentSocialServiceInitialAssessmentKey);
			} catch (Exception e) {
			}
			Global.currentSocialServiceInitialAssessmentKey = refSocialServiceInitialAssessmentFormPage1
					.getSerial();
			SwingUtils
					.setSelectedButton(buttonGroup,
							refSocialServiceInitialAssessmentFormPage1
									.getButtonGroup());
			// txtSocialHistory.setText(refSocialServiceInitialAssessmentFormPage1
			// .getSocialHistory());
			notes.setNotes(refSocialServiceInitialAssessmentFormPage1
					.getNotes());
			txtFacility.setText(refSocialServiceInitialAssessmentFormPage1
					.getFacility());
			txtResident.setText(refSocialServiceInitialAssessmentFormPage1
					.getResident());
			txtPNAManagement.setText(refSocialServiceInitialAssessmentFormPage1
					.getPNAManagement());
			txtOccupation.setText(refSocialServiceInitialAssessmentFormPage1
					.getOccupation());
			txtEducation.setText(refSocialServiceInitialAssessmentFormPage1
					.getEducation());
			txtBriefFamilyHistory
					.setText(refSocialServiceInitialAssessmentFormPage1
							.getBriefFamilyHistory());
			txtSiblings.setText(refSocialServiceInitialAssessmentFormPage1
					.getSiblings());
			txtPlaceofBirth.setText(refSocialServiceInitialAssessmentFormPage1
					.getPlaceofBirth());
			txtSex.setText(""
					+ refSocialServiceInitialAssessmentFormPage1.getSex());
			txtReligion.setText(refSocialServiceInitialAssessmentFormPage1
					.getReligion());
			txtAdmittedFrom.setText(refSocialServiceInitialAssessmentFormPage1
					.getAdmittedFrom());
			txtPhysician.setText(refSocialServiceInitialAssessmentFormPage1
					.getPhysician());
			txtPatientIdentificationNumber
					.setText(refSocialServiceInitialAssessmentFormPage1
							.getPatientIdentificationNumber());
			dcDateofAdmission
					.setDate(refSocialServiceInitialAssessmentFormPage1
							.getDateofAdmission());
			lblResidentName.setText(refSocialServiceInitialAssessmentFormPage1
					.getResidentName());
			txtAdvancedDirectives
					.setText(refSocialServiceInitialAssessmentFormPage1
							.getAdvancedDirectives());
			txtDOB.setDate(refSocialServiceInitialAssessmentFormPage1.getDOB());
			textAreaReligionNotes
					.setText(refSocialServiceInitialAssessmentFormPage1
							.getReligionNotes());
			txtPrimaryDiagnosis
					.setText(refSocialServiceInitialAssessmentFormPage1
							.getPrimaryDiagnosis());
			cbOther.setSelected(refSocialServiceInitialAssessmentFormPage1
					.isDischargeOthers());
			cbShortTermStay
					.setSelected(refSocialServiceInitialAssessmentFormPage1
							.isShortTermStay());
			cbPermanentPlacement
					.setSelected(refSocialServiceInitialAssessmentFormPage1
							.isPermanentPlacement());
			cbHospice.setSelected(refSocialServiceInitialAssessmentFormPage1
					.isHospice());
			cbOtherFamily
					.setSelected(refSocialServiceInitialAssessmentFormPage1
							.isFamilyOthers());
			cbspouse.setSelected(refSocialServiceInitialAssessmentFormPage1
					.isSpouse());
			cbChildren.setSelected(refSocialServiceInitialAssessmentFormPage1
					.isChildren());
			cbFriends.setSelected(refSocialServiceInitialAssessmentFormPage1
					.isFriends());
		}
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
				txtPrimaryDiagnosis.setText(tmp);
			}
		}
	}

	public void doLoad() {
		doUpdate();

	}

	public int doSave() {

		try {
			MedrexClientManager.getInstance().insertOrUpdateNotes(
					notes.getNotes());
		} catch (Exception e) {
		}

		SocialServiceInitialAssessmentFormPage1 refSocialServiceInitialAssessmentFormPage1 = new SocialServiceInitialAssessmentFormPage1();
		refSocialServiceInitialAssessmentFormPage1
				.setSerial(Global.currentSocialServiceInitialAssessmentKey);
		refSocialServiceInitialAssessmentFormPage1.setButtonGroup(SwingUtils
				.getSelectedButton(buttonGroup));
		// refSocialServiceInitialAssessmentFormPage1
		// .setSocialHistory(txtSocialHistory.getText());
		refSocialServiceInitialAssessmentFormPage1.setNotes(notes.getNotes());
		refSocialServiceInitialAssessmentFormPage1.setFacility(txtFacility
				.getText());
		refSocialServiceInitialAssessmentFormPage1.setResident(txtResident
				.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setPNAManagement(txtPNAManagement.getText());
		refSocialServiceInitialAssessmentFormPage1.setOccupation(txtOccupation
				.getText());
		refSocialServiceInitialAssessmentFormPage1.setEducation(txtEducation
				.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setBriefFamilyHistory(txtBriefFamilyHistory.getText());
		refSocialServiceInitialAssessmentFormPage1.setSiblings(txtSiblings
				.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setPlaceofBirth(txtPlaceofBirth.getText());
		refSocialServiceInitialAssessmentFormPage1.setSex(txtSex.getText());
		refSocialServiceInitialAssessmentFormPage1.setReligion(txtReligion
				.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setAdmittedFrom(txtAdmittedFrom.getText());
		refSocialServiceInitialAssessmentFormPage1.setPhysician(txtPhysician
				.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setPatientIdentificationNumber(txtPatientIdentificationNumber
						.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setDateofAdmission(dcDateofAdmission.getDate());
		refSocialServiceInitialAssessmentFormPage1
				.setResidentName(lblResidentName.getText());
		refSocialServiceInitialAssessmentFormPage1.setDOB(txtDOB.getDate());
		refSocialServiceInitialAssessmentFormPage1
				.setAdvancedDirectives(txtAdvancedDirectives.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setReligionNotes(textAreaReligionNotes.getText());
		refSocialServiceInitialAssessmentFormPage1
				.setPrimaryDiagnosis(txtPrimaryDiagnosis.getText());
		refSocialServiceInitialAssessmentFormPage1.setDischargeOthers(cbOther
				.isSelected());
		refSocialServiceInitialAssessmentFormPage1
				.setShortTermStay(cbShortTermStay.isSelected());
		refSocialServiceInitialAssessmentFormPage1
				.setPermanentPlacement(cbPermanentPlacement.isSelected());
		refSocialServiceInitialAssessmentFormPage1.setHospice(cbHospice
				.isSelected());
		refSocialServiceInitialAssessmentFormPage1
				.setFamilyOthers(cbOtherFamily.isSelected());
		refSocialServiceInitialAssessmentFormPage1.setSpouse(cbspouse
				.isSelected());
		refSocialServiceInitialAssessmentFormPage1.setChildren(cbChildren
				.isSelected());
		refSocialServiceInitialAssessmentFormPage1.setFriends(cbFriends
				.isSelected());
		try {
			Global.currentSocialServiceInitialAssessmentKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateSocialServiceInitialAssessmentFormPage1(
							refSocialServiceInitialAssessmentFormPage1);
			// for sending trigger word message
			String str = notes.getTriggerWord();
			if (str != null) {
				notes.sendMail(str);
			}

		} catch (Exception e) {
		}
		return 0;
	}

	public void doUpdate() {
		updateData();

	}

	public boolean doValidate() {

		return false;
	}

}
