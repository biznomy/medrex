package medrex.server.dao;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.others.Doctors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

public class DoctorsDAO {

	private DoctorsDAO() {
	}

	private static DoctorsDAO doctorsDAO = null;

	public static synchronized DoctorsDAO getInstance() {

		// if obj is null create it , else just return it
		if (doctorsDAO == null) {
			doctorsDAO = new DoctorsDAO();

		} // end if

		return (doctorsDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDoctorsRecord(Doctors refDoctors)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Doctors");
			session.saveOrUpdate(refDoctors);
			tx.commit();

			return refDoctors.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Doctors record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDoctorsRecords() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session.createQuery("from Doctors").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving doctors List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getDoctorsRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session.createQuery(
					"from Doctors as ls where ls.residentId=" + residentSerial)
					.list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving doctors List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getDoctorsRecords(DoctorTypes type)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from Doctors as d where d.doctorType='" + type + "'")
			// .list();

			result = session.createCriteria(Doctors.class).add(
					Expression.eq("doctorType", type)).addOrder(
					Order.asc("physicianSurName")).addOrder(
					Order.asc("physicianName")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving doctors List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Doctors getDoctorsRecord(DoctorTypes typeCode,
			String firstName, String lastName) throws MedrexException {
		Doctors result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			// result = (Doctors) session.createQuery(
			// "from Doctors as d " + "where d.doctorType='" + typeCode
			// + "' AND d.physicianName='" + firstName
			// + "' AND d.physicianSurName='" + lastName + "'")
			// .uniqueResult();

			result = (Doctors) session.createCriteria(Doctors.class).add(
					Expression.eq("doctorType", typeCode)).add(
					Expression.eq("physicianName", firstName)).add(
					Expression.eq("physicianSurName", lastName)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving doctors List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Doctors getDoctorsRecord(int serial)
			throws MedrexException {
		Doctors refDoctors = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			refDoctors = (Doctors) session.load(Doctors.class, serial);
			refDoctors.getAddress();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving doctor record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDoctors;

	}

	public synchronized void deleteDoctorsRecord(int serial)
			throws MedrexException {

		Doctors refDoctors = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDoctors = (Doctors) session.load(Doctors.class, serial);
			refDoctors.getCity();
			session.delete(refDoctors);
			tx.commit();
		} catch (Exception e) {
			// e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting doctors Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
