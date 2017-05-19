package medrex.server.service.alert;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.server.dao.alert.CalculatedAlertDAO;

public class CalculatedAlertService {

	public List<CalculatedAlert> getCalculatedAlertList()
			throws MedrexException {
		return CalculatedAlertDAO.getInstance().getCalculatedAlertList();
	}

	public void insertOrUpdateCalculatedAlert(Alert alert)
			throws MedrexException {
		CalculatedAlertDAO.getInstance().insertOrUpdateCalculatedAlert(alert);
	}

	public List<CalculatedAlert> getCalculatedAlertListByUser(
			int currentLoggedInUserKey, String str, int key, String str2)
			throws MedrexException {
		return CalculatedAlertDAO.getInstance().getCalculatedAlertListByUser(
				currentLoggedInUserKey, str, key, str2);
	}

	public int getCalculatedAlert(int id) throws MedrexException {
		return CalculatedAlertDAO.getInstance().getCalculatedAlert(id);
	}

	public CalculatedAlert getCalculatedAlertBean(int serial)
			throws MedrexException {
		return CalculatedAlertDAO.getInstance().getCalculatedAlertBean(serial);
	}

	public void insertOrUpdateCalculatedAlert(CalculatedAlert pa)
			throws MedrexException {
		CalculatedAlertDAO.getInstance().insertOrUpdateCalculatedAlert(pa);
	}

	public void suspendAlert(int serial, int time, String type)
			throws MedrexException {
		CalculatedAlertDAO.getInstance().suspendAlert(serial, time, type);
	}

	public List getAllAlertCounts(int currentLoggedInUserKey)
			throws MedrexException {
		// TODO Auto-generated method stub
		return CalculatedAlertDAO.getInstance().getAllAlertCounts(
				currentLoggedInUserKey);
	}

	public void generateCalculatedAlertAtFixTime() throws MedrexException {
		CalculatedAlertDAO.getInstance().generateCalculatedAlertAtFixTime();
	}

}
