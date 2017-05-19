package medrex.commons.vo.schedule;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "UserSchedule")
public class UserSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7135521322784767506L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "Idscdedule")
	private int IdScdedule;

	@Column(name = "shift")
	private String shift;


	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="Id_Schedule") private Schedule schedules;
	 */

	public int getIdScdedule() {
		return IdScdedule;
	}

	public void setIdScdedule(int idScdedule) {
		IdScdedule = idScdedule;
	}

	public int getMasterDay() {
		return masterDay;
	}

	public void setMasterDay(int masterDay) {
		this.masterDay = masterDay;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@ManyToOne
	@JoinColumn(name = "IdSchedule", insertable = false, updatable = false)
	public Schedule schedule;

	@OneToOne
	@JoinColumn(name = "IdUser")
	private Users userID;

	@Column(name = "date")
	private Date date;
	
	@Column(name="masterDay")
	private int masterDay;

	

	public int getSerial() {
		return serial;
	}

	public String getShift() {
		return shift;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Users getUserID() {
		return userID;
	}

	public void setUserID(Users userID) {
		this.userID = userID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public void setShift(String shift) {
		this.shift = shift;
	}

	/**
	 * @return the schedule
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
