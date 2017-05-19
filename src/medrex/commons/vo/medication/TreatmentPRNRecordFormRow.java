package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TreatmentPRNRecordFormRow")
public class TreatmentPRNRecordFormRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6356137552562016934L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "treatmentPRNRecordFormSerial")
	private int treatmentPRNRecordFormSerial;
	@Column(name = "treatmentPRNRecordFormRowSerial")
	private int treatmentPRNRecordFormRowSerial;
	@Column(name = "dcDate")
	private Date dcDate;
	@Column(name = "orderDate")
	private Date orderDate;
	@Column(name = "treatmentPRN")
	private String treatmentPRN;

	public String getTreatmentPRN() {
		return treatmentPRN;
	}

	public void setTreatmentPRN(String treatmentPRN) {
		this.treatmentPRN = treatmentPRN;
	}

	public int getTreatmentPRNRecordFormRowSerial() {
		return treatmentPRNRecordFormRowSerial;
	}

	public void setTreatmentPRNRecordFormRowSerial(
			int treatmentPRNRecordFormRowSerial) {
		this.treatmentPRNRecordFormRowSerial = treatmentPRNRecordFormRowSerial;
	}

	public int getTreatmentPRNRecordFormSerial() {
		return treatmentPRNRecordFormSerial;
	}

	public void setTreatmentPRNRecordFormSerial(int treatmentPRNRecordFormSerial) {
		this.treatmentPRNRecordFormSerial = treatmentPRNRecordFormSerial;
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
