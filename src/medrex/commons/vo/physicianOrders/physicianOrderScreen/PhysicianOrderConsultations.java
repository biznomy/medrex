package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import medrex.commons.vo.resident.ResidentMain;


@Entity
@Table(name = "PhysicianOrderConsultations")
public class PhysicianOrderConsultations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7708582010792489501L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdResident")
	private ResidentMain residents;
	
	

	/*
	 * @Column(name="IdResident") private int residents;
	 */

	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name = "IdConsulations")
	private List<PhysicianOrdersConsulationRow> consulationsRow;
	
	

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public List<PhysicianOrdersConsulationRow> getConsulationsRow() {
		return consulationsRow;
	}

	public void setConsulationsRow(
			List<PhysicianOrdersConsulationRow> consulationsRow) {
		this.consulationsRow = consulationsRow;
	}

	public ResidentMain getResidents() {
		return residents;
	}

	public void setResidents(ResidentMain residents) {
		this.residents = residents;
	}

	
	

	/*
	 * @Column(name = "Reason") private String Reason;
	 * 
	 * @Column(name = "Others") private String Others;
	 * 
	 * @Column(name = "Other") private boolean Other;
	 * 
	 * @Column(name = "OralSurgery") private boolean OralSurgery;
	 * 
	 * @Column(name = "Ld") private boolean Ld;
	 * 
	 * @Column(name = "Ortho") private boolean Ortho;
	 * 
	 * @Column(name = "WoundCare") private boolean WoundCare;
	 * 
	 * @Column(name = "Physicolgy") private boolean Physicolgy;
	 * 
	 * @Column(name = "Psychiatry") private boolean Psychiatry;
	 * 
	 * @Column(name = "Ent") private boolean Ent;
	 * 
	 * @Column(name = "GeneralSurgery") private boolean GeneralSurgery;
	 * 
	 * @Column(name = "Vascular") private boolean Vascular;
	 * 
	 * @Column(name = "Cardiology") private boolean Cardiology;
	 * 
	 * @Column(name = "Gynecology") private boolean Gynecology;
	 * 
	 * @Column(name = "HemeOnc") private boolean HemeOnc;
	 * 
	 * @Column(name = "Pulmonology") private boolean Pulmonology;
	 * 
	 * @Column(name = "Gu") private boolean Gu;
	 * 
	 * @Column(name = "Endocrinology") private boolean Endocrinology;
	 * 
	 * @Column(name = "Gi") private boolean Gi;
	 * 
	 * @Column(name = "Renal") private boolean Renal;
	 * 
	 * @Column(name = "Opdanology") private boolean Opdanology;
	 * 
	 * @Column(name = "Dental") private boolean Dental;
	 * 
	 * @Column(name = "Optometry") private boolean Optometry;
	 * 
	 * @Column(name = "padiatry") private boolean padiatry;
	 */

}
