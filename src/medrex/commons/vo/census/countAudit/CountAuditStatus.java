package medrex.commons.vo.census.countAudit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import medrex.commons.intf.ValueObject;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "CountAuditStatus")
public class CountAuditStatus implements ValueObject, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8116624348459141081L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "timestamp")
	@Type(type = "timestamp")
	private Date timestamp;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
