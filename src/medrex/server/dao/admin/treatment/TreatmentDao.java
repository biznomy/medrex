package medrex.server.dao.admin.treatment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Treatment;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TreatmentDao {

	public TreatmentDao() {
	}

	private static TreatmentDao refDao = null;

	public static synchronized TreatmentDao getInstance() {
		if (refDao == null) {
			refDao = new TreatmentDao();
		}
		return refDao;
	}

	public Long insertOrUpdateTreatments(Treatment med) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(med);
			tx.commit();
			return med.getNdc();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving treatment.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public Treatment getTreatment(long serial) throws MedrexException {
		Treatment treatment = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			treatment = (Treatment) session.load(Treatment.class, serial);
			treatment.getName();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving treatment.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return treatment;
	}

	public List<Treatment> getAllTreatments() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Treatment> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Treatment.class).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving treatment lists.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteTreatment(long serial) throws MedrexException {
		long ndc = serial;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Treatment treatment = null;
		try {
			tx = session.beginTransaction();
			treatment = (Treatment) session.load(Treatment.class, ndc);
			session.delete(treatment);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error deleting treatment.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// Filtering particular medication on code or medication Name

	public synchronized List<Treatment> getTreatment() throws MedrexException {
		List<Treatment> result = new ArrayList<Treatment>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(Treatment.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving treatment List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public synchronized List getTreatment(String text, String selectedButton)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Treatment> treatments = new ArrayList<Treatment>();
		List<Object> listOfObj = new ArrayList<Object>();

		try {
			tx = session.beginTransaction();
			if (selectedButton.equals("1")) {
				String ndcCode = Long.valueOf(text) + "%".toString();
				String ndcCodestr = "'" + ndcCode + "'";
				System.out.println(ndcCodestr);

				// medications = (List<Medication>) session.createCriteria(
				// // Medication.class).add(Restrictions.like("ndc",
				// "'"+Long.valueOf(text)+"%".toString()+"'"))
				// Medication.class).add(Restrictions.like("ndc",Long.valueOf(text)))
				// .list();
				listOfObj = session
						.createSQLQuery(
								"SELECT med.ndc,med.code,med.coustionary ,med.description,med.name,med.routeName FROM Treatmentadmin as med WHERE med.ndc LIKE "
										+ ndcCodestr).list();
				Iterator<Object> it = listOfObj.iterator();
				while (it.hasNext()) {
					Object[] o = (Object[]) it.next();
					Treatment tre = new Treatment();
					tre.setNdc(Long.valueOf(o[0].toString()));
					tre.setCode("");
					tre.setCoustionary(o[2].toString());
					tre.setDescription(o[3].toString());
					tre.setName(o[4].toString());
					tre.setRouteName("");
					treatments.add(tre);

					// List list = Arrays.asList(ArrList);
					// med.setCode(o[0]);
				}

			} else {
				treatments = session.createCriteria(Treatment.class).add(
						Restrictions.like("name", text + "%")).list();
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving treatment List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return treatments;
	}

	public synchronized List getTreatment(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			String strQuery = " from Treatmentadmin as ref where ref.name like '"
					+ likeStr + "' or ref.ndc like '" + likeStr + "'";
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving treatment List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public synchronized List<Object[]> getTreatmentFrequencies()
			throws MedrexException {
		List<Object[]> list = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String strQuery = " SELECT slotNum , frequencyType FROM treatmenttimeslot GROUP BY frequencyType ORDER BY slotNum ";
			list = session.createSQLQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving frequency List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return list;
	}

}
