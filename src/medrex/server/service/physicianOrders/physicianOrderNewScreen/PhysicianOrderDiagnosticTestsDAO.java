package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiagnosticTests;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderDiagnosticTestsDAO {

	private PhysicianOrderDiagnosticTestsDAO() {
	}

	private static PhysicianOrderDiagnosticTestsDAO phydiag = null;

	public static synchronized PhysicianOrderDiagnosticTestsDAO getInstance() {

		if (phydiag == null) {
			phydiag = new PhysicianOrderDiagnosticTestsDAO();

		}
		return phydiag;
	}

	public synchronized int insertOrUpdatePhysicianOrderDiagnosticTests(
			PhysicianOrderDiagnosticTests phytest) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderDiagnosticTests");
			session.saveOrUpdate(phytest);
			tx.commit();

			return phytest.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderDiagnosticTests");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderDiagnosticTests(int serial)
			throws MedrexException {

		PhysicianOrderDiagnosticTests phyordiag = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			phyordiag = (PhysicianOrderDiagnosticTests) session.load(
					PhysicianOrderDiagnosticTests.class, serial);
			phyordiag.isEcho();
			session.delete(phyordiag);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Diagnostic Test");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianOrderDiagnosticTests getPhysicianOrderDiagnosticTests(
			int serial) throws MedrexException {

		PhysicianOrderDiagnosticTests phydiagt = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			phydiagt = (PhysicianOrderDiagnosticTests) session.createCriteria(
					PhysicianOrderDiagnosticTests.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			return phydiagt;
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error getting Physician Order Diagnostic Tests");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
