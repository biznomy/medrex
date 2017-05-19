package medrex.client.main.resident.changeRoom;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.floorPlan.PanelRoomPopUp;
import medrex.client.main.resident.personalInfo.ControllerResidentPersonalInfo;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;
import com.toedter.calendar.JDateChooser;

public class PanelChangeRoomForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2624820185956857147L;
	private JxButton roomButton;
	private JLabel roomLabel_1;
	private JTextField floorType;
	private JLabel roomLabel_2;
	private JTextField txtRoom;
	private ResidentMain residentMain = null;
	private JxTable table;
	private TableRoomHistory tableRoomHistory;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private ControllerResidentPersonalInfo residentPersonalInfoController;

	private ControllerRoomList controllerRoomList;
	private JxButton changeButton;
	private JDateChooser dateChooser;
	private JxButton roomButton2;

	private static String[] strSubCat1 = { "101-1", "101-2", "102-1", "102-2",
			"103-1", "103-2", "104-1", "104-2", "104-3", "104-4", "105-1",
			"105-2", "106-1", "106-2", "107-1", "107-2", "108-1", "108-2",
			"109-1", "109-2", "109-3", "109-4" };

	private static String[] strSubCat2 = { "110-1", "110-2", "110-3", "110-4",
			"111-1", "111-2", "112-1", "112-2", "113-1", "113-2", "114-1",
			"114-2", "115-1", "115-2", "116-1", "116-2", "117-1", "117-2",
			"118-1", "118-2", "119-1", "119-2", "120-1", "120", "120-2",
			"121-1", "121-2", "122-1", "122-2", "123-1", "123-2", "124", "125",
			"126-1", "126-2", "127-1", "127-2", "128", "129-1", "129-2",
			"129-3" };

	private static String[] strSubCat3 = { "201", "202", "203-1", "203-2",
			"204-1", "204-2", "205-1", "205-2", "206-1", "206-2", "206-3",
			"206-4", "207-1", "207-2", "208-1", "208-2", "209-1", "209-2",
			"210-1", "210-2", "211-1", "211-2" };

	private static String[] strSubCat4 = { "212-1", "212-2", "212-3", "212-4",
			"213-1", "213-2", "213-3", "213-4", "214-1", "214-2", "215-1",
			"215-2", "216-1", "216-2", "217-1", "217-2", "218-1", "218-2",
			"219-1", "219-2", "220-1", "220-2", "221-1", "221-2", "222-1",
			"222-2", "223-1", "223-2", "224-1", "224-2", "225-1", "225-2",
			"226-1", "226-2", "227-1", "227-2", "228-1", "228-2", "229",
			"230-1", "230-2", "231-1", "231-2", "232-1", "232-2", "232-3" };

	public PanelChangeRoomForm() {
		super();
		setLayout(null);
		Global.panelChangeRoomForm = this;
		residentPersonalInfoController = new ControllerResidentPersonalInfo();
		controllerRoomList = new ControllerRoomList();

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 714, 375);
		add(panel);

		final JLabel changeRoomLabel = new JLabel();
		changeRoomLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		changeRoomLabel.setForeground(DEF_COLOR);
		changeRoomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		changeRoomLabel.setText("Change Room");
		changeRoomLabel.setBounds(0, 0, 500, 35);
		panel.add(changeRoomLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 694, 184);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		tableRoomHistory = new TableRoomHistory();
		table.setModel(tableRoomHistory);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					String serialStr = tableRoomHistory.getValueAt(table
							.getSelectedRow(), 4)
							+ "";
					if (serialStr != null) {
						int id = new Integer(serialStr).intValue();
						System.out.println("id: " + id);
					}

				}
			}
		});
		scrollPane.setViewportView(table);

		final JLabel dobLabel = new JLabel();
		dobLabel.setForeground(DEF_COLOR);
		dobLabel.setFont(new Font("", Font.BOLD, 12));
		dobLabel.setText("Date of Change");
		dobLabel.setBounds(10, 243, 101, 16);
		// dobLabel.setVisible(false);
		panel.add(dobLabel);

		roomLabel_1 = new JLabel();
		roomLabel_1.setForeground(DEF_COLOR);
		roomLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		roomLabel_1.setText("FLOOR #");
		roomLabel_1.setBounds(10, 295, 66, 16);
		panel.add(roomLabel_1);

		floorType = new JTextField();
		floorType.setForeground(DEF_COLOR);
		floorType.setFont(new Font("Tahoma", Font.BOLD, 11));
		floorType.setBackground(Color.WHITE);
		floorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		floorType.setBounds(82, 292, 141, 25);
		floorType.setEditable(false);
		panel.add(floorType);

		roomLabel_2 = new JLabel();
		roomLabel_2.setForeground(DEF_COLOR);
		roomLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		roomLabel_2.setText("ROOM #");
		roomLabel_2.setBounds(233, 295, 66, 16);
		panel.add(roomLabel_2);

		txtRoom = new JTextField();
		txtRoom.setForeground(DEF_COLOR);
		txtRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtRoom.setBounds(282, 292, 121, 25);
		txtRoom.setEditable(false);
		panel.add(txtRoom);

		// roomButton = new JxButton();
		// roomButton .setForeground(DEF_COLOR);
		// roomButton
		// .setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		// roomButton.setFont(new Font("", Font.BOLD, 12));
		// roomButton.setBackground(Color.WHITE);
		// roomButton.setArc(0.4f);
		// roomButton.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// if(getResidentExistInHouse()){
		// SwingUtils.openInDialog(new PanelRoomPopUp(controllerRoomList));
		// doUpdateFloorsAndRooms();
		// }
		// }
		// });
		// roomButton.setText("+");
		// roomButton.setBounds(423, 291, 34, 25);
		// panel.add(roomButton);
		// roomButton.setVisible(false);

		changeButton = new JxButton();
		changeButton.setForeground(DEF_COLOR);
		changeButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		changeButton.setFont(new Font("", Font.BOLD, 12));
		changeButton.setBackground(Color.WHITE);
		changeButton.setArc(0.4f);
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (getResidentExistInHouse()) {
					changeRoomHistory();
					Global.currentResidenceArgument = Global.currentResidenceKey;
					Global.panelMainDesktopTmp.updateResidentList();
					Global.panelMainDesktopTmp
							.setSelected(Global.currentResidenceKey);
					Global.panelMainDesktopTmp.doUpdate();
					updateTable();
				}
			}
		});
		changeButton.setText("Change");
		changeButton.setBounds(282, 340, 121, 25);
		panel.add(changeButton);

		dateChooser = new JDateChooser();
		dateChooser.setDate(MedrexClientManager.getServerTime());
		dateChooser.setBounds(129, 250, 199, 20);
		panel.add(dateChooser);
		dateChooser.setForeground(DEF_COLOR);
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setForeground(DEF_COLOR);
		// dateChooser.setVisible(false);

		roomButton2 = new JxButton();
		roomButton2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (Global.currentLoggedInUserType
						.equalsIgnoreCase("Administrator")
						&& getResidentExistInHouse()) {
					if (dateChooser.getDate() != null) {
						JDialog dialog = new JDialog();
						dialog.add(new PanelRoomPopUp(controllerRoomList,
								dateChooser.getDate()));
						dialog.setVisible(true);
						dialog.setSize(Toolkit.getDefaultToolkit()
								.getScreenSize().width, Toolkit
								.getDefaultToolkit().getScreenSize().height);
						Global.frameRoomGraphicalView = dialog;
						// SwingUtils.wrapInDialog(new
						// PanelRoomPopUpFloorPlan(controllerRoomList)).setVisible(true);
						doUpdateFloorsAndRooms();
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select date");
					}
				}
			}
		});
		roomButton2
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		roomButton2
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		roomButton2.setFont(new Font("", Font.BOLD, 12));
		roomButton2.setBackground(Color.WHITE);
		roomButton2.setForeground(ColorConstants.DEF_COLOR);
		roomButton2.setArc(0.4f);
		roomButton2.setArc(0.4f);

		roomButton2.setText("+");
		roomButton2.setBounds(418, 291, 28, 25);
		panel.add(roomButton2);

		updateData();
		updateTable();
	}

	private void updateTable() {
		/*
		 * List<RoomHistory> roomlist = new ArrayList<RoomHistory>(); try {
		 * roomlist =MedrexClientManager.getInstance().getRoomHistory(Global.
		 * currentResidenceKey); } catch (RemoteException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch
		 * (MedrexException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		List<TempRoomHistory> roomlist = new ArrayList<TempRoomHistory>();
		try {
			roomlist = MedrexClientManager.getInstance()
					.getRoomHistoriesForResident(Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tableRoomHistory.setNewList(roomlist);
		tableRoomHistory.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	private void changeRoomHistory() {
		Date selectedDate = MedrexClientManager.getServerTime();
		int currentResidentSerial = Global.currentResidenceKey;
		TempRoomHistory oldHistory = null;

		try {
			oldHistory = MedrexClientManager.getInstance().getLastRoomHistory(
					currentResidentSerial);
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (MedrexException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if (txtRoom.getText().equalsIgnoreCase(oldHistory.getRoom())) {
			JOptionPane.showMessageDialog(this,
					"Please select different room then current room");
			return;
		}

		if (oldHistory != null) {
			oldHistory.setEndDate(selectedDate);
			try {
				MedrexClientManager.getInstance().insertOrUpdateRoomHistory(
						oldHistory);
			} catch (RemoteException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (MedrexException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

		/*
		 * ResidentMain resident = null; try { resident =
		 * MedrexClientManager.getInstance
		 * ().getResident(Global.currentResidenceKey); } catch (RemoteException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * catch (MedrexException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); };
		 * 
		 * if(txtRoom.getText().equalsIgnoreCase(resident.getRoom())){
		 * JOptionPane.showMessageDialog(this,
		 * "Please select different room then current room"); return; }
		 * 
		 * resident.setFloorType(resident.getFloorType());
		 * resident.setOldroom(resident.getRoom());
		 * resident.setFloorType(floorType.getText());
		 * resident.setRoom(txtRoom.getText());
		 */

		/*
		 * RoomHistory roomHistory = new RoomHistory();
		 * roomHistory.setResidentId(resident.getSerial());
		 * roomHistory.setFloor(floorType.getText());
		 * roomHistory.setRoom(txtRoom.getText());
		 * roomHistory.setStartDate(selectedDate);
		 */

		TempRoomHistory roomHistory = new TempRoomHistory();
		roomHistory.setResidentId(currentResidentSerial);
		System.out.println(txtRoom.getText());
		roomHistory.setRoom(txtRoom.getText());
		String floor = null;
		if (!(txtRoom.getText().equalsIgnoreCase(""))) {
			floor = getFloor(txtRoom.getText());
		}
		roomHistory.setFloor(floor);
		roomHistory.setStartDate(selectedDate);

		try {
			// MedrexClientManager.getInstance().insertOrUpdateResidentMain(resident);
			MedrexClientManager.getInstance().insertOrUpdateRoomHistory(
					roomHistory);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getFloor(String room) {
		String floor = null;
		for (int i = 0; i < strSubCat1.length; i++) {
			if (strSubCat1[i].equalsIgnoreCase(room)) {
				floor = "1st floor south wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat2.length; i++) {
			if (strSubCat2[i].equalsIgnoreCase(room)) {
				floor = "Main North Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat3.length; i++) {
			if (strSubCat3[i].equalsIgnoreCase(room)) {
				floor = "2nd floor South Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat4.length; i++) {
			if (strSubCat4[i].equalsIgnoreCase(room)) {
				floor = "Main and north wing";
				return floor;
			}
		}
		return null;
	}

	public boolean getResidentExistInHouse() {
		int currentResidentSerial = Global.currentResidenceKey;
		boolean bool = false;
		if (currentResidentSerial != 0) {

			try {
				bool = MedrexClientManager.getInstance()
						.getResidentExistInHouse(currentResidentSerial);
			} catch (Exception e) {
			}
			if (bool == false) {
				JOptionPane.showMessageDialog(null,
						"Room can be allotted for InHouse Resident only.");
				bool = false;
			} else {
				bool = true;
			}
		}
		return bool;
	}

	public void doUpdateFloorsAndRooms() {
		// System.out.println("do Update Floor Called");
		// System.out.println("controller Floor"+controllerRoomList.getFloorType());
		// System.out.println("controller Floor"+controllerRoomList.getRoom());
		String floor = controllerRoomList.getFloorType();
		String room = controllerRoomList.getRoom();
		if (room != null) {
			room = room.replaceAll("<(.)+>", "");
		}
		if (floor != null) {
			floorType.setText(floor);
		}
		if (room != null) {
			txtRoom.setText(room);
		}

	}

	public void updateData() {
		/*
		 * ResidentMain resMain = null; try { resMain =
		 * residentPersonalInfoController.getCurrentResident(); residentMain =
		 * resMain; } catch (MedrexException me) {
		 * JOptionPane.showMessageDialog(null, me.getMessage()); }
		 */
		int currentResidentSerial = Global.currentResidenceKey;
		TempRoomHistory roomHist = null;
		try {
			roomHist = MedrexClientManager.getInstance().getLastRoomHistory(
					currentResidentSerial);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dateChooser.setDate(MedrexClientManager.getServerTime());
		if (roomHist != null) {
			if (roomHist.getStartDate() != null
					&& roomHist.getEndDate() != null) {
				floorType.setText("");
				txtRoom.setText("");
			} else {
				floorType.setText(roomHist.getFloor());
				txtRoom.setText(roomHist.getRoom());
			}
		}
		if (Global.currentLoggedInUserType.equalsIgnoreCase("Administrator")) {
			roomButton2.setVisible(true);
		} else {
			roomButton2.setVisible(false);
		}
	}
}

class TableRoomHistory extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4006651516508606626L;

	private String[] columnNames = { /* "Resident Name", */"Floor", "Room No",
			"Start Date", "End Date" };

	public List<TempRoomHistory> roomHistoryRecords;

	int n = 0;

	TableRoomHistory(List roomHistoryRecords) {
		this.roomHistoryRecords = roomHistoryRecords;
	}

	TableRoomHistory() {
		roomHistoryRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (roomHistoryRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List roomHistoryRecords) {
		this.roomHistoryRecords = roomHistoryRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = roomHistoryRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof TempRoomHistory) {
				TempRoomHistory rc = (TempRoomHistory) o;

				/*
				 * if (col == 0) { ResidentMain rm =
				 * MedrexClientManager.getInstance
				 * ().getResident(rc.getResidentId()); return
				 * rm.getUserPass()+", "+ rm.getUserName(); }
				 */
				if (col == 0) {
					return (rc.getFloor());
				}
				if (col == 1) {
					return (rc.getRoom());
				}
				if (col == 2) {
					return (df.format(rc.getStartDate()));
				}
				if (col == 3) {
					return (df.format(rc.getEndDate()));
				}
				if (col == 4) {
					return (rc.getSerial());
				}
				return ("");
			}
			return "";
		} catch (Exception e) {
			return ("");
		}

	}
}
