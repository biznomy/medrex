package medrex.server.service.census.countAudit;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.server.dao.census.countAudit.CountAuditFloorDAO;

public class CountAuditFloorService {

	public int insertOrUpdateCountAuditFloor(CountAuditFloor refCountAuditFloor)
			throws MedrexException {
		return CountAuditFloorDAO.getInstance().insertOrUpdateCountAuditFloor(
				refCountAuditFloor);
	}

	public List<CountAuditFloor> getCountAuditFloors() throws MedrexException {
		return CountAuditFloorDAO.getInstance().getCountAuditFloors();
	}

	public CountAuditFloor getCountAuditFloor(int serial)
			throws MedrexException {
		return CountAuditFloorDAO.getInstance().getCountAuditFloor(serial);
	}

	public void deleteCountAuditFloor(int serial) throws MedrexException {
		CountAuditFloorDAO.getInstance().deleteCountAuditFloor(serial);
	}

	public String get1stFloorResident() throws MedrexException {
		return CountAuditFloorDAO.getInstance().get1stFloorResident();
	}

	public String get2ndFloorResident() throws MedrexException {
		return CountAuditFloorDAO.getInstance().get2ndFloorResident();
	}

}
