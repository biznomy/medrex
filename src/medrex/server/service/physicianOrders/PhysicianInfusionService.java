package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianInfusion;
import medrex.server.dao.physicianOrders.PhysicianInfusionDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianInfusionService {

	public int insertOrUpdatePhysicianInfusion(
			PhysicianInfusion refPhysicianInfusion) throws MedrexException {
		int serial = PhysicianInfusionDAO.getInstance()
				.insertOrUpdatePhysicianInfusion(refPhysicianInfusion);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPhysicianInfusion.getResidentId(),
				FormSchedulerConstants.PHYSICIAN_INFUSION_FORM, serial);
		return serial;
	}

	public List getPhysicianInfusions(int residentSerial)
			throws MedrexException {
		return (PhysicianInfusionDAO.getInstance()
				.getPhysicianInfusions(residentSerial));
	}

	public PhysicianInfusion getPhysicianInfusion(int serial)
			throws MedrexException {
		return (PhysicianInfusionDAO.getInstance().getPhysicianInfusion(serial));
	}

	public void deletePhysicianInfusion(int serial) throws MedrexException {
		try {
			PhysicianInfusionDAO.getInstance().deletePhysicianInfusion(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PHYSICIAN_INFUSION_FORM, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
