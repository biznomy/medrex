package medrex.commons.vo.admission.smokers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AssessingResident3")
public class AssessingResident3 {
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "emergency")
	private int emergency;
	@Column(name = "lighter")
	private int lighter;
	@Column(name = "extinguish")
	private int extinguish;
	@Column(name = "ttonGroup")
	private int ttonGroup;
	@Column(name = "dispose")
	private int dispose;
	@Column(name = "hold")
	private int hold;
	@Column(name = "light")
	private int light;
	@Column(name = "access")
	private int access;
	@Column(name = "apron")
	private int apron;
	@Column(name = "cigarettesLighter")
	private int cigarettesLighter;
	@Column(name = "designated")
	private int designated;
	@Column(name = "smokeSafe")
	private int smokeSafe;
	@Column(name = "history")
	private int history;
	@Column(name = "medicationSpecify")
	private String medicationSpecify;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getFormId() {
		return formId;
	}

	public int getEmergency() {
		return emergency;
	}

	public int getLighter() {
		return lighter;
	}

	public int getExtinguish() {
		return extinguish;
	}

	public int getTtonGroup() {
		return ttonGroup;
	}

	public int getDispose() {
		return dispose;
	}

	public int getHold() {
		return hold;
	}

	public int getLight() {
		return light;
	}

	public int getAccess() {
		return access;
	}

	public int getApron() {
		return apron;
	}

	public int getCigarettesLighter() {
		return cigarettesLighter;
	}

	public int getDesignated() {
		return designated;
	}

	public int getSmokeSafe() {
		return smokeSafe;
	}

	public int getHistory() {
		return history;
	}

	public String getMedicationSpecify() {
		return medicationSpecify;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public void setLighter(int lighter) {
		this.lighter = lighter;
	}

	public void setExtinguish(int extinguish) {
		this.extinguish = extinguish;
	}

	public void setTtonGroup(int ttonGroup) {
		this.ttonGroup = ttonGroup;
	}

	public void setDispose(int dispose) {
		this.dispose = dispose;
	}

	public void setHold(int hold) {
		this.hold = hold;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public void setAccess(int access) {
		this.access = access;
	}

	public void setApron(int apron) {
		this.apron = apron;
	}

	public void setCigarettesLighter(int cigarettesLighter) {
		this.cigarettesLighter = cigarettesLighter;
	}

	public void setDesignated(int designated) {
		this.designated = designated;
	}

	public void setSmokeSafe(int smokeSafe) {
		this.smokeSafe = smokeSafe;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public void setMedicationSpecify(String medicationSpecify) {
		this.medicationSpecify = medicationSpecify;
	}

}
