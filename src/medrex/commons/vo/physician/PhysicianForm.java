package medrex.commons.vo.physician;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.resident.ResidentMain;

@Entity
@Table(name = "PhysicianForm")
public class PhysicianForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4825599065036630841L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(/* cascade=CascadeType.ALL, */fetch = FetchType.EAGER)
	@JoinColumn(name = "Idresident")
	private ResidentMain resident;

	@OneToOne(/* cascade=CascadeType.ALL, */fetch = FetchType.EAGER)
	@JoinColumn(name = "Idphysician")
	private Doctors physician;

	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;

	// transient fields for physician
	@Transient
	@Column(name = "phyName")
	private String phyName;

	@Transient
	@Column(name = "phySurName")
	private String phySurName;

	@Transient
	@Column(name = "phyType")
	private DoctorTypes phyType;

	@Transient
	@Column(name = "phyPhone")
	private String phyPhone;

	public String getPhySurName() {
		return phySurName;
	}

	public void setPhySurName(String phySurName) {
		this.phySurName = phySurName;
	}

	public String getPhyName() {
		return phyName;
	}

	public void setPhyName(String phyName) {
		this.phyName = phyName;
	}

	public DoctorTypes getPhyType() {
		return phyType;
	}

	public void setPhyType(DoctorTypes doctorTypes) {
		this.phyType = doctorTypes;
	}

	public String getPhyPhone() {
		return phyPhone;
	}

	public void setPhyPhone(String phyPhone) {
		this.phyPhone = phyPhone;
	}

	// -------------transient end.

	public int getSerial() {
		return serial;
	}

	public ResidentMain getResident() {
		return resident;
	}

	public void setResident(ResidentMain resident) {
		this.resident = resident;
	}

	public Doctors getPhysician() {
		return physician;
	}

	public void setPhysician(Doctors physician) {
		this.physician = physician;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
