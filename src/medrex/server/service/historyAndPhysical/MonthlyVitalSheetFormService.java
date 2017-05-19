package medrex.server.service.historyAndPhysical;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetForm;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;
import medrex.server.dao.historyPhysical.MonthlyVitalSheetFormDao;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MonthlyVitalSheetFormService {

	public int insertOrUpdateMonthlyVitalSheetForm(MonthlyVitalSheetForm ntnf)
			throws MedrexException {
		int serial = MonthlyVitalSheetFormDao.getInstance()
				.insertOrUpdateMonthlyVitalSheetForm(ntnf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(),
				FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET,
				serial);
		return serial;
	}

	public List getMonthlyVitalSheetForms(int residentSerial)
			throws MedrexException {
		return (MonthlyVitalSheetFormDao.getInstance()
				.getMonthlyVitalSheetForms(residentSerial));
	}

	public MonthlyVitalSheetForm getMonthlyVitalSheetForm(int serial)
			throws MedrexException {
		return (MonthlyVitalSheetFormDao.getInstance()
				.getMonthlyVitalSheetForm(serial));
	}

	public void deleteMonthlyVitalSheetForm(int serial) throws MedrexException {
		MonthlyVitalSheetFormDao.getInstance().deleteMonthlyVitalSheetForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET,
				serial);
	}

	public int insertOrUpdateMonthlyVitalSheetFormRow(
			MonthlyVitalSheetFormRow ntnfr) throws MedrexException {
		return MonthlyVitalSheetFormDao.getInstance()
				.insertOrUpdateMonthlyVitalSheetFormRow(ntnfr);
	}

	public MonthlyVitalSheetFormRow getMonthlyVitalSheetFormRow(int formId,
			int formNum) throws MedrexException {
		return (MonthlyVitalSheetFormDao.getInstance()
				.getMonthlyVitalSheetFormRow(formId, formNum));
	}

	public int insertOrUpdateMonthlyVitalSheetFormRows(List ntnfr)
			throws MedrexException {
		return MonthlyVitalSheetFormDao.getInstance()
				.insertOrUpdateMonthlyVitalSheetFormRows(ntnfr);
	}

	public List getMonthlyVitalSheetFormRows(int formId) throws MedrexException {
		return (MonthlyVitalSheetFormDao.getInstance()
				.getMonthlyVitalSheetFormRows(formId));
	}

	public void deleteMonthlyVitalSheetFormRow(int formId)
			throws MedrexException {
		MonthlyVitalSheetFormDao.getInstance().deleteMonthlyVitalSheetFormRow(
				formId);
	}
}
