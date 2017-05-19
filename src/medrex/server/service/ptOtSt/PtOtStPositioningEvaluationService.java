package medrex.server.service.ptOtSt;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStPositioningEvaluation;
import medrex.server.dao.ptOtStAct.PtOtStPositioningEvaluationDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStPositioningEvaluationService {

	public int insertOrUpdatePtOtStPositioningEvaluation(
			PtOtStPositioningEvaluation refPtOtStPositioningEvaluation)
			throws MedrexException {
		int serial = PtOtStPositioningEvaluationDAO.getInstance()
				.insertOrUpdatePtOtStPositioningEvaluation(
						refPtOtStPositioningEvaluation);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStPositioningEvaluation.getResidentId(),
				FormSchedulerConstants.POSITIONING_EVALUATION, serial);
		return serial;
	}

	public List getPtOtStPositioningEvaluations(int residentSerial)
			throws MedrexException {
		return (PtOtStPositioningEvaluationDAO.getInstance()
				.getPtOtStPositioningEvaluations(residentSerial));
	}

	public PtOtStPositioningEvaluation getPtOtStPositioningEvaluation(int serial)
			throws MedrexException {
		return (PtOtStPositioningEvaluationDAO.getInstance()
				.getPtOtStPositioningEvaluation(serial));
	}

	public void deletePtOtStPositioningEvaluation(int serial)
			throws MedrexException {
		try {
			PtOtStPositioningEvaluationDAO.getInstance()
					.deletePtOtStPositioningEvaluation(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.POSITIONING_EVALUATION, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
