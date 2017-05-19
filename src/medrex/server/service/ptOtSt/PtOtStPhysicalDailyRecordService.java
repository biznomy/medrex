package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalDailyRecord;
import medrex.server.dao.ptOtStAct.PtOtStPhysicalDailyRecordDAO;

public class PtOtStPhysicalDailyRecordService {

	public int insertOrUpdatePtOtStPhysicalDailyRecord(
			PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord)
			throws MedrexException {
		return PtOtStPhysicalDailyRecordDAO.getInstance()
				.insertOrUpdatePtOtStPhysicalDailyRecord(
						refPtOtStPhysicalDailyRecord);
	}

	public List getPtOtStPhysicalDailyRecords(int residentSerial)
			throws MedrexException {
		return (PtOtStPhysicalDailyRecordDAO.getInstance()
				.getPtOtStPhysicalDailyRecords(residentSerial));
	}

	public PtOtStPhysicalDailyRecord getPtOtStPhysicalDailyRecord(int serial)
			throws MedrexException {
		return (PtOtStPhysicalDailyRecordDAO.getInstance()
				.getPtOtStPhysicalDailyRecord(serial));
	}

	public void deletePtOtStPhysicalDailyRecord(int serial)
			throws MedrexException {
		try {
			PtOtStPhysicalDailyRecordDAO.getInstance()
					.deletePtOtStPhysicalDailyRecord(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getPhysicalDailyKeyByDate(Date cal) throws MedrexException {
		return (PtOtStPhysicalDailyRecordDAO.getInstance()
				.getPhysicalDailyKeyByDate(cal));
	}

}
