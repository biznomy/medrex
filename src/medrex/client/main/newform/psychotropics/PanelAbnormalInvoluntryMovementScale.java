package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelAbnormalInvoluntryMovementScale extends JPanel implements
		Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4029438365000647072L;
	private JTextField txtRoom;
	private JLabel lblRoom;
	private JTextField txtRecordNo;
	private JLabel lblRecordNo;
	private JTextField txtPhysician;
	private JLabel lblPhysician;
	private JTextField txtMiddle;
	private JLabel lblMiddle;
	private JTextField txtFirst;
	private JLabel lblFirst;
	private JTextField txtLast;
	private JLabel lblLast;
	private JLabel lblDate4;
	private JDateChooser dcDate4;
	private JLabel lblSignature4;
	private JTextField txtSignature4;
	private JLabel lblDate3;
	private JDateChooser dcDate3;
	private JLabel lblSignature3;
	private JTextField txtSignature3;
	private JLabel lblDate2;
	private JDateChooser dcDate2;
	private JLabel lblSignature2;
	private JTextField txtSignature2;
	private JLabel lblDate1;
	private JDateChooser dcDate1;
	private JLabel iblSignature1l;
	private JTextField txtSignature1;
	private static final Object Constraints = null;

	public PanelAbnormalInvoluntryMovementScale() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(840, 1150));
		setBackground(new Color(252, 252, 252));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(10, 34, 829, 1106);
		add(panel);

		final JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label
				.setText("<html><body><b>INSTRUCTIONS</b>:Complete examination procedure before making rating.While conducting the examination,have re-<br>"
						+ "sident sit a firm chair without arms.For all MOVEMENT rating(sections A,B and C) rate highest severity observed.<br> "
						+ "Circle only one code for each evaluaton");

		label.setBounds(0, 5, 829, 39);
		panel.add(label);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setOpaque(false);
		panel_1.setLayout(null);

		panel_1.setBounds(0, 111, 300, 770);
		panel.add(panel_1);

		final JLabel label_6 = new JLabel();
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setOpaque(true);
		label_6.setBackground(new Color(128, 64, 64));

		label_6.setForeground(Color.WHITE);

		label_6.setFont(new Font("", Font.BOLD, 12));
		label_6.setText("   SECTION A:FACIAL AND ORAL MOVEMENTS");
		label_6.setBounds(0, 0, 299, 16);
		panel_1.add(label_6);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 22, 299, 240);
		panel_1.add(panel_3);

		panel_1.setComponentZOrder(panel_3, 0);
		panel_1.setComponentZOrder(label_6, 1);

		final JLabel label_7 = new JLabel();
		label_7.setForeground(new Color(128, 64, 64));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setOpaque(false);
		label_7.setText("1.");
		label_7.setBounds(10, 0, 21, 16);
		panel_3.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setOpaque(false);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setForeground(new Color(128, 64, 64));
		label_8.setText("MUSCLES OF FACIAL EXPRESSION");
		label_8.setBounds(40, 0, 229, 16);
		panel_3.add(label_8);

		JSeparator horizontal = new JSeparator(JSeparator.HORIZONTAL);
		horizontal.setFocusTraversalPolicyProvider(true);
		horizontal.setFocusCycleRoot(true);
		horizontal.setFocusable(true);
		horizontal.setAutoscrolls(true);
		horizontal.setBounds(0, 75, 769, 2);
		panel_3.add(horizontal, Constraints);

		final JLabel label_9 = new JLabel();
		label_9.setOpaque(false);
		label_9
				.setText("<html><body>e.g. movements for forehead,eyebrow,periorbital<br> area,cheeks;include frowning,blinking,smilling,gri-<br>macing");
		label_9.setForeground(new Color(128, 64, 64));
		label_9.setBounds(40, 22, 249, 47);
		panel_3.add(label_9);

		final JLabel label_10 = new JLabel();
		label_10.setForeground(new Color(128, 64, 64));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setText("2.");
		label_10.setBounds(10, 75, 31, 14);
		panel_3.add(label_10);

		final JLabel label_11 = new JLabel();
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setForeground(new Color(128, 64, 64));
		label_11.setText("LIPS AND PERIORAL AREA");
		label_11.setBounds(40, 75, 249, 16);
		panel_3.add(label_11);

		final JLabel label_12 = new JLabel();
		label_12.setForeground(new Color(128, 64, 64));
		label_12.setText("e.g. puckering,pounting,smacking");
		label_12.setBounds(40, 97, 249, 14);
		panel_3.add(label_12);

		JSeparator horizontal1 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal1.setBounds(0, 120, 738, 2);
		panel_3.add(horizontal1, Constraints);

		JSeparator horizontal2 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal2.setBounds(0, 169, 738, 2);
		panel_3.add(horizontal2, Constraints);

		final JLabel label_13 = new JLabel();
		label_13.setForeground(new Color(128, 64, 64));
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setText("3.");
		label_13.setBounds(10, 120, 31, 14);
		panel_3.add(label_13);

		final JLabel label_14 = new JLabel();
		label_14.setForeground(new Color(128, 64, 64));
		label_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_14.setText("JAW");
		label_14.setBounds(40, 120, 249, 14);
		panel_3.add(label_14);

		final JLabel label_15 = new JLabel();
		label_15.setForeground(new Color(128, 64, 64));
		label_15
				.setText("<html><body>e.g.biting,clenching,chewing,mouth opening,lateral<br> movements");
		label_15.setBounds(40, 140, 249, 24);
		panel_3.add(label_15);

		final JLabel label_16 = new JLabel();
		label_16.setForeground(new Color(128, 64, 64));
		label_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_16.setText("4");
		label_16.setBounds(10, 170, 24, 14);
		panel_3.add(label_16);

		final JLabel label_17 = new JLabel();
		label_17.setForeground(new Color(128, 64, 64));
		label_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_17.setText("TONGUE");
		label_17.setBounds(40, 170, 249, 14);
		panel_3.add(label_17);

		final JLabel label_18 = new JLabel();
		label_18.setForeground(new Color(128, 64, 64));
		label_18
				.setText("<html><body>Rate only increase in movements both in and out of <br> mouth.NOT Inability to sustain movements.");
		label_18.setBounds(40, 190, 249, 43);
		panel_3.add(label_18);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 270, 299, 186);
		panel_1.add(panel_4);

		final JLabel label_19 = new JLabel();
		label_19.setBackground(new Color(128, 64, 64));
		label_19.setForeground(Color.WHITE);
		label_19.setOpaque(true);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_19.setText("   SECTION B: EXTREMITY MOVEMENTS");
		label_19.setBounds(0, 0, 299, 16);
		panel_4.add(label_19);

		JSeparator horizontal11 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal11.setBounds(0, 120, 738, 2);
		panel_3.add(horizontal11, Constraints);

		final JLabel label_20 = new JLabel();
		label_20.setForeground(new Color(128, 64, 64));
		label_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_20.setText("5.");
		label_20.setBounds(10, 22, 26, 14);
		panel_4.add(label_20);

		final JLabel label_21 = new JLabel();
		label_21.setForeground(new Color(128, 64, 64));
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_21.setText("UPPER(ARMS,WRISTS,HANDS,FINGERS)");
		label_21.setBounds(38, 22, 251, 14);
		panel_4.add(label_21);

		final JLabel label_22 = new JLabel();
		label_22
				.setText("<html><body> Include choreic movements(i.e. rapid,objectively<br> purposeless,Irregular,spontaneous),athetoid move-<br>ments(i.e. slow,irregular,"
						+ ",complex,serpentine).<br> Do NOT include tremor(i.e. repetitive,regular,rhythmic)");
		label_22.setForeground(new Color(128, 64, 64));
		label_22.setBounds(40, 35, 249, 88);
		panel_4.add(label_22);

		JSeparator horizontal101 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal101.setBounds(0, 125, 738, 2);
		panel_4.add(horizontal101, Constraints);

		final JLabel label_23 = new JLabel();
		label_23.setForeground(new Color(128, 64, 64));
		label_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_23.setText("6.");
		label_23.setBounds(10, 130, 26, 14);
		panel_4.add(label_23);

		final JLabel label_24 = new JLabel();
		label_24.setForeground(new Color(128, 64, 64));
		label_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_24.setText("LOWER(LEGS,KNEES,ANKLES,TOES)");
		label_24.setBounds(40, 125, 249, 14);
		panel_4.add(label_24);

		final JLabel label_25 = new JLabel();
		label_25.setForeground(new Color(128, 64, 64));
		label_25
				.setText("<html><body>e.g. lateral knee movement,foot tapping,heel drop-<br>"
						+ "ping,foot squirming,inversion and eversion of foot.");
		label_25.setBounds(40, 140, 252, 50);
		panel_4.add(label_25);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 460, 299, 53);
		panel_1.add(panel_5);

		final JLabel label_26 = new JLabel();
		label_26.setOpaque(true);
		label_26.setAutoscrolls(false);
		label_26.setBackground(new Color(128, 64, 64));
		label_26.setForeground(Color.WHITE);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_26.setBounds(0, 0, 299, 16);
		label_26.setText("   SECTION C: TRUNK MOVEMENTS");
		panel_5.add(label_26);

		final JLabel label_27 = new JLabel();
		label_27.setForeground(new Color(128, 64, 64));
		label_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_27.setText("7.");
		label_27.setBounds(10, 20, 23, 14);
		panel_5.add(label_27);

		final JLabel label_28 = new JLabel();
		label_28.setForeground(new Color(128, 64, 64));
		label_28.setText("e.g. rocking,twisting,squirming,pelvic gyrations");
		label_28.setBounds(40, 25, 249, 14);
		panel_5.add(label_28);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 520, 299, 146);
		panel_1.add(panel_6);

		final JLabel label_29 = new JLabel();
		label_29.setOpaque(true);
		label_29.setAutoscrolls(false);
		label_29.setBackground(new Color(128, 64, 64));
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_29.setBounds(0, 0, 299, 16);
		label_29.setText("   SECTION D: GLOBAL JUDGEMENTS");
		panel_6.add(label_29);

		final JLabel label_30 = new JLabel();
		label_30.setForeground(new Color(128, 64, 64));
		label_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_30.setText("8.");
		label_30.setBounds(10, 25, 26, 14);
		panel_6.add(label_30);

		final JLabel label_31 = new JLabel();
		label_31.setForeground(new Color(128, 64, 64));
		label_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_31.setText("SEVERITY OF ABNORMAL MOVEMENTS");
		label_31.setBounds(40, 25, 253, 14);
		panel_6.add(label_31);

		JSeparator horizontal111 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal111.setBounds(0, 45, 738, 2);
		panel_6.add(horizontal111, Constraints);

		JSeparator horizontal112 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal112.setBounds(0, 85, 738, 2);
		panel_6.add(horizontal112, Constraints);

		final JLabel label_32 = new JLabel();
		label_32.setForeground(new Color(128, 64, 64));
		label_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_32.setText("9.");
		label_32.setBounds(10, 53, 26, 14);
		panel_6.add(label_32);

		final JLabel label_33 = new JLabel();
		label_33.setForeground(new Color(128, 64, 64));
		label_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_33
				.setText("<html><body>INCAPACITATION DUE TO ABNORMAL<br> MOVEMENTS ");
		label_33.setBounds(40, 53, 253, 26);
		panel_6.add(label_33);

		final JLabel label_34 = new JLabel();
		label_34.setForeground(new Color(128, 64, 64));
		label_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_34.setText("10.");
		label_34.setBounds(10, 85, 35, 14);
		panel_6.add(label_34);

		final JLabel label_35 = new JLabel();
		label_35.setForeground(new Color(128, 64, 64));
		label_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_35
				.setText("<html><body>RESIDENT AWARENESS OF ABNORMAL<br>MOVEMENTS");
		label_35.setBounds(40, 85, 254, 36);
		panel_6.add(label_35);

		final JLabel label_36 = new JLabel();
		label_36.setForeground(new Color(128, 64, 64));
		label_36.setText("Rate only patient's report");
		label_36.setBounds(40, 125, 254, 14);
		panel_6.add(label_36);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 672, 299, 84);
		panel_1.add(panel_7);

		final JLabel label_37 = new JLabel();
		label_37.setBackground(new Color(128, 64, 64));
		label_37.setForeground(Color.WHITE);
		label_37.setOpaque(true);
		label_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_37.setText("   SECTION E:DENTAL STATUS");
		label_37.setBounds(0, 0, 299, 16);
		panel_7.add(label_37);

		final JLabel label_38 = new JLabel();
		label_38.setForeground(new Color(128, 64, 64));
		label_38.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_38.setText("11.");
		label_38.setBounds(10, 20, 26, 14);
		panel_7.add(label_38);

		final JLabel label_39 = new JLabel();
		label_39.setForeground(new Color(128, 64, 64));
		label_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_39
				.setText("<html><body>CURRENT PROBLEMS WITH TEETH AND/OR <br> DENTURES");
		label_39.setBounds(40, 15, 267, 36);
		panel_7.add(label_39);

		JSeparator horizontal113 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal113.setBounds(0, 55, 738, 2);
		panel_7.add(horizontal113, Constraints);

		final JLabel label_40 = new JLabel();
		label_40.setForeground(new Color(128, 64, 64));
		label_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_40.setText("12.");
		label_40.setBounds(10, 55, 26, 14);
		panel_7.add(label_40);

		final JLabel label_41 = new JLabel();
		label_41.setForeground(new Color(128, 64, 64));
		label_41.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_41.setText("DOES RESIDENT USUALLY WEAR DENTURES?");
		label_41.setBounds(40, 50, 277, 24);
		panel_7.add(label_41);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 55, 829, 22);
		panel.add(panel_2);

		final JLabel label_1 = new JLabel();
		label_1.setText("<html><body><b>SCORING CODES:</b>      0=None");
		label_1.setBounds(10, 5, 173, 16);
		panel_2.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("1=Minimal/Normal");
		label_2.setBounds(260, 5, 111, 16);
		panel_2.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("2=Mild");
		label_3.setBounds(480, 5, 66, 16);
		panel_2.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("3=Moderate");
		label_4.setBounds(625, 5, 83, 16);
		panel_2.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("4=Severe");
		label_5.setBounds(760, 5, 66, 16);
		panel_2.add(label_5);

		// final JPanel panel_8 = new JPanel();
		// panel_8.setBackground(new Color(128,64,64));
		// panel_8.setOpaque(true);
		// panel_8.setLayout(null);
		// panel_8.setBounds(10, 855, 770, 22);
		// panel.add(panel_8);
		//
		// final JLabel label_42 = new JLabel();
		// label_42.setHorizontalAlignment(SwingConstants.CENTER);
		// label_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		// label_42.setText("EVALUATOR SIGNATURES");
		// label_42.setBounds(10, 5, 750, 23);
		// panel_8.add(label_42);

		final JSeparator vertical = new JSeparator(SwingConstants.VERTICAL);
		vertical.setBounds(35, 115, 2, 765);
		panel.add(vertical);

		final JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 895, 828, 39);
		panel.add(panel_9);

		iblSignature1l = new JLabel();
		iblSignature1l.setForeground(new Color(128, 64, 64));
		iblSignature1l.setBounds(5, 20, 94, 14);
		iblSignature1l.setText("Signature/Title");
		panel_9.add(iblSignature1l);

		txtSignature1 = new JTextField();
		txtSignature1.setBounds(5, 2, 155, 21);
		panel_9.add(txtSignature1);

		lblDate1 = new JLabel();
		lblDate1.setForeground(new Color(128, 64, 64));
		lblDate1.setText("Date");
		lblDate1.setBounds(180, 20, 54, 14);
		panel_9.add(lblDate1);

		dcDate1 = new JDateChooser();
		dcDate1.setBounds(174, 2, 155, 21);
		panel_9.add(dcDate1);

		txtSignature2 = new JTextField();
		txtSignature2.setBounds(485, 2, 155, 21);
		panel_9.add(txtSignature2);

		lblSignature2 = new JLabel();
		lblSignature2.setForeground(new Color(128, 64, 64));
		lblSignature2.setText("Signature/Title");
		lblSignature2.setBounds(484, 20, 81, 14);
		panel_9.add(lblSignature2);

		lblDate2 = new JLabel();
		lblDate2.setForeground(new Color(128, 64, 64));
		lblDate2.setText("Date");
		lblDate2.setBounds(690, 25, 54, 14);
		panel_9.add(lblDate2);

		dcDate2 = new JDateChooser();
		dcDate2.setBounds(680, 2, 146, 21);
		panel_9.add(dcDate2);

		final JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 940, 828, 39);
		panel.add(panel_10);

		txtSignature3 = new JTextField();
		txtSignature3.setBounds(5, 0, 155, 21);
		panel_10.add(txtSignature3);

		lblSignature3 = new JLabel();
		lblSignature3.setForeground(new Color(128, 64, 64));
		lblSignature3.setText("Signature/Title");
		lblSignature3.setBounds(5, 20, 94, 14);
		panel_10.add(lblSignature3);

		dcDate3 = new JDateChooser();
		dcDate3.setBounds(174, 0, 155, 21);
		panel_10.add(dcDate3);

		lblDate3 = new JLabel();
		lblDate3.setForeground(new Color(128, 64, 64));
		lblDate3.setText("Date");
		lblDate3.setBounds(180, 20, 54, 14);
		panel_10.add(lblDate3);

		txtSignature4 = new JTextField();
		txtSignature4.setBounds(485, 0, 155, 21);
		panel_10.add(txtSignature4);

		lblSignature4 = new JLabel();
		lblSignature4.setForeground(new Color(128, 64, 64));
		lblSignature4.setText("Signature/Title");
		lblSignature4.setBounds(484, 20, 81, 14);
		panel_10.add(lblSignature4);

		dcDate4 = new JDateChooser();
		dcDate4.setBounds(680, 5, 145, 21);
		panel_10.add(dcDate4);

		lblDate4 = new JLabel();
		lblDate4.setForeground(new Color(128, 64, 64));
		lblDate4.setText("Date");
		lblDate4.setBounds(690, 25, 54, 14);
		panel_10.add(lblDate4);

		final JSeparator horizontal_1 = new JSeparator();
		horizontal_1.setBounds(0, 985, 828, 2);
		panel.add(horizontal_1);

		final JSeparator horizontal_1_1 = new JSeparator();
		horizontal_1_1.setBounds(0, 990, 828, 2);
		panel.add(horizontal_1_1);

		final JSeparator horizontal_1_1_2 = new JSeparator();
		horizontal_1_1_2.setBounds(0, 1040, 828, 2);
		panel.add(horizontal_1_1_2);

		final JSeparator horizontal_1_1_3 = new JSeparator();
		horizontal_1_1_3.setBounds(0, 1045, 828, 2);
		panel.add(horizontal_1_1_3);

		final JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 995, 828, 44);
		panel.add(panel_11);

		final JLabel namelastLabel = new JLabel();
		namelastLabel.setForeground(new Color(128, 64, 64));
		namelastLabel.setText("NAME- ");
		namelastLabel.setBounds(2, 0, 41, 14);
		panel_11.add(namelastLabel);

		txtLast = new JTextField();
		txtLast.setBounds(5, 20, 125, 21);
		panel_11.add(txtLast);

		lblFirst = new JLabel();
		lblFirst.setForeground(new Color(128, 64, 64));
		lblFirst.setText("First");
		lblFirst.setBounds(170, 0, 54, 14);
		panel_11.add(lblFirst);

		txtFirst = new JTextField();
		txtFirst.setBounds(140, 20, 125, 21);
		panel_11.add(txtFirst);

		lblMiddle = new JLabel();
		lblMiddle.setForeground(new Color(128, 64, 64));
		lblMiddle.setText("Middle");
		lblMiddle.setBounds(300, 0, 54, 14);
		panel_11.add(lblMiddle);

		txtMiddle = new JTextField();
		txtMiddle.setBounds(275, 20, 125, 21);
		panel_11.add(txtMiddle);

		lblPhysician = new JLabel();
		lblPhysician.setForeground(new Color(128, 64, 64));
		lblPhysician.setText("Attending Physician");
		lblPhysician.setBounds(420, 0, 94, 14);
		panel_11.add(lblPhysician);

		lblRecordNo = new JLabel();
		lblRecordNo.setForeground(new Color(128, 64, 64));
		lblRecordNo.setText("Record No");
		lblRecordNo.setBounds(565, 0, 54, 14);
		panel_11.add(lblRecordNo);

		lblRoom = new JLabel();
		lblRoom.setForeground(new Color(128, 64, 64));
		lblRoom.setText("Room/Bed");
		lblRoom.setBounds(695, 0, 54, 14);
		panel_11.add(lblRoom);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(410, 20, 125, 21);
		panel_11.add(txtPhysician);

		txtRecordNo = new JTextField();
		txtRecordNo.setBounds(550, 20, 125, 21);
		panel_11.add(txtRecordNo);

		txtRoom = new JTextField();
		txtRoom.setBounds(690, 20, 137, 21);
		panel_11.add(txtRoom);

		lblLast = new JLabel();
		lblLast.setForeground(new Color(128, 64, 64));
		lblLast.setText("Last");
		lblLast.setBounds(49, 1, 41, 14);
		panel_11.add(lblLast);

		final JLabel label_43 = new JLabel();
		label_43.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_43
				.setText("<html><body> ABNORMAL INVOLUNTAF<br> MOVEMENT SCALE(AIM)");
		label_43.setForeground(new Color(128, 64, 64));
		label_43.setBounds(660, 1045, 165, 37);
		panel.add(label_43);

		final JLabel label_44 = new JLabel();
		label_44.setFont(new Font("Arial", Font.BOLD, 16));
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setText("ABNORMAL INVOLUNTARY MOVEMENT SCALE(AIMS)");
		label_44.setBounds(25, 15, 745, 14);
		add(label_44);

		final JLabel label_42 = new JLabel();
		label_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_42.setOpaque(true);
		label_42.setBackground(new Color(128, 64, 64));
		label_42.setForeground(Color.WHITE);
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setText("EVALUATOR SIGNATURES");
		label_42.setBounds(0, 880, 828, 16);
		panel.add(label_42);

		final JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBounds(300, 95, 528, 786);
		panel.add(panel_12);

		final JLabel assesmentDatesLabel = new JLabel();
		assesmentDatesLabel.setOpaque(true);
		assesmentDatesLabel.setBackground(new Color(91, 91, 91));
		assesmentDatesLabel.setForeground(Color.WHITE);
		assesmentDatesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		assesmentDatesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		assesmentDatesLabel.setText("ASSESMENT DATES");
		assesmentDatesLabel.setBounds(0, 0, 528, 15);
		panel_12.add(assesmentDatesLabel);

		PanelAbnormalInvoluntaryMovementCol[] colmns = new PanelAbnormalInvoluntaryMovementCol[4];
		for (int i = 0; i < 4; i++) {
			colmns[i] = new PanelAbnormalInvoluntaryMovementCol();
			colmns[i].setBounds(i * 132, 15, 132, 776);
			panel_12.add(colmns[i]);
		}

	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelAbnormalInvoluntryMovementScale panel = new PanelAbnormalInvoluntryMovementScale();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

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
		return false;
	}

}
