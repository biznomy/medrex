package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TreatmentPRNRecordFormCol")
public class TreatmentPRNRecordFormCol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4277092692295759286L;
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
	@Column(name = "treatmentPRNRecordFormColSerial")
	private int treatmentPRNRecordFormColSerial;
	@Column(name = "hour1")
	private String hour1;
	@Column(name = "initial1")
	private String initial1;
	@Column(name = "hour2")
	private String hour2;
	@Column(name = "initial2")
	private String initial2;

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

	public int getTreatmentPRNRecordFormSerial() {
		return treatmentPRNRecordFormSerial;
	}

	public void setTreatmentPRNRecordFormSerial(int treatmentPRNRecordFormSerial) {
		this.treatmentPRNRecordFormSerial = treatmentPRNRecordFormSerial;
	}

	public int getTreatmentPRNRecordFormRowSerial() {
		return treatmentPRNRecordFormRowSerial;
	}

	public void setTreatmentPRNRecordFormRowSerial(
			int treatmentPRNRecordFormRowSerial) {
		this.treatmentPRNRecordFormRowSerial = treatmentPRNRecordFormRowSerial;
	}

	public int getTreatmentPRNRecordFormColSerial() {
		return treatmentPRNRecordFormColSerial;
	}

	public void setTreatmentPRNRecordFormColSerial(
			int treatmentPRNRecordFormColSerial) {
		this.treatmentPRNRecordFormColSerial = treatmentPRNRecordFormColSerial;
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getInitial1() {
		return initial1;
	}

	public void setInitial1(String initial1) {
		this.initial1 = initial1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getInitial2() {
		return initial2;
	}

	public void setInitial2(String initial2) {
		this.initial2 = initial2;
	}

}
