package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TreatmentRoutineRecordFormCol")
public class TreatmentRoutineRecordFormCol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5260078606046793507L;
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
	@Column(name = "treatmentRoutineRecordFormColSerial")
	private int treatmentRoutineRecordFormColSerial;
	@Column(name = "hour1")
	private String hour1;
	@Column(name = "hour2")
	private String hour2;
	@Column(name = "hour3")
	private String hour3;
	@Column(name = "hour4")
	private String hour4;

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

	public int getTreatmentRoutineRecordFormSerial() {
		return treatmentRoutineRecordFormSerial;
	}

	public void setTreatmentRoutineRecordFormSerial(
			int treatmentRoutineRecordFormSerial) {
		this.treatmentRoutineRecordFormSerial = treatmentRoutineRecordFormSerial;
	}

	public int getTreatmentRoutineRecordFormRowSerial() {
		return treatmentRoutineRecordFormRowSerial;
	}

	public void setTreatmentRoutineRecordFormRowSerial(
			int treatmentRoutineRecordFormRowSerial) {
		this.treatmentRoutineRecordFormRowSerial = treatmentRoutineRecordFormRowSerial;
	}

	public int getTreatmentRoutineRecordFormColSerial() {
		return treatmentRoutineRecordFormColSerial;
	}

	public void setTreatmentRoutineRecordFormColSerial(
			int treatmentRoutineRecordFormColSerial) {
		this.treatmentRoutineRecordFormColSerial = treatmentRoutineRecordFormColSerial;
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getHour3() {
		return hour3;
	}

	public void setHour3(String hour3) {
		this.hour3 = hour3;
	}

	public String getHour4() {
		return hour4;
	}

	public void setHour4(String hour4) {
		this.hour4 = hour4;
	}

}
