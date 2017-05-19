package medrex.server.service.labSpecial;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.LabSpecial;
import medrex.server.dao.labSpecial.LabSpecialDAO;

public class LabSpecialService {

	public int insertOrUpdateLabSpecial(LabSpecial labSpecial)
			throws MedrexException {
		return LabSpecialDAO.getInstance().insertOrUpdateLabSpecial(labSpecial);
	}

	public List getLabSpecials(int residentSerial) throws MedrexException {
		return (LabSpecialDAO.getInstance().getLabSpecials(residentSerial));
	}

	public LabSpecial getLabSpecial(int serial) throws MedrexException {
		return (LabSpecialDAO.getInstance().getLabSpecial(serial));
	}

	public void deleteLabSpecial(int serial) throws MedrexException {
		try {
			LabSpecialDAO.getInstance().deleteLabSpecial(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
