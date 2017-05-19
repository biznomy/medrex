package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisForm;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;

public class PanelCumulativeDiagnosisForm extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2120420738825072519L;
	/**
	 * Create the panel
	 */

	PanelCumulativeDiagnosisFormRow panelRows[];
	List<CumulativeDiagnosisFormRow> rows;

	JTextField txtResidentName;
	JTextField txtRoomNum;
	JTextField txtPhysician;

	public PanelCumulativeDiagnosisForm() {
		super();
		Global.panelCumulativeDiagnosisForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 1200));
		setLayout(null);

		final JLabel plazaNursingLabel = new JLabel();
		plazaNursingLabel.setFont(new Font("", Font.PLAIN, 14));
		plazaNursingLabel.setText("PLAZA NURSING & REHABILITATION CENTER");
		plazaNursingLabel.setBounds(286, 0, 396, 16);
		add(plazaNursingLabel);

		final JLabel cumulativeDiagnosisLabel = new JLabel();
		cumulativeDiagnosisLabel.setFont(new Font("", Font.BOLD, 14));
		cumulativeDiagnosisLabel.setText("CUMULATIVE DIAGNOSIS");
		cumulativeDiagnosisLabel.setBounds(346, 30, 186, 16);
		add(cumulativeDiagnosisLabel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setText("RESIDENT:");
		residentLabel.setBounds(31, 90, 66, 16);
		add(residentLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(103, 88, 176, 21);
		add(txtResidentName);

		final JLabel rmLabel = new JLabel();
		rmLabel.setText("Rm");
		rmLabel.setBounds(314, 91, 25, 14);
		add(rmLabel);

		txtRoomNum = new JTextField();
		txtRoomNum.setBackground(Color.WHITE);
		txtRoomNum.setEditable(false);
		txtRoomNum.setBounds(336, 88, 79, 21);
		add(txtRoomNum);

		final JLabel physicianLabel = new JLabel();
		physicianLabel.setText("Physician");
		physicianLabel.setBounds(446, 91, 54, 14);
		add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setEditable(false);
		txtPhysician.setBackground(Color.WHITE);
		txtPhysician.setBounds(499, 88, 183, 21);
		add(txtPhysician);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(31, 133, 759, 890);
		add(panel);

		panelRows = new PanelCumulativeDiagnosisFormRow[20];

		for (int i = 0; i < 20; i++) {
			panelRows[i] = new PanelCumulativeDiagnosisFormRow(i + 1);
			panelRows[i].setBounds(0, i * 29, 650, 30);
			panel.add(panelRows[i]);
		}
	}

	public int doSave() {

		CumulativeDiagnosisForm dpnf = new CumulativeDiagnosisForm();
		dpnf.setResidentId(Global.currentResidenceKey);
		dpnf.setSerial(Global.currentCumulativeDiagnosisFormKey);
		try {
			Global.currentCumulativeDiagnosisFormKey = MedrexClientManager
					.getInstance().insertOrUpdateCumulativeDiagnosisForm(dpnf);
			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdateCumulativeDiagnosisFormRows(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentCumulativeDiagnosisFormKey;
	}

	public void updateData() {

		if (Global.currentCumulativeDiagnosisFormKey == 0) {
			rows = new ArrayList<CumulativeDiagnosisFormRow>();
		} else {
			try {
				MedrexClientManager.getInstance().getCumulativeDiagnosisForm(
						Global.currentCumulativeDiagnosisFormKey);
				rows = MedrexClientManager.getInstance()
						.getCumulativeDiagnosisFormRows(
								Global.currentCumulativeDiagnosisFormKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < panelRows.length; i++) {
			CumulativeDiagnosisFormRow r = null;
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

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		updateData();

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
