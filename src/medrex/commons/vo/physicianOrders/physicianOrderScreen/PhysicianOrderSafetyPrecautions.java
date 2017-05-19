package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderSafetyPrecautions")
public class PhysicianOrderSafetyPrecautions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2006559364455342317L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "fallRisk")
	private String fallRisk;

	@Column(name = "bedAlarm")
	private boolean bedAlarm;

	@Column(name = "wcAlarm")
	private boolean wcAlarm;

	@Column(name = "sensorAlarm")
	private boolean sensorAlarm;

	@Column(name = "wedgeCushion")
	private boolean wedgeCushion;

	@Column(name = "dicem")
	private boolean dicem;

	@Column(name = "seatBelt")
	private boolean seatBelt;

	@Column(name = "selfRelease")
	private boolean selfRelease;

	@Column(name = "floorMats")
	private boolean floorMats;

	@Column(name = "selfR")
	private String selfR;

	@Column(name = "sideRails")
	private String sideRails;

	@Column(name = "sideRails2")
	private String sideRails2;

	@Column(name = "reason")
	private String reason;

	@Column(name = "wandorGuard")
	private String wandorGuard;
	 
	@Column(name = "test")
	private String test;
	
	@Column(name = "expirationDate")
	private Date expirationDate;

	@Column(name = "outOnpass")
	private String outOnPass;

	@Column(name = "specialInstruction")
	private String specialInstruction;

	@Column(name = "alcoholicBeverages")
	private String alcoholicBeverages;

	@Column(name = "limit1")
	private String limit;

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

	public void setFallRisk(String fallRisk) {
		this.fallRisk = fallRisk;
	}

	public String getSideRails2() {
		return sideRails2;
	}

	public void setSideRails2(String sideRails2) {
		this.sideRails2 = sideRails2;
	}

	public String getFallRisk() {
		return fallRisk;
	}

	public void setBedAlarm(boolean bedAlarm) {
		this.bedAlarm = bedAlarm;
	}

	public boolean isBedAlarm() {
		return bedAlarm;
	}

	public void setWcAlarm(boolean wcAlarm) {
		this.wcAlarm = wcAlarm;
	}

	public boolean isWcAlarm() {
		return wcAlarm;
	}

	public void setSensorAlarm(boolean sensorAlarm) {
		this.sensorAlarm = sensorAlarm;
	}

	public boolean isSensorAlarm() {
		return sensorAlarm;
	}

	public void setWedgeCushion(boolean wedgeCushion) {
		this.wedgeCushion = wedgeCushion;
	}

	public boolean isWedgeCushion() {
		return wedgeCushion;
	}

	public void setDicem(boolean dicem) {
		this.dicem = dicem;
	}

	public boolean isDicem() {
		return dicem;
	}

	public void setSeatBelt(boolean seatBelt) {
		this.seatBelt = seatBelt;
	}

	public boolean isSeatBelt() {
		return seatBelt;
	}

	public void setSelfRelease(boolean selfRelease) {
		this.selfRelease = selfRelease;
	}

	public boolean isSelfRelease() {
		return selfRelease;
	}

	public void setFloorMats(boolean floorMats) {
		this.floorMats = floorMats;
	}

	public boolean isFloorMats() {
		return floorMats;
	}

	public void setSelfR(String selfR) {
		this.selfR = selfR;
	}

	public String getSelfR() {
		return selfR;
	}

	public void setSideRails(String sideRails) {
		this.sideRails = sideRails;
	}

	public String getSideRails() {
		return sideRails;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	public void setWandorGuard(String wandorGuard) {
		this.wandorGuard = wandorGuard;
	}

	public String getWandorGuard() {
		return wandorGuard;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setOutOnPass(String outOnPass) {
		this.outOnPass = outOnPass;
	}

	public String getOutOnPass() {
		return outOnPass;
	}

	public void setAlcoholicBeverages(String alcoholicBeverages) {
		this.alcoholicBeverages = alcoholicBeverages;
	}

	public String getAlcoholicBeverages() {
		return alcoholicBeverages;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getLimit() {
		return limit;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest() {
		return test;
	}

}
