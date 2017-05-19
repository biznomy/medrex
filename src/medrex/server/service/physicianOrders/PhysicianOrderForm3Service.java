package medrex.server.service.physicianOrders;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.server.dao.physicianOrders.PhysicianOrderForm3DAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PhysicianOrderForm3Service {

	public int insertOrUpdatePhysicianOrderForm3(
			PhysicianOrderForm3 refPhysicianOrderForm3) throws MedrexException {
		int serial = PhysicianOrderForm3DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm3(refPhysicianOrderForm3);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refPhysicianOrderForm3.getResidentId(),
				FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3, serial);
		return serial;
	}

	public List getPhysicianOrderForm3s(int residentSerial)
			throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance()
				.getPhysicianOrderForm3s(residentSerial));
	}

	public List getPhysicianOrderForm3s() throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance().getPhysicianOrderForm3s());
	}

	public PhysicianOrderForm3 getPhysicianOrderForm3(int serial)
			throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance()
				.getPhysicianOrderForm3(serial));
	}

	public void deletePhysicianOrderForm3(int serial) throws MedrexException {
		try {
			PhysicianOrderForm3DAO.getInstance().deletePhysicianOrderForm3(
					serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insertOrUpdatePhysicianOrderForm3Row(PhysicianOrderForm3Row psr)
			throws MedrexException {
		return PhysicianOrderForm3DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm3Row(psr);
	}

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum) throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance().getPhysicianOrderForm3Row(
				formId, formNum));
	}

	public PhysicianOrderForm3Row getPhysicianOrderForm3Row(int formId,
			int formNum, Date date) throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance().getPhysicianOrderForm3Row(
				formId, formNum, date));
	}

	public int insertOrUpdatePhysicianOrderForm3(PhysicianOrderForm3Row dpnf)
			throws MedrexException {
		return PhysicianOrderForm3DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm3Row(dpnf);
	}

	public List getPhysicianOrderForm3Rows(int currentPhysicianOrderForm3Key)
			throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance()
				.getPhysicianOrderForm3Rows(currentPhysicianOrderForm3Key));
	}

	public int insertOrUpdatePhysicianOrderForm3Rows(List psr)
			throws MedrexException {
		// new MedicationsService().insertOrUpdateMedications(psr);
		return PhysicianOrderForm3DAO.getInstance()
				.insertOrUpdatePhysicianOrderForm3Rows(psr);

	}

	public List gethysicianOrderForm3Rows(int currentPhysicianOrderForm3Key)
			throws MedrexException {
		return (PhysicianOrderForm3DAO.getInstance()
				.getPhysicianOrderForm3Rows(currentPhysicianOrderForm3Key));
	}

	public void deletePhysicianOrderForm3Row(int formId) throws MedrexException {
		PhysicianOrderForm3DAO.getInstance().deletePhysicianOrderForm3Row(
				formId);
	}

}
