package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStSpeechDailyRecord;
import medrex.server.dao.ptOtStAct.PtOtStSpeechDailyRecordDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStSpeechDailyRecordService {

	public int insertOrUpdatePtOtStSpeechDailyRecord(
			PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord)
			throws MedrexException {
		int serial = PtOtStSpeechDailyRecordDAO.getInstance()
				.insertOrUpdatePtOtStSpeechDailyRecord(
						refPtOtStSpeechDailyRecord);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStSpeechDailyRecord.getResidentId(),
				FormSchedulerConstants.SPEECH_DAILY_RECORD, serial);
		return serial;
	}

	public List getPtOtStSpeechDailyRecords(int residentSerial)
			throws MedrexException {
		return (PtOtStSpeechDailyRecordDAO.getInstance()
				.getPtOtStSpeechDailyRecords(residentSerial));
	}

	public PtOtStSpeechDailyRecord getPtOtStSpeechDailyRecord(int serial)
			throws MedrexException {
		return (PtOtStSpeechDailyRecordDAO.getInstance()
				.getPtOtStSpeechDailyRecord(serial));
	}

	public void deletePtOtStSpeechDailyRecord(int serial)
			throws MedrexException {
		try {
			PtOtStSpeechDailyRecordDAO.getInstance()
					.deletePtOtStSpeechDailyRecord(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.SPEECH_DAILY_RECORD, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getSpeechDailyKeyByDate(Date cal) throws MedrexException {
		return PtOtStSpeechDailyRecordDAO.getInstance()
				.getSpeechDailyKeyByDate(cal);
	}

}
