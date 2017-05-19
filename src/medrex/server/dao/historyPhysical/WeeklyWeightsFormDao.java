package medrex.server.dao.historyPhysical;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsForm;
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class WeeklyWeightsFormDao {

	private WeeklyWeightsFormDao() {
	}

	private static WeeklyWeightsFormDao weeklyWeightsFormDao = null;

	public static synchronized WeeklyWeightsFormDao getInstance() {

		// if obj is null create it , else just return it
		if (weeklyWeightsFormDao == null) {
			weeklyWeightsFormDao = new WeeklyWeightsFormDao();

		} // end if

		return (weeklyWeightsFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateWeeklyWeightsForm(
			WeeklyWeightsForm wwf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from WeeklyWeightsForm");
			session.saveOrUpdate(wwf);
			tx.commit();
			return wwf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getWeeklyWeightsForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from WeeklyWeightsForm as ar where ar.residentId="
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

	public synchronized WeeklyWeightsForm getWeeklyWeightsForm(int serial)
			throws MedrexException {
		WeeklyWeightsForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (WeeklyWeightsForm) session.load(
					WeeklyWeightsForm.class, serial);
			admissionRecord.getResidentId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteWeeklyWeightsForm(int serial)
			throws MedrexException {
		WeeklyWeightsForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (WeeklyWeightsForm) session.load(
					WeeklyWeightsForm.class, serial);
			admissionRecord.getResidentId();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / nurseMedicationNotesFormRow

	public synchronized int insertOrUpdateWeeklyWeightsFormRow(
			WeeklyWeightsFormRow wwf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from WeeklyWeightsFormRow");
			session.saveOrUpdate(wwf);
			tx.commit();
			return wwf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized WeeklyWeightsFormRow getWeeklyWeightsFormRow(
			int formId, int formNum) throws MedrexException {
		WeeklyWeightsFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (WeeklyWeightsFormRow) session.createQuery(
					"from WeeklyWeightsFormRow as pg2 where pg2.formSerial = "
							+ formId + " AND pg2.rowSerial = " + formNum)
					.uniqueResult();
			admissionRecord.getRoom();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public int insertOrUpdateWeeklyWeightsFormRows(List ntnfr) {
		Iterator i = ntnfr.iterator();
		while (i.hasNext()) {
			WeeklyWeightsFormRow wrow = (WeeklyWeightsFormRow) i.next();
			try {
				insertOrUpdateWeeklyWeightsFormRow(wrow);
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	public synchronized List getWeeklyWeightsFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from WeeklyWeightsFormRow as pg2 where pg2.formSerial="
							+ formId + " order by pg2.rowSerial").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving WeeklyWeights Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteWeeklyWeightsFormRow(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from WeeklyWeightsFormRow as pg2 where pg2.formSerial = "
							+ formId).executeUpdate();

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
