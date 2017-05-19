package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianSpeciality;
import medrex.commons.vo.physicianOrders.PhysicianSpecialityRow;
import medrex.server.dao.physicianOrders.PhysicianSpecialityDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianSpecialityService {

	public int insertOrUpdatePhysicianSpeciality(PhysicianSpeciality ps)
			throws MedrexException {
		int serial = PhysicianSpecialityDAO.getInstance()
				.insertOrUpdatePhysicianSpeciality(ps);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ps.getResidentId(),
				FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM, serial);
		return serial;
	}

	public List getPhysicianSpecialitys(int residentSerial)
			throws MedrexException {
		return (PhysicianSpecialityDAO.getInstance()
				.getPhysicianSpecialitys(residentSerial));
	}

	public PhysicianSpeciality getPhysicianSpeciality(int serial)
			throws MedrexException {
		return (PhysicianSpecialityDAO.getInstance()
				.getPhysicianSpeciality(serial));
	}

	public void deletePhysicianSpeciality(int serial) throws MedrexException {
		PhysicianSpecialityDAO.getInstance().deletePhysicianSpeciality(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM, serial);
	}

	public int insertOrUpdatePhysicianSpecialityRow(PhysicianSpecialityRow psr)
			throws MedrexException {
		return PhysicianSpecialityDAO.getInstance()
				.insertOrUpdatePhysicianSpecialityRow(psr);
	}

	public PhysicianSpecialityRow getPhysicianSpecialityRow(int formId,
			int formNum) throws MedrexException {
		return (PhysicianSpecialityDAO.getInstance().getPhysicianSpecialityRow(
				formId, formNum));
	}

}
