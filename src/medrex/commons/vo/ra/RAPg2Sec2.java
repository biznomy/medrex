package medrex.commons.vo.ra;

import java.io.Serializable;
import java.util.Date;

import medrex.commons.intf.DataObject;

public class RAPg2Sec2 implements Serializable, DataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1121663168691174770L;
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
