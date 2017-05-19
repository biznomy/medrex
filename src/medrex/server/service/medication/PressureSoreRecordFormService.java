package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.PressureSoreRecordForm;
import medrex.commons.vo.medication.PressureSoreRecordFormRow;
import medrex.server.dao.medicationTreatment.PressureSoreRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PressureSoreRecordFormService {

	public int insertOrUpdatePressureSoreRecordForm(PressureSoreRecordForm psrf)
			throws MedrexException {
		int serial = PressureSoreRecordFormDAO.getInstance()
				.insertOrUpdatePressureSoreRecordForm(psrf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(psrf
				.getResidentId(), FormSchedulerConstants.PRESSURE_SORE_RECORD,
				serial);
		return serial;
	}

	public List getPressureSoreRecordForms(int residentSerial)
			throws MedrexException {
		return (PressureSoreRecordFormDAO.getInstance()
				.getPressureSoreRecordForms(residentSerial));
	}

	public PressureSoreRecordForm getPressureSoreRecordForm(int serial)
			throws MedrexException {
		return (PressureSoreRecordFormDAO.getInstance()
				.getPressureSoreRecordForm(serial));
	}

	public void deletePressureSoreRecordForm(int serial) throws MedrexException {
		PressureSoreRecordFormDAO.getInstance().deletePressureSoreRecordForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PRESSURE_SORE_RECORD, serial);
	}

	public int insertOrUpdatePressureSoreRecordFormRow(
			PressureSoreRecordFormRow psrfr) throws MedrexException {
		return PressureSoreRecordFormDAO.getInstance()
				.insertOrUpdatePressureSoreRecordFormRow(psrfr);
	}

	public PressureSoreRecordFormRow getPressureSoreRecordFormRow(int formId,
			int formNum) throws MedrexException {
		return (PressureSoreRecordFormDAO.getInstance()
				.getPressureSoreRecordFormRow(formId, formNum));
	}

	public void deletePressureSoreRecordFormRow(int formId)
			throws MedrexException {
		PressureSoreRecordFormDAO.getInstance()
				.deletePressureSoreRecordFormRow(formId);
	}

}
