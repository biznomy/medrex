package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicationPRNRecordFormRow")
public class MedicationPRNRecordFormRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 933889070896200029L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "medicationPRNRecordFormSerial")
	private int medicationPRNRecordFormSerial;
	@Column(name = "medicationPRNRecordFormRowSerial")
	private int medicationPRNRecordFormRowSerial;
	@Column(name = "rxNumber")
	private String rxNumber;
	@Column(name = "orderDate")
	private Date orderDate;
	@Column(name = "medicationPRN")
	private String medicationPRN;

	public String getMedicationPRN() {
		return medicationPRN;
	}

	public void setMedicationPRN(String medicationPRN) {
		this.medicationPRN = medicationPRN;
	}

	public int getMedicationPRNRecordFormRowSerial() {
		return medicationPRNRecordFormRowSerial;
	}

	public void setMedicationPRNRecordFormRowSerial(
			int medicationPRNRecordFormRowSerial) {
		this.medicationPRNRecordFormRowSerial = medicationPRNRecordFormRowSerial;
	}

	public int getMedicationPRNRecordFormSerial() {
		return medicationPRNRecordFormSerial;
	}

	public void setMedicationPRNRecordFormSerial(
			int medicationPRNRecordFormSerial) {
		this.medicationPRNRecordFormSerial = medicationPRNRecordFormSerial;
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
