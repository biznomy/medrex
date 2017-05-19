package medrex.client.main.resident.ADL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.scheduling.scheduling;

public class ControllerResidentSchedulingAdd implements Controller,
		ControllerTableModel {
	private String[] columnNames = { "Type", "Mon", "Tus", "Wed", "Thrus",
			"Fri", "Sat", "Sun" };
	int n = 0;
	String[] comboList = { "PROM OR A/AA ROM", "AMBULATION/BED MOB.",
			"TRANSFERS", "SPLINTING/BRACING", "DRESS'S/GROOM'G/HYG",
			"EATING/SWALLOWING", "AMP./PROS.CARE", "COMMUNICATION",
			"SCHEDULED TOILETING" };
	List<scheduling> currentSchedulingList = new ArrayList<scheduling>();

	int currentResidentSerial;

	int currentSerial;

	int currentContactPhoneSerial;

	int currentRowContactPhone;

	String combo;

	public String getCombo() {
		return combo;
	}

	public void setComboList(String combo) {
		this.combo = combo;
	}

	public List getComboList() {
		List<String> scheList = new ArrayList<String>();
		for (int i = 0; i < comboList.length; i++) {
			scheList.add(comboList[i]);
		}
		return scheList;
	}

	public void insertOrUpdateScheduling(scheduling sch) {
		try {
			MedrexClientManager.getInstance().insertOrUpdateScheduling(sch);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void IncomeJTable(List schData) {
		currentSchedulingList = schData;
	}

	public void IncomeJTable() {
		currentSchedulingList = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (currentSchedulingList.size());
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List newList) {
		currentSchedulingList = newList;
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = currentSchedulingList.get(row);
			if (o instanceof scheduling) {
				scheduling ia = (scheduling) o;
				if (col == 0) {
					return (ia.getProcedureType());
				}
				if (col == 1) {
					return (ia.getMonproced() + "");
				}
				if (col == 2) {
					return (ia.getTusproced() + "");
				}
				if (col == 3) {
					return (ia.getWedproced() + "");
				}
				if (col == 4) {
					return (ia.getThruproced() + "");
				}
				if (col == 5) {
					return (ia.getFriproced() + "");
				}
				if (col == 6) {
					return (ia.getSatproced() + "");
				}
				if (col == 7) {
					return (ia.getSunproced() + "");
				}
				if (col == 8) {
					return (ia.getSerial() + "");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("");
	}

	public List getResidentScheduling() throws RemoteException, MedrexException {
		// System.out.println("Current Resident key " +
		// Global.currentResidenceKey);

		return MedrexClientManager.getInstance().getResidentScheduling(
				Global.currentResidenceKey);

	}

	public scheduling getSchedulingObject() throws MedrexException,
			RemoteException {
		return MedrexClientManager.getInstance().getSchedulingObject(
				currentSerial);
	}

	public int getCurrentResidentSerial() {
		return currentResidentSerial;
	}

	public void setCurrentResidentSerial(int currentResidentSerial) {
		this.currentResidentSerial = currentResidentSerial;
	}

	public int getCurrentSerial() {
		return currentSerial;
	}

	public void setCurrentSerial(int currentSerial) {
		this.currentSerial = currentSerial;
	}

	public void setCurrentSelectedRow(int selectedRow) {
		scheduling residentContact = currentSchedulingList.get(selectedRow);
		setCurrentSerial(residentContact.getSerial());
	}

	@Override
	public List<String> doValidate(Object bean, String field) {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete(String str) throws MedrexException, RemoteException {
		System.out.println("serial is " + currentSerial);
		return MedrexClientManager.getInstance().deleteScheduling(
				currentSerial, str);
	}

	/*
	 * public void deleteCobmoField(String title) { Iterator itr =
	 * scheList.iterator(); while(itr.hasNext()){ String str = (String)
	 * itr.next(); if(str.equalsIgnoreCase(title)){ scheList.remove(title);
	 * break; } } setScheList(scheList); }
	 */

}
