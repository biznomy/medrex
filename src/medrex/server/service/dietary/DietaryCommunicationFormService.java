package medrex.server.service.dietary;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryCommunicationForm;
import medrex.server.dao.dietary.DietaryCommunicationFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class DietaryCommunicationFormService {

	public int insertOrUpdateDietaryCommunicationForm(
			DietaryCommunicationForm dietaryCommunicationForm)
			throws MedrexException {
		int serial = DietaryCommunicationFormDAO.getInstance()
				.insertOrUpdateDietaryCommunicationForm(
						dietaryCommunicationForm);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				dietaryCommunicationForm.getResidentId(),
				FormSchedulerConstants.DIETARY_COMMUNICATION_FORM, serial);
		return serial;
	}

	public List getDietaryCommunicationForms(int residentSerial)
			throws MedrexException {
		return (DietaryCommunicationFormDAO.getInstance()
				.getDietaryCommunicationForms(residentSerial));
	}

	public DietaryCommunicationForm getDietaryCommunicationForm(int serial)
			throws MedrexException {
		return (DietaryCommunicationFormDAO.getInstance()
				.getDietaryCommunicationForm(serial));
	}

	public void deleteDietaryCommunicationForm(int serial)
			throws MedrexException {
		DietaryCommunicationFormDAO.getInstance()
				.deleteDietaryCommunicationForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.DIETARY_COMMUNICATION_FORM, serial);
	}

}
