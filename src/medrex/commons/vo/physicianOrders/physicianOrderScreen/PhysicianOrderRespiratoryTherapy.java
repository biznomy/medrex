package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderRespiratoryTherapy")
public class PhysicianOrderRespiratoryTherapy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4782890153359015440L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "Oxygen")
	private int Oxygen;

	@Column(name = "oxygenPercentage")
	private int oxygenPercentage;

	@Column(name = "continuous")
	private boolean continuous;

	@Column(name = "PRN")
	private boolean PRN;

	@Column(name = "prnFor")
	private Integer prnFor;

	@Column(name = "via")
	private String via;

	@Column(name = "pulseOximetryNumber")
	private String pulseOximetryNumber;

	@Column(name = "pulseOximetryFrequency")
	private String pulseOximetryFrequency;

	@Column(name = "pulseOximetry")
	private Integer pulseOximetry;

	@Column(name = "trachCareNumber")
	private String trachCareNumber;

	@Column(name = "trachCareFrequency")
	private String trachCareFrequency;

	@Column(name = "trachCare")
	private Integer trachCare;

	@Column(name = "innerCannulaNumber")
	private String innerCannulaNumber;

	@Column(name = "innerCannulaFrequency")
	private String innerCannulaFrequency;

	@Column(name = "trachSiteNumber")
	private String trachSiteNumber;

	@Column(name = "trachSiteFrequency")
	private String trachSiteFrequency;

	@Column(name = "trachCausrNumber")
	private String trachCausrNumber;

	@Column(name = "PO")
	private int PO;

	@Column(name = "trachCausrFrequency")
	private String trachCausrFrequency;

	@Column(name = "chestPhysiotherapyNumber")
	private String chestPhysiotherapyNumber;

	@Column(name = "chestPhysiotherapyFrequency")
	private String chestPhysiotherapyFrequency;

	@Column(name = "sizeOfCannula")
	private String sizeOfCannula;

	@Column(name = "typeOfCannula")
	private String typeOfCannula;

	@Column(name = "sizeOfTrach")
	private String sizeOfTrach;

	@Column(name = "typeOfTrach")
	private String typeOfTrach;

	@Column(name = "sizeOfCollar")
	private String sizeOfCollar;

	@Column(name = "typeOfCollar")
	private String typeOfCollar;

	@Column(name = "minutes")
	private String minutes;

	@Column(name = "cpap")
	private boolean cpap;

	@Column(name = "bipap")
	private boolean bipap;
	@Column(name = "durationFrom")
	private Date durationFrom;
	@Column(name = "durationTo")
	private Date durationTo;
	@Column(name = "frequency")
	private String frequency;
	@Column(name = "duration")
	private String duration;

	@Column(name = "pulseOximetryOthers")
	private String pulseOximetryOthers;
	@Column(name = "setting")
	private String setting;

	public String getPulseOximetryOthers() {
		return pulseOximetryOthers;
	}

	public void setPulseOximetryOthers(String pulseOximetryOthers) {
		this.pulseOximetryOthers = pulseOximetryOthers;
	}

	public void setChestPhysiotherapyFrequency(
			String chestPhysiotherapyFrequency) {
		this.chestPhysiotherapyFrequency = chestPhysiotherapyFrequency;
	}

	public String getChestPhysiotherapyFrequency() {
		return chestPhysiotherapyFrequency;
	}

	public void setChestPhysiotherapyNumber(String chestPhysiotherapyNumber) {
		this.chestPhysiotherapyNumber = chestPhysiotherapyNumber;
	}

	public String getChestPhysiotherapyNumber() {
		return chestPhysiotherapyNumber;
	}

	public void setTrachCausrFrequency(String trachCausrFrequency) {
		this.trachCausrFrequency = trachCausrFrequency;
	}

	public String getTrachCausrFrequency() {
		return trachCausrFrequency;
	}

	public void setTrachCausrNumber(String trachCausrNumber) {
		this.trachCausrNumber = trachCausrNumber;
	}

	public String getTrachCausrNumber() {
		return trachCausrNumber;
	}

	public void setTrachSiteFrequency(String trachSiteFrequency) {
		this.trachSiteFrequency = trachSiteFrequency;
	}

	public String getTrachSiteFrequency() {
		return trachSiteFrequency;
	}

	public void setTrachSiteNumber(String trachSiteNumber) {
		this.trachSiteNumber = trachSiteNumber;
	}

	public String getTrachSiteNumber() {
		return trachSiteNumber;
	}

	public void setInnerCannulaFrequency(String innerCannulaFrequency) {
		this.innerCannulaFrequency = innerCannulaFrequency;
	}

	public String getInnerCannulaFrequency() {
		return innerCannulaFrequency;
	}

	public void setInnerCannulaNumber(String innerCannulaNumber) {
		this.innerCannulaNumber = innerCannulaNumber;
	}

	public String getInnerCannulaNumber() {
		return innerCannulaNumber;
	}

	public void setTrachCare(Integer trachCare) {
		this.trachCare = trachCare;
	}

	public Integer getTrachCare() {
		return trachCare;
	}

	public void setTrachCareFrequency(String trachCareFrequency) {
		this.trachCareFrequency = trachCareFrequency;
	}

	public String getTrachCareFrequency() {
		return trachCareFrequency;
	}

	public void setTrachCareNumber(String trachCareNumber) {
		this.trachCareNumber = trachCareNumber;
	}

	public String getTrachCareNumber() {
		return trachCareNumber;
	}

	public void setPulseOximetry(Integer pulseOximetry) {
		this.pulseOximetry = pulseOximetry;
	}

	public Integer getPulseOximetry() {
		return pulseOximetry;
	}

	public void setPulseOximetryFrequency(String pulseOximetryFrequency) {
		this.pulseOximetryFrequency = pulseOximetryFrequency;
	}

	public String getPulseOximetryFrequency() {
		return pulseOximetryFrequency;
	}

	public void setPulseOximetryNumber(String pulseOximetryNumber) {
		this.pulseOximetryNumber = pulseOximetryNumber;
	}

	public String getPulseOximetryNumber() {
		return pulseOximetryNumber;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getVia() {
		return via;
	}

	public void setPrnFor(Integer prnFor) {
		this.prnFor = prnFor;
	}

	public Integer getPrnFor() {
		return prnFor;
	}

	public void setPRN(boolean pRN) {
		PRN = pRN;
	}

	public boolean isPRN() {
		return PRN;
	}

	public void setContinuous(boolean continuous) {
		this.continuous = continuous;
	}

	public boolean isContinuous() {
		return continuous;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getSerial() {
		return serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setOxygen(int oxygen) {
		Oxygen = oxygen;
	}

	public int getOxygen() {
		return Oxygen;
	}

	public void setOxygenPercentage(int oxygenPercentage) {
		this.oxygenPercentage = oxygenPercentage;
	}

	public int getOxygenPercentage() {
		return oxygenPercentage;
	}

	public int getPO() {
		return PO;
	}

	public void setPO(int pO) {

		PO = pO;
	}

	public String getSizeOfCannula() {
		return sizeOfCannula;
	}

	public void setSizeOfCannula(String sizeOfCannula) {
		this.sizeOfCannula = sizeOfCannula;
	}

	public String getTypeOfCannula() {
		return typeOfCannula;
	}

	public void setTypeOfCannula(String typeOfCannula) {
		this.typeOfCannula = typeOfCannula;
	}

	public String getSizeOfTrach() {
		return sizeOfTrach;
	}

	public void setSizeOfTrach(String sizeOfTrach) {
		this.sizeOfTrach = sizeOfTrach;
	}

	public String getTypeOfTrach() {
		return typeOfTrach;
	}

	public void setTypeOfTrach(String typeOfTrach) {
		this.typeOfTrach = typeOfTrach;
	}

	public String getSizeOfCollar() {
		return sizeOfCollar;
	}

	public void setSizeOfCollar(String sizeOfCollar) {
		this.sizeOfCollar = sizeOfCollar;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getTypeOfCollar() {
		return typeOfCollar;
	}

	public void setTypeOfCollar(String typeOfCollar) {
		this.typeOfCollar = typeOfCollar;
	}

	public boolean isCpap() {
		return cpap;
	}

	public void setCpap(boolean cpap) {
		this.cpap = cpap;
	}

	public boolean isBipap() {
		return bipap;
	}

	public void setBipap(boolean bipap) {
		this.bipap = bipap;
	}

	public Date getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Date durationFrom) {
		this.durationFrom = durationFrom;
	}

	public Date getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Date durationTo) {
		this.durationTo = durationTo;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

}
