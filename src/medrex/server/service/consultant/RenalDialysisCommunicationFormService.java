package medrex.server.service.consultant;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage1;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage2;
import medrex.server.dao.consultant.RenalDialysisCommunicationFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class RenalDialysisCommunicationFormService {

	public int insertOrUpdateRenalDialysisCommunicationFormPage1(
			RenalDialysisCommunicationFormPage1 residentPayer)
			throws MedrexException {
		int serial = RenalDialysisCommunicationFormDAO.getInstance()
				.insertOrUpdateRenalDialysisCommunicationFormPage1(
						residentPayer);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(residentPayer
				.getResidentId(),
				FormSchedulerConstants.RENAL_DIALYSIS_COMMUNICATION_FORM,
				serial);
		return serial;
	}

	public List getRenalDialysisCommunicationFormPage1s(int residentSerial)
			throws MedrexException {
		return (RenalDialysisCommunicationFormDAO.getInstance()
				.getRenalDialysisCommunicationFormPage1s(residentSerial));
	}

	public RenalDialysisCommunicationFormPage1 getRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException {
		return (RenalDialysisCommunicationFormDAO.getInstance()
				.getRenalDialysisCommunicationFormPage1(serial));
	}

	public void deleteRenalDialysisCommunicationFormPage1(int serial)
			throws MedrexException {
		RenalDialysisCommunicationFormDAO.getInstance()
				.deleteRenalDialysisCommunicationFormPage1(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.RENAL_DIALYSIS_COMMUNICATION_FORM,
				serial);
	}

	public int insertOrUpdateRenalDialysisCommunicationFormPage2(
			RenalDialysisCommunicationFormPage2 residentPayer)
			throws MedrexException {
		return RenalDialysisCommunicationFormDAO.getInstance()
				.insertOrUpdateRenalDialysisCommunicationFormPage2(
						residentPayer);
	}

	public RenalDialysisCommunicationFormPage2 getRenalDialysisCommunicationFormPage2(
			int serial) throws MedrexException {
		return (RenalDialysisCommunicationFormDAO.getInstance()
				.getRenalDialysisCommunicationFormPage2(serial));
	}

	public void deleteRenalDialysisCommunicationFormPage2(int serial)
			throws MedrexException {
		RenalDialysisCommunicationFormDAO.getInstance()
				.deleteRenalDialysisCommunicationFormPage2(serial);
	}

}
