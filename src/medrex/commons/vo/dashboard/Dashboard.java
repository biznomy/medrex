/**
 * 
 */
package medrex.commons.vo.dashboard;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import medrex.commons.intf.ValueObject;

/**
 * @author D S Naruka
 * 
 */

@Entity
@Table(name = "Dashboard")
public class Dashboard implements Serializable, ValueObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637244547184757775L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "name")
	private String name;

	@Column(name = "inHouse")
	private int inHouse;

	@Column(name = "hospital")
	private int hospital;

	@Column(name = "bedHold")
	private int bedHold;

	@Column(name = "signOut")
	private int signOut;

	@Column(name = "outOfPass")
	private int outOfPass;

	@Column(name = "signOutLate")
	private int signOutLate;

	@Column(name = "pendingFirstFloorCount")
	private int pendingFirstFloorCount;

	@Column(name = "pendingSecondFloorCount")
	private int pendingSecondFloorCount;

	@Column(name = "pendingAlertFirstFloorCount")
	private int pendingAlertFirstFloorCount;

	@Column(name = "pendingAlertSecondFloorCount")
	private int pendingAlertSecondFloorCount;

	@Column(name = "labReports1stFloorCount")
	private int labReports1stFloorCount;

	@Column(name = "labReports2stFloorCount")
	private int labReports2stFloorCount;

	@Column(name = "er")
	private int er;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInHouse() {
		return inHouse;
	}

	public void setInHouse(int inHouse) {
		this.inHouse = inHouse;
	}

	public int getHospital() {
		return hospital;
	}

	public void setHospital(int hospital) {
		this.hospital = hospital;
	}

	public int getBedHold() {
		return bedHold;
	}

	public void setBedHold(int bedHold) {
		this.bedHold = bedHold;
	}

	public int getSignOut() {
		return signOut;
	}

	public void setSignOut(int signOut) {
		this.signOut = signOut;
	}

	public int getOutOfPass() {
		return outOfPass;
	}

	public void setOutOfPass(int outOfPass) {
		this.outOfPass = outOfPass;
	}

	public int getSignOutLate() {
		return signOutLate;
	}

	public void setSignOutLate(int signOutLate) {
		this.signOutLate = signOutLate;
	}

	public int getPendingFirstFloorCount() {
		return pendingFirstFloorCount;
	}

	public void setPendingFirstFloorCount(int pendingFirstFloorCount) {
		this.pendingFirstFloorCount = pendingFirstFloorCount;
	}

	public int getPendingSecondFloorCount() {
		return pendingSecondFloorCount;
	}

	public void setPendingSecondFloorCount(int pendingSecondFloorCount) {
		this.pendingSecondFloorCount = pendingSecondFloorCount;
	}

	public int getPendingAlertFirstFloorCount() {
		return pendingAlertFirstFloorCount;
	}

	public void setPendingAlertFirstFloorCount(int pendingAlertFirstFloorCount) {
		this.pendingAlertFirstFloorCount = pendingAlertFirstFloorCount;
	}

	public int getPendingAlertSecondFloorCount() {
		return pendingAlertSecondFloorCount;
	}

	public void setPendingAlertSecondFloorCount(int pendingAlertSecondFloorCount) {
		this.pendingAlertSecondFloorCount = pendingAlertSecondFloorCount;
	}

	public int getLabReports1stFloorCount() {
		return labReports1stFloorCount;
	}

	public void setLabReports1stFloorCount(int labReports1stFloorCount) {
		this.labReports1stFloorCount = labReports1stFloorCount;
	}

	public int getLabReports2stFloorCount() {
		return labReports2stFloorCount;
	}

	public void setLabReports2stFloorCount(int labReports2stFloorCount) {
		this.labReports2stFloorCount = labReports2stFloorCount;
	}

	public int getEr() {
		return er;
	}

	public void setEr(int er) {
		this.er = er;
	}

}
