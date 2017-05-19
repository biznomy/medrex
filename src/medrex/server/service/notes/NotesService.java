package medrex.server.service.notes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.notes.Notes;
import medrex.server.dao.notes.NotesDao;

public class NotesService {

	public int insertOrUpdateNotes(Notes notes) throws MedrexException {
		return (NotesDao.getInstance().insertOrUpdateNotes(notes));
	}

	public Notes getNotes(int serial) throws MedrexException {
		return (NotesDao.getInstance().getNotes(serial));
	}

	public List getLatestNotes(String formName, int userId,
			NotesCategories notesCat) throws MedrexException {
		return (NotesDao.getInstance().getLatestNotes(formName, userId,
				notesCat));
	}

	public void deleteNotes(int serial) throws MedrexException {
		NotesDao.getInstance().deleteNotes(serial);
	}

	public List<Notes> getSelectedNotesAccToFrmAndCategories(String formName,
			List<NotesCategories> notesCategories, int residentId, Date dFrom,
			Date dTo) throws MedrexException {
		return NotesDao.getInstance().getSelectedNotesAccToFrmAndCategories(
				formName, notesCategories, residentId, dFrom, dTo);
	}

	public List<NotesCategories> getNoteCategories(int serial)
			throws MedrexException {

		return NotesDao.getInstance().getNoteCategories(serial);
	}

	public List<Notes> getLatestNotes(NotesCategories nc)
			throws MedrexException {
		return NotesDao.getInstance().getLatestNotes(nc);
	}

	public ArrayList<Notes> getNotesList(int userid, Date from, Date dcto,
			int start_index) throws MedrexException {
		return (ArrayList<Notes>) NotesDao.getInstance().getNotesList(userid,
				from, dcto, start_index);
	}

}
