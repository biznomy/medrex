package medrex.server.dao.labSpecial;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.MadexForm2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MadexForm2DAO {

	private MadexForm2DAO() {
	}

	private static MadexForm2DAO refMadexFormDao = null;

	public static synchronized MadexForm2DAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new MadexForm2DAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMadexForm2(MadexForm2 refMadexForm2)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from MadexForm2");
			session.saveOrUpdate(refMadexForm2);
			tx.commit();

			return refMadexForm2.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMadexForm2s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MadexForm2 as ls where ls.residentId="
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

	public synchronized MadexForm2 getMadexForm2(int serial)
			throws MedrexException {
		MadexForm2 refMadexForm2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMadexForm2 = (MadexForm2) session.load(MadexForm2.class, serial);
			refMadexForm2.getCardiologicalOther();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMadexForm2;
	}

	public synchronized void deleteMadexForm2(int serial) throws Exception {

		MadexForm2 refMadexForm2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMadexForm2 = (MadexForm2) session.load(MadexForm2.class, serial);
			refMadexForm2.getCardiologicalOther();
			session.delete(refMadexForm2);
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
