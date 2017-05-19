package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.AdmissionAndDischargeSummary;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AdmissionAndDischargeDAO {
	private AdmissionAndDischargeDAO() {

	}

	private static AdmissionAndDischargeDAO admissionDischargeSummaryDAO = null;

	public static synchronized AdmissionAndDischargeDAO getInstance() {

		// if obj is null create it , else just return it
		if (admissionDischargeSummaryDAO == null) {
			admissionDischargeSummaryDAO = new AdmissionAndDischargeDAO();

		} // end if

		return (admissionDischargeSummaryDAO);

	} // end - getUniqueInstance - method

	public int insertOrUpdateAdmissionDischargeSummary(
			AdmissionAndDischargeSummary admissionAndDischargeSummary)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println(refMonthlySummaryPage1.getResidentName());
			tx = session.beginTransaction();
			session.createQuery("from AdmissionAndDischargeSummary");
			System.out.println("resident name:"
					+ admissionAndDischargeSummary.getResidentName());
			session.saveOrUpdate(admissionAndDischargeSummary);
			tx.commit();
			return admissionAndDischargeSummary.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Admission and Summary Discharge");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized AdmissionAndDischargeSummary getAdmissionAndDischarge(
			MonthlySummaryRecord msr) throws MedrexException {
		AdmissionAndDischargeSummary admissionAndDischargeSummary = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionAndDischargeSummary = (AdmissionAndDischargeSummary) session
					.createCriteria(AdmissionAndDischargeSummary.class).add(
							Restrictions.eq("formId", msr)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving admission and Discharge summary Report");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionAndDischargeSummary;
	}
}
