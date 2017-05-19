package medrex.server.service.historyAndPhysical;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage1;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage2;
import medrex.server.dao.historyPhysical.HistoryAndPhysicalGeneralFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class HistoryAndPhysicalGeneralFormService {

	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage1(
			HistoryAndPhysicalGeneralFormPage1 residentPayer)
			throws MedrexException {
		int serial = HistoryAndPhysicalGeneralFormDAO
				.getInstance()
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage1(residentPayer);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(residentPayer
				.getResidentId(),
				FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL, serial);
		return serial;
	}

	public List getHistoryAndPhysicalGeneralFormPage1s(int residentSerial)
			throws MedrexException {
		return (HistoryAndPhysicalGeneralFormDAO.getInstance()
				.getHistoryAndPhysicalGeneralFormPage1s(residentSerial));
	}

	public HistoryAndPhysicalGeneralFormPage1 getHistoryAndPhysicalGeneralFormPage1(
			int serial) throws MedrexException {
		return (HistoryAndPhysicalGeneralFormDAO.getInstance()
				.getHistoryAndPhysicalGeneralFormPage1(serial));
	}

	public void deleteHistoryAndPhysicalGeneralFormPage1(int serial)
			throws MedrexException {
		HistoryAndPhysicalGeneralFormDAO.getInstance()
				.deleteHistoryAndPhysicalGeneralFormPage1(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL, serial);
	}

	// /P2
	public int insertOrUpdateHistoryAndPhysicalGeneralFormPage2(
			HistoryAndPhysicalGeneralFormPage2 rafp2) throws MedrexException {
		return HistoryAndPhysicalGeneralFormDAO.getInstance()
				.insertOrUpdateHistoryAndPhysicalGeneralFormPage2(rafp2);
	}

	public HistoryAndPhysicalGeneralFormPage2 getHistoryAndPhysicalGeneralFormPage2(
			int formId) throws MedrexException {
		return (HistoryAndPhysicalGeneralFormDAO.getInstance()
				.getHistoryAndPhysicalGeneralFormPage2(formId));
	}

	public void deleteHistoryAndPhysicalGeneralFormPage2(int serial)
			throws MedrexException {
		HistoryAndPhysicalGeneralFormDAO.getInstance()
				.deleteHistoryAndPhysicalGeneralFormPage2(serial);
	}

}
