package medrex.server.dao.physicianOrders;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PendingMedication;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PendingMedicationDao {
	private PendingMedicationDao() {
	}

	private static PendingMedicationDao obj = null;

	public static synchronized PendingMedicationDao getInstance() {
		if (obj == null) {
			obj = new PendingMedicationDao();
		}
		return (obj);

	}

	public synchronized int insertOrUpdatePendingMedication(
			PendingMedication ref) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PendingMedication");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Pending Medication");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
