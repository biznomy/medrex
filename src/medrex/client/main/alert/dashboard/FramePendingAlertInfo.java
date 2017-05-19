package medrex.client.main.alert.dashboard;

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
import medrex.commons.vo.alert.AlertSetting;
import medrex.commons.vo.alert.PendingAlertCountBean;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FramePendingAlertInfo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -839087497100890921L;
	private JxTable table;
	private PendingAlertTableModal refJTableModal;
	private boolean flag = false;
	private int alertTime = 0;
	private String alertType;

	public FramePendingAlertInfo(final String str) {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle(str + " Alert Information");
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
				FramePendingAlertInfo.this.dispose();
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
		lblTitle.setText(str);
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new PendingAlertTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 2);

					if (id != 0) {
						Global.currentMainTab = 14;
						Global.currentInnerTab = 1;
						Global.currentResidenceArgument = id;
						if (str.equalsIgnoreCase("Resident Past")) {
							Global.currentAlertStatus = "Pending Past";
						} else if (str.equalsIgnoreCase("Resident Future")) {
							Global.currentAlertStatus = "Pending Upcoming";
						} else if (str.equalsIgnoreCase("I Send Out")) {
							Global.currentAlertStatus = "I Send Out";
						} else if (str.equalsIgnoreCase("Completed")) {
							Global.currentAlertStatus = "Completed";
						}
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.ALERT, null);
						FramePendingAlertInfo.this.dispose();
					}
				} else {
					System.out.println("Single Click");
				}
			}
		});

		scrollPane.setViewportView(table);
		updateJTable(0, str);
	}

	public void updateJTable(int type, String str) {
		AlertSetting as = new AlertSetting();
		// try {
		// as = MedrexClientManager.getInstance().getAlertSetting(1);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		alertTime = as.getTimeValue();
		alertType = as.getTimeType();
		List records = new ArrayList();
		try {
			// if (str.equalsIgnoreCase("Resident Past")) {
			// records =
			// MedrexClientManager.getInstance().getResidentPendingAlerts(Global.currentLoggedInUserName);
			// } else if (str.equalsIgnoreCase("Resident Future")){
			// records =
			// MedrexClientManager.getInstance().getResidentFutureAlerts(alertTime,
			// alertType, Global.currentLoggedInUserName);
			// } else if (str.equalsIgnoreCase("I Send Out")) {
			// records =
			// MedrexClientManager.getInstance().getResidentPendingAlerts(Global.currentLoggedInUserName);
			// } else if (str.equalsIgnoreCase("Completed")) {
			// records =
			// MedrexClientManager.getInstance().getResidentPendingAlerts(Global.currentLoggedInUserName);
			// }
			records = MedrexClientManager.getInstance()
					.getResidentPendingAlerts(str,
							Global.currentLoggedInUserKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<PendingAlertCountBean> temp = new ArrayList();

		Iterator it = records.iterator();
		while (it.hasNext()) {
			PendingAlertCountBean bean = new PendingAlertCountBean();
			Object[] pendingRecord = (Object[]) it.next();
			int residentId = new Integer(pendingRecord[0].toString())
					.intValue();
			int pendingPastCount = new Integer(pendingRecord[1].toString())
					.intValue();
			bean.setResidentId(residentId);
			bean.setPastCount(pendingPastCount);
			temp.add(bean);
		}

		refJTableModal.setNewList(temp);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class PendingAlertTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2219926399914174699L;
	private String[] columnNames = { "Resident", "Pending Alert Counts" };
	int n = 0;
	List<PendingAlertCountBean> pendingAlertList = new ArrayList<PendingAlertCountBean>();
	private Comparator<PendingAlertCountBean> comparator;
	private Map<PendingAlertCountBean, ResidentMain> residentMap;

	public PendingAlertTableModal(List<PendingAlertCountBean> recordsList) {
		comparator = new Comparator<PendingAlertCountBean>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(PendingAlertCountBean o1,
					PendingAlertCountBean o2) {
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

	public PendingAlertTableModal() {
		this(new ArrayList<PendingAlertCountBean>());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (pendingAlertList.size());
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PendingAlertCountBean> pendingList) {
		pendingAlertList = pendingList;
		residentMap = new HashMap<PendingAlertCountBean, ResidentMain>();

		Iterator<PendingAlertCountBean> itr = pendingAlertList.iterator();
		while (itr.hasNext()) {
			PendingAlertCountBean ref = itr.next();
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
		Collections.sort(pendingAlertList, comparator);
	}

	public Object getValueAt(int row, int col) {
		try {
			PendingAlertCountBean rec = pendingAlertList.get(row);
			ResidentMain resi = residentMap.get(rec);
			switch (col) {
			case 0:
				if (resi != null) {
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return "";
				}
			case 1:
				return rec.getPastCount();

			case 2:
				return rec.getResidentId();

			default:
				return "";

				/* / --- returning keys --- / */
			case 3:
				return rec.getResidentId();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("");
	}

}
