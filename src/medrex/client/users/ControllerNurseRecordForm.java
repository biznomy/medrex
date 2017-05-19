package medrex.client.users;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MedrexValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;

public class ControllerNurseRecordForm implements Controller {

	private int nurseRecordSerial;
	private List errorList;
	private ControllerUsers controllerUsers;

	public ControllerNurseRecordForm(ControllerUsers controllerUsers) {
		this.controllerUsers = controllerUsers;
	}

	public List<String> doValidate(Object bean, String field) {
		Nurse nurse = (Nurse) bean;
		MedrexValidation medrexvalidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("nurseName") || (field.equals(""))) {
			medrexvalidation.checkRangeValidation(nurse.getNurseName(), 3, 25,
					"Nurse name", errorList);
		}
		if (field.equals("nurseSurName") || (field.equals(""))) {
			medrexvalidation.checkRangeValidation(nurse.getNurseSurName(), 3,
					25, "Nurse Sur name", errorList);
		}
		// if (field.equals("address") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getAddress(),
		// 3, 50, "Address", errorList);
		// }
		// if (field.equals("city") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getCity(),
		// 3, 25, "City", errorList);
		// }
		// if (field.equals("state") || (field.equals(""))) {
		// if(nurse.getState()!=null){
		// medrexvalidation.checkRequiredValidation(nurse.getState().toString().trim(),
		// "State", errorList);
		// }
		//			
		// }
		// if (field.equals("zipField") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getZipField(), 5,
		// 10, "Zip", errorList);
		// }
		// if (field.equals("phone") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getPhone(), 10,
		// 10, "Phone number", errorList);
		// }
		// if (field.equals("faxField") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getFaxField(), 10,
		// 10, "Fax", errorList);
		// }
		// if (field.equals("cell") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(nurse.getCell(), 10,
		// 10, "Cell number", errorList);
		// }
		// if (field.equals("emailAddress") || (field.equals(""))) {
		// medrexvalidation.checkEmailValidation(nurse.getEmailAddress(),
		// "Email Address", errorList);
		// }
		/*
		 * if (field.equals("nurseTypeSelected") || (field.equals(""))) {
		 * medrexvalidation.checkRangeValidation(nurse.getNurseTypeSelected(),
		 * 3, 10, "Nurse type selected", errorList); }
		 */

		return errorList;
	}

	public int insertOrUpdateNurseRecord(Nurse refNurse)
			throws MedrexException, RemoteException {
		int serial = MedrexClientManager.getInstance()
				.insertOrUpdateNurseRecord(refNurse);
		setNurseRecordSerial(serial);
		controllerUsers.setCurrentSelectedUserId(serial);
		return serial;
	}

	public Nurse getNursesRecord(int userId) {
		Nurse refNurse = null;
		try {
			refNurse = MedrexClientManager.getInstance().getNurseRecord(userId);
			setNurseRecordSerial(refNurse.getSerial());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return refNurse;
	}

	public Users getNurseForUser() {
		Users ls = null;
		try {
			ls = MedrexClientManager.getInstance().getUser(
					controllerUsers.getCurrentSerial());
		} catch (Exception e) {

		}
		return ls;
	}

	public int getNurseRecordSerial() {
		return nurseRecordSerial;
	}

	public void setNurseRecordSerial(int nurseRecordSerial) {
		this.nurseRecordSerial = nurseRecordSerial;
	}

}
