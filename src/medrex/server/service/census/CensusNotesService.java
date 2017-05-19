package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusNotes;
import medrex.server.dao.census.CensusNotesDAO;

public class CensusNotesService {

	public int insertOrUpdateCensusNotes(CensusNotes refCensusNotes)
			throws MedrexException {
		return CensusNotesDAO.getInstance().insertOrUpdateCensusNotes(
				refCensusNotes);
	}

	public List getCensusNotesForStatus(int statusid) throws MedrexException {
		return CensusNotesDAO.getInstance().getCensusNotesForStatus(statusid);
	}

	public CensusNotes getCensusNotes(int serial) throws MedrexException {
		return CensusNotesDAO.getInstance().getCensusNotes(serial);

	}

}
