package medrex.server.service.nursesNotes;

import java.rmi.RemoteException;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.nursesNotes.NursesNotesRecord;
import medrex.server.dao.nurseNotes.NursesNotesDao;

public class NursesNotesService {
	public int insertOrUpdateNursesNotes(NursesNotesRecord nursesSum)
			throws MedrexException, RemoteException {

		return (NursesNotesDao.getInstance()
				.insertOrUpdateNursesNotes(nursesSum));
	}

	public NursesNotesRecord getNursesNotesRecord(
			int currentNursesNotesRecordKey) throws MedrexException,
			RemoteException {
		return (NursesNotesDao.getInstance()
				.getNursesNotesRecord(currentNursesNotesRecordKey));
	}

	public List<NursesNotesRecord> getNursesNotesRecords(int currentResidenceKey)
			throws MedrexException {

		return (NursesNotesDao.getInstance()
				.getNursesNotesRecords(currentResidenceKey));
	}

	public void deleteNursesNotes(int formId) throws MedrexException {
		NursesNotesDao.getInstance().deleteNursesNotes(formId);

	}

}
