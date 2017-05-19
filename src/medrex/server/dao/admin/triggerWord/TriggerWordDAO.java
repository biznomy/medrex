package medrex.server.dao.admin.triggerWord;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.TriggerWord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TriggerWordDAO {

	private TriggerWordDAO() {
	}

	private static TriggerWordDAO refDao = null;

	public static synchronized TriggerWordDAO getInstance() {
		if (refDao == null) {
			refDao = new TriggerWordDAO();
		}
		return refDao;
	}

	public int insertOrUpdateTriggerWord(TriggerWord tw) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(tw);
			tx.commit();
			return tw.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public TriggerWord getTriggerWord(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		TriggerWord tw = null;
		try {
			tx = session.beginTransaction();
			tw = (TriggerWord) session.load(TriggerWord.class, serial);
			tw.getWord();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return tw;
	}

	public List<TriggerWord> getAllTriggerWords() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<TriggerWord> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(TriggerWord.class).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteTriggerWord(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			TriggerWord tw = (TriggerWord) session.load(TriggerWord.class,
					serial);
			session.delete(tw);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error deleting Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List getTriggerWordList() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List result = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(TriggerWord.class);
			ProjectionList projList = Projections.projectionList().add(
					Projections.property("word"));
			result = crit.setProjection(projList).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public TriggerWord getUsersAccordingToTriggerWords(String triggerWords)
			throws MedrexException {
		TriggerWord tw = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			tw = (TriggerWord) session.createCriteria(TriggerWord.class).add(
					Restrictions.eq("word", triggerWords)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Trigger Word.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return tw;
	}
}
