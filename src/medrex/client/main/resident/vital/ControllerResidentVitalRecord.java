package medrex.client.main.resident.vital;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.resident.ResidentVitalSigns;

public class ControllerResidentVitalRecord implements Controller {
	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		ResidentVitalSigns vital = (ResidentVitalSigns) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("temprature") || field.equals("")) {
			if (vital.getTemprature() == 0) {
				medrexValidation.checkRequiredValidation("", "Tempratrure",
						errorList);
			}

		}
		/*
		 * if (field.equals("bp") || field.equals("")) {
		 * if(vital.getBp()!=null){
		 * medrexValidation.checkRequiredValidation(vital.getBp(),"BP",
		 * errorList); }
		 * 
		 * }
		 */
		return errorList;
	}

}
