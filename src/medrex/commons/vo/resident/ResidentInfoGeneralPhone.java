package medrex.commons.vo.resident;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentInfoGeneralPhone")
public class ResidentInfoGeneralPhone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3013016544169245016L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "phoneType")
	private String phoneType;
	@Column(name = "phonePrimary")
	private boolean phonePrimary;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public boolean isPhonePrimary() {
		return this.phonePrimary;
	}

	public void setPhonePrimary(boolean phonePrimary) {
		this.phonePrimary = phonePrimary;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
