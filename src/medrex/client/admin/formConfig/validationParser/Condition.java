package medrex.client.admin.formConfig.validationParser;

public enum Condition {
	EMPTY(""), STARTS_WITH("Starts With"), ENDS_WITH("Ends With"), CONTAINS(
			"Contains"), NOT_CONTAINS("Not Contains"), EQUALS("Equals"), NOT_EQUALS(
			"Not Equals"), CHANGE("Change"), GREATER_THAN("Greater Than"), LESS_THAN(
			"Less Than"), LESS_THAN_EQUALS("Less Than Equals"), GREATER_THAN_EQUALS(
			"Greatre Than Equals");

	private String display;

	Condition(String displayStr) {
		this.display = displayStr;
	}

	@Override
	public String toString() {
		if (display != null) {
			return display;
		}
		return super.toString();
	}
}
