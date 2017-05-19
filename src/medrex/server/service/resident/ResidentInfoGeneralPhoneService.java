//package medrex.server.service_0.ResidentInfoGeneralService;
package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentInfoGeneralPhone;
import medrex.server.dao.resident.ResidentInfoGeneralPhoneDAO;

public class ResidentInfoGeneralPhoneService {

	public int insertOrUpdateResidentInfoGeneralPhone(
			ResidentInfoGeneralPhone refResidentInfoGeneralPhone)
			throws MedrexException {
		return ResidentInfoGeneralPhoneDAO.getInstance()
				.insertOrUpdateResidentInfoGeneralPhone(
						refResidentInfoGeneralPhone);
	}

	public List getResidentInfoGeneralPhones(int residentSerial)
			throws MedrexException {
		return (ResidentInfoGeneralPhoneDAO.getInstance()
				.getResidentInfoGeneralPhones(residentSerial));
	}

	public ResidentInfoGeneralPhone getResidentInfoGeneralPhone(int serial)
			throws MedrexException {
		return (ResidentInfoGeneralPhoneDAO.getInstance()
				.getResidentInfoGeneralPhone(serial));
	}

	public void deleteResidentInfoGeneralPhone(int serial)
			throws MedrexException {
		try {
			ResidentInfoGeneralPhoneDAO.getInstance()
					.deleteResidentInfoGeneralPhone(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
