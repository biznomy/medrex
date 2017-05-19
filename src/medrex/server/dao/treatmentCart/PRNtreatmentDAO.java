package medrex.server.dao.treatmentCart;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.PRNmedication;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PRNtreatmentDAO {
	private PRNtreatmentDAO() {
	}

	private static PRNtreatmentDAO refPRNmedicationsDAO = null;

	public static synchronized PRNtreatmentDAO getInstance() {
		if (refPRNmedicationsDAO == null) {
			refPRNmedicationsDAO = new PRNtreatmentDAO();
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
