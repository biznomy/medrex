package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderConsultations;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderConsultationsDAO {

	private PhysicianOrderConsultationsDAO() {
	}

	private static PhysicianOrderConsultationsDAO phyConDao = null;

	public static synchronized PhysicianOrderConsultationsDAO getInstance() {

		if (phyConDao == null) {
			phyConDao = new PhysicianOrderConsultationsDAO();

		}
		return phyConDao;
	}

	public synchronized int insertOrUpdatePhysicianOrderConsultations(
			PhysicianOrderConsultations phycon) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			//session.createQuery("from PhysicianOrderConsultations");
			session.saveOrUpdate(phycon);
			tx.commit();

			return phycon.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicainOrderConsultations");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderConsultations(int serial)
			throws MedrexException {

		PhysicianOrderConsultations refconsult = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refconsult = (PhysicianOrderConsultations) session.load(
					PhysicianOrderConsultations.class, serial);
			//refconsult.isCardiology();
			session.delete(refconsult);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Consultations");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PhysicianOrderConsultations getPhysicianOrderConsultations(int serial)
			throws MedrexException {

		PhysicianOrderConsultations refphycon = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refphycon = (PhysicianOrderConsultations) session.createCriteria(
					PhysicianOrderConsultations.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			return refphycon;
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error getting Physician Order Consultations");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
