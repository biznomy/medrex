package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormCol;

public class PanelTreatmentRoutineRecordFormCol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6388134028873913567L;
	private JTextField txtNothing;
	private JTextField txtHour3;
	private JTextField txtHour4;
	private JTextField txtHour2;
	private JTextField txtHour1;
	private JPanel panel_17;

	int serialCol;
	int serialRow;
	int key;

	/**
	 * Create the panel
	 */
	public PanelTreatmentRoutineRecordFormCol(int row, int col) {
		super();
		setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		setSize(1200, 950);
		// Global.panelNurseTreatmentNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(33, 97));
		setLayout(null);

		panel_17 = new JPanel();
		panel_17.setBounds(0, 0, 33, 98);
		add(panel_17);
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);

		txtHour1 = new JTextField();
		if (col % 2 == 0)
			txtHour1.setBackground(new Color(230, 230, 250));
		else
			txtHour1.setBackground(Color.WHITE);

		txtHour1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		txtHour1.setBounds(0, 0, 33, 20);
		panel_17.add(txtHour1);

		txtHour2 = new JTextField();
		txtHour2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		if (col % 2 == 0)
			txtHour2.setBackground(new Color(230, 230, 250));
		else
			txtHour2.setBackground(Color.WHITE);

		txtHour2.setBounds(0, 19, 33, 20);
		panel_17.add(this.txtHour2);

		txtHour4 = new JTextField();
		txtHour4.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		if (col % 2 == 0)
			txtHour4.setBackground(new Color(230, 230, 250));
		else
			txtHour4.setBackground(Color.WHITE);

		txtHour4.setBounds(0, 57, 33, 20);
		panel_17.add(txtHour4);

		txtHour3 = new JTextField();
		if (col % 2 == 0)
			txtHour3.setBackground(new Color(230, 230, 250));
		else
			txtHour3.setBackground(Color.WHITE);

		txtHour3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		txtHour3.setBounds(0, 37, 33, 22);
		panel_17.add(txtHour3);

		txtNothing = new JTextField();
		txtNothing
				.setBorder(new LineBorder(new Color(147, 112, 219), 1, false));
		txtNothing.setBackground(new Color(147, 112, 219));
		txtNothing.setEditable(false);
		txtNothing.setBounds(0, 76, 33, 20);
		panel_17.add(txtNothing);

		serialRow = row;
		serialCol = col;

		// fillCombos();
		updateData();

	}

	public void updateData() {
		if (Global.currentTreatmentRoutineRecordFormKey == 0) {
			key = 0;
			txtHour1.setText("");
			txtHour2.setText("");
			txtHour3.setText("");
			txtNothing.setText("");
			txtHour4.setText("");

		} else {
			TreatmentRoutineRecordFormCol mprfc = null;

			txtHour1.setText("");
			txtHour2.setText("");
			txtHour3.setText("");
			txtNothing.setText("");
			txtHour4.setText("");

			try {
				mprfc = MedrexClientManager.getInstance()
						.getTreatmentRoutineRecordFormCol(
								Global.currentTreatmentRoutineRecordFormKey,
								serialRow, serialCol);

			} catch (Exception e) {

			}

			key = mprfc.getSerial();
			txtHour1.setText(mprfc.getHour1());
			txtHour2.setText(mprfc.getHour2());
			txtHour3.setText(mprfc.getHour3());
			txtHour4.setText(mprfc.getHour4());

		}

	}

	public void doSave() {
		TreatmentRoutineRecordFormCol mprfc = new TreatmentRoutineRecordFormCol();

		mprfc.setSerial(key);
		mprfc
				.setTreatmentRoutineRecordFormSerial(Global.currentTreatmentRoutineRecordFormKey);
		mprfc.setTreatmentRoutineRecordFormRowSerial(serialRow);
		mprfc.setTreatmentRoutineRecordFormColSerial(serialCol);

		mprfc.setHour1(txtHour1.getText());
		mprfc.setHour2(txtHour2.getText());
		mprfc.setHour3(txtHour3.getText());
		mprfc.setHour4(txtHour4.getText());

		try {
			/* Global.currentTreatmentRoutineRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateTreatmentRoutineRecordFormCol(
							mprfc);
		} catch (Exception e) {

		}
	}

}
