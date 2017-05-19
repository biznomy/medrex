package medrex.client.main.resident.scan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelScanForm extends JPanel {

	private JComboBox cmbFormType;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JxTable table;

	private ScanFormJTable scanFormTable;

	// public FrameScanResidentFormAdd frameScanFormAdd;

	/**
	 * Create the panel
	 */
	public PanelScanForm() {
		super();
		// Global.panelScanForm = this;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(698, 396));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.setBounds(10, 10, 678, 298);
		panel.add(scrollPane);

		table = new JxTable();
		scanFormTable = new ScanFormJTable();
		table.setModel(scanFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					String file = (String) scanFormTable.getValueAt(table
							.getSelectedRow(), 4);
					Global.currentScanFormImageFileName = file;
					FrameScanResidentFormAdd frameScanFormAdd = (FrameScanResidentFormAdd) FrameFactory
							.createWindowOfType(FrameScanResidentFormAdd.class);
					SwingUtils.center(frameScanFormAdd);
					frameScanFormAdd.setTitle("View Scan Record");
					frameScanFormAdd.setModal(true);
					frameScanFormAdd.setVisible(true);
					frameScanFormAdd = null;
					updateScanFormJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				Global.currentScanFormImageFileName = null;
				FrameScanResidentFormAdd frameScanFormAdd = (FrameScanResidentFormAdd) FrameFactory
						.createWindowOfType(FrameScanResidentFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New Scan Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				frameScanFormAdd = null;
				updateScanFormJTable();
			}
		});
		btnAdd.setText("Scan New");
		btnAdd.setBounds(248, 314, 99, 26);
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setForeground(DEF_COLOR);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					String file = (String) scanFormTable.getValueAt(table
							.getSelectedRow(), 4);
					Global.currentScanFormImageFileName = file;
					FrameScanResidentFormAdd frameScanFormAdd = (FrameScanResidentFormAdd) FrameFactory
							.createWindowOfType(FrameScanResidentFormAdd.class);
					SwingUtils.center(frameScanFormAdd);
					frameScanFormAdd.setTitle("View Scan Record");
					frameScanFormAdd.setModal(true);
					frameScanFormAdd.setVisible(true);
					frameScanFormAdd = null;
					updateScanFormJTable();
				} catch (Exception ve) {
					ve.printStackTrace();
				}
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View");
		btnView.setBounds(353, 314, 111, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					String file = (String) scanFormTable.getValueAt(table
							.getSelectedRow(), 4);
					MedrexClientManager
							.getInstance()
							.deleteScanForm(
									Global.currentResidenceKey,
									Global.currentResidentTabs.RESIDENT_INFORMATION.Name,
									file);
				} catch (Exception xe) {
					xe.printStackTrace();
				}
				updateScanFormJTable();
			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(470, 314, 106, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(582, 314, 106, 26);
		panel.add(btnCancel);

		doUpdate();
	}

	public void doUpdate() {
		updateScanFormJTable();
	}

	public void updateScanFormJTable() {
		List<ScanForm> scanRecords = null;
		try {
			scanRecords = MedrexClientManager.getInstance().doLoadScans(
					Global.currentResidenceKey,
					Global.currentResidentTabs.RESIDENT_INFORMATION.Name);
			System.out.println("scanRecords : " + scanRecords.size());
			/*
			 * Collections.sort(scanRecords, new Comparator() { // +1 if a > b
			 * // 0 if a = b // -1 if a < b public int compare(final Object a,
			 * final Object b) { Date aDate, bDate; aDate = new Date(((File)
			 * a).lastModified()); bDate = new Date(((File) b).lastModified());
			 * 
			 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
			 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
			 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		scanFormTable.setNewList(scanRecords);
		scanFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class ScanFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private String[] columnNames = { "Scanned Forms" };
	private String[] columnNames = { "Document Name", "Date", "Status" };

	public List scanFormsRecords;

	int n = 0;

	ScanFormJTable(List scanFormRecords) {
		this.scanFormsRecords = scanFormRecords;
	}

	ScanFormJTable() {
		scanFormsRecords = null;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (scanFormsRecords == null) {
			return (0);
		} else {
			return (scanFormsRecords.size());
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List scanFormRecords) {
		this.scanFormsRecords = scanFormRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {
			/*
			 * ScanForm rc = (ScanForm) scanFormsRecords .get(row); if (col ==
			 * 0) { return (rc.getDateCreated() + ""); }
			 */
			ScanForm rc = (ScanForm) scanFormsRecords.get(row);

			if (col == 0) {
				return rc.getScanFormType();
			}
			if (col == 1) {
				return rc.getDateCreated();
			}
			if (col == 2) {
				return ("Completed");
			}
			if (col == 4) {
				return rc.getFileName();
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
