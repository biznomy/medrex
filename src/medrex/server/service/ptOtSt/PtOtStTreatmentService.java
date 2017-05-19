package medrex.server.service.ptOtSt;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStTreatment;
import medrex.server.dao.ptOtStAct.PtOtStTreatmentDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStTreatmentService {

	public int insertOrUpdatePtOtStTreatment(PtOtStTreatment refPtOtStTreatment)
			throws MedrexException {
		int serial = PtOtStTreatmentDAO.getInstance()
				.insertOrUpdatePtOtStTreatment(refPtOtStTreatment);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(refPtOtStTreatment
				.getResidentId(), FormSchedulerConstants.TREATMENT, serial);
		return serial;
	}

	public List getPtOtStTreatments(int residentSerial) throws MedrexException {
		return (PtOtStTreatmentDAO.getInstance()
				.getPtOtStTreatments(residentSerial));
	}

	public PtOtStTreatment getPtOtStTreatment(int serial)
			throws MedrexException {
		return (PtOtStTreatmentDAO.getInstance().getPtOtStTreatment(serial));
	}

	public void deletePtOtStTreatment(int serial) throws MedrexException {
		try {
			PtOtStTreatmentDAO.getInstance().deletePtOtStTreatment(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.TREATMENT, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
