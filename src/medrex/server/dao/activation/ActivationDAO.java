package medrex.server.dao.activation;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activation.ActivationLicense;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ActivationDAO {

	private ActivationDAO() {
	}

	private static ActivationDAO instance = null;

	public static synchronized ActivationDAO getInstance() {

		// if obj is null create it , else just return it
		if (instance == null) {
			instance = new ActivationDAO();

		} // end if

		return (instance);

	}

	public synchronized int insertOrUpdateActivationLicense(
			ActivationLicense ref) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(ref);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ActivationLicense");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref.getSerial();
	}

	public synchronized List<ActivationLicense> getActivationLicenses()
			throws MedrexException {
		List<ActivationLicense> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(ActivationLicense.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ActivationLicense List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized boolean isActivationLicenseValid()
			throws MedrexException {
		final ActivationLicense ref = getActivationLicense(new Date());
		return (ref != null);
	}

	public synchronized ActivationLicense getActivationLicense(Date forDate)
			throws MedrexException {
		ActivationLicense ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
			df.format(forDate);

			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(ActivationLicense.class)
					.add(Restrictions.eq("activated", true)).add(
							Restrictions.ge("endDate", forDate)).add(
							Restrictions.le("startDate", forDate));
			// System.out.println(criteria);
			ref = (ActivationLicense) criteria.uniqueResult();
			// ref = (ActivationLicense)
			// session.createQuery("from ActivationLicense al where al.startDate <= '"
			// + curDate + "' and al.endDate ").uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ActivationLicense");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized ActivationLicense getActivationLicense(int serial)
			throws MedrexException {
		ActivationLicense ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (ActivationLicense) session.get(ActivationLicense.class,
					serial);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ActivationLicense");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteActivationLicense(int serial)
			throws MedrexException {

		ActivationLicense ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (ActivationLicense) session.load(ActivationLicense.class,
					serial);
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting ActivationLicense Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
