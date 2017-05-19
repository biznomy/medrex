package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PtOtStTreatment")
public class PtOtStTreatment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5467109324667357180L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "healthCareB")
	private String healthCareB;
	@Column(name = "procedure")
	private String procedure;
	@Column(name = "unitRoom")
	private String unitRoom;
	@Column(name = "resident")
	private String resident;
	@Column(name = "witnessTimeC")
	private String witnessTimeC;
	@Column(name = "witnessDateC")
	private Date witnessDateC;
	@Column(name = "witnessSignC")
	private String witnessSignC;
	@Column(name = "staffTimeC")
	private String staffTimeC;
	@Column(name = "staffdateC")
	private Date staffdateC;
	@Column(name = "staffSignC")
	private String staffSignC;
	@Column(name = "relationC")
	private String relationC;
	@Column(name = "verbalC")
	private String verbalC;
	@Column(name = "nameC")
	private String nameC;
	@Column(name = "verbalTimeC")
	private String verbalTimeC;
	@Column(name = "verbalDateC")
	private Date verbalDateC;
	@Column(name = "witnessSignB")
	private String witnessSignB;
	@Column(name = "relationToPatientB")
	private String relationToPatientB;
	@Column(name = "witnessTimeB")
	private String witnessTimeB;
	@Column(name = "witnessDateB")
	private Date witnessDateB;
	@Column(name = "timeB")
	private String timeB;
	@Column(name = "healthDateB")
	private Date healthDateB;
	@Column(name = "witnessTimeA")
	private String witnessTimeA;
	@Column(name = "witnessDateA")
	private Date witnessDateA;
	@Column(name = "witnessSignA")
	private String witnessSignA;
	@Column(name = "patientTimeA")
	private String patientTimeA;
	@Column(name = "patientDateA")
	private Date patientDateA;
	@Column(name = "patientSignA")
	private String patientSignA;
	@Column(name = "doctor")
	private String doctor;
	@Column(name = "patientName")
	private String patientName;

	public String getHealthCareB() {
		return this.healthCareB;
	}

	public void setHealthCareB(String healthCareB) {
		this.healthCareB = healthCareB;
	}

	public String getProcedure() {
		return this.procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getUnitRoom() {
		return this.unitRoom;
	}

	public void setUnitRoom(String unitRoom) {
		this.unitRoom = unitRoom;
	}

	public String getResident() {
		return this.resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getWitnessTimeC() {
		return this.witnessTimeC;
	}

	public void setWitnessTimeC(String witnessTimeC) {
		this.witnessTimeC = witnessTimeC;
	}

	public Date getWitnessDateC() {
		return this.witnessDateC;
	}

	public void setWitnessDateC(Date witnessDateC) {
		this.witnessDateC = witnessDateC;
	}

	public String getWitnessSignC() {
		return this.witnessSignC;
	}

	public void setWitnessSignC(String witnessSignC) {
		this.witnessSignC = witnessSignC;
	}

	public String getStaffTimeC() {
		return this.staffTimeC;
	}

	public void setStaffTimeC(String staffTimeC) {
		this.staffTimeC = staffTimeC;
	}

	public Date getStaffdateC() {
		return this.staffdateC;
	}

	public void setStaffdateC(Date staffdateC) {
		this.staffdateC = staffdateC;
	}

	public String getStaffSignC() {
		return this.staffSignC;
	}

	public void setStaffSignC(String staffSignC) {
		this.staffSignC = staffSignC;
	}

	public String getRelationC() {
		return this.relationC;
	}

	public void setRelationC(String relationC) {
		this.relationC = relationC;
	}

	public String getVerbalC() {
		return this.verbalC;
	}

	public void setVerbalC(String verbalC) {
		this.verbalC = verbalC;
	}

	public String getNameC() {
		return this.nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getVerbalTimeC() {
		return this.verbalTimeC;
	}

	public void setVerbalTimeC(String verbalTimeC) {
		this.verbalTimeC = verbalTimeC;
	}

	public Date getVerbalDateC() {
		return this.verbalDateC;
	}

	public void setVerbalDateC(Date verbalDateC) {
		this.verbalDateC = verbalDateC;
	}

	public String getWitnessSignB() {
		return this.witnessSignB;
	}

	public void setWitnessSignB(String witnessSignB) {
		this.witnessSignB = witnessSignB;
	}

	public String getRelationToPatientB() {
		return this.relationToPatientB;
	}

	public void setRelationToPatientB(String relationToPatientB) {
		this.relationToPatientB = relationToPatientB;
	}

	public String getWitnessTimeB() {
		return this.witnessTimeB;
	}

	public void setWitnessTimeB(String witnessTimeB) {
		this.witnessTimeB = witnessTimeB;
	}

	public Date getWitnessDateB() {
		return this.witnessDateB;
	}

	public void setWitnessDateB(Date witnessDateB) {
		this.witnessDateB = witnessDateB;
	}

	public String getTimeB() {
		return this.timeB;
	}

	public void setTimeB(String timeB) {
		this.timeB = timeB;
	}

	public Date getHealthDateB() {
		return this.healthDateB;
	}

	public void setHealthDateB(Date healthDateB) {
		this.healthDateB = healthDateB;
	}

	public String getWitnessTimeA() {
		return this.witnessTimeA;
	}

	public void setWitnessTimeA(String witnessTimeA) {
		this.witnessTimeA = witnessTimeA;
	}

	public Date getWitnessDateA() {
		return this.witnessDateA;
	}

	public void setWitnessDateA(Date witnessDateA) {
		this.witnessDateA = witnessDateA;
	}

	public String getWitnessSignA() {
		return this.witnessSignA;
	}

	public void setWitnessSignA(String witnessSignA) {
		this.witnessSignA = witnessSignA;
	}

	public String getPatientTimeA() {
		return this.patientTimeA;
	}

	public void setPatientTimeA(String patientTimeA) {
		this.patientTimeA = patientTimeA;
	}

	public Date getPatientDateA() {
		return this.patientDateA;
	}

	public void setPatientDateA(Date patientDateA) {
		this.patientDateA = patientDateA;
	}

	public String getPatientSignA() {
		return this.patientSignA;
	}

	public void setPatientSignA(String patientSignA) {
		this.patientSignA = patientSignA;
	}

	public String getDoctor() {
		return this.doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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
