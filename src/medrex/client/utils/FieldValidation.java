package medrex.client.utils;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import medrex.client.utils.controls.PhoneField;
import medrex.client.utils.controls.SsnField;

import com.jgoodies.validation.ValidationMessage;
import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.PropertyValidationSupport;
import com.jgoodies.validation.util.ValidationUtils;
import com.toedter.calendar.JDateChooser;

public final class FieldValidation {
	/*
	 * public static String EMAIL_VALIDATION_REGEX =
	 * "([a-zA-Z/\\d_\\\\\\.]+@([a-zA-Z\\d_\\\\\\.]+)"+
	 * "(\\.[a-zA-Z\\d]{2,4}))|([a-zA-Z/\\d_\\\\\\.]+@)"+
	 * "[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}";
	 */public static String EMAIL_VALIDATION_REGEX = "[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.(?:[A-Z]{2}|com|org|net|gov|mil|biz|info|mobi|name|aero|jobs|museum|co\\.(in|uk|jp|us))";

	public static boolean isNull(Object o) {
		if (o == null) {
			return true;
		} else {
			return false;
		}
	}

	/** ButtonGroup Validation */
	public static ValidationResult isAnySelected(ButtonGroup bg, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(bg, name);
		if (SwingUtils.getSelectedButton(bg) == 0)
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isAnySelected(JComboBox cmb, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(cmb,
				name);
		// if(cmb.getSelectedItem() == null) supp.addError(name,
		// "is mandatory");
		if (ValidationUtils.isEmpty((String) cmb.getSelectedItem()))
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyField(JTextComponent f, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isNonEmpty(JTextComponent f, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyDate(JDateChooser f, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (f.getDate() == null)
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyAlphaNumericField(
			JTextComponent f, String name, int min, int max) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isAlphanumeric(f.getText()))
			supp.addError(name, "must contain alphabets and numerals only");
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyAlphaField(JTextField f,
			String name, int min, int max) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isAlphaSpace(f.getText()))
			supp.addError(name, "must contain alphabets only");
		if (!ValidationUtils.hasBoundedLength(f.getText(), min, max))
			supp.addWarning(name, "length must be [" + min + "-" + max + "]");
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyNumericField(JTextField f,
			String name, int min, int max) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isNumeric(f.getText()))
			supp.addError(name, "must be numeric");
		else {
			System.out.println("text  is:" + f.getText());
			if ((Double.parseDouble(f.getText()) >= min)
					&& (Double.parseDouble(f.getText()) <= max))
				supp.addWarning(name, "must be between [" + min + "-" + max
						+ "]");
		}
		return supp.getResult();
	}

	public static ValidationResult isNumericFieldWithRange(JTextField f,
			String name, int min, int max) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (!("".equalsIgnoreCase(f.getText()))) {
			double value = Double.parseDouble(f.getText());
			// System.out.println("Value is:"+value);

			if (!((value > min) && (value < max)))
				supp.addWarning("Value " + value + " for the Field " + name,
						"is not between [" + min + "-" + max + "]");
		}

		return supp.getResult();
	}

	public static ValidationResult isNumericFieldWithMinimumRange(JTextField f,
			String name, int min) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (!("".equalsIgnoreCase(f.getText()))) {
			double value = Double.parseDouble(f.getText());
			if (!((value > min)))
				supp.addWarning("Value " + value + " for the Field " + name,
						"must Not Be Less Than " + min);
		}
		return supp.getResult();
	}

	public static ValidationResult isNonEmptyZip(JTextField f, String name,
			int len) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getText()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isNumeric(f.getText()))
			supp.addError(name, "must contain digits only");
		if (!ValidationUtils.hasBoundedLength(f.getText(), len, len))
			supp.addWarning(name, "can only be of " + len + " digits");
		return supp.getResult();
	}

	public static ValidationResult isNonEmpty(PhoneField f, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getNumber()))
			supp.addError(name, "is mandatory");
		return supp.getResult();
	}

	public static ValidationResult isValidPhone(PhoneField f, String name,
			int len) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getNumber()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isNumeric(f.getNumber()))
			supp.addError(name, "must be numeric");

		if (!ValidationUtils.hasBoundedLength(f.getNumber(), len, len))
			supp.addWarning(name, "can only be of " + len + "digits");

		return supp.getResult();
	}

	public static ValidationResult isValidSSNumber(SsnField f, String name,
			int len) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (ValidationUtils.isEmpty(f.getNumber()))
			supp.addError(name, "is mandatory");
		if (!ValidationUtils.isNumeric(f.getNumber()))
			supp.addError(name, "must be numeric");

		if (!ValidationUtils.hasBoundedLength(f.getNumber(), len, len))
			supp.addWarning(name, "can only be of " + len + "digits");

		return supp.getResult();
	}

	public static ValidationResult isNonEmptyEmail(JTextComponent com,
			String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(com,
				name);
		Pattern p = Pattern.compile(EMAIL_VALIDATION_REGEX);
		Matcher m = p.matcher(com.getText());
		if (ValidationUtils.isEmpty(com.getText()))
			supp.addError(name, "is mandatory");
		if (!m.matches()) {
			supp.addError(name, "is not valid email address");
		}
		return supp.getResult();
	}

	public static ValidationResult isEmail(JTextComponent com, String name) {
		PropertyValidationSupport supp = new PropertyValidationSupport(com,
				name);
		Pattern p = Pattern.compile(EMAIL_VALIDATION_REGEX);
		Matcher m = p.matcher(com.getText());
		if (!m.matches()) {
			supp.addError(name, "is not valid email address");
		}
		return supp.getResult();
	}

	public static String getMessages(List<ValidationMessage> resList) {
		String retStr = "";
		Iterator i = resList.iterator();
		while (i.hasNext()) {
			retStr += ((ValidationMessage) i.next()).formattedText();
		}
		return retStr;
	}

	public static boolean isEmpty(String str) {
		return ValidationUtils.isEmpty(str);
	}

	public static boolean isEmpty(ValidationResult vr) {
		return !vr.hasMessages();
	}

	public static boolean isNotEmpty(String str) {
		return ValidationUtils.isNotEmpty(str);
	}

	public static void Msgbox(ValidationResult vr, String title) {
		MsgBox m = new MsgBox();
		m.setTitle(title);
		m.addValidationResult(vr);
		m.setVisible(true);
	}

	public static void Msgbox(String prompt, String title) {
		MsgBox m = new MsgBox();
		m.setTitle(title);
		m.addPrompt(prompt);
		m.setVisible(true);
	}
}
