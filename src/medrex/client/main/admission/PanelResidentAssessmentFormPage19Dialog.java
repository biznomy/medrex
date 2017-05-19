package medrex.client.main.admission;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage19Dialog extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -594122827704433487L;
	private JLabel lblMotor;
	private JLabel lblspeech;
	private JLabel lblLevel;
	private JLabel lblEye;
	private JLabel lblVital;
	private JTextField txtNurseInitial;
	private JTextField txtTemprature;
	private JTextField txtBloodPressure;
	private JTextField txtPulse;
	private JTextField txtRtLowerExtremity;
	private JTextField txtRtUpperExtremity;
	private JTextField txtLtLowerExtremity;
	private JTextField txtLtUpperExtremity;
	private JTextField txtNoSpeech;
	private JTextField txtIncomprehensibleSpeech;
	private JTextField txtInappropriateWords;
	private JTextField txtConfusedConversation;
	private JTextField txtSpeechOriented;
	private JTextField txtComatose;
	private JTextField txtStuporous;
	private JTextField txtDrowsy;
	private JTextField txtAlert;
	private JTextField txtDoesNotOpen;
	private JTextField txtOpensToPain;
	private JTextField txtOpensToSpeech;
	private JTextField txtOpenSpontaneously;
	private JTextField txtLPupilReact;
	private JTextField txtLPupilSize;
	private JTextField txtRPupilReact;
	private JTextField txtRPupilSize;
	private JTextField txtIrregular;
	private JTextField txtShallow;
	private JTextField txtNormal;
	private JTextField txtRespiration;
	private JTextField txtTime;
	private JDateChooser dcAssessmentDate;

	public PanelResidentAssessmentFormPage19Dialog() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(602, 938);
		setPreferredSize(getSize());

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 602, 991);
		add(panel_2);

		final JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 24, 228, 877);
		panel_2.add(panel_4);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 10, 213, 57);
		panel_4.add(panel_5);

		final JPanel panel_8_3_1_3 = new JPanel();
		panel_8_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_3.setBackground(Color.WHITE);
		panel_8_3_1_3.setLayout(null);
		panel_8_3_1_3.setBounds(0, 0, 213, 28);
		panel_5.add(panel_8_3_1_3);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dateLabel.setText("DATE");
		dateLabel.setBounds(10, 10, 155, 14);
		panel_8_3_1_3.add(dateLabel);

		final JPanel panel_8_3_1_3_1 = new JPanel();
		panel_8_3_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_3_1.setBackground(Color.WHITE);
		panel_8_3_1_3_1.setLayout(null);
		panel_8_3_1_3_1.setBounds(0, 32, 213, 25);
		panel_5.add(panel_8_3_1_3_1);

		final JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		timeLabel.setText("TIME");
		timeLabel.setBounds(10, 10, 155, 14);
		panel_8_3_1_3_1.add(timeLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 70, 213, 183);
		panel_4.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 42, 183);
		panel_6.add(panel_7);

		lblVital = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/VITAL.jpg"));
		lblVital.setText("");
		panel_7.setLayout(new BorderLayout());
		panel_7.add(lblVital);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(48, 0, 165, 26);
		panel_6.add(panel_8);

		final JLabel bloodPressureLabel = new JLabel();
		bloodPressureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bloodPressureLabel.setText("Blood Pressure");
		bloodPressureLabel.setBounds(10, 6, 134, 14);
		panel_8.add(bloodPressureLabel);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(48, 32, 165, 28);
		panel_6.add(panel_8_1);

		final JLabel tempratureLabel = new JLabel();
		tempratureLabel.setText("Temprature");
		tempratureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tempratureLabel.setBounds(10, 6, 134, 14);
		panel_8_1.add(tempratureLabel);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(48, 64, 165, 26);
		panel_6.add(panel_8_2);

		final JLabel pulseLabel = new JLabel();
		pulseLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pulseLabel.setText("Pulse");
		pulseLabel.setBounds(10, 6, 54, 14);
		panel_8_2.add(pulseLabel);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setBackground(Color.WHITE);
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(48, 94, 165, 26);
		panel_6.add(panel_8_3);

		final JLabel respirationLabel = new JLabel();
		respirationLabel.setText("Respirations");
		respirationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		respirationLabel.setBounds(10, 6, 81, 14);
		panel_8_3.add(respirationLabel);

		final JPanel panel_8_4 = new JPanel();
		panel_8_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4.setBackground(Color.WHITE);
		panel_8_4.setLayout(null);
		panel_8_4.setBounds(48, 123, 165, 26);
		panel_6.add(panel_8_4);

		final JLabel normalLabel = new JLabel();
		normalLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		normalLabel.setText("Normal");
		normalLabel.setBounds(49, 6, 79, 14);
		panel_8_4.add(normalLabel);

		final JPanel panel_8_5 = new JPanel();
		panel_8_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_5.setBackground(Color.WHITE);
		panel_8_5.setLayout(null);
		panel_8_5.setBounds(48, 152, 165, 26);
		panel_6.add(panel_8_5);

		final JLabel shallowirregularLabel = new JLabel();
		shallowirregularLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		shallowirregularLabel.setText("Shallow/Irregular");
		shallowirregularLabel.setBounds(45, 6, 110, 14);
		panel_8_5.add(shallowirregularLabel);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBounds(0, 440, 213, 116);
		panel_4.add(panel_9_1_1);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBackground(Color.BLACK);
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(0, 0, 42, 116);
		panel_9_1_1.add(panel_7_1_1_1);

		final JPanel panel_8_3_1_1_1 = new JPanel();
		panel_8_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1_1.setBackground(Color.WHITE);
		panel_8_3_1_1_1.setLayout(null);
		panel_8_3_1_1_1.setBounds(48, 0, 165, 24);
		panel_9_1_1.add(panel_8_3_1_1_1);

		final JLabel AlertLabel = new JLabel();
		AlertLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		AlertLabel.setText("Alert");
		AlertLabel.setBounds(10, 5, 155, 14);
		panel_8_3_1_1_1.add(AlertLabel);

		final JPanel panel_8_3_2_1_3 = new JPanel();
		panel_8_3_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_3.setBackground(Color.WHITE);
		panel_8_3_2_1_3.setLayout(null);
		panel_8_3_2_1_3.setBounds(48, 27, 165, 26);
		panel_9_1_1.add(panel_8_3_2_1_3);

		final JLabel DrowsyLabel = new JLabel();
		DrowsyLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DrowsyLabel.setText("Drowsy");
		DrowsyLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2_1_3.add(DrowsyLabel);

		final JPanel panel_8_3_2_1_1_1 = new JPanel();
		panel_8_3_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_1_1.setBackground(Color.WHITE);
		panel_8_3_2_1_1_1.setLayout(null);
		panel_8_3_2_1_1_1.setBounds(48, 56, 165, 28);
		panel_9_1_1.add(panel_8_3_2_1_1_1);

		final JLabel StuporousLabel = new JLabel();
		StuporousLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		StuporousLabel.setText("Stuporous");
		StuporousLabel.setBounds(10, 10, 145, 14);
		panel_8_3_2_1_1_1.add(StuporousLabel);

		final JPanel panel_8_3_2_1_2_1 = new JPanel();
		panel_8_3_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1_2_1.setBackground(Color.WHITE);
		panel_8_3_2_1_2_1.setLayout(null);
		panel_8_3_2_1_2_1.setBounds(48, 88, 165, 28);
		panel_9_1_1.add(panel_8_3_2_1_2_1);

		final JLabel ComatoseLabel = new JLabel();
		ComatoseLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ComatoseLabel.setText("Comatose");
		ComatoseLabel.setBounds(10, 10, 145, 14);
		panel_8_3_2_1_2_1.add(ComatoseLabel);

		lblLevel = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/LEVEL.jpg"));
		lblLevel.setText("");
		// lblLevel.setBounds(0, 44, 42, 16);
		panel_7_1_1_1.setLayout(new BorderLayout());
		panel_7_1_1_1.add(lblLevel);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setLayout(null);
		panel_9_2.setBounds(0, 562, 213, 145);
		panel_4.add(panel_9_2);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setBackground(Color.BLACK);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(0, 0, 42, 145);
		panel_9_2.add(panel_7_1_2);

		lblspeech = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/SPEECH.jpg"));
		lblspeech.setText("");
		// lblspeech.setBounds(0, 55, 42, 16);
		panel_7_1_2.setLayout(new BorderLayout());
		panel_7_1_2.add(lblspeech);

		final JPanel panel_8_3_1_2 = new JPanel();
		panel_8_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_2.setBackground(Color.WHITE);
		panel_8_3_1_2.setLayout(null);
		panel_8_3_1_2.setBounds(48, 0, 165, 26);
		panel_9_2.add(panel_8_3_1_2);

		final JLabel SpeechOrientedLabel = new JLabel();
		SpeechOrientedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SpeechOrientedLabel.setText("Speech Oriented");
		SpeechOrientedLabel.setBounds(10, 6, 155, 14);
		panel_8_3_1_2.add(SpeechOrientedLabel);

		final JPanel panel_8_3_2_2 = new JPanel();
		panel_8_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2.setBackground(Color.WHITE);
		panel_8_3_2_2.setLayout(null);
		panel_8_3_2_2.setBounds(48, 30, 165, 26);
		panel_9_2.add(panel_8_3_2_2);

		final JLabel ConfusedLabel = new JLabel();
		ConfusedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ConfusedLabel.setText("Confused Conversation");
		ConfusedLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2_2.add(ConfusedLabel);

		final JPanel panel_8_3_2_2_1 = new JPanel();
		panel_8_3_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_1.setBackground(Color.WHITE);
		panel_8_3_2_2_1.setLayout(null);
		panel_8_3_2_2_1.setBounds(48, 60, 165, 26);
		panel_9_2.add(panel_8_3_2_2_1);

		final JLabel InappropriateLabel = new JLabel();
		InappropriateLabel.setText("Inappropriate Words");
		InappropriateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InappropriateLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2_2_1.add(InappropriateLabel);

		final JPanel panel_8_3_2_2_2 = new JPanel();
		panel_8_3_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_2.setBackground(Color.WHITE);
		panel_8_3_2_2_2.setLayout(null);
		panel_8_3_2_2_2.setBounds(48, 90, 165, 28);
		panel_9_2.add(panel_8_3_2_2_2);

		final JLabel IncomprehensibleLabel = new JLabel();
		IncomprehensibleLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IncomprehensibleLabel.setText("Incomprehensible Speech");
		IncomprehensibleLabel.setBounds(10, 6, 155, 14);
		panel_8_3_2_2_2.add(IncomprehensibleLabel);

		final JPanel panel_8_3_2_2_2_1 = new JPanel();
		panel_8_3_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_2_2_1.setBackground(Color.WHITE);
		panel_8_3_2_2_2_1.setLayout(null);
		panel_8_3_2_2_2_1.setBounds(48, 120, 165, 24);
		panel_9_2.add(panel_8_3_2_2_2_1);

		final JLabel NoSpeechLabel = new JLabel();
		NoSpeechLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NoSpeechLabel.setText("No Speech");
		NoSpeechLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2_2_2_1.add(NoSpeechLabel);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 710, 213, 130);
		panel_4.add(panel_6_1);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.BLACK);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(0, 0, 42, 130);
		panel_6_1.add(panel_7_2);

		lblMotor = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/MOTOR.jpg"));
		lblMotor.setText("");
		// lblMotor.setBounds(0, 42, 42, 16);
		panel_7_2.setLayout(new BorderLayout());
		panel_7_2.add(lblMotor);

		final JPanel panel_8_6 = new JPanel();
		panel_8_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6.setBackground(Color.WHITE);
		panel_8_6.setLayout(null);
		panel_8_6.setBounds(48, 0, 165, 26);
		panel_6_1.add(panel_8_6);

		final JLabel LtUpperLabel = new JLabel();
		LtUpperLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LtUpperLabel.setText("Lt.Upper Extremity");
		LtUpperLabel.setBounds(10, 6, 134, 14);
		panel_8_6.add(LtUpperLabel);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(48, 29, 165, 28);
		panel_6_1.add(panel_8_1_1);

		final JLabel LtLowerLabel = new JLabel();
		LtLowerLabel.setText("Lt.Lower Extremity");
		LtLowerLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LtLowerLabel.setBounds(10, 10, 134, 14);
		panel_8_1_1.add(LtLowerLabel);

		final JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1.setBackground(Color.WHITE);
		panel_8_2_1.setLayout(null);
		panel_8_2_1.setBounds(48, 60, 165, 28);
		panel_6_1.add(panel_8_2_1);

		final JLabel RtUpperLabel = new JLabel();
		RtUpperLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RtUpperLabel.setText("Rt.Upper Extremity");
		RtUpperLabel.setBounds(10, 10, 119, 14);
		panel_8_2_1.add(RtUpperLabel);

		final JPanel panel_8_3_3 = new JPanel();
		panel_8_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_3.setBackground(Color.WHITE);
		panel_8_3_3.setLayout(null);
		panel_8_3_3.setBounds(48, 92, 165, 26);
		panel_6_1.add(panel_8_3_3);

		final JLabel RtLowerLabel = new JLabel();
		RtLowerLabel.setText("Rt.Lower Extremity");
		RtLowerLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RtLowerLabel.setBounds(10, 10, 113, 14);
		panel_8_3_3.add(RtLowerLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBounds(0, 320, 213, 116);
		panel_4.add(panel_9_1);
		panel_9_1.setLayout(null);

		final JPanel panel_8_3_1_1 = new JPanel();
		panel_8_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1.setBackground(Color.WHITE);
		panel_8_3_1_1.setLayout(null);
		panel_8_3_1_1.setBounds(48, 0, 165, 26);
		panel_9_1.add(panel_8_3_1_1);

		final JLabel OpenSponLabel = new JLabel();
		OpenSponLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpenSponLabel.setText("Opens Spntaneously");
		OpenSponLabel.setBounds(10, 6, 155, 14);
		panel_8_3_1_1.add(OpenSponLabel);

		final JPanel panel_8_3_2_1 = new JPanel();
		panel_8_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2_1.setBackground(Color.WHITE);
		panel_8_3_2_1.setLayout(null);
		panel_8_3_2_1.setBounds(48, 30, 165, 24);
		panel_9_1.add(panel_8_3_2_1);

		final JLabel OpentoSpeechLabel = new JLabel();
		OpentoSpeechLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpentoSpeechLabel.setText("Opens to Speech");
		OpentoSpeechLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2_1.add(OpentoSpeechLabel);

		final JPanel panel_8_3_1_1_2 = new JPanel();
		panel_8_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1_2.setBackground(Color.WHITE);
		panel_8_3_1_1_2.setLayout(null);
		panel_8_3_1_1_2.setBounds(48, 57, 165, 25);
		panel_9_1.add(panel_8_3_1_1_2);

		final JLabel OpenstoPainLabel = new JLabel();
		OpenstoPainLabel.setText("Opens to Pain");
		OpenstoPainLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpenstoPainLabel.setBounds(10, 6, 155, 14);
		panel_8_3_1_1_2.add(OpenstoPainLabel);

		final JPanel panel_8_3_1_1_3 = new JPanel();
		panel_8_3_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1_1_3.setBackground(Color.WHITE);
		panel_8_3_1_1_3.setLayout(null);
		panel_8_3_1_1_3.setBounds(48, 85, 165, 26);
		panel_9_1.add(panel_8_3_1_1_3);

		final JLabel doesNotOpenLabel = new JLabel();
		doesNotOpenLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		doesNotOpenLabel.setText("Does Not Open");
		doesNotOpenLabel.setBounds(10, 6, 155, 14);
		panel_8_3_1_1_3.add(doesNotOpenLabel);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setBackground(Color.BLACK);
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(0, -3, 42, 116);
		panel_9_1.add(panel_7_1_1_1_1);

		lblEye = new JLabel(new ImageIcon("img/NeurologicalAssessment/EYE.jpg"));
		// lblEye.setBounds(0, 33, 42, 16);
		panel_7_1_1_1_1.setLayout(new BorderLayout());
		panel_7_1_1_1_1.add(lblEye);
		lblEye.setText("");

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 259, 213, 57);
		panel_4.add(panel_9);
		panel_9.setLayout(null);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.BLACK);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 0, 42, 55);
		panel_9.add(panel_7_1);

		final JLabel lblpupil = new JLabel(new ImageIcon(
				"img/NeurologicalAssessment/PUPIL2.jpg"));
		lblpupil.setText("");
		// lblpupil.setBounds(0, 10, 42, 16);
		panel_7_1.setLayout(new BorderLayout());
		panel_7_1.add(lblpupil);

		final JPanel panel_8_3_1 = new JPanel();
		panel_8_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1.setBackground(Color.WHITE);
		panel_8_3_1.setLayout(null);
		panel_8_3_1.setBounds(48, 0, 165, 26);
		panel_9.add(panel_8_3_1);

		final JLabel RPupilLabel = new JLabel();
		RPupilLabel.setText("R.Pupil      Size/React");
		RPupilLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RPupilLabel.setBounds(10, 6, 155, 14);
		panel_8_3_1.add(RPupilLabel);

		final JPanel panel_8_3_2 = new JPanel();
		panel_8_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_2.setBackground(Color.WHITE);
		panel_8_3_2.setLayout(null);
		panel_8_3_2.setBounds(48, 30, 165, 25);
		panel_9.add(panel_8_3_2);

		final JLabel LPupilLabel = new JLabel();
		LPupilLabel.setText("L.Pupil      Size/React");
		LPupilLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LPupilLabel.setBounds(10, 6, 145, 14);
		panel_8_3_2.add(LPupilLabel);

		final JPanel panel_8_3_3_1 = new JPanel();
		panel_8_3_3_1.setBackground(Color.WHITE);
		panel_8_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_3_1.setLayout(null);
		panel_8_3_3_1.setBounds(0, 841, 213, 26);
		panel_4.add(panel_8_3_3_1);

		final JLabel NurseinitialLabel = new JLabel();
		NurseinitialLabel.setText("Nurse Initial");
		NurseinitialLabel.setBounds(56, 6, 150, 14);
		NurseinitialLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8_3_3_1.add(NurseinitialLabel);

		final JPanel panel = new JPanel();
		panel.setBounds(244, 24, 332, 877);
		panel_2.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 307, 26);
		panel.add(panel_1);

		dcAssessmentDate = new JDateChooser();
		dcAssessmentDate.setDateFormatString("MM/dd/yyyy");
		dcAssessmentDate.setBounds(0, 0, 297, 24);
		panel_1.add(dcAssessmentDate);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 42, 307, 26);
		panel.add(panel_1_1);

		txtTime = new JTextField();
		txtTime.setBounds(0, 0, 297, 22);
		panel_1_1.add(txtTime);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 70, 307, 26);
		panel.add(panel_1_2);

		txtBloodPressure = new JTextField();
		txtBloodPressure.setBounds(0, 0, 297, 22);
		panel_1_2.add(txtBloodPressure);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(10, 104, 307, 26);
		panel.add(panel_1_3);

		txtTemprature = new JTextField();
		txtTemprature.setBounds(0, 0, 297, 22);
		panel_1_3.add(txtTemprature);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 134, 307, 26);
		panel.add(panel_1_4);

		txtPulse = new JTextField();
		txtPulse.setBounds(0, 0, 297, 22);
		panel_1_4.add(txtPulse);

		final JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(Color.WHITE);
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBounds(10, 164, 307, 26);
		panel.add(panel_1_4_1);

		txtRespiration = new JTextField();
		txtRespiration.setBounds(0, 0, 297, 22);
		panel_1_4_1.add(txtRespiration);

		final JPanel panel_1_4_2 = new JPanel();
		panel_1_4_2.setBackground(Color.WHITE);
		panel_1_4_2.setLayout(null);
		panel_1_4_2.setBounds(10, 194, 307, 26);
		panel.add(panel_1_4_2);

		txtNormal = new JTextField();
		txtNormal.setBounds(0, 0, 297, 22);
		panel_1_4_2.add(txtNormal);

		final JPanel panel_1_4_2_1 = new JPanel();
		panel_1_4_2_1.setBackground(Color.WHITE);
		panel_1_4_2_1.setLayout(null);
		panel_1_4_2_1.setBounds(10, 224, 307, 26);
		panel.add(panel_1_4_2_1);

		txtShallow = new JTextField();
		txtShallow.setBounds(0, 0, 148, 22);
		panel_1_4_2_1.add(txtShallow);

		txtIrregular = new JTextField();
		txtIrregular.setBounds(149, 0, 148, 22);
		panel_1_4_2_1.add(txtIrregular);

		final JPanel panel_1_4_2_2 = new JPanel();
		panel_1_4_2_2.setBackground(Color.WHITE);
		panel_1_4_2_2.setLayout(null);
		panel_1_4_2_2.setBounds(10, 261, 307, 26);
		panel.add(panel_1_4_2_2);

		txtRPupilSize = new JTextField();
		txtRPupilSize.setBounds(0, 0, 148, 22);
		panel_1_4_2_2.add(txtRPupilSize);

		txtRPupilReact = new JTextField();
		txtRPupilReact.setBounds(149, 0, 148, 22);
		panel_1_4_2_2.add(txtRPupilReact);

		final JPanel panel_1_4_2_3 = new JPanel();
		panel_1_4_2_3.setBackground(Color.WHITE);
		panel_1_4_2_3.setLayout(null);
		panel_1_4_2_3.setBounds(10, 292, 307, 22);
		panel.add(panel_1_4_2_3);

		txtLPupilSize = new JTextField();
		txtLPupilSize.setBounds(0, 0, 148, 22);
		panel_1_4_2_3.add(txtLPupilSize);

		txtLPupilReact = new JTextField();
		txtLPupilReact.setBounds(149, 0, 148, 22);
		panel_1_4_2_3.add(txtLPupilReact);

		final JPanel panel_1_4_2_4 = new JPanel();
		panel_1_4_2_4.setBackground(Color.WHITE);
		panel_1_4_2_4.setLayout(null);
		panel_1_4_2_4.setBounds(10, 322, 307, 22);
		panel.add(panel_1_4_2_4);

		txtOpenSpontaneously = new JTextField();
		txtOpenSpontaneously.setBounds(0, 0, 297, 22);
		panel_1_4_2_4.add(txtOpenSpontaneously);

		final JPanel panel_1_4_2_5 = new JPanel();
		panel_1_4_2_5.setBackground(Color.WHITE);
		panel_1_4_2_5.setLayout(null);
		panel_1_4_2_5.setBounds(10, 350, 307, 22);
		panel.add(panel_1_4_2_5);

		txtOpensToSpeech = new JTextField();
		txtOpensToSpeech.setBounds(0, 0, 297, 22);
		panel_1_4_2_5.add(txtOpensToSpeech);

		final JPanel panel_1_4_2_6 = new JPanel();
		panel_1_4_2_6.setBackground(Color.WHITE);
		panel_1_4_2_6.setLayout(null);
		panel_1_4_2_6.setBounds(10, 378, 307, 22);
		panel.add(panel_1_4_2_6);

		txtOpensToPain = new JTextField();
		txtOpensToPain.setBounds(0, 0, 297, 22);
		panel_1_4_2_6.add(txtOpensToPain);

		final JPanel panel_1_4_2_7 = new JPanel();
		panel_1_4_2_7.setBackground(Color.WHITE);
		panel_1_4_2_7.setLayout(null);
		panel_1_4_2_7.setBounds(10, 406, 307, 22);
		panel.add(panel_1_4_2_7);

		txtDoesNotOpen = new JTextField();
		txtDoesNotOpen.setBounds(0, 0, 297, 22);
		panel_1_4_2_7.add(txtDoesNotOpen);

		final JPanel panel_1_4_2_8 = new JPanel();
		panel_1_4_2_8.setBackground(Color.WHITE);
		panel_1_4_2_8.setLayout(null);
		panel_1_4_2_8.setBounds(10, 439, 307, 22);
		panel.add(panel_1_4_2_8);

		txtAlert = new JTextField();
		txtAlert.setBounds(0, 0, 297, 22);
		panel_1_4_2_8.add(txtAlert);

		final JPanel panel_1_4_2_9 = new JPanel();
		panel_1_4_2_9.setBackground(Color.WHITE);
		panel_1_4_2_9.setLayout(null);
		panel_1_4_2_9.setBounds(10, 467, 307, 22);
		panel.add(panel_1_4_2_9);

		txtDrowsy = new JTextField();
		txtDrowsy.setBounds(0, 0, 297, 22);
		panel_1_4_2_9.add(txtDrowsy);

		final JPanel panel_1_4_2_10 = new JPanel();
		panel_1_4_2_10.setBackground(Color.WHITE);
		panel_1_4_2_10.setLayout(null);
		panel_1_4_2_10.setBounds(10, 498, 307, 22);
		panel.add(panel_1_4_2_10);

		txtStuporous = new JTextField();
		txtStuporous.setBounds(0, 0, 297, 22);
		panel_1_4_2_10.add(txtStuporous);

		final JPanel panel_1_4_2_11 = new JPanel();
		panel_1_4_2_11.setBackground(Color.WHITE);
		panel_1_4_2_11.setLayout(null);
		panel_1_4_2_11.setBounds(10, 531, 307, 22);
		panel.add(panel_1_4_2_11);

		txtComatose = new JTextField();
		txtComatose.setBounds(0, 0, 297, 22);
		panel_1_4_2_11.add(txtComatose);

		final JPanel panel_1_4_2_12 = new JPanel();
		panel_1_4_2_12.setBackground(Color.WHITE);
		panel_1_4_2_12.setLayout(null);
		panel_1_4_2_12.setBounds(10, 564, 307, 22);
		panel.add(panel_1_4_2_12);

		txtSpeechOriented = new JTextField();
		txtSpeechOriented.setBounds(0, 0, 297, 22);
		panel_1_4_2_12.add(txtSpeechOriented);

		final JPanel panel_1_4_2_13 = new JPanel();
		panel_1_4_2_13.setBackground(Color.WHITE);
		panel_1_4_2_13.setLayout(null);
		panel_1_4_2_13.setBounds(10, 594, 307, 22);
		panel.add(panel_1_4_2_13);

		txtConfusedConversation = new JTextField();
		txtConfusedConversation.setBounds(0, 0, 297, 22);
		panel_1_4_2_13.add(txtConfusedConversation);

		final JPanel panel_1_4_2_14 = new JPanel();
		panel_1_4_2_14.setBackground(Color.WHITE);
		panel_1_4_2_14.setLayout(null);
		panel_1_4_2_14.setBounds(10, 622, 307, 22);
		panel.add(panel_1_4_2_14);

		txtInappropriateWords = new JTextField();
		txtInappropriateWords.setBounds(0, 0, 297, 22);
		panel_1_4_2_14.add(txtInappropriateWords);

		final JPanel panel_1_4_2_15 = new JPanel();
		panel_1_4_2_15.setBackground(Color.WHITE);
		panel_1_4_2_15.setLayout(null);
		panel_1_4_2_15.setBounds(10, 652, 307, 22);
		panel.add(panel_1_4_2_15);

		txtIncomprehensibleSpeech = new JTextField();
		txtIncomprehensibleSpeech.setBounds(0, 0, 297, 22);
		panel_1_4_2_15.add(txtIncomprehensibleSpeech);

		final JPanel panel_1_4_2_16 = new JPanel();
		panel_1_4_2_16.setBackground(Color.WHITE);
		panel_1_4_2_16.setLayout(null);
		panel_1_4_2_16.setBounds(10, 682, 307, 22);
		panel.add(panel_1_4_2_16);

		txtNoSpeech = new JTextField();
		txtNoSpeech.setBounds(0, 0, 297, 22);
		panel_1_4_2_16.add(txtNoSpeech);

		final JPanel panel_1_4_2_17 = new JPanel();
		panel_1_4_2_17.setBackground(Color.WHITE);
		panel_1_4_2_17.setLayout(null);
		panel_1_4_2_17.setBounds(10, 714, 307, 22);
		panel.add(panel_1_4_2_17);

		txtLtUpperExtremity = new JTextField();
		txtLtUpperExtremity.setBounds(0, 0, 297, 22);
		panel_1_4_2_17.add(txtLtUpperExtremity);

		final JPanel panel_1_4_2_18 = new JPanel();
		panel_1_4_2_18.setBackground(Color.WHITE);
		panel_1_4_2_18.setLayout(null);
		panel_1_4_2_18.setBounds(10, 744, 307, 22);
		panel.add(panel_1_4_2_18);

		txtLtLowerExtremity = new JTextField();
		txtLtLowerExtremity.setBounds(0, 0, 297, 22);
		panel_1_4_2_18.add(txtLtLowerExtremity);

		final JPanel panel_1_4_2_19 = new JPanel();
		panel_1_4_2_19.setBackground(Color.WHITE);
		panel_1_4_2_19.setLayout(null);
		panel_1_4_2_19.setBounds(10, 776, 307, 22);
		panel.add(panel_1_4_2_19);

		txtRtUpperExtremity = new JTextField();
		txtRtUpperExtremity.setBounds(0, 0, 297, 22);
		panel_1_4_2_19.add(txtRtUpperExtremity);

		final JPanel panel_1_4_2_20 = new JPanel();
		panel_1_4_2_20.setBackground(Color.WHITE);
		panel_1_4_2_20.setLayout(null);
		panel_1_4_2_20.setBounds(10, 808, 307, 22);
		panel.add(panel_1_4_2_20);

		txtRtLowerExtremity = new JTextField();
		txtRtLowerExtremity.setBounds(0, 0, 297, 22);
		panel_1_4_2_20.add(txtRtLowerExtremity);

		final JPanel panel_1_4_2_20_1 = new JPanel();
		panel_1_4_2_20_1.setBackground(Color.WHITE);
		panel_1_4_2_20_1.setLayout(null);
		panel_1_4_2_20_1.setBounds(10, 844, 307, 22);
		panel.add(panel_1_4_2_20_1);

		txtNurseInitial = new JTextField();
		txtNurseInitial.setBounds(0, 0, 297, 22);
		panel_1_4_2_20_1.add(txtNurseInitial);

		final JxButton btnSave = new JxButton(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				/* still to be implemented */
				if (doValidate()) {
					doSave();
					Global.FrameResidentAssessmentFormPage19Dialog.dispose();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(95, 907, 106, 26);
		panel_2.add(btnSave);

		final JxButton btnCancel = new JxButton(0.4f);

		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.currentResidentAssessmentFormPage19Col = null;
				Global.FrameResidentAssessmentFormPage19Dialog.dispose();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(261, 907, 106, 26);
		panel_2.add(btnCancel);
		// setBounds(0,0,);
		updateData();
	}

	public boolean doValidate() {
		return true;
	}

	public void doSave() {
		ResidentAssessmentFormPage19Col col = new ResidentAssessmentFormPage19Col();
		col.setDateOfAssessment(dcAssessmentDate.getDate());
		col.setTimeOfAssessment(txtTime.getText());
		col.setBloodPressure(txtBloodPressure.getText());
		col.setTemprature(txtTemprature.getText());
		col.setPulse(txtPulse.getText());
		col.setRespiration(txtRespiration.getText());
		col.setNormal(txtNormal.getText());
		col.setShallow(txtShallow.getText());
		col.setIrregular(txtIrregular.getText());
		col.setRPupilSize(txtRPupilSize.getText());
		col.setRPupilReact(txtRPupilReact.getText());
		col.setLPupilSize(txtLPupilSize.getText());
		col.setLPupilReact(txtLPupilReact.getText());
		col.setOpensSpontaneously(txtOpenSpontaneously.getText());
		col.setOpensToSpeech(txtOpensToSpeech.getText());
		col.setOpensToPain(txtOpensToPain.getText());
		col.setDoesNotOpen(txtDoesNotOpen.getText());
		col.setAlert(txtAlert.getText());
		col.setDrowsy(txtDrowsy.getText());
		col.setStuporous(txtStuporous.getText());
		col.setComatose(txtComatose.getText());
		col.setSpeechOriented(txtSpeechOriented.getText());
		col.setConfusedConversation(txtConfusedConversation.getText());
		col.setInappropriateWords(txtInappropriateWords.getText());
		col.setIncomprehensibleSpeech(txtIncomprehensibleSpeech.getText());
		col.setNoSpeech(txtNoSpeech.getText());
		col.setLtUpperExtremity(txtLtUpperExtremity.getText());
		col.setLtLowerExtremity(txtLtLowerExtremity.getText());
		col.setRtUpperExtremity(txtRtUpperExtremity.getText());
		col.setRtLowerExtremity(txtRtLowerExtremity.getText());
		col.setNurseInitial(txtNurseInitial.getText());
		Global.currentResidentAssessmentFormPage19Col = col;
	}

	public void updateData() {
		/*
		 * if (Global.currentInterdisciplinaryProgressNotesFormRow != null) {
		 * dcRdate.setDate(Global.currentInterdisciplinaryProgressNotesFormRow
		 * .getDateRecord()); txtRhours
		 * .setText(Global.currentInterdisciplinaryProgressNotesFormRow
		 * .getTimeRecord()); txtRdescription
		 * .setText(Global.currentInterdisciplinaryProgressNotesFormRow
		 * .getNotes()); txtRdicipline
		 * .setText(Global.currentInterdisciplinaryProgressNotesFormRow
		 * .getDiscipline()); } else { dcRdate.setDate(null);
		 * txtRhours.setText(""); txtRdicipline.setText("");
		 * txtRdescription.setText(""); }
		 */
		if (Global.currentResidentAssessmentFormPage19Col != null) {
			dcAssessmentDate
					.setDate(Global.currentResidentAssessmentFormPage19Col
							.getDateOfAssessment());
			txtTime.setText(Global.currentResidentAssessmentFormPage19Col
					.getTimeOfAssessment());
			txtBloodPressure
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getBloodPressure());
			txtTemprature.setText(Global.currentResidentAssessmentFormPage19Col
					.getTemprature());
			txtPulse.setText(Global.currentResidentAssessmentFormPage19Col
					.getPulse());
			txtRespiration
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getRespiration());
			txtNormal.setText(Global.currentResidentAssessmentFormPage19Col
					.getNormal());
			txtShallow.setText(Global.currentResidentAssessmentFormPage19Col
					.getShallow());
			txtIrregular.setText(Global.currentResidentAssessmentFormPage19Col
					.getIrregular());
			txtRPupilSize.setText(Global.currentResidentAssessmentFormPage19Col
					.getRPupilSize());
			txtRPupilReact
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getRPupilReact());
			txtLPupilSize.setText(Global.currentResidentAssessmentFormPage19Col
					.getRPupilSize());
			txtLPupilReact
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getLPupilReact());
			txtOpenSpontaneously
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getOpensSpontaneously());
			txtOpensToSpeech
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getOpensToSpeech());
			txtOpensToPain
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getOpensToPain());
			txtDoesNotOpen
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getDoesNotOpen());
			txtAlert.setText(Global.currentResidentAssessmentFormPage19Col
					.getAlert());
			txtDrowsy.setText(Global.currentResidentAssessmentFormPage19Col
					.getDrowsy());
			txtStuporous.setText(Global.currentResidentAssessmentFormPage19Col
					.getStuporous());
			txtComatose.setText(Global.currentResidentAssessmentFormPage19Col
					.getComatose());
			txtSpeechOriented
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getSpeechOriented());
			txtConfusedConversation
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getConfusedConversation());
			txtInappropriateWords
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getInappropriateWords());
			txtIncomprehensibleSpeech
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getIncomprehensibleSpeech());
			txtNoSpeech.setText(Global.currentResidentAssessmentFormPage19Col
					.getNoSpeech());
			txtLtUpperExtremity
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getLtUpperExtremity());
			txtLtLowerExtremity
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getLtLowerExtremity());
			txtRtUpperExtremity
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getRtUpperExtremity());
			txtRtLowerExtremity
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getRtLowerExtremity());
			txtNurseInitial
					.setText(Global.currentResidentAssessmentFormPage19Col
							.getNurseInitial());
		} else {

		}
	}
}
