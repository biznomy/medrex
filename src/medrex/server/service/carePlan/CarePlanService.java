package medrex.server.service.carePlan;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.carePlan.CarePlan;
import medrex.server.dao.carePlan.CarePlanDAO;

public class CarePlanService {

	public int insertOrUpdateCarePlan(CarePlan carePlan) throws MedrexException {
		return CarePlanDAO.getInstance().insertOrUpdateCarePlan(carePlan);
	}

	public List getCarePlanList(int residentSerial) throws MedrexException {
		return (CarePlanDAO.getInstance().getCarePlanList(residentSerial));
	}

	public CarePlan getCarePlan(int serial) throws MedrexException {
		return (CarePlanDAO.getInstance().getCarePlan(serial));
	}

	public void deleteCarePlan(int serial) throws MedrexException {
		try {
			CarePlanDAO.getInstance().deleteCarePlan(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
