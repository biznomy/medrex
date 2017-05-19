package medrex.server.service.medication;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.server.dao.medicationTreatment.MedicationTreatmentFormDAO;

public class medicationTreatmentFormService {

	public int insertOrUpdateMedicationTreatmentForm(
			MedicationTreatmentForm medicationTreatmentForm)
			throws MedrexException {
		return MedicationTreatmentFormDAO.getInstance()
				.insertOrUpdateMedicationTreatmentForm(medicationTreatmentForm);
	}

	public List getMedicationTreatmentForms(long residentSerial)
			throws MedrexException {
		return (MedicationTreatmentFormDAO.getInstance()
				.getMedicationTreatmentForms(residentSerial));
	}

	public MedicationTreatmentForm getMedicationTreatmentFormCurrentWhere(
			int residentSerial, String type) throws MedrexException {
		return (MedicationTreatmentFormDAO.getInstance()
				.getMedicationTreatmentFormCurrentWhere(residentSerial, type));
	}

	public MedicationTreatmentForm getMedicationTreatmentForm(int serial)
			throws MedrexException {
		return (MedicationTreatmentFormDAO.getInstance()
				.getMedicationTreatmentForm(serial));
	}

	public void deleteMedicationTreatmentForm(long serial)
			throws MedrexException {
		MedicationTreatmentFormDAO.getInstance().deleteMedicationTreatmentForm(
				serial);
	}

}
