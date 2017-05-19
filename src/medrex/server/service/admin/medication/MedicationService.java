package medrex.server.service.admin.medication;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Medication;
import medrex.server.dao.admin.medication.TreatmentDao;

public class MedicationService {

	public Long insertOrUpdateMedications(Medication med)
			throws MedrexException {
		return TreatmentDao.getInstance().insertOrUpdateMedications(med);
	}

	public Medication getMedication(long serial) throws MedrexException {
		return TreatmentDao.getInstance().getMedication(serial);
	}

	public List<Medication> getAllMedications() throws MedrexException {
		return TreatmentDao.getInstance().getAllMedications();
	}

	public void deleteMedication(long serial) throws MedrexException {
		TreatmentDao.getInstance().deleteMedication(serial);
	}

	public List<Medication> getMedication() throws MedrexException {
		return TreatmentDao.getInstance().getMedication();
	}

	public List<Medication> getMedication(String text, String selectedButton)
			throws MedrexException {
		return TreatmentDao.getInstance().getMedication(text, selectedButton);
	}

	public List<Medication> getMedication(String selectedButton)
			throws MedrexException {
		return TreatmentDao.getInstance().getMedication(selectedButton);
	}

	public List<Object[]> getMedicationFrequencies() throws MedrexException {

		return TreatmentDao.getInstance().getMedicationFrequencies();
	}
}
