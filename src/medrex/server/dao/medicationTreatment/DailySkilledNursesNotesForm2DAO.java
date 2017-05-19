package medrex.server.dao.medicationTreatment;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.DailySkilledNursesNotesForm2;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class DailySkilledNursesNotesForm2DAO {
	public DailySkilledNursesNotesForm2DAO instance = null;;

	public synchronized int insertOrUpdateDailySkilledNursesNotesForm2(
			DailySkilledNursesNotesForm2 refForm2) throws MedrexException,
			RemoteException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DailySkilledNursesNotesForm2");
			session.saveOrUpdate(refForm2);
			tx.commit();
			return refForm2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving DailySkilled Nurses Notes Form Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void insertOrUpdateDailySkilledNursesNotesRows(
			List<DailySkilledNursesNotesRow> rows) throws MedrexException,
			RemoteException {
		Iterator i = rows.iterator();
		while (i.hasNext()) {
			DailySkilledNursesNotesRow row = (DailySkilledNursesNotesRow) i
					.next();
			insertOrUpdateDailySkilledNursesNotesRow(row);
		}
	}

	public synchronized int insertOrUpdateDailySkilledNursesNotesRow(
			DailySkilledNursesNotesRow row) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DailySkilledNursesNotesRow");
			session.saveOrUpdate(row);
			tx.commit();
			return row.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving DailySkilledNursesNotes Row ");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized DailySkilledNursesNotesForm2DAO getInstance() {
		if (instance == null) {
			instance = new DailySkilledNursesNotesForm2DAO();
		}
		return (instance);
	}

	public synchronized DailySkilledNursesNotesForm2 getDailySkilledNursesNotesForm2(
			int FormSerial) throws MedrexException {
		DailySkilledNursesNotesForm2 skilledRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			skilledRecord = (DailySkilledNursesNotesForm2) session.createQuery(
					"from DailySkilledNursesNotesForm2 as pg2 where pg2.formID = "
							+ FormSerial).uniqueResult();
			if (skilledRecord != null) {
				skilledRecord.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving DailySkilledNursesNotesForm2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return skilledRecord;
	}

	public synchronized List<DailySkilledNursesNotesRow> getDailySkilledNursesNotesRows(
			int FormSerial) throws MedrexException {
		System.out.println(FormSerial);
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DailySkilledNursesNotesRow as ar where ar.formSerial="
							+ FormSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Row List For Daily Skilled Nurses Row");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteDailySkilledNursesNotesForm2(int formserial)
			throws MedrexException {
		DailySkilledNursesNotesForm2 refDailySkilledNursesNotesForm2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDailySkilledNursesNotesForm2 = (DailySkilledNursesNotesForm2) session
					.createCriteria(DailySkilledNursesNotesForm2.class).add(
							Expression.eq("formID", formserial)).uniqueResult();
			if (refDailySkilledNursesNotesForm2 != null) {
				refDailySkilledNursesNotesForm2.getSerial();
				session.delete(refDailySkilledNursesNotesForm2);
				tx.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting DailySkilledNursesNotesForm2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteDailySkilledNursesNotesRow(int serial)
			throws MedrexException {
		// System.out.println(""+serial);
		List<DailySkilledNursesNotesRow> skilledRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			skilledRecord = session.createCriteria(
					DailySkilledNursesNotesRow.class).add(
					Restrictions.eq("formSerial", serial)).list();
			if (!skilledRecord.isEmpty()) {
				skilledRecord.get(0).getRowSerial();
				Iterator i = skilledRecord.iterator();
				while (i.hasNext()) {
					DailySkilledNursesNotesRow row = (DailySkilledNursesNotesRow) i
							.next();
					session.delete(row);
				}
				tx.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting DailySkilledNursesNotesRow");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
