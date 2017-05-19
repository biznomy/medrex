package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.rmi.RemoteException;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage3;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;

import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryPage3 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -716141080832957841L;
	private JComboBox cmbSignature;
	private JTextField txtVitalSigns;
	private JTextArea txtAreaComments;
	private JDateChooser dcDate;
	private ButtonGroup bggrooming21 = new ButtonGroup();
	private ButtonGroup bggrooming22 = new ButtonGroup();
	private ButtonGroup bggrooming23 = new ButtonGroup();
	private ButtonGroup bggrooming24 = new ButtonGroup();
	private ButtonGroup bggrooming25 = new ButtonGroup();
	private ButtonGroup bggrooming26 = new ButtonGroup();
	private ButtonGroup bggrooming27 = new ButtonGroup();
	private ButtonGroup bgGrooming11 = new ButtonGroup();
	private ButtonGroup bgGrooming12 = new ButtonGroup();
	private ButtonGroup bgGrooming13 = new ButtonGroup();
	private ButtonGroup bgGrooming14 = new ButtonGroup();
	private ButtonGroup bgGrooming15 = new ButtonGroup();
	private ButtonGroup bgGrooming16 = new ButtonGroup();
	private ButtonGroup bgGrooming17 = new ButtonGroup();
	private ButtonGroup bgAmbulation21 = new ButtonGroup();
	private ButtonGroup bgAmbulation22 = new ButtonGroup();
	private ButtonGroup bgAmbulation23 = new ButtonGroup();
	private ButtonGroup bgAmbulation24 = new ButtonGroup();
	private ButtonGroup bgAmbulation11 = new ButtonGroup();
	private ButtonGroup bgAmbulation12 = new ButtonGroup();
	private ButtonGroup bgAmbulation13 = new ButtonGroup();
	private ButtonGroup bgAmbulation14 = new ButtonGroup();
	private ButtonGroup bgEating11 = new ButtonGroup();
	private ButtonGroup bgEating21 = new ButtonGroup();
	private ButtonGroup bgDressing11 = new ButtonGroup();
	private ButtonGroup bgDressing12 = new ButtonGroup();
	private ButtonGroup bgDressing21 = new ButtonGroup();
	private ButtonGroup bgDressing22 = new ButtonGroup();
	private ButtonGroup bgToileting21 = new ButtonGroup();
	private ButtonGroup bgToileting22 = new ButtonGroup();
	private ButtonGroup bgToileting23 = new ButtonGroup();
	private ButtonGroup bgToileting24 = new ButtonGroup();
	private ButtonGroup bgToileting25 = new ButtonGroup();
	private ButtonGroup bgToileting11 = new ButtonGroup();
	private ButtonGroup bgToileting12 = new ButtonGroup();
	private ButtonGroup bgToileting13 = new ButtonGroup();
	private ButtonGroup bgToileting14 = new ButtonGroup();
	private ButtonGroup bgToileting15 = new ButtonGroup();
	private ButtonGroup bgBed11 = new ButtonGroup();
	private ButtonGroup bgBed12 = new ButtonGroup();
	private ButtonGroup bgBed13 = new ButtonGroup();
	private ButtonGroup bgBed21 = new ButtonGroup();
	private ButtonGroup bgBed22 = new ButtonGroup();
	private ButtonGroup bgBed23 = new ButtonGroup();
	private ButtonGroup bgTransfer11 = new ButtonGroup();
	private ButtonGroup bgTransfer12 = new ButtonGroup();
	private ButtonGroup bgTransfer13 = new ButtonGroup();
	private ButtonGroup bgTransfer21 = new ButtonGroup();
	private ButtonGroup bgTransfer22 = new ButtonGroup();
	private ButtonGroup bgTransfer23 = new ButtonGroup();

	public PanelMonthlySummaryPage3() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(900, 1400));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 900, 1390);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 0, 369, 176);
		panel.add(panel_1);
		panel_1.setLayout(null);

		final JLabel activitiesOfDailyLabel = new JLabel();
		activitiesOfDailyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		activitiesOfDailyLabel
				.setText("<HTML><U>ACTIVITIES OF DAILY LIVING</U></HTML>");
		activitiesOfDailyLabel.setBounds(105, 10, 186, 22);
		panel_1.add(activitiesOfDailyLabel);

		final JLabel selfPerformanceKeyLabel = new JLabel();
		selfPerformanceKeyLabel
				.setText("<html><u>Self performance key:</u></html>");
		selfPerformanceKeyLabel.setBounds(10, 39, 113, 14);
		panel_1.add(selfPerformanceKeyLabel);

		final JLabel iIndependentLabel = new JLabel();
		iIndependentLabel
				.setText("<html>* <b>I</b>- Independent (No help or obversight)</html>");
		iIndependentLabel.setBounds(10, 59, 209, 14);
		panel_1.add(iIndependentLabel);

		final JLabel iIndependentLabel_1 = new JLabel();
		iIndependentLabel_1
				.setText("<html>* <b>S</b>- Supervision (Oversight/ verbal cues/ no touch)</html>");
		iIndependentLabel_1.setBounds(10, 77, 275, 14);
		panel_1.add(iIndependentLabel_1);

		final JLabel sSupervisionLabel = new JLabel();
		sSupervisionLabel
				.setText("<html>* <b>L</b>- Limited Assist (Resident does more than staff)</html>");
		sSupervisionLabel.setBounds(10, 97, 281, 14);
		panel_1.add(sSupervisionLabel);

		final JLabel lLimitedLabel = new JLabel();
		lLimitedLabel
				.setText("<html>* <b>E</b>- Extensive Assist (Staff does more than Resident)</html>");
		lLimitedLabel.setBounds(10, 117, 281, 14);
		panel_1.add(lLimitedLabel);

		final JLabel eExtensiveLabel = new JLabel();
		eExtensiveLabel
				.setText("<html>* <b>D</b>- Dependent (Staff does all)</html>");
		eExtensiveLabel.setBounds(10, 137, 193, 14);
		panel_1.add(eExtensiveLabel);

		final JLabel dDependentLabel = new JLabel();
		dDependentLabel
				.setText("<html>* <b>N A</b>- Not done in past 7 days</html>");
		dDependentLabel.setBounds(10, 157, 193, 14);
		panel_1.add(dDependentLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(500, 0, 369, 176);
		panel.add(panel_2);

		final JLabel supportKeyLabel = new JLabel();
		supportKeyLabel.setText("<html><u>Support Key:</u></html>");
		supportKeyLabel.setBounds(10, 10, 94, 14);
		panel_2.add(supportKeyLabel);

		final JLabel iIndependentLabel_2 = new JLabel();
		iIndependentLabel_2.setText("<html>* <b>O</b>- No help</html>");
		iIndependentLabel_2.setBounds(10, 30, 80, 14);
		panel_2.add(iIndependentLabel_2);

		final JLabel oNoLabel = new JLabel();
		oNoLabel.setText("<html>* <b>s</b>- set up only</html>");
		oNoLabel.setBounds(10, 50, 121, 14);
		panel_2.add(oNoLabel);

		final JLabel sSetLabel = new JLabel();
		sSetLabel.setText("<html>* <b>1</b>- 1 Person assist</html>");
		sSetLabel.setBounds(10, 70, 145, 14);
		panel_2.add(sSetLabel);

		final JLabel label = new JLabel();
		label.setText("<html>* <b>2</b>- 2 or more people assist</html>");
		label.setBounds(10, 92, 162, 14);
		panel_2.add(label);

		final JLabel nALabel = new JLabel();
		nALabel.setText("<html>* <b>N A</b>- Not done in past 7 days</html>");
		nALabel.setBounds(10, 112, 179, 14);
		panel_2.add(nALabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 1159, 900, 227);
		panel.add(panel_3);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		commentsLabel.setText("COMMENTS");
		commentsLabel.setBounds(10, 10, 71, 14);
		panel_3.add(commentsLabel);

		txtAreaComments = new JTextArea();
		txtAreaComments.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaComments.setBounds(10, 30, 880, 105);
		panel_3.add(txtAreaComments);

		final JLabel vitalSignsLabel = new JLabel();
		vitalSignsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel.setText("Vital Signs :");
		vitalSignsLabel.setBounds(10, 150, 71, 14);
		panel_3.add(vitalSignsLabel);

		cmbSignature = new JComboBox();
		cmbSignature.setBounds(85, 182, 293, 23);
		panel_3.add(cmbSignature);

		txtVitalSigns = new JTextField();
		txtVitalSigns.setBounds(85, 150, 803, 18);
		panel_3.add(txtVitalSigns);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		signatureLabel.setText("Signature :");
		signatureLabel.setBounds(10, 186, 71, 14);
		panel_3.add(signatureLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateLabel.setText("Date :");
		dateLabel.setBounds(412, 186, 54, 14);
		panel_3.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setBounds(472, 183, 169, 20);
		panel_3.add(dcDate);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 197, 437, 956);
		panel.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 430, 115);
		panel_4.add(panel_5);

		final JLabel bedMobilityLabel = new JLabel();
		bedMobilityLabel.setText("<html><u>Bed Mobility :</u></html>");
		bedMobilityLabel.setBounds(5, 0, 81, 14);
		panel_5.add(bedMobilityLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 20, 430, 94);
		panel_5.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 430, 32);
		panel_6.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 211, 32);
		panel_7.add(panel_8);

		final JLabel turnsSideToLabel = new JLabel();
		turnsSideToLabel.setText("Turns side to side");
		turnsSideToLabel.setBounds(10, 10, 111, 14);
		panel_8.add(turnsSideToLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(210, 0, 36, 32);
		panel_7.add(panel_9);

		final JRadioButton radioButton = new JRadioButton();
		bgBed11.add(radioButton);
		radioButton.setActionCommand("1");
		radioButton.setBackground(Color.WHITE);
		radioButton.setText("I");
		panel_9.add(radioButton);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setBounds(245, 0, 36, 32);
		panel_7.add(panel_9_1);

		final JRadioButton sRadioButton = new JRadioButton();
		bgBed11.add(sRadioButton);
		sRadioButton.setActionCommand("2");
		sRadioButton.setBackground(Color.WHITE);
		sRadioButton.setText("S");
		panel_9_1.add(sRadioButton);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2.setBounds(280, 0, 36, 32);
		panel_7.add(panel_9_2);

		final JRadioButton lRadioButton = new JRadioButton();
		bgBed11.add(lRadioButton);
		lRadioButton.setActionCommand("3");
		lRadioButton.setBackground(Color.WHITE);
		lRadioButton.setText("L");
		panel_9_2.add(lRadioButton);

		final JPanel panel_9_3 = new JPanel();
		panel_9_3.setBackground(Color.WHITE);
		panel_9_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3.setBounds(315, 0, 36, 32);
		panel_7.add(panel_9_3);

		final JRadioButton eRadioButton = new JRadioButton();
		bgBed11.add(eRadioButton);
		eRadioButton.setActionCommand("4");
		eRadioButton.setBackground(Color.WHITE);
		eRadioButton.setText("E");
		panel_9_3.add(eRadioButton);

		final JPanel panel_9_4 = new JPanel();
		panel_9_4.setBackground(Color.WHITE);
		panel_9_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4.setBounds(350, 0, 36, 32);
		panel_7.add(panel_9_4);

		final JRadioButton radioButton_1 = new JRadioButton();
		bgBed11.add(radioButton_1);
		radioButton_1.setActionCommand("5");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setText("D");
		panel_9_4.add(radioButton_1);

		final JPanel panel_9_4_1 = new JPanel();
		panel_9_4_1.setBackground(Color.WHITE);
		panel_9_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1.setBounds(385, 0, 45, 32);
		panel_7.add(panel_9_4_1);

		final JRadioButton naRadioButton = new JRadioButton();
		bgBed11.add(naRadioButton);
		naRadioButton.setActionCommand("6");
		naRadioButton.setBackground(Color.WHITE);
		naRadioButton.setText("NA");
		panel_9_4_1.add(naRadioButton);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 31, 430, 32);
		panel_6.add(panel_7_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 0, 211, 32);
		panel_7_1.add(panel_8_1);

		final JLabel turnsSideToLabel_1 = new JLabel();
		turnsSideToLabel_1.setText("Moves up in bed");
		turnsSideToLabel_1.setBounds(10, 10, 111, 14);
		panel_8_1.add(turnsSideToLabel_1);

		final JPanel panel_9_5 = new JPanel();
		panel_9_5.setBackground(Color.WHITE);
		panel_9_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5.setBounds(210, 0, 36, 32);
		panel_7_1.add(panel_9_5);

		final JRadioButton radioButton_2 = new JRadioButton();
		bgBed12.add(radioButton_2);
		radioButton_2.setActionCommand("1");
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setText("I");
		panel_9_5.add(radioButton_2);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setBounds(245, 0, 36, 32);
		panel_7_1.add(panel_9_1_1);

		final JRadioButton sRadioButton_1 = new JRadioButton();
		bgBed12.add(sRadioButton_1);
		sRadioButton_1.setActionCommand("2");
		sRadioButton_1.setBackground(Color.WHITE);
		sRadioButton_1.setText("S");
		panel_9_1_1.add(sRadioButton_1);

		final JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBackground(Color.WHITE);
		panel_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1.setBounds(280, 0, 36, 32);
		panel_7_1.add(panel_9_2_1);

		final JRadioButton lRadioButton_1 = new JRadioButton();
		bgBed12.add(lRadioButton_1);
		lRadioButton_1.setActionCommand("3");
		lRadioButton_1.setBackground(Color.WHITE);
		lRadioButton_1.setText("L");
		panel_9_2_1.add(lRadioButton_1);

		final JPanel panel_9_3_1 = new JPanel();
		panel_9_3_1.setBackground(Color.WHITE);
		panel_9_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1.setBounds(315, 0, 36, 32);
		panel_7_1.add(panel_9_3_1);

		final JRadioButton eRadioButton_1 = new JRadioButton();
		bgBed12.add(eRadioButton_1);
		eRadioButton_1.setActionCommand("4");
		eRadioButton_1.setBackground(Color.WHITE);
		eRadioButton_1.setText("E");
		panel_9_3_1.add(eRadioButton_1);

		final JPanel panel_9_4_2 = new JPanel();
		panel_9_4_2.setBackground(Color.WHITE);
		panel_9_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2.setBounds(350, 0, 36, 32);
		panel_7_1.add(panel_9_4_2);

		final JRadioButton radioButton_1_1 = new JRadioButton();
		bgBed12.add(radioButton_1_1);
		radioButton_1_1.setActionCommand("5");
		radioButton_1_1.setBackground(Color.WHITE);
		radioButton_1_1.setText("D");
		panel_9_4_2.add(radioButton_1_1);

		final JPanel panel_9_4_1_1 = new JPanel();
		panel_9_4_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1.setBounds(385, 0, 45, 32);
		panel_7_1.add(panel_9_4_1_1);

		final JRadioButton naRadioButton_1 = new JRadioButton();
		bgBed12.add(naRadioButton_1);
		naRadioButton_1.setActionCommand("6");
		naRadioButton_1.setBackground(Color.WHITE);
		naRadioButton_1.setText("NA");
		panel_9_4_1_1.add(naRadioButton_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 62, 430, 32);
		panel_6.add(panel_7_1_1);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1.add(panel_8_1_1);

		final JLabel turnsSideToLabel_1_1 = new JLabel();
		turnsSideToLabel_1_1.setText("Moves to / from lying position");
		turnsSideToLabel_1_1.setBounds(10, 10, 175, 14);
		panel_8_1_1.add(turnsSideToLabel_1_1);

		final JPanel panel_9_5_1 = new JPanel();
		panel_9_5_1.setBackground(Color.WHITE);
		panel_9_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1.setBounds(210, 0, 36, 32);
		panel_7_1_1.add(panel_9_5_1);

		final JRadioButton radioButton_2_1 = new JRadioButton();
		bgBed13.add(radioButton_2_1);
		radioButton_2_1.setActionCommand("1");
		radioButton_2_1.setBackground(Color.WHITE);
		radioButton_2_1.setText("I");
		panel_9_5_1.add(radioButton_2_1);

		final JPanel panel_9_1_1_1 = new JPanel();
		panel_9_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_1_1.add(panel_9_1_1_1);

		final JRadioButton sRadioButton_1_1 = new JRadioButton();
		bgBed13.add(sRadioButton_1_1);
		sRadioButton_1_1.setActionCommand("2");
		sRadioButton_1_1.setBackground(Color.WHITE);
		sRadioButton_1_1.setText("S");
		panel_9_1_1_1.add(sRadioButton_1_1);

		final JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1.setBounds(280, 0, 36, 32);
		panel_7_1_1.add(panel_9_2_1_1);

		final JRadioButton lRadioButton_1_1 = new JRadioButton();
		bgBed13.add(lRadioButton_1_1);
		lRadioButton_1_1.setActionCommand("3");
		lRadioButton_1_1.setBackground(Color.WHITE);
		lRadioButton_1_1.setText("L");
		panel_9_2_1_1.add(lRadioButton_1_1);

		final JPanel panel_9_3_1_1 = new JPanel();
		panel_9_3_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1.setBounds(315, 0, 36, 32);
		panel_7_1_1.add(panel_9_3_1_1);

		final JRadioButton eRadioButton_1_1 = new JRadioButton();
		bgBed13.add(eRadioButton_1_1);
		eRadioButton_1_1.setActionCommand("4");
		eRadioButton_1_1.setBackground(Color.WHITE);
		eRadioButton_1_1.setText("E");
		panel_9_3_1_1.add(eRadioButton_1_1);

		final JPanel panel_9_4_2_1 = new JPanel();
		panel_9_4_2_1.setBackground(Color.WHITE);
		panel_9_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1.setBounds(350, 0, 36, 32);
		panel_7_1_1.add(panel_9_4_2_1);

		final JRadioButton radioButton_1_1_1 = new JRadioButton();
		bgBed13.add(radioButton_1_1_1);
		radioButton_1_1_1.setActionCommand("5");
		radioButton_1_1_1.setBackground(Color.WHITE);
		radioButton_1_1_1.setText("D");
		panel_9_4_2_1.add(radioButton_1_1_1);

		final JPanel panel_9_4_1_1_1 = new JPanel();
		panel_9_4_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1.setBounds(385, 0, 45, 32);
		panel_7_1_1.add(panel_9_4_1_1_1);

		final JRadioButton naRadioButton_1_1 = new JRadioButton();
		bgBed13.add(naRadioButton_1_1);
		naRadioButton_1_1.setActionCommand("6");
		naRadioButton_1_1.setBackground(Color.WHITE);
		naRadioButton_1_1.setText("NA");
		panel_9_4_1_1_1.add(naRadioButton_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 121, 430, 115);
		panel_4.add(panel_5_1);

		final JLabel bedMobilityLabel_1 = new JLabel();
		bedMobilityLabel_1.setText("<html><u>Transfer :</u></html>");
		bedMobilityLabel_1.setBounds(5, 0, 81, 14);
		panel_5_1.add(bedMobilityLabel_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 20, 430, 94);
		panel_5_1.add(panel_6_1);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(0, 0, 430, 32);
		panel_6_1.add(panel_7_2);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(0, 0, 211, 32);
		panel_7_2.add(panel_8_2);

		final JLabel turnsSideToLabel_2 = new JLabel();
		turnsSideToLabel_2.setText("Bed to W / C");
		turnsSideToLabel_2.setBounds(10, 10, 111, 14);
		panel_8_2.add(turnsSideToLabel_2);

		final JPanel panel_9_6 = new JPanel();
		panel_9_6.setBackground(Color.WHITE);
		panel_9_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6.setBounds(210, 0, 36, 32);
		panel_7_2.add(panel_9_6);

		final JRadioButton radioButton_3 = new JRadioButton();
		bgTransfer11.add(radioButton_3);
		radioButton_3.setActionCommand("1");
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setText("I");
		panel_9_6.add(radioButton_3);

		final JPanel panel_9_1_2 = new JPanel();
		panel_9_1_2.setBackground(Color.WHITE);
		panel_9_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2.setBounds(245, 0, 36, 32);
		panel_7_2.add(panel_9_1_2);

		final JRadioButton sRadioButton_2 = new JRadioButton();
		bgTransfer11.add(sRadioButton_2);
		sRadioButton_2.setActionCommand("2");
		sRadioButton_2.setBackground(Color.WHITE);
		sRadioButton_2.setText("S");
		panel_9_1_2.add(sRadioButton_2);

		final JPanel panel_9_2_2 = new JPanel();
		panel_9_2_2.setBackground(Color.WHITE);
		panel_9_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2.setBounds(280, 0, 36, 32);
		panel_7_2.add(panel_9_2_2);

		final JRadioButton lRadioButton_2 = new JRadioButton();
		bgTransfer11.add(lRadioButton_2);
		lRadioButton_2.setActionCommand("3");
		lRadioButton_2.setBackground(Color.WHITE);
		lRadioButton_2.setText("S");
		panel_9_2_2.add(lRadioButton_2);

		final JPanel panel_9_3_2 = new JPanel();
		panel_9_3_2.setBackground(Color.WHITE);
		panel_9_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2.setBounds(315, 0, 36, 32);
		panel_7_2.add(panel_9_3_2);

		final JRadioButton eRadioButton_2 = new JRadioButton();
		bgTransfer11.add(eRadioButton_2);
		eRadioButton_2.setActionCommand("4");
		eRadioButton_2.setBackground(Color.WHITE);
		eRadioButton_2.setText("E");
		panel_9_3_2.add(eRadioButton_2);

		final JPanel panel_9_4_3 = new JPanel();
		panel_9_4_3.setBackground(Color.WHITE);
		panel_9_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3.setBounds(350, 0, 36, 32);
		panel_7_2.add(panel_9_4_3);

		final JRadioButton radioButton_1_2 = new JRadioButton();
		bgTransfer11.add(radioButton_1_2);
		radioButton_1_2.setActionCommand("5");
		radioButton_1_2.setBackground(Color.WHITE);
		radioButton_1_2.setText("D");
		panel_9_4_3.add(radioButton_1_2);

		final JPanel panel_9_4_1_2 = new JPanel();
		panel_9_4_1_2.setBackground(Color.WHITE);
		panel_9_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2.setBounds(385, 0, 45, 32);
		panel_7_2.add(panel_9_4_1_2);

		final JRadioButton naRadioButton_2 = new JRadioButton();
		bgTransfer11.add(naRadioButton_2);
		naRadioButton_2.setActionCommand("6");
		naRadioButton_2.setBackground(Color.WHITE);
		naRadioButton_2.setText("NA");
		panel_9_4_1_2.add(naRadioButton_2);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(0, 31, 430, 32);
		panel_6_1.add(panel_7_1_2);

		final JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setBackground(Color.WHITE);
		panel_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2.setLayout(null);
		panel_8_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_2.add(panel_8_1_2);

		final JLabel turnsSideToLabel_1_2 = new JLabel();
		turnsSideToLabel_1_2.setText("W / C to bed");
		turnsSideToLabel_1_2.setBounds(10, 10, 111, 14);
		panel_8_1_2.add(turnsSideToLabel_1_2);

		final JPanel panel_9_5_2 = new JPanel();
		panel_9_5_2.setBackground(Color.WHITE);
		panel_9_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2.setBounds(210, 0, 36, 32);
		panel_7_1_2.add(panel_9_5_2);

		final JRadioButton radioButton_2_2 = new JRadioButton();
		bgTransfer12.add(radioButton_2_2);
		radioButton_2_2.setActionCommand("1");
		radioButton_2_2.setBackground(Color.WHITE);
		radioButton_2_2.setText("I");
		panel_9_5_2.add(radioButton_2_2);

		final JPanel panel_9_1_1_2 = new JPanel();
		panel_9_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_2.add(panel_9_1_1_2);

		final JRadioButton sRadioButton_1_2 = new JRadioButton();
		bgTransfer12.add(sRadioButton_1_2);
		sRadioButton_1_2.setActionCommand("2");
		sRadioButton_1_2.setBackground(Color.WHITE);
		sRadioButton_1_2.setText("S");
		panel_9_1_1_2.add(sRadioButton_1_2);

		final JPanel panel_9_2_1_2 = new JPanel();
		panel_9_2_1_2.setBackground(Color.WHITE);
		panel_9_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_2.add(panel_9_2_1_2);

		final JRadioButton lRadioButton_1_2 = new JRadioButton();
		bgTransfer12.add(lRadioButton_1_2);
		lRadioButton_1_2.setActionCommand("3");
		lRadioButton_1_2.setBackground(Color.WHITE);
		lRadioButton_1_2.setText("S");
		panel_9_2_1_2.add(lRadioButton_1_2);

		final JPanel panel_9_3_1_2 = new JPanel();
		panel_9_3_1_2.setBackground(Color.WHITE);
		panel_9_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_2.add(panel_9_3_1_2);

		final JRadioButton eRadioButton_1_2 = new JRadioButton();
		bgTransfer12.add(eRadioButton_1_2);
		eRadioButton_1_2.setActionCommand("4");
		eRadioButton_1_2.setBackground(Color.WHITE);
		eRadioButton_1_2.setText("E");
		panel_9_3_1_2.add(eRadioButton_1_2);

		final JPanel panel_9_4_2_2 = new JPanel();
		panel_9_4_2_2.setBackground(Color.WHITE);
		panel_9_4_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2.setBounds(350, 0, 36, 32);
		panel_7_1_2.add(panel_9_4_2_2);

		final JRadioButton radioButton_1_1_2 = new JRadioButton();
		bgTransfer12.add(radioButton_1_1_2);
		radioButton_1_1_2.setActionCommand("5");
		radioButton_1_1_2.setBackground(Color.WHITE);
		radioButton_1_1_2.setText("D");
		panel_9_4_2_2.add(radioButton_1_1_2);

		final JPanel panel_9_4_1_1_2 = new JPanel();
		panel_9_4_1_1_2.setBackground(Color.WHITE);
		panel_9_4_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_2.setBounds(385, 0, 45, 32);
		panel_7_1_2.add(panel_9_4_1_1_2);

		final JRadioButton naRadioButton_1_2 = new JRadioButton();
		bgTransfer12.add(naRadioButton_1_2);
		naRadioButton_1_2.setActionCommand("6");
		naRadioButton_1_2.setBackground(Color.WHITE);
		naRadioButton_1_2.setText("NA");
		panel_9_4_1_1_2.add(naRadioButton_1_2);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(0, 62, 430, 32);
		panel_6_1.add(panel_7_1_1_1);

		final JPanel panel_8_1_1_1 = new JPanel();
		panel_8_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1.setLayout(null);
		panel_8_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1.add(panel_8_1_1_1);

		final JLabel turnsSideToLabel_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1.setText("sit to stand");
		turnsSideToLabel_1_1_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1.add(turnsSideToLabel_1_1_1);

		final JPanel panel_9_5_1_1 = new JPanel();
		panel_9_5_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1.add(panel_9_5_1_1);

		final JRadioButton radioButton_2_1_1 = new JRadioButton();
		bgTransfer13.add(radioButton_2_1_1);
		radioButton_2_1_1.setActionCommand("1");
		radioButton_2_1_1.setBackground(Color.WHITE);
		radioButton_2_1_1.setText("I");
		panel_9_5_1_1.add(radioButton_2_1_1);

		final JPanel panel_9_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1.add(panel_9_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1 = new JRadioButton();
		bgTransfer13.add(sRadioButton_1_1_1);
		sRadioButton_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1.setText("S");
		panel_9_1_1_1_1.add(sRadioButton_1_1_1);

		final JPanel panel_9_2_1_1_1 = new JPanel();
		panel_9_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1.add(panel_9_2_1_1_1);

		final JRadioButton lRadioButton_1_1_1 = new JRadioButton();
		bgTransfer13.add(lRadioButton_1_1_1);
		lRadioButton_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1.setText("S");
		panel_9_2_1_1_1.add(lRadioButton_1_1_1);

		final JPanel panel_9_3_1_1_1 = new JPanel();
		panel_9_3_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1.add(panel_9_3_1_1_1);

		final JRadioButton eRadioButton_1_1_1 = new JRadioButton();
		bgTransfer13.add(eRadioButton_1_1_1);
		eRadioButton_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1.setText("E");
		panel_9_3_1_1_1.add(eRadioButton_1_1_1);

		final JPanel panel_9_4_2_1_1 = new JPanel();
		panel_9_4_2_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1.setBounds(350, 0, 36, 32);
		panel_7_1_1_1.add(panel_9_4_2_1_1);

		final JRadioButton radioButton_1_1_1_1 = new JRadioButton();
		bgTransfer13.add(radioButton_1_1_1_1);
		radioButton_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1.setBackground(Color.WHITE);
		radioButton_1_1_1_1.setText("D");
		panel_9_4_2_1_1.add(radioButton_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_7_1_1_1.add(panel_9_4_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1 = new JRadioButton();
		bgTransfer13.add(naRadioButton_1_1_1);
		naRadioButton_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1.setBackground(Color.WHITE);
		naRadioButton_1_1_1.setText("NA");
		panel_9_4_1_1_1_1.add(naRadioButton_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(Color.WHITE);
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 242, 430, 177);
		panel_4.add(panel_5_1_1);

		final JLabel bedMobilityLabel_1_1 = new JLabel();
		bedMobilityLabel_1_1.setText("<html><u>Toileting :</u></html>");
		bedMobilityLabel_1_1.setBounds(5, 0, 81, 14);
		panel_5_1_1.add(bedMobilityLabel_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 20, 430, 94);
		panel_5_1_1.add(panel_6_1_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(0, 0, 430, 32);
		panel_6_1_1.add(panel_7_2_1);

		final JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBackground(Color.WHITE);
		panel_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1.setLayout(null);
		panel_8_2_1.setBounds(0, 0, 211, 32);
		panel_7_2_1.add(panel_8_2_1);

		final JLabel turnsSideToLabel_2_1 = new JLabel();
		turnsSideToLabel_2_1.setText("Care of F / C / Ostomy");
		turnsSideToLabel_2_1.setBounds(10, 10, 111, 14);
		panel_8_2_1.add(turnsSideToLabel_2_1);

		final JPanel panel_9_6_1 = new JPanel();
		panel_9_6_1.setBackground(Color.WHITE);
		panel_9_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1.setBounds(210, 0, 36, 32);
		panel_7_2_1.add(panel_9_6_1);

		final JRadioButton radioButton_3_1 = new JRadioButton();
		bgToileting11.add(radioButton_3_1);
		radioButton_3_1.setActionCommand("1");
		radioButton_3_1.setBackground(Color.WHITE);
		radioButton_3_1.setText("I");
		panel_9_6_1.add(radioButton_3_1);

		final JPanel panel_9_1_2_1 = new JPanel();
		panel_9_1_2_1.setBackground(Color.WHITE);
		panel_9_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1.setBounds(245, 0, 36, 32);
		panel_7_2_1.add(panel_9_1_2_1);

		final JRadioButton sRadioButton_2_1 = new JRadioButton();
		bgToileting11.add(sRadioButton_2_1);
		sRadioButton_2_1.setActionCommand("2");
		sRadioButton_2_1.setBackground(Color.WHITE);
		sRadioButton_2_1.setText("S");
		panel_9_1_2_1.add(sRadioButton_2_1);

		final JPanel panel_9_2_2_1 = new JPanel();
		panel_9_2_2_1.setBackground(Color.WHITE);
		panel_9_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1.setBounds(280, 0, 36, 32);
		panel_7_2_1.add(panel_9_2_2_1);

		final JRadioButton lRadioButton_2_1 = new JRadioButton();
		bgToileting11.add(lRadioButton_2_1);
		lRadioButton_2_1.setActionCommand("3");
		lRadioButton_2_1.setBackground(Color.WHITE);
		lRadioButton_2_1.setText("L");
		panel_9_2_2_1.add(lRadioButton_2_1);

		final JPanel panel_9_3_2_1 = new JPanel();
		panel_9_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1.setBounds(315, 0, 36, 32);
		panel_9_3_2_1.setBackground(Color.WHITE);
		panel_7_2_1.add(panel_9_3_2_1);

		final JRadioButton eRadioButton_2_1 = new JRadioButton();
		bgToileting11.add(eRadioButton_2_1);
		eRadioButton_2_1.setActionCommand("4");
		eRadioButton_2_1.setBackground(Color.WHITE);
		eRadioButton_2_1.setText("E");
		panel_9_3_2_1.add(eRadioButton_2_1);

		final JPanel panel_9_4_3_1 = new JPanel();
		panel_9_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1.setBackground(Color.WHITE);
		panel_9_4_3_1.setBounds(350, 0, 36, 32);
		panel_7_2_1.add(panel_9_4_3_1);

		final JRadioButton radioButton_1_2_1 = new JRadioButton();
		bgToileting11.add(radioButton_1_2_1);
		radioButton_1_2_1.setActionCommand("5");
		radioButton_1_2_1.setText("D");
		radioButton_1_2_1.setBackground(Color.WHITE);
		panel_9_4_3_1.add(radioButton_1_2_1);

		final JPanel panel_9_4_1_2_1 = new JPanel();
		panel_9_4_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_2_1.setBackground(Color.WHITE);
		panel_7_2_1.add(panel_9_4_1_2_1);

		final JRadioButton naRadioButton_2_1 = new JRadioButton();
		bgToileting11.add(naRadioButton_2_1);
		naRadioButton_2_1.setActionCommand("6");
		naRadioButton_2_1.setText("NA");
		naRadioButton_2_1.setBackground(Color.WHITE);
		panel_9_4_1_2_1.add(naRadioButton_2_1);

		final JPanel panel_7_1_2_1 = new JPanel();
		panel_7_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1.setLayout(null);
		panel_7_1_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.setBounds(0, 31, 430, 32);
		panel_6_1_1.add(panel_7_1_2_1);

		final JPanel panel_8_1_2_1 = new JPanel();
		panel_8_1_2_1.setBackground(Color.WHITE);
		panel_8_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1.setLayout(null);
		panel_8_1_2_1.setBounds(0, 0, 211, 32);
		panel_7_1_2_1.add(panel_8_1_2_1);

		final JLabel turnsSideToLabel_1_2_1 = new JLabel();
		turnsSideToLabel_1_2_1.setText("Transfer on / off toilet");
		turnsSideToLabel_1_2_1.setBounds(10, 10, 111, 14);
		turnsSideToLabel_1_2_1.setBackground(Color.WHITE);
		panel_8_1_2_1.add(turnsSideToLabel_1_2_1);

		final JPanel panel_9_5_2_1 = new JPanel();
		panel_9_5_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1.setBounds(210, 0, 36, 32);
		panel_9_5_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_5_2_1);

		final JRadioButton radioButton_2_2_1 = new JRadioButton();
		bgToileting12.add(radioButton_2_2_1);
		radioButton_2_2_1.setActionCommand("1");
		radioButton_2_2_1.setText("I");
		radioButton_2_2_1.setBackground(Color.WHITE);
		panel_9_5_2_1.add(radioButton_2_2_1);

		final JPanel panel_9_1_1_2_1 = new JPanel();
		panel_9_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_1_1_2_1);

		final JRadioButton sRadioButton_1_2_1 = new JRadioButton();
		bgToileting12.add(sRadioButton_1_2_1);
		sRadioButton_1_2_1.setActionCommand("2");
		sRadioButton_1_2_1.setText("S");
		sRadioButton_1_2_1.setBackground(Color.WHITE);
		panel_9_1_1_2_1.add(sRadioButton_1_2_1);

		final JPanel panel_9_2_1_2_1 = new JPanel();
		panel_9_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_2_1_2_1);

		final JRadioButton lRadioButton_1_2_1 = new JRadioButton();
		bgToileting12.add(lRadioButton_1_2_1);
		lRadioButton_1_2_1.setActionCommand("3");
		lRadioButton_1_2_1.setText("L");
		lRadioButton_1_2_1.setBackground(Color.WHITE);
		panel_9_2_1_2_1.add(lRadioButton_1_2_1);

		final JPanel panel_9_3_1_2_1 = new JPanel();
		panel_9_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_3_1_2_1);

		final JRadioButton eRadioButton_1_2_1 = new JRadioButton();
		bgToileting12.add(eRadioButton_1_2_1);
		eRadioButton_1_2_1.setActionCommand("4");
		eRadioButton_1_2_1.setText("E");
		eRadioButton_1_2_1.setBackground(Color.WHITE);
		panel_9_3_1_2_1.add(eRadioButton_1_2_1);

		final JPanel panel_9_4_2_2_1 = new JPanel();
		panel_9_4_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_4_2_2_1);

		final JRadioButton radioButton_1_1_2_1 = new JRadioButton();
		bgToileting12.add(radioButton_1_1_2_1);
		radioButton_1_1_2_1.setActionCommand("5");
		radioButton_1_1_2_1.setText("D");
		radioButton_1_1_2_1.setBackground(Color.WHITE);
		panel_9_4_2_2_1.add(radioButton_1_1_2_1);

		final JPanel panel_9_4_1_1_2_1 = new JPanel();
		panel_9_4_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_2_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_2_1.setBackground(Color.WHITE);
		panel_7_1_2_1.add(panel_9_4_1_1_2_1);

		final JRadioButton naRadioButton_1_2_1 = new JRadioButton();
		bgToileting12.add(naRadioButton_1_2_1);
		naRadioButton_1_2_1.setActionCommand("6");
		naRadioButton_1_2_1.setText("NA");
		naRadioButton_1_2_1.setBackground(Color.WHITE);
		panel_9_4_1_1_2_1.add(naRadioButton_1_2_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(0, 62, 430, 32);
		panel_7_1_1_1_1.setBackground(Color.WHITE);
		panel_6_1_1.add(panel_7_1_1_1_1);

		final JPanel panel_8_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1.add(panel_8_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1.setText("Hygiene");
		turnsSideToLabel_1_1_1_1.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1.add(turnsSideToLabel_1_1_1_1);

		final JPanel panel_9_5_1_1_1 = new JPanel();
		panel_9_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.add(panel_9_5_1_1_1);

		final JRadioButton radioButton_2_1_1_1 = new JRadioButton();
		bgToileting13.add(radioButton_2_1_1_1);
		radioButton_2_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1.setText("I");
		radioButton_2_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1.add(radioButton_2_1_1_1);

		final JPanel panel_9_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.add(panel_9_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1 = new JRadioButton();
		bgToileting13.add(sRadioButton_1_1_1_1);
		sRadioButton_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1.setText("S");
		sRadioButton_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1.add(sRadioButton_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.add(panel_9_2_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1 = new JRadioButton();
		bgToileting13.add(lRadioButton_1_1_1_1);
		lRadioButton_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1.setText("L");
		lRadioButton_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1.add(lRadioButton_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.add(panel_9_3_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1 = new JRadioButton();
		bgToileting13.add(eRadioButton_1_1_1_1);
		eRadioButton_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1.setText("E");
		eRadioButton_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1.add(eRadioButton_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1.setBounds(350, 0, 36, 32);
		panel_7_1_1_1_1.add(panel_9_4_2_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1 = new JRadioButton();
		bgToileting13.add(radioButton_1_1_1_1_1);
		radioButton_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1.setText("D");
		radioButton_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1.add(radioButton_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.add(panel_9_4_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1 = new JRadioButton();
		bgToileting13.add(naRadioButton_1_1_1_1);
		naRadioButton_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1.setText("NA");
		naRadioButton_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1.add(naRadioButton_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.setBounds(0, 113, 430, 32);
		panel_5_1_1.add(panel_7_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1.add(panel_8_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1.setText("Adjusts clothing");
		turnsSideToLabel_1_1_1_1_1.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_5_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1 = new JRadioButton();
		bgToileting14.add(radioButton_2_1_1_1_1);
		radioButton_2_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1.setText("I");
		radioButton_2_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1.add(radioButton_2_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1 = new JRadioButton();
		bgToileting14.add(sRadioButton_1_1_1_1_1);
		sRadioButton_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1.setText("S");
		sRadioButton_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_2_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1 = new JRadioButton();
		bgToileting14.add(lRadioButton_1_1_1_1_1);
		lRadioButton_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1.setText("L");
		lRadioButton_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1.add(lRadioButton_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_3_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1 = new JRadioButton();
		bgToileting14.add(eRadioButton_1_1_1_1_1);
		eRadioButton_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1.setText("E");
		eRadioButton_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1.add(eRadioButton_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_4_2_1_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1_1 = new JRadioButton();
		bgToileting14.add(radioButton_1_1_1_1_1_1);
		radioButton_1_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1_1.setText("D");
		radioButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1.add(radioButton_1_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.add(panel_9_4_1_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1_1 = new JRadioButton();
		bgToileting14.add(naRadioButton_1_1_1_1_1);
		naRadioButton_1_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1_1.setText("NA");
		naRadioButton_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1.add(naRadioButton_1_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.setBounds(0, 144, 430, 32);
		panel_5_1_1.add(panel_7_1_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1.setText("Use of urinal / bedpan");
		turnsSideToLabel_1_1_1_1_1_1.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_5_1_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(radioButton_2_1_1_1_1_1);
		radioButton_2_1_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1_1.setText("I");
		radioButton_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1.add(radioButton_2_1_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(sRadioButton_1_1_1_1_1_1);
		sRadioButton_1_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1.setText("S");
		sRadioButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_2_1_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(lRadioButton_1_1_1_1_1_1);
		lRadioButton_1_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1.setText("L");
		lRadioButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1.add(lRadioButton_1_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_3_1_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(eRadioButton_1_1_1_1_1_1);
		eRadioButton_1_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1.setText("E");
		eRadioButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1.add(eRadioButton_1_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_4_2_1_1_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(radioButton_1_1_1_1_1_1_1);
		radioButton_1_1_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1_1_1.setText("D");
		radioButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1.add(radioButton_1_1_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.add(panel_9_4_1_1_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1_1_1 = new JRadioButton();
		bgToileting15.add(naRadioButton_1_1_1_1_1_1);
		naRadioButton_1_1_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1_1_1.setText("NA");
		naRadioButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_1.add(naRadioButton_1_1_1_1_1_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, 425, 430, 53);
		panel_4.add(panel_5_1_1_1);

		final JLabel bedMobilityLabel_1_1_1 = new JLabel();
		bedMobilityLabel_1_1_1.setText("<html><u>Eating :</u></html>");
		bedMobilityLabel_1_1_1.setBounds(5, 0, 81, 14);
		bedMobilityLabel_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.add(bedMobilityLabel_1_1_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 20, 430, 32);
		panel_6_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.add(panel_6_1_1_1);

		final JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.setBounds(0, 0, 430, 32);
		panel_6_1_1_1.add(panel_7_2_1_1);

		final JPanel panel_8_2_1_1 = new JPanel();
		panel_8_2_1_1.setBackground(Color.WHITE);
		panel_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1.setLayout(null);
		panel_8_2_1_1.setBounds(0, 0, 211, 32);
		panel_7_2_1_1.add(panel_8_2_1_1);

		final JLabel turnsSideToLabel_2_1_1 = new JLabel();
		turnsSideToLabel_2_1_1.setText("Includes use of NGT / G Tube");
		turnsSideToLabel_2_1_1.setBounds(10, 10, 174, 14);
		turnsSideToLabel_2_1_1.setBackground(Color.WHITE);
		panel_8_2_1_1.add(turnsSideToLabel_2_1_1);

		final JPanel panel_9_6_1_1 = new JPanel();
		panel_9_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_1.setBounds(210, 0, 36, 32);
		panel_9_6_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_6_1_1);

		final JRadioButton radioButton_3_1_1 = new JRadioButton();
		bgEating11.add(radioButton_3_1_1);
		radioButton_3_1_1.setActionCommand("1");
		radioButton_3_1_1.setText("I");
		radioButton_3_1_1.setBackground(Color.WHITE);
		panel_9_6_1_1.add(radioButton_3_1_1);

		final JPanel panel_9_1_2_1_1 = new JPanel();
		panel_9_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_1_2_1_1);

		final JRadioButton sRadioButton_2_1_1 = new JRadioButton();
		bgEating11.add(sRadioButton_2_1_1);
		sRadioButton_2_1_1.setActionCommand("2");
		sRadioButton_2_1_1.setText("S");
		sRadioButton_2_1_1.setBackground(Color.WHITE);
		panel_9_1_2_1_1.add(sRadioButton_2_1_1);

		final JPanel panel_9_2_2_1_1 = new JPanel();
		panel_9_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_2_2_1_1);

		final JRadioButton lRadioButton_2_1_1 = new JRadioButton();
		bgEating11.add(lRadioButton_2_1_1);
		lRadioButton_2_1_1.setActionCommand("3");
		lRadioButton_2_1_1.setText("L");
		lRadioButton_2_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1.add(lRadioButton_2_1_1);

		final JPanel panel_9_3_2_1_1 = new JPanel();
		panel_9_3_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_3_2_1_1);

		final JRadioButton eRadioButton_2_1_1 = new JRadioButton();
		bgEating11.add(eRadioButton_2_1_1);
		eRadioButton_2_1_1.setActionCommand("4");
		eRadioButton_2_1_1.setText("E");
		eRadioButton_2_1_1.setBackground(Color.WHITE);
		panel_9_3_2_1_1.add(eRadioButton_2_1_1);

		final JPanel panel_9_4_3_1_1 = new JPanel();
		panel_9_4_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_3_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_4_3_1_1);

		final JRadioButton radioButton_1_2_1_1 = new JRadioButton();
		bgEating11.add(radioButton_1_2_1_1);
		radioButton_1_2_1_1.setActionCommand("5");
		radioButton_1_2_1_1.setText("D");
		radioButton_1_2_1_1.setBackground(Color.WHITE);
		panel_9_4_3_1_1.add(radioButton_1_2_1_1);

		final JPanel panel_9_4_1_2_1_1 = new JPanel();
		panel_9_4_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.add(panel_9_4_1_2_1_1);

		final JRadioButton naRadioButton_2_1_1 = new JRadioButton();
		bgEating11.add(naRadioButton_2_1_1);
		naRadioButton_2_1_1.setActionCommand("6");
		naRadioButton_2_1_1.setText("NA");
		naRadioButton_2_1_1.setBackground(Color.WHITE);
		panel_9_4_1_2_1_1.add(naRadioButton_2_1_1);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.setLayout(null);
		panel_5_1_1_2.setBounds(0, 482, 430, 84);
		panel_5_1_1_2.setBackground(Color.WHITE);
		panel_4.add(panel_5_1_1_2);

		final JLabel bedMobilityLabel_1_1_2 = new JLabel();
		bedMobilityLabel_1_1_2.setText("<html><u>Dressing :</u></html>");
		bedMobilityLabel_1_1_2.setBounds(5, 0, 81, 14);
		bedMobilityLabel_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.add(bedMobilityLabel_1_1_2);

		final JPanel panel_6_1_1_2 = new JPanel();
		panel_6_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 20, 430, 63);
		panel_6_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.add(panel_6_1_1_2);

		final JPanel panel_7_2_1_2 = new JPanel();
		panel_7_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_2.setLayout(null);
		panel_7_2_1_2.setBounds(0, 0, 430, 32);
		panel_7_2_1_2.setBackground(Color.WHITE);
		panel_6_1_1_2.add(panel_7_2_1_2);

		final JPanel panel_8_2_1_2 = new JPanel();
		panel_8_2_1_2.setBackground(Color.WHITE);
		panel_8_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_2.setLayout(null);
		panel_8_2_1_2.setBounds(0, 0, 211, 32);
		panel_7_2_1_2.add(panel_8_2_1_2);

		final JLabel turnsSideToLabel_2_1_2 = new JLabel();
		turnsSideToLabel_2_1_2.setText("Puts on / takes off all clothing");
		turnsSideToLabel_2_1_2.setBounds(10, 10, 175, 14);
		turnsSideToLabel_2_1_2.setBackground(Color.WHITE);
		panel_8_2_1_2.add(turnsSideToLabel_2_1_2);

		final JPanel panel_9_6_1_2 = new JPanel();
		panel_9_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_2.setBounds(210, 0, 36, 32);
		panel_9_6_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_6_1_2);

		final JRadioButton radioButton_3_1_2 = new JRadioButton();
		bgDressing11.add(radioButton_3_1_2);
		radioButton_3_1_2.setActionCommand("1");
		radioButton_3_1_2.setText("I");
		radioButton_3_1_2.setBackground(Color.WHITE);
		panel_9_6_1_2.add(radioButton_3_1_2);

		final JPanel panel_9_1_2_1_2 = new JPanel();
		panel_9_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_2.setBounds(245, 0, 36, 32);
		panel_9_1_2_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_1_2_1_2);

		final JRadioButton sRadioButton_2_1_2 = new JRadioButton();
		bgDressing11.add(sRadioButton_2_1_2);
		sRadioButton_2_1_2.setActionCommand("2");
		sRadioButton_2_1_2.setText("S");
		sRadioButton_2_1_2.setBackground(Color.WHITE);
		panel_9_1_2_1_2.add(sRadioButton_2_1_2);

		final JPanel panel_9_2_2_1_2 = new JPanel();
		panel_9_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_2.setBounds(280, 0, 36, 32);
		panel_9_2_2_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_2_2_1_2);

		final JRadioButton lRadioButton_2_1_2 = new JRadioButton();
		bgDressing11.add(lRadioButton_2_1_2);
		lRadioButton_2_1_2.setActionCommand("3");
		lRadioButton_2_1_2.setText("L");
		lRadioButton_2_1_2.setBackground(Color.WHITE);
		panel_9_2_2_1_2.add(lRadioButton_2_1_2);

		final JPanel panel_9_3_2_1_2 = new JPanel();
		panel_9_3_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_2.setBounds(315, 0, 36, 32);
		panel_9_3_2_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_3_2_1_2);

		final JRadioButton eRadioButton_2_1_2 = new JRadioButton();
		bgDressing11.add(eRadioButton_2_1_2);
		eRadioButton_2_1_2.setActionCommand("4");
		eRadioButton_2_1_2.setText("E");
		eRadioButton_2_1_2.setBackground(Color.WHITE);
		panel_9_3_2_1_2.add(eRadioButton_2_1_2);

		final JPanel panel_9_4_3_1_2 = new JPanel();
		panel_9_4_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_2.setBounds(350, 0, 36, 32);
		panel_9_4_3_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_4_3_1_2);

		final JRadioButton radioButton_1_2_1_2 = new JRadioButton();
		bgDressing11.add(radioButton_1_2_1_2);
		radioButton_1_2_1_2.setActionCommand("5");
		radioButton_1_2_1_2.setText("D");
		radioButton_1_2_1_2.setBackground(Color.WHITE);
		panel_9_4_3_1_2.add(radioButton_1_2_1_2);

		final JPanel panel_9_4_1_2_1_2 = new JPanel();
		panel_9_4_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2_1_2.setBounds(385, 0, 45, 32);
		panel_9_4_1_2_1_2.setBackground(Color.WHITE);
		panel_7_2_1_2.add(panel_9_4_1_2_1_2);

		final JRadioButton naRadioButton_2_1_2 = new JRadioButton();
		bgDressing11.add(naRadioButton_2_1_2);
		naRadioButton_2_1_2.setActionCommand("6");
		naRadioButton_2_1_2.setText("NA");
		naRadioButton_2_1_2.setBackground(Color.WHITE);
		panel_9_4_1_2_1_2.add(naRadioButton_2_1_2);

		final JPanel panel_7_1_2_1_1 = new JPanel();
		panel_7_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1.setLayout(null);
		panel_7_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.setBounds(0, 31, 430, 32);
		panel_6_1_1_2.add(panel_7_1_2_1_1);

		final JPanel panel_8_1_2_1_1 = new JPanel();
		panel_8_1_2_1_1.setBackground(Color.WHITE);
		panel_8_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1.setLayout(null);
		panel_8_1_2_1_1.setBounds(0, 0, 211, 32);
		panel_8_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_8_1_2_1_1);

		final JLabel turnsSideToLabel_1_2_1_1 = new JLabel();
		turnsSideToLabel_1_2_1_1.setText("Apply / remove prosthesis");
		turnsSideToLabel_1_2_1_1.setBounds(10, 10, 156, 14);
		turnsSideToLabel_1_2_1_1.setBackground(Color.WHITE);
		panel_8_1_2_1_1.add(turnsSideToLabel_1_2_1_1);

		final JPanel panel_9_5_2_1_1 = new JPanel();
		panel_9_5_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_1.setBounds(210, 0, 36, 32);
		panel_9_5_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_5_2_1_1);

		final JRadioButton radioButton_2_2_1_1 = new JRadioButton();
		radioButton_2_2_1_1.setActionCommand("1");
		radioButton_2_2_1_1.setText("I");
		radioButton_2_2_1_1.setBackground(Color.WHITE);
		panel_9_5_2_1_1.add(radioButton_2_2_1_1);

		final JPanel panel_9_1_1_2_1_1 = new JPanel();
		panel_9_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_1_1_2_1_1);

		final JRadioButton sRadioButton_1_2_1_1 = new JRadioButton();
		sRadioButton_1_2_1_1.setActionCommand("2");
		sRadioButton_1_2_1_1.setText("S");
		sRadioButton_1_2_1_1.setBackground(Color.WHITE);
		panel_9_1_1_2_1_1.add(sRadioButton_1_2_1_1);

		final JPanel panel_9_2_1_2_1_1 = new JPanel();
		panel_9_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_2_1_2_1_1);

		final JRadioButton lRadioButton_1_2_1_1 = new JRadioButton();
		lRadioButton_1_2_1_1.setActionCommand("3");
		lRadioButton_1_2_1_1.setText("L");
		lRadioButton_1_2_1_1.setBackground(Color.WHITE);
		panel_9_2_1_2_1_1.add(lRadioButton_1_2_1_1);

		final JPanel panel_9_3_1_2_1_1 = new JPanel();
		panel_9_3_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_3_1_2_1_1);

		final JRadioButton eRadioButton_1_2_1_1 = new JRadioButton();
		bgDressing11.add(eRadioButton_1_2_1_1);
		eRadioButton_1_2_1_1.setActionCommand("4");
		eRadioButton_1_2_1_1.setText("E");
		eRadioButton_1_2_1_1.setBackground(Color.WHITE);
		panel_9_3_1_2_1_1.add(eRadioButton_1_2_1_1);

		final JPanel panel_9_4_2_2_1_1 = new JPanel();
		panel_9_4_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_4_2_2_1_1);

		final JRadioButton radioButton_1_1_2_1_1 = new JRadioButton();
		bgDressing11.add(radioButton_1_1_2_1_1);
		radioButton_1_1_2_1_1.setActionCommand("5");
		radioButton_1_1_2_1_1.setText("D");
		radioButton_1_1_2_1_1.setBackground(Color.WHITE);
		panel_9_4_2_2_1_1.add(radioButton_1_1_2_1_1);

		final JPanel panel_9_4_1_1_2_1_1 = new JPanel();
		panel_9_4_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_2_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_2_1_1.setBackground(Color.WHITE);
		panel_7_1_2_1_1.add(panel_9_4_1_1_2_1_1);

		final JRadioButton naRadioButton_1_2_1_1 = new JRadioButton();
		bgDressing11.add(naRadioButton_1_2_1_1);
		naRadioButton_1_2_1_1.setActionCommand("6");
		naRadioButton_1_2_1_1.setText("NA");
		naRadioButton_1_2_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_2_1_1.add(naRadioButton_1_2_1_1);

		final JPanel panel_5_1_1_3 = new JPanel();
		panel_5_1_1_3.setBackground(Color.WHITE);
		panel_5_1_1_3.setLayout(null);
		panel_5_1_1_3.setBounds(0, 568, 430, 147);
		panel_4.add(panel_5_1_1_3);

		final JLabel bedMobilityLabel_1_1_3 = new JLabel();
		bedMobilityLabel_1_1_3
				.setText("<html><u>Ambulation / Locomotion :</u></html>");
		bedMobilityLabel_1_1_3.setBackground(Color.WHITE);
		bedMobilityLabel_1_1_3.setBounds(5, 0, 140, 14);
		panel_5_1_1_3.add(bedMobilityLabel_1_1_3);

		final JPanel panel_6_1_1_3 = new JPanel();
		panel_6_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_3.setLayout(null);
		panel_6_1_1_3.setBackground(Color.WHITE);
		panel_6_1_1_3.setBounds(0, 20, 430, 94);
		panel_5_1_1_3.add(panel_6_1_1_3);

		final JPanel panel_7_2_1_3 = new JPanel();
		panel_7_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_3.setLayout(null);
		panel_7_2_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.setBounds(0, 0, 430, 32);
		panel_6_1_1_3.add(panel_7_2_1_3);

		final JPanel panel_8_2_1_3 = new JPanel();
		panel_8_2_1_3.setBackground(Color.WHITE);
		panel_8_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_3.setLayout(null);
		panel_8_2_1_3.setBounds(0, 0, 211, 32);
		panel_7_2_1_3.add(panel_8_2_1_3);

		final JLabel turnsSideToLabel_2_1_3 = new JLabel();
		turnsSideToLabel_2_1_3.setText("Amblates in room");
		turnsSideToLabel_2_1_3.setBounds(10, 10, 111, 14);
		turnsSideToLabel_2_1_3.setBackground(Color.WHITE);
		panel_8_2_1_3.add(turnsSideToLabel_2_1_3);

		final JPanel panel_9_6_1_3 = new JPanel();
		panel_9_6_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_3.setBounds(210, 0, 36, 32);
		panel_9_6_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_6_1_3);

		final JRadioButton radioButton_3_1_3 = new JRadioButton();
		bgAmbulation11.add(radioButton_3_1_3);
		radioButton_3_1_3.setActionCommand("1");
		radioButton_3_1_3.setText("I");
		radioButton_3_1_3.setBackground(Color.WHITE);
		panel_9_6_1_3.add(radioButton_3_1_3);

		final JPanel panel_9_1_2_1_3 = new JPanel();
		panel_9_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_3.setBounds(245, 0, 36, 32);
		panel_9_1_2_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_1_2_1_3);

		final JRadioButton sRadioButton_2_1_3 = new JRadioButton();
		bgAmbulation11.add(sRadioButton_2_1_3);
		sRadioButton_2_1_3.setActionCommand("2");
		sRadioButton_2_1_3.setText("S");
		sRadioButton_2_1_3.setBackground(Color.WHITE);
		panel_9_1_2_1_3.add(sRadioButton_2_1_3);

		final JPanel panel_9_2_2_1_3 = new JPanel();
		panel_9_2_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_3.setBounds(280, 0, 36, 32);
		panel_9_2_2_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_2_2_1_3);

		final JRadioButton lRadioButton_2_1_3 = new JRadioButton();
		bgAmbulation11.add(lRadioButton_2_1_3);
		lRadioButton_2_1_3.setActionCommand("3");
		lRadioButton_2_1_3.setText("L");
		lRadioButton_2_1_3.setBackground(Color.WHITE);
		panel_9_2_2_1_3.add(lRadioButton_2_1_3);

		final JPanel panel_9_3_2_1_3 = new JPanel();
		panel_9_3_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_3.setBounds(315, 0, 36, 32);
		panel_9_3_2_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_3_2_1_3);

		final JRadioButton eRadioButton_2_1_3 = new JRadioButton();
		bgAmbulation11.add(eRadioButton_2_1_3);
		eRadioButton_2_1_3.setActionCommand("4");
		eRadioButton_2_1_3.setText("E");
		eRadioButton_2_1_3.setBackground(Color.WHITE);
		panel_9_3_2_1_3.add(eRadioButton_2_1_3);

		final JPanel panel_9_4_3_1_3 = new JPanel();
		panel_9_4_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_3.setBounds(350, 0, 36, 32);
		panel_9_4_3_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_4_3_1_3);

		final JRadioButton radioButton_1_2_1_3 = new JRadioButton();
		bgAmbulation11.add(radioButton_1_2_1_3);
		radioButton_1_2_1_3.setActionCommand("5");
		radioButton_1_2_1_3.setText("D");
		radioButton_1_2_1_3.setBackground(Color.WHITE);
		panel_9_4_3_1_3.add(radioButton_1_2_1_3);

		final JPanel panel_9_4_1_2_1_3 = new JPanel();
		panel_9_4_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2_1_3.setBounds(385, 0, 45, 32);
		panel_9_4_1_2_1_3.setBackground(Color.WHITE);
		panel_7_2_1_3.add(panel_9_4_1_2_1_3);

		final JRadioButton naRadioButton_2_1_3 = new JRadioButton();
		bgAmbulation11.add(naRadioButton_2_1_3);
		naRadioButton_2_1_3.setActionCommand("6");
		naRadioButton_2_1_3.setText("NA");
		naRadioButton_2_1_3.setBackground(Color.WHITE);
		panel_9_4_1_2_1_3.add(naRadioButton_2_1_3);

		final JPanel panel_7_1_2_1_2 = new JPanel();
		panel_7_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_2.setLayout(null);
		panel_7_1_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.setBounds(0, 31, 430, 32);
		panel_6_1_1_3.add(panel_7_1_2_1_2);

		final JPanel panel_8_1_2_1_2 = new JPanel();
		panel_8_1_2_1_2.setBackground(Color.WHITE);
		panel_8_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2.setLayout(null);
		panel_8_1_2_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_2.add(panel_8_1_2_1_2);

		final JLabel turnsSideToLabel_1_2_1_2 = new JLabel();
		turnsSideToLabel_1_2_1_2.setText("Ambulates in hallway");
		turnsSideToLabel_1_2_1_2.setBounds(10, 10, 111, 14);
		turnsSideToLabel_1_2_1_2.setBackground(Color.WHITE);
		panel_8_1_2_1_2.add(turnsSideToLabel_1_2_1_2);

		final JPanel panel_9_5_2_1_2 = new JPanel();
		panel_9_5_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_2.setBounds(210, 0, 36, 32);
		panel_9_5_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.add(panel_9_5_2_1_2);

		final JRadioButton radioButton_2_2_1_2 = new JRadioButton();
		bgAmbulation12.add(radioButton_2_2_1_2);
		radioButton_2_2_1_2.setActionCommand("1");
		radioButton_2_2_1_2.setText("I");
		radioButton_2_2_1_2.setBackground(Color.WHITE);
		panel_9_5_2_1_2.add(radioButton_2_2_1_2);

		final JPanel panel_9_1_1_2_1_2 = new JPanel();
		panel_9_1_1_2_1_2.setBackground(Color.WHITE);
		panel_9_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_2_1_2.add(panel_9_1_1_2_1_2);

		final JRadioButton sRadioButton_1_2_1_2 = new JRadioButton();
		bgAmbulation12.add(sRadioButton_1_2_1_2);
		sRadioButton_1_2_1_2.setActionCommand("2");
		sRadioButton_1_2_1_2.setText("S");
		sRadioButton_1_2_1_2.setBackground(Color.WHITE);
		panel_9_1_1_2_1_2.add(sRadioButton_1_2_1_2);

		final JPanel panel_9_2_1_2_1_2 = new JPanel();
		panel_9_2_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_2.setBounds(280, 0, 36, 32);
		panel_9_2_1_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.add(panel_9_2_1_2_1_2);

		final JRadioButton lRadioButton_1_2_1_2 = new JRadioButton();
		bgAmbulation12.add(lRadioButton_1_2_1_2);
		lRadioButton_1_2_1_2.setActionCommand("3");
		lRadioButton_1_2_1_2.setText("L");
		lRadioButton_1_2_1_2.setBackground(Color.WHITE);
		panel_9_2_1_2_1_2.add(lRadioButton_1_2_1_2);

		final JPanel panel_9_3_1_2_1_2 = new JPanel();
		panel_9_3_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_2.setBounds(315, 0, 36, 32);
		panel_9_3_1_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.add(panel_9_3_1_2_1_2);

		final JRadioButton eRadioButton_1_2_1_2 = new JRadioButton();
		bgAmbulation12.add(eRadioButton_1_2_1_2);
		eRadioButton_1_2_1_2.setActionCommand("4");
		eRadioButton_1_2_1_2.setText("E");
		eRadioButton_1_2_1_2.setBackground(Color.WHITE);
		panel_9_3_1_2_1_2.add(eRadioButton_1_2_1_2);

		final JPanel panel_9_4_2_2_1_2 = new JPanel();
		panel_9_4_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_2.setBounds(350, 0, 36, 32);
		panel_9_4_2_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.add(panel_9_4_2_2_1_2);

		final JRadioButton radioButton_1_1_2_1_2 = new JRadioButton();
		bgAmbulation12.add(radioButton_1_1_2_1_2);
		radioButton_1_1_2_1_2.setActionCommand("5");
		radioButton_1_1_2_1_2.setText("D");
		radioButton_1_1_2_1_2.setBackground(Color.WHITE);
		panel_9_4_2_2_1_2.add(radioButton_1_1_2_1_2);

		final JPanel panel_9_4_1_1_2_1_2 = new JPanel();
		panel_9_4_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_2_1_2.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_2_1_2.setBackground(Color.WHITE);
		panel_7_1_2_1_2.add(panel_9_4_1_1_2_1_2);

		final JRadioButton naRadioButton_1_2_1_2 = new JRadioButton();
		bgAmbulation12.add(naRadioButton_1_2_1_2);
		naRadioButton_1_2_1_2.setActionCommand("6");
		naRadioButton_1_2_1_2.setText("NA");
		naRadioButton_1_2_1_2.setBackground(Color.WHITE);
		panel_9_4_1_1_2_1_2.add(naRadioButton_1_2_1_2);

		final JPanel panel_7_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.setBounds(0, 62, 430, 32);
		panel_6_1_1_3.add(panel_7_1_1_1_1_2);

		final JPanel panel_8_1_1_1_1_2 = new JPanel();
		panel_8_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_2.setLayout(null);
		panel_8_1_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_2.add(panel_8_1_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_1_2.setText("W/ C mobility in room");
		turnsSideToLabel_1_1_1_1_2.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_2.add(turnsSideToLabel_1_1_1_1_2);

		final JPanel panel_9_5_1_1_1_2 = new JPanel();
		panel_9_5_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_2.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_5_1_1_1_2);

		final JRadioButton radioButton_2_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(radioButton_2_1_1_1_2);
		radioButton_2_1_1_1_2.setActionCommand("1");
		radioButton_2_1_1_1_2.setText("I");
		radioButton_2_1_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_1_2.add(radioButton_2_1_1_1_2);

		final JPanel panel_9_1_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_1_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(sRadioButton_1_1_1_1_2);
		sRadioButton_1_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_1_2.setText("S");
		sRadioButton_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_2.add(sRadioButton_1_1_1_1_2);

		final JPanel panel_9_2_1_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_2_1_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(lRadioButton_1_1_1_1_2);
		lRadioButton_1_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_1_2.setText("L");
		lRadioButton_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_2.add(lRadioButton_1_1_1_1_2);

		final JPanel panel_9_3_1_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_3_1_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(eRadioButton_1_1_1_1_2);
		eRadioButton_1_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_1_2.setText("E");
		eRadioButton_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_2.add(eRadioButton_1_1_1_1_2);

		final JPanel panel_9_4_2_1_1_1_2 = new JPanel();
		panel_9_4_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_2.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_4_2_1_1_1_2);

		final JRadioButton radioButton_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(radioButton_1_1_1_1_1_2);
		radioButton_1_1_1_1_1_2.setActionCommand("5");
		radioButton_1_1_1_1_1_2.setText("D");
		radioButton_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_2.add(radioButton_1_1_1_1_1_2);

		final JPanel panel_9_4_1_1_1_1_1_2 = new JPanel();
		panel_9_4_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_2.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_2.add(panel_9_4_1_1_1_1_1_2);

		final JRadioButton naRadioButton_1_1_1_1_2 = new JRadioButton();
		bgAmbulation13.add(naRadioButton_1_1_1_1_2);
		naRadioButton_1_1_1_1_2.setActionCommand("6");
		naRadioButton_1_1_1_1_2.setText("NA");
		naRadioButton_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_2.add(naRadioButton_1_1_1_1_2);

		final JPanel panel_7_1_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.setBounds(0, 113, 430, 32);
		panel_5_1_1_3.add(panel_7_1_1_1_1_1_2);

		final JPanel panel_8_1_1_1_1_1_2 = new JPanel();
		panel_8_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_2.setLayout(null);
		panel_8_1_1_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_2.setText("W/ C mobility in hallway");
		turnsSideToLabel_1_1_1_1_1_2.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_2.add(turnsSideToLabel_1_1_1_1_1_2);

		final JPanel panel_9_5_1_1_1_1_2 = new JPanel();
		panel_9_5_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_2.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_5_1_1_1_1_2);

		final JRadioButton radioButton_2_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(radioButton_2_1_1_1_1_2);
		radioButton_2_1_1_1_1_2.setActionCommand("1");
		radioButton_2_1_1_1_1_2.setText("I");
		radioButton_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_2.add(radioButton_2_1_1_1_1_2);

		final JPanel panel_9_1_1_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(sRadioButton_1_1_1_1_1_2);
		sRadioButton_1_1_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_1_1_2.setText("S");
		sRadioButton_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_2.add(sRadioButton_1_1_1_1_1_2);

		final JPanel panel_9_2_1_1_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_2_1_1_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(lRadioButton_1_1_1_1_1_2);
		lRadioButton_1_1_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_1_1_2.setText("L");
		lRadioButton_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_2.add(lRadioButton_1_1_1_1_1_2);

		final JPanel panel_9_3_1_1_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_3_1_1_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(eRadioButton_1_1_1_1_1_2);
		eRadioButton_1_1_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_1_1_2.setText("E");
		eRadioButton_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_2.add(eRadioButton_1_1_1_1_1_2);

		final JPanel panel_9_4_2_1_1_1_1_2 = new JPanel();
		panel_9_4_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_2.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_4_2_1_1_1_1_2);

		final JRadioButton radioButton_1_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(radioButton_1_1_1_1_1_1_2);
		radioButton_1_1_1_1_1_1_2.setActionCommand("5");
		radioButton_1_1_1_1_1_1_2.setText("D");
		radioButton_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_2.add(radioButton_1_1_1_1_1_1_2);

		final JPanel panel_9_4_1_1_1_1_1_1_2 = new JPanel();
		panel_9_4_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_1_2.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_2.add(panel_9_4_1_1_1_1_1_1_2);

		final JRadioButton naRadioButton_1_1_1_1_1_2 = new JRadioButton();
		bgAmbulation14.add(naRadioButton_1_1_1_1_1_2);
		naRadioButton_1_1_1_1_1_2.setActionCommand("6");
		naRadioButton_1_1_1_1_1_2.setText("NA");
		naRadioButton_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_2.add(naRadioButton_1_1_1_1_1_2);

		final JPanel panel_5_1_1_4 = new JPanel();
		panel_5_1_1_4.setBackground(Color.WHITE);
		panel_5_1_1_4.setLayout(null);
		panel_5_1_1_4.setBounds(0, 716, 430, 177);
		panel_4.add(panel_5_1_1_4);

		final JLabel bedMobilityLabel_1_1_4 = new JLabel();
		bedMobilityLabel_1_1_4.setText("<html><u>Grooming :</u></html>");
		bedMobilityLabel_1_1_4.setBounds(5, 0, 81, 14);
		bedMobilityLabel_1_1_4.setBackground(Color.WHITE);
		panel_5_1_1_4.add(bedMobilityLabel_1_1_4);

		final JPanel panel_6_1_1_4 = new JPanel();
		panel_6_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_4.setLayout(null);
		panel_6_1_1_4.setBackground(Color.WHITE);
		panel_6_1_1_4.setBounds(0, 20, 430, 94);
		panel_5_1_1_4.add(panel_6_1_1_4);

		final JPanel panel_7_2_1_4 = new JPanel();
		panel_7_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_4.setLayout(null);
		panel_7_2_1_4.setBounds(0, 0, 430, 32);
		panel_7_2_1_4.setBackground(Color.WHITE);
		panel_6_1_1_4.add(panel_7_2_1_4);

		final JPanel panel_8_2_1_4 = new JPanel();
		panel_8_2_1_4.setBackground(Color.WHITE);
		panel_8_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_4.setLayout(null);
		panel_8_2_1_4.setBounds(0, 0, 211, 32);
		panel_7_2_1_4.add(panel_8_2_1_4);

		final JLabel turnsSideToLabel_2_1_4 = new JLabel();
		turnsSideToLabel_2_1_4.setText("Combs hair");
		turnsSideToLabel_2_1_4.setBounds(10, 10, 111, 14);
		turnsSideToLabel_2_1_4.setBackground(Color.WHITE);
		panel_8_2_1_4.add(turnsSideToLabel_2_1_4);

		final JPanel panel_9_6_1_4 = new JPanel();
		panel_9_6_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_4.setBounds(210, 0, 36, 32);
		panel_9_6_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_6_1_4);

		final JRadioButton radioButton_3_1_4 = new JRadioButton();
		bgGrooming11.add(radioButton_3_1_4);
		radioButton_3_1_4.setActionCommand("1");
		radioButton_3_1_4.setText("I");
		radioButton_3_1_4.setBackground(Color.WHITE);
		panel_9_6_1_4.add(radioButton_3_1_4);

		final JPanel panel_9_1_2_1_4 = new JPanel();
		panel_9_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_4.setBounds(245, 0, 36, 32);
		panel_9_1_2_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_1_2_1_4);

		final JRadioButton sRadioButton_2_1_4 = new JRadioButton();
		bgGrooming11.add(sRadioButton_2_1_4);
		sRadioButton_2_1_4.setActionCommand("2");
		sRadioButton_2_1_4.setText("S");
		sRadioButton_2_1_4.setBackground(Color.WHITE);
		panel_9_1_2_1_4.add(sRadioButton_2_1_4);

		final JPanel panel_9_2_2_1_4 = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_9_2_2_1_4.setLayout(flowLayout);
		panel_9_2_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_4.setBounds(280, 0, 36, 32);
		panel_9_2_2_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_2_2_1_4);

		final JRadioButton lRadioButton_2_1_4 = new JRadioButton();
		bgGrooming11.add(lRadioButton_2_1_4);
		lRadioButton_2_1_4.setActionCommand("3");
		lRadioButton_2_1_4.setMargin(new Insets(2, 0, 2, 2));
		lRadioButton_2_1_4.setText("L");
		lRadioButton_2_1_4.setBackground(Color.WHITE);
		panel_9_2_2_1_4.add(lRadioButton_2_1_4);

		final JPanel panel_9_3_2_1_4 = new JPanel();
		panel_9_3_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_4.setBounds(315, 0, 36, 32);
		panel_9_3_2_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_3_2_1_4);

		final JRadioButton eRadioButton_2_1_4 = new JRadioButton();
		bgGrooming11.add(eRadioButton_2_1_4);
		eRadioButton_2_1_4.setActionCommand("4");
		eRadioButton_2_1_4.setText("E");
		eRadioButton_2_1_4.setBackground(Color.WHITE);
		panel_9_3_2_1_4.add(eRadioButton_2_1_4);

		final JPanel panel_9_4_3_1_4 = new JPanel();
		panel_9_4_3_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_4.setBounds(350, 0, 36, 32);
		panel_9_4_3_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_4_3_1_4);

		final JRadioButton radioButton_1_2_1_4 = new JRadioButton();
		bgGrooming11.add(radioButton_1_2_1_4);
		radioButton_1_2_1_4.setActionCommand("5");
		radioButton_1_2_1_4.setText("D");
		radioButton_1_2_1_4.setBackground(Color.WHITE);
		panel_9_4_3_1_4.add(radioButton_1_2_1_4);

		final JPanel panel_9_4_1_2_1_4 = new JPanel();
		panel_9_4_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_2_1_4.setBounds(385, 0, 45, 32);
		panel_9_4_1_2_1_4.setBackground(Color.WHITE);
		panel_7_2_1_4.add(panel_9_4_1_2_1_4);

		final JRadioButton naRadioButton_2_1_4 = new JRadioButton();
		bgGrooming11.add(naRadioButton_2_1_4);
		naRadioButton_2_1_4.setActionCommand("6");
		naRadioButton_2_1_4.setText("NA");
		naRadioButton_2_1_4.setBackground(Color.WHITE);
		panel_9_4_1_2_1_4.add(naRadioButton_2_1_4);

		final JPanel panel_7_1_2_1_3 = new JPanel();
		panel_7_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_3.setLayout(null);
		panel_7_1_2_1_3.setBounds(0, 31, 430, 32);
		panel_7_1_2_1_3.setBackground(Color.WHITE);
		panel_6_1_1_4.add(panel_7_1_2_1_3);

		final JPanel panel_8_1_2_1_3 = new JPanel();
		panel_8_1_2_1_3.setBackground(Color.WHITE);
		panel_8_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_3.setLayout(null);
		panel_8_1_2_1_3.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_3.add(panel_8_1_2_1_3);

		final JLabel turnsSideToLabel_1_2_1_3 = new JLabel();
		turnsSideToLabel_1_2_1_3.setText("Brushes teeth / dentures");
		turnsSideToLabel_1_2_1_3.setBounds(10, 10, 163, 14);
		turnsSideToLabel_1_2_1_3.setBackground(Color.WHITE);
		panel_8_1_2_1_3.add(turnsSideToLabel_1_2_1_3);

		final JPanel panel_9_5_2_1_3 = new JPanel();
		panel_9_5_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_3.setBounds(210, 0, 36, 32);
		panel_9_5_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_5_2_1_3);

		final JRadioButton radioButton_2_2_1_3 = new JRadioButton();
		bgGrooming12.add(radioButton_2_2_1_3);
		radioButton_2_2_1_3.setActionCommand("1");
		radioButton_2_2_1_3.setText("I");
		radioButton_2_2_1_3.setBackground(Color.WHITE);
		panel_9_5_2_1_3.add(radioButton_2_2_1_3);

		final JPanel panel_9_1_1_2_1_3 = new JPanel();
		panel_9_1_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_3.setBounds(245, 0, 36, 32);
		panel_9_1_1_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_1_1_2_1_3);

		final JRadioButton sRadioButton_1_2_1_3 = new JRadioButton();
		bgGrooming12.add(sRadioButton_1_2_1_3);
		sRadioButton_1_2_1_3.setActionCommand("2");
		sRadioButton_1_2_1_3.setText("S");
		sRadioButton_1_2_1_3.setBackground(Color.WHITE);
		panel_9_1_1_2_1_3.add(sRadioButton_1_2_1_3);

		final JPanel panel_9_2_1_2_1_3 = new JPanel();
		panel_9_2_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_3.setBounds(280, 0, 36, 32);
		panel_9_2_1_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_2_1_2_1_3);

		final JRadioButton lRadioButton_1_2_1_3 = new JRadioButton();
		bgGrooming12.add(lRadioButton_1_2_1_3);
		lRadioButton_1_2_1_3.setActionCommand("3");
		lRadioButton_1_2_1_3.setText("L");
		lRadioButton_1_2_1_3.setBackground(Color.WHITE);
		panel_9_2_1_2_1_3.add(lRadioButton_1_2_1_3);

		final JPanel panel_9_3_1_2_1_3 = new JPanel();
		panel_9_3_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_3.setBounds(315, 0, 36, 32);
		panel_9_3_1_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_3_1_2_1_3);

		final JRadioButton eRadioButton_1_2_1_3 = new JRadioButton();
		bgGrooming12.add(eRadioButton_1_2_1_3);
		eRadioButton_1_2_1_3.setActionCommand("4");
		eRadioButton_1_2_1_3.setText("E");
		eRadioButton_1_2_1_3.setBackground(Color.WHITE);
		panel_9_3_1_2_1_3.add(eRadioButton_1_2_1_3);

		final JPanel panel_9_4_2_2_1_3 = new JPanel();
		panel_9_4_2_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_3.setBounds(350, 0, 36, 32);
		panel_9_4_2_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_4_2_2_1_3);

		final JRadioButton radioButton_1_1_2_1_3 = new JRadioButton();
		bgGrooming12.add(radioButton_1_1_2_1_3);
		radioButton_1_1_2_1_3.setActionCommand("5");
		radioButton_1_1_2_1_3.setText("D");
		radioButton_1_1_2_1_3.setBackground(Color.WHITE);
		panel_9_4_2_2_1_3.add(radioButton_1_1_2_1_3);

		final JPanel panel_9_4_1_1_2_1_3 = new JPanel();
		panel_9_4_1_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_2_1_3.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_2_1_3.setBackground(Color.WHITE);
		panel_7_1_2_1_3.add(panel_9_4_1_1_2_1_3);

		final JRadioButton naRadioButton_1_2_1_3 = new JRadioButton();
		bgGrooming12.add(naRadioButton_1_2_1_3);
		naRadioButton_1_2_1_3.setActionCommand("6");
		naRadioButton_1_2_1_3.setText("NA");
		naRadioButton_1_2_1_3.setBackground(Color.WHITE);
		panel_9_4_1_1_2_1_3.add(naRadioButton_1_2_1_3);

		final JPanel panel_7_1_1_1_1_3 = new JPanel();
		panel_7_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_3.setLayout(null);
		panel_7_1_1_1_1_3.setBounds(0, 62, 430, 32);
		panel_7_1_1_1_1_3.setBackground(Color.WHITE);
		panel_6_1_1_4.add(panel_7_1_1_1_1_3);

		final JPanel panel_8_1_1_1_1_3 = new JPanel();
		panel_8_1_1_1_1_3.setBackground(Color.WHITE);
		panel_8_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_3.setLayout(null);
		panel_8_1_1_1_1_3.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_3.add(panel_8_1_1_1_1_3);

		final JLabel turnsSideToLabel_1_1_1_1_3 = new JLabel();
		turnsSideToLabel_1_1_1_1_3.setText("Shaves");
		turnsSideToLabel_1_1_1_1_3.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_3.setBackground(Color.WHITE);
		panel_8_1_1_1_1_3.add(turnsSideToLabel_1_1_1_1_3);

		final JPanel panel_9_5_1_1_1_3 = new JPanel();
		panel_9_5_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_3.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_5_1_1_1_3);

		final JRadioButton radioButton_2_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(radioButton_2_1_1_1_3);
		radioButton_2_1_1_1_3.setActionCommand("1");
		radioButton_2_1_1_1_3.setText("I");
		radioButton_2_1_1_1_3.setBackground(Color.WHITE);
		panel_9_5_1_1_1_3.add(radioButton_2_1_1_1_3);

		final JPanel panel_9_1_1_1_1_1_3 = new JPanel();
		panel_9_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_3.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_1_1_1_1_1_3);

		final JRadioButton sRadioButton_1_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(sRadioButton_1_1_1_1_3);
		sRadioButton_1_1_1_1_3.setActionCommand("2");
		sRadioButton_1_1_1_1_3.setText("S");
		sRadioButton_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_3.add(sRadioButton_1_1_1_1_3);

		final JPanel panel_9_2_1_1_1_1_3 = new JPanel();
		panel_9_2_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_3.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_2_1_1_1_1_3);

		final JRadioButton lRadioButton_1_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(lRadioButton_1_1_1_1_3);
		lRadioButton_1_1_1_1_3.setActionCommand("3");
		lRadioButton_1_1_1_1_3.setText("L");
		lRadioButton_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_3.add(lRadioButton_1_1_1_1_3);

		final JPanel panel_9_3_1_1_1_1_3 = new JPanel();
		panel_9_3_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_3.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_3_1_1_1_1_3);

		final JRadioButton eRadioButton_1_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(eRadioButton_1_1_1_1_3);
		eRadioButton_1_1_1_1_3.setActionCommand("4");
		eRadioButton_1_1_1_1_3.setText("E");
		eRadioButton_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_3.add(eRadioButton_1_1_1_1_3);

		final JPanel panel_9_4_2_1_1_1_3 = new JPanel();
		panel_9_4_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_3.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_4_2_1_1_1_3);

		final JRadioButton radioButton_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(radioButton_1_1_1_1_1_3);
		radioButton_1_1_1_1_1_3.setActionCommand("5");
		radioButton_1_1_1_1_1_3.setText("D");
		radioButton_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_3.add(radioButton_1_1_1_1_1_3);

		final JPanel panel_9_4_1_1_1_1_1_3 = new JPanel();
		panel_9_4_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_3.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_3.add(panel_9_4_1_1_1_1_1_3);

		final JRadioButton naRadioButton_1_1_1_1_3 = new JRadioButton();
		bgGrooming13.add(naRadioButton_1_1_1_1_3);
		naRadioButton_1_1_1_1_3.setActionCommand("6");
		naRadioButton_1_1_1_1_3.setText("NA");
		naRadioButton_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_3.add(naRadioButton_1_1_1_1_3);

		final JPanel panel_7_1_1_1_1_1_3 = new JPanel();
		panel_7_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_3.setLayout(null);
		panel_7_1_1_1_1_1_3.setBounds(0, 113, 430, 32);
		panel_7_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_5_1_1_4.add(panel_7_1_1_1_1_1_3);

		final JPanel panel_8_1_1_1_1_1_3 = new JPanel();
		panel_8_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_3.setLayout(null);
		panel_8_1_1_1_1_1_3.setBounds(0, 0, 211, 32);
		panel_8_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_8_1_1_1_1_1_3);

		final JLabel turnsSideToLabel_1_1_1_1_1_3 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_3.setText("Applies Make up");
		turnsSideToLabel_1_1_1_1_1_3.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_3.add(turnsSideToLabel_1_1_1_1_1_3);

		final JPanel panel_9_5_1_1_1_1_3 = new JPanel();
		panel_9_5_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_3.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_5_1_1_1_1_3);

		final JRadioButton radioButton_2_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(radioButton_2_1_1_1_1_3);
		radioButton_2_1_1_1_1_3.setActionCommand("1");
		radioButton_2_1_1_1_1_3.setText("I");
		radioButton_2_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_3.add(radioButton_2_1_1_1_1_3);

		final JPanel panel_9_1_1_1_1_1_1_3 = new JPanel();
		panel_9_1_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_3.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_1_1_1_1_1_1_3);

		final JRadioButton sRadioButton_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(sRadioButton_1_1_1_1_1_3);
		sRadioButton_1_1_1_1_1_3.setActionCommand("2");
		sRadioButton_1_1_1_1_1_3.setText("S");
		sRadioButton_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_3.add(sRadioButton_1_1_1_1_1_3);

		final JPanel panel_9_2_1_1_1_1_1_3 = new JPanel();
		panel_9_2_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_3.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_2_1_1_1_1_1_3);

		final JRadioButton lRadioButton_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(lRadioButton_1_1_1_1_1_3);
		lRadioButton_1_1_1_1_1_3.setActionCommand("3");
		lRadioButton_1_1_1_1_1_3.setText("L");
		lRadioButton_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_3.add(lRadioButton_1_1_1_1_1_3);

		final JPanel panel_9_3_1_1_1_1_1_3 = new JPanel();
		panel_9_3_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_3.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_3_1_1_1_1_1_3);

		final JRadioButton eRadioButton_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(eRadioButton_1_1_1_1_1_3);
		eRadioButton_1_1_1_1_1_3.setActionCommand("4");
		eRadioButton_1_1_1_1_1_3.setText("E");
		eRadioButton_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_3.add(eRadioButton_1_1_1_1_1_3);

		final JPanel panel_9_4_2_1_1_1_1_3 = new JPanel();
		panel_9_4_2_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_3.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_4_2_1_1_1_1_3);

		final JRadioButton radioButton_1_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(radioButton_1_1_1_1_1_1_3);
		radioButton_1_1_1_1_1_1_3.setActionCommand("5");
		radioButton_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		radioButton_1_1_1_1_1_1_3.setText("D");
		panel_9_4_2_1_1_1_1_3.add(radioButton_1_1_1_1_1_1_3);

		final JPanel panel_9_4_1_1_1_1_1_1_3 = new JPanel();
		panel_9_4_1_1_1_1_1_1_3
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1_1_1_1_1_3.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_3.add(panel_9_4_1_1_1_1_1_1_3);

		final JRadioButton naRadioButton_1_1_1_1_1_3 = new JRadioButton();
		bgGrooming14.add(naRadioButton_1_1_1_1_1_3);
		naRadioButton_1_1_1_1_1_3.setActionCommand("6");
		naRadioButton_1_1_1_1_1_3.setText("NA");
		naRadioButton_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_3.add(naRadioButton_1_1_1_1_1_3);

		final JPanel panel_7_1_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.setBounds(0, 144, 430, 32);
		panel_5_1_1_4.add(panel_7_1_1_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1.setText("Wash / dry face");
		turnsSideToLabel_1_1_1_1_1_1_1.setBounds(10, 10, 175, 14);
		turnsSideToLabel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_9_5_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_5_1_1_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(radioButton_2_1_1_1_1_1_1);
		radioButton_2_1_1_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1.setText("I");
		radioButton_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1.add(radioButton_2_1_1_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(sRadioButton_1_1_1_1_1_1_1);
		sRadioButton_1_1_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1.setText("S");
		sRadioButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_2_1_1_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(lRadioButton_1_1_1_1_1_1_1);
		lRadioButton_1_1_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1.setText("L");
		lRadioButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1.add(lRadioButton_1_1_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_3_1_1_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(eRadioButton_1_1_1_1_1_1_1);
		eRadioButton_1_1_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1.setText("E");
		eRadioButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1.add(eRadioButton_1_1_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_4_2_1_1_1_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(radioButton_1_1_1_1_1_1_1_1);
		radioButton_1_1_1_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1_1_1_1.setText("D");
		radioButton_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1.add(radioButton_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_1_1_1_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1.add(panel_9_4_1_1_1_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming15.add(naRadioButton_1_1_1_1_1_1_1);
		naRadioButton_1_1_1_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1_1_1_1.setText("NA");
		naRadioButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_1_1.add(naRadioButton_1_1_1_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1_1_1.setBounds(0, 922, 430, 32);
		panel_7_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_4.add(panel_7_1_1_1_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1_1.setText("Wash / dry perineum");
		turnsSideToLabel_1_1_1_1_1_1_1_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_5_1_1_1_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(radioButton_2_1_1_1_1_1_1_1);
		radioButton_2_1_1_1_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1_1.setText("I");
		radioButton_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_1.add(radioButton_2_1_1_1_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_9_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(sRadioButton_1_1_1_1_1_1_1_1);
		sRadioButton_1_1_1_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1_1.setText("S");
		sRadioButton_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_1_1_1_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_9_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_2_1_1_1_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(lRadioButton_1_1_1_1_1_1_1_1);
		lRadioButton_1_1_1_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1_1.setText("L");
		lRadioButton_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1_1.add(lRadioButton_1_1_1_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_3_1_1_1_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_9_3_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_3_1_1_1_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(eRadioButton_1_1_1_1_1_1_1_1);
		eRadioButton_1_1_1_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1_1.setText("E");
		eRadioButton_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1_1.add(eRadioButton_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_2_1_1_1_1_1_1_1.setBounds(350, 0, 36, 32);
		panel_9_4_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_4_2_1_1_1_1_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(radioButton_1_1_1_1_1_1_1_1_1);
		radioButton_1_1_1_1_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1_1_1_1_1.setText("D");
		radioButton_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1_1.add(radioButton_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_1_1_1_1_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_9_4_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1_1_1.add(panel_9_4_1_1_1_1_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming17.add(naRadioButton_1_1_1_1_1_1_1_1);
		naRadioButton_1_1_1_1_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1_1_1_1_1.setText("NA");
		naRadioButton_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_1_1_1.add(naRadioButton_1_1_1_1_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1_1_1_1.setBounds(0, 891, 430, 32);
		panel_4.add(panel_7_1_1_1_1_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1_1_1.setText("Wash / dry hands");
		turnsSideToLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_5_1_1_1_1_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_5_1_1_1_1_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(radioButton_2_1_1_1_1_1_1_1_1);
		radioButton_2_1_1_1_1_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_1_1_1_1.setText("I");
		panel_9_5_1_1_1_1_1_1_1_1.add(radioButton_2_1_1_1_1_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(sRadioButton_1_1_1_1_1_1_1_1_1);
		sRadioButton_1_1_1_1_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_1_1_1_1.setText("S");
		panel_9_1_1_1_1_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_1_1_1_1_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_2_1_1_1_1_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(lRadioButton_1_1_1_1_1_1_1_1_1);
		lRadioButton_1_1_1_1_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_1_1_1_1.setText("L");
		panel_9_2_1_1_1_1_1_1_1_1_1.add(lRadioButton_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_3_1_1_1_1_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_3_1_1_1_1_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(eRadioButton_1_1_1_1_1_1_1_1_1);
		eRadioButton_1_1_1_1_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_1_1_1_1.setText("E");
		panel_9_3_1_1_1_1_1_1_1_1_1.add(eRadioButton_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_2_1_1_1_1_1_1_1_1.setBounds(350, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_4_2_1_1_1_1_1_1_1_1);

		final JRadioButton radioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(radioButton_1_1_1_1_1_1_1_1_1_1);
		radioButton_1_1_1_1_1_1_1_1_1_1.setActionCommand("5");
		radioButton_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		radioButton_1_1_1_1_1_1_1_1_1_1.setText("D");
		panel_9_4_2_1_1_1_1_1_1_1_1.add(radioButton_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_1_1_1_1_1_1_1_1_1_1.setBounds(385, 0, 45, 32);
		panel_7_1_1_1_1_1_1_1_1_1.add(panel_9_4_1_1_1_1_1_1_1_1_1_1);

		final JRadioButton naRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bgGrooming16.add(naRadioButton_1_1_1_1_1_1_1_1_1);
		naRadioButton_1_1_1_1_1_1_1_1_1.setActionCommand("6");
		naRadioButton_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		naRadioButton_1_1_1_1_1_1_1_1_1.setText("NA");
		panel_9_4_1_1_1_1_1_1_1_1_1_1.add(naRadioButton_1_1_1_1_1_1_1_1_1);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(453, 197, 437, 956);
		panel.add(panel_4_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(0, 0, 430, 115);
		panel_4_1.add(panel_5_2);

		final JLabel bedMobilityLabel_2 = new JLabel();
		bedMobilityLabel_2.setText("<html><u>Bed Mobility :</u></html>");
		bedMobilityLabel_2.setBounds(5, 0, 81, 14);
		panel_5_2.add(bedMobilityLabel_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 20, 430, 94);
		panel_5_2.add(panel_6_2);

		final JPanel panel_7_3 = new JPanel();
		panel_7_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3.setLayout(null);
		panel_7_3.setBounds(0, 0, 430, 32);
		panel_6_2.add(panel_7_3);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setBackground(Color.WHITE);
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(0, 0, 211, 32);
		panel_7_3.add(panel_8_3);

		final JLabel turnsSideToLabel_3 = new JLabel();
		turnsSideToLabel_3.setText("Turns side to side");
		turnsSideToLabel_3.setBounds(10, 10, 111, 14);
		panel_8_3.add(turnsSideToLabel_3);

		final JPanel panel_9_7 = new JPanel();
		panel_9_7.setBackground(Color.WHITE);
		panel_9_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_7.setBounds(210, 0, 36, 32);
		panel_7_3.add(panel_9_7);

		final JRadioButton radioButton_4 = new JRadioButton();
		bgBed21.add(radioButton_4);
		radioButton_4.setActionCommand("1");
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setText("O");
		panel_9_7.add(radioButton_4);

		final JPanel panel_9_1_3 = new JPanel();
		panel_9_1_3.setBackground(Color.WHITE);
		panel_9_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_3.setBounds(245, 0, 36, 32);
		panel_7_3.add(panel_9_1_3);

		final JRadioButton sRadioButton_3 = new JRadioButton();
		bgBed21.add(sRadioButton_3);
		sRadioButton_3.setActionCommand("2");
		sRadioButton_3.setBackground(Color.WHITE);
		sRadioButton_3.setText("S");
		panel_9_1_3.add(sRadioButton_3);

		final JPanel panel_9_2_3 = new JPanel();
		panel_9_2_3.setBackground(Color.WHITE);
		panel_9_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_3.setBounds(280, 0, 36, 32);
		panel_7_3.add(panel_9_2_3);

		final JRadioButton lRadioButton_3 = new JRadioButton();
		bgBed21.add(lRadioButton_3);
		lRadioButton_3.setActionCommand("3");
		lRadioButton_3.setBackground(Color.WHITE);
		lRadioButton_3.setText("1");
		panel_9_2_3.add(lRadioButton_3);

		final JPanel panel_9_3_3 = new JPanel();
		panel_9_3_3.setBackground(Color.WHITE);
		panel_9_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_3.setBounds(315, 0, 36, 32);
		panel_7_3.add(panel_9_3_3);

		final JRadioButton eRadioButton_3 = new JRadioButton();
		bgBed21.add(eRadioButton_3);
		eRadioButton_3.setActionCommand("4");
		eRadioButton_3.setBackground(Color.WHITE);
		eRadioButton_3.setText("2");
		panel_9_3_3.add(eRadioButton_3);

		final JPanel panel_9_4_4 = new JPanel();
		panel_9_4_4.setBackground(Color.WHITE);
		panel_9_4_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_4.setBounds(350, 0, 80, 32);
		panel_7_3.add(panel_9_4_4);

		final JRadioButton naRadioButton_3 = new JRadioButton();
		bgBed21.add(naRadioButton_3);
		naRadioButton_3.setActionCommand("5");
		naRadioButton_3.setBackground(Color.WHITE);
		naRadioButton_3.setText("NA");
		panel_9_4_4.add(naRadioButton_3);

		final JPanel panel_7_1_3 = new JPanel();
		panel_7_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBounds(0, 31, 430, 32);
		panel_6_2.add(panel_7_1_3);

		final JPanel panel_8_1_3 = new JPanel();
		panel_8_1_3.setBackground(Color.WHITE);
		panel_8_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_3.setLayout(null);
		panel_8_1_3.setBounds(0, 0, 211, 32);
		panel_7_1_3.add(panel_8_1_3);

		final JLabel turnsSideToLabel_1_3 = new JLabel();
		turnsSideToLabel_1_3.setText("Moves up in bed");
		turnsSideToLabel_1_3.setBounds(10, 10, 111, 14);
		panel_8_1_3.add(turnsSideToLabel_1_3);

		final JPanel panel_9_5_3 = new JPanel();
		panel_9_5_3.setBackground(Color.WHITE);
		panel_9_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_3.setBounds(210, 0, 36, 32);
		panel_7_1_3.add(panel_9_5_3);

		final JRadioButton radioButton_2_3 = new JRadioButton();
		bgBed22.add(radioButton_2_3);
		radioButton_2_3.setActionCommand("1");
		radioButton_2_3.setBackground(Color.WHITE);
		radioButton_2_3.setText("O");
		panel_9_5_3.add(radioButton_2_3);

		final JPanel panel_9_1_1_3 = new JPanel();
		panel_9_1_1_3.setBackground(Color.WHITE);
		panel_9_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_3.setBounds(245, 0, 36, 32);
		panel_7_1_3.add(panel_9_1_1_3);

		final JRadioButton sRadioButton_1_3 = new JRadioButton();
		bgBed22.add(sRadioButton_1_3);
		sRadioButton_1_3.setActionCommand("2");
		sRadioButton_1_3.setBackground(Color.WHITE);
		sRadioButton_1_3.setText("S");
		panel_9_1_1_3.add(sRadioButton_1_3);

		final JPanel panel_9_2_1_3 = new JPanel();
		panel_9_2_1_3.setBackground(Color.WHITE);
		panel_9_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_3.setBounds(280, 0, 36, 32);
		panel_7_1_3.add(panel_9_2_1_3);

		final JRadioButton lRadioButton_1_3 = new JRadioButton();
		bgBed22.add(lRadioButton_1_3);
		lRadioButton_1_3.setActionCommand("3");
		lRadioButton_1_3.setBackground(Color.WHITE);
		lRadioButton_1_3.setText("1");
		panel_9_2_1_3.add(lRadioButton_1_3);

		final JPanel panel_9_3_1_3 = new JPanel();
		panel_9_3_1_3.setBackground(Color.WHITE);
		panel_9_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_3.setBounds(315, 0, 36, 32);
		panel_7_1_3.add(panel_9_3_1_3);

		final JRadioButton eRadioButton_1_3 = new JRadioButton();
		bgBed22.add(eRadioButton_1_3);
		eRadioButton_1_3.setActionCommand("4");
		eRadioButton_1_3.setBackground(Color.WHITE);
		eRadioButton_1_3.setText("2");
		panel_9_3_1_3.add(eRadioButton_1_3);

		final JPanel panel_9_4_2_3 = new JPanel();
		panel_9_4_2_3.setBackground(Color.WHITE);
		panel_9_4_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_3.setBounds(350, 0, 80, 32);
		panel_7_1_3.add(panel_9_4_2_3);

		final JRadioButton naRadioButton_4 = new JRadioButton();
		bgBed22.add(naRadioButton_4);
		naRadioButton_4.setActionCommand("5");
		naRadioButton_4.setBackground(Color.WHITE);
		naRadioButton_4.setText("NA");
		panel_9_4_2_3.add(naRadioButton_4);

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(0, 62, 430, 32);
		panel_6_2.add(panel_7_1_1_2);

		final JPanel panel_8_1_1_2 = new JPanel();
		panel_8_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_2.setLayout(null);
		panel_8_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_2.add(panel_8_1_1_2);

		final JLabel turnsSideToLabel_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_2.setText("Moves to / from lying position");
		turnsSideToLabel_1_1_2.setBounds(10, 10, 175, 14);
		panel_8_1_1_2.add(turnsSideToLabel_1_1_2);

		final JPanel panel_9_5_1_2 = new JPanel();
		panel_9_5_1_2.setBackground(Color.WHITE);
		panel_9_5_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_2.setBounds(210, 0, 36, 32);
		panel_7_1_1_2.add(panel_9_5_1_2);

		final JRadioButton radioButton_2_1_2 = new JRadioButton();
		bgBed23.add(radioButton_2_1_2);
		radioButton_2_1_2.setActionCommand("1");
		radioButton_2_1_2.setBackground(Color.WHITE);
		radioButton_2_1_2.setText("O");
		panel_9_5_1_2.add(radioButton_2_1_2);

		final JPanel panel_9_1_1_1_2 = new JPanel();
		panel_9_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_1_2.add(panel_9_1_1_1_2);

		final JRadioButton sRadioButton_1_1_2 = new JRadioButton();
		bgBed23.add(sRadioButton_1_1_2);
		sRadioButton_1_1_2.setActionCommand("2");
		sRadioButton_1_1_2.setBackground(Color.WHITE);
		sRadioButton_1_1_2.setText("S");
		panel_9_1_1_1_2.add(sRadioButton_1_1_2);

		final JPanel panel_9_2_1_1_2 = new JPanel();
		panel_9_2_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_1_2.add(panel_9_2_1_1_2);

		final JRadioButton lRadioButton_1_1_2 = new JRadioButton();
		bgBed23.add(lRadioButton_1_1_2);
		lRadioButton_1_1_2.setActionCommand("3");
		lRadioButton_1_1_2.setBackground(Color.WHITE);
		lRadioButton_1_1_2.setText("1");
		panel_9_2_1_1_2.add(lRadioButton_1_1_2);

		final JPanel panel_9_3_1_1_2 = new JPanel();
		panel_9_3_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_1_2.add(panel_9_3_1_1_2);

		final JRadioButton eRadioButton_1_1_2 = new JRadioButton();
		bgBed23.add(eRadioButton_1_1_2);
		eRadioButton_1_1_2.setActionCommand("4");
		eRadioButton_1_1_2.setBackground(Color.WHITE);
		eRadioButton_1_1_2.setText("2");
		panel_9_3_1_1_2.add(eRadioButton_1_1_2);

		final JPanel panel_9_4_2_1_2 = new JPanel();
		panel_9_4_2_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_2.setBounds(350, 0, 80, 32);
		panel_7_1_1_2.add(panel_9_4_2_1_2);

		final JRadioButton naRadioButton_5 = new JRadioButton();
		bgBed23.add(naRadioButton_5);
		naRadioButton_5.setActionCommand("5");
		naRadioButton_5.setBackground(Color.WHITE);
		naRadioButton_5.setText("NA");
		panel_9_4_2_1_2.add(naRadioButton_5);

		final JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setBackground(Color.WHITE);
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBounds(0, 121, 430, 115);
		panel_4_1.add(panel_5_1_2);

		final JLabel bedMobilityLabel_1_2 = new JLabel();
		bedMobilityLabel_1_2.setText("<html><u>Transfer :</u></html>");
		bedMobilityLabel_1_2.setBounds(5, 0, 81, 14);
		panel_5_1_2.add(bedMobilityLabel_1_2);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBounds(0, 20, 430, 94);
		panel_5_1_2.add(panel_6_1_2);

		final JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBounds(0, 0, 430, 32);
		panel_6_1_2.add(panel_7_2_2);

		final JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBackground(Color.WHITE);
		panel_8_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2.setLayout(null);
		panel_8_2_2.setBounds(0, 0, 211, 32);
		panel_7_2_2.add(panel_8_2_2);

		final JLabel turnsSideToLabel_2_2 = new JLabel();
		turnsSideToLabel_2_2.setText("Bed to W / C");
		turnsSideToLabel_2_2.setBounds(10, 10, 111, 14);
		panel_8_2_2.add(turnsSideToLabel_2_2);

		final JPanel panel_9_6_2 = new JPanel();
		panel_9_6_2.setBackground(Color.WHITE);
		panel_9_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_2.setBounds(210, 0, 36, 32);
		panel_7_2_2.add(panel_9_6_2);

		final JRadioButton radioButton_3_2 = new JRadioButton();
		bgTransfer21.add(radioButton_3_2);
		radioButton_3_2.setActionCommand("1");
		radioButton_3_2.setBackground(Color.WHITE);
		radioButton_3_2.setText("O");
		panel_9_6_2.add(radioButton_3_2);

		final JPanel panel_9_1_2_2 = new JPanel();
		panel_9_1_2_2.setBackground(Color.WHITE);
		panel_9_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_2.setBounds(245, 0, 36, 32);
		panel_7_2_2.add(panel_9_1_2_2);

		final JRadioButton sRadioButton_2_2 = new JRadioButton();
		bgTransfer21.add(sRadioButton_2_2);
		sRadioButton_2_2.setActionCommand("2");
		sRadioButton_2_2.setBackground(Color.WHITE);
		sRadioButton_2_2.setText("S");
		panel_9_1_2_2.add(sRadioButton_2_2);

		final JPanel panel_9_2_2_2 = new JPanel();
		panel_9_2_2_2.setBackground(Color.WHITE);
		panel_9_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_2.setBounds(280, 0, 36, 32);
		panel_7_2_2.add(panel_9_2_2_2);

		final JRadioButton lRadioButton_2_2 = new JRadioButton();
		bgTransfer21.add(lRadioButton_2_2);
		lRadioButton_2_2.setActionCommand("3");
		lRadioButton_2_2.setBackground(Color.WHITE);
		lRadioButton_2_2.setText("1");
		panel_9_2_2_2.add(lRadioButton_2_2);

		final JPanel panel_9_3_2_2 = new JPanel();
		panel_9_3_2_2.setBackground(Color.WHITE);
		panel_9_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_2.setBounds(315, 0, 36, 32);
		panel_7_2_2.add(panel_9_3_2_2);

		final JRadioButton eRadioButton_2_2 = new JRadioButton();
		bgTransfer21.add(eRadioButton_2_2);
		eRadioButton_2_2.setActionCommand("4");
		eRadioButton_2_2.setBackground(Color.WHITE);
		eRadioButton_2_2.setText("2");
		panel_9_3_2_2.add(eRadioButton_2_2);

		final JPanel panel_9_4_3_2 = new JPanel();
		panel_9_4_3_2.setBackground(Color.WHITE);
		panel_9_4_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_2.setBounds(350, 0, 80, 32);
		panel_7_2_2.add(panel_9_4_3_2);

		final JRadioButton naRadioButton_6 = new JRadioButton();
		bgTransfer21.add(naRadioButton_6);
		naRadioButton_6.setActionCommand("5");
		naRadioButton_6.setBackground(Color.WHITE);
		naRadioButton_6.setText("NA");
		panel_9_4_3_2.add(naRadioButton_6);

		final JPanel panel_7_1_2_2 = new JPanel();
		panel_7_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_2.setLayout(null);
		panel_7_1_2_2.setBounds(0, 31, 430, 32);
		panel_6_1_2.add(panel_7_1_2_2);

		final JPanel panel_8_1_2_2 = new JPanel();
		panel_8_1_2_2.setBackground(Color.WHITE);
		panel_8_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_2.setLayout(null);
		panel_8_1_2_2.setBounds(0, 0, 211, 32);
		panel_7_1_2_2.add(panel_8_1_2_2);

		final JLabel turnsSideToLabel_1_2_2 = new JLabel();
		turnsSideToLabel_1_2_2.setText("W / C to bed");
		turnsSideToLabel_1_2_2.setBounds(10, 10, 111, 14);
		panel_8_1_2_2.add(turnsSideToLabel_1_2_2);

		final JPanel panel_9_5_2_2 = new JPanel();
		panel_9_5_2_2.setBackground(Color.WHITE);
		panel_9_5_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_2.setBounds(210, 0, 36, 32);
		panel_7_1_2_2.add(panel_9_5_2_2);

		final JRadioButton radioButton_2_2_2 = new JRadioButton();
		bgTransfer22.add(radioButton_2_2_2);
		radioButton_2_2_2.setActionCommand("1");
		radioButton_2_2_2.setBackground(Color.WHITE);
		radioButton_2_2_2.setText("O");
		panel_9_5_2_2.add(radioButton_2_2_2);

		final JPanel panel_9_1_1_2_2 = new JPanel();
		panel_9_1_1_2_2.setBackground(Color.WHITE);
		panel_9_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_2.setBounds(245, 0, 36, 32);
		panel_7_1_2_2.add(panel_9_1_1_2_2);

		final JRadioButton sRadioButton_1_2_2 = new JRadioButton();
		bgTransfer22.add(sRadioButton_1_2_2);
		sRadioButton_1_2_2.setActionCommand("2");
		sRadioButton_1_2_2.setBackground(Color.WHITE);
		sRadioButton_1_2_2.setText("S");
		panel_9_1_1_2_2.add(sRadioButton_1_2_2);

		final JPanel panel_9_2_1_2_2 = new JPanel();
		panel_9_2_1_2_2.setBackground(Color.WHITE);
		panel_9_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_2.setBounds(280, 0, 36, 32);
		panel_7_1_2_2.add(panel_9_2_1_2_2);

		final JRadioButton lRadioButton_1_2_2 = new JRadioButton();
		bgTransfer22.add(lRadioButton_1_2_2);
		lRadioButton_1_2_2.setActionCommand("3");
		lRadioButton_1_2_2.setBackground(Color.WHITE);
		lRadioButton_1_2_2.setText("1");
		panel_9_2_1_2_2.add(lRadioButton_1_2_2);

		final JPanel panel_9_3_1_2_2 = new JPanel();
		panel_9_3_1_2_2.setBackground(Color.WHITE);
		panel_9_3_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_2.setBounds(315, 0, 36, 32);
		panel_7_1_2_2.add(panel_9_3_1_2_2);

		final JRadioButton eRadioButton_1_2_2 = new JRadioButton();
		bgTransfer22.add(eRadioButton_1_2_2);
		eRadioButton_1_2_2.setActionCommand("4");
		eRadioButton_1_2_2.setBackground(Color.WHITE);
		eRadioButton_1_2_2.setText("2");
		panel_9_3_1_2_2.add(eRadioButton_1_2_2);

		final JPanel panel_9_4_2_2_2 = new JPanel();
		panel_9_4_2_2_2.setBackground(Color.WHITE);
		panel_9_4_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_2.setBounds(350, 0, 80, 32);
		panel_7_1_2_2.add(panel_9_4_2_2_2);

		final JRadioButton naRadioButton_7 = new JRadioButton();
		bgTransfer22.add(naRadioButton_7);
		naRadioButton_7.setActionCommand("5");
		naRadioButton_7.setBackground(Color.WHITE);
		naRadioButton_7.setText("NA");
		panel_9_4_2_2_2.add(naRadioButton_7);

		final JPanel panel_7_1_1_1_2 = new JPanel();
		panel_7_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(0, 62, 430, 32);
		panel_6_1_2.add(panel_7_1_1_1_2);

		final JPanel panel_8_1_1_1_2 = new JPanel();
		panel_8_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_2.setLayout(null);
		panel_8_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_2.add(panel_8_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_2.setText("sit to stand");
		turnsSideToLabel_1_1_1_2.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_2.add(turnsSideToLabel_1_1_1_2);

		final JPanel panel_9_5_1_1_2 = new JPanel();
		panel_9_5_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_2.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_2.add(panel_9_5_1_1_2);

		final JRadioButton radioButton_2_1_1_2 = new JRadioButton();
		bgTransfer23.add(radioButton_2_1_1_2);
		radioButton_2_1_1_2.setActionCommand("1");
		radioButton_2_1_1_2.setBackground(Color.WHITE);
		radioButton_2_1_1_2.setText("O");
		panel_9_5_1_1_2.add(radioButton_2_1_1_2);

		final JPanel panel_9_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_2.add(panel_9_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_2 = new JRadioButton();
		bgTransfer23.add(sRadioButton_1_1_1_2);
		sRadioButton_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_2.setBackground(Color.WHITE);
		sRadioButton_1_1_1_2.setText("S");
		panel_9_1_1_1_1_2.add(sRadioButton_1_1_1_2);

		final JPanel panel_9_2_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_2.add(panel_9_2_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_2 = new JRadioButton();
		bgTransfer23.add(lRadioButton_1_1_1_2);
		lRadioButton_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_2.setBackground(Color.WHITE);
		lRadioButton_1_1_1_2.setText("1");
		panel_9_2_1_1_1_2.add(lRadioButton_1_1_1_2);

		final JPanel panel_9_3_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_2.add(panel_9_3_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_2 = new JRadioButton();
		bgTransfer23.add(eRadioButton_1_1_1_2);
		eRadioButton_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_2.setBackground(Color.WHITE);
		eRadioButton_1_1_1_2.setText("2");
		panel_9_3_1_1_1_2.add(eRadioButton_1_1_1_2);

		final JPanel panel_9_4_2_1_1_2 = new JPanel();
		panel_9_4_2_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_2.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_2.add(panel_9_4_2_1_1_2);

		final JRadioButton naRadioButton_8 = new JRadioButton();
		bgTransfer23.add(naRadioButton_8);
		naRadioButton_8.setActionCommand("5");
		naRadioButton_8.setBackground(Color.WHITE);
		naRadioButton_8.setText("NA");
		panel_9_4_2_1_1_2.add(naRadioButton_8);

		final JPanel panel_5_1_1_5 = new JPanel();
		panel_5_1_1_5.setBackground(Color.WHITE);
		panel_5_1_1_5.setLayout(null);
		panel_5_1_1_5.setBounds(0, 242, 430, 177);
		panel_4_1.add(panel_5_1_1_5);

		final JLabel bedMobilityLabel_1_1_5 = new JLabel();
		bedMobilityLabel_1_1_5.setText("<html><u>Toileting :</u></html>");
		bedMobilityLabel_1_1_5.setBounds(5, 0, 81, 14);
		panel_5_1_1_5.add(bedMobilityLabel_1_1_5);

		final JPanel panel_6_1_1_5 = new JPanel();
		panel_6_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_5.setLayout(null);
		panel_6_1_1_5.setBounds(0, 20, 430, 94);
		panel_5_1_1_5.add(panel_6_1_1_5);

		final JPanel panel_7_2_1_5 = new JPanel();
		panel_7_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_5.setLayout(null);
		panel_7_2_1_5.setBounds(0, 0, 430, 32);
		panel_6_1_1_5.add(panel_7_2_1_5);

		final JPanel panel_8_2_1_5 = new JPanel();
		panel_8_2_1_5.setBackground(Color.WHITE);
		panel_8_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_5.setLayout(null);
		panel_8_2_1_5.setBounds(0, 0, 211, 32);
		panel_7_2_1_5.add(panel_8_2_1_5);

		final JLabel turnsSideToLabel_2_1_5 = new JLabel();
		turnsSideToLabel_2_1_5.setText("Care of F / C / Ostomy");
		turnsSideToLabel_2_1_5.setBounds(10, 10, 111, 14);
		panel_8_2_1_5.add(turnsSideToLabel_2_1_5);

		final JPanel panel_9_6_1_5 = new JPanel();
		panel_9_6_1_5.setBackground(Color.WHITE);
		panel_9_6_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_5.setBounds(210, 0, 36, 32);
		panel_7_2_1_5.add(panel_9_6_1_5);

		final JRadioButton radioButton_3_1_5 = new JRadioButton();
		bgToileting21.add(radioButton_3_1_5);
		radioButton_3_1_5.setActionCommand("1");
		radioButton_3_1_5.setBackground(Color.WHITE);
		radioButton_3_1_5.setText("O");
		panel_9_6_1_5.add(radioButton_3_1_5);

		final JPanel panel_9_1_2_1_5 = new JPanel();
		panel_9_1_2_1_5.setBackground(Color.WHITE);
		panel_9_1_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_5.setBounds(245, 0, 36, 32);
		panel_7_2_1_5.add(panel_9_1_2_1_5);

		final JRadioButton sRadioButton_2_1_5 = new JRadioButton();
		bgToileting21.add(sRadioButton_2_1_5);
		sRadioButton_2_1_5.setActionCommand("2");
		sRadioButton_2_1_5.setBackground(Color.WHITE);
		sRadioButton_2_1_5.setText("S");
		panel_9_1_2_1_5.add(sRadioButton_2_1_5);

		final JPanel panel_9_2_2_1_5 = new JPanel();
		panel_9_2_2_1_5.setBackground(Color.WHITE);
		panel_9_2_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_5.setBounds(280, 0, 36, 32);
		panel_7_2_1_5.add(panel_9_2_2_1_5);

		final JRadioButton lRadioButton_2_1_5 = new JRadioButton();
		bgToileting21.add(lRadioButton_2_1_5);
		lRadioButton_2_1_5.setActionCommand("3");
		lRadioButton_2_1_5.setBackground(Color.WHITE);
		lRadioButton_2_1_5.setText("1");
		panel_9_2_2_1_5.add(lRadioButton_2_1_5);

		final JPanel panel_9_3_2_1_5 = new JPanel();
		panel_9_3_2_1_5.setBackground(Color.WHITE);
		panel_9_3_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_5.setBounds(315, 0, 36, 32);
		panel_7_2_1_5.add(panel_9_3_2_1_5);

		final JRadioButton eRadioButton_2_1_5 = new JRadioButton();
		bgToileting21.add(eRadioButton_2_1_5);
		eRadioButton_2_1_5.setActionCommand("4");
		eRadioButton_2_1_5.setBackground(Color.WHITE);
		eRadioButton_2_1_5.setText("2");
		panel_9_3_2_1_5.add(eRadioButton_2_1_5);

		final JPanel panel_9_4_3_1_5 = new JPanel();
		panel_9_4_3_1_5.setBackground(Color.WHITE);
		panel_9_4_3_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_5.setBounds(350, 0, 80, 32);
		panel_7_2_1_5.add(panel_9_4_3_1_5);

		final JRadioButton naRadioButton_9 = new JRadioButton();
		bgToileting21.add(naRadioButton_9);
		naRadioButton_9.setActionCommand("5");
		naRadioButton_9.setBackground(Color.WHITE);
		naRadioButton_9.setText("NA");
		panel_9_4_3_1_5.add(naRadioButton_9);

		final JPanel panel_7_1_2_1_4 = new JPanel();
		panel_7_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_4.setLayout(null);
		panel_7_1_2_1_4.setBounds(0, 31, 430, 32);
		panel_6_1_1_5.add(panel_7_1_2_1_4);

		final JPanel panel_8_1_2_1_4 = new JPanel();
		panel_8_1_2_1_4.setBackground(Color.WHITE);
		panel_8_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_4.setLayout(null);
		panel_8_1_2_1_4.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_4.add(panel_8_1_2_1_4);

		final JLabel turnsSideToLabel_1_2_1_4 = new JLabel();
		turnsSideToLabel_1_2_1_4.setText("Transfer on / off toilet");
		turnsSideToLabel_1_2_1_4.setBounds(10, 10, 111, 14);
		panel_8_1_2_1_4.add(turnsSideToLabel_1_2_1_4);

		final JPanel panel_9_5_2_1_4 = new JPanel();
		panel_9_5_2_1_4.setBackground(Color.WHITE);
		panel_9_5_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_4.setBounds(210, 0, 36, 32);
		panel_7_1_2_1_4.add(panel_9_5_2_1_4);

		final JRadioButton radioButton_2_2_1_4 = new JRadioButton();
		bgToileting22.add(radioButton_2_2_1_4);
		radioButton_2_2_1_4.setActionCommand("1");
		radioButton_2_2_1_4.setBackground(Color.WHITE);
		radioButton_2_2_1_4.setText("O");
		panel_9_5_2_1_4.add(radioButton_2_2_1_4);

		final JPanel panel_9_1_1_2_1_4 = new JPanel();
		panel_9_1_1_2_1_4.setBackground(Color.WHITE);
		panel_9_1_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_4.setBounds(245, 0, 36, 32);
		panel_7_1_2_1_4.add(panel_9_1_1_2_1_4);

		final JRadioButton sRadioButton_1_2_1_4 = new JRadioButton();
		bgToileting22.add(sRadioButton_1_2_1_4);
		sRadioButton_1_2_1_4.setActionCommand("2");
		sRadioButton_1_2_1_4.setBackground(Color.WHITE);
		sRadioButton_1_2_1_4.setText("S");
		panel_9_1_1_2_1_4.add(sRadioButton_1_2_1_4);

		final JPanel panel_9_2_1_2_1_4 = new JPanel();
		panel_9_2_1_2_1_4.setBackground(Color.WHITE);
		panel_9_2_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_4.setBounds(280, 0, 36, 32);
		panel_7_1_2_1_4.add(panel_9_2_1_2_1_4);

		final JRadioButton lRadioButton_1_2_1_4 = new JRadioButton();
		bgToileting22.add(lRadioButton_1_2_1_4);
		lRadioButton_1_2_1_4.setActionCommand("3");
		lRadioButton_1_2_1_4.setBackground(Color.WHITE);
		lRadioButton_1_2_1_4.setText("1");
		panel_9_2_1_2_1_4.add(lRadioButton_1_2_1_4);

		final JPanel panel_9_3_1_2_1_4 = new JPanel();
		panel_9_3_1_2_1_4.setBackground(Color.WHITE);
		panel_9_3_1_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_4.setBounds(315, 0, 36, 32);
		panel_7_1_2_1_4.add(panel_9_3_1_2_1_4);

		final JRadioButton eRadioButton_1_2_1_4 = new JRadioButton();
		bgToileting22.add(eRadioButton_1_2_1_4);
		eRadioButton_1_2_1_4.setActionCommand("4");
		eRadioButton_1_2_1_4.setBackground(Color.WHITE);
		eRadioButton_1_2_1_4.setText("2");
		panel_9_3_1_2_1_4.add(eRadioButton_1_2_1_4);

		final JPanel panel_9_4_2_2_1_4 = new JPanel();
		panel_9_4_2_2_1_4.setBackground(Color.WHITE);
		panel_9_4_2_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_4.setBounds(350, 0, 80, 32);
		panel_7_1_2_1_4.add(panel_9_4_2_2_1_4);

		final JRadioButton naRadioButton_10 = new JRadioButton();
		bgToileting22.add(naRadioButton_10);
		naRadioButton_10.setActionCommand("5");
		naRadioButton_10.setBackground(Color.WHITE);
		naRadioButton_10.setText("NA");
		panel_9_4_2_2_1_4.add(naRadioButton_10);

		final JPanel panel_7_1_1_1_1_4 = new JPanel();
		panel_7_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_4.setLayout(null);
		panel_7_1_1_1_1_4.setBounds(0, 62, 430, 32);
		panel_6_1_1_5.add(panel_7_1_1_1_1_4);

		final JPanel panel_8_1_1_1_1_4 = new JPanel();
		panel_8_1_1_1_1_4.setBackground(Color.WHITE);
		panel_8_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_4.setLayout(null);
		panel_8_1_1_1_1_4.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_4.add(panel_8_1_1_1_1_4);

		final JLabel turnsSideToLabel_1_1_1_1_4 = new JLabel();
		turnsSideToLabel_1_1_1_1_4.setText("Hygiene");
		turnsSideToLabel_1_1_1_1_4.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_4.add(turnsSideToLabel_1_1_1_1_4);

		final JPanel panel_9_5_1_1_1_4 = new JPanel();
		panel_9_5_1_1_1_4.setBackground(Color.WHITE);
		panel_9_5_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_4.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_4.add(panel_9_5_1_1_1_4);

		final JRadioButton radioButton_2_1_1_1_4 = new JRadioButton();
		bgToileting23.add(radioButton_2_1_1_1_4);
		radioButton_2_1_1_1_4.setActionCommand("1");
		radioButton_2_1_1_1_4.setBackground(Color.WHITE);
		radioButton_2_1_1_1_4.setText("O");
		panel_9_5_1_1_1_4.add(radioButton_2_1_1_1_4);

		final JPanel panel_9_1_1_1_1_1_4 = new JPanel();
		panel_9_1_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_4.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_4.add(panel_9_1_1_1_1_1_4);

		final JRadioButton sRadioButton_1_1_1_1_4 = new JRadioButton();
		bgToileting23.add(sRadioButton_1_1_1_1_4);
		sRadioButton_1_1_1_1_4.setActionCommand("2");
		sRadioButton_1_1_1_1_4.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_4.setText("S");
		panel_9_1_1_1_1_1_4.add(sRadioButton_1_1_1_1_4);

		final JPanel panel_9_2_1_1_1_1_4 = new JPanel();
		panel_9_2_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_4.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_4.add(panel_9_2_1_1_1_1_4);

		final JRadioButton lRadioButton_1_1_1_1_4 = new JRadioButton();
		bgToileting23.add(lRadioButton_1_1_1_1_4);
		lRadioButton_1_1_1_1_4.setActionCommand("3");
		lRadioButton_1_1_1_1_4.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_4.setText("1");
		panel_9_2_1_1_1_1_4.add(lRadioButton_1_1_1_1_4);

		final JPanel panel_9_3_1_1_1_1_4 = new JPanel();
		panel_9_3_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_4.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_4.add(panel_9_3_1_1_1_1_4);

		final JRadioButton eRadioButton_1_1_1_1_4 = new JRadioButton();
		bgToileting23.add(eRadioButton_1_1_1_1_4);
		eRadioButton_1_1_1_1_4.setActionCommand("4");
		eRadioButton_1_1_1_1_4.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_4.setText("2");
		panel_9_3_1_1_1_1_4.add(eRadioButton_1_1_1_1_4);

		final JPanel panel_9_4_2_1_1_1_4 = new JPanel();
		panel_9_4_2_1_1_1_4.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_4.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_4.add(panel_9_4_2_1_1_1_4);

		final JRadioButton naRadioButton_11 = new JRadioButton();
		bgToileting23.add(naRadioButton_11);
		naRadioButton_11.setActionCommand("5");
		naRadioButton_11.setBackground(Color.WHITE);
		naRadioButton_11.setText("NA");
		panel_9_4_2_1_1_1_4.add(naRadioButton_11);

		final JPanel panel_7_1_1_1_1_1_4 = new JPanel();
		panel_7_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_4.setLayout(null);
		panel_7_1_1_1_1_1_4.setBounds(0, 113, 430, 32);
		panel_5_1_1_5.add(panel_7_1_1_1_1_1_4);

		final JPanel panel_8_1_1_1_1_1_4 = new JPanel();
		panel_8_1_1_1_1_1_4.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_4.setLayout(null);
		panel_8_1_1_1_1_1_4.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_4.add(panel_8_1_1_1_1_1_4);

		final JLabel turnsSideToLabel_1_1_1_1_1_4 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_4.setText("Adjusts clothing");
		turnsSideToLabel_1_1_1_1_1_4.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_4.add(turnsSideToLabel_1_1_1_1_1_4);

		final JPanel panel_9_5_1_1_1_1_4 = new JPanel();
		panel_9_5_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_4.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_4.add(panel_9_5_1_1_1_1_4);

		final JRadioButton radioButton_2_1_1_1_1_4 = new JRadioButton();
		bgToileting24.add(radioButton_2_1_1_1_1_4);
		radioButton_2_1_1_1_1_4.setActionCommand("1");
		radioButton_2_1_1_1_1_4.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_4.setText("O");
		panel_9_5_1_1_1_1_4.add(radioButton_2_1_1_1_1_4);

		final JPanel panel_9_1_1_1_1_1_1_4 = new JPanel();
		panel_9_1_1_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_4.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_4.add(panel_9_1_1_1_1_1_1_4);

		final JRadioButton sRadioButton_1_1_1_1_1_4 = new JRadioButton();
		bgToileting24.add(sRadioButton_1_1_1_1_1_4);
		sRadioButton_1_1_1_1_1_4.setActionCommand("2");
		sRadioButton_1_1_1_1_1_4.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_4.setText("S");
		panel_9_1_1_1_1_1_1_4.add(sRadioButton_1_1_1_1_1_4);

		final JPanel panel_9_2_1_1_1_1_1_4 = new JPanel();
		panel_9_2_1_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_4.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_4.add(panel_9_2_1_1_1_1_1_4);

		final JRadioButton lRadioButton_1_1_1_1_1_4 = new JRadioButton();
		bgToileting24.add(lRadioButton_1_1_1_1_1_4);
		lRadioButton_1_1_1_1_1_4.setActionCommand("3");
		lRadioButton_1_1_1_1_1_4.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_4.setText("1");
		panel_9_2_1_1_1_1_1_4.add(lRadioButton_1_1_1_1_1_4);

		final JPanel panel_9_3_1_1_1_1_1_4 = new JPanel();
		panel_9_3_1_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_4.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_4.add(panel_9_3_1_1_1_1_1_4);

		final JRadioButton eRadioButton_1_1_1_1_1_4 = new JRadioButton();
		bgToileting24.add(eRadioButton_1_1_1_1_1_4);
		eRadioButton_1_1_1_1_1_4.setActionCommand("4");
		eRadioButton_1_1_1_1_1_4.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_4.setText("2");
		panel_9_3_1_1_1_1_1_4.add(eRadioButton_1_1_1_1_1_4);

		final JPanel panel_9_4_2_1_1_1_1_4 = new JPanel();
		panel_9_4_2_1_1_1_1_4.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_4.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_4.add(panel_9_4_2_1_1_1_1_4);

		final JRadioButton naRadioButton_12 = new JRadioButton();
		bgToileting24.add(naRadioButton_12);
		naRadioButton_12.setActionCommand("5");
		naRadioButton_12.setBackground(Color.WHITE);
		naRadioButton_12.setText("NA");
		panel_9_4_2_1_1_1_1_4.add(naRadioButton_12);

		final JPanel panel_7_1_1_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_1_1_2.setBounds(0, 144, 430, 32);
		panel_5_1_1_5.add(panel_7_1_1_1_1_1_1_2);

		final JPanel panel_8_1_1_1_1_1_1_2 = new JPanel();
		panel_8_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_2.setLayout(null);
		panel_8_1_1_1_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_2.setText("Use of urinal / bedpan");
		turnsSideToLabel_1_1_1_1_1_1_2.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_2.add(turnsSideToLabel_1_1_1_1_1_1_2);

		final JPanel panel_9_5_1_1_1_1_1_2 = new JPanel();
		panel_9_5_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_1_2.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_9_5_1_1_1_1_1_2);

		final JRadioButton radioButton_2_1_1_1_1_1_2 = new JRadioButton();
		bgToileting25.add(radioButton_2_1_1_1_1_1_2);
		radioButton_2_1_1_1_1_1_2.setActionCommand("1");
		radioButton_2_1_1_1_1_1_2.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_1_2.setText("O");
		panel_9_5_1_1_1_1_1_2.add(radioButton_2_1_1_1_1_1_2);

		final JPanel panel_9_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_1_1_1_2 = new JRadioButton();
		bgToileting25.add(sRadioButton_1_1_1_1_1_1_2);
		sRadioButton_1_1_1_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_1_2.setText("S");
		panel_9_1_1_1_1_1_1_1_2.add(sRadioButton_1_1_1_1_1_1_2);

		final JPanel panel_9_2_1_1_1_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_9_2_1_1_1_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_1_1_1_2 = new JRadioButton();
		bgToileting25.add(lRadioButton_1_1_1_1_1_1_2);
		lRadioButton_1_1_1_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_1_2.setText("1");
		panel_9_2_1_1_1_1_1_1_2.add(lRadioButton_1_1_1_1_1_1_2);

		final JPanel panel_9_3_1_1_1_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_9_3_1_1_1_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_1_1_1_2 = new JRadioButton();
		bgToileting25.add(eRadioButton_1_1_1_1_1_1_2);
		eRadioButton_1_1_1_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_1_2.setText("2");
		panel_9_3_1_1_1_1_1_1_2.add(eRadioButton_1_1_1_1_1_1_2);

		final JPanel panel_9_4_2_1_1_1_1_1_2 = new JPanel();
		panel_9_4_2_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_1_2.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_1_2.add(panel_9_4_2_1_1_1_1_1_2);

		final JRadioButton naRadioButton_13 = new JRadioButton();
		bgToileting25.add(naRadioButton_13);
		naRadioButton_13.setActionCommand("5");
		naRadioButton_13.setBackground(Color.WHITE);
		naRadioButton_13.setText("NA");
		panel_9_4_2_1_1_1_1_1_2.add(naRadioButton_13);

		final JPanel panel_5_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1_1.setLayout(null);
		panel_5_1_1_1_1.setBounds(0, 425, 430, 53);
		panel_4_1.add(panel_5_1_1_1_1);

		final JLabel bedMobilityLabel_1_1_1_1 = new JLabel();
		bedMobilityLabel_1_1_1_1.setText("<html><u>Eating :</u></html>");
		bedMobilityLabel_1_1_1_1.setBounds(5, 0, 81, 14);
		panel_5_1_1_1_1.add(bedMobilityLabel_1_1_1_1);

		final JPanel panel_6_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(0, 20, 430, 32);
		panel_5_1_1_1_1.add(panel_6_1_1_1_1);

		final JPanel panel_7_2_1_1_1 = new JPanel();
		panel_7_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_1.setLayout(null);
		panel_7_2_1_1_1.setBounds(0, 0, 430, 32);
		panel_6_1_1_1_1.add(panel_7_2_1_1_1);

		final JPanel panel_8_2_1_1_1 = new JPanel();
		panel_8_2_1_1_1.setBackground(Color.WHITE);
		panel_8_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1_1.setLayout(null);
		panel_8_2_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_2_1_1_1.add(panel_8_2_1_1_1);

		final JLabel turnsSideToLabel_2_1_1_1 = new JLabel();
		turnsSideToLabel_2_1_1_1.setText("Includes use of NGT / G Tube");
		turnsSideToLabel_2_1_1_1.setBounds(10, 10, 174, 14);
		panel_8_2_1_1_1.add(turnsSideToLabel_2_1_1_1);

		final JPanel panel_9_6_1_1_1 = new JPanel();
		panel_9_6_1_1_1.setBackground(Color.WHITE);
		panel_9_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_1_1.setBounds(210, 0, 36, 32);
		panel_7_2_1_1_1.add(panel_9_6_1_1_1);

		final JRadioButton radioButton_3_1_1_1 = new JRadioButton();
		bgEating21.add(radioButton_3_1_1_1);
		radioButton_3_1_1_1.setActionCommand("1");
		radioButton_3_1_1_1.setBackground(Color.WHITE);
		radioButton_3_1_1_1.setText("O");
		panel_9_6_1_1_1.add(radioButton_3_1_1_1);

		final JPanel panel_9_1_2_1_1_1 = new JPanel();
		panel_9_1_2_1_1_1.setBackground(Color.WHITE);
		panel_9_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_2_1_1_1.add(panel_9_1_2_1_1_1);

		final JRadioButton sRadioButton_2_1_1_1 = new JRadioButton();
		bgEating21.add(sRadioButton_2_1_1_1);
		sRadioButton_2_1_1_1.setActionCommand("2");
		sRadioButton_2_1_1_1.setBackground(Color.WHITE);
		sRadioButton_2_1_1_1.setText("S");
		panel_9_1_2_1_1_1.add(sRadioButton_2_1_1_1);

		final JPanel panel_9_2_2_1_1_1 = new JPanel();
		panel_9_2_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_1.setBounds(280, 0, 36, 32);
		panel_7_2_1_1_1.add(panel_9_2_2_1_1_1);

		final JRadioButton lRadioButton_2_1_1_1 = new JRadioButton();
		bgEating21.add(lRadioButton_2_1_1_1);
		lRadioButton_2_1_1_1.setActionCommand("3");
		lRadioButton_2_1_1_1.setBackground(Color.WHITE);
		lRadioButton_2_1_1_1.setText("1");
		panel_9_2_2_1_1_1.add(lRadioButton_2_1_1_1);

		final JPanel panel_9_3_2_1_1_1 = new JPanel();
		panel_9_3_2_1_1_1.setBackground(Color.WHITE);
		panel_9_3_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_1_1.setBounds(315, 0, 36, 32);
		panel_7_2_1_1_1.add(panel_9_3_2_1_1_1);

		final JRadioButton eRadioButton_2_1_1_1 = new JRadioButton();
		bgEating21.add(eRadioButton_2_1_1_1);
		eRadioButton_2_1_1_1.setActionCommand("4");
		eRadioButton_2_1_1_1.setBackground(Color.WHITE);
		eRadioButton_2_1_1_1.setText("2");
		panel_9_3_2_1_1_1.add(eRadioButton_2_1_1_1);

		final JPanel panel_9_4_3_1_1_1 = new JPanel();
		panel_9_4_3_1_1_1.setBackground(Color.WHITE);
		panel_9_4_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_1_1.setBounds(350, 0, 80, 32);
		panel_7_2_1_1_1.add(panel_9_4_3_1_1_1);

		final JRadioButton naRadioButton_14 = new JRadioButton();
		bgEating21.add(naRadioButton_14);
		naRadioButton_14.setActionCommand("5");
		naRadioButton_14.setBackground(Color.WHITE);
		naRadioButton_14.setText("NA");
		panel_9_4_3_1_1_1.add(naRadioButton_14);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(Color.WHITE);
		panel_5_1_1_2_1.setLayout(null);
		panel_5_1_1_2_1.setBounds(0, 482, 430, 84);
		panel_4_1.add(panel_5_1_1_2_1);

		final JLabel bedMobilityLabel_1_1_2_1 = new JLabel();
		bedMobilityLabel_1_1_2_1.setText("<html><u>Dressing :</u></html>");
		bedMobilityLabel_1_1_2_1.setBounds(5, 0, 81, 14);
		panel_5_1_1_2_1.add(bedMobilityLabel_1_1_2_1);

		final JPanel panel_6_1_1_2_1 = new JPanel();
		panel_6_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_2_1.setLayout(null);
		panel_6_1_1_2_1.setBounds(0, 20, 430, 63);
		panel_5_1_1_2_1.add(panel_6_1_1_2_1);

		final JPanel panel_7_2_1_2_1 = new JPanel();
		panel_7_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_2_1.setLayout(null);
		panel_7_2_1_2_1.setBounds(0, 0, 430, 32);
		panel_6_1_1_2_1.add(panel_7_2_1_2_1);

		final JPanel panel_8_2_1_2_1 = new JPanel();
		panel_8_2_1_2_1.setBackground(Color.WHITE);
		panel_8_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_2_1.setLayout(null);
		panel_8_2_1_2_1.setBounds(0, 0, 211, 32);
		panel_7_2_1_2_1.add(panel_8_2_1_2_1);

		final JLabel turnsSideToLabel_2_1_2_1 = new JLabel();
		turnsSideToLabel_2_1_2_1.setText("Puts on / takes off all clothing");
		turnsSideToLabel_2_1_2_1.setBounds(10, 10, 175, 14);
		panel_8_2_1_2_1.add(turnsSideToLabel_2_1_2_1);

		final JPanel panel_9_6_1_2_1 = new JPanel();
		panel_9_6_1_2_1.setBackground(Color.WHITE);
		panel_9_6_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_2_1.setBounds(210, 0, 36, 32);
		panel_7_2_1_2_1.add(panel_9_6_1_2_1);

		final JRadioButton radioButton_3_1_2_1 = new JRadioButton();
		bgDressing21.add(radioButton_3_1_2_1);
		radioButton_3_1_2_1.setActionCommand("1");
		radioButton_3_1_2_1.setBackground(Color.WHITE);
		radioButton_3_1_2_1.setText("O");
		panel_9_6_1_2_1.add(radioButton_3_1_2_1);

		final JPanel panel_9_1_2_1_2_1 = new JPanel();
		panel_9_1_2_1_2_1.setBackground(Color.WHITE);
		panel_9_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_2_1.setBounds(245, 0, 36, 32);
		panel_7_2_1_2_1.add(panel_9_1_2_1_2_1);

		final JRadioButton sRadioButton_2_1_2_1 = new JRadioButton();
		bgDressing21.add(sRadioButton_2_1_2_1);
		sRadioButton_2_1_2_1.setActionCommand("2");
		sRadioButton_2_1_2_1.setBackground(Color.WHITE);
		sRadioButton_2_1_2_1.setText("S");
		panel_9_1_2_1_2_1.add(sRadioButton_2_1_2_1);

		final JPanel panel_9_2_2_1_2_1 = new JPanel();
		panel_9_2_2_1_2_1.setBackground(Color.WHITE);
		panel_9_2_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_2_1.setBounds(280, 0, 36, 32);
		panel_7_2_1_2_1.add(panel_9_2_2_1_2_1);

		final JRadioButton lRadioButton_2_1_2_1 = new JRadioButton();
		bgDressing21.add(lRadioButton_2_1_2_1);
		lRadioButton_2_1_2_1.setActionCommand("3");
		lRadioButton_2_1_2_1.setBackground(Color.WHITE);
		lRadioButton_2_1_2_1.setText("1");
		panel_9_2_2_1_2_1.add(lRadioButton_2_1_2_1);

		final JPanel panel_9_3_2_1_2_1 = new JPanel();
		panel_9_3_2_1_2_1.setBackground(Color.WHITE);
		panel_9_3_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_2_1.setBounds(315, 0, 36, 32);
		panel_7_2_1_2_1.add(panel_9_3_2_1_2_1);

		final JRadioButton eRadioButton_2_1_2_1 = new JRadioButton();
		bgDressing21.add(eRadioButton_2_1_2_1);
		eRadioButton_2_1_2_1.setActionCommand("4");
		eRadioButton_2_1_2_1.setBackground(Color.WHITE);
		eRadioButton_2_1_2_1.setText("2");
		panel_9_3_2_1_2_1.add(eRadioButton_2_1_2_1);

		final JPanel panel_9_4_3_1_2_1 = new JPanel();
		panel_9_4_3_1_2_1.setBackground(Color.WHITE);
		panel_9_4_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_2_1.setBounds(350, 0, 80, 32);
		panel_7_2_1_2_1.add(panel_9_4_3_1_2_1);

		final JRadioButton naRadioButton_15 = new JRadioButton();
		bgDressing21.add(naRadioButton_15);
		naRadioButton_15.setActionCommand("5");
		naRadioButton_15.setBackground(Color.WHITE);
		naRadioButton_15.setText("NA");
		panel_9_4_3_1_2_1.add(naRadioButton_15);

		final JPanel panel_7_1_2_1_1_1 = new JPanel();
		panel_7_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1.setLayout(null);
		panel_7_1_2_1_1_1.setBounds(0, 31, 430, 32);
		panel_6_1_1_2_1.add(panel_7_1_2_1_1_1);

		final JPanel panel_8_1_2_1_1_1 = new JPanel();
		panel_8_1_2_1_1_1.setBackground(Color.WHITE);
		panel_8_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1.setLayout(null);
		panel_8_1_2_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_1_1.add(panel_8_1_2_1_1_1);

		final JLabel turnsSideToLabel_1_2_1_1_1 = new JLabel();
		turnsSideToLabel_1_2_1_1_1.setText("Apply / remove prosthesis");
		turnsSideToLabel_1_2_1_1_1.setBounds(10, 10, 156, 14);
		panel_8_1_2_1_1_1.add(turnsSideToLabel_1_2_1_1_1);

		final JPanel panel_9_5_2_1_1_1 = new JPanel();
		panel_9_5_2_1_1_1.setBackground(Color.WHITE);
		panel_9_5_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_1_1.setBounds(210, 0, 36, 32);
		panel_7_1_2_1_1_1.add(panel_9_5_2_1_1_1);

		final JRadioButton radioButton_2_2_1_1_1 = new JRadioButton();
		bgDressing22.add(radioButton_2_2_1_1_1);
		radioButton_2_2_1_1_1.setActionCommand("1");
		radioButton_2_2_1_1_1.setBackground(Color.WHITE);
		radioButton_2_2_1_1_1.setText("O");
		panel_9_5_2_1_1_1.add(radioButton_2_2_1_1_1);

		final JPanel panel_9_1_1_2_1_1_1 = new JPanel();
		panel_9_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_1_2_1_1_1.add(panel_9_1_1_2_1_1_1);

		final JRadioButton sRadioButton_1_2_1_1_1 = new JRadioButton();
		bgDressing22.add(sRadioButton_1_2_1_1_1);
		sRadioButton_1_2_1_1_1.setActionCommand("2");
		sRadioButton_1_2_1_1_1.setBackground(Color.WHITE);
		sRadioButton_1_2_1_1_1.setText("S");
		panel_9_1_1_2_1_1_1.add(sRadioButton_1_2_1_1_1);

		final JPanel panel_9_2_1_2_1_1_1 = new JPanel();
		panel_9_2_1_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_1_1.setBounds(280, 0, 36, 32);
		panel_7_1_2_1_1_1.add(panel_9_2_1_2_1_1_1);

		final JRadioButton lRadioButton_1_2_1_1_1 = new JRadioButton();
		bgDressing22.add(lRadioButton_1_2_1_1_1);
		lRadioButton_1_2_1_1_1.setActionCommand("3");
		lRadioButton_1_2_1_1_1.setBackground(Color.WHITE);
		lRadioButton_1_2_1_1_1.setText("1");
		panel_9_2_1_2_1_1_1.add(lRadioButton_1_2_1_1_1);

		final JPanel panel_9_3_1_2_1_1_1 = new JPanel();
		panel_9_3_1_2_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_1_1.setBounds(315, 0, 36, 32);
		panel_7_1_2_1_1_1.add(panel_9_3_1_2_1_1_1);

		final JRadioButton eRadioButton_1_2_1_1_1 = new JRadioButton();
		bgDressing22.add(eRadioButton_1_2_1_1_1);
		eRadioButton_1_2_1_1_1.setActionCommand("4");
		eRadioButton_1_2_1_1_1.setBackground(Color.WHITE);
		eRadioButton_1_2_1_1_1.setText("2");
		panel_9_3_1_2_1_1_1.add(eRadioButton_1_2_1_1_1);

		final JPanel panel_9_4_2_2_1_1_1 = new JPanel();
		panel_9_4_2_2_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_1_1.setBounds(350, 0, 80, 32);
		panel_7_1_2_1_1_1.add(panel_9_4_2_2_1_1_1);

		final JRadioButton naRadioButton_16 = new JRadioButton();
		bgDressing22.add(naRadioButton_16);
		naRadioButton_16.setActionCommand("5");
		naRadioButton_16.setBackground(Color.WHITE);
		naRadioButton_16.setText("NA");
		panel_9_4_2_2_1_1_1.add(naRadioButton_16);

		final JPanel panel_5_1_1_3_1 = new JPanel();
		panel_5_1_1_3_1.setBackground(Color.WHITE);
		panel_5_1_1_3_1.setLayout(null);
		panel_5_1_1_3_1.setBounds(0, 568, 430, 147);
		panel_4_1.add(panel_5_1_1_3_1);

		final JLabel bedMobilityLabel_1_1_3_1 = new JLabel();
		bedMobilityLabel_1_1_3_1
				.setText("<html><u>Ambulation / Locomotion :</u></html>");
		bedMobilityLabel_1_1_3_1.setBounds(5, 0, 140, 14);
		panel_5_1_1_3_1.add(bedMobilityLabel_1_1_3_1);

		final JPanel panel_6_1_1_3_1 = new JPanel();
		panel_6_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_3_1.setLayout(null);
		panel_6_1_1_3_1.setBounds(0, 20, 430, 94);
		panel_5_1_1_3_1.add(panel_6_1_1_3_1);

		final JPanel panel_7_2_1_3_1 = new JPanel();
		panel_7_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_3_1.setLayout(null);
		panel_7_2_1_3_1.setBounds(0, 0, 430, 32);
		panel_6_1_1_3_1.add(panel_7_2_1_3_1);

		final JPanel panel_8_2_1_3_1 = new JPanel();
		panel_8_2_1_3_1.setBackground(Color.WHITE);
		panel_8_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_3_1.setLayout(null);
		panel_8_2_1_3_1.setBounds(0, 0, 211, 32);
		panel_7_2_1_3_1.add(panel_8_2_1_3_1);

		final JLabel turnsSideToLabel_2_1_3_1 = new JLabel();
		turnsSideToLabel_2_1_3_1.setText("Amblates in room");
		turnsSideToLabel_2_1_3_1.setBounds(10, 10, 111, 14);
		panel_8_2_1_3_1.add(turnsSideToLabel_2_1_3_1);

		final JPanel panel_9_6_1_3_1 = new JPanel();
		panel_9_6_1_3_1.setBackground(Color.WHITE);
		panel_9_6_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_3_1.setBounds(210, 0, 36, 32);
		panel_7_2_1_3_1.add(panel_9_6_1_3_1);

		final JRadioButton radioButton_3_1_3_1 = new JRadioButton();
		bgAmbulation21.add(radioButton_3_1_3_1);
		radioButton_3_1_3_1.setActionCommand("1");
		radioButton_3_1_3_1.setBackground(Color.WHITE);
		radioButton_3_1_3_1.setText("O");
		panel_9_6_1_3_1.add(radioButton_3_1_3_1);

		final JPanel panel_9_1_2_1_3_1 = new JPanel();
		panel_9_1_2_1_3_1.setBackground(Color.WHITE);
		panel_9_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_3_1.setBounds(245, 0, 36, 32);
		panel_7_2_1_3_1.add(panel_9_1_2_1_3_1);

		final JRadioButton sRadioButton_2_1_3_1 = new JRadioButton();
		bgAmbulation21.add(sRadioButton_2_1_3_1);
		sRadioButton_2_1_3_1.setActionCommand("2");
		sRadioButton_2_1_3_1.setBackground(Color.WHITE);
		sRadioButton_2_1_3_1.setText("S");
		panel_9_1_2_1_3_1.add(sRadioButton_2_1_3_1);

		final JPanel panel_9_2_2_1_3_1 = new JPanel();
		panel_9_2_2_1_3_1.setBackground(Color.WHITE);
		panel_9_2_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_3_1.setBounds(280, 0, 36, 32);
		panel_7_2_1_3_1.add(panel_9_2_2_1_3_1);

		final JRadioButton lRadioButton_2_1_3_1 = new JRadioButton();
		bgAmbulation21.add(lRadioButton_2_1_3_1);
		lRadioButton_2_1_3_1.setActionCommand("3");
		lRadioButton_2_1_3_1.setBackground(Color.WHITE);
		lRadioButton_2_1_3_1.setText("1");
		panel_9_2_2_1_3_1.add(lRadioButton_2_1_3_1);

		final JPanel panel_9_3_2_1_3_1 = new JPanel();
		panel_9_3_2_1_3_1.setBackground(Color.WHITE);
		panel_9_3_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_3_1.setBounds(315, 0, 36, 32);
		panel_7_2_1_3_1.add(panel_9_3_2_1_3_1);

		final JRadioButton eRadioButton_2_1_3_1 = new JRadioButton();
		bgAmbulation21.add(eRadioButton_2_1_3_1);
		eRadioButton_2_1_3_1.setActionCommand("4");
		eRadioButton_2_1_3_1.setBackground(Color.WHITE);
		eRadioButton_2_1_3_1.setText("2");
		panel_9_3_2_1_3_1.add(eRadioButton_2_1_3_1);

		final JPanel panel_9_4_3_1_3_1 = new JPanel();
		panel_9_4_3_1_3_1.setBackground(Color.WHITE);
		panel_9_4_3_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_3_1.setBounds(350, 0, 80, 32);
		panel_7_2_1_3_1.add(panel_9_4_3_1_3_1);

		final JRadioButton naRadioButton_17 = new JRadioButton();
		bgAmbulation21.add(naRadioButton_17);
		naRadioButton_17.setActionCommand("4");
		naRadioButton_17.setBackground(Color.WHITE);
		naRadioButton_17.setText("NA");
		panel_9_4_3_1_3_1.add(naRadioButton_17);

		final JPanel panel_7_1_2_1_2_1 = new JPanel();
		panel_7_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_2_1.setLayout(null);
		panel_7_1_2_1_2_1.setBounds(0, 31, 430, 32);
		panel_6_1_1_3_1.add(panel_7_1_2_1_2_1);

		final JPanel panel_8_1_2_1_2_1 = new JPanel();
		panel_8_1_2_1_2_1.setBackground(Color.WHITE);
		panel_8_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1.setLayout(null);
		panel_8_1_2_1_2_1.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_2_1.add(panel_8_1_2_1_2_1);

		final JLabel turnsSideToLabel_1_2_1_2_1 = new JLabel();
		turnsSideToLabel_1_2_1_2_1.setText("Ambulates in hallway");
		turnsSideToLabel_1_2_1_2_1.setBounds(10, 10, 111, 14);
		panel_8_1_2_1_2_1.add(turnsSideToLabel_1_2_1_2_1);

		final JPanel panel_9_5_2_1_2_1 = new JPanel();
		panel_9_5_2_1_2_1.setBackground(Color.WHITE);
		panel_9_5_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_2_1.setBounds(210, 0, 36, 32);
		panel_7_1_2_1_2_1.add(panel_9_5_2_1_2_1);

		final JRadioButton radioButton_2_2_1_2_1 = new JRadioButton();
		bgAmbulation22.add(radioButton_2_2_1_2_1);
		radioButton_2_2_1_2_1.setActionCommand("1");
		radioButton_2_2_1_2_1.setBackground(Color.WHITE);
		radioButton_2_2_1_2_1.setText("O");
		panel_9_5_2_1_2_1.add(radioButton_2_2_1_2_1);

		final JPanel panel_9_1_1_2_1_2_1 = new JPanel();
		panel_9_1_1_2_1_2_1.setBackground(Color.WHITE);
		panel_9_1_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_2_1.setBounds(245, 0, 36, 32);
		panel_7_1_2_1_2_1.add(panel_9_1_1_2_1_2_1);

		final JRadioButton sRadioButton_1_2_1_2_1 = new JRadioButton();
		bgAmbulation22.add(sRadioButton_1_2_1_2_1);
		sRadioButton_1_2_1_2_1.setActionCommand("2");
		sRadioButton_1_2_1_2_1.setBackground(Color.WHITE);
		sRadioButton_1_2_1_2_1.setText("S");
		panel_9_1_1_2_1_2_1.add(sRadioButton_1_2_1_2_1);

		final JPanel panel_9_2_1_2_1_2_1 = new JPanel();
		panel_9_2_1_2_1_2_1.setBackground(Color.WHITE);
		panel_9_2_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_2_1.setBounds(280, 0, 36, 32);
		panel_7_1_2_1_2_1.add(panel_9_2_1_2_1_2_1);

		final JRadioButton lRadioButton_1_2_1_2_1 = new JRadioButton();
		bgAmbulation22.add(lRadioButton_1_2_1_2_1);
		lRadioButton_1_2_1_2_1.setActionCommand("3");
		lRadioButton_1_2_1_2_1.setBackground(Color.WHITE);
		lRadioButton_1_2_1_2_1.setText("1");
		panel_9_2_1_2_1_2_1.add(lRadioButton_1_2_1_2_1);

		final JPanel panel_9_3_1_2_1_2_1 = new JPanel();
		panel_9_3_1_2_1_2_1.setBackground(Color.WHITE);
		panel_9_3_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_2_1.setBounds(315, 0, 36, 32);
		panel_7_1_2_1_2_1.add(panel_9_3_1_2_1_2_1);

		final JRadioButton eRadioButton_1_2_1_2_1 = new JRadioButton();
		bgAmbulation22.add(eRadioButton_1_2_1_2_1);
		eRadioButton_1_2_1_2_1.setActionCommand("4");
		eRadioButton_1_2_1_2_1.setBackground(Color.WHITE);
		eRadioButton_1_2_1_2_1.setText("2");
		panel_9_3_1_2_1_2_1.add(eRadioButton_1_2_1_2_1);

		final JPanel panel_9_4_2_2_1_2_1 = new JPanel();
		panel_9_4_2_2_1_2_1.setBackground(Color.WHITE);
		panel_9_4_2_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_2_1.setBounds(350, 0, 80, 32);
		panel_7_1_2_1_2_1.add(panel_9_4_2_2_1_2_1);

		final JRadioButton naRadioButton_18 = new JRadioButton();
		bgAmbulation22.add(naRadioButton_18);
		naRadioButton_18.setBackground(Color.WHITE);
		naRadioButton_18.setText("NA");
		panel_9_4_2_2_1_2_1.add(naRadioButton_18);

		final JPanel panel_7_1_1_1_1_2_1 = new JPanel();
		panel_7_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_1_2_1.setBounds(0, 62, 430, 32);
		panel_6_1_1_3_1.add(panel_7_1_1_1_1_2_1);

		final JPanel panel_8_1_1_1_1_2_1 = new JPanel();
		panel_8_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_2_1.setLayout(null);
		panel_8_1_1_1_1_2_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_2_1.add(panel_8_1_1_1_1_2_1);

		final JLabel turnsSideToLabel_1_1_1_1_2_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_2_1.setText("W/ C mobility in room");
		turnsSideToLabel_1_1_1_1_2_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_2_1.add(turnsSideToLabel_1_1_1_1_2_1);

		final JPanel panel_9_5_1_1_1_2_1 = new JPanel();
		panel_9_5_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_2_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_2_1.add(panel_9_5_1_1_1_2_1);

		final JRadioButton radioButton_2_1_1_1_2_1 = new JRadioButton();
		bgAmbulation23.add(radioButton_2_1_1_1_2_1);
		radioButton_2_1_1_1_2_1.setActionCommand("1");
		radioButton_2_1_1_1_2_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_2_1.setText("O");
		panel_9_5_1_1_1_2_1.add(radioButton_2_1_1_1_2_1);

		final JPanel panel_9_1_1_1_1_1_2_1 = new JPanel();
		panel_9_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_2_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_2_1.add(panel_9_1_1_1_1_1_2_1);

		final JRadioButton sRadioButton_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation23.add(sRadioButton_1_1_1_1_2_1);
		sRadioButton_1_1_1_1_2_1.setActionCommand("2");
		sRadioButton_1_1_1_1_2_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_2_1.setText("S");
		panel_9_1_1_1_1_1_2_1.add(sRadioButton_1_1_1_1_2_1);

		final JPanel panel_9_2_1_1_1_1_2_1 = new JPanel();
		panel_9_2_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_2_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_2_1.add(panel_9_2_1_1_1_1_2_1);

		final JRadioButton lRadioButton_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation23.add(lRadioButton_1_1_1_1_2_1);
		lRadioButton_1_1_1_1_2_1.setActionCommand("3");
		lRadioButton_1_1_1_1_2_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_2_1.setText("1");
		panel_9_2_1_1_1_1_2_1.add(lRadioButton_1_1_1_1_2_1);

		final JPanel panel_9_3_1_1_1_1_2_1 = new JPanel();
		panel_9_3_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_2_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_2_1.add(panel_9_3_1_1_1_1_2_1);

		final JRadioButton eRadioButton_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation23.add(eRadioButton_1_1_1_1_2_1);
		eRadioButton_1_1_1_1_2_1.setActionCommand("4");
		eRadioButton_1_1_1_1_2_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_2_1.setText("2");
		panel_9_3_1_1_1_1_2_1.add(eRadioButton_1_1_1_1_2_1);

		final JPanel panel_9_4_2_1_1_1_2_1 = new JPanel();
		panel_9_4_2_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_2_1.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_2_1.add(panel_9_4_2_1_1_1_2_1);

		final JRadioButton naRadioButton_19 = new JRadioButton();
		bgAmbulation23.add(naRadioButton_19);
		naRadioButton_19.setBackground(Color.WHITE);
		naRadioButton_19.setText("NA");
		panel_9_4_2_1_1_1_2_1.add(naRadioButton_19);

		final JPanel panel_7_1_1_1_1_1_2_1 = new JPanel();
		panel_7_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_1_1_2_1.setBounds(0, 113, 430, 32);
		panel_5_1_1_3_1.add(panel_7_1_1_1_1_1_2_1);

		final JPanel panel_8_1_1_1_1_1_2_1 = new JPanel();
		panel_8_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_2_1.setLayout(null);
		panel_8_1_1_1_1_1_2_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_8_1_1_1_1_1_2_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_2_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_2_1.setText("W/ C mobility in hallway");
		turnsSideToLabel_1_1_1_1_1_2_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_2_1.add(turnsSideToLabel_1_1_1_1_1_2_1);

		final JPanel panel_9_5_1_1_1_1_2_1 = new JPanel();
		panel_9_5_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_2_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_9_5_1_1_1_1_2_1);

		final JRadioButton radioButton_2_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation24.add(radioButton_2_1_1_1_1_2_1);
		radioButton_2_1_1_1_1_2_1.setActionCommand("1");
		radioButton_2_1_1_1_1_2_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_2_1.setText("O");
		panel_9_5_1_1_1_1_2_1.add(radioButton_2_1_1_1_1_2_1);

		final JPanel panel_9_1_1_1_1_1_1_2_1 = new JPanel();
		panel_9_1_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_2_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_9_1_1_1_1_1_1_2_1);

		final JRadioButton sRadioButton_1_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation24.add(sRadioButton_1_1_1_1_1_2_1);
		sRadioButton_1_1_1_1_1_2_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_2_1.setText("S");
		panel_9_1_1_1_1_1_1_2_1.add(sRadioButton_1_1_1_1_1_2_1);

		final JPanel panel_9_2_1_1_1_1_1_2_1 = new JPanel();
		panel_9_2_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_2_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_9_2_1_1_1_1_1_2_1);

		final JRadioButton lRadioButton_1_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation24.add(lRadioButton_1_1_1_1_1_2_1);
		lRadioButton_1_1_1_1_1_2_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_2_1.setText("1");
		panel_9_2_1_1_1_1_1_2_1.add(lRadioButton_1_1_1_1_1_2_1);

		final JPanel panel_9_3_1_1_1_1_1_2_1 = new JPanel();
		panel_9_3_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_2_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_9_3_1_1_1_1_1_2_1);

		final JRadioButton eRadioButton_1_1_1_1_1_2_1 = new JRadioButton();
		bgAmbulation24.add(eRadioButton_1_1_1_1_1_2_1);
		eRadioButton_1_1_1_1_1_2_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_2_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_2_1.setText("2");
		panel_9_3_1_1_1_1_1_2_1.add(eRadioButton_1_1_1_1_1_2_1);

		final JPanel panel_9_4_2_1_1_1_1_2_1 = new JPanel();
		panel_9_4_2_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_2_1.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_2_1.add(panel_9_4_2_1_1_1_1_2_1);

		final JRadioButton naRadioButton_20 = new JRadioButton();
		bgAmbulation24.add(naRadioButton_20);
		naRadioButton_20.setBackground(Color.WHITE);
		naRadioButton_20.setText("NA");
		panel_9_4_2_1_1_1_1_2_1.add(naRadioButton_20);

		final JPanel panel_5_1_1_4_1 = new JPanel();
		panel_5_1_1_4_1.setBackground(Color.WHITE);
		panel_5_1_1_4_1.setLayout(null);
		panel_5_1_1_4_1.setBounds(0, 716, 430, 177);
		panel_4_1.add(panel_5_1_1_4_1);

		final JLabel bedMobilityLabel_1_1_4_1 = new JLabel();
		bedMobilityLabel_1_1_4_1.setText("<html><u>Grooming :</u></html>");
		bedMobilityLabel_1_1_4_1.setBounds(5, 0, 81, 14);
		panel_5_1_1_4_1.add(bedMobilityLabel_1_1_4_1);

		final JPanel panel_6_1_1_4_1 = new JPanel();
		panel_6_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_4_1.setLayout(null);
		panel_6_1_1_4_1.setBounds(0, 20, 430, 94);
		panel_5_1_1_4_1.add(panel_6_1_1_4_1);

		final JPanel panel_7_2_1_4_1 = new JPanel();
		panel_7_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_4_1.setLayout(null);
		panel_7_2_1_4_1.setBounds(0, 0, 430, 32);
		panel_6_1_1_4_1.add(panel_7_2_1_4_1);

		final JPanel panel_8_2_1_4_1 = new JPanel();
		panel_8_2_1_4_1.setBackground(Color.WHITE);
		panel_8_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_4_1.setLayout(null);
		panel_8_2_1_4_1.setBounds(0, 0, 211, 32);
		panel_7_2_1_4_1.add(panel_8_2_1_4_1);

		final JLabel turnsSideToLabel_2_1_4_1 = new JLabel();
		turnsSideToLabel_2_1_4_1.setText("Combs hair");
		turnsSideToLabel_2_1_4_1.setBounds(10, 10, 111, 14);
		panel_8_2_1_4_1.add(turnsSideToLabel_2_1_4_1);

		final JPanel panel_9_6_1_4_1 = new JPanel();
		panel_9_6_1_4_1.setBackground(Color.WHITE);
		panel_9_6_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_4_1.setBounds(210, 0, 36, 32);
		panel_7_2_1_4_1.add(panel_9_6_1_4_1);

		final JRadioButton radioButton_3_1_4_1 = new JRadioButton();
		bggrooming21.add(radioButton_3_1_4_1);
		radioButton_3_1_4_1.setActionCommand("1");
		radioButton_3_1_4_1.setBackground(Color.WHITE);
		radioButton_3_1_4_1.setText("O");
		panel_9_6_1_4_1.add(radioButton_3_1_4_1);

		final JPanel panel_9_1_2_1_4_1 = new JPanel();
		panel_9_1_2_1_4_1.setBackground(Color.WHITE);
		panel_9_1_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_4_1.setBounds(245, 0, 36, 32);
		panel_7_2_1_4_1.add(panel_9_1_2_1_4_1);

		final JRadioButton sRadioButton_2_1_4_1 = new JRadioButton();
		bggrooming21.add(sRadioButton_2_1_4_1);
		sRadioButton_2_1_4_1.setActionCommand("2");
		sRadioButton_2_1_4_1.setBackground(Color.WHITE);
		sRadioButton_2_1_4_1.setText("S");
		panel_9_1_2_1_4_1.add(sRadioButton_2_1_4_1);

		final JPanel panel_9_2_2_1_4_1 = new JPanel();
		panel_9_2_2_1_4_1.setBackground(Color.WHITE);
		panel_9_2_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_9_2_2_1_4_1.setLayout(flowLayout_1);
		panel_9_2_2_1_4_1.setBounds(280, 0, 36, 32);
		panel_7_2_1_4_1.add(panel_9_2_2_1_4_1);

		final JRadioButton lRadioButton_2_1_4_1 = new JRadioButton();
		bggrooming21.add(lRadioButton_2_1_4_1);
		lRadioButton_2_1_4_1.setActionCommand("3");
		lRadioButton_2_1_4_1.setBackground(Color.WHITE);
		lRadioButton_2_1_4_1.setMargin(new Insets(2, 0, 2, 2));
		lRadioButton_2_1_4_1.setText("1");
		panel_9_2_2_1_4_1.add(lRadioButton_2_1_4_1);

		final JPanel panel_9_3_2_1_4_1 = new JPanel();
		panel_9_3_2_1_4_1.setBackground(Color.WHITE);
		panel_9_3_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_2_1_4_1.setBounds(315, 0, 36, 32);
		panel_7_2_1_4_1.add(panel_9_3_2_1_4_1);

		final JRadioButton eRadioButton_2_1_4_1 = new JRadioButton();
		bggrooming21.add(eRadioButton_2_1_4_1);
		eRadioButton_2_1_4_1.setActionCommand("4");
		eRadioButton_2_1_4_1.setBackground(Color.WHITE);
		eRadioButton_2_1_4_1.setText("2");
		panel_9_3_2_1_4_1.add(eRadioButton_2_1_4_1);

		final JPanel panel_9_4_3_1_4_1 = new JPanel();
		panel_9_4_3_1_4_1.setBackground(Color.WHITE);
		panel_9_4_3_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_3_1_4_1.setBounds(350, 0, 80, 32);
		panel_7_2_1_4_1.add(panel_9_4_3_1_4_1);

		final JRadioButton naRadioButton_21 = new JRadioButton();
		bggrooming21.add(naRadioButton_21);
		naRadioButton_21.setActionCommand("5");
		naRadioButton_21.setBackground(Color.WHITE);
		naRadioButton_21.setText("NA");
		panel_9_4_3_1_4_1.add(naRadioButton_21);

		final JPanel panel_7_1_2_1_3_1 = new JPanel();
		panel_7_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_3_1.setLayout(null);
		panel_7_1_2_1_3_1.setBounds(0, 31, 430, 32);
		panel_6_1_1_4_1.add(panel_7_1_2_1_3_1);

		final JPanel panel_8_1_2_1_3_1 = new JPanel();
		panel_8_1_2_1_3_1.setBackground(Color.WHITE);
		panel_8_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_3_1.setLayout(null);
		panel_8_1_2_1_3_1.setBounds(0, 0, 211, 32);
		panel_7_1_2_1_3_1.add(panel_8_1_2_1_3_1);

		final JLabel turnsSideToLabel_1_2_1_3_1 = new JLabel();
		turnsSideToLabel_1_2_1_3_1.setText("Brushes teeth / dentures");
		turnsSideToLabel_1_2_1_3_1.setBounds(10, 10, 163, 14);
		panel_8_1_2_1_3_1.add(turnsSideToLabel_1_2_1_3_1);

		final JPanel panel_9_5_2_1_3_1 = new JPanel();
		panel_9_5_2_1_3_1.setBackground(Color.WHITE);
		panel_9_5_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_2_1_3_1.setBounds(210, 0, 36, 32);
		panel_7_1_2_1_3_1.add(panel_9_5_2_1_3_1);

		final JRadioButton radioButton_2_2_1_3_1 = new JRadioButton();
		bggrooming22.add(radioButton_2_2_1_3_1);
		radioButton_2_2_1_3_1.setActionCommand("1");
		radioButton_2_2_1_3_1.setBackground(Color.WHITE);
		radioButton_2_2_1_3_1.setText("O");
		panel_9_5_2_1_3_1.add(radioButton_2_2_1_3_1);

		final JPanel panel_9_1_1_2_1_3_1 = new JPanel();
		panel_9_1_1_2_1_3_1.setBackground(Color.WHITE);
		panel_9_1_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_2_1_3_1.setBounds(245, 0, 36, 32);
		panel_7_1_2_1_3_1.add(panel_9_1_1_2_1_3_1);

		final JRadioButton sRadioButton_1_2_1_3_1 = new JRadioButton();
		bggrooming22.add(sRadioButton_1_2_1_3_1);
		sRadioButton_1_2_1_3_1.setActionCommand("2");
		sRadioButton_1_2_1_3_1.setBackground(Color.WHITE);
		sRadioButton_1_2_1_3_1.setText("S");
		panel_9_1_1_2_1_3_1.add(sRadioButton_1_2_1_3_1);

		final JPanel panel_9_2_1_2_1_3_1 = new JPanel();
		panel_9_2_1_2_1_3_1.setBackground(Color.WHITE);
		panel_9_2_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2_1_3_1.setBounds(280, 0, 36, 32);
		panel_7_1_2_1_3_1.add(panel_9_2_1_2_1_3_1);

		final JRadioButton lRadioButton_1_2_1_3_1 = new JRadioButton();
		bggrooming22.add(lRadioButton_1_2_1_3_1);
		lRadioButton_1_2_1_3_1.setActionCommand("3");
		lRadioButton_1_2_1_3_1.setBackground(Color.WHITE);
		lRadioButton_1_2_1_3_1.setText("1");
		panel_9_2_1_2_1_3_1.add(lRadioButton_1_2_1_3_1);

		final JPanel panel_9_3_1_2_1_3_1 = new JPanel();
		panel_9_3_1_2_1_3_1.setBackground(Color.WHITE);
		panel_9_3_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_2_1_3_1.setBounds(315, 0, 36, 32);
		panel_7_1_2_1_3_1.add(panel_9_3_1_2_1_3_1);

		final JRadioButton eRadioButton_1_2_1_3_1 = new JRadioButton();
		bggrooming22.add(eRadioButton_1_2_1_3_1);
		eRadioButton_1_2_1_3_1.setActionCommand("4");
		eRadioButton_1_2_1_3_1.setBackground(Color.WHITE);
		eRadioButton_1_2_1_3_1.setText("2");
		panel_9_3_1_2_1_3_1.add(eRadioButton_1_2_1_3_1);

		final JPanel panel_9_4_2_2_1_3_1 = new JPanel();
		panel_9_4_2_2_1_3_1.setBackground(Color.WHITE);
		panel_9_4_2_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_2_1_3_1.setBounds(350, 0, 80, 32);
		panel_7_1_2_1_3_1.add(panel_9_4_2_2_1_3_1);

		final JRadioButton naRadioButton_22 = new JRadioButton();
		bggrooming22.add(naRadioButton_22);
		naRadioButton_22.setActionCommand("5");
		naRadioButton_22.setBackground(Color.WHITE);
		naRadioButton_22.setText("NA");
		panel_9_4_2_2_1_3_1.add(naRadioButton_22);

		final JPanel panel_7_1_1_1_1_3_1 = new JPanel();
		panel_7_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_3_1.setLayout(null);
		panel_7_1_1_1_1_3_1.setBounds(0, 62, 430, 32);
		panel_6_1_1_4_1.add(panel_7_1_1_1_1_3_1);

		final JPanel panel_8_1_1_1_1_3_1 = new JPanel();
		panel_8_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_3_1.setLayout(null);
		panel_8_1_1_1_1_3_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_3_1.add(panel_8_1_1_1_1_3_1);

		final JLabel turnsSideToLabel_1_1_1_1_3_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_3_1.setText("Shaves");
		turnsSideToLabel_1_1_1_1_3_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_3_1.add(turnsSideToLabel_1_1_1_1_3_1);

		final JPanel panel_9_5_1_1_1_3_1 = new JPanel();
		panel_9_5_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_3_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_3_1.add(panel_9_5_1_1_1_3_1);

		final JRadioButton radioButton_2_1_1_1_3_1 = new JRadioButton();
		bggrooming23.add(radioButton_2_1_1_1_3_1);
		radioButton_2_1_1_1_3_1.setActionCommand("1");
		radioButton_2_1_1_1_3_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_3_1.setText("O");
		panel_9_5_1_1_1_3_1.add(radioButton_2_1_1_1_3_1);

		final JPanel panel_9_1_1_1_1_1_3_1 = new JPanel();
		panel_9_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_3_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_3_1.add(panel_9_1_1_1_1_1_3_1);

		final JRadioButton sRadioButton_1_1_1_1_3_1 = new JRadioButton();
		bggrooming23.add(sRadioButton_1_1_1_1_3_1);
		sRadioButton_1_1_1_1_3_1.setActionCommand("2");
		sRadioButton_1_1_1_1_3_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_3_1.setText("S");
		panel_9_1_1_1_1_1_3_1.add(sRadioButton_1_1_1_1_3_1);

		final JPanel panel_9_2_1_1_1_1_3_1 = new JPanel();
		panel_9_2_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_3_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_3_1.add(panel_9_2_1_1_1_1_3_1);

		final JRadioButton lRadioButton_1_1_1_1_3_1 = new JRadioButton();
		bggrooming23.add(lRadioButton_1_1_1_1_3_1);
		lRadioButton_1_1_1_1_3_1.setActionCommand("3");
		lRadioButton_1_1_1_1_3_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_3_1.setText("1");
		panel_9_2_1_1_1_1_3_1.add(lRadioButton_1_1_1_1_3_1);

		final JPanel panel_9_3_1_1_1_1_3_1 = new JPanel();
		panel_9_3_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_3_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_3_1.add(panel_9_3_1_1_1_1_3_1);

		final JRadioButton eRadioButton_1_1_1_1_3_1 = new JRadioButton();
		bggrooming23.add(eRadioButton_1_1_1_1_3_1);
		eRadioButton_1_1_1_1_3_1.setActionCommand("4");
		eRadioButton_1_1_1_1_3_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_3_1.setText("2");
		panel_9_3_1_1_1_1_3_1.add(eRadioButton_1_1_1_1_3_1);

		final JPanel panel_9_4_2_1_1_1_3_1 = new JPanel();
		panel_9_4_2_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_3_1.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_3_1.add(panel_9_4_2_1_1_1_3_1);

		final JRadioButton naRadioButton_23 = new JRadioButton();
		bggrooming23.add(naRadioButton_23);
		naRadioButton_23.setActionCommand("5");
		naRadioButton_23.setBackground(Color.WHITE);
		naRadioButton_23.setText("NA");
		panel_9_4_2_1_1_1_3_1.add(naRadioButton_23);

		final JPanel panel_7_1_1_1_1_1_3_1 = new JPanel();
		panel_7_1_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_3_1.setLayout(null);
		panel_7_1_1_1_1_1_3_1.setBounds(0, 113, 430, 32);
		panel_5_1_1_4_1.add(panel_7_1_1_1_1_1_3_1);

		final JPanel panel_8_1_1_1_1_1_3_1 = new JPanel();
		panel_8_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_3_1.setLayout(null);
		panel_8_1_1_1_1_1_3_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_8_1_1_1_1_1_3_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_3_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_3_1.setText("Applies Make up");
		turnsSideToLabel_1_1_1_1_1_3_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_3_1.add(turnsSideToLabel_1_1_1_1_1_3_1);

		final JPanel panel_9_5_1_1_1_1_3_1 = new JPanel();
		panel_9_5_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_3_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_9_5_1_1_1_1_3_1);

		final JRadioButton radioButton_2_1_1_1_1_3_1 = new JRadioButton();
		bggrooming24.add(radioButton_2_1_1_1_1_3_1);
		radioButton_2_1_1_1_1_3_1.setActionCommand("1");
		radioButton_2_1_1_1_1_3_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_3_1.setText("O");
		panel_9_5_1_1_1_1_3_1.add(radioButton_2_1_1_1_1_3_1);

		final JPanel panel_9_1_1_1_1_1_1_3_1 = new JPanel();
		panel_9_1_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_3_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_3_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_9_1_1_1_1_1_1_3_1);

		final JRadioButton sRadioButton_1_1_1_1_1_3_1 = new JRadioButton();
		bggrooming24.add(sRadioButton_1_1_1_1_1_3_1);
		sRadioButton_1_1_1_1_1_3_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_3_1.setText("S");
		panel_9_1_1_1_1_1_1_3_1.add(sRadioButton_1_1_1_1_1_3_1);

		final JPanel panel_9_2_1_1_1_1_1_3_1 = new JPanel();
		panel_9_2_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_3_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1_3_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_9_2_1_1_1_1_1_3_1);

		final JRadioButton lRadioButton_1_1_1_1_1_3_1 = new JRadioButton();
		bggrooming24.add(lRadioButton_1_1_1_1_1_3_1);
		lRadioButton_1_1_1_1_1_3_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_3_1.setText("1");
		panel_9_2_1_1_1_1_1_3_1.add(lRadioButton_1_1_1_1_1_3_1);

		final JPanel panel_9_3_1_1_1_1_1_3_1 = new JPanel();
		panel_9_3_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_3_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1_1_1_1_3_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_9_3_1_1_1_1_1_3_1);

		final JRadioButton eRadioButton_1_1_1_1_1_3_1 = new JRadioButton();
		bggrooming24.add(eRadioButton_1_1_1_1_1_3_1);
		eRadioButton_1_1_1_1_1_3_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_3_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_3_1.setText("2");
		panel_9_3_1_1_1_1_1_3_1.add(eRadioButton_1_1_1_1_1_3_1);

		final JPanel panel_9_4_2_1_1_1_1_3_1 = new JPanel();
		panel_9_4_2_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_3_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_2_1_1_1_1_3_1.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_3_1.add(panel_9_4_2_1_1_1_1_3_1);

		final JRadioButton naRadioButton_24 = new JRadioButton();
		bggrooming24.add(naRadioButton_24);
		naRadioButton_24.setActionCommand("5");
		naRadioButton_24.setBackground(Color.WHITE);
		naRadioButton_24.setText("NA");
		panel_9_4_2_1_1_1_1_3_1.add(naRadioButton_24);

		final JPanel panel_7_1_1_1_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_1_1_1_2.setBounds(0, 144, 430, 32);
		panel_5_1_1_4_1.add(panel_7_1_1_1_1_1_1_1_2);

		final JPanel panel_8_1_1_1_1_1_1_1_2 = new JPanel();
		panel_8_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_2.setLayout(null);
		panel_8_1_1_1_1_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1_2.setText("Wash / dry face");
		turnsSideToLabel_1_1_1_1_1_1_1_2.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_1_2.add(turnsSideToLabel_1_1_1_1_1_1_1_2);

		final JPanel panel_9_5_1_1_1_1_1_1_2 = new JPanel();
		panel_9_5_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1_1_1_1_1_2.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_9_5_1_1_1_1_1_1_2);

		final JRadioButton radioButton_2_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming25.add(radioButton_2_1_1_1_1_1_1_2);
		radioButton_2_1_1_1_1_1_1_2.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_1_1_2.setText("O");
		panel_9_5_1_1_1_1_1_1_2.add(radioButton_2_1_1_1_1_1_1_2);

		final JPanel panel_9_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming25.add(sRadioButton_1_1_1_1_1_1_1_2);
		sRadioButton_1_1_1_1_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_1_1_2.setText("S");
		panel_9_1_1_1_1_1_1_1_1_2.add(sRadioButton_1_1_1_1_1_1_1_2);

		final JPanel panel_9_2_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_1_1_1_1_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_9_2_1_1_1_1_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming25.add(lRadioButton_1_1_1_1_1_1_1_2);
		lRadioButton_1_1_1_1_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_1_1_2.setText("1");
		panel_9_2_1_1_1_1_1_1_1_2.add(lRadioButton_1_1_1_1_1_1_1_2);

		final JPanel panel_9_3_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_3_1_1_1_1_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_9_3_1_1_1_1_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming25.add(eRadioButton_1_1_1_1_1_1_1_2);
		eRadioButton_1_1_1_1_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_1_1_2.setText("2");
		panel_9_3_1_1_1_1_1_1_1_2.add(eRadioButton_1_1_1_1_1_1_1_2);

		final JPanel panel_9_4_2_1_1_1_1_1_1_2 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_2_1_1_1_1_1_1_2.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_1_1_2.add(panel_9_4_2_1_1_1_1_1_1_2);

		final JRadioButton naRadioButton_25 = new JRadioButton();
		bggrooming25.add(naRadioButton_25);
		naRadioButton_25.setActionCommand("5");
		naRadioButton_25.setBackground(Color.WHITE);
		naRadioButton_25.setText("NA");
		panel_9_4_2_1_1_1_1_1_1_2.add(naRadioButton_25);

		final JPanel panel_7_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_1_1_1_1_2.setBounds(0, 922, 430, 32);
		panel_4_1.add(panel_7_1_1_1_1_1_1_1_1_2);

		final JPanel panel_8_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_8_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_2.setLayout(null);
		panel_8_1_1_1_1_1_1_1_1_2.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_1_1_2);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1_1_2 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1_1_2.setText("Wash / dry perineum");
		turnsSideToLabel_1_1_1_1_1_1_1_1_2.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_1_1_2.add(turnsSideToLabel_1_1_1_1_1_1_1_1_2);

		final JPanel panel_9_5_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_5_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_5_1_1_1_1_1_1_1_2.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_9_5_1_1_1_1_1_1_1_2);

		final JRadioButton radioButton_2_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming27.add(radioButton_2_1_1_1_1_1_1_1_2);
		radioButton_2_1_1_1_1_1_1_1_2.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_1_1_1_2.setText("O");
		panel_9_5_1_1_1_1_1_1_1_2.add(radioButton_2_1_1_1_1_1_1_1_2);

		final JPanel panel_9_1_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_2.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_1_1_2);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming27.add(sRadioButton_1_1_1_1_1_1_1_1_2);
		sRadioButton_1_1_1_1_1_1_1_1_2.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_1_1_1_2.setText("S");
		panel_9_1_1_1_1_1_1_1_1_1_2.add(sRadioButton_1_1_1_1_1_1_1_1_2);

		final JPanel panel_9_2_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_1_1_1_1_1_1_1_1_2.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_9_2_1_1_1_1_1_1_1_1_2);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming27.add(lRadioButton_1_1_1_1_1_1_1_1_2);
		lRadioButton_1_1_1_1_1_1_1_1_2.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_1_1_1_2.setText("1");
		panel_9_2_1_1_1_1_1_1_1_1_2.add(lRadioButton_1_1_1_1_1_1_1_1_2);

		final JPanel panel_9_3_1_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_3_1_1_1_1_1_1_1_1_2.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_9_3_1_1_1_1_1_1_1_1_2);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1_1_2 = new JRadioButton();
		bggrooming27.add(eRadioButton_1_1_1_1_1_1_1_1_2);
		eRadioButton_1_1_1_1_1_1_1_1_2.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_1_1_1_2.setText("2");
		panel_9_3_1_1_1_1_1_1_1_1_2.add(eRadioButton_1_1_1_1_1_1_1_1_2);

		final JPanel panel_9_4_2_1_1_1_1_1_1_1_2 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_2_1_1_1_1_1_1_1_2.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_1_1_1_2.add(panel_9_4_2_1_1_1_1_1_1_1_2);

		final JRadioButton naRadioButton_27 = new JRadioButton();
		bggrooming27.add(naRadioButton_27);
		naRadioButton_27.setActionCommand("5");
		naRadioButton_27.setBackground(Color.WHITE);
		naRadioButton_27.setText("NA");
		panel_9_4_2_1_1_1_1_1_1_1_2.add(naRadioButton_27);

		final JPanel panel_7_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1_1_1_1_1.setBounds(0, 891, 430, 32);
		panel_4_1.add(panel_7_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_8_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_8_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 211, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1_1);

		final JLabel turnsSideToLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		turnsSideToLabel_1_1_1_1_1_1_1_1_1_1.setText("Wash / dry hands");
		turnsSideToLabel_1_1_1_1_1_1_1_1_1_1.setBounds(10, 10, 175, 14);
		panel_8_1_1_1_1_1_1_1_1_1_1.add(turnsSideToLabel_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_5_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_5_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_5_1_1_1_1_1_1_1_1_1.setBounds(210, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_9_5_1_1_1_1_1_1_1_1_1);

		final JRadioButton radioButton_2_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bggrooming26.add(radioButton_2_1_1_1_1_1_1_1_1_1);
		radioButton_2_1_1_1_1_1_1_1_1_1.setActionCommand("1");
		radioButton_2_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		radioButton_2_1_1_1_1_1_1_1_1_1.setText("O");
		panel_9_5_1_1_1_1_1_1_1_1_1.add(radioButton_2_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_1_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setBounds(245, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1_1_1);

		final JRadioButton sRadioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bggrooming26.add(sRadioButton_1_1_1_1_1_1_1_1_1_1);
		sRadioButton_1_1_1_1_1_1_1_1_1_1.setActionCommand("2");
		sRadioButton_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		sRadioButton_1_1_1_1_1_1_1_1_1_1.setText("S");
		panel_9_1_1_1_1_1_1_1_1_1_1_1.add(sRadioButton_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_2_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_2_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_1_1_1_1_1_1_1_1_1_1.setBounds(280, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_9_2_1_1_1_1_1_1_1_1_1_1);

		final JRadioButton lRadioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bggrooming26.add(lRadioButton_1_1_1_1_1_1_1_1_1_1);
		lRadioButton_1_1_1_1_1_1_1_1_1_1.setActionCommand("3");
		lRadioButton_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		lRadioButton_1_1_1_1_1_1_1_1_1_1.setText("1");
		panel_9_2_1_1_1_1_1_1_1_1_1_1.add(lRadioButton_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_3_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_3_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_3_1_1_1_1_1_1_1_1_1_1.setBounds(315, 0, 36, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_9_3_1_1_1_1_1_1_1_1_1_1);

		final JRadioButton eRadioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton();
		bggrooming26.add(eRadioButton_1_1_1_1_1_1_1_1_1_1);
		eRadioButton_1_1_1_1_1_1_1_1_1_1.setActionCommand("4");
		eRadioButton_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		eRadioButton_1_1_1_1_1_1_1_1_1_1.setText("2");
		panel_9_3_1_1_1_1_1_1_1_1_1_1.add(eRadioButton_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_9_4_2_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_9_4_2_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_9_4_2_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_4_2_1_1_1_1_1_1_1_1_1.setBounds(350, 0, 80, 32);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(panel_9_4_2_1_1_1_1_1_1_1_1_1);

		final JRadioButton naRadioButton_26 = new JRadioButton();
		bggrooming26.add(naRadioButton_26);
		naRadioButton_26.setActionCommand("5");
		naRadioButton_26.setBackground(Color.WHITE);
		naRadioButton_26.setText("NA");
		panel_9_4_2_1_1_1_1_1_1_1_1_1.add(naRadioButton_26);

		doLoad();
	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {

		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MonthlySummaryPage3 refMonthlySummaryPage3 = new MonthlySummaryPage3();
		refMonthlySummaryPage3.setSerial(Global.currentMonthlySummaryPage3Key);
		refMonthlySummaryPage3.setFormId(msr);
		refMonthlySummaryPage3.setResidentId(Global.currentResidenceKey);

		refMonthlySummaryPage3.setSignature((String) cmbSignature
				.getSelectedItem());
		refMonthlySummaryPage3.setVitalSigns(txtVitalSigns.getText());
		refMonthlySummaryPage3.setAreaComments(txtAreaComments.getText());
		refMonthlySummaryPage3.setDate(dcDate.getDate());
		refMonthlySummaryPage3.setBed11(SwingUtils.getSelectedButton(bgBed11));
		refMonthlySummaryPage3.setBed12(SwingUtils.getSelectedButton(bgBed12));
		refMonthlySummaryPage3.setBed13(SwingUtils.getSelectedButton(bgBed13));
		refMonthlySummaryPage3.setBed21(SwingUtils.getSelectedButton(bgBed21));
		refMonthlySummaryPage3.setBed22(SwingUtils.getSelectedButton(bgBed22));
		refMonthlySummaryPage3.setBed23(SwingUtils.getSelectedButton(bgBed23));
		refMonthlySummaryPage3.setTransfer11(SwingUtils
				.getSelectedButton(bgTransfer11));
		refMonthlySummaryPage3.setTransfer12(SwingUtils
				.getSelectedButton(bgTransfer12));
		refMonthlySummaryPage3.setTransfer13(SwingUtils
				.getSelectedButton(bgTransfer13));
		refMonthlySummaryPage3.setTransfer21(SwingUtils
				.getSelectedButton(bgTransfer21));
		refMonthlySummaryPage3.setTransfer22(SwingUtils
				.getSelectedButton(bgTransfer22));
		refMonthlySummaryPage3.setTransfer23(SwingUtils
				.getSelectedButton(bgTransfer23));
		refMonthlySummaryPage3.setToileting11(SwingUtils
				.getSelectedButton(bgToileting11));
		refMonthlySummaryPage3.setToileting12(SwingUtils
				.getSelectedButton(bgToileting12));
		refMonthlySummaryPage3.setToileting13(SwingUtils
				.getSelectedButton(bgToileting13));
		refMonthlySummaryPage3.setToileting14(SwingUtils
				.getSelectedButton(bgToileting14));
		refMonthlySummaryPage3.setToileting15(SwingUtils
				.getSelectedButton(bgToileting15));
		refMonthlySummaryPage3.setToileting21(SwingUtils
				.getSelectedButton(bgToileting21));
		refMonthlySummaryPage3.setToileting22(SwingUtils
				.getSelectedButton(bgToileting22));
		refMonthlySummaryPage3.setToileting23(SwingUtils
				.getSelectedButton(bgToileting23));
		refMonthlySummaryPage3.setToileting24(SwingUtils
				.getSelectedButton(bgToileting24));
		refMonthlySummaryPage3.setToileting25(SwingUtils
				.getSelectedButton(bgToileting25));
		refMonthlySummaryPage3.setEating11(SwingUtils
				.getSelectedButton(bgEating11));
		refMonthlySummaryPage3.setEating21(SwingUtils
				.getSelectedButton(bgEating21));
		refMonthlySummaryPage3.setDressing11(SwingUtils
				.getSelectedButton(bgDressing11));
		refMonthlySummaryPage3.setDressing12(SwingUtils
				.getSelectedButton(bgDressing12));
		refMonthlySummaryPage3.setDressing21(SwingUtils
				.getSelectedButton(bgDressing21));
		refMonthlySummaryPage3.setDressing22(SwingUtils
				.getSelectedButton(bgDressing22));
		refMonthlySummaryPage3.setAmbulation11(SwingUtils
				.getSelectedButton(bgAmbulation11));
		refMonthlySummaryPage3.setAmbulation12(SwingUtils
				.getSelectedButton(bgAmbulation12));
		refMonthlySummaryPage3.setAmbulation13(SwingUtils
				.getSelectedButton(bgAmbulation13));
		refMonthlySummaryPage3.setAmbulation14(SwingUtils
				.getSelectedButton(bgAmbulation14));
		refMonthlySummaryPage3.setAmbulation21(SwingUtils
				.getSelectedButton(bgAmbulation21));
		refMonthlySummaryPage3.setAmbulation22(SwingUtils
				.getSelectedButton(bgAmbulation22));
		refMonthlySummaryPage3.setAmbulation23(SwingUtils
				.getSelectedButton(bgAmbulation23));
		refMonthlySummaryPage3.setAmbulation24(SwingUtils
				.getSelectedButton(bgAmbulation24));
		refMonthlySummaryPage3.setGrooming11(SwingUtils
				.getSelectedButton(bgGrooming11));
		refMonthlySummaryPage3.setGrooming12(SwingUtils
				.getSelectedButton(bgGrooming12));
		refMonthlySummaryPage3.setGrooming13(SwingUtils
				.getSelectedButton(bgGrooming13));
		refMonthlySummaryPage3.setGrooming14(SwingUtils
				.getSelectedButton(bgGrooming14));
		refMonthlySummaryPage3.setGrooming15(SwingUtils
				.getSelectedButton(bgGrooming15));
		refMonthlySummaryPage3.setGrooming16(SwingUtils
				.getSelectedButton(bgGrooming16));
		refMonthlySummaryPage3.setGrooming17(SwingUtils
				.getSelectedButton(bgGrooming17));
		refMonthlySummaryPage3.setGrooming21(SwingUtils
				.getSelectedButton(bggrooming21));
		refMonthlySummaryPage3.setGrooming22(SwingUtils
				.getSelectedButton(bggrooming22));
		refMonthlySummaryPage3.setGrooming23(SwingUtils
				.getSelectedButton(bggrooming23));
		refMonthlySummaryPage3.setGrooming24(SwingUtils
				.getSelectedButton(bggrooming24));
		refMonthlySummaryPage3.setGrooming25(SwingUtils
				.getSelectedButton(bggrooming25));
		refMonthlySummaryPage3.setGrooming26(SwingUtils
				.getSelectedButton(bggrooming26));
		refMonthlySummaryPage3.setGrooming27(SwingUtils
				.getSelectedButton(bggrooming27));

		try {
			Global.currentMonthlySummaryPage3Key = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryPage3(
							refMonthlySummaryPage3);
		} catch (Exception e) {
		}

		return 0;
	}

	public void doUpdate() {
		MonthlySummaryPage3 refMonthlySummaryPage3 = null;

		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryPage3Key != 0) {
			try {
				msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryPage3 = MedrexClientManager.getInstance()
						.getMonthlySummaryPage3(msr);
			} catch (Exception e) {

			}
			cmbSignature.setSelectedItem(refMonthlySummaryPage3.getSignature());
			txtVitalSigns.setText(refMonthlySummaryPage3.getVitalSigns());
			txtAreaComments.setText(refMonthlySummaryPage3.getAreaComments());
			dcDate.setDate(refMonthlySummaryPage3.getDate());
			SwingUtils.setSelectedButton(bgBed11, refMonthlySummaryPage3
					.getBed11());
			SwingUtils.setSelectedButton(bgBed12, refMonthlySummaryPage3
					.getBed12());
			SwingUtils.setSelectedButton(bgBed13, refMonthlySummaryPage3
					.getBed13());
			SwingUtils.setSelectedButton(bgBed21, refMonthlySummaryPage3
					.getBed21());
			SwingUtils.setSelectedButton(bgBed22, refMonthlySummaryPage3
					.getBed22());
			SwingUtils.setSelectedButton(bgBed23, refMonthlySummaryPage3
					.getBed23());
			SwingUtils.setSelectedButton(bgTransfer11, refMonthlySummaryPage3
					.getTransfer11());
			SwingUtils.setSelectedButton(bgTransfer12, refMonthlySummaryPage3
					.getTransfer12());
			SwingUtils.setSelectedButton(bgTransfer13, refMonthlySummaryPage3
					.getTransfer13());
			SwingUtils.setSelectedButton(bgTransfer21, refMonthlySummaryPage3
					.getTransfer21());
			SwingUtils.setSelectedButton(bgTransfer22, refMonthlySummaryPage3
					.getTransfer22());
			SwingUtils.setSelectedButton(bgTransfer23, refMonthlySummaryPage3
					.getTransfer23());
			SwingUtils.setSelectedButton(bgToileting11, refMonthlySummaryPage3
					.getToileting11());
			SwingUtils.setSelectedButton(bgToileting12, refMonthlySummaryPage3
					.getToileting12());
			SwingUtils.setSelectedButton(bgToileting13, refMonthlySummaryPage3
					.getToileting13());
			SwingUtils.setSelectedButton(bgToileting14, refMonthlySummaryPage3
					.getToileting14());
			SwingUtils.setSelectedButton(bgToileting15, refMonthlySummaryPage3
					.getToileting15());
			SwingUtils.setSelectedButton(bgToileting21, refMonthlySummaryPage3
					.getToileting21());
			SwingUtils.setSelectedButton(bgToileting22, refMonthlySummaryPage3
					.getToileting22());
			SwingUtils.setSelectedButton(bgToileting23, refMonthlySummaryPage3
					.getToileting23());
			SwingUtils.setSelectedButton(bgToileting24, refMonthlySummaryPage3
					.getToileting24());
			SwingUtils.setSelectedButton(bgToileting25, refMonthlySummaryPage3
					.getToileting25());
			SwingUtils.setSelectedButton(bgEating11, refMonthlySummaryPage3
					.getEating11());
			SwingUtils.setSelectedButton(bgEating21, refMonthlySummaryPage3
					.getEating21());
			SwingUtils.setSelectedButton(bgDressing11, refMonthlySummaryPage3
					.getDressing11());
			SwingUtils.setSelectedButton(bgDressing12, refMonthlySummaryPage3
					.getDressing12());
			SwingUtils.setSelectedButton(bgDressing21, refMonthlySummaryPage3
					.getDressing21());
			SwingUtils.setSelectedButton(bgDressing22, refMonthlySummaryPage3
					.getDressing22());
			SwingUtils.setSelectedButton(bgAmbulation11, refMonthlySummaryPage3
					.getAmbulation11());
			SwingUtils.setSelectedButton(bgAmbulation12, refMonthlySummaryPage3
					.getAmbulation12());
			SwingUtils.setSelectedButton(bgAmbulation13, refMonthlySummaryPage3
					.getAmbulation13());
			SwingUtils.setSelectedButton(bgAmbulation14, refMonthlySummaryPage3
					.getAmbulation14());
			SwingUtils.setSelectedButton(bgAmbulation21, refMonthlySummaryPage3
					.getAmbulation21());
			SwingUtils.setSelectedButton(bgAmbulation22, refMonthlySummaryPage3
					.getAmbulation22());
			SwingUtils.setSelectedButton(bgAmbulation23, refMonthlySummaryPage3
					.getAmbulation23());
			SwingUtils.setSelectedButton(bgAmbulation24, refMonthlySummaryPage3
					.getAmbulation24());
			SwingUtils.setSelectedButton(bgGrooming11, refMonthlySummaryPage3
					.getGrooming11());
			SwingUtils.setSelectedButton(bgGrooming12, refMonthlySummaryPage3
					.getGrooming12());
			SwingUtils.setSelectedButton(bgGrooming13, refMonthlySummaryPage3
					.getGrooming13());
			SwingUtils.setSelectedButton(bgGrooming14, refMonthlySummaryPage3
					.getGrooming14());
			SwingUtils.setSelectedButton(bgGrooming15, refMonthlySummaryPage3
					.getGrooming15());
			SwingUtils.setSelectedButton(bgGrooming16, refMonthlySummaryPage3
					.getGrooming16());
			SwingUtils.setSelectedButton(bgGrooming17, refMonthlySummaryPage3
					.getGrooming17());
			SwingUtils.setSelectedButton(bggrooming21, refMonthlySummaryPage3
					.getGrooming21());
			SwingUtils.setSelectedButton(bggrooming22, refMonthlySummaryPage3
					.getGrooming22());
			SwingUtils.setSelectedButton(bggrooming23, refMonthlySummaryPage3
					.getGrooming23());
			SwingUtils.setSelectedButton(bggrooming24, refMonthlySummaryPage3
					.getGrooming24());
			SwingUtils.setSelectedButton(bggrooming25, refMonthlySummaryPage3
					.getGrooming25());
			SwingUtils.setSelectedButton(bggrooming26, refMonthlySummaryPage3
					.getGrooming26());
			SwingUtils.setSelectedButton(bggrooming27, refMonthlySummaryPage3
					.getGrooming27());

			Global.currentMonthlySummaryPage3Key = refMonthlySummaryPage3
					.getSerial();
		} else {
			Global.currentMonthlySummaryPage3Key = 0;
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
