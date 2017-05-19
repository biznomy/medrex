package medrex.client.utils;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jgoodies.validation.util.ValidationUtils;

public class MedrexValidation {

	public static String EMAIL_VALIDATION_REGEX = "[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.(?:[A-Z]{2}|com|org|net|gov|mil|biz|info|mobi|name|aero|jobs|museum|co\\.(in|uk|jp|us))";
	public static String WebsiteREGEX = "^(((h|H?)(t|T?)(t|T?)(p|P?)(s|S?))\\://)?(www.|[a-zA-Z0-9].)?[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]*$";
	private static final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
	String requiredMsg = "can not be empty";
	String boundedMsg1 = "has to be between";
	String boundedMsg2 = "to";
	String boundedMsg3 = "chars";
	String boundedMsg4 = "has to be";
	String selectMsg = "Please select";
	String emailNotValid = "is not valid";
	String websiteNotValid = "is not valid";
	String isInValidValue = "is invalid value";
	String dateMsg = "Date";
	String compMsg = "should be after the";

	// public String txtCheckValidation(String str,int min,int max, String
	// displayMsg){
	// String erroMessage=null;
	// if(ValidationUtils.isEmpty(str)){
	// erroMessage=displayMsg+" "+requiredMsg;
	// }else if(!ValidationUtils.hasBoundedLength(str, min, max)){
	// erroMessage=displayMsg+" "+boundedMsg1+" "+min+" "+boundedMsg2+" "+max+"
	// "+boundedMsg3;
	// }
	// return erroMessage;
	// }

	public void checkRangeValidation(String str, int min, int max,
			String displayMsg, List<String> errorList) {
		String erroMessage = null;
		if (ValidationUtils.isEmpty(str)) {
			erroMessage = displayMsg + " " + requiredMsg;
		} else if (!ValidationUtils.hasBoundedLength(str, min, max)) {
			erroMessage = displayMsg + " " + boundedMsg1 + " " + min + " "
					+ boundedMsg2 + " " + max + " " + boundedMsg3;
		}
		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public void checkIntValueValidation(String str, int min, int max,
			String displayMsg, List<String> errorList) {

		String erroMessage = null;
		int value = 0;
		if (ValidationUtils.isBlank(str)) {
			str = "0";
		}
		if (ValidationUtils.isNumeric(str)) {
			try {
				value = Integer.parseInt(str);
			} catch (Exception e) {
				erroMessage = displayMsg + " " + isInValidValue;
			}
			if (value < min || value > max) {
				erroMessage = displayMsg + " " + boundedMsg1 + " " + min + " "
						+ boundedMsg2 + " " + max;
			}
		} else {
			erroMessage = displayMsg + " " + isInValidValue;
		}

		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	// public String checkSizeValidation(String str,int min,int max, String
	// displayMsg){
	// String erroMessage=null;
	// if(ValidationUtils.isEmpty(str)){
	// erroMessage=displayMsg+" "+requiredMsg;
	// }else if(!ValidationUtils.hasBoundedLength(str, min, max)){
	// erroMessage=displayMsg+" "+boundedMsg4+" "+ min+" "+boundedMsg3;
	// }
	// return erroMessage;
	// }

	public void checkSizeValidation(String str, int min, int max,
			String displayMsg, List<String> errorList) {
		String erroMessage = null;
		if (ValidationUtils.isEmpty(str)) {
			erroMessage = displayMsg + " " + requiredMsg;
		} else if (!ValidationUtils.hasBoundedLength(str, min, max)) {
			erroMessage = displayMsg + " " + boundedMsg4 + " " + min + " "
					+ boundedMsg3;
		}
		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	// public String checkRequiredValidation(String str, String displayMsg){
	// String erroMessage=null;
	// if(ValidationUtils.isEmpty(str)){
	// erroMessage=selectMsg+" "+displayMsg;
	// }
	// return erroMessage;
	// }

	public void checkRequiredValidation(String str, String displayMsg,
			List<String> errorList) {
		String erroMessage = null;
		if (ValidationUtils.isEmpty(str)) {
			erroMessage = selectMsg + " " + displayMsg;
		}
		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public void checkRequiredValidation(Date date, String displayMsg,
			List<String> errorList) {
		String erroMessage = null;
		if (date != null) {
			if (ValidationUtils.isEmpty(date.toString())) {
				erroMessage = selectMsg + " " + displayMsg;
			}
		} else {
			erroMessage = "Please fill " + " " + displayMsg;
		}
		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public void checkEmailValidation(String str, String displayMsg,
			List<String> errorList) {
		String erroMessage = null;
		if (ValidationUtils.isEmpty(str)) {

		} else {
			Pattern p = Pattern.compile(EMAIL_VALIDATION_REGEX);
			Matcher m = p.matcher(str);
			if (!m.matches()) {
				erroMessage = displayMsg + " " + emailNotValid;
			}
		}

		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public void checkDateRangeValidation(Date originalAdmitDate,
			Date currentAdmitDate, Date dischargeDate, String displayMsg,
			String displayMsg1, String displayMsg2, List<String> errorList) {
		String erroMessage = null;
		if (DateDifference(originalAdmitDate, currentAdmitDate) < 0) {
			erroMessage = displayMsg + " " + compMsg + " " + displayMsg1;
		} else {
			if (DateDifference(originalAdmitDate, dischargeDate) >= 0) {
				erroMessage = displayMsg2 + " " + compMsg + " " + displayMsg;
			}
		}

		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public void checkDateRangeValidation(Date after, Date before,
			String displayMsg, String displayMsg1, List<String> errorList) {
		String erroMessage = null;
		if (DateDifference(after, before) <= 0) {
			erroMessage = displayMsg + " " + dateMsg + " " + compMsg + " "
					+ displayMsg1 + " " + dateMsg;
		}
		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

	public static int DateDifference(Date after, Date before) {
		return (int) ((after.getTime() - before.getTime()) / MILLSECS_PER_DAY);
	}

	public void checkWebsiteValidation(String str, String displayMsg,
			List<String> errorList) {
		String erroMessage = null;
		if (ValidationUtils.isEmpty(str)) {

		} else {
			Pattern p = Pattern.compile(WebsiteREGEX);
			Matcher m = p.matcher(str);
			if (!m.matches()) {
				erroMessage = displayMsg + " " + websiteNotValid;
			}
		}

		if (erroMessage != null) {
			errorList.add(erroMessage);
		}
	}

}
