package medrex.server.service.labSpecial;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.ReasonForStudy;
import medrex.server.dao.labSpecial.ReasonForStudyDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ReasonForStudyService {

	public int insertOrUpdateReasonForStudy(ReasonForStudy rfStudy)
			throws MedrexException {
		int serial = ReasonForStudyDAO.getInstance()
				.insertOrUpdateReasonForStudy(rfStudy);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(rfStudy
				.getResidentId(), FormSchedulerConstants.REASON_FOR_STUDY_FORM,
				serial);
		return serial;
	}

	public List getReasonForStudys(int residentSerial) throws MedrexException {
		return (ReasonForStudyDAO.getInstance()
				.getReasonForStudys(residentSerial));
	}

	public ReasonForStudy getReasonForStudy(int serial) throws MedrexException {
		return (ReasonForStudyDAO.getInstance().getReasonForStudy(serial));
	}

	public void deleteReasonForStudy(int serial) throws MedrexException {
		try {
			ReasonForStudyDAO.getInstance().deleteReasonForStudy(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.REASON_FOR_STUDY_FORM, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
