package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.TreatmentPRNRecordFormCol;

public class PanelTreatmentPRNRecordFormCol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2022155195053137803L;
	private JTextField txtNothing;
	private JTextField txtInitial2;
	private JTextField txtHour2;
	private JTextField txtInitial1;
	private JTextField txtHour1;
	private JPanel panel_17;

	int serialCol;
	int serialRow;
	int key;

	/**
	 * Create the panel
	 */
	public PanelTreatmentPRNRecordFormCol(int row, int col) {
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

		txtInitial1 = new JTextField();
		txtInitial1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		if (col % 2 == 0)
			txtInitial1.setBackground(new Color(230, 230, 250));
		else
			txtInitial1.setBackground(Color.WHITE);

		txtInitial1.setBounds(0, 19, 33, 20);
		panel_17.add(txtInitial1);

		txtHour2 = new JTextField();
		txtHour2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		if (col % 2 == 0)
			txtHour2.setBackground(new Color(230, 230, 250));
		else
			txtHour2.setBackground(Color.WHITE);

		txtHour2.setBounds(0, 57, 33, 20);
		panel_17.add(txtHour2);

		txtInitial2 = new JTextField();
		if (col % 2 == 0)
			txtInitial2.setBackground(new Color(230, 230, 250));
		else
			txtInitial2.setBackground(Color.WHITE);

		txtInitial2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		txtInitial2.setBounds(0, 37, 33, 22);
		panel_17.add(txtInitial2);

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
		if (Global.currentTreatmentPRNRecordFormKey == 0) {
			key = 0;
			txtHour1.setText("");
			txtInitial1.setText("");
			txtInitial2.setText("");
			txtNothing.setText("");
			txtHour2.setText("");

		} else {
			TreatmentPRNRecordFormCol mprfc = null;

			txtHour1.setText("");
			txtInitial1.setText("");
			txtInitial2.setText("");
			txtNothing.setText("");
			txtHour2.setText("");

			try {
				mprfc = MedrexClientManager.getInstance()
						.getTreatmentPRNRecordFormCol(
								Global.currentTreatmentPRNRecordFormKey,
								serialRow, serialCol);

			} catch (Exception e) {

			}

			key = mprfc.getSerial();
			txtHour1.setText(mprfc.getHour1());
			txtInitial1.setText(mprfc.getInitial1());
			txtInitial2.setText(mprfc.getInitial2());
			txtHour2.setText(mprfc.getHour2());

		}

	}

	public void doSave() {
		TreatmentPRNRecordFormCol mprfc = new TreatmentPRNRecordFormCol();

		mprfc.setSerial(key);
		mprfc
				.setTreatmentPRNRecordFormSerial(Global.currentTreatmentPRNRecordFormKey);
		mprfc.setTreatmentPRNRecordFormRowSerial(serialRow);
		mprfc.setTreatmentPRNRecordFormColSerial(serialCol);

		mprfc.setHour1(txtHour1.getText());
		mprfc.setInitial1(txtInitial1.getText());
		mprfc.setInitial2(txtInitial2.getText());
		mprfc.setHour2(txtHour2.getText());

		try {
			/* Global.currentTreatmentPRNRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateTreatmentPRNRecordFormCol(
							mprfc);
		} catch (Exception e) {

		}
	}

}
