package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTherapyTest;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMiscellaneousDAO;

public class PhysicianOrderTherapyTestService {

	public void deletePhysicianOrderTherapyTest(int serial)throws MedrexException {
		
			PhysicianOrderTherapyTestDAO.getInstance().deletePhysicianOrderTherapyTest(serial);
	}

	public int insertOrUpdatePhysicianOrderTherapyTest(PhysicianOrderTherapyTest phytherapy) throws MedrexException{
		
		return PhysicianOrderTherapyTestDAO.getInstance().insertOrUpdatePhysicianOrderTherapyTest(phytherapy);
		
	}
	
	public PhysicianOrderTherapyTest getPhysicianOrderTherapyTest(int serial) throws MedrexException {
		
		return PhysicianOrderTherapyTestDAO.getPhysicianOrderTherapyTest(serial);
	}
}
