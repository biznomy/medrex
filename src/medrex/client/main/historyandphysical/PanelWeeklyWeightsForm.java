package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsForm;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;

import com.toedter.calendar.JDateChooser;

public class PanelWeeklyWeightsForm extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -390996104216040131L;
	/**
	 * Create the panel
	 */

	PanelWeeklyWeightsFormRow panelRows[];
	List<WeeklyWeightsFormRow> rows;

	JDateChooser dateChooser1;
	JDateChooser dateChooser2;
	JDateChooser dateChooser3;
	JDateChooser dateChooser4;
	JDateChooser dateChooser5;

	public PanelWeeklyWeightsForm() {
		super();
		Global.panelWeeklyWeightsForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1500, 800));
		setLayout(null);

		final JLabel weeklyWeightsLabel = new JLabel();
		weeklyWeightsLabel.setFont(new Font("", Font.BOLD, 16));
		weeklyWeightsLabel.setText("WEEKLY WEIGHTS");
		weeklyWeightsLabel.setBounds(450, 0, 184, 16);
		add(weeklyWeightsLabel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 44, 1500, 746);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1500, 70);
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 248, 70);
		panel_1.add(panel_2);

		final JLabel nameLabel = new JLabel();
		nameLabel.setFont(new Font("", Font.BOLD, 12));
		nameLabel.setText("NAME");
		nameLabel.setBounds(81, 24, 38, 14);
		panel_2.add(nameLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(245, 0, 96, 70);
		panel_1.add(panel_2_1);

		final JLabel nameLabel_1 = new JLabel();
		nameLabel_1.setFont(new Font("", Font.BOLD, 12));
		nameLabel_1.setText("ROOM");
		nameLabel_1.setBounds(28, 24, 39, 14);
		panel_2_1.add(nameLabel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(338, 0, 146, 70);
		panel_1.add(panel_2_1_1);

		final JLabel nameLabel_1_1 = new JLabel();
		nameLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1.setText("PHYSICIAN");
		nameLabel_1_1.setBounds(28, 24, 108, 14);
		panel_2_1_1.add(nameLabel_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(482, 0, 146, 70);
		panel_1.add(panel_2_1_1_1);

		final JLabel nameLabel_1_1_1 = new JLabel();
		nameLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_1.setText("DATE:");
		nameLabel_1_1_1.setBounds(7, 7, 42, 14);
		panel_2_1_1_1.add(nameLabel_1_1_1);

		dateChooser1 = new JDateChooser();
		dateChooser1.setDateFormatString("MM/dd/yyyy");
		dateChooser1.setBounds(10, 24, 126, 20);
		panel_2_1_1_1.add(dateChooser1);

		final JLabel wtPriorToLabel = new JLabel();
		wtPriorToLabel.setFont(new Font("", Font.BOLD, 12));
		wtPriorToLabel.setText("WT. PRIOR TO WKLY");
		wtPriorToLabel.setBounds(7, 50, 129, 14);
		panel_2_1_1_1.add(wtPriorToLabel);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(626, 0, 146, 70);
		panel_1.add(panel_2_1_1_1_1);

		final JLabel nameLabel_1_1_1_1 = new JLabel();
		nameLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_1_1.setText("DATE:");
		nameLabel_1_1_1_1.setBounds(7, 7, 42, 14);
		panel_2_1_1_1_1.add(nameLabel_1_1_1_1);

		dateChooser2 = new JDateChooser();
		dateChooser2.setDateFormatString("MM/dd/yyyy");
		dateChooser2.setBounds(10, 24, 126, 20);
		panel_2_1_1_1_1.add(dateChooser2);

		final JLabel wtPriorToLabel_1 = new JLabel();
		wtPriorToLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		wtPriorToLabel_1.setText("WEEK 1");
		wtPriorToLabel_1.setBounds(7, 50, 129, 14);
		panel_2_1_1_1_1.add(wtPriorToLabel_1);

		final JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_2.setBounds(770, 0, 146, 70);
		panel_1.add(panel_2_1_1_1_2);

		final JLabel nameLabel_1_1_1_2 = new JLabel();
		nameLabel_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_1_2.setText("DATE:");
		nameLabel_1_1_1_2.setBounds(7, 7, 42, 14);
		panel_2_1_1_1_2.add(nameLabel_1_1_1_2);

		dateChooser3 = new JDateChooser();
		dateChooser3.setDateFormatString("MM/dd/yyyy");
		dateChooser3.setBounds(10, 24, 126, 20);
		panel_2_1_1_1_2.add(dateChooser3);

		final JLabel wtPriorToLabel_2 = new JLabel();
		wtPriorToLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		wtPriorToLabel_2.setText("WEEK 2");
		wtPriorToLabel_2.setBounds(7, 50, 129, 14);
		panel_2_1_1_1_2.add(wtPriorToLabel_2);

		final JPanel panel_2_1_1_1_3 = new JPanel();
		panel_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_3.setLayout(null);
		panel_2_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_3.setBounds(913, 0, 146, 70);
		panel_1.add(panel_2_1_1_1_3);

		final JLabel nameLabel_1_1_1_3 = new JLabel();
		nameLabel_1_1_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_1_3.setText("DATE:");
		nameLabel_1_1_1_3.setBounds(7, 7, 42, 14);
		panel_2_1_1_1_3.add(nameLabel_1_1_1_3);

		dateChooser4 = new JDateChooser();
		dateChooser4.setDateFormatString("MM/dd/yyyy");
		dateChooser4.setBounds(10, 24, 126, 20);
		panel_2_1_1_1_3.add(dateChooser4);

		final JLabel wtPriorToLabel_3 = new JLabel();
		wtPriorToLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		wtPriorToLabel_3.setText("WEEK 3");
		wtPriorToLabel_3.setBounds(7, 50, 129, 14);
		panel_2_1_1_1_3.add(wtPriorToLabel_3);

		final JPanel panel_2_1_1_1_4 = new JPanel();
		panel_2_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_4.setLayout(null);
		panel_2_1_1_1_4.setBackground(Color.WHITE);
		panel_2_1_1_1_4.setBounds(1058, 0, 146, 70);
		panel_1.add(panel_2_1_1_1_4);

		final JLabel nameLabel_1_1_1_4 = new JLabel();
		nameLabel_1_1_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_1_4.setText("DATE:");
		nameLabel_1_1_1_4.setBounds(7, 7, 42, 14);
		panel_2_1_1_1_4.add(nameLabel_1_1_1_4);

		dateChooser5 = new JDateChooser();
		dateChooser5.setDateFormatString("MM/dd/yyyy");
		dateChooser5.setBounds(10, 24, 126, 20);
		panel_2_1_1_1_4.add(dateChooser5);

		final JLabel wtPriorToLabel_4 = new JLabel();
		wtPriorToLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		wtPriorToLabel_4.setText("WEEK 4");
		wtPriorToLabel_4.setBounds(7, 50, 129, 14);
		panel_2_1_1_1_4.add(wtPriorToLabel_4);

		final JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_2.setBounds(1202, 0, 105, 70);
		panel_1.add(panel_2_1_1_2);

		final JLabel nameLabel_1_1_2 = new JLabel();
		nameLabel_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_2.setText("SCALE USED");
		nameLabel_1_1_2.setBounds(20, 24, 77, 14);
		panel_2_1_1_2.add(nameLabel_1_1_2);

		final JPanel panel_2_1_1_2_1 = new JPanel();
		panel_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_2_1.setLayout(null);
		panel_2_1_1_2_1.setBackground(Color.WHITE);
		panel_2_1_1_2_1.setBounds(1305, 0, 163, 70);
		panel_1.add(panel_2_1_1_2_1);

		final JLabel nameLabel_1_1_2_1 = new JLabel();
		nameLabel_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel_1_1_2_1.setText("WEIGHTS");
		nameLabel_1_1_2_1.setBounds(20, 24, 77, 14);
		panel_2_1_1_2_1.add(nameLabel_1_1_2_1);

		final JPanel panelForRows = new JPanel();
		panelForRows.setBackground(Color.WHITE);
		panelForRows.setLayout(null);
		panelForRows.setBounds(0, 70, 1469, 676);
		panel.add(panelForRows);

		panelRows = new PanelWeeklyWeightsFormRow[23];

		for (int i = 0; i < 23; i++) {
			panelRows[i] = new PanelWeeklyWeightsFormRow(i + 1);
			panelRows[i].setBounds(0, i * 29, 1500, 30);
			panelForRows.add(panelRows[i]);
		}
		// updateData();
	}

	public int doSave() {

		WeeklyWeightsForm dpnf = new WeeklyWeightsForm();
		dpnf.setResidentId(Global.currentResidenceKey);
		dpnf.setSerial(Global.currentWeeklyWeightsFormKey);

		try {
			Global.currentWeeklyWeightsFormKey = MedrexClientManager
					.getInstance().insertOrUpdateWeeklyWeightsForm(dpnf);
			for (int i = 0; i < panelRows.length; i++) {
				panelRows[i].doSave();
			}
			System.out.println("row size" + rows.size());
			MedrexClientManager.getInstance()
					.insertOrUpdateWeeklyWeightsFormRows(rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentWeeklyWeightsFormKey;
	}

	public void updateData() {

		if (Global.currentWeeklyWeightsFormKey == 0) {
			rows = new ArrayList<WeeklyWeightsFormRow>();

		} else {
			try {
				MedrexClientManager.getInstance().getWeeklyWeightsForm(
						Global.currentWeeklyWeightsFormKey);
				rows = MedrexClientManager.getInstance()
						.getWeeklyWeightsFormRows(
								Global.currentWeeklyWeightsFormKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0, j = 0; i < panelRows.length; i++) {
			WeeklyWeightsFormRow r = null;
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

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public void doUpdate() {
		updateData();

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}