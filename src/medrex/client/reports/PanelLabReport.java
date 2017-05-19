package medrex.client.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

import medrex.commons.enums.GuiModes;
import medrex.commons.vo.reports.LabReport;
import medrex.commons.vo.reports.LabReportTest;

import com.sX.swing.JxTable;

public class PanelLabReport extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8940682867203813885L;
	private JLabel reportTypeLabel;
	private JTextField txtReportType;
	private JLabel residentNameLabel_1;
	private JTextField txtResidentName;
	private JTextField txtResidentId;
	private JLabel residentNameLabel;
	private JLabel labReportLabel;
	private JPanel panel;
	private JxTable table;
	private LabReportTestsJTable labTestRecordTable;
	private JScrollPane scrollPane;

	private LabReport labReport;

	public PanelLabReport(LabReport labReport) {
		super();
		setBackground(Color.WHITE);
		this.labReport = labReport;
		setPreferredSize(new Dimension(750, 768));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 725, 441);
		add(panel);

		labReportLabel = new JLabel();
		labReportLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		labReportLabel.setFont(new Font("", Font.BOLD, 16));
		labReportLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labReportLabel.setText("LAB REPORT");
		labReportLabel.setBounds(10, 10, 717, 33);
		panel.add(labReportLabel);

		residentNameLabel = new JLabel();
		residentNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		residentNameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentNameLabel.setText("Resident Id:");
		residentNameLabel.setBounds(10, 77, 102, 14);
		panel.add(residentNameLabel);

		txtResidentId = new JTextField();
		txtResidentId.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtResidentId.setBounds(118, 74, 199, 21);
		panel.add(txtResidentId);

		txtResidentName = new JTextField();
		txtResidentName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtResidentName.setBounds(118, 101, 199, 21);
		panel.add(txtResidentName);

		residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		residentNameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentNameLabel_1.setText("Resident Name:");
		residentNameLabel_1.setBounds(10, 104, 102, 14);
		panel.add(residentNameLabel_1);

		txtReportType = new JTextField();
		txtReportType.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtReportType.setBounds(118, 128, 199, 21);
		panel.add(txtReportType);

		reportTypeLabel = new JLabel();
		reportTypeLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		reportTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		reportTypeLabel.setText("Report Type:");
		reportTypeLabel.setBounds(10, 131, 102, 14);
		panel.add(reportTypeLabel);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 693, 244);
		panel.add(scrollPane);

		table = new JxTable();
		labTestRecordTable = new LabReportTestsJTable();
		table.setModel(labTestRecordTable);

		scrollPane.setViewportView(table);

		updateData();
	}

	private void updateData() {
		txtResidentId.setText(labReport.getPatientId() + "");
		txtResidentName.setText(labReport.getPatientLastName() + ", "
				+ labReport.getPatientFirstName());
		txtReportType.setText(labReport.getType());
		List l = labReport.getTestResults();
		// System.out.println(l.size());
		labTestRecordTable.setNewList(l);
		labTestRecordTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();

	}
}

class LabReportTestsJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Test", "Result", "Status", "Units",
			"Range" };

	public List listOfTest;

	int n = 0;

	LabReportTestsJTable(List testRecords) {
		listOfTest = testRecords;
	}

	LabReportTestsJTable() {
		listOfTest = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (listOfTest.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ptOtStRecords) {
		listOfTest = ptOtStRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			LabReportTest testRec = (LabReportTest) listOfTest.get(row);
			if (col == 0) {
				return (testRec.getName() + "");
			}
			if (col == 1) {
				return (testRec.getResult() + "");
			}
			if (col == 2) {
				return (testRec.getOutOfRange() + "");
			}
			if (col == 3) {
				return (testRec.getUnit() + "");
			}
			if (col == 4) {
				return (testRec.getRange() + "");
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
