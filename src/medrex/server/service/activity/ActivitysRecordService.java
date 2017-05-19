package medrex.server.service.activity;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivitysRecord;
import medrex.server.dao.activity.ActivitysRecordDAO;

public class ActivitysRecordService {

	public int insertOrUpdateActivitysRecord(ActivitysRecord activityPayer)
			throws MedrexException {
		return ActivitysRecordDAO.getInstance().insertOrUpdateActivitysRecord(
				activityPayer);
	}

	public List getActivitysRecords(int activitySerial) throws MedrexException {
		return (ActivitysRecordDAO.getInstance()
				.getActivitysRecords(activitySerial));
	}

	public ActivitysRecord getActivitysRecord(int serial)
			throws MedrexException {
		return (ActivitysRecordDAO.getInstance().getActivitysRecord(serial));
	}

	public void deleteActivitysRecord(int serial) throws MedrexException {
		ActivitysRecordDAO.getInstance().deleteActivitysRecord(serial);
	}

}
