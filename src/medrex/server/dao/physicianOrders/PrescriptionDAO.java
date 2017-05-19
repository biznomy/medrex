package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.Prescription;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PrescriptionDAO {

	private PrescriptionDAO() {
	}

	private static PrescriptionDAO refMadexFormDao = null;

	public static synchronized PrescriptionDAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new PrescriptionDAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePrescription(
			Prescription refPrescription) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Prescription");
			session.saveOrUpdate(refPrescription);
			tx.commit();

			return refPrescription.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPrescriptions(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Prescription as ls where ls.residentId="
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

	public synchronized List getPrescriptions() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Prescription as ls group by ls.residentId").list();
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

	public synchronized Prescription getPrescription(int serial)
			throws MedrexException {
		Prescription refPrescription = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPrescription = (Prescription) session.load(Prescription.class,
					serial);
			refPrescription.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPrescription;
	}

	public synchronized void deletePrescription(int serial) throws Exception {

		Prescription refPrescription = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPrescription = (Prescription) session.load(Prescription.class,
					serial);
			refPrescription.getFrequency();
			session.delete(refPrescription);
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
