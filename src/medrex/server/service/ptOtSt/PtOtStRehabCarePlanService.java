package medrex.server.service.ptOtSt;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStRehabCarePlan;
import medrex.server.dao.ptOtStAct.PtOtStRehabCarePlanDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStRehabCarePlanService {

	public int insertOrUpdatePtOtStRehabCarePlan(
			PtOtStRehabCarePlan refPtOtStRehabCarePlan) throws MedrexException {
		int serial = PtOtStRehabCarePlanDAO.getInstance()
				.insertOrUpdatePtOtStRehabCarePlan(refPtOtStRehabCarePlan);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStRehabCarePlan.getResidentId(),
				FormSchedulerConstants.REHAB_CARE_PLAN, serial);
		return serial;
	}

	public List getPtOtStRehabCarePlans(int residentSerial)
			throws MedrexException {
		return (PtOtStRehabCarePlanDAO.getInstance()
				.getPtOtStRehabCarePlans(residentSerial));
	}

	public PtOtStRehabCarePlan getPtOtStRehabCarePlan(int serial)
			throws MedrexException {
		return (PtOtStRehabCarePlanDAO.getInstance()
				.getPtOtStRehabCarePlan(serial));
	}

	public void deletePtOtStRehabCarePlan(int serial) throws MedrexException {
		try {
			PtOtStRehabCarePlanDAO.getInstance().deletePtOtStRehabCarePlan(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.REHAB_CARE_PLAN, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
