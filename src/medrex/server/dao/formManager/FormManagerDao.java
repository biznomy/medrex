package medrex.server.dao.formManager;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.formManager.Form;
import medrex.commons.vo.formManager.FormPage;
import medrex.commons.vo.formManager.Tab;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class FormManagerDao {

	private static FormManagerDao formManagerDao = null;

	public static synchronized FormManagerDao getInstance() {

		if (formManagerDao == null) {
			formManagerDao = new FormManagerDao();
		}
		return (formManagerDao);
	}

	private String sql;

	public synchronized List<Tab> getAllTabs() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<Tab> result = new ArrayList<Tab>();
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Tab.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.setFetchMode("serial", FetchMode.EAGER);

			result = criteria.list();
			result.iterator();

			for (Tab t : result) {
				if (t != null) {
					if (t.getForms() != null) {
						/*
						 * System.out.println("tab name is -----------" +
						 * t.getTabName() );
						 * System.out.println("tab Name is :"+t.getTabName());
						 * System.out.println("\tforms Name is :");
						 */
						List<Form> forms = t.getForms();
						forms.iterator();
						for (Form form : forms) {
							/*
							 * System.out.println(form.getFormName());
							 * System.out
							 * .println("Form Name is ********************" +
							 * form.getFormName()+ "formId" + form.getSerial());
							 */
							if (form.getFormPages() != null) {
								System.out.println("\t\tforms Pages Are :");
								List<FormPage> formPages = form.getFormPages();
								formPages.iterator();
								for (FormPage fPg : formPages) {
									System.out.println(fPg.getClassName());
								}

							}
						}
					}
				}
			}
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<FormPage> getAllForms() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<FormPage> result = new ArrayList<FormPage>();
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(FormPage.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.setFetchMode("serial", FetchMode.EAGER);

			result = criteria.list();
			result.iterator();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<FormPage> getAllFormPages(String formName)
			throws MedrexException {
		List<FormPage> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		result = new ArrayList<FormPage>();
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Form.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).add(
							Restrictions.eq("formName", formName))
					.setFetchMode("serial", FetchMode.EAGER);

			Form form = (Form) criteria.uniqueResult();
			result = form.getFormPages();
			result.iterator();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving notes Categories Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public static void main(String ar[]) {
		try {
			// getInstance().getAllTabs();
			getInstance().getAllFormPages("");
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public FormPage getFormPageWithId(int currSerial) throws MedrexException {

		FormPage formPage = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			formPage = (FormPage) session.createCriteria(FormPage.class).add(
					Restrictions.eq("serial", currSerial)).uniqueResult();
			formPage.getPageNo();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return formPage;
	}

	public int insertOrUpdateFormPage(FormPage currref) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from FormPage");
			session.saveOrUpdate(currref);
			tx.commit();
			return currref.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Form Page");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public int getFormIdByName(String selectedNode) throws MedrexException {

		Form form = null;
		Session session = SessionUtil.getInstance().getSession();
		int id;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			form = (Form) session.createCriteria(Form.class).add(
					Restrictions.eq("formName", selectedNode)).uniqueResult();
			id = form.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving form id");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return id;
	}

	public void insertOrUpdateForm(int formId, int selectedTabId)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SQLQuery query = session
					.createSQLQuery("UPDATE tab_form SET tab_serial ='"
							+ selectedTabId + "'WHERE form_serial ='" + formId
							+ "'");
			query.executeUpdate();
			tx.commit();
			// return 0;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Form Page");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void insertOrUpdateForm_formPage(int formId, int parentid,
			boolean isNew) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			tx = session.beginTransaction();
			if (isNew) {
				sql = "INSERT INTO form_formpage (form_serial, formPage_serial) Values ("
						+ parentid + "," + formId + ");";
			} else {
				sql = "UPDATE form_formpage SET formPage_serial  ='" + formId
						+ "'WHERE formPage_serial ='" + parentid + "'";
			}
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Form_FormPage");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public void deleteForm_formPage(int form_pageSerial, int form_serial)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			String sql = "DELETE FROM form_formpage   WHERE formPage_serial = "
					+ form_serial + " and form_serial = " + form_pageSerial;
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting form  records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void checkduplicateform(int form_pageSerial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			String sql = "SELECT  * FROM form_formpage   WHERE   form_serial =  "
					+ form_pageSerial;
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting form  records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
