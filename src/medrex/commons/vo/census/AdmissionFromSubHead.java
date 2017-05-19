package medrex.commons.vo.census;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AdmissionFromSubHead")
public class AdmissionFromSubHead implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 663282882463727419L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "headId")
	private int headId;
	@Column(name = "name")
	private String name;

	public int getHeadId() {
		return this.headId;
	}

	public void setHeadId(int headId) {
		this.headId = headId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
