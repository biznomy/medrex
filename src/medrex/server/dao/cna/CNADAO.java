package medrex.server.dao.cna;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.cna.CnaAdl;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CNADAO {

	private CNADAO() {
	}

	private static CNADAO cnaDao = null;

	public static synchronized CNADAO getInstance() {

		// if obj is null create it , else just return it
		if (cnaDao == null) {
			cnaDao = new CNADAO();

		} // end if

		return (cnaDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCnaAdl(CnaAdl cnaAdl)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CnaAdl");
			session.saveOrUpdate(cnaAdl);
			tx.commit();
			// GlobalCNA.currentCNAkey=cnaAdl.getSerial();
			return cnaAdl.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCnaAdlForResident(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from CnaAdl as ar where ar.residentId=" + residentSerial)
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CnaAdl getCnaAdl(int id) throws MedrexException {
		CnaAdl result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = (CnaAdl) session.createQuery(
					"from CnaAdl as ar where ar.serial=" + id).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
