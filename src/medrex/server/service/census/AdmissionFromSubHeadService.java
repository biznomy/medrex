package medrex.server.service.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.server.dao.census.AdmissionFromSubHeadDAO;

public class AdmissionFromSubHeadService {

	public int insertOrUpdateAdmissionFromSubHead(
			AdmissionFromSubHead refAdmissionFromSubHead)
			throws MedrexException {
		return AdmissionFromSubHeadDAO.getInstance()
				.insertOrUpdateAdmissionFromSubHead(refAdmissionFromSubHead);
	}

	public List getAdmissionFromSubHeads(int headId) throws MedrexException {
		return AdmissionFromSubHeadDAO.getInstance().getAdmissionFromSubHeads(
				headId);
	}

	public List getAdmissionFromSubHeads(int headId, String likeStr)
			throws MedrexException {
		return AdmissionFromSubHeadDAO.getInstance().getAdmissionFromSubHeads(
				headId, likeStr);
	}

	public AdmissionFromSubHead getAdmissionFromSubHead(int serial)
			throws MedrexException {
		return AdmissionFromSubHeadDAO.getInstance().getAdmissionFromSubHead(
				serial);
	}

	public void deleteAdmissionFromSubHead(int serial) throws MedrexException {
		AdmissionFromSubHeadDAO.getInstance()
				.deleteAdmissionFromSubHead(serial);
	}

}
