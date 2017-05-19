package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderMiscellaneous")
public class PhysicianOrderMiscellaneous implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8950950160743388654L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "Organism")
	private String Organism;

	@Column(name = "SpecifyReasonForTransfer")
	private String SpecifyReasonForTransfer;

	@Column(name = "SpecifyLocation")
	private String SpecifyLocation;

	@Column(name = "CallMd")
	private String CallMd;

	@Column(name = "Measure")
	private String Measure;

	@Column(name = "LocationDialysis")
	private String LocationDialysis;

	@Column(name = "DischargeOrder")
	private String DischargeOrder;

	@Column(name = "Frequency")
	private String Frequency;

	@Column(name = "LocationAmbulatoryStatus")
	private String LocationAmbulatoryStatus;

	@Column(name = "Device")
	private String Device;

	@Column(name = "WeightBearingStatus")
	private String WeightBearingStatus;

	@Column(name = "AmbulatiryStatus")
	private String AmbulatiryStatus;

	@Column(name = "IsolationPrecautions")
	private String IsolationPrecautions;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public String getOrganism() {
		return Organism;
	}

	public String getSpecifyReasonForTransfer() {
		return SpecifyReasonForTransfer;
	}

	public String getSpecifyLocation() {
		return SpecifyLocation;
	}

	public String getCallMd() {
		return CallMd;
	}

	public String getMeasure() {
		return Measure;
	}

	public String getLocationDialysis() {
		return LocationDialysis;
	}

	public String getDischargeOrder() {
		return DischargeOrder;
	}

	public String getFrequency() {
		return Frequency;
	}

	public String getLocationAmbulatoryStatus() {
		return LocationAmbulatoryStatus;
	}

	public String getDevice() {
		return Device;
	}

	public String getWeightBearingStatus() {
		return WeightBearingStatus;
	}

	public String getAmbulatiryStatus() {
		return AmbulatiryStatus;
	}

	public String getIsolationPrecautions() {
		return IsolationPrecautions;
	}

	public int[] getDialysis() {
		return Dialysis;
	}

	public int[] getShowerDays() {
		return ShowerDays;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setOrganism(String organism) {
		Organism = organism;
	}

	public void setSpecifyReasonForTransfer(String specifyReasonForTransfer) {
		SpecifyReasonForTransfer = specifyReasonForTransfer;
	}

	public void setSpecifyLocation(String specifyLocation) {
		SpecifyLocation = specifyLocation;
	}

	public void setCallMd(String callMd) {
		CallMd = callMd;
	}

	public void setMeasure(String measure) {
		Measure = measure;
	}

	public void setLocationDialysis(String locationDialysis) {
		LocationDialysis = locationDialysis;
	}

	public void setDischargeOrder(String dischargeOrder) {
		DischargeOrder = dischargeOrder;
	}

	public void setFrequency(String frequency) {
		Frequency = frequency;
	}

	public void setLocationAmbulatoryStatus(String locationAmbulatoryStatus) {
		LocationAmbulatoryStatus = locationAmbulatoryStatus;
	}

	public void setDevice(String device) {
		Device = device;
	}

	public void setWeightBearingStatus(String weightBearingStatus) {
		WeightBearingStatus = weightBearingStatus;
	}

	public void setAmbulatiryStatus(String ambulatiryStatus) {
		AmbulatiryStatus = ambulatiryStatus;
	}

	public void setIsolationPrecautions(String isolationPrecautions) {
		IsolationPrecautions = isolationPrecautions;
	}

	public void setDialysis(int[] is) {
		Dialysis = is;
	}

	public void setShowerDays(int[] is) {
		ShowerDays = is;
	}

	@Column(name = "Dialysis")
	private int[] Dialysis;

	@Column(name = "ShowerDays")
	private int[] ShowerDays;

}
