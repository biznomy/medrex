package medrex.commons.vo.census;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CensusStatus")
public class CensusStatusReport {
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private String residentId;

	@Column(name = "typeName")
	private String typeName;

	@Column(name = "administeredBy")
	private String administeredBy;

	@Column(name = "date")
	private String date;

	@Column(name = "time")
	private String time;

	@Column(name = "dischargeType")
	private String dischargeType;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")
	private String toDate;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getResidentId() {
		return residentId;
	}

	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getAdministeredBy() {
		return administeredBy;
	}

	public void setAdministeredBy(String administeredBy) {
		this.administeredBy = administeredBy;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDischargeType() {
		return dischargeType;
	}

	public void setDischargeType(String dischargeType) {
		this.dischargeType = dischargeType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
