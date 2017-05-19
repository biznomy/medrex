package medrex.commons.vo.census;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "CensusStatus")
public class CensusStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2078474141720047124L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "typeName")
	private String typeName;

	@Column(name = "administeredBy")
	private int administeredBy;

	@Column(name = "dateAndTime")
	private Date dateAndTime;

	// admission specific data
	@Column(name = "fromId")
	private int fromId;

	@Column(name = "fromSubId")
	private int fromSubId;

	@Column(name = "fromTransport")
	private int fromTransport;

	// discharge specific data
	@Column(name = "dischargeType")
	private int dischargeType;

	// sign out specific data
	@Column(name = "signOutToId")
	private int signOutToId;

	@Column(name = "residentContactId")
	private int residentContactId;

	@Column(name = "anticipatedMins")
	private int anticipatedMins;

	@Column(name = "anticipatedDateAndTime")
	private Date anticipatedDateAndTime;

	@Column(name = "notes")
	private String notes;

	@Column(name = "timestamp")
	@Type(type = "timestamp")
	private Date timestamp;

	// if status true then Er otherwise other status
	@Column(name = "isEr")
	private boolean isEr;

	@Transient
	private ImageIcon signature;
	@Transient
	private int currentCenusStatusPrevId;
	@Transient
	private int currentCenusStatusNextId;
	@Transient
	private String currentStatus;

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public CensusStatus() {
		timestamp = new Date();
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isEr() {
		return isEr;
	}

	public void setEr(boolean isEr) {
		this.isEr = isEr;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getAdministeredBy() {
		return administeredBy;
	}

	public void setAdministeredBy(int administeredBy) {
		this.administeredBy = administeredBy;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getFromSubId() {
		return fromSubId;
	}

	public void setFromSubId(int fromSubId) {
		this.fromSubId = fromSubId;
	}

	public int getFromTransport() {
		return fromTransport;
	}

	public void setFromTransport(int fromTransport) {
		this.fromTransport = fromTransport;
	}

	public int getDischargeType() {
		return dischargeType;
	}

	public void setDischargeType(int dischargeType) {
		this.dischargeType = dischargeType;
	}

	public int getSignOutToId() {
		return signOutToId;
	}

	public void setSignOutToId(int signOutToId) {
		this.signOutToId = signOutToId;
	}

	public int getResidentContactId() {
		return residentContactId;
	}

	public void setResidentContactId(int residentContactId) {
		this.residentContactId = residentContactId;
	}

	public Date getAnticipatedDateAndTime() {
		return anticipatedDateAndTime;
	}

	public void setAnticipatedMins(int anticipatedMins) {
		this.anticipatedMins = anticipatedMins;
	}

	public int getAnticipatedMins() {
		return anticipatedMins;
	}

	public void setAnticipatedDateAndTime(Date anticipatedDateAndTime) {
		this.anticipatedDateAndTime = anticipatedDateAndTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setSignature(ImageIcon signature) {
		this.signature = signature;
	}

	public ImageIcon getSignature() {
		return signature;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getCurrentCenusStatusPrevId() {
		return currentCenusStatusPrevId;
	}

	public void setCurrentCenusStatusPrevId(int currentCenusStatusPrevId) {
		this.currentCenusStatusPrevId = currentCenusStatusPrevId;
	}

	public int getCurrentCenusStatusNextId() {
		return currentCenusStatusNextId;
	}

	public void setCurrentCenusStatusNextId(int currentCenusStatusNextId) {
		this.currentCenusStatusNextId = currentCenusStatusNextId;
	}
}
