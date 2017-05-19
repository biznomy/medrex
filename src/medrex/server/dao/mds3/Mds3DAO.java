package medrex.server.dao.mds3;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.mds3.Mds3;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class Mds3DAO {
	private Mds3DAO() {
	}

	private static Mds3DAO refMds3DAO = null;

	public static synchronized Mds3DAO getInstance() {
		if (refMds3DAO == null) {
			refMds3DAO = new Mds3DAO();
		}
		return (refMds3DAO);
	}

	public synchronized void insertOrUpdateMDS3(Mds3 mds3)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from Mds3");
			session.saveOrUpdate(mds3);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Mds3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMDS3Sections(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(Mds3.class).add(
					Restrictions.eq("residentId", residentSerial)).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving MDS3 Form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteMDS3(int serial) throws MedrexException {

		Mds3 mds3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			mds3 = (Mds3) session.load(Mds3.class, serial);
			// mDSForm.getNotes();
			session.delete(mds3);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting MDS3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized Mds3 getMds3(int serial) throws MedrexException {

		Mds3 mds3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// mds3 = (Mds3) session.load(Mds3.class,serial);
			mds3 = (Mds3) session.createCriteria(Mds3.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			mds3.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving MDS3 ");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return mds3;
	}

}
