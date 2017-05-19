package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;

public class PanelNurseMedicationNotes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9126912315256371250L;
	private JLabel label_17;
	private JLabel label_16;
	private JLabel label_15;
	private JLabel rightDeltoidLabel_2;
	private JLabel label_14;
	private JPanel panel_13;
	private JLabel label_13;
	private JLabel label_12;
	private JLabel label_11;
	private JLabel rightDeltoidLabel_1;
	private JLabel label_10;
	private JPanel panel_12;
	private JLabel label_9;
	private JLabel label_8;
	private JLabel label_7;
	private JLabel rightDeltoidLabel;
	private JLabel label_6;
	private JPanel panel_11;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label_1;
	private JPanel panel_10;
	private JPanel panel_9;

	PanelNurseMedicationNotesRow[] panelRows;
	PanelNurseMedicationNotesRow1[] panelRows1;
	List<NurseMedicationNotesFormRow> rows;
	List<NurseMedicationNotesFormRow1> rows1;

	/**
	 * Create the panel
	 */
	public PanelNurseMedicationNotes() {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		Global.panelNurseMedicationNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1570, 800));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 1180, 84);
		add(panel);

		final JLabel nursesMedicationNotesLabel = new JLabel();
		nursesMedicationNotesLabel.setForeground(new Color(0, 128, 0));
		nursesMedicationNotesLabel.setFont(new Font("", Font.BOLD, 18));
		nursesMedicationNotesLabel.setText("Nurse's Medication Notes");
		nursesMedicationNotesLabel.setBounds(0, 10, 230, 30);
		panel.add(nursesMedicationNotesLabel);

		final JLabel seeSection4Label = new JLabel();
		seeSection4Label.setForeground(new Color(0, 128, 0));
		seeSection4Label.setFont(new Font("", Font.BOLD, 12));
		seeSection4Label.setText("See Section 4 for Verifying Signatures");
		seeSection4Label.setBounds(0, 58, 230, 16);
		panel.add(seeSection4Label);

		final JLabel instructionsLabel = new JLabel();
		instructionsLabel.setText("Instructions:");
		instructionsLabel.setBounds(280, 19, 96, 16);
		panel.add(instructionsLabel);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(375, -6, 735, 80);
		panel.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 163, 80);
		panel_9.add(panel_10);

		label_1 = new JLabel();
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_1.setText("1. RIGHT DORSAL GLUTEUS");
		label_1.setBounds(10, 5, 147, 16);
		panel_10.add(label_1);

		label_2 = new JLabel();
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_2.setText("2. LEFT DORSAL GLUTEUS");
		label_2.setBounds(10, 20, 159, 16);
		panel_10.add(label_2);

		label_3 = new JLabel();
		label_3.setForeground(new Color(0, 128, 0));
		label_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_3.setText("3. RIGHT VENTRAL GLUTEUS");
		label_3.setBounds(10, 35, 159, 16);
		panel_10.add(label_3);

		label_4 = new JLabel();
		label_4.setForeground(new Color(0, 128, 0));
		label_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_4.setText("4. LEFT VENTRAL GLUTEUS");
		label_4.setBounds(10, 49, 159, 16);
		panel_10.add(label_4);

		label_5 = new JLabel();
		label_5.setForeground(new Color(0, 128, 0));
		label_5.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_5.setText("5. RIGHT LATERAL THIGH");
		label_5.setBounds(10, 62, 159, 16);
		panel_10.add(label_5);

		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(166, 0, 140, 80);
		panel_9.add(panel_11);

		label_6 = new JLabel();
		label_6.setForeground(new Color(0, 128, 0));
		label_6.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_6.setText("6. LEFT LATERAL THIGH");
		label_6.setBounds(10, 5, 147, 16);
		panel_11.add(label_6);

		rightDeltoidLabel = new JLabel();
		rightDeltoidLabel.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel.setText("7. RIGHT DELTOID");
		rightDeltoidLabel.setBounds(10, 20, 159, 16);
		panel_11.add(rightDeltoidLabel);

		label_7 = new JLabel();
		label_7.setForeground(new Color(0, 128, 0));
		label_7.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_7.setText("8. LEFT DELTOID");
		label_7.setBounds(10, 35, 159, 16);
		panel_11.add(label_7);

		label_8 = new JLabel();
		label_8.setForeground(new Color(0, 128, 0));
		label_8.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_8.setText("9. RIGHT UPPER ARM");
		label_8.setBounds(10, 49, 159, 16);
		panel_11.add(label_8);

		label_9 = new JLabel();
		label_9.setForeground(new Color(0, 128, 0));
		label_9.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_9.setText("10. LEFT UPPER ARM");
		label_9.setBounds(10, 62, 159, 16);
		panel_11.add(label_9);

		panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(303, 0, 151, 80);
		panel_9.add(panel_12);

		label_10 = new JLabel();
		label_10.setForeground(new Color(0, 128, 0));
		label_10.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_10.setText("11. RIGHT ANTERIOR THIGH");
		label_10.setBounds(10, 5, 141, 16);
		panel_12.add(label_10);

		rightDeltoidLabel_1 = new JLabel();
		rightDeltoidLabel_1.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel_1.setText("12. LEFT ANTERIOR THIGH");
		rightDeltoidLabel_1.setBounds(10, 20, 131, 16);
		panel_12.add(rightDeltoidLabel_1);

		label_11 = new JLabel();
		label_11.setForeground(new Color(0, 128, 0));
		label_11.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_11.setText("13. UPPER BACK LEFT");
		label_11.setBounds(10, 35, 131, 16);
		panel_12.add(label_11);

		label_12 = new JLabel();
		label_12.setForeground(new Color(0, 128, 0));
		label_12.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_12.setText("14. UPPER BACK RIGHT");
		label_12.setBounds(10, 49, 131, 16);
		panel_12.add(label_12);

		label_13 = new JLabel();
		label_13.setForeground(new Color(0, 128, 0));
		label_13.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_13.setText("15. UPPER CHEST LEFT");
		label_13.setBounds(10, 62, 131, 16);
		panel_12.add(label_13);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(453, 0, 272, 80);
		panel_9.add(panel_13);

		label_14 = new JLabel();
		label_14.setForeground(new Color(0, 128, 0));
		label_14.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_14.setText("16. UPPER CHEST RIGHT");
		label_14.setBounds(10, 5, 141, 16);
		panel_13.add(label_14);

		rightDeltoidLabel_2 = new JLabel();
		rightDeltoidLabel_2.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel_2
				.setText("17. TO RIGHT AND ABOVE LEVEL OF UMBILICUS");
		rightDeltoidLabel_2.setBounds(10, 20, 252, 16);
		panel_13.add(rightDeltoidLabel_2);

		label_15 = new JLabel();
		label_15.setForeground(new Color(0, 128, 0));
		label_15.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_15.setText("18. TO LEFT AND ABOVE LEVEL OF UMBILICUS");
		label_15.setBounds(10, 35, 252, 16);
		panel_13.add(label_15);

		label_16 = new JLabel();
		label_16.setForeground(new Color(0, 128, 0));
		label_16.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_16.setText("19. TO RIGHT AND BELOW LEVEL OF UMBILICUS");
		label_16.setBounds(10, 49, 252, 16);
		panel_13.add(label_16);

		label_17 = new JLabel();
		label_17.setForeground(new Color(0, 128, 0));
		label_17.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_17.setText("20. TO LEFT AND BELOW LEVEL OF UMBILICUS");
		label_17.setBounds(10, 62, 252, 16);
		panel_13.add(label_17);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 93, 781, 503);
		add(panel_2);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 781, 26);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1.setBounds(0, 0, 100, 26);
		panel_1.add(panel_1_1);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setText("Date");
		dateLabel.setBounds(40, 5, 46, 16);
		panel_1_1.add(dateLabel);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1_1.setBounds(101, 0, 60, 26);
		panel_1.add(panel_1_1_1);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(new Color(255, 255, 255));
		dateLabel_1.setText("Time");
		dateLabel_1.setBounds(15, 5, 46, 16);
		panel_1_1_1.add(dateLabel_1);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1_1_1.setBounds(162, 0, 50, 26);
		panel_1.add(panel_1_1_1_1);

		final JLabel dateLabel_1_1 = new JLabel();
		dateLabel_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_1.setText("Init.");
		dateLabel_1_1.setBounds(15, 5, 30, 16);
		panel_1_1_1_1.add(dateLabel_1_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(0, 128, 0));
		panel_1_2.setBounds(213, 0, 166, 26);
		panel_1.add(panel_1_2);

		final JLabel dateLabel_2 = new JLabel();
		dateLabel_2.setForeground(new Color(255, 255, 255));
		dateLabel_2.setText("Drug - Strength - Dose");
		dateLabel_2.setBounds(20, 5, 136, 16);
		panel_1_2.add(dateLabel_2);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(new Color(0, 128, 0));
		panel_1_3.setBounds(380, 0, 100, 26);
		panel_1.add(panel_1_3);

		final JLabel dateLabel_3 = new JLabel();
		dateLabel_3.setForeground(new Color(255, 255, 255));
		dateLabel_3.setText("Site Non Oral");
		dateLabel_3.setBounds(10, 5, 90, 16);
		panel_1_3.add(dateLabel_3);

		final JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBackground(new Color(0, 128, 0));
		panel_1_3_1.setBounds(482, 0, 100, 26);
		panel_1.add(panel_1_3_1);

		final JLabel dateLabel_3_1 = new JLabel();
		dateLabel_3_1.setForeground(new Color(255, 255, 255));
		dateLabel_3_1.setText("Reason");
		dateLabel_3_1.setBounds(20, 5, 59, 16);
		panel_1_3_1.add(dateLabel_3_1);

		final JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.setLayout(null);
		panel_1_3_1_1.setBackground(new Color(0, 128, 0));
		panel_1_3_1_1.setBounds(584, 0, 100, 26);
		panel_1.add(panel_1_3_1_1);

		final JLabel dateLabel_3_1_1 = new JLabel();
		dateLabel_3_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_3_1_1.setText("Result");
		dateLabel_3_1_1.setBounds(20, 5, 59, 16);
		panel_1_3_1_1.add(dateLabel_3_1_1);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(new Color(0, 128, 0));
		panel_1_1_2.setBounds(685, 0, 95, 26);
		panel_1.add(panel_1_1_2);

		final JLabel dateLabel_1_2 = new JLabel();
		dateLabel_1_2.setForeground(new Color(255, 255, 255));
		dateLabel_1_2.setText("Obser. Init.");
		dateLabel_1_2.setBounds(15, 5, 70, 16);
		panel_1_1_2.add(dateLabel_1_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(1, 27, 779, 476);
		panel_2.add(panel_3);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(779, 93, 781, 503);
		add(panel_2_1);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBounds(0, 0, 781, 26);
		panel_2_1.add(panel_1_4);

		final JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBackground(new Color(0, 128, 0));
		panel_1_1_3.setBounds(0, 0, 100, 26);
		panel_1_4.add(panel_1_1_3);

		final JLabel dateLabel_4 = new JLabel();
		dateLabel_4.setForeground(new Color(255, 255, 255));
		dateLabel_4.setText("Date");
		dateLabel_4.setBounds(40, 5, 46, 16);
		panel_1_1_3.add(dateLabel_4);

		final JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBackground(new Color(0, 128, 0));
		panel_1_1_1_2.setBounds(101, 0, 60, 26);
		panel_1_4.add(panel_1_1_1_2);

		final JLabel dateLabel_1_3 = new JLabel();
		dateLabel_1_3.setForeground(new Color(255, 255, 255));
		dateLabel_1_3.setText("Time");
		dateLabel_1_3.setBounds(15, 5, 46, 16);
		panel_1_1_1_2.add(dateLabel_1_3);

		final JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1_1_1_1.setBounds(162, 0, 50, 26);
		panel_1_4.add(panel_1_1_1_1_1);

		final JLabel dateLabel_1_1_1 = new JLabel();
		dateLabel_1_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_1_1.setText("Init.");
		dateLabel_1_1_1.setBounds(15, 5, 30, 16);
		panel_1_1_1_1_1.add(dateLabel_1_1_1);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(0, 128, 0));
		panel_1_2_1.setBounds(213, 0, 166, 26);
		panel_1_4.add(panel_1_2_1);

		final JLabel dateLabel_2_1 = new JLabel();
		dateLabel_2_1.setForeground(new Color(255, 255, 255));
		dateLabel_2_1.setText("Drug - Strength - Dose");
		dateLabel_2_1.setBounds(20, 5, 136, 16);
		panel_1_2_1.add(dateLabel_2_1);

		final JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setLayout(null);
		panel_1_3_2.setBackground(new Color(0, 128, 0));
		panel_1_3_2.setBounds(380, 0, 100, 26);
		panel_1_4.add(panel_1_3_2);

		final JLabel dateLabel_3_2 = new JLabel();
		dateLabel_3_2.setForeground(new Color(255, 255, 255));
		dateLabel_3_2.setText("Site Non Oral");
		dateLabel_3_2.setBounds(10, 5, 90, 16);
		panel_1_3_2.add(dateLabel_3_2);

		final JPanel panel_1_3_1_2 = new JPanel();
		panel_1_3_1_2.setLayout(null);
		panel_1_3_1_2.setBackground(new Color(0, 128, 0));
		panel_1_3_1_2.setBounds(482, 0, 100, 26);
		panel_1_4.add(panel_1_3_1_2);

		final JLabel dateLabel_3_1_2 = new JLabel();
		dateLabel_3_1_2.setForeground(new Color(255, 255, 255));
		dateLabel_3_1_2.setText("Reason");
		dateLabel_3_1_2.setBounds(20, 5, 59, 16);
		panel_1_3_1_2.add(dateLabel_3_1_2);

		final JPanel panel_1_3_1_1_1 = new JPanel();
		panel_1_3_1_1_1.setLayout(null);
		panel_1_3_1_1_1.setBackground(new Color(0, 128, 0));
		panel_1_3_1_1_1.setBounds(584, 0, 100, 26);
		panel_1_4.add(panel_1_3_1_1_1);

		final JLabel dateLabel_3_1_1_1 = new JLabel();
		dateLabel_3_1_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_3_1_1_1.setText("Result");
		dateLabel_3_1_1_1.setBounds(20, 5, 59, 16);
		panel_1_3_1_1_1.add(dateLabel_3_1_1_1);

		final JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBackground(new Color(0, 128, 0));
		panel_1_1_2_1.setBounds(685, 0, 95, 26);
		panel_1_4.add(panel_1_1_2_1);

		final JLabel dateLabel_1_2_1 = new JLabel();
		dateLabel_1_2_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_2_1.setText("Obser. Init.");
		dateLabel_1_2_1.setBounds(15, 5, 70, 16);
		panel_1_1_2_1.add(dateLabel_1_2_1);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(1, 27, 779, 476);
		panel_2_1.add(panel_3_2);

		panelRows = new PanelNurseMedicationNotesRow[50];
		for (int i = 0; i < panelRows.length / 2; i++) {
			panelRows[i] = new PanelNurseMedicationNotesRow(i + 1);
			panelRows[i].setBounds(0, i * 19, 779, 20);
			panel_3.add(panelRows[i]);
		}

		for (int i = panelRows.length / 2 - 1; i < panelRows.length; i++) {
			panelRows[i] = new PanelNurseMedicationNotesRow(i + 1);
			panelRows[i].setBounds(0, (i - panelRows.length / 2) * 19, 779, 20);
			panel_3_2.add(panelRows[i]);
		}

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 595, 525, 197);
		add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 525, 27);
		panel_5.add(panel_6);

		final JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setLayout(null);
		panel_1_1_4.setBackground(new Color(0, 128, 0));
		panel_1_1_4.setBounds(0, 0, 100, 26);
		panel_6.add(panel_1_1_4);

		final JLabel dateLabel_5 = new JLabel();
		dateLabel_5.setForeground(new Color(255, 255, 255));
		dateLabel_5.setText("INITIALS");
		dateLabel_5.setBounds(29, 5, 57, 16);
		panel_1_1_4.add(dateLabel_5);

		final JPanel panel_1_1_4_1 = new JPanel();
		panel_1_1_4_1.setLayout(null);
		panel_1_1_4_1.setBackground(new Color(0, 128, 0));
		panel_1_1_4_1.setBounds(101, 0, 298, 26);
		panel_6.add(panel_1_1_4_1);

		final JLabel dateLabel_5_1 = new JLabel();
		dateLabel_5_1.setForeground(new Color(255, 255, 255));
		dateLabel_5_1.setText("FULL SIGNATURE");
		dateLabel_5_1.setBounds(80, 5, 151, 16);
		panel_1_1_4_1.add(dateLabel_5_1);

		final JPanel panel_1_1_4_2 = new JPanel();
		panel_1_1_4_2.setLayout(null);
		panel_1_1_4_2.setBackground(new Color(0, 128, 0));
		panel_1_1_4_2.setBounds(400, 0, 125, 26);
		panel_6.add(panel_1_1_4_2);

		final JLabel dateLabel_5_2 = new JLabel();
		dateLabel_5_2.setForeground(new Color(255, 255, 255));
		dateLabel_5_2.setText("TITLE");
		dateLabel_5_2.setBounds(29, 5, 57, 16);
		panel_1_1_4_2.add(dateLabel_5_2);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBounds(525, 595, 525, 197);
		add(panel_5_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setBounds(0, 0, 525, 27);
		panel_5_1.add(panel_6_1);

		final JPanel panel_1_1_4_3 = new JPanel();
		panel_1_1_4_3.setLayout(null);
		panel_1_1_4_3.setBackground(new Color(0, 128, 0));
		panel_1_1_4_3.setBounds(0, 0, 100, 26);
		panel_6_1.add(panel_1_1_4_3);

		final JLabel dateLabel_5_3 = new JLabel();
		dateLabel_5_3.setForeground(new Color(255, 255, 255));
		dateLabel_5_3.setText("INITIALS");
		dateLabel_5_3.setBounds(29, 5, 57, 16);
		panel_1_1_4_3.add(dateLabel_5_3);

		final JPanel panel_1_1_4_1_1 = new JPanel();
		panel_1_1_4_1_1.setLayout(null);
		panel_1_1_4_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1_4_1_1.setBounds(101, 0, 298, 26);
		panel_6_1.add(panel_1_1_4_1_1);

		final JLabel dateLabel_5_1_1 = new JLabel();
		dateLabel_5_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_5_1_1.setText("FULL SIGNATURE");
		dateLabel_5_1_1.setBounds(80, 5, 151, 16);
		panel_1_1_4_1_1.add(dateLabel_5_1_1);

		final JPanel panel_1_1_4_2_1 = new JPanel();
		panel_1_1_4_2_1.setLayout(null);
		panel_1_1_4_2_1.setBackground(new Color(0, 128, 0));
		panel_1_1_4_2_1.setBounds(400, 0, 125, 26);
		panel_6_1.add(panel_1_1_4_2_1);

		final JLabel dateLabel_5_2_1 = new JLabel();
		dateLabel_5_2_1.setForeground(new Color(255, 255, 255));
		dateLabel_5_2_1.setText("TITLE");
		dateLabel_5_2_1.setBounds(29, 5, 57, 16);
		panel_1_1_4_2_1.add(dateLabel_5_2_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBounds(1050, 595, 525, 197);
		add(panel_5_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setLayout(null);
		panel_6_2.setBackground(Color.WHITE);
		panel_6_2.setBounds(0, 0, 525, 27);
		panel_5_2.add(panel_6_2);

		final JPanel panel_1_1_4_4 = new JPanel();
		panel_1_1_4_4.setLayout(null);
		panel_1_1_4_4.setBackground(new Color(0, 128, 0));
		panel_1_1_4_4.setBounds(0, 0, 100, 26);
		panel_6_2.add(panel_1_1_4_4);

		final JLabel dateLabel_5_4 = new JLabel();
		dateLabel_5_4.setForeground(new Color(255, 255, 255));
		dateLabel_5_4.setText("INITIALS");
		dateLabel_5_4.setBounds(29, 5, 57, 16);
		panel_1_1_4_4.add(dateLabel_5_4);

		final JPanel panel_1_1_4_1_2 = new JPanel();
		panel_1_1_4_1_2.setLayout(null);
		panel_1_1_4_1_2.setBackground(new Color(0, 128, 0));
		panel_1_1_4_1_2.setBounds(101, 0, 298, 26);
		panel_6_2.add(panel_1_1_4_1_2);

		final JLabel dateLabel_5_1_2 = new JLabel();
		dateLabel_5_1_2.setForeground(new Color(255, 255, 255));
		dateLabel_5_1_2.setText("FULL SIGNATURE");
		dateLabel_5_1_2.setBounds(80, 5, 151, 16);
		panel_1_1_4_1_2.add(dateLabel_5_1_2);

		final JPanel panel_1_1_4_2_2 = new JPanel();
		panel_1_1_4_2_2.setLayout(null);
		panel_1_1_4_2_2.setBackground(new Color(0, 128, 0));
		panel_1_1_4_2_2.setBounds(400, 0, 125, 26);
		panel_6_2.add(panel_1_1_4_2_2);

		final JLabel dateLabel_5_2_2 = new JLabel();
		dateLabel_5_2_2.setForeground(new Color(255, 255, 255));
		dateLabel_5_2_2.setText("TITLE");
		dateLabel_5_2_2.setBounds(29, 5, 57, 16);
		panel_1_1_4_2_2.add(dateLabel_5_2_2);

		panelRows1 = new PanelNurseMedicationNotesRow1[21];

		for (int i = 0; i < panelRows1.length / 3; i++) {
			panelRows1[i] = new PanelNurseMedicationNotesRow1(i + 1);
			panelRows1[i].setBounds(0, 27 + (i * 24), 526, 26);
			panel_5.add(panelRows1[i]);
		}
		for (int i = panelRows1.length / 3 - 1; i < 2 * panelRows1.length / 3; i++) {
			panelRows1[i] = new PanelNurseMedicationNotesRow1(i + 1);
			panelRows1[i].setBounds(0,
					27 + ((i - panelRows1.length / 3 + 1) * 24), 526, 26);
			panel_5_1.add(panelRows1[i]);
		}
		for (int i = 2 * panelRows1.length / 3 - 1; i < panelRows1.length; i++) {
			panelRows1[i] = new PanelNurseMedicationNotesRow1(i + 1);
			panelRows1[i].setBounds(0,
					27 + ((i - 2 * panelRows1.length / 3 + 1) * 24), 526, 26);
			panel_5_2.add(panelRows1[i]);
		}
		// updateData();
	}

	public void doSave() {

		NurseMedicationNotesForm dpnf = new NurseMedicationNotesForm();
		dpnf.setResidentId(Global.currentResidenceKey);
		// System.out.println("Global.currentResidenceKey");
		try {
			Global.currentNurseMedicationNotesFormKey = MedrexClientManager
					.getInstance().insertOrUpdateNurseMedicationNotesForm(dpnf);
			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			for (int i = 0; i < panelRows1.length; i++) {
				panelRows1[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdateNurseMedicationNotesFormRows(rows);
			MedrexClientManager.getInstance()
					.insertOrUpdateNurseMedicationNotesFormRow1s(rows1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dpnf.setSerial(Global.currentNurseMedicationNotesFormKey);
	}

	public void updateData() {

		if (Global.currentNurseMedicationNotesFormKey == 0) {
			rows = new ArrayList<NurseMedicationNotesFormRow>();

			rows1 = new ArrayList<NurseMedicationNotesFormRow1>();

		} else {
			try {
				MedrexClientManager.getInstance().getNurseMedicationNotesForm(
						Global.currentNurseMedicationNotesFormKey);
				rows = MedrexClientManager.getInstance()
						.getNurseMedicationNotesFormRows(
								Global.currentNurseMedicationNotesFormKey);
				rows1 = MedrexClientManager.getInstance()
						.getNurseMedicationNotesFormRow1s(
								Global.currentNurseMedicationNotesFormKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		List<NurseMedicationNotesFormRow> ofZeroRowSerial = new ArrayList<NurseMedicationNotesFormRow>();
		HashMap<Integer, NurseMedicationNotesFormRow> rowKeyMap = new HashMap<Integer, NurseMedicationNotesFormRow>();
		for (int i = 0, j = 0; i < panelRows.length; i++) {
			NurseMedicationNotesFormRow r = null;
			if (rows.size() > 0 && j < rows.size()) {
				r = rows.get(j);
			}
			if (r != null) {
				if (r.getRowSerial() == 0 && rows.size() <= panelRows.length) {
					ofZeroRowSerial.add(r);
				}
				if (i + 1 == r.getRowSerial()) {
					rowKeyMap.put(r.getRowSerial(), r);
					panelRows[i].updateData(r);
					j++;
				}
			} else {
				panelRows[i].updateData(null);
			}
		}
		for (int i = 0, j = 0; i < panelRows.length
				&& ofZeroRowSerial.size() > 0; i++) {
			if (!rowKeyMap.containsKey(i + 1)) {
				NurseMedicationNotesFormRow rowRef = ofZeroRowSerial.get(j++);
				rowRef.setRowSerial(i + 1);
				panelRows[i].updateData(rowRef);
				ofZeroRowSerial.remove(rowRef);
			}
		}
		ofZeroRowSerial = null;
		rowKeyMap = null;
		for (int i = 0, j = 0; i < panelRows1.length; i++) {
			NurseMedicationNotesFormRow1 r = null;
			if (rows1.size() > 0 && j < rows1.size()) {
				r = rows1.get(j);
			}
			if (r != null) {
				if (i + 1 == r.getRowSerial()) {
					panelRows1[i].updateData(r);
					j++;
				}
			} else {
				panelRows1[i].updateData(null);
			}
		}
	}

}
