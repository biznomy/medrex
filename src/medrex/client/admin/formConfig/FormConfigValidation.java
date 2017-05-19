/**
 * 
 */
package medrex.client.admin.formConfig;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

import medrex.client.admin.formConfig.validationParser.AlphaType;
import medrex.client.admin.formConfig.validationParser.Condition;
import medrex.client.admin.formConfig.validationParser.ConstraintItem;
import medrex.client.admin.formConfig.validationParser.ConstraintSet;
import medrex.client.admin.formConfig.validationParser.Operand;
import medrex.client.admin.formConfig.validationParser.Operator;
import medrex.client.admin.formConfig.validationParser.ValidationParser;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MsgBox;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.admission.validation.FormFieldValidation;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.admission.validation.ValidationFormField;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

/**
 * @author User
 * 
 */
public class FormConfigValidation {
	/**
	 * A genric method to perform updations (i.e. enable or disable).
	 * 
	 * @param form
	 *            : the form on which updations are needed to be performed
	 */
	/* TODO: Needed to migrate in Form Config Validation API */
	public static void updateComponents(JPanel form) {
		Class formClass = form.getClass();
		ValidationForm validationForm = null;
		try {
			/*
			 * TODO: can directly retrieve from database but possible only if
			 * the server function is generalized
			 */
			validationForm = MedrexClientManager.getInstance()
					.getRaFPg1ValidationRecord(formClass.getName());
			if (validationForm != null) {
				List<ValidationFormField> vfieldSet = validationForm
						.getValidationFormFields();
				for (ValidationFormField field : vfieldSet) {
					Object comp = null;
					try {
						/* fetching field by reflection */
						Field f = formClass.getDeclaredField(field
								.getComponentName());

						boolean access = f.isAccessible();
						f.setAccessible(true);

						/* fetching component by reflection */
						comp = f.get(form);

						f.setAccessible(access);
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (comp != null) {
						List<FormFieldValidation> formfieldSet = field
								.getValidationFormFields();
						if (comp instanceof ButtonGroup) {
							SwingUtils.setEnabled((ButtonGroup) comp, false);
						} else {
							((JComponent) comp).setEnabled(false);
						}
						for (FormFieldValidation formFieldValidation : formfieldSet) {
							if (("Enabled".equalsIgnoreCase(formFieldValidation
									.getType()))
									&& (formFieldValidation.getPattern() == null)) {
								if (comp instanceof ButtonGroup) {
									SwingUtils.setEnabled((ButtonGroup) comp,
											true);
								} else {
									((JComponent) comp).setEnabled(true);
								}
								break;
							}
						}
					}
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * A genric method to perform validations.
	 * 
	 * @param form
	 *            : the form on which validation is needed to be performed
	 * @return boolean: if form is valid then true, false otherwise
	 */
	/* TODO: migrate this method Form Config Validation API package */
	public static boolean validate(JPanel form) {
		if (form == null) {
			throw new IllegalArgumentException("form can't be null");
		}

		boolean bool = false;
		Class formClass = form.getClass();
		ValidationForm validationForm = null;
		List<String> errors = new ArrayList<String>();
		try {
			/*
			 * TODO: can directly retrieve from database but possible only if
			 * the server function is generalized
			 */
			validationForm = MedrexClientManager.getInstance()
					.getRaFPg1ValidationRecord(formClass.getName());
			if (validationForm != null) {
				List<ValidationFormField> vfieldSet = validationForm
						.getValidationFormFields();
				for (ValidationFormField field : vfieldSet) {

					Object comp = null;
					try {
						/* fetching field by reflection */
						Field f = formClass.getDeclaredField(field
								.getComponentName());

						boolean access = f.isAccessible();
						f.setAccessible(true);

						/* fetching component by reflection */
						comp = f.get(form);

						f.setAccessible(access);
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (comp != null) {
						List<FormFieldValidation> formfieldSet = field
								.getValidationFormFields();
						for (FormFieldValidation fieldVal : formfieldSet) {

							/* Generalized for all Text Components */
							if (comp instanceof JTextComponent) {
								JTextComponent com = (JTextComponent) comp;
								String value = com.getText();
								int len = value.length();

								if (len == 0) {
									if ("Mandatory".equalsIgnoreCase(fieldVal
											.getType())) {
										errors.add(field.getLabelOfField()
												+ " is mandatory");
									}
								} else {
									if ("AlphaType".equalsIgnoreCase(fieldVal
											.getType())) {
										int alphaType = Integer
												.parseInt(fieldVal.getPattern());
										/* Alpha */
										if (alphaType == AlphaType.ALPHA
												.getValue()) {
											Pattern p = Pattern
													.compile(AlphaType.ALPHA
															.getPattern());
											Matcher m = p.matcher(com.getText()
													.trim());
											if (!m.matches()) {
												errors
														.add(field
																.getLabelOfField()
																+ " can contain alphabets only");
											}
										}
										/* Numeric */
										else if (alphaType == AlphaType.NUMERIC
												.getValue()) {
											/*
											 * TODO: Need to add decimal point
											 * validation
											 */
											Pattern p = Pattern
													.compile(AlphaType.NUMERIC
															.getPattern());
											Matcher m = p.matcher(com.getText()
													.trim());
											if (!m.matches()) {
												errors
														.add(field
																.getLabelOfField()
																+ " can contain digits only");
											}
										}
										/* AlphaNumeric */
										else if (alphaType == AlphaType.ALPHA_NUMERIC
												.getValue()) {
											/*
											 * any thing allowed, so no need to
											 * check, (including special chars)
											 */
											/*
											 * TODO: Will be implemented only in
											 * the case of AlphaNumeric Without
											 * Spaces
											 */
										}
									} else if ("Exact"
											.equalsIgnoreCase(fieldVal
													.getType())) {
										int val = Integer.parseInt(fieldVal
												.getPattern());
										if (len != val) {
											errors.add(field.getLabelOfField()
													+ " must be of "
													+ fieldVal.getPattern()
													+ " chars");
										}
									} else if ("Length"
											.equalsIgnoreCase(fieldVal
													.getType())) {
										int min = 0;
										int max = 0;

										String[] sets = fieldVal.getPattern()
												.split(",");
										if (sets != null && sets.length == 1) {
											int val = Integer.parseInt(sets[0]);
											min = val;
											max = val;
										}
										if (sets != null && sets.length == 2) {
											int val = Integer.parseInt(sets[0]);
											min = val;
											val = Integer.parseInt(sets[1]);
											max = val;
										}
										if (len < min || len > max) {
											errors.add(field.getLabelOfField()
													+ " between "
													+ fieldVal.getPattern());
										}
									}
								}
							}
							if (comp instanceof ButtonGroup) {
								ButtonGroup com = (ButtonGroup) comp;
								int value = SwingUtils.getSelectedButton(com);

								if (value == 0
										&& "Mandatory"
												.equalsIgnoreCase(fieldVal
														.getType())) {
									errors.add(field.getLabelOfField()
											+ " is mandatory");
								}
								/* Selected has been disabled */
								/*
								 * if(value == 0 &&
								 * "Selected".equalsIgnoreCase(fieldVal
								 * .getType())){
								 * errors.add(field.getLabelOfField
								 * ()+" must be selected"); }
								 */
							}
							if (comp instanceof JCheckBox) {
								JCheckBox com = (JCheckBox) comp;
								boolean value = com.isSelected();

								if (!value) {
									if ("Checked".equalsIgnoreCase(fieldVal
											.getType())) {
										errors.add(field.getLabelOfField()
												+ " must be checked");
									}
									if ("Mandatory".equalsIgnoreCase(fieldVal
											.getType())) {
										errors.add(field.getLabelOfField()
												+ " is mandatory");
									}
								}
							}
							if (comp instanceof JComboBox) {
								JComboBox com = (JComboBox) comp;
								Object value = com.getSelectedItem();

								if (value != null
										&& value.toString().trim().length() == 0) {
									if ("Mandatory".equalsIgnoreCase(fieldVal
											.getType())) {
										errors.add(field.getLabelOfField()
												+ " is mandatory");
									}
								}
							}
							if (comp instanceof JDateChooser) {
								JDateChooser com = (JDateChooser) comp;
								com.getDate();

								/* TODO: Date Validations */
							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Data Error !!!");
			m.setVisible(true);
			bool = false;
		} else {
			bool = true;
		}
		return bool;
	}

	public static void saveAlertMessages(String formName, JPanel form) {
		List<MessagesRecord> alertMsgs = createAlertMessages(formName, form);
		try {
			if (alertMsgs != null) {
				for (MessagesRecord alertMsg : alertMsgs) {
					MedrexClientManager.getInstance()
							.insertOrUpdateMessagesRecord(alertMsg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static List<MessagesRecord> createAlertMessages(String formName,
			JPanel form) {
		if (form == null) {
			throw new IllegalArgumentException("form can't be null");
		}

		Class formClass = form.getClass();
		ValidationForm validationForm = null;
		List<MessagesRecord> messagesToSend = new ArrayList<MessagesRecord>();
		/* contains receiverId, messages */
		Map<Integer, String> msgMap = new HashMap<Integer, String>();

		try {
			/*
			 * TODO: can directly retrieve from database but possible only if
			 * the server function is generalized
			 */
			validationForm = MedrexClientManager.getInstance()
					.getRaFPg1ValidationRecord(formClass.getName());
			if (validationForm != null) {
				List<ValidationFormField> vfieldSet = validationForm
						.getValidationFormFields();
				for (ValidationFormField field : vfieldSet) {

					Object comp = null;
					try {
						/* fetching field by reflection */
						Field f = formClass.getDeclaredField(field
								.getComponentName());

						boolean access = f.isAccessible();
						f.setAccessible(true);

						/* fetching component by reflection */
						comp = f.get(form);

						f.setAccessible(access);
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (comp != null) {
						FormConfigAlert formAlert = field.getAlert();
						List<FormFieldValidation> formfieldSet = field
								.getValidationFormFields();

						for (FormFieldValidation fieldVal : formfieldSet) {

							/* Generalized for all Text Components */
							if (comp instanceof JTextComponent) {
								JTextComponent com = (JTextComponent) comp;
								String value = com.getText();
								value.length();

								if ("Constraint".equalsIgnoreCase(fieldVal
										.getType())) {
									generateMessagesForConstraints(com, field,
											fieldVal, value, formAlert, msgMap);
								}

							}
							if (comp instanceof ButtonGroup) {
								ButtonGroup com = (ButtonGroup) comp;
								int value = SwingUtils.getSelectedButton(com);

								if ("Constraint".equalsIgnoreCase(fieldVal
										.getType())) {
									generateMessagesForConstraints(com, field,
											fieldVal, value + "", formAlert,
											msgMap);
								}
							}
							if (comp instanceof JComboBox) {
								JComboBox com = (JComboBox) comp;
								Object value = com.getSelectedItem();

								if ("Constraint".equalsIgnoreCase(fieldVal
										.getType())) {
									generateMessagesForConstraints(com, field,
											fieldVal, value + "", formAlert,
											msgMap);
								}
							}
							if (comp instanceof JCheckBox) {
								JCheckBox com = (JCheckBox) comp;
								boolean isSelected = com.isSelected();
								String value = "Unchecked";
								if (isSelected == true) {
									value = "Checked";
								}
								if ("Constraint".equalsIgnoreCase(fieldVal
										.getType())) {
									generateMessagesForConstraints(com, field,
											fieldVal, value + "", formAlert,
											msgMap);
								}
							}
							if (comp instanceof JDateChooser) {
								JDateChooser com = (JDateChooser) comp;
								com.getDate();

								/* TODO: Date Constraints */
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/* TODO: Resident retrival is specific, a way around needed. */
		ResidentMain resident = null;
		try {
			resident = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* Creating Alert Messages */
		/* TODO: Needed to generalize alert message creation */
		String header = "";
		header += "<B>" + formName + "</B><BR/>";
		if (resident != null) {
			header += "<B>Resident:</B> ";
			header += resident.getUserPass() + ", " + resident.getUserName();
			header += "<BR/>";
		}
		header += "<BR/><HR/>";
		header += "<BR/>";

		String footer = "";
		footer += "<BR/><HR/>";
		footer += "<BR/>";
		footer += "<B>User:</B> " + Global.currentLoggedInUserName + "<BR/>";
		footer += "<B>Date:</B> " + new Date();

		Date sendingTime = new Date();

		for (Entry<Integer, String> entry : msgMap.entrySet()) {
			MessagesRecord msgRec = new MessagesRecord();
			msgRec.setReceiverId(entry.getKey());
			msgRec.setSenderId(Global.currentLoggedInUserKey);
			msgRec.setMessage("<div style='padding:10px;'>" + header
					+ entry.getValue() + footer + "</div>");
			msgRec.setSubject(formName + " Alerts !!!");
			msgRec.setTimeRecord(sendingTime);
			msgRec.setNew(true);
			msgRec.setType("Alert");
			messagesToSend.add(msgRec);
		}

		return messagesToSend;
	}

	private static void generateMessagesForConstraints(Object com,
			ValidationFormField field, FormFieldValidation fieldVal,
			String value, FormConfigAlert formAlert, Map<Integer, String> msgMap) {
		boolean resolvedValue = resolveConstraintValue(fieldVal, value,
				formAlert);

		/* creating value if condition matches */
		if (resolvedValue) {
			ValidationParser parser = new ValidationParser();
			ConstraintSet cSet = parser.parse(fieldVal.getPattern());

			/* create Alert Message */
			String strMsg = "";
			String lbl = "" + field.getLabelOfField();
			strMsg += "Field <B>'" + lbl.trim() + "'</B> with value <B>'"
					+ value + "'</B> matches the following criteria:<BR/>";
			if (com instanceof ButtonGroup) {
				String conMsg = "";
				ButtonGroup comp = (ButtonGroup) com;
				Iterator<ConstraintItem> iterator = cSet.getIterator();
				while (iterator.hasNext()) {
					ConstraintItem obj = iterator.next();
					if (obj instanceof Operand) {
						Operand op = (Operand) obj;
						String val = op.getValue();
						int actionCommand = Integer.parseInt(val);
						AbstractButton button = SwingUtils.getButton(comp,
								actionCommand);
						conMsg += op.getCondition() + " "
								+ ((button != null) ? button.getText() : val);
					} else {
						conMsg += " " + obj.toString() + " ";
					}

				}
				strMsg += conMsg;
			} else {
				strMsg += cSet.toString();
			}
			strMsg += "<BR/>";

			msgMap = addMessagesToMap(msgMap, formAlert, strMsg);
		}
	}

	private static boolean resolveConstraintValue(FormFieldValidation fieldVal,
			String value, FormConfigAlert formAlert) {
		if ("Constraint".equalsIgnoreCase(fieldVal.getType())
				&& (("".equalsIgnoreCase(formAlert.getRecieverUser())) || (""
						.equalsIgnoreCase(formAlert.getRecieverDepartment())))) {

			ValidationParser parser = new ValidationParser();
			ConstraintSet cSet = parser.parse(fieldVal.getPattern());
			List<ConstraintItem> cList = cSet.getItems();

			/* for 1st condition */
			boolean resolvedValue = false;
			if (!cList.isEmpty()) {
				ConstraintItem item = cList.get(0);
				if (item instanceof Operand) {
					Operand operand = (Operand) item;
					resolvedValue = resolveValueForOperand(operand, value);
				}
				cList.remove(0);
			}

			/* for the rest of conditions */
			Operator lastOp = null;
			while (!cList.isEmpty()) {
				ConstraintItem item = cList.get(0);
				if (item instanceof Operator) {
					lastOp = (Operator) item;
					cList.remove(0);
				}
				if (item instanceof Operand) {
					Operand operand = (Operand) item;
					boolean conditionTestResult = false;
					conditionTestResult = resolveValueForOperand(operand, value);

					if (Operator.AND == lastOp) {
						resolvedValue &= conditionTestResult;
					} else if (Operator.OR == lastOp) {
						resolvedValue |= conditionTestResult;
					}
					cList.remove(0);
				}
			}

			return resolvedValue;
		}
		return false;
	}

	private static boolean resolveValueForOperand(Operand operand, String value) {
		boolean resolvedValue = false;

		if (Condition.STARTS_WITH == operand.getCondition()) {
			resolvedValue = value.startsWith(operand.getValue());
		} else if (Condition.ENDS_WITH == operand.getCondition()) {
			resolvedValue = value.endsWith(operand.getValue());
		} else if (Condition.CONTAINS == operand.getCondition()) {
			resolvedValue = value.contains(operand.getValue());
		} else if (Condition.NOT_CONTAINS == operand.getCondition()) {
			resolvedValue = !value.contains(operand.getValue());
		} else if (Condition.EQUALS == operand.getCondition()) {
			resolvedValue = (value.equals(operand.getValue()));
		} else if (Condition.NOT_EQUALS == operand.getCondition()) {
			resolvedValue = (!value.equals(operand.getValue()));
		} else if (Condition.GREATER_THAN == operand.getCondition()) {
			if ((!"".equalsIgnoreCase(value))
					&& !("".equalsIgnoreCase(operand.getValue()))) {
				int valueToBeChecked = Integer.parseInt(value);
				int OperandValue = Integer.parseInt((operand.getValue()));
				if (valueToBeChecked > OperandValue) {
					resolvedValue = true;
				}
			}
		} else if (Condition.GREATER_THAN_EQUALS == operand.getCondition()) {
			if ((!"".equalsIgnoreCase(value))
					&& !("".equalsIgnoreCase(operand.getValue()))) {
				int valueToBeChecked = Integer.parseInt(value);
				int OperandValue = Integer.parseInt((operand.getValue()));
				if (valueToBeChecked >= OperandValue) {
					resolvedValue = true;
				}
			}
		} else if (Condition.LESS_THAN == operand.getCondition()) {
			if ((!"".equalsIgnoreCase(value))
					&& !("".equalsIgnoreCase(operand.getValue()))) {
				int valueToBeChecked = Integer.parseInt(value);
				int OperandValue = Integer.parseInt((operand.getValue()));
				if (valueToBeChecked < OperandValue) {
					resolvedValue = true;
				}
			}
		} else if (Condition.LESS_THAN_EQUALS == operand.getCondition()) {
			if ((!"".equalsIgnoreCase(value))
					&& !("".equalsIgnoreCase(operand.getValue()))) {
				int valueToBeChecked = Integer.parseInt(value);
				int OperandValue = Integer.parseInt((operand.getValue()));
				if (valueToBeChecked <= OperandValue) {
					resolvedValue = true;
				}
			}
		}

		return resolvedValue;
	}

	private static Map<Integer, String> addMessagesToMap(
			Map<Integer, String> msgMap, FormConfigAlert formAlert, String msg) {
		Set<Integer> receivers = new HashSet<Integer>();

		String receiverIds = formAlert.getRecieverUser();
		if (receiverIds != null && receiverIds.length() > 0) {
			String[] rIds = receiverIds.split(",");
			for (String rId : rIds) {
				int id = Integer.parseInt(rId.trim());
				receivers.add(id);
			}
		}

		receiverIds = formAlert.getRecieverDepartment();
		if (receiverIds != null && receiverIds.length() > 0) {
			String[] rIds = receiverIds.split(",");
			for (String rId : rIds) {
				int id = Integer.parseInt(rId.trim());
				receivers.add(id);
			}
		}

		for (Integer id : receivers) {
			String prevMsg = "";
			if (msgMap.containsKey(id)) {
				prevMsg += msgMap.get(id);
				prevMsg += "<BR />";
			}
			prevMsg += msg;
			msgMap.put(id, prevMsg);
		}

		return msgMap;
	}
}
