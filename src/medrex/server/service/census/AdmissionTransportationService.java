package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.server.dao.census.AdmissionTransportationDAO;

public class AdmissionTransportationService {

	public int insertOrUpdateAdmissionTransportation(
			AdmissionTransportation refAdmissionTransportation)
			throws MedrexException {
		return AdmissionTransportationDAO.getInstance()
				.insertOrUpdateAdmissionTransportation(
						refAdmissionTransportation);
	}

	public List getAdmissionTransportations(int residentSerial)
			throws MedrexException {
		return AdmissionTransportationDAO.getInstance()
				.getAdmissionTransportations(residentSerial);
	}

	public List getAdmissionTransportations(String likeStr)
			throws MedrexException {
		return AdmissionTransportationDAO.getInstance()
				.getAdmissionTransportations(likeStr);
	}

	public AdmissionTransportation getAdmissionTransportation(int serial)
			throws MedrexException {
		return AdmissionTransportationDAO.getInstance()
				.getAdmissionTransportation(serial);
	}

	public void deleteAdmissionTransportation(int serial)
			throws MedrexException {
		AdmissionTransportationDAO.getInstance().deleteAdmissionTransportation(
				serial);
	}

}
