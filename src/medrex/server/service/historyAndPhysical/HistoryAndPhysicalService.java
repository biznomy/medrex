package medrex.server.service.historyAndPhysical;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysical;
import medrex.server.dao.historyPhysical.HistoryAndPhysicalDAO;

public class HistoryAndPhysicalService {

	public int insertOrUpdateHistoryAndPhysical(HistoryAndPhysical consultant)
			throws MedrexException {
		return HistoryAndPhysicalDAO.getInstance()
				.insertOrUpdateHistoryAndPhysical(consultant);
	}

	public List getHistoryAndPhysicals(int residentSerial)
			throws MedrexException {
		return (HistoryAndPhysicalDAO.getInstance()
				.getHistoryAndPhysicals(residentSerial));
	}

	public HistoryAndPhysical getHistoryAndPhysical(int serial)
			throws MedrexException {
		return (HistoryAndPhysicalDAO.getInstance()
				.getHistoryAndPhysical(serial));
	}

	public void deleteHistoryAndPhysical(int serial) throws MedrexException {
		HistoryAndPhysicalDAO.getInstance().deleteHistoryAndPhysical(serial);
	}

}
