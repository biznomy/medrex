package medrex.client.masterList;

import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.masterList.MasterList;

public class ControllerMasterList implements Controller {

	protected List errorList;
	protected static final String[] columnName = new String[] { "Name" };

	protected int currentSerial;
	protected List<MasterList> currentRecordList;
	protected Class type;

	public ControllerMasterList(Class type) {
		setType(type);
		setNewList(new ArrayList<MasterList>());
	}

	public void setType(Class type2) {
		this.type = type2;
		currentSerial = 0;
		setNewList(getRecords());
	}

	public void insertOrUpdateRecord(MasterList refIncome) {
		try {
			MedrexClientManager.getInstance().insertOrUpdateMasterListRecord(
					refIncome);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MasterList getRecord() {
		if (currentSerial != 0) {
			try {
				return MedrexClientManager.getInstance().getMasterListRecord(
						type, currentSerial);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			try {
				return (MasterList) type.newInstance();
			} catch (Exception e) {
				return null;
			}
		}
	}

	public List<MasterList> getRecords() {
		List<MasterList> l = null;
		try {
			l = MedrexClientManager.getInstance().getMasterListRecords(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public void deleteRecord() {
		try {
			MedrexClientManager.getInstance().deleteMasterListRecord(type,
					currentSerial);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTypeName() {
		return type.getSimpleName();
	}

	public List<String> doValidate(Object bean, String field) {
		MasterList masterList = (MasterList) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();
		if (field.equals("msterName") || field.equals("")) {
			if (masterList.getMsterName() != null)
				medValidation.checkRangeValidation(masterList.getMsterName()
						.toString().trim(), 3, 25, "value", errorList);
		}
		return errorList;
	}

	public int getColumnCount() {
		return columnName.length;
	}

	public int getRowCount() {
		return (currentRecordList.size());
	}

	public String getColumnName(int col) {
		return columnName[col];
	}

	public void setNewList(List<MasterList> newList) {
		currentRecordList = newList;
		// System.out.println("list: " + newList);
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = currentRecordList.get(row);
			if (o instanceof MasterList) {
				MasterList ia = (MasterList) o;
				if (col == 0) {
					return ia.getMsterName();
				}
				if (col == 1) {
					return ia.getId();
				}
			}
		} catch (Exception e) {
			return ("");
		}
		return ("");
	}

	public int getCurrentSerial() {
		return currentSerial;
	}

	public void setCurrentSerial(int i) {
		this.currentSerial = i;
	}

	public void setCurrentSelectedRow(int selectedRow) {
		setCurrentSerial((Integer) getValueAt(selectedRow, 1));
		// System.out.println(currentRecordList.size() + ", " + selectedRow +
		// ", " + currentSerial);
	}

	// public List<String> doValidate(Object bean, String field) {
	//		
	// return null;
	// }

}
