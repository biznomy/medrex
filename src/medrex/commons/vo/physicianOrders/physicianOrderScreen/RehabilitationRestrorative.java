package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RehabilitationRestrorative")
public class RehabilitationRestrorative implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3776606760169647860L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	@Column(name = "residentId")
	int residentId;
	@Column(name = "days")
	String days;
	@Column(name = "restrotiveFrequency")
	String restrotiveFrequency;
	@Column(name = "type")
	String type;
	@Column(name = "bendm")
	boolean bendm;
	@Column(name = "crossLege")
	boolean crossLege;
	@Column(name = "remove")
	boolean remove;
	@Column(name = "applyFrequencyHip")
	String applyFrequencyHip;
	@Column(name = "defaultShift")
	String defaultShift;
	@Column(name = "frequencySplints")
	String frequencySplints;
	@Column(name = "apply")
	String apply;
	@Column(name = "duration")
	String duration;
	@Column(name = "session")
	String session;
	@Column(name = "frequencyRehab")
	String frequencyRehab;
	@Column(name = "discipline")
	String discipline;
	@Column(name = "steval")
	boolean steval;
	@Column(name = "oteval")
	boolean oteval;
	@Column(name = "pteval")
	boolean pteval;
	@Column(name = "treatment")
	String treatment;

	public String getDays() {
		return this.days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getRestrotiveFrequency() {
		return this.restrotiveFrequency;
	}

	public void setRestrotiveFrequency(String restrotiveFrequency) {
		this.restrotiveFrequency = restrotiveFrequency;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isBendm() {
		return this.bendm;
	}

	public void setBendm(boolean bendm) {
		this.bendm = bendm;
	}

	public boolean isCrossLege() {
		return this.crossLege;
	}

	public void setCrossLege(boolean crossLege) {
		this.crossLege = crossLege;
	}

	public boolean isRemove() {
		return this.remove;
	}

	public void setRemove(boolean remove) {
		this.remove = remove;
	}

	public String getApplyFrequencyHip() {
		return this.applyFrequencyHip;
	}

	public void setApplyFrequencyHip(String applyFrequencyHip) {
		this.applyFrequencyHip = applyFrequencyHip;
	}

	public String getDefaultShift() {
		return this.defaultShift;
	}

	public void setDefaultShift(String defaultShift) {
		this.defaultShift = defaultShift;
	}

	public String getFrequencySplints() {
		return this.frequencySplints;
	}

	public void setFrequencySplints(String frequencySplints) {
		this.frequencySplints = frequencySplints;
	}

	public String getApply() {
		return this.apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getFrequencyRehab() {
		return this.frequencyRehab;
	}

	public void setFrequencyRehab(String frequencyRehab) {
		this.frequencyRehab = frequencyRehab;
	}

	public String getDiscipline() {
		return this.discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public boolean isSteval() {
		return this.steval;
	}

	public void setSteval(boolean steval) {
		this.steval = steval;
	}

	public boolean isOteval() {
		return this.oteval;
	}

	public void setOteval(boolean oteval) {
		this.oteval = oteval;
	}

	public boolean isPteval() {
		return this.pteval;
	}

	public void setPteval(boolean pteval) {
		this.pteval = pteval;
	}

	public String getTreatment() {
		return this.treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
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
