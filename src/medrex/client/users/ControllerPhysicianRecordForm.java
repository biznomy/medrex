package medrex.client.users;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;

public class ControllerPhysicianRecordForm implements Controller {

	private int physicianRecordSerial = Global.currentPhysicianRecordFormKey;
	private List errorList;
	private ControllerUsers controllerUsers;

	public ControllerPhysicianRecordForm(ControllerUsers controllerUsers) {
		this.controllerUsers = controllerUsers;
	}

	public List<String> doValidate(Object bean, String field) {
		Doctors doctors = (Doctors) bean;
		MedrexValidation medrexvalidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("physicianName") || (field.equals(""))) {
			medrexvalidation.checkRangeValidation(doctors.getPhysicianName(),
					3, 25, "Physician name", errorList);
		}
		if (field.equals("physicianSurName") || (field.equals(""))) {
			medrexvalidation.checkRangeValidation(
					doctors.getPhysicianSurName(), 3, 25, "Physician sur name",
					errorList);
		}
		// if (field.equals("impField") || (field.equals(""))) {
		// medrexvalidation.checkSizeValidation(doctors.getImpField(), 7, 7,
		// "Imp", errorList);
		// }
		// if (field.equals("pinNumber") || (field.equals(""))) {
		// medrexvalidation.checkSizeValidation(doctors.getPinNumber(), 6, 6,
		// "Pin", errorList);
		// }
		// if (field.equals("address") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getAddress(), 5, 50,
		// "Address", errorList);
		// }
		// if (field.equals("city") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getCity(), 3, 25,
		// "City", errorList);
		// }
		// if (field.equals("state") || (field.equals(""))) {
		// if(doctors.getState()!=null){
		// medrexvalidation.checkRequiredValidation(doctors.getState().toString().trim(),
		// "State", errorList);
		// }
		//			
		// }
		// if (field.equals("zip") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getZip(), 5, 10, "Zip",
		// errorList);
		// }
		// if (field.equals("phoneNumber") || (field.equals(""))) {
		// medrexvalidation.checkSizeValidation(doctors.getPhoneNumber(), 10,
		// 10, "Phone number", errorList);
		// }
		// if (field.equals("fax") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getFax(), 10, 10,
		// "Fax", errorList);
		// }
		// if (field.equals("cellNumber") || (field.equals(""))) {
		// medrexvalidation.checkSizeValidation(doctors.getCellNumber(), 10,
		// 10, "Cell number", errorList);
		// }
		// if (field.equals("emailAddress") || (field.equals(""))) {
		// medrexvalidation.checkEmailValidation(doctors.getEmailAddress(),
		// "Email Address", errorList);
		// }
		// if (field.equals("npi") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getNpi(), 10, 10,
		// "NPI", errorList);
		// }
		// if (field.equals("federalId") || (field.equals(""))) {
		// medrexvalidation.checkRangeValidation(doctors.getFederalId(), 10,
		// 10, "Federal Id", errorList);
		// }
		// if (field.equals("doctorType") || (field.equals(""))) {
		// if(doctors.getDoctorType()!=null){
		// medrexvalidation.checkRequiredValidation(doctors.getDoctorType().toString().trim(),
		// "Physician Type", errorList);
		// }
		// }

		return errorList;
	}

	public int insertOrUpdateDoctorsRecord(Doctors refDoct)
			throws MedrexException, RemoteException {

		int serial = MedrexClientManager.getInstance()
				.insertOrUpdateDoctorsRecord(refDoct);
		controllerUsers.setCurrentSelectedUserId(serial);
		setPhysicianRecordSerial(serial);
		return serial;
	}

	public Doctors getDoctorsRecord(int userId) {
		Doctors refDoct = null;
		try {

			refDoct = MedrexClientManager.getInstance()
					.getDoctorsRecord(userId);
			setPhysicianRecordSerial(refDoct.getSerial());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refDoct;

	}

	public int getPhysicianRecordSerial() {
		return physicianRecordSerial;
	}

	public void setPhysicianRecordSerial(int physicianRecordSerial) {
		this.physicianRecordSerial = physicianRecordSerial;
	}

	public Users getPhysicialForUser() {
		Users ls = null;
		try {
			ls = MedrexClientManager.getInstance().getUser(
					controllerUsers.getCurrentSerial());
		} catch (Exception e) {

		}
		return ls;
	}
}
