package medrex.server.dao.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentInfoGeneralPhone;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ResidentInfoGeneralPhoneDAO {

	private ResidentInfoGeneralPhoneDAO() {
	}

	private static ResidentInfoGeneralPhoneDAO refResidentInfoGeneralPhoneDao = null;

	public static synchronized ResidentInfoGeneralPhoneDAO getInstance() {

		// if obj is null create it , else just return it
		if (refResidentInfoGeneralPhoneDao == null) {
			refResidentInfoGeneralPhoneDao = new ResidentInfoGeneralPhoneDAO();

		} // end if

		return (refResidentInfoGeneralPhoneDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentInfoGeneralPhone(
			ResidentInfoGeneralPhone refResidentInfoGeneralPhone)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ResidentInfoGeneralPhone");
			session.saveOrUpdate(refResidentInfoGeneralPhone);
			tx.commit();
			return refResidentInfoGeneralPhone.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentInfoGeneralPhone");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentInfoGeneralPhones(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentInfoGeneralPhone as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException(
					"Error retrieving ResidentInfoGeneralPhone List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentInfoGeneralPhone getResidentInfoGeneralPhone(
			int serial) throws MedrexException {
		ResidentInfoGeneralPhone refResidentInfoGeneralPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentInfoGeneralPhone = (ResidentInfoGeneralPhone) session
					.load(ResidentInfoGeneralPhone.class, serial);
			// refResidentInfoGeneralPhone.getPhoneNumber();
			refResidentInfoGeneralPhone.getPhoneNumber();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentInfoGeneralPhones");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refResidentInfoGeneralPhone;
	}

	public synchronized void deleteResidentInfoGeneralPhone(int serial)
			throws Exception {

		ResidentInfoGeneralPhone refResidentInfoGeneralPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentInfoGeneralPhone = (ResidentInfoGeneralPhone) session
					.load(ResidentInfoGeneralPhone.class, serial);
			refResidentInfoGeneralPhone.getPhoneNumber();
			session.delete(refResidentInfoGeneralPhone);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting ResidentInfoGeneralPhone Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
