package medrex.server.dao.ptOtStAct;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PtOtStDAO {

	private PtOtStDAO() {
	}

	private static PtOtStDAO ptOtStDao = null;

	public static synchronized PtOtStDAO getInstance() {

		// if obj is null create it , else just return it
		if (ptOtStDao == null) {
			ptOtStDao = new PtOtStDAO();

		} // end if

		return (ptOtStDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtSt(PtOtSt ptOtSt)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtSt");
			session.saveOrUpdate(ptOtSt);
			tx.commit();
			return ptOtSt.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Lab Special");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtSts(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from PtOtSt as ls where ls.residentId=" + residentSerial)
			// .list();
			result = session.createCriteria(PtOtSt.class).add(
					Restrictions.ne("formType", "Occupational Daily Record"))
					.add(Restrictions.ne("formType", "Physical Daily Record"))
					.add(Restrictions.ne("formType", "Speech Daily Record"))
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Lab Special List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtSt getPtOtSt(int serial) throws MedrexException {
		PtOtSt ptOtSt = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ptOtSt = (PtOtSt) session.load(PtOtSt.class, serial);
			ptOtSt.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Lab Special Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ptOtSt;
	}

	public synchronized void deletePtOtSt(int serial) throws MedrexException {

		PtOtSt ptOtSt = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ptOtSt = (PtOtSt) session.load(PtOtSt.class, serial);
			ptOtSt.getNotes();
			session.delete(ptOtSt);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Lab Special Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
