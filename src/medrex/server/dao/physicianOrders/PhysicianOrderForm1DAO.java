package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1Row;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderForm1DAO {

	private PhysicianOrderForm1DAO() {
	}

	private static PhysicianOrderForm1DAO refMadexFormDao = null;

	public static synchronized PhysicianOrderForm1DAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PhysicianOrderForm1DAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderForm1(
			PhysicianOrderForm1 refPhysicianOrderForm1) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm1");
			session.saveOrUpdate(refPhysicianOrderForm1);
			tx.commit();

			return refPhysicianOrderForm1.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianOrderForm1s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianOrderForm1 as ls where ls.residentId="
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

	public synchronized PhysicianOrderForm1 getPhysicianOrderForm1(int serial)
			throws MedrexException {
		PhysicianOrderForm1 refPhysicianOrderForm1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm1 = (PhysicianOrderForm1) session.load(
					PhysicianOrderForm1.class, serial);
			refPhysicianOrderForm1.getAdminSize();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianOrderForm1;
	}

	public synchronized void deletePhysicianOrderForm1(int serial)
			throws Exception {

		PhysicianOrderForm1 refPhysicianOrderForm1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm1 = (PhysicianOrderForm1) session.load(
					PhysicianOrderForm1.class, serial);
			refPhysicianOrderForm1.getAdminSize();
			session.delete(refPhysicianOrderForm1);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Madex Form 2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// physician order form row

	public synchronized int insertOrUpdatePhysicianOrderForm1Row(
			PhysicianOrderForm1Row refPhysicianOrderForm1Row)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm1Row");
			session.saveOrUpdate(refPhysicianOrderForm1Row);
			tx.commit();
			return refPhysicianOrderForm1Row.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PhysicianOrderForm1Row getPhysicianOrderForm1Row(
			int formId, int formNum) throws MedrexException {
		PhysicianOrderForm1Row psr = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psr = (PhysicianOrderForm1Row) session
					.createQuery(
							"from PhysicianOrderForm1Row as aliasp where aliasp.physicianOrderForm1Serial = "
									+ formId
									+ " AND aliasp.physicianOrderForm1RowSerial = "
									+ formNum).uniqueResult();
			psr.getHr04();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retreiving physician record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return psr;
	}

	public synchronized void deletePhysicianOrderForm1Row(int formId)
			throws Exception {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createQuery(
							"delete from PhysicianOrderForm1Row as aliasp where aliasp.physicianOrderForm1Serial = "
									+ formId).executeUpdate();
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
