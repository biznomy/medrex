package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiagnosticTests;

public class PhysicianOrderDiagnosticTestsService {

	public int insertOrUpdatePhysicianOrderDiagnosticTests(
			PhysicianOrderDiagnosticTests phytest) throws MedrexException {
		return PhysicianOrderDiagnosticTestsDAO.getInstance()
				.insertOrUpdatePhysicianOrderDiagnosticTests(phytest);
	}

	public void deletePhysicianOrderDiagnosticTests(int serial)
			throws MedrexException {
		PhysicianOrderDiagnosticTestsDAO.getInstance()
				.deletePhysicianOrderDiagnosticTests(serial);
	}

	public PhysicianOrderDiagnosticTests getPhysicianOrderDiagnosticTests(
			int serial) throws MedrexException {

		return PhysicianOrderDiagnosticTestsDAO.getInstance()
				.getPhysicianOrderDiagnosticTests(serial);
	}

}
