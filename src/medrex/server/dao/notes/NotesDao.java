package medrex.server.dao.notes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.notes.Notes;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class NotesDao {

	public NotesDao() {

	}

	public static NotesDao notesDao = null;

	public static synchronized NotesDao getInstance() {
		if (notesDao == null) {
			notesDao = new NotesDao();
		}
		return notesDao;
	}

	public synchronized int insertOrUpdateNotes(Notes notes)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(notes);
			tx.commit();
			serial = notes.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public synchronized Notes getNotes(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Notes notes = null;
		try {
			tx = session.beginTransaction();
			// notes = (Notes) session.load(Notes.class, serial);
			notes = (Notes) session.createCriteria(Notes.class).add(
					Expression.eq("serial", serial)).setFetchMode(
					"notesCategories", FetchMode.EAGER).uniqueResult();
			notes.getNotesCategories().iterator();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return notes;
	}

	public List<Notes> getLatestNotes(String formName, int userId,
			NotesCategories notesCat) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Notes> result = new ArrayList<Notes>();
		List<Notes> finalList = new ArrayList<Notes>();
		try {
			tx = session.beginTransaction();
			/*
			 * List<Object> objects = session.createCriteria(Notes.class)
			 * 
			 * .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
			 * .add(Restrictions.eq("formName", formName)) .setMaxResults(5)
			 * .add(Restrictions.eq("userId", userId))
			 * .add(Restrictions.eq("notesCategories", notesCat))
			 * .createSQLQuery(
			 * "SELECT n.serial , n.formName , CONCAT(n.noteText,'') , n.userId , n.residentId , n.pageNum , n.createdDate FROM notes AS n ORDER BY n.serial DESC LIMIT 5"
			 * ) .list(); for(Object objs : objects){ Object[] objectArr =
			 * (Object[]) objs; Notes n = new Notes(); n.setSerial((Integer)
			 * objectArr[0]); n.setFormName((String)objectArr[1]);
			 * n.setNoteText((String)objectArr[2]); n.setUserId((Integer)
			 * objectArr[3]); result.add(n); }
			 */
			Criteria criteria = session.createCriteria(Notes.class).add(
					Restrictions.eq("formName", formName))
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			criteria.addOrder(Order.desc("serial"));

			result = criteria.list();
			int ctr = 0;
			for (Notes latestNote : result) {
				if (ctr >= 5) {
					break;
				} else {
					if ((latestNote != null)
							&& (latestNote.getNoteText() != null)) {
						if (!(latestNote.getNoteText().equalsIgnoreCase(""))) {
							finalList.add(latestNote);
							ctr++;
						}
					}
				}
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return finalList;
	}

	// getNotes by Userid

	public List<Notes> getNotesByUserId(int userId, int startindex)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Notes> result = new ArrayList<Notes>();
		new ArrayList<Notes>();
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Notes.class).add(
					Restrictions.eq("userId", userId));
			criteria.setFirstResult(startindex);
			criteria.setMaxResults(10);
			result = criteria.list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error notes by userid");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	/*
	 * public List<Notes> getNotesList(int startindex)throws MedrexException{
	 * Session session = SessionUtil.getInstance().getSession(); Transaction tx
	 * = null; List<Notes> result = new ArrayList<Notes>(); try { tx =
	 * session.beginTransaction(); Criteria criteria = (Criteria)
	 * session.createCriteria(Notes.class); criteria.setFirstResult(startindex);
	 * System.out.println("Fetching "+ startindex+" from index"+startindex);
	 * criteria.setMaxResults(10); result = criteria.list(); tx.commit(); }catch
	 * (Exception e) { SessionUtil.getInstance().rollbackTx(tx, "");
	 * e.printStackTrace(); throw new
	 * MedrexException("Error retrieving notes Categories Record"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return result; }
	 */

	public List<Notes> getNotesList(int userId, Date startDate, Date endDate,
			int startindex) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Notes> result = new ArrayList<Notes>();
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Notes.class);
			if (userId != 0) {
				criteria.add(Restrictions.eq("userId", userId));
			}

			if (startDate != null && endDate != null) {
				criteria.add(Expression.between("createdDate", startDate,
						endDate));
			} else {
				if (startDate != null) {
					criteria.add(Expression.ge("createdDate", startDate));
				} else if (endDate != null) {
					criteria.add(Expression.le("createdDate", endDate));
				}
			}
			criteria.setFirstResult(startindex);
			criteria.setMaxResults(10);
			result = criteria.list();
			tx.commit();
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

	public synchronized void deleteNotes(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Notes notes = null;
		try {
			tx = session.beginTransaction();
			notes = (Notes) session.load(Notes.class, serial);
			notes.getFormName();
			session.delete(notes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting notes records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<Notes> getSelectedNotesAccToFrmAndCategories(String formName,
			List<NotesCategories> notesCategories, int residentId, Date dFrom,
			Date dTo) throws MedrexException {
		List<Notes> notsList = new ArrayList<Notes>();
		for (NotesCategories nc : notesCategories) {
			List<Notes> tmpnoteslist = getAllSelectedNotesAccToFrmAndCat(
					formName, nc, residentId, dFrom, dTo);
			if (tmpnoteslist.size() != 0) {
				for (Notes n : tmpnoteslist) {
					notsList.add(n);
				}

			}
		}

		return notsList;
	}

	private List<Notes> getAllSelectedNotesAccToFrmAndCat(String formName,
			NotesCategories nc, int residentId, Date dFrom, Date dTo)
			throws MedrexException {
		Session session = null;
		Transaction tx = null;
		List<Notes> noteslist = new ArrayList<Notes>();
		List<Notes> finalNoteList = new ArrayList<Notes>();
		try {
			session = SessionUtil.getInstance().getSession();
			tx = session.beginTransaction();
			// TODO: Implement with criteria
			/*
			 * objects =session.createSQLQuery(
			 * "SELECT n.serial, n.formName, CONCAT(n.noteText, '') AS noteText FROM notes AS n "
			 * + " LEFT JOIN notes_notesCategories AS nc " +
			 * " ON n.serial = nc.notes_serial WHERE nc.notesCategories_serial = "
			 * +nc.getSerial()+ " AND n.residentId="+residentId+
			 * " AND n.createdDate BETWEEN '"+new
			 * SimpleDateFormat("yyyy-MM-dd").format(dFrom)+ "' AND '"+ new
			 * SimpleDateFormat("yyyy-MM-dd").format(dTo) +"'") .list();
			 */
			//			
			// Criteria c = session.createCriteria(Notes.class)
			// .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
			// .add(Restrictions.eq("formName", formName))
			// .add(Restrictions.eq("residentId", residentId))
			// .add(Expression.between("createdDate", dFrom, dTo))
			// .createCriteria("notesCategories", Criteria.LEFT_JOIN)
			// .add(Restrictions.eq("serial", nc.getSerial()));
			//			
			// noteslist = c.list();
			//			
			// System.out.println("noteslist: "+ noteslist.size());
			/*
			 * Iterator itr = objects.iterator(); while(itr.hasNext()){ Object[]
			 * obj = (Object[]) itr.next(); if(obj != null){ Notes tempnotes =
			 * new Notes(); tempnotes.setFormName(obj[1]+"");
			 * tempnotes.setNoteText(obj[2]+""); noteslist.add(tempnotes); } }
			 */

			noteslist = nc.getNotes();
			for (Notes n : noteslist) {
				if (n.getFormName().equalsIgnoreCase(formName)
						&& (n.getCreatedDate().after(dFrom) && n
								.getCreatedDate().before(dTo))
						&& n.getResidentId() == residentId) {
					finalNoteList.add(n);
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Notes According To Form And Categories");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return finalNoteList;
	}

	public List<NotesCategories> getNoteCategories(int serial)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<NotesCategories> result = /* new ArrayList<NotesCategories>(); */null;
		Notes n = null;
		/*
		 * List<Object> objects = null; try { tx = session.beginTransaction();
		 * objects =session.createSQLQuery(
		 * "SELECT nc.* FROM notesCategories AS nc LEFT JOIN notes_notesCategories AS n_nc ON n_nc.notesCategories_serial = nc.serial WHERE n_nc.notes_serial = "
		 * +serial) .list(); for(Object objs : objects){ Object[] objectArr =
		 * (Object[]) objs; NotesCategories n = new NotesCategories();
		 * n.setSerial((Integer) objectArr[0]); n.setFormType((String)
		 * objectArr[1]); n.setNoteCategory((String)objectArr[2]);
		 * n.setUserId((Integer)objectArr[3]); result.add(n); } tx.commit();
		 * }catch (Exception e) { SessionUtil.getInstance().rollbackTx(tx, "");
		 * e.printStackTrace(); throw new
		 * MedrexException("Error retrieving notes Categories Record"); }
		 * finally { SessionUtil.getInstance().closeSession(session); }
		 */

		try {

			tx = session.beginTransaction();
			n = (Notes) session.createCriteria(Notes.class).add(
					Expression.eq("serial", serial)).setFetchMode("serial",
					FetchMode.EAGER).uniqueResult();
			if (n != null) {
				if (n.getNotesCategories() != null) {
					result = n.getNotesCategories();
					result.iterator();
				}
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<Notes> getLatestNotes(NotesCategories nc)
			throws MedrexException {
		Session session = null;
		Transaction tx = null;
		List<Notes> finalNoteList = new ArrayList<Notes>();
		try {
			session = SessionUtil.getInstance().getSession();
			tx = session.beginTransaction();
			List<Notes> noteslist = nc.getNotes();
			for (Notes n : noteslist) {
				finalNoteList.add(n);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Notes According To FormType");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return finalNoteList;
	}

	public synchronized List getNotesByDate(Date dFrom, Date dTo)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM-dd-yyyy");
			tx = session.beginTransaction();
			result = session.createCriteria(Notes.class).add(
					Expression.between("createdDate", dFrom, dTo)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Notes on date");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
