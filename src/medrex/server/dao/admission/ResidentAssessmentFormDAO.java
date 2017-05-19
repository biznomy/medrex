package medrex.server.dao.admission;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.PainAssessment;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.admission.ResidentAssessmentFormPage10;
import medrex.commons.vo.admission.ResidentAssessmentFormPage11;
import medrex.commons.vo.admission.ResidentAssessmentFormPage12;
import medrex.commons.vo.admission.ResidentAssessmentFormPage13;
import medrex.commons.vo.admission.ResidentAssessmentFormPage14;
import medrex.commons.vo.admission.ResidentAssessmentFormPage15;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.admission.ResidentAssessmentFormPage17;
import medrex.commons.vo.admission.ResidentAssessmentFormPage18;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;
import medrex.commons.vo.admission.ResidentAssessmentFormPage2;
import medrex.commons.vo.admission.ResidentAssessmentFormPage20;
import medrex.commons.vo.admission.ResidentAssessmentFormPage21;
import medrex.commons.vo.admission.ResidentAssessmentFormPage22;
import medrex.commons.vo.admission.ResidentAssessmentFormPage3;
import medrex.commons.vo.admission.ResidentAssessmentFormPage4;
import medrex.commons.vo.admission.ResidentAssessmentFormPage5;
import medrex.commons.vo.admission.ResidentAssessmentFormPage6;
import medrex.commons.vo.admission.ResidentAssessmentFormPage7;
import medrex.commons.vo.admission.ResidentAssessmentFormPage8;
import medrex.commons.vo.admission.ResidentAssessmentFormPage9;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage7;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage8;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage9;
import medrex.commons.vo.medication.PressureSoreAssessment;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ResidentAssessmentFormDAO {

	private ResidentAssessmentFormDAO() {
	}

	private static ResidentAssessmentFormDAO residentAssessmentFormDao = null;

	public static synchronized ResidentAssessmentFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentAssessmentFormDao == null) {
			residentAssessmentFormDao = new ResidentAssessmentFormDAO();

		} // end if

		return (residentAssessmentFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentAssessmentFormPage1(
			ResidentAssessmentFormPage1 rafp1) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage1");
			session.saveOrUpdate(rafp1);
			tx.commit();
			return rafp1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentAssessmentFormPage1s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentAssessmentFormPage1 as ar where ar.residentId="
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

	public synchronized ResidentAssessmentFormPage1 getResidentAllergies(
			int residentid) throws MedrexException {
		ResidentAssessmentFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					ResidentAssessmentFormPage1.class).add(
					Restrictions.eq("residentId", residentid)).addOrder(
					Order.asc("timeAddmitted"));
			admissionRecord = (ResidentAssessmentFormPage1) crit.setMaxResults(
					1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident allergies");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized ResidentAssessmentFormPage1 getResidentAssessmentFormPage1(
			int serial) throws MedrexException {
		ResidentAssessmentFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage1) session.load(
					ResidentAssessmentFormPage1.class, serial);
			admissionRecord.getAllergies();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage1(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage1) session
					.createCriteria(ResidentAssessmentFormPage1.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
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

	// / page 2

	public synchronized int insertOrUpdateResidentAssessmentFormPage2(
			ResidentAssessmentFormPage2 rafp2) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage2");
			session.saveOrUpdate(rafp2);
			tx.commit();
			return rafp2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage2 getResidentAssessmentFormPage2(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage2) session
					.createQuery(
							"from ResidentAssessmentFormPage2 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getNurse();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage2(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage2) session
					.createCriteria(ResidentAssessmentFormPage2.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getNurse();
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

	// / 3
	// / page 3

	public synchronized int insertOrUpdateResidentAssessmentFormPage3(
			ResidentAssessmentFormPage3 rafp3) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage3");
			session.saveOrUpdate(rafp3);
			tx.commit();
			return rafp3.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage3 getResidentAssessmentFormPage3(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage3 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage3) session
					.createQuery(
							"from ResidentAssessmentFormPage3 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getSkinAppearance();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage3(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage3 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage3) session
					.createCriteria(ResidentAssessmentFormPage3.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getSkinAppearance();
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

	// / pressureSoreAssessment

	public synchronized int insertOrUpdatePressureSoreAssessment(
			PressureSoreAssessment psa) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PressureSoreAssessment");
			session.saveOrUpdate(psa);
			tx.commit();
			return psa.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PressureSoreAssessment getPressureSoreAssessment(
			int formId, int formNum) throws MedrexException {
		PressureSoreAssessment admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PressureSoreAssessment) session.createQuery(
					"from PressureSoreAssessment as pg2 where pg2.formId = "
							+ formId + " AND pg2.formNum = " + formNum)
					.uniqueResult();
			admissionRecord.getFormId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// / 4
	// / page 4

	public synchronized int insertOrUpdateResidentAssessmentFormPage4(
			ResidentAssessmentFormPage4 rafp4) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage4");
			session.saveOrUpdate(rafp4);
			tx.commit();
			return rafp4.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page4");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage4 getResidentAssessmentFormPage4(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage4 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage4) session
					.createQuery(
							"from ResidentAssessmentFormPage4 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getCentral();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage4(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage4 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage4) session
					.createCriteria(ResidentAssessmentFormPage4.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getCentral();
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

	// / 5
	// / page 5

	public synchronized int insertOrUpdateResidentAssessmentFormPage5(
			ResidentAssessmentFormPage5 rafp5) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage5");
			session.saveOrUpdate(rafp5);
			tx.commit();
			return rafp5.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page5");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage5 getResidentAssessmentFormPage5(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage5 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage5) session
					.createQuery(
							"from ResidentAssessmentFormPage5 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getScoreAmbulation();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage5(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage5 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage5) session
					.createCriteria(ResidentAssessmentFormPage5.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getScoreAmbulation();
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

	// / 6
	// / page 6

	public synchronized int insertOrUpdateResidentAssessmentFormPage6(
			ResidentAssessmentFormPage6 rafp6) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage6");
			session.saveOrUpdate(rafp6);
			tx.commit();
			return rafp6.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page6");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage6 getResidentAssessmentFormPage6(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage6 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage6) session
					.createQuery(
							"from ResidentAssessmentFormPage6 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getMentalQ11();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage6(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage6 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage6) session
					.createCriteria(ResidentAssessmentFormPage6.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getMentalQ10();
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

	// / 7
	// / page 7

	public synchronized int insertOrUpdateResidentAssessmentFormPage7(
			ResidentAssessmentFormPage7 rafp7) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage7");
			session.saveOrUpdate(rafp7);
			tx.commit();
			return rafp7.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page7");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage7 getResidentAssessmentFormPage7(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage7 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage7) session
					.createQuery(
							"from ResidentAssessmentFormPage7 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getPainLevel();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage7(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage7 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage7) session
					.createCriteria(ResidentAssessmentFormPage7.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getPainLevelBest();
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

	// PainAssessment
	public synchronized int insertOrUpdatePainAssessment(
			PainAssessment painAssessment) throws MedrexException {
		int seiral = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			session.saveOrUpdate(painAssessment);
			tr.commit();
			seiral = painAssessment.getSerial();
		} catch (Exception ex) {
			ex.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tr, "");
			throw new MedrexException(
					"Error inserting Resident pain assessment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return seiral;
	}

	public synchronized PainAssessment getPainAssessment(int formId, int formNum)
			throws MedrexException {
		PainAssessment painAssessment = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			painAssessment = (PainAssessment) session.createCriteria(
					PainAssessment.class)
					.add(Restrictions.eq("formId", formId)).add(
							Restrictions.eq("formNum", formNum)).uniqueResult();
			painAssessment.getDuration();
		} catch (Exception ex) {
			ex.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tr, "");
			throw new MedrexException(
					"Error getting pain assessment (Resident Assessment Form Page 7)");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return painAssessment;
	}

	public synchronized void deletePainAssessment(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			session.createSQLQuery(
					"DELETE FROM painassessment WHERE formId = " + formId)
					.executeUpdate();
			tr.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tr, "");
			throw new MedrexException(
					"Error deleting pain assessment (Resident Assessment Form Page 7)");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// / 8
	// / page 8

	public synchronized int insertOrUpdateResidentAssessmentFormPage8(
			ResidentAssessmentFormPage8 rafp8) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage8");
			session.saveOrUpdate(rafp8);
			tx.commit();
			return rafp8.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page8");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage8 getResidentAssessmentFormPage8(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage8 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage8) session
					.createQuery(
							"from ResidentAssessmentFormPage8 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getExOther();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage8(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage8 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage8) session
					.createCriteria(ResidentAssessmentFormPage8.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getExOther();
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

	// / 9
	// / page 9

	public synchronized int insertOrUpdateResidentAssessmentFormPage9(
			ResidentAssessmentFormPage9 rafp9) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage9");
			session.saveOrUpdate(rafp9);
			tx.commit();
			return rafp9.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage9 getResidentAssessmentFormPage9(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage9 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage9) session
					.createQuery(
							"from ResidentAssessmentFormPage9 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getAnswerQ1Text();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage9(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage9 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage9) session
					.createCriteria(ResidentAssessmentFormPage9.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getAnswerQ1Text();
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

	// / 10
	// / page 10

	public synchronized int insertOrUpdateResidentAssessmentFormPage10(
			ResidentAssessmentFormPage10 rafp10) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage10");
			session.saveOrUpdate(rafp10);
			tx.commit();
			return rafp10.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page10");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage10 getResidentAssessmentFormPage10(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage10 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage10) session
					.createQuery(
							"from ResidentAssessmentFormPage10 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getAnswerMobility();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage10(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage10 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage10) session
					.createCriteria(ResidentAssessmentFormPage10.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getAnswerMobility();
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

	// / 11
	// / page 11

	public synchronized int insertOrUpdateResidentAssessmentFormPage11(
			ResidentAssessmentFormPage11 rafp11) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage11");
			session.saveOrUpdate(rafp11);
			tx.commit();
			return rafp11.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page11");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage11 getResidentAssessmentFormPage11(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage11 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage11) session
					.createQuery(
							"from ResidentAssessmentFormPage11 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getNurse1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage11(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage11 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage11) session
					.createCriteria(ResidentAssessmentFormPage11.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getNurse1();
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

	// / 12
	// / page 12

	public synchronized int insertOrUpdateResidentAssessmentFormPage12(
			ResidentAssessmentFormPage12 rafp12) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage12");
			session.saveOrUpdate(rafp12);
			tx.commit();
			return rafp12.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page12");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage12 getResidentAssessmentFormPage12(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage12 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage12) session
					.createQuery(
							"from ResidentAssessmentFormPage12 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getQ2Text();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage12(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage12 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage12) session
					.createCriteria(ResidentAssessmentFormPage12.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			// admissionRecord.getQ2Text();
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

	// / 13
	// / page 13

	public synchronized int insertOrUpdateResidentAssessmentFormPage13(
			ResidentAssessmentFormPage13 rafp13) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage13");
			session.saveOrUpdate(rafp13);
			tx.commit();
			return rafp13.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page13");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<ResidentAssessmentFormPage13> getResidentAssessmentFormPage13(
			int residentId, int currentPg13Key) throws MedrexException {
		List<ResidentAssessmentFormPage13> admissionRecordList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// admissionRecord = (ResidentAssessmentFormPage13) session
			// .createQuery(
			// "from ResidentAssessmentFormPage13 as pg2 where pg2.formId = "
			// + formId).uniqueResult();
			Criteria crit = session.createCriteria(
					ResidentAssessmentFormPage13.class).add(
					Restrictions.eq("residentId", residentId));

			admissionRecordList = crit.addOrder(Order.desc("serial")).add(
					Restrictions.le("serial", currentPg13Key)).setMaxResults(4)
					.list();
			System.out.println("size of list is:" + admissionRecordList.size());

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident assessment form page 13");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecordList;
	}

	public synchronized void deleteResidentAssessmentFormPage13(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage13 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage13) session
					.createCriteria(ResidentAssessmentFormPage13.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getAnswer1Q1();
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

	// / page 14

	public synchronized int insertOrUpdateResidentAssessmentFormPage14(
			ResidentAssessmentFormPage14 rafp14) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage14");
			session.saveOrUpdate(rafp14);
			tx.commit();
			return rafp14.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page14");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage14 getResidentAssessmentFormPage14(
			int serial) throws MedrexException {
		ResidentAssessmentFormPage14 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage14) session
					.createQuery(
							"from ResidentAssessmentFormPage14 as pg2 where pg2.serial = "
									+ serial).uniqueResult();
			admissionRecord.getAmountOfExudateWeek1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage14");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage14(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage14 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage14) session
					.createCriteria(ResidentAssessmentFormPage14.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getAmountOfExudateWeek1();
			}
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page14");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / page 15

	public synchronized int insertOrUpdateResidentAssessmentFormPage15(
			ResidentAssessmentFormPage15 rafp15) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage15");
			session.saveOrUpdate(rafp15);
			tx.commit();
			return rafp15.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page15");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage15 getResidentAssessmentFormPage15(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage15 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage15) session
					.createQuery(
							"from ResidentAssessmentFormPage15 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getHospitalAcquired();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage15");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage15(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage15 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage15) session
					.createCriteria(ResidentAssessmentFormPage15.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getFacilityAcquired();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page15");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / page 16

	public synchronized int insertOrUpdateResidentAssessmentFormPage16(
			ResidentAssessmentFormPage16 rafp16) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage16");
			session.saveOrUpdate(rafp16);
			tx.commit();
			return rafp16.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page16");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage16 getResidentAssessmentFormPage16(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage16 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage16) session
					.createQuery(
							"from ResidentAssessmentFormPage16 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getBlind();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage16");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized ResidentAssessmentFormPage16 getResidentAssessmentFormPage16ByResidentId(
			int currentResidentId) throws MedrexException {
		ResidentAssessmentFormPage16 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage16) session
					.createCriteria(ResidentAssessmentFormPage16.class).add(
							Restrictions.eq("residentId", currentResidentId))
					.addOrder(Order.desc("serial")).setMaxResults(1)
					.uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getBlind();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage16");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage16(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage16 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage16) session
					.createCriteria(ResidentAssessmentFormPage16.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getBlind();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page16");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / page 17

	public synchronized int insertOrUpdateResidentAssessmentFormPage17(
			ResidentAssessmentFormPage17 rafp17) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage17");
			session.saveOrUpdate(rafp17);
			tx.commit();
			return rafp17.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page17");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage17 getResidentAssessmentFormPage17(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage17 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage17) session
					.createQuery(
							"from ResidentAssessmentFormPage17 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getResidentName();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage17");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage17(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage17 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage17) session
					.createCriteria(ResidentAssessmentFormPage17.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getResidentName();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page17");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / page 18

	public synchronized int insertOrUpdateResidentAssessmentFormPage18(
			ResidentAssessmentFormPage18 rafp18) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage18");
			session.saveOrUpdate(rafp18);
			tx.commit();
			return rafp18.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page18");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentAssessmentFormPage18 getResidentAssessmentFormPage18(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage18 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage18) session
					.createQuery(
							"from ResidentAssessmentFormPage18 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getName();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage18");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// Page 20

	public synchronized ResidentAssessmentFormPage20 getResidentAssessmentFormPage20(
			int formId) throws MedrexException {
		ResidentAssessmentFormPage20 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (ResidentAssessmentFormPage20) session
					.createQuery(
							"from ResidentAssessmentFormPage20 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (assessmentRecord != null) {
				assessmentRecord.getComments();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage20");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessmentRecord;
	}

	public synchronized void deleteResidentAssessmentFormPage20(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage20 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (ResidentAssessmentFormPage20) session
					.createCriteria(ResidentAssessmentFormPage20.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			assessmentRecord.getComments();
			session.delete(assessmentRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page20");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized void deleteResidentAssessmentFormPage18(int serial)
			throws MedrexException {
		ResidentAssessmentFormPage18 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ResidentAssessmentFormPage18) session
					.createCriteria(ResidentAssessmentFormPage18.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			admissionRecord.getName();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page18");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// deletion of form page 19
	public synchronized void deleteResidentAssessmentFormPage19(int serial)
			throws MedrexException {
		System.out.println("" + serial);
		ResidentAssessmentFormPage19 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (ResidentAssessmentFormPage19) session
					.createCriteria(ResidentAssessmentFormPage19.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			assessmentRecord.getSerial();
			session.delete(assessmentRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page19");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// deletion of form page 19Col
	public synchronized void deleteResidentAssessmentFormPage19Col(int serial)
			throws MedrexException {
		/*
		 * System.out.println(""+serial); ResidentAssessmentFormPage19Col
		 * assessmentRecord = null; Session session =
		 * SessionUtil.getInstance().getSession(); Transaction tx = null; try {
		 * tx = session.beginTransaction(); assessmentRecord =
		 * (ResidentAssessmentFormPage19Col) session
		 * .createCriteria(ResidentAssessmentFormPage19Col.class).add(
		 * Restrictions.eq("formSerial", serial)).list();
		 * assessmentRecord.getColSerial(); session.delete(assessmentRecord);
		 * tx.commit(); } catch (Exception e) { e.printStackTrace();
		 * SessionUtil.getInstance().rollbackTx(tx, ""); throw new
		 * MedrexException( "Error deleting ResidentAssessmentForm Page19Col");
		 * } finally { SessionUtil.getInstance().closeSession(session); }
		 */
		System.out.println("" + serial);
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			/* assessmentRecord = */session.createSQLQuery(
					"delete from ResidentAssessmentFormPage19Col where formSerial ="
							+ serial).executeUpdate();
			// assessmentRecord = (List<ResidentAssessmentFormPage19Col>)session
			// .createCriteria(ResidentAssessmentFormPage19Col.class).add(
			// Restrictions.eq("formSerial", serial)).list();
			// assessmentRecord.get(1).getColSerial();
			// Iterator i = assessmentRecord.iterator();
			// while(i.hasNext()){
			// ResidentAssessmentFormPage19Col
			// col=(ResidentAssessmentFormPage19Col)i.next();
			// session.delete(col);
			// }
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAssessmentForm Page19Col");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// Resident Quarterly Assessment Form Page7

	public synchronized int insertOrUpdateResidentQuarterlyAssessmentFormPage7(
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentQuarterlyAssessmentFormPage7");
			session.saveOrUpdate(residentQuarterlyAssessmentFormPage7);
			tx.commit();
			return residentQuarterlyAssessmentFormPage7.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Quarterly Assessment Form Page7");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentQuarterlyAssessmentFormPage7 getResidentQuarterlyAssessmentFormPage7(
			int formId) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage7 = (ResidentQuarterlyAssessmentFormPage7) session
					.createQuery(
							"from ResidentQuarterlyAssessmentFormPage7 as pg7 where pg7.formId = "
									+ formId).uniqueResult();
			if (residentQuarterlyAssessmentFormPage7 != null) {
				residentQuarterlyAssessmentFormPage7.getFormId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident Quarterly Assessment Form Page7");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentQuarterlyAssessmentFormPage7;
	}

	public synchronized void deleteResidentQuarterlyAssessmentFormPage7(
			int serial) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage7 = (ResidentQuarterlyAssessmentFormPage7) session
					.createCriteria(ResidentQuarterlyAssessmentFormPage7.class)
					.add(Restrictions.eq("formId", serial)).uniqueResult();
			residentQuarterlyAssessmentFormPage7.getFormId();
			session.delete(residentQuarterlyAssessmentFormPage7);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Resident Quarterly Assessment Form Page7");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// Resident Quarterly Assessment Form Page8

	public synchronized int insertOrUpdateResidentQuarterlyAssessmentFormPage8(
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentQuarterlyAssessmentFormPage8");
			session.saveOrUpdate(residentQuarterlyAssessmentFormPage8);
			tx.commit();
			return residentQuarterlyAssessmentFormPage8.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Quarterly Assessment Form Page8");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentQuarterlyAssessmentFormPage8 getResidentQuarterlyAssessmentFormPage8(
			int formId) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage8 = (ResidentQuarterlyAssessmentFormPage8) session
					.createQuery(
							"from ResidentQuarterlyAssessmentFormPage8 as pg8 where pg8.formId = "
									+ formId).uniqueResult();
			if (residentQuarterlyAssessmentFormPage8 != null) {
				residentQuarterlyAssessmentFormPage8.getFormId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident Quarterly Assessment Form Page8");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentQuarterlyAssessmentFormPage8;
	}

	public synchronized void deleteResidentQuarterlyAssessmentFormPage8(
			int serial) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage8 = (ResidentQuarterlyAssessmentFormPage8) session
					.createCriteria(ResidentQuarterlyAssessmentFormPage8.class)
					.add(Restrictions.eq("formId", serial)).uniqueResult();
			residentQuarterlyAssessmentFormPage8.getFormId();
			session.delete(residentQuarterlyAssessmentFormPage8);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Resident Quarterly Assessment Form Page8");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// Resident Quarterly Assessment Form Page9

	public synchronized int insertOrUpdateResidentQuarterlyAssessmentFormPage9(
			ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentQuarterlyAssessmentFormPage9");
			session.saveOrUpdate(residentQuarterlyAssessmentFormPage9);
			tx.commit();
			return residentQuarterlyAssessmentFormPage9.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Quarterly Assessment Form Page9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentQuarterlyAssessmentFormPage9 getResidentQuarterlyAssessmentFormPage9(
			int formId) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage9 = (ResidentQuarterlyAssessmentFormPage9) session
					.createQuery(
							"from ResidentQuarterlyAssessmentFormPage9 as pg9 where pg9.formId = "
									+ formId).uniqueResult();
			if (residentQuarterlyAssessmentFormPage9 != null) {
				residentQuarterlyAssessmentFormPage9.getFormId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident Quarterly Assessment Form Page9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentQuarterlyAssessmentFormPage9;
	}

	public synchronized void deleteResidentQuarterlyAssessmentFormPage9(
			int serial) throws MedrexException {
		ResidentQuarterlyAssessmentFormPage9 residentQuarterlyAssessmentFormPage9 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentQuarterlyAssessmentFormPage9 = (ResidentQuarterlyAssessmentFormPage9) session
					.createCriteria(ResidentQuarterlyAssessmentFormPage9.class)
					.add(Restrictions.eq("formId", serial)).uniqueResult();
			residentQuarterlyAssessmentFormPage9.getFormId();
			session.delete(residentQuarterlyAssessmentFormPage9);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Resident Quarterly Assessment Form Page9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public int insertOrUpdateResidentAssessmentFormPage20(
			ResidentAssessmentFormPage20 refResidentAssessmentForm20)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage20");
			session.saveOrUpdate(refResidentAssessmentForm20);
			tx.commit();
			return refResidentAssessmentForm20.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page20");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public int insertOrUpdateResidentAssessmentFormPage19(
			ResidentAssessmentFormPage19 refResidentAssessmentForm19)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage19");
			session.saveOrUpdate(refResidentAssessmentForm19);
			tx.commit();
			return refResidentAssessmentForm19.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page19");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdateResidentAssessmentFormPage19(
			List<ResidentAssessmentFormPage19Col> columns)
			throws MedrexException {
		// Iterator i = idpnfr.iterator();
		// while (i.hasNext()) {
		// DoctorsProgressNotesFormRow dRow = (DoctorsProgressNotesFormRow) i
		// .next();
		// insertOrUpdateDoctorsProgressNotesFormRow(dRow);
		// }
		Iterator i = columns.iterator();
		while (i.hasNext()) {
			ResidentAssessmentFormPage19Col col = (ResidentAssessmentFormPage19Col) i
					.next();
			insertOrUpdateResidentAssessmentFormPage19Col(col);
		}

		return 0;
	}

	public synchronized int insertOrUpdateResidentAssessmentFormPage19Col(
			ResidentAssessmentFormPage19Col col) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage19Col");
			session.saveOrUpdate(col);
			tx.commit();
			return col.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page19col");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public ResidentAssessmentFormPage19 getResidentAssessmentFormPage19(
			int formId) throws MedrexException {
		// ResidentAssessmentFormPage19 assessmentRecord = null;
		// Session session = SessionUtil.getInstance().getSession();
		// Transaction tx = null;
		// try {
		// tx = session.beginTransaction();
		// assessmentRecord = (ResidentAssessmentFormPage19) session.load(
		// ResidentAssessmentFormPage19.class, serial);
		// assessmentRecord.getSerial();
		// tx.commit();
		// } catch (Exception e) {
		// e.printStackTrace();
		// throw new
		// MedrexException("Error retrieving Resident Assessment page 19 VO");
		// } finally {
		// SessionUtil.getInstance().closeSession(session);
		// }
		// return assessmentRecord;

		// System.out.println(formId);
		ResidentAssessmentFormPage19 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (ResidentAssessmentFormPage19) session
					.createQuery(
							"from ResidentAssessmentFormPage19 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (assessmentRecord != null) {
				assessmentRecord.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ResidentAssessmentFormPage19");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessmentRecord;
	}

	public List<ResidentAssessmentFormPage19Col> getResidentAssessmentFormPage19Columns(
			int FormSerial) throws MedrexException {
		System.out.println(FormSerial);
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentAssessmentFormPage19Col as ar where ar.formSerial="
							+ FormSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Column List For Resident Page19");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public int insertOrUpdateResidentAssessmentFormPage21(
			ResidentAssessmentFormPage21 refResidentAssessmentFormPage21)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage21");
			session.saveOrUpdate(refResidentAssessmentFormPage21);
			tx.commit();
			return refResidentAssessmentFormPage21.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page21");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public ResidentAssessmentFormPage21 getResidentAssessmentFormPage21(
			int currentResidentAssessmentFormPage21Key) throws MedrexException {
		ResidentAssessmentFormPage21 residentAssessmentFormPage21 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentAssessmentFormPage21 = (ResidentAssessmentFormPage21) session
					.createQuery(
							"from ResidentAssessmentFormPage21 as pg21 where pg21.formId = "
									+ currentResidentAssessmentFormPage21Key)
					.uniqueResult();
			if (residentAssessmentFormPage21 != null) {
				residentAssessmentFormPage21.getFormId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident Quarterly Assessment Form Page21");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentAssessmentFormPage21;
	}

	public void deleteResidentAssessmentFormPage21(int formId)
			throws MedrexException {
		ResidentAssessmentFormPage21 residentAssessmentFormPage21 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentAssessmentFormPage21 = (ResidentAssessmentFormPage21) session
					.createCriteria(ResidentAssessmentFormPage21.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			residentAssessmentFormPage21.getFormId();
			session.delete(residentAssessmentFormPage21);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Resident Quarterly Assessment Form Page21");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public int insertOrUpdateResidentAssessmentFormPage22(
			ResidentAssessmentFormPage22 refResidentAssessmentFormPage22)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentAssessmentFormPage22");
			session.saveOrUpdate(refResidentAssessmentFormPage22);
			tx.commit();
			return refResidentAssessmentFormPage22.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page22");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public ResidentAssessmentFormPage22 getResidentAssessmentFormPage22(
			int currentResidentAssessmentFormKey) throws MedrexException {
		ResidentAssessmentFormPage22 residentAssessmentFormPage22 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentAssessmentFormPage22 = (ResidentAssessmentFormPage22) session
					.createQuery(
							"from ResidentAssessmentFormPage22 as pg22 where pg22.formId = "
									+ currentResidentAssessmentFormKey)
					.uniqueResult();
			if (residentAssessmentFormPage22 != null) {
				residentAssessmentFormPage22.getFormId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident Quarterly Assessment Form Page22");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentAssessmentFormPage22;
	}

	public void deleteResidentAssessmentFormPage22(int formId)
			throws MedrexException {
		ResidentAssessmentFormPage22 residentAssessmentFormPage22 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentAssessmentFormPage22 = (ResidentAssessmentFormPage22) session
					.createCriteria(ResidentAssessmentFormPage22.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			residentAssessmentFormPage22.getFormId();
			session.delete(residentAssessmentFormPage22);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Resident Quarterly Assessment Form Page22");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// form page 1 latest

	public ResidentAssessmentFormPage1 getLatestResidentAssessmentFormPage1(
			int residentId) throws MedrexException {
		ResidentAssessmentFormPage1 residentAssessmentFormPage1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			System.out.println("ResidentId" + residentId);
			tx = session.beginTransaction();
			// session.createCriteria(ResidentAssessmentFormPage1.class).add(Restrictions.eq("residentId",
			// residentId)).addOrder(Order.desc("nurseVisit")).
			Query q = session
					.createQuery("from ResidentAssessmentFormPage1 AS resAsspag1 WHERE resAsspag1.residentId="
							+ residentId
							+ "ORDER BY (resAsspag1.nurseVisit) DESC");
			q.setMaxResults(1);
			residentAssessmentFormPage1 = (ResidentAssessmentFormPage1) q
					.uniqueResult();
			if (residentAssessmentFormPage1 != null) {
				residentAssessmentFormPage1.getAdmissionDate();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving latest Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentAssessmentFormPage1;
	}

	public void deletePressureSoreAssessment(int formId)
			throws MedrexException, RemoteException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from PressureSoreAssessment where formId ="
							+ formId).executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Pressure Sore Assessment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfResident(
			int currentResidenceKey) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<ResidentAssessmentFormPage14> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(ResidentAssessmentFormPage14.class)
					.add(Restrictions.eq("residentId", currentResidenceKey))
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Retrieving The Resident Asssessment form Page 14 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;

	}

	public List<ResidentAssessmentFormPage14> getResidentAssessmentFormPage14OfLast3Weeks(
			int residentId, int currentPg14Key) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<ResidentAssessmentFormPage14> result = null;
		try {
			tx = session.beginTransaction();

			Criteria crit = session.createCriteria(
					ResidentAssessmentFormPage14.class).add(
					Restrictions.eq("residentId", residentId));
			result = crit.addOrder(Order.desc("serial")).add(
					Restrictions.le("serial", currentPg14Key)).setMaxResults(4)
					.list();
			// System.out.println("size of list is:"+result.size());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Retrieving The Resident Asssessment form Page 14 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
