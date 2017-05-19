package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusAdmissionReportI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6098045501561647258L;

	private int serial;

	private String aresidentidsf;

	private String aroomsf;

	private String acomefromsf;

	private String ausersf;

	private String acountsf;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getAresidentidsf() {
		return aresidentidsf;
	}

	public void setAresidentidsf(String aresidentidsf) {
		this.aresidentidsf = aresidentidsf;
	}

	public String getAroomsf() {
		return aroomsf;
	}

	public void setAroomsf(String aroomsf) {
		this.aroomsf = aroomsf;
	}

	public String getAcomefromsf() {
		return acomefromsf;
	}

	public void setAcomefromsf(String acomefromsf) {
		this.acomefromsf = acomefromsf;
	}

	public String getAusersf() {
		return ausersf;
	}

	public void setAusersf(String ausersf) {
		this.ausersf = ausersf;
	}

	public String getAcountsf() {
		return acountsf;
	}

	public void setAcountsf(String acountsf) {
		this.acountsf = acountsf;
	}

}
