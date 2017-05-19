package medrex.server.service.masterList;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.MasterList;
import medrex.server.dao.masterList.MasterListDAO;

public class MasterListService {

	public void insertOrUpdateMasterListRecord(MasterList ia) throws Exception {
		MasterListDAO.getInstance().insertOrUpdateMasterListRecord(ia);
	}

	public List<MasterList> getMasterListRecords(Class cls) throws Exception {
		return MasterListDAO.getInstance().getMasterListRecords(cls);
	}

	public MasterList getMasterListRecord(Class cls, int id) throws Exception {
		return (MasterListDAO.getInstance().getMasterListRecord(cls, id));
	}

	public MasterList getMasterListRecord(Class cls, String name)
			throws Exception {
		return (MasterListDAO.getInstance().getMasterListRecord(cls, name));
	}

	public void deleteMasterListRecord(Class cls, int id) throws Exception {
		MasterListDAO.getInstance().deleteMasterListRecord(cls, id);
	}

	public int getMasterList(Class cls, String retrieveString)
			throws MedrexException {
		return (MasterListDAO.getInstance().getMasterList(cls, retrieveString));
	}

}
