package medrex.server.service.historyAndPhysical;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisForm;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;
import medrex.server.dao.historyPhysical.CumulativeDiagnosisFormDao;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class CumulativeDiagnosisFormService {

	public int insertOrUpdateCumulativeDiagnosisForm(
			CumulativeDiagnosisForm ntnf) throws MedrexException {
		int serial = CumulativeDiagnosisFormDao.getInstance()
				.insertOrUpdateCumulativeDiagnosisForm(ntnf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(), FormSchedulerConstants.CUMULATIVE_DIAGNOSIS,
				serial);
		return serial;
	}

	/*
	 * public void insertOrUpdateCumulativeDiagnosisForm(
	 * CumulativeDiagnosisForm ntnf) throws MedrexException {
	 * CumulativeDiagnosisFormDao
	 * .getInstance().insertOrUpdateCumulativeDiagnosisForm(ntnf); }
	 */

	public List getCumulativeDiagnosisForms(int residentSerial)
			throws MedrexException {
		return (CumulativeDiagnosisFormDao.getInstance()
				.getCumulativeDiagnosisForms(residentSerial));
	}

	public CumulativeDiagnosisForm getCumulativeDiagnosisForm(int serial)
			throws MedrexException {
		return (CumulativeDiagnosisFormDao.getInstance()
				.getCumulativeDiagnosisForm(serial));
	}

	public void deleteCumulativeDiagnosisForm(int serial)
			throws MedrexException {
		CumulativeDiagnosisFormDao.getInstance().deleteCumulativeDiagnosisForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.CUMULATIVE_DIAGNOSIS, serial);
	}

	public int insertOrUpdateCumulativeDiagnosisFormRow(
			CumulativeDiagnosisFormRow ntnfr) throws MedrexException {
		return CumulativeDiagnosisFormDao.getInstance()
				.insertOrUpdateCumulativeDiagnosisFormRow(ntnfr);
	}

	public CumulativeDiagnosisFormRow getCumulativeDiagnosisFormRow(int formId,
			int formNum) throws MedrexException {
		return (CumulativeDiagnosisFormDao.getInstance()
				.getCumulativeDiagnosisFormRow(formId, formNum));
	}

	public int insertOrUpdateCumulativeDiagnosisFormRows(List ntnfr)
			throws MedrexException {
		return CumulativeDiagnosisFormDao.getInstance()
				.insertOrUpdateCumulativeDiagnosisFormRows(ntnfr);

	}

	public List getCumulativeDiagnosisFormRows(int formId)
			throws MedrexException {
		return (CumulativeDiagnosisFormDao.getInstance()
				.getCumulativeDiagnosisFormRows(formId));
	}

	public void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException {
		CumulativeDiagnosisFormDao.getInstance()
				.deleteCumulativeDiagnosisFormRow(formId);
	}

}
