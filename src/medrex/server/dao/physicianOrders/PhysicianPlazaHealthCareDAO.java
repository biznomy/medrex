package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianPlazaHealthCare;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianPlazaHealthCareDAO {

	private PhysicianPlazaHealthCareDAO() {
	}

	private static PhysicianPlazaHealthCareDAO refMadexFormDao = null;

	public static synchronized PhysicianPlazaHealthCareDAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PhysicianPlazaHealthCareDAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianPlazaHealthCare(
			PhysicianPlazaHealthCare refPhysicianPlazaHealthCare)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianPlazaHealthCare");
			session.saveOrUpdate(refPhysicianPlazaHealthCare);
			tx.commit();

			return refPhysicianPlazaHealthCare.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianPlazaHealthCares(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianPlazaHealthCare as ls where ls.residentId="
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

	public synchronized PhysicianPlazaHealthCare getPhysicianPlazaHealthCare(
			int serial) throws MedrexException {
		PhysicianPlazaHealthCare refPhysicianPlazaHealthCare = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianPlazaHealthCare = (PhysicianPlazaHealthCare) session
					.load(PhysicianPlazaHealthCare.class, serial);
			refPhysicianPlazaHealthCare.getOtOther();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianPlazaHealthCare;
	}

	public synchronized void deletePhysicianPlazaHealthCare(int serial)
			throws Exception {
		PhysicianPlazaHealthCare refPhysicianPlazaHealthCare = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianPlazaHealthCare = (PhysicianPlazaHealthCare) session
					.load(PhysicianPlazaHealthCare.class, serial);
			refPhysicianPlazaHealthCare.getOtModality();
			session.delete(refPhysicianPlazaHealthCare);
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
