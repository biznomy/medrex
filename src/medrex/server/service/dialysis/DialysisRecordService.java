package medrex.server.service.dialysis;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dialysis.DialysisRecord;
import medrex.server.dao.dialysis.DialysisRecordDAO;

public class DialysisRecordService {

	public int insertOrUpdateDialysisRecord(DialysisRecord dialysisRec)
			throws MedrexException {
		return DialysisRecordDAO.getInstance().insertOrUpdateDialysisRecord(
				dialysisRec);
	}

	public List<DialysisRecord> getDialysisRecords(int residentSerial)
			throws MedrexException {
		return (DialysisRecordDAO.getInstance()
				.getDialysisRecords(residentSerial));
	}

	public DialysisRecord getDialysisRecord(int serial) throws MedrexException {
		return (DialysisRecordDAO.getInstance().getDialysisRecord(serial));
	}

	public void deleteDialysisRecord(int serial) throws MedrexException {
		DialysisRecordDAO.getInstance().deleteDialysisRecord(serial);
	}

}
