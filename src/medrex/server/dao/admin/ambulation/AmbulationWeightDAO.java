package medrex.server.dao.admin.ambulation;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.AmbulationWeight;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AmbulationWeightDAO {

	private AmbulationWeightDAO() {

	}

	private static AmbulationWeightDAO refDao = null;

	public static synchronized AmbulationWeightDAO getInstance() {
		if (refDao == null) {
			refDao = new AmbulationWeightDAO();
		}
		return refDao;
	}

	public synchronized int insertOrUpdateAmbulationWeight(
			AmbulationWeight ambWeight) throws MedrexException {
		int serial = 0;
		Transaction tr = null;
		Session sess = SessionUtil.getInstance().getSession();
		try {
			tr = sess.beginTransaction();
			sess.saveOrUpdate(ambWeight);
			tr.commit();
			serial = ambWeight.getSerial();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return serial;
	}

	public synchronized List<AmbulationWeight> getAmbulationWeights()
			throws MedrexException {
		List<AmbulationWeight> ambWeightList = null;
		Transaction tr = null;
		Session sess = SessionUtil.getInstance().getSession();
		try {
			tr = sess.beginTransaction();
			ambWeightList = sess.createCriteria(AmbulationWeight.class).list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return ambWeightList;
	}

	public synchronized AmbulationWeight getAmbulationWeight(int serial)
			throws MedrexException {
		AmbulationWeight ambWeight = null;
		Transaction tr = null;
		Session sess = SessionUtil.getInstance().getSession();
		try {
			tr = sess.beginTransaction();
			ambWeight = (AmbulationWeight) sess.createCriteria(
					AmbulationWeight.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return ambWeight;
	}

	public synchronized void deleteAmbulationWeight(int serial)
			throws MedrexException {
		Transaction tr = null;
		Session sess = SessionUtil.getInstance().getSession();
		try {
			tr = sess.beginTransaction();
			AmbulationWeight ambWeight = (AmbulationWeight) sess
					.createCriteria(AmbulationWeight.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			sess.delete(ambWeight);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
	}
}
