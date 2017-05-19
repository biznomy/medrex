package medrex.client.main.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesForm;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesFormRow;

public class PanelDoctorsProgressNotesForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1884080689441831736L;
	PanelDoctorsProgressNotesFormRow panelRows[];
	List<DoctorsProgressNotesFormRow> rows;

	/**
	 * Create the panel
	 */
	public PanelDoctorsProgressNotesForm() {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		Global.panelDoctorsProgressNotesForm = this;
		setBackground(new Color(153, 204, 102));
		setPreferredSize(new Dimension(800, 950));
		setLayout(null);

		final JLabel plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("", Font.BOLD, 16));
		plazaHealthcareLabel.setText("DOCTOR'S PROGRESS NOTES");
		plazaHealthcareLabel.setBounds(249, 22, 289, 16);
		add(plazaHealthcareLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 80, 780, 800);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 780, 26);
		panel_1.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 121, 26);
		panel_2.add(panel_3);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setBackground(Color.DARK_GRAY);
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setText("Date");
		dateLabel.setBounds(35, 5, 54, 14);
		panel_3.add(dateLabel);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.DARK_GRAY);
		panel_3_1.setBounds(121, 0, 121, 26);
		panel_2.add(panel_3_1);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(new Color(255, 255, 255));
		dateLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1.setBackground(Color.BLACK);
		dateLabel_1.setText("HOUR");
		dateLabel_1.setBounds(35, 5, 54, 14);
		panel_3_1.add(dateLabel_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.DARK_GRAY);
		panel_3_1_1.setBounds(241, 0, 539, 26);
		panel_2.add(panel_3_1_1);

		final JLabel dateLabel_1_1 = new JLabel();
		dateLabel_1_1.setForeground(new Color(255, 255, 255));
		dateLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1_1.setBackground(Color.BLACK);
		dateLabel_1_1.setBounds(35, 5, 54, 14);
		panel_3_1_1.add(dateLabel_1_1);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 27, 780, 773);
		panel_1.add(panel);

		panelRows = new PanelDoctorsProgressNotesFormRow[30];

		for (int i = 0; i < 30; i++) {
			panelRows[i] = new PanelDoctorsProgressNotesFormRow(i + 1);
			panelRows[i].setBounds(0, i * 25, 780, 26);
			panel.add(panelRows[i]);
		}
	}

	public void doSave() {

		DoctorsProgressNotesForm dpnf = new DoctorsProgressNotesForm();
		dpnf.setSerial(Global.currentDoctorsProgressNotesKey);
		dpnf.setResidentId(Global.currentResidenceKey);
		try {
			Global.currentDoctorsProgressNotesKey = MedrexClientManager
					.getInstance().insertOrUpdateDoctorsProgressNotesForm(dpnf);
			System.out.println("rows===========: " + rows.size());
			for (int i = 0; i < 30; i++) {
				panelRows[i].doSave();
			}
			System.out.println("rows: " + rows.size());
			MedrexClientManager.getInstance()
					.insertOrUpdateDoctorsProgressNotesFormRows(rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData() {

		if (Global.currentDoctorsProgressNotesKey == 0) {
			rows = new ArrayList<DoctorsProgressNotesFormRow>();
		} else {
			try {
				MedrexClientManager.getInstance().getDoctorProgressNotesForm(
						Global.currentDoctorsProgressNotesKey);
				rows = MedrexClientManager.getInstance()
						.getDoctorProgressNotesFormRows(
								Global.currentDoctorsProgressNotesKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < 30; i++) {
			DoctorsProgressNotesFormRow r = null;
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
