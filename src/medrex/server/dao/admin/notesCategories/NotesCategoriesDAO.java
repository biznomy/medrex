package medrex.server.dao.admin.notesCategories;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NotesCategories;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NotesCategoriesDAO {

	private NotesCategoriesDAO() {

	}

	private static NotesCategoriesDAO notesCategoriesDAO = null;

	public static synchronized NotesCategoriesDAO getInstance() {
		if (notesCategoriesDAO == null) {
			notesCategoriesDAO = new NotesCategoriesDAO();
		}
		return notesCategoriesDAO;
	}

	public int insertOrUpdateNotesCategories(NotesCategories notesCategories)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(notesCategories);
			tx.commit();
			serial = notesCategories.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public synchronized List getAllNotesCategories() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createQuery("from NotesCategories as n").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Notes Categories Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public NotesCategories getNotesCategories(int serial)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		NotesCategories notesCategories = null;
		try {
			tx = session.beginTransaction();
			notesCategories = (NotesCategories) session.load(
					NotesCategories.class, serial);
			notesCategories.getFormType();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return notesCategories;
	}

	public List getNotesCategories(String formName) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(NotesCategories.class).add(
					Restrictions.eq("formType", formName))
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			tx.commit();
			/* System.out.println("notesCatList size:"+result.size()); */
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteNotesCategories(int serial) throws MedrexException {
		NotesCategories notesCategories = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			notesCategories = (NotesCategories) session.load(
					NotesCategories.class, serial);
			notesCategories.getFormType();
			session.delete(notesCategories);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting notes Categories records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
