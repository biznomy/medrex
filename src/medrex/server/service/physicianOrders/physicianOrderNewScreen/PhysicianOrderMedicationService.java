package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationDao;

public class PhysicianOrderMedicationService {

	public int insertOrUpdatePhysicianOrderMedication(
			PhysicianOrderMedication refPhysicianOrderMedication)
			throws MedrexException {
		return PhysicianOrderMedicationDao.getInstance()
				.insertOrUpdatePhysicianOrderMedication(
						refPhysicianOrderMedication);
	}

	public void deletePhysicianOrderMedication(int serial)
			throws MedrexException {
		PhysicianOrderMedicationDao.getInstance()
				.deletePhysicianOrderMedication(serial);

	}

	public PhysicianOrderMedication getPhysicianOrderMedication(int formId)
			throws MedrexException {
		return PhysicianOrderMedicationDao.getInstance()
				.getPhysicianOrderMedication(formId);
	}

	public List<PhysicianOrderMedication> getPhysicianOrderMedicationList(
			int currentResidentId) throws MedrexException {
		return PhysicianOrderMedicationDao.getInstance()
				.getPhysicianOrderMedicationList(currentResidentId);
	}

	public String getCautionaryName(Long medicationId) throws MedrexException {
		return PhysicianOrderMedicationDao.getInstance().getCautionaryName(
				medicationId);
	}

	public List<String> getTimeSlot(int frequency) throws MedrexException {

		return PhysicianOrderMedicationDao.getInstance().getTimeSlot(frequency);
	}

}
