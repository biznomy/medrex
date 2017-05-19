package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage2;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelSocialServiceInitialAssessmentFormPage2 extends JPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7074751825339092192L;
	private JDateChooser txtDate;
	private JTextField txtSocialWorker;
	// private JTextArea txtFamilyCounseling;
	// private JTextArea txtPsycoSocialNeeds;
	// private JTextArea txtInterest;
	private JTextField txtListOfAssistiveDevices;
	private JTextField txtPhysicalLimitations;
	private JRadioButton rbBed;
	private JRadioButton rbWheelChair;
	private JRadioButton rbWithAssistance;
	private JRadioButton rbIndependantAmbulation;
	private JTextField txtLanguagesSpoken;
	private JTextField txtOthers;
	private JTextField txtPerson;
	private JTextField txtPlace;
	private JTextField txtTime;
	private JRadioButton rbDisoriented;
	private JRadioButton rbDepressed;
	private JRadioButton rbRegressed;
	private JRadioButton rbAlertResponsive;
	private JRadioButton rbForgetful;
	private JTextField txtMentalStatus;
	private JTextField txtHearingCapacity;
	private JTextField txtVisualCapacity;
	private JTextField txtNonVerbal;
	private JTextField txtVerbal;
	private ButtonGroup buttonGroupMobility = new ButtonGroup();
	private ButtonGroup buttonGroupMentalStatus = new ButtonGroup();
	private JxNotes notesInterest;
	private JxNotes notesPsycoSocialNeeds;
	private JxNotes notesFamilyCounseling;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelSocialServiceInitialAssessmentFormPage2() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 0, 881, 980);
		setPreferredSize(new Dimension(900, 1035));

		final JPanel panel_3_1_1_2_1 = new JPanel();
		panel_3_1_1_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_1.setLayout(null);
		panel_3_1_1_2_1.setBounds(10, 10, 850, 30);
		add(panel_3_1_1_2_1);

		final JLabel residentNameLabel_1_1_2_1 = new JLabel();
		residentNameLabel_1_1_2_1.setText("Level of Communication : ");
		residentNameLabel_1_1_2_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_1.add(residentNameLabel_1_1_2_1);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 40, 850, 30);
		add(panel_3);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Verbal :");
		residentNameLabel.setBounds(10, 10, 99, 14);
		panel_3.add(residentNameLabel);

		txtVerbal = new JTextField();
		txtVerbal.setBorder(new LineBorder(Color.black, 1, false));
		txtVerbal.setBounds(158, 5, 261, 21);
		panel_3.add(txtVerbal);

		final JLabel dateOfAddmissionLabel = new JLabel();
		dateOfAddmissionLabel.setText("Non Verbal:");
		dateOfAddmissionLabel.setBounds(454, 10, 75, 14);
		panel_3.add(dateOfAddmissionLabel);

		txtNonVerbal = new JTextField();
		txtNonVerbal.setBorder(new LineBorder(Color.black, 1, false));
		txtNonVerbal.setBounds(539, 7, 305, 21);
		panel_3.add(txtNonVerbal);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 70, 850, 30);
		add(panel_3_1);

		final JLabel residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setText("Visual Capacity");
		residentNameLabel_1.setBounds(10, 10, 99, 14);
		panel_3_1.add(residentNameLabel_1);

		txtVisualCapacity = new JTextField();
		txtVisualCapacity.setBorder(new LineBorder(Color.black, 1, false));
		txtVisualCapacity.setBounds(158, 5, 261, 21);
		panel_3_1.add(txtVisualCapacity);

		final JLabel dateOfAddmissionLabel_1 = new JLabel();
		dateOfAddmissionLabel_1.setText("Hearing Capacity");
		dateOfAddmissionLabel_1.setBounds(450, 10, 90, 14);
		panel_3_1.add(dateOfAddmissionLabel_1);

		txtHearingCapacity = new JTextField();
		txtHearingCapacity.setBorder(new LineBorder(Color.black, 1, false));
		txtHearingCapacity.setBounds(539, 7, 306, 21);
		panel_3_1.add(txtHearingCapacity);

		final JPanel panel_3_1_1_2_2 = new JPanel();
		panel_3_1_1_2_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2.setLayout(null);
		panel_3_1_1_2_2.setBounds(10, 100, 850, 30);
		add(panel_3_1_1_2_2);

		final JLabel residentNameLabel_1_1_2_2 = new JLabel();
		residentNameLabel_1_1_2_2.setText("Mental Status");
		residentNameLabel_1_1_2_2.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2.add(residentNameLabel_1_1_2_2);

		txtMentalStatus = new JTextField();
		txtMentalStatus.setBorder(new LineBorder(Color.black, 1, false));
		txtMentalStatus.setBounds(159, 5, 686, 21);
		panel_3_1_1_2_2.add(txtMentalStatus);

		final JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBackground(Color.WHITE);
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBounds(10, 130, 850, 30);
		add(panel_3_2_1);

		rbAlertResponsive = new JRadioButton();
		rbAlertResponsive.setActionCommand("1");
		buttonGroupMentalStatus.add(rbAlertResponsive);
		rbAlertResponsive.setBackground(Color.WHITE);
		rbAlertResponsive.setText("   Alert Responsive");
		rbAlertResponsive.setBounds(10, 4, 132, 22);
		panel_3_2_1.add(rbAlertResponsive);

		rbForgetful = new JRadioButton();
		rbForgetful.setActionCommand("2");
		buttonGroupMentalStatus.add(rbForgetful);
		rbForgetful.setBackground(Color.WHITE);
		rbForgetful.setText("     Forgetful");
		rbForgetful.setBounds(159, 4, 126, 24);
		panel_3_2_1.add(rbForgetful);

		rbRegressed = new JRadioButton();
		rbRegressed.setActionCommand("3");
		buttonGroupMentalStatus.add(rbRegressed);
		rbRegressed.setBackground(Color.WHITE);
		rbRegressed.setText("    Regressed");
		rbRegressed.setBounds(309, 4, 126, 22);
		panel_3_2_1.add(rbRegressed);

		rbDepressed = new JRadioButton();
		rbDepressed.setActionCommand("4");
		buttonGroupMentalStatus.add(rbDepressed);
		rbDepressed.setBackground(Color.WHITE);
		rbDepressed.setText("    Depressed");
		rbDepressed.setBounds(454, 4, 103, 22);
		panel_3_2_1.add(rbDepressed);

		rbDisoriented = new JRadioButton();
		rbDisoriented.setActionCommand("5");
		buttonGroupMentalStatus.add(rbDisoriented);
		rbDisoriented.setBackground(Color.WHITE);
		rbDisoriented.setText("    Disoriented");
		rbDisoriented.setBounds(592, 4, 132, 22);
		panel_3_2_1.add(rbDisoriented);

		final JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setBounds(10, 160, 850, 30);
		add(panel_3_2_1_1);

		txtTime = new JTextField();
		txtTime.setBorder(new LineBorder(Color.black, 1, false));
		txtTime.setBounds(160, 5, 124, 21);
		panel_3_2_1_1.add(txtTime);

		final JLabel dateOfAddmissionLabel_2_1_2_1 = new JLabel();
		dateOfAddmissionLabel_2_1_2_1.setText("Time");
		dateOfAddmissionLabel_2_1_2_1.setBounds(10, 8, 62, 14);
		panel_3_2_1_1.add(dateOfAddmissionLabel_2_1_2_1);

		txtPlace = new JTextField();
		txtPlace.setBorder(new LineBorder(Color.black, 1, false));
		txtPlace.setBounds(339, 5, 124, 21);
		panel_3_2_1_1.add(txtPlace);

		final JLabel dateOfAddmissionLabel_2_1_1_2_1 = new JLabel();
		dateOfAddmissionLabel_2_1_1_2_1.setText("Place");
		dateOfAddmissionLabel_2_1_1_2_1.setBounds(298, 8, 52, 14);
		panel_3_2_1_1.add(dateOfAddmissionLabel_2_1_1_2_1);

		final JLabel dateOfAddmissionLabel_2_1_1_1_1_1 = new JLabel();
		dateOfAddmissionLabel_2_1_1_1_1_1.setText("Person");
		dateOfAddmissionLabel_2_1_1_1_1_1.setBounds(476, 8, 62, 14);
		panel_3_2_1_1.add(dateOfAddmissionLabel_2_1_1_1_1_1);

		txtOthers = new JTextField();
		txtOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtOthers.setBounds(733, 5, 110, 21);
		panel_3_2_1_1.add(txtOthers);

		final JLabel dateOfAddmissionLabel_2_1_1_1_1_2 = new JLabel();
		dateOfAddmissionLabel_2_1_1_1_1_2.setText("Other:");
		dateOfAddmissionLabel_2_1_1_1_1_2.setBounds(683, 8, 52, 14);
		panel_3_2_1_1.add(dateOfAddmissionLabel_2_1_1_1_1_2);

		txtPerson = new JTextField();
		txtPerson.setBorder(new LineBorder(Color.black, 1, false));
		txtPerson.setBounds(538, 5, 124, 21);
		panel_3_2_1_1.add(txtPerson);

		final JPanel panel_3_1_1_2_2_1 = new JPanel();
		panel_3_1_1_2_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1.setLayout(null);
		panel_3_1_1_2_2_1.setBounds(10, 190, 850, 30);
		add(panel_3_1_1_2_2_1);

		final JLabel residentNameLabel_1_1_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1.setText("Language Spoken : ");
		residentNameLabel_1_1_2_2_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1.add(residentNameLabel_1_1_2_2_1);

		txtLanguagesSpoken = new JTextField();
		txtLanguagesSpoken.setBorder(new LineBorder(Color.black, 1, false));
		txtLanguagesSpoken.setBounds(159, 5, 685, 21);
		panel_3_1_1_2_2_1.add(txtLanguagesSpoken);

		final JPanel panel_3_1_1_2_1_1 = new JPanel();
		panel_3_1_1_2_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_1_1.setLayout(null);
		panel_3_1_1_2_1_1.setBounds(10, 220, 850, 30);
		add(panel_3_1_1_2_1_1);

		final JLabel residentNameLabel_1_1_2_1_1 = new JLabel();
		residentNameLabel_1_1_2_1_1.setText("Mobility Status:");
		residentNameLabel_1_1_2_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_1_1.add(residentNameLabel_1_1_2_1_1);

		final JPanel panel_3_2_1_2 = new JPanel();
		panel_3_2_1_2.setBackground(Color.WHITE);
		panel_3_2_1_2.setLayout(null);
		panel_3_2_1_2.setBounds(10, 250, 850, 30);
		add(panel_3_2_1_2);

		rbIndependantAmbulation = new JRadioButton();
		rbIndependantAmbulation.setActionCommand("1");
		buttonGroupMobility.add(rbIndependantAmbulation);
		rbIndependantAmbulation.setBackground(Color.WHITE);
		rbIndependantAmbulation.setOpaque(true);
		rbIndependantAmbulation.setText("    Independent Ambulation");
		rbIndependantAmbulation.setBounds(10, 4, 173, 22);
		panel_3_2_1_2.add(rbIndependantAmbulation);

		rbWithAssistance = new JRadioButton();
		rbWithAssistance.setActionCommand("2");
		buttonGroupMobility.add(rbWithAssistance);
		rbWithAssistance.setBackground(Color.WHITE);
		rbWithAssistance.setText("    With Assistance");
		rbWithAssistance.setBounds(215, 4, 125, 22);
		panel_3_2_1_2.add(rbWithAssistance);

		rbWheelChair = new JRadioButton();
		rbWheelChair.setActionCommand("3");
		buttonGroupMobility.add(rbWheelChair);
		rbWheelChair.setBackground(Color.WHITE);
		rbWheelChair.setText("    W/C, Geri-Chair");
		rbWheelChair.setBounds(384, 4, 147, 22);
		panel_3_2_1_2.add(rbWheelChair);

		rbBed = new JRadioButton();
		rbBed.setActionCommand("4");
		buttonGroupMobility.add(rbBed);
		rbBed.setBackground(Color.WHITE);
		rbBed.setText("    Bed");
		rbBed.setBounds(597, 4, 72, 22);
		panel_3_2_1_2.add(rbBed);

		final JPanel panel_3_1_1_2_2_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1.setBounds(10, 280, 850, 30);
		add(panel_3_1_1_2_2_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1.setText("Physical Limitations :");
		residentNameLabel_1_1_2_2_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1_1.add(residentNameLabel_1_1_2_2_1_1);

		txtPhysicalLimitations = new JTextField();
		txtPhysicalLimitations.setBorder(new LineBorder(Color.black, 1, false));
		txtPhysicalLimitations.setBounds(159, 5, 686, 21);
		panel_3_1_1_2_2_1_1.add(txtPhysicalLimitations);

		final JPanel panel_3_1_1_2_2_1_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1_1.setBounds(10, 310, 850, 30);
		add(panel_3_1_1_2_2_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1.setText("Use Of Assistive Devices :");
		residentNameLabel_1_1_2_2_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1);

		txtListOfAssistiveDevices = new JTextField();
		txtListOfAssistiveDevices.setBorder(new LineBorder(Color.black, 1,
				false));
		txtListOfAssistiveDevices.setBounds(159, 5, 686, 21);
		panel_3_1_1_2_2_1_1_1.add(txtListOfAssistiveDevices);

		final JPanel panel_3_1_1_2_2_1_1_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1_1_1.setBounds(10, 340, 850, 165);
		add(panel_3_1_1_2_2_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1.setText("Interests :");
		residentNameLabel_1_1_2_2_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Social Service Initial Assessment Form");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		notesInterest = new JxNotes(isCategories);
		notesInterest.setNotes(defaultNotes);
		notesInterest.setBounds(159, 10, 687, 145);
		panel_3_1_1_2_2_1_1_1_1.add(notesInterest);

		// txtInterest = new JTextArea();
		// txtInterest.setBorder(new LineBorder(Color.black, 1, false));
		// txtInterest.setBounds(159, 10, 687, 145);
		// panel_3_1_1_2_2_1_1_1_1.add(txtInterest);

		final JPanel panel_3_1_1_2_2_1_1_1_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_1_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1_1_1_1.setBounds(10, 505, 850, 165);
		add(panel_3_1_1_2_2_1_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1.setText("Psyco- Social Needs:");
		residentNameLabel_1_1_2_2_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1);

		Notes defaultNotes1 = new Notes();
		defaultNotes1.setFormName("Social Service Initial Assessment Form");
		defaultNotes1.setUserId(Global.currentLoggedInUserKey);
		defaultNotes1.setNoteText("");

		notesPsycoSocialNeeds = new JxNotes(isCategories);
		notesPsycoSocialNeeds.setNotes(defaultNotes1);
		notesPsycoSocialNeeds.setBounds(159, 10, 688, 145);
		panel_3_1_1_2_2_1_1_1_1_1.add(notesPsycoSocialNeeds);

		// txtPsycoSocialNeeds = new JTextArea();
		// txtPsycoSocialNeeds.setBorder(new LineBorder(Color.black, 1, false));
		// txtPsycoSocialNeeds.setBounds(159, 10, 688, 145);
		// panel_3_1_1_2_2_1_1_1_1_1.add(txtPsycoSocialNeeds);

		final JPanel panel_3_1_1_2_2_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1_1_1_1_1.setBounds(10, 670, 861, 235);
		add(panel_3_1_1_2_2_1_1_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1.setText("Family Counseling:");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_2_1_1_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1);

		Notes defaultNotes2 = new Notes();
		defaultNotes2.setFormName("Social Service Initial Assessment Form");
		defaultNotes2.setUserId(Global.currentLoggedInUserKey);
		defaultNotes2.setNoteText("");

		notesFamilyCounseling = new JxNotes(isCategories);
		notesFamilyCounseling.setNotes(defaultNotes2);
		notesFamilyCounseling.setBounds(159, 10, 692, 215);
		panel_3_1_1_2_2_1_1_1_1_1_1.add(notesFamilyCounseling);

		// txtFamilyCounseling = new JTextArea();
		// txtFamilyCounseling.setBorder(new LineBorder(Color.black, 1, false));
		// txtFamilyCounseling.setBounds(159, 10, 692, 215);
		// panel_3_1_1_2_2_1_1_1_1_1_1.add(txtFamilyCounseling);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 905, 861, 30);
		add(panel_3_2);

		final JLabel residentNameLabel_2 = new JLabel();
		residentNameLabel_2.setText("Social Worker :");
		residentNameLabel_2.setBounds(10, 10, 99, 14);
		panel_3_2.add(residentNameLabel_2);

		txtSocialWorker = new JTextField();
		txtSocialWorker.setBorder(new LineBorder(Color.black, 1, false));
		txtSocialWorker.setBounds(158, 5, 225, 21);
		panel_3_2.add(txtSocialWorker);

		final JLabel dateOfAddmissionLabel_2 = new JLabel();
		dateOfAddmissionLabel_2.setText("Date :");
		dateOfAddmissionLabel_2.setBounds(514, 10, 59, 14);
		panel_3_2.add(dateOfAddmissionLabel_2);

		txtDate = new JDateChooser();
		txtDate.setDateFormatString("MM/dd/yyyy");
		txtDate.setBackground(Color.WHITE);
		txtDate.setBorder(new LineBorder(Color.black, 1, false));
		txtDate.setBounds(584, 7, 265, 21);
		panel_3_2.add(txtDate);

		final JPanel panel_3_1_1_2_1_2 = new JPanel();
		panel_3_1_1_2_1_2.setBackground(Color.WHITE);
		panel_3_1_1_2_1_2.setLayout(null);
		panel_3_1_1_2_1_2.setBounds(10, 935, 861, 30);
		add(panel_3_1_1_2_1_2);

		final JLabel residentNameLabel_1_1_2_1_2 = new JLabel();
		residentNameLabel_1_1_2_1_2.setText("Rev : 2.02");
		residentNameLabel_1_1_2_1_2.setBounds(10, 10, 143, 14);
		panel_3_1_1_2_1_2.add(residentNameLabel_1_1_2_1_2);
		// doLoad();
	}

	public void updateData() {
		if (Global.currentSocialServiceInitialAssessmentKey == 0) {
			ResidentMain refResMain = null;
			try {
				refResMain = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			txtLanguagesSpoken.setText(refResMain.getLanguage().toString());
		}
		SocialServiceInitialAssessmentFormPage2 refSocialServiceInitialAssessmentFormPage2 = null;
		if (Global.currentSocialServiceInitialAssessmentKey != 0) {
			try {
				refSocialServiceInitialAssessmentFormPage2 = MedrexClientManager
						.getInstance()
						.getSocialServiceInitialAssessmentFormPage2(
								Global.currentSocialServiceInitialAssessmentKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentSocialServiceInitialAssessmentForm2Key = refSocialServiceInitialAssessmentFormPage2
					.getSerial();
			txtDate.setDate(refSocialServiceInitialAssessmentFormPage2
					.getDateOfAssessment());
			txtSocialWorker.setText(refSocialServiceInitialAssessmentFormPage2
					.getSocialWorker());
			// txtFamilyCounseling.setText(refSocialServiceInitialAssessmentFormPage2.getFamilyCounseling());
			// txtPsycoSocialNeeds.setText(refSocialServiceInitialAssessmentFormPage2.getPsycoSocialNeeds());
			// txtInterest.setText(refSocialServiceInitialAssessmentFormPage2.getInterest());
			notesFamilyCounseling
					.setNotes(refSocialServiceInitialAssessmentFormPage2
							.getNotesFamilyCounseling());
			notesPsycoSocialNeeds
					.setNotes(refSocialServiceInitialAssessmentFormPage2
							.getNotesPsycoSocialNeeds());
			notesInterest.setNotes(refSocialServiceInitialAssessmentFormPage2
					.getNotesInterest());
			txtListOfAssistiveDevices
					.setText(refSocialServiceInitialAssessmentFormPage2
							.getListOfAssistiveDevices());
			txtPhysicalLimitations
					.setText(refSocialServiceInitialAssessmentFormPage2
							.getPhysicalLimitations());
			txtLanguagesSpoken
					.setText(refSocialServiceInitialAssessmentFormPage2
							.getLanguagesSpoken());
			txtOthers.setText(refSocialServiceInitialAssessmentFormPage2
					.getOthers());
			txtPerson.setText(refSocialServiceInitialAssessmentFormPage2
					.getPerson());
			txtPlace.setText(refSocialServiceInitialAssessmentFormPage2
					.getPlace());
			txtTime.setText(refSocialServiceInitialAssessmentFormPage2
					.getTimeOfAssessment());
			txtMentalStatus.setText(refSocialServiceInitialAssessmentFormPage2
					.getMentalStatus());
			txtHearingCapacity
					.setText(refSocialServiceInitialAssessmentFormPage2
							.getHearingCapacity());
			txtVisualCapacity
					.setText(refSocialServiceInitialAssessmentFormPage2
							.getVisualCapacity());
			txtNonVerbal.setText(refSocialServiceInitialAssessmentFormPage2
					.getNonVerbal());
			txtVerbal.setText(refSocialServiceInitialAssessmentFormPage2
					.getVerbal());
			SwingUtils.setSelectedButton(buttonGroupMobility,
					refSocialServiceInitialAssessmentFormPage2
							.getButtonGroupMobility());
			SwingUtils.setSelectedButton(buttonGroupMentalStatus,
					refSocialServiceInitialAssessmentFormPage2
							.getButtonGroupMentalStatus());
		}
	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {
		try {
			MedrexClientManager.getInstance().insertOrUpdateNotes(
					notesInterest.getNotes());
			MedrexClientManager.getInstance().insertOrUpdateNotes(
					notesPsycoSocialNeeds.getNotes());
			MedrexClientManager.getInstance().insertOrUpdateNotes(
					notesFamilyCounseling.getNotes());
		} catch (Exception e) {
		}

		SocialServiceInitialAssessmentFormPage2 refSocialServiceInitialAssessmentFormPage2 = new SocialServiceInitialAssessmentFormPage2();
		// SocialServiceInitialAssessmentFormPage1 refForm1=null;
		// try{
		// refForm1=MedrexClientManager.getInstance().getSocialServiceInitialAssessmentFormPage1(Global.currentSocialServiceInitialAssessmentKey);
		// }
		// catch(Exception e){
		// e.printStackTrace();
		// }
		// System.out.println(Global.currentSocialServiceInitialAssessmentKey);
		// System.out.println(Global.currentSocialServiceInitialAssessmentForm2Key);

		refSocialServiceInitialAssessmentFormPage2
				.setFormId(Global.currentSocialServiceInitialAssessmentKey);
		refSocialServiceInitialAssessmentFormPage2
				.setSerial(Global.currentSocialServiceInitialAssessmentForm2Key);
		// refSocialServiceInitialAssessmentFormPage2.setFormId(refForm1.getSerial());
		refSocialServiceInitialAssessmentFormPage2.setDateOfAssessment(txtDate
				.getDate());
		refSocialServiceInitialAssessmentFormPage2
				.setSocialWorker(txtSocialWorker.getText());
		// refSocialServiceInitialAssessmentFormPage2.setFamilyCounseling(txtFamilyCounseling.getText());
		// refSocialServiceInitialAssessmentFormPage2.setPsycoSocialNeeds(txtPsycoSocialNeeds.getText());
		// refSocialServiceInitialAssessmentFormPage2.setInterest(txtInterest.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setNotesFamilyCounseling(notesFamilyCounseling.getNotes());
		refSocialServiceInitialAssessmentFormPage2
				.setNotesPsycoSocialNeeds(notesPsycoSocialNeeds.getNotes());
		refSocialServiceInitialAssessmentFormPage2
				.setNotesInterest(notesInterest.getNotes());
		refSocialServiceInitialAssessmentFormPage2
				.setListOfAssistiveDevices(txtListOfAssistiveDevices.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setPhysicalLimitations(txtPhysicalLimitations.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setLanguagesSpoken(txtLanguagesSpoken.getText());
		refSocialServiceInitialAssessmentFormPage2.setOthers(txtOthers
				.getText());
		refSocialServiceInitialAssessmentFormPage2.setPerson(txtPerson
				.getText());
		refSocialServiceInitialAssessmentFormPage2.setPlace(txtPlace.getText());
		refSocialServiceInitialAssessmentFormPage2.setTimeOfAssessment(txtTime
				.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setMentalStatus(txtMentalStatus.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setHearingCapacity(txtHearingCapacity.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setVisualCapacity(txtVisualCapacity.getText());
		refSocialServiceInitialAssessmentFormPage2.setNonVerbal(txtNonVerbal
				.getText());
		refSocialServiceInitialAssessmentFormPage2.setVerbal(txtVerbal
				.getText());
		refSocialServiceInitialAssessmentFormPage2
				.setButtonGroupMobility(SwingUtils
						.getSelectedButton(buttonGroupMobility));
		refSocialServiceInitialAssessmentFormPage2
				.setButtonGroupMentalStatus(SwingUtils
						.getSelectedButton(buttonGroupMentalStatus));

		try {
			Global.currentSocialServiceInitialAssessmentForm2Key = MedrexClientManager
					.getInstance()
					.insertOrUpdateSocialServiceInitialAssessmentFormPage2(
							refSocialServiceInitialAssessmentFormPage2);

			// for sending trigger word message
			String str = null;
			str = notesFamilyCounseling.getTriggerWord();
			if (str == null) {
				str = notesPsycoSocialNeeds.getTriggerWord();
			} else {
				str += notesPsycoSocialNeeds.getTriggerWord();
			}
			if (str == null) {
				str = notesInterest.getTriggerWord();
			} else {
				str += notesInterest.getTriggerWord();
			}

			if (str != null) {
				notesInterest.sendMail(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void doUpdate() {
		updateData();
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
