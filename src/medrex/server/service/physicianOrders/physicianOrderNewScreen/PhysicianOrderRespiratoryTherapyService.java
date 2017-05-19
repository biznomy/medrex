package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRespiratoryTherapy;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderRespiratoryTherapyDAO;

public class PhysicianOrderRespiratoryTherapyService {
	public int insertOrUpdatePhysicianOrderRespiratoryTherapy(
			PhysicianOrderRespiratoryTherapy phyresp) throws MedrexException {

		return PhysicianOrderRespiratoryTherapyDAO.getInstance()
				.insertOrUpdatePhysicianOrderRespiratoryTherapy(phyresp);
	}

	public void deletePhysicianOrderRespiratoryTherapy(int serial)
			throws MedrexException {

		PhysicianOrderRespiratoryTherapyDAO.getInstance()
				.deletePhysicianOrderRespiratoryTherapy(serial);
	}

	public PhysicianOrderRespiratoryTherapy getPhysicianOrderRespiratoryTherapy(
			int serial) throws MedrexException {
		return PhysicianOrderRespiratoryTherapyDAO.getInstance()
				.getPhysicianOrderRespiratoryTherapy(serial);
	}

}
