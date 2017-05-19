package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class PtOtStOccupationalTherapyDAO {

	private PtOtStOccupationalTherapyDAO() {
	}

	private static PtOtStOccupationalTherapyDAO refPtOtStOccupationalTherapyDao = null;

	public static synchronized PtOtStOccupationalTherapyDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStOccupationalTherapyDao == null) {
			refPtOtStOccupationalTherapyDao = new PtOtStOccupationalTherapyDAO();

		} // end if

		return (refPtOtStOccupationalTherapyDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStOccupationalTherapy(
			PtOtStOccupationalTherapy refPtOtStOccupationalTherapy)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStOccupationalTherapy");
			session.saveOrUpdate(refPtOtStOccupationalTherapy);
			tx.commit();

			return refPtOtStOccupationalTherapy.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStOccupationalTherapy");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStOccupationalTherapys(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStOccupationalTherapy as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalTherapy List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStOccupationalTherapy getPtOtStOccupationalTherapy(
			int serial) throws MedrexException {
		PtOtStOccupationalTherapy refPtOtStOccupationalTherapy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStOccupationalTherapy = (PtOtStOccupationalTherapy) session
					.load(PtOtStOccupationalTherapy.class, serial);
			refPtOtStOccupationalTherapy.getBalanceSitDyn();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalTherapys");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStOccupationalTherapy;
	}

	public synchronized void deletePtOtStOccupationalTherapy(int serial)
			throws Exception {

		PtOtStOccupationalTherapy refPtOtStOccupationalTherapy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStOccupationalTherapy = (PtOtStOccupationalTherapy) session
					.load(PtOtStOccupationalTherapy.class, serial);
			refPtOtStOccupationalTherapy.getBalanceSitDyn();
			session.delete(refPtOtStOccupationalTherapy);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting PtOtStOccupationalTherapy Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PtOtStOccupationalTherapy getExistingOccupationalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException {
		PtOtStOccupationalTherapy refPtOtStOccupationalTherapy = null;
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
									.sqlRestriction("formType = 'Occupational Therapy'"))
					.list();

			if (listOfRecords != null && listOfRecords.size() > 0) {
				List<Integer> serialList = new ArrayList<Integer>();
				for (PtOtSt ref : listOfRecords) {
					serialList.add(ref.getFormId());
				}
				List<PtOtStOccupationalTherapy> listOfCerts = session
						.createCriteria(PtOtStOccupationalTherapy.class)
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
					for (PtOtStOccupationalTherapy refPt : listOfCerts) {
						System.out.println("found: [serial:"
								+ refPt.getSerial() + ", freq:"
								+ refPt.getFrequencyDuration() + "]");
					}
					refPtOtStOccupationalTherapy = listOfCerts.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving existing Occupational Therapy Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStOccupationalTherapy;
	}
}
