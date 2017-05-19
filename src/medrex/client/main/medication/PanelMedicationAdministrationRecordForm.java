package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationAdministrationRecordForm;

public class PanelMedicationAdministrationRecordForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -515430557192400998L;

	private PanelMedicationAdministrationRecordFormCol panelCol30;

	private PanelMedicationAdministrationRecordFormCol panelCol29;

	private PanelMedicationAdministrationRecordFormCol panelCol28;

	private PanelMedicationAdministrationRecordFormCol panelCol27;

	private PanelMedicationAdministrationRecordFormCol panelCol26;

	private JPanel panel_53;

	private PanelMedicationAdministrationRecordFormCol panelCol25;

	private PanelMedicationAdministrationRecordFormCol panelCol24;

	private PanelMedicationAdministrationRecordFormCol panelCol23;

	private PanelMedicationAdministrationRecordFormCol panelCol22;

	private PanelMedicationAdministrationRecordFormCol panelCol21;

	private JPanel panel_52;

	private PanelMedicationAdministrationRecordFormCol panelCol20;

	private PanelMedicationAdministrationRecordFormCol panelCol19;

	private PanelMedicationAdministrationRecordFormCol panelCol18;

	private PanelMedicationAdministrationRecordFormCol panelCol17;

	private PanelMedicationAdministrationRecordFormCol panelCol16;

	private JPanel panel_51;

	private PanelMedicationAdministrationRecordFormCol panelCol15;

	private PanelMedicationAdministrationRecordFormCol panelCol14;

	private PanelMedicationAdministrationRecordFormCol panelCol13;

	private PanelMedicationAdministrationRecordFormCol panelCol12;

	private PanelMedicationAdministrationRecordFormCol panelCol11;

	private JPanel panel_62;

	private PanelMedicationAdministrationRecordFormCol PanelCol10;

	private PanelMedicationAdministrationRecordFormCol panelCol9;

	private PanelMedicationAdministrationRecordFormCol panelCol8;

	private PanelMedicationAdministrationRecordFormCol panelCol7;

	private PanelMedicationAdministrationRecordFormCol panelCol6;

	private JPanel panel_56;

	private PanelMedicationAdministrationRecordFormCol panelCol5;

	private PanelMedicationAdministrationRecordFormCol panelCol4;

	private PanelMedicationAdministrationRecordFormCol panelCol3;

	private PanelMedicationAdministrationRecordFormCol panelCol2;

	private JPanel panel_50;

	private PanelMedicationAdministrationRecordFormCol panelCol1;

	private JLabel temperatureLabel_35;

	private JPanel panel_49;

	private JLabel temperatureLabel_34;

	private JPanel panel_48;

	private JLabel temperatureLabel_33;

	private JPanel panel_47;

	private JLabel temperatureLabel_32;

	private JPanel panel_46;

	private JTextArea vItalSTextArea_4;

	private JPanel panel_45;

	private JLabel temperatureLabel_31;

	private JPanel panel_44;

	private JLabel temperatureLabel_30;

	private JPanel panel_43;

	private JLabel temperatureLabel_29;

	private JPanel panel_42;

	private JLabel temperatureLabel_28;

	private JPanel panel_41;

	private JLabel temperatureLabel_27;

	private JPanel panel_40;

	private JLabel temperatureLabel_26;

	private JPanel panel_39;

	private JTextArea vItalSTextArea_3;

	private JPanel panel_38;

	private JLabel temperatureLabel_25;

	private JPanel panel_37;

	private JLabel temperatureLabel_24;

	private JPanel panel_36;

	private JLabel temperatureLabel_23;

	private JPanel panel_35;

	private JLabel temperatureLabel_22;

	private JPanel panel_34;

	private JLabel temperatureLabel_21;

	private JPanel panel_33;

	private JLabel temperatureLabel_20;

	private JPanel panel_32;

	private JTextArea vItalSTextArea_2;

	private JPanel panel_31;

	private JLabel temperatureLabel_19;

	private JPanel panel_30;

	private JLabel temperatureLabel_18;

	private JPanel panel_29;

	private JLabel temperatureLabel_17;

	private JPanel panel_28;

	private JPanel panel_27;

	private JLabel temperatureLabel_16;

	private JPanel panel_26;

	private JLabel temperatureLabel_15;

	private JPanel panel_25;

	private JLabel temperatureLabel_14;

	private JPanel panel_24;

	private JPanel panel_23;

	private JLabel temperatureLabel_13;

	private JPanel panel_22;

	private JLabel temperatureLabel_12;

	private JPanel panel_21;

	private JLabel temperatureLabel_11;

	private JPanel panel_20;

	private JPanel panel_19;

	private JLabel temperatureLabel_10;

	private JPanel panel_18;

	private JLabel temperatureLabel_9;

	private JPanel panel_17;

	private JLabel temperatureLabel_8;

	private JPanel panel_16;

	private JPanel panel_6;

	private JTextArea vItalSTextArea_1;

	private JPanel panel_14;

	private JLabel temperatureLabel_7;

	private JPanel panel_13;

	private JLabel temperatureLabel_6;

	private JPanel panel_12;

	private JLabel temperatureLabel_5;

	private JPanel panel_11;

	private JLabel temperatureLabel_4;

	private JPanel panel_10;

	private JLabel temperatureLabel_3;

	private JPanel panel_9;

	private JLabel temperatureLabel_2;

	private JPanel panel_8;

	private JLabel temperatureLabel_1;

	private JPanel panel_7;

	private JLabel temperatureLabel;

	private JPanel panel_5;

	private JTextArea vItalSTextArea;

	private JPanel panel_4;

	private JPanel panel_3;

	private JPanel panel_2;

	private JPanel panel_1;

	private JLabel medicationAdministrationLabel_1;

	private JLabel medicationAdministrationLabel;

	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelMedicationAdministrationRecordForm() {
		super();
		Global.panelMedicationAdministrationRecordForm = this;
		setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		setSize(1200, 950);
		// Global.panelNurseMedicationNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1820, 1050));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 1550, 60);
		add(panel);

		medicationAdministrationLabel = new JLabel();
		medicationAdministrationLabel.setForeground(new Color(0, 128, 0));
		medicationAdministrationLabel.setFont(new Font("", Font.BOLD, 14));
		medicationAdministrationLabel
				.setText("MEDICATION ADMINISTRATION / TREATMENT RECORD");
		medicationAdministrationLabel.setBounds(0, 10, 413, 16);
		panel.add(medicationAdministrationLabel);

		medicationAdministrationLabel_1 = new JLabel();
		medicationAdministrationLabel_1.setForeground(new Color(0, 128, 0));
		medicationAdministrationLabel_1.setFont(new Font("", Font.BOLD, 12));
		medicationAdministrationLabel_1
				.setText("See Section 4 For Verifying Signatures");
		medicationAdministrationLabel_1.setBounds(0, 32, 413, 16);
		panel.add(medicationAdministrationLabel_1);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 70, 1800, 970);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 228, 965);
		panel_1.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(34, 139, 34));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 228, 26);
		panel_2.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBackground(new Color(34, 139, 34));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 26, 26, 251);
		panel_2.add(panel_4);

		vItalSTextArea = new JTextArea();
		vItalSTextArea.setForeground(new Color(255, 255, 255));
		vItalSTextArea.setFont(new Font("", Font.BOLD, 12));
		vItalSTextArea.setText("V ITAL  S IGNS");
		vItalSTextArea.setBackground(new Color(34, 139, 34));
		vItalSTextArea.setLineWrap(true);
		vItalSTextArea.setEditable(false);
		vItalSTextArea.setBounds(6, 28, 10, 204);
		panel_4.add(vItalSTextArea);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(26, 26, 202, 26);
		panel_2.add(panel_5);

		temperatureLabel = new JLabel();
		temperatureLabel.setForeground(new Color(0, 128, 0));
		temperatureLabel.setFont(new Font("", Font.BOLD, 12));
		temperatureLabel.setText("Temperature");
		temperatureLabel.setBounds(10, 5, 98, 16);
		panel_5.add(temperatureLabel);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(204, 255, 204));
		panel_7.setBounds(26, 50, 202, 26);
		panel_2.add(panel_7);

		temperatureLabel_1 = new JLabel();
		temperatureLabel_1.setForeground(new Color(0, 128, 0));
		temperatureLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_1.setText("Pulse");
		temperatureLabel_1.setBounds(10, 5, 98, 16);
		panel_7.add(temperatureLabel_1);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(26, 74, 202, 26);
		panel_2.add(panel_8);

		temperatureLabel_2 = new JLabel();
		temperatureLabel_2.setText("Respirations");
		temperatureLabel_2.setForeground(new Color(0, 128, 0));
		temperatureLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_2.setBounds(10, 5, 98, 16);
		panel_8.add(temperatureLabel_2);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(204, 255, 204));
		panel_9.setBounds(26, 99, 202, 26);
		panel_2.add(panel_9);

		temperatureLabel_3 = new JLabel();
		temperatureLabel_3.setForeground(new Color(0, 128, 0));
		temperatureLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_3.setBounds(10, 5, 98, 16);
		panel_9.add(temperatureLabel_3);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(26, 124, 202, 52);
		panel_2.add(panel_10);

		temperatureLabel_4 = new JLabel();
		temperatureLabel_4.setForeground(new Color(0, 128, 0));
		temperatureLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_4.setText("B / P");
		temperatureLabel_4.setBounds(10, 20, 98, 16);
		panel_10.add(temperatureLabel_4);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(new Color(204, 255, 204));
		panel_11.setBounds(26, 175, 202, 52);
		panel_2.add(panel_11);

		temperatureLabel_5 = new JLabel();
		temperatureLabel_5.setForeground(new Color(0, 128, 0));
		temperatureLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_5.setText("B / P");
		temperatureLabel_5.setBounds(10, 20, 98, 16);
		panel_11.add(temperatureLabel_5);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(26, 226, 202, 52);
		panel_2.add(panel_12);

		temperatureLabel_6 = new JLabel();
		temperatureLabel_6.setForeground(new Color(0, 128, 0));
		temperatureLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_6.setText("B / P");
		temperatureLabel_6.setBounds(10, 20, 98, 16);
		panel_12.add(temperatureLabel_6);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(new Color(34, 139, 34));
		panel_13.setBounds(0, 278, 228, 26);
		panel_2.add(panel_13);

		temperatureLabel_7 = new JLabel();
		temperatureLabel_7.setForeground(new Color(255, 255, 255));
		temperatureLabel_7.setFont(new Font("", Font.BOLD, 12));
		temperatureLabel_7.setText("WEIGHT");
		temperatureLabel_7.setBounds(24, 5, 98, 16);
		panel_13.add(temperatureLabel_7);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(34, 139, 34));
		panel_14.setBounds(0, 306, 26, 204);
		panel_2.add(panel_14);

		vItalSTextArea_1 = new JTextArea();
		vItalSTextArea_1.setText("INTAKE / OUTPUT");
		vItalSTextArea_1.setLineWrap(true);
		vItalSTextArea_1.setForeground(new Color(255, 255, 255));
		vItalSTextArea_1.setFont(new Font("", Font.BOLD, 11));
		vItalSTextArea_1.setEditable(false);
		vItalSTextArea_1.setBackground(new Color(34, 139, 34));
		vItalSTextArea_1.setBounds(6, 2, 10, 192);
		panel_14.add(vItalSTextArea_1);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(26, 306, 202, 52);
		panel_2.add(panel_6);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 0, 50, 52);
		panel_6.add(panel_16);

		temperatureLabel_8 = new JLabel();
		temperatureLabel_8.setForeground(new Color(0, 128, 0));
		temperatureLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_8.setText("11-7");
		temperatureLabel_8.setBounds(10, 20, 30, 16);
		panel_16.add(temperatureLabel_8);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(new Color(204, 255, 204));
		panel_17.setBounds(48, 0, 154, 27);
		panel_6.add(panel_17);

		temperatureLabel_9 = new JLabel();
		temperatureLabel_9.setForeground(new Color(0, 128, 0));
		temperatureLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_9.setText("Intake");
		temperatureLabel_9.setBounds(10, 5, 98, 16);
		panel_17.add(temperatureLabel_9);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(48, 26, 154, 26);
		panel_6.add(panel_18);

		temperatureLabel_10 = new JLabel();
		temperatureLabel_10.setForeground(new Color(0, 128, 0));
		temperatureLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_10.setText("Output");
		temperatureLabel_10.setBounds(10, 5, 98, 16);
		panel_18.add(temperatureLabel_10);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(26, 357, 202, 52);
		panel_2.add(panel_19);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 0, 50, 52);
		panel_19.add(panel_20);

		temperatureLabel_11 = new JLabel();
		temperatureLabel_11.setForeground(new Color(0, 128, 0));
		temperatureLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_11.setText("7-3");
		temperatureLabel_11.setBounds(10, 20, 30, 16);
		panel_20.add(temperatureLabel_11);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(new Color(204, 255, 204));
		panel_21.setBounds(48, 0, 154, 27);
		panel_19.add(panel_21);

		temperatureLabel_12 = new JLabel();
		temperatureLabel_12.setForeground(new Color(0, 128, 0));
		temperatureLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_12.setText("Intake");
		temperatureLabel_12.setBounds(10, 5, 98, 16);
		panel_21.add(temperatureLabel_12);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(48, 26, 154, 26);
		panel_19.add(panel_22);

		temperatureLabel_13 = new JLabel();
		temperatureLabel_13.setForeground(new Color(0, 128, 0));
		temperatureLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_13.setText("Output");
		temperatureLabel_13.setBounds(10, 5, 98, 16);
		panel_22.add(temperatureLabel_13);

		panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(26, 408, 202, 52);
		panel_2.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 0, 50, 52);
		panel_23.add(panel_24);

		temperatureLabel_14 = new JLabel();
		temperatureLabel_14.setForeground(new Color(0, 128, 0));
		temperatureLabel_14.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_14.setText("3-11");
		temperatureLabel_14.setBounds(10, 20, 30, 16);
		panel_24.add(temperatureLabel_14);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(new Color(204, 255, 204));
		panel_25.setBounds(48, 0, 154, 27);
		panel_23.add(panel_25);

		temperatureLabel_15 = new JLabel();
		temperatureLabel_15.setForeground(new Color(0, 128, 0));
		temperatureLabel_15.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_15.setText("Intake");
		temperatureLabel_15.setBounds(10, 5, 98, 16);
		panel_25.add(temperatureLabel_15);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(48, 26, 154, 26);
		panel_23.add(panel_26);

		temperatureLabel_16 = new JLabel();
		temperatureLabel_16.setForeground(new Color(0, 128, 0));
		temperatureLabel_16.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_16.setText("Output");
		temperatureLabel_16.setBounds(10, 5, 98, 16);
		panel_26.add(temperatureLabel_16);

		panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(26, 459, 202, 52);
		panel_2.add(panel_27);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 0, 57, 52);
		panel_27.add(panel_28);

		temperatureLabel_17 = new JLabel();
		temperatureLabel_17.setForeground(new Color(0, 128, 0));
		temperatureLabel_17.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_17.setText("TOTALS");
		temperatureLabel_17.setBounds(3, 20, 48, 16);
		panel_28.add(temperatureLabel_17);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(new Color(204, 255, 204));
		panel_29.setBounds(56, 0, 146, 27);
		panel_27.add(panel_29);

		temperatureLabel_18 = new JLabel();
		temperatureLabel_18.setForeground(new Color(0, 128, 0));
		temperatureLabel_18.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_18.setText("Intake");
		temperatureLabel_18.setBounds(10, 5, 98, 16);
		panel_29.add(temperatureLabel_18);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(56, 26, 146, 26);
		panel_27.add(panel_30);

		temperatureLabel_19 = new JLabel();
		temperatureLabel_19.setForeground(new Color(0, 128, 0));
		temperatureLabel_19.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_19.setText("Output");
		temperatureLabel_19.setBounds(10, 5, 98, 16);
		panel_30.add(temperatureLabel_19);

		panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBackground(new Color(34, 139, 34));
		panel_31.setBounds(0, 512, 26, 252);
		panel_2.add(panel_31);

		vItalSTextArea_2 = new JTextArea();
		vItalSTextArea_2.setText("LABORATORY");
		vItalSTextArea_2.setLineWrap(true);
		vItalSTextArea_2.setForeground(new Color(255, 255, 255));
		vItalSTextArea_2.setFont(new Font("Dialog", Font.BOLD, 11));
		vItalSTextArea_2.setEditable(false);
		vItalSTextArea_2.setBackground(new Color(34, 139, 34));
		vItalSTextArea_2.setBounds(6, 40, 10, 164);
		panel_31.add(vItalSTextArea_2);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(new Color(204, 255, 204));
		panel_32.setBounds(26, 510, 202, 52);
		panel_2.add(panel_32);

		temperatureLabel_20 = new JLabel();
		temperatureLabel_20.setForeground(new Color(0, 128, 0));
		temperatureLabel_20.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_20.setText("Blood Sugar");
		temperatureLabel_20.setBounds(10, 20, 98, 16);
		panel_32.add(temperatureLabel_20);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(26, 561, 202, 52);
		panel_2.add(panel_33);

		temperatureLabel_21 = new JLabel();
		temperatureLabel_21.setForeground(new Color(0, 128, 0));
		temperatureLabel_21.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_21.setText("Blood Sugar");
		temperatureLabel_21.setBounds(10, 20, 98, 16);
		panel_33.add(temperatureLabel_21);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(new Color(204, 255, 204));
		panel_34.setBounds(26, 612, 202, 52);
		panel_2.add(panel_34);

		temperatureLabel_22 = new JLabel();
		temperatureLabel_22.setForeground(new Color(0, 128, 0));
		temperatureLabel_22.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_22.setText("Blood Sugar");
		temperatureLabel_22.setBounds(10, 20, 98, 16);
		panel_34.add(temperatureLabel_22);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(26, 663, 202, 52);
		panel_2.add(panel_35);

		temperatureLabel_23 = new JLabel();
		temperatureLabel_23.setForeground(new Color(0, 128, 0));
		temperatureLabel_23.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_23.setText("Blood Sugar");
		temperatureLabel_23.setBounds(10, 20, 98, 16);
		panel_35.add(temperatureLabel_23);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(new Color(204, 255, 204));
		panel_36.setBounds(26, 714, 202, 26);
		panel_2.add(panel_36);

		temperatureLabel_24 = new JLabel();
		temperatureLabel_24.setForeground(new Color(0, 128, 0));
		temperatureLabel_24.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_24.setBounds(10, 5, 98, 16);
		panel_36.add(temperatureLabel_24);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(26, 739, 202, 26);
		panel_2.add(panel_37);

		temperatureLabel_25 = new JLabel();
		temperatureLabel_25.setForeground(new Color(0, 128, 0));
		temperatureLabel_25.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_25.setBounds(10, 5, 98, 16);
		panel_37.add(temperatureLabel_25);

		panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBackground(new Color(34, 139, 34));
		panel_38.setBounds(0, 767, 26, 122);
		panel_2.add(panel_38);

		vItalSTextArea_3 = new JTextArea();
		vItalSTextArea_3.setText("BOWEL");
		vItalSTextArea_3.setLineWrap(true);
		vItalSTextArea_3.setForeground(new Color(255, 255, 255));
		vItalSTextArea_3.setFont(new Font("Dialog", Font.BOLD, 11));
		vItalSTextArea_3.setEditable(false);
		vItalSTextArea_3.setBackground(new Color(34, 139, 34));
		vItalSTextArea_3.setBounds(6, 30, 10, 83);
		panel_38.add(vItalSTextArea_3);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(new Color(204, 255, 204));
		panel_39.setBounds(26, 764, 121, 76);
		panel_2.add(panel_39);

		temperatureLabel_26 = new JLabel();
		temperatureLabel_26.setForeground(new Color(0, 128, 0));
		temperatureLabel_26.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_26.setText("Defecation");
		temperatureLabel_26.setBounds(10, 34, 77, 16);
		panel_39.add(temperatureLabel_26);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(146, 764, 82, 26);
		panel_2.add(panel_40);

		temperatureLabel_27 = new JLabel();
		temperatureLabel_27.setForeground(new Color(0, 128, 0));
		temperatureLabel_27.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_27.setText("11-7");
		temperatureLabel_27.setBounds(10, 5, 55, 16);
		panel_40.add(temperatureLabel_27);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(146, 789, 82, 26);
		panel_2.add(panel_41);

		temperatureLabel_28 = new JLabel();
		temperatureLabel_28.setForeground(new Color(0, 128, 0));
		temperatureLabel_28.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_28.setText("7-3");
		temperatureLabel_28.setBounds(10, 5, 55, 16);
		panel_41.add(temperatureLabel_28);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(146, 814, 82, 26);
		panel_2.add(panel_42);

		temperatureLabel_29 = new JLabel();
		temperatureLabel_29.setForeground(new Color(0, 128, 0));
		temperatureLabel_29.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_29.setText("3-11");
		temperatureLabel_29.setBounds(10, 5, 55, 16);
		panel_42.add(temperatureLabel_29);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(26, 839, 202, 26);
		panel_2.add(panel_43);

		temperatureLabel_30 = new JLabel();
		temperatureLabel_30.setForeground(new Color(0, 128, 0));
		temperatureLabel_30.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_30.setText("Enema: SS // Phos / Oil");
		temperatureLabel_30.setBounds(10, 5, 149, 16);
		panel_43.add(temperatureLabel_30);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(new Color(204, 255, 204));
		panel_44.setBounds(26, 864, 202, 26);
		panel_2.add(panel_44);

		temperatureLabel_31 = new JLabel();
		temperatureLabel_31.setForeground(new Color(0, 128, 0));
		temperatureLabel_31.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_31.setText("Pulse");
		temperatureLabel_31.setBounds(10, 5, 98, 16);
		panel_44.add(temperatureLabel_31);

		panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBackground(new Color(34, 139, 34));
		panel_45.setBounds(0, 891, 26, 76);
		panel_2.add(panel_45);

		vItalSTextArea_4 = new JTextArea();
		vItalSTextArea_4.setText("OXYGEN");
		vItalSTextArea_4.setLineWrap(true);
		vItalSTextArea_4.setForeground(new Color(255, 255, 255));
		vItalSTextArea_4.setFont(new Font("", Font.BOLD, 12));
		vItalSTextArea_4.setEditable(false);
		vItalSTextArea_4.setBackground(new Color(34, 139, 34));
		vItalSTextArea_4.setBounds(6, 2, 20, 65);
		panel_45.add(vItalSTextArea_4);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(26, 889, 121, 76);
		panel_2.add(panel_46);

		temperatureLabel_32 = new JLabel();
		temperatureLabel_32.setForeground(new Color(0, 128, 0));
		temperatureLabel_32.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_32.setText("L/M");
		temperatureLabel_32.setBounds(10, 34, 77, 16);
		panel_46.add(temperatureLabel_32);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(146, 889, 82, 26);
		panel_2.add(panel_47);

		temperatureLabel_33 = new JLabel();
		temperatureLabel_33.setForeground(new Color(0, 128, 0));
		temperatureLabel_33.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_33.setText("11-7");
		temperatureLabel_33.setBounds(10, 5, 55, 16);
		panel_47.add(temperatureLabel_33);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(146, 913, 82, 26);
		panel_2.add(panel_48);

		temperatureLabel_34 = new JLabel();
		temperatureLabel_34.setForeground(new Color(0, 128, 0));
		temperatureLabel_34.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_34.setText("7-3");
		temperatureLabel_34.setBounds(10, 5, 55, 16);
		panel_48.add(temperatureLabel_34);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(146, 938, 82, 26);
		panel_2.add(panel_49);

		temperatureLabel_35 = new JLabel();
		temperatureLabel_35.setForeground(new Color(0, 128, 0));
		temperatureLabel_35.setFont(new Font("Dialog", Font.BOLD, 12));
		temperatureLabel_35.setText("3-11");
		temperatureLabel_35.setBounds(10, 5, 55, 16);
		panel_49.add(temperatureLabel_35);

		panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBounds(227, 0, 262, 965);
		panel_1.add(panel_50);

		panelCol1 = new PanelMedicationAdministrationRecordFormCol(1);
		panelCol1.setBounds(0, 0, 53, 965);
		panel_50.add(panelCol1);
		panelCol1.setLayout(null);

		panelCol2 = new PanelMedicationAdministrationRecordFormCol(2);
		panelCol2.setLayout(null);
		panelCol2.setBounds(52, 0, 53, 965);
		panel_50.add(panelCol2);

		panelCol3 = new PanelMedicationAdministrationRecordFormCol(3);
		panelCol3.setLayout(null);
		panelCol3.setBounds(104, 0, 53, 965);
		panel_50.add(panelCol3);

		panelCol4 = new PanelMedicationAdministrationRecordFormCol(4);
		panelCol4.setLayout(null);
		panelCol4.setBounds(156, 0, 53, 965);
		panel_50.add(panelCol4);

		panelCol5 = new PanelMedicationAdministrationRecordFormCol(5);
		panelCol5.setLayout(null);
		panelCol5.setBounds(208, 0, 53, 965);
		panel_50.add(panelCol5);

		panel_56 = new JPanel();
		panel_56.setLayout(null);
		panel_56.setBounds(488, 0, 262, 965);
		panel_1.add(panel_56);

		panelCol6 = new PanelMedicationAdministrationRecordFormCol(6);
		panelCol6.setLayout(null);
		panelCol6.setBounds(0, 0, 53, 965);
		panel_56.add(panelCol6);

		panelCol7 = new PanelMedicationAdministrationRecordFormCol(7);
		panelCol7.setLayout(null);
		panelCol7.setBounds(52, 0, 53, 965);
		panel_56.add(panelCol7);

		panelCol8 = new PanelMedicationAdministrationRecordFormCol(8);
		panelCol8.setLayout(null);
		panelCol8.setBounds(104, 0, 53, 965);
		panel_56.add(panelCol8);

		panelCol9 = new PanelMedicationAdministrationRecordFormCol(9);
		panelCol9.setLayout(null);
		panelCol9.setBounds(156, 0, 53, 965);
		panel_56.add(panelCol9);

		PanelCol10 = new PanelMedicationAdministrationRecordFormCol(10);
		PanelCol10.setLayout(null);
		PanelCol10.setBounds(208, 0, 53, 965);
		panel_56.add(PanelCol10);

		panel_62 = new JPanel();
		panel_62.setLayout(null);
		panel_62.setBounds(748, 0, 262, 965);
		panel_1.add(panel_62);

		panelCol11 = new PanelMedicationAdministrationRecordFormCol(11);
		panelCol11.setLayout(null);
		panelCol11.setBounds(0, 0, 53, 965);
		panel_62.add(panelCol11);

		panelCol12 = new PanelMedicationAdministrationRecordFormCol(12);
		panelCol12.setLayout(null);
		panelCol12.setBounds(52, 0, 53, 965);
		panel_62.add(panelCol12);

		panelCol13 = new PanelMedicationAdministrationRecordFormCol(13);
		panelCol13.setLayout(null);
		panelCol13.setBounds(104, 0, 53, 965);
		panel_62.add(panelCol13);

		panelCol14 = new PanelMedicationAdministrationRecordFormCol(14);
		panelCol14.setLayout(null);
		panelCol14.setBounds(156, 0, 53, 965);
		panel_62.add(panelCol14);

		panelCol15 = new PanelMedicationAdministrationRecordFormCol(15);
		panelCol15.setLayout(null);
		panelCol15.setBounds(208, 0, 53, 965);
		panel_62.add(panelCol15);

		panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBounds(1009, 0, 262, 965);
		panel_1.add(panel_51);

		panelCol16 = new PanelMedicationAdministrationRecordFormCol(16);
		panelCol16.setLayout(null);
		panelCol16.setBounds(0, 0, 53, 965);
		panel_51.add(panelCol16);

		panelCol17 = new PanelMedicationAdministrationRecordFormCol(17);
		panelCol17.setLayout(null);
		panelCol17.setBounds(52, 0, 53, 965);
		panel_51.add(panelCol17);

		panelCol18 = new PanelMedicationAdministrationRecordFormCol(18);
		panelCol18.setLayout(null);
		panelCol18.setBounds(104, 0, 53, 965);
		panel_51.add(panelCol18);

		panelCol19 = new PanelMedicationAdministrationRecordFormCol(19);
		panelCol19.setLayout(null);
		panelCol19.setBounds(156, 0, 53, 965);
		panel_51.add(panelCol19);

		panelCol20 = new PanelMedicationAdministrationRecordFormCol(20);
		panelCol20.setLayout(null);
		panelCol20.setBounds(208, 0, 53, 965);
		panel_51.add(panelCol20);

		panel_52 = new JPanel();
		panel_52.setLayout(null);
		panel_52.setBounds(1269, 0, 262, 965);
		panel_1.add(panel_52);

		panelCol21 = new PanelMedicationAdministrationRecordFormCol(21);
		panelCol21.setLayout(null);
		panelCol21.setBounds(0, 0, 53, 965);
		panel_52.add(panelCol21);

		panelCol22 = new PanelMedicationAdministrationRecordFormCol(22);
		panelCol22.setLayout(null);
		panelCol22.setBounds(52, 0, 53, 965);
		panel_52.add(panelCol22);

		panelCol23 = new PanelMedicationAdministrationRecordFormCol(23);
		panelCol23.setLayout(null);
		panelCol23.setBounds(104, 0, 53, 965);
		panel_52.add(panelCol23);

		panelCol24 = new PanelMedicationAdministrationRecordFormCol(24);
		panelCol24.setLayout(null);
		panelCol24.setBounds(156, 0, 53, 965);
		panel_52.add(panelCol24);

		panelCol25 = new PanelMedicationAdministrationRecordFormCol(25);
		panelCol25.setLayout(null);
		panelCol25.setBounds(208, 0, 53, 965);
		panel_52.add(panelCol25);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBounds(1529, 0, 262, 965);
		panel_1.add(panel_53);

		panelCol26 = new PanelMedicationAdministrationRecordFormCol(26);
		panelCol26.setLayout(null);
		panelCol26.setBounds(0, 0, 53, 965);
		panel_53.add(panelCol26);

		panelCol27 = new PanelMedicationAdministrationRecordFormCol(27);
		panelCol27.setLayout(null);
		panelCol27.setBounds(52, 0, 53, 965);
		panel_53.add(panelCol27);

		panelCol28 = new PanelMedicationAdministrationRecordFormCol(28);
		panelCol28.setLayout(null);
		panelCol28.setBounds(104, 0, 53, 965);
		panel_53.add(panelCol28);

		panelCol29 = new PanelMedicationAdministrationRecordFormCol(29);
		panelCol29.setLayout(null);
		panelCol29.setBounds(156, 0, 53, 965);
		panel_53.add(panelCol29);

		panelCol30 = new PanelMedicationAdministrationRecordFormCol(30);
		panelCol30.setLayout(null);
		panelCol30.setBounds(208, 0, 53, 965);
		panel_53.add(panelCol30);

		// fillCombos();
		updateData();
	}

	public void updateData() {

		if (Global.currentMedicationAdministrationRecordFormKey == 0) {
		} else {
			try {
				MedrexClientManager
						.getInstance()
						.getMedicationAdministrationRecordForm(
								Global.currentMedicationAdministrationRecordFormKey);

			} catch (Exception e) {

			}
		}

		panelCol1.updateData();
		panelCol2.updateData();
		panelCol3.updateData();
		panelCol4.updateData();
		panelCol5.updateData();
		panelCol6.updateData();
		panelCol7.updateData();
		panelCol8.updateData();
		panelCol9.updateData();
		PanelCol10.updateData();
		panelCol11.updateData();
		panelCol12.updateData();
		panelCol13.updateData();
		panelCol14.updateData();
		panelCol15.updateData();
		panelCol16.updateData();
		panelCol17.updateData();
		panelCol18.updateData();
		panelCol19.updateData();
		panelCol20.updateData();
		panelCol21.updateData();
		panelCol22.updateData();
		panelCol23.updateData();
		panelCol24.updateData();
		panelCol25.updateData();
		panelCol26.updateData();
		panelCol27.updateData();
		panelCol28.updateData();
		panelCol29.updateData();
		panelCol30.updateData();

	}

	public void doSave() {
		MedicationAdministrationRecordForm marf = new MedicationAdministrationRecordForm();

		marf.setSerial(Global.currentMedicationAdministrationRecordFormKey);
		marf.setResidentId(Global.currentResidenceKey);

		try {
			Global.currentMedicationAdministrationRecordFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateMedicationAdministrationRecordForm(marf);
		} catch (Exception e) {

		}

		panelCol1.doSave();
		panelCol2.doSave();
		panelCol3.doSave();
		panelCol4.doSave();
		panelCol5.doSave();
		panelCol6.doSave();
		panelCol7.doSave();
		panelCol8.doSave();
		panelCol9.doSave();
		PanelCol10.doSave();
		panelCol11.doSave();
		panelCol12.doSave();
		panelCol13.doSave();
		panelCol14.doSave();
		panelCol15.doSave();
		panelCol16.doSave();
		panelCol17.doSave();
		panelCol18.doSave();
		panelCol19.doSave();
		panelCol20.doSave();
		panelCol21.doSave();
		panelCol22.doSave();
		panelCol23.doSave();
		panelCol24.doSave();
		panelCol25.doSave();
		panelCol26.doSave();
		panelCol27.doSave();
		panelCol28.doSave();
		panelCol29.doSave();
		panelCol30.doSave();

	}

}
