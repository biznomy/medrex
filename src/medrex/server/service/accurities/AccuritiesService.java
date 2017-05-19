package medrex.server.service.accurities;

import java.util.Date;
import java.util.List;
import java.util.Map;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.accurities.Accurities;
import medrex.server.dao.accurities.AccuritiesDAO;

public class AccuritiesService {

	public int insertOrUpdateAccurities(List<Accurities> accList, String floor,
			Date d) throws MedrexException {
		return AccuritiesDAO.getInstance().insertOrUpdateAccurities(accList,
				floor, d);
	}

	public List getCurrentAccuritiesList() throws MedrexException {
		return AccuritiesDAO.getInstance().getCurrentAccuritiesList();
	}

	public List getAccuritiesListByDate(Date d, String floor)
			throws MedrexException {
		return AccuritiesDAO.getInstance().getAccuritiesListByDate(d, floor);
	}

	public Accurities getAccurities(int serial) throws MedrexException {
		return AccuritiesDAO.getInstance().getAccurities(serial);
	}

	public void deleteAccurities(int serial) throws MedrexException {
		AccuritiesDAO.getInstance().deleteAccurities(serial);
	}

	public List getAccutiesDate() throws MedrexException {
		return AccuritiesDAO.getInstance().getAccutiesDate();
	}

	public List<Accurities> getAccuritiesListByDateTemp(Date d)
			throws MedrexException {
		return AccuritiesDAO.getInstance().getAccuritiesListByDateTemp(d);
	}

	public Map<String, Object> getAccutiesByDate(String dt)
			throws MedrexException {
		return AccuritiesDAO.getInstance().getAccutiesByDate(dt);
	}

}
