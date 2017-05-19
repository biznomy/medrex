package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelPendingAlert extends JPanel {
	private JxComboBox cmbAlertTime;
	private JLabel lblISend;
	private JLabel lblCompleted;
	private JLabel lblISendOut;
	private JLabel lblAlertCounts;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private static final long serialVersionUID = 1L;
	private JxTable table;
	private PendingAlertJTable pendingAlertJTable;
	private FrameAlertAdd frameAlertAdd;
	private final int GLOBAL_ID = 100000;
	private int alertTime = 0;
	private String alertType;
	private int residentKey = 0;

	public PanelPendingAlert(final String str) {
		super();

		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate(str);
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 720, 376);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 95, 680, 232);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		pendingAlertJTable = new PendingAlertJTable();
		table.setModel(pendingAlertJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int alertId = 0;
					// if ((String) pendingAlertJTable.getValueAt(
					// table.getSelectedRow(), 4)!= null) {
					alertId = new Integer((String) pendingAlertJTable
							.getValueAt(table.getSelectedRow(), 4)).intValue();
					// }
					int ownerStatus = new Integer((String) pendingAlertJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();
					int owner = 0;
					try {
						owner = MedrexClientManager.getInstance()
								.getCalculatedAlert(alertId);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MedrexException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					PanelNotesAdd frame = new PanelNotesAdd(alertId, str,
							ownerStatus, owner);
					SwingUtils.openInDialog(frame);
					frame.setVisible(true);
					updateAlertJTable(str);
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("Pending Alert");
		panel.add(residentInformationLabel);

		final JLabel filterLabel = new JLabel();
		filterLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		filterLabel.setText("Filter");
		filterLabel.setBounds(249, 60, 49, 16);
		filterLabel.setForeground(DEF_COL);
		panel.add(filterLabel);

		cmbAlertTime = new JxComboBox();
		cmbAlertTime.setForeground(DEF_COL);
		cmbAlertTime.setArc(0.4f);
		cmbAlertTime.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbAlertTime.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				JxComboBox cmb = (JxComboBox) e.getSource();
				String newSelection = (String) cmb.getSelectedItem();
				if (!(newSelection.equalsIgnoreCase(""))) {
					Global.currentAlertStatus = newSelection;
				}
				updateAlertJTable(str);
			}
		});
		cmbAlertTime.setModel(new DefaultComboBoxModel(new String[] { "All",
				"Pending ", "Pending Upcoming", "Completed", "I Send Out" }));
		cmbAlertTime.setBounds(314, 55, 160, 25);
		cmbAlertTime.setBackground(Color.WHITE);
		panel.add(cmbAlertTime);

		doLoad();

	}

	private void doLoad() {
		if (Global.currentAlertStatus.equalsIgnoreCase("")) {
			Global.currentAlertStatus = "All";
		}

		if (Global.currentAlertStatus.equalsIgnoreCase("All")) {
			cmbAlertTime.setSelectedIndex(0);
		} else if (Global.currentAlertStatus.equalsIgnoreCase("Pending Past")) {
			cmbAlertTime.setSelectedIndex(1);
		} else if (Global.currentAlertStatus
				.equalsIgnoreCase("Pending Upcoming")) {
			cmbAlertTime.setSelectedIndex(2);
		} else if (Global.currentAlertStatus.equalsIgnoreCase("Completed")) {
			cmbAlertTime.setSelectedIndex(3);
		} else {
			cmbAlertTime.setSelectedIndex(4);
		}
	}

	protected void doUpdate(String str) {
		updateAlertJTable(str);

	}

	private void updateAlertJTable(String str) {
		// List<PendingAlert> records = new ArrayList<PendingAlert>();
		// List<CalculatedAlert> rec = new ArrayList<CalculatedAlert>();
		// try {
		// if (Global.currentAlertStatus.equalsIgnoreCase("All")) {
		// if (str.equalsIgnoreCase("Resident Alert")
		// && Global.currentResidenceKey != 0) {
		// records = MedrexClientManager.getInstance()
		// .getPendingAlertList(Global.currentResidenceKey,
		// Global.currentLoggedInUserName, Global.currentLoggedInUserKey,
		// Global.currentLoggedInUserType);
		// } else if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// records = MedrexClientManager.getInstance()
		// .getPendingAlertList(GLOBAL_ID, Global.currentLoggedInUserName,
		// Global.currentLoggedInUserKey, Global.currentLoggedInUserType);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// } else if
		// (Global.currentAlertStatus.equalsIgnoreCase("Pending Past")) {
		// if (str.equalsIgnoreCase("Resident Alert")
		// && Global.currentResidenceKey != 0) {
		// records = MedrexClientManager.getInstance()
		// .getPendingPastAlertList(Global.currentResidenceKey,
		// Global.currentLoggedInUserName, Global.currentLoggedInUserKey,
		// Global.currentLoggedInUserType);
		// } else if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// records = MedrexClientManager.getInstance()
		// .getPendingPastAlertList(GLOBAL_ID, Global.currentLoggedInUserName,
		// Global.currentLoggedInUserKey, Global.currentLoggedInUserType);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// } else if
		// (Global.currentAlertStatus.equalsIgnoreCase("Pending Upcoming")) {
		// AlertSetting as = new AlertSetting();
		// try {
		// as = MedrexClientManager.getInstance().getAlertSetting(1);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// if(as!=null){
		// alertTime = as.getTimeValue();
		// alertType = as.getTimeType();
		// }
		// if (str.equalsIgnoreCase("Resident Alert")
		// && Global.currentResidenceKey != 0) {
		// records = MedrexClientManager.getInstance()
		// .getPendingUpcomingAlertList(alertTime, alertType,
		// Global.currentResidenceKey, Global.currentLoggedInUserName,
		// Global.currentLoggedInUserKey, Global.currentLoggedInUserType);
		// } else if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// records = MedrexClientManager.getInstance()
		// .getPendingUpcomingAlertList(alertTime, alertType, GLOBAL_ID,
		// Global.currentLoggedInUserName, Global.currentLoggedInUserKey,
		// Global.currentLoggedInUserType);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// } else if (Global.currentAlertStatus.equalsIgnoreCase("Completed")) {
		// if (str.equalsIgnoreCase("Resident Alert")
		// && Global.currentResidenceKey != 0) {
		// records = MedrexClientManager.getInstance()
		// .getPendingCompletedAlertList(Global.currentResidenceKey,
		// Global.currentLoggedInUserKey);
		// } else if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// records = MedrexClientManager.getInstance()
		// .getPendingCompletedAlertList(GLOBAL_ID,
		// Global.currentLoggedInUserKey);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// } else {
		// if (str.equalsIgnoreCase("Resident Alert")
		// && Global.currentResidenceKey != 0) {
		// records = MedrexClientManager.getInstance()
		// .getPendingISendOutAlertList(Global.currentResidenceKey,
		// Global.currentLoggedInUserKey);
		// } else if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// records = MedrexClientManager.getInstance()
		// .getPendingISendOutAlertList(GLOBAL_ID,
		// Global.currentLoggedInUserKey);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// if (GLOBAL_ID != 0 && str.equalsIgnoreCase("Global Alert")) {
		// try {
		// rec = MedrexClientManager.getInstance()
		// .getCalculatedAlertList();
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// pendingAlertJTable.setNewList(rec);
		List<CalculatedAlert> calcuList = new ArrayList<CalculatedAlert>();
		// try {
		// // calcuList =
		// MedrexClientManager.getInstance().getCalculatedAlertList();
		// calcuList =
		// MedrexClientManager.getInstance().getCalculatedAlertListByUser(Global.currentLoggedInUserKey);
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		if (str.equalsIgnoreCase("Global Alert")) {
			residentKey = GLOBAL_ID;
		} else if (str.equalsIgnoreCase("Resident Alert")) {
			residentKey = Global.currentResidenceKey;
		}

		try {
			calcuList = MedrexClientManager.getInstance()
					.getCalculatedAlertListByUser(
							Global.currentLoggedInUserKey, str, residentKey,
							Global.currentAlertStatus);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}

		pendingAlertJTable.setNewList(calcuList);
		pendingAlertJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class PendingAlertJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Notes", "Alert Date", "Alert Time",
			"Owner Status" };

	public List<CalculatedAlert> alertRecords;

	int n = 0;

	PendingAlertJTable(List<CalculatedAlert> alertRecords) {
		this.alertRecords = alertRecords;
	}

	PendingAlertJTable() {
		this.alertRecords = new ArrayList<CalculatedAlert>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (alertRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<CalculatedAlert> alertRecords) {
		this.alertRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat();
		timeFormat.applyPattern("hh:mm a");
		try {
			Object o = alertRecords.get(row);
			if (o instanceof CalculatedAlert) {
				CalculatedAlert pa = (CalculatedAlert) o;
				Users user = null;
				if (pa.getUpdater() != 0) {
					user = MedrexClientManager.getInstance().getUser(
							pa.getUpdater());
				}
				if (col == 0) {
					if (pa.getNotes().length() < 20) {
						return (pa.getNotes().toString());
					} else {
						return (pa.getNotes().toString().substring(0, 19)
								.concat("..."));
					}
				}
				if (col == 1) {
					return (df.format(pa.getAlertDate()));
				}
				if (col == 2) {
					return (timeFormat.format(pa.getAlertDate()));
				}
				if (col == 3) {
					if (pa.getOwnerStatus() == 1) {
						return ("Pending");
					} else if (pa.getOwnerStatus() == 2) {
						return ("Completed" + "  by  " + user.getUserName());
					}
				}
				if (col == 4) {
					return (pa.getSerial() + "");
				}
				if (col == 5) {
					return (pa.getOwnerStatus() + "");
				}
				return ("");
			}
			return ("");
		}

		catch (Exception e) {
			e.printStackTrace();
			return ("");
		}
	}
}
