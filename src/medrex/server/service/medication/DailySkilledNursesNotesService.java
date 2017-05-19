package medrex.server.service.medication;

import java.rmi.RemoteException;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.DailySkilledNursesNotes;
import medrex.server.dao.medicationTreatment.DailySkilledNursesNotesDAO;

public class DailySkilledNursesNotesService {

	public int insertOrUpdateDailySkilledNursesNotes(
			DailySkilledNursesNotes refDailySkilledNursesNotes)
			throws MedrexException, RemoteException {
		return (DailySkilledNursesNotesDAO.getInstance()
				.insertOrUpdateDailySkilledNursesNotes(refDailySkilledNursesNotes));
	}

	public DailySkilledNursesNotes getDailySkilledNursesNotes(
			int currentDailySkilledNursesNotesKey) throws MedrexException,
			RemoteException {

		return (DailySkilledNursesNotesDAO.getInstance()
				.getDailySkilledNursesNotes(currentDailySkilledNursesNotesKey));
	}

	public void deleteDailySkilledNursesNotes(int formId)
			throws MedrexException, RemoteException {
		DailySkilledNursesNotesDAO.getInstance().deleteDailySkilledNursesNotes(
				formId);
	}

	// public List getDailySkilledNursesNotess(int residentSerial) throws
	// LTCException {
	// return (DailySkilledNursesNotesDAO.getInstance()
	// .getDailySkilledNursesNotess(residentSerial));
	// }
	//
	// public DailySkilledNursesNotes getDailySkilledNursesNotes(int serial)
	// throws LTCException {
	// return
	// (DailySkilledNursesNotesDAO.getInstance().getDailySkilledNursesNotes(serial));
	// }
	//
	// public void deleteDailySkilledNursesNotes(int serial) throws LTCException
	// {
	// try {
	// DailySkilledNursesNotesDAO.getInstance().deleteDailySkilledNursesNotes(serial);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
}
