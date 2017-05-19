package medrex.server.service.admin.formManager;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.formManager.FormPage;
import medrex.commons.vo.formManager.Tab;
import medrex.server.dao.formManager.FormManagerDao;

public class FormManagerService {

	public void insertOrUpdateForm(int formId, int selectedTabId)
			throws MedrexException {
		FormManagerDao.getInstance().insertOrUpdateForm(formId, selectedTabId);
	}

	public int getFormIdByName(String selectedNode) throws MedrexException {
		return FormManagerDao.getInstance().getFormIdByName(selectedNode);
	}

	public void deleteForm_formPage(int form_pageSerial, int form_serial)
			throws MedrexException {
		FormManagerDao.getInstance().deleteForm_formPage(form_pageSerial,
				form_serial);
	}

	public List<Tab> getAllTabs() throws MedrexException {
		return FormManagerDao.getInstance().getAllTabs();
	}

	public List<FormPage> getAllFormPages(String text) throws MedrexException {
		return FormManagerDao.getInstance().getAllFormPages(text);
	}

	public FormPage getFormPageWithId(int currSerial) throws MedrexException {
		return FormManagerDao.getInstance().getFormPageWithId(currSerial);
	}

	public void insertOrUpdateFormPage(FormPage currref) throws MedrexException {
		FormManagerDao.getInstance().insertOrUpdateFormPage(currref);
	}

	public void insertOrUpdateForm_formPage(int formId, int parentid,
			boolean isNew) throws MedrexException {
		FormManagerDao.getInstance().insertOrUpdateForm_formPage(formId,
				parentid, isNew);

	}

	public List<FormPage> getAllForms() throws MedrexException {
		return FormManagerDao.getInstance().getAllForms();
	}

}
