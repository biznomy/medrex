package medrex.client.main.resident.contactinfo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.masterList.PhoneType;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;

public class ControllerResidentInfoContact implements Controller,
		ControllerTableModel {

	String[] columnNames = { "Contact Name", "Relationship",
			"Power of Attorney", "HC Proxy", "Emergency", "Responsible Party" };

	List<ResidentContact> currentResidentContactList = new ArrayList<ResidentContact>();

	List<ResidentContactPhone> currentResidentContactPhoneList = new ArrayList<ResidentContactPhone>();

	List<ResidentContactPhone> deleteResidentContactPhoneList = new ArrayList<ResidentContactPhone>();

	private List<String> errorList;

	int currentResidentSerial;

	int currentContactSerial;

	int currentContactPhoneSerial;

	int currentRowContactPhone;

	ResidentContactPhone currentContactPhone;

	ControllerResidentInfoContactPhone controllerResidentInfoContactPhone;

	public int getCurrentRowContactPhone() {
		return currentRowContactPhone;
	}

	public void setCurrentRowContactPhone(int currentRowContactPhone) {
		this.currentRowContactPhone = currentRowContactPhone;
	}

	public ControllerResidentInfoContactPhone getControllerResidentInfoContactPhone() {
		return controllerResidentInfoContactPhone;
	}

	public void setControllerResidentInfoContactPhone(
			ControllerResidentInfoContactPhone controllerResidentInfoContactPhone) {
		this.controllerResidentInfoContactPhone = controllerResidentInfoContactPhone;
	}

	public int getCurrentContactPhoneSerial() {
		return currentContactPhoneSerial;
	}

	public void setCurrentContactPhoneSerial(int currentContactPhoneSerial) {
		this.currentContactPhoneSerial = currentContactPhoneSerial;
	}

	public ResidentContactPhone getCurrentResidentContactPhone() {
		return currentContactPhone;
	}

	public void setCurrentResidentContactPhone(
			ResidentContactPhone currentContactPhone) {
		this.currentContactPhone = currentContactPhone;
	}

	public ControllerResidentInfoContact() {
		currentResidentSerial = Global.currentResidenceKey;
		currentContactSerial = 0;
	}

	public List<ResidentContactPhone> getCurrentResidentContactPhoneList() {
		return currentResidentContactPhoneList;
	}

	public void setCurrentResidentContactPhoneList(
			List<ResidentContactPhone> currentResidentContactPhoneList) {
		this.currentResidentContactPhoneList = currentResidentContactPhoneList;
	}

	public List<ResidentContactPhone> getDeleteResidentContactPhoneList() {
		return deleteResidentContactPhoneList;
	}

	public void setDeleteResidentContactPhoneList(
			List<ResidentContactPhone> deleteResidentContactPhoneList) {
		this.deleteResidentContactPhoneList = deleteResidentContactPhoneList;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getRowCount() {
		return currentResidentContactList.size();
	}

	public Object getValueAt(int row, int col) {
		ResidentContact valueObject = currentResidentContactList.get(row);

		switch (col) {

		case 0:
			return valueObject.getFirstName() + " " + valueObject.getLastName();

		case 1:
			return valueObject.getRelationship();

		case 2:
			if (valueObject.getPower() == 0)
				return "No";
			else
				return "Yes";

		case 3:
			if (valueObject.getHcProxy() == 0)
				return "No";
			else
				return "Yes";
		case 4:
			if (valueObject.getEmergency() == 0)
				return "No";
			else
				return "Yes";

		case 5:
			if (valueObject.getResponsibleParty() == 0)
				return "No";
			else
				return "Yes";

		default:
			return "";
		}
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentContact residentContact = (ResidentContact) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList<String>();

		if (field.equals("firstName") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentContact
					.getFirstName(), 3, 10, "First name", errorList);
		}
		if (field.equals("lastName") || field.equals("")) {
			medrexValidation.checkRangeValidation(
					residentContact.getLastName(), 3, 10, "Last name",
					errorList);
		}
		if (field.equals("sex") || field.equals("")) {
			if (residentContact.getSex() != null) {
				medrexValidation.checkRequiredValidation(residentContact
						.getSex().toString().trim(), "sex", errorList);
			}

		}
		if (field.equals("address") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentContact.getAddress(),
					5, 50, "Address", errorList);
		}
		if (field.equals("city") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentContact.getCity(), 3,
					20, "City", errorList);
		}
		if (field.equals("state") || field.equals("")) {
			if (residentContact.getState() != null) {
				medrexValidation.checkRequiredValidation(residentContact
						.getState().toString().trim(), "state", errorList);
			}
		}
		if (field.equals("zip") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentContact.getZip(), 5,
					9, "Zip", errorList);
		}
		if (field.equals("email") || field.equals("")) {
			medrexValidation.checkEmailValidation(residentContact.getEmail(),
					"Email", errorList);
		}
		if (field.equals("relationship") || field.equals("")) {
			if (residentContact.getRelationship() != null) {
				medrexValidation.checkRequiredValidation(residentContact
						.getRelationship().toString().trim(), "relationship",
						errorList);
			}

		}
		// if (field.equals("notes") || field.equals("")) {
		// medrexValidation.checkRangeValidation(residentContact.getNotes(),
		// 5, 200, "Notes", errorList);
		// }

		return errorList;
	}

	public List<ResidentContact> updateResidentContactList()
			throws MedrexException {
		List<ResidentContact> tempList = new ArrayList<ResidentContact>();

		try {
			tempList = MedrexClientManager.getInstance().getResidentContacts(
					currentResidentSerial);
		} catch (MedrexException e1) {
			throw new MedrexException("Error Retrieving resident contact list");
		} catch (RemoteException e) {
		}
		currentResidentContactList = tempList;
		return (currentResidentContactList);
	}

	public void insertOrUpdate(ResidentContact residentContact)
			throws MedrexException {
		try {

			residentContact.setResidentContactPhoneList(null);
			residentContact.setSerial(currentContactSerial);

			ResidentMain resmain = new ResidentMain();
			resmain.setSerial(Global.currentResidenceKey);
			residentContact.setResidentId(resmain);

			// batch update method here
			currentContactSerial = MedrexClientManager.getInstance()
					.insertOrUpdateResidentContact(residentContact);

			ResidentContact resContact = MedrexClientManager.getInstance()
					.getResidentContact(currentContactSerial);

			for (ResidentContactPhone contactPhone : currentResidentContactPhoneList) {
				contactPhone.setContactId(resContact);
				try {
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentContactPhone(contactPhone);
				} catch (MedrexException me) {
					throw new MedrexException("Error saving contact phone data");
				} catch (RemoteException re) {
				}
			}

			for (ResidentContactPhone contactPhone : deleteResidentContactPhoneList) {
				if (contactPhone.getSerial() != 0) {
					try {
						MedrexClientManager.getInstance()
								.deleteResidentContactPhone(
										contactPhone.getSerial());
					} catch (MedrexException me) {
						throw new MedrexException(
								"Error deleting contact phone data");
					} catch (RemoteException re) {
					}
				}
			}

		} catch (MedrexException me) {
			throw new MedrexException("Error saving contact info data");
		} catch (RemoteException re) {
		}
	}

	public int getCurrentResidentSerial() {
		return currentResidentSerial;
	}

	public void setCurrentResidentSerial(int currentResidentSerial) {
		this.currentResidentSerial = currentResidentSerial;
	}

	public int getCurrentContactSerial() {
		return currentContactSerial;
	}

	public void setCurrentContactSerial(int currentContactSerial) {
		this.currentContactSerial = currentContactSerial;
	}

	public void setCurrentSelectedRow(int selectedRow) {
		ResidentContact residentContact = currentResidentContactList
				.get(selectedRow);
		setCurrentContactSerial(residentContact.getSerial());
	}

	public ResidentContact getCurrentResidentContact() throws MedrexException {
		if (currentContactSerial == 0) {
			return new ResidentContact();
		} else {
			ResidentContact residentContact = null;

			try {
				residentContact = MedrexClientManager.getInstance()
						.getResidentContact(currentContactSerial);
			} catch (MedrexException me) {
				throw new MedrexException("Error retrieving resident data");
			} catch (RemoteException re) {
			}
			return residentContact;
		}
	}

	public void deleteCurrentResidentContact() throws MedrexException {
		try {
			MedrexClientManager.getInstance().deleteResidentContact(
					currentContactSerial);
		} catch (MedrexException me) {
			throw new MedrexException("Error deleting resident contact data");
		} catch (RemoteException re) {
		}
	}

	public int insertOrUpdateCensusResidentContact(String firstName,
			String lastName, String relationship, String phoneNumber,
			ImageIcon signature) throws MedrexException {
		currentContactSerial = 0;
		ResidentContact residentContact = new ResidentContact();

		ResidentMain resmain = new ResidentMain();
		resmain.setSerial(Global.currentResidenceKey);
		residentContact.setResidentId(resmain);

		// residentContact.setResidentId(Global.currentResidenceKey);
		residentContact.setFirstName(firstName);
		residentContact.setLastName(lastName);
		// Relation rel = new Relation();
		// System.out.println("relationship: "+relationship);
		// rel.setMsterName(relationship);
		int id = 0;
		try {
			id = MedrexClientManager.getInstance().getMasterList(
					Relation.class, relationship);
		} catch (Exception e) {
		}
		Relation relation = new Relation();
		relation.setId(id);

		residentContact.setRelationship(relation);
		residentContact.setSignature(signature);

		ResidentContactPhone residentContactPhone = new ResidentContactPhone();
		residentContactPhone.setNumber(phoneNumber);
		int phoneTypeId = 0;
		try {
			phoneTypeId = MedrexClientManager.getInstance().getMasterList(
					PhoneType.class, "Landline(Home)");
		} catch (Exception e) {
		}
		PhoneType phoneType = new PhoneType();
		phoneType.setId(phoneTypeId);
		residentContactPhone.setType(phoneType);
		residentContactPhone.setIsPrimary(1);
		residentContactPhone.setSerial(0);

		currentResidentContactPhoneList.add(residentContactPhone);

		try {
			insertOrUpdate(residentContact);
		} catch (MedrexException e) {
			throw new MedrexException("Error saving contact info data");
		}
		return currentContactSerial;
	}
}
