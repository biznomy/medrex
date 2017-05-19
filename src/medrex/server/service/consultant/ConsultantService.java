package medrex.server.service.consultant;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.Consultant;
import medrex.server.dao.consultant.ConsultantDAO;

public class ConsultantService {

	public int insertOrUpdateConsultant(Consultant consultant)
			throws MedrexException {
		return ConsultantDAO.getInstance().insertOrUpdateConsultant(consultant);
	}

	public List getConsultants(int residentSerial) throws MedrexException {
		return (ConsultantDAO.getInstance().getConsultants(residentSerial));
	}

	public Consultant getConsultant(int serial) throws MedrexException {
		return (ConsultantDAO.getInstance().getConsultant(serial));
	}

	public void deleteConsultant(int serial) throws MedrexException {
		ConsultantDAO.getInstance().deleteConsultant(serial);
	}

}
