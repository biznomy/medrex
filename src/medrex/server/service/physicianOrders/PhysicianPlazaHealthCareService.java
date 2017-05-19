package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianPlazaHealthCare;
import medrex.server.dao.physicianOrders.PhysicianPlazaHealthCareDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianPlazaHealthCareService {

	public int insertOrUpdatePhysicianPlazaHealthCare(
			PhysicianPlazaHealthCare refPhysicianPlazaHealthCare)
			throws MedrexException {
		int serial = PhysicianPlazaHealthCareDAO.getInstance()
				.insertOrUpdatePhysicianPlazaHealthCare(
						refPhysicianPlazaHealthCare);
		// update pending forms for this resident this form
		(new PendingFormService())
				.updatePendingFormsStatus(
						refPhysicianPlazaHealthCare.getResidentId(),
						FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM,
						serial);
		return serial;
	}

	public List getPhysicianPlazaHealthCares(int residentSerial)
			throws MedrexException {
		return (PhysicianPlazaHealthCareDAO.getInstance()
				.getPhysicianPlazaHealthCares(residentSerial));
	}

	public PhysicianPlazaHealthCare getPhysicianPlazaHealthCare(int serial)
			throws MedrexException {
		return (PhysicianPlazaHealthCareDAO.getInstance()
				.getPhysicianPlazaHealthCare(serial));
	}

	public void deletePhysicianPlazaHealthCare(int serial)
			throws MedrexException {
		try {
			PhysicianPlazaHealthCareDAO.getInstance()
					.deletePhysicianPlazaHealthCare(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM,
					serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
