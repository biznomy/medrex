package medrex.server.dao;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Nurse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class NurseDAO {

	private NurseDAO() {
	}

	private static NurseDAO nurseDAO = null;

	public static synchronized NurseDAO getInstance() {

		// if obj is null create it , else just return it
		if (nurseDAO == null) {
			nurseDAO = new NurseDAO();

		} // end if

		return (nurseDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateNurseRecord(Nurse refNurse)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Nurse");
			session.saveOrUpdate(refNurse);
			tx.commit();

			return refNurse.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Nurse record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getNurseRecords() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Nurse").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Nurse List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Nurse getNurseRecord(int serial) throws MedrexException {
		Nurse refNurse = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			refNurse = (Nurse) session.load(Nurse.class, serial);
			refNurse.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving nurse record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refNurse;

	}

	public synchronized Nurse getNurseRecordForSchedule(int serial)
			throws MedrexException {
		Nurse refNurse = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			refNurse = (Nurse) session.load(Nurse.class, serial);
			refNurse.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Nurse/CNA record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refNurse;

	}

	public synchronized void deleteNurseRecord(int serial)
			throws MedrexException {

		Nurse refNurse = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refNurse = (Nurse) session.load(Nurse.class, serial);
			refNurse.getAddress();
			session.delete(refNurse);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Nurse Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
