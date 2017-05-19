package medrex.server.service.labSpecial;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.MadexForm1;
import medrex.server.dao.labSpecial.MadexForm1DAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MadexForm1Service {

	public int insertOrUpdateMadexForm1(MadexForm1 refMadexForm1)
			throws MedrexException {
		int serial = MadexForm1DAO.getInstance().insertOrUpdateMadexForm1(
				refMadexForm1);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(refMadexForm1
				.getResidentId(), FormSchedulerConstants.MEDFAX_FORM_1, serial);
		return serial;
	}

	public List getMadexForm1s(int residentSerial) throws MedrexException {
		return (MadexForm1DAO.getInstance().getMadexForm1s(residentSerial));
	}

	public MadexForm1 getMadexForm1(int serial) throws MedrexException {
		return (MadexForm1DAO.getInstance().getMadexForm1(serial));
	}

	public void deleteMadexForm1(int serial) throws MedrexException {
		try {
			MadexForm1DAO.getInstance().deleteMadexForm1(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.MEDFAX_FORM_1, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
