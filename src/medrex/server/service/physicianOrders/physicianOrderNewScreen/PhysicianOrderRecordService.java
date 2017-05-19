package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderRecordDAO;

public class PhysicianOrderRecordService {

	public int insertOrUpdatePhysicianOrderRecord(PhysicianOrderRecord refPhyRec)
			throws MedrexException {
		return PhysicianOrderRecordDAO.getInstance()
				.insertOrUpdatePhysicianOrderRecord(refPhyRec);
	}

	public List<PhysicianOrderRecord> getPhysicianOrderRecords(String formType,
			int currentResidentKey) throws MedrexException {
		return PhysicianOrderRecordDAO.getInstance().getPhysicianOrderRecords(
				formType, currentResidentKey);
	}

	public void deletePhysicianOrderRecord(int serial) throws MedrexException {
		PhysicianOrderRecordDAO.getInstance()
				.deletePhysicianOrderRecord(serial);

	}

}
