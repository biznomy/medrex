package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.server.dao.ResidentDiagnosisDAO;

public class ResidentDiagnosisService {

	public int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException {
		return ResidentDiagnosisDAO.getInstance()
				.insertOrUpdateResidentDiagnosis(refResidentDiagnosis);
	}

	public List getResidentDiagnosiss(int residentSerial)
			throws MedrexException {
		return (ResidentDiagnosisDAO.getInstance()
				.getResidentDiagnosiss(residentSerial));
	}

	public ResidentDiagnosis getLastDiagnosisAccToOrder(int residentId)
			throws MedrexException {
		return ResidentDiagnosisDAO.getInstance().getLastDiagnosisAccToOrder(
				residentId);
	}

	public ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException {
		return (ResidentDiagnosisDAO.getInstance().getResidentDiagnosis(serial));
	}

	public void deleteResidentDiagnosis(int serial) throws MedrexException {
		try {
			ResidentDiagnosisDAO.getInstance().deleteResidentDiagnosis(serial);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ResidentDiagnosis> getResidentDiagnosissByConfirm(int resId)
			throws MedrexException {
		return (ResidentDiagnosisDAO.getInstance()
				.getResidentDiagnosissByConfirm(resId));
	}

}
