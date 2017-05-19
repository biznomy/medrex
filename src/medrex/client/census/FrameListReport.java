package medrex.client.census;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.ComponentPrintable;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusAdmissionReportI;
import medrex.commons.vo.census.CensusDischargeReportI;
import medrex.commons.vo.census.CensusHospitalReportI;
import medrex.commons.vo.census.CensusOutOnPassReportI;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomChange;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameListReport extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1562139738053621569L;
	private JLabel roomChangeLabel;
	private JxTable table;
	private JxTable table2;
	private JxTable table3;
	private JxTable table4;
	private JxTable table5;
	private AdmissionJTable admissionJTable;
	private DischargeJTable dischargeJTable;
	private OutOnPassJTable outOnPassJTable;
	private HospitalJTable hospitalJTable;
	private RoomChnageTableModal refJTableModal;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_1_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_II;
	private JScrollPane scrollPane_II_1;
	private JxTable table_II;
	private JxTable table2_II;
	private JScrollPane scrollPane_II_1_1;
	private JxTable table3_II;
	private JScrollPane scrollPane_II_2;
	private JxTable table4_II;
	private JScrollPane scrollPane_II_3;
	private JxTable table5_II;
	private AdmissionJTable admissionJTable_II;
	private DischargeJTable dischargeJTable_II;
	private OutOnPassJTable outOnPassJTable_II;
	private HospitalJTable hospitalJTable_II;
	private RoomChnageTableModal refJTableModal_II;
	private JLabel roomChangeLabel2;
	public static final Color DEF_COL = new Color(49, 104, 127);

	public FrameListReport() {
		this(null, null, null, null, null, null, null, null,
				MedrexClientManager.getServerTime());
	}

	public FrameListReport(List aList, List dList, List oList, List hList,
			List aList_II, List dList_II, List oList_II, List hList_II,
			Date date) {
		super();
		// setLayout(null);
		setSize(860, 680);
		admissionJTable = new AdmissionJTable();
		dischargeJTable = new DischargeJTable();
		outOnPassJTable = new OutOnPassJTable();
		hospitalJTable = new HospitalJTable();
		refJTableModal = new RoomChnageTableModal();

		admissionJTable_II = new AdmissionJTable();
		dischargeJTable_II = new DischargeJTable();
		outOnPassJTable_II = new OutOnPassJTable();
		hospitalJTable_II = new HospitalJTable();
		refJTableModal_II = new RoomChnageTableModal();

		final JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(true);
		buttonPanel.setForeground(Color.WHITE);
		buttonPanel.setLayout(null);
		buttonPanel.setPreferredSize(new Dimension(0, 30));
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		final JButton closeButton = new JxButton(0.4f);
		closeButton.setBounds(747, 0, 95, 24);
		buttonPanel.add(closeButton);
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameListReport.this.dispose();
			}
		});
		closeButton.setText("Close");

		final JPanel panelContentPane = new JPanel();
		panelContentPane.setLayout(new BorderLayout());
		getContentPane().add(panelContentPane, BorderLayout.CENTER);

		final JScrollPane scrollMain = new JScrollPane();
		panelContentPane.add(scrollMain, BorderLayout.CENTER);

		final JPanel panelMain = new JPanel();
		panelMain.setLayout(null);
		panelMain.setSize(857, 1290);
		panelMain.setPreferredSize(panelMain.getSize());
		// panelMain.setBounds(0, 0, 857, 845);

		scrollMain.setViewportView(panelMain);
		// ---- 1st floor ---//

		final JPanel panelFirstFloor = new JPanel();
		panelMain.add(panelFirstFloor);
		panelFirstFloor.setBackground(Color.WHITE);
		panelFirstFloor.setLayout(null);
		panelFirstFloor.setBounds(0, 0, 857, 645);
		panelFirstFloor.setPreferredSize(panelFirstFloor.getSize());

		scrollPane = new JScrollPane();
		scrollPane.setBounds(223, 38, 597, 106);
		panelFirstFloor.add(scrollPane);

		table = new JxTable();
		table.setModel(admissionJTable);
		scrollPane.setViewportView(table);

		final JLabel admissionLabel = new JLabel();
		admissionLabel.setForeground(DEF_COL);
		admissionLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		admissionLabel.setText("Admission(" + aList.size() + ")");
		admissionLabel.setBounds(10, 38, 207, 27);
		panelFirstFloor.add(admissionLabel);

		final JLabel dischargeLabel = new JLabel();
		dischargeLabel.setForeground(DEF_COL);
		dischargeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		dischargeLabel.setText("Discharge(" + dList.size() + ")");
		dischargeLabel.setBounds(10, 150, 207, 27);
		panelFirstFloor.add(dischargeLabel);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(223, 150, 597, 106);
		panelFirstFloor.add(scrollPane_1);

		table2 = new JxTable();
		table2.setModel(dischargeJTable);
		scrollPane_1.setViewportView(table2);

		final JLabel hospitalLabel = new JLabel();
		hospitalLabel.setForeground(DEF_COL);
		hospitalLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		hospitalLabel.setText("Out On Pass(" + oList.size() + ")");
		hospitalLabel.setBounds(10, 262, 207, 40);
		panelFirstFloor.add(hospitalLabel);

		scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(223, 262, 597, 106);
		panelFirstFloor.add(scrollPane_1_1);

		table3 = new JxTable();
		table3.setModel(outOnPassJTable);
		scrollPane_1_1.setViewportView(table3);

		final JLabel hospitalLabel_1 = new JLabel();
		hospitalLabel_1.setForeground(DEF_COL);
		hospitalLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		hospitalLabel_1.setText("Hospital(" + hList.size() + ")");
		hospitalLabel_1.setBounds(10, 377, 207, 27);
		panelFirstFloor.add(hospitalLabel_1);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(223, 377, 597, 106);
		panelFirstFloor.add(scrollPane_2);

		table4 = new JxTable();
		table4.setModel(hospitalJTable);
		scrollPane_2.setViewportView(table4);

		final JLabel censusDailyReportLabel = new JLabel();
		censusDailyReportLabel.setHorizontalAlignment(SwingConstants.LEFT);
		censusDailyReportLabel.setForeground(DEF_COL);
		censusDailyReportLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		censusDailyReportLabel.setText("Census Report of a Day");
		censusDailyReportLabel.setBounds(10, 0, 417, 27);
		panelFirstFloor.add(censusDailyReportLabel);

		final JLabel firstFloorLabel = new JLabel();
		firstFloorLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstFloorLabel.setForeground(DEF_COL);
		firstFloorLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstFloorLabel.setText("First Floor");
		firstFloorLabel.setBounds(445, 2, 385, 27);
		panelFirstFloor.add(firstFloorLabel);

		roomChangeLabel = new JLabel();
		roomChangeLabel.setForeground(DEF_COL);
		roomChangeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		roomChangeLabel.setText("Room Change");
		roomChangeLabel.setBounds(5, 492, 207, 40);
		panelFirstFloor.add(roomChangeLabel);

		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(223, 492, 597, 106);
		panelFirstFloor.add(scrollPane_3);

		table5 = new JxTable();
		table5.setRowHeight(21);
		table5.setRowMargin(2);
		table5.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		table5.setModel(refJTableModal);
		scrollPane_3.setViewportView(table5);

		// ---- second floor -- //

		final JPanel panel_second = new JPanel();
		panelMain.add(panel_second);
		panel_second.setBackground(Color.WHITE);
		panel_second.setLayout(null);
		panel_second.setBounds(0, 645, 857, 645);
		panel_second.setPreferredSize(panel_second.getSize());

		scrollPane_II = new JScrollPane();
		scrollPane_II.setBounds(223, 38, 597, 106);
		panel_second.add(scrollPane_II);

		table_II = new JxTable();
		table_II.setModel(admissionJTable_II);
		scrollPane_II.setViewportView(table_II);

		final JLabel admissionLabel_2 = new JLabel();
		admissionLabel_2.setForeground(DEF_COL);
		admissionLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		admissionLabel_2.setText("Admission(" + aList_II.size() + ")");
		admissionLabel_2.setBounds(10, 38, 207, 27);
		panel_second.add(admissionLabel_2);

		final JLabel dischargeLabel_2 = new JLabel();
		dischargeLabel_2.setForeground(DEF_COL);
		dischargeLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		dischargeLabel_2.setText("Discharge(" + dList_II.size() + ")");
		dischargeLabel_2.setBounds(10, 150, 207, 27);
		panel_second.add(dischargeLabel_2);

		scrollPane_II_1 = new JScrollPane();
		scrollPane_II_1.setBounds(223, 150, 597, 106);
		panel_second.add(scrollPane_II_1);

		table2_II = new JxTable();
		table2_II.setModel(dischargeJTable_II);
		scrollPane_II_1.setViewportView(table2_II);

		final JLabel hospitalLabel2 = new JLabel();
		hospitalLabel2.setForeground(DEF_COL);
		hospitalLabel2.setFont(new Font("Tahoma", Font.BOLD, 16));
		hospitalLabel2.setText("Out On Pass(" + oList_II.size() + ")");
		hospitalLabel2.setBounds(10, 262, 207, 40);
		panel_second.add(hospitalLabel2);

		scrollPane_II_1_1 = new JScrollPane();
		scrollPane_II_1_1.setBounds(223, 262, 597, 106);
		panel_second.add(scrollPane_II_1_1);

		table3_II = new JxTable();
		table3_II.setModel(outOnPassJTable_II);
		scrollPane_II_1_1.setViewportView(table3_II);

		final JLabel hospitalLabel2_1 = new JLabel();
		hospitalLabel2_1.setForeground(DEF_COL);
		hospitalLabel2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		hospitalLabel2_1.setText("Hospital(" + hList_II.size() + ")");
		hospitalLabel2_1.setBounds(10, 377, 207, 27);
		panel_second.add(hospitalLabel2_1);

		scrollPane_II_2 = new JScrollPane();
		scrollPane_II_2.setBounds(223, 377, 597, 106);
		panel_second.add(scrollPane_II_2);

		table4_II = new JxTable();
		table4_II.setModel(hospitalJTable_II);
		scrollPane_II_2.setViewportView(table4_II);

		final JLabel censusDailyReportLabel2 = new JLabel();
		censusDailyReportLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		censusDailyReportLabel2.setForeground(DEF_COL);
		censusDailyReportLabel2.setFont(new Font("Tahoma", Font.BOLD, 22));
		censusDailyReportLabel2.setText("Census Report of a Day");
		censusDailyReportLabel2.setBounds(10, 0, 417, 27);
		panel_second.add(censusDailyReportLabel2);

		final JLabel firstFloorLabel2 = new JLabel();
		firstFloorLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		firstFloorLabel2.setForeground(DEF_COL);
		firstFloorLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstFloorLabel2.setText("Second Floor");
		firstFloorLabel2.setBounds(447, 2, 385, 27);
		panel_second.add(firstFloorLabel2);

		roomChangeLabel2 = new JLabel();
		roomChangeLabel2.setForeground(DEF_COL);
		roomChangeLabel2.setFont(new Font("Tahoma", Font.BOLD, 16));
		roomChangeLabel2.setText("Room Change");
		roomChangeLabel2.setBounds(5, 492, 207, 40);
		panel_second.add(roomChangeLabel2);

		scrollPane_II_3 = new JScrollPane();
		scrollPane_II_3.setBounds(223, 492, 597, 106);
		panel_second.add(scrollPane_II_3);

		table5_II = new JxTable();
		table5_II.setRowHeight(21);
		table5_II.setRowMargin(2);
		table5_II.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(
				12f).deriveFont(Font.PLAIN));
		table5_II.setModel(refJTableModal_II);
		scrollPane_II_3.setViewportView(table5_II);

		// ---- print all ---- //

		final JButton printAllButton = new JxButton(0.4f);
		printAllButton.setBounds(646, 0, 95, 24);
		buttonPanel.add(printAllButton);
		printAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Book book = new Book();
				PrinterJob printJob = PrinterJob.getPrinterJob();
				PageFormat pageFormat = new PageFormat();
				Paper paper = new Paper();
				paper.setSize(594.992125984252, 841.8897637795276);
				paper.setImageableArea(36.0, 36.0, 522.99212598425197,
						769.8897637795276);
				pageFormat.setPaper(paper);
				pageFormat.setOrientation(PageFormat.PORTRAIT);
				printJob.defaultPage(pageFormat);
				printJob.setCopies(1);
				printJob.setPageable(book);
				Component comp = panelFirstFloor;
				comp.setSize(comp.getPreferredSize());
				ComponentPrintable cp = new ComponentPrintable(comp);
				book.append(cp, pageFormat);

				comp = panel_second;
				comp.setSize(comp.getPreferredSize());
				cp = new ComponentPrintable(comp);
				book.append(cp, pageFormat);

				try {
					printJob.print();
				} catch (Exception PrintException) {
					PrintException.printStackTrace();
				}
				FrameListReport.this.dispose();
			}
		});
		printAllButton.setText("Print");
		printAllButton.setVisible(true);

		// ---- updating data ---//

		updateAdmissionTable(aList);
		updateDischargeTable(dList);
		updateOutOnPassTable(oList);
		updateHospitalTable(hList);
		updateRoomChangeTable(date);

		updateAdmissionTableSecondFloor(aList_II);
		updateDischargeTableSecondFloor(dList_II);
		updateOutOnPassTableSecondFloor(oList_II);
		updateHospitalTableSecondFloor(hList_II);
	}

	private void updateRoomChangeTable(Date date) {
		List<RoomChange> roomlist = new ArrayList<RoomChange>();
		List<RoomChange> roomlist_II = new ArrayList<RoomChange>();
		try {
			roomlist = MedrexClientManager.getInstance()
					.getRoomChangeFirstFloor(date);
			roomlist_II = MedrexClientManager.getInstance()
					.getRoomChangeSecondFloor(date);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refJTableModal.setNewList(roomlist);
		refJTableModal.fireTableStructureChanged();
		table5.updateUI();
		table5.repaint();
		refJTableModal_II.setNewList(roomlist_II);
		refJTableModal_II.fireTableStructureChanged();
		table5_II.updateUI();
		table5_II.repaint();

		roomChangeLabel.setText("Room Change(" + roomlist.size() + ")");
		roomChangeLabel2.setText("Room Change(" + roomlist_II.size() + ")");
	}

	private void updateHospitalTable(List l) {
		hospitalJTable.setNewList(l);
		hospitalJTable.fireTableStructureChanged();
		table4.updateUI();
		table4.repaint();
	}

	private void updateOutOnPassTable(List l) {
		outOnPassJTable.setNewList(l);
		outOnPassJTable.fireTableStructureChanged();
		table3.updateUI();
		table3.repaint();
	}

	private void updateDischargeTable(List l) {
		dischargeJTable.setNewList(l);
		dischargeJTable.fireTableStructureChanged();
		table2.updateUI();
		table2.repaint();
	}

	private void updateAdmissionTable(List l) {
		admissionJTable.setNewList(l);
		admissionJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	private void updateHospitalTableSecondFloor(List l) {
		hospitalJTable_II.setNewList(l);
		hospitalJTable_II.fireTableStructureChanged();
		table4_II.updateUI();
		table4_II.repaint();
	}

	private void updateOutOnPassTableSecondFloor(List l) {
		outOnPassJTable_II.setNewList(l);
		outOnPassJTable_II.fireTableStructureChanged();
		table3_II.updateUI();
		table3_II.repaint();
	}

	private void updateDischargeTableSecondFloor(List l) {
		dischargeJTable_II.setNewList(l);
		dischargeJTable_II.fireTableStructureChanged();
		table2_II.updateUI();
		table2_II.repaint();
	}

	private void updateAdmissionTableSecondFloor(List l) {
		admissionJTable_II.setNewList(l);
		admissionJTable_II.fireTableStructureChanged();
		table_II.updateUI();
		table_II.repaint();
	}

	public static void main(String[] a) {
		new FrameListReport().setVisible(true);
	}

}

class AdmissionJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Resident Name", "Room", "Come From",
			"User" };

	public List admissionRecords;

	int n = 0;

	AdmissionJTable(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	AdmissionJTable() {
		this.admissionRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (admissionRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = admissionRecords.get(row);
			if (o instanceof CensusAdmissionReportI) {
				// if (col == 0) {
				// return (alert.getAbcd());
				// }
				// if (col == 1) {
				// return (alert.getARoom());
				// }
				// if (col == 2) {
				// return (alert.getAComeFrom());
				// }
				// if (col == 3) {
				// return (alert.getAUser());
				// }
				return ("");
			}
			return ("");
		}

		catch (Exception e) {
			return ("");
		}
	}
}

class DischargeJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Resident Name", "Room", "Went To", "User" };

	public List admissionRecords;

	int n = 0;

	DischargeJTable(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	DischargeJTable() {
		this.admissionRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (admissionRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = admissionRecords.get(row);
			if (o instanceof CensusDischargeReportI) {
				return ("");
			}
			return ("");
		}

		catch (Exception e) {
			return ("");
		}
	}
}

class OutOnPassJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Resident Name", "Room", "User" };

	public List admissionRecords;

	int n = 0;

	OutOnPassJTable(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	OutOnPassJTable() {
		this.admissionRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (admissionRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = admissionRecords.get(row);
			if (o instanceof CensusOutOnPassReportI) {
				// if (col == 0) {
				// return (alert.getOResidentId());
				// }
				// if (col == 1) {
				// return (alert.getORoom());
				// }
				// if (col == 2) {
				// return (alert.getOUser());
				// }
				return ("");
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}

class HospitalJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Resident Name", "Hospital", "User" };

	public List admissionRecords;

	int n = 0;

	HospitalJTable(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	HospitalJTable() {
		this.admissionRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (admissionRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List alertRecords) {
		this.admissionRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = admissionRecords.get(row);
			if (o instanceof CensusHospitalReportI) {
				// if (col == 0) {
				// return (alert.getHResidentId());
				// }
				// if (col == 1) {
				// return (alert.getHHospital());
				// }
				// if (col == 2) {
				// return (alert.getHUser());
				// }
				return ("");
			}
			return ("");
		}

		catch (Exception e) {
			return ("");
		}
	}
}

class RoomChnageTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3127805835203490249L;

	private String[] columnNames = { "Resident", "From Room", "To Room" };

	public List<RoomChange> roomChange;

	int n = 0;

	RoomChnageTableModal(List roomChange) {
		this.roomChange = roomChange;
	}

	RoomChnageTableModal() {
		roomChange = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (roomChange.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List roomChange) {
		this.roomChange = roomChange;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = roomChange.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof RoomChange) {
				RoomChange rc = (RoomChange) o;

				if (col == 0) {
					ResidentMain rm = MedrexClientManager.getInstance()
							.getResident(rc.getResidentId());
					return rm.getUserPass() + ", " + rm.getUserName();
				}
				if (col == 1) {
					return (rc.getFromRoom());
				}
				if (col == 2) {
					return (rc.getToRoom());
				}
				/*
				 * if (col == 3) { return (df.format(rc.getStartDate())); } if
				 * (col == 4) { return (df.format(rc.getEndDate())); }
				 */
				return ("");
			}
			return "";
		} catch (Exception e) {
			return ("");
		}

	}
}
