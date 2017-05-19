package medrex.server.service.scheduling;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.scheduling.scheduling;
import medrex.server.dao.scheduling.SchedulingDAO;

public class SchedulingService {
	public void insertOrUpdateScheduling(scheduling sch) throws MedrexException {
		SchedulingDAO.getInstance().insertOrUpdateScheduling(sch);
	}

	public List getResidentScheduling(int serial) throws MedrexException {
		return SchedulingDAO.getInstance().getResidentScheduling(serial);

	}

	public scheduling getSchedulingObject(int serial) throws MedrexException {

		return SchedulingDAO.getInstance().getSchedulingObject(serial);
	}

	public String deleteScheduling(int currentSerial, String str)
			throws MedrexException {
		return SchedulingDAO.getInstance().deleteScheduling(currentSerial, str);

	}

}
