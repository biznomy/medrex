package medrex.server.dao.medicationCart;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.PRNmedication;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PRNmedicationDAO {
	private PRNmedicationDAO() {
	}

	private static PRNmedicationDAO refPRNmedicationsDAO = null;

	public static synchronized PRNmedicationDAO getInstance() {
		if (refPRNmedicationsDAO == null) {
			refPRNmedicationsDAO = new PRNmedicationDAO();
		}
		return (refPRNmedicationsDAO);
	}

	public synchronized int insertOrUpdatePRN(PRNmedication prn)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from PRNmedication");
			session.saveOrUpdate(prn);
			tx.commit();
			return prn.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving prn Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
