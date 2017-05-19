package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage1;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.utils.SwingUtils;
import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryPage1 extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8084113183600923786L;
	private JTextArea txt12;
	private JTextArea txt11;
	private JTextArea txt10;
	private JTextArea txt9;
	private JTextArea txt8;
	private JTextArea txt7;
	private JTextArea txt6;
	private JTextArea txt5;
	private JTextArea txt4;
	private JTextArea txt3;
	private JTextArea txt2;
	private JTextArea txt1;
	private JDateChooser dcMonthYear;
	private JTextField txtRoomNo;
	private JTextField txtResidentName;

	public PanelMonthlySummaryPage1() {
		super();
		Global.panelPainManagementMonthlySummaryPage1 = this;
		setBackground(Color.WHITE);
		setLayout(null);
		// setBackground(Color.WHITE);
		setBounds(0, 0, 927, 1254);
		setPreferredSize(new Dimension(900, 1300));

		final JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		panel.setBounds(62, 31, 814, 37);
		add(panel);

		final JLabel painManagementMonthlyLabel = new JLabel();
		painManagementMonthlyLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 26));
		painManagementMonthlyLabel.setText("Pain Management Monthly Summary");
		panel.add(painManagementMonthlyLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(62, 95, 831, 1159);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 10, 811, 37);
		panel_1.add(panel_2);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name");
		residentNameLabel.setBounds(10, 10, 103, 16);
		panel_2.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(128, 8, 189, 20);
		panel_2.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room No");
		roomLabel.setBounds(345, 10, 66, 16);
		panel_2.add(roomLabel);

		txtRoomNo = new JTextField();
		txtRoomNo.setBounds(430, 8, 87, 20);
		panel_2.add(txtRoomNo);

		final JLabel monthYearLabel = new JLabel();
		monthYearLabel.setText("Month Year");
		monthYearLabel.setBounds(563, 10, 77, 16);
		panel_2.add(monthYearLabel);

		dcMonthYear = new JDateChooser();
		dcMonthYear.setBounds(662, 8, 139, 21);
		panel_2.add(dcMonthYear);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 60, 811, 1075);
		panel_1.add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(1, 1, 405, 53);
		panel_3.add(panel_4);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setBounds(406, 1, 404, 53);
		panel_3.add(panel_4_1);

		final JLabel commentsAndAssessmentLabel = new JLabel();
		commentsAndAssessmentLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 24));
		commentsAndAssessmentLabel.setText("Comments And Assessment");
		commentsAndAssessmentLabel.setBounds(10, 10, 384, 33);
		panel_4_1.add(commentsAndAssessmentLabel);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(1, 54, 405, 83);
		panel_3.add(panel_4_2);

		final JLabel whatIsTheLabel_1 = new JLabel();
		whatIsTheLabel_1.setText("1. Have you had any persistent or frequent");
		whatIsTheLabel_1.setBounds(10, 10, 219, 34);
		panel_4_2.add(whatIsTheLabel_1);

		final JLabel painDuringTheLabel = new JLabel();
		painDuringTheLabel.setText(" Pain during the past two weeks");
		painDuringTheLabel.setBounds(20, 50, 209, 14);
		panel_4_2.add(painDuringTheLabel);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(406, 54, 404, 83);
		panel_3.add(panel_4_3);

		final JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(2, 2, 400, 80);
		panel_4_3.add(scrollPane_1_1);

		txt1 = new JTextArea();
		scrollPane_1_1.setViewportView(txt1);

		final JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBackground(Color.WHITE);
		panel_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setBounds(1, 137, 405, 83);
		panel_3.add(panel_4_2_1);

		final JLabel whatIsTheLabel_1_1 = new JLabel();
		whatIsTheLabel_1_1.setText("2. if any lesions present, is there wound");
		whatIsTheLabel_1_1.setBounds(10, 10, 386, 34);
		panel_4_2_1.add(whatIsTheLabel_1_1);

		final JLabel whatIsTheLabel_1_1_3 = new JLabel();
		whatIsTheLabel_1_1_3.setText("or treatment related pain");
		whatIsTheLabel_1_1_3.setBounds(20, 49, 376, 24);
		panel_4_2_1.add(whatIsTheLabel_1_1_3);

		final JPanel panel_4_3_1 = new JPanel();
		panel_4_3_1.setBackground(Color.WHITE);
		panel_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1.setLayout(null);
		panel_4_3_1.setBounds(406, 137, 404, 83);
		panel_3.add(panel_4_3_1);

		final JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(2, 2, 400, 80);
		panel_4_3_1.add(scrollPane_1_2);

		txt2 = new JTextArea();
		scrollPane_1_2.setViewportView(txt2);

		final JPanel panel_4_2_1_1 = new JPanel();
		panel_4_2_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1.setLayout(null);
		panel_4_2_1_1.setBounds(1, 220, 405, 159);
		panel_3.add(panel_4_2_1_1);

		final JLabel whatIsTheLabel_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_1
				.setText("3.Have you recieved pain medication or treatment");
		whatIsTheLabel_1_1_1.setBounds(10, 10, 386, 29);
		panel_4_2_1_1.add(whatIsTheLabel_1_1_1);

		final JLabel diagnosisPainfulLabel = new JLabel();
		diagnosisPainfulLabel.setText("in the past two weeks?");
		diagnosisPainfulLabel.setBounds(20, 38, 376, 21);
		panel_4_2_1_1.add(diagnosisPainfulLabel);

		final JLabel othersLabel = new JLabel();
		othersLabel.setText("Routine");
		othersLabel.setBounds(91, 65, 198, 14);
		panel_4_2_1_1.add(othersLabel);

		final JLabel othersLabel_1 = new JLabel();
		othersLabel_1.setText("PRN Use?");
		othersLabel_1.setBounds(91, 85, 198, 14);
		panel_4_2_1_1.add(othersLabel_1);

		final JLabel othersLabel_1_1 = new JLabel();
		othersLabel_1_1.setText("Frequency of use(Describe frequency)");
		othersLabel_1_1.setBounds(91, 106, 198, 14);
		panel_4_2_1_1.add(othersLabel_1_1);

		final JPanel panel_4_3_1_1 = new JPanel();
		panel_4_3_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1.setLayout(null);
		panel_4_3_1_1.setBounds(406, 220, 404, 159);
		panel_3.add(panel_4_3_1_1);

		final JScrollPane scrollPane_1_3 = new JScrollPane();
		scrollPane_1_3.setBounds(2, 2, 400, 156);
		panel_4_3_1_1.add(scrollPane_1_3);

		txt3 = new JTextArea();
		scrollPane_1_3.setViewportView(txt3);

		final JPanel panel_4_2_1_2 = new JPanel();
		panel_4_2_1_2.setBackground(Color.WHITE);
		panel_4_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2.setLayout(null);
		panel_4_2_1_2.setBounds(1, 526, 405, 83);
		panel_3.add(panel_4_2_1_2);

		final JLabel whatIsTheLabel_1_1_2 = new JLabel();
		whatIsTheLabel_1_1_2
				.setText("6.Rate Your(resident's Pain) utilizing the wong baker");
		whatIsTheLabel_1_1_2.setBounds(10, 10, 386, 14);
		panel_4_2_1_2.add(whatIsTheLabel_1_1_2);

		final JLabel whatIsTheLabel_1_1_2_1 = new JLabel();
		whatIsTheLabel_1_1_2_1
				.setText("or FLACC scale. what is the range of pain before the");
		whatIsTheLabel_1_1_2_1.setBounds(20, 30, 376, 14);
		panel_4_2_1_2.add(whatIsTheLabel_1_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_1.setText("Pain med was given?");
		whatIsTheLabel_1_1_2_1_1.setBounds(20, 50, 366, 14);
		panel_4_2_1_2.add(whatIsTheLabel_1_1_2_1_1);

		final JPanel panel_4_2_1_3 = new JPanel();
		panel_4_2_1_3.setBackground(Color.WHITE);
		panel_4_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_3.setLayout(null);
		panel_4_2_1_3.setBounds(1, 379, 405, 83);
		panel_3.add(panel_4_2_1_3);

		final JLabel whatIsTheLabel_1_1_4 = new JLabel();
		whatIsTheLabel_1_1_4.setText("4. Does the resident exhibit non verbal");
		whatIsTheLabel_1_1_4.setBounds(10, 10, 386, 21);
		panel_4_2_1_3.add(whatIsTheLabel_1_1_4);

		final JLabel whatIsTheLabel_1_1_3_1 = new JLabel();
		whatIsTheLabel_1_1_3_1.setText("s/s of pain");
		whatIsTheLabel_1_1_3_1.setBounds(20, 27, 376, 29);
		panel_4_2_1_3.add(whatIsTheLabel_1_1_3_1);

		final JLabel whatIsTheLabel_1_1_3_1_1 = new JLabel();
		whatIsTheLabel_1_1_3_1_1.setText("Specify?");
		whatIsTheLabel_1_1_3_1_1.setBounds(20, 62, 376, 11);
		panel_4_2_1_3.add(whatIsTheLabel_1_1_3_1_1);

		final JPanel panel_4_3_1_2 = new JPanel();
		panel_4_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2.setLayout(null);
		panel_4_3_1_2.setBounds(406, 379, 404, 83);
		panel_3.add(panel_4_3_1_2);

		final JScrollPane scrollPane_1_2_1 = new JScrollPane();
		scrollPane_1_2_1.setBounds(2, 2, 400, 80);
		panel_4_3_1_2.add(scrollPane_1_2_1);

		txt4 = new JTextArea();
		scrollPane_1_2_1.setViewportView(txt4);

		final JPanel panel_4_2_1_3_1 = new JPanel();
		panel_4_2_1_3_1.setBackground(Color.WHITE);
		panel_4_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_3_1.setLayout(null);
		panel_4_2_1_3_1.setBounds(1, 462, 405, 64);
		panel_3.add(panel_4_2_1_3_1);

		final JLabel whatIsTheLabel_1_1_4_1 = new JLabel();
		whatIsTheLabel_1_1_4_1
				.setText("5. Does your present pain treatment or medication");
		whatIsTheLabel_1_1_4_1.setBounds(10, 10, 386, 21);
		panel_4_2_1_3_1.add(whatIsTheLabel_1_1_4_1);

		final JLabel whatIsTheLabel_1_1_3_1_2 = new JLabel();
		whatIsTheLabel_1_1_3_1_2.setText("control your pain most of the Time");
		whatIsTheLabel_1_1_3_1_2.setBounds(20, 27, 376, 29);
		panel_4_2_1_3_1.add(whatIsTheLabel_1_1_3_1_2);

		final JPanel panel_4_3_1_2_1 = new JPanel();
		panel_4_3_1_2_1.setBackground(Color.WHITE);
		panel_4_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_1.setLayout(null);
		panel_4_3_1_2_1.setBounds(406, 462, 404, 64);
		panel_3.add(panel_4_3_1_2_1);

		final JScrollPane scrollPane_1_2_1_1 = new JScrollPane();
		scrollPane_1_2_1_1.setBounds(2, 2, 400, 60);
		panel_4_3_1_2_1.add(scrollPane_1_2_1_1);

		txt5 = new JTextArea();
		scrollPane_1_2_1_1.setViewportView(txt5);

		final JPanel panel_4_3_1_2_2 = new JPanel();
		panel_4_3_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_2.setLayout(null);
		panel_4_3_1_2_2.setBounds(406, 526, 404, 83);
		panel_3.add(panel_4_3_1_2_2);

		final JScrollPane scrollPane_1_2_1_2 = new JScrollPane();
		scrollPane_1_2_1_2.setBounds(2, 2, 400, 80);
		panel_4_3_1_2_2.add(scrollPane_1_2_1_2);

		txt6 = new JTextArea();
		scrollPane_1_2_1_2.setViewportView(txt6);

		final JPanel panel_4_2_1_2_1 = new JPanel();
		panel_4_2_1_2_1.setBackground(Color.WHITE);
		panel_4_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1.setLayout(null);
		panel_4_2_1_2_1.setBounds(1, 609, 405, 83);
		panel_3.add(panel_4_2_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_2 = new JLabel();
		whatIsTheLabel_1_1_2_2
				.setText("7. Describe what your pain feels like:");
		whatIsTheLabel_1_1_2_2.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1.add(whatIsTheLabel_1_1_2_2);

		final JLabel whatIsTheLabel_1_1_2_1_2 = new JLabel();
		whatIsTheLabel_1_1_2_1_2
				.setText("aching,stabbing,sharp,heavy,cramping");
		whatIsTheLabel_1_1_2_1_2.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1.add(whatIsTheLabel_1_1_2_1_2);

		final JLabel whatIsTheLabel_1_1_2_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_1_1
				.setText("dull,hot,burning,shooting,other(specify).");
		whatIsTheLabel_1_1_2_1_1_1.setBounds(20, 50, 366, 14);
		panel_4_2_1_2_1.add(whatIsTheLabel_1_1_2_1_1_1);

		final JPanel panel_4_3_1_2_2_1 = new JPanel();
		panel_4_3_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_2_1.setLayout(null);
		panel_4_3_1_2_2_1.setBounds(406, 609, 404, 83);
		panel_3.add(panel_4_3_1_2_2_1);

		final JScrollPane scrollPane_1_2_1_2_1 = new JScrollPane();
		scrollPane_1_2_1_2_1.setBounds(2, 2, 400, 80);
		panel_4_3_1_2_2_1.add(scrollPane_1_2_1_2_1);

		txt7 = new JTextArea();
		scrollPane_1_2_1_2_1.setViewportView(txt7);

		final JPanel panel_4_2_1_2_1_1 = new JPanel();
		panel_4_2_1_2_1_1.setBackground(Color.WHITE);
		panel_4_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1_1.setLayout(null);
		panel_4_2_1_2_1_1.setBounds(1, 692, 405, 83);
		panel_3.add(panel_4_2_1_2_1_1);

		final JLabel whatIsTheLabel_1_1_2_2_1 = new JLabel();
		whatIsTheLabel_1_1_2_2_1
				.setText("8. Does The onset or duration of the pain");
		whatIsTheLabel_1_1_2_2_1.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1_1.add(whatIsTheLabel_1_1_2_2_1);

		final JLabel whatIsTheLabel_1_1_2_1_2_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_2_1
				.setText("have a noticeable pattern?(early morniing,");
		whatIsTheLabel_1_1_2_1_2_1.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1_1.add(whatIsTheLabel_1_1_2_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_1_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_1_1_1
				.setText("morning,afternoon,evening, how long?");
		whatIsTheLabel_1_1_2_1_1_1_1.setBounds(20, 50, 366, 14);
		panel_4_2_1_2_1_1.add(whatIsTheLabel_1_1_2_1_1_1_1);

		final JPanel panel_4_3_1_2_2_1_1 = new JPanel();
		panel_4_3_1_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_2_1_1.setLayout(null);
		panel_4_3_1_2_2_1_1.setBounds(406, 692, 404, 83);
		panel_3.add(panel_4_3_1_2_2_1_1);

		final JScrollPane scrollPane_1_2_1_2_1_1 = new JScrollPane();
		scrollPane_1_2_1_2_1_1.setBounds(2, 2, 400, 80);
		panel_4_3_1_2_2_1_1.add(scrollPane_1_2_1_2_1_1);

		txt8 = new JTextArea();
		scrollPane_1_2_1_2_1_1.setViewportView(txt8);

		final JPanel panel_4_2_1_2_1_1_1 = new JPanel();
		panel_4_2_1_2_1_1_1.setBackground(Color.WHITE);
		panel_4_2_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1_1_1.setLayout(null);
		panel_4_2_1_2_1_1_1.setBounds(1, 775, 405, 64);
		panel_3.add(panel_4_2_1_2_1_1_1);

		final JLabel whatIsTheLabel_1_1_2_2_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_2_1_1
				.setText("9.What precipitates pain?(Movement,");
		whatIsTheLabel_1_1_2_2_1_1.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1_1_1.add(whatIsTheLabel_1_1_2_2_1_1);

		final JLabel whatIsTheLabel_1_1_2_1_2_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_2_1_1
				.setText("Treatment,Excercise,Position,others)");
		whatIsTheLabel_1_1_2_1_2_1_1.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1_1_1.add(whatIsTheLabel_1_1_2_1_2_1_1);

		final JPanel panel_4_3_1_2_1_1 = new JPanel();
		panel_4_3_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_1_1.setLayout(null);
		panel_4_3_1_2_1_1.setBounds(406, 775, 404, 64);
		panel_3.add(panel_4_3_1_2_1_1);

		final JScrollPane scrollPane_1_2_1_1_1 = new JScrollPane();
		scrollPane_1_2_1_1_1.setBounds(2, 2, 400, 60);
		panel_4_3_1_2_1_1.add(scrollPane_1_2_1_1_1);

		txt9 = new JTextArea();
		scrollPane_1_2_1_1_1.setViewportView(txt9);

		final JPanel panel_4_2_1_2_1_1_2 = new JPanel();
		panel_4_2_1_2_1_1_2.setBackground(Color.WHITE);
		panel_4_2_1_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1_1_2.setLayout(null);
		panel_4_2_1_2_1_1_2.setBounds(1, 839, 405, 83);
		panel_3.add(panel_4_2_1_2_1_1_2);

		final JLabel whatIsTheLabel_1_1_2_2_1_2 = new JLabel();
		whatIsTheLabel_1_1_2_2_1_2.setText("10.What relieves your pain?(heat,");
		whatIsTheLabel_1_1_2_2_1_2.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1_1_2.add(whatIsTheLabel_1_1_2_2_1_2);

		final JLabel whatIsTheLabel_1_1_2_1_2_1_2 = new JLabel();
		whatIsTheLabel_1_1_2_1_2_1_2.setText("cold, message,music,eating,");
		whatIsTheLabel_1_1_2_1_2_1_2.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1_1_2.add(whatIsTheLabel_1_1_2_1_2_1_2);

		final JLabel whatIsTheLabel_1_1_2_1_1_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_1_1_1_1.setText("distraction,prayer");
		whatIsTheLabel_1_1_2_1_1_1_1_1.setBounds(20, 50, 366, 14);
		panel_4_2_1_2_1_1_2.add(whatIsTheLabel_1_1_2_1_1_1_1_1);

		final JPanel panel_4_3_1_2_2_1_1_1 = new JPanel();
		panel_4_3_1_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_2_1_1_1.setLayout(null);
		panel_4_3_1_2_2_1_1_1.setBounds(406, 839, 404, 83);
		panel_3.add(panel_4_3_1_2_2_1_1_1);

		final JScrollPane scrollPane_1_2_1_2_1_1_1 = new JScrollPane();
		scrollPane_1_2_1_2_1_1_1.setBounds(2, 2, 400, 80);
		panel_4_3_1_2_2_1_1_1.add(scrollPane_1_2_1_2_1_1_1);

		txt10 = new JTextArea();
		scrollPane_1_2_1_2_1_1_1.setViewportView(txt10);

		final JPanel panel_4_2_1_2_1_1_1_1 = new JPanel();
		panel_4_2_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_4_2_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1_1_1_1.setLayout(null);
		panel_4_2_1_2_1_1_1_1.setBounds(1, 922, 405, 64);
		panel_3.add(panel_4_2_1_2_1_1_1_1);

		final JLabel whatIsTheLabel_1_1_2_2_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_2_1_1_1
				.setText("11.What effect does pain have on your ");
		whatIsTheLabel_1_1_2_2_1_1_1.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1_1_1_1.add(whatIsTheLabel_1_1_2_2_1_1_1);

		final JLabel whatIsTheLabel_1_1_2_1_2_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_2_1_1_1.setText("ADL or quality of life");
		whatIsTheLabel_1_1_2_1_2_1_1_1.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1_1_1_1.add(whatIsTheLabel_1_1_2_1_2_1_1_1);

		final JPanel panel_4_3_1_2_1_1_1 = new JPanel();
		panel_4_3_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_1_1_1.setLayout(null);
		panel_4_3_1_2_1_1_1.setBounds(406, 922, 404, 64);
		panel_3.add(panel_4_3_1_2_1_1_1);

		final JScrollPane scrollPane_1_2_1_1_1_1 = new JScrollPane();
		scrollPane_1_2_1_1_1_1.setBounds(2, 2, 400, 60);
		panel_4_3_1_2_1_1_1.add(scrollPane_1_2_1_1_1_1);

		txt11 = new JTextArea();
		scrollPane_1_2_1_1_1_1.setViewportView(txt11);

		final JPanel panel_4_2_1_2_1_1_2_1 = new JPanel();
		panel_4_2_1_2_1_1_2_1.setBackground(Color.WHITE);
		panel_4_2_1_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2_1_1_2_1.setLayout(null);
		panel_4_2_1_2_1_1_2_1.setBounds(1, 986, 405, 88);
		panel_3.add(panel_4_2_1_2_1_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_2_1_2_1 = new JLabel();
		whatIsTheLabel_1_1_2_2_1_2_1
				.setText("12.Has there been a change in your pain");
		whatIsTheLabel_1_1_2_2_1_2_1.setBounds(10, 10, 386, 14);
		panel_4_2_1_2_1_1_2_1.add(whatIsTheLabel_1_1_2_2_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_1_2_1_2_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_2_1_2_1
				.setText("treatment over the past 30 days");
		whatIsTheLabel_1_1_2_1_2_1_2_1.setBounds(20, 30, 376, 14);
		panel_4_2_1_2_1_1_2_1.add(whatIsTheLabel_1_1_2_1_2_1_2_1);

		final JLabel whatIsTheLabel_1_1_2_1_1_1_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_2_1_1_1_1_1_1
				.setText("and did it improve effectiveness?");
		whatIsTheLabel_1_1_2_1_1_1_1_1_1.setBounds(20, 50, 366, 14);
		panel_4_2_1_2_1_1_2_1.add(whatIsTheLabel_1_1_2_1_1_1_1_1_1);

		final JPanel panel_4_3_1_2_2_1_1_2 = new JPanel();
		panel_4_3_1_2_2_1_1_2.setBackground(Color.WHITE);
		panel_4_3_1_2_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_2_2_1_1_2.setLayout(null);
		panel_4_3_1_2_2_1_1_2.setBounds(406, 986, 404, 88);
		panel_3.add(panel_4_3_1_2_2_1_1_2);

		final JScrollPane scrollPane_1_2_1_2_1_1_2 = new JScrollPane();
		scrollPane_1_2_1_2_1_1_2.setBounds(2, 2, 400, 83);
		panel_4_3_1_2_2_1_1_2.add(scrollPane_1_2_1_2_1_1_2);

		txt12 = new JTextArea();
		scrollPane_1_2_1_2_1_1_2.setViewportView(txt12);
		updateData();
	}

	public static void main(String args[]) {
		SwingUtils.wrapInFrame(new PanelMonthlySummaryPage1()).setVisible(true);
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public void doUpdate() {
		// updateData();

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

	public int doSave() {

		MonthlySummaryPage1 refMonthlySummaryPage1 = new MonthlySummaryPage1();
		MonthlySummaryRecord msr = null;
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		refMonthlySummaryPage1.setFormId(msr);
		refMonthlySummaryPage1.setSerial(Global.currentMonthlySummaryPage1Key);
		refMonthlySummaryPage1.setResidentId(Global.currentResidenceKey);
		refMonthlySummaryPage1.setComment12(txt12.getText());
		refMonthlySummaryPage1.setComment11(txt11.getText());
		refMonthlySummaryPage1.setComment10(txt10.getText());
		refMonthlySummaryPage1.setComment9(txt9.getText());
		refMonthlySummaryPage1.setComment8(txt8.getText());
		refMonthlySummaryPage1.setComment7(txt7.getText());
		refMonthlySummaryPage1.setComment6(txt6.getText());
		refMonthlySummaryPage1.setComment5(txt5.getText());
		refMonthlySummaryPage1.setComment4(txt4.getText());
		refMonthlySummaryPage1.setComment3(txt3.getText());
		refMonthlySummaryPage1.setComment2(txt2.getText());
		refMonthlySummaryPage1.setComment1(txt1.getText());
		refMonthlySummaryPage1.setMonthYear(dcMonthYear.getDate());
		refMonthlySummaryPage1.setRoomNo(txtRoomNo.getText());
		refMonthlySummaryPage1.setResidentName(txtResidentName.getText());

		try {
			Global.currentMonthlySummaryPage1Key = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryPage1(
							refMonthlySummaryPage1);
			return Global.currentMonthlySummaryPage1Key;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void updateData() {
		// System.out.println("Key :" +Global.currentMonthlySummaryRecordKey);
		MonthlySummaryPage1 refMonthlySummaryPage1 = null;
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryPage1Key != 0) {
			try {
				MonthlySummaryRecord msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryPage1 = MedrexClientManager.getInstance()
						.getMonthlySummaryPage1(msr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			txt12.setText(refMonthlySummaryPage1.getComment12());
			txt11.setText(refMonthlySummaryPage1.getComment11());
			txt10.setText(refMonthlySummaryPage1.getComment10());
			txt9.setText(refMonthlySummaryPage1.getComment9());
			txt8.setText(refMonthlySummaryPage1.getComment8());
			txt7.setText(refMonthlySummaryPage1.getComment7());
			txt6.setText(refMonthlySummaryPage1.getComment6());
			txt5.setText(refMonthlySummaryPage1.getComment5());
			txt4.setText(refMonthlySummaryPage1.getComment4());
			txt3.setText(refMonthlySummaryPage1.getComment3());
			txt2.setText(refMonthlySummaryPage1.getComment2());
			txt1.setText(refMonthlySummaryPage1.getComment1());
			dcMonthYear.setDate(refMonthlySummaryPage1.getMonthYear());
			txtRoomNo.setText(refMonthlySummaryPage1.getRoomNo());
			txtResidentName.setText(refMonthlySummaryPage1.getResidentName());
			Global.currentMonthlySummaryPage1Key = refMonthlySummaryPage1
					.getSerial();
		} else {
			Global.currentMonthlySummaryPage1Key = 0;
			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
				if (rm != null) {
					txtResidentName.setText(rm.getUserPass() + " , "
							+ rm.getUserName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
