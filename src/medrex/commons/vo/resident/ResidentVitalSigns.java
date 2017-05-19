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
import javax.persistence.Transient;

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "ResidentVitalSigns")
public class ResidentVitalSigns implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -530564823549901002L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Transient
	private double weight;

	@Column(name = "temprature")
	private double temprature;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "pulse")
	private int pulse;

	@Column(name = "bp")
	private String bp;

	@Column(name = "ambulation")
	private int ambulation;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "residentId")
	private int residentId;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "user")
	private Users user;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public double getTemprature() {
		return temprature;
	}

	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public int getAmbulation() {
		return ambulation;
	}

	public void setAmbulation(int ambulation) {
		this.ambulation = ambulation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}
