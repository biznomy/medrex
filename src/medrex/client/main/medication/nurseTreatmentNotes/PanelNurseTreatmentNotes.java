package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.NurseTreatmentNotesForm;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;

public class PanelNurseTreatmentNotes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PanelNurseTreatmentNotesRow panelRows[];

	List<NurseTreatmentNotesFormRow> rows;

	PanelNurseTreatmentNotesRow1 panelRows1[];

	List<NurseTreatmentNotesFormRow1> rows1;

	public final static int MAX_ROWS = 17;

	private JLabel initialLabel_8;

	private JPanel panel_45;

	private JLabel initialLabel_7;

	private JPanel panel_44;

	private JLabel initialLabel_6;

	private JPanel panel_43;

	private JPanel panel_42;

	private JPanel panel_41;

	private JLabel initialLabel_5;

	private JPanel panel_39;

	private JLabel initialLabel_4;

	private JPanel panel_38;

	private JLabel initialLabel_3;

	private JPanel panel_37;

	private JPanel panel_36;

	private JPanel panel_35;

	private JLabel initialLabel_2;

	private JPanel panel_33;

	private JLabel initialLabel_1;

	private JPanel panel_32;

	private JLabel initialLabel;

	private JPanel panel_31;

	private JPanel panel_29;

	private JPanel panel_27;

	private JPanel panel_28;

	private JLabel label_6;

	private JPanel panel_10;

	private JLabel label_5;

	private JPanel panel_9;

	private JLabel label_4;

	private JLabel label_3;

	private JLabel label_2;

	private JLabel label;

	private JPanel panel_8;

	private JPanel panel_7;

	private JPanel panel_6;

	private JPanel panel_3;

	private JPanel panel_4;

	private JLabel nursesTreatmentNotesLabel;

	private JPanel panel_2;

	private JPanel panel_1;

	private JTextArea aWhenATextArea_1;

	private JTextArea aWhenATextArea;

	private JLabel instructionsLabel;

	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelNurseTreatmentNotes() {
		super();
		Global.panelNurseTreatmentNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1200, 1000));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(146, 10, 323, 91);
		add(panel);

		instructionsLabel = new JLabel();
		instructionsLabel.setFont(new Font("", Font.BOLD, 12));
		instructionsLabel.setText("INSTRUCTIONS");
		instructionsLabel.setBounds(10, 0, 103, 17);
		panel.add(instructionsLabel);

		aWhenATextArea = new JTextArea();
		aWhenATextArea.setBackground(Color.WHITE);
		aWhenATextArea.setFont(new Font("", Font.PLAIN, 11));
		aWhenATextArea
				.setText("A. WHEN A MEDICATION IS GIVEN, NURSE SHOULD INITIAL THE HOUR/DATE SQUARE.");
		aWhenATextArea.setWrapStyleWord(true);
		aWhenATextArea.setLineWrap(true);
		aWhenATextArea.setEditable(false);
		aWhenATextArea.setBounds(10, 23, 313, 30);
		panel.add(aWhenATextArea);

		aWhenATextArea_1 = new JTextArea();
		aWhenATextArea_1.setBackground(Color.WHITE);
		aWhenATextArea_1.setWrapStyleWord(true);
		aWhenATextArea_1
				.setText("B. WHEN PRN MEDICATIONS ARE GIVEN, EXPLAIN IN NURSES MEDICATION NOTES.");
		aWhenATextArea_1.setLineWrap(true);
		aWhenATextArea_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		aWhenATextArea_1.setEditable(false);
		aWhenATextArea_1.setBounds(10, 59, 313, 30);
		panel.add(aWhenATextArea_1);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 100, 1180, 563);
		add(panel_1);

		panelRows = new PanelNurseTreatmentNotesRow[MAX_ROWS];

		for (int i = 0; i < 17; i++) {
			panelRows[i] = new PanelNurseTreatmentNotesRow(i + 1);
			panelRows[i].setBounds(0, 65 + i * 29, 1180, 30);
			panel_1.add(panelRows[i]);

		}

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 1, 1180, 30);
		panel_1.add(panel_2);

		nursesTreatmentNotesLabel = new JLabel();
		nursesTreatmentNotesLabel.setFont(new Font("", Font.BOLD, 20));
		nursesTreatmentNotesLabel.setBackground(Color.WHITE);
		nursesTreatmentNotesLabel.setText("NURSE'S TREATMENT NOTES");
		nursesTreatmentNotesLabel.setBounds(460, 0, 315, 30);
		panel_2.add(nursesTreatmentNotesLabel);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 32, 1180, 30);
		panel_1.add(panel_4);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 116, 30);
		panel_4.add(panel_3);

		label = new JLabel();
		label.setText("DATE");
		label.setBounds(30, 4, 43, 22);
		panel_3.add(label);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(115, 0, 84, 30);
		panel_4.add(panel_6);

		label_2 = new JLabel();
		label_2.setText("TIME");
		label_2.setBounds(30, 4, 43, 22);
		panel_6.add(label_2);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(198, 0, 100, 30);
		panel_4.add(panel_7);

		label_3 = new JLabel();
		label_3.setText("INITIAL");
		label_3.setBounds(30, 4, 60, 22);
		panel_7.add(label_3);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(297, 0, 330, 30);
		panel_4.add(panel_8);

		label_4 = new JLabel();
		label_4.setText("TREATMENT");
		label_4.setBounds(120, 4, 82, 22);
		panel_8.add(label_4);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(626, 0, 226, 30);
		panel_4.add(panel_9);

		label_5 = new JLabel();
		label_5.setText("RESULT");
		label_5.setBounds(80, 4, 82, 22);
		panel_9.add(label_5);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(850, 0, 330, 30);
		panel_4.add(panel_10);

		label_6 = new JLabel();
		label_6.setText("REASON");
		label_6.setBounds(130, 4, 82, 22);
		panel_10.add(label_6);

		panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(10, 670, 1180, 364);
		add(panel_28);

		panel_27 = new JPanel();
		panel_27.setBackground(Color.WHITE);
		panel_27.setLayout(null);
		panel_27.setBounds(0, 0, 393, 307);
		panel_28.add(panel_27);

		panel_29 = new JPanel();
		panel_29.setBackground(Color.WHITE);
		panel_29.setLayout(null);
		panel_29.setBounds(0, 0, 393, 30);
		panel_27.add(panel_29);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 0, 100, 30);
		panel_29.add(panel_31);

		initialLabel = new JLabel();
		initialLabel.setText("INITIAL");
		initialLabel.setBounds(30, 4, 60, 22);
		panel_31.add(initialLabel);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(99, 0, 80, 30);
		panel_29.add(panel_32);

		initialLabel_1 = new JLabel();
		initialLabel_1.setText("SHIFT");
		initialLabel_1.setBounds(22, 4, 36, 22);
		panel_32.add(initialLabel_1);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(178, 0, 215, 30);
		panel_29.add(panel_33);

		initialLabel_2 = new JLabel();
		initialLabel_2.setText("SIGNATURE");
		initialLabel_2.setBounds(50, 4, 78, 22);
		panel_33.add(initialLabel_2);

		panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(391, 0, 393, 307);
		panel_28.add(panel_35);
		panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 0, 393, 30);
		panel_35.add(panel_36);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 0, 100, 30);
		panel_36.add(panel_37);

		initialLabel_3 = new JLabel();
		initialLabel_3.setText("INITIAL");
		initialLabel_3.setBounds(30, 4, 60, 22);
		panel_37.add(initialLabel_3);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(99, 0, 80, 30);
		panel_36.add(panel_38);

		initialLabel_4 = new JLabel();
		initialLabel_4.setText("SHIFT");
		initialLabel_4.setBounds(22, 4, 36, 22);
		panel_38.add(initialLabel_4);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(178, 0, 215, 30);
		panel_36.add(panel_39);

		initialLabel_5 = new JLabel();
		initialLabel_5.setText("SIGNATURE");
		initialLabel_5.setBounds(50, 4, 78, 22);
		panel_39.add(initialLabel_5);

		panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(783, 0, 393, 307);
		panel_28.add(panel_41);

		panelRows1 = new PanelNurseTreatmentNotesRow1[24];
		for (int i = 0; i < 8; i++) {
			panelRows1[i] = new PanelNurseTreatmentNotesRow1(i + 1);
			panelRows1[i].setBounds(0, 29 + i * 29, 1180, 30);
			panel_27.add(panelRows1[i]);
		}
		for (int i = 8; i < 16; i++) {
			panelRows1[i] = new PanelNurseTreatmentNotesRow1(i + 1);
			panelRows1[i].setBounds(0, 29 + (i - 8) * 29, 1180, 30);
			panel_35.add(panelRows1[i]);

		}
		for (int i = 16; i < 24; i++) {
			panelRows1[i] = new PanelNurseTreatmentNotesRow1(i + 1);
			panelRows1[i].setBounds(0, 29 + (i - 16) * 29, 1180, 30);
			panel_41.add(panelRows1[i]);
		}

		panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 0, 393, 30);
		panel_41.add(panel_42);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 0, 100, 30);
		panel_42.add(panel_43);

		initialLabel_6 = new JLabel();
		initialLabel_6.setText("INITIAL");
		initialLabel_6.setBounds(30, 4, 60, 22);
		panel_43.add(initialLabel_6);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(99, 0, 80, 30);
		panel_42.add(panel_44);

		initialLabel_7 = new JLabel();
		initialLabel_7.setText("SHIFT");
		initialLabel_7.setBounds(22, 4, 36, 22);
		panel_44.add(initialLabel_7);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(178, 0, 215, 30);
		panel_42.add(panel_45);

		initialLabel_8 = new JLabel();
		initialLabel_8.setText("SIGNATURE");
		initialLabel_8.setBounds(50, 4, 78, 22);
		panel_45.add(initialLabel_8);

		// updateData();

	}

	public void updateData() {

		if (Global.currentNurseTreatmentNotesFormKey == 0) {
			rows = new ArrayList();
			rows1 = new ArrayList();
		} else {
			try {
				MedrexClientManager.getInstance().getNurseTreatmentNotesForm(
						Global.currentNurseTreatmentNotesFormKey);
				rows = MedrexClientManager.getInstance()
						.getNurseTreatmentNotesFormRows(
								Global.currentNurseTreatmentNotesFormKey);

				rows1 = MedrexClientManager.getInstance()
						.getNurseTreatmentNotesFormRow1s(
								Global.currentNurseTreatmentNotesFormKey);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		for (int i = 0, j = 0; i < panelRows.length; i++) {
			NurseTreatmentNotesFormRow r = null;
			if (rows.size() > 0 && j < rows.size()) {
				r = rows.get(j);
			}

			if (r != null) {
				if (i + 1 == r.getRowSerial()) {
					panelRows[i].updateData(r);
					j++;
				}
			} else {
				panelRows[i].updateData(null);
			}
		}

		// ///////////////////////////
		for (int i = 0, j = 0; i < panelRows1.length; i++) {
			NurseTreatmentNotesFormRow1 r = null;
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

	public void doSave() {

		NurseTreatmentNotesForm ntnf = new NurseTreatmentNotesForm();
		ntnf.setSerial(Global.currentNurseTreatmentNotesFormKey);
		ntnf.setResidentId(Global.currentResidenceKey);
		try {
			Global.currentNurseTreatmentNotesFormKey = MedrexClientManager
					.getInstance().insertOrUpdateNurseTreatmentNotesForm(ntnf);

			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdateNurseTreatmentNotesFormRow(rows);

			for (int i = 0; i < panelRows1.length; i++) {
				panelRows1[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdateNurseTreatmentNotesFormRow1(rows1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
