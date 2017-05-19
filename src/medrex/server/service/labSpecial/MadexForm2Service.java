package medrex.server.service.labSpecial;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.MadexForm2;
import medrex.server.dao.labSpecial.MadexForm2DAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MadexForm2Service {

	public int insertOrUpdateMadexForm2(MadexForm2 refMadexForm2)
			throws MedrexException {
		int serial = MadexForm2DAO.getInstance().insertOrUpdateMadexForm2(
				refMadexForm2);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(refMadexForm2
				.getResidentId(), FormSchedulerConstants.MEDFAX_FORM_2, serial);
		return serial;
	}

	public List getMadexForm2s(int residentSerial) throws MedrexException {
		return (MadexForm2DAO.getInstance().getMadexForm2s(residentSerial));
	}

	public MadexForm2 getMadexForm2(int serial) throws MedrexException {
		return (MadexForm2DAO.getInstance().getMadexForm2(serial));
	}

	public void deleteMadexForm2(int serial) throws MedrexException {
		try {
			MadexForm2DAO.getInstance().deleteMadexForm2(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.MEDFAX_FORM_2, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
