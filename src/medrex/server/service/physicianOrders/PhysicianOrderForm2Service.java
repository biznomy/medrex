package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2Row;
import medrex.server.dao.physicianOrders.PhysicianOrderForm2DAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianOrderForm2Service {

	public int insertOrUpdatePhysicianOrderForm2(
			PhysicianOrderForm2 refPhysicianOrderForm2) throws MedrexException {
		int serial = PhysicianOrderForm2DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm2(refPhysicianOrderForm2);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPhysicianOrderForm2.getResidentId(),
				FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2, serial);
		return serial;
	}

	public List getPhysicianOrderForm2s(int residentSerial)
			throws MedrexException {
		return (PhysicianOrderForm2DAO.getInstance()
				.getPhysicianOrderForm2s(residentSerial));
	}

	public PhysicianOrderForm2 getPhysicianOrderForm2(int serial)
			throws MedrexException {
		return (PhysicianOrderForm2DAO.getInstance()
				.getPhysicianOrderForm2(serial));
	}

	public void deletePhysicianOrderForm2(int serial) throws MedrexException {
		try {
			PhysicianOrderForm2DAO.getInstance().deletePhysicianOrderForm2(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insertOrUpdatePhysicianOrderForm2Row(PhysicianOrderForm2Row psr)
			throws MedrexException {
		return PhysicianOrderForm2DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm2Row(psr);
	}

	public PhysicianOrderForm2Row getPhysicianOrderForm2Row(int formId,
			int formNum) throws MedrexException {
		return (PhysicianOrderForm2DAO.getInstance().getPhysicianOrderForm2Row(
				formId, formNum));
	}

	public void deletePhysicianOrderForm2Row(int formId) throws MedrexException {
		PhysicianOrderForm2DAO.getInstance().deletePhysicianOrderForm2Row(
				formId);
	}

}
