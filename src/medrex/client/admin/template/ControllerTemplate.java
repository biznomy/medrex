package medrex.client.admin.template;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.medication.Templates;

public class ControllerTemplate implements Controller {
	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		Templates templates = (Templates) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("type") || field.equals("")) {
			if (templates.getType() != null)
				medValidation.checkRequiredValidation(templates.getType()
						.toString().trim(), "Type", errorList);
		}

		if (field.equals("templateName") || field.equals("")) {
			if (templates.getTemplateName() != null)
				medValidation.checkRangeValidation(templates.getTemplateName()
						.toString().trim(), 3, 25, "Template Name", errorList);
		}
		return errorList;
	}

}
