package medrex.server.service.activity;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1;
import medrex.server.dao.activity.ActivityInitialAssessmentFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ActivityInitialAssessmentFormService {

	public int insertOrUpdateActivityInitialAssessmentFormPage1(
			ActivityInitialAssessmentFormPage1 residentPayer)
			throws MedrexException {

		int serial = ActivityInitialAssessmentFormDAO
				.getInstance()
				.insertOrUpdateActivityInitialAssessmentFormPage1(residentPayer);

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(residentPayer
				.getResidentId(),
				FormSchedulerConstants.ACTIVITY_INITIAL_ASSESSMENT, serial);

		return serial;
	}

	public List getActivityInitialAssessmentFormPage1s(int residentSerial)
			throws MedrexException {
		return (ActivityInitialAssessmentFormDAO.getInstance()
				.getActivityInitialAssessmentFormPage1s(residentSerial));
	}

	public ActivityInitialAssessmentFormPage1 getActivityInitialAssessmentFormPage1(
			int serial) throws MedrexException {
		return (ActivityInitialAssessmentFormDAO.getInstance()
				.getActivityInitialAssessmentFormPage1(serial));
	}

	public void deleteActivityInitialAssessmentFormPage1(int serial)
			throws MedrexException {
		ActivityInitialAssessmentFormDAO.getInstance()
				.deleteActivityInitialAssessmentFormPage1(serial);

		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.ACTIVITY_INITIAL_ASSESSMENT, serial);
	}

}
