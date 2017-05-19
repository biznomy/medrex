package medrex.server.service.admin.notesCategories;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NotesCategories;
import medrex.server.dao.admin.notesCategories.NotesCategoriesDAO;

public class NotesCategoriesService {
	public int insertOrUpdateNotesCategories(NotesCategories notesCategories)
			throws MedrexException {
		return (NotesCategoriesDAO.getInstance()
				.insertOrUpdateNotesCategories(notesCategories));
	}

	public List getAllNotesCategories() throws MedrexException {
		return (NotesCategoriesDAO.getInstance().getAllNotesCategories());
	}

	public NotesCategories getNotesCategories(int serial)
			throws MedrexException {
		return (NotesCategoriesDAO.getInstance().getNotesCategories(serial));
	}

	public List getNotesCategories(String formName) throws MedrexException {
		return (NotesCategoriesDAO.getInstance().getNotesCategories(formName));
	}

	public void deleteNotesCategories(int serial) throws MedrexException {
		NotesCategoriesDAO.getInstance().deleteNotesCategories(serial);
	}
}
