package medrex.server.service.consultant;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.PharmacistEvaluationReportForm;
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;
import medrex.server.dao.consultant.PharmacistEvaluationReportFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PharmacistEvaluationReportService {

	public int insertOrUpdatePharmacistEvaluationReportForm(
			PharmacistEvaluationReportForm rf) throws MedrexException {
		int serial = PharmacistEvaluationReportFormDAO.getInstance()
				.insertOrUpdatePharmacistEvaluationReportForm(rf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(rf.getResidentId(),
				FormSchedulerConstants.PHARMACIST_RESIDENT_EVALUATION, serial);
		return serial;
	}

	public List getPharmacistEvaluationReportForms(int residentSerial)
			throws MedrexException {
		return (PharmacistEvaluationReportFormDAO.getInstance()
				.getPharmacistEvaluationReportForms(residentSerial));
	}

	public PharmacistEvaluationReportForm getPharmacistEvaluationReportForm(
			int serial) throws MedrexException {
		return (PharmacistEvaluationReportFormDAO.getInstance()
				.getPharmacistEvaluationReportForm(serial));
	}

	public void deletePharmacistEvaluationReportForm(int serial)
			throws MedrexException {
		PharmacistEvaluationReportFormDAO.getInstance()
				.deletePharmacistEvaluationReportForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PHARMACIST_RESIDENT_EVALUATION, serial);
	}

	public int insertOrUpdatePharmacistEvaluationReportFormRows(List rfr)
			throws MedrexException {
		return PharmacistEvaluationReportFormDAO.getInstance()
				.insertOrUpdatePharmacistEvaluationReportFormRows(rfr);
	}

	public PharmacistEvaluationReportFormRow getPharmacistEvaluationReportFormRow(
			int formId, int formNum) throws MedrexException {
		return (PharmacistEvaluationReportFormDAO.getInstance()
				.getPharmacistEvaluationReportFormRow(formId, formNum));
	}

	public List getPharmacistEvaluationReportFormRows(int formId)
			throws MedrexException {
		return (PharmacistEvaluationReportFormDAO.getInstance()
				.getPharmacistEvaluationReportFormRows(formId));
	}

}
