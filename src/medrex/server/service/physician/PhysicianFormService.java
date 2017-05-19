package medrex.server.service.physician;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.server.dao.physicianOrders.PhysicianFormDAO;

public class PhysicianFormService {

	public int insertOrUpdatePhysicianForm(PhysicianForm refPhysicianForm)
			throws MedrexException {
		return PhysicianFormDAO.getInstance().insertOrUpdatePhysicianForm(
				refPhysicianForm);
	}

	public List<PhysicianForm> getPhysicianForms(int residentSerial)
			throws MedrexException {
		// return (PhysicianFormDAO.getInstance()
		// .getPhysicianForms(residentSerial));
		List<PhysicianForm> physForms = PhysicianFormDAO.getInstance()
				.getPhysicianForms(residentSerial);
		List<PhysicianForm> phyFormsWithCompleteInfo = new ArrayList<PhysicianForm>();
		for (PhysicianForm phy : physForms) {
			// Doctors doc=new
			// DoctorsService().getDoctorsRecord(phy.getPhysicianId());
			Doctors doc = phy.getPhysician();
			phy.setPhyName(doc.getPhysicianName());
			phy.setPhyPhone(doc.getPhoneNumber());
			phy.setPhyType(doc.getDoctorType());
			phy.setPhySurName(doc.getPhysicianSurName());
			phyFormsWithCompleteInfo.add(phy);
		}
		return phyFormsWithCompleteInfo;
	}

	public PhysicianForm getResidentPhysician(int residentId, int physicianType)
			throws MedrexException {
		return (PhysicianFormDAO.getInstance().getResidentPhysician(residentId,
				physicianType));
	}

	public PhysicianForm getPhysicianForm(int serial) throws MedrexException {
		return (PhysicianFormDAO.getInstance().getPhysicianForm(serial));
	}

	public void deletePhysicianForm(int serial) throws MedrexException {
		try {
			PhysicianFormDAO.getInstance().deletePhysicianForm(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
