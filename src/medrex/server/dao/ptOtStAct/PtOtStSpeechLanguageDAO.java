package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.commons.vo.ptOtSt.PtOtStSpeechLanguage;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class PtOtStSpeechLanguageDAO {

	private PtOtStSpeechLanguageDAO() {
	}

	private static PtOtStSpeechLanguageDAO refPtOtStSpeechLanguageDao = null;

	public static synchronized PtOtStSpeechLanguageDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStSpeechLanguageDao == null) {
			refPtOtStSpeechLanguageDao = new PtOtStSpeechLanguageDAO();

		} // end if

		return (refPtOtStSpeechLanguageDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStSpeechLanguage(
			PtOtStSpeechLanguage refPtOtStSpeechLanguage)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStSpeechLanguage");
			session.saveOrUpdate(refPtOtStSpeechLanguage);
			tx.commit();

			return refPtOtStSpeechLanguage.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStSpeechLanguage");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStSpeechLanguages(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStSpeechLanguage as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStSpeechLanguage List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStSpeechLanguage getPtOtStSpeechLanguage(int serial)
			throws MedrexException {
		PtOtStSpeechLanguage refPtOtStSpeechLanguage = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStSpeechLanguage = (PtOtStSpeechLanguage) session.load(
					PtOtStSpeechLanguage.class, serial);
			refPtOtStSpeechLanguage.getCertificationFromDate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStSpeechLanguages");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStSpeechLanguage;
	}

	public synchronized void deletePtOtStSpeechLanguage(int serial)
			throws Exception {

		PtOtStSpeechLanguage refPtOtStSpeechLanguage = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStSpeechLanguage = (PtOtStSpeechLanguage) session
					.createCriteria(PtOtStSpeechLanguage.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			session.delete(refPtOtStSpeechLanguage);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting PtOtStSpeechLanguage Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PtOtStSpeechLanguage getExistingSpeechLanguageForm700(Date fromDate,
			Date toDate) throws MedrexException {
		PtOtStSpeechLanguage refPtOtStSpeechLanguage = null;
		Session session = SessionUtil.getInstance().getSession();
		// Date curDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strFromDate = formatter.format(fromDate);
		String strToDate = formatter.format(toDate);
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<PtOtSt> listOfRecords = session
					.createCriteria(PtOtSt.class)
					// .add(Restrictions.sqlRestriction("MONTH(dateCreated) = MONTH(STR_TO_DATE('"
					// + strDate + "','%d-%m-%Y'))"))
					// .add(Restrictions.sqlRestriction("YEAR(dateCreated) = YEAR(STR_TO_DATE('"
					// + strDate + "','%d-%m-%Y'))"))
					.add(
							Restrictions
									.sqlRestriction("formType = 'Speech Therapy'"))
					.list();

			if (listOfRecords != null && listOfRecords.size() > 0) {
				List<Integer> serialList = new ArrayList<Integer>();
				for (PtOtSt ref : listOfRecords) {
					serialList.add(ref.getFormId());
				}
				List<PtOtStSpeechLanguage> listOfCerts = session
						.createCriteria(PtOtStSpeechLanguage.class)
						.add(Restrictions.in("serial", serialList))
						.add(
								Restrictions.not(Expression.like(
										"frequencyDuration", "EVAL",
										MatchMode.ANYWHERE)))
						.add(
								Restrictions
										.or(
												Restrictions
														.sqlRestriction("STR_TO_DATE('"
																+ strFromDate
																+ "','%d-%m-%Y') BETWEEN DATE(certificationFromDate) AND DATE(certificationThroughDate)"),
												Restrictions
														.sqlRestriction("STR_TO_DATE('"
																+ strToDate
																+ "','%d-%m-%Y') BETWEEN DATE(certificationFromDate) AND DATE(certificationThroughDate)")))
						.list();
				if (listOfCerts != null && listOfCerts.size() > 0) {
					for (PtOtStSpeechLanguage refPt : listOfCerts) {
						System.out.println("found: [serial:"
								+ refPt.getSerial() + ", freq:"
								+ refPt.getFrequencyDuration() + "]");
					}
					refPtOtStSpeechLanguage = listOfCerts.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving existing Speech Language Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStSpeechLanguage;
	}
}
