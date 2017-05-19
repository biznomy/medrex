package medrex.server.dao.masterList;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.MasterList;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MasterListDAO {

	private MasterListDAO() {

	}

	public static MasterListDAO ia = null;

	public static synchronized MasterListDAO getInstance() {
		if (ia == null) {
			ia = new MasterListDAO();
		}
		return (ia);
	}

	public synchronized void insertOrUpdateMasterListRecord(MasterList ia)
			throws Exception {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createCriteria(ia.getClass());
			session.saveOrUpdate(ia);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<MasterList> getMasterListRecords(Class cls)
			throws Exception {
		List<MasterList> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(cls).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized MasterList getMasterListRecord(Class cls, int id)
			throws Exception {
		MasterList ia = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ia = (MasterList) session.load(cls, id);
			ia.getMsterName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ia;
	}

	public synchronized MasterList getMasterListRecord(Class cls, String name)
			throws Exception {
		MasterList ia = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ia = (MasterList) session.createCriteria(cls).add(
					Restrictions.eq("msterName", name)).uniqueResult();
			if (ia != null) {
				ia.getMsterName();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ia;
	}

	public synchronized void deleteMasterListRecord(Class cls, int id)
			throws Exception {
		MasterList ia = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ia = (MasterList) session.load(cls, id);
			session.delete(ia);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting MasterList Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int getMasterList(Class cls, String retrieveString)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			List l = session.createCriteria(cls).add(
					Restrictions.eq("msterName", retrieveString)).list();
			Iterator it = l.iterator();
			while (it.hasNext()) {
				MasterList st = (MasterList) it.next();
				result = st.getId();
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
