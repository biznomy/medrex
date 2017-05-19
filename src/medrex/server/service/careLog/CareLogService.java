package medrex.server.service.careLog;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.careLog.CareLog;
import medrex.commons.vo.careLog.CareLogMaster;
import medrex.server.dao.careLog.CareLogDAO;

public class CareLogService {

	/* scrapped methods */
	public int insertOrUpdateCareLog(CareLog cnaAdl) throws MedrexException {
		return CareLogDAO.getInstance().insertOrUpdateCareLog(cnaAdl);
	}

	public List getCareLogForResident(int residentSerial)
			throws MedrexException {
		return CareLogDAO.getInstance().getCareLogForResident(residentSerial);
	}

	public CareLog getCareLog(int id) throws MedrexException {
		return CareLogDAO.getInstance().getCareLog(id);
	}

	/* scrapped methods */

	/* New Methods */

	public int insertOrUpdateCareLog(CareLogMaster careLogMaster)
			throws MedrexException {
		return CareLogDAO.getInstance().insertOrUpdateCareLog(careLogMaster);
	}

	public List<CareLogMaster> getCareLogMasterForResident(
			int currentResidenceKey) throws MedrexException {

		return CareLogDAO.getInstance().getCareLogMasterForResident(
				currentResidenceKey);
	}

	public CareLogMaster getCareLogMaster(int careLogSerial)
			throws MedrexException {
		return CareLogDAO.getInstance().getCareLogMaster(careLogSerial);
	}

}
