package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.ResponsibleParty;
import medrex.server.dao.census.ResponsiblePartyDAO;

public class ResponsiblePartyService {

	public int insertOrUpdateResponsibleParty(ResponsibleParty ref)
			throws MedrexException {
		return ResponsiblePartyDAO.getInstance()
				.insertOrUpdateResponsibleParty(ref);
	}

	public List getResponsiblePartys(int residentId) throws MedrexException {
		return ResponsiblePartyDAO.getInstance().getResponsiblePartys(
				residentId);
	}

	public List getResponsiblePartys(int residentId, String likeStr)
			throws MedrexException {
		return ResponsiblePartyDAO.getInstance().getResponsiblePartys(
				residentId, likeStr);
	}

	public ResponsibleParty getResponsibleParty(int serial)
			throws MedrexException {
		return ResponsiblePartyDAO.getInstance().getResponsibleParty(serial);
	}

	public void deleteDischargeResponsibleParty(int serial)
			throws MedrexException {
		ResponsiblePartyDAO.getInstance().deleteDischargeResponsibleParty(
				serial);
	}

}
