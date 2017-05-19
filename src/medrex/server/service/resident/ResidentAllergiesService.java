package medrex.server.service.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.server.dao.resident.ResidentAllergiesDAO;

public class ResidentAllergiesService {
	public int insertOrUpdateResidentAllergies(ResidentAllergies ref)
			throws MedrexException {
		return ResidentAllergiesDAO.getInstance()
				.insertOrUpdateResidentAllergies(ref);
	}

	public void deleteResidentAllergies(int id) throws MedrexException {
		ResidentAllergiesDAO.getInstance().deleteResidentAllergies(id);
	}

	public List<ResidentAllergies> getResidentAllergiesforResident(
			int residentId) throws MedrexException {

		return ResidentAllergiesDAO.getInstance()
				.getResidentAllergiesforResident(residentId);
	}

	public ResidentAllergies getResidentAllergy(int currSerial)
			throws MedrexException {

		return ResidentAllergiesDAO.getInstance()
				.getResidentAllergy(currSerial);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(String text,
			String selectedButton) throws MedrexException {
		return ResidentAllergiesDAO.getInstance()
				.getResidentAllergiesForString(text, selectedButton);
	}

	public List<ResidentAllergies> getResidentAllergiesForString(
			String selectedButton) throws MedrexException {
		return ResidentAllergiesDAO.getInstance()
				.getResidentAllergiesForString(selectedButton);
	}
}
