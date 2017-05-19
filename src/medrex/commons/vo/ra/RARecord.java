package medrex.commons.vo.ra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import medrex.commons.intf.DataObject;

@Entity
@Table(name = "RARecord")
public class RARecord implements Serializable, DataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8833592104470195311L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "rafp1Id")
	private int rafp1Id;
	@Column(name = "rafp2Id")
	private int rafp2Id;
	@Column(name = "formName")
	private String formName;

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public int getRafp1Id() {
		return rafp1Id;
	}

	public void setRafp1Id(int rafp1Id) {
		this.rafp1Id = rafp1Id;
	}

	public int getRafp2Id() {
		return rafp2Id;
	}

	public void setRafp2Id(int rafp2Id) {
		this.rafp2Id = rafp2Id;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

}
