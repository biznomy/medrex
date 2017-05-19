package medrex.server.service.census.countAudit;

import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.server.dao.census.countAudit.CountAuditDAO;

public class CountAuditService {

	public int insertOrUpdateCountAudit(CountAudit refCountAudit)
			throws MedrexException {
		return CountAuditDAO.getInstance().insertOrUpdateCountAudit(
				refCountAudit);
	}

	public List<CountAudit> getCountAudits() throws MedrexException {
		return CountAuditDAO.getInstance().getCountAudits();
	}

	public List<CountAudit> getCountAudits(Date date) throws MedrexException {
		return CountAuditDAO.getInstance().getCountAudits(date);
	}

	public CountAudit getCountAudit(int serial) throws MedrexException {
		return CountAuditDAO.getInstance().getCountAudit(serial);
	}

	public int getCountAuditSeialByDateFloor(Date date, String floor)
			throws MedrexException {
		return CountAuditDAO.getInstance().getCountAuditSeialByDateFloor(date,
				floor);
	}

	public void deleteCountAudit(int serial) throws MedrexException {
		CountAuditDAO.getInstance().deleteCountAudit(serial);
	}

}
