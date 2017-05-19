package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1Row;
import medrex.server.dao.physicianOrders.PhysicianOrderForm1DAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianOrderForm1Service {

	public int insertOrUpdatePhysicianOrderForm1(
			PhysicianOrderForm1 refPhysicianOrderForm1) throws MedrexException {
		int serial = PhysicianOrderForm1DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm1(refPhysicianOrderForm1);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPhysicianOrderForm1.getResidentId(),
				FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1, serial);
		return serial;
	}

	public List getPhysicianOrderForm1s(int residentSerial)
			throws MedrexException {
		return (PhysicianOrderForm1DAO.getInstance()
				.getPhysicianOrderForm1s(residentSerial));
	}

	public PhysicianOrderForm1 getPhysicianOrderForm1(int serial)
			throws MedrexException {
		return (PhysicianOrderForm1DAO.getInstance()
				.getPhysicianOrderForm1(serial));
	}

	public void deletePhysicianOrderForm1(int serial) throws MedrexException {
		try {
			PhysicianOrderForm1DAO.getInstance().deletePhysicianOrderForm1(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insertOrUpdatePhysicianOrderForm1Row(PhysicianOrderForm1Row psr)
			throws MedrexException {
		return PhysicianOrderForm1DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm1Row(psr);
	}

	public PhysicianOrderForm1Row getPhysicianOrderForm1Row(int formId,
			int formNum) throws MedrexException {
		return (PhysicianOrderForm1DAO.getInstance().getPhysicianOrderForm1Row(
				formId, formNum));
	}

	public void deletePhysicianOrderForm1Row(int formId) throws MedrexException {
		try {
			PhysicianOrderForm1DAO.getInstance().deletePhysicianOrderForm1Row(
					formId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
