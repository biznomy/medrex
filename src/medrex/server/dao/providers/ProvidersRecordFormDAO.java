package medrex.server.dao.providers;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

public class ProvidersRecordFormDAO {

	private ProvidersRecordFormDAO() {
	}

	private static ProvidersRecordFormDAO providersDAO = null;

	public static synchronized ProvidersRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (providersDAO == null) {
			providersDAO = new ProvidersRecordFormDAO();

		} // end if

		return (providersDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ProvidersRecordForm");
			session.saveOrUpdate(providersRecordForm);
			tx.commit();

			return providersRecordForm.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Providers Record Form record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getProvidersRecordForms() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session.createQuery("from ProvidersRecordForm").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Providers Record Form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getProvidersRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session.createQuery(
					"from ProvidersRecordForm as ls where ls.residentId="
							+ residentSerial).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Providers Record Form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getProvidersRecordForms(String type)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ProvidersRecordForm as p where p.providerType='"
							+ type + "'").list();
			// System.out.println(result.size());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving provider list List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getProvidersRecordForms(ProviderTypes pTypes)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from ProvidersRecordForm as p where p.providerType='"
			// + type + "'").list();

			result = session.createCriteria(ProvidersRecordForm.class).add(
					Expression.eq("providerType", pTypes)).list();
			// System.out.println(result.size());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving provider list List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ProvidersRecordForm getProvidersRecordForm(
			ProviderTypes type, String address, String city)
			throws MedrexException {
		ProvidersRecordForm result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			// result = (ProvidersRecordForm) session.createQuery(
			// "from ProvidersRecordForm as p where p.providerType='"
			// + type + "' AND p.address='" + address + "' AND p.city='" + city
			// + "'").uniqueResult();
			result = (ProvidersRecordForm) session.createCriteria(
					ProvidersRecordForm.class).add(
					Expression.eq("providerType", type)).add(
					Expression.eq("address", address)).add(
					Expression.eq("city", city)).uniqueResult();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving provider list List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ProvidersRecordForm getProvidersRecordForm(int serial)
			throws MedrexException {
		ProvidersRecordForm providersRecordForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			providersRecordForm = (ProvidersRecordForm) session.load(
					ProvidersRecordForm.class, serial);
			providersRecordForm.getAddress();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Providers Record Form record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return providersRecordForm;

	}

	public synchronized void deleteProvidersRecordForm(int serial)
			throws MedrexException {

		ProvidersRecordForm providersRecordForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			providersRecordForm = (ProvidersRecordForm) session.load(
					ProvidersRecordForm.class, serial);
			providersRecordForm.getCity();
			session.delete(providersRecordForm);
			tx.commit();
		} catch (Exception e) {
			// e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Providers Record Form Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
