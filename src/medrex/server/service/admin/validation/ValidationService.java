package medrex.server.service.admin.validation;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.server.dao.admin.validation.ValidationDAO;

public class ValidationService {

	public int insertOrUpdateValidationForm(ValidationForm vfRef)
			throws MedrexException {
		int n = ValidationDAO.getInstance().insertOrUpdateValidationForm(vfRef);
		ValidationDAO.getInstance().deleteExtraRows();

		return n;
	}

	public ValidationForm getValidations(int currentValidationFormKey)
			throws MedrexException {

		return ValidationDAO.getInstance().getValidations(
				currentValidationFormKey);
	}

	public ValidationForm getAllValidations(String fullPathOfForm)
			throws MedrexException {
		return ValidationDAO.getInstance().getAllValidations(fullPathOfForm);
	}

	public boolean isFormFieldAlreadyExist(String retrievedNameOfComp,
			String selectedFormFullPath) throws MedrexException {

		return ValidationDAO.getInstance().isFormFieldAlreadyExist(
				retrievedNameOfComp, selectedFormFullPath);
	}

	public int insertFormConfigAlert(FormConfigAlert alertRef)
			throws MedrexException {

		return ValidationDAO.getInstance().insertFormConfigAlert(alertRef);
	}

	public void deleteValidationFormField(int serial) throws MedrexException {
		ValidationDAO.getInstance().deleteValidationFormField(serial);

	}

}
