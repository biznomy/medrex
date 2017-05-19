package medrex.server.service.schedule;

import java.rmi.RemoteException;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.schedule.Schedule;
import medrex.server.dao.schedule.ScheduleDAO;

public class ScheduleService {

	public static int insertOrUpdateSchedule(Schedule sh)
			throws MedrexException {
		return (ScheduleDAO.getInstance().insertOrUpdateSchedule(sh));
	}

	public List<Schedule> getScheduleRecords() throws MedrexException,
			RemoteException {
		return (ScheduleDAO.getInstance().getScheduleRecords());
	}

	public void deleteScheduleRecord(int scheduleSerial)
			throws MedrexException, RemoteException {
		ScheduleDAO.getInstance().deleteScheduleRecord(scheduleSerial);

	}

}
