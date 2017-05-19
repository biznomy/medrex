package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusHospitalReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3625501189889276972L;

	private int serial;

	private String hresidentid;

	private String hhospital;

	private String huser;

	private String hcount;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getHresidentid() {
		return hresidentid;
	}

	public void setHresidentid(String hresidentid) {
		this.hresidentid = hresidentid;
	}

	public String getHhospital() {
		return hhospital;
	}

	public void setHhospital(String hhospital) {
		this.hhospital = hhospital;
	}

	public String getHuser() {
		return huser;
	}

	public void setHuser(String huser) {
		this.huser = huser;
	}

	public String getHcount() {
		return hcount;
	}

	public void setHcount(String hcount) {
		this.hcount = hcount;
	}

}
