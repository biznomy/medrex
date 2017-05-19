package medrex.client.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage9;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.notes.JxNotes;

public class PanelResidentQuarterlyAssessmentFormPage9 extends JPanel implements
		Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5048409844092391291L;
	private JxNotes txtAreaForuth;
	private JxNotes txtAreaThird;
	private JxNotes txtAreaSecond;
	private JxNotes txtAreaFirst;
	private Notes notestxtAreaFirst;
	private Notes notestxtAreaSecond;
	private Notes notestxtAreaThird;
	private Notes notestxtAreaForuth;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentQuarterlyAssessmentFormPage9() {
		super();
		setPreferredSize(new Dimension(830, 610));
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 820, 604);
		add(panel);

		final JLabel sideRailQuarterlyLabel = new JLabel();
		sideRailQuarterlyLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		sideRailQuarterlyLabel.setBounds(292, 0, 332, 33);
		sideRailQuarterlyLabel
				.setText("<html><u>SIDE RAIL QUARTERLY REVIEW</u><html>");
		panel.add(sideRailQuarterlyLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 39, 810, 135);
		panel.add(panel_1);

		final JLabel firstQuarterLabel = new JLabel();
		firstQuarterLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		firstQuarterLabel.setText("<HTML><U>FIRST QUARTER</U></HTML>");
		firstQuarterLabel.setBounds(10, 10, 147, 20);
		panel_1.add(firstQuarterLabel);

		// JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(10, 36, 800, 93);
		// panel_1.add(scrollPane);

		notestxtAreaFirst = new Notes();
		notestxtAreaFirst.setFormName("Resident Quarterly Assessment Form");
		notestxtAreaFirst.setUserId(Global.currentLoggedInUserKey);

		txtAreaFirst = new JxNotes(isCategories);
		txtAreaFirst.setNotes(notestxtAreaFirst);
		txtAreaFirst.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaFirst.setBounds(10, 36, 800, 93);
		panel_1.add(txtAreaFirst);
		// scrollPane.setViewportView(txtAreaFirst);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 180, 810, 135);
		panel.add(panel_1_1);

		final JLabel firstQuarterLabel_1 = new JLabel();
		firstQuarterLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		firstQuarterLabel_1.setText("<HTML><U>SECOND QUARTER</U></HTML>");
		firstQuarterLabel_1.setBounds(10, 10, 164, 20);
		panel_1_1.add(firstQuarterLabel_1);

		// JScrollPane scrollPane2 = new JScrollPane();
		// scrollPane2.setBounds(10, 36, 800, 95);
		// panel_1_1.add(scrollPane2);
		notestxtAreaSecond = new Notes();
		notestxtAreaSecond.setFormName("Resident Quarterly Assessment Form");
		notestxtAreaSecond.setUserId(Global.currentLoggedInUserKey);

		txtAreaSecond = new JxNotes(isCategories);
		txtAreaSecond.setNotes(notestxtAreaSecond);
		txtAreaSecond.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaSecond.setBounds(10, 36, 800, 93);
		panel_1_1.add(txtAreaSecond);
		// scrollPane2.setViewportView(txtAreaSecond);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 321, 810, 135);
		panel.add(panel_1_2);

		final JLabel firstQuarterLabel_2 = new JLabel();
		firstQuarterLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		firstQuarterLabel_2.setText("<HTML><U>THIRD QUARTER</U></HTML>");
		firstQuarterLabel_2.setBounds(10, 10, 147, 20);
		panel_1_2.add(firstQuarterLabel_2);

		// JScrollPane scrollPane3 = new JScrollPane();
		// scrollPane3.setBounds(10, 36, 800, 95);
		// panel_1_2.add(scrollPane3);

		notestxtAreaThird = new Notes();
		notestxtAreaThird.setFormName("Resident Quarterly Assessment Form");
		notestxtAreaThird.setUserId(Global.currentLoggedInUserKey);

		txtAreaThird = new JxNotes(isCategories);
		txtAreaThird.setNotes(notestxtAreaThird);
		txtAreaThird.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaThird.setBounds(10, 36, 800, 93);
		panel_1_2.add(txtAreaThird);
		// scrollPane3.setViewportView(txtAreaThird);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(10, 462, 810, 135);
		panel.add(panel_1_3);

		final JLabel firstQuarterLabel_3 = new JLabel();
		firstQuarterLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		firstQuarterLabel_3.setText("<HTML><U>FOURTH QUARTER</U></HTML>");
		firstQuarterLabel_3.setBounds(10, 10, 168, 20);
		panel_1_3.add(firstQuarterLabel_3);

		// JScrollPane scrollPane4 = new JScrollPane();
		// scrollPane4.setBounds(10, 36, 800, 95);
		// panel_1_3.add(scrollPane4);

		notestxtAreaForuth = new Notes();
		notestxtAreaForuth.setFormName("Resident Quarterly Assessment Form");
		notestxtAreaForuth.setUserId(Global.currentLoggedInUserKey);

		txtAreaForuth = new JxNotes(isCategories);
		txtAreaForuth.setNotes(notestxtAreaForuth);
		txtAreaForuth.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaForuth.setBounds(10, 36, 800, 93);
		panel_1_3.add(txtAreaForuth);
		// scrollPane4.setViewportView(txtAreaForuth);
		// doLoad();
	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {
		ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9 = new ResidentQuarterlyAssessmentFormPage9();
		residentQuarterlyAssessmentFormPage9
				.setSerial(Global.currentResidentQuarterlyAssessmentFormPage9);
		residentQuarterlyAssessmentFormPage9
				.setFormId(Global.currentResidentAssessmentFormKey);
		residentQuarterlyAssessmentFormPage9.setFirstQuarter(txtAreaFirst
				.getNotes());
		residentQuarterlyAssessmentFormPage9.setSecondQuarter(txtAreaSecond
				.getNotes());
		residentQuarterlyAssessmentFormPage9.setThirdQuarter(txtAreaThird
				.getNotes());
		residentQuarterlyAssessmentFormPage9.setFourthQuarter(txtAreaForuth
				.getNotes());
		try {
			Global.currentResidentQuarterlyAssessmentFormPage9 = MedrexClientManager
					.getInstance()
					.insertOrUpdateResidentQuarterlyAssessmentFormPage9(
							residentQuarterlyAssessmentFormPage9);

			// for sending trigger word message
			String str = null;
			str = txtAreaFirst.getTriggerWord();
			if (str == null) {
				str = txtAreaSecond.getTriggerWord();
			} else {
				str += txtAreaSecond.getTriggerWord();
			}
			if (str == null) {
				str = txtAreaThird.getTriggerWord();
			} else {
				str += txtAreaThird.getTriggerWord();
			}
			if (str == null) {
				str = txtAreaForuth.getTriggerWord();
			} else {
				str += txtAreaForuth.getTriggerWord();
			}

			if (str != null) {
				txtAreaForuth.sendMail(str);
			}

			return (Global.currentResidentQuarterlyAssessmentFormPage9);
		} catch (Exception e) {
			return 0;
		}

	}

	public void doUpdate() {
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentQuarterlyAssessmentFormPage9 = 0;
			txtAreaFirst.setNotes(notestxtAreaFirst);
			txtAreaSecond.setNotes(notestxtAreaSecond);
			txtAreaThird.setNotes(notestxtAreaThird);
			txtAreaForuth.setNotes(notestxtAreaForuth);
		} else {
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9 = null;
			try {
				residentQuarterlyAssessmentFormPage9 = MedrexClientManager
						.getInstance().getResidentQuarterlyAssessmentFormPage9(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			if (residentQuarterlyAssessmentFormPage9 != null) {
				txtAreaFirst.setNotes(residentQuarterlyAssessmentFormPage9
						.getFirstQuarter());
				txtAreaSecond.setNotes(residentQuarterlyAssessmentFormPage9
						.getSecondQuarter());
				txtAreaThird.setNotes(residentQuarterlyAssessmentFormPage9
						.getThirdQuarter());
				txtAreaForuth.setNotes(residentQuarterlyAssessmentFormPage9
						.getFourthQuarter());
			}

		}
	}

	public boolean doValidate() {

		return false;
	}

}
