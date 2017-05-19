package medrex.client.main.resident.contactinfo;

import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.resident.ResidentContactPhone;

public class ControllerResidentInfoContactPhone implements Controller,
		ControllerTableModel {

	private ControllerResidentInfoContact controllerResidentInfoContact;

	private String[] columnNames = { "Number", "Type", "Primary" };

	private List<String> errorList;

	public ControllerResidentInfoContactPhone(
			ControllerResidentInfoContact controllerResidentInfoContact) {
		this.controllerResidentInfoContact = controllerResidentInfoContact;
		this.controllerResidentInfoContact
				.setControllerResidentInfoContactPhone(this);
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentContactPhone residentContactPhone = (ResidentContactPhone) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		List<String> errorList = new ArrayList<String>();

		if (field.equals("number") || field.equals("")) {
			medrexValidation.checkSizeValidation(residentContactPhone
					.getNumber(), 10, 10, "Number", errorList);
		}
		if (field.equals("type") || field.equals("")) {
			if (residentContactPhone.getType() != null) {
				medrexValidation.checkRequiredValidation(residentContactPhone
						.getType().toString().trim(), "Type", errorList);
			}
		}

		return errorList;
	}

	public ControllerResidentInfoContact getControllerResidentInfoContact() {
		return controllerResidentInfoContact;
	}

	public void setControllerResidentInfoContact(
			ControllerResidentInfoContact controllerResidentInfoContact) {
		this.controllerResidentInfoContact = controllerResidentInfoContact;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getRowCount() {
		return controllerResidentInfoContact
				.getCurrentResidentContactPhoneList().size();
	}

	public Object getValueAt(int row, int col) {
		ResidentContactPhone valueObject = controllerResidentInfoContact
				.getCurrentResidentContactPhoneList().get(row);

		switch (col) {

		case 0:
			return valueObject.getNumber();

		case 1:
			return valueObject.getType();

		case 2:
			if (valueObject.getIsPrimary() == 0) {
				return ("No");
			} else {
				return ("Yes");
			}

		default:
			return "";
		}
	}

	public void updateResidentContactPhoneList() {
		List<ResidentContactPhone> tempList = new ArrayList<ResidentContactPhone>();

		try {
			tempList = MedrexClientManager.getInstance()
					.getResidentContactPhones(
							controllerResidentInfoContact
									.getCurrentContactSerial());
		} catch (Exception e) {
		}
		controllerResidentInfoContact
				.setCurrentResidentContactPhoneList(tempList);

	}

	public void insertOrUpdate(ResidentContactPhone residentContactPhone) {
		try {
			// residentContactPhone.setContactId(controllerResidentInfoContact
			// .getCurrentContactSerial());
			residentContactPhone.setSerial(controllerResidentInfoContact
					.getCurrentContactPhoneSerial());
			if (controllerResidentInfoContact.getCurrentRowContactPhone() == -1) {
				controllerResidentInfoContact
						.getCurrentResidentContactPhoneList().add(
								residentContactPhone);
			} else {
				controllerResidentInfoContact
						.getCurrentResidentContactPhoneList().set(
								controllerResidentInfoContact
										.getCurrentRowContactPhone(),
								residentContactPhone);
			}

		} catch (Exception e) {
		}
	}

	public ResidentContactPhone getCurrentResidentContactPhone() {
		if (controllerResidentInfoContact.getCurrentRowContactPhone() == -1) {
			return new ResidentContactPhone();
		} else {
			ResidentContactPhone rcp = controllerResidentInfoContact
					.getCurrentResidentContactPhoneList().get(
							controllerResidentInfoContact
									.getCurrentRowContactPhone());
			controllerResidentInfoContact.setCurrentContactPhoneSerial(rcp
					.getSerial());
			return rcp;

		}
	}

	public void deleteCurrentResidentContactPhone() {
		if (controllerResidentInfoContact.getCurrentRowContactPhone() == -1) {
			// return new ResidentContactPhone();
		} else {
			ResidentContactPhone residentContactPhone = controllerResidentInfoContact
					.getCurrentResidentContactPhoneList().remove(
							controllerResidentInfoContact
									.getCurrentRowContactPhone());
			controllerResidentInfoContact.getDeleteResidentContactPhoneList()
					.add(residentContactPhone);
		}
	}

	public void setSelectedPhoneRow(int selected) {
		controllerResidentInfoContact.setCurrentRowContactPhone(selected);
	}

	public int getSelectedPhoneRow() {
		return (controllerResidentInfoContact.getCurrentRowContactPhone());
	}

}
