package medrex.client.main.alert;

import java.util.ArrayList;
import java.util.List;

import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.vo.alert.Alert;

public class ControllerAlertAdd implements Controller {

	private List errorList;

	public List<String> doValidate(Object bean, String field) {
		Alert alert = (Alert) bean;
		MedrexValidation medValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("notes") || field.equals("")) {
			medValidation.checkRangeValidation(alert.getNotes().toString()
					.trim(), 3, 100, "Notes", errorList);
		}

		// if (field.equals("intervalTime") || field.equals("")) {
		// if (alert.getIntervalTime() != 0)
		// medValidation.checkRequiredValidation(Integer.toString(alert
		// .getIntervalTime()), "Interval Time", errorList);
		// }
		//		
		// if (field.equals("intervalType") || field.equals("")) {
		// medValidation.checkRequiredValidation(alert.getIntervalType()
		// .toString().trim(), "Interval Type", errorList);
		// }

		if (field.equals("beginDate") || field.equals("")) {
			medValidation.checkRequiredValidation(alert.getBeginDate(),
					"Begin date", errorList);
		}

		// if (field.equals("endDate") || field.equals("")) {
		// medValidation.checkRequiredValidation(alert.getEndDate(),
		// "end date", errorList);
		// }
		// if ((alert.getBeginDate() != null) && (alert.getEndDate() != null)) {
		// if (alert.getAlertType() != 3) {
		// medValidation.checkDateRangeValidation(alert.getEndDate(), alert
		// .getBeginDate(), "End", "Begin", errorList);
		// }
		// }

		if (field.equals("recieverUser") || field.equals("")) {
			if (!alert.getRecieverUser().equalsIgnoreCase(""))
				medValidation.checkRequiredValidation(alert.getRecieverUser(),
						"User", errorList);
		}
		if (field.equals("recieverDepartment") || field.equals("")) {
			if (!alert.getRecieverDepartment().equalsIgnoreCase(""))
				medValidation.checkRequiredValidation(alert
						.getRecieverDepartment(), "Department", errorList);
		}
		return errorList;
	}
}
