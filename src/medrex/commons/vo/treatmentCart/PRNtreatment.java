package medrex.commons.vo.treatmentCart;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.others.Users;

/**
 * 
 * @author Mayank Chandela This class is used to store information about the prn
 *         medications given to residents and its details.
 */

@Entity
@Table(name = "PRNtreatment")
public class PRNtreatment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "medSerial")
	private Long medSerial;

	@Column(name = "medicationName")
	private String medicationName;

	@Column(name = "dosage")
	private String dosage;

	@Column(name = "frequency")
	private int frequency;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "timeStamp")
	private Date timeStamp;

	@Column(name = "route")
	private String route;

	@OneToOne
	@JoinColumn(name = "userId")
	private Users user;

	@Column(name = "resonForPrn")
	private String resonForPrn;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public String getDosage() {
		return dosage;
	}

	public Long getMedSerial() {
		return medSerial;
	}

	public void setMedSerial(Long medSerial) {
		this.medSerial = medSerial;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getResonForPrn() {
		return resonForPrn;
	}

	public void setResonForPrn(String resonForPrn) {
		this.resonForPrn = resonForPrn;
	}

}
