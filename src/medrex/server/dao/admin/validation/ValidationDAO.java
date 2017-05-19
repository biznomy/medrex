package medrex.server.dao.admin.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.admission.validation.ValidationFormField;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ValidationDAO {
	private ValidationDAO() {

	}

	private static ValidationDAO validationDao = null;

	public static synchronized ValidationDAO getInstance() {
		if (validationDao == null) {
			validationDao = new ValidationDAO();
		}
		return validationDao;
	}

	public synchronized int insertOrUpdateValidationForm(ValidationForm vfRef)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ValidationForm");
			session.saveOrUpdate(vfRef);
			// deleteExtraRows();
			tx.commit();
			return vfRef.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Validation Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteExtraRows() throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Query query = session
					.createSQLQuery("DELETE FROM formFieldValidations WHERE validationFormFieldsId IS NULL");
			Query query2 = session
					.createSQLQuery("DELETE FROM formConfigAlert WHERE serial NOT IN(SELECT alertId FROM validationFormFields)");
			query.executeUpdate();
			query2.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Validation Form  Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ValidationForm getValidations(int serial)
			throws MedrexException {
		ValidationForm validForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			validForm = (ValidationForm) session.load(ValidationForm.class,
					serial);
			validForm.getSerial();
			validForm.getValidationFormFields().iterator();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Validation Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return validForm;
	}

	public synchronized ValidationForm getAllValidations(String fullPathOfForm)
			throws MedrexException {
		ValidationForm result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = (ValidationForm) session.createQuery(
					"from ValidationForm as ar where ar.fullClassName=" + "'"
							+ fullPathOfForm + "'").uniqueResult();
			// result = (ValidationForm)
			// session.createCriteria(ValidationForm.class)
			// .add(Expression.eq("fullClassName", fullPathOfForm))
			// .uniqueResult();

			// result.getSerial();
			// System.out.println("getVals: " + (result == null));
			if (result != null && result.getValidationFormFields() != null) {
				result.getValidationFormFields().iterator();
				result.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Validation Form  Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized boolean isFormFieldAlreadyExist(
			String retrievedNameOfComp, String selectedFormFullPath) {
		ValidationForm valRec = null;
		boolean fieldExist = false;

		try {
			valRec = getAllValidations(selectedFormFullPath);
		} catch (MedrexException e) {
			e.printStackTrace();
		}

		List<ValidationFormField> vffList = new ArrayList<ValidationFormField>();
		if (valRec != null) {
			Iterator<ValidationFormField> i = valRec.getValidationFormFields()
					.iterator();
			while (i.hasNext()) {
				vffList.add(i.next());
			}
		}
		if (vffList != null) {
			for (ValidationFormField vff : vffList) {
				if (vff.getComponentName()
						.equalsIgnoreCase(retrievedNameOfComp)) {
					fieldExist = true;
				}
			}
		}
		return fieldExist;
	}

	public synchronized int insertFormConfigAlert(FormConfigAlert alertRef)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from FormConfigAlert");
			session.saveOrUpdate(alertRef);
			// deleteExtraRows();
			tx.commit();
			return alertRef.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Form Config Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteValidationFormField(int serial)
			throws MedrexException {
		ValidationFormField vff = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			vff = (ValidationFormField) session.load(ValidationFormField.class,
					serial);
			vff.getComponentName();
			session.delete(vff);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Validation Form Field");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
