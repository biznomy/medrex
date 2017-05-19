package medrex.commons.enums;

import java.text.SimpleDateFormat;

public enum DateFormat {
	yyyyMMdd("yyyy/MM/dd"), ddMMyyyy("dd-MM-yyyy"), MMMddyyyy("MMM dd, yyyy");

	private String format;
	private SimpleDateFormat formatter;

	DateFormat(String format) {
		this.format = format;
		this.formatter = new SimpleDateFormat(format);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public SimpleDateFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
	}
}
