package medrex.client.census;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.utils.ComponentPrintable;
import medrex.commons.vo.accurities.AcuitiesReport;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameAcuitiesReport extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8315225848149909655L;
	private JxTable table;
	private JxTable table2;
	private AcuitiesFirstFloorJTable acuitiesFirstFloorJTable;
	private AcuitiesSecondFloorJTable acuitiesSecondFloorJTable;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	public static final Color DEF_COL = new Color(49, 104, 127);

	public FrameAcuitiesReport(List accFirstFloorReportList,
			List accSecondFloorReportList, Date date) {
		super();
		setTitle("Acuities Report");
		setLayout(null);
		setSize(1060, 680);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1057, 845);
		panel.setPreferredSize(panel.getSize());
		add(panel);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 67, 1032, 240);
		panel.add(scrollPane);

		table = new JxTable();
		acuitiesFirstFloorJTable = new AcuitiesFirstFloorJTable();
		table.setModel(acuitiesFirstFloorJTable);
		scrollPane.setViewportView(table);

		final JLabel admissionLabel = new JLabel();
		admissionLabel.setForeground(DEF_COL);
		admissionLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		admissionLabel.setText("1st Floor");
		admissionLabel.setBounds(395, 33, 110, 27);
		panel.add(admissionLabel);

		final JLabel dischargeLabel = new JLabel();
		dischargeLabel.setForeground(DEF_COL);
		dischargeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		dischargeLabel.setText("2nd Floor");
		dischargeLabel.setBounds(395, 313, 167, 27);
		panel.add(dischargeLabel);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setBounds(10, 352, 1032, 240);
		panel.add(scrollPane_1);

		table2 = new JxTable();
		acuitiesSecondFloorJTable = new AcuitiesSecondFloorJTable();
		table2.setModel(acuitiesSecondFloorJTable);
		scrollPane_1.setViewportView(table2);

		final JLabel censusDailyReportLabel = new JLabel();
		censusDailyReportLabel.setHorizontalAlignment(SwingConstants.CENTER);
		censusDailyReportLabel.setForeground(DEF_COL);
		censusDailyReportLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dt = df.format(date);
		censusDailyReportLabel.setText("Acuities Report (" + dt + ")");
		censusDailyReportLabel.setBounds(10, 0, 832, 27);
		panel.add(censusDailyReportLabel);

		final JxButton closeButton = new JxButton(0.4f);
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameAcuitiesReport.this.dispose();
			}
		});
		closeButton.setText("Close");
		closeButton.setBounds(467, 612, 95, 24);
		panel.add(closeButton);

		final JxButton printButton = new JxButton(0.4f);
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				printButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent arg0) {
						Book book = new Book();
						PrinterJob printJob = PrinterJob.getPrinterJob();
						PageFormat pageFormat = new PageFormat();
						Paper paper = new Paper();
						paper.setSize(594.992125984252, 841.8897637795276);
						paper.setImageableArea(36.0, 36.0, 522.99212598425197,
								841.8897637795276);
						pageFormat.setPaper(paper);
						pageFormat.setOrientation(PageFormat.LANDSCAPE);
						printJob.defaultPage(pageFormat);
						printJob.setCopies(1);
						printJob.setPageable(book);
						final Component comp = panel;
						comp.setSize(comp.getPreferredSize());
						final ComponentPrintable cp = new ComponentPrintable(
								comp);
						book.append(cp, pageFormat);
						try {
							printJob.print();
						} catch (Exception PrintException) {
							PrintException.printStackTrace();
						}
						FrameAcuitiesReport.this.dispose();
					}
				});
			}
		});
		printButton.setText("Print");
		printButton.setBounds(363, 613, 75, 21);
		panel.add(printButton);

		updateAdmissionTable(accFirstFloorReportList);
		updateDischargeTable(accSecondFloorReportList);
	}

	private void updateAdmissionTable(List l) {
		acuitiesFirstFloorJTable.setNewList(l);
		acuitiesFirstFloorJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	private void updateDischargeTable(List l) {
		acuitiesSecondFloorJTable.setNewList(l);
		acuitiesSecondFloorJTable.fireTableStructureChanged();
		table2.updateUI();
		table2.repaint();
	}
}

class AcuitiesFirstFloorJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Oxygen Therapy", "IV Therapy",
			"Wound Care", "Tube Feeding", "Tracheotomy",
			"Respiratory Services", "Advanced Neuro Care", "Orthopedic Care" };

	public List records;
	List o2 = new ArrayList();
	List iv = new ArrayList();
	List wo = new ArrayList();
	List t = new ArrayList();
	List orthopedicCare = new ArrayList();
	List advancedNeuroCare = new ArrayList();
	List respiratoryServices = new ArrayList();
	List tracheotomy = new ArrayList();

	int n = 0;

	AcuitiesFirstFloorJTable(List records) {
		this.records = records;
	}

	AcuitiesFirstFloorJTable() {
		this.records = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		int max = Math.max(o2.size(), iv.size());
		max = Math.max(max, wo.size());
		max = Math.max(max, t.size());
		max = Math.max(max, orthopedicCare.size());
		max = Math.max(max, advancedNeuroCare.size());
		max = Math.max(max, respiratoryServices.size());
		max = Math.max(max, tracheotomy.size());
		return (max);
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List records) {
		this.records = records;
		Iterator<AcuitiesReport> itr = records.iterator();
		while (itr.hasNext()) {
			AcuitiesReport acc = itr.next();
			int typeId = Integer.parseInt(acc.getTypeId());
			if (typeId == 1) {
				o2.add(acc.getResidentId());
			}
			if (typeId == 2) {
				iv.add(acc.getResidentId());
			}
			if (typeId == 3) {
				wo.add(acc.getResidentId());
			}
			if (typeId == 4) {
				t.add(acc.getResidentId());
			}
			if (typeId == 5) {
				orthopedicCare.add(acc.getResidentId());
			}
			if (typeId == 6) {
				advancedNeuroCare.add(acc.getResidentId());
			}
			if (typeId == 7) {
				respiratoryServices.add(acc.getResidentId());
			}
			if (typeId == 8) {
				tracheotomy.add(acc.getResidentId());
			}
		}
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			switch (col) {
			case 0:
				if (row + 1 <= o2.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}

				}
				return "";
			case 1:
				if (row + 1 <= iv.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 3:
				if (row + 1 <= wo.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 4:
				if (row + 1 <= t.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 5:
				if (row + 1 <= orthopedicCare.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 6:
				if (row + 1 <= advancedNeuroCare.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 7:
				if (row + 1 <= respiratoryServices.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 8:
				if (row + 1 <= tracheotomy.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			default:
				return null;
			}
		}

		catch (Exception e) {
			return ("");
		}
	}
}

class AcuitiesSecondFloorJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Oxygen Therapy", "IV Therapy",
			"Wound Care", "Tube Feeding", "Tracheotomy",
			"Respiratory Services", "Advanced Neuro Care", "Orthopedic Care" };

	public List records;
	List o2 = new ArrayList();
	List iv = new ArrayList();
	List wo = new ArrayList();
	List t = new ArrayList();
	List orthopedicCare = new ArrayList();
	List advancedNeuroCare = new ArrayList();
	List respiratoryServices = new ArrayList();
	List tracheotomy = new ArrayList();

	int n = 0;

	AcuitiesSecondFloorJTable(List records) {
		this.records = records;
	}

	AcuitiesSecondFloorJTable() {
		this.records = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		int max = Math.max(o2.size(), iv.size());
		max = Math.max(max, wo.size());
		max = Math.max(max, t.size());
		max = Math.max(max, orthopedicCare.size());
		max = Math.max(max, advancedNeuroCare.size());
		max = Math.max(max, respiratoryServices.size());
		max = Math.max(max, tracheotomy.size());
		return (max);
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List records) {
		this.records = records;
		Iterator<AcuitiesReport> itr = records.iterator();
		while (itr.hasNext()) {
			AcuitiesReport acc = itr.next();
			int typeId = Integer.parseInt(acc.getTypeId());
			if (typeId == 1) {
				o2.add(acc.getResidentId());
			}
			if (typeId == 2) {
				iv.add(acc.getResidentId());
			}
			if (typeId == 3) {
				wo.add(acc.getResidentId());
			}
			if (typeId == 4) {
				t.add(acc.getResidentId());
			}
			if (typeId == 5) {
				orthopedicCare.add(acc.getResidentId());
			}
			if (typeId == 6) {
				advancedNeuroCare.add(acc.getResidentId());
			}
			if (typeId == 7) {
				respiratoryServices.add(acc.getResidentId());
			}
			if (typeId == 8) {
				tracheotomy.add(acc.getResidentId());
			}
		}
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			switch (col) {
			case 0:
				if (row + 1 <= o2.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}

				}
				return "";
			case 1:
				if (row + 1 <= iv.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 3:
				if (row + 1 <= wo.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 4:
				if (row + 1 <= t.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 5:
				if (row + 1 <= orthopedicCare.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 6:
				if (row + 1 <= advancedNeuroCare.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 7:
				if (row + 1 <= respiratoryServices.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			case 8:
				if (row + 1 <= tracheotomy.size()) {
					Object o = records.get(row);
					if (o instanceof AcuitiesReport) {
						AcuitiesReport record = (AcuitiesReport) o;
						return record.getResidentId();
					}
				}
				return "";
			default:
				return null;
			}
		}

		catch (Exception e) {
			return ("");
		}
	}
}
