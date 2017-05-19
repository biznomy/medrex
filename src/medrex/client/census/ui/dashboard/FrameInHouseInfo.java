/**
 * 
 */
package medrex.client.census.ui.dashboard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.enums.CensusConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

/**
 * @author Dev
 * 
 */
public class FrameInHouseInfo extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4952339271286596642L;
	private JxButton btnPrint;
	private JxTable table;
	private InHouseTableModal refJTableModal;
	private JScrollPane scrollPane;

	public FrameInHouseInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("In House Information");
		setResizable(false);
		// setModal(true);
		// setAlwaysOnTop(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		final JPanel panelMain = new JPanel();
		panelMain.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		panelMain.setLayout(null);
		getContentPane().add(panelMain, BorderLayout.CENTER);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		scrollPane.getViewport().setBackground(
				GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		scrollPane.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		scrollPane.setBounds(10, 53, 574, 271);
		panelMain.add(scrollPane);

		final JxButton btnOk = new JxButton();
		btnOk.setArc(0.4f);
		btnOk
				.setBackground(GuiModes.DESIGNER_FORMS
						.getControlBackgroundColor());
		btnOk
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		btnOk.setHorizontalAlignment(SwingConstants.CENTER);
		btnOk.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnOk.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				// Global.currentResidenceArgument = 0;
				FrameInHouseInfo.this.dispose();
			}
		});
		btnOk.setText("Ok");
		btnOk.setBounds(501, 330, 83, 28);
		panelMain.add(btnOk);

		final JLabel lblTitle = new JLabel();
		lblTitle.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(
				28f));
		lblTitle.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setText("In House Information:");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new InHouseTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 4);

					if (id != 0) {
						Global.currentMainTab = 0;
						Global.currentInnerTab = 5;
						Global.currentResidenceArgument = id;
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.RESIDENT_INFORMATION, null);
						FrameInHouseInfo.this.dispose();
					}
				}
			}
		});

		scrollPane.setViewportView(table);

		btnPrint = new JxButton();
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				MessageFormat header = new MessageFormat("In House");
				try {
					table.print(JTable.PrintMode.FIT_WIDTH, header, null);
				} catch (java.awt.print.PrinterException e) {
					System.err.format("Cannot print %s%n", e.getMessage());
				}
			}
		});
		btnPrint.setText("Print");
		btnPrint.setArc(0.4f);
		btnPrint.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnPrint.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnPrint.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrint.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnPrint.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnPrint.setBounds(363, 331, 106, 26);
		panelMain.add(btnPrint);
		updateJTable();
	}

	public void updateJTable() {
		List<DashboardInfo> records = new ArrayList<DashboardInfo>();
		try {
			records = MedrexClientManager.getInstance().getInHouses();
		} catch (Exception e) {
			e.printStackTrace();
		}

		refJTableModal.setNewList(records);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class InHouseTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7800725875185357670L;

	private String[] columnNames = { "Resident", "Admitted On", "From", "Room" };

	private List<DashboardInfo> records;
	// private Map<InHouse, ResidentMain> residentMap;

	int n = 0;

	// private Comparator<InHouse> comparator;

	/*
	 * public InHouseTableModal(List<InHouse> recordsList) { comparator = new
	 * Comparator<InHouse>() { // -ve o1 < o2 // 0 o1 = o2 // +ve o1 > o2 public
	 * int compare(InHouse o1, InHouse o2) { int obj = 0; if(o1 != null && o2 !=
	 * null) { ResidentMain resi1 = residentMap.get(o1); ResidentMain resi2 =
	 * residentMap.get(o2); String str1 = resi1.getUserPass(); String str2 =
	 * resi2.getUserPass(); return str1.compareToIgnoreCase(str2); } return obj;
	 * } }; setNewList(recordsList); }
	 */

	public InHouseTableModal() {
		this(new ArrayList<DashboardInfo>());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (records.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public InHouseTableModal(List<DashboardInfo> recordsList) {
		setNewList(recordsList);
	}

	public void setNewList(List<DashboardInfo> recordsList) {
		records = recordsList;
		/*
		 * residentMap = new HashMap<InHouse, ResidentMain>();
		 * 
		 * Iterator<InHouse> itr = recordsList.iterator(); while(itr.hasNext())
		 * { InHouse ref = itr.next(); ResidentMain resi = null; try { resi =
		 * MedrexClientManager.getInstance().getResident(ref.getResidentId()); }
		 * catch (Exception e) { e.printStackTrace(); } if(resi != null) {
		 * residentMap.put(ref, resi); } } Collections.sort(records,
		 * comparator);
		 */
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			DashboardInfo rec = records.get(row);
			// ResidentMain resi = (ResidentMain) residentMap.get(rec);

			switch (col) {
			case 0:
				if (rec != null) {
					return rec.getResmain().getUserPass() + ", "
							+ rec.getResmain().getUserName();
				} else {
					return "";
				}
			case 1:
				return rec.getAdmittedOn();
			case 2:
				switch (rec.getFromId()) {
				case CensusConstants.HOSPITAL:
					return "Hospital";
				case CensusConstants.HOME:
					return "Home";
				case CensusConstants.OTHER_FACILITY:
					return "Other Facility";
				case CensusConstants.OTHER:
					return "Other";
				default:
					return "";
				}
			default:
				return "";

				/* / --- returning keys --- / */
				// case 3: ResidentMain rm =
				// MedrexClientManager.getInstance().getResident(rec.getResidentId());
				// return rm.getRoom();
			case 3:
				return rec.getCurrentRoom();
			case 4:
				return rec.getResmain().getSerial();
				// case 5: return rec.getSerial();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}