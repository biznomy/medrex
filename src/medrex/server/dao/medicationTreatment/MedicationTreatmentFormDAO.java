package medrex.server.dao.medicationTreatment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.server.dao.SessionUtil;
import medrex.server.util.Utils;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class MedicationTreatmentFormDAO {

	private MedicationTreatmentFormDAO() {
	}

	private static MedicationTreatmentFormDAO medicationTreatmentFormDao = null;

	public static synchronized MedicationTreatmentFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (medicationTreatmentFormDao == null) {
			medicationTreatmentFormDao = new MedicationTreatmentFormDAO();

		} // end if

		return (medicationTreatmentFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMedicationTreatmentForm(
			MedicationTreatmentForm residentPayer) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationTreatmentForm");
			session.saveOrUpdate(residentPayer);
			tx.commit();
			return residentPayer.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Activitys Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMedicationTreatmentForms(long residentSerial)
			throws MedrexException {
		long resid = residentSerial;
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MedicationTreatmentForm as ar where ar.residentId="
							+ resid).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Medication Treatment Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized MedicationTreatmentForm getMedicationTreatmentFormCurrentWhere(
			int residentSerial, String type) throws MedrexException {
		MedicationTreatmentForm record = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Criteria crt = null;
		try {
			tx = session.beginTransaction();
			crt = session.createCriteria(MedicationTreatmentForm.class);
			crt = crt.add(Expression.eq("residentId", residentSerial));
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			String startStr = cal.get(Calendar.YEAR) + "-"
					+ (cal.get(Calendar.MONTH) + 1) + "-01";
			String endStr = cal.get(Calendar.YEAR) + "-"
					+ (cal.get(Calendar.MONTH) + 1) + "-"
					+ Utils.getMaxDaysInMonth(cal.getTime());
			Date startDate = formatter.parse(startStr);
			Date endDate = formatter.parse(endStr);
			crt.add(Expression.like("formType", type));
			crt.add(Restrictions.between("dateCreated", startDate, endDate));
			crt.addOrder(Order.desc("dateCreated"));

			List list = crt.list();
			tx.commit();
			if (list != null) {
				if (list.size() > 0) {
					record = (MedicationTreatmentForm) list.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving current Medication Treatment Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return record;
	}

	public synchronized MedicationTreatmentForm getMedicationTreatmentForm(
			int serial) throws MedrexException {
		MedicationTreatmentForm medicationTreatmentForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			medicationTreatmentForm = (MedicationTreatmentForm) session.load(
					MedicationTreatmentForm.class, serial);
			medicationTreatmentForm.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return medicationTreatmentForm;
	}

	public synchronized void deleteMedicationTreatmentForm(long serial)
			throws MedrexException {
		MedicationTreatmentForm medicationTreatmentForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			medicationTreatmentForm = (MedicationTreatmentForm) session.load(
					MedicationTreatmentForm.class, serial);
			medicationTreatmentForm.getNotes();
			session.delete(medicationTreatmentForm);
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
