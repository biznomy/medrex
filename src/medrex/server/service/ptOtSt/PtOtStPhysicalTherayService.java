package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalTheray;
import medrex.server.dao.ptOtStAct.PtOtStPhysicalTherayDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStPhysicalTherayService {

	public int insertOrUpdatePtOtStPhysicalTheray(
			PtOtStPhysicalTheray refPtOtStPhysicalTheray)
			throws MedrexException {
		int serial = PtOtStPhysicalTherayDAO.getInstance()
				.insertOrUpdatePtOtStPhysicalTheray(refPtOtStPhysicalTheray);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStPhysicalTheray.getResidentId(),
				FormSchedulerConstants.PHYSICAL_THERAPY, serial);
		return serial;
	}

	public List getPtOtStPhysicalTherays(int residentSerial)
			throws MedrexException {
		return (PtOtStPhysicalTherayDAO.getInstance()
				.getPtOtStPhysicalTherays(residentSerial));
	}

	public PtOtStPhysicalTheray getPtOtStPhysicalTheray(int serial)
			throws MedrexException {
		return (PtOtStPhysicalTherayDAO.getInstance()
				.getPtOtStPhysicalTheray(serial));
	}

	public void deletePtOtStPhysicalTheray(int serial) throws MedrexException {
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PHYSICAL_THERAPY, serial);
	}

	public PtOtStPhysicalTheray getExistingPhysicalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException {
		return PtOtStPhysicalTherayDAO.getInstance()
				.getExistingPhysicalTherapyForm700(fromDate, toDate);
	}
}
