package medrex.client.main.labReports;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.vo.reports.LabReportsCountBean;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameLabReportsFloorInfo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8361195569522000664L;
	private JxTable table;
	private NewLabReportsTableModalFloors refJTableModal;
	private boolean flag = false;

	public FrameLabReportsFloorInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("New Lab Reports");
		setResizable(false);
		setModal(true);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		final JPanel panelMain = new JPanel();
		panelMain.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		panelMain.setLayout(null);
		getContentPane().add(panelMain, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
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
				Global.currentResidenceArgument = 0;
				FrameLabReportsFloorInfo.this.dispose();
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
		lblTitle.setText("New Lab Reports");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new NewLabReportsTableModalFloors();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 3);

					if (id != 0) {
						Global.currentResidenceArgument = id;
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MISC, null);
						FrameLabReportsFloorInfo.this.dispose();

					}
				}
			}
		});

		scrollPane.setViewportView(table);
		updateJTable(0);
	}

	public void updateJTable(int type) {
		List records = new ArrayList();
		try {
			switch (type) {
			case 0:
				records = MedrexClientManager.getInstance()
						.getAllNewLabReportsResidents();
				break;
			case 1:
				records = MedrexClientManager.getInstance()
						.getFirstFloorNewLabReportResidents();
				break;
			case 2:
				records = MedrexClientManager.getInstance()
						.getSecondFloorNewLabReportResidents();
				break;
			default:
				records = MedrexClientManager.getInstance()
						.getAllNewLabReportsResidents();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		List<LabReportsCountBean> tempLabReportRecords = new ArrayList();

		Iterator it = records.iterator();
		while (it.hasNext()) {
			LabReportsCountBean bean = new LabReportsCountBean();
			Object[] labReportRecord = (Object[]) it.next();
			int residentId = new Integer(labReportRecord[0].toString())
					.intValue();
			int labReportCount = new Integer(labReportRecord[1].toString())
					.intValue();
			String floorType = labReportRecord[2].toString() + "";
			bean.setResidentId(residentId);
			bean.setPendingCount(labReportCount);
			bean.setFloorType(floorType);
			tempLabReportRecords.add(bean);
		}

		refJTableModal.setNewList(tempLabReportRecords);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class NewLabReportsTableModalFloors extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8950654622832774829L;

	private String[] columnNames = { "Resident", "Floor", "Total Lab Reports" };

	private List<LabReportsCountBean> records;
	private Map<LabReportsCountBean, ResidentMain> residentMap;

	int n = 0;

	private Comparator<LabReportsCountBean> comparator;

	public NewLabReportsTableModalFloors(List<LabReportsCountBean> recordsList) {
		comparator = new Comparator<LabReportsCountBean>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(LabReportsCountBean o1, LabReportsCountBean o2) {
				int obj = 0;
				if (o1 != null && o2 != null) {
					ResidentMain resi1 = residentMap.get(o1);
					ResidentMain resi2 = residentMap.get(o2);
					String str1 = resi1.getUserPass();
					String str2 = resi2.getUserPass();
					return str1.compareToIgnoreCase(str2);
				}
				return obj;
			}
		};
		setNewList(recordsList);
	}

	public NewLabReportsTableModalFloors() {
		this(new ArrayList<LabReportsCountBean>());
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

	public void setNewList(List<LabReportsCountBean> recordsList) {
		records = recordsList;
		residentMap = new HashMap<LabReportsCountBean, ResidentMain>();

		Iterator<LabReportsCountBean> itr = recordsList.iterator();
		while (itr.hasNext()) {
			LabReportsCountBean ref = itr.next();
			ResidentMain resi = null;
			try {
				resi = MedrexClientManager.getInstance().getResident(
						ref.getResidentId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (resi != null) {
				residentMap.put(ref, resi);
			}
		}
		Collections.sort(records, comparator);
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			LabReportsCountBean rec = records.get(row);
			ResidentMain resi = residentMap.get(rec);

			switch (col) {
			case 0:
				if (resi != null) {
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return "";
				}
			case 1:
				return rec.getFloorType() + "";

			case 2:
				return rec.getPendingCount();

			default:
				return "";

				/* / --- returning keys --- / */
			case 3:
				return rec.getResidentId();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}
