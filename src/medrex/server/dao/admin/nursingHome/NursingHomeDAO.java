package medrex.server.dao.admin.nursingHome;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NursingHome;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NursingHomeDAO {

	private NursingHomeDAO() {

	}

	private static NursingHomeDAO nursingHomeDAO = null;

	public static synchronized NursingHomeDAO getInstance() {
		if (nursingHomeDAO == null) {
			nursingHomeDAO = new NursingHomeDAO();
		}
		return nursingHomeDAO;
	}

	public synchronized int insertOrUpdateNursinhHome(NursingHome nh)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(nh);
			tx.commit();
			// serial = nh.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return nh.getSerial();
	}

	public synchronized NursingHome getNursingHomeInfo(int i)
			throws MedrexException {
		NursingHome nh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			nh = (NursingHome) session.createCriteria(NursingHome.class).add(
					Restrictions.eq("serial", i)).uniqueResult();
			tx.commit();
			// serial = nh.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return nh;
	}
}
