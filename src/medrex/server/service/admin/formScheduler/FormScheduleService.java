package medrex.server.service.admin.formScheduler;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.FormSchedule;
import medrex.server.dao.admin.formScheduler.FormScheduleDao;

/**
 * @author D S Naruka
 */
public class FormScheduleService {
	public void deleteFormSchedule(int serial) throws MedrexException {
		FormScheduleDao.getInstance().deleteFormSchedule(serial);
	}

	public FormSchedule getFormSchedule(int serial) throws MedrexException {
		return FormScheduleDao.getInstance().getFormSchedule(serial);
	}

	public List<FormSchedule> getFormSchedlulesByType(String type)
			throws MedrexException {
		return FormScheduleDao.getInstance().getFormSchedulesByType(type);
	}

	public List<FormSchedule> getFormSchedules() throws MedrexException {
		return FormScheduleDao.getInstance().getFormSchedules();
	}

	public int insertOrUpdateFormSchedule(FormSchedule ref)
			throws MedrexException {
		return FormScheduleDao.getInstance().insertOrUpdateFormSchedule(ref);
	}

}
