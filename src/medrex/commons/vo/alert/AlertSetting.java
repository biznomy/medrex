package medrex.commons.vo.alert;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AlertSetting")
public class AlertSetting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4353064327771650501L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "timeValue")
	private int timeValue;
	@Column(name = "timeType")
	private String timeType;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getTimeValue() {
		return timeValue;
	}

	public void setTimeValue(int timeValue) {
		this.timeValue = timeValue;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

}
