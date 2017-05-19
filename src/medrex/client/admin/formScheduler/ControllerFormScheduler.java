package medrex.client.admin.formScheduler;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.admin.FormSchedule;

public class ControllerFormScheduler implements Controller {

	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		FormSchedule fs = (FormSchedule) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("form") || field.equals("")) {
			if (fs.getForm() != null)
				medValidation.checkRequiredValidation(fs.getForm(), "Form",
						errorList);
		}

		if (field.equals("type") || field.equals("")) {
			if (fs.getType() != null)
				medValidation.checkRequiredValidation(fs.getType().toString()
						.trim(), "Type", errorList);
		}

		if (field.equals("timeFrom") || field.equals("")) {
			medValidation.checkRequiredValidation(Integer.toString(fs
					.getTimeFrom()), "Time From", errorList);
		}

		if (field.equals("timeFromType") || field.equals("")) {
			if (fs.getTimeFromType() != null)
				medValidation.checkRequiredValidation(fs.getTimeFromType()
						.toString().trim(), "Time From type", errorList);
		}

		if (field.equals("alertAfter") || field.equals("")) {
			medValidation.checkRequiredValidation(Integer.toString(fs
					.getAlertAfter()), "Time After", errorList);
		}

		if (field.equals("alertAfterType") || field.equals("")) {
			if (fs.getAlertAfterType() != null)
				medValidation.checkRequiredValidation(fs.getAlertAfterType()
						.toString().trim(), "Time After type", errorList);
		}

		return errorList;
	}

}
