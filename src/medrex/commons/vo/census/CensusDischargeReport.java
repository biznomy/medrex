package medrex.commons.vo.census;

import java.io.Serializable;

public class CensusDischargeReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5227900836088927690L;

	private int serial;

	private String dresidentid;

	private String droom;

	private String dwentto;

	private String duser;

	private String dcount;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDresidentid() {
		return dresidentid;
	}

	public void setDresidentid(String dresidentid) {
		this.dresidentid = dresidentid;
	}

	public String getDroom() {
		return droom;
	}

	public void setDroom(String droom) {
		this.droom = droom;
	}

	public String getDwentto() {
		return dwentto;
	}

	public void setDwentto(String dwentto) {
		this.dwentto = dwentto;
	}

	public String getDuser() {
		return duser;
	}

	public void setDuser(String duser) {
		this.duser = duser;
	}

	public String getDcount() {
		return dcount;
	}

	public void setDcount(String dcount) {
		this.dcount = dcount;
	}

}
