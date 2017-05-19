package medrex.server.service.treatmentCart;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.PRNmedication;
import medrex.server.dao.medicationCart.PRNmedicationDAO;

public class PRNtreatmentService {

	public int insertOrUpdatePRN(PRNmedication prn) throws MedrexException {

		return PRNmedicationDAO.getInstance().insertOrUpdatePRN(prn);
	}

}
