package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.server.dao.physicianOrders.PhysicianOrdersDAO;

public class PhysicianOrdersService {

	public int insertOrUpdatePhysicianOrder(PhysicianOrders physicianOrders)
			throws MedrexException {
		return PhysicianOrdersDAO.getInstance().insertOrUpdatePhysicianOrder(
				physicianOrders);
	}

	public List getPhysicianOrders(int residentSerial) throws MedrexException {
		return (PhysicianOrdersDAO.getInstance()
				.getPhysicianOrders(residentSerial));
	}

	public PhysicianOrders getPhysicianOrder(int serial) throws MedrexException {
		return (PhysicianOrdersDAO.getInstance().getPhysicianOrder(serial));
	}

	public void deletePhysicianOrder(int serial) throws MedrexException {
		try {
			PhysicianOrdersDAO.getInstance().deletePhysicianOrder(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
