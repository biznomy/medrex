package medrex.client.main.labReports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.reports.Report;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelLabReports extends JPanel {
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private LabReportsJTable labReportsJTable;

	public PanelLabReports() {
		super();

		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 20, 720, 418);
		add(panel);

		final JLabel labReportsLabel = new JLabel();
		labReportsLabel.setForeground(DEF_COL);
		labReportsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labReportsLabel.setBounds(10, 10, 700, 30);
		labReportsLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		labReportsLabel.setText("Lab Reports");
		panel.add(labReportsLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 680, 260);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		labReportsJTable = new LabReportsJTable();
		table.setModel(labReportsJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) labReportsJTable.getValueAt(
							table.getSelectedRow(), 3)).intValue();
					if (id != 0) {
						PanelLabReportsDetailInfo repInfo = new PanelLabReportsDetailInfo(
								id);
						JDialog f = new JDialog();
						f.setTitle("Lab Reports");
						f.setSize(925, 650);
						f.getContentPane().add(repInfo);
						f
								.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
						SwingUtils.center(f);
						f.setVisible(true);
						doUpdate();
					}
				}
			}
		});
		scrollPane.setViewportView(table);

		/*
		 * final JxButton btnView = new JxButton(0.4f);
		 * btnView.setBackground(Color.WHITE); btnView.setForeground(DEF_COL);
		 * btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		 * btnView.setBounds(437, 318, 111, 26); btnView.setFont(new Font("",
		 * Font.BOLD, 12)); btnView.addActionListener(new ActionListener() {
		 * public void actionPerformed(final ActionEvent e) {
		 * 
		 * } }); btnView.setText("View"); panel.add(btnView);
		 */

		/*
		 * final JxButton btnDelete = new JxButton(0.4f);
		 * btnDelete.setBackground(Color.WHITE);
		 * btnDelete.setForeground(DEF_COL); btnDelete.setBorder(new
		 * LineBorder(BORDER_COL, 1, false)); btnDelete.setBounds(554, 318, 70,
		 * 26); btnDelete.setFont(new Font("", Font.BOLD, 12));
		 * btnDelete.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) {
		 * 
		 * } }); btnDelete.setText("Delete"); panel.add(btnDelete);
		 */

		/*
		 * final JxButton btnCancel = new JxButton(0.4f);
		 * btnCancel.setBackground(Color.WHITE);
		 * btnCancel.setForeground(DEF_COL); btnCancel.setBorder(new
		 * LineBorder(BORDER_COL, 1, false)); btnCancel.setFont(new Font("",
		 * Font.BOLD, 12)); btnCancel.setText("Cancel");
		 * btnCancel.setBounds(630, 318, 70, 26); panel.add(btnCancel);
		 */
	}

	public void doUpdate() {
		updateLabReportsJTable();
	}

	public void updateLabReportsJTable() {
		List labRecords = new ArrayList();

		if (Global.currentResidenceKey != 0) {

			try {
				labRecords = MedrexClientManager.getInstance()
						.getLabReportList(Global.currentResidenceKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		labReportsJTable.setNewList(labRecords);
		labReportsJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	class LabReportsJTable extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private String[] columnNames = { "Resident Name", "Lab Report Title",
				"Date" };

		public List labRecords;

		int n = 0;

		LabReportsJTable(List labRecords) {
			this.labRecords = labRecords;
		}

		LabReportsJTable() {
			this.labRecords = new ArrayList();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return (labRecords.size());
		}

		public void setRowCount(int count) {
			n = n + count;
		}

		public void setNewList(List labRecords) {
			this.labRecords = labRecords;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			try {
				Object o = labRecords.get(row);
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("MM / dd / yyyy");
				if (o instanceof Report) {
					Report rep = (Report) o;

					if (col == 0) {
						if (rep.isNew()) {
							return "<html><b>"
									+ (rep.getLastName() + ", "
											+ rep.getFirstName() + "")
									+ "</b></html>";
						} else {
							return (rep.getLastName() + ", "
									+ rep.getFirstName() + "");
						}

					}
					if (col == 1) {
						if (rep.isNew()) {
							return "<html><b>" + (rep.getReportTitle() + "")
									+ "</b></html>";
						} else {
							return (rep.getReportTitle() + "");
						}

					}
					if (col == 2) {
						return (df.format(rep.getReportDate()));
					}
					if (col == 3) {
						return (rep.getSerial() + "");
					}
					return ("");
				}
				return ("");
			}

			catch (Exception e) {
				return ("");
			}
		}
	}
}
