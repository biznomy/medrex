package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalDailyRecord;
import medrex.server.dao.ptOtStAct.PtOtStOccupationalDailyRecordDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStOccupationalDailyRecordService {

	public int insertOrUpdatePtOtStOccupationalDailyRecord(
			PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord)
			throws MedrexException {
		int serial = PtOtStOccupationalDailyRecordDAO.getInstance()
				.insertOrUpdatePtOtStOccupationalDailyRecord(
						refPtOtStOccupationalDailyRecord);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStOccupationalDailyRecord.getResidentId(),
				FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD, serial);
		return serial;
	}

	public List getPtOtStOccupationalDailyRecords(int residentSerial)
			throws MedrexException {
		return (PtOtStOccupationalDailyRecordDAO.getInstance()
				.getPtOtStOccupationalDailyRecords(residentSerial));
	}

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecord(
			int serial) throws MedrexException {
		return (PtOtStOccupationalDailyRecordDAO.getInstance()
				.getPtOtStOccupationalDailyRecord(serial));
	}

	public void deletePtOtStOccupationalDailyRecord(int serial)
			throws MedrexException {
		try {
			PtOtStOccupationalDailyRecordDAO.getInstance()
					.deletePtOtStOccupationalDailyRecord(serial);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD, serial);
	}

	public PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecordByDate(
			Date date) throws MedrexException {
		return null;
	}

	public int getKeyByDate(Date cal) throws MedrexException {
		return (PtOtStOccupationalDailyRecordDAO.getInstance()
				.getKeyByDate(cal));
	}

}
