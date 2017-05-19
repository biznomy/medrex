package medrex.client.census.countAudit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.dataObj.Rooms;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.resident.ResidentMain;

public class CountAuditFloorWiseTableModal extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5035814126078556389L;
	private final static String[] columnNames = { "Resident", "Room No#",
			"Present", "Reason" };
	private Map<Integer, Rooms> residentMap;
	private List<CountAuditFloor> records;
	private Comparator<? super CountAuditFloor> comparator;
	private Date selectedDate;

	public CountAuditFloorWiseTableModal() {
		this(new ArrayList<CountAuditFloor>());
	}

	public CountAuditFloorWiseTableModal(List<CountAuditFloor> records) {
		residentMap = new HashMap<Integer, Rooms>();
		comparator = new Comparator<CountAuditFloor>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(CountAuditFloor o1, CountAuditFloor o2) {
				int obj = 0;
				if (o1 != null && o2 != null) {
					ResidentMain resi1 = residentMap.get(o1.getResidentId())
							.getResmain();
					ResidentMain resi2 = residentMap.get(o2.getResidentId())
							.getResmain();
					String str1 = resi1.getUserPass();
					String str2 = resi2.getUserPass();
					return str1.compareToIgnoreCase(str2);
				}
				return obj;
			}
		};
		setRecords(records);
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (records != null) {
			return records.size();
		} else {
			return 0;
		}
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];
	}

	@Override
	public Class getColumnClass(int columnIndex) {
		if (columnIndex == 2) {
			return Boolean.class;
		} else {
			return super.getColumnClass(columnIndex);
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 2) {
			return true;
		} else if (columnIndex == 3) {
			Boolean bool = (Boolean) getValueAt(rowIndex, 2);
			if (bool == false) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public List<CountAuditFloor> getRecords() {
		return records;
	}

	public void setRecords(List<CountAuditFloor> records) {
		this.records = records;

		if (records != null && records.size() > 0) {
			residentMap.clear();
			/*
			 * Iterator<CountAuditFloor> itr = records.iterator();
			 * while(itr.hasNext()) { CountAuditFloor ref = itr.next();
			 * ResidentMain resident = null; TempRoomHistory roomHistory = null;
			 * try { resident =
			 * MedrexClientManager.getInstance().getResident(ref
			 * .getResidentId()); roomHistory =
			 * MedrexClientManager.getInstance()
			 * .getRoomHistory(resident.getSerial(), getSelectedDate());
			 * 
			 * if(roomHistory!=null){
			 * resident.setFloorType(roomHistory.getFloor());
			 * resident.setRoom(roomHistory.getRoom()); } } catch (Exception e)
			 * { // e.printStackTrace(); } residentMap.put(ref.getResidentId(),
			 * resident); }
			 */
			try {
				List<Rooms> roomsList = MedrexClientManager.getInstance()
						.getResidentCountAuditInfo(records, getSelectedDate());
				if (roomsList != null) {
					for (Rooms rooms : roomsList) {
						residentMap.put(rooms.getResmain().getSerial(), rooms);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Collections.sort(records, comparator);
		}
	}

	public Object getValueAt(int row, int col) {
		if (records != null) {
			CountAuditFloor values = records.get(row);
			Rooms rooms = residentMap.get(values.getResidentId());
			switch (col) {
			case 0:
				if (rooms != null) {
					return rooms.getResmain().getUserPass() + ", "
							+ rooms.getResmain().getUserName();
				}
				break;
			case 1:
				return rooms.getCurrentRoom();
			case 2:
				return values.isPresent();
			case 3:
				return values.getReason();

			}
		}
		return "";
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		super.setValueAt(value, rowIndex, columnIndex);
		if (records != null) {
			CountAuditFloor values = records.get(rowIndex);
			// ResidentMain resident = (ResidentMain)
			// residentMap.get(values.getResidentId());

			switch (columnIndex) {
			case 2:
				values.setPresent((Boolean) value);
				if ((Boolean) value) {
					values.setReason("");
				}
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			case 3:
				values.setReason((String) value);
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			}

		}
	}

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

}