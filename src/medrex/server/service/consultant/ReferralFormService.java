package medrex.server.service.consultant;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.ReferralForm;
import medrex.server.dao.consultant.ReferralFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ReferralFormService {

	public int insertOrUpdateReferralForm(ReferralForm rf)
			throws MedrexException {
		int serial = ReferralFormDAO.getInstance().insertOrUpdateReferralForm(
				rf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(rf.getResidentId(),
				FormSchedulerConstants.REFFERAL_FORM, serial);
		return serial;
	}

	public List getReferralForms(int residentSerial) throws MedrexException {
		return (ReferralFormDAO.getInstance().getReferralForms(residentSerial));
	}

	public ReferralForm getReferralForm(int serial) throws MedrexException {
		return (ReferralFormDAO.getInstance().getReferralForm(serial));
	}

	public void deleteReferralForm(int serial) throws MedrexException {
		ReferralFormDAO.getInstance().deleteReferralForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.REFFERAL_FORM, serial);
	}

}
