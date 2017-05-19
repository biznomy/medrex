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
import medrex.commons.vo.medication.MedicationAdministrationRecordFormCol;

public class PanelMedicationAdministrationRecordFormCol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8567812392955749001L;

	private JTextArea txtOxygen311;

	private JPanel panel_39;

	private JTextArea txtOxygen73;

	private JPanel panel_38;

	private JTextArea txtOxygen117;

	private JPanel panel_37;

	private JTextArea txtImapaction;

	private JPanel panel_36;

	private JTextArea txtEnema;

	private JPanel panel_35;

	private JTextArea txtDefecation311;

	private JPanel panel_34;

	private JTextArea txtDefecation73;

	private JPanel panel_33;

	private JTextArea txtDefecation117;

	private JPanel panel_32;

	private JTextArea textArea_29;

	private JPanel panel_31;

	private JTextArea textArea_28;

	private JPanel panel_30;

	private JTextArea txtBSLow4;

	private JPanel panel_29;

	private JTextArea txtBSHigh4;

	private JPanel panel_28;

	private JTextArea txtBSLow3;

	private JPanel panel_27;

	private JTextArea txtBSHigh3;

	private JPanel panel_26;

	private JTextArea txtBSLow2;

	private JPanel panel_25;

	private JTextArea txtBSHigh2;

	private JPanel panel_24;

	private JTextArea txtBSLow1;

	private JPanel panel_23;

	private JTextArea txtBSHigh1;

	private JPanel panel_22;

	private JTextArea txtOutputTotal;

	private JPanel panel_21;

	private JTextArea txtIntakeTotal;

	private JPanel panel_20;

	private JTextArea txtOutput311;

	private JPanel panel_19;

	private JTextArea txtIntake311;

	private JPanel panel_18;

	private JTextArea txtOutput73;

	private JPanel panel_17;

	private JTextArea txtIntake73;

	private JPanel panel_16;

	private JTextArea txtOutput117;

	private JPanel panel_15;

	private JTextArea txtIntake117;

	private JPanel panel_14;

	private JTextArea textArea_11;

	private JPanel panel_13;

	private JTextArea txtBPLow3;

	private JPanel panel_12;

	private JTextArea txtBPHigh3;

	private JPanel panel_11;

	private JTextArea txtBPLow2;

	private JPanel panel_10;

	private JTextArea txtBPHigh2;

	private JPanel panel_9;

	private JTextArea txtBPLow1;

	private JPanel panel_8;

	private JTextArea txtBPHigh1;

	private JPanel panel_7;

	private JTextArea txt;

	private JPanel panel_6;

	private JTextArea txtRespirations;

	private JPanel panel_5;

	private JTextArea txtPulse;

	private JPanel panel_4;

	private JTextArea txtTemperature;

	private JPanel panel_3;

	private JLabel lblColNum;

	private JPanel panel_2;

	private JPanel panel_1;

	/**
	 * Create the panel
	 */

	int serial;

	int key;

	public PanelMedicationAdministrationRecordFormCol(int num) {
		super();
		// Global.panelPainManagementRecordFormPage1 = this;
		setLayout(null);
		setPreferredSize(new Dimension(53, 965));
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setBackground(Color.WHITE);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 53, 965);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(34, 139, 34));
		panel_2.setBounds(0, 0, 53, 26);
		panel_1.add(panel_2);

		lblColNum = new JLabel();
		lblColNum.setForeground(new Color(255, 255, 255));
		lblColNum.setFont(new Font("Dialog", Font.BOLD, 12));
		lblColNum.setText("33");
		lblColNum.setBounds(15, 5, 20, 16);
		panel_2.add(lblColNum);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 25, 53, 26);
		panel_1.add(panel_3);

		txtTemperature = new JTextArea();
		txtTemperature.setBounds(3, 3, 43, 20);
		panel_3.add(txtTemperature);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(204, 255, 204));
		panel_4.setBounds(0, 50, 53, 26);
		panel_1.add(panel_4);

		txtPulse = new JTextArea();
		txtPulse.setBackground(new Color(204, 255, 204));
		txtPulse.setBounds(3, 3, 43, 20);
		panel_4.add(txtPulse);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 75, 53, 26);
		panel_1.add(panel_5);

		txtRespirations = new JTextArea();
		txtRespirations.setBounds(3, 3, 43, 20);
		panel_5.add(txtRespirations);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(204, 255, 204));
		panel_6.setBounds(0, 99, 53, 26);
		panel_1.add(panel_6);

		txt = new JTextArea();
		txt.setBackground(new Color(204, 255, 204));
		txt.setBounds(3, 3, 43, 20);
		panel_6.add(txt);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 124, 53, 26);
		panel_1.add(panel_7);

		txtBPHigh1 = new JTextArea();
		txtBPHigh1.setBounds(3, 3, 43, 20);
		panel_7.add(txtBPHigh1);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 150, 53, 26);
		panel_1.add(panel_8);

		txtBPLow1 = new JTextArea();
		txtBPLow1.setBounds(3, 3, 43, 20);
		panel_8.add(txtBPLow1);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(204, 255, 204));
		panel_9.setBounds(0, 174, 53, 26);
		panel_1.add(panel_9);

		txtBPHigh2 = new JTextArea();
		txtBPHigh2.setBackground(new Color(204, 255, 204));
		txtBPHigh2.setBounds(3, 3, 43, 20);
		panel_9.add(txtBPHigh2);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(204, 255, 204));
		panel_10.setBounds(0, 200, 53, 26);
		panel_1.add(panel_10);

		txtBPLow2 = new JTextArea();
		txtBPLow2.setBackground(new Color(204, 255, 204));
		txtBPLow2.setBounds(3, 3, 43, 20);
		panel_10.add(txtBPLow2);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 225, 53, 26);
		panel_1.add(panel_11);

		txtBPHigh3 = new JTextArea();
		txtBPHigh3.setBounds(3, 3, 43, 20);
		panel_11.add(txtBPHigh3);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 251, 53, 26);
		panel_1.add(panel_12);

		txtBPLow3 = new JTextArea();
		txtBPLow3.setBounds(3, 3, 43, 20);
		panel_12.add(txtBPLow3);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 276, 53, 31);
		panel_1.add(panel_13);

		textArea_11 = new JTextArea();
		textArea_11.setBounds(3, 3, 43, 20);
		panel_13.add(textArea_11);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(204, 255, 204));
		panel_14.setBounds(0, 306, 53, 26);
		panel_1.add(panel_14);

		txtIntake117 = new JTextArea();
		txtIntake117.setBackground(new Color(204, 255, 204));
		txtIntake117.setBounds(3, 3, 43, 20);
		panel_14.add(txtIntake117);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 331, 53, 27);
		panel_1.add(panel_15);

		txtOutput117 = new JTextArea();
		txtOutput117.setBounds(3, 3, 43, 20);
		panel_15.add(txtOutput117);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(new Color(204, 255, 204));
		panel_16.setBounds(0, 357, 53, 26);
		panel_1.add(panel_16);

		txtIntake73 = new JTextArea();
		txtIntake73.setBackground(new Color(204, 255, 204));
		txtIntake73.setBounds(3, 3, 43, 20);
		panel_16.add(txtIntake73);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(0, 381, 53, 28);
		panel_1.add(panel_17);

		txtOutput73 = new JTextArea();
		txtOutput73.setBounds(3, 3, 43, 20);
		panel_17.add(txtOutput73);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(new Color(204, 255, 204));
		panel_18.setBounds(0, 408, 53, 26);
		panel_1.add(panel_18);

		txtIntake311 = new JTextArea();
		txtIntake311.setBackground(new Color(204, 255, 204));
		txtIntake311.setBounds(3, 3, 43, 20);
		panel_18.add(txtIntake311);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 433, 53, 27);
		panel_1.add(panel_19);

		txtOutput311 = new JTextArea();
		txtOutput311.setBounds(3, 3, 43, 20);
		panel_19.add(txtOutput311);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(new Color(204, 255, 204));
		panel_20.setBounds(0, 459, 53, 26);
		panel_1.add(panel_20);

		txtIntakeTotal = new JTextArea();
		txtIntakeTotal.setBackground(new Color(204, 255, 204));
		txtIntakeTotal.setBounds(3, 3, 43, 20);
		panel_20.add(txtIntakeTotal);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 484, 53, 27);
		panel_1.add(panel_21);

		txtOutputTotal = new JTextArea();
		txtOutputTotal.setBounds(3, 3, 43, 20);
		panel_21.add(txtOutputTotal);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(new Color(204, 255, 204));
		panel_22.setBounds(0, 509, 53, 26);
		panel_1.add(panel_22);

		txtBSHigh4 = new JTextArea();
		txtBSHigh4.setBackground(new Color(204, 255, 204));
		txtBSHigh4.setBounds(3, 3, 43, 20);
		panel_22.add(txtBSHigh4);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(new Color(204, 255, 204));
		panel_23.setBounds(0, 535, 53, 26);
		panel_1.add(panel_23);

		txtBSLow4 = new JTextArea();
		txtBSLow4.setBackground(new Color(204, 255, 204));
		txtBSLow4.setBounds(3, 3, 43, 20);
		panel_23.add(txtBSLow4);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(0, 560, 53, 26);
		panel_1.add(panel_24);

		txtBSHigh4 = new JTextArea();
		txtBSHigh4.setBounds(3, 3, 43, 20);
		panel_24.add(txtBSHigh4);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 586, 53, 26);
		panel_1.add(panel_25);

		txtBSLow4 = new JTextArea();
		txtBSLow4.setBounds(3, 3, 43, 20);
		panel_25.add(txtBSLow4);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(new Color(204, 255, 204));
		panel_26.setBounds(0, 611, 53, 26);
		panel_1.add(panel_26);

		txtBSHigh4 = new JTextArea();
		txtBSHigh4.setBackground(new Color(204, 255, 204));
		txtBSHigh4.setBounds(3, 3, 43, 20);
		panel_26.add(txtBSHigh4);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(new Color(204, 255, 204));
		panel_27.setBounds(0, 637, 53, 26);
		panel_1.add(panel_27);

		txtBSLow4 = new JTextArea();
		txtBSLow4.setBackground(new Color(204, 255, 204));
		txtBSLow4.setBounds(3, 3, 43, 20);
		panel_27.add(txtBSLow4);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 662, 53, 26);
		panel_1.add(panel_28);

		txtBSHigh4 = new JTextArea();
		txtBSHigh4.setBounds(3, 3, 43, 20);
		panel_28.add(txtBSHigh4);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 688, 53, 26);
		panel_1.add(panel_29);

		txtBSLow4 = new JTextArea();
		txtBSLow4.setBounds(3, 3, 43, 20);
		panel_29.add(txtBSLow4);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(new Color(204, 255, 204));
		panel_30.setBounds(0, 713, 53, 26);
		panel_1.add(panel_30);

		textArea_28 = new JTextArea();
		textArea_28.setBackground(new Color(204, 255, 204));
		textArea_28.setBounds(3, 3, 43, 20);
		panel_30.add(textArea_28);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 738, 53, 27);
		panel_1.add(panel_31);

		textArea_29 = new JTextArea();
		textArea_29.setBounds(3, 3, 43, 20);
		panel_31.add(textArea_29);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 763, 53, 27);
		panel_1.add(panel_32);

		txtDefecation117 = new JTextArea();
		txtDefecation117.setBounds(3, 3, 43, 20);
		panel_32.add(txtDefecation117);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 789, 53, 27);
		panel_1.add(panel_33);

		txtDefecation73 = new JTextArea();
		txtDefecation73.setBounds(3, 3, 43, 20);
		panel_33.add(txtDefecation73);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 813, 53, 27);
		panel_1.add(panel_34);

		txtDefecation311 = new JTextArea();
		txtDefecation311.setBounds(3, 3, 43, 20);
		panel_34.add(txtDefecation311);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 838, 53, 27);
		panel_1.add(panel_35);

		txtEnema = new JTextArea();
		txtEnema.setBounds(3, 3, 43, 20);
		panel_35.add(txtEnema);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(new Color(204, 255, 204));
		panel_36.setBounds(0, 863, 53, 26);
		panel_1.add(panel_36);

		txtImapaction = new JTextArea();
		txtImapaction.setBackground(new Color(204, 255, 204));
		txtImapaction.setBounds(3, 3, 43, 20);
		panel_36.add(txtImapaction);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 887, 53, 27);
		panel_1.add(panel_37);

		txtOxygen117 = new JTextArea();
		txtOxygen117.setBounds(3, 3, 43, 20);
		panel_37.add(txtOxygen117);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 911, 53, 27);
		panel_1.add(panel_38);

		txtOxygen73 = new JTextArea();
		txtOxygen73.setBounds(3, 3, 43, 20);
		panel_38.add(txtOxygen73);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(0, 937, 53, 27);
		panel_1.add(panel_39);

		txtOxygen311 = new JTextArea();
		txtOxygen311.setBounds(3, 3, 43, 20);
		panel_39.add(txtOxygen311);

		lblColNum.setText(num + "");
		serial = num;

		updateData();

	}

	public void updateData() {

		if (Global.currentMedicationAdministrationRecordFormKey == 0) {
			key = 0;

			txtTemperature.setText("");
			txtPulse.setText("");
			txtRespirations.setText("");
			txtBPHigh1.setText("");
			txtBPLow1.setText("");
			txtBPHigh2.setText("");
			txtBPLow2.setText("");
			txtBPHigh3.setText("");
			txtBPLow3.setText("");
			txtIntake117.setText("");
			txtOutput117.setText("");
			txtIntake73.setText("");
			txtOutput73.setText("");
			txtIntake311.setText("");
			txtOutput311.setText("");
			txtIntakeTotal.setText("");
			txtOutputTotal.setText("");
			// txtBSHigh1.setText("");
			// txtBSLow1.setText("");
			// txtBSHigh2.setText("");
			// txtBSLow2.setText("");
			// txtBSHigh3.setText("");
			// txtBSLow3.setText("");
			// txtBSHigh4.setText("");
			// txtBSLow4.setText("");
			txtDefecation117.setText("");
			txtDefecation311.setText("");
			txtDefecation73.setText("");
			txtEnema.setText("");
			txtImapaction.setText("");
			txtOxygen117.setText("");
			txtOxygen311.setText("");
			txtOxygen73.setText("");

		} else {
			MedicationAdministrationRecordFormCol marfc = null;

			txtTemperature.setText("");
			txtPulse.setText("");
			txtRespirations.setText("");
			txtBPHigh1.setText("");
			txtBPLow1.setText("");
			txtBPHigh2.setText("");
			txtBPLow2.setText("");
			txtBPHigh3.setText("");
			txtBPLow3.setText("");
			txtIntake117.setText("");
			txtOutput117.setText("");
			txtIntake73.setText("");
			txtOutput73.setText("");
			txtIntake311.setText("");
			txtOutput311.setText("");
			txtIntakeTotal.setText("");
			txtOutputTotal.setText("");
			// txtBSHigh1.setText("");
			// txtBSLow1.setText("");
			// txtBSHigh2.setText("");
			// txtBSLow2.setText("");
			// txtBSHigh3.setText("");
			// txtBSLow3.setText("");
			// txtBSHigh4.setText("");
			// txtBSLow4.setText("");
			txtDefecation117.setText("");
			txtDefecation311.setText("");
			txtDefecation73.setText("");
			txtEnema.setText("");
			txtImapaction.setText("");
			txtOxygen117.setText("");
			txtOxygen311.setText("");
			txtOxygen73.setText("");

			try {
				marfc = MedrexClientManager
						.getInstance()
						.getMedicationAdministrationRecordFormCol(
								Global.currentMedicationAdministrationRecordFormKey,
								serial);
			} catch (Exception e) {

			}
			key = marfc.getSerial();

			txtTemperature.setText(marfc.getTemperature());
			txtPulse.setText(marfc.getPulse());
			txtRespirations.setText(marfc.getRespirations());
			txtBPHigh1.setText(marfc.getBpHigh1());
			txtBPLow1.setText(marfc.getBpLow1());
			txtBPHigh2.setText(marfc.getBpHigh2());
			txtBPLow2.setText(marfc.getBpLow2());
			txtBPHigh3.setText(marfc.getBpHigh3());
			txtBPLow3.setText(marfc.getBpLow3());
			txtIntake117.setText(marfc.getIntake117());
			txtOutput117.setText(marfc.getOutput117());
			txtIntake73.setText(marfc.getIntake73());
			txtOutput73.setText(marfc.getOutput73());
			txtIntake311.setText(marfc.getIntake311());
			txtOutput311.setText(marfc.getOutput311());
			txtIntakeTotal.setText(marfc.getIntakeTotal());
			txtOutputTotal.setText(marfc.getOutputTotal());
			// txtBSHigh1.setText(marfc.getBsHigh1());
			// txtBSLow1.setText(marfc.getBsLow1());
			// txtBSHigh2.setText(marfc.getBsHigh2());
			// txtBSLow2.setText(marfc.getBsLow2());
			// txtBSHigh3.setText(marfc.getBsHigh3());
			// txtBSLow3.setText(marfc.getBsLow3());
			// txtBSHigh4.setText(marfc.getBsHigh4());
			// txtBSLow4.setText(marfc.getBsLow4());
			txtDefecation117.setText(marfc.getDefecation117());
			txtDefecation311.setText(marfc.getDefecation311());
			txtDefecation73.setText(marfc.getDefecation73());
			txtEnema.setText(marfc.getEnema());
			txtImapaction.setText(marfc.getImpaction());
			txtOxygen117.setText(marfc.getOxygen117());
			txtOxygen311.setText(marfc.getOutput311());
			txtOxygen73.setText(marfc.getOutput73());
		}

	}

	public void doSave() {

		MedicationAdministrationRecordFormCol marfc = new MedicationAdministrationRecordFormCol();

		marfc.setSerial(key);
		marfc
				.setMedicationAdministrationRecordFormSerial(Global.currentMedicationAdministrationRecordFormKey);
		marfc.setMedicationAdministrationRecordFormColSerial(serial);

		marfc.setTemperature(txtTemperature.getText());
		marfc.setPulse(txtPulse.getText());
		marfc.setRespirations(txtRespirations.getText());
		marfc.setBpHigh1(txtBPHigh1.getText());
		marfc.setBpLow1(txtBPLow1.getText());
		marfc.setBpHigh2(txtBPHigh2.getText());
		marfc.setBpLow2(txtBPLow2.getText());
		marfc.setBpHigh3(txtBPHigh3.getText());
		marfc.setBpLow3(txtBPLow3.getText());

		marfc.setIntake117(txtIntake117.getText());
		marfc.setIntake73(txtIntake73.getText());
		marfc.setIntake311(txtIntake311.getText());
		marfc.setIntakeTotal(txtIntakeTotal.getText());

		marfc.setOutput117(txtOutput117.getText());
		marfc.setOutput73(txtOutput73.getText());
		marfc.setOutput311(txtOutput311.getText());
		marfc.setOutputTotal(txtOutputTotal.getText());

		// marfc.setBsHigh1(txtBSHigh1.getText());
		// marfc.setBsLow1(txtBSLow1.getText());
		// marfc.setBsHigh2(txtBSHigh2.getText());
		// marfc.setBsLow2(txtBSLow2.getText());
		// marfc.setBsHigh3(txtBSHigh3.getText());
		// marfc.setBsLow3(txtBSLow3.getText());
		// marfc.setBsHigh4(txtBSHigh4.getText());
		// marfc.setBsLow4(txtBSLow4.getText());

		marfc.setDefecation117(txtDefecation117.getText());
		marfc.setDefecation73(txtDefecation73.getText());
		marfc.setDefecation311(txtDefecation311.getText());

		marfc.setEnema(txtEnema.getText());
		marfc.setImpaction(txtImapaction.getText());

		marfc.setOxygen117(txtOxygen117.getText());
		marfc.setOxygen311(txtOxygen311.getText());
		marfc.setOxygen73(txtOxygen73.getText());

		try {
			/* Global.currentMedicationAdministrationRecordFormKey = */MedrexClientManager
					.getInstance()
					.insertOrUpdateMedicationAdministrationRecordFormCol(marfc);
		} catch (Exception e) {

		}
	}

}
