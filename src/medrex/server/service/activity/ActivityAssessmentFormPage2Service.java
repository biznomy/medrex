package medrex.server.service.activity;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivityAssessmentFormPage2;
import medrex.server.dao.activity.ActivityAssessmentFormPage2DAO;

public class ActivityAssessmentFormPage2Service {

	public int insertOrUpdateActivityAssessmentFormPage2(
			ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2)
			throws MedrexException {
		return ActivityAssessmentFormPage2DAO.getInstance()
				.insertOrUpdateActivityAssessmentFormPage2(
						reflActivityAssessmentFormPage2);
	}

	public List getActivityAssessmentFormPage2s(int residentSerial)
			throws MedrexException {
		return (ActivityAssessmentFormPage2DAO.getInstance()
				.getActivityAssessmentFormPage2s(residentSerial));
	}

	public ActivityAssessmentFormPage2 getActivityAssessmentFormPage2(int serial)
			throws MedrexException {
		return (ActivityAssessmentFormPage2DAO.getInstance()
				.getActivityAssessmentFormPage2(serial));
	}

	public void deleteActivityAssessmentFormPage2(int serial)
			throws MedrexException {
		try {
			ActivityAssessmentFormPage2DAO.getInstance()
					.deleteActivityAssessmentFormPage2(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
