package medrex.server.service.medicationCart;

import java.util.Calendar;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.CalculatedMedication;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.medicationCart.Medications;
import medrex.server.dao.medicationCart.MedicationsDAO;

public class MedicationCartService {

	public void insertOrUpdateMedications(List psr) throws MedrexException {
		MedicationsDAO.getInstance().insertOrUpdateMedications(psr);
	}

	public List getCurrentSlotTime(String floorType) throws MedrexException {
		return MedicationsDAO.getInstance().getCurrentSlotTime(floorType);
	}

	public List<MedicationView> getMedicationsList(int currentResidenceKey)
			throws MedrexException {
		return MedicationsDAO.getInstance().getMedicationsList(
				currentResidenceKey);
	}

	public void insertOrUpdateCalculatedMedication(CalculatedMedication cm)
			throws MedrexException {
		MedicationsDAO.getInstance().insertOrUpdateCalculatedMedication(cm);
	}

	public Medications getMedications(int calcSerial) throws MedrexException {
		return MedicationsDAO.getInstance().getMedications(calcSerial);
	}

	public List getMedicationHistoryTimes() throws MedrexException {
		return MedicationsDAO.getInstance().getMedicationHistoryTimes();
	}

	public List<Object[]> getMedicationStatusForWeek(Calendar calendar,
			String slot, int currentResidentId, int medicationSerial)
			throws MedrexException {

		return MedicationsDAO.getInstance().getMedicationStatusForWeek(
				calendar, slot, currentResidentId, medicationSerial);
	}

	public List getPrnResidentsByFloor(String floorType) throws MedrexException {

		return MedicationsDAO.getInstance().getPrnResidentsByFloor(floorType);
	}

	public List<MedicationView> getPrnMedicationsList(int currentResidenceKey)
			throws MedrexException {

		return MedicationsDAO.getInstance().getPrnMedicationsList(
				currentResidenceKey);
	}

}
