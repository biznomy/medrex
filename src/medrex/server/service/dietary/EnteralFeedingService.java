package medrex.server.service.dietary;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.EnteralFeeding;
import medrex.server.dao.dietary.EnteralFeedingDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class EnteralFeedingService {

	public int insertOrUpdateEnteralFeeding(EnteralFeeding refEnteralFeeding)
			throws MedrexException {
		int serial = EnteralFeedingDAO.getInstance()
				.insertOrUpdateEnteralFeeding(refEnteralFeeding);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(refEnteralFeeding
				.getResidentId(),
				FormSchedulerConstants.ENTERAL_FEEDING_PROGRESS_NOTES, serial);
		return serial;
	}

	public List getEnteralFeedings(int residentSerial) throws MedrexException {
		return (EnteralFeedingDAO.getInstance()
				.getEnteralFeedings(residentSerial));
	}

	public EnteralFeeding getEnteralFeeding(int serial) throws MedrexException {
		return (EnteralFeedingDAO.getInstance().getEnteralFeeding(serial));
	}

	public void deleteEnteralFeeding(int serial) throws MedrexException {
		try {
			EnteralFeedingDAO.getInstance().deleteEnteralFeeding(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.ENTERAL_FEEDING_PROGRESS_NOTES,
					serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
