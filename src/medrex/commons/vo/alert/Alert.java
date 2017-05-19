package medrex.commons.vo.alert;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alert")
public class Alert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -623961665716959235L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "date")
	private Date date;
	@Column(name = "beginDate")
	private Date beginDate;
	@Column(name = "endDate")
	private Date endDate;
	@Column(name = "signature")
	private String signature;
	@Column(name = "intervalType")
	private String intervalType;
	@Column(name = "suspendType")
	private String suspendType;
	@Column(name = "intervalTime")
	private int intervalTime;
	@Column(name = "suspendTime")
	private int suspendTime;
	@Column(name = "discharged")
	private boolean discharged;
	@Column(name = "outOfPass")
	private boolean outOfPass;
	@Column(name = "notes")
	private String notes;
	@Column(name = "status")
	private String status;
	@Column(name = "alertType")
	private int alertType;
	@Column(name = "dailyTimes")
	private String dailyTimes;
	@Column(name = "startTime")
	private Date startTime;
	@Column(name = "ownerStatus")
	private int ownerStatus;
	@Column(name = "recieverUser")
	private String recieverUser;
	@Column(name = "recieverDepartment")
	private String recieverDepartment;
	@Column(name = "owner")
	private int owner;
	@Column(name = "department")
	private String department;
	@Column(name = "updater")
	private int updater;
	@Column(name = "alertUntilTime")
	private int alertUntilTime;
	@Column(name = "alertUntilType")
	private String alertUntilType;
	@Column(name = "immediateAlertType")
	private int immediateAlertType;
	@Column(name = "user")
	private String user;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getIntervalType() {
		return intervalType;
	}

	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
	}

	public String getSuspendType() {
		return suspendType;
	}

	public void setSuspendType(String suspendType) {
		this.suspendType = suspendType;
	}

	public int getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(int intervalTime) {
		this.intervalTime = intervalTime;
	}

	public int getSuspendTime() {
		return suspendTime;
	}

	public void setSuspendTime(int suspendTime) {
		this.suspendTime = suspendTime;
	}

	public boolean isDischarged() {
		return discharged;
	}

	public void setDischarged(boolean discharged) {
		this.discharged = discharged;
	}

	public boolean isOutOfPass() {
		return outOfPass;
	}

	public void setOutOfPass(boolean outOfPass) {
		this.outOfPass = outOfPass;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAlertType() {
		return alertType;
	}

	public void setAlertType(int alertType) {
		this.alertType = alertType;
	}

	public String getDailyTimes() {
		return dailyTimes;
	}

	public void setDailyTimes(String dailyTimes) {
		this.dailyTimes = dailyTimes;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getOwnerStatus() {
		return ownerStatus;
	}

	public void setOwnerStatus(int ownerStatus) {
		this.ownerStatus = ownerStatus;
	}

	public String getRecieverUser() {
		return recieverUser;
	}

	public void setRecieverUser(String recieverUser) {
		this.recieverUser = recieverUser;
	}

	public String getRecieverDepartment() {
		return recieverDepartment;
	}

	public void setRecieverDepartment(String recieverDepartment) {
		this.recieverDepartment = recieverDepartment;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	public int getAlertUntilTime() {
		return alertUntilTime;
	}

	public void setAlertUntilTime(int alertUntilTime) {
		this.alertUntilTime = alertUntilTime;
	}

	public String getAlertUntilType() {
		return alertUntilType;
	}

	public void setAlertUntilType(String alertUntilType) {
		this.alertUntilType = alertUntilType;
	}

	public int getImmediateAlertType() {
		return immediateAlertType;
	}

	public void setImmediateAlertType(int immediateAlertType) {
		this.immediateAlertType = immediateAlertType;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
