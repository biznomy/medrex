package medrex.server.service.treatmentCart;

import java.util.Calendar;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.treatmentCart.CalculatedTreatment;
import medrex.commons.vo.treatmentCart.TreatmentView;
import medrex.commons.vo.treatmentCart.Treatments;
import medrex.server.dao.treatmentCart.TreatmentsDAO;

public class TreatmentCartService {

	public void insertOrUpdateTreatments(List psr) throws MedrexException {
		TreatmentsDAO.getInstance().insertOrUpdateTreatments(psr);
	}

	public List getCurrentSlotTimeforTreatment(String floorType)
			throws MedrexException {
		return TreatmentsDAO.getInstance().getCurrentSlotTimeforTreatment(
				floorType);
	}

	public List<TreatmentView> getTreatmentsList(int currentResidenceKey)
			throws MedrexException {
		return TreatmentsDAO.getInstance().getTreatmentsList(
				currentResidenceKey);
	}

	public void insertOrUpdateCalculatedTreatment(CalculatedTreatment cm)
			throws MedrexException {
		TreatmentsDAO.getInstance().insertOrUpdateCalculatedTreatment(cm);
	}

	public Treatments getTreatments(int calcSerial) throws MedrexException {
		return TreatmentsDAO.getInstance().getTreatments(calcSerial);
	}

	public List getTreatmentHistoryTimes() throws MedrexException {
		return TreatmentsDAO.getInstance().getTreatmentHistoryTimes();
	}

	public List<Object[]> getTreatmentStatusForWeek(Calendar calendar,
			String slot, int currentResidentId, int medicationSerial)
			throws MedrexException {

		return TreatmentsDAO.getInstance().getTreatmentStatusForWeek(calendar,
				slot, currentResidentId, medicationSerial);
	}

	public List getPrnResidentsByFloor(String floorType) throws MedrexException {

		return TreatmentsDAO.getInstance().getPrnResidentsByFloor(floorType);
	}

	public List<TreatmentView> getPrnTreatmentsList(int currentResidenceKey)
			throws MedrexException {

		return TreatmentsDAO.getInstance().getPrnTreatmentsList(
				currentResidenceKey);
	}

}
