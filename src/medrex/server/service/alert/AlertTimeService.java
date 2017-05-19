package medrex.server.service.alert;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.AlertTime;

public class AlertTimeService {

	public int insertOrUpdateAlertTime(AlertTime at) throws MedrexException {
		return 0;
	}

	public List<AlertTime> getAlertTimeRecords(Alert serial)
			throws MedrexException {
		return null;
	}

	public void deletegetAlertTimeRecord(int serial) throws MedrexException {
		// CalculatedAlertDAO.getInstance().deletegetAlertTimeRecord(serial);
	}

}
