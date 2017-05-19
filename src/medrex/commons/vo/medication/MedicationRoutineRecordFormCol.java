package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicationRoutineRecordFormCol")
public class MedicationRoutineRecordFormCol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2326730723095385577L;
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
	@Column(name = "medicationRoutineRecordFormColSerial")
	private int medicationRoutineRecordFormColSerial;

	String content1;
	String content2;
	String content3;
	String content4;
	String content5;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getMedicationRoutineRecordFormSerial() {
		return medicationRoutineRecordFormSerial;
	}

	public void setMedicationRoutineRecordFormSerial(
			int medicationRoutineRecordFormSerial) {
		this.medicationRoutineRecordFormSerial = medicationRoutineRecordFormSerial;
	}

	public int getMedicationRoutineRecordFormRowSerial() {
		return medicationRoutineRecordFormRowSerial;
	}

	public void setMedicationRoutineRecordFormRowSerial(
			int medicationRoutineRecordFormRowSerial) {
		this.medicationRoutineRecordFormRowSerial = medicationRoutineRecordFormRowSerial;
	}

	public int getMedicationRoutineRecordFormColSerial() {
		return medicationRoutineRecordFormColSerial;
	}

	public void setMedicationRoutineRecordFormColSerial(
			int medicationRoutineRecordFormColSerial) {
		this.medicationRoutineRecordFormColSerial = medicationRoutineRecordFormColSerial;
	}

	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public String getContent3() {
		return content3;
	}

	public void setContent3(String content3) {
		this.content3 = content3;
	}

	public String getContent4() {
		return content4;
	}

	public void setContent4(String content4) {
		this.content4 = content4;
	}

	public String getContent5() {
		return content5;
	}

	public void setContent5(String content5) {
		this.content5 = content5;
	}

}
