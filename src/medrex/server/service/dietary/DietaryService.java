package medrex.server.service.dietary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.Dietary;
import medrex.server.dao.dietary.DietaryDAO;

public class DietaryService {

	public int insertOrUpdateDietary(Dietary dietary) throws MedrexException {
		return DietaryDAO.getInstance().insertOrUpdateDietary(dietary);
	}

	public List getDietarys(int residentSerial) throws MedrexException {
		return (DietaryDAO.getInstance().getDietarys(residentSerial));
	}

	public Dietary getDietary(int serial) throws MedrexException {
		return (DietaryDAO.getInstance().getDietary(serial));
	}

	public void deleteDietary(int serial) throws MedrexException {
		DietaryDAO.getInstance().deleteDietary(serial);
	}

}
