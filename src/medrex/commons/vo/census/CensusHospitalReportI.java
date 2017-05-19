package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusHospitalReportI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2357435721391056024L;

	private int serial;

	private String hresidentidsf;

	private String hhospitalsf;

	private String husersf;

	private String hcountsf;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getHresidentidsf() {
		return hresidentidsf;
	}

	public void setHresidentidsf(String hresidentidsf) {
		this.hresidentidsf = hresidentidsf;
	}

	public String getHhospitalsf() {
		return hhospitalsf;
	}

	public void setHhospitalsf(String hhospitalsf) {
		this.hhospitalsf = hhospitalsf;
	}

	public String getHusersf() {
		return husersf;
	}

	public void setHusersf(String husersf) {
		this.husersf = husersf;
	}

	public String getHcountsf() {
		return hcountsf;
	}

	public void setHcountsf(String hcountsf) {
		this.hcountsf = hcountsf;
	}

}
