package medrex.server.service.admission;

import java.rmi.RemoteException;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage1;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage2;
import medrex.server.dao.admission.SocialServiceInitialAssessmentDAO;

public class SocialServiceInitialAssessmentService {

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage1(
			SocialServiceInitialAssessmentFormPage1 refSocialServiceForm1)
			throws MedrexException {
		return (SocialServiceInitialAssessmentDAO.getInstance()
				.insertOrUpdateSocialServiceInitialAssessmentFormPage1(refSocialServiceForm1));
	}

	public int insertOrUpdateSocialServiceInitialAssessmentFormPage2(
			SocialServiceInitialAssessmentFormPage2 refSocialServiceForm2)
			throws MedrexException {

		return (SocialServiceInitialAssessmentDAO.getInstance()
				.insertOrUpdateSocialServiceInitialAssessmentFormPage2(refSocialServiceForm2));
	}

	public SocialServiceInitialAssessmentFormPage1 getSocialServiceInitialAssessmentFormPage1(
			int currentSocialServiceInitialAssessmentKey)
			throws MedrexException, RemoteException {
		return (SocialServiceInitialAssessmentDAO.getInstance()
				.getSocialServiceInitialAssessmentFormPage1(currentSocialServiceInitialAssessmentKey));
	}

	public SocialServiceInitialAssessmentFormPage2 getSocialServiceInitialAssessmentFormPage2(
			int currentSocialServiceInitialAssessmentForm2Key)
			throws MedrexException {

		return (SocialServiceInitialAssessmentDAO.getInstance()
				.getSocialServiceInitialAssessmentFormPage2(currentSocialServiceInitialAssessmentForm2Key));
	}

	public void deleteSocialServiceInitialAssessmentFormPage1(int formId)
			throws MedrexException {
		SocialServiceInitialAssessmentDAO.getInstance()
				.deleteSocialServiceInitialAssessmentFormPage1(formId);

	}

	public void deleteSocialServiceInitialAssessmentFormPage2(int formId)
			throws RemoteException, MedrexException {
		SocialServiceInitialAssessmentDAO.getInstance()
				.deleteSocialServiceInitialAssessmentFormPage2(formId);
	}
}
