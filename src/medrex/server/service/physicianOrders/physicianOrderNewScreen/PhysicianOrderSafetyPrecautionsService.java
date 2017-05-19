package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderSafetyPrecautions;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderSafetyPrecautionsDAO;

public class PhysicianOrderSafetyPrecautionsService {

	public int insertOrUpdatePhysicianOrderSafetyPrecautions(
			PhysicianOrderSafetyPrecautions physafety) throws MedrexException {
		return PhysicianOrderSafetyPrecautionsDAO.getInstance()
				.insertOrUpdatePhysicianOrderSafetyPrecautions(physafety);
	}

	public void deletePhysicianOrderSafetyPrecautions(int serial)
			throws MedrexException {

		PhysicianOrderSafetyPrecautionsDAO.getInstance()
				.deletePhysicianOrderSafetyPrecautions(serial);
	}

	public PhysicianOrderSafetyPrecautions getPhysicianOrderSafetyPrecautions(
			int formId) throws MedrexException {
		return PhysicianOrderSafetyPrecautionsDAO.getInstance()
				.getPhysicianOrderSafetyPrecautions(formId);
	}

}
