package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusOutOnPassReportI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1381515847507794666L;

	private int serial;

	private String oresidentidsf;

	private String oroomsf;

	private String ousersf;

	private String ocountsf;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getOresidentidsf() {
		return oresidentidsf;
	}

	public void setOresidentidsf(String oresidentidsf) {
		this.oresidentidsf = oresidentidsf;
	}

	public String getOroomsf() {
		return oroomsf;
	}

	public void setOroomsf(String oroomsf) {
		this.oroomsf = oroomsf;
	}

	public String getOusersf() {
		return ousersf;
	}

	public void setOusersf(String ousersf) {
		this.ousersf = ousersf;
	}

	public String getOcountsf() {
		return ocountsf;
	}

	public void setOcountsf(String ocountsf) {
		this.ocountsf = ocountsf;
	}

}
