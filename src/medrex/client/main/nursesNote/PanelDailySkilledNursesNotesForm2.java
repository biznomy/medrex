package medrex.client.main.nursesNote;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.intf.Form;
import medrex.commons.vo.medication.DailySkilledNursesNotesForm2;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;
import medrex.commons.vo.resident.ResidentMain;

public class PanelDailySkilledNursesNotesForm2 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -187654257508267627L;
	private JCheckBox cbMechanicallyShift3;
	private JCheckBox cbManuallyShift3;
	private JCheckBox cbSlideBoardShift3;
	private JCheckBox cbCaneShift3;
	private JCheckBox cbWalkerShift3;
	private JCheckBox cbMechanicallyShift2;
	private JCheckBox cbManuallyShift2;
	private JCheckBox cbSlideBoardShift2;
	private JCheckBox cbCaneShift2;
	private JCheckBox cbWalkerShift2;
	private JCheckBox cbMechanicallyShift1;
	private JCheckBox cbManuallyShift1;
	private JCheckBox cbSlideBoardShift1;
	private JCheckBox cbCaneShift1;
	private JCheckBox cbWalkerShift1;
	private JComboBox cmbSupportShift3WCAmbulation;
	private JComboBox cmbSupportShift3Ambulation;
	private JComboBox cmbSupportShift3ToiletUse;
	private JComboBox cmbSupportShift3Bathing;
	private JComboBox cmbSupportShift3Hygiene;
	private JComboBox cmbSupportShift3Eating;
	private JComboBox cmbSelfShift3WCAmbulation;
	private JComboBox cmbSelfShift3Ambulation;
	private JComboBox cmbSelfShift3ToiletUse;
	private JComboBox cmbSelfShift3Bathing;
	private JComboBox cmbSelfShift3Hygiene;
	private JComboBox cmbSelfShift3Eating;
	private JComboBox cmbSupportShift3Dressing;
	private JComboBox cmbSelfShift3Dressing;
	private JComboBox cmbSupportShift3Transfer;
	private JComboBox cmbSelfShift3Transfer;
	private JComboBox cmbSupportShift3Mobility;
	private JComboBox cmbSelfShift3Mobility;
	private JComboBox cmbSupportShift2WCAmbulation;
	private JComboBox cmbSupportShift2Ambulation;
	private JComboBox cmbSupportShift2ToiletUse;
	private JComboBox cmbSupportShift2Bathing;
	private JComboBox cmbSupportShift2Hygiene;
	private JComboBox cmbSupportShift2Eating;
	private JComboBox cmbSupportShift2Dressing;
	private JComboBox cmbSupportShift2Transfer;
	private JComboBox cmbSupportShift2Mobility;
	private JComboBox cmbSelfShift2WCAmbulation;
	private JComboBox cmbSelfShift2Ambulation;
	private JComboBox cmbSelfShift2ToiletUse;
	private JComboBox cmbSelfShift2Bathing;
	private JComboBox cmbSelfShift2Hygiene;
	private JComboBox cmbSelfShift2Eating;
	private JComboBox cmbSelfShift2Dressing;
	private JComboBox cmbSelfShift2Transfer;
	private JComboBox cmbSelfShift2Mobility;
	private JComboBox cmbSupportShift1WCAmbulation;
	private JComboBox cmbSupportShift1Ambulation;
	private JComboBox cmbSupportShift1ToiletUse;
	private JComboBox cmbSupportShift1Bathing;
	private JComboBox cmbSupportShift1Hygiene;
	private JComboBox cmbSupportShift1Eating;
	private JComboBox cmbSupportShift1Dressing;
	private JComboBox cmbSupportShift1Transfer;
	private JComboBox cmbSelfShift1WCAmbulation;
	private JComboBox cmbSelfShift1Ambulation;
	private JComboBox cmbSelfShift1ToiletUse;
	private JComboBox cmbSelfShift1Bathing;
	private JComboBox cmbSelfShift1Hygiene;
	private JComboBox cmbSelfShift1Eating;
	private JComboBox cmbSelfShift1Dressing;
	private JComboBox cmbSelfShift1Transfer;
	private JComboBox cmbSupportShift1Mobility;
	private JComboBox cmbSelfShift1Mobility;

	// ---copied

	// ----copied

	private JTextField txtRoomBed;
	private JTextField txtAttendingPhysician;
	private JTextField txtMiddleName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private PanelDailySkilledNursesNotesRow[] panelRows;
	private JPanel CommentPanel;

	// ---copied
	List<DailySkilledNursesNotesRow> rows;
	int key;

	public PanelDailySkilledNursesNotesForm2() {
		super();

		Global.panelDailySkilledNursesNotesForm2 = this;
		rows = new ArrayList<DailySkilledNursesNotesRow>();
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0, 0, 1143, 1036);
		setPreferredSize(new Dimension(1143, 1036));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 1122, 43);
		add(panel);

		final JLabel dailySkilledNursesLabel = new JLabel();
		dailySkilledNursesLabel.setFont(new Font("", Font.BOLD, 24));
		dailySkilledNursesLabel.setText("Daily Skilled Nurses Notes");
		dailySkilledNursesLabel.setBounds(384, 0, 327, 43);
		panel.add(dailySkilledNursesLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 75, 1122, 25);
		add(panel_1);

		final JLabel label = new JLabel();
		label.setText("(0)Independent");
		label.setBounds(10, 5, 180, 15);
		panel_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("(1)Supervision");
		label_1.setBounds(175, 5, 127, 15);
		panel_1.add(label_1);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setText("(2)Limited Assistance");
		label_1_1.setBounds(346, 5, 155, 15);
		panel_1.add(label_1_1);

		final JLabel label_1_1_1 = new JLabel();
		label_1_1_1.setText("(3)Extensive Assistance");
		label_1_1_1.setBounds(548, 5, 155, 15);
		panel_1.add(label_1_1_1);

		final JLabel label_1_1_1_1 = new JLabel();
		label_1_1_1_1.setText("(4)Total Dependence");
		label_1_1_1_1.setBounds(753, 5, 155, 15);
		panel_1.add(label_1_1_1_1);

		final JLabel labelActivity = new JLabel();
		labelActivity.setText("(8) Activity Did Not Occur");
		labelActivity.setBounds(945, 5, 155, 15);
		panel_1.add(labelActivity);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 125, 1122, 25);
		add(panel_1_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("(0)No Setup");
		label_2.setBounds(10, 5, 138, 15);
		panel_1_1.add(label_2);

		final JLabel label_1_2 = new JLabel();
		label_1_2.setText("(1)Setup Help Only");
		label_1_2.setBounds(174, 5, 127, 15);
		panel_1_1.add(label_1_2);

		final JLabel label_1_1_2 = new JLabel();
		label_1_1_2.setText("(2)1 Person Physical Assost");
		label_1_1_2.setBounds(346, 5, 155, 15);
		panel_1_1.add(label_1_1_2);

		final JLabel label_1_1_1_2 = new JLabel();
		label_1_1_1_2.setText("(3)2+Person Physical Assist");
		label_1_1_1_2.setBounds(548, 5, 155, 15);
		panel_1_1.add(label_1_1_1_2);

		final JLabel label_1_1_1_1_1 = new JLabel();
		label_1_1_1_1_1.setText("(8)Activity Did Not Occur");
		label_1_1_1_1_1.setBounds(753, 5, 155, 15);
		panel_1_1.add(label_1_1_1_1_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 100, 214, 25);
		add(panel_2);

		final JLabel supportCodesLabel = new JLabel();
		supportCodesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		supportCodesLabel.setText("SUPPORT CODES");
		supportCodesLabel.setBounds(10, 5, 121, 14);
		panel_2.add(supportCodesLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 54, 214, 20);
		add(panel_2_1);

		final JLabel supportCodesLabel_1 = new JLabel();
		supportCodesLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		supportCodesLabel_1.setText("SELF PERFORMANCE CODES");
		supportCodesLabel_1.setBounds(10, 5, 172, 14);
		panel_2_1.add(supportCodesLabel_1);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 156, 1122, 280);
		add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 374, 280);
		panel_3.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 374, 20);
		panel_4.add(panel_5);

		final JLabel shift711Label = new JLabel();
		shift711Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		shift711Label.setText("Shift 7-11");
		shift711Label.setBounds(155, 5, 70, 14);
		panel_5.add(shift711Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 20, 200, 40);
		panel_4.add(panel_6);

		final JLabel physicalFunctioningLabel = new JLabel();
		physicalFunctioningLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicalFunctioningLabel.setText("Physical Functioning");
		physicalFunctioningLabel.setBounds(10, 0, 180, 30);
		panel_6.add(physicalFunctioningLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 60, 200, 20);
		panel_4.add(panel_5_1);

		final JLabel shift711Label_1 = new JLabel();
		shift711Label_1.setText("Bed Moboility");
		shift711Label_1.setBounds(10, 0, 70, 14);
		panel_5_1.add(shift711Label_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(0, 80, 200, 20);
		panel_4.add(panel_5_2);

		final JLabel shift711Label_2 = new JLabel();
		shift711Label_2.setText("Transfer");
		shift711Label_2.setBounds(10, 0, 70, 14);
		panel_5_2.add(shift711Label_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(200, 20, 80, 40);
		panel_4.add(panel_7);

		final JLabel selfper = new JLabel();
		selfper.setFont(new Font("Tahoma", Font.BOLD, 12));
		selfper.setText("Self Perf");
		selfper.setBounds(10, 0, 60, 30);
		panel_7.add(selfper);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(280, 20, 94, 40);
		panel_4.add(panel_7_1);

		final JLabel supportLabel = new JLabel();
		supportLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		supportLabel.setText("Support");
		supportLabel.setBounds(27, 10, 57, 14);
		panel_7_1.add(supportLabel);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(200, 60, 80, 20);
		panel_4.add(panel_7_2);

		cmbSelfShift1Mobility = new JComboBox();
		cmbSelfShift1Mobility.setBackground(Color.WHITE);
		cmbSelfShift1Mobility.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Mobility.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Mobility.setBounds(0, 0, 80, 21);
		panel_7_2.add(cmbSelfShift1Mobility);

		final JPanel panel_7_3 = new JPanel();
		panel_7_3.setBackground(Color.WHITE);
		panel_7_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3.setLayout(null);
		panel_7_3.setBounds(280, 60, 94, 20);
		panel_4.add(panel_7_3);

		cmbSupportShift1Mobility = new JComboBox();
		cmbSupportShift1Mobility.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Mobility
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Mobility.setBackground(Color.WHITE);
		cmbSupportShift1Mobility.setBounds(0, 0, 94, 20);
		panel_7_3.add(cmbSupportShift1Mobility);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setBackground(Color.WHITE);
		panel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(200, 80, 80, 20);
		panel_4.add(panel_7_2_1);

		cmbSelfShift1Transfer = new JComboBox();
		cmbSelfShift1Transfer.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Transfer.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Transfer.setBackground(Color.WHITE);
		cmbSelfShift1Transfer.setBounds(0, 0, 80, 21);
		panel_7_2_1.add(cmbSelfShift1Transfer);

		final JPanel panel_7_3_1 = new JPanel();
		panel_7_3_1.setBackground(Color.WHITE);
		panel_7_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1.setLayout(null);
		panel_7_3_1.setBounds(280, 80, 94, 20);
		panel_4.add(panel_7_3_1);

		cmbSupportShift1Transfer = new JComboBox();
		cmbSupportShift1Transfer.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Transfer.setBackground(Color.WHITE);
		cmbSupportShift1Transfer
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Transfer.setBounds(0, 0, 94, 20);
		panel_7_3_1.add(cmbSupportShift1Transfer);

		final JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setBackground(Color.WHITE);
		panel_5_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBounds(0, 100, 200, 20);
		panel_4.add(panel_5_2_1);

		final JLabel shift711Label_2_1 = new JLabel();
		shift711Label_2_1.setText("Dressing");
		shift711Label_2_1.setBounds(10, 0, 70, 14);
		panel_5_2_1.add(shift711Label_2_1);

		final JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBounds(200, 100, 80, 20);
		panel_4.add(panel_7_2_1_1);

		cmbSelfShift1Dressing = new JComboBox();
		cmbSelfShift1Dressing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Dressing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Dressing.setBackground(Color.WHITE);
		cmbSelfShift1Dressing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1.add(cmbSelfShift1Dressing);

		final JPanel panel_7_3_1_1 = new JPanel();
		panel_7_3_1_1.setBackground(Color.WHITE);
		panel_7_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1.setLayout(null);
		panel_7_3_1_1.setBounds(280, 100, 94, 20);
		panel_4.add(panel_7_3_1_1);

		cmbSupportShift1Dressing = new JComboBox();
		cmbSupportShift1Dressing.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Dressing.setBackground(Color.WHITE);
		cmbSupportShift1Dressing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Dressing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1.add(cmbSupportShift1Dressing);

		final JPanel panel_5_2_1_1 = new JPanel();
		panel_5_2_1_1.setBackground(Color.WHITE);
		panel_5_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_1.setLayout(null);
		panel_5_2_1_1.setBounds(0, 120, 200, 20);
		panel_4.add(panel_5_2_1_1);

		final JLabel shift711Label_2_1_1 = new JLabel();
		shift711Label_2_1_1.setText("Eating");
		shift711Label_2_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_1.add(shift711Label_2_1_1);

		final JPanel panel_5_2_1_2 = new JPanel();
		panel_5_2_1_2.setBackground(Color.WHITE);
		panel_5_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_2.setLayout(null);
		panel_5_2_1_2.setBounds(0, 140, 200, 20);
		panel_4.add(panel_5_2_1_2);

		final JLabel shift711Label_2_1_2 = new JLabel();
		shift711Label_2_1_2.setText("Hygiene");
		shift711Label_2_1_2.setBounds(10, 0, 70, 14);
		panel_5_2_1_2.add(shift711Label_2_1_2);

		final JPanel panel_5_2_1_3 = new JPanel();
		panel_5_2_1_3.setBackground(Color.WHITE);
		panel_5_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_3.setLayout(null);
		panel_5_2_1_3.setBounds(0, 160, 200, 20);
		panel_4.add(panel_5_2_1_3);

		final JLabel shift711Label_2_1_3 = new JLabel();
		shift711Label_2_1_3.setText("Bathing");
		shift711Label_2_1_3.setBounds(10, 0, 70, 14);
		panel_5_2_1_3.add(shift711Label_2_1_3);

		final JPanel panel_5_2_1_4 = new JPanel();
		panel_5_2_1_4.setBackground(Color.WHITE);
		panel_5_2_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_4.setLayout(null);
		panel_5_2_1_4.setBounds(0, 180, 200, 20);
		panel_4.add(panel_5_2_1_4);

		final JLabel shift711Label_2_1_4 = new JLabel();
		shift711Label_2_1_4.setText("Toilet Use");
		shift711Label_2_1_4.setBounds(10, 0, 70, 14);
		panel_5_2_1_4.add(shift711Label_2_1_4);

		final JPanel panel_5_2_1_5 = new JPanel();
		panel_5_2_1_5.setBackground(Color.WHITE);
		panel_5_2_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_5.setLayout(null);
		panel_5_2_1_5.setBounds(0, 200, 200, 20);
		panel_4.add(panel_5_2_1_5);

		final JLabel shift711Label_2_1_5 = new JLabel();
		shift711Label_2_1_5.setText("Ambulation");
		shift711Label_2_1_5.setBounds(10, 0, 70, 14);
		panel_5_2_1_5.add(shift711Label_2_1_5);

		final JPanel panel_5_2_1_6 = new JPanel();
		panel_5_2_1_6.setBackground(Color.WHITE);
		panel_5_2_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_6.setLayout(null);
		panel_5_2_1_6.setBounds(0, 220, 200, 20);
		panel_4.add(panel_5_2_1_6);

		final JLabel shift711Label_2_1_6 = new JLabel();
		shift711Label_2_1_6.setText("W / C Ambulation");
		shift711Label_2_1_6.setBounds(10, 0, 113, 14);
		panel_5_2_1_6.add(shift711Label_2_1_6);

		final JPanel panel_5_2_1_7 = new JPanel();
		panel_5_2_1_7.setBackground(Color.WHITE);
		panel_5_2_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_7.setLayout(null);
		panel_5_2_1_7.setBounds(0, 240, 374, 20);
		panel_4.add(panel_5_2_1_7);

		cbWalkerShift1 = new JCheckBox();
		cbWalkerShift1.setBackground(Color.WHITE);
		cbWalkerShift1.setText("Walker");
		cbWalkerShift1.setBounds(1, 2, 80, 17);
		panel_5_2_1_7.add(cbWalkerShift1);

		cbCaneShift1 = new JCheckBox();
		cbCaneShift1.setBackground(Color.WHITE);
		cbCaneShift1.setText("Cane");
		cbCaneShift1.setBounds(97, 2, 80, 17);
		panel_5_2_1_7.add(cbCaneShift1);

		cbSlideBoardShift1 = new JCheckBox();
		cbSlideBoardShift1.setBackground(Color.WHITE);
		cbSlideBoardShift1.setText("SlideBoard");
		cbSlideBoardShift1.setBounds(194, 2, 80, 17);
		panel_5_2_1_7.add(cbSlideBoardShift1);

		final JPanel panel_5_2_1_8 = new JPanel();
		panel_5_2_1_8.setBackground(Color.WHITE);
		panel_5_2_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_8.setLayout(null);
		panel_5_2_1_8.setBounds(0, 260, 374, 20);
		panel_4.add(panel_5_2_1_8);

		final JLabel shift711Label_2_1_8 = new JLabel();
		shift711Label_2_1_8.setText("Transferred");
		shift711Label_2_1_8.setBounds(10, 2, 70, 14);
		panel_5_2_1_8.add(shift711Label_2_1_8);

		cbManuallyShift1 = new JCheckBox();
		cbManuallyShift1.setBackground(Color.WHITE);
		cbManuallyShift1.setText("Manually");
		cbManuallyShift1.setBounds(97, 2, 80, 17);
		panel_5_2_1_8.add(cbManuallyShift1);

		cbMechanicallyShift1 = new JCheckBox();
		cbMechanicallyShift1.setBackground(Color.WHITE);
		cbMechanicallyShift1.setText("Mechanically");
		cbMechanicallyShift1.setBounds(194, 2, 110, 17);
		panel_5_2_1_8.add(cbMechanicallyShift1);

		final JPanel panel_7_2_1_1_1 = new JPanel();
		panel_7_2_1_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_1.setLayout(null);
		panel_7_2_1_1_1.setBounds(200, 120, 80, 20);
		panel_4.add(panel_7_2_1_1_1);

		cmbSelfShift1Eating = new JComboBox();
		cmbSelfShift1Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Eating.setBackground(Color.WHITE);
		cmbSelfShift1Eating.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_1.add(cmbSelfShift1Eating);

		final JPanel panel_7_2_1_1_2 = new JPanel();
		panel_7_2_1_1_2.setBackground(Color.WHITE);
		panel_7_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_2.setLayout(null);
		panel_7_2_1_1_2.setBounds(200, 140, 80, 20);
		panel_4.add(panel_7_2_1_1_2);

		cmbSelfShift1Hygiene = new JComboBox();
		cmbSelfShift1Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Hygiene.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Hygiene.setBackground(Color.WHITE);
		cmbSelfShift1Hygiene.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_2.add(cmbSelfShift1Hygiene);

		final JPanel panel_7_2_1_1_3 = new JPanel();
		panel_7_2_1_1_3.setBackground(Color.WHITE);
		panel_7_2_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_3.setLayout(null);
		panel_7_2_1_1_3.setBounds(200, 160, 80, 20);
		panel_4.add(panel_7_2_1_1_3);

		cmbSelfShift1Bathing = new JComboBox();
		cmbSelfShift1Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Bathing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Bathing.setBackground(Color.WHITE);
		cmbSelfShift1Bathing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_3.add(cmbSelfShift1Bathing);

		final JPanel panel_7_2_1_1_4 = new JPanel();
		panel_7_2_1_1_4.setBackground(Color.WHITE);
		panel_7_2_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_4.setLayout(null);
		panel_7_2_1_1_4.setBounds(200, 180, 80, 20);
		panel_4.add(panel_7_2_1_1_4);

		cmbSelfShift1ToiletUse = new JComboBox();
		cmbSelfShift1ToiletUse.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1ToiletUse.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1ToiletUse.setBackground(Color.WHITE);
		cmbSelfShift1ToiletUse.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_4.add(cmbSelfShift1ToiletUse);

		final JPanel panel_7_2_1_1_5 = new JPanel();
		panel_7_2_1_1_5.setBackground(Color.WHITE);
		panel_7_2_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_5.setLayout(null);
		panel_7_2_1_1_5.setBounds(200, 200, 80, 20);
		panel_4.add(panel_7_2_1_1_5);

		cmbSelfShift1Ambulation = new JComboBox();
		cmbSelfShift1Ambulation.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1Ambulation
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift1Ambulation.setBackground(Color.WHITE);
		cmbSelfShift1Ambulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_5.add(cmbSelfShift1Ambulation);

		final JPanel panel_7_2_1_1_6 = new JPanel();
		panel_7_2_1_1_6.setBackground(Color.WHITE);
		panel_7_2_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_6.setLayout(null);
		panel_7_2_1_1_6.setBounds(200, 220, 80, 20);
		panel_4.add(panel_7_2_1_1_6);

		cmbSelfShift1WCAmbulation = new JComboBox();
		cmbSelfShift1WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift1WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSelfShift1WCAmbulation.setBackground(Color.WHITE);
		cmbSelfShift1WCAmbulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_6.add(cmbSelfShift1WCAmbulation);

		final JPanel panel_7_3_1_1_1 = new JPanel();
		panel_7_3_1_1_1.setBackground(Color.WHITE);
		panel_7_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_1.setLayout(null);
		panel_7_3_1_1_1.setBounds(280, 120, 94, 20);
		panel_4.add(panel_7_3_1_1_1);

		cmbSupportShift1Eating = new JComboBox();
		cmbSupportShift1Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Eating.setBackground(Color.WHITE);
		cmbSupportShift1Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Eating.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_1.add(cmbSupportShift1Eating);

		final JPanel panel_7_3_1_1_2 = new JPanel();
		panel_7_3_1_1_2.setBackground(Color.WHITE);
		panel_7_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_2.setLayout(null);
		panel_7_3_1_1_2.setBounds(280, 140, 94, 20);
		panel_4.add(panel_7_3_1_1_2);

		cmbSupportShift1Hygiene = new JComboBox();
		cmbSupportShift1Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Hygiene.setBackground(Color.WHITE);
		cmbSupportShift1Hygiene
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Hygiene.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_2.add(cmbSupportShift1Hygiene);

		final JPanel panel_7_3_1_1_3 = new JPanel();
		panel_7_3_1_1_3.setBackground(Color.WHITE);
		panel_7_3_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_3.setLayout(null);
		panel_7_3_1_1_3.setBounds(280, 160, 94, 20);
		panel_4.add(panel_7_3_1_1_3);

		cmbSupportShift1Bathing = new JComboBox();
		cmbSupportShift1Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Bathing.setBackground(Color.WHITE);
		cmbSupportShift1Bathing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift1Bathing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_3.add(cmbSupportShift1Bathing);

		final JPanel panel_7_3_1_1_4 = new JPanel();
		panel_7_3_1_1_4.setBackground(Color.WHITE);
		panel_7_3_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_4.setLayout(null);
		panel_7_3_1_1_4.setBounds(280, 180, 94, 20);
		panel_4.add(panel_7_3_1_1_4);

		cmbSupportShift1ToiletUse = new JComboBox();
		cmbSupportShift1ToiletUse.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1ToiletUse.setBackground(Color.WHITE);
		cmbSupportShift1ToiletUse.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift1ToiletUse.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_4.add(cmbSupportShift1ToiletUse);

		final JPanel panel_7_3_1_1_5 = new JPanel();
		panel_7_3_1_1_5.setBackground(Color.WHITE);
		panel_7_3_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_5.setLayout(null);
		panel_7_3_1_1_5.setBounds(280, 200, 94, 20);
		panel_4.add(panel_7_3_1_1_5);

		cmbSupportShift1Ambulation = new JComboBox();
		cmbSupportShift1Ambulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1Ambulation.setBackground(Color.WHITE);
		cmbSupportShift1Ambulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift1Ambulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_5.add(cmbSupportShift1Ambulation);

		final JPanel panel_7_3_1_1_6 = new JPanel();
		panel_7_3_1_1_6.setBackground(Color.WHITE);
		panel_7_3_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_6.setLayout(null);
		panel_7_3_1_1_6.setBounds(280, 220, 94, 20);
		panel_4.add(panel_7_3_1_1_6);

		cmbSupportShift1WCAmbulation = new JComboBox();
		cmbSupportShift1WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift1WCAmbulation.setBackground(Color.WHITE);
		cmbSupportShift1WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift1WCAmbulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_6.add(cmbSupportShift1WCAmbulation);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(374, 0, 374, 280);
		panel_3.add(panel_4_1);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(Color.WHITE);
		panel_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3.setLayout(null);
		panel_5_3.setBounds(0, 0, 374, 20);
		panel_4_1.add(panel_5_3);

		final JLabel shift711Label_3 = new JLabel();
		shift711Label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		shift711Label_3.setText("Shift 7-3");
		shift711Label_3.setBounds(155, 5, 70, 14);
		panel_5_3.add(shift711Label_3);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 20, 200, 40);
		panel_4_1.add(panel_6_1);

		final JLabel physicalFunctioningLabel_1 = new JLabel();
		physicalFunctioningLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicalFunctioningLabel_1.setText("Physical Functioning");
		physicalFunctioningLabel_1.setBounds(10, 0, 180, 30);
		panel_6_1.add(physicalFunctioningLabel_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(Color.WHITE);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 60, 200, 20);
		panel_4_1.add(panel_5_1_1);

		final JLabel shift711Label_1_1 = new JLabel();
		shift711Label_1_1.setText("Bed Moboility");
		shift711Label_1_1.setBounds(10, 0, 70, 14);
		panel_5_1_1.add(shift711Label_1_1);

		final JPanel panel_5_2_2 = new JPanel();
		panel_5_2_2.setBackground(Color.WHITE);
		panel_5_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_2.setLayout(null);
		panel_5_2_2.setBounds(0, 80, 200, 20);
		panel_4_1.add(panel_5_2_2);

		final JLabel shift711Label_2_2 = new JLabel();
		shift711Label_2_2.setText("Transfer");
		shift711Label_2_2.setBounds(10, 0, 70, 14);
		panel_5_2_2.add(shift711Label_2_2);

		final JPanel panel_7_4 = new JPanel();
		panel_7_4.setBackground(Color.WHITE);
		panel_7_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_4.setLayout(null);
		panel_7_4.setBounds(200, 20, 80, 40);
		panel_4_1.add(panel_7_4);

		final JLabel selfper_1 = new JLabel();
		selfper_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		selfper_1.setText("Self Perf");
		selfper_1.setBounds(10, 0, 60, 30);
		panel_7_4.add(selfper_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(280, 20, 94, 40);
		panel_4_1.add(panel_7_1_1);

		final JLabel supportLabel_1 = new JLabel();
		supportLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		supportLabel_1.setText("Support");
		supportLabel_1.setBounds(27, 10, 57, 14);
		panel_7_1_1.add(supportLabel_1);

		final JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBounds(200, 60, 80, 20);
		panel_4_1.add(panel_7_2_2);

		cmbSelfShift2Mobility = new JComboBox();
		cmbSelfShift2Mobility.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Mobility.setBackground(Color.WHITE);
		cmbSelfShift2Mobility.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Mobility.setBounds(0, 0, 80, 21);
		panel_7_2_2.add(cmbSelfShift2Mobility);

		final JPanel panel_7_3_2 = new JPanel();
		panel_7_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_2.setLayout(null);
		panel_7_3_2.setBounds(280, 60, 94, 20);
		panel_4_1.add(panel_7_3_2);

		cmbSupportShift2Mobility = new JComboBox();
		cmbSupportShift2Mobility.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Mobility.setBackground(Color.WHITE);
		cmbSupportShift2Mobility
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Mobility.setBounds(0, 0, 94, 20);
		panel_7_3_2.add(cmbSupportShift2Mobility);

		final JPanel panel_7_2_1_2 = new JPanel();
		panel_7_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_2.setLayout(null);
		panel_7_2_1_2.setBounds(200, 80, 80, 20);
		panel_4_1.add(panel_7_2_1_2);

		cmbSelfShift2Transfer = new JComboBox();
		cmbSelfShift2Transfer.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Transfer.setBackground(Color.WHITE);
		cmbSelfShift2Transfer.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Transfer.setBounds(0, 0, 80, 21);
		panel_7_2_1_2.add(cmbSelfShift2Transfer);

		final JPanel panel_7_3_1_2 = new JPanel();
		panel_7_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_2.setLayout(null);
		panel_7_3_1_2.setBounds(280, 80, 94, 20);
		panel_4_1.add(panel_7_3_1_2);

		cmbSupportShift2Transfer = new JComboBox();
		cmbSupportShift2Transfer.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Transfer.setBackground(Color.WHITE);
		cmbSupportShift2Transfer
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Transfer.setBounds(0, 0, 94, 20);
		panel_7_3_1_2.add(cmbSupportShift2Transfer);

		final JPanel panel_5_2_1_9 = new JPanel();
		panel_5_2_1_9.setBackground(Color.WHITE);
		panel_5_2_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_9.setLayout(null);
		panel_5_2_1_9.setBounds(0, 100, 200, 20);
		panel_4_1.add(panel_5_2_1_9);

		final JLabel shift711Label_2_1_9 = new JLabel();
		shift711Label_2_1_9.setText("Dressing");
		shift711Label_2_1_9.setBounds(10, 0, 70, 14);
		panel_5_2_1_9.add(shift711Label_2_1_9);

		final JPanel panel_7_2_1_1_7 = new JPanel();
		panel_7_2_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_7.setLayout(null);
		panel_7_2_1_1_7.setBounds(200, 100, 80, 20);
		panel_4_1.add(panel_7_2_1_1_7);

		cmbSelfShift2Dressing = new JComboBox();
		cmbSelfShift2Dressing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Dressing.setBackground(Color.WHITE);
		cmbSelfShift2Dressing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Dressing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_7.add(cmbSelfShift2Dressing);

		final JPanel panel_7_3_1_1_7 = new JPanel();
		panel_7_3_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_7.setLayout(null);
		panel_7_3_1_1_7.setBounds(280, 100, 94, 20);
		panel_4_1.add(panel_7_3_1_1_7);

		cmbSupportShift2Dressing = new JComboBox();
		cmbSupportShift2Dressing.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Dressing.setBackground(Color.WHITE);
		cmbSupportShift2Dressing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Dressing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_7.add(cmbSupportShift2Dressing);

		final JPanel panel_5_2_1_1_1 = new JPanel();
		panel_5_2_1_1_1.setBackground(Color.WHITE);
		panel_5_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_1_1.setLayout(null);
		panel_5_2_1_1_1.setBounds(0, 120, 200, 20);
		panel_4_1.add(panel_5_2_1_1_1);

		final JLabel shift711Label_2_1_1_1 = new JLabel();
		shift711Label_2_1_1_1.setText("Eating");
		shift711Label_2_1_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_1_1.add(shift711Label_2_1_1_1);

		final JPanel panel_5_2_1_2_1 = new JPanel();
		panel_5_2_1_2_1.setBackground(Color.WHITE);
		panel_5_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_2_1.setLayout(null);
		panel_5_2_1_2_1.setBounds(0, 140, 200, 20);
		panel_4_1.add(panel_5_2_1_2_1);

		final JLabel shift711Label_2_1_2_1 = new JLabel();
		shift711Label_2_1_2_1.setText("Hygiene");
		shift711Label_2_1_2_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_2_1.add(shift711Label_2_1_2_1);

		final JPanel panel_5_2_1_3_1 = new JPanel();
		panel_5_2_1_3_1.setBackground(Color.WHITE);
		panel_5_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_3_1.setLayout(null);
		panel_5_2_1_3_1.setBounds(0, 160, 200, 20);
		panel_4_1.add(panel_5_2_1_3_1);

		final JLabel shift711Label_2_1_3_1 = new JLabel();
		shift711Label_2_1_3_1.setText("Bathing");
		shift711Label_2_1_3_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_3_1.add(shift711Label_2_1_3_1);

		final JPanel panel_5_2_1_4_1 = new JPanel();
		panel_5_2_1_4_1.setBackground(Color.WHITE);
		panel_5_2_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_4_1.setLayout(null);
		panel_5_2_1_4_1.setBounds(0, 180, 200, 20);
		panel_4_1.add(panel_5_2_1_4_1);

		final JLabel shift711Label_2_1_4_1 = new JLabel();
		shift711Label_2_1_4_1.setText("Toilet Use");
		shift711Label_2_1_4_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_4_1.add(shift711Label_2_1_4_1);

		final JPanel panel_5_2_1_5_1 = new JPanel();
		panel_5_2_1_5_1.setBackground(Color.WHITE);
		panel_5_2_1_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_5_1.setLayout(null);
		panel_5_2_1_5_1.setBounds(0, 200, 200, 20);
		panel_4_1.add(panel_5_2_1_5_1);

		final JLabel shift711Label_2_1_5_1 = new JLabel();
		shift711Label_2_1_5_1.setText("Ambulation");
		shift711Label_2_1_5_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_5_1.add(shift711Label_2_1_5_1);

		final JPanel panel_5_2_1_6_1 = new JPanel();
		panel_5_2_1_6_1.setBackground(Color.WHITE);
		panel_5_2_1_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_6_1.setLayout(null);
		panel_5_2_1_6_1.setBounds(0, 220, 200, 20);
		panel_4_1.add(panel_5_2_1_6_1);

		final JLabel shift711Label_2_1_6_1 = new JLabel();
		shift711Label_2_1_6_1.setText("W / C Ambulation");
		shift711Label_2_1_6_1.setBounds(10, 0, 113, 14);
		panel_5_2_1_6_1.add(shift711Label_2_1_6_1);

		final JPanel panel_5_2_1_7_1 = new JPanel();
		panel_5_2_1_7_1.setBackground(Color.WHITE);
		panel_5_2_1_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_7_1.setLayout(null);
		panel_5_2_1_7_1.setBounds(0, 240, 374, 20);
		panel_4_1.add(panel_5_2_1_7_1);

		cbWalkerShift2 = new JCheckBox();
		cbWalkerShift2.setBackground(Color.WHITE);
		cbWalkerShift2.setText("Walker");
		cbWalkerShift2.setBounds(1, 2, 80, 17);
		panel_5_2_1_7_1.add(cbWalkerShift2);

		cbCaneShift2 = new JCheckBox();
		cbCaneShift2.setBackground(Color.WHITE);
		cbCaneShift2.setText("Cane");
		cbCaneShift2.setBounds(97, 2, 80, 17);
		panel_5_2_1_7_1.add(cbCaneShift2);

		cbSlideBoardShift2 = new JCheckBox();
		cbSlideBoardShift2.setBackground(Color.WHITE);
		cbSlideBoardShift2.setText("Slide Board");
		cbSlideBoardShift2.setBounds(194, 2, 80, 17);
		panel_5_2_1_7_1.add(cbSlideBoardShift2);

		final JPanel panel_5_2_1_8_1 = new JPanel();
		panel_5_2_1_8_1.setBackground(Color.WHITE);
		panel_5_2_1_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_8_1.setLayout(null);
		panel_5_2_1_8_1.setBounds(0, 260, 374, 20);
		panel_4_1.add(panel_5_2_1_8_1);

		final JLabel shift711Label_2_1_8_1 = new JLabel();
		shift711Label_2_1_8_1.setText("Transferred");
		shift711Label_2_1_8_1.setBounds(10, 2, 70, 14);
		panel_5_2_1_8_1.add(shift711Label_2_1_8_1);

		cbManuallyShift2 = new JCheckBox();
		cbManuallyShift2.setBackground(Color.WHITE);
		cbManuallyShift2.setText("Manually");
		cbManuallyShift2.setBounds(97, 2, 80, 17);
		panel_5_2_1_8_1.add(cbManuallyShift2);

		cbMechanicallyShift2 = new JCheckBox();
		cbMechanicallyShift2.setBackground(Color.WHITE);
		cbMechanicallyShift2.setText("Mechanically");
		cbMechanicallyShift2.setBounds(194, 2, 110, 17);
		panel_5_2_1_8_1.add(cbMechanicallyShift2);

		final JPanel panel_7_2_1_1_1_1 = new JPanel();
		panel_7_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_1_1.setLayout(null);
		panel_7_2_1_1_1_1.setBounds(200, 120, 80, 20);
		panel_4_1.add(panel_7_2_1_1_1_1);

		cmbSelfShift2Eating = new JComboBox();
		cmbSelfShift2Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Eating.setBackground(Color.WHITE);
		cmbSelfShift2Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Eating.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_1_1.add(cmbSelfShift2Eating);

		final JPanel panel_7_2_1_1_2_1 = new JPanel();
		panel_7_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_2_1.setLayout(null);
		panel_7_2_1_1_2_1.setBounds(200, 140, 80, 20);
		panel_4_1.add(panel_7_2_1_1_2_1);

		cmbSelfShift2Hygiene = new JComboBox();
		cmbSelfShift2Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Hygiene.setBackground(Color.WHITE);
		cmbSelfShift2Hygiene.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Hygiene.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_2_1.add(cmbSelfShift2Hygiene);

		final JPanel panel_7_2_1_1_3_1 = new JPanel();
		panel_7_2_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_3_1.setLayout(null);
		panel_7_2_1_1_3_1.setBounds(200, 160, 80, 20);
		panel_4_1.add(panel_7_2_1_1_3_1);

		cmbSelfShift2Bathing = new JComboBox();
		cmbSelfShift2Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Bathing.setBackground(Color.WHITE);
		cmbSelfShift2Bathing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Bathing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_3_1.add(cmbSelfShift2Bathing);

		final JPanel panel_7_2_1_1_4_1 = new JPanel();
		panel_7_2_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_4_1.setLayout(null);
		panel_7_2_1_1_4_1.setBounds(200, 180, 80, 20);
		panel_4_1.add(panel_7_2_1_1_4_1);

		cmbSelfShift2ToiletUse = new JComboBox();
		cmbSelfShift2ToiletUse.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2ToiletUse.setBackground(Color.WHITE);
		cmbSelfShift2ToiletUse.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2ToiletUse.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_4_1.add(cmbSelfShift2ToiletUse);

		final JPanel panel_7_2_1_1_5_1 = new JPanel();
		panel_7_2_1_1_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_5_1.setLayout(null);
		panel_7_2_1_1_5_1.setBounds(200, 200, 80, 20);
		panel_4_1.add(panel_7_2_1_1_5_1);

		cmbSelfShift2Ambulation = new JComboBox();
		cmbSelfShift2Ambulation.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2Ambulation.setBackground(Color.WHITE);
		cmbSelfShift2Ambulation
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift2Ambulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_5_1.add(cmbSelfShift2Ambulation);

		final JPanel panel_7_2_1_1_6_1 = new JPanel();
		panel_7_2_1_1_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_6_1.setLayout(null);
		panel_7_2_1_1_6_1.setBounds(200, 220, 80, 20);
		panel_4_1.add(panel_7_2_1_1_6_1);

		cmbSelfShift2WCAmbulation = new JComboBox();
		cmbSelfShift2WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift2WCAmbulation.setBackground(Color.WHITE);
		cmbSelfShift2WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSelfShift2WCAmbulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_6_1.add(cmbSelfShift2WCAmbulation);

		final JPanel panel_7_3_1_1_1_1 = new JPanel();
		panel_7_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_1_1.setLayout(null);
		panel_7_3_1_1_1_1.setBounds(280, 120, 94, 20);
		panel_4_1.add(panel_7_3_1_1_1_1);

		cmbSupportShift2Eating = new JComboBox();
		cmbSupportShift2Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Eating.setBackground(Color.WHITE);
		cmbSupportShift2Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Eating.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_1_1.add(cmbSupportShift2Eating);

		final JPanel panel_7_3_1_1_2_1 = new JPanel();
		panel_7_3_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_2_1.setLayout(null);
		panel_7_3_1_1_2_1.setBounds(280, 140, 94, 20);
		panel_4_1.add(panel_7_3_1_1_2_1);

		cmbSupportShift2Hygiene = new JComboBox();
		cmbSupportShift2Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Hygiene.setBackground(Color.WHITE);
		cmbSupportShift2Hygiene
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Hygiene.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_2_1.add(cmbSupportShift2Hygiene);

		final JPanel panel_7_3_1_1_3_1 = new JPanel();
		panel_7_3_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_3_1.setLayout(null);
		panel_7_3_1_1_3_1.setBounds(280, 160, 94, 20);
		panel_4_1.add(panel_7_3_1_1_3_1);

		cmbSupportShift2Bathing = new JComboBox();
		cmbSupportShift2Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Bathing.setBackground(Color.WHITE);
		cmbSupportShift2Bathing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift2Bathing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_3_1.add(cmbSupportShift2Bathing);

		final JPanel panel_7_3_1_1_4_1 = new JPanel();
		panel_7_3_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_4_1.setLayout(null);
		panel_7_3_1_1_4_1.setBounds(280, 180, 94, 20);
		panel_4_1.add(panel_7_3_1_1_4_1);

		cmbSupportShift2ToiletUse = new JComboBox();
		cmbSupportShift2ToiletUse.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2ToiletUse.setBackground(Color.WHITE);
		cmbSupportShift2ToiletUse.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift2ToiletUse.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_4_1.add(cmbSupportShift2ToiletUse);

		final JPanel panel_7_3_1_1_5_1 = new JPanel();
		panel_7_3_1_1_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_5_1.setLayout(null);
		panel_7_3_1_1_5_1.setBounds(280, 200, 94, 20);
		panel_4_1.add(panel_7_3_1_1_5_1);

		cmbSupportShift2Ambulation = new JComboBox();
		cmbSupportShift2Ambulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2Ambulation.setBackground(Color.WHITE);
		cmbSupportShift2Ambulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift2Ambulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_5_1.add(cmbSupportShift2Ambulation);

		final JPanel panel_7_3_1_1_6_1 = new JPanel();
		panel_7_3_1_1_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_6_1.setLayout(null);
		panel_7_3_1_1_6_1.setBounds(280, 220, 94, 20);
		panel_4_1.add(panel_7_3_1_1_6_1);

		cmbSupportShift2WCAmbulation = new JComboBox();
		cmbSupportShift2WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift2WCAmbulation.setBackground(Color.WHITE);
		cmbSupportShift2WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift2WCAmbulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_6_1.add(cmbSupportShift2WCAmbulation);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(748, 0, 374, 280);
		panel_3.add(panel_4_1_1);

		final JPanel panel_5_3_1 = new JPanel();
		panel_5_3_1.setBackground(Color.WHITE);
		panel_5_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3_1.setLayout(null);
		panel_5_3_1.setBounds(0, 0, 374, 20);
		panel_4_1_1.add(panel_5_3_1);

		final JLabel shift711Label_3_1 = new JLabel();
		shift711Label_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		shift711Label_3_1.setText("Shift 3-11");
		shift711Label_3_1.setBounds(155, 5, 70, 14);
		panel_5_3_1.add(shift711Label_3_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(Color.WHITE);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 20, 200, 40);
		panel_4_1_1.add(panel_6_1_1);

		final JLabel physicalFunctioningLabel_1_1 = new JLabel();
		physicalFunctioningLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicalFunctioningLabel_1_1.setText("Physical Functioning");
		physicalFunctioningLabel_1_1.setBounds(10, 0, 180, 30);
		panel_6_1_1.add(physicalFunctioningLabel_1_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, 60, 200, 20);
		panel_4_1_1.add(panel_5_1_1_1);

		final JLabel shift711Label_1_1_1 = new JLabel();
		shift711Label_1_1_1.setText("Bed Moboility");
		shift711Label_1_1_1.setBounds(10, 0, 70, 14);
		panel_5_1_1_1.add(shift711Label_1_1_1);

		final JPanel panel_5_2_2_1 = new JPanel();
		panel_5_2_2_1.setBackground(Color.WHITE);
		panel_5_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_2_1.setLayout(null);
		panel_5_2_2_1.setBounds(0, 80, 200, 20);
		panel_4_1_1.add(panel_5_2_2_1);

		final JLabel shift711Label_2_2_1 = new JLabel();
		shift711Label_2_2_1.setText("Transfer");
		shift711Label_2_2_1.setBounds(10, 0, 70, 14);
		panel_5_2_2_1.add(shift711Label_2_2_1);

		final JPanel panel_7_4_1 = new JPanel();
		panel_7_4_1.setBackground(Color.WHITE);
		panel_7_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_4_1.setLayout(null);
		panel_7_4_1.setBounds(200, 20, 80, 40);
		panel_4_1_1.add(panel_7_4_1);

		final JLabel selfper_1_1 = new JLabel();
		selfper_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		selfper_1_1.setText("Self Perf");
		selfper_1_1.setBounds(10, 0, 60, 30);
		panel_7_4_1.add(selfper_1_1);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(280, 20, 94, 40);
		panel_4_1_1.add(panel_7_1_1_1);

		final JLabel supportLabel_1_1 = new JLabel();
		supportLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		supportLabel_1_1.setText("Support");
		supportLabel_1_1.setBounds(27, 10, 57, 14);
		panel_7_1_1_1.add(supportLabel_1_1);

		final JPanel panel_7_2_2_1 = new JPanel();
		panel_7_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2_1.setLayout(null);
		panel_7_2_2_1.setBounds(200, 60, 80, 20);
		panel_4_1_1.add(panel_7_2_2_1);

		cmbSelfShift3Mobility = new JComboBox();
		cmbSelfShift3Mobility.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Mobility.setBackground(Color.WHITE);
		cmbSelfShift3Mobility.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Mobility.setBounds(0, 0, 80, 21);
		panel_7_2_2_1.add(cmbSelfShift3Mobility);

		final JPanel panel_7_3_2_1 = new JPanel();
		panel_7_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_2_1.setLayout(null);
		panel_7_3_2_1.setBounds(280, 60, 94, 20);
		panel_4_1_1.add(panel_7_3_2_1);

		cmbSupportShift3Mobility = new JComboBox();
		cmbSupportShift3Mobility.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Mobility.setBackground(Color.WHITE);
		cmbSupportShift3Mobility
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Mobility.setBounds(0, 0, 94, 20);
		panel_7_3_2_1.add(cmbSupportShift3Mobility);

		final JPanel panel_7_2_1_2_1 = new JPanel();
		panel_7_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_2_1.setLayout(null);
		panel_7_2_1_2_1.setBounds(200, 80, 80, 20);
		panel_4_1_1.add(panel_7_2_1_2_1);

		cmbSelfShift3Transfer = new JComboBox();
		cmbSelfShift3Transfer.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Transfer.setBackground(Color.WHITE);
		cmbSelfShift3Transfer.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Transfer.setBounds(0, 0, 80, 21);
		panel_7_2_1_2_1.add(cmbSelfShift3Transfer);

		final JPanel panel_7_3_1_2_1 = new JPanel();
		panel_7_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_2_1.setLayout(null);
		panel_7_3_1_2_1.setBounds(280, 80, 94, 20);
		panel_4_1_1.add(panel_7_3_1_2_1);

		cmbSupportShift3Transfer = new JComboBox();
		cmbSupportShift3Transfer.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Transfer.setBackground(Color.WHITE);
		cmbSupportShift3Transfer
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Transfer.setBounds(0, 0, 94, 20);
		panel_7_3_1_2_1.add(cmbSupportShift3Transfer);

		final JPanel panel_5_2_1_9_1 = new JPanel();
		panel_5_2_1_9_1.setBackground(Color.WHITE);
		panel_5_2_1_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_9_1.setLayout(null);
		panel_5_2_1_9_1.setBounds(0, 100, 200, 20);
		panel_4_1_1.add(panel_5_2_1_9_1);

		final JLabel shift711Label_2_1_9_1 = new JLabel();
		shift711Label_2_1_9_1.setText("Dressing");
		shift711Label_2_1_9_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_9_1.add(shift711Label_2_1_9_1);

		final JPanel panel_7_2_1_1_7_1 = new JPanel();
		panel_7_2_1_1_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_7_1.setLayout(null);
		panel_7_2_1_1_7_1.setBounds(200, 100, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_7_1);

		cmbSelfShift3Dressing = new JComboBox();
		cmbSelfShift3Dressing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Dressing.setBackground(Color.WHITE);
		cmbSelfShift3Dressing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Dressing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_7_1.add(cmbSelfShift3Dressing);

		final JPanel panel_7_3_1_1_7_1 = new JPanel();
		panel_7_3_1_1_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_7_1.setLayout(null);
		panel_7_3_1_1_7_1.setBounds(280, 100, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_7_1);

		cmbSupportShift3Dressing = new JComboBox();
		cmbSupportShift3Dressing.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Dressing.setBackground(Color.WHITE);
		cmbSupportShift3Dressing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Dressing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_7_1.add(cmbSupportShift3Dressing);

		final JPanel panel_5_2_1_1_1_1 = new JPanel();
		panel_5_2_1_1_1_1.setBackground(Color.WHITE);
		panel_5_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_1_1_1.setLayout(null);
		panel_5_2_1_1_1_1.setBounds(0, 120, 200, 20);
		panel_4_1_1.add(panel_5_2_1_1_1_1);

		final JLabel shift711Label_2_1_1_1_1 = new JLabel();
		shift711Label_2_1_1_1_1.setText("Eating");
		shift711Label_2_1_1_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_1_1_1.add(shift711Label_2_1_1_1_1);

		final JPanel panel_5_2_1_2_1_1 = new JPanel();
		panel_5_2_1_2_1_1.setBackground(Color.WHITE);
		panel_5_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_2_1_1.setLayout(null);
		panel_5_2_1_2_1_1.setBounds(0, 140, 200, 20);
		panel_4_1_1.add(panel_5_2_1_2_1_1);

		final JLabel shift711Label_2_1_2_1_1 = new JLabel();
		shift711Label_2_1_2_1_1.setText("Hygiene");
		shift711Label_2_1_2_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_2_1_1.add(shift711Label_2_1_2_1_1);

		final JPanel panel_5_2_1_3_1_1 = new JPanel();
		panel_5_2_1_3_1_1.setBackground(Color.WHITE);
		panel_5_2_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_3_1_1.setLayout(null);
		panel_5_2_1_3_1_1.setBounds(0, 160, 200, 20);
		panel_4_1_1.add(panel_5_2_1_3_1_1);

		final JLabel shift711Label_2_1_3_1_1 = new JLabel();
		shift711Label_2_1_3_1_1.setText("Bathing");
		shift711Label_2_1_3_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_3_1_1.add(shift711Label_2_1_3_1_1);

		final JPanel panel_5_2_1_4_1_1 = new JPanel();
		panel_5_2_1_4_1_1.setBackground(Color.WHITE);
		panel_5_2_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_4_1_1.setLayout(null);
		panel_5_2_1_4_1_1.setBounds(0, 180, 200, 20);
		panel_4_1_1.add(panel_5_2_1_4_1_1);

		final JLabel shift711Label_2_1_4_1_1 = new JLabel();
		shift711Label_2_1_4_1_1.setText("Toilet Use");
		shift711Label_2_1_4_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_4_1_1.add(shift711Label_2_1_4_1_1);

		final JPanel panel_5_2_1_5_1_1 = new JPanel();
		panel_5_2_1_5_1_1.setBackground(Color.WHITE);
		panel_5_2_1_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_5_1_1.setLayout(null);
		panel_5_2_1_5_1_1.setBounds(0, 200, 200, 20);
		panel_4_1_1.add(panel_5_2_1_5_1_1);

		final JLabel shift711Label_2_1_5_1_1 = new JLabel();
		shift711Label_2_1_5_1_1.setText("Ambulation");
		shift711Label_2_1_5_1_1.setBounds(10, 0, 70, 14);
		panel_5_2_1_5_1_1.add(shift711Label_2_1_5_1_1);

		final JPanel panel_5_2_1_6_1_1 = new JPanel();
		panel_5_2_1_6_1_1.setBackground(Color.WHITE);
		panel_5_2_1_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_6_1_1.setLayout(null);
		panel_5_2_1_6_1_1.setBounds(0, 220, 200, 20);
		panel_4_1_1.add(panel_5_2_1_6_1_1);

		final JLabel shift711Label_2_1_6_1_1 = new JLabel();
		shift711Label_2_1_6_1_1.setText("W / C Ambulation");
		shift711Label_2_1_6_1_1.setBounds(10, 0, 113, 14);
		panel_5_2_1_6_1_1.add(shift711Label_2_1_6_1_1);

		final JPanel panel_5_2_1_7_1_1 = new JPanel();
		panel_5_2_1_7_1_1.setBackground(Color.WHITE);
		panel_5_2_1_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_7_1_1.setLayout(null);
		panel_5_2_1_7_1_1.setBounds(0, 240, 374, 20);
		panel_4_1_1.add(panel_5_2_1_7_1_1);

		cbWalkerShift3 = new JCheckBox();
		cbWalkerShift3.setBackground(Color.WHITE);
		cbWalkerShift3.setText("Walker");
		cbWalkerShift3.setBounds(1, 2, 80, 17);
		panel_5_2_1_7_1_1.add(cbWalkerShift3);

		cbCaneShift3 = new JCheckBox();
		cbCaneShift3.setBackground(Color.WHITE);
		cbCaneShift3.setText("Cane");
		cbCaneShift3.setBounds(97, 2, 80, 17);
		panel_5_2_1_7_1_1.add(cbCaneShift3);

		cbSlideBoardShift3 = new JCheckBox();
		cbSlideBoardShift3.setBackground(Color.WHITE);
		cbSlideBoardShift3.setText("Slide Board");
		cbSlideBoardShift3.setBounds(194, 2, 80, 17);
		panel_5_2_1_7_1_1.add(cbSlideBoardShift3);

		final JPanel panel_5_2_1_8_1_1 = new JPanel();
		panel_5_2_1_8_1_1.setBackground(Color.WHITE);
		panel_5_2_1_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1_8_1_1.setLayout(null);
		panel_5_2_1_8_1_1.setBounds(0, 260, 374, 20);
		panel_4_1_1.add(panel_5_2_1_8_1_1);

		final JLabel shift711Label_2_1_8_1_1 = new JLabel();
		shift711Label_2_1_8_1_1.setText("Transferred");
		shift711Label_2_1_8_1_1.setBounds(10, 2, 70, 14);
		panel_5_2_1_8_1_1.add(shift711Label_2_1_8_1_1);

		cbManuallyShift3 = new JCheckBox();
		cbManuallyShift3.setBackground(Color.WHITE);
		cbManuallyShift3.setText("Manually");
		cbManuallyShift3.setBounds(97, 2, 80, 17);
		panel_5_2_1_8_1_1.add(cbManuallyShift3);

		cbMechanicallyShift3 = new JCheckBox();
		cbMechanicallyShift3.setBackground(Color.WHITE);
		cbMechanicallyShift3.setText("Mechanically");
		cbMechanicallyShift3.setBounds(194, 2, 110, 17);
		panel_5_2_1_8_1_1.add(cbMechanicallyShift3);

		final JPanel panel_7_2_1_1_1_1_1 = new JPanel();
		panel_7_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_1_1_1.setLayout(null);
		panel_7_2_1_1_1_1_1.setBounds(200, 120, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_1_1_1);

		cmbSelfShift3Eating = new JComboBox();
		cmbSelfShift3Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Eating.setBackground(Color.WHITE);
		cmbSelfShift3Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Eating.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_1_1_1.add(cmbSelfShift3Eating);

		final JPanel panel_7_2_1_1_2_1_1 = new JPanel();
		panel_7_2_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_2_1_1.setLayout(null);
		panel_7_2_1_1_2_1_1.setBounds(200, 140, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_2_1_1);

		cmbSelfShift3Hygiene = new JComboBox();
		cmbSelfShift3Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Hygiene.setBackground(Color.WHITE);
		cmbSelfShift3Hygiene.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Hygiene.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_2_1_1.add(cmbSelfShift3Hygiene);

		final JPanel panel_7_2_1_1_3_1_1 = new JPanel();
		panel_7_2_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_3_1_1.setLayout(null);
		panel_7_2_1_1_3_1_1.setBounds(200, 160, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_3_1_1);

		cmbSelfShift3Bathing = new JComboBox();
		cmbSelfShift3Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Bathing.setBackground(Color.WHITE);
		cmbSelfShift3Bathing.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Bathing.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_3_1_1.add(cmbSelfShift3Bathing);

		final JPanel panel_7_2_1_1_4_1_1 = new JPanel();
		panel_7_2_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_4_1_1.setLayout(null);
		panel_7_2_1_1_4_1_1.setBounds(200, 180, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_4_1_1);

		cmbSelfShift3ToiletUse = new JComboBox();
		cmbSelfShift3ToiletUse.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3ToiletUse.setBackground(Color.WHITE);
		cmbSelfShift3ToiletUse.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3ToiletUse.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_4_1_1.add(cmbSelfShift3ToiletUse);

		final JPanel panel_7_2_1_1_5_1_1 = new JPanel();
		panel_7_2_1_1_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_5_1_1.setLayout(null);
		panel_7_2_1_1_5_1_1.setBounds(200, 200, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_5_1_1);

		cmbSelfShift3Ambulation = new JComboBox();
		cmbSelfShift3Ambulation.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3Ambulation.setBackground(Color.WHITE);
		cmbSelfShift3Ambulation
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSelfShift3Ambulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_5_1_1.add(cmbSelfShift3Ambulation);

		final JPanel panel_7_2_1_1_6_1_1 = new JPanel();
		panel_7_2_1_1_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_6_1_1.setLayout(null);
		panel_7_2_1_1_6_1_1.setBounds(200, 220, 80, 20);
		panel_4_1_1.add(panel_7_2_1_1_6_1_1);

		cmbSelfShift3WCAmbulation = new JComboBox();
		cmbSelfShift3WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "4", "8" }));
		cmbSelfShift3WCAmbulation.setBackground(Color.WHITE);
		cmbSelfShift3WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSelfShift3WCAmbulation.setBounds(0, 0, 80, 21);
		panel_7_2_1_1_6_1_1.add(cmbSelfShift3WCAmbulation);

		final JPanel panel_7_3_1_1_1_1_1 = new JPanel();
		panel_7_3_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_1_1_1.setLayout(null);
		panel_7_3_1_1_1_1_1.setBounds(280, 120, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_1_1_1);

		cmbSupportShift3Eating = new JComboBox();
		cmbSupportShift3Eating.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Eating.setBackground(Color.WHITE);
		cmbSupportShift3Eating.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Eating.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_1_1_1.add(cmbSupportShift3Eating);

		final JPanel panel_7_3_1_1_2_1_1 = new JPanel();
		panel_7_3_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_2_1_1.setLayout(null);
		panel_7_3_1_1_2_1_1.setBounds(280, 140, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_2_1_1);

		cmbSupportShift3Hygiene = new JComboBox();
		cmbSupportShift3Hygiene.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Hygiene.setBackground(Color.WHITE);
		cmbSupportShift3Hygiene
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Hygiene.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_2_1_1.add(cmbSupportShift3Hygiene);

		final JPanel panel_7_3_1_1_3_1_1 = new JPanel();
		panel_7_3_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_3_1_1.setLayout(null);
		panel_7_3_1_1_3_1_1.setBounds(280, 160, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_3_1_1);

		cmbSupportShift3Bathing = new JComboBox();
		cmbSupportShift3Bathing.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Bathing.setBackground(Color.WHITE);
		cmbSupportShift3Bathing
				.setBorder(new LineBorder(Color.black, 1, false));
		cmbSupportShift3Bathing.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_3_1_1.add(cmbSupportShift3Bathing);

		final JPanel panel_7_3_1_1_4_1_1 = new JPanel();
		panel_7_3_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_4_1_1.setLayout(null);
		panel_7_3_1_1_4_1_1.setBounds(280, 180, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_4_1_1);

		cmbSupportShift3ToiletUse = new JComboBox();
		cmbSupportShift3ToiletUse.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3ToiletUse.setBackground(Color.WHITE);
		cmbSupportShift3ToiletUse.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift3ToiletUse.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_4_1_1.add(cmbSupportShift3ToiletUse);

		final JPanel panel_7_3_1_1_5_1_1 = new JPanel();
		panel_7_3_1_1_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_5_1_1.setLayout(null);
		panel_7_3_1_1_5_1_1.setBounds(280, 200, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_5_1_1);

		cmbSupportShift3Ambulation = new JComboBox();
		cmbSupportShift3Ambulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3Ambulation.setBackground(Color.WHITE);
		cmbSupportShift3Ambulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift3Ambulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_5_1_1.add(cmbSupportShift3Ambulation);

		final JPanel panel_7_3_1_1_6_1_1 = new JPanel();
		panel_7_3_1_1_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_3_1_1_6_1_1.setLayout(null);
		panel_7_3_1_1_6_1_1.setBounds(280, 220, 94, 20);
		panel_4_1_1.add(panel_7_3_1_1_6_1_1);

		cmbSupportShift3WCAmbulation = new JComboBox();
		cmbSupportShift3WCAmbulation.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "8" }));
		cmbSupportShift3WCAmbulation.setBackground(Color.WHITE);
		cmbSupportShift3WCAmbulation.setBorder(new LineBorder(Color.black, 1,
				false));
		cmbSupportShift3WCAmbulation.setBounds(0, 0, 94, 20);
		panel_7_3_1_1_6_1_1.add(cmbSupportShift3WCAmbulation);

		// ----copied

		commentPanel();

		// ---copied

		namePanel();
	}

	public void commentPanel() {

		CommentPanel = new JPanel();
		CommentPanel.setBorder(new LineBorder(Color.black, 1, false));
		CommentPanel.setLayout(null);
		// CommentPanel.setBounds(10, 50, 1122, 540);
		CommentPanel.setBounds(10, 436, 1122, 540);
		add(CommentPanel);

		final JPanel DateTimePanel = new JPanel();
		DateTimePanel.setBackground(Color.BLACK);
		DateTimePanel.setForeground(Color.WHITE);
		DateTimePanel.setBounds(0, 0, 130, 30);
		CommentPanel.add(DateTimePanel);
		DateTimePanel.setLayout(null);

		final JLabel dateTimeLabel = new JLabel();
		dateTimeLabel.setForeground(Color.WHITE);
		dateTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateTimeLabel.setText("Date / Time");
		dateTimeLabel.setBounds(10, 10, 110, 14);
		DateTimePanel.add(dateTimeLabel);

		final JPanel CommentsPanel = new JPanel();
		CommentsPanel.setBackground(Color.BLACK);
		CommentsPanel.setLayout(null);
		CommentsPanel.setBounds(130, 0, 760, 30);
		CommentPanel.add(CommentsPanel);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		commentsLabel.setForeground(Color.WHITE);
		commentsLabel.setText("COMMENTS");
		commentsLabel.setBounds(332, 10, 137, 14);
		CommentsPanel.add(commentsLabel);

		final JPanel SignatureTitlePanel = new JPanel();
		SignatureTitlePanel.setBackground(Color.BLACK);
		SignatureTitlePanel.setLayout(null);
		SignatureTitlePanel.setBounds(890, 0, 231, 30);
		CommentPanel.add(SignatureTitlePanel);

		final JLabel signaturetitleLabel = new JLabel();
		signaturetitleLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		signaturetitleLabel.setForeground(Color.WHITE);
		signaturetitleLabel.setText("Signature  /  Title");
		signaturetitleLabel.setBounds(10, 10, 211, 14);
		SignatureTitlePanel.add(signaturetitleLabel);
	}

	public void namePanel() {

		final JPanel PanelRecordNoMain = new JPanel();
		PanelRecordNoMain.setLayout(null);
		// PanelRecordNoMain.setBounds(10, 27, 1122, 50);
		PanelRecordNoMain.setBounds(10, 976, 1122, 50);
		add(PanelRecordNoMain);

		final JPanel PanelNames = new JPanel();
		PanelNames.setBackground(Color.WHITE);
		PanelNames.setBorder(new LineBorder(Color.black, 1, false));
		PanelNames.setLayout(null);
		PanelNames.setBounds(0, 0, 528, 50);
		PanelRecordNoMain.add(PanelNames);

		final JLabel namesLabel = new JLabel();
		namesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		namesLabel.setText("Name");
		namesLabel.setBounds(10, 5, 48, 14);
		PanelNames.add(namesLabel);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lastNameLabel.setText("Last Name");
		lastNameLabel.setBounds(97, 5, 71, 14);
		PanelNames.add(lastNameLabel);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		firstNameLabel.setText("First Name");
		firstNameLabel.setBounds(249, 6, 71, 14);
		PanelNames.add(firstNameLabel);

		final JLabel middleNameLabel = new JLabel();
		middleNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		middleNameLabel.setText("Middle Name");
		middleNameLabel.setBounds(400, 5, 86, 14);
		PanelNames.add(middleNameLabel);

		txtLastName = new JTextField();
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setEditable(false);
		txtLastName.setBounds(69, 20, 117, 21);
		PanelNames.add(txtLastName);

		txtFirstName = new JTextField();
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setEditable(false);
		txtFirstName.setBounds(225, 20, 117, 21);
		PanelNames.add(txtFirstName);

		txtMiddleName = new JTextField();
		txtMiddleName.setBackground(Color.WHITE);
		txtMiddleName.setEditable(false);
		txtMiddleName.setBounds(389, 20, 117, 21);
		PanelNames.add(txtMiddleName);

		final JPanel PanelPhysician = new JPanel();
		PanelPhysician.setBackground(Color.WHITE);
		PanelPhysician.setBorder(new LineBorder(Color.black, 1, false));
		PanelPhysician.setLayout(null);
		PanelPhysician.setBounds(528, 0, 228, 50);
		PanelRecordNoMain.add(PanelPhysician);

		final JLabel attendingPhysicianLabel = new JLabel();
		attendingPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		attendingPhysicianLabel.setText("Attending Physician");
		attendingPhysicianLabel.setBounds(43, 5, 157, 14);
		PanelPhysician.add(attendingPhysicianLabel);

		txtAttendingPhysician = new JTextField();
		txtAttendingPhysician.setEditable(true);
		txtAttendingPhysician.setBounds(25, 20, 193, 21);
		PanelPhysician.add(txtAttendingPhysician);

		final JPanel PanelRecord = new JPanel();
		PanelRecord.setBackground(Color.WHITE);
		PanelRecord.setBorder(new LineBorder(Color.black, 1, false));
		PanelRecord.setLayout(null);
		PanelRecord.setBounds(756, 0, 194, 50);
		PanelRecordNoMain.add(PanelRecord);

		final JLabel recordNoLabel = new JLabel();
		recordNoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordNoLabel.setText("Record No");
		recordNoLabel.setBounds(50, 5, 83, 14);
		PanelRecord.add(recordNoLabel);

		final JTextField textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(10, 20, 174, 21);
		PanelRecord.add(textField);

		final JPanel PanelRoomBed = new JPanel();
		PanelRoomBed.setBackground(Color.WHITE);
		PanelRoomBed.setBorder(new LineBorder(Color.black, 1, false));
		PanelRoomBed.setLayout(null);
		PanelRoomBed.setBounds(950, 0, 172, 50);
		PanelRecordNoMain.add(PanelRoomBed);

		final JLabel roomBedLabel = new JLabel();
		roomBedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		roomBedLabel.setText("Room / Bed");
		roomBedLabel.setBounds(43, 5, 85, 14);
		PanelRoomBed.add(roomBedLabel);

		txtRoomBed = new JTextField();
		txtRoomBed.setBackground(Color.WHITE);
		txtRoomBed.setEditable(false);
		txtRoomBed.setBounds(10, 20, 152, 21);
		PanelRoomBed.add(txtRoomBed);

		// rows added

		panelRows = new PanelDailySkilledNursesNotesRow[17];

		for (int i = 0; i < 17; i++) {
			panelRows[i] = new PanelDailySkilledNursesNotesRow(i + 1);
			panelRows[i].setBounds(0, (i + 1) * 30, 1122, 30);
			CommentPanel.add(panelRows[i]);
		}
		// doLoad();
		// Global.panelDailySkilledNursesNotesForm2=this;
	}

	public void doLoad() {
		// updateData();

	}

	public int doSave() {

		// refResidentAssessmentForm19.setSerial(Global.currentResidentAssessmentFormPage19Key);
		// refResidentAssessmentForm19.setFormId(Global.currentResidentAssessmentFormKey);

		DailySkilledNursesNotesForm2 refForm2 = new DailySkilledNursesNotesForm2();
		// System.out.println(Global.currentDailySkilledNursesNotesKey);
		// System.out.println(Global.currentDailySkilledNursesNotesForm2Key);
		refForm2.setSerial(Global.currentDailySkilledNursesNotesForm2Key);
		refForm2.setFormID(Global.currentDailySkilledNursesNotesKey);
		refForm2.setSelfShift1Mobility(Utils.convertInt(cmbSelfShift1Mobility
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Transfer(Utils.convertInt(cmbSelfShift1Transfer
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Dressing(Utils.convertInt(cmbSelfShift1Dressing
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Eating(Utils.convertInt(cmbSelfShift1Eating
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Hygiene(Utils.convertInt(cmbSelfShift1Hygiene
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Bathing(Utils.convertInt(cmbSelfShift1Bathing
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Toilet(Utils.convertInt(cmbSelfShift1ToiletUse
				.getSelectedItem().toString()));
		refForm2.setSelfShift1Ambulation(Utils
				.convertInt(cmbSelfShift1Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift1WCAmbulation(Utils
				.convertInt(cmbSelfShift1WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift1Bathing(Utils.convertInt(cmbSelfShift1Bathing
				.getSelectedItem().toString()));

		refForm2.setSupportShift1Mobility(Utils
				.convertInt(cmbSupportShift1Mobility.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Transfer(Utils
				.convertInt(cmbSupportShift1Transfer.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Dressing(Utils
				.convertInt(cmbSupportShift1Dressing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Eating(Utils.convertInt(cmbSupportShift1Eating
				.getSelectedItem().toString()));
		refForm2.setSupportShift1Hygiene(Utils
				.convertInt(cmbSupportShift1Hygiene.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Bathing(Utils
				.convertInt(cmbSupportShift1Bathing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Toilet(Utils
				.convertInt(cmbSupportShift1ToiletUse.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Ambulation(Utils
				.convertInt(cmbSupportShift1Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1WCAmbulation(Utils
				.convertInt(cmbSupportShift1WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift1Bathing(Utils
				.convertInt(cmbSupportShift1Bathing.getSelectedItem()
						.toString()));
		// System.out.println("cbSlideBoardShift1.isSelected():"
		// +cbSlideBoardShift1.isSelected());
		refForm2.setWalkerShift1(cbWalkerShift1.isSelected());
		refForm2.setCaneShift1(cbCaneShift1.isSelected());
		refForm2.setSlideBoardShift1(cbSlideBoardShift1.isSelected());
		refForm2.setManuallyShift1(cbManuallyShift1.isSelected());
		refForm2.setMechanicallyShift1(cbMechanicallyShift1.isSelected());

		// shift2

		refForm2.setSelfShift2Mobility(Utils.convertInt(cmbSelfShift2Mobility
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Transfer(Utils.convertInt(cmbSelfShift2Transfer
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Dressing(Utils.convertInt(cmbSelfShift2Dressing
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Eating(Utils.convertInt(cmbSelfShift2Eating
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Hygiene(Utils.convertInt(cmbSelfShift2Hygiene
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Bathing(Utils.convertInt(cmbSelfShift2Bathing
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Toilet(Utils.convertInt(cmbSelfShift2ToiletUse
				.getSelectedItem().toString()));
		refForm2.setSelfShift2Ambulation(Utils
				.convertInt(cmbSelfShift2Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift2WCAmbulation(Utils
				.convertInt(cmbSelfShift2WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift2Bathing(Utils.convertInt(cmbSelfShift2Bathing
				.getSelectedItem().toString()));

		refForm2.setSupportShift2Mobility(Utils
				.convertInt(cmbSupportShift2Mobility.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Transfer(Utils
				.convertInt(cmbSupportShift2Transfer.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Dressing(Utils
				.convertInt(cmbSupportShift2Dressing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Eating(Utils.convertInt(cmbSupportShift2Eating
				.getSelectedItem().toString()));
		refForm2.setSupportShift2Hygiene(Utils
				.convertInt(cmbSupportShift2Hygiene.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Bathing(Utils
				.convertInt(cmbSupportShift2Bathing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Toilet(Utils
				.convertInt(cmbSupportShift2ToiletUse.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Ambulation(Utils
				.convertInt(cmbSupportShift2Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2WCAmbulation(Utils
				.convertInt(cmbSupportShift2WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift2Bathing(Utils
				.convertInt(cmbSupportShift2Bathing.getSelectedItem()
						.toString()));

		refForm2.setWalkerShift2(cbWalkerShift2.isSelected());
		refForm2.setCaneShift2(cbCaneShift2.isSelected());
		refForm2.setSlideBoardShift2(cbSlideBoardShift2.isSelected());
		refForm2.setManuallyShift2(cbManuallyShift2.isSelected());
		refForm2.setMechanicallyShift2(cbMechanicallyShift2.isSelected());

		// shift3

		refForm2.setSelfShift3Mobility(Utils.convertInt(cmbSelfShift3Mobility
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Transfer(Utils.convertInt(cmbSelfShift3Transfer
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Dressing(Utils.convertInt(cmbSelfShift3Dressing
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Eating(Utils.convertInt(cmbSelfShift3Eating
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Hygiene(Utils.convertInt(cmbSelfShift3Hygiene
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Bathing(Utils.convertInt(cmbSelfShift3Bathing
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Toilet(Utils.convertInt(cmbSelfShift3ToiletUse
				.getSelectedItem().toString()));
		refForm2.setSelfShift3Ambulation(Utils
				.convertInt(cmbSelfShift3Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift3WCAmbulation(Utils
				.convertInt(cmbSelfShift3WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSelfShift3Bathing(Utils.convertInt(cmbSelfShift3Bathing
				.getSelectedItem().toString()));

		refForm2.setSupportShift3Mobility(Utils
				.convertInt(cmbSupportShift3Mobility.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Transfer(Utils
				.convertInt(cmbSupportShift3Transfer.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Dressing(Utils
				.convertInt(cmbSupportShift3Dressing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Eating(Utils.convertInt(cmbSupportShift3Eating
				.getSelectedItem().toString()));
		refForm2.setSupportShift3Hygiene(Utils
				.convertInt(cmbSupportShift3Hygiene.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Bathing(Utils
				.convertInt(cmbSupportShift3Bathing.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Toilet(Utils
				.convertInt(cmbSupportShift3ToiletUse.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Ambulation(Utils
				.convertInt(cmbSupportShift3Ambulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3WCAmbulation(Utils
				.convertInt(cmbSupportShift3WCAmbulation.getSelectedItem()
						.toString()));
		refForm2.setSupportShift3Bathing(Utils
				.convertInt(cmbSupportShift3Bathing.getSelectedItem()
						.toString()));

		refForm2.setWalkerShift3(cbWalkerShift3.isSelected());
		refForm2.setCaneShift3(cbCaneShift3.isSelected());
		refForm2.setSlideBoardShift3(cbSlideBoardShift3.isSelected());
		refForm2.setManuallyShift3(cbManuallyShift3.isSelected());
		refForm2.setMechanicallyShift3(cbMechanicallyShift3.isSelected());

		try {
			Global.currentDailySkilledNursesNotesForm2Key = MedrexClientManager
					.getInstance().insertOrUpdateDailySkilledNursesNotesForm2(
							refForm2);
			// System.out.println("rows===========: "+ rows.size());
			for (int i = 0; i < 17; i++) {
				panelRows[i].doSave();
			}
			// System.out.println("rows: "+ rows.size());
			MedrexClientManager.getInstance()
					.insertOrUpdateDailySkilledNursesNotesRows(rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void doUpdate() {
		updateData();
	}

	public void updateData() {
		try {
			ResidentMain rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtLastName.setText(rm.getUserPass());
			txtMiddleName.setText("");
			txtFirstName.setText(rm.getUserName());
			// txtRoomBed.setText(rm.getRoom());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// System.out.println("form key is:"+Global.currentDailySkilledNursesNotesKey);
		if (Global.currentDailySkilledNursesNotesKey == 0) {
			rows = new ArrayList<DailySkilledNursesNotesRow>();
		} else {
			DailySkilledNursesNotesForm2 refDailySkilledNursesNotesForm2 = null;
			try {
				refDailySkilledNursesNotesForm2 = MedrexClientManager
						.getInstance().getDailySkilledNursesNotesForm2(
								Global.currentDailySkilledNursesNotesKey);
				Global.currentDailySkilledNursesNotesForm2Key = refDailySkilledNursesNotesForm2
						.getSerial();
				// --------------
				cbMechanicallyShift3
						.setSelected(refDailySkilledNursesNotesForm2
								.isMechanicallyShift3());
				cbManuallyShift3.setSelected(refDailySkilledNursesNotesForm2
						.isManuallyShift3());
				cbSlideBoardShift3.setSelected(refDailySkilledNursesNotesForm2
						.isSlideBoardShift3());
				cbCaneShift3.setSelected(refDailySkilledNursesNotesForm2
						.isCaneShift3());
				cbWalkerShift3.setSelected(refDailySkilledNursesNotesForm2
						.isWalkerShift3());
				cbMechanicallyShift2
						.setSelected(refDailySkilledNursesNotesForm2
								.isMechanicallyShift2());
				cbManuallyShift2.setSelected(refDailySkilledNursesNotesForm2
						.isManuallyShift2());
				cbSlideBoardShift2.setSelected(refDailySkilledNursesNotesForm2
						.isSlideBoardShift2());
				cbCaneShift2.setSelected(refDailySkilledNursesNotesForm2
						.isCaneShift2());
				cbWalkerShift2.setSelected(refDailySkilledNursesNotesForm2
						.isWalkerShift2());
				cbMechanicallyShift1
						.setSelected(refDailySkilledNursesNotesForm2
								.isMechanicallyShift1());
				cbManuallyShift1.setSelected(refDailySkilledNursesNotesForm2
						.isManuallyShift1());
				cbSlideBoardShift1.setSelected(refDailySkilledNursesNotesForm2
						.isSlideBoardShift1());
				cbCaneShift1.setSelected(refDailySkilledNursesNotesForm2
						.isCaneShift1());
				cbWalkerShift1.setSelected(refDailySkilledNursesNotesForm2
						.isWalkerShift1());
				cmbSupportShift3WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3WCAmbulation()
								+ "");
				cmbSupportShift3Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Ambulation()
								+ "");
				cmbSupportShift3ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Toilet()
								+ "");
				cmbSupportShift3Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Bathing()
								+ "");
				cmbSupportShift3Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Hygiene()
								+ "");
				cmbSupportShift3Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Eating()
								+ "");
				cmbSelfShift3WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3WCAmbulation()
								+ "");
				cmbSelfShift3Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Ambulation()
								+ "");
				cmbSelfShift3ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Toilet()
								+ "");
				cmbSelfShift3Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Bathing()
								+ "");
				cmbSelfShift3Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Hygiene()
								+ "");
				cmbSelfShift3Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Eating()
								+ "");
				cmbSupportShift3Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Dressing()
								+ "");
				cmbSelfShift3Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Dressing()
								+ "");
				cmbSupportShift3Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Transfer()
								+ "");
				cmbSelfShift3Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Transfer()
								+ "");
				cmbSupportShift3Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift3Mobility()
								+ "");
				cmbSelfShift3Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift3Mobility()
								+ "");
				cmbSupportShift2WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2WCAmbulation()
								+ "");
				cmbSupportShift2Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Ambulation()
								+ "");
				cmbSupportShift2ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Toilet()
								+ "");
				cmbSupportShift2Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Bathing()
								+ "");
				cmbSupportShift2Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Hygiene()
								+ "");
				cmbSupportShift2Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Eating()
								+ "");
				cmbSupportShift2Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Dressing()
								+ "");
				cmbSupportShift2Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Transfer()
								+ "");
				cmbSupportShift2Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift2Mobility()
								+ "");
				cmbSelfShift2WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2WCAmbulation()
								+ "");
				cmbSelfShift2Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Ambulation()
								+ "");
				cmbSelfShift2ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Toilet()
								+ "");
				cmbSelfShift2Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Bathing()
								+ "");
				cmbSelfShift2Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Hygiene()
								+ "");
				cmbSelfShift2Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Eating()
								+ "");
				cmbSelfShift2Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Dressing()
								+ "");
				cmbSelfShift2Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Transfer()
								+ "");
				cmbSelfShift2Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift2Mobility()
								+ "");
				cmbSupportShift1WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1WCAmbulation()
								+ "");
				cmbSupportShift1Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Ambulation()
								+ "");
				cmbSupportShift1ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Toilet()
								+ "");
				cmbSupportShift1Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Bathing()
								+ "");
				cmbSupportShift1Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Hygiene()
								+ "");
				cmbSupportShift1Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Eating()
								+ "");
				cmbSupportShift1Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Dressing()
								+ "");
				cmbSupportShift1Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Transfer()
								+ "");
				cmbSelfShift1WCAmbulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1WCAmbulation()
								+ "");
				cmbSelfShift1Ambulation
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Ambulation()
								+ "");
				cmbSelfShift1ToiletUse
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Toilet()
								+ "");
				cmbSelfShift1Bathing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Bathing()
								+ "");
				cmbSelfShift1Hygiene
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Hygiene()
								+ "");
				cmbSelfShift1Eating
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Eating()
								+ "");
				cmbSelfShift1Dressing
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Dressing()
								+ "");
				cmbSelfShift1Transfer
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Transfer()
								+ "");
				cmbSupportShift1Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSupportShift1Mobility()
								+ "");
				cmbSelfShift1Mobility
						.setSelectedItem(refDailySkilledNursesNotesForm2
								.getSelfShift1Mobility()
								+ "");

				// --------------
				rows = MedrexClientManager.getInstance()
						.getDailySkilledNursesNotesRows(
								refDailySkilledNursesNotesForm2.getSerial());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0, j = 0; i < 17; i++) {
			DailySkilledNursesNotesRow row = null;
			if (rows.size() > 0 && j < rows.size()) {
				row = rows.get(j);
			}
			if (row != null) {
				System.out.println("row is" + row);
				if (i + 1 == row.getRowSerial()) {
					panelRows[i].updateData(row);
					j++;
				}
			} else {
				panelRows[i].updateData(null);
			}
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}
