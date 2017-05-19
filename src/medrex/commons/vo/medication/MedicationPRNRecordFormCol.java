package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicationPRNRecordFormCol")
public class MedicationPRNRecordFormCol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -204097554249867795L;
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
	@Column(name = "medicationPRNRecordFormColSerial")
	private int medicationPRNRecordFormColSerial;
	@Column(name = "dateRecord")
	private String dateRecord;
	@Column(name = "hour")
	private String hour;
	@Column(name = "initial")
	private String initial;
	@Column(name = "result")
	private String result;
	@Column(name = "obs")
	private String obs;

	public String getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(String dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getMedicationPRNRecordFormColSerial() {
		return medicationPRNRecordFormColSerial;
	}

	public void setMedicationPRNRecordFormColSerial(
			int medicationPRNRecordFormColSerial) {
		this.medicationPRNRecordFormColSerial = medicationPRNRecordFormColSerial;
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

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
