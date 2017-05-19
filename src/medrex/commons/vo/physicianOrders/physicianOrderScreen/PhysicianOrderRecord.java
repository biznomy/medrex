package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

@Entity
@Table(name = "physicianOrderRecord")
public class PhysicianOrderRecord implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 2896556027946762382L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "formType")
	private String formType;
 
	@Column(name = "lastModified")
	private Date lastModified;
   
    @OneToOne
    @JoinColumn(name = "residentId")
	private ResidentMain residents;

	@Column(name = "status")
	private String status;

	@OneToOne/*(fetch=FetchType.EAGER) */
	@JoinColumn(name = "userId")
	private Users user;



	@Column(name = "title")
	private String title;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public ResidentMain getResidents() {
		return residents;
	}

	public void setResidents(ResidentMain residents) {
		this.residents = residents;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public Users getUser()
	{
		return user;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
