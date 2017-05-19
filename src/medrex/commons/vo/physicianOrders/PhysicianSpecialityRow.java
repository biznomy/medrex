package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianSpecialityRow")
public class PhysicianSpecialityRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6669537229098287839L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "physicianSpecialitySerial")
	private int physicianSpecialitySerial;
	@Column(name = "physicianSpecialityRowSerial")
	private int physicianSpecialityRowSerial;
	@Column(name = "medicationOrders")
	private String medicationOrders;
	@Column(name = "medicationTime")
	private String medicationTime;
	@Column(name = "medicationDate")
	private Date medicationDate;

	public Date getMedicationDate() {
		return medicationDate;
	}

	public void setMedicationDate(Date medicationDate) {
		this.medicationDate = medicationDate;
	}

	public String getMedicationOrders() {
		return medicationOrders;
	}

	public void setMedicationOrders(String medicationOrders) {
		this.medicationOrders = medicationOrders;
	}

	public String getMedicationTime() {
		return medicationTime;
	}

	public void setMedicationTime(String medicationTime) {
		this.medicationTime = medicationTime;
	}

	public int getPhysicianSpecialityRowSerial() {
		return physicianSpecialityRowSerial;
	}

	public void setPhysicianSpecialityRowSerial(int physicianSpecialityRowSerial) {
		this.physicianSpecialityRowSerial = physicianSpecialityRowSerial;
	}

	public int getPhysicianSpecialitySerial() {
		return physicianSpecialitySerial;
	}

	public void setPhysicianSpecialitySerial(int physicianSpecialitySerial) {
		this.physicianSpecialitySerial = physicianSpecialitySerial;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
