package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusAdmissionReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2524166766164553268L;

	private int serial;

	private String aresidentid;

	private String aroom;

	private String acomefrom;

	private String auser;

	private String acount;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getAresidentid() {
		return aresidentid;
	}

	public void setAresidentid(String aresidentid) {
		this.aresidentid = aresidentid;
	}

	public String getAroom() {
		return aroom;
	}

	public void setAroom(String aroom) {
		this.aroom = aroom;
	}

	public String getAcomefrom() {
		return acomefrom;
	}

	public void setAcomefrom(String acomefrom) {
		this.acomefrom = acomefrom;
	}

	public String getAuser() {
		return auser;
	}

	public void setAuser(String auser) {
		this.auser = auser;
	}

	public String getAcount() {
		return acount;
	}

	public void setAcount(String acount) {
		this.acount = acount;
	}

}
