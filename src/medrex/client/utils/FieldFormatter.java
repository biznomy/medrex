package medrex.client.utils;

/**
 *  Created by D S Naruka
 */

import java.util.regex.Pattern;

import medrex.client.utils.controls.RegexPatterFormatter;

public final class FieldFormatter {

	private FieldFormatter() {
	}

	public static RegexPatterFormatter ZIP = getNumberFormatter(9);
	public static RegexPatterFormatter IMP = getNumberFormatter(7);
	public static RegexPatterFormatter PIN = getFormatter("(\\w){0,1}(\\d){0,5}");
	public static RegexPatterFormatter GENERAL = getNumberFormatter(20);
	public static RegexPatterFormatter TXT = getFormatter("(\\w)+");
	public static RegexPatterFormatter FLOAT3Dizit = getNumberFormatter(3, 2);
	public static RegexPatterFormatter FLOAT3DizitWithPrec1 = getNumberFormatter(
			3, 1);
	public static RegexPatterFormatter FLOAT1Dizit = getNumberFormatter(1, 2);
	public static RegexPatterFormatter SSNUMBER = getNumberFormatter(9);
	public static RegexPatterFormatter KEY = getFormatter("([\\w\\d]){0,16}");
	/*
	 * public static RegexPatterFormatter EMAIL = GetFormatter(
	 * "([a-zA-Z/\\d_\\\\\\.]+@([a-zA-Z\\d_\\\\\\.]+)(\\.[a-zA-Z\\d]{0,4}))|([a-zA-Z/\\d_\\\\\\.]+@)"
	 * + "[\\d]{0,3}\\.[\\d]{0,3}\\.[\\d]{0,3}\\.[\\d]{0,3}");
	 */
	// public static RegexPatterFormatter LIMIT = getFormatter("[1-20]");
	public static RegexPatterFormatter MAX1 = getNumberFormatter(1);
	public static RegexPatterFormatter MAX2 = getNumberFormatter(2);
	public static RegexPatterFormatter MAX3 = getNumberFormatter(3);
	public static RegexPatterFormatter MAX4 = getNumberFormatter(4);
	public static RegexPatterFormatter MAX5 = getNumberFormatter(5);
	public static RegexPatterFormatter BP = getFormatter("[0-9/]{0,7}");

	public static RegexPatterFormatter getFormatter(String regex) {
		RegexPatterFormatter f = new RegexPatterFormatter(Pattern
				.compile(regex));
		f.setCommitsOnValidEdit(false);
		f.setOverwriteMode(false);
		f.setAllowsInvalid(false);
		return f;
	}

	public static RegexPatterFormatter getNumberFormatter(int noOfDigits) {
		return getNumberFormatter(noOfDigits, 0);
	}

	public static RegexPatterFormatter getNumberFormatter(int noOfDigits,
			int noOfPrecision) {
		String format = "";
		format += "(\\d){0," + noOfDigits + "}";
		format += (noOfPrecision > 0) ? "(\\.(\\d){0," + noOfPrecision
				+ "}){0," + (noOfPrecision + 1) + "}" : "";
		return getFormatter(format);
	}
}
