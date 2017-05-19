package medrex.server.dao.richTextField;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.richTextField.RichTextField;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RichTextFieldDAO {

	private RichTextFieldDAO() {

	}

	private static RichTextFieldDAO richTextFieldDAO = null;

	public static synchronized RichTextFieldDAO getInstance() {
		if (richTextFieldDAO == null) {
			richTextFieldDAO = new RichTextFieldDAO();
		}
		return richTextFieldDAO;
	}

	public List getRichTextFieldValues(String rtfType, String key)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			if (key.equalsIgnoreCase("")) {
				result = session.createCriteria(RichTextField.class).add(
						Restrictions.eq("rtfType", rtfType)).list();
			} else {
				result = session.createCriteria(RichTextField.class).add(
						Restrictions.eq("rtfType", rtfType)).add(
						Restrictions.like("rtfName", key + "%").ignoreCase())
						.list();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Rich Text Field List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void insertOrUpdateRichTextFieldValue(RichTextField rtf)
			throws MedrexException {
		if (!(isRtfNameExist(rtf))) {
			Session session = SessionUtil.getInstance().getSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.createQuery("from RichTextField");
				session.saveOrUpdate(rtf);
				tx.commit();
			} catch (Exception e) {
				SessionUtil.getInstance().rollbackTx(tx, "");
				e.printStackTrace();
				throw new MedrexException(
						"Error Saving  Rich Text Field record");
			} finally {
				SessionUtil.getInstance().closeSession(session);
			}
		} else {
			throw new MedrexException("Already Added");
		}
	}

	public boolean isRtfNameExist(RichTextField rtf) throws MedrexException {
		boolean bool = false;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List l = session.createCriteria(RichTextField.class).add(
					Restrictions.eq("rtfType", rtf.getRtfType())).add(
					Restrictions.eq("rtfName", rtf.getRtfName())).list();
			if (l.size() > 0 && l != null) {
				bool = true;
			} else {
				bool = false;
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving  Rich Text Field record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return bool;
	}
}
