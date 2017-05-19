package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.dietary.DietaryPlazaHealth;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;

public class PanelDietaryPlazaHealth extends JPanel implements Form {

	private PanelDietaryPlazaHealthRow p[];

	List<DietaryPlazaHealthRow> rows;

	private JPanel panel;

	private JLabel dateLabel_6;

	private JLabel dateLabel_5;

	private JLabel dateLabel_3;

	private JPanel panel_7;

	private JLabel dateLabel_1;

	private JPanel panel_6;

	private JPanel panel_5;

	private JTextArea txtDiagnosis;

	private JLabel dateLabel;

	private JTextField txtPhysicianName;

	private JLabel dateLabel_10;

	private JTextField txtRoomNo;

	private JLabel dateLabel_4;

	private JPanel panel_4;

	private JTextField txtResidentName;

	private JLabel dateLabel_2;

	private JPanel panel_3;

	private JPanel panel_2;

	private JLabel sectionAaIdentificationLabel;

	private JPanel panel_1;

	private JLabel minimumDataSetLabel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelDietaryPlazaHealth() {
		super();
		Global.panelDietaryPlazaHealth = this;
		setPreferredSize(new Dimension(800, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		minimumDataSetLabel = new JLabel();
		minimumDataSetLabel.setFont(new Font("Arial", Font.BOLD, 18));
		minimumDataSetLabel
				.setText("Consultant Dietician Nutritional Recommendations");
		minimumDataSetLabel.setBounds(187, 86, 501, 33);
		add(minimumDataSetLabel);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 145, 790, 1045);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 790, 40);
		panel_1.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 0, 369, 40);
		panel_2.add(panel_3);

		dateLabel_2 = new JLabel();
		dateLabel_2.setText("Resident Name");
		dateLabel_2.setBounds(5, 10, 82, 14);
		panel_3.add(dateLabel_2);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(93, 8, 266, 20);
		panel_3.add(txtResidentName);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(368, 0, 99, 40);
		panel_2.add(panel_4);

		dateLabel_4 = new JLabel();
		dateLabel_4.setText("Rm#");
		dateLabel_4.setBounds(5, 10, 23, 14);
		panel_4.add(dateLabel_4);

		txtRoomNo = new JTextField();
		txtRoomNo.setBackground(Color.WHITE);
		txtRoomNo.setEditable(false);
		txtRoomNo.setBounds(34, 8, 58, 20);
		panel_4.add(txtRoomNo);

		dateLabel_10 = new JLabel();
		dateLabel_10.setText("Physician");
		dateLabel_10.setBounds(472, 10, 44, 14);
		panel_2.add(dateLabel_10);

		txtPhysicianName = new JTextField();
		txtPhysicianName.setBackground(Color.WHITE);
		txtPhysicianName.setEditable(false);
		txtPhysicianName.setBounds(524, 8, 256, 20);
		panel_2.add(txtPhysicianName);

		dateLabel = new JLabel();
		dateLabel.setText("Diagnosis:");
		dateLabel.setBounds(5, 46, 49, 14);
		panel_1.add(dateLabel);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setBorder(new LineBorder(UIManager
				.getColor("CheckBox.background"), 1, false));
		txtDiagnosis.setBackground(Color.WHITE);
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setLineWrap(true);
		txtDiagnosis.setWrapStyleWord(true);
		txtDiagnosis.setBounds(60, 45, 730, 83);
		panel_1.add(txtDiagnosis);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 155, 790, 40);
		panel_1.add(panel_5);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 0, 109, 40);
		panel_5.add(panel_6);

		dateLabel_1 = new JLabel();
		dateLabel_1.setText("Date");
		dateLabel_1.setBounds(27, 10, 60, 14);
		panel_6.add(dateLabel_1);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(368, 0, 99, 40);
		panel_5.add(panel_7);

		dateLabel_3 = new JLabel();
		dateLabel_3.setText("Dietician Signature");
		dateLabel_3.setBounds(5, 10, 94, 14);
		panel_7.add(dateLabel_3);

		dateLabel_5 = new JLabel();
		dateLabel_5.setText("Nurse/Physician's Followup & Signature");
		dateLabel_5.setBounds(498, 10, 253, 14);
		panel_5.add(dateLabel_5);

		dateLabel_6 = new JLabel();
		dateLabel_6.setText("Consultant Dietician Recommendations");
		dateLabel_6.setBounds(128, 11, 221, 14);
		panel_5.add(dateLabel_6);

		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 194, 790, 851);
		panel_1.add(panel);

		sectionAaIdentificationLabel = new JLabel();
		sectionAaIdentificationLabel.setFont(new Font("", Font.BOLD, 14));
		sectionAaIdentificationLabel
				.setText("Plaza Healthcare & Rehabilitation Center");
		sectionAaIdentificationLabel.setBounds(238, 50, 300, 20);
		add(sectionAaIdentificationLabel);

		p = new PanelDietaryPlazaHealthRow[24];
		for (int i = 0; i < 24; i++) {
			p[i] = new PanelDietaryPlazaHealthRow(i + 1);
			p[i].setBounds(0, 0 + (i * 35), 790, 35);
			panel.add(p[i]);
		}

		updateFields();
		updateData();
	}

	public void updateFields() {
		ResidentMain resmain = null;
		List physicianFormList = null;
		try {
			resmain = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);

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
				doct = physicianForm.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(physicianForm.getPhysicianId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (doct.getDoctorType().toString().equals("Physicians")) {
				txtPhysicianName.setText(doct.getPhysicianName());
				break;
			}
		}
		txtResidentName.setText(resmain.getUserName() + " "
				+ resmain.getUserPass());
		/* TODO: Migrating to room history */
		// txtRoomNo.setText(resmain.getRoom());
	}

	public int doSave() {

		DietaryPlazaHealth dpnf = new DietaryPlazaHealth();
		dpnf.setResidentId(Global.currentResidenceKey);
		dpnf.setSerial(Global.currentDietaryPlazaHealthKey);
		dpnf.setFormId(Global.currentDietaryCommunicationFormKey);
		dpnf.setResidentName(txtResidentName.getText() + "");
		dpnf.setRoomNo(txtRoomNo.getText() + "");
		try {
			Global.currentDietaryPlazaHealthKey = MedrexClientManager
					.getInstance().insertOrUpdateDietaryPlazaHealth(dpnf);
			rows = new ArrayList<DietaryPlazaHealthRow>();
			for (int i = 0; i < 24; i++) {
				p[i].doSave();
			}
			System.out.println("rows.size: " + rows.size());
			MedrexClientManager.getInstance()
					.insertOrUpdateDietaryPlazaHealthRows(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentDietaryPlazaHealthKey;
	}

	public void updateData() {
		System.out.println("vinod:======== 0000000000000");
		if (Global.currentDietaryPlazaHealthKey == 0) {
			rows = new ArrayList<DietaryPlazaHealthRow>();
		} else {
			DietaryPlazaHealth dpnf = null;
			try {
				dpnf = MedrexClientManager.getInstance().getDietaryPlazaHealth(
						Global.currentDietaryPlazaHealthKey);
				System.out.println("vinod:======== ");
				rows = MedrexClientManager.getInstance()
						.getDietaryPlazaHealthRow(
								Global.currentDietaryPlazaHealthKey);
				System.out.println("vinod:======== : " + rows.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
			txtResidentName.setText(dpnf.getResidentName());
		}

		for (int i = 0, j = 0; i < p.length; i++) {
			DietaryPlazaHealthRow r = null;
			if (rows.size() > 0 && j < rows.size()) {
				r = rows.get(j);
			}
			if (r != null) {
				if (i + 1 == r.getDietaryPlazaHealthRowSerial()) {
					p[i].updateData(r);
					j++;
				}
			} else {
				p[i].updateData(null);
			}
		}

	}

	public void doLoad() {
	}

	public void doUpdate() {
		// updateData();
		// System.out.println("========================");
	}

	public boolean doValidate() {
		return true;
	}

}

/*
 * public void updateData() {
 * 
 * ResidentMain rm = null;
 * 
 * try { rm =
 * MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
 * txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
 * txtRoomNo.setText(rm.getRoom());
 * 
 * } catch (Exception e) {
 * 
 * }
 * 
 * if (Global.currentDietaryPlazaHealthKey == 0) { } else { DietaryPlazaHealth
 * refDietaryPlazaHealth = null; try { refDietaryPlazaHealth =
 * MedrexClientManager.getInstance()
 * .getDietaryPlazaHealth(Global.currentDietaryPlazaHealthKey);
 * 
 * } catch (Exception e) { e.printStackTrace(); }
 * txtDiagnosis.setText(refDietaryPlazaHealth.getDiagnosis());
 * txtPhysicianName.setText(refDietaryPlazaHealth.getPhysicianName());
 * txtRoomNo.setText(refDietaryPlazaHealth.getRoomNo());
 * txtResidentName.setText(refDietaryPlazaHealth.getResidentName());
 * 
 * } for (int i = 0; i < 24; i++) { p[i].updateData(); }
 * 
 * }
 * 
 * public void doSave() {
 * 
 * DietaryPlazaHealth ps = new DietaryPlazaHealth();
 * ps.setSerial(Global.currentDietaryPlazaHealthKey);
 * ps.setResidentId(Global.currentResidenceKey);
 * 
 * try { MedrexClientManager.getInstance().insertOrUpdateDietaryPlazaHealth(ps);
 * } catch (Exception e) {
 * 
 * }
 * 
 * for (int i = 0; i < 24; i++) { p[i].doSave(); } }
 */

