package medrex.commons.vo.ra;

import java.io.Serializable;

import medrex.commons.intf.DataObject;

public class RAPg2Sec1 implements Serializable, DataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1994835162777102772L;
	private int rapg2Serial;
	private String state;

	public int getRapg2Serial() {
		return rapg2Serial;
	}

	public void setRapg2Serial(int rapg2Serial) {
		this.rapg2Serial = rapg2Serial;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
