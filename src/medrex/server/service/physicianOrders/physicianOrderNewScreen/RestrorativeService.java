package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.RehabilitationRestrorative;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.RestrorativeDAO;

public class RestrorativeService {

	public int insertOrUpdateRehabilitationRestrorative(
			RehabilitationRestrorative refRehabilitationRestrorative)
			throws MedrexException {
		return RestrorativeDAO.getInstance()
				.insertOrUpdateRehabilitationRestrorative(
						refRehabilitationRestrorative);
	}

	public RehabilitationRestrorative getRehabilitationRestrorative(int formId)
			throws MedrexException {
		return RestrorativeDAO.getInstance().getRehabilitationRestrorative(
				formId);
	}

	public void deleteRehabilitationRestrorative(
			int currentRehabilitationRestrorativekey) throws MedrexException {
		RestrorativeDAO.getInstance().deleteRehabilitationRestrorative(
				currentRehabilitationRestrorativekey);

	}

}
