package medrex.server.service.ptOtSt;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStTherapyPhysical;
import medrex.server.dao.ptOtStAct.PtOtStTherapyPhysicalDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStTherapyPhysicalService {

	public int insertOrUpdatePtOtStTherapyPhysical(
			PtOtStTherapyPhysical refPtOtStTherapyPhysical)
			throws MedrexException {
		int serial = PtOtStTherapyPhysicalDAO.getInstance()
				.insertOrUpdatePtOtStTherapyPhysical(refPtOtStTherapyPhysical);
		// update pending forms for this resident this form
		(new PendingFormService())
				.updatePendingFormsStatus(
						refPtOtStTherapyPhysical.getResidentId(),
						FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE,
						serial);
		return serial;
	}

	public List getPtOtStTherapyPhysicals(int residentSerial)
			throws MedrexException {
		return (PtOtStTherapyPhysicalDAO.getInstance()
				.getPtOtStTherapyPhysicals(residentSerial));
	}

	public PtOtStTherapyPhysical getPtOtStTherapyPhysical(int serial)
			throws MedrexException {
		return (PtOtStTherapyPhysicalDAO.getInstance()
				.getPtOtStTherapyPhysical(serial));
	}

	public void deletePtOtStTherapyPhysical(int serial) throws MedrexException {
		try {
			PtOtStTherapyPhysicalDAO.getInstance().deletePtOtStTherapyPhysical(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService())
					.resetPendingFormsStatus(
							FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE,
							serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
