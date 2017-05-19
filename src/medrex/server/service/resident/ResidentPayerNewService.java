package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayerNew;
import medrex.server.dao.resident.ResidentInformationDAO;

public class ResidentPayerNewService {
	public int insertOrUpdateResidentPayerNew(ResidentPayerNew residentPayerNew)
			throws MedrexException {
		return ResidentInformationDAO.getInstance()
				.insertOrUpdateResidentPayerNew(residentPayerNew);
	}

	public void deleteResidentPayerNew(int serial) throws MedrexException {
		ResidentInformationDAO.getInstance().deleteResidentPayerNew(serial);
	}

	public List getResidentPayersNew(int residentId) throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentPayersNew(residentId));
	}

	public ResidentPayerNew getPayerInfoStatusNewByResidentId(
			ResidentMain residentId) throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getPayerInfoStatusNewByResidentId(residentId));
	}
}
