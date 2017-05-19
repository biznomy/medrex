package medrex.server.service.general;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.general.Icd9;
import medrex.server.dao.general.Icd9DAO;

public class Icd9Service {

	public int insertOrUpdateIcd9(Icd9 refIcd9) throws MedrexException {
		return Icd9DAO.getInstance().insertOrUpdateIcd9(refIcd9);
	}

	public List getIcd9s() throws MedrexException {
		return Icd9DAO.getInstance().getIcd9s();
	}

	public List getIcd9s(String likeStr) throws MedrexException {
		return Icd9DAO.getInstance().getIcd9s(likeStr);
	}

	public List getIcd9s(String text, String selectedButton)
			throws MedrexException {
		return Icd9DAO.getInstance().getIcd9s(text, selectedButton);
	}

	public Icd9 getIcd9(int serial) throws MedrexException {
		return Icd9DAO.getInstance().getIcd9(serial);
	}

	public void deleteIcd9(int serial) throws MedrexException {
		Icd9DAO.getInstance().deleteIcd9(serial);
	}

	public Icd9 getIcd9ByCode(String code) throws MedrexException {
		return (Icd9DAO.getInstance().getIcd9ByCode(code));
	}

	public void insertOrUpdateIcd9(List<Icd9> list) throws MedrexException {
		Icd9DAO.getInstance().insertOrUpdateIcd9(list);
	}

}
