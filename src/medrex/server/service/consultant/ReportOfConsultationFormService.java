package medrex.server.service.consultant;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.ReportOfConsultationForm;
import medrex.server.dao.consultant.ReportOfConsultationFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ReportOfConsultationFormService {

	public int insertOrUpdateReportOfConsultationForm(
			ReportOfConsultationForm rf) throws MedrexException {
		int serial = ReportOfConsultationFormDAO.getInstance()
				.insertOrUpdateReportOfConsultationForm(rf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(rf.getResidentId(),
				FormSchedulerConstants.REPORT_OF_CONSULTATION, serial);
		return serial;
	}

	public List getReportOfConsultationForms(int residentSerial)
			throws MedrexException {
		return (ReportOfConsultationFormDAO.getInstance()
				.getReportOfConsultationForms(residentSerial));
	}

	public ReportOfConsultationForm getReportOfConsultationForm(int serial)
			throws MedrexException {
		return (ReportOfConsultationFormDAO.getInstance()
				.getReportOfConsultationForm(serial));
	}

	public void deleteReportOfConsultationForm(int serial)
			throws MedrexException {
		ReportOfConsultationFormDAO.getInstance()
				.deleteReportOfConsultationForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.REPORT_OF_CONSULTATION, serial);
	}

}
