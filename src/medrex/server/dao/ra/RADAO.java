package medrex.server.dao.ra;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.ra.RAFPg1;
import medrex.commons.vo.ra.RAFPg2;
import medrex.commons.vo.ra.RARecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RADAO {

	public RADAO() {

	}

	public static RADAO ref = null;

	public static synchronized RADAO getInstance() {
		if (ref == null) {
			ref = new RADAO();
		}
		return ref;
	}

	public synchronized int insertOrUpdateRARecord(RARecord raRecord)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		int serial = 0;
		try {
			tr = sess.beginTransaction();
			sess.saveOrUpdate(raRecord);
			serial = raRecord.getSerial();
			tr.commit();
		} catch (Exception ex) {
			System.out.println("Insert or update RA Record");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return serial;
	}

	public synchronized RARecord getRARecord(int serial) throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RARecord rARecord = null;
		try {
			tr = sess.beginTransaction();
			rARecord = (RARecord) sess.createCriteria(RARecord.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			rARecord.getResidentId();
			tr.commit();
		} catch (Exception ex) {
			System.out.println("getting RA Record");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return rARecord;
	}

	public synchronized List<RARecord> getRARecordList(int residentId)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		List<RARecord> list = null;
		try {
			sess.beginTransaction();
			list = sess.createCriteria(RARecord.class).add(
					Restrictions.eq("residentId", residentId)).list();

		} catch (Exception ex) {
			System.out.println("getting RA Record");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return list;
	}

	public synchronized void deleteRAFPg1Record(int serial)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RAFPg1 raPg1 = null;
		try {
			tr = sess.beginTransaction();
			raPg1 = (RAFPg1) sess.createCriteria(RAFPg1.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			sess.delete(raPg1);
			tr.commit();
		} catch (Exception ex) {
			System.out.println("deleting RAF page 1");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
	}

	public synchronized void deleteRAFPg2Record(int serial)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RAFPg2 raPg2 = null;
		try {
			tr = sess.beginTransaction();
			raPg2 = (RAFPg2) sess.createCriteria(RAFPg2.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			sess.delete(raPg2);
			tr.commit();
		} catch (Exception ex) {
			System.out.println("deleting RAF page 2");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
	}

	public synchronized void deleteRARecord(int serial) throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RARecord rARecord = null;
		try {
			tr = sess.beginTransaction();
			rARecord = (RARecord) sess.createCriteria(RARecord.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			sess.delete(rARecord);
			tr.commit();
		} catch (Exception ex) {
			System.out.println("deleting RA Record");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
	}

	public synchronized int insertOrUpdateRAFPg1(RAFPg1 raPg1)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		int serial = 0;
		try {
			tr = sess.beginTransaction();
			sess.saveOrUpdate(raPg1);
			tr.commit();
			serial = raPg1.getSerial();

		} catch (Exception ex) {
			System.out.println("Insert or update RAF page 1");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return serial;
	}

	public synchronized RAFPg1 getRAFP1(int serial) throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RAFPg1 raPg1 = null;
		try {
			tr = sess.beginTransaction();
			raPg1 = (RAFPg1) sess.createCriteria(RAFPg1.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			raPg1.getFirstName();
			tr.commit();
		} catch (Exception ex) {
			System.out.println("getting RAF page 1");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return raPg1;
	}

	public synchronized int insertOrUpdateRAFPg2(RAFPg2 raPg2)
			throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		int serial = 0;
		try {
			tr = sess.beginTransaction();
			sess.saveOrUpdate(raPg2);
			tr.commit();
			serial = raPg2.getSerial();

		} catch (Exception ex) {
			System.out.println("Insert or update RAF page 2");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return serial;
	}

	public synchronized RAFPg2 getRAFPg2(int serial) throws MedrexException {
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		RAFPg2 raPg2 = null;
		try {
			tr = sess.beginTransaction();
			raPg2 = (RAFPg2) sess.createCriteria(RAFPg2.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			raPg2.getState();
			tr.commit();
		} catch (Exception ex) {
			System.out.println("getting RAF page 2");
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return raPg2;
	}

	public ValidationForm getRaFPg1ValidationRecord(String className)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		ValidationForm vf = null;
		try {
			tr = session.beginTransaction();
			vf = (ValidationForm) session.createCriteria(ValidationForm.class)
					.add(Restrictions.eq("fullClassName", className))
					.setFetchMode("validationFormFields", FetchMode.LAZY)
					.uniqueResult();
			// vf =
			// ct.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			// System.out.println("vflist: "+vflist.size());
			if (vf != null && vf.getValidationFormFields() != null) {
				vf.getValidationFormFields().iterator();
				vf.getSerial();
			}

			tr.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return vf;
	}
}
