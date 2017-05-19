package medrex.commons.vo.tutorial.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TutRoom")
public class TutRoom {
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "hospName")
	private String hospName;

	public TutRoom() {

	}

	public TutRoom(String hospName) {
		this.hospName = hospName;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

}
