package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusOutOnPassReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4909596098283585069L;

	private int serial;

	private String oresidentid;

	private String oroom;

	private String ouser;

	private String ocount;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getOresidentid() {
		return oresidentid;
	}

	public void setOresidentid(String oresidentid) {
		this.oresidentid = oresidentid;
	}

	public String getOroom() {
		return oroom;
	}

	public void setOroom(String oroom) {
		this.oroom = oroom;
	}

	public String getOuser() {
		return ouser;
	}

	public void setOuser(String ouser) {
		this.ouser = ouser;
	}

	public String getOcount() {
		return ocount;
	}

	public void setOcount(String ocount) {
		this.ocount = ocount;
	}

}
