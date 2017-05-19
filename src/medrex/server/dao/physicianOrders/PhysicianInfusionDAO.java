package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianInfusion;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianInfusionDAO {

	private PhysicianInfusionDAO() {
	}

	private static PhysicianInfusionDAO refMadexFormDao = null;

	public static synchronized PhysicianInfusionDAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PhysicianInfusionDAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianInfusion(
			PhysicianInfusion refPhysicianInfusion) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianInfusion");
			session.saveOrUpdate(refPhysicianInfusion);
			tx.commit();

			return refPhysicianInfusion.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianInfusions(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianInfusion as ls where ls.residentId="
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

	public synchronized PhysicianInfusion getPhysicianInfusion(int serial)
			throws MedrexException {
		PhysicianInfusion refPhysicianInfusion = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianInfusion = (PhysicianInfusion) session.load(
					PhysicianInfusion.class, serial);
			refPhysicianInfusion.getAnaphylaxis();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianInfusion;
	}

	public synchronized void deletePhysicianInfusion(int serial)
			throws Exception {

		PhysicianInfusion refPhysicianInfusion = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianInfusion = (PhysicianInfusion) session.load(
					PhysicianInfusion.class, serial);
			refPhysicianInfusion.getAnaphylaxis();
			session.delete(refPhysicianInfusion);
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
