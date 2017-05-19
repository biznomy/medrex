package medrex.server.dao.tutorial.hibernate;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.tutorial.hibernate.TutResident;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TutHibernateMainDAO {

	private TutHibernateMainDAO() {

	}

	private static TutHibernateMainDAO tutHibernateMainDAO = null;

	/*
	 * TutHibernateMainDAO is a singleton Class to make sure that for the whole
	 * application only single instance will be there.
	 */
	public static synchronized TutHibernateMainDAO getInstance() {
		// if obj is null create it , else just return it
		if (tutHibernateMainDAO == null) {
			tutHibernateMainDAO = new TutHibernateMainDAO();

		}// end if
		return (tutHibernateMainDAO);

	}// end - getUniqueInstance - method

	// insertOrUpdateTutHibernaterecord method is the method which takes an
	// argument of type TutResident.
	public synchronized void insertOrUpdateTutHibernaterecord(
			TutResident refResident) throws MedrexException {
		// Created a session from SessionUtil class
		// and started a transaction.
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// start Transaction
			tx = session.beginTransaction();
			// Saved the object using the method saveOrUpdate(Object) of session
			// interface.
			session.saveOrUpdate(refResident);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Hibernate Tutorial record");
		} finally {
			// to close session..............
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// This method is used to get the total records of
	// residents...........................
	public synchronized List<TutResident> getTutHibernaterecords()
			throws MedrexException {
		List<TutResident> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(TutResident.class).list();
			if (result != null) {
				for (TutResident resident : result) {
					resident.getPhones().size();
				}
			}
			// result = session.createQuery("from Schedule").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error Retrieving Schedule Records...........");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// This method is used to get the the residents who contain number of
	// children greater then five..............
	public synchronized List<TutResident> getSelectedResidentNumberOfChilrenGreaterThanThree()
			throws MedrexException {
		List<TutResident> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(TutResident.class).add(
					Restrictions.gt("noOfChildren", 5)).list();
			if (result != null) {
				for (TutResident resident : result) {
					resident.getPhones().size();
				}
			}
			// result = session.createQuery("from Schedule").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error Retrieving Schedule Records...........");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// This method is used to delete the seleted
	// row................................
	public synchronized void deleteTutHibernaterecords(int id)
			throws MedrexException {
		TutResident tutResident = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			tutResident = (TutResident) session.load(TutResident.class, id);
			session.delete(tutResident);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// This method is used to get the residents with doctor name
	// ......................................
	public synchronized List<TutResident> getSelectedResidentWithSeletedDoctor()
			throws MedrexException {
		List<TutResident> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(TutResident.class)
			/*
			 * Note::::::: if u want to access any field except serial in
			 * mapping than it is mandatory to crate alias
			 * ............................... as shown bellow to access doctor
			 * name we create alias and access name..........
			 */

			.createAlias("doctor", "d")
			// .add(Restrictions.eq("doctor.serial", 1))
					.add(Restrictions.eq("d.doctor_Name", "pavan")).list();
			if (result != null) {
				for (TutResident resident : result) {
					resident.getPhones().size();
				}
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error Retrieving Schedule Records...........");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// This method is used to get the residents with no doctor
	// ......................................
	public synchronized List<TutResident> getSelectedResidentwithNoDoctor()
			throws MedrexException {
		List<TutResident> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(TutResident.class)
			/*
			 * Note::::::: if u want to access any field except serial in
			 * mapping than it is mandatory to crate alias
			 * ............................... as shown bellow to access doctor
			 * name we create alias and access name..........
			 */
			.createAlias("doctor", "d").add(
					Restrictions.or(Restrictions.isNull("d.doctor_Name"),
							Restrictions.or(Restrictions
									.eq("d.doctor_Name", ""), Restrictions.eq(
									"d.doctor_Name", "null")))).list();
			if (result != null) {
				for (TutResident resident : result) {
					resident.getPhones().size();
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error Retrieving Schedule Records...........");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
