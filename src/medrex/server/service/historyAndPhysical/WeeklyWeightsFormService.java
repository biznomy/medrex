package medrex.server.service.historyAndPhysical;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsForm;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;
import medrex.server.dao.historyPhysical.WeeklyWeightsFormDao;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class WeeklyWeightsFormService {

	public int insertOrUpdateWeeklyWeightsForm(WeeklyWeightsForm ntnf)
			throws MedrexException {
		int serial = WeeklyWeightsFormDao.getInstance()
				.insertOrUpdateWeeklyWeightsForm(ntnf);
		// update pending forms for this resident this form
		(new PendingFormService())
				.updatePendingFormsStatus(ntnf.getResidentId(),
						FormSchedulerConstants.WEEKLY_WEIGHTS, serial);
		return serial;
	}

	public List getWeeklyWeightsForms(int residentSerial)
			throws MedrexException {
		return (WeeklyWeightsFormDao.getInstance()
				.getWeeklyWeightsForms(residentSerial));
	}

	public WeeklyWeightsForm getWeeklyWeightsForm(int serial)
			throws MedrexException {
		return (WeeklyWeightsFormDao.getInstance().getWeeklyWeightsForm(serial));
	}

	public void deleteWeeklyWeightsForm(int serial) throws MedrexException {
		WeeklyWeightsFormDao.getInstance().deleteWeeklyWeightsForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.WEEKLY_WEIGHTS, serial);
	}

	public int insertOrUpdateWeeklyWeightsFormRow(WeeklyWeightsFormRow ntnfr)
			throws MedrexException {
		return WeeklyWeightsFormDao.getInstance()
				.insertOrUpdateWeeklyWeightsFormRow(ntnfr);
	}

	public WeeklyWeightsFormRow getWeeklyWeightsFormRow(int formId, int formNum)
			throws MedrexException {
		return (WeeklyWeightsFormDao.getInstance().getWeeklyWeightsFormRow(
				formId, formNum));
	}

	public int insertOrUpdateWeeklyWeightsFormRows(List ntnfr)
			throws MedrexException {
		return WeeklyWeightsFormDao.getInstance()
				.insertOrUpdateWeeklyWeightsFormRows(ntnfr);
	}

	public List getWeeklyWeightsFormRows(int formId) throws MedrexException {
		return (WeeklyWeightsFormDao.getInstance()
				.getWeeklyWeightsFormRows(formId));
	}

	public void deleteWeeklyWeightsFormRow(int formId) throws MedrexException {
		WeeklyWeightsFormDao.getInstance().deleteWeeklyWeightsFormRow(formId);
	}

}
