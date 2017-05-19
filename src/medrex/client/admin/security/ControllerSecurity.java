package medrex.client.admin.security;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.security.SecurityRole;

public class ControllerSecurity implements Controller {
	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		SecurityRole secRole = (SecurityRole) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("name") || field.equals("")) {
			if (secRole.getName() != null)
				medValidation.checkRangeValidation(secRole.getName().toString()
						.trim(), 3, 25, "Name", errorList);
		}
		return errorList;
	}

}
