package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.SignOutTo;
import medrex.server.dao.census.SignOutToDAO;

public class SignOutToService {

	public int insertOrUpdateSignOutTo(SignOutTo ref) throws MedrexException {
		return SignOutToDAO.getInstance().insertOrUpdateSignOutTo(ref);
	}

	public List getSignOutTos() throws MedrexException {
		return SignOutToDAO.getInstance().getSignOutTos();
	}

	public List getSignOutTos(String likeStr) throws MedrexException {
		return SignOutToDAO.getInstance().getSignOutTos(likeStr);
	}

	public SignOutTo getSignOutTo(int serial) throws MedrexException {
		return SignOutToDAO.getInstance().getSignOutTo(serial);
	}

	public void deleteDischargeSignOutTo(int serial) throws MedrexException {
		SignOutToDAO.getInstance().deleteDischargeSignOutTo(serial);
	}

}
