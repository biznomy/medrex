package medrex.server.service.dietary;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryPlazaHealth;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;
import medrex.server.dao.dietary.DietaryPlazaHealthDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class DietaryPlazaHealthService {

	public int insertOrUpdateDietaryPlazaHealth(
			DietaryPlazaHealth refDietaryPlazaHealth) throws MedrexException {
		int serial = DietaryPlazaHealthDAO.getInstance()
				.insertOrUpdateDietaryPlazaHealth(refDietaryPlazaHealth);
		// update pending forms for this resident this form
		(new PendingFormService())
				.updatePendingFormsStatus(
						refDietaryPlazaHealth.getResidentId(),
						FormSchedulerConstants.CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS,
						serial);
		return serial;
	}

	public List getDietaryPlazaHealths(int residentSerial)
			throws MedrexException {
		return (DietaryPlazaHealthDAO.getInstance()
				.getDietaryPlazaHealths(residentSerial));
	}

	public DietaryPlazaHealth getDietaryPlazaHealth(int serial)
			throws MedrexException {
		return (DietaryPlazaHealthDAO.getInstance()
				.getDietaryPlazaHealth(serial));
	}

	public void deleteDietaryPlazaHealth(int serial) throws MedrexException {
		try {
			DietaryPlazaHealthDAO.getInstance()
					.deleteDietaryPlazaHealth(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService())
					.resetPendingFormsStatus(
							FormSchedulerConstants.CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS,
							serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insertOrUpdateDietaryPlazaHealthRow(DietaryPlazaHealthRow psr)
			throws MedrexException {
		return DietaryPlazaHealthDAO.getInstance()
				.insertOrUpdateDietaryPlazaHealthRow(psr);
	}

	public List getDietaryPlazaHealthRow(int formId) throws MedrexException {
		return (DietaryPlazaHealthDAO.getInstance()
				.getDietaryPlazaHealthRow(formId));
	}

	public int insertOrUpdateDietaryPlazaHealthRows(List psr)
			throws MedrexException {
		return DietaryPlazaHealthDAO.getInstance()
				.insertOrUpdateDietaryPlazaHealthRows(psr);
	}

	public List getDietaryPlazaHealthRows(int formId) throws MedrexException {

		return (DietaryPlazaHealthDAO.getInstance()
				.getDietaryPlazaHealthRows(formId));
	}

	public void deleteDietaryPlazaHealthRow(int formId) throws MedrexException {
		try {
			DietaryPlazaHealthDAO.getInstance().deleteDietaryPlazaHealthRow(
					formId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
