package medrex.client.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author D S Naruka
 * 
 *         A Test Class to test Regex Patterns
 * 
 */
public class Test {

	private enum RegexPattern {
		ALPHA("Alphabets Only", "([A-za-z])*"), NUMERIC("Numeric Only",
				"([0-9])*"), ALPHA_NUMERIC("Alpha Numeric Only", "(.^[\\s])*"), ALPHA_SPACE(
				"Alphabets & Whitespaces", "([A-za-z\\s])*"), NUMERIC_SPACE(
				"Numeric & Whitespaces", "([0-9\\s])*"), ALPHA_NUMRIC_SPACE(
				"Alphab Numeric & Whitespaces", "(.)*");

		private String name;
		private String pattern;

		RegexPattern(String name, String pattern) {
			this.name = name;
			this.pattern = pattern;
		}

		public String getName() {
			return name;
		}

		public String getPattern() {
			return pattern;
		}
	}

	private static final String[] TEST_CASES = { "hello", "hello123",
			"@123abc", "", "h", "1234", "hello hi", "1234 bye", "12 12" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (RegexPattern regex : RegexPattern.values()) {
			System.out.println("Results for " + regex.getName()
					+ " with pattern " + regex.getPattern());
			System.out
					.println("========================================================================");
			Pattern p = Pattern.compile(regex.getPattern());
			for (String testCase : TEST_CASES) {
				Matcher m = p.matcher(testCase);
				System.out.println("Test Case: '" + testCase + "' Result: "
						+ ((m.matches()) ? "Passed" : "Failed"));
			}
			System.out.println();
		}
	}

}
