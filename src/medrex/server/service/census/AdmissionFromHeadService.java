package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionFromHead;
import medrex.server.dao.census.AdmissionFromHeadDAO;

public class AdmissionFromHeadService {

	public int insertOrUpdateAdmissionFromHead(
			AdmissionFromHead refAdmissionFromHead) throws MedrexException {
		return AdmissionFromHeadDAO.getInstance()
				.insertOrUpdateAdmissionFromHead(refAdmissionFromHead);
	}

	public List getAdmissionFromHeads() throws MedrexException {
		return AdmissionFromHeadDAO.getInstance().getAdmissionFromHeads();
	}

	public List getAdmissionFromHeads(String likeStr) throws MedrexException {
		return AdmissionFromHeadDAO.getInstance()
				.getAdmissionFromHeads(likeStr);
	}

	public AdmissionFromHead getAdmissionFromHead(int serial)
			throws MedrexException {
		return AdmissionFromHeadDAO.getInstance().getAdmissionFromHead(serial);
	}

	public void deleteAdmissionFromHead(int serial) throws MedrexException {
		AdmissionFromHeadDAO.getInstance().deleteAdmissionFromHead(serial);
	}

}
