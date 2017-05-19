package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrdersDAO {

	private PhysicianOrdersDAO() {
	}

	private static PhysicianOrdersDAO physicianOrdersDao = null;

	public static synchronized PhysicianOrdersDAO getInstance() {

		// if obj is null create it , else just return it
		if (physicianOrdersDao == null) {
			physicianOrdersDao = new PhysicianOrdersDAO();

		} // end if

		return (physicianOrdersDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrder(
			PhysicianOrders physicianOrders) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrders");
			session.saveOrUpdate(physicianOrders);
			tx.commit();
			return physicianOrders.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Physician Orders");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianOrders(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianOrders as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Physician Orders List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PhysicianOrders getPhysicianOrder(int serial)
			throws MedrexException {
		PhysicianOrders physicianOrders = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			physicianOrders = (PhysicianOrders) session.load(
					PhysicianOrders.class, serial);
			physicianOrders.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Physician Orders Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return physicianOrders;
	}

	public synchronized void deletePhysicianOrder(int serial) throws Exception {

		PhysicianOrders physicianOrders = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			physicianOrders = (PhysicianOrders) session.load(
					PhysicianOrders.class, serial);
			physicianOrders.getNotes();
			session.delete(physicianOrders);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Physician Orders Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
