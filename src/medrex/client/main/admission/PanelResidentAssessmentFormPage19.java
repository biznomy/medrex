package medrex.client.main.admission;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage19 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5816682939128799996L;
	private JCheckBox cbNotAvailable;
	private ButtonGroup bgSpeech = new ButtonGroup();
	private ButtonGroup bgAlert = new ButtonGroup();
	private ButtonGroup bgEyesOpen = new ButtonGroup();
	private JComboBox cmbRTLowerExtrimity;
	private JComboBox cmbRTUpperExtrimity;
	private JComboBox cmbLTLowerExtrimity;
	private JComboBox cmbLTUpperExtrimity;
	private JRadioButton rbNoSpeech;
	private JRadioButton rbIncomprehensibleSpeech;
	private JRadioButton rbInappropriateWords;
	private JRadioButton rbConfusedConversation;
	private JRadioButton rbSpeechoriented;
	private JRadioButton rbComatose;
	private JRadioButton rbStoprous;
	private JRadioButton rbDrowsy;
	private JRadioButton rbAlert;
	private JRadioButton rbDoesNotOpen;
	private JRadioButton rbOpensToPain;
	private JRadioButton rbOpenToSpeech;
	private JRadioButton rbOpenSpontaneously;
	private JComboBox cmbLPupil;
	private JComboBox cmbRPupil;
	private JComboBox cmbShallowIrregular;
	private JTextField txtNormal;
	private JTextField txtRespiration;
	private JTextField txtPulse;
	private JTextField txtTemprature;
	private JTextField txtBloodPressure;
	private JTextField txtTime;
	private JDateChooser dcAssessmentDate;
	private JDateChooser dcDate;
	private JTextField txtRoomNum;
	private JTextField txtResidentName;
	private JLabel imgLabel;
	private JTextField txtRoomBed;
	private JTextField txtRecordNo;
	private JTextField txtAttendingPhysician;
	private JTextField txtMiddleName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	PanelResidentAssessmentFormPageCol19[] panelCol;
	List<ResidentAssessmentFormPage19Col> columns;

	SpinnerDateModel model;
	final JSpinner spinner;

	public PanelResidentAssessmentFormPage19() {
		super();
		columns = new ArrayList<ResidentAssessmentFormPage19Col>();
		Global.panelResidentAssessmentFormPage19 = this;

		setLayout(null);
		setBackground(Color.WHITE);
		// setBounds(0,0,949,1250);
		setPreferredSize(new Dimension(950, 1250));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(285, 0, 386, 26);
		add(panel);

		final JLabel neorologicalAssessmentLabel = new JLabel();
		neorologicalAssessmentLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		neorologicalAssessmentLabel.setText("NEUROLOGICAL ASSESSMENT");
		neorologicalAssessmentLabel.setBounds(68, 0, 270, 26);
		panel.add(neorologicalAssessmentLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 66, 930, 1049);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 2, 826, 29);
		panel_1.add(panel_2);

		final JLabel instructionsLabel = new JLabel();
		instructionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		instructionsLabel.setBounds(10, 5, 94, 14);
		instructionsLabel.setText("INSTRUCTIONS:");
		panel_2.add(instructionsLabel);

		final JLabel completeFormAndLabel = new JLabel();
		completeFormAndLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		completeFormAndLabel
				.setText("Complete form and describe any neurological problems on the reverse. Frequency per facility policy");
		completeFormAndLabel.setBounds(123, 6, 693, 14);
		panel_2.add(completeFormAndLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 47, 183, 992);
		panel_1.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 10, 179, 60);
		panel_4.add(panel_5);

		final JPanel panel_8_3_1_3 = new JPanel();
		panel_8_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_3.setBackground(Color.WHITE);
		panel_8_3_1_3.setLayout(null);
		panel_8_3_1_3.setBounds(0, 0, 178, 28);
		panel_5.add(panel_8_3_1_3);

		final JLabel DateLabel = new JLabel();
		DateLabel.setBackground(Color.WHITE);
		DateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DateLabel.setText("Date");
		DateLabel.setBounds(10, 10, 26, 14);
		panel_8_3_1_3.add(DateLabel);

		/*
		 * dcDate = new JDateChooser();
		 * dcDate.setDate(MedrexClientManager.getServerTime());
		 * dcDate.setBounds(47, 5, 121, 20); panel_8_3_1_3.add(dcDate);
		 */
		final JPanel panel_8_3_1_3_1 = new JPanel();
		panel_8_3_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_3_1.setBackground(Color.WHITE);
		panel_8_3_1_3_1.setLayout(null);
		panel_8_3_1_3_1.setBounds(0, 34, 178, 23);
		panel_5.add(panel_8_3_1_3_1);

		final JLabel TimeLabel = new JLabel();
		TimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TimeLabel.setText("Time");
		TimeLabel.setBounds(10, 0, 36, 20);
		panel_8_3_1_3_1.add(TimeLabel);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		spinner.addChangeListener(new ChangeListener() {

			public void stateChanged(final ChangeEvent e) {
				SimpleDateFormat df = new SimpleDateFormat("hh:mm: a");
				txtTime.setText(df.format(model.getDate()));
			}
		});
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);
		spinner.setBounds(47, 4, 121, 15);
		panel_8_3_1_3_1.add(spinner);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 73, 179, 183);
		panel_4.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 42, 183);
		panel_6.add(panel_7);

		final JLabel vitalSignsLabel = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/VITAL.jpg"));
		// vitalSignsLabel.setForeground(Color.WHITE);
		// vitalSignsLabel.setBounds(0, 10, 42, 173);
		panel_7.setLayout(new BorderLayout());
		panel_7.add(vitalSignsLabel, BorderLayout.CENTER);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(48, 0, 130, 24);
		panel_6.add(panel_8);

		final JLabel bloodPressureLabel = new JLabel();
		bloodPressureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bloodPressureLabel.setText("Blood Pressure");
		bloodPressureLabel.setBounds(10, 5, 120, 14);
		panel_8.add(bloodPressureLabel);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(48, 29, 130, 28);
		panel_6.add(panel_8_1);

		final JLabel tempratureLabel = new JLabel();
		tempratureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tempratureLabel.setText("Temprature");
		tempratureLabel.setBounds(10, 10, 125, 14);
		panel_8_1.add(tempratureLabel);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(48, 62, 130, 24);
		panel_6.add(panel_8_2);

		final JLabel pulseLabel = new JLabel();
		pulseLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pulseLabel.setBounds(10, 5, 54, 14);
		panel_8_2.add(pulseLabel);
		pulseLabel.setText("Pulse");

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setBackground(Color.WHITE);
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(48, 88, 130, 28);
		panel_6.add(panel_8_3);

		final JLabel respirationLabel = new JLabel();
		respirationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		respirationLabel.setText("Respiration");
		respirationLabel.setBounds(10, 10, 91, 14);
		panel_8_3.add(respirationLabel);

		final JPanel panel_8_4 = new JPanel();
		panel_8_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4.setBackground(Color.WHITE);
		panel_8_4.setLayout(null);
		panel_8_4.setBounds(48, 122, 130, 23);
		panel_6.add(panel_8_4);

		final JLabel normalLabel = new JLabel();
		normalLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		normalLabel.setText("Normal");
		normalLabel.setBounds(35, 5, 79, 14);
		panel_8_4.add(normalLabel);

		final JPanel panel_8_5 = new JPanel();
		panel_8_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_5.setBackground(Color.WHITE);
		panel_8_5.setLayout(null);
		panel_8_5.setBounds(48, 151, 130, 28);
		panel_6.add(panel_8_5);

		final JLabel shallowirregularLabel = new JLabel();
		shallowirregularLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		shallowirregularLabel.setText("Shallow/Irregular");
		shallowirregularLabel.setBounds(35, 8, 96, 14);
		panel_8_5.add(shallowirregularLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 262, 182, 133);
		panel_4.add(panel_9);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.BLACK);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 0, 42, 133);
		panel_9.add(panel_7_1);

		final JLabel lblPupilResponse = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/PUPIL.jpg"));
		lblPupilResponse.setText("");
		lblPupilResponse.setBounds(0, 54, 42, 14);
		panel_7_1.setLayout(new BorderLayout());
		panel_7_1.add(lblPupilResponse, BorderLayout.CENTER);

		final JPanel panel_8_3_1 = new JPanel();
		panel_8_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1.setBackground(Color.WHITE);
		panel_8_3_1.setLayout(null);
		panel_8_3_1.setBounds(48, 3, 130, 27);
		panel_9.add(panel_8_3_1);

		final JLabel RPupilLabel = new JLabel();
		RPupilLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RPupilLabel.setText("R Pupil     Size/React");
		RPupilLabel.setBounds(10, 10, 125, 14);
		panel_8_3_1.add(RPupilLabel);

		final JPanel panel_8_3_2 = new JPanel();
		panel_8_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2.setBackground(Color.WHITE);
		panel_8_3_2.setLayout(null);
		panel_8_3_2.setBounds(48, 36, 130, 28);
		panel_9.add(panel_8_3_2);

		final JLabel LPupilLabel = new JLabel();
		LPupilLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LPupilLabel.setText("L Pupil      Size/React");
		LPupilLabel.setBounds(10, 10, 116, 14);
		panel_8_3_2.add(LPupilLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(0, 399, 179, 116);
		panel_4.add(panel_9_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.BLACK);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 0, 42, 113);
		panel_9_1.add(panel_7_1_1);

		final JLabel lbleyeLabel = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/EYE.jpg"));
		lbleyeLabel.setText("");
		lbleyeLabel.setBounds(0, 45, 32, 14);
		panel_7_1_1.setLayout(new BorderLayout());
		panel_7_1_1.add(lbleyeLabel, BorderLayout.CENTER);

		final JPanel panel_8_3_1_1 = new JPanel();
		panel_8_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1.setBackground(Color.WHITE);
		panel_8_3_1_1.setLayout(null);
		panel_8_3_1_1.setBounds(48, 0, 131, 28);
		panel_9_1.add(panel_8_3_1_1);

		final JLabel OpenSponLabel = new JLabel();
		OpenSponLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpenSponLabel.setText("Open Spontaneously");
		OpenSponLabel.setBounds(10, 8, 125, 14);
		panel_8_3_1_1.add(OpenSponLabel);

		final JPanel panel_8_3_2_1 = new JPanel();
		panel_8_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1.setBackground(Color.WHITE);
		panel_8_3_2_1.setLayout(null);
		panel_8_3_2_1.setBounds(48, 32, 131, 23);
		panel_9_1.add(panel_8_3_2_1);

		final JLabel OpenToSpeechLabel = new JLabel();
		OpenToSpeechLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpenToSpeechLabel.setText("Open To Speech");
		OpenToSpeechLabel.setBounds(10, 5, 106, 14);
		panel_8_3_2_1.add(OpenToSpeechLabel);

		final JPanel panel_8_3_2_1_1 = new JPanel();
		panel_8_3_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_1.setBackground(Color.WHITE);
		panel_8_3_2_1_1.setLayout(null);
		panel_8_3_2_1_1.setBounds(48, 58, 131, 28);
		panel_9_1.add(panel_8_3_2_1_1);

		final JLabel OpensToPainLabel = new JLabel();
		OpensToPainLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpensToPainLabel.setText("Opens To Pain");
		OpensToPainLabel.setBounds(10, 5, 95, 14);
		panel_8_3_2_1_1.add(OpensToPainLabel);

		final JPanel panel_8_3_2_1_2 = new JPanel();
		panel_8_3_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_2.setBackground(Color.WHITE);
		panel_8_3_2_1_2.setLayout(null);
		panel_8_3_2_1_2.setBounds(48, 88, 131, 25);
		panel_9_1.add(panel_8_3_2_1_2);

		final JLabel DoesNotOpenLabel = new JLabel();
		DoesNotOpenLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DoesNotOpenLabel.setText("Does Not Open");
		DoesNotOpenLabel.setBounds(10, 5, 99, 14);
		panel_8_3_2_1_2.add(DoesNotOpenLabel);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBounds(0, 515, 179, 116);
		panel_4.add(panel_9_1_1);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBackground(Color.BLACK);
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(0, 0, 42, 109);
		panel_9_1_1.add(panel_7_1_1_1);

		final JLabel lblLevel = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/LEVEL.jpg"));
		lblLevel.setText("New JLabel");
		lblLevel.setBounds(0, 51, 32, 14);
		panel_7_1_1_1.setLayout(new BorderLayout());
		panel_7_1_1_1.add(lblLevel, BorderLayout.CENTER);

		final JPanel panel_8_3_1_1_1 = new JPanel();
		panel_8_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1_1.setBackground(Color.WHITE);
		panel_8_3_1_1_1.setLayout(null);
		panel_8_3_1_1_1.setBounds(48, 0, 131, 24);
		panel_9_1_1.add(panel_8_3_1_1_1);

		final JLabel AlertLabel = new JLabel();
		AlertLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		AlertLabel.setText("Alert");
		AlertLabel.setBounds(10, 5, 125, 14);
		panel_8_3_1_1_1.add(AlertLabel);

		final JPanel panel_8_3_2_1_3 = new JPanel();
		panel_8_3_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_3.setBackground(Color.WHITE);
		panel_8_3_2_1_3.setLayout(null);
		panel_8_3_2_1_3.setBounds(48, 27, 131, 24);
		panel_9_1_1.add(panel_8_3_2_1_3);

		final JLabel DrowsyLabel = new JLabel();
		DrowsyLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DrowsyLabel.setText("Drowsy");
		DrowsyLabel.setBounds(10, 8, 106, 14);
		panel_8_3_2_1_3.add(DrowsyLabel);

		final JPanel panel_8_3_2_1_1_1 = new JPanel();
		panel_8_3_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_1_1.setBackground(Color.WHITE);
		panel_8_3_2_1_1_1.setLayout(null);
		panel_8_3_2_1_1_1.setBounds(48, 56, 131, 24);
		panel_9_1_1.add(panel_8_3_2_1_1_1);

		final JLabel StuporousLabel = new JLabel();
		StuporousLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		StuporousLabel.setText("Stouprous");
		StuporousLabel.setBounds(10, 5, 70, 14);
		panel_8_3_2_1_1_1.add(StuporousLabel);

		final JPanel panel_8_3_2_1_2_1 = new JPanel();
		panel_8_3_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_2_1.setBackground(Color.WHITE);
		panel_8_3_2_1_2_1.setLayout(null);
		panel_8_3_2_1_2_1.setBounds(48, 85, 131, 24);
		panel_9_1_1.add(panel_8_3_2_1_2_1);

		final JLabel ComatoseLabel = new JLabel();
		ComatoseLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ComatoseLabel.setText("Comatose");
		ComatoseLabel.setBounds(10, 5, 105, 14);
		panel_8_3_2_1_2_1.add(ComatoseLabel);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setLayout(null);
		panel_9_2.setBounds(0, 630, 179, 145);
		panel_4.add(panel_9_2);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setBackground(Color.BLACK);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(0, 5, 42, 140);
		panel_9_2.add(panel_7_1_2);

		final JLabel lblSpeech = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/SPEECH.jpg"));
		lblSpeech.setText("");
		lblSpeech.setBounds(10, 60, 22, 14);
		panel_7_1_2.setLayout(new BorderLayout());
		panel_7_1_2.add(lblSpeech, BorderLayout.CENTER);

		final JPanel panel_8_3_1_2 = new JPanel();
		panel_8_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_2.setBackground(Color.WHITE);
		panel_8_3_1_2.setLayout(null);
		panel_8_3_1_2.setBounds(48, 5, 131, 23);
		panel_9_2.add(panel_8_3_1_2);

		final JLabel SpeechOrientedLabel = new JLabel();
		SpeechOrientedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SpeechOrientedLabel.setText("Speech Oriented");
		SpeechOrientedLabel.setBounds(10, 0, 125, 18);
		panel_8_3_1_2.add(SpeechOrientedLabel);

		final JPanel panel_8_3_2_2 = new JPanel();
		panel_8_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2.setBackground(Color.WHITE);
		panel_8_3_2_2.setLayout(null);
		panel_8_3_2_2.setBounds(48, 34, 131, 25);
		panel_9_2.add(panel_8_3_2_2);

		final JLabel ConfusedLabel = new JLabel();
		ConfusedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ConfusedLabel.setText("Confused Conversation");
		ConfusedLabel.setBounds(5, 5, 125, 14);
		panel_8_3_2_2.add(ConfusedLabel);

		final JPanel panel_8_3_2_2_1 = new JPanel();
		panel_8_3_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_1.setBackground(Color.WHITE);
		panel_8_3_2_2_1.setLayout(null);
		panel_8_3_2_2_1.setBounds(48, 61, 131, 25);
		panel_9_2.add(panel_8_3_2_2_1);

		final JLabel InappropriateLabel = new JLabel();
		InappropriateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InappropriateLabel.setText("Inappropriate Words");
		InappropriateLabel.setBounds(5, 5, 112, 14);
		panel_8_3_2_2_1.add(InappropriateLabel);

		final JPanel panel_8_3_2_2_2 = new JPanel();
		panel_8_3_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_2.setBackground(Color.WHITE);
		panel_8_3_2_2_2.setLayout(null);
		panel_8_3_2_2_2.setBounds(48, 89, 131, 24);
		panel_9_2.add(panel_8_3_2_2_2);

		final JLabel IncomprehensibleSpeechLabel = new JLabel();
		IncomprehensibleSpeechLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IncomprehensibleSpeechLabel.setText("IncomprehensibleSpeech");
		IncomprehensibleSpeechLabel.setBounds(0, 5, 145, 14);
		panel_8_3_2_2_2.add(IncomprehensibleSpeechLabel);

		final JPanel panel_8_3_2_2_2_1 = new JPanel();
		panel_8_3_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_2_1.setBackground(Color.WHITE);
		panel_8_3_2_2_2_1.setLayout(null);
		panel_8_3_2_2_2_1.setBounds(48, 115, 131, 25);
		panel_9_2.add(panel_8_3_2_2_2_1);

		final JLabel NoSpeechLabel = new JLabel();
		NoSpeechLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NoSpeechLabel.setText("No Speech");
		NoSpeechLabel.setBounds(10, 5, 94, 14);
		panel_8_3_2_2_2_1.add(NoSpeechLabel);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 773, 179, 219);
		panel_4.add(panel_6_1);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.BLACK);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(0, 8, 42, 177);
		panel_6_1.add(panel_7_2);

		final JLabel lblMotor = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/MOTOR.jpg"));
		lblMotor.setText("");
		lblMotor.setBounds(0, 39, 32, 14);
		panel_7_2.setLayout(new BorderLayout());
		panel_7_2.add(lblMotor, BorderLayout.CENTER);

		final JPanel panel_8_6 = new JPanel();
		panel_8_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6.setBackground(Color.WHITE);
		panel_8_6.setLayout(null);
		panel_8_6.setBounds(48, 8, 130, 22);
		panel_6_1.add(panel_8_6);

		final JLabel LtUpperExtremityLabel = new JLabel();
		LtUpperExtremityLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LtUpperExtremityLabel.setText("Lt.Upper Extremity");
		LtUpperExtremityLabel.setBounds(10, 5, 104, 14);
		panel_8_6.add(LtUpperExtremityLabel);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(48, 34, 130, 24);
		panel_6_1.add(panel_8_1_1);

		final JLabel LtLowerExtremityLabel = new JLabel();
		LtLowerExtremityLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LtLowerExtremityLabel.setText("Lt.Lower Extremity");
		LtLowerExtremityLabel.setBounds(10, 5, 105, 14);
		panel_8_1_1.add(LtLowerExtremityLabel);

		final JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1.setBackground(Color.WHITE);
		panel_8_2_1.setLayout(null);
		panel_8_2_1.setBounds(48, 63, 130, 24);
		panel_6_1.add(panel_8_2_1);

		final JLabel RTUpperLabel = new JLabel();
		RTUpperLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RTUpperLabel.setText("Rt.Upper Extremity");
		RTUpperLabel.setBounds(10, 5, 105, 14);
		panel_8_2_1.add(RTUpperLabel);

		final JPanel panel_8_3_3 = new JPanel();
		panel_8_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_3.setBackground(Color.WHITE);
		panel_8_3_3.setLayout(null);
		panel_8_3_3.setBounds(48, 93, 130, 24);
		panel_6_1.add(panel_8_3_3);

		final JLabel RTLowerLabel = new JLabel();
		RTLowerLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RTLowerLabel.setText("Rt.Lower Extremity");
		RTLowerLabel.setBounds(10, 5, 113, 14);
		panel_8_3_3.add(RTLowerLabel);

		final JPanel panel_8_3_3_1 = new JPanel();
		panel_8_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_3_1.setBackground(Color.WHITE);
		panel_8_3_3_1.setLayout(null);
		panel_8_3_3_1.setBounds(0, 185, 178, 34);
		panel_6_1.add(panel_8_3_3_1);

		final JLabel NurseLabel = new JLabel();
		NurseLabel.setBackground(Color.WHITE);
		NurseLabel
				.setText("<html>Nurse Initial<br>(Identify On Reverse)</html>");
		NurseLabel.setBounds(10, 0, 135, 34);
		panel_8_3_3_1.add(NurseLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(195, 45, 732, 994);
		panel_1.add(panel_15);

		final JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 0, 707, 891);
		panel_15.add(panel_14);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(85, 0, 229, 891);
		panel_14.add(panel_18);

		dcAssessmentDate = new JDateChooser();
		dcAssessmentDate.setDate(MedrexClientManager.getServerTime());
		dcAssessmentDate.setBounds(21, 10, 198, 20);
		panel_18.add(dcAssessmentDate);

		txtTime = new JTextField();
		txtTime.setBounds(21, 42, 198, 20);
		txtTime
				.setText(new SimpleDateFormat("hh:mm a")
						.format(model.getDate()));
		panel_18.add(txtTime);

		txtBloodPressure = new JTextField();
		txtBloodPressure.setBounds(21, 71, 198, 20);
		panel_18.add(txtBloodPressure);

		txtTemprature = new JTextField();
		txtTemprature.setBounds(21, 100, 198, 20);
		panel_18.add(txtTemprature);

		txtPulse = new JTextField();
		txtPulse.setBounds(21, 134, 198, 20);
		panel_18.add(txtPulse);

		txtRespiration = new JTextField();
		txtRespiration.setBounds(21, 166, 198, 20);
		panel_18.add(txtRespiration);

		txtNormal = new JTextField();
		txtNormal.setBounds(21, 195, 198, 20);
		panel_18.add(txtNormal);

		cmbRPupil = new JComboBox();
		cmbRPupil.setModel(new DefaultComboBoxModel(new String[] { "", "React",
				"Does Not React" }));
		cmbRPupil.setBackground(Color.WHITE);
		cmbRPupil.setBounds(21, 265, 198, 22);
		panel_18.add(cmbRPupil);

		cmbLPupil = new JComboBox();
		cmbLPupil.setModel(new DefaultComboBoxModel(new String[] { "", "React",
				"Does Not React" }));
		cmbLPupil.setBackground(Color.WHITE);
		cmbLPupil.setBounds(21, 300, 198, 22);
		panel_18.add(cmbLPupil);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setBackground(Color.WHITE);
		panel_19.setLayout(null);
		panel_19.setBounds(21, 405, 198, 106);
		panel_18.add(panel_19);

		rbOpenSpontaneously = new JRadioButton();
		rbOpenSpontaneously.setActionCommand("1");
		bgEyesOpen.add(rbOpenSpontaneously);
		rbOpenSpontaneously.setBackground(Color.WHITE);
		rbOpenSpontaneously.setText("");
		rbOpenSpontaneously.setBounds(10, 1, 165, 22);
		panel_19.add(rbOpenSpontaneously);

		rbOpenToSpeech = new JRadioButton();
		rbOpenToSpeech.setActionCommand("2");
		bgEyesOpen.add(rbOpenToSpeech);
		rbOpenToSpeech.setBackground(Color.WHITE);
		rbOpenToSpeech.setText("");
		rbOpenToSpeech.setBounds(10, 25, 165, 22);
		panel_19.add(rbOpenToSpeech);

		rbOpensToPain = new JRadioButton();
		rbOpensToPain.setActionCommand("3");
		bgEyesOpen.add(rbOpensToPain);
		rbOpensToPain.setBackground(Color.WHITE);
		rbOpensToPain.setText("");
		rbOpensToPain.setBounds(10, 54, 178, 22);
		panel_19.add(rbOpensToPain);

		rbDoesNotOpen = new JRadioButton();
		rbDoesNotOpen.setActionCommand("4");
		bgEyesOpen.add(rbDoesNotOpen);
		rbDoesNotOpen.setBackground(Color.WHITE);
		rbDoesNotOpen.setText("");
		rbDoesNotOpen.setBounds(10, 80, 178, 22);
		panel_19.add(rbDoesNotOpen);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(21, 521, 198, 100);
		panel_18.add(panel_20);

		rbAlert = new JRadioButton();
		rbAlert.setActionCommand("1");
		bgAlert.add(rbAlert);
		rbAlert.setBackground(Color.WHITE);
		rbAlert.setText("");
		rbAlert.setBounds(10, 2, 106, 18);
		panel_20.add(rbAlert);

		rbDrowsy = new JRadioButton();
		rbDrowsy.setActionCommand("2");
		bgAlert.add(rbDrowsy);
		rbDrowsy.setBackground(Color.WHITE);
		rbDrowsy.setText("");
		rbDrowsy.setBounds(10, 25, 106, 18);
		panel_20.add(rbDrowsy);

		rbStoprous = new JRadioButton();
		rbStoprous.setActionCommand("3");
		bgAlert.add(rbStoprous);
		rbStoprous.setBackground(Color.WHITE);
		rbStoprous.setText("");
		rbStoprous.setBounds(10, 53, 106, 18);
		panel_20.add(rbStoprous);

		rbComatose = new JRadioButton();
		rbComatose.setActionCommand("4");
		bgAlert.add(rbComatose);
		rbComatose.setBackground(Color.WHITE);
		rbComatose.setText("");
		rbComatose.setBounds(10, 80, 106, 18);
		panel_20.add(rbComatose);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setBackground(Color.WHITE);
		panel_21.setLayout(null);
		panel_21.setBounds(21, 635, 198, 129);
		panel_18.add(panel_21);

		rbSpeechoriented = new JRadioButton();
		rbSpeechoriented.setActionCommand("1");
		bgSpeech.add(rbSpeechoriented);
		rbSpeechoriented.setBackground(Color.WHITE);
		rbSpeechoriented.setText("");
		rbSpeechoriented.setBounds(10, 10, 106, 18);
		panel_21.add(rbSpeechoriented);

		rbConfusedConversation = new JRadioButton();
		rbConfusedConversation.setActionCommand("2");
		bgSpeech.add(rbConfusedConversation);
		rbConfusedConversation.setBackground(Color.WHITE);
		rbConfusedConversation.setText("");
		rbConfusedConversation.setBounds(10, 34, 106, 18);
		panel_21.add(rbConfusedConversation);

		rbInappropriateWords = new JRadioButton();
		rbInappropriateWords.setActionCommand("3");
		bgSpeech.add(rbInappropriateWords);
		rbInappropriateWords.setBackground(Color.WHITE);
		rbInappropriateWords.setText("");
		rbInappropriateWords.setBounds(10, 58, 106, 18);
		panel_21.add(rbInappropriateWords);

		rbIncomprehensibleSpeech = new JRadioButton();
		rbIncomprehensibleSpeech.setActionCommand("4");
		bgSpeech.add(rbIncomprehensibleSpeech);
		rbIncomprehensibleSpeech.setBackground(Color.WHITE);
		rbIncomprehensibleSpeech.setText("");
		rbIncomprehensibleSpeech.setBounds(10, 82, 106, 18);
		panel_21.add(rbIncomprehensibleSpeech);

		rbNoSpeech = new JRadioButton();
		rbNoSpeech.setActionCommand("5");
		bgSpeech.add(rbNoSpeech);
		rbNoSpeech.setBackground(Color.WHITE);
		rbNoSpeech.setText("");
		rbNoSpeech.setBounds(10, 106, 106, 18);
		panel_21.add(rbNoSpeech);

		cmbLTUpperExtrimity = new JComboBox();
		cmbLTUpperExtrimity
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"",
								"1. Approximately Obeys Commands and / or moves all extrimities",
								"2. Localizes signs of weakness , i.e drifting of extremity",
								"3. Withdraws to external stimulii.",
								"4. Flexes extremity abnormally.",
								"5. Extends extremity abnormally",
								"6. Flaccid - no response of extremity" }));
		cmbLTUpperExtrimity.setBackground(Color.WHITE);
		cmbLTUpperExtrimity.setBounds(21, 782, 198, 21);
		panel_18.add(cmbLTUpperExtrimity);

		cmbLTLowerExtrimity = new JComboBox();
		cmbLTLowerExtrimity
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"",
								"1. Approximately Obeys Commands and / or moves all extrimities",
								"2. Localizes signs of weakness , i.e drifting of extremity",
								"3. Withdraws to external stimulii.",
								"4. Flexes extremity abnormally.",
								"5. Extends extremity abnormally",
								"6. Flaccid - no response of extremity" }));
		cmbLTLowerExtrimity.setBackground(Color.WHITE);
		cmbLTLowerExtrimity.setBounds(21, 809, 198, 21);
		panel_18.add(cmbLTLowerExtrimity);

		cmbRTUpperExtrimity = new JComboBox();
		cmbRTUpperExtrimity
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"",
								"1. Approximately Obeys Commands and / or moves all extrimities",
								"2. Localizes signs of weakness , i.e drifting of extremity",
								"3. Withdraws to external stimulii.",
								"4. Flexes extremity abnormally.",
								"5. Extends extremity abnormally",
								"6. Flaccid - no response of extremity" }));
		cmbRTUpperExtrimity.setBackground(Color.WHITE);
		cmbRTUpperExtrimity.setBounds(21, 836, 198, 21);
		panel_18.add(cmbRTUpperExtrimity);

		cmbRTLowerExtrimity = new JComboBox();
		cmbRTLowerExtrimity
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"",
								"1. Approximately Obeys Commands and / or moves all extrimities",
								"2. Localizes signs of weakness , i.e drifting of extremity",
								"3. Withdraws to external stimulii.",
								"4. Flexes extremity abnormally.",
								"5. Extends extremity abnormally",
								"6. Flaccid - no response of extremity" }));
		cmbRTLowerExtrimity.setBackground(Color.WHITE);
		cmbRTLowerExtrimity.setBounds(21, 863, 198, 21);
		panel_18.add(cmbRTLowerExtrimity);

		cmbShallowIrregular = new JComboBox();
		cmbShallowIrregular.setModel(new DefaultComboBoxModel(new String[] {
				"", "Shallow", "Irregular" }));
		cmbShallowIrregular.setBackground(Color.WHITE);
		cmbShallowIrregular.setBounds(21, 228, 198, 22);
		panel_18.add(cmbShallowIrregular);

		/*
		 * panelCol = new PanelResidentAssessmentFormPageCol19[1]; for(int
		 * i=0;i<1;++i){ panelCol[i] = new
		 * PanelResidentAssessmentFormPageCol19(i + 1); //
		 * panelCol[i].setBounds(i 47,0 , 48, 995); panelCol[i].setBounds(i
		 * 330,0 , 200, 995); panel_15.add(panelCol[i]); }
		 */

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(58, 375, 843, 66);
		panel_1.add(panel_16);

		panel_1.setComponentZOrder(panel_16, 0);

		// img

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(58, 940, 843, 63);
		panel_1.add(panel_17);

		panel_1.setComponentZOrder(panel_17, 0);

		final JLabel chartMotorFunctionLabel = new JLabel();
		chartMotorFunctionLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		chartMotorFunctionLabel.setText("Chart motor Function");
		chartMotorFunctionLabel.setBounds(5, 0, 128, 14);
		panel_17.add(chartMotorFunctionLabel);

		final JLabel basedOnTheLabel = new JLabel();
		basedOnTheLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		basedOnTheLabel.setText("based on the best");
		basedOnTheLabel.setBounds(5, 20, 128, 14);
		panel_17.add(basedOnTheLabel);

		final JLabel ofTheWorstLabel = new JLabel();
		ofTheWorstLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		ofTheWorstLabel.setText("of the worst");
		ofTheWorstLabel.setBounds(5, 40, 128, 14);
		panel_17.add(ofTheWorstLabel);

		final JLabel label = new JLabel();
		label.setBounds(181, 2, 644, 14);
		panel_17.add(label);
		label
				.setText("1.Approximately obeys Commands                                         3. Withdraws to external stimuli");

		final JLabel andOrLabel = new JLabel();
		andOrLabel.setBounds(190, 16, 644, 14);
		panel_17.add(andOrLabel);
		andOrLabel
				.setText("and / or moves all extremities                                              4. Flexes extrimity abnormally");

		final JLabel andOrLabel_1 = new JLabel();
		andOrLabel_1.setBounds(181, 30, 644, 14);
		panel_17.add(andOrLabel_1);
		andOrLabel_1
				.setText("2. Localizes signs of weakness , i.e.,                                      5. Extends extrimity abnormally");

		final JLabel andOrLabel_1_1 = new JLabel();
		andOrLabel_1_1.setBounds(190, 45, 634, 14);
		panel_17.add(andOrLabel_1_1);
		andOrLabel_1_1
				.setText("drifting of extremity                                                             6. Flaccid - no response of extremity");

		final JLabel chartPupilSizeLabel = new JLabel();
		chartPupilSizeLabel.setText("chart PupilSize in comparison");
		chartPupilSizeLabel.setBounds(5, 4, 137, 16);
		panel_16.add(chartPupilSizeLabel);

		final JLabel toCieclesPrintedLabel = new JLabel();
		toCieclesPrintedLabel.setText("to circles printed here.chart");
		toCieclesPrintedLabel.setBounds(10, 20, 135, 14);
		panel_16.add(toCieclesPrintedLabel);

		final JLabel reactionAsreactsLabel = new JLabel();
		reactionAsreactsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		reactionAsreactsLabel.setText("Reaction as +(reacts) or");
		reactionAsreactsLabel.setBounds(15, 35, 126, 14);
		panel_16.add(reactionAsreactsLabel);

		final JLabel doesNotReactLabel = new JLabel();
		doesNotReactLabel.setText("-(Does Not React)");
		doesNotReactLabel.setBounds(25, 50, 87, 14);
		panel_16.add(doesNotReactLabel);

		imgLabel = new JLabel(new ImageIcon("img/Pupil.jpg" + ""));
		panel_16.setLayout(new BorderLayout());
		panel_16.add(imgLabel, BorderLayout.CENTER);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 1136, 930, 62);
		add(panel_3);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(10, 10, 431, 42);
		panel_3.add(panel_10);

		final JLabel nameLabel = new JLabel();
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameLabel.setText("Name");
		nameLabel.setBounds(0, 0, 54, 14);
		panel_10.add(nameLabel);

		final JLabel lastLabel = new JLabel();
		lastLabel.setBackground(Color.WHITE);
		lastLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastLabel.setText("Last");
		lastLabel.setBounds(91, 0, 84, 14);
		panel_10.add(lastLabel);

		final JLabel firstLabel = new JLabel();
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstLabel.setText("First");
		firstLabel.setBounds(216, 0, 54, 14);
		panel_10.add(firstLabel);

		final JLabel middleLabel = new JLabel();
		middleLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		middleLabel.setText("Middle");
		middleLabel.setBounds(329, 0, 54, 14);
		panel_10.add(middleLabel);

		txtLastName = new JTextField();
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setEditable(false);
		txtLastName.setBounds(52, 20, 123, 18);
		panel_10.add(txtLastName);

		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setBounds(185, 20, 115, 18);
		panel_10.add(txtFirstName);

		txtMiddleName = new JTextField();
		txtMiddleName.setEditable(false);
		txtMiddleName.setBackground(Color.WHITE);
		txtMiddleName.setBounds(306, 20, 115, 18);
		panel_10.add(txtMiddleName);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(447, 10, 170, 42);
		panel_3.add(panel_11);

		final JLabel attendingPhysicianLabel = new JLabel();
		attendingPhysicianLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		attendingPhysicianLabel.setText("Attending Physician");
		attendingPhysicianLabel.setBounds(24, 0, 129, 14);
		panel_11.add(attendingPhysicianLabel);

		txtAttendingPhysician = new JTextField();
		txtAttendingPhysician.setEditable(false);
		txtAttendingPhysician.setBackground(Color.WHITE);
		txtAttendingPhysician.setBounds(10, 20, 143, 18);
		panel_11.add(txtAttendingPhysician);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(623, 10, 140, 42);
		panel_3.add(panel_12);

		final JLabel recordNoLabel = new JLabel();
		recordNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		recordNoLabel.setText("Record No");
		recordNoLabel.setBounds(38, 0, 64, 14);
		panel_12.add(recordNoLabel);

		txtRecordNo = new JTextField();
		txtRecordNo.setEditable(false);
		txtRecordNo.setBackground(Color.WHITE);
		txtRecordNo.setBounds(10, 20, 125, 18);
		panel_12.add(txtRecordNo);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(769, 10, 148, 42);
		panel_3.add(panel_13);

		final JLabel roombedLabel = new JLabel();
		roombedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roombedLabel.setText("Room/Bed");
		roombedLabel.setBounds(49, 0, 66, 14);
		panel_13.add(roombedLabel);

		txtRoomBed = new JTextField();
		txtRoomBed.setEditable(false);
		txtRoomBed.setBackground(Color.WHITE);
		txtRoomBed.setBounds(10, 20, 128, 18);
		panel_13.add(txtRoomBed);

		// final JPanel panel_14 = new JPanel();
		// panel_14.setBorder(new LineBorder(Color.black, 1, false));
		// panel_14.setBackground(Color.WHITE);
		// panel_14.setLayout(null);
		// panel_14.setBounds(10, 1204, 930, 36);
		// add(panel_14);
		// setBackground(Color.WHITE);
		//
		// final JLabel neurologicalAssessmentLabel = new JLabel();
		// neurologicalAssessmentLabel.setFont(new Font("Tahoma", Font.BOLD,
		// 14));
		// neurologicalAssessmentLabel.setText("NEUROLOGICAL ASSESSMENT");
		// neurologicalAssessmentLabel.setBounds(699, -1, 231, 13);
		// panel_14.add(neurologicalAssessmentLabel);
		//
		// final JLabel continuedOnReverseLabel = new JLabel();
		// continuedOnReverseLabel.setText(".Continued on Reverse");
		// continuedOnReverseLabel.setBounds(806, 20, 124, 14);
		// panel_14.add(continuedOnReverseLabel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(94, 46, 79, 14);
		add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(192, 42, 230, 18);
		add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room # :");
		roomLabel.setBounds(510, 46, 54, 14);
		add(roomLabel);

		txtRoomNum = new JTextField();
		txtRoomNum.setBounds(570, 44, 77, 18);
		add(txtRoomNum);

		cbNotAvailable = new JCheckBox();
		cbNotAvailable.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbNotAvailable.setBackground(Color.WHITE);
		cbNotAvailable.setText("N/A");
		cbNotAvailable.setBounds(10, 22, 94, 18);
		add(cbNotAvailable);

		// doUpdate();
	}

	public void doLoad() {

	}

	public int doSave() {

		/*
		 * ResidentAssessmentFormPage19 refResidentAssessmentForm19 = new
		 * ResidentAssessmentFormPage19();
		 * refResidentAssessmentForm19.setSerial(
		 * Global.currentResidentAssessmentFormPage19Key);
		 * refResidentAssessmentForm19
		 * .setFormId(Global.currentResidentAssessmentFormKey);
		 * 
		 * try { Global.currentResidentAssessmentFormPage19Key =
		 * MedrexClientManager.getInstance()
		 * .insertOrUpdateResidentAssessmentFormPage19
		 * (refResidentAssessmentForm19);
		 * //System.out.println(""+Global.currentResidentAssessmentFormPage20Key
		 * ); for(int i=0;i<15;i++){ panelCol[i].doSave(); }
		 * MedrexClientManager.
		 * getInstance().insertOrUpdateResidentassessmentFormPage19Col(columns);
		 * return(0); } catch (Exception e) { e.printStackTrace(); } return 0;
		 */

		// new Coding for this page without columns
		ResidentAssessmentFormPage19 refResidentAssessmentFormPage19 = new ResidentAssessmentFormPage19();
		refResidentAssessmentFormPage19
				.setSerial(Global.currentResidentAssessmentFormPage19Key);
		refResidentAssessmentFormPage19.setFormId(Global.currentMsjnKey);
		refResidentAssessmentFormPage19
				.setResidentId(Global.currentResidenceKey);
		refResidentAssessmentFormPage19.setSpeech(SwingUtils
				.getSelectedButton(bgSpeech));
		refResidentAssessmentFormPage19.setAlert(SwingUtils
				.getSelectedButton(bgAlert));
		refResidentAssessmentFormPage19.setEyesOpen(SwingUtils
				.getSelectedButton(bgEyesOpen));
		refResidentAssessmentFormPage19
				.setRTLowerExtrimity((String) cmbRTLowerExtrimity
						.getSelectedItem());
		refResidentAssessmentFormPage19
				.setRTUpperExtrimity((String) cmbRTUpperExtrimity
						.getSelectedItem());
		refResidentAssessmentFormPage19
				.setLTLowerExtrimity((String) cmbLTLowerExtrimity
						.getSelectedItem());
		refResidentAssessmentFormPage19
				.setLTUpperExtrimity((String) cmbLTUpperExtrimity
						.getSelectedItem());
		refResidentAssessmentFormPage19.setLPupil((String) cmbLPupil
				.getSelectedItem());
		refResidentAssessmentFormPage19.setRPupil((String) cmbRPupil
				.getSelectedItem());
		refResidentAssessmentFormPage19
				.setShallowIrregular((String) cmbShallowIrregular
						.getSelectedItem());
		refResidentAssessmentFormPage19.setNormal(txtNormal.getText());
		refResidentAssessmentFormPage19
				.setRespiration(txtRespiration.getText());
		refResidentAssessmentFormPage19.setPulse(txtPulse.getText());
		refResidentAssessmentFormPage19.setTemprature(txtTemprature.getText());
		refResidentAssessmentFormPage19.setBloodPressure(txtBloodPressure
				.getText());
		refResidentAssessmentFormPage19.setTime(txtTime.getText());
		refResidentAssessmentFormPage19.setAssessmentDate(dcAssessmentDate
				.getDate());
		refResidentAssessmentFormPage19.setRoomNum(txtRoomNum.getText());
		refResidentAssessmentFormPage19.setResidentName(txtResidentName
				.getText());
		refResidentAssessmentFormPage19.setRoomBed(txtRoomBed.getText());
		refResidentAssessmentFormPage19.setRecordNo(txtRecordNo.getText());
		refResidentAssessmentFormPage19
				.setAttendingPhysician(txtAttendingPhysician.getText());
		refResidentAssessmentFormPage19.setMiddleName(txtMiddleName.getText());
		refResidentAssessmentFormPage19.setFirstName(txtFirstName.getText());
		refResidentAssessmentFormPage19.setLastName(txtLastName.getText());
		refResidentAssessmentFormPage19.setNAvailable(cbNotAvailable
				.isSelected());

		try {
			Global.currentResidentAssessmentFormPage19Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage19(
							refResidentAssessmentFormPage19);
			return Global.currentResidentAssessmentFormPage19Key;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		try {
			ResidentMain rm = MedrexClientManager.getInstance().getResident(
					resId);
			TempRoomHistory roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
			txtResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			/* TODO: Migrating to room history ----- Done */
			// txtRoom.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoomNum.setText(roomHist.getRoom());
			}
			txtLastName.setText(rm.getUserPass());
			txtMiddleName.setText("");
			txtFirstName.setText(rm.getUserName());
			/* TODO: Migrating to room history */
			// txtRoomBed.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoomBed.setText(roomHist.getRoom());
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		CensusStatus refCensusStatus = null;
		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(Global.currentResidenceKey);
		} catch (Exception e) {
		}
		PhysicianForm pf = null;
		HashMap hm = getDoctorsMap();

		try {
			MedrexClientManager.getInstance().getAdmissionFromSubHead(
					refCensusStatus.getFromSubId());
			List<PhysicianForm> list = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);
			Iterator it = list.iterator();
			while (it.hasNext()) {
				pf = (PhysicianForm) it.next();
				// pavan changed
				String DocType = ((Doctors) hm.get(pf.getPhysician()))
						.getDoctorType().toString();
				if (DocType.equalsIgnoreCase("Physicians")) {
					txtAttendingPhysician.setText(((Doctors) hm.get(pf
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
		/*
		 * if (Global.currentResidentAssessmentFormKey == 0) { columns = new
		 * ArrayList<ResidentAssessmentFormPage19Col>(); } else {
		 * ResidentAssessmentFormPage19 VOResidentAssessmentFormPage19 = null;
		 * try { VOResidentAssessmentFormPage19 =
		 * MedrexClientManager.getInstance()
		 * .getResidentAssessmentFormPage19(Global
		 * .currentResidentAssessmentFormKey);
		 * Global.currentResidentAssessmentFormPage19Key =
		 * VOResidentAssessmentFormPage19.getSerial(); columns =
		 * MedrexClientManager.getInstance()
		 * .getResidentAssessmentFormPage19Columns
		 * (Global.currentResidentAssessmentFormPage19Key);
		 * //System.out.println(VOResidentAssessmentFormPage19); } catch
		 * (Exception e) { e.printStackTrace(); } }
		 * 
		 * for (int i = 0, j = 0; i < 15; i++) { ResidentAssessmentFormPage19Col
		 * col = null; if (columns.size() > 0 && j < columns.size()) { col =
		 * (ResidentAssessmentFormPage19Col) columns.get(j); } if (col != null)
		 * { if (i + 1 == col.getColSerial()) { panelCol[i].updateData(col);
		 * j++; } } else { panelCol[i].updateData(null); } }
		 */
		if (Global.currentMsjnKey == 0) {

		} else {
			ResidentAssessmentFormPage19 refResidentAssessmentFormPage19 = null;
			try {
				refResidentAssessmentFormPage19 = MedrexClientManager
						.getInstance().getResidentAssessmentFormPage19(
								Global.currentMsjnKey);
				Global.currentResidentAssessmentFormPage19Key = refResidentAssessmentFormPage19
						.getSerial();
				SwingUtils.setSelectedButton(bgSpeech,
						refResidentAssessmentFormPage19.getSpeech());
				SwingUtils.setSelectedButton(bgAlert,
						refResidentAssessmentFormPage19.getAlert());
				SwingUtils.setSelectedButton(bgEyesOpen,
						refResidentAssessmentFormPage19.getEyesOpen());
				cmbRTLowerExtrimity
						.setSelectedItem(refResidentAssessmentFormPage19
								.getRTLowerExtrimity());
				cmbRTUpperExtrimity
						.setSelectedItem(refResidentAssessmentFormPage19
								.getRTUpperExtrimity());
				cmbLTLowerExtrimity
						.setSelectedItem(refResidentAssessmentFormPage19
								.getLTLowerExtrimity());
				cmbLTUpperExtrimity
						.setSelectedItem(refResidentAssessmentFormPage19
								.getLTUpperExtrimity());
				cmbLPupil.setSelectedItem(refResidentAssessmentFormPage19
						.getLPupil());
				cmbRPupil.setSelectedItem(refResidentAssessmentFormPage19
						.getRPupil());
				cmbShallowIrregular
						.setSelectedItem(refResidentAssessmentFormPage19
								.getShallowIrregular());
				txtNormal.setText(refResidentAssessmentFormPage19.getNormal());
				txtRespiration.setText(refResidentAssessmentFormPage19
						.getRespiration());
				txtPulse.setText(refResidentAssessmentFormPage19.getPulse());
				txtTemprature.setText(refResidentAssessmentFormPage19
						.getTemprature());
				txtBloodPressure.setText(refResidentAssessmentFormPage19
						.getBloodPressure());
				txtTime.setText(refResidentAssessmentFormPage19.getTime());
				dcAssessmentDate.setDate(refResidentAssessmentFormPage19
						.getAssessmentDate());
				txtRoomNum
						.setText(refResidentAssessmentFormPage19.getRoomNum());
				txtResidentName.setText(refResidentAssessmentFormPage19
						.getResidentName());
				txtRoomBed
						.setText(refResidentAssessmentFormPage19.getRoomBed());
				txtRecordNo.setText(refResidentAssessmentFormPage19
						.getRecordNo());
				txtAttendingPhysician.setText(refResidentAssessmentFormPage19
						.getAttendingPhysician());
				txtMiddleName.setText(refResidentAssessmentFormPage19
						.getMiddleName());
				txtFirstName.setText(refResidentAssessmentFormPage19
						.getFirstName());
				txtLastName.setText(refResidentAssessmentFormPage19
						.getLastName());
				cbNotAvailable.setSelected(refResidentAssessmentFormPage19
						.isNAvailable());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

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

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtResidentName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 19");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String args[]) {
		SwingUtils.wrapInDialog(new PanelResidentAssessmentFormPage19())
				.setVisible(true);
	}
}
