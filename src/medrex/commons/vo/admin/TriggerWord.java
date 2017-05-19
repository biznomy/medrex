package medrex.commons.vo.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TriggerWord")
public class TriggerWord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5735967085076469760L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "word")
	private String word;
	@Column(name = "description")
	private String description;
	@Column(name = "recieverUsers")
	private String recieverUsers;
	@Column(name = "recieverDepartment")
	private String recieverDepartment;
	@Column(name = "usersname")
	private String usersname;
	@Column(name = "departmentName")
	private String departmentName;
	@Column(name = "triggerWordCreatedDate")
	private Date triggerWordCreatedDate;
	@Column(name = "triggerWordModifiedDate")
	private Date triggerWordModifiedDate;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRecieverUsers() {
		return recieverUsers;
	}

	public void setRecieverUsers(String recieverUsers) {
		this.recieverUsers = recieverUsers;
	}

	public String getRecieverDepartment() {
		return recieverDepartment;
	}

	public void setRecieverDepartment(String recieverDepartment) {
		this.recieverDepartment = recieverDepartment;
	}

	public String getUsersname() {
		return usersname;
	}

	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getTriggerWordCreatedDate() {
		return triggerWordCreatedDate;
	}

	public void setTriggerWordCreatedDate(Date triggerWordCreatedDate) {
		this.triggerWordCreatedDate = triggerWordCreatedDate;
	}

	public Date getTriggerWordModifiedDate() {
		return triggerWordModifiedDate;
	}

	public void setTriggerWordModifiedDate(Date triggerWordModifiedDate) {
		this.triggerWordModifiedDate = triggerWordModifiedDate;
	}

}
