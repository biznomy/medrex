package medrex.server.dao.providers;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ProvidersRecordDAO {

	private ProvidersRecordDAO() {
	}

	private static ProvidersRecordDAO providersRecordDAO = null;

	public static synchronized ProvidersRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (providersRecordDAO == null) {
			providersRecordDAO = new ProvidersRecordDAO();

		} // end if

		return (providersRecordDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateProvidersRecord(
			ProvidersRecord providersRecord) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ProvidersRecord");
			session.saveOrUpdate(providersRecord);
			tx.commit();
			return providersRecord.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ProvidersRecord Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getProvidersRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			/*
			 * result = session.createQuery(
			 * "from ProvidersRecord as ls where ls.residentId=" +
			 * residentSerial + " order by ls.endDate desc").list();
			 */

			result = session.createCriteria(ProvidersRecord.class).add(
					Restrictions.eq("resident.serial", residentSerial))
					.addOrder(Order.desc("endDate")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProvidersRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized boolean getProvidersRecordsOfType(int residentSerial,
			int providerType) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			BigInteger count = (BigInteger) session
					.createSQLQuery(
							"select count(providersrecord.serial) as total from providersrecord join providersrecordform where providersrecord.IdProvider = providersrecordform.serial and providersrecord.IdResident= "
									+ residentSerial
									+ " and providersrecordform.providertype = '"
									+ providerType
									+ "' and date(providersrecord.endDate) > CURDATE()")
					.uniqueResult();

			tx.commit();

			if (count.intValue() == 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProvidersRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ProvidersRecord getProvidersRecord(int residentSerial,
			int providerType) throws MedrexException {
		ProvidersRecord result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = (ProvidersRecord) session.createQuery(
					"from ProvidersRecord as ls where ls.IdResident="
							+ residentSerial + " AND ls.IdProvider="
							+ providerType).uniqueResult();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving provider record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getProvidersRecords() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from ProvidersRecord").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProvidersRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ProvidersRecord getProvidersRecord(int serial)
			throws MedrexException {
		ProvidersRecord providersRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			providersRecord = (ProvidersRecord) session.load(
					ProvidersRecord.class, serial);
			providersRecord.getProvider();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProvidersRecord Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return providersRecord;
	}

	public synchronized void deleteProvidersRecord(int serial) throws Exception {

		ProvidersRecord providersRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			providersRecord = (ProvidersRecord) session.load(
					ProvidersRecord.class, serial);
			providersRecord.getProvider();
			session.delete(providersRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting ProvidersRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized void deleteProvidersRecords(int serial)
			throws Exception {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("serial is :" + serial);
			session.createQuery(
					"delete from ProvidersRecord providersrecord where IdProvider ="
							+ serial).executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting ProvidersRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
