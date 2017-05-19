package medrex.server.dao.admin.medication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Medication;
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

	public Long insertOrUpdateMedications(Medication med)
			throws MedrexException {
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
			throw new MedrexException("Error Saving medication.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public Medication getMedication(long serial) throws MedrexException {
		Medication medication = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			medication = (Medication) session.load(Medication.class, serial);
			medication.getName();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return medication;
	}

	public List<Medication> getAllMedications() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Medication> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Medication.class).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication lists.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteMedication(long serial) throws MedrexException {
		long ndc = serial;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Medication medication = null;
		try {
			tx = session.beginTransaction();
			medication = (Medication) session.load(Medication.class, ndc);
			session.delete(medication);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error deleting medication.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// Filtering particular medication on code or medication Name

	public synchronized List<Medication> getMedication() throws MedrexException {
		List<Medication> result = new ArrayList<Medication>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(Medication.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public synchronized List getMedication(String text, String selectedButton)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Medication> medications = new ArrayList<Medication>();
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
								"SELECT med.ndc,med.code,med.coustionary ,med.description,med.name,med.routeName FROM Medication as med WHERE med.ndc LIKE "
										+ ndcCodestr).list();
				Iterator<Object> it = listOfObj.iterator();
				while (it.hasNext()) {
					Object[] o = (Object[]) it.next();
					Medication med = new Medication();
					med.setNdc(Long.valueOf(o[0].toString()));
					med.setCode("");
					med.setCoustionary(o[2].toString());
					med.setDescription(o[3].toString());
					med.setName(o[4].toString());
					med.setRouteName("");
					medications.add(med);

					// List list = Arrays.asList(ArrList);
					// med.setCode(o[0]);
				}

			} else {
				medications = session.createCriteria(Medication.class).add(
						Restrictions.like("name", text + "%")).list();
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return medications;
	}

	public synchronized List getMedicationByPhysicianOrder(String text)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Medication> medications = new ArrayList<Medication>();
		new ArrayList<Object>();

		try {
			tx = session.beginTransaction();

			medications = session.createCriteria(Medication.class).add(
					Restrictions.like("name", text + "%")).list();

			tx.commit();
			System.out.println("dsfjhdsfds");
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return medications;
	}

	public synchronized List getMedication(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			String strQuery = " from medication as ref where ref.name like '"
					+ likeStr + "' or ref.ndc like '" + likeStr + "'";
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Medication List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public synchronized List<Object[]> getMedicationFrequencies()
			throws MedrexException {
		List<Object[]> list = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String strQuery = " SELECT slotNum , frequencyType FROM medicationtimeslot GROUP BY frequencyType ORDER BY slotNum ";
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
