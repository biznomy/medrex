package medrex.client.main.resident.personalInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.resident.ResidentMain;

public class ControllerRoomList implements ControllerTableModel {

	private String[] columnNames = { "Room", "On BedHold" };

	private List<String> allRooms = new ArrayList<String>();
	private ControllerResidentPersonalInfo residentPersonalInfoController = new ControllerResidentPersonalInfo();

	private String floorType;
	private String room;
	private String bedHoldRoom = null;
	private List occupiedRoomList = null;

	private Map<String, String> m = new HashMap<String, String>();
	private Map<String, Integer> residentId = new HashMap<String, Integer>();

	private String[] strSubCat1 = { "100", "101-1", "101-2", "102-1", "102-2",
			"103-1", "103-2", "104-1", "104-2", "104-3", "104-4", "105-1",
			"105-2", "106-1", "106-2", "107-1", "107-2", "108-1", "108-2",
			"109-1", "109-2", "109-3", "109-4" };

	private String[] strSubCat2 = { "110-1", "110-2", "110-3", "110-4",
			"111-1", "111-2", "112-1", "112-2", "113-1", "113-2", "114-1",
			"114-2", "115-1", "115-2", "116-1", "116-2", "117-1", "117-2",
			"118-1", "118-2", "119-1", "119-2", "120-1", "120-2", "120",
			"121-1", "121-2", "122-1", "122-2", "123-1", "123-2", "124", "125",
			"126-1", "126-2", "127-1", "127-2", "128", "128", "129-1", "129-2",
			"129-3" };

	private String[] strSubCat3 = { "201", "202", "203-1", "203-2", "204-1",
			"204-2", "205-1", "205-2", "206-1", "206-2", "206-3", "206-4",
			"207-1", "207-2", "208-1", "208-2", "209-1", "209-2", "210-1",
			"210-2", "211-1", "211-2" };

	private String[] strSubCat4 = { "212-1", "212-2", "212-3", "212-4",
			"213-1", "213-2", "213-3", "213-4", "214-1", "214-2", "215-1",
			"215-2", "216-1", "216-2", "217-1", "217-2", "218-1", "218-2",
			"219-1", "219-2", "220-1", "220-2", "221-1", "221-2", "222-1",
			"222-2", "223-1", "223-2", "224-1", "224-2", "225-1", "225-2",
			"226-1", "226-2", "227-1", "227-2", "228-1", "228-2", "229",
			"230-1", "230-2", "231-1", "231-2", "232-1", "232-2", "232-3" };

	public List<String> getAllRooms(String floor) {
		List<String> roomList = new ArrayList<String>();
		List list = getRoomsOnBedHold();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String roomOnBedHold = (String) it.next();
			m.put(roomOnBedHold, roomOnBedHold);
		}

		if (floor.equals("1st floor south wing")) {
			for (int i = 0; i < strSubCat1.length; i++) {
				roomList.add(strSubCat1[i]);
			}
		}
		if (floor.equals("Main North Wing")) {
			for (int i = 0; i < strSubCat2.length; i++) {
				roomList.add(strSubCat2[i]);
			}
		}
		if (floor.equals("2nd floor South Wing")) {
			for (int i = 0; i < strSubCat3.length; i++) {
				roomList.add(strSubCat3[i]);
			}
		}
		if (floor.equals("Main and north wing")) {
			for (int i = 0; i < strSubCat4.length; i++) {
				roomList.add(strSubCat4[i]);
			}
		}

		try {
			occupiedRoomList = residentPersonalInfoController.getOccupiedRoom();
			Iterator itr = occupiedRoomList.iterator();
			while (itr.hasNext()) {
				String room = itr.next() + "";
				if (room != null) {
					// cmbRoom.removeItem(room);
					if (m.get(room) == null) {
						roomList.remove(room);
					}
				}

			}
		} catch (MedrexException me) {
			JOptionPane.showMessageDialog(null, me.getMessage());
		}

		allRooms = roomList;
		return allRooms;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getRowCount() {
		return allRooms.size();
	}

	public Object getValueAt(int row, int col) {
		String valueObject = allRooms.get(row);

		switch (col) {

		case 0:
			if (m.get(valueObject) != null) {
				return "<html><font color='red'><b>" + valueObject;
			} else {
				return valueObject;
			}

		case 1:
			if (m.get(valueObject) != null) {
				return "?";
			}
		case 2:
			if (residentId.get(valueObject) != null) {
				return residentId.get(valueObject).toString();
			}
		default:
			return ("");
		}
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public List getRoomsOnBedHold() {
		List listOnBedHold = null;
		List roomOnBedHold = new ArrayList();
		try {
			listOnBedHold = MedrexClientManager.getInstance().getBedHolds();
			Iterator itr = listOnBedHold.iterator();
			while (itr.hasNext()) {
				BedHold bd = (BedHold) itr.next();
				ResidentMain rm = MedrexClientManager.getInstance()
						.getResident(bd.getResidentId());
				residentId.put(rm.getOldroom(), rm.getSerial());
				roomOnBedHold.add(rm.getOldroom());

			}
		} catch (Exception e) {
		}
		return roomOnBedHold;
	}

	public String getOldRoom() {
		ResidentMain res = null;
		try {
			if (Global.currentResidenceKey != 0) {
				res = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			}
			try {
				if (Global.panelCensusMain.getResident().getSerial() != 0) {
					res = MedrexClientManager.getInstance().getResident(
							Global.panelCensusMain.getResident().getSerial());
				}
			} catch (Exception e) {
			}

		} catch (Exception e) {
		}
		String room = res.getOldroom();
		if (room != null) {
			return room;
		} else {
			return "";
		}

	}

}
