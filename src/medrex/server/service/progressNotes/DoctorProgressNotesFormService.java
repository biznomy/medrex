package medrex.server.service.progressNotes;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesForm;
import medrex.server.dao.progressNotes.DoctorsProgressNotesFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class DoctorProgressNotesFormService {

	public int insertOrUpdateDoctorsProgressNotesForm(
			DoctorsProgressNotesForm ntnf) throws MedrexException {
		int serial = DoctorsProgressNotesFormDAO.getInstance()
				.insertOrUpdateDoctorsProgressNotesForm(ntnf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(),
				FormSchedulerConstants.DOCTORS_PROGRESS_NOTES, serial);
		return serial;
	}

	public List getDoctorsProgressNotesForms(int residentSerial)
			throws MedrexException {
		return (DoctorsProgressNotesFormDAO.getInstance()
				.getDoctorsProgressNotesForms(residentSerial));
	}

	public DoctorsProgressNotesForm getDoctorsProgressNotesForm(int serial)
			throws MedrexException {
		return (DoctorsProgressNotesFormDAO.getInstance()
				.getDoctorsProgressNotesForm(serial));
	}

	public void deleteDoctorsProgressNotesForm(int serial)
			throws MedrexException {
		DoctorsProgressNotesFormDAO.getInstance()
				.deleteDoctorsProgressNotesForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.DOCTORS_PROGRESS_NOTES, serial);
	}

	public int insertOrUpdateDoctorsProgressNotesFormRows(List ntnfr)
			throws MedrexException {
		return DoctorsProgressNotesFormDAO.getInstance()
				.insertOrUpdateDoctorsProgressNotesFormRows(ntnfr);
	}

	public List getDoctorsProgressNotesFormRows(int formId)
			throws MedrexException {
		return (DoctorsProgressNotesFormDAO.getInstance()
				.getDoctorsProgressNotesFormRows(formId));
	}

	public void deleteDoctorsProgressNotesFormRow(int formId)
			throws MedrexException {
		DoctorsProgressNotesFormDAO.getInstance()
				.deleteDoctorsProgressNotesFormRow(formId);
	}
}
