package medrex.server.service.admin.ambulation;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.AmbulationWeight;
import medrex.server.dao.admin.ambulation.AmbulationWeightDAO;

public class AmbulationWeightService {

	public int insertOrUpdateAmbulationWeight(AmbulationWeight ambWeight)
			throws MedrexException {
		return AmbulationWeightDAO.getInstance()
				.insertOrUpdateAmbulationWeight(ambWeight);
	}

	public List<AmbulationWeight> getAmbulationWeights() throws MedrexException {
		return AmbulationWeightDAO.getInstance().getAmbulationWeights();
	}

	public AmbulationWeight getAmbulationWeight(int serial)
			throws MedrexException {
		return AmbulationWeightDAO.getInstance().getAmbulationWeight(serial);
	}

	public void deleteAmbulationWeight(int serial) throws MedrexException {
		AmbulationWeightDAO.getInstance().deleteAmbulationWeight(serial);
	}

}
