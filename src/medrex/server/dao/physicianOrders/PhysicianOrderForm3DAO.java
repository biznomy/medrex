package medrex.server.dao.physicianOrders;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderForm3DAO {

	private PhysicianOrderForm3DAO() {
	}

	private static PhysicianOrderForm3DAO refMadexFormDao = null;

	public static synchronized PhysicianOrderForm3DAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PhysicianOrderForm3DAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderForm3(
			PhysicianOrderForm3 refPhysicianOrderForm3) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm3");
			session.saveOrUpdate(refPhysicianOrderForm3);
			tx.commit();

			return refPhysicianOrderForm3.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianOrderForm3s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianOrderForm3 as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Order Form 3 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getPhysicianOrderForm3s() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianOrderForm3 as ls group by ls.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Order Form 3 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PhysicianOrderForm3 getPhysicianOrderForm3(int serial)
			throws MedrexException {
		PhysicianOrderForm3 refPhysicianOrderForm3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm3 = (PhysicianOrderForm3) session.load(
					PhysicianOrderForm3.class, serial);
			refPhysicianOrderForm3.getBaselineCbc();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianOrderForm3;
	}

	public synchronized void deletePhysicianOrderForm3(int serial)
			throws Exception {

		PhysicianOrderForm3 refPhysicianOrderForm3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderForm3 = (PhysicianOrderForm3) session.load(
					PhysicianOrderForm3.class, serial);
			refPhysicianOrderForm3.getBaselineCbc();
			session.delete(refPhysicianOrderForm3);
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

	public synchronized int insertOrUpdatePhysicianOrderForm3Row(
			PhysicianOrderForm3Row refPhysicianOrderForm3Row)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderForm3Row");
			session.saveOrUpdate(refPhysicianOrderForm3Row);
			tx.commit();
			return refPhysicianOrderForm3Row.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PhysicianOrderForm3Row getPhysicianOrderForm3Row(
			int formId, int formNum) throws MedrexException {
		PhysicianOrderForm3Row psr = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psr = (PhysicianOrderForm3Row) session
					.createQuery(
							"from PhysicianOrderForm3Row as aliasp where aliasp.physicianOrderForm3Serial = "
									+ formId
									+ " AND aliasp.physicianOrderForm3RowSerial = "
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

	// dev added function

	public synchronized PhysicianOrderForm3Row getPhysicianOrderForm3Row(
			int formId, int formNum, Date date) throws MedrexException {
		PhysicianOrderForm3Row psr = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		new SimpleDateFormat("yyyy/MM/dd");
		try {
			tx = session.beginTransaction();
			psr = (PhysicianOrderForm3Row) session.createQuery(
					"from PhysicianOrderForm3Row as p where p.physicianOrderForm3Serial = "
							+ formId + " AND p.physicianOrderForm3RowSerial = "
							+ formNum).uniqueResult();
			// System.out.println(psr);
			if (psr != null) {
				psr.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retreiving physician record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return psr;
	}

	public synchronized List getPhysicianOrderForm3Rows(
			int currentPhysicianOrderForm3Key) throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from PhysicianOrderForm3Row as pg2 where pg2.physicianOrderForm3Serial = "
							+ currentPhysicianOrderForm3Key
							+ " order by pg2.physicianOrderForm3RowSerial")
					.list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PhysicianOrder");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized int insertOrUpdatePhysicianOrderForm3Rows(List psr)
			throws MedrexException {
		Iterator i = psr.iterator();
		while (i.hasNext()) {
			PhysicianOrderForm3Row dRow = (PhysicianOrderForm3Row) i.next();
			insertOrUpdatePhysicianOrderForm3Row(dRow);
		}
		return 0;
	}

	public void deletePhysicianOrderForm3Row(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createQuery(
							"delete from PhysicianOrderForm3Row as aliasp where aliasp.physicianOrderForm3Serial = "
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
