package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentVitalSigns;
import medrex.server.dao.resident.ResidentVitalSignsDao;

public class ResidentVitalSignsService {

	public int insertOrUpdateVitals(ResidentVitalSigns vital)
			throws MedrexException {

		return ResidentVitalSignsDao.getInstance().insertOrUpdateVitals(vital);
	}

	public List<ResidentVitalSigns> getVitalSigns(int currentResidenceKey)
			throws MedrexException {

		return ResidentVitalSignsDao.getInstance().getVitals(
				currentResidenceKey);
	}

	public void deleteResidentVitalRecord(int vitalId) throws MedrexException {

		ResidentVitalSignsDao.getInstance().deleteResidentVitalRecord(vitalId);
	}

	public ResidentVitalSigns getVitalSign(int currentVitalSignKey)
			throws MedrexException {

		return ResidentVitalSignsDao.getInstance().getVitalSign(
				currentVitalSignKey);
	}

}
