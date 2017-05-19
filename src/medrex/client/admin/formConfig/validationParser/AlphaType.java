/**
 * 
 */
package medrex.client.admin.formConfig.validationParser;

/**
 * @author D S Naruka
 * 
 */
public enum AlphaType {
	ALPHA(1, "Alpha", "([a-zA-z])*"), NUMERIC(2, "Numeric", "([0-9])*"), ALPHA_NUMERIC(
			3, "Alpha Numeric", "(.^[\\s])*"), ALPHA_WITH_SPACES(4,
			"Alpha (including whitespaces)", "([a-zA-z\\s])*"), NUMERIC_WITH_SPACES(
			5, "Numeric (including whitespaces)", "([0-9\\s])*"), ALPHA_NUMERIC_SPACES(
			6, "Alpha Numeric (including whitespaces)", "(.)*");

	private int value;
	private String displayText;
	private String pattern;

	AlphaType(int value, String displayText, String regexPattern) {
		this.value = value;
		this.displayText = displayText;
		this.pattern = regexPattern;
	}

	public int getValue() {
		return value;
	}

	public String getDisplayText() {
		return displayText;
	}

	public String getPattern() {
		return pattern;
	}
}
