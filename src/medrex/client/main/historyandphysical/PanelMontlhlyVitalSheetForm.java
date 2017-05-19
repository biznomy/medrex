package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetForm;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;

public class PanelMontlhlyVitalSheetForm extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5187571905099547058L;
	/**
	 * Create the panel
	 */

	PanelMontlhlyVitalSheetFormRow panelRows[];
	List<MonthlyVitalSheetFormRow> rows;

	JTextField txtResidentName = null;

	public PanelMontlhlyVitalSheetForm() {
		super();
		Global.panelMontlhlyVitalSheetForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(900, 1200));
		setLayout(null);

		final JLabel plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("", Font.PLAIN, 14));
		plazaHealthcareLabel
				.setText("Plaza Healthcare & Rehabilitation Center");
		plazaHealthcareLabel.setBounds(250, 0, 327, 14);
		add(plazaHealthcareLabel);

		final JLabel residentIndividualMonthlyLabel = new JLabel();
		residentIndividualMonthlyLabel.setFont(new Font("", Font.BOLD, 16));
		residentIndividualMonthlyLabel
				.setText("RESIDENT INDIVIDUAL MONTHLY VITAL SIGNS AND WEIGHT SHEET");
		residentIndividualMonthlyLabel.setBounds(132, 37, 557, 14);
		add(residentIndividualMonthlyLabel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name");
		residentNameLabel.setBounds(22, 100, 82, 14);
		add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBorder(new LineBorder(Color.black, 1, false));
		txtResidentName.setEditable(false);
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setBounds(110, 97, 239, 21);
		add(txtResidentName);

		final JLabel residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setText("Year : ");
		residentNameLabel_1.setBounds(401, 101, 32, 14);
		add(residentNameLabel_1);

		final JTextField txtYear = new JTextField();
		txtYear.setBorder(new LineBorder(Color.black, 1, false));
		txtYear.setBackground(Color.WHITE);
		txtYear.setBounds(444, 97, 190, 21);
		add(txtYear);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 157, 890, 1015);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 890, 44);
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 114, 44);
		panel_1.add(panel_2);

		final JLabel monthLabel = new JLabel();
		monthLabel.setFont(new Font("", Font.BOLD, 12));
		monthLabel.setText("MONTH");
		monthLabel.setBounds(32, 15, 54, 14);
		panel_2.add(monthLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(112, 0, 63, 44);
		panel_1.add(panel_2_1);

		final JLabel monthLabel_1 = new JLabel();
		monthLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		monthLabel_1.setText("B/P");
		monthLabel_1.setBounds(15, 15, 31, 14);
		panel_2_1.add(monthLabel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(174, 0, 63, 44);
		panel_1.add(panel_2_1_1);

		final JLabel monthLabel_1_1 = new JLabel();
		monthLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		monthLabel_1_1.setText("P");
		monthLabel_1_1.setBounds(20, 15, 20, 14);
		panel_2_1_1.add(monthLabel_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(235, 0, 63, 44);
		panel_1.add(panel_2_1_1_1);

		final JLabel monthLabel_1_1_1 = new JLabel();
		monthLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		monthLabel_1_1_1.setText("R");
		monthLabel_1_1_1.setBounds(20, 15, 20, 14);
		panel_2_1_1_1.add(monthLabel_1_1_1);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(296, 0, 69, 44);
		panel_1.add(panel_2_1_1_1_1);

		final JLabel monthLabel_1_1_1_1 = new JLabel();
		monthLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		monthLabel_1_1_1_1.setText("TEMP");
		monthLabel_1_1_1_1.setBounds(20, 15, 46, 14);
		panel_2_1_1_1_1.add(monthLabel_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBounds(363, 0, 76, 44);
		panel_1.add(panel_2_1_1_1_1_1);

		final JLabel monthLabel_1_1_1_1_1 = new JLabel();
		monthLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		monthLabel_1_1_1_1_1.setText("WEIGHT");
		monthLabel_1_1_1_1_1.setBounds(15, 15, 46, 14);
		panel_2_1_1_1_1_1.add(monthLabel_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1.setBounds(437, 0, 114, 44);
		panel_1.add(panel_2_1_1_1_1_1_1);

		final JTextArea w1TextArea = new JTextArea();
		w1TextArea.setFont(new Font("", Font.BOLD, 12));

		w1TextArea.setWrapStyleWord(true);
		w1TextArea.setText("W#1    Date");
		w1TextArea.setLineWrap(true);
		w1TextArea.setBounds(35, 5, 45, 35);
		panel_2_1_1_1_1_1_1.add(w1TextArea);

		final JPanel panel_2_1_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_1.setBounds(549, 0, 114, 44);
		panel_1.add(panel_2_1_1_1_1_1_1_1);

		final JTextArea w1TextArea_1 = new JTextArea();
		w1TextArea_1.setWrapStyleWord(true);
		w1TextArea_1.setText("W#2    Date");
		w1TextArea_1.setLineWrap(true);
		w1TextArea_1.setFont(new Font("Dialog", Font.BOLD, 12));
		w1TextArea_1.setBounds(35, 5, 45, 35);
		panel_2_1_1_1_1_1_1_1.add(w1TextArea_1);

		final JPanel panel_2_1_1_1_1_1_1_2 = new JPanel();
		panel_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_2.setLayout(null);
		panel_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_2.setBounds(660, 0, 114, 44);
		panel_1.add(panel_2_1_1_1_1_1_1_2);

		final JTextArea w1TextArea_2 = new JTextArea();
		w1TextArea_2.setWrapStyleWord(true);
		w1TextArea_2.setText("W#3    Date");
		w1TextArea_2.setLineWrap(true);
		w1TextArea_2.setFont(new Font("Dialog", Font.BOLD, 12));
		w1TextArea_2.setBounds(35, 5, 45, 35);
		panel_2_1_1_1_1_1_1_2.add(w1TextArea_2);

		final JPanel panel_2_1_1_1_1_1_1_3 = new JPanel();
		panel_2_1_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_3.setLayout(null);
		panel_2_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_3.setBounds(773, 0, 116, 44);
		panel_1.add(panel_2_1_1_1_1_1_1_3);

		final JTextArea w1TextArea_3 = new JTextArea();
		w1TextArea_3.setWrapStyleWord(true);
		w1TextArea_3.setText("W#4    Date");
		w1TextArea_3.setLineWrap(true);
		w1TextArea_3.setFont(new Font("Dialog", Font.BOLD, 12));
		w1TextArea_3.setBounds(35, 5, 45, 35);
		panel_2_1_1_1_1_1_1_3.add(w1TextArea_3);

		final JPanel panelForRows = new JPanel();
		panelForRows.setBackground(Color.WHITE);
		panelForRows.setLayout(null);
		panelForRows.setBounds(0, 43, 890, 970);
		panel.add(panelForRows);

		panelRows = new PanelMontlhlyVitalSheetFormRow[12];

		for (int i = 0; i < 12; i++) {
			panelRows[i] = new PanelMontlhlyVitalSheetFormRow(i + 1);
			panelRows[i].setBounds(0, i * 49, 890, 50);
			panelForRows.add(panelRows[i]);
		}

		// updateData();
	}

	public int doSave() {

		MonthlyVitalSheetForm mvf = new MonthlyVitalSheetForm();
		mvf.setResidentId(Global.currentResidenceKey);
		mvf.setSerial(Global.currentMonthlyVitalSheetFormKey);

		try {
			Global.currentMonthlyVitalSheetFormKey = MedrexClientManager
					.getInstance().insertOrUpdateMonthlyVitalSheetForm(mvf);
			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			System.out.println("row size " + rows.size());
			MedrexClientManager.getInstance()
					.insertOrUpdateMonthlyVitalSheetFormRows(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentMonthlyVitalSheetFormKey;
	}

	public void updateData() {

		if (Global.currentMonthlyVitalSheetFormKey == 0) {
			rows = new ArrayList<MonthlyVitalSheetFormRow>();

		} else {
			MonthlyVitalSheetForm dpnf = null;
			try {
				dpnf = MedrexClientManager.getInstance()
						.getMonthlyVitalSheetForm(
								Global.currentMonthlyVitalSheetFormKey);
				rows = MedrexClientManager.getInstance()
						.getMonthlyVitalSheetFormRows(dpnf.getSerial());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < panelRows.length; i++) {
			MonthlyVitalSheetFormRow r = null;
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

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public void doUpdate() {
		updateData();

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}