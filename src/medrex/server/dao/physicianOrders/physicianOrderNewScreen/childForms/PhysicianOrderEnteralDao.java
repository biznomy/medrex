package medrex.server.dao.physicianOrders.physicianOrderNewScreen.childForms;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderEnteralDao {

	private static PhysicianOrderEnteralDao PhyEnteralDao = null;

	public static synchronized PhysicianOrderEnteralDao getInstance() {

		if (PhyEnteralDao == null) {
			PhyEnteralDao = new PhysicianOrderEnteralDao();
		}
		return (PhyEnteralDao);
	}

	public synchronized int insertOrUpdateEnteralProtocal(
			PhysicianOrderEnteralProtocol refPhysicianOrderEnteralProtocol)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from PhysicianOrderEnteralProtocol");
			session.saveOrUpdate(refPhysicianOrderEnteralProtocol);
			tx.commit();

			return refPhysicianOrderEnteralProtocol.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderEnteralProtocol");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public static PhysicianOrderEnteralProtocol getPanelEnteralProtocol(
			int formId) throws MedrexException {
		PhysicianOrderEnteralProtocol refPhysicianOrderEnteralProtocol = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			refPhysicianOrderEnteralProtocol = (PhysicianOrderEnteralProtocol) session
					.load(PhysicianOrderEnteralProtocol.class, formId);
			refPhysicianOrderEnteralProtocol.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PhysicianOrderEnteralProtocol");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianOrderEnteralProtocol;
	}

	public void deletePhysicianOrderEnteralProtocol(
			int currentPhysicianOrderEnteralProtocolKey) throws MedrexException {
		PhysicianOrderEnteralProtocol refPhysicianOrderEnteralProtocol = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			refPhysicianOrderEnteralProtocol = (PhysicianOrderEnteralProtocol) session
					.load(PhysicianOrderEnteralProtocol.class,
							currentPhysicianOrderEnteralProtocolKey);
			refPhysicianOrderEnteralProtocol.getAdmission();
			session.delete(refPhysicianOrderEnteralProtocol);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting PhysicianOrderEnteralProtocol");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}