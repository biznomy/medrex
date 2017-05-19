package medrex.server.dao.labSpecial;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.MadexForm1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MadexForm1DAO {

	private MadexForm1DAO() {
	}

	private static MadexForm1DAO refMadexFormDao = null;

	public static synchronized MadexForm1DAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new MadexForm1DAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMadexForm1(MadexForm1 refMadexForm1)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from MadexForm1");
			session.saveOrUpdate(refMadexForm1);
			tx.commit();
			return refMadexForm1.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMadexForm1s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MadexForm1 as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex Form 2 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized MadexForm1 getMadexForm1(int serial)
			throws MedrexException {
		MadexForm1 refMadexForm1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMadexForm1 = (MadexForm1) session.load(MadexForm1.class, serial);
			refMadexForm1.getAuthorizedSign();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMadexForm1;
	}

	public synchronized void deleteMadexForm1(int serial) throws Exception {

		MadexForm1 refMadexForm1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMadexForm1 = (MadexForm1) session.load(MadexForm1.class, serial);
			refMadexForm1.getAuthorizedSign();
			session.delete(refMadexForm1);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Madex Form 2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
