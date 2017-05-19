package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicationRoutineRecordFormRow")
public class MedicationRoutineRecordFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4402359936305128963L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "medicationRoutineRecordFormSerial")
	private int medicationRoutineRecordFormSerial;
	@Column(name = "medicationRoutineRecordFormRowSerial")
	private int medicationRoutineRecordFormRowSerial;
	@Column(name = "rxNumber")
	private String rxNumber;
	@Column(name = "orderDate")
	private Date orderDate;
	@Column(name = "medicationRoutine")
	private String medicationRoutine;

	public String getMedicationRoutine() {
		return medicationRoutine;
	}

	public void setMedicationRoutine(String medicationRoutine) {
		this.medicationRoutine = medicationRoutine;
	}

	public int getMedicationRoutineRecordFormRowSerial() {
		return medicationRoutineRecordFormRowSerial;
	}

	public void setMedicationRoutineRecordFormRowSerial(
			int medicationRoutineRecordFormRowSerial) {
		this.medicationRoutineRecordFormRowSerial = medicationRoutineRecordFormRowSerial;
	}

	public int getMedicationRoutineRecordFormSerial() {
		return medicationRoutineRecordFormSerial;
	}

	public void setMedicationRoutineRecordFormSerial(
			int medicationRoutineRecordFormSerial) {
		this.medicationRoutineRecordFormSerial = medicationRoutineRecordFormSerial;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getRxNumber() {
		return rxNumber;
	}

	public void setRxNumber(String rxNumber) {
		this.rxNumber = rxNumber;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
