package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderMiscellaneousDAO {

	private PhysicianOrderMiscellaneousDAO() {

	}

	private static PhysicianOrderMiscellaneousDAO phymiscform = null;

	public static synchronized PhysicianOrderMiscellaneousDAO getInstance() {

		if (phymiscform == null) {
			phymiscform = new PhysicianOrderMiscellaneousDAO();

		}
		return phymiscform;
	}

	public synchronized int insertOrUpdatePhysicianOrderMiscellaneous(
			PhysicianOrderMiscellaneous phymisc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderMiscellaneous");
			session.saveOrUpdate(phymisc);
			tx.commit();

			return phymisc.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderMiscellaneous");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderMiscellaneous(int serial)
			throws MedrexException {

		PhysicianOrderMiscellaneous delphymisc = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			delphymisc = (PhysicianOrderMiscellaneous) session.load(
					PhysicianOrderMiscellaneous.class, serial);
			delphymisc.getCallMd();
			session.delete(delphymisc);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Miscellaneous");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public static PhysicianOrderMiscellaneous getPhysicianOrderMiscellaneous(
			int serial) throws MedrexException {

		PhysicianOrderMiscellaneous refMisc = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMisc = (PhysicianOrderMiscellaneous) session.load(
					PhysicianOrderMiscellaneous.class, serial);
			refMisc.getDevice();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Order Miscellaneous Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMisc;
	}

}
