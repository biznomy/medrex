package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationRoutineRecordFormCol;

public class PanelMedicationRoutineRecordFormCol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1518539966709836742L;
	private JTextField txt5;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt2;
	private JTextField txt1;
	private JPanel panel_17;

	int serialCol;
	int serialRow;
	int key;

	/**
	 * Create the panel
	 */
	public PanelMedicationRoutineRecordFormCol(int row, int col) {
		super();
		setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		setSize(1200, 950);
		// Global.panelNurseMedicationNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(33, 118));
		setLayout(null);

		panel_17 = new JPanel();
		panel_17.setBounds(0, 0, 33, 118);
		add(panel_17);
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);

		txt1 = new JTextField();
		txt1.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txt1.setBounds(0, 0, 33, 20);
		panel_17.add(txt1);

		txt2 = new JTextField();
		txt2.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txt2.setBackground(new Color(255, 235, 205));
		txt2.setBounds(0, 19, 33, 20);
		panel_17.add(txt2);

		txt4 = new JTextField();
		txt4.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txt4.setBackground(new Color(255, 235, 205));
		txt4.setBounds(0, 57, 33, 20);
		panel_17.add(txt4);

		txt3 = new JTextField();
		txt3.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txt3.setBounds(0, 37, 33, 22);
		panel_17.add(txt3);

		txt5 = new JTextField();
		txt5.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txt5.setBounds(0, 76, 33, 20);
		panel_17.add(txt5);

		serialRow = row;
		serialCol = col;

		// fillCombos();
		updateData();

	}

	public void updateData() {
		if (Global.currentMedicationRoutineRecordFormKey == 0) {
			key = 0;
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt5.setText("");
			txt4.setText("");

		} else {
			MedicationRoutineRecordFormCol mprfc = null;

			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt5.setText("");
			txt4.setText("");

			try {
				mprfc = MedrexClientManager.getInstance()
						.getMedicationRoutineRecordFormCol(
								Global.currentMedicationRoutineRecordFormKey,
								serialRow, serialCol);

			} catch (Exception e) {

			}

			key = mprfc.getSerial();

			txt1.setText(mprfc.getContent1());
			txt2.setText(mprfc.getContent2());
			txt3.setText(mprfc.getContent3());
			txt5.setText(mprfc.getContent4());
			txt4.setText(mprfc.getContent5());

		}

	}

	public void doSave() {
		MedicationRoutineRecordFormCol mprfc = new MedicationRoutineRecordFormCol();

		mprfc.setSerial(key);
		mprfc
				.setMedicationRoutineRecordFormSerial(Global.currentMedicationRoutineRecordFormKey);
		mprfc.setMedicationRoutineRecordFormRowSerial(serialRow);
		mprfc.setMedicationRoutineRecordFormColSerial(serialCol);

		mprfc.setContent1(txt1.getText());
		mprfc.setContent2(txt2.getText());
		mprfc.setContent3(txt3.getText());
		mprfc.setContent4(txt4.getText());
		mprfc.setContent5(txt5.getText());

		try {
			/* Global.currentMedicationRoutineRecordFormKey = */MedrexClientManager
					.getInstance()
					.insertOrUpdateMedicationRoutineRecordFormCol(mprfc);
		} catch (Exception e) {

		}
	}

}
