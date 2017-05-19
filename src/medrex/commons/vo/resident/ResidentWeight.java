package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "ResidentWeight")
public class ResidentWeight implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8684679162913226892L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "weight")
	private double weight;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "dateOfCreation")
	private Date dateOfCreation;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "user")
	private Users user;

	@Column(name = "ambulationType")
	private int ambulationType;

	public int getAmbulationType() {
		return ambulationType;
	}

	public void setAmbulationType(int ambulationType) {
		this.ambulationType = ambulationType;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}
