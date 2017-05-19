package medrex.server.dao.messages;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MessagesRecordDAO {

	private MessagesRecordDAO() {
	}

	private static MessagesRecordDAO messagesRecordDAO = null;

	public static synchronized MessagesRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (messagesRecordDAO == null) {
			messagesRecordDAO = new MessagesRecordDAO();

		} // end if

		return (messagesRecordDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMessagesRecord(
			MessagesRecord messagesRecord) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			if (messagesRecord.isNew()) {
				messagesRecord.setNew(true);
			} else {
				messagesRecord.setNew(false);
			}
			session.createQuery("from MessagesRecord");
			session.saveOrUpdate(messagesRecord);
			tx.commit();
			// Global.currentMessagesRecordKey = messagesRecord.getSerial();
			return (messagesRecord.getSerial());
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving messagesRecord Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdateMessagesRecord(
			MessagesRecord messagesRecord, List<Users> rUsers)
			throws MedrexException {
		Iterator<Users> itr = rUsers.iterator();
		while (itr.hasNext()) {
			Users user = itr.next();
			messagesRecord.setSerial(0);
			messagesRecord.setReceiverId(user.getSerial());
			insertOrUpdateMessagesRecord(messagesRecord);
		}
		return 0;
	}

	public synchronized List getMessagesRecords(int userSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println("Key is:"+userSerial);
			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from MessagesRecord as ls where ls.receiverId="
			// + userSerial).list();

			result = session.createCriteria(MessagesRecord.class).add(
					Restrictions.eq("receiverId", userSerial)).addOrder(
					Order.desc("timeRecord")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving messagesRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getMessagesRecords() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MessagesRecord order by timeRecord desc").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving messagesRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized MessagesRecord getMessagesRecord(int serial)
			throws MedrexException {
		MessagesRecord messagesRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			messagesRecord = (MessagesRecord) session.load(
					MessagesRecord.class, serial);
			messagesRecord.getMessage();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving messagesRecord Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return messagesRecord;
	}

	public synchronized void deleteMessagesRecord(int serial)
			throws MedrexException {

		MessagesRecord messagesRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			messagesRecord = (MessagesRecord) session.load(
					MessagesRecord.class, serial);
			messagesRecord.getSubject();
			session.delete(messagesRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting messagesRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public int getTotalMessage(int currentLoggedInUserKey)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(MessagesRecord.class).add(
					Restrictions.eq("receiverId", currentLoggedInUserKey)).add(
					Restrictions.eq("isNew", true));
			ProjectionList projList = Projections.projectionList().add(
					Projections.count("receiverId"));
			crit.setProjection(projList);
			Integer i = (Integer) crit.uniqueResult();
			result = i.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public int getTriggerWordMailCount(int currentLoggedInUserKey)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(MessagesRecord.class).add(
					Restrictions.eq("receiverId", currentLoggedInUserKey)).add(
					Restrictions.eq("type", "TriggerAlert")).add(
					Restrictions.eq("isNew", true));
			ProjectionList projList = Projections.projectionList().add(
					Projections.count("receiverId"));
			crit.setProjection(projList);
			Integer i = (Integer) crit.uniqueResult();
			result = i.intValue();
			// System.out.println("count is:" + result);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
