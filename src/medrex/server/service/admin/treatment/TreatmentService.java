package medrex.server.service.admin.treatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Treatment;
import medrex.server.dao.admin.treatment.TreatmentDao;

public class TreatmentService {

	public Long insertOrUpdateTreatments(Treatment tre) throws MedrexException {
		return TreatmentDao.getInstance().insertOrUpdateTreatments(tre);
	}

	public Treatment getTreatment(long serial) throws MedrexException {
		return TreatmentDao.getInstance().getTreatment(serial);
	}

	public List<Treatment> getAllTreatments() throws MedrexException {
		return TreatmentDao.getInstance().getAllTreatments();
	}

	public void deleteTreatment(long serial) throws MedrexException {
		TreatmentDao.getInstance().deleteTreatment(serial);
	}

	public List<Treatment> getTreatment() throws MedrexException {
		return TreatmentDao.getInstance().getTreatment();
	}

	public List<Treatment> getTreatment(String text, String selectedButton)
			throws MedrexException {
		return TreatmentDao.getInstance().getTreatment(text, selectedButton);
	}

	public List<Treatment> getTreatment(String selectedButton)
			throws MedrexException {
		return TreatmentDao.getInstance().getTreatment(selectedButton);
	}

	public List<Object[]> getTreatmentFrequencies() throws MedrexException {

		return TreatmentDao.getInstance().getTreatmentFrequencies();
	}

}
