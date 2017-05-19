package medrex.server.service.medication;

import java.rmi.RemoteException;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.DailySkilledNursesNotesForm2;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;
import medrex.server.dao.medicationTreatment.DailySkilledNursesNotesForm2DAO;

public class DailySkilledNursesNotesForm2Service {

	public int insertOrUpdateDailySkilledNursesNotesForm2(
			DailySkilledNursesNotesForm2 refForm2) throws MedrexException,
			RemoteException {
		return (new DailySkilledNursesNotesForm2DAO().getInstance()
				.insertOrUpdateDailySkilledNursesNotesForm2(refForm2));
	}

	public void insertOrUpdateDailySkilledNursesNotesRows(
			List<DailySkilledNursesNotesRow> rows) throws MedrexException,
			RemoteException {
		new DailySkilledNursesNotesForm2DAO().getInstance()
				.insertOrUpdateDailySkilledNursesNotesRows(rows);

	}

	public DailySkilledNursesNotesForm2 getDailySkilledNursesNotesForm2(
			int serial) throws MedrexException, RemoteException {

		return new DailySkilledNursesNotesForm2DAO().getInstance()
				.getDailySkilledNursesNotesForm2(serial);
	}

	public List<DailySkilledNursesNotesRow> getDailySkilledNursesNotesRows(
			int serial) throws MedrexException, RemoteException {

		return new DailySkilledNursesNotesForm2DAO().getInstance()
				.getDailySkilledNursesNotesRows(serial);
	}

	public void deleteDailySkilledNursesNotesForm2(int serial)
			throws MedrexException, RemoteException {
		new DailySkilledNursesNotesForm2DAO().getInstance()
				.deleteDailySkilledNursesNotesForm2(serial);
	}

	public void deleteDailySkilledNursesNotesRow(int serial)
			throws MedrexException, RemoteException {
		new DailySkilledNursesNotesForm2DAO().getInstance()
				.deleteDailySkilledNursesNotesRow(serial);
	}
}
