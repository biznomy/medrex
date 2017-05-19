package medrex.client.main.resident.personalInfo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.enums.DateFormat;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

public class ControllerResidentPersonalInfo implements Controller {

	private List errorList;

	int currentResidenceSerial;

	public List<String> doValidate(Object bean, String field) {
		ResidentMain rm = (ResidentMain) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("userName") || field.equals("")) {
			medrexValidation.checkRangeValidation(rm.getUserName(), 3, 25,
					"First name", errorList);
		}
		if (field.equals("userPass") || field.equals("")) {
			medrexValidation.checkRangeValidation(rm.getUserPass(), 3, 25,
					"Last name", errorList);
		}
		// if (field.equals("nickName") || field.equals("")) {
		// medrexValidation.checkRangeValidation(rm.getNickName(), 3, 25,
		// "Nick name", errorList);
		// }
		if (field.equals("address") || field.equals("")) {
			medrexValidation.checkRangeValidation(rm.getAddress(), 5, 50,
					"Address", errorList);
		}
		if (field.equals("city") || field.equals("")) {
			medrexValidation.checkRangeValidation(rm.getCity(), 3, 25, "City",
					errorList);
		}
		if (field.equals("zip") || field.equals("")) {
			medrexValidation.checkRangeValidation(rm.getZip(), 5, 10, "Zip",
					errorList);
		}
		if (field.equals("dob") || field.equals("")) {
			medrexValidation.checkRequiredValidation(rm.getDob(), "DOB",
					errorList);
		}

		if (field.equals("home") || field.equals("")) {
			if (!rm.getHome().equals("")) {
				medrexValidation.checkSizeValidation(rm.getHome(), 10, 10,
						"Home phone", errorList);
			}

		}
		if (field.equals("work") || field.equals("")) {
			if (!rm.getWork().equals("")) {
				medrexValidation.checkSizeValidation(rm.getWork(), 10, 10,
						"Work phone", errorList);
			}
		}
		if (field.equals("cell") || field.equals("")) {
			if (!rm.getCell().equals("")) {
				medrexValidation.checkSizeValidation(rm.getCell(), 10, 10,
						"Cell", errorList);
			}
		}
		if (field.equals("ss1") || field.equals("")) {
			medrexValidation.checkSizeValidation(rm.getSs1(), 9, 9,
					"SS Number", errorList);
		}
		if (field.equals("birthPlace") || field.equals("")) {
			if (!rm.getBirthPlace().equals("")) {
				medrexValidation.checkRangeValidation(rm.getBirthPlace(), 0,
						20, "Birth Place", errorList);
			}

		}
		if (field.equals("maritalStatus") || field.equals("")) {
			if (rm.getMaritalStatus() != null) {
				medrexValidation.checkRequiredValidation(rm.getMaritalStatus()
						.toString().trim(), "marital status", errorList);
			}

		}
		if (field.equals("state") || field.equals("")) {
			if (rm.getState() != null) {
				medrexValidation.checkRequiredValidation(rm.getState()
						.toString().trim(), "state", errorList);
			}

		}

		if (field.equals("sex") || field.equals("")) {
			if (rm.getSex() != null) {
				medrexValidation.checkRequiredValidation(rm.getSex().toString()
						.trim(), "sex", errorList);
			}

		}
		if (field.equals("citizen") || field.equals("")) {
			if (rm.getCitizen() != null) {
				medrexValidation.checkRequiredValidation(rm.getCitizen()
						.toString().trim(), "citizen", errorList);
			}

		}
		if (field.equals("religion") || field.equals("")) {
			if (rm.getReligion() != null) {
				medrexValidation.checkRequiredValidation(rm.getReligion()
						.toString().trim(), "religion", errorList);
			}

		}
		if (field.equals("language") || field.equals("")) {
			if (rm.getLanguage() != null) {
				medrexValidation.checkRequiredValidation(rm.getLanguage()
						.toString().trim(), "language", errorList);
			}

		}
		if (field.equals("origin") || field.equals("")) {
			if (rm.getOrigin() != null) {
				medrexValidation.checkRequiredValidation(rm.getOrigin()
						.toString().trim(), "origion", errorList);
			}

		}

		if (field.equals("type") || field.equals("")) {
			if (rm.getType() != null) {
				medrexValidation.checkRequiredValidation(rm.getType()
						.toString().trim(), "status", errorList);
			}

		}
		/*
		 * if (field.equals("floorType") || field.equals("")) {
		 * if(rm.getFloorType()!=null){
		 * medrexValidation.checkRequiredValidation(rm.getFloorType().trim(),
		 * "floor type", errorList); }
		 * 
		 * } if (field.equals("room") || field.equals("")) {
		 * if(rm.getRoom()!=null){
		 * medrexValidation.checkRequiredValidation(rm.getRoom().trim(), "room",
		 * errorList); }
		 * 
		 * }
		 */

		return errorList;
	}

	public void insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException {
		MessagesRecord alertMsg = null;
		if (currentResidenceSerial == 0) {
			residentMain.setSerial(0);
		} else {
			residentMain.setSerial(currentResidenceSerial);
		}
		if (currentResidenceSerial == 0) {
			alertMsg = new MessagesRecord();
			alertMsg.setSubject("New Resident Added");
			String msg = "<html><center><h1>New Resident Added</h1></center><br>"
					+ "<b>RESIDENT NAME : </b>"
					+ residentMain.getUserPass()
					+ ", "
					+ residentMain.getUserName()
					+ "<BR>"
					+ "<b>NICK NAME     : </b>"
					+ residentMain.getNickName()
					+ "<BR>"
					+ "<b>SEX           : </b>"
					+ residentMain.getSex()
					+ "<BR>"
					+ "<b>MARITAL STATUS: </b>"
					+ residentMain.getMaritalStatus()
					+ "<BR>"
					+ "<b>ADDRESS       : </b>"
					+ residentMain.getAddress()
					+ "<BR>"
					+ "<b>CITY          : </b>"
					+ residentMain.getCity()
					+ "<BR>"
					+ "<b>STATE         : </b>"
					+ residentMain.getState()
					+ "<BR>"
					+ "<b>ZIP           : </b>"
					+ residentMain.getZip()
					+ "<BR>"
					+ "<b>DATE OF BIRTH : </b>"
					+ (residentMain.getDob() != null ? DateFormat.yyyyMMdd
							.getFormatter().format(residentMain.getDob()) : "")
					+ "<BR>"
					+ "<b>BIRTH PLACE   : </b>"
					+ residentMain.getBirthPlace()
					+ "<BR>"
					+ "<b>SSN           : </b>"
					+ residentMain.getSs1()
					+ "<BR>"
					+ "<b>CITIZEN TYPE  : </b>"
					+ residentMain.getCitizen()
					+ "<BR>"
					+ "<b>RELIGION      : </b>"
					+ residentMain.getReligion()
					+ "<BR>"
					+ "<b>STATUS        : </b>"
					+ residentMain.getType() + "<BR>";
			/* TODO: Migrating to room history */
			// + "<b>FLOOR         : </b>"
			// + residentMain.getFloorType()
			// + "<BR>"
			// + "<b>ROOM NO.      : </b>"
			// + residentMain.getRoom() + "<BR>";
			alertMsg.setMessage(msg);
			alertMsg.setNew(true);
			alertMsg.setType("Alert");
			alertMsg.setTimeRecord(MedrexClientManager.getServerTime());
		}
		try {
			// System.out.println("before saving in client "+residentMain.getVersion());
			currentResidenceSerial = MedrexClientManager.getInstance()
					.insertOrUpdateResidentMain(residentMain);
			Global.currentResidenceKey = currentResidenceSerial;
			Global.panelMainDesktopTmp.updateResidentList();
			Global.panelMainDesktopTmp.setSelected(currentResidenceSerial);
			if (alertMsg != null) {
				List<Users> allUsers = null;
				try {
					allUsers = MedrexClientManager.getInstance().getUsers();
					MedrexClientManager.getInstance()
							.insertOrUpdateMessagesRecord(alertMsg, allUsers);
				} catch (MedrexException e1) {
					throw new MedrexException("Error Retrieving Users");
				} catch (RemoteException e) {
				}
			}
		} catch (MedrexException me) {
			throw new MedrexException(me.getMessage());
		} catch (RemoteException re) {
		}
	}

	public ResidentMain getCurrentResident() throws MedrexException {
		setCurrentResidenceSerial(Global.currentResidenceKey);
		if (currentResidenceSerial == 0) {
			return new ResidentMain();
		} else {
			ResidentMain residentMain = null;
			try {
				residentMain = MedrexClientManager.getInstance().getResident(
						currentResidenceSerial);
			} catch (MedrexException me) {
				throw new MedrexException("Error retrieving resident data");
			} catch (RemoteException re) {
			}

			// System.out.println("got current resident with version"+residentMain.getVersion());
			return residentMain;
		}
	}

	public List getOccupiedRoom() throws MedrexException {
		List occupiedRoomList = null;
		try {
			occupiedRoomList = MedrexClientManager.getInstance()
					.getOccupiedRoom();
		} catch (MedrexException me) {
			throw new MedrexException("Error retrieving occupied room");
		} catch (RemoteException re) {
		}
		return occupiedRoomList;
	}

	public int getCurrentResidenceSerial() {
		return currentResidenceSerial;
	}

	public void setCurrentResidenceSerial(int currentResidenceSerial) {
		this.currentResidenceSerial = currentResidenceSerial;
	}

}
