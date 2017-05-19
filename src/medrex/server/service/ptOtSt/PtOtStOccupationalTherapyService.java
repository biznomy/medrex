package medrex.server.service.ptOtSt;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy;
import medrex.server.dao.ptOtStAct.PtOtStOccupationalTherapyDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PtOtStOccupationalTherapyService {

	public int insertOrUpdatePtOtStOccupationalTherapy(
			PtOtStOccupationalTherapy refPtOtStOccupationalTherapy)
			throws MedrexException {
		int serial = PtOtStOccupationalTherapyDAO.getInstance()
				.insertOrUpdatePtOtStOccupationalTherapy(
						refPtOtStOccupationalTherapy);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPtOtStOccupationalTherapy.getResidentId(),
				FormSchedulerConstants.OCCUPATIONAL_THERAPY, serial);
		return serial;
	}

	public List getPtOtStOccupationalTherapys(int residentSerial)
			throws MedrexException {
		return (PtOtStOccupationalTherapyDAO.getInstance()
				.getPtOtStOccupationalTherapys(residentSerial));
	}

	public PtOtStOccupationalTherapy getPtOtStOccupationalTherapy(int serial)
			throws MedrexException {
		return (PtOtStOccupationalTherapyDAO.getInstance()
				.getPtOtStOccupationalTherapy(serial));
	}

	public void deletePtOtStOccupationalTherapy(int serial)
			throws MedrexException {
		try {
			PtOtStOccupationalTherapyDAO.getInstance()
					.deletePtOtStOccupationalTherapy(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.OCCUPATIONAL_THERAPY, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PtOtStOccupationalTherapy getExistingOccupationalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException {
		return PtOtStOccupationalTherapyDAO.getInstance()
				.getExistingOccupationalTherapyForm700(fromDate, toDate);
	}

}
