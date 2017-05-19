package medrex.client.main.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesForm;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesFormRow;

public class PanelInterDisciplinaryProgressNotesForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6902452452297528871L;
	private JTextField txtAge;
	JTextField txtResidentName;
	JTextField txtRoomNum;

	PanelInterDisciplinaryProgressNotesFormRow panelRows[];
	List<InterDisciplinaryProgressNotesFormRow> rows;

	/**
	 * Create the panel
	 */
	public PanelInterDisciplinaryProgressNotesForm() {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		Global.panelInterdisciplinaryProgressNotesForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 950));
		setLayout(null);

		final JLabel interdisciplinaryProgressNotesLabel = new JLabel();
		interdisciplinaryProgressNotesLabel
				.setFont(new Font("", Font.BOLD, 16));
		interdisciplinaryProgressNotesLabel
				.setText("INTERDISCIPLINARY PROGRESS NOTES");
		interdisciplinaryProgressNotesLabel.setBounds(259, 10, 344, 16);
		add(interdisciplinaryProgressNotesLabel);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 47, 780, 814);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 780, 30);
		panel.add(panel_1);
		panel_1.setLayout(null);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 0, 119, 30);
		panel_1.add(panel_2);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setText("DATE");
		dateLabel.setBounds(35, 10, 66, 16);
		panel_2.add(dateLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(119, 0, 101, 30);
		panel_1.add(panel_2_1);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(new Color(255, 255, 255));
		dateLabel_1.setText("TIME");
		dateLabel_1.setBounds(35, 10, 56, 16);
		panel_2_1.add(dateLabel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(219, 0, 119, 30);
		panel_1.add(panel_2_1_1);

		final JLabel dateLabel_1_1 = new JLabel();
		dateLabel_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_1.setText("DISCIPLINE");
		dateLabel_1_1.setBounds(35, 10, 74, 16);
		panel_2_1_1.add(dateLabel_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1.setBounds(338, 0, 442, 30);
		panel_1.add(panel_2_1_1_1);

		final JLabel dateLabel_1_1_1 = new JLabel();
		dateLabel_1_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_1_1.setText("NOTES SHOULD BE SIGNED WITH NAME AND TITLE");
		dateLabel_1_1_1.setBounds(10, 10, 422, 16);
		panel_2_1_1_1.add(dateLabel_1_1_1);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 23, 780, 754);
		panel.add(panel_3);

		panelRows = new PanelInterDisciplinaryProgressNotesFormRow[27];

		for (int i = 0; i < 27; i++) {
			panelRows[i] = new PanelInterDisciplinaryProgressNotesFormRow(i + 1);
			panelRows[i].setBounds(0, i * 27, 780, 28);
			panel_3.add(panelRows[i]);
		}

	}

	public void doSave() {

		InterDisciplinaryProgressNotesForm indpnf = new InterDisciplinaryProgressNotesForm();
		indpnf.setResidentId(Global.currentResidenceKey);
		indpnf.setSerial(Global.currentInterdisciplinaryProgressNotesKey);
		try {
			Global.currentInterdisciplinaryProgressNotesKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateInterDisciplinaryProgressNotesForm(indpnf);
			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdateInterDisciplinaryProgressNotesFormRow(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData() {

		if (Global.currentInterdisciplinaryProgressNotesKey == 0) {
			rows = new ArrayList<InterDisciplinaryProgressNotesFormRow>();
		} else {
			try {
				MedrexClientManager
						.getInstance()
						.getInterDisciplinaryProgressNotesForm(
								Global.currentInterdisciplinaryProgressNotesKey);
				rows = MedrexClientManager
						.getInstance()
						.getInterDisciplinaryProgressNotesFormRow(
								Global.currentInterdisciplinaryProgressNotesKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < panelRows.length; i++) {
			InterDisciplinaryProgressNotesFormRow r = null;
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

	}

}
