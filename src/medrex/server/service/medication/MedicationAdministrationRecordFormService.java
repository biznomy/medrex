package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationAdministrationRecordForm;
import medrex.commons.vo.medication.MedicationAdministrationRecordFormCol;
import medrex.server.dao.medicationTreatment.MedicationAdministrationRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MedicationAdministrationRecordFormService {

	public int insertOrUpdateMedicationAdministrationRecordForm(
			MedicationAdministrationRecordForm marf) throws MedrexException {
		int serial = MedicationAdministrationRecordFormDAO.getInstance()
				.insertOrUpdateMedicationAdministrationRecordForm(marf);

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(marf
				.getResidentId(),
				FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES, serial);
		return serial;
	}

	public List getMedicationAdministrationRecordForms(int residentSerial)
			throws MedrexException {
		return (MedicationAdministrationRecordFormDAO.getInstance()
				.getMedicationAdministrationRecordForms(residentSerial));
	}

	public MedicationAdministrationRecordForm getMedicationAdministrationRecordForm(
			int serial) throws MedrexException {
		return (MedicationAdministrationRecordFormDAO.getInstance()
				.getMedicationAdministrationRecordForm(serial));
	}

	public void deleteMedicationAdministrationRecordForm(int serial)
			throws MedrexException {
		MedicationAdministrationRecordFormDAO.getInstance()
				.deleteMedicationAdministrationRecordForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES, serial);
	}

	public int insertOrUpdateMedicationAdministrationRecordFormCol(
			MedicationAdministrationRecordFormCol marfc) throws MedrexException {
		return MedicationAdministrationRecordFormDAO.getInstance()
				.insertOrUpdateMedicationAdministrationRecordFormCol(marfc);
	}

	public MedicationAdministrationRecordFormCol getMedicationAdministrationRecordFormCol(
			int formId, int formNum) throws MedrexException {
		return (MedicationAdministrationRecordFormDAO.getInstance()
				.getMedicationAdministrationRecordFormCol(formId, formNum));
	}

	public void deleteMedicationAdministrationRecordFormCol(int formId)
			throws MedrexException {
		MedicationAdministrationRecordFormDAO.getInstance()
				.deleteMedicationAdministrationRecordFormCol(formId);
	}

}
