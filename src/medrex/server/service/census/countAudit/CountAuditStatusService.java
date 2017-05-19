package medrex.server.service.census.countAudit;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAuditStatus;
import medrex.server.dao.census.countAudit.CountAuditStatusDAO;

public class CountAuditStatusService {

	public int insertOrUpdateCountAuditStatus(
			CountAuditStatus refCountAuditStatus) throws MedrexException {
		return CountAuditStatusDAO.getInstance()
				.insertOrUpdateCountAuditStatus(refCountAuditStatus);
	}

	public List<CountAuditStatus> getCountAuditStatuss() throws MedrexException {
		return CountAuditStatusDAO.getInstance().getCountAuditStatuss();
	}

	public CountAuditStatus getCountAuditStatus(int serial)
			throws MedrexException {
		return CountAuditStatusDAO.getInstance().getCountAuditStatus(serial);
	}

	public CountAuditStatus getCountAuditStatusOfToday() throws MedrexException {
		return CountAuditStatusDAO.getInstance().getCountAuditStatusOfToday();
	}

	public void deleteCountAuditStatus(int serial) throws MedrexException {
		CountAuditStatusDAO.getInstance().deleteCountAuditStatus(serial);
	}

}
