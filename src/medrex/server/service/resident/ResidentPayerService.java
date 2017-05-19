package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentPayer;
import medrex.server.dao.resident.ResidentInformationDAO;

public class ResidentPayerService {

	public int insertOrUpdateResidentPayer(ResidentPayer residentPayer)
			throws MedrexException {
		return ResidentInformationDAO.getInstance()
				.insertOrUpdateResidentPayer(residentPayer);
	}

	public List getResidentPayers(int residentSerial) throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentPayers(residentSerial));
	}

	public ResidentPayer getResidentPayer(int serial) throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidentPayer(serial));
	}

	public void deleteResidentPayer(int serial) throws MedrexException {
		ResidentInformationDAO.getInstance().deleteResidentPayer(serial);
	}

}
