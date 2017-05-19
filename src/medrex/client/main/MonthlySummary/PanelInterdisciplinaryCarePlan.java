package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.InterDisciplinaryCarePlan;
import medrex.commons.vo.monthlySummary.InterdisciplinaryCarePlanRow;

public class PanelInterdisciplinaryCarePlan extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -93972860405551443L;
	private JPanel panel_11;
	private PanelInterdisciplinaryCarePlanRow[] row;

	public PanelInterdisciplinaryCarePlan() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1460, 800));
		setLayout(null);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 100, 1418, 44);
		add(panel_1);
		panel_1.setPreferredSize(new Dimension(1430, 43));
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setLayout(flowLayout);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setPreferredSize(new Dimension(100, 42));
		panel_1.add(panel_2);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateLabel.setText("Date");
		panel_2.add(dateLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setPreferredSize(new Dimension(300, 42));
		panel_1.add(panel_3);

		final JLabel problemNeedstrengthLabel = new JLabel();
		problemNeedstrengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		problemNeedstrengthLabel
				.setText("<html><body><center>Problem,  Need ,Strength ,<br>Potential Problem");
		panel_3.add(problemNeedstrengthLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setPreferredSize(new Dimension(250, 42));
		panel_1.add(panel_4);

		final JLabel goalsLabel = new JLabel();
		goalsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		goalsLabel.setText("Goals");
		panel_4.add(goalsLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(100, 42));
		panel_1.add(panel_5);

		final JLabel targetDateLabel = new JLabel();
		targetDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		targetDateLabel.setText("Target Date");
		panel_5.add(targetDateLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setPreferredSize(new Dimension(80, 42));
		panel_1.add(panel_6);

		final JLabel deptLabel = new JLabel();
		deptLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		deptLabel.setText("Dept.");
		panel_6.add(deptLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setPreferredSize(new Dimension(100, 42));
		panel_1.add(panel_7);

		final JLabel dateAddedLabel = new JLabel();
		dateAddedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateAddedLabel.setText("Date Added");
		panel_7.add(dateAddedLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setPreferredSize(new Dimension(350, 42));
		panel_1.add(panel_8);

		final JLabel approachesLabel = new JLabel();
		approachesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		approachesLabel.setText("Approaches");
		panel_8.add(approachesLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setPreferredSize(new Dimension(136, 42));
		panel_1.add(panel_9);

		final JLabel outcomeLabel = new JLabel();
		outcomeLabel.setPreferredSize(new Dimension(70, 35));
		outcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		outcomeLabel.setText("Outcome");
		panel_9.add(outcomeLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBounds(20, 143, 1418, 578);
		add(panel_10);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(20, 722, 1418, 44);
		add(panel_11);
		panel_11.setLayout(null);

		final JLabel nameLabel = new JLabel();
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameLabel.setText("Name");
		nameLabel.setBounds(0, 10, 54, 14);
		panel_11.add(nameLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(60, 8, 636, 21);
		panel_11.add(textField);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setHgap(0);
		row = new PanelInterdisciplinaryCarePlanRow[17];
		for (int i = 0; i < 17; i++) {
			row[i] = new PanelInterdisciplinaryCarePlanRow();
			row[i].setBounds(1, i * 34, 1420, 34);
			panel_10.add(row[i]);
		}

		final JLabel plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		plazaHealthcareLabel
				.setText("Plaza Healthcare & Rehabilitation Center");
		plazaHealthcareLabel.setBounds(386, 24, 231, 22);
		add(plazaHealthcareLabel);

		final JLabel interdisciplinaryCarePlanLabel = new JLabel();
		interdisciplinaryCarePlanLabel
				.setFont(new Font("Tahoma", Font.BOLD, 14));
		interdisciplinaryCarePlanLabel.setText("INTERDISCIPLINARY CARE PLAN");
		interdisciplinaryCarePlanLabel.setBounds(372, 46, 263, 22);
		add(interdisciplinaryCarePlanLabel);
		doUpdate();
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		InterDisciplinaryCarePlan interDsc = new InterDisciplinaryCarePlan();
		List<InterdisciplinaryCarePlanRow> list = new ArrayList<InterdisciplinaryCarePlanRow>();
		for (int i = 0; i < 17; i++) {
			row[i].doSave();
			InterdisciplinaryCarePlanRow r = row[i].getValueObject();
			list.add(r);
		}
		interDsc.setResidentId(Global.currentResidenceKey);
		interDsc.setFormId(Global.currentMsjnKey);
		interDsc.setSerial(Global.currentInterDisciplinaryFormKey);
		interDsc.setInterDisciplinaryRow(list);
		try {
			Global.currentInterDisciplinaryFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateInterDisciplinaryForm(interDsc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentInterDisciplinaryFormKey;
	}

	public void doUpdate() {
		InterDisciplinaryCarePlan interDsc = null;
		if (Global.currentMsjnKey != 0) {
			try {
				interDsc = MedrexClientManager.getInstance()
						.getInterDisciplinaryForm(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (interDsc != null) {
				Global.currentInterDisciplinaryFormKey = interDsc.getSerial();
				List<InterdisciplinaryCarePlanRow> list = interDsc
						.getInterDisciplinaryRow();
				for (int i = 0; i < 17; i++) {
					InterdisciplinaryCarePlanRow interDrow = list.get(i);
					row[i].setValueObject(interDrow);
				}
			}
		}
	}

	public boolean doValidate() {

		return true;
	}

	public static void main(String ar[]) {
		JScrollPane scroll = new JScrollPane();
		scroll.setBackground(Color.RED);

		JFrame frm = new JFrame();
		PanelInterdisciplinaryCarePlan row = new PanelInterdisciplinaryCarePlan();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scroll.setViewportView(row);
		frm.getContentPane().add(scroll);
		frm.setSize(new Dimension(900, 700));
		frm.setVisible(true);

	}
}
