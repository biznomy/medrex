package medrex.commons.vo.resident;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.masterList.PhoneType;

@Entity
@Table(name = "ResidentContactPhone")
public class ResidentContactPhone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8605931177353581414L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contactId")
	private ResidentContact contactId;

	// @Column(name = "contactId")
	// private int contactId;

	@Column(name = "number")
	private String number;

	@OneToOne
	@JoinColumn(name = "type")
	private PhoneType type;

	@Column(name = "isPrimary")
	private int isPrimary;

	public int getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(int isPrimary) {
		this.isPrimary = isPrimary;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public ResidentContact getContactId() {
		return contactId;
	}

	public void setContactId(ResidentContact contactId) {
		this.contactId = contactId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneType getType() {
		return type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

}
