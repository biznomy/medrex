package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusDischargeReportI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -858063417697121364L;

	private int serial;

	private String dresidentidsf;

	private String droomsf;

	private String dwenttosf;

	private String dusersf;

	private String dcountsf;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDresidentidsf() {
		return dresidentidsf;
	}

	public void setDresidentidsf(String dresidentidsf) {
		this.dresidentidsf = dresidentidsf;
	}

	public String getDroomsf() {
		return droomsf;
	}

	public void setDroomsf(String droomsf) {
		this.droomsf = droomsf;
	}

	public String getDwenttosf() {
		return dwenttosf;
	}

	public void setDwenttosf(String dwenttosf) {
		this.dwenttosf = dwenttosf;
	}

	public String getDusersf() {
		return dusersf;
	}

	public void setDusersf(String dusersf) {
		this.dusersf = dusersf;
	}

	public String getDcountsf() {
		return dcountsf;
	}

	public void setDcountsf(String dcountsf) {
		this.dcountsf = dcountsf;
	}

}
