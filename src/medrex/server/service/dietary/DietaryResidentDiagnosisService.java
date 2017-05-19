package medrex.server.service.dietary;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryResidentDiagnosis;
import medrex.server.dao.dietary.DietaryResidentDiagnosisDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class DietaryResidentDiagnosisService {

	public int insertOrUpdateDietaryResidentDiagnosis(
			DietaryResidentDiagnosis refDietaryResidentDiagnosis)
			throws MedrexException {
		int serial = DietaryResidentDiagnosisDAO.getInstance()
				.insertOrUpdateDietaryResidentDiagnosis(
						refDietaryResidentDiagnosis);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refDietaryResidentDiagnosis.getResidentId(),
				FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM, serial);
		return serial;
	}

	public List getDietaryResidentDiagnosiss(int residentSerial)
			throws MedrexException {
		return (DietaryResidentDiagnosisDAO.getInstance()
				.getDietaryResidentDiagnosiss(residentSerial));
	}

	public DietaryResidentDiagnosis getDietaryResidentDiagnosis(int serial)
			throws MedrexException {
		return (DietaryResidentDiagnosisDAO.getInstance()
				.getDietaryResidentDiagnosis(serial));
	}

	public void deleteDietaryResidentDiagnosis(int serial)
			throws MedrexException {
		try {
			DietaryResidentDiagnosisDAO.getInstance()
					.deleteDietaryResidentDiagnosis(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM,
					serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
