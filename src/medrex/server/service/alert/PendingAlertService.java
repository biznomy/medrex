package medrex.server.service.alert;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.AlertSetting;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.server.dao.alert.PendingAlertDAO;

public class PendingAlertService {

	// public int insertOrUpdatePendingAlert(PendingAlert pa) throws
	// MedrexException {
	// return PendingAlertDAO.getInstance().insertOrUpdatePendingAlert(pa);
	// }

	public List getPendingAlertList(int currentResidenceKey, String str,
			int key, String type) throws MedrexException {
		return PendingAlertDAO.getInstance().getPendingAlertList(
				currentResidenceKey, str, key, type);
	}

	// public void deletePendingAlertRecord(int id) throws MedrexException {
	// PendingAlertDAO.getInstance().deletePendingAlertRecord(id);
	// }

	public List getPendingAlertRecords(int currentAlertKey)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getPendingAlertRecords(
				currentAlertKey);
	}

	public int getTotalPendingAlertCount() throws MedrexException {
		return PendingAlertDAO.getInstance().getTotalPendingAlertCount();
	}

	public List getResidentPendingAlerts(String str, int key)
			throws MedrexException {
		List list = new AlertService().getAlertSetting();
		int count = 0;
		int upTime = 0, pastTime = 0;
		String upType = null, pastType = null;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			count++;
			AlertSetting as = (AlertSetting) it.next();
			if (count == 1) {
				upTime = as.getTimeValue();
				upType = as.getTimeType();
			}
			if (count == 3) {
				pastTime = as.getTimeValue();
				pastType = as.getTimeType();
			}
		}
		return PendingAlertDAO.getInstance().getResidentPendingAlerts(str, key,
				upTime, upType, pastTime, pastType);
	}

	public int getUpcomingAlerts(int time, String type, String key)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getUpcomingAlerts(time, type, key);
	}

	public int getTotalPastAlerts(String key) throws MedrexException {
		return PendingAlertDAO.getInstance().getTotalPastAlerts(key);
	}

	// public List getGlobalPendingAlertList(int globalAlertId)throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getGlobalPendingAlertList(globalAlertId);
	// }

	public int getGlobalUpcomingAlerts(int time, String type, String key)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getGlobalUpcomingAlerts(time,
				type, key);
	}

	public int getGlobalTotalPastAlerts(String key) throws MedrexException {
		return PendingAlertDAO.getInstance().getGlobalTotalPastAlerts(key);
	}

	// public PendingAlert getPendingAlert(int currentPendingAlertKey)throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getPendingAlert(currentPendingAlertKey);
	// }

	// public List<PendingAlert> getPendingAlertList(String string)throws
	// MedrexException {
	// return PendingAlertDAO.getInstance().getPendingAlertList(string);
	// }

	public List getResidentFutureAlerts(int time, String type,
			String currentLoggedInUserName) throws MedrexException {
		return PendingAlertDAO.getInstance().getResidentFutureAlerts(time,
				type, currentLoggedInUserName);
	}

	public List getGlobalPendingAlerts(String currentLoggedInUserName)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getGlobalPendingAlerts(
				currentLoggedInUserName);
	}

	public int getCompletedAlertsCount(int key, String str)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getCompletedAlertsCount(key, str);
	}

	public int getAlertCountSentByMe(int key) throws MedrexException {
		return PendingAlertDAO.getInstance().getAlertCountSentByMe(key);
	}

	public int getGlobalCompletedAlertsCount(int key, String str)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getGlobalCompletedAlertsCount(key,
				str);
	}

	public int getGlobalAlertCountSentByMe(int currentLoggedInUserKey)
			throws MedrexException {
		return PendingAlertDAO.getInstance().getGlobalAlertCountSentByMe(
				currentLoggedInUserKey);
	}

	// public List<PendingAlert> getPendingPastAlertList(int
	// currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType)throws MedrexException {
	// return
	// PendingAlertDAO.getInstance().getPendingPastAlertList(currentResidenceKey,
	// currentLoggedInUserName, currentLoggedInUserKey,
	// currentLoggedInUserType);
	// }

	// public List<PendingAlert> getPendingUpcomingAlertList(int alertTime,
	// String alertType,
	// int currentResidenceKey, String currentLoggedInUserName,
	// int currentLoggedInUserKey, String currentLoggedInUserType)throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getPendingUpcomingAlertList(alertTime,
	// alertType, currentResidenceKey, currentLoggedInUserName,
	// currentLoggedInUserKey, currentLoggedInUserType);
	// }

	// public List<PendingAlert> getPendingCompletedAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getPendingCompletedAlertList(currentResidenceKey,
	// currentLoggedInUserKey);
	// }
	//
	// public List<PendingAlert> getPendingISendOutAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey)throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getPendingISendOutAlertList(currentResidenceKey,
	// currentLoggedInUserKey);
	// }

	// public List getResidentAlertsISendOut(int currentLoggedInUserKey) throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getResidentAlertsISendOut(currentLoggedInUserKey);
	// }
	//
	// public List getResidentAlertsCompleted(int currentLoggedInUserKey) throws
	// MedrexException {
	// return
	// PendingAlertDAO.getInstance().getResidentAlertsCompleted(currentLoggedInUserKey);
	// }

	// public void suspendAlert(int serial, int time, String type) throws
	// MedrexException {
	// PendingAlertDAO.getInstance().suspendAlert(serial, time, type);
	// }

	public List<CalculatedAlert> getCalculatedAlertList()
			throws MedrexException {
		return PendingAlertDAO.getInstance().getCalculatedAlertList();
	}

}
