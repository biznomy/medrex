package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.resident.ResidentDiagnosis;

import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelDiagnosisTemp extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5179245085694013771L;
	private medrex.client.main.physicanOrders.physicianOrderScreen.PhysicianOrdersDiagnosisJTable physicianOrdersDiagnosisJTable;
	private JxTable tableDiagnosis;

	public PanelDiagnosisTemp() {

		setLayout(new BorderLayout());

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setPreferredSize(new Dimension(0, 30));
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		diagnosisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		diagnosisLabel.setText("DIAGNOSIS");
		diagnosisLabel.setForeground(ColorConstants.DEF_COLOR);
		add(diagnosisLabel, BorderLayout.NORTH);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.getViewport().setBackground(Color.WHITE);
		scrollPane_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1,
				false));
		scrollPane_1.setPreferredSize(new Dimension(500, 80));
		setBackground(Color.WHITE);
		add(scrollPane_1);
		// setArc(1.0f);
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));

		tableDiagnosis = new JxTable() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -8427106388364821286L;

			@Override
			public Class getColumnClass(int column) {
				return getValueAt(0, column).getClass();
			}
		};
		physicianOrdersDiagnosisJTable = new PhysicianOrdersDiagnosisJTable();
		tableDiagnosis.setModel(physicianOrdersDiagnosisJTable);
		scrollPane_1.setViewportView(tableDiagnosis);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(50, 0));
		add(panel, BorderLayout.WEST);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(50, 0));
		add(panel_1, BorderLayout.EAST);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setPreferredSize(new Dimension(0, 350));
		add(panel_2, BorderLayout.SOUTH);
		setPreferredSize(new Dimension(800, 400));
		panel_2.add(new PanelPhysicanOrderMedication());

		updateDiagnosisJTable();
		setArc(1.0f);

	}

	public void updateDiagnosisJTable() {
		List l = new ArrayList();
		try {
			l = MedrexClientManager.getInstance().getResidentDiagnosiss(
					Global.currentResidenceKey);

			// l = M.getInstance()
			// .getResidentDiagnosiss(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		physicianOrdersDiagnosisJTable.setNewList(l);
		physicianOrdersDiagnosisJTable.fireTableStructureChanged();
		tableDiagnosis.updateUI();
		tableDiagnosis.repaint();
	}

}

class PhysicianOrdersDiagnosisJTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Diagnosis", "Status", "Added",
			"Confirmed", "Discontinue" };

	public List l;

	int n = 0;

	PhysicianOrdersDiagnosisJTable(List records) {
		l = records;
	}

	PhysicianOrdersDiagnosisJTable() {
		l = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		if (column == 2) {
			return true;
		} else {
			return false;
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List records) {
		l = records;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			ResidentDiagnosis rc = (ResidentDiagnosis) l.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			switch (col) {
			case 0:
				return (rc.getName());
			case 1:
				if (rc.isDiscontinued()) {
					return "D"; // Discontinue
				} else {
					return rc.isConfirmed() ? "C" : "NC"; // C - Confirmed, NC -
					// Not Confirmed
				}
			case 2:
				return (df.format(rc.getDateCreated()));
			case 3:
				return rc.isConfirmed() ? (df).format(rc.getDateConfirmed())
						: "";
			case 4:
				return rc.isDiscontinued() ? (df).format(rc
						.getDateDiscontinued()) : "";
			case 5:
				return ""
						+ (rc.isDiscontinued() ? "Recontinue" : "Discontinue");
			case 6:
				return (rc.getSerial() + "");
			case 7:
				return rc;
			default:
				return ("");
			}
		} catch (Exception e) {
			return ("");
		}
	}

}
