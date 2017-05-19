package medrex.server.service.physicianOrders.physicianOrderNewScreen.childForms;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.childForms.PhysicianOrderEnteralDao;

public class PhysicianOrderEnteralService {

	public int insertOrUpdateEnteralProtocal(
			PhysicianOrderEnteralProtocol refEnteralProtocol)
			throws MedrexException {
		return PhysicianOrderEnteralDao.getInstance()
				.insertOrUpdateEnteralProtocal(refEnteralProtocol);
	}

	public PhysicianOrderEnteralProtocol getPanelEnteralProtocol(int formId)
			throws MedrexException {

		return PhysicianOrderEnteralDao.getPanelEnteralProtocol(formId);
	}

	public void deletePhysicianOrderEnteralProtocol(
			int currentPhysicianOrderEnteralProtocolKey) throws MedrexException {
		PhysicianOrderEnteralDao.getInstance()
				.deletePhysicianOrderEnteralProtocol(
						currentPhysicianOrderEnteralProtocolKey);

	}

}
