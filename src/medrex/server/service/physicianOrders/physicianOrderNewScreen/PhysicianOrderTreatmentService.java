package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatment;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderTreatmentDAO;

public class PhysicianOrderTreatmentService {
	public int insertOrUpdatePhysicianOrderTreat(
			PhysicianOrderTreatment refPhyTreat) throws MedrexException {

		return PhysicianOrderTreatmentDAO.getInstance()
				.insertOrUpdatePhysicianOrderTreat(refPhyTreat);
	}

	public PhysicianOrderTreatment getPhysicianOrderTreat(int serial)
			throws MedrexException {

		return PhysicianOrderTreatmentDAO.getInstance()
				.getPhysicianOrderTreatment(serial);
	}

	public void deletePhysicianOrderTreatment(int serial)
			throws MedrexException {
		PhysicianOrderTreatmentDAO.getInstance().deletePhysicianOrderTreatment(
				serial);

	}

}
