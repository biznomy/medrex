package medrex.client.census.ui.dashboard;

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
import medrex.commons.vo.census.PreviousDayCensusBean;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FramePreviousDayInfo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3209017818352751299L;
	private JxTable table;
	private PreviousDayTableModal refJTableModal;

	public FramePreviousDayInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
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
				// Global.currentResidenceArgument = 0;
				FramePreviousDayInfo.this.dispose();
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
		lblTitle.setText("Previous Day Admission/Discharge Info:");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new PreviousDayTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 3);

					if (id != 0) {
						Global.currentMainTab = 0;
						Global.currentInnerTab = 5;
						Global.currentResidenceArgument = id;
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.RESIDENT_INFORMATION, null);
						FramePreviousDayInfo.this.dispose();

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
						.getCensusLastDayAdmissionResidents();
				break;
			case 1:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayAdmissionFirstFloorResidents();
				break;
			case 2:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayAdmissionSecondFloorResidents();
				break;
			case 3:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayDischargeResidents();
				break;
			case 4:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayDischargeFirstFloorResidents();
				break;
			case 5:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayDischargeSecondFloorResidents();
				break;
			default:
				records = MedrexClientManager.getInstance()
						.getCensusLastDayAdmissionResidents();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		List<PreviousDayCensusBean> tempRecords = new ArrayList();

		Iterator it = records.iterator();
		while (it.hasNext()) {
			PreviousDayCensusBean bean = new PreviousDayCensusBean();
			Object[] record = (Object[]) it.next();
			int residentId = new Integer(record[0].toString()).intValue();
			String floorType = record[1].toString() + "";
			bean.setResidentId(residentId);
			bean.setFloorType(floorType);
			tempRecords.add(bean);
		}

		refJTableModal.setNewList(tempRecords);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class PreviousDayTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3909502079053426043L;

	private String[] columnNames = { "Resident", "Floor" };

	private List<PreviousDayCensusBean> records;
	private Map<PreviousDayCensusBean, ResidentMain> residentMap;

	int n = 0;

	private Comparator<PreviousDayCensusBean> comparator;

	public PreviousDayTableModal(List<PreviousDayCensusBean> recordsList) {
		comparator = new Comparator<PreviousDayCensusBean>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(PreviousDayCensusBean o1,
					PreviousDayCensusBean o2) {
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

	public PreviousDayTableModal() {
		this(new ArrayList<PreviousDayCensusBean>());
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

	public void setNewList(List<PreviousDayCensusBean> recordsList) {
		records = recordsList;
		residentMap = new HashMap<PreviousDayCensusBean, ResidentMain>();

		Iterator<PreviousDayCensusBean> itr = recordsList.iterator();
		while (itr.hasNext()) {
			PreviousDayCensusBean ref = itr.next();
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
			PreviousDayCensusBean rec = records.get(row);
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
				/* / --- returning keys --- / */
			case 3:
				return resi.getSerial();

			default:
				return "";
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}
