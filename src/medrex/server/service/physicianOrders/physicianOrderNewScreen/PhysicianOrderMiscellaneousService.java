package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMiscellaneousDAO;

public class PhysicianOrderMiscellaneousService {

	public int insertOrUpdatePhysicianOrderMiscellaneousForm(
			PhysicianOrderMiscellaneous phymisc) throws MedrexException {

		return PhysicianOrderMiscellaneousDAO.getInstance()
				.insertOrUpdatePhysicianOrderMiscellaneous(phymisc);
	}

	public void deletePhysicianOrderMiscellaneous(int serial)
			throws MedrexException {

		PhysicianOrderMiscellaneousDAO.getInstance()
				.deletePhysicianOrderMiscellaneous(serial);
	}

	public PhysicianOrderMiscellaneous getPhysicianOrderMiscellaneous(int serial)
			throws MedrexException {

		return PhysicianOrderMiscellaneousDAO
				.getPhysicianOrderMiscellaneous(serial);
	}
}
