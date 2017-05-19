package medrex.server.dao;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.scan.ScanForm;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ScanFormDAO {

	private ScanFormDAO() {
	}

	private static ScanFormDAO scanFormDAO = null;

	public static synchronized ScanFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (scanFormDAO == null) {
			scanFormDAO = new ScanFormDAO();

		} // end if

		return (scanFormDAO);

	} // end - getUniqueInstance - method

	public synchronized void insertOrUpdateScanForm(ScanForm scanForm)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ScanForm");
			session.saveOrUpdate(scanForm);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Scan Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getScanForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from ScanForm as ls where ls.residentId="
									+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Scan Form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ScanForm getScanForm(int serial) throws MedrexException {
		ScanForm scanForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			scanForm = (ScanForm) session.load(ScanForm.class, serial);
			scanForm.getScanFormType();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Scan Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return scanForm;
	}

	public synchronized void deleteScanForm(int serial) throws Exception {

		ScanForm scanForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			scanForm = (ScanForm) session.load(ScanForm.class, serial);
			scanForm.getScanFormType();
			session.delete(scanForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Scan Form Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
