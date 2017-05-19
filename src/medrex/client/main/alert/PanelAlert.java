package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
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
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelAlert extends JPanel {

	private JxButton btnSuspend;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private static final long serialVersionUID = 1L;
	private JxTable table;
	private AlertJTable alertJTable;
	private FrameAlertAdd frameAlertAdd;
	private final int globalAlertId = 100000;

	public PanelAlert(final String str) {
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
		panel.setBounds(0, 0, 720, 404);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 46, 680, 290);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		alertJTable = new AlertJTable();
		table.setModel(alertJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					try {
						int id = new Integer((String) alertJTable.getValueAt(
								table.getSelectedRow(), 4)).intValue();
						Global.currentAlertKey = id;
						frameAlertAdd = new FrameAlertAdd(str);
						frameAlertAdd.disableSaveBtn();
						SwingUtils.openInDialog(frameAlertAdd);
						// frameAlertAdd.setVisible(true);
						updateAlertJTable(str);
					} catch (Exception ve) {
					}
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(70, 355, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.ALERT)) {
				Global.currentAlertKey = 0;
				frameAlertAdd = new FrameAlertAdd(str);
				// frameAlertAdd.setVisible(true);
				SwingUtils.openInDialog(frameAlertAdd);
				// System.out.println("This is executing");
				updateAlertJTable(str);
			}
			// }
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(195, 355, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) alertJTable.getValueAt(table
							.getSelectedRow(), 4)).intValue();

					Global.currentAlertKey = id;

					frameAlertAdd = new FrameAlertAdd(str);
					frameAlertAdd.disableSaveBtn();
					SwingUtils.openInDialog(frameAlertAdd);
					// frameAlertAdd.setVisible(true);
					updateAlertJTable(str);
				} catch (Exception ve) {
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(350, 355, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) alertJTable.getValueAt(table
							.getSelectedRow(), 4)).intValue();
					if (id != 0) {
						MedrexClientManager.getInstance().deleteAlertRecord(id);
					}
					updateAlertJTable(str);
				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(592, 355, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("Alert");
		panel.add(residentInformationLabel);

		btnSuspend = new JxButton();
		btnSuspend.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				try {
					int id = new Integer((String) alertJTable.getValueAt(table
							.getSelectedRow(), 4)).intValue();
					PanelSuspendAdd panel = new PanelSuspendAdd(id);
					SwingUtils.openInDialog(panel);
					// frameAlertAdd.setVisible(true);
					updateAlertJTable(str);
				} catch (Exception ve) {
				}

			}
		});
		btnSuspend.setBackground(Color.WHITE);
		btnSuspend.setArc(0.4f);
		btnSuspend
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSuspend.setText("Suspend");
		btnSuspend.setForeground(DEF_COL);
		btnSuspend.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSuspend.setFont(new Font("", Font.BOLD, 12));
		btnSuspend.setBounds(471, 355, 84, 26);
		panel.add(btnSuspend);

		// System.out.println("String is :" + str);

	}

	protected void doUpdate(String str) {
		updateAlertJTable(str);
	}

	private void updateAlertJTable(String str) {
		List alertRecords = new ArrayList();
		new ArrayList();

		if (Global.currentResidenceKey != 0) {
			try {
				if (str.equalsIgnoreCase("Resident Alert")) {
					alertRecords = MedrexClientManager.getInstance()
							.getGlobalAlertList(Global.currentResidenceKey,
									Global.currentLoggedInUserKey);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (globalAlertId != 0) {
			if (str.equalsIgnoreCase("Global Alert")) {
				try {
					alertRecords = MedrexClientManager.getInstance()
							.getGlobalAlertList(globalAlertId,
									Global.currentLoggedInUserKey);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			MedrexClientManager.getInstance().getPendingOwnerList(
					Global.currentLoggedInUserKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// if (Global.currentLoggedInUserName.equals("admin")) {
		alertJTable.setNewList(alertRecords);
		// } else {
		// alertJTable.setNewList(ownerAlerts);
		// }
		alertJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class AlertJTable extends AbstractTableModel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date", "Begin Date", "End Date",
			"Alert Owner" };

	public List alertRecords;

	int n = 0;

	AlertJTable(List alertRecords) {
		this.alertRecords = alertRecords;
	}

	AlertJTable() {
		this.alertRecords = new ArrayList();
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

	public void setNewList(List alertRecords) {
		this.alertRecords = alertRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {
			Object o = alertRecords.get(row);
			if (o instanceof Alert) {
				Alert alert = (Alert) o;

				if (col == 0) {
					return (df.format(alert.getDate()));
				}
				if (col == 1) {
					return (df.format(alert.getBeginDate()));
				}
				if (col == 2) {
					return (df.format(alert.getEndDate()));
				}
				if (col == 3) {
					Users users = new Users();
					users = MedrexClientManager.getInstance().getUser(
							alert.getOwner());
					return (users.getUserName());
				}
				if (col == 4) {
					return (alert.getSerial() + "");
				}
				if (col == 5) {
					return (alert.getResidentId() + "");
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
