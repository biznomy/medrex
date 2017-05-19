package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.vo.monthlySummary.InterdisciplinaryCarePlanRow;

import com.toedter.calendar.JDateChooser;

public class PanelInterdisciplinaryCarePlanRow extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3503424918390510159L;
	private JTextArea txtOutcomes;
	private JTextArea txtApproaches;
	private JTextField txtDepartment;
	private JTextArea txtProblem;
	private JTextArea txtGoals;
	private JDateChooser dcDateAdded;
	private JDateChooser dcTargetDate;
	private JDateChooser dcDate;
	private InterdisciplinaryCarePlanRow row;

	public PanelInterdisciplinaryCarePlanRow() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1460, 714));

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 1417, 36);
		panel_1.setBackground(Color.WHITE);
		add(panel_1);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setPreferredSize(new Dimension(1460, 35));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(0);
		flowLayout_8.setHgap(0);
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(0);
		flowLayout_9.setHgap(0);
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setVgap(0);
		flowLayout_10.setHgap(0);

		dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(0, 1, 100, 34);
		dcDate.setPreferredSize(new Dimension(100, 34));
		panel_1.add(dcDate);

		final JPanel panel_3 = new JPanel();
		panel_3.setBounds(101, 0, 300, 34);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setPreferredSize(new Dimension(300, 42));
		panel_1.add(panel_3);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setPreferredSize(new Dimension(300, 34));
		panel_3.add(scrollPane);

		txtProblem = new JTextArea();
		scrollPane.setViewportView(txtProblem);

		final JPanel panel_4 = new JPanel();
		panel_4.setBounds(401, 0, 250, 34);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		panel_4.setLayout(flowLayout_2);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setPreferredSize(new Dimension(250, 42));
		panel_1.add(panel_4);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(250, 34));
		panel_4.add(scrollPane_1);

		txtGoals = new JTextArea();
		scrollPane_1.setViewportView(txtGoals);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(651, 0, 100, 34);
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(0);
		panel_5.setLayout(flowLayout_3);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setPreferredSize(new Dimension(100, 42));
		panel_1.add(panel_5);

		dcTargetDate = new JDateChooser();
		dcTargetDate.setBackground(Color.WHITE);
		dcTargetDate.setPreferredSize(new Dimension(100, 34));
		panel_5.add(dcTargetDate);

		final JPanel panel_6 = new JPanel();
		panel_6.setBounds(751, 0, 80, 34);
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_6.setLayout(flowLayout_4);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setPreferredSize(new Dimension(80, 42));
		panel_1.add(panel_6);

		txtDepartment = new JTextField();
		txtDepartment.setPreferredSize(new Dimension(80, 34));
		panel_6.add(txtDepartment);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(831, 0, 100, 34);
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(0);
		flowLayout_5.setHgap(0);
		panel_7.setLayout(flowLayout_5);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setPreferredSize(new Dimension(100, 42));
		panel_1.add(panel_7);

		dcDateAdded = new JDateChooser();
		dcDateAdded.setBackground(Color.WHITE);
		dcDateAdded.setPreferredSize(new Dimension(100, 34));
		panel_7.add(dcDateAdded);

		final JPanel panel_8 = new JPanel();
		panel_8.setBounds(931, 0, 350, 34);
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setVgap(0);
		flowLayout_6.setHgap(0);
		panel_8.setLayout(flowLayout_6);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setPreferredSize(new Dimension(350, 42));
		panel_1.add(panel_8);

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setPreferredSize(new Dimension(350, 34));
		panel_8.add(scrollPane_2);

		txtApproaches = new JTextArea();
		scrollPane_2.setViewportView(txtApproaches);

		final JPanel panel_9 = new JPanel();
		panel_9.setBounds(1282, 0, 135, 34);
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setVgap(0);
		flowLayout_7.setHgap(0);
		panel_9.setLayout(flowLayout_7);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setPreferredSize(new Dimension(140, 34));
		panel_1.add(panel_9);

		final JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_3.setPreferredSize(new Dimension(133, 33));
		panel_9.add(scrollPane_3);

		txtOutcomes = new JTextArea();
		scrollPane_3.setViewportView(txtOutcomes);

	}

	public static void main(String arg[]) {
		JFrame frm = new JFrame();
		frm.setLayout(null);
		PanelInterdisciplinaryCarePlanRow row = new PanelInterdisciplinaryCarePlanRow();
		row.setBounds(20, 20, 900, 44);
		frm.getContentPane().add(row);
		frm.setSize(new Dimension(900, 200));
		frm.setVisible(true);

	}

	public void doSave() {
		InterdisciplinaryCarePlanRow refInterDisciplinaryCarePlanRow = new InterdisciplinaryCarePlanRow();
		refInterDisciplinaryCarePlanRow
				.setResidentId(Global.currentResidenceKey);

		refInterDisciplinaryCarePlanRow.setOutcomes(txtOutcomes.getText());
		refInterDisciplinaryCarePlanRow.setApproaches(txtApproaches.getText());
		refInterDisciplinaryCarePlanRow.setDepartment(txtDepartment.getText());
		refInterDisciplinaryCarePlanRow.setProblem(txtProblem.getText());
		refInterDisciplinaryCarePlanRow.setGoals(txtGoals.getText());
		refInterDisciplinaryCarePlanRow.setDateAdded(dcDateAdded.getDate());
		refInterDisciplinaryCarePlanRow.setTargetDate(dcTargetDate.getDate());
		refInterDisciplinaryCarePlanRow.setDateOfCarePlan(dcDate.getDate());

		setValueObject(refInterDisciplinaryCarePlanRow);
	}

	public void doUpdate() {
		InterdisciplinaryCarePlanRow refInterDisciplinaryCarePlanRow = getValueObject();
		txtOutcomes.setText(refInterDisciplinaryCarePlanRow.getOutcomes());
		txtApproaches.setText(refInterDisciplinaryCarePlanRow.getApproaches());
		txtDepartment.setText(refInterDisciplinaryCarePlanRow.getDepartment());
		txtProblem.setText(refInterDisciplinaryCarePlanRow.getProblem());
		txtGoals.setText(refInterDisciplinaryCarePlanRow.getGoals());
		dcDateAdded.setDate(refInterDisciplinaryCarePlanRow.getDateAdded());
		dcTargetDate.setDate(refInterDisciplinaryCarePlanRow.getTargetDate());
		dcDate.setDate(refInterDisciplinaryCarePlanRow.getDateOfCarePlan());
	}

	public void setValueObject(InterdisciplinaryCarePlanRow interDrow) {
		row = interDrow;
		doUpdate();
	}

	public InterdisciplinaryCarePlanRow getValueObject() {
		return row;
	}
}
