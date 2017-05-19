package medrex.client.admin.formConfig.validationParser;

public class Operand implements ConstraintItem {
	public Operand() {

	}

	private Condition condition;
	private String value;

	@Override
	public String toString() {
		return getCondition() + " " + getValue();
	}

	public String toValidationQuery() {
		return ValidationParser.CONDITION_DELIMITER + getCondition()
				+ ValidationParser.CONDITION_DELIMITER + ValidationParser.TOKEN
				+ ValidationParser.VALUE_DELIMITER1 + getValue()
				+ ValidationParser.VALUE_DELIMITER2;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}