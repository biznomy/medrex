package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2Row;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderForm2DAO {

	private PhysicianOrderForm2DAO() {
	}

	private static PhysicianOrderForm2DAO refMadexFormDao = null;

	public static synchronized PhysicianOrderForm2DAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PhysicianOrderForm2DAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderForm2(
			PhysicianOrderForm2 refPhysicianOrderForm2) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm2");
			session.saveOrUpdate(refPhysicianOrderForm2);
			tx.commit();

			return refPhysicianOrderForm2.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianOrderForm2s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianOrderForm2 as ls where ls.residentId="
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

	public synchronized PhysicianOrderForm2 getPhysicianOrderForm2(int serial)
			throws MedrexException {
		PhysicianOrderForm2 refPhysicianOrderForm2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm2 = (PhysicianOrderForm2) session.load(
					PhysicianOrderForm2.class, serial);
			refPhysicianOrderForm2.getAboveOrdersField();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianOrderForm2;
	}

	public synchronized void deletePhysicianOrderForm2(int serial)
			throws Exception {

		PhysicianOrderForm2 refPhysicianOrderForm2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm2 = (PhysicianOrderForm2) session.load(
					PhysicianOrderForm2.class, serial);
			refPhysicianOrderForm2.getAboveOrdersField();
			session.delete(refPhysicianOrderForm2);
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

	public synchronized int insertOrUpdatePhysicianOrderForm2Row(
			PhysicianOrderForm2Row refPhysicianOrderForm2Row)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm2Row");
			session.saveOrUpdate(refPhysicianOrderForm2Row);
			tx.commit();
			return refPhysicianOrderForm2Row.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PhysicianOrderForm2Row getPhysicianOrderForm2Row(
			int formId, int formNum) throws MedrexException {
		PhysicianOrderForm2Row psr = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psr = (PhysicianOrderForm2Row) session
					.createQuery(
							"from PhysicianOrderForm2Row as aliasp where aliasp.physicianOrderForm2Serial = "
									+ formId
									+ " AND aliasp.physicianOrderForm2RowSerial = "
									+ formNum).uniqueResult();
			psr.getDiagnosis();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retreiving physician record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return psr;
	}

	public void deletePhysicianOrderForm2Row(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createQuery(
							"delete from PhysicianOrderForm2Row as aliasp where aliasp.physicianOrderForm2Serial = "
									+ formId).executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Madex Form 2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
