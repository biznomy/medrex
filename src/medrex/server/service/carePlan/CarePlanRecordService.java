package medrex.server.service.carePlan;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.carePlan.CarePlanRecord;
import medrex.server.dao.carePlan.CarePlanRecordDAO;

public class CarePlanRecordService {

	public int insertOrUpdateCarePlanRecord(CarePlanRecord carePlanRecord)
			throws MedrexException {
		return CarePlanRecordDAO.getInstance().insertOrUpdateCarePlanRecord(
				carePlanRecord);
	}

	public CarePlanRecord getCarePlanRecord(int serial) throws MedrexException {
		return (CarePlanRecordDAO.getInstance().getCarePlanRecord(serial));
	}

	public void deleteCarePlanRecord(int serial) throws MedrexException {
		try {
			CarePlanRecordDAO.getInstance().deleteCarePlanRecord(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List getAllCarePlanMatchingThisCarePlan(CarePlanRecord careplanrecord)
			throws MedrexException {
		return CarePlanRecordDAO.getInstance()
				.getAllCarePlanMatchingThisCarePlan(careplanrecord);

	}

	public List getAllCarePlanMatchingThisCarePlan(
			CarePlanRecord careplanrecord, String userName)
			throws MedrexException {
		return CarePlanRecordDAO.getInstance()
				.getAllCarePlanMatchingThisCarePlan(careplanrecord, userName);
	}
}
