package medrex.server.dao.consultant;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.ReportOfConsultationForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReportOfConsultationFormDAO {

	private ReportOfConsultationFormDAO() {
	}

	private static ReportOfConsultationFormDAO reportOfConsultationFormDao = null;

	public static synchronized ReportOfConsultationFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (reportOfConsultationFormDao == null) {
			reportOfConsultationFormDao = new ReportOfConsultationFormDAO();

		} // end if

		return (reportOfConsultationFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateReportOfConsultationForm(
			ReportOfConsultationForm rocf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ReportOfConsultationForm");
			session.saveOrUpdate(rocf);
			tx.commit();
			return rocf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getReportOfConsultationForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ReportOfConsultationForm as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ReportOfConsultationForm getReportOfConsultationForm(
			int serial) throws MedrexException {
		ReportOfConsultationForm reportOfConsultationForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			reportOfConsultationForm = (ReportOfConsultationForm) session.load(
					ReportOfConsultationForm.class, serial);
			reportOfConsultationForm.getDiagnosis();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return reportOfConsultationForm;
	}

	public synchronized void deleteReportOfConsultationForm(int serial)
			throws MedrexException {
		ReportOfConsultationForm reportOfConsultationForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			reportOfConsultationForm = (ReportOfConsultationForm) session.load(
					ReportOfConsultationForm.class, serial);
			reportOfConsultationForm.getDiagnosis();
			session.delete(reportOfConsultationForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
