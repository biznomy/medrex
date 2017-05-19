package medrex.client.admin.formConfig.validationParser;

public enum Operator implements ConstraintItem {
	AND, OR, NOT;

	public String toValidationQuery() {
		return ValidationParser.OPERATOR_DELIMITER + this.toString()
				+ ValidationParser.OPERATOR_DELIMITER;
	}
}
