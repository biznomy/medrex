package medrex.server.dao.labSpecial;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.ReasonForStudy;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReasonForStudyDAO {

	private ReasonForStudyDAO() {
	}

	private static ReasonForStudyDAO rfStudyDao = null;

	public static synchronized ReasonForStudyDAO getInstance() {

		// if obj is null create it , else just return it
		if (rfStudyDao == null) {
			rfStudyDao = new ReasonForStudyDAO();

		} // end if

		return (rfStudyDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateReasonForStudy(ReasonForStudy rfStudy)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ReasonForStudy");
			session.saveOrUpdate(rfStudy);
			tx.commit();

			return rfStudy.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Reason For Study");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getReasonForStudys(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ReasonForStudy as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Reason For Study List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ReasonForStudy getReasonForStudy(int serial)
			throws MedrexException {
		ReasonForStudy rfStudy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rfStudy = (ReasonForStudy) session.load(ReasonForStudy.class,
					serial);
			rfStudy.getArterialAtherosGangrene();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Reason For Study Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rfStudy;
	}

	public synchronized void deleteReasonForStudy(int serial) throws Exception {

		ReasonForStudy rfStudy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rfStudy = (ReasonForStudy) session.load(ReasonForStudy.class,
					serial);
			rfStudy.getArterialAtherosGangrene();
			session.delete(rfStudy);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Reason For Study Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
