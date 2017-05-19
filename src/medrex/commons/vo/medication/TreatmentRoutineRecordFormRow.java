package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TreatmentRoutineRecordFormRow")
public class TreatmentRoutineRecordFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2811451789617760568L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "treatmentRoutineRecordFormSerial")
	private int treatmentRoutineRecordFormSerial;
	@Column(name = "treatmentRoutineRecordFormRowSerial")
	private int treatmentRoutineRecordFormRowSerial;
	@Column(name = "dcDate")
	private Date dcDate;
	@Column(name = "orderDate")
	private Date orderDate;
	@Column(name = "treatmentRoutine")
	private String treatmentRoutine;

	public String getTreatmentRoutine() {
		return treatmentRoutine;
	}

	public void setTreatmentRoutine(String treatmentRoutine) {
		this.treatmentRoutine = treatmentRoutine;
	}

	public int getTreatmentRoutineRecordFormRowSerial() {
		return treatmentRoutineRecordFormRowSerial;
	}

	public void setTreatmentRoutineRecordFormRowSerial(
			int treatmentRoutineRecordFormRowSerial) {
		this.treatmentRoutineRecordFormRowSerial = treatmentRoutineRecordFormRowSerial;
	}

	public int getTreatmentRoutineRecordFormSerial() {
		return treatmentRoutineRecordFormSerial;
	}

	public void setTreatmentRoutineRecordFormSerial(
			int treatmentRoutineRecordFormSerial) {
		this.treatmentRoutineRecordFormSerial = treatmentRoutineRecordFormSerial;
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

	public Date getDcDate() {
		return dcDate;
	}

	public void setDcDate(Date dcDate) {
		this.dcDate = dcDate;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
