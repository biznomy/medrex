package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatmentTemp;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderTreatmentTempDao;

public class PhysicianOrderTreatmentTempService {

	public int insertOrUpdatePhysicianOrderTreatmentTemp(
			PhysicianOrderTreatmentTemp refPhysicianOrderTreatmentTemp)
			throws MedrexException {
		return PhysicianOrderTreatmentTempDao.getInstance()
				.insertOrUpdatePhysicianOrderTreatmentTemp(
						refPhysicianOrderTreatmentTemp);
	}

	public void deletePhysicianOrderTreatmentTemp(int serial)
			throws MedrexException {
		PhysicianOrderTreatmentTempDao.getInstance()
				.deletePhysicianOrderTreatmentTemp(serial);
	}

	public PhysicianOrderTreatmentTemp getPhysicianOrderTreatmentTemp(int formId)
			throws MedrexException {
		return PhysicianOrderTreatmentTempDao.getInstance()
				.getPhysicianOrderTreatmentTemp(formId);
	}

	public List<PhysicianOrderTreatmentTemp> getPhysicianOrderTreatmentTempList(
			int currentResidentId) throws MedrexException {
		return PhysicianOrderTreatmentTempDao.getInstance()
				.getPhysicianOrderTreatmentTempList(currentResidentId);
	}

	public String getCautionaryName(Long medicationId) throws MedrexException {
		return PhysicianOrderTreatmentTempDao.getInstance().getCautionaryName(
				medicationId);
	}

	public List<String> getTimeSlot(int frequency) throws MedrexException {

		return PhysicianOrderTreatmentTempDao.getInstance().getTimeSlot(
				frequency);
	}

}
