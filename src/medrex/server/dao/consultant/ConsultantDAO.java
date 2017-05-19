package medrex.server.dao.consultant;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.Consultant;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConsultantDAO {

	private ConsultantDAO() {
	}

	private static ConsultantDAO consultantDao = null;

	public static synchronized ConsultantDAO getInstance() {

		// if obj is null create it , else just return it
		if (consultantDao == null) {
			consultantDao = new ConsultantDAO();

		} // end if

		return (consultantDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateConsultant(Consultant consultant)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from Consultant");
			session.saveOrUpdate(consultant);
			tx.commit();
			return consultant.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getConsultants(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Consultant as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Consultant getConsultant(int serial)
			throws MedrexException {
		Consultant consultant = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			consultant = (Consultant) session.load(Consultant.class, serial);
			consultant.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return consultant;
	}

	public synchronized void deleteConsultant(int serial)
			throws MedrexException {
		Consultant consultant = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			consultant = (Consultant) session.load(Consultant.class, serial);
			consultant.getNotes();
			session.delete(consultant);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
