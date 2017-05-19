package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderDietDAO;

public class PhysicianOrderDietService {

	public int insertOrUpdatePhysicianOrderDiet(PhysicianOrderDiets refPhyDiet)
			throws MedrexException {

		return PhysicianOrderDietDAO.getInstance()
				.insertOrUpdatePhysicianOrderDiet(refPhyDiet);
	}

	public PhysicianOrderDiets getPhysicianOrderDiet(int serial)
			throws MedrexException {

		return PhysicianOrderDietDAO.getInstance()
				.getPhysicianOrderDiet(serial);
	}

	public void deletePhysicianOrderDiet(int serial) throws MedrexException {
		PhysicianOrderDietDAO.getInstance().deletePhysicianOrderDiet(serial);

	}

}
