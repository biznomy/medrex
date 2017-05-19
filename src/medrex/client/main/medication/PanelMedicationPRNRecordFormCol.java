package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationPRNRecordFormCol;

public class PanelMedicationPRNRecordFormCol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8983781092184112541L;
	private JTextField txtObs;
	private JTextField txtInitial;
	private JTextField txtResult;
	private JTextField txtHour;
	private JTextField txtDate;
	private JPanel panel_17;

	int serialCol;
	int serialRow;
	int key;

	/**
	 * Create the panel
	 */
	public PanelMedicationPRNRecordFormCol(int row, int col) {
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

		txtDate = new JTextField();
		txtDate.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtDate.setBounds(0, 0, 33, 20);
		panel_17.add(txtDate);

		txtHour = new JTextField();
		txtHour.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtHour.setBackground(new Color(255, 235, 205));
		txtHour.setBounds(0, 19, 33, 20);
		panel_17.add(txtHour);

		txtResult = new JTextField();
		txtResult.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtResult.setBackground(new Color(255, 235, 205));
		txtResult.setBounds(0, 57, 33, 20);
		panel_17.add(txtResult);

		txtInitial = new JTextField();
		txtInitial.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtInitial.setBounds(0, 37, 33, 22);
		panel_17.add(txtInitial);

		txtObs = new JTextField();
		txtObs.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtObs.setBounds(0, 76, 33, 20);
		panel_17.add(txtObs);

		serialRow = row;
		serialCol = col;

		// fillCombos();
		updateData();

	}

	public void updateData() {
		if (Global.currentMedicationPRNRecordFormKey == 0) {
			key = 0;
			txtDate.setText("");
			txtHour.setText("");
			txtInitial.setText("");
			txtObs.setText("");
			txtResult.setText("");

		} else {
			MedicationPRNRecordFormCol mprfc = null;

			txtDate.setText("");
			txtHour.setText("");
			txtInitial.setText("");
			txtObs.setText("");
			txtResult.setText("");

			try {
				mprfc = MedrexClientManager.getInstance()
						.getMedicationPRNRecordFormCol(
								Global.currentMedicationPRNRecordFormKey,
								serialRow, serialCol);

			} catch (Exception e) {

			}

			key = mprfc.getSerial();

			txtDate.setText(mprfc.getDateRecord());
			txtHour.setText(mprfc.getHour());
			txtInitial.setText(mprfc.getInitial());
			txtObs.setText(mprfc.getObs());
			txtResult.setText(mprfc.getResult());

		}

	}

	public void doSave() {
		MedicationPRNRecordFormCol mprfc = new MedicationPRNRecordFormCol();

		mprfc.setSerial(key);
		mprfc
				.setMedicationPRNRecordFormSerial(Global.currentMedicationPRNRecordFormKey);
		mprfc.setMedicationPRNRecordFormRowSerial(serialRow);
		mprfc.setMedicationPRNRecordFormColSerial(serialCol);

		mprfc.setDateRecord(txtDate.getText());
		mprfc.setHour(txtHour.getText());
		mprfc.setInitial(txtInitial.getText());
		mprfc.setResult(txtResult.getText());
		mprfc.setObs(txtObs.getText());

		try {
			/* Global.currentMedicationPRNRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateMedicationPRNRecordFormCol(
							mprfc);
		} catch (Exception e) {

		}
	}

}
