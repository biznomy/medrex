package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalTheray;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class PtOtStPhysicalTherayDAO {

	private PtOtStPhysicalTherayDAO() {
	}

	private static PtOtStPhysicalTherayDAO refPtOtStPhysicalTherayDao = null;

	public static synchronized PtOtStPhysicalTherayDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStPhysicalTherayDao == null) {
			refPtOtStPhysicalTherayDao = new PtOtStPhysicalTherayDAO();

		} // end if

		return (refPtOtStPhysicalTherayDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStPhysicalTheray(
			PtOtStPhysicalTheray refPtOtStPhysicalTheray)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStPhysicalTheray");
			session.saveOrUpdate(refPtOtStPhysicalTheray);
			tx.commit();

			return refPtOtStPhysicalTheray.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStPhysicalTheray");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStPhysicalTherays(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStPhysicalTheray as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStPhysicalTheray List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStPhysicalTheray getPtOtStPhysicalTheray(int serial)
			throws MedrexException {
		PtOtStPhysicalTheray refPtOtStPhysicalTheray = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPhysicalTheray = (PtOtStPhysicalTheray) session.load(
					PtOtStPhysicalTheray.class, serial);
			refPtOtStPhysicalTheray.getCertificationFromDate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStPhysicalTherays");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStPhysicalTheray;
	}

	public synchronized void deletePtOtStPhysicalTheray(int serial)
			throws MedrexException {
		PtOtStPhysicalTheray refPtOtStPhysicalTheray = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPhysicalTheray = (PtOtStPhysicalTheray) session.load(
					PtOtStPhysicalTheray.class, serial);
			refPtOtStPhysicalTheray.getCertificationFromDate();
			session.delete(refPtOtStPhysicalTheray);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting PtOtStPhysicalTheray Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized PtOtStPhysicalTheray getExistingPhysicalTherapyForm700(
			Date fromDate, Date toDate) throws MedrexException {
		PtOtStPhysicalTheray refPtOtStPhysicalTheray = null;
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
									.sqlRestriction("formType = 'Physical Therapy'"))
					.list();

			if (listOfRecords != null && listOfRecords.size() > 0) {
				List<Integer> serialList = new ArrayList<Integer>();
				for (PtOtSt ref : listOfRecords) {
					serialList.add(ref.getFormId());
				}
				List<PtOtStPhysicalTheray> listOfCerts = session
						.createCriteria(PtOtStPhysicalTheray.class)
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
																+ "','%d-%m-%Y') BETWEEN DATE(certificationFromDate) AND DATE(certificationToDate)"),
												Restrictions
														.sqlRestriction("STR_TO_DATE('"
																+ strToDate
																+ "','%d-%m-%Y') BETWEEN DATE(certificationFromDate) AND DATE(certificationToDate)")))
						.list();
				if (listOfCerts != null && listOfCerts.size() > 0) {
					for (PtOtStPhysicalTheray refPt : listOfCerts) {
						System.out.println("found: [serial:"
								+ refPt.getSerial() + ", freq:"
								+ refPt.getFrequencyDuration() + "]");
					}
					refPtOtStPhysicalTheray = listOfCerts.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving existing Physical Therapy Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStPhysicalTheray;
	}
}
