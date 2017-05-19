package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.PressureSoreRecordForm;

public class PanelPressureScoreRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -562907216388111802L;

	private JLabel label;

	private JTextArea week1TextArea_4;

	private JPanel panel_56;

	private JTextArea week1TextArea_3;

	private JPanel panel_55;

	private JTextArea week1TextArea_2;

	private JPanel panel_54;

	private JTextArea week1TextArea_1;

	private JPanel panel_53;

	private JTextArea week1TextArea;

	private JPanel panel_51;

	private PanelPressureScoreRecordRow panelRow25;

	private PanelPressureScoreRecordRow panelRow24;

	private PanelPressureScoreRecordRow panelRow23;

	private PanelPressureScoreRecordRow panelRow22;

	private PanelPressureScoreRecordRow panelRow21;

	private JPanel panel_46;

	private PanelPressureScoreRecordRow panelRow20;

	private PanelPressureScoreRecordRow panelRow19;

	private PanelPressureScoreRecordRow panelRow18;

	private PanelPressureScoreRecordRow panelRow17;

	private PanelPressureScoreRecordRow panelRow16;

	private JPanel panel_40;

	private PanelPressureScoreRecordRow panelRow15;

	private PanelPressureScoreRecordRow panelRow14;

	private PanelPressureScoreRecordRow panelRow13;

	private PanelPressureScoreRecordRow panelRow12;

	private PanelPressureScoreRecordRow panelRow11;

	private JPanel panel_34;

	private PanelPressureScoreRecordRow panelRow10;

	private PanelPressureScoreRecordRow panelRow9;

	private PanelPressureScoreRecordRow panelRow8;

	private PanelPressureScoreRecordRow panelRow7;

	private PanelPressureScoreRecordRow panelRow6;

	private JPanel panel_28;

	private PanelPressureScoreRecordRow panelRow5;

	private JPanel panel_25;

	private PanelPressureScoreRecordRow panelRow4;

	private PanelPressureScoreRecordRow panelRow2;

	private PanelPressureScoreRecordRow panelRow1;

	private PanelPressureScoreRecordRow panelRow3;

	private JLabel dateLabel_9;

	private JPanel panel_21;

	private JLabel dateLabel_8;

	private JPanel panel_20;

	private JLabel dateLabel_7;

	private JPanel panel_19;

	private JLabel dateLabel_6;

	private JPanel panel_18;

	private JLabel dateLabel_5;

	private JPanel panel_17;

	private JLabel dateLabel_4;

	private JPanel panel_16;

	private JLabel dateLabel_3;

	private JPanel panel_15;

	private JLabel dateLabel_2;

	private JPanel panel_14;

	private JLabel dateLabel_1;

	private JPanel panel_13;

	private JLabel dateLabel;

	private JPanel panel_11;

	private JPanel panel_10;

	private JPanel panel_6;

	private JTextArea tissueUnderlyingIntactTextArea;

	private JLabel bBlackLabel_26;

	private JLabel bBlackLabel_13;

	private JLabel colorLabel_3;

	private JPanel panel_9;

	private JLabel bBlackLabel_22;

	private JLabel bBlackLabel_21;

	private JLabel bBlackLabel_20;

	private JLabel bBlackLabel_19;

	private JLabel bBlackLabel_18;

	private JLabel colorLabel_2;

	private JPanel panel_8;

	private JLabel bBlackLabel_17;

	private JLabel bBlackLabel_16;

	private JLabel bBlackLabel_14;

	private JLabel bBlackLabel_12;

	private JLabel bBlackLabel_11;

	private JLabel bBlackLabel_10;

	private JLabel bBlackLabel_9;

	private JLabel colorLabel_1;

	private JPanel panel_7;

	private JLabel bBlackLabel_8;

	private JLabel bBlackLabel_7;

	private JLabel bBlackLabel_6;

	private JLabel bBlackLabel_5;

	private JLabel bBlackLabel_4;

	private JLabel bBlackLabel_3;

	private JLabel bBlackLabel_2;

	private JLabel bBlackLabel_1;

	private JLabel bBlackLabel;

	private JLabel colorLabel;

	private JPanel panel_5;

	private JLabel legendsLabel;

	private JPanel panel_4;

	private JPanel panel_3;

	private JLabel recordAllSectionsLabel;

	private JLabel pressureScoreRecordLabel;

	private JPanel panel_2;

	private JPanel panel_1;

	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelPressureScoreRecord() {
		super();

		Global.panelPressureScoreRecord = this;

		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1400, 800));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 149, 800);
		add(panel);

		label = new JLabel(new ImageIcon("img/psr.gif"));
		label.setBounds(0, 0, 149, 800);
		panel.add(label);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(149, 0, 1250, 837);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 1050, 40);
		panel_1.add(panel_2);

		pressureScoreRecordLabel = new JLabel();
		pressureScoreRecordLabel.setFont(new Font("", Font.BOLD, 16));
		pressureScoreRecordLabel.setText("PRESSURE SCORE RECORD");
		pressureScoreRecordLabel.setBounds(370, 0, 230, 22);
		panel_2.add(pressureScoreRecordLabel);

		recordAllSectionsLabel = new JLabel();
		recordAllSectionsLabel.setFont(new Font("", Font.PLAIN, 11));
		recordAllSectionsLabel.setBackground(Color.WHITE);
		recordAllSectionsLabel.setText("RECORD ALL SECTIONS AT LEAST WEEKLY.");
		recordAllSectionsLabel.setBounds(312, 23, 288, 17);
		panel_2.add(recordAllSectionsLabel);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 39, 170, 750);
		panel_1.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 170, 20);
		panel_3.add(panel_4);

		legendsLabel = new JLabel();
		legendsLabel.setForeground(new Color(255, 255, 255));
		legendsLabel.setText("LEGENDS");
		legendsLabel.setBounds(55, 2, 67, 17);
		panel_4.add(legendsLabel);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 19, 170, 174);
		panel_3.add(panel_5);

		colorLabel = new JLabel();
		colorLabel.setFont(new Font("", Font.BOLD, 12));
		colorLabel.setText("COLOR");
		colorLabel.setBounds(5, 9, 67, 17);
		panel_5.add(colorLabel);

		bBlackLabel = new JLabel();
		bBlackLabel.setText("B = BLACK");
		bBlackLabel.setBounds(5, 30, 67, 17);
		panel_5.add(bBlackLabel);

		bBlackLabel_1 = new JLabel();
		bBlackLabel_1.setText("G = GREEN");
		bBlackLabel_1.setBounds(5, 57, 70, 17);
		panel_5.add(bBlackLabel_1);

		bBlackLabel_2 = new JLabel();
		bBlackLabel_2.setText("NC = NECROTIC");
		bBlackLabel_2.setBounds(5, 82, 102, 17);
		panel_5.add(bBlackLabel_2);

		bBlackLabel_3 = new JLabel();
		bBlackLabel_3.setText("P = PINK");
		bBlackLabel_3.setBounds(5, 105, 55, 17);
		panel_5.add(bBlackLabel_3);

		bBlackLabel_4 = new JLabel();
		bBlackLabel_4.setText("Y = YELLOW");
		bBlackLabel_4.setBounds(5, 130, 80, 17);
		panel_5.add(bBlackLabel_4);

		bBlackLabel_5 = new JLabel();
		bBlackLabel_5.setText("W = WHITE");
		bBlackLabel_5.setBounds(90, 30, 80, 17);
		panel_5.add(bBlackLabel_5);

		bBlackLabel_6 = new JLabel();
		bBlackLabel_6.setText("R = RED");
		bBlackLabel_6.setBounds(90, 57, 80, 17);
		panel_5.add(bBlackLabel_6);

		bBlackLabel_7 = new JLabel();
		bBlackLabel_7.setText("O = OTHER");
		bBlackLabel_7.setBounds(90, 105, 80, 17);
		panel_5.add(bBlackLabel_7);

		bBlackLabel_8 = new JLabel();
		bBlackLabel_8.setText("N = NONE");
		bBlackLabel_8.setBounds(91, 130, 80, 17);
		panel_5.add(bBlackLabel_8);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 192, 170, 158);
		panel_3.add(panel_7);

		colorLabel_1 = new JLabel();
		colorLabel_1.setFont(new Font("", Font.BOLD, 12));
		colorLabel_1.setText("ODOR");
		colorLabel_1.setBounds(5, 9, 67, 17);
		panel_7.add(colorLabel_1);

		bBlackLabel_9 = new JLabel();
		bBlackLabel_9.setText("A = ACID");
		bBlackLabel_9.setBounds(5, 35, 67, 17);
		panel_7.add(bBlackLabel_9);

		bBlackLabel_10 = new JLabel();
		bBlackLabel_10.setText("FC = FECAL");
		bBlackLabel_10.setBounds(5, 65, 80, 17);
		panel_7.add(bBlackLabel_10);

		bBlackLabel_11 = new JLabel();
		bBlackLabel_11.setText("FL = FOUL");
		bBlackLabel_11.setBounds(5, 95, 80, 17);
		panel_7.add(bBlackLabel_11);

		bBlackLabel_12 = new JLabel();
		bBlackLabel_12.setText("SO = SOUR");
		bBlackLabel_12.setBounds(5, 125, 100, 17);
		panel_7.add(bBlackLabel_12);

		bBlackLabel_14 = new JLabel();
		bBlackLabel_14.setText("SW = SWEET");
		bBlackLabel_14.setBounds(80, 35, 90, 17);
		panel_7.add(bBlackLabel_14);

		bBlackLabel_16 = new JLabel();
		bBlackLabel_16.setText("O = OTHER");
		bBlackLabel_16.setBounds(90, 65, 80, 17);
		panel_7.add(bBlackLabel_16);

		bBlackLabel_17 = new JLabel();
		bBlackLabel_17.setText("N = NONE");
		bBlackLabel_17.setBounds(90, 95, 80, 17);
		panel_7.add(bBlackLabel_17);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 343, 170, 172);
		panel_3.add(panel_8);

		colorLabel_2 = new JLabel();
		colorLabel_2.setFont(new Font("", Font.BOLD, 12));
		colorLabel_2.setText("DRAINAGE");
		colorLabel_2.setBounds(5, 15, 67, 17);
		panel_8.add(colorLabel_2);

		bBlackLabel_18 = new JLabel();
		bBlackLabel_18.setText("M = MUCOUS");
		bBlackLabel_18.setBounds(5, 40, 105, 17);
		panel_8.add(bBlackLabel_18);

		bBlackLabel_19 = new JLabel();
		bBlackLabel_19.setText("TK = THICK");
		bBlackLabel_19.setBounds(5, 65, 105, 17);
		panel_8.add(bBlackLabel_19);

		bBlackLabel_20 = new JLabel();
		bBlackLabel_20.setText("TH = THIN");
		bBlackLabel_20.setBounds(5, 90, 80, 17);
		panel_8.add(bBlackLabel_20);

		bBlackLabel_21 = new JLabel();
		bBlackLabel_21.setText("RB = RED (BRIGHT)");
		bBlackLabel_21.setBounds(5, 115, 135, 17);
		panel_8.add(bBlackLabel_21);

		bBlackLabel_22 = new JLabel();
		bBlackLabel_22.setText("RD = RED (DARK)");
		bBlackLabel_22.setBounds(5, 140, 155, 17);
		panel_8.add(bBlackLabel_22);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 512, 170, 237);
		panel_3.add(panel_9);

		colorLabel_3 = new JLabel();
		colorLabel_3.setFont(new Font("", Font.BOLD, 12));
		colorLabel_3.setText("TUNNELING");
		colorLabel_3.setBounds(5, 15, 67, 17);
		panel_9.add(colorLabel_3);

		bBlackLabel_13 = new JLabel();
		bBlackLabel_13.setText("Y = YES");
		bBlackLabel_13.setBounds(5, 35, 67, 17);
		panel_9.add(bBlackLabel_13);

		bBlackLabel_26 = new JLabel();
		bBlackLabel_26.setText("N = NO");
		bBlackLabel_26.setBounds(78, 35, 67, 17);
		panel_9.add(bBlackLabel_26);

		tissueUnderlyingIntactTextArea = new JTextArea();
		tissueUnderlyingIntactTextArea
				.setText("TISSUE UNDERLYING INTACT SKIN ALONG MARGIN. INSERT Q-TIP, MEASURE AT DEEPEST SITE IN CM. DESCRIBE DIRECTION OF TUNNELING IN RELATIONSHIP TO HANDS ON A CLOCK. HEAD IS 12 O'CLOCK.");
		tissueUnderlyingIntactTextArea.setBackground(Color.WHITE);
		tissueUnderlyingIntactTextArea.setLineWrap(true);
		tissueUnderlyingIntactTextArea.setWrapStyleWord(true);
		tissueUnderlyingIntactTextArea.setEditable(false);
		tissueUnderlyingIntactTextArea.setBounds(5, 55, 155, 187);
		panel_9.add(tissueUnderlyingIntactTextArea);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(192, 39, 1058, 20);
		panel_1.add(panel_6);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 54, 20);
		panel_6.add(panel_11);

		dateLabel = new JLabel();
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setText("DATE");
		dateLabel.setBounds(10, 2, 34, 17);
		panel_11.add(dateLabel);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(55, 0, 85, 20);
		panel_6.add(panel_13);

		dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(new Color(255, 255, 255));
		dateLabel_1.setText("LOCATION");
		dateLabel_1.setBounds(10, 2, 68, 17);
		panel_13.add(dateLabel_1);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setBounds(141, 0, 52, 20);
		panel_6.add(panel_14);

		dateLabel_2 = new JLabel();
		dateLabel_2.setForeground(new Color(255, 255, 255));
		dateLabel_2.setText("STAGE");
		dateLabel_2.setBounds(5, 2, 44, 17);
		panel_14.add(dateLabel_2);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.DARK_GRAY);
		panel_15.setBounds(194, 0, 180, 20);
		panel_6.add(panel_15);

		dateLabel_3 = new JLabel();
		dateLabel_3.setForeground(new Color(255, 255, 255));
		dateLabel_3.setText("DIAMETER/DEPTH");
		dateLabel_3.setBounds(30, 2, 118, 17);
		panel_15.add(dateLabel_3);

		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.DARK_GRAY);
		panel_16.setBounds(375, 0, 55, 20);
		panel_6.add(panel_16);

		dateLabel_4 = new JLabel();
		dateLabel_4.setForeground(new Color(255, 255, 255));
		dateLabel_4.setText("COLOR");
		dateLabel_4.setBounds(5, 2, 45, 17);
		panel_16.add(dateLabel_4);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.DARK_GRAY);
		panel_17.setBounds(431, 0, 46, 20);
		panel_6.add(panel_17);

		dateLabel_5 = new JLabel();
		dateLabel_5.setForeground(new Color(255, 255, 255));
		dateLabel_5.setText("ODOR");
		dateLabel_5.setBounds(5, 2, 40, 17);
		panel_17.add(dateLabel_5);

		panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.DARK_GRAY);
		panel_18.setBounds(478, 0, 52, 20);
		panel_6.add(panel_18);

		dateLabel_6 = new JLabel();
		dateLabel_6.setForeground(new Color(255, 255, 255));
		dateLabel_6.setText("DRAIN");
		dateLabel_6.setBounds(6, 2, 45, 17);
		panel_18.add(dateLabel_6);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.DARK_GRAY);
		panel_19.setBounds(531, 0, 100, 20);
		panel_6.add(panel_19);

		dateLabel_7 = new JLabel();
		dateLabel_7.setForeground(new Color(255, 255, 255));
		dateLabel_7.setText("TUNNELING");
		dateLabel_7.setBounds(15, 2, 72, 17);
		panel_19.add(dateLabel_7);

		panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(Color.DARK_GRAY);
		panel_20.setBounds(632, 0, 390, 20);
		panel_6.add(panel_20);

		dateLabel_8 = new JLabel();
		dateLabel_8.setForeground(new Color(255, 255, 255));
		dateLabel_8.setText("COMMENTS / PROGRESS NOTES");
		dateLabel_8.setBounds(80, 2, 219, 17);
		panel_20.add(dateLabel_8);

		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.DARK_GRAY);
		panel_21.setBounds(1023, 0, 35, 20);
		panel_6.add(panel_21);

		dateLabel_9 = new JLabel();
		dateLabel_9.setForeground(new Color(255, 255, 255));
		dateLabel_9.setText("INIT");
		dateLabel_9.setBounds(5, 2, 30, 17);
		panel_21.add(dateLabel_9);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(171, 40, 20, 750);
		panel_1.add(panel_10);

		panel_51 = new JPanel();
		panel_51.setBackground(Color.DARK_GRAY);
		panel_51.setLayout(null);
		panel_51.setBounds(0, 0, 20, 165);
		panel_10.add(panel_51);

		week1TextArea = new JTextArea();
		week1TextArea.setText("W  E   E   K   1");
		week1TextArea.setWrapStyleWord(true);
		week1TextArea.setLineWrap(true);
		week1TextArea.setEditable(false);
		week1TextArea.setForeground(new Color(255, 255, 255));
		week1TextArea.setBackground(Color.DARK_GRAY);
		week1TextArea.setBounds(2, 35, 18, 93);
		panel_51.add(week1TextArea);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBackground(Color.DARK_GRAY);
		panel_53.setBounds(0, 166, 20, 145);
		panel_10.add(panel_53);

		week1TextArea_1 = new JTextArea();
		week1TextArea_1.setWrapStyleWord(true);
		week1TextArea_1.setText("W  E   E   K   2");
		week1TextArea_1.setLineWrap(true);
		week1TextArea_1.setForeground(new Color(255, 255, 255));
		week1TextArea_1.setEditable(false);
		week1TextArea_1.setBackground(Color.DARK_GRAY);
		week1TextArea_1.setBounds(2, 25, 18, 93);
		panel_53.add(week1TextArea_1);

		panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBackground(Color.DARK_GRAY);
		panel_54.setBounds(0, 312, 20, 145);
		panel_10.add(panel_54);

		week1TextArea_2 = new JTextArea();
		week1TextArea_2.setWrapStyleWord(true);
		week1TextArea_2.setText("W  E   E   K   3");
		week1TextArea_2.setLineWrap(true);
		week1TextArea_2.setForeground(new Color(255, 255, 255));
		week1TextArea_2.setEditable(false);
		week1TextArea_2.setBackground(Color.DARK_GRAY);
		week1TextArea_2.setBounds(2, 25, 18, 93);
		panel_54.add(week1TextArea_2);

		panel_55 = new JPanel();
		panel_55.setLayout(null);
		panel_55.setBackground(Color.DARK_GRAY);
		panel_55.setBounds(0, 458, 20, 145);
		panel_10.add(panel_55);

		week1TextArea_3 = new JTextArea();
		week1TextArea_3.setWrapStyleWord(true);
		week1TextArea_3.setText("W  E   E   K   4");
		week1TextArea_3.setLineWrap(true);
		week1TextArea_3.setForeground(new Color(255, 255, 255));
		week1TextArea_3.setEditable(false);
		week1TextArea_3.setBackground(Color.DARK_GRAY);
		week1TextArea_3.setBounds(2, 25, 18, 93);
		panel_55.add(week1TextArea_3);

		panel_56 = new JPanel();
		panel_56.setLayout(null);
		panel_56.setBackground(Color.DARK_GRAY);
		panel_56.setBounds(0, 604, 20, 145);
		panel_10.add(panel_56);

		week1TextArea_4 = new JTextArea();
		week1TextArea_4.setWrapStyleWord(true);
		week1TextArea_4.setText("W  E   E   K   5");
		week1TextArea_4.setLineWrap(true);
		week1TextArea_4.setForeground(new Color(255, 255, 255));
		week1TextArea_4.setEditable(false);
		week1TextArea_4.setBackground(Color.DARK_GRAY);
		week1TextArea_4.setBounds(2, 25, 18, 93);
		panel_56.add(week1TextArea_4);

		panel_25 = new JPanel();
		panel_25.setBackground(Color.WHITE);
		panel_25.setLayout(null);
		panel_25.setBounds(192, 60, 1058, 146);
		panel_1.add(panel_25);

		panelRow1 = new PanelPressureScoreRecordRow(1);
		panelRow1.setBounds(0, 0, 1058, 30);
		panel_25.add(panelRow1);
		panelRow1.setLayout(null);

		panelRow2 = new PanelPressureScoreRecordRow(2);
		panelRow2.setBounds(0, 29, 1058, 30);
		panel_25.add(panelRow2);
		panelRow2.setLayout(null);

		panelRow3 = new PanelPressureScoreRecordRow(3);
		panelRow3.setBounds(0, 58, 1058, 30);
		panel_25.add(panelRow3);
		panelRow3.setLayout(null);

		panelRow4 = new PanelPressureScoreRecordRow(4);
		panelRow4.setBounds(0, 87, 1058, 30);
		panel_25.add(panelRow4);
		panelRow4.setLayout(null);

		panelRow5 = new PanelPressureScoreRecordRow(5);
		panelRow5.setLayout(null);
		panelRow5.setBounds(0, 116, 1058, 30);
		panel_25.add(panelRow5);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(192, 206, 1058, 146);
		panel_1.add(panel_28);

		panelRow6 = new PanelPressureScoreRecordRow(6);
		panelRow6.setLayout(null);
		panelRow6.setBounds(0, 0, 1058, 30);
		panel_28.add(panelRow6);

		panelRow7 = new PanelPressureScoreRecordRow(7);
		panelRow7.setLayout(null);
		panelRow7.setBounds(0, 29, 1058, 30);
		panel_28.add(panelRow7);

		panelRow8 = new PanelPressureScoreRecordRow(8);
		panelRow8.setLayout(null);
		panelRow8.setBounds(0, 58, 1058, 30);
		panel_28.add(panelRow8);

		panelRow9 = new PanelPressureScoreRecordRow(9);
		panelRow9.setLayout(null);
		panelRow9.setBounds(0, 87, 1058, 30);
		panel_28.add(panelRow9);

		panelRow10 = new PanelPressureScoreRecordRow(10);
		panelRow10.setLayout(null);
		panelRow10.setBounds(0, 116, 1058, 30);
		panel_28.add(panelRow10);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(192, 352, 1058, 146);
		panel_1.add(panel_34);

		panelRow11 = new PanelPressureScoreRecordRow(11);
		panelRow11.setLayout(null);
		panelRow11.setBounds(0, 0, 1058, 30);
		panel_34.add(panelRow11);

		panelRow12 = new PanelPressureScoreRecordRow(12);
		panelRow12.setLayout(null);
		panelRow12.setBounds(0, 29, 1058, 30);
		panel_34.add(panelRow12);

		panelRow13 = new PanelPressureScoreRecordRow(13);
		panelRow13.setLayout(null);
		panelRow13.setBounds(0, 58, 1058, 30);
		panel_34.add(panelRow13);

		panelRow14 = new PanelPressureScoreRecordRow(14);
		panelRow14.setLayout(null);
		panelRow14.setBounds(0, 87, 1058, 30);
		panel_34.add(panelRow14);

		panelRow15 = new PanelPressureScoreRecordRow(15);
		panelRow15.setLayout(null);
		panelRow15.setBounds(0, 116, 1058, 30);
		panel_34.add(panelRow15);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(192, 498, 1058, 146);
		panel_1.add(panel_40);

		panelRow16 = new PanelPressureScoreRecordRow(16);
		panelRow16.setLayout(null);
		panelRow16.setBounds(0, 0, 1058, 30);
		panel_40.add(panelRow16);

		panelRow17 = new PanelPressureScoreRecordRow(17);
		panelRow17.setLayout(null);
		panelRow17.setBounds(0, 29, 1058, 30);
		panel_40.add(panelRow17);

		panelRow18 = new PanelPressureScoreRecordRow(18);
		panelRow18.setLayout(null);
		panelRow18.setBounds(0, 58, 1058, 30);
		panel_40.add(panelRow18);

		panelRow19 = new PanelPressureScoreRecordRow(19);
		panelRow19.setLayout(null);
		panelRow19.setBounds(0, 87, 1058, 30);
		panel_40.add(panelRow19);

		panelRow20 = new PanelPressureScoreRecordRow(20);
		panelRow20.setLayout(null);
		panelRow20.setBounds(0, 116, 1058, 30);
		panel_40.add(panelRow20);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(192, 644, 1058, 146);
		panel_1.add(panel_46);

		panelRow21 = new PanelPressureScoreRecordRow(21);
		panelRow21.setLayout(null);
		panelRow21.setBounds(0, 0, 1058, 30);
		panel_46.add(panelRow21);

		panelRow22 = new PanelPressureScoreRecordRow(22);
		panelRow22.setLayout(null);
		panelRow22.setBounds(0, 29, 1058, 30);
		panel_46.add(panelRow22);

		panelRow23 = new PanelPressureScoreRecordRow(23);
		panelRow23.setLayout(null);
		panelRow23.setBounds(0, 58, 1058, 30);
		panel_46.add(panelRow23);

		panelRow24 = new PanelPressureScoreRecordRow(24);
		panelRow24.setLayout(null);
		panelRow24.setBounds(0, 87, 1058, 30);
		panel_46.add(panelRow24);

		panelRow25 = new PanelPressureScoreRecordRow(25);
		panelRow25.setLayout(null);
		panelRow25.setBounds(0, 116, 1058, 30);
		panel_46.add(panelRow25);

		fillCombos();
		updateData();
	}

	public void fillCombos() {

	}

	public void updateData() {

		panelRow1.updateData();
		panelRow2.updateData();
		panelRow3.updateData();
		panelRow4.updateData();
		panelRow5.updateData();
		panelRow6.updateData();
		panelRow7.updateData();
		panelRow8.updateData();
		panelRow9.updateData();
		panelRow10.updateData();
		panelRow11.updateData();
		panelRow12.updateData();
		panelRow13.updateData();
		panelRow14.updateData();
		panelRow15.updateData();
		panelRow16.updateData();
		panelRow17.updateData();
		panelRow18.updateData();
		panelRow19.updateData();
		panelRow20.updateData();
		panelRow21.updateData();
		panelRow22.updateData();
		panelRow23.updateData();
		panelRow24.updateData();
		panelRow25.updateData();

	}

	public void doSave() {

		PressureSoreRecordForm psrf = new PressureSoreRecordForm();

		psrf.setSerial(Global.currentPressureSoreRecordFormKey);
		psrf.setResidentId(Global.currentResidenceKey);

		try {
			Global.currentPressureSoreRecordFormKey = MedrexClientManager
					.getInstance().insertOrUpdatePressureSoreRecordForm(psrf);
		} catch (Exception e) {

		}

		panelRow1.doSave();
		panelRow2.doSave();
		panelRow3.doSave();
		panelRow4.doSave();
		panelRow5.doSave();
		panelRow6.doSave();
		panelRow7.doSave();
		panelRow8.doSave();
		panelRow9.doSave();
		panelRow10.doSave();
		panelRow11.doSave();
		panelRow12.doSave();
		panelRow13.doSave();
		panelRow14.doSave();
		panelRow15.doSave();
		panelRow16.doSave();
		panelRow17.doSave();
		panelRow18.doSave();
		panelRow19.doSave();
		panelRow20.doSave();
		panelRow21.doSave();
		panelRow22.doSave();
		panelRow23.doSave();
		panelRow24.doSave();
		panelRow25.doSave();

	}

}
