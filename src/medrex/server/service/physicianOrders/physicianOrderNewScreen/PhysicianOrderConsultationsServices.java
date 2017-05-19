package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderConsultations;

public class PhysicianOrderConsultationsServices {

	public int insertOrUpdatePhysicianOrderConsultations(
			PhysicianOrderConsultations phycon) throws MedrexException {
		return PhysicianOrderConsultationsDAO.getInstance()
				.insertOrUpdatePhysicianOrderConsultations(phycon);

	}

	public void deletePhysicianOrderConsultations(int serial)
			throws MedrexException {
		PhysicianOrderConsultationsDAO.getInstance()
				.deletePhysicianOrderConsultations(serial);

	}

	public PhysicianOrderConsultations getPhysicianOrderConsultations(int serial)
			throws MedrexException {
		return PhysicianOrderConsultationsDAO.getInstance()
				.getPhysicianOrderConsultations(serial);

	}
}
