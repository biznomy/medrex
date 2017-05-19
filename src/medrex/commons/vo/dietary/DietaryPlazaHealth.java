package medrex.commons.vo.dietary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DietaryPlazaHealth")
public class DietaryPlazaHealth implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2191204524783289640L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "physicianName")
	private String physicianName;
	@Column(name = "roomNo")
	private String roomNo;
	@Column(name = "residentName")
	private String residentName;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
