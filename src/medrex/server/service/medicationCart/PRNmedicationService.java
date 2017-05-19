package medrex.server.service.medicationCart;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.PRNmedication;
import medrex.server.dao.medicationCart.PRNmedicationDAO;

public class PRNmedicationService {

	public int insertOrUpdatePRN(PRNmedication prn) throws MedrexException {

		return PRNmedicationDAO.getInstance().insertOrUpdatePRN(prn);
	}

}
