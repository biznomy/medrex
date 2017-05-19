package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InventoryPersonalEffect;
import medrex.server.dao.monthlySummary.ResidentInventoryEffectDAO;

public class ResidentInventoryPersonalEffectFormService {

	public int insertOrUpdateResidentInventoryPersonalEffect(
			InventoryPersonalEffect refResidentInventoryPersonalEffect)
			throws MedrexException {
		return ResidentInventoryEffectDAO.getInstance()
				.insertOrUpdateResidentInventoryEffect(
						refResidentInventoryPersonalEffect);
	}

	public InventoryPersonalEffect getResidentInventoryPersonalEffect(int formId)
			throws MedrexException {
		return ResidentInventoryEffectDAO.getInstance()
				.getInventoryPersonalEffect(formId);
	}

	public void deleteResidentCarePlanForm(int formId) throws MedrexException {
		ResidentInventoryEffectDAO.getInstance().deleteInventoryPersonalEffect(
				formId);

	}

}
