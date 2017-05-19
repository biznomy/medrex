package medrex.server.service.admin.formScheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.PendingForm;
import medrex.server.dao.admin.formScheduler.PendingFormDao;

/**
 * @author D S Naruka
 */
public class PendingFormService {
	public void deletePendingForm(int serial) throws MedrexException {
		PendingFormDao.getInstance().deletePendingForm(serial);
	}

	public void deletePendingFormByCensusId(int censusId)
			throws MedrexException {
		PendingFormDao.getInstance().deletePendingFormByCensusId(censusId);
	}

	public PendingForm getPendingForm(int serial) throws MedrexException {
		return PendingFormDao.getInstance().getPendingForm(serial);
	}

	public List<PendingForm> getPendingForms() throws MedrexException {
		return PendingFormDao.getInstance().getPendingForms();
	}

	public List<PendingForm> getPendingFormsByResident(int residentId)
			throws MedrexException {
		return PendingFormDao.getInstance().getPendingFormsByResidentId(
				residentId);
	}

	public int insertOrUpdatePendingForm(PendingForm ref)
			throws MedrexException {
		return PendingFormDao.getInstance().insertOrUpdatePendingForm(ref);
	}

	public void insertOrUpdatePendingForms(List<PendingForm> ref)
			throws MedrexException {
		Iterator<PendingForm> itr = ref.iterator();
		while (itr.hasNext()) {
			PendingForm pf = itr.next();
			PendingFormDao.getInstance().insertOrUpdatePendingForm(pf);
		}
	}

	public void updatePendingFormsStatus(int residentId, String formType,
			int formId) {

		List<PendingForm> pf = new ArrayList<PendingForm>();

		try {
			pf = PendingFormDao.getInstance()
					.getPendingFormsByResidentIdFormType(residentId, formType);

			Iterator<PendingForm> itr = pf.iterator();

			while (itr.hasNext()) {

				PendingForm p = itr.next();

				p.setFormId(formId);

				insertOrUpdatePendingForm(p);

			}
		} catch (Exception e) {

		}

	}

	public void resetPendingFormsStatus(String formType, int formId) {

		List<PendingForm> pf = new ArrayList<PendingForm>();

		try {
			pf = PendingFormDao.getInstance()
					.getPendingFormsByResidentIdFormTypeId(formType, formId);

			Iterator<PendingForm> itr = pf.iterator();

			while (itr.hasNext()) {

				PendingForm p = itr.next();

				p.setFormId(0);

				insertOrUpdatePendingForm(p);

			}
		} catch (Exception e) {

		}

	}

	public synchronized void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException {

	}

	public int count() throws MedrexException {
		return PendingFormDao.getInstance().getPendingCount();
	}

	public int countPendingAlert() throws MedrexException {
		return PendingFormDao.getInstance().countPendingAlert();
	}

	public List getPendingFormsAccordingResident() throws MedrexException {
		return PendingFormDao.getInstance().getPendingFormsAccordingResident();
	}

	public List getFirstFloorPendingFormResidents() throws MedrexException {
		return PendingFormDao.getInstance().getFirstFloorPendingFormResidents();
	}

	public List getSecondFloorPendingFormResidents() throws MedrexException {
		return PendingFormDao.getInstance()
				.getSecondFloorPendingFormResidents();
	}

	public List getSecondFloorPendingFormAlertResidents()
			throws MedrexException {
		return PendingFormDao.getInstance()
				.getSecondFloorPendingFormAlertResidents();
	}

	public List getFirstFloorPendingFormAlertResidents() throws MedrexException {
		return PendingFormDao.getInstance()
				.getFirstFloorPendingFormAlertResidents();
	}

	public List getPendingAlert() throws MedrexException {
		return PendingFormDao.getInstance().getPendingAlert();
	}

	public int pendingFirstFloorCount() throws MedrexException {
		return PendingFormDao.getInstance().pendingFirstFloorCount();
	}

	public int pendingSecondFloorCount() throws MedrexException {
		return PendingFormDao.getInstance().pendingSecondFloorCount();
	}

	public int countPendingAlertFirstFloor() throws MedrexException {
		return PendingFormDao.getInstance().countPendingAlertFirstFloor();
	}

	public int countPendingAlertSecondFloor() throws MedrexException {
		return PendingFormDao.getInstance().countPendingAlertSecondFloor();
	}

}
