package medrex.client.census.countAudit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.others.Users;

public class CountAuditHistoryTableModal extends AbstractTableModel {
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date", "Floor", "Total", "Present",
			"Audited By" };

	private List<CountAudit> records;
	private Map<Integer, Integer> mapTotal;
	private Map<Integer, Integer> mapPresent;
	private Map<Integer, Users> mapUsers;

	public CountAuditHistoryTableModal(List<CountAudit> records) {
		mapTotal = new HashMap<Integer, Integer>();
		mapPresent = new HashMap<Integer, Integer>();
		mapUsers = new HashMap<Integer, Users>();
		setNewList(records);
	}

	public CountAuditHistoryTableModal() {
		this(new ArrayList<CountAudit>());
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

	public void setNewList(List rec) {
		records = rec;
		int total = 0, present = 0;
		mapTotal.clear();
		mapPresent.clear();

		if (records != null && records.size() > 0) {
			Iterator<CountAudit> itr = records.iterator();
			while (itr.hasNext()) {
				CountAudit ref = itr.next();
				total = present = 0;
				List<CountAuditFloor> floorRecords = ref.getAuditedFloors();
				if (floorRecords != null && floorRecords.size() > 0) {
					total = floorRecords.size();
					Iterator<CountAuditFloor> fItr = floorRecords.iterator();
					while (fItr.hasNext()) {
						CountAuditFloor refFloor = fItr.next();
						if (refFloor.isPresent()) {
							present++;
						}
					}
				}
				Users user = null;
				try {
					user = MedrexClientManager.getInstance().getUser(
							ref.getAuditedBy());
				} catch (Exception e) {
					e.printStackTrace();
				}

				mapTotal.put(ref.getSerial(), total);
				mapPresent.put(ref.getSerial(), present);
				mapUsers.put(ref.getSerial(), user);
			}
		}
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		if (records != null) {
			CountAudit ref = records.get(row);
			if (ref != null) {
				switch (col) {
				case 0:
					return ref.getDateAndTime();
				case 1:
					return ref.getFloor();
				case 2:
					return mapTotal.get(ref.getSerial());
				case 3:
					return mapPresent.get(ref.getSerial());
				case 4:
					Users user = mapUsers.get(ref.getSerial());
					if (user != null) {
						return user.getUserName();
					}
				case 6:
					return ref.getSerial();
				default:
					return "";
				}
			}

		}
		return "";
	}
}
