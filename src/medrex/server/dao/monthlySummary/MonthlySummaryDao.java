package medrex.server.dao.monthlySummary;

import java.util.ArrayList;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryMainPage;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage1;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage2;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MonthlySummaryDao {
	private MonthlySummaryDao() {

	}

	private static MonthlySummaryDao monthlySummaryDAO = null;

	public static synchronized MonthlySummaryDao getInstance() {

		// if obj is null create it , else just return it
		if (monthlySummaryDAO == null) {
			monthlySummaryDAO = new MonthlySummaryDao();

		} // end if

		return (monthlySummaryDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMonthlySummaryPage1(
			MonthlySummaryPage1 refMonthlySummaryPage1) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println(refMonthlySummaryPage1.getResidentName());
			tx = session.beginTransaction();
			session.createQuery("from MonthlySummaryPage1");
			session.saveOrUpdate(refMonthlySummaryPage1);
			tx.commit();
			return refMonthlySummaryPage1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Monthly Summary Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MonthlySummaryPage1 getMonthlySummaryPage1(
			MonthlySummaryRecord msr) throws MedrexException {

		MonthlySummaryPage1 monthlySummaryPage1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlySummaryPage1 = (MonthlySummaryPage1) session.createCriteria(
					MonthlySummaryPage1.class).add(
					Restrictions.eq("formId", msr)).uniqueResult();
			monthlySummaryPage1.getComment1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Monthly Summary page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return monthlySummaryPage1;
	}

	public synchronized void deleteMonthlySummaryPage1(int serial)
			throws MedrexException {
		MonthlySummaryPage1 monthlyRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlyRec = (MonthlySummaryPage1) session.load(
					MonthlySummaryPage1.class, serial);
			monthlyRec.getComment10();
			session.delete(monthlyRec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Monthly Summary Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// for main page

	public synchronized int insertOrUpdateMonthlySummaryMainPage(
			MonthlySummaryMainPage refMonthlySummaryMainPage)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// refMonthlySummaryMainPage.getResidentName();
			tx = session.beginTransaction();
			session.createQuery("from MonthlySummaryMainPage");
			session.saveOrUpdate(refMonthlySummaryMainPage);
			tx.commit();
			return refMonthlySummaryMainPage.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Monthly Summary Form main page");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MonthlySummaryMainPage getMonthlySummaryMainPage(
			MonthlySummaryRecord msr) throws MedrexException {

		MonthlySummaryMainPage monthlySummaryMainPage = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlySummaryMainPage = (MonthlySummaryMainPage) session
					.createCriteria(MonthlySummaryMainPage.class).add(
							Restrictions.eq("formId", msr)).uniqueResult();
			monthlySummaryMainPage.getBehavior();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Monthly Summary Main Page");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return monthlySummaryMainPage;
	}

	public synchronized void deleteMonthlySummaryMainPage(int serial)
			throws MedrexException {
		MonthlySummaryMainPage monthlyRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlyRec = (MonthlySummaryMainPage) session.createCriteria(
					MonthlySummaryMainPage.class).add(
					Restrictions.eq("formId", serial)).uniqueResult();
			monthlyRec.getMeal();
			session.delete(monthlyRec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Monthly Summary Main Page");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// for 2nd page

	public synchronized int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryPage2 refMonthlySummaryPage2) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MonthlySummaryPage2");
			session.saveOrUpdate(refMonthlySummaryPage2);
			tx.commit();
			return refMonthlySummaryPage2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Monthly Summary Form Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MonthlySummaryPage2 getMonthlySummaryPage2(
			MonthlySummaryRecord msr) throws MedrexException {

		MonthlySummaryPage2 monthlySummaryPage2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlySummaryPage2 = (MonthlySummaryPage2) session.createCriteria(
					MonthlySummaryPage2.class).add(
					Restrictions.eq("formId", msr)).uniqueResult();
			monthlySummaryPage2.getComment15A();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Monthly Summary page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return monthlySummaryPage2;
	}

	public synchronized void deleteMonthlySummaryPage2(int formId)
			throws MedrexException {
		MonthlySummaryPage2 monthlyRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlyRec = (MonthlySummaryPage2) session.createCriteria(
					MonthlySummaryPage2.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			monthlyRec.getComment14();
			session.delete(monthlyRec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Monthly Summary Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// for master table
	public synchronized int insertOrUpdateMonthlySummaryRecord(
			MonthlySummaryRecord monthlySum) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MonthlySummaryRecord");
			session.saveOrUpdate(monthlySum);
			tx.commit();
			return monthlySum.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Monthly Summary Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MonthlySummaryRecord getMonthlySummaryRecord(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		MonthlySummaryRecord monthlySummaryRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlySummaryRec = (MonthlySummaryRecord) session.load(
					MonthlySummaryRecord.class, currentMonthlySummaryRecordKey);
			monthlySummaryRec.getFormId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Monthly Summary Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return monthlySummaryRec;
	}

	public synchronized ArrayList<MonthlySummaryRecord> getMonthlySummaryRecords(
			int currentResidenceKey) throws MedrexException {
		ArrayList<MonthlySummaryRecord> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = (ArrayList<MonthlySummaryRecord>) session.createQuery(
					"from MonthlySummaryRecord as mr where mr.residentId="
							+ currentResidenceKey).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Monthly Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteMonthlySummaryRecord(int serial)
			throws MedrexException {
		MonthlySummaryRecord monthlyRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			monthlyRec = (MonthlySummaryRecord) session.load(
					MonthlySummaryRecord.class, serial);
			monthlyRec.getNotes();
			session.delete(monthlyRec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Monthly Summary");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
