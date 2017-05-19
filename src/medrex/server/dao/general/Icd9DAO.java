package medrex.server.dao.general;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.general.Icd9;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Icd9DAO {

	private Icd9DAO() {
	}

	private static Icd9DAO refIcd9Dao = null;

	public static synchronized Icd9DAO getInstance() {

		// if obj is null create it , else just return it
		if (refIcd9Dao == null) {
			refIcd9Dao = new Icd9DAO();

		} // end if

		return (refIcd9Dao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateIcd9(Icd9 refIcd9)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Icd9");
			session.saveOrUpdate(refIcd9);

			tx.commit();

			return refIcd9.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Icd9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void insertOrUpdateIcd9(List<Icd9> list) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Iterator<Icd9> itr = list.iterator();
			while (itr.hasNext()) {
				Icd9 ref = itr.next();
				try {
					session.createQuery("from Icd9");
					session.saveOrUpdate(ref);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Icd9");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getIcd9s() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Icd9").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Icd9 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getIcd9s(String text, String selectedButton)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		String strQuery = null;
		try {

			tx = session.beginTransaction();
			if (selectedButton.equals("Code")) {
				strQuery = " from Icd9 as ref where ref.code like '" + text
						+ "%'";
			} else {
				strQuery = " from Icd9 as ref where ref.name like '" + text
						+ "%'";
			}

			// System.out.println("strQuery: "+strQuery);
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Icd9 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getIcd9s(String likeStr) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			String strQuery = " from Icd9 as ref where ref.name like '"
					+ likeStr + "' or ref.code like '" + likeStr + "'";
			// System.out.println("strQuery: "+strQuery);
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Icd9 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Icd9 getIcd9ByCode(String code) throws MedrexException {
		List result = null;
		Icd9 icd9 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					" from Icd9 as ref where ref.code = '" + code + "'").list();

			if (result != null) {
				try {
					icd9 = (Icd9) result.get(0);
				} catch (Exception e) {

				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving Icd9 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

		return icd9;
	}

	public synchronized Icd9 getIcd9(int serial) throws MedrexException {
		Icd9 refIcd9 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refIcd9 = (Icd9) session.load(Icd9.class, serial);
			refIcd9.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Icd9s");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refIcd9;
	}

	public synchronized void deleteIcd9(int serial) throws MedrexException {

		Icd9 refIcd9 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refIcd9 = (Icd9) session.load(Icd9.class, serial);
			refIcd9.getSerial();
			session.delete(refIcd9);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Icd9 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
