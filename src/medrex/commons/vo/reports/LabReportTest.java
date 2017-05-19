package medrex.commons.vo.reports;

import java.io.Serializable;

public class LabReportTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4412552861241304916L;
	String name;
	String result;
	String unit;
	String range;
	String outOfRange;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutOfRange() {
		return outOfRange;
	}

	public void setOutOfRange(String outOfRange) {
		this.outOfRange = outOfRange;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
