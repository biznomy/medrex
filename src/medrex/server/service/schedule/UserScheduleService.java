package medrex.server.service.schedule;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.schedule.UserSchedule;
import medrex.server.dao.schedule.UserScheduleDAO;

public class UserScheduleService {

	// public static void insertOrUpdateMDS3(Mds3 mds3) throws MedrexException {
	// Mds3DAO.getInstance().insertOrUpdateMDS3(mds3);
	// }

	public void insertOrUpdateUserSchedule(UserSchedule userschedule)
			throws MedrexException, RemoteException {
		UserScheduleDAO.getInstance().insertOrUpdateUserSchedule(userschedule);
	}

	public UserSchedule getUserScheduleRecord(int userID, int scheduleID,
			Date onDate) throws MedrexException, RemoteException {
		return (UserScheduleDAO.getInstance().getUserScheduleRecord(userID,
				scheduleID, onDate));
	}
	
	public UserSchedule getUserScheduleRecordByDay(int userID, int scheduleID,
			int day) throws MedrexException, RemoteException {
		return (UserScheduleDAO.getInstance().getUserScheduleRecordByDay(userID,
				scheduleID, day));
	}
	
	

	public void insertOrUpdateUserSchedules(List<UserSchedule> us)
			throws MedrexException, RemoteException {
		UserScheduleDAO.getInstance().insertOrUpdateUserSchedules(us);
	}

}
