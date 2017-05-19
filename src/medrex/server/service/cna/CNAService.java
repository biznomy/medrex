package medrex.server.service.cna;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.cna.CnaAdl;
import medrex.server.dao.cna.CNADAO;

public class CNAService {

	public int insertOrUpdateCnaAdl(CnaAdl cnaAdl) throws MedrexException {
		return CNADAO.getInstance().insertOrUpdateCnaAdl(cnaAdl);
	}

	public List getCnaAdlForResident(int residentSerial) throws MedrexException {
		return CNADAO.getInstance().getCnaAdlForResident(residentSerial);
	}

	public CnaAdl getCnaAdl(int id) throws MedrexException {
		return CNADAO.getInstance().getCnaAdl(id);
	}

}
