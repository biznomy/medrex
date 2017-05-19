package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WeeklyWeightsForm")
public class WeeklyWeightsForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7623445970970019518L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "datePrior")
	private Date datePrior;
	@Column(name = "dateWeek1")
	private Date dateWeek1;
	@Column(name = "dateWeek2")
	private Date dateWeek2;
	@Column(name = "dateWeek3")
	private Date dateWeek3;
	@Column(name = "dateWeek4")
	private Date dateWeek4;

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

	public Date getDatePrior() {
		return datePrior;
	}

	public void setDatePrior(Date datePrior) {
		this.datePrior = datePrior;
	}

	public Date getDateWeek1() {
		return dateWeek1;
	}

	public void setDateWeek1(Date dateWeek1) {
		this.dateWeek1 = dateWeek1;
	}

	public Date getDateWeek2() {
		return dateWeek2;
	}

	public void setDateWeek2(Date dateWeek2) {
		this.dateWeek2 = dateWeek2;
	}

	public Date getDateWeek3() {
		return dateWeek3;
	}

	public void setDateWeek3(Date dateWeek3) {
		this.dateWeek3 = dateWeek3;
	}

	public Date getDateWeek4() {
		return dateWeek4;
	}

	public void setDateWeek4(Date dateWeek4) {
		this.dateWeek4 = dateWeek4;
	}

}
