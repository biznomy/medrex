package medrex.server.service.resident;

import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentWeight;
import medrex.commons.vo.resident.ResidentWeightBean;
import medrex.server.dao.resident.ResidentWeightDAO;

public class ResidentWeightService {

	public int insertOrUpdateResidentWeight(ResidentWeight resWeight)
			throws MedrexException {
		return ResidentWeightDAO.getInstance().insertOrUpdateResidentWeight(
				resWeight);
	}

	public List<ResidentWeight> getResidentWeights(int currentResidenceKey)
			throws MedrexException {
		return ResidentWeightDAO.getInstance().getResidentWeights(
				currentResidenceKey);
	}

	public void deleteResidentWeightRecord(int resWeightId)
			throws MedrexException {
		ResidentWeightDAO.getInstance().deleteResidentWeightRecord(resWeightId);
	}

	public ResidentWeight getResidentWeightRecord(int currentResidentWeightKey)
			throws MedrexException {
		return ResidentWeightDAO.getInstance().getResidentWeightRecord(
				currentResidentWeightKey);
	}

	public ResidentWeight getResidentLatestWeight(int currentResidentKey)
			throws MedrexException {
		return ResidentWeightDAO.getInstance().getResidentLatestWeight(
				currentResidentKey);
	}

	public ResidentWeight getPreviousResidentWeightRecord(
			int currentResidenceKey, int previousMonths) throws MedrexException {
		return ResidentWeightDAO.getInstance().getPreviousResidentWeightRecord(
				currentResidenceKey, previousMonths);
	}

	public List<ResidentWeightBean> getResidentsWeight(Date dFrom, Date dTo,
			String withOrWithoutWeight) throws MedrexException {
		return ResidentWeightDAO.getInstance().getResidentsWeight(dFrom, dTo,
				withOrWithoutWeight);
	}

}
