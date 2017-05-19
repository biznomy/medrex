package medrex.commons.vo.schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Schedule")
public class Schedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7115077411195615717L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "idSchedule") private List<UserSchedule>
	 * userSchedules;
	 */

	/*
	 * @OneToMany(mappedBy="schedules") private List<UserSchedule>
	 * userschedules;
	 */

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "IdSchedule")
	public List<UserSchedule> userschedules;

	@Column(name = "fromDate")
	private Date fromDate;

	@Column(name = "toDate")
	private Date toDate;

	public int getSerial() {
		return serial;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the userschedules
	 */
	public List<UserSchedule> getUserschedules() {
		return userschedules;
	}

	/**
	 * @param userschedules
	 *            the userschedules to set
	 */
	public void setUserschedules(List<UserSchedule> userschedules) {
		this.userschedules = userschedules;
	}

	/**
	 * @return the serialVersionUID
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
