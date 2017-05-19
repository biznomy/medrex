package medrex.server.dao.labSpecial;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.labSpecial.LabSpecial;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LabSpecialDAO {

	private LabSpecialDAO() {
	}

	private static LabSpecialDAO labSpecialDao = null;

	public static synchronized LabSpecialDAO getInstance() {

		// if obj is null create it , else just return it
		if (labSpecialDao == null) {
			labSpecialDao = new LabSpecialDAO();

		} // end if

		return (labSpecialDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateLabSpecial(LabSpecial labSpecial)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from LabSpecial");
			session.saveOrUpdate(labSpecial);
			tx.commit();
			return labSpecial.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Lab Special");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getLabSpecials(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from LabSpecial as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Lab Special List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized LabSpecial getLabSpecial(int serial)
			throws MedrexException {
		LabSpecial labSpecial = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			labSpecial = (LabSpecial) session.load(LabSpecial.class, serial);
			labSpecial.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Lab Special Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return labSpecial;
	}

	public synchronized void deleteLabSpecial(int serial) throws Exception {

		LabSpecial labSpecial = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			labSpecial = (LabSpecial) session.load(LabSpecial.class, serial);
			labSpecial.getNotes();
			session.delete(labSpecial);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Lab Special Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
