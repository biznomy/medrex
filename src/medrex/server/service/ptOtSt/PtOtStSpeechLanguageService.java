package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStSpeechLanguage;
import medrex.server.dao.ptOtStAct.PtOtStSpeechLanguageDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStSpeechLanguageService {

	public int insertOrUpdatePtOtStSpeechLanguage(
			PtOtStSpeechLanguage refPtOtStSpeechLanguage)
			throws MedrexException {
		int serial = PtOtStSpeechLanguageDAO.getInstance()
				.insertOrUpdatePtOtStSpeechLanguage(refPtOtStSpeechLanguage);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStSpeechLanguage.getResidentId(),
				FormSchedulerConstants.SPEECH_THERAPY, serial);
		return serial;
	}

	public List getPtOtStSpeechLanguages(int residentSerial)
			throws MedrexException {
		return (PtOtStSpeechLanguageDAO.getInstance()
				.getPtOtStSpeechLanguages(residentSerial));
	}

	public PtOtStSpeechLanguage getPtOtStSpeechLanguage(int serial)
			throws MedrexException {
		return (PtOtStSpeechLanguageDAO.getInstance()
				.getPtOtStSpeechLanguage(serial));
	}

	public void deletePtOtStSpeechLanguage(int serial) throws MedrexException {
		try {
			PtOtStSpeechLanguageDAO.getInstance().deletePtOtStSpeechLanguage(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.SPEECH_THERAPY, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PtOtStSpeechLanguage getExistingSpeechLanguageForm700(Date fromDate,
			Date toDate) throws MedrexException {
		return PtOtStSpeechLanguageDAO.getInstance()
				.getExistingSpeechLanguageForm700(fromDate, toDate);
	}

}
