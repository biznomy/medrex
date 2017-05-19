package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.Prescription;
import medrex.server.dao.physicianOrders.PrescriptionDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PrescriptionService {

	public int insertOrUpdatePrescription(Prescription refPrescription)
			throws MedrexException {
		int serial = PrescriptionDAO.getInstance().insertOrUpdatePrescription(
				refPrescription);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(refPrescription
				.getResidentId(), FormSchedulerConstants.PRESCRIPTION, serial);
		return serial;
	}

	public List getPrescriptions(int residentSerial) throws MedrexException {
		return (PrescriptionDAO.getInstance().getPrescriptions(residentSerial));
	}

	public Prescription getPrescription(int serial) throws MedrexException {
		return (PrescriptionDAO.getInstance().getPrescription(serial));
	}

	public void deletePrescription(int serial) throws MedrexException {
		try {
			PrescriptionDAO.getInstance().deletePrescription(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PRESCRIPTION, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
