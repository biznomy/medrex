package medrex.client.main.consultant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.vo.consultant.PharmacistEvaluationReportForm;
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;

public class PanelPharmacistEvaluationReportForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -258901267232753108L;
	private JTextField txtPhysician;
	private JTextField txtAge;
	JTextField txtResidentName;
	JTextField txtRoomNum;

	PanelPharmacistEvaluationReportFormRow panelPharmacistEvaluationReportFormRows[];
	List<PharmacistEvaluationReportFormRow> rows;

	/**
	 * Create the panel
	 */
	public PanelPharmacistEvaluationReportForm() {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		Global.panelPharmacistEvaluationReportForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 950));
		setLayout(null);

		final JLabel plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("", Font.PLAIN, 16));
		plazaHealthcareLabel
				.setText("Plaza Healthcare & Rehabilitation Centre");
		plazaHealthcareLabel.setBounds(249, 22, 289, 16);
		add(plazaHealthcareLabel);

		final JLabel consultantPharmacistResidenLabel = new JLabel();
		consultantPharmacistResidenLabel.setFont(new Font("", Font.BOLD, 14));
		consultantPharmacistResidenLabel
				.setText("CONSULTANT PHARMACIST RESIDENT");
		consultantPharmacistResidenLabel.setBounds(260, 55, 275, 16);
		add(consultantPharmacistResidenLabel);

		final JLabel consultantPharmacistResidenLabel_1 = new JLabel();
		consultantPharmacistResidenLabel_1.setFont(new Font("Dialog",
				Font.BOLD, 14));
		consultantPharmacistResidenLabel_1.setText("EVALUATION AND REPORT");
		consultantPharmacistResidenLabel_1.setBounds(295, 77, 190, 16);
		add(consultantPharmacistResidenLabel_1);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 110, 780, 121);
		add(panel);

		final JLabel residentsNameLabel = new JLabel();
		residentsNameLabel.setText("Resident's Name");
		residentsNameLabel.setBounds(10, 10, 96, 16);
		panel.add(residentsNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(112, 8, 166, 20);
		panel.add(txtResidentName);

		txtAge = new JTextField();
		txtAge.setBackground(Color.WHITE);
		txtAge.setEditable(false);
		txtAge.setBounds(330, 8, 111, 20);
		panel.add(txtAge);

		final JLabel ageLabel = new JLabel();
		ageLabel.setText("Age:");
		ageLabel.setBounds(295, 10, 36, 16);
		panel.add(ageLabel);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room#:");
		roomLabel.setBounds(470, 10, 50, 16);
		panel.add(roomLabel);

		txtRoomNum = new JTextField();
		txtRoomNum.setBounds(526, 8, 87, 20);
		panel.add(txtRoomNum);

		final JLabel physicianLabel = new JLabel();
		physicianLabel.setText("Physician");
		physicianLabel.setBounds(10, 41, 66, 16);
		panel.add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(82, 40, 140, 20);
		panel.add(txtPhysician);

		final JLabel physicianLabel_1 = new JLabel();
		physicianLabel_1.setText("Diagnosis");
		physicianLabel_1.setBounds(268, 42, 66, 16);
		panel.add(physicianLabel_1);

		final JTextField txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(340, 40, 207, 20);
		panel.add(txtDiagnosis);

		final JLabel physicianLabel_2 = new JLabel();
		physicianLabel_2.setText("Type of Diet");
		physicianLabel_2.setBounds(10, 70, 66, 16);
		panel.add(physicianLabel_2);

		final JTextField txtTypeOfDiet = new JTextField();
		txtTypeOfDiet.setBounds(82, 66, 531, 20);
		panel.add(txtTypeOfDiet);

		final JLabel physicianLabel_2_1 = new JLabel();
		physicianLabel_2_1.setText("Sensitivities or Intolerances");
		physicianLabel_2_1.setBounds(10, 92, 140, 16);
		panel.add(physicianLabel_2_1);

		final JTextField txtTypeOfDiet_1 = new JTextField();
		txtTypeOfDiet_1.setBounds(150, 90, 463, 20);
		panel.add(txtTypeOfDiet_1);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 237, 780, 703);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 780, 26);
		panel_1.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 121, 26);
		panel_2.add(panel_3);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setText("Date");
		dateLabel.setBounds(35, 5, 54, 14);
		panel_3.add(dateLabel);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(119, 0, 386, 26);
		panel_2.add(panel_3_1);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1.setText("Comments");
		dateLabel_1.setBounds(150, 5, 92, 14);
		panel_3_1.add(dateLabel_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBounds(504, 0, 276, 26);
		panel_2.add(panel_3_1_1);

		final JLabel dateLabel_1_1 = new JLabel();
		dateLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1_1.setText("Signature");
		dateLabel_1_1.setBounds(90, 5, 92, 14);
		panel_3_1_1.add(dateLabel_1_1);

		final JPanel panelRows = new JPanel();
		panelRows.setBackground(Color.WHITE);
		panelRows.setLayout(null);
		panelRows.setBounds(0, 27, 780, 671);
		panel_1.add(panelRows);

		panelPharmacistEvaluationReportFormRows = new PanelPharmacistEvaluationReportFormRow[30];

		for (int i = 0; i < 30; i++) {
			panelPharmacistEvaluationReportFormRows[i] = new PanelPharmacistEvaluationReportFormRow(
					i + 1);
			panelPharmacistEvaluationReportFormRows[i].setBounds(0, (i * 25),
					780, 26);
			panelRows.add(panelPharmacistEvaluationReportFormRows[i]);
		}

	}

	public void doSave() {
		PharmacistEvaluationReportForm per = new PharmacistEvaluationReportForm();
		per.setResidentId(Global.currentResidenceKey);
		per.setSerial(Global.currentPharmacistResidentEvaluationFormKey);
		try {
			Global.currentPharmacistResidentEvaluationFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdatePharmacistEvaluationReportForm(per);
			for (int i = 0; i < 30; i++) {
				panelPharmacistEvaluationReportFormRows[i].doSave();
			}
			MedrexClientManager.getInstance()
					.insertOrUpdatePharmacistEvaluationReportFormRows(rows);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void updateData() {
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			/* TODO: Migrating to room history */
			// txtRoomNum.setText(rm.getRoom());
			txtAge.setText(Utils.getResidentAgeYear() + "");
			// + "."
			// + Utils.getResidentAgeMonth()

		} catch (Exception e) {

		}
		List physicianFormList = null;
		try {
			physicianFormList = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator itr = physicianFormList.iterator();
		while (itr.hasNext()) {
			PhysicianForm physicianForm = (PhysicianForm) itr.next();
			Doctors doct = null;
			try {
				// doct =
				// MedrexClientManager.getInstance().getDoctorsRecord(physicianForm.getPhysicianId());
				doct = physicianForm.getPhysician();
			} catch (Exception e) {

				e.printStackTrace();
			}
			if (doct.getDoctorType().toString().equals("Physicians")) {
				txtPhysician.setText(doct.getPhysicianName());
				break;
			}
		}

		if (Global.currentPharmacistResidentEvaluationFormKey == 0) {
			rows = new ArrayList<PharmacistEvaluationReportFormRow>();

		} else {
			PharmacistEvaluationReportForm form = null;
			try {
				form = MedrexClientManager
						.getInstance()
						.getPharmacistEvaluationReportForm(
								Global.currentPharmacistResidentEvaluationFormKey);
				rows = MedrexClientManager
						.getInstance()
						.getPharmacistEvaluationReportFormRows(form.getSerial());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < panelPharmacistEvaluationReportFormRows.length; i++) {
			PharmacistEvaluationReportFormRow r = null;
			if (rows.size() > 0 && j < rows.size()) {
				r = rows.get(j);
			}
			if (r != null) {
				if (i + 1 == r.getPharmacistEvaluationReportRowSerial()) {
					panelPharmacistEvaluationReportFormRows[i].updateData(r);
					j++;
				}
			} else {
				panelPharmacistEvaluationReportFormRows[i].updateData(null);
			}
		}

	}

}
