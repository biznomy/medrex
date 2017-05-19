package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderAdvanceDirectivesDAO;

public class PhysicianOrderAdvanceDirectivesService {

	public int insertOrUpdatePhysicianOrderAdvanceDirectives(
			PhysicianOrderAdvanceDirectives phyadvance) throws MedrexException {
		return PhysicianOrderAdvanceDirectivesDAO.getInstance()
				.insertOrUpdatePhysicianOrderAdvanceDirectives(phyadvance);

	}

	public void deletePhysicianOrderAdvanceDirectives(int serial)
			throws MedrexException {
		PhysicianOrderAdvanceDirectivesDAO.getInstance()
				.deletePhysicianOrderAdvanceDirectives(serial);

	}

	public PhysicianOrderAdvanceDirectives getPhysicianOrderAdvanceDirectives(
			int serial) throws MedrexException {
		return PhysicianOrderAdvanceDirectivesDAO.getInstance()
				.getPhysicianOrderAdvanceDirectives(serial);
	}

}
