package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.PainManagementRecordFormPage1;
import medrex.commons.vo.resident.ResidentMain;

public class PanelPainManagementRecordFormPage1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4181551944006003233L;
	private JTextArea txtEvalution1;
	private JPanel panel_55;
	private JTextArea txtEvalution;
	private JPanel panel_53;
	private PanelPainManagementRow panelPainManagementRecordRow6;
	private PanelPainManagementRow panelPainManagementRecordRow5;
	private PanelPainManagementRow panelPainManagementRecordRow4;
	private PanelPainManagementRow panelPainManagementRecordRow3;
	private PanelPainManagementRow panelPainManagementRecordRow2;
	private PanelPainManagementRow panelPainManagementRecordRow1;
	private JTextArea pharmacologicalInterventionSTextArea_3;
	private JPanel panel_47;
	private JTextArea dateTextArea_6;
	private JPanel panel_46;
	private JTextArea dateTextArea_5;
	private JPanel panel_45;
	private JTextArea dateTextArea_4;
	private JPanel panel_44;
	private JTextArea pharmacologicalInterventionSTextArea_2;
	private JPanel panel_43;
	private JTextArea pharmacologicalInterventionSTextArea_1;
	private JPanel panel_42;
	private JTextArea dateTextArea_3;
	private JPanel panel_41;
	private JTextArea locationOfPainTextArea;
	private JTextArea dateTextArea_2;
	private JPanel panel_40;
	private JPanel panel_39;
	private JTextArea dateTextArea_1;
	private JPanel panel_38;
	private JTextArea dateTextArea;
	private JPanel panel_37;
	private JTextArea pharmacologicalInterventionSTextArea;
	private JPanel panel_35;
	private JPanel panel_34;
	private JPanel panel_13;
	private JLabel label_16;
	private JLabel label_15;
	private JLabel label_14;
	private JLabel label_13;
	private JLabel label_12;
	private JLabel label_7;
	private JLabel totalColumnsAndLabel;
	private JTextArea cryingTextArea_19;
	private JPanel panel_33;
	private JTextArea cryingTextArea_18;
	private JPanel panel_32;
	private JTextArea cryingTextArea_17;
	private JPanel panel_31;
	private JTextArea cryingTextArea_16;
	private JPanel panel_30;
	private JPanel panel_29;
	private JTextArea cryingTextArea_15;
	private JPanel panel_28;
	private JTextArea cryingTextArea_14;
	private JPanel panel_27;
	private JTextArea cryingTextArea_13;
	private JPanel panel_26;
	private JTextArea cryingTextArea_12;
	private JPanel panel_14;
	private JTextArea cryingTextArea_11;
	private JPanel panel_25;
	private JTextArea cryingTextArea_10;
	private JPanel panel_24;
	private JTextArea cryingTextArea_9;
	private JPanel panel_23;
	private JTextArea cryingTextArea_8;
	private JPanel panel_22;
	private JTextArea cryingTextArea_7;
	private JPanel panel_21;
	private JTextArea cryingTextArea_6;
	private JPanel panel_20;
	private JTextArea cryingTextArea_5;
	private JPanel panel_19;
	private JTextArea cryingTextArea_4;
	private JPanel panel_18;
	private JTextArea cryingTextArea_3;
	private JTextArea cryingTextArea_2;
	private JTextArea cryingTextArea_1;
	private JTextArea cryingTextArea;
	private JPanel panel_17;
	private JPanel panel_16;
	private JPanel panel_15;
	private JPanel panel_9;
	private JPanel panel_12;
	private JPanel panel_11;
	private JPanel panel_10;
	private JPanel panel_8;
	private JTextArea categoryTextArea_3;
	private JTextArea categoryTextArea_2;
	private JTextArea categoryTextArea_1;
	private JLabel label_10;
	private JLabel label_9;
	private JLabel label_8;
	private JTextArea categoryTextArea;
	private JLabel label_6;
	private JPanel panel_7;
	private JPanel panel_5;
	private JLabel useForResidentsLabel;
	private JLabel behaviorObservationScaleLabel;
	private JLabel useLabel;
	private JLabel wLabel;
	private JPanel panel_6;
	private JPanel panel_4;
	private JPanel panel_3;
	private JTextArea txtWorstPossiblePain;
	private JTextArea txtVerySeverePain;
	private JTextArea txtSeverePain;
	private JTextArea txtMioderatePain;
	private JTextArea txtMildPain;
	private JTextArea txtNoPain;
	private JPanel panel_2;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label_1;
	private JLabel label;
	private JTextArea txtOrientedResident;
	private JLabel verbalMumericalLabel;
	private JPanel panel_1;
	private JTextField txtResidentGoal;
	private JLabel residentsPainRatingLabel;
	private JTextField txtResidentPain;
	private JLabel residentsAcceptableLevelLabel;
	private JTextField txtResidentName;
	private JLabel residentNameLabel;
	private JPanel panel;
	private JLabel painManagementRecordLabel;

	/**
	 * Create the panel
	 */
	public PanelPainManagementRecordFormPage1() {
		super();
		Global.panelPainManagementRecordFormPage1 = this;
		setLayout(null);
		setPreferredSize(new Dimension(1200, 950));
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);

		painManagementRecordLabel = new JLabel();
		painManagementRecordLabel.setFont(new Font("", Font.BOLD, 18));
		painManagementRecordLabel.setText("PAIN MANAGEMENT RECORD");
		painManagementRecordLabel.setBounds(510, 10, 300, 17);
		add(painManagementRecordLabel);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(9, 40, 1180, 900);
		add(panel);

		residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(10, 5, 111, 17);
		panel.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(115, 5, 240, 24);
		panel.add(txtResidentName);

		residentsAcceptableLevelLabel = new JLabel();
		residentsAcceptableLevelLabel
				.setText("Resident's Acceptable Level of Pain :");
		residentsAcceptableLevelLabel.setBounds(364, 5, 223, 17);
		panel.add(residentsAcceptableLevelLabel);

		txtResidentPain = new JTextField();
		txtResidentPain.setBounds(590, 5, 200, 24);
		panel.add(txtResidentPain);

		residentsPainRatingLabel = new JLabel();
		residentsPainRatingLabel.setText("Resident's Pain Rating Goal:");
		residentsPainRatingLabel.setBounds(800, 5, 176, 17);
		panel.add(residentsPainRatingLabel);

		txtResidentGoal = new JTextField();
		txtResidentGoal.setBounds(974, 5, 200, 24);
		panel.add(txtResidentGoal);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 60, 345, 420);
		panel.add(panel_1);

		verbalMumericalLabel = new JLabel();
		verbalMumericalLabel.setFont(new Font("", Font.BOLD, 16));
		verbalMumericalLabel.setText("Verbal / Numerical Scale (VNS)");
		verbalMumericalLabel.setBounds(60, 2, 243, 17);
		panel_1.add(verbalMumericalLabel);

		txtOrientedResident = new JTextArea();
		txtOrientedResident
				.setText("Oriented residents who can understand and appropriately respond to verbal questions. Ask resident to rate pain on a 0 - 10 scale :");
		txtOrientedResident.setBackground(Color.WHITE);
		txtOrientedResident.setWrapStyleWord(true);
		txtOrientedResident.setLineWrap(true);
		txtOrientedResident.setEditable(false);
		txtOrientedResident.setBounds(40, 23, 269, 72);
		panel_1.add(txtOrientedResident);

		label = new JLabel();
		label.setText("0 - 1 = No Pain");
		label.setBounds(50, 101, 107, 17);
		panel_1.add(label);

		label_1 = new JLabel();
		label_1.setText("2 - 3 = Mild Pain");
		label_1.setBounds(50, 124, 107, 17);
		panel_1.add(label_1);

		label_2 = new JLabel();
		label_2.setText("4 - 5 = Moderate Pain");
		label_2.setBounds(50, 147, 133, 17);
		panel_1.add(label_2);

		label_3 = new JLabel();
		label_3.setText("6 - 7 = Severe Pain");
		label_3.setBounds(50, 170, 133, 17);
		panel_1.add(label_3);

		label_4 = new JLabel();
		label_4.setText("8 - 9 = Very Severe Pain");
		label_4.setBounds(50, 193, 150, 17);
		panel_1.add(label_4);

		label_5 = new JLabel();
		label_5.setText("10 = Worst Possible Pain");
		label_5.setBounds(63, 216, 169, 17);
		panel_1.add(label_5);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 280, 345, 52);
		panel_1.add(panel_2);

		txtNoPain = new JTextArea();
		txtNoPain.setText("No Pain");
		txtNoPain.setWrapStyleWord(true);
		txtNoPain.setLineWrap(true);
		txtNoPain.setBackground(Color.WHITE);
		txtNoPain.setEditable(false);
		txtNoPain.setBounds(5, 0, 40, 40);
		panel_2.add(txtNoPain);

		txtMioderatePain = new JTextArea();
		txtMioderatePain.setWrapStyleWord(true);
		txtMioderatePain.setText("Mild Pain");
		txtMioderatePain.setLineWrap(true);
		txtMioderatePain.setEditable(false);
		txtMioderatePain.setBackground(Color.WHITE);
		txtMioderatePain.setBounds(45, 0, 40, 40);
		panel_2.add(txtMioderatePain);

		txtMioderatePain = new JTextArea();
		txtMioderatePain.setWrapStyleWord(true);
		txtMioderatePain.setText("Moderate Pain");
		txtMioderatePain.setLineWrap(true);
		txtMioderatePain.setEditable(false);
		txtMioderatePain.setBackground(Color.WHITE);
		txtMioderatePain.setBounds(90, 0, 62, 40);
		panel_2.add(txtMioderatePain);

		txtSeverePain = new JTextArea();
		txtSeverePain.setWrapStyleWord(true);
		txtSeverePain.setText("Severe Pain");
		txtSeverePain.setLineWrap(true);
		txtSeverePain.setEditable(false);
		txtSeverePain.setBackground(Color.WHITE);
		txtSeverePain.setBounds(164, 0, 49, 40);
		panel_2.add(txtSeverePain);

		txtWorstPossiblePain = new JTextArea();
		txtWorstPossiblePain.setWrapStyleWord(true);
		txtWorstPossiblePain.setText("Very Severe Pain");
		txtWorstPossiblePain.setLineWrap(true);
		txtWorstPossiblePain.setEditable(false);
		txtWorstPossiblePain.setBackground(Color.WHITE);
		txtWorstPossiblePain.setBounds(224, 0, 49, 50);
		panel_2.add(txtWorstPossiblePain);

		txtWorstPossiblePain = new JTextArea();
		txtWorstPossiblePain.setWrapStyleWord(true);
		txtWorstPossiblePain.setText("Worst Possible Pain");
		txtWorstPossiblePain.setLineWrap(true);
		txtWorstPossiblePain.setEditable(false);
		txtWorstPossiblePain.setBackground(Color.WHITE);
		txtWorstPossiblePain.setBounds(286, 0, 49, 50);
		panel_2.add(txtWorstPossiblePain);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 338, 345, 84);
		panel_1.add(panel_3);

		final JLabel label_17 = new JLabel(new ImageIcon("img/vns.gif"));
		label_17.setBounds(10, 10, 325, 48);
		panel_3.add(label_17);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(364, 60, 360, 420);
		panel.add(panel_4);

		wLabel = new JLabel();
		wLabel.setFont(new Font("", Font.BOLD, 16));
		wLabel.setText("Word Face Scale (WFS)");
		wLabel.setBounds(70, 2, 187, 17);
		panel_4.add(wLabel);

		useLabel = new JLabel();
		useLabel.setFont(new Font("", Font.PLAIN, 16));
		useLabel.setText("Use for confused residents");
		useLabel.setBounds(65, 25, 207, 17);
		panel_4.add(useLabel);

		final JLabel label_11 = new JLabel(new ImageIcon("img/wfs.gif"));
		label_11.setBounds(28, 96, 310, 270);
		panel_4.add(label_11);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(740, 60, 440, 420);
		panel.add(panel_6);

		behaviorObservationScaleLabel = new JLabel();
		behaviorObservationScaleLabel.setFont(new Font("", Font.BOLD, 16));
		behaviorObservationScaleLabel
				.setText("Behavior Observation Scale (OBS)");
		behaviorObservationScaleLabel.setBounds(70, 2, 272, 17);
		panel_6.add(behaviorObservationScaleLabel);

		useForResidentsLabel = new JLabel();
		useForResidentsLabel.setFont(new Font("", Font.PLAIN, 16));
		useForResidentsLabel
				.setText("Use for residents who are unable to communicate");
		useForResidentsLabel.setBounds(27, 25, 351, 17);
		panel_6.add(useForResidentsLabel);

		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 48, 440, 320);
		panel_6.add(panel_7);
		panel_7.setLayout(null);

		panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 440, 25);
		panel_7.add(panel_5);
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);

		label_6 = new JLabel();
		label_6.setBorder(new LineBorder(Color.black, 1, false));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(0, 0, 80, 25);
		panel_5.add(label_6);

		categoryTextArea = new JTextArea();
		categoryTextArea.setBackground(Color.WHITE);
		categoryTextArea.setWrapStyleWord(true);
		categoryTextArea.setLineWrap(true);
		categoryTextArea.setEditable(false);
		categoryTextArea.setText("Category");
		categoryTextArea.setBounds(12, 2, 59, 21);
		panel_5.add(categoryTextArea);

		label_8 = new JLabel();
		label_8.setBorder(new LineBorder(Color.black, 1, false));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(79, 0, 110, 25);
		panel_5.add(label_8);

		label_9 = new JLabel();
		label_9.setBorder(new LineBorder(Color.black, 1, false));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(188, 0, 112, 25);
		panel_5.add(label_9);

		label_10 = new JLabel();
		label_10.setBorder(new LineBorder(Color.black, 1, false));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(299, 0, 141, 25);
		panel_5.add(label_10);

		categoryTextArea_1 = new JTextArea();
		categoryTextArea_1.setWrapStyleWord(true);
		categoryTextArea_1.setText("Value = 0");
		categoryTextArea_1.setLineWrap(true);
		categoryTextArea_1.setEditable(false);
		categoryTextArea_1.setBackground(Color.WHITE);
		categoryTextArea_1.setBounds(105, 2, 75, 21);
		panel_5.add(categoryTextArea_1);

		categoryTextArea_2 = new JTextArea();
		categoryTextArea_2.setWrapStyleWord(true);
		categoryTextArea_2.setText("Value = 1");
		categoryTextArea_2.setLineWrap(true);
		categoryTextArea_2.setEditable(false);
		categoryTextArea_2.setBackground(Color.WHITE);
		categoryTextArea_2.setBounds(215, 2, 75, 21);
		panel_5.add(categoryTextArea_2);

		categoryTextArea_3 = new JTextArea();
		categoryTextArea_3.setWrapStyleWord(true);
		categoryTextArea_3.setText("Value = 2");
		categoryTextArea_3.setLineWrap(true);
		categoryTextArea_3.setEditable(false);
		categoryTextArea_3.setBackground(Color.WHITE);
		categoryTextArea_3.setBounds(330, 2, 75, 21);
		panel_5.add(categoryTextArea_3);

		panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 24, 440, 50);
		panel_7.add(panel_8);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 80, 50);
		panel_8.add(panel_9);

		cryingTextArea = new JTextArea();
		cryingTextArea.setWrapStyleWord(true);
		cryingTextArea.setLineWrap(true);
		cryingTextArea.setBackground(Color.WHITE);
		cryingTextArea.setEditable(false);
		cryingTextArea.setText("Crying");
		cryingTextArea.setBounds(20, 10, 42, 21);
		panel_9.add(cryingTextArea);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(79, 0, 110, 50);
		panel_8.add(panel_15);

		cryingTextArea_1 = new JTextArea();
		cryingTextArea_1.setBackground(Color.WHITE);
		cryingTextArea_1.setEditable(false);
		cryingTextArea_1.setText("No Crying");
		cryingTextArea_1.setBounds(20, 10, 63, 21);
		panel_15.add(cryingTextArea_1);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(188, 0, 112, 50);
		panel_8.add(panel_16);

		cryingTextArea_2 = new JTextArea();
		cryingTextArea_2.setWrapStyleWord(true);
		cryingTextArea_2.setLineWrap(true);
		cryingTextArea_2.setBackground(Color.WHITE);
		cryingTextArea_2.setEditable(false);
		cryingTextArea_2.setText("Moans or Whimpers");
		cryingTextArea_2.setBounds(23, 3, 70, 45);
		panel_16.add(cryingTextArea_2);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(299, 0, 141, 50);
		panel_8.add(panel_17);

		cryingTextArea_3 = new JTextArea();
		cryingTextArea_3.setWrapStyleWord(true);
		cryingTextArea_3.setText("Crying Steadily Screams or Sobs");
		cryingTextArea_3.setLineWrap(true);
		cryingTextArea_3.setEditable(false);
		cryingTextArea_3.setBackground(Color.WHITE);
		cryingTextArea_3.setBounds(14, 3, 117, 45);
		panel_17.add(cryingTextArea_3);

		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 73, 440, 75);
		panel_7.add(panel_10);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 0, 80, 75);
		panel_10.add(panel_18);

		cryingTextArea_4 = new JTextArea();
		cryingTextArea_4.setWrapStyleWord(true);
		cryingTextArea_4.setLineWrap(true);
		cryingTextArea_4.setBackground(Color.WHITE);
		cryingTextArea_4.setEditable(false);
		cryingTextArea_4.setText("Face");
		cryingTextArea_4.setBounds(24, 20, 42, 21);
		panel_18.add(cryingTextArea_4);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(79, 0, 110, 75);
		panel_10.add(panel_19);

		cryingTextArea_5 = new JTextArea();
		cryingTextArea_5.setLineWrap(true);
		cryingTextArea_5.setWrapStyleWord(true);
		cryingTextArea_5.setText("No Particular Expression");
		cryingTextArea_5.setEditable(false);
		cryingTextArea_5.setBackground(Color.WHITE);
		cryingTextArea_5.setBounds(15, 12, 90, 38);
		panel_19.add(cryingTextArea_5);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(188, 0, 112, 75);
		panel_10.add(panel_20);

		cryingTextArea_6 = new JTextArea();
		cryingTextArea_6.setWrapStyleWord(true);
		cryingTextArea_6.setText("Occasional Grimace or Frown");
		cryingTextArea_6.setLineWrap(true);
		cryingTextArea_6.setEditable(false);
		cryingTextArea_6.setBackground(Color.WHITE);
		cryingTextArea_6.setBounds(16, 8, 76, 50);
		panel_20.add(cryingTextArea_6);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(299, 0, 141, 75);
		panel_10.add(panel_21);

		cryingTextArea_7 = new JTextArea();
		cryingTextArea_7.setWrapStyleWord(true);
		cryingTextArea_7
				.setText("Frequent to constant Frown Clenched Jaw Quivering Chin");
		cryingTextArea_7.setLineWrap(true);
		cryingTextArea_7.setEditable(false);
		cryingTextArea_7.setBackground(Color.WHITE);
		cryingTextArea_7.setBounds(15, 0, 120, 70);
		panel_21.add(cryingTextArea_7);

		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 147, 440, 65);
		panel_7.add(panel_11);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 0, 80, 65);
		panel_11.add(panel_22);

		cryingTextArea_8 = new JTextArea();
		cryingTextArea_8.setWrapStyleWord(true);
		cryingTextArea_8.setLineWrap(true);
		cryingTextArea_8.setText("Body Position");
		cryingTextArea_8.setEditable(false);
		cryingTextArea_8.setBackground(Color.WHITE);
		cryingTextArea_8.setBounds(15, 10, 50, 40);
		panel_22.add(cryingTextArea_8);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(79, 0, 110, 65);
		panel_11.add(panel_23);

		cryingTextArea_9 = new JTextArea();
		cryingTextArea_9.setWrapStyleWord(true);
		cryingTextArea_9.setText("Lying Quitely Normal Position");
		cryingTextArea_9.setLineWrap(true);
		cryingTextArea_9.setEditable(false);
		cryingTextArea_9.setBackground(Color.WHITE);
		cryingTextArea_9.setBounds(8, 12, 100, 38);
		panel_23.add(cryingTextArea_9);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(188, 0, 112, 65);
		panel_11.add(panel_24);

		cryingTextArea_10 = new JTextArea();
		cryingTextArea_10.setWrapStyleWord(true);
		cryingTextArea_10.setText("Squirming Shifting Back and Forth");
		cryingTextArea_10.setLineWrap(true);
		cryingTextArea_10.setEditable(false);
		cryingTextArea_10.setBackground(Color.WHITE);
		cryingTextArea_10.setBounds(14, 3, 88, 55);
		panel_24.add(cryingTextArea_10);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(299, 0, 141, 65);
		panel_11.add(panel_25);

		cryingTextArea_11 = new JTextArea();
		cryingTextArea_11.setWrapStyleWord(true);
		cryingTextArea_11.setText("Tense, Arched Rigid, or Jerking");
		cryingTextArea_11.setLineWrap(true);
		cryingTextArea_11.setEditable(false);
		cryingTextArea_11.setBackground(Color.WHITE);
		cryingTextArea_11.setBounds(15, 8, 120, 50);
		panel_25.add(cryingTextArea_11);

		panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 211, 440, 50);
		panel_7.add(panel_12);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 0, 80, 50);
		panel_12.add(panel_14);

		cryingTextArea_12 = new JTextArea();
		cryingTextArea_12.setBackground(Color.WHITE);
		cryingTextArea_12.setWrapStyleWord(true);
		cryingTextArea_12.setLineWrap(true);
		cryingTextArea_12.setEditable(false);
		cryingTextArea_12.setText("Legs");
		cryingTextArea_12.setBounds(20, 10, 42, 21);
		panel_14.add(cryingTextArea_12);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(79, 0, 110, 50);
		panel_12.add(panel_26);

		cryingTextArea_13 = new JTextArea();
		cryingTextArea_13.setWrapStyleWord(true);
		cryingTextArea_13.setLineWrap(true);
		cryingTextArea_13.setText("Normal Position or Relax");
		cryingTextArea_13.setEditable(false);
		cryingTextArea_13.setBackground(Color.WHITE);
		cryingTextArea_13.setBounds(8, 3, 100, 45);
		panel_26.add(cryingTextArea_13);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(188, 0, 112, 50);
		panel_12.add(panel_27);

		cryingTextArea_14 = new JTextArea();
		cryingTextArea_14.setWrapStyleWord(true);
		cryingTextArea_14.setText("Moans or Whimpers");
		cryingTextArea_14.setLineWrap(true);
		cryingTextArea_14.setEditable(false);
		cryingTextArea_14.setBackground(Color.WHITE);
		cryingTextArea_14.setBounds(23, 3, 70, 45);
		panel_27.add(cryingTextArea_14);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(299, 0, 141, 50);
		panel_12.add(panel_28);

		cryingTextArea_15 = new JTextArea();
		cryingTextArea_15.setWrapStyleWord(true);
		cryingTextArea_15.setText("Crying Steadily Screams or Sobs");
		cryingTextArea_15.setLineWrap(true);
		cryingTextArea_15.setEditable(false);
		cryingTextArea_15.setBackground(Color.WHITE);
		cryingTextArea_15.setBounds(14, 3, 117, 45);
		panel_28.add(cryingTextArea_15);

		panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 260, 440, 60);
		panel_7.add(panel_29);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 0, 80, 60);
		panel_29.add(panel_30);

		cryingTextArea_16 = new JTextArea();
		cryingTextArea_16.setBackground(Color.WHITE);
		cryingTextArea_16.setWrapStyleWord(true);
		cryingTextArea_16.setLineWrap(true);
		cryingTextArea_16.setEditable(false);
		cryingTextArea_16.setText("Consolability");
		cryingTextArea_16.setBounds(2, 15, 77, 21);
		panel_30.add(cryingTextArea_16);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(79, 0, 110, 60);
		panel_29.add(panel_31);

		cryingTextArea_17 = new JTextArea();
		cryingTextArea_17.setWrapStyleWord(true);
		cryingTextArea_17.setLineWrap(true);
		cryingTextArea_17.setText("Content Relaxed");
		cryingTextArea_17.setEditable(false);
		cryingTextArea_17.setBackground(Color.WHITE);
		cryingTextArea_17.setBounds(25, 10, 65, 40);
		panel_31.add(cryingTextArea_17);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(188, 0, 112, 60);
		panel_29.add(panel_32);

		cryingTextArea_18 = new JTextArea();
		cryingTextArea_18.setWrapStyleWord(true);
		cryingTextArea_18.setText("Reassured by Touching, Distracable");
		cryingTextArea_18.setLineWrap(true);
		cryingTextArea_18.setEditable(false);
		cryingTextArea_18.setBackground(Color.WHITE);
		cryingTextArea_18.setBounds(14, 0, 88, 55);
		panel_32.add(cryingTextArea_18);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(299, 0, 141, 60);
		panel_29.add(panel_33);

		cryingTextArea_19 = new JTextArea();
		cryingTextArea_19.setWrapStyleWord(true);
		cryingTextArea_19.setText("Difficult to Console or Comfort");
		cryingTextArea_19.setLineWrap(true);
		cryingTextArea_19.setEditable(false);
		cryingTextArea_19.setBackground(Color.WHITE);
		cryingTextArea_19.setBounds(14, 6, 117, 45);
		panel_33.add(cryingTextArea_19);

		totalColumnsAndLabel = new JLabel();
		totalColumnsAndLabel.setFont(new Font("", Font.PLAIN, 11));
		totalColumnsAndLabel
				.setText("Total columns and rows = score for Pain Rating Scale");
		totalColumnsAndLabel.setBounds(27, 370, 405, 17);
		panel_6.add(totalColumnsAndLabel);

		label_7 = new JLabel();
		label_7.setFont(new Font("", Font.PLAIN, 11));
		label_7.setText("0 - 1 = No Pain");
		label_7.setBounds(27, 385, 76, 17);
		panel_6.add(label_7);

		label_12 = new JLabel();
		label_12.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_12.setText("6 - 7 = Severe Pain");
		label_12.setBounds(27, 400, 101, 17);
		panel_6.add(label_12);

		label_13 = new JLabel();
		label_13.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_13.setText("2 - 3 = Mild Pain");
		label_13.setBounds(131, 384, 78, 17);
		panel_6.add(label_13);

		label_14 = new JLabel();
		label_14.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_14.setText("8 - 9 = Very Severe Pain");
		label_14.setBounds(131, 399, 121, 17);
		panel_6.add(label_14);

		label_15 = new JLabel();
		label_15.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_15.setText("4 - 5 = Moderate Pain");
		label_15.setBounds(273, 384, 105, 17);
		panel_6.add(label_15);

		label_16 = new JLabel();
		label_16.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_16.setText("10 = Worst Possible Pain");
		label_16.setBounds(273, 399, 132, 17);
		panel_6.add(label_16);

		panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(0, 500, 1180, 400);
		panel.add(panel_13);

		panel_34 = new JPanel();
		panel_34.setBackground(Color.WHITE);
		panel_34.setLayout(null);
		panel_34.setBounds(10, 0, 1170, 100);
		panel_13.add(panel_34);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setBackground(Color.WHITE);
		panel_35.setLayout(null);
		panel_35.setBounds(499, 0, 140, 100);
		panel_34.add(panel_35);

		pharmacologicalInterventionSTextArea = new JTextArea();
		pharmacologicalInterventionSTextArea.setBackground(Color.WHITE);
		pharmacologicalInterventionSTextArea
				.setText("pharmacological intervention             S = scheduled         B = breakthrough PRN = as needed");
		pharmacologicalInterventionSTextArea.setLineWrap(true);
		pharmacologicalInterventionSTextArea.setWrapStyleWord(true);
		pharmacologicalInterventionSTextArea.setEditable(false);
		pharmacologicalInterventionSTextArea.setBounds(9, 4, 130, 90);
		panel_35.add(pharmacologicalInterventionSTextArea);

		panel_37 = new JPanel();
		panel_37.setBounds(0, 0, 59, 100);
		panel_34.add(panel_37);
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);

		dateTextArea = new JTextArea();
		dateTextArea.setText("Date");
		dateTextArea.setBackground(Color.WHITE);
		dateTextArea.setWrapStyleWord(true);
		dateTextArea.setLineWrap(true);
		dateTextArea.setEditable(false);
		dateTextArea.setBounds(12, 36, 35, 21);
		panel_37.add(dateTextArea);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(58, 0, 59, 100);
		panel_34.add(panel_38);

		dateTextArea_1 = new JTextArea();
		dateTextArea_1.setWrapStyleWord(true);
		dateTextArea_1.setText("Time");
		dateTextArea_1.setLineWrap(true);
		dateTextArea_1.setEditable(false);
		dateTextArea_1.setBackground(Color.WHITE);
		dateTextArea_1.setBounds(12, 36, 35, 21);
		panel_38.add(dateTextArea_1);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(116, 0, 120, 100);
		panel_34.add(panel_39);

		locationOfPainTextArea = new JTextArea();
		locationOfPainTextArea.setBackground(Color.WHITE);
		locationOfPainTextArea.setText("Location      of          Pain");
		locationOfPainTextArea.setWrapStyleWord(true);
		locationOfPainTextArea.setLineWrap(true);
		locationOfPainTextArea.setEditable(false);
		locationOfPainTextArea.setBounds(35, 20, 60, 65);
		panel_39.add(locationOfPainTextArea);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(229, 0, 59, 100);
		panel_34.add(panel_40);

		dateTextArea_2 = new JTextArea();
		dateTextArea_2.setWrapStyleWord(true);
		dateTextArea_2.setText("Pain Scale Used");
		dateTextArea_2.setLineWrap(true);
		dateTextArea_2.setEditable(false);
		dateTextArea_2.setBackground(Color.WHITE);
		dateTextArea_2.setBounds(12, 20, 35, 55);
		panel_40.add(dateTextArea_2);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(287, 0, 78, 100);
		panel_34.add(panel_41);

		dateTextArea_3 = new JTextArea();
		dateTextArea_3.setWrapStyleWord(true);
		dateTextArea_3.setText("Pain Rating  Level       0 -10 (pre TX)");
		dateTextArea_3.setLineWrap(true);
		dateTextArea_3.setEditable(false);
		dateTextArea_3.setBackground(Color.WHITE);
		dateTextArea_3.setBounds(15, 5, 58, 90);
		panel_41.add(dateTextArea_3);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(361, 0, 140, 100);
		panel_34.add(panel_42);

		pharmacologicalInterventionSTextArea_1 = new JTextArea();
		pharmacologicalInterventionSTextArea_1.setWrapStyleWord(true);
		pharmacologicalInterventionSTextArea_1
				.setText("Non Pharmacological intervention (Identify)");
		pharmacologicalInterventionSTextArea_1.setLineWrap(true);
		pharmacologicalInterventionSTextArea_1.setEditable(false);
		pharmacologicalInterventionSTextArea_1.setBackground(Color.WHITE);
		pharmacologicalInterventionSTextArea_1.setBounds(20, 10, 102, 80);
		panel_42.add(pharmacologicalInterventionSTextArea_1);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(638, 0, 120, 100);
		panel_34.add(panel_43);

		pharmacologicalInterventionSTextArea_2 = new JTextArea();
		pharmacologicalInterventionSTextArea_2.setWrapStyleWord(true);
		pharmacologicalInterventionSTextArea_2
				.setText("Pain            Rating           Level                  0 - 10             (post TX / Time)");
		pharmacologicalInterventionSTextArea_2.setLineWrap(true);
		pharmacologicalInterventionSTextArea_2.setEditable(false);
		pharmacologicalInterventionSTextArea_2.setBackground(Color.WHITE);
		pharmacologicalInterventionSTextArea_2.setBounds(12, 4, 105, 90);
		panel_43.add(pharmacologicalInterventionSTextArea_2);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(755, 0, 85, 100);
		panel_34.add(panel_44);

		dateTextArea_4 = new JTextArea();
		dateTextArea_4.setWrapStyleWord(true);
		dateTextArea_4
				.setText("Resident's Acceptable Level of Pain met? Y / N ");
		dateTextArea_4.setLineWrap(true);
		dateTextArea_4.setEditable(false);
		dateTextArea_4.setBackground(Color.WHITE);
		dateTextArea_4.setBounds(7, 5, 70, 90);
		panel_44.add(dateTextArea_4);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(838, 0, 85, 100);
		panel_34.add(panel_45);

		dateTextArea_5 = new JTextArea();
		dateTextArea_5.setWrapStyleWord(true);
		dateTextArea_5
				.setText("Resident's Pain       goal met?                 Y / N ");
		dateTextArea_5.setLineWrap(true);
		dateTextArea_5.setEditable(false);
		dateTextArea_5.setBackground(Color.WHITE);
		dateTextArea_5.setBounds(7, 5, 68, 90);
		panel_45.add(dateTextArea_5);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(922, 0, 59, 100);
		panel_34.add(panel_46);

		dateTextArea_6 = new JTextArea();
		dateTextArea_6.setWrapStyleWord(true);
		dateTextArea_6.setText("Nurses Initials");
		dateTextArea_6.setLineWrap(true);
		dateTextArea_6.setEditable(false);
		dateTextArea_6.setBackground(Color.WHITE);
		dateTextArea_6.setBounds(8, 25, 44, 47);
		panel_46.add(dateTextArea_6);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(979, 0, 191, 100);
		panel_34.add(panel_47);

		pharmacologicalInterventionSTextArea_3 = new JTextArea();
		pharmacologicalInterventionSTextArea_3.setWrapStyleWord(true);
		pharmacologicalInterventionSTextArea_3
				.setText("Evaluation       of Last 3 doses Administered");
		pharmacologicalInterventionSTextArea_3.setLineWrap(true);
		pharmacologicalInterventionSTextArea_3.setEditable(false);
		pharmacologicalInterventionSTextArea_3.setBackground(Color.WHITE);
		pharmacologicalInterventionSTextArea_3.setBounds(45, 20, 99, 55);
		panel_47.add(pharmacologicalInterventionSTextArea_3);

		panelPainManagementRecordRow1 = new PanelPainManagementRow(1);
		panelPainManagementRecordRow1.setLayout(null);
		panelPainManagementRecordRow1.setBounds(10, 99, 979, 50);
		panel_13.add(panelPainManagementRecordRow1);

		panelPainManagementRecordRow2 = new PanelPainManagementRow(2);
		panelPainManagementRecordRow2.setLayout(null);
		panelPainManagementRecordRow2.setBounds(10, 146, 979, 50);
		panel_13.add(panelPainManagementRecordRow2);

		panelPainManagementRecordRow3 = new PanelPainManagementRow(3);
		panelPainManagementRecordRow3.setLayout(null);
		panelPainManagementRecordRow3.setBounds(10, 194, 979, 50);
		panel_13.add(panelPainManagementRecordRow3);

		panelPainManagementRecordRow4 = new PanelPainManagementRow(4);
		panelPainManagementRecordRow4.setLayout(null);
		panelPainManagementRecordRow4.setBounds(10, 242, 979, 50);
		panel_13.add(panelPainManagementRecordRow4);

		panelPainManagementRecordRow5 = new PanelPainManagementRow(5);
		panelPainManagementRecordRow5.setLayout(null);
		panelPainManagementRecordRow5.setBounds(10, 291, 979, 50);
		panel_13.add(panelPainManagementRecordRow5);

		panelPainManagementRecordRow6 = new PanelPainManagementRow(6);
		panelPainManagementRecordRow6.setLayout(null);
		panelPainManagementRecordRow6.setBounds(10, 340, 979, 50);
		panel_13.add(panelPainManagementRecordRow6);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setBackground(Color.WHITE);
		panel_53.setLayout(null);
		panel_53.setBounds(990, 99, 190, 145);
		panel_13.add(panel_53);

		txtEvalution = new JTextArea();
		txtEvalution.setWrapStyleWord(true);
		txtEvalution.setLineWrap(true);
		txtEvalution.setBounds(10, 10, 170, 123);
		panel_53.add(txtEvalution);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(990, 241, 190, 149);
		panel_13.add(panel_55);

		txtEvalution1 = new JTextArea();
		txtEvalution1.setWrapStyleWord(true);
		txtEvalution1.setLineWrap(true);
		txtEvalution1.setBounds(10, 10, 170, 129);
		panel_55.add(txtEvalution1);
		updateData();
	}

	public void updateData() {
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
		} catch (Exception e) {
		}
		// System.out.println("residence key is:" + Global.currentResidenceKey);
		// List rafp7 = null;
		// try {
		// rafp7 = MedrexClientManager.getInstance()
		// .getAdmissionsRecords(Global.currentResidenceKey);
		// } catch (Exception e) {
		//
		// }
		// int key = rafp7.getFormId();
		// System.out.println("key is:" + key);
		// ResidentAssessmentFormPage1 raAssessmentFormPage1 = new
		// ResidentAssessmentFormPage1();
		// try {
		// raAssessmentFormPage1 =
		// MedrexClientManager.getInstance().getResidentAssessmentFormPage1(key);
		// } catch (RemoteException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// } catch (MedrexException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// int newKey = raAssessmentFormPage1.getSerial();
		// System.out.println("newKey is:" + newKey);
		// ResidentAssessmentFormPage7 raAssessmentFormPage7 = new
		// ResidentAssessmentFormPage7();
		// try {
		// raAssessmentFormPage7 =
		// MedrexClientManager.getInstance().getResidentAssessmentFormPage7(newKey);
		// } catch (RemoteException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// } catch (MedrexException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// System.out.println("level is:" +
		// raAssessmentFormPage7.getPainLevel());
		// txtResidentPain.setText(raAssessmentFormPage7.getPainLevel());
		txtResidentPain.setText("");
		txtResidentGoal.setText("");

		txtEvalution.setText("");
		txtEvalution1.setText("");

		if (Global.currentPainManagementFormPage1Key != 0) {
			PainManagementRecordFormPage1 pmrP1 = null;
			try {
				pmrP1 = MedrexClientManager.getInstance()
						.getPainManagementRecordFormPage1(
								Global.currentPainManagementFormPage1Key);

			} catch (Exception e) {

			}
			txtEvalution.setText(pmrP1.getEvaluation1());
			txtEvalution1.setText(pmrP1.getEvaluation2());

		}

		panelPainManagementRecordRow1.updateData();
		panelPainManagementRecordRow2.updateData();
		panelPainManagementRecordRow3.updateData();
		panelPainManagementRecordRow4.updateData();
		panelPainManagementRecordRow5.updateData();
		panelPainManagementRecordRow6.updateData();

	}

	public void doSave() {
		PainManagementRecordFormPage1 pmrfP1 = new PainManagementRecordFormPage1();
		pmrfP1.setSerial(Global.currentPainManagementFormPage1Key);
		pmrfP1.setResidentId(Global.currentResidenceKey);
		pmrfP1.setEvaluation1(txtEvalution.getText());
		pmrfP1.setEvaluation2(txtEvalution1.getText());

		try {
			Global.currentPainManagementFormPage1Key = MedrexClientManager
					.getInstance().insertOrUpdatePainManagementRecordFormPage1(
							pmrfP1);
		} catch (Exception e) {

		}
		panelPainManagementRecordRow1.doSave();
		panelPainManagementRecordRow2.doSave();
		panelPainManagementRecordRow3.doSave();
		panelPainManagementRecordRow4.doSave();
		panelPainManagementRecordRow5.doSave();
		panelPainManagementRecordRow6.doSave();

	}

}
