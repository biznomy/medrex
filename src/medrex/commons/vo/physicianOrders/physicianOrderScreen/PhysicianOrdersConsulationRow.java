package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PhysicianOrdersConsulationRow")
public class PhysicianOrdersConsulationRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7413818668006666623L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	
	@Column(name="isApplicable")
	private boolean isApplicable;
	
	@Column(name="fori")
	private String forCon;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="notApplicable")
	private boolean notApplicable;
	
	
	@ManyToOne
	@JoinColumn(name = "IdConsulations", insertable = false, updatable = false)
	public PhysicianOrderConsultations consultaion;
	
	public PhysicianOrderConsultations getConsultaion() {
		return consultaion;
	}

	public void setConsultaion(PhysicianOrderConsultations consultaion) {
		this.consultaion = consultaion;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	public boolean isApplicable() {
		return isApplicable;
	}

	public void setApplicable(boolean isApplicable) {
		this.isApplicable = isApplicable;
	}

	public String getForCon() {
		return forCon;
	}

	public void setForCon(String forCon) {
		this.forCon = forCon;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public boolean isNotApplicable() {
		return notApplicable;
	}

	public void setNotApplicable(boolean notApplicable) {
		this.notApplicable = notApplicable;
	}
}
