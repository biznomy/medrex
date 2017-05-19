package medrex.server.dao;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.resident.ResidentInformationDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ResidentDiagnosisDAO {

	private ResidentDiagnosisDAO() {
	}

	private static ResidentDiagnosisDAO refResidentDiagnosisDao = null;

	public static synchronized ResidentDiagnosisDAO getInstance() {

		// if obj is null create it , else just return it
		if (refResidentDiagnosisDao == null) {
			refResidentDiagnosisDao = new ResidentDiagnosisDAO();

		} // end if

		return (refResidentDiagnosisDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			// session.createQuery("from ResidentDiagnosis");
			session.saveOrUpdate(refResidentDiagnosis);
			tx.commit();

			return refResidentDiagnosis.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentDiagnosis");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentDiagnosiss(int residentSerial)
			throws MedrexException {
		ResidentMain res = ResidentInformationDAO.getInstance().getResident(
				residentSerial);
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from ResidentDiagnosis as ls where ls.residentId="
			// + residentSerial).list();
			result = session.createCriteria(ResidentDiagnosis.class).add(
					Restrictions.eq("resident", res)).addOrder(
					Order.asc("order")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosis List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidentDiagnosissByConfirm(int residentSerial)
			throws MedrexException {
		ResidentMain res = ResidentInformationDAO.getInstance().getResident(
				residentSerial);
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			result = session.createCriteria(ResidentDiagnosis.class).add(
					Restrictions.eq("resident", res)).addOrder(
					Order.asc("order")).add(Expression.eq("confirmed", true))
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosis List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public ResidentDiagnosis getLastDiagnosisAccToOrder(int residentId)
			throws MedrexException {
		ResidentDiagnosis rd = null;
		ResidentMain res = ResidentInformationDAO.getInstance().getResident(
				residentId);
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		try {
			tr = sess.beginTransaction();
			rd = (ResidentDiagnosis) sess.createCriteria(
					ResidentDiagnosis.class).add(
					Restrictions.eq("resident", res)).addOrder(
					Order.desc("order")).setMaxResults(1).uniqueResult();
			tr.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new MedrexException(
					"Error getting last diagnosis according to order");
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return rd;
	}

	public synchronized ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException {
		ResidentDiagnosis refResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentDiagnosis = (ResidentDiagnosis) session.load(
					ResidentDiagnosis.class, serial);
			refResidentDiagnosis.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosiss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refResidentDiagnosis;
	}

	public synchronized void deleteResidentDiagnosis(int serial)
			throws Exception {

		ResidentDiagnosis refResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentDiagnosis = (ResidentDiagnosis) session.load(
					ResidentDiagnosis.class, serial);
			refResidentDiagnosis.getName();
			session.delete(refResidentDiagnosis);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting ResidentDiagnosis Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public static void main(String args[]) throws MedrexException {
		ResidentDiagnosisDAO.getInstance().getResidentDiagnosissByConfirm(1);
	}

}
