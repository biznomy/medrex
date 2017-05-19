package medrex.server.service.admission;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.AdmissionsRecord;
import medrex.server.dao.admission.AdmissionsRecordDAO;

public class AdmissionRecordService {

	public int insertOrUpdateAdmissionsRecord(AdmissionsRecord residentPayer)
			throws MedrexException {
		return AdmissionsRecordDAO.getInstance()
				.insertOrUpdateAdmissionsRecord(residentPayer);
	}

	public List getAdmissionsRecords(int residentSerial) throws MedrexException {
		return (AdmissionsRecordDAO.getInstance()
				.getAdmissionsRecords(residentSerial));
	}

	public AdmissionsRecord getAdmissionsRecord(int serial)
			throws MedrexException {
		return (AdmissionsRecordDAO.getInstance().getAdmissionsRecord(serial));
	}

	public void deleteAdmissionsRecord(int serial) throws MedrexException {
		AdmissionsRecordDAO.getInstance().deleteAdmissionsRecord(serial);
	}

}
