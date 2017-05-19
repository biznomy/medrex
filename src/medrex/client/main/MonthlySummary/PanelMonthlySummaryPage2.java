package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage2;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.utils.SwingUtils;
import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryPage2 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5239586297400748987L;
	private JComboBox cmbNurse;
	private JTextArea txt17;
	private JTextArea txt16;
	private JTextArea txt15C;
	private JTextArea txt15B;
	private JTextArea txt14;
	private JTextArea txt15A;
	private JDateChooser dcMonthYear;
	private JTextField txtRoomNo;
	private JTextField txtResidentName;

	public PanelMonthlySummaryPage2() {
		super();
		Global.panelPainManagementMonthlySummarypage2 = this;
		setBackground(Color.WHITE);
		setLayout(null);
		// setBackground(Color.WHITE);
		setBounds(0, 0, 932, 817);
		setPreferredSize(new Dimension(900, 930));

		final JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		panel.setBounds(62, 30, 814, 37);
		add(panel);

		final JLabel painManagementMonthlyLabel = new JLabel();
		painManagementMonthlyLabel.setFont(new Font("Times New Roman",
				Font.BOLD, 26));
		painManagementMonthlyLabel.setText("Pain Management Monthly Summary");
		panel.add(painManagementMonthlyLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(62, 90, 831, 717);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 10, 811, 37);
		panel_1.add(panel_2);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name");
		residentNameLabel.setBounds(10, 10, 103, 16);
		panel_2.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(128, 8, 189, 20);
		panel_2.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room No");
		roomLabel.setBounds(345, 10, 66, 16);
		panel_2.add(roomLabel);

		txtRoomNo = new JTextField();
		txtRoomNo.setBounds(430, 8, 87, 20);
		panel_2.add(txtRoomNo);

		final JLabel monthYearLabel = new JLabel();
		monthYearLabel.setText("Month Year");
		monthYearLabel.setBounds(563, 10, 77, 16);
		panel_2.add(monthYearLabel);

		dcMonthYear = new JDateChooser();
		dcMonthYear.setBounds(662, 8, 139, 21);
		panel_2.add(dcMonthYear);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 60, 811, 646);
		panel_1.add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(1, 1, 405, 53);
		panel_3.add(panel_4);

		final JLabel whatIsTheLabel = new JLabel();
		whatIsTheLabel
				.setText("15 . What is the rate of pain after the pain medicine was given");
		whatIsTheLabel.setBounds(10, 10, 386, 34);
		panel_4.add(whatIsTheLabel);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setBounds(406, 1, 404, 53);
		panel_3.add(panel_4_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(2, 2, 400, 49);
		panel_4_1.add(scrollPane_1);

		txt15A = new JTextArea();
		scrollPane_1.setViewportView(txt15A);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(1, 54, 405, 83);
		panel_3.add(panel_4_2);

		final JLabel whatIsTheLabel_1 = new JLabel();
		whatIsTheLabel_1
				.setText("14 . Are There any cultural , ethnic or spiritual impacts on pain ");
		whatIsTheLabel_1.setBounds(10, 10, 386, 34);
		panel_4_2.add(whatIsTheLabel_1);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(406, 54, 404, 83);
		panel_3.add(panel_4_3);

		final JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(2, 2, 400, 80);
		panel_4_3.add(scrollPane_1_1);

		txt14 = new JTextArea();
		scrollPane_1_1.setViewportView(txt14);

		final JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBackground(Color.WHITE);
		panel_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setBounds(1, 137, 405, 83);
		panel_3.add(panel_4_2_1);

		final JLabel whatIsTheLabel_1_1 = new JLabel();
		whatIsTheLabel_1_1.setText("15. what is the location of your pain");
		whatIsTheLabel_1_1.setBounds(10, 10, 386, 34);
		panel_4_2_1.add(whatIsTheLabel_1_1);

		final JPanel panel_4_3_1 = new JPanel();
		panel_4_3_1.setBackground(Color.WHITE);
		panel_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1.setLayout(null);
		panel_4_3_1.setBounds(406, 137, 404, 83);
		panel_3.add(panel_4_3_1);

		final JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(2, 2, 400, 80);
		panel_4_3_1.add(scrollPane_1_2);

		txt15B = new JTextArea();
		scrollPane_1_2.setViewportView(txt15B);

		final JPanel panel_4_2_1_1 = new JPanel();
		panel_4_2_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1.setLayout(null);
		panel_4_2_1_1.setBounds(1, 220, 405, 106);
		panel_3.add(panel_4_2_1_1);

		final JLabel whatIsTheLabel_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_1
				.setText("15. what are the causative factors of your pain");
		whatIsTheLabel_1_1_1.setBounds(10, 10, 386, 29);
		panel_4_2_1_1.add(whatIsTheLabel_1_1_1);

		final JLabel diagnosisPainfulLabel = new JLabel();
		diagnosisPainfulLabel
				.setText("Diagnosis , painful condition , painful treatments");
		diagnosisPainfulLabel.setBounds(10, 38, 386, 21);
		panel_4_2_1_1.add(diagnosisPainfulLabel);

		final JLabel othersLabel = new JLabel();
		othersLabel.setText("Others");
		othersLabel.setBounds(10, 65, 279, 14);
		panel_4_2_1_1.add(othersLabel);

		final JPanel panel_4_3_1_1 = new JPanel();
		panel_4_3_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1.setLayout(null);
		panel_4_3_1_1.setBounds(406, 220, 404, 106);
		panel_3.add(panel_4_3_1_1);

		final JScrollPane scrollPane_1_3 = new JScrollPane();
		scrollPane_1_3.setBounds(2, 2, 400, 104);
		panel_4_3_1_1.add(scrollPane_1_3);

		txt15C = new JTextArea();
		scrollPane_1_3.setViewportView(txt15C);

		final JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4.setLayout(null);
		panel_4_4.setBounds(1, 326, 405, 54);
		panel_3.add(panel_4_4);

		final JLabel whatIsTheLabel_2 = new JLabel();
		whatIsTheLabel_2
				.setText("Are There any non pharmacologic interventions used to relieve pain");
		whatIsTheLabel_2.setBounds(10, 10, 386, 34);
		panel_4_4.add(whatIsTheLabel_2);

		final JPanel panel_4_3_1_1_1 = new JPanel();
		panel_4_3_1_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1_1.setLayout(null);
		panel_4_3_1_1_1.setBounds(406, 326, 404, 54);
		panel_3.add(panel_4_3_1_1_1);

		final JScrollPane scrollPane_1_4 = new JScrollPane();
		scrollPane_1_4.setBounds(2, 1, 400, 52);
		panel_4_3_1_1_1.add(scrollPane_1_4);

		txt16 = new JTextArea();
		scrollPane_1_4.setViewportView(txt16);

		final JPanel panel_4_2_1_1_1 = new JPanel();
		panel_4_2_1_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1_1.setLayout(null);
		panel_4_2_1_1_1.setBounds(1, 380, 405, 182);
		panel_3.add(panel_4_2_1_1_1);

		final JLabel whatIsTheLabel_1_1_1_1 = new JLabel();
		whatIsTheLabel_1_1_1_1.setText("Outcome");
		whatIsTheLabel_1_1_1_1.setBounds(10, 10, 386, 29);
		panel_4_2_1_1_1.add(whatIsTheLabel_1_1_1_1);

		final JLabel diagnosisPainfulLabel_1 = new JLabel();
		diagnosisPainfulLabel_1
				.setText("(A) Mild , Occasional , well Controlled pain");
		diagnosisPainfulLabel_1.setBounds(10, 38, 386, 21);
		panel_4_2_1_1_1.add(diagnosisPainfulLabel_1);

		final JLabel othersLabel_1 = new JLabel();
		othersLabel_1.setText("Follow up quarterly as needed");
		othersLabel_1.setBounds(28, 65, 269, 14);
		panel_4_2_1_1_1.add(othersLabel_1);

		final JLabel diagnosisPainfulLabel_1_1 = new JLabel();
		diagnosisPainfulLabel_1_1
				.setText("(B) Objective or subjective indications that");
		diagnosisPainfulLabel_1_1.setBounds(10, 101, 386, 21);
		panel_4_2_1_1_1.add(diagnosisPainfulLabel_1_1);

		final JLabel othersLabel_1_1 = new JLabel();
		othersLabel_1_1.setText("Pain is not controlled , proceed with");
		othersLabel_1_1.setBounds(28, 132, 269, 14);
		panel_4_2_1_1_1.add(othersLabel_1_1);

		final JLabel othersLabel_1_1_1 = new JLabel();
		othersLabel_1_1_1.setText("assessment and care planning");
		othersLabel_1_1_1.setBounds(28, 158, 269, 14);
		panel_4_2_1_1_1.add(othersLabel_1_1_1);

		final JPanel panel_4_2_1_1_1_1 = new JPanel();
		panel_4_2_1_1_1_1.setBackground(Color.WHITE);
		panel_4_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_1_1_1.setLayout(null);
		panel_4_2_1_1_1_1.setBounds(406, 380, 404, 182);
		panel_3.add(panel_4_2_1_1_1_1);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(2, 2, 400, 178);
		panel_4_2_1_1_1_1.add(scrollPane);

		txt17 = new JTextArea();
		scrollPane.setViewportView(txt17);

		final JPanel panel_4_2_1_2 = new JPanel();
		panel_4_2_1_2.setBackground(Color.WHITE);
		panel_4_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1_2.setLayout(null);
		panel_4_2_1_2.setBounds(1, 562, 405, 83);
		panel_3.add(panel_4_2_1_2);

		final JLabel whatIsTheLabel_1_1_2 = new JLabel();
		whatIsTheLabel_1_1_2.setText("Nurse Signature");
		whatIsTheLabel_1_1_2.setBounds(10, 10, 386, 34);
		panel_4_2_1_2.add(whatIsTheLabel_1_1_2);

		final JPanel panel_4_3_1_1_1_1 = new JPanel();
		panel_4_3_1_1_1_1.setBackground(Color.WHITE);
		panel_4_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1_1_1_1.setLayout(null);
		panel_4_3_1_1_1_1.setBounds(406, 562, 404, 83);
		panel_3.add(panel_4_3_1_1_1_1);

		cmbNurse = new JComboBox();
		cmbNurse.setBackground(Color.WHITE);
		cmbNurse.setBounds(52, 21, 245, 21);
		panel_4_3_1_1_1_1.add(cmbNurse);
		updateData();
	}

	public static void main(String args[]) {
		SwingUtils.wrapInFrame(new PanelMonthlySummaryPage2()).setVisible(true);
	}

	public void doLoad() {

	}

	public void doUpdate() {

		// updateData();
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

	public int doSave() {

		MonthlySummaryPage2 refMonthlySummaryPage2 = new MonthlySummaryPage2();
		MonthlySummaryRecord msr = null;
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		refMonthlySummaryPage2.setFormId(msr);
		refMonthlySummaryPage2.setSerial(Global.currentMonthlySummaryPage2Key);
		refMonthlySummaryPage2.setResidentId(Global.currentResidenceKey);
		refMonthlySummaryPage2.setNurseSignature((String) cmbNurse
				.getSelectedItem());
		refMonthlySummaryPage2.setComment17(txt17.getText());
		refMonthlySummaryPage2.setComment16(txt16.getText());
		refMonthlySummaryPage2.setComment15C(txt15C.getText());
		refMonthlySummaryPage2.setComment15B(txt15B.getText());
		refMonthlySummaryPage2.setComment14(txt14.getText());
		refMonthlySummaryPage2.setComment15A(txt15A.getText());
		refMonthlySummaryPage2.setMonthYear(dcMonthYear.getDate());
		refMonthlySummaryPage2.setRoomNo(txtRoomNo.getText());
		refMonthlySummaryPage2.setResidentName(txtResidentName.getText());

		try {
			Global.currentMonthlySummaryPage2Key = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryPage2(
							refMonthlySummaryPage2);
			return Global.currentMonthlySummaryPage2Key;
		} catch (Exception e) {
		}
		return 0;
	}

	public void updateData() {
		List<Nurse> nurList = null;
		try {
			nurList = MedrexClientManager.getInstance().getNurseRecords();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		Iterator<Nurse> i = nurList.iterator();
		while (i.hasNext()) {
			Nurse nur = i.next();
			cmbNurse
					.addItem(nur.getNurseSurName() + " , " + nur.getNurseName());
		}
		MonthlySummaryPage2 refMonthlySummaryPage2 = null;
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryPage2Key != 0) {
			try {
				MonthlySummaryRecord msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryPage2 = MedrexClientManager.getInstance()
						.getMonthlySummaryPage2(msr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			cmbNurse
					.setSelectedItem(refMonthlySummaryPage2.getNurseSignature());
			txt17.setText(refMonthlySummaryPage2.getComment17());
			txt16.setText(refMonthlySummaryPage2.getComment16());
			txt15C.setText(refMonthlySummaryPage2.getComment15C());
			txt15B.setText(refMonthlySummaryPage2.getComment15B());
			txt14.setText(refMonthlySummaryPage2.getComment14());
			txt15A.setText(refMonthlySummaryPage2.getComment15A());
			dcMonthYear.setDate(refMonthlySummaryPage2.getMonthYear());
			txtRoomNo.setText(refMonthlySummaryPage2.getRoomNo());
			txtResidentName.setText(refMonthlySummaryPage2.getResidentName());
			Global.currentMonthlySummaryPage2Key = refMonthlySummaryPage2
					.getSerial();
		} else {
			Global.currentMonthlySummaryPage2Key = 0;
			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
				if (rm != null) {
					txtResidentName.setText(rm.getUserPass() + " , "
							+ rm.getUserName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
