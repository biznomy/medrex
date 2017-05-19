package medrex.client.utils.controls;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatter;

public class RegexPatterFormatter extends DefaultFormatter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4934805005288067407L;
	protected java.util.regex.Matcher matcher;

	public RegexPatterFormatter(java.util.regex.Pattern regex) {
		setOverwriteMode(false);
		matcher = regex.matcher(""); // create a Matcher for the regular
		// expression
	}

	@Override
	public Object stringToValue(String string) throws java.text.ParseException {
		if (string == null)
			return null;
		matcher.reset(string); // set 'string' as the matcher's input

		if (!matcher.matches()) // Does 'string' match the regular expression?
			throw new java.text.ParseException("does not match regex", 0);

		// If we get this far, then it did match.
		return super.stringToValue(string); // will honor the 'valueClass'
		// property
	}

	public static void main(String argv[]) {
		// a demo main() to show how RegexPatternFormatter could be used

		JLabel lab1 = new JLabel("even length strings:");
		java.util.regex.Pattern evenLength = java.util.regex.Pattern
				.compile("(..)*");
		JFormattedTextField ftf1 = new JFormattedTextField(
				new RegexPatterFormatter(evenLength));

		JLabel lab2 = new JLabel("no vowels:");
		java.util.regex.Pattern noVowels = java.util.regex.Pattern.compile("*");
		RegexPatterFormatter noVowelFormatter = new RegexPatterFormatter(
				noVowels);
		noVowelFormatter.setAllowsInvalid(false); // don't allow user to type
		// vowels
		JFormattedTextField ftf2 = new JFormattedTextField(noVowelFormatter);

		JFrame f = new JFrame("RegexPatternFormatter Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan1 = new JPanel(new java.awt.BorderLayout());
		pan1.add(lab1, java.awt.BorderLayout.WEST);
		pan1.add(ftf1, java.awt.BorderLayout.CENTER);
		lab1.setLabelFor(ftf1);
		f.getContentPane().add(pan1, java.awt.BorderLayout.NORTH);
		JPanel pan2 = new JPanel(new java.awt.BorderLayout());
		pan2.add(lab2, java.awt.BorderLayout.WEST);
		pan2.add(ftf2, java.awt.BorderLayout.CENTER);
		lab2.setLabelFor(ftf2);
		f.getContentPane().add(pan2, java.awt.BorderLayout.SOUTH);
		f.setSize(300, 80);
		f.setVisible(true);
	}

}