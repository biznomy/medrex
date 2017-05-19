package medrex.commons.vo.physicianOrders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm2Row")
public class PhysicianOrderForm2Row implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8042287263719859222L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "physicianOrderForm2Serial")
	private int physicianOrderForm2Serial;
	@Column(name = "physicianOrderForm2RowSerial")
	private int physicianOrderForm2RowSerial;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "prnIndicator")
	private String prnIndicator;
	@Column(name = "phyFrequency")
	private String phyFrequency;
	@Column(name = "phyRoute")
	private String phyRoute;
	@Column(name = "phyDosage")
	private String phyDosage;
	@Column(name = "phyMedication")
	private String phyMedication;

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getPhyDosage() {
		return phyDosage;
	}

	public void setPhyDosage(String phyDosage) {
		this.phyDosage = phyDosage;
	}

	public String getPhyFrequency() {
		return phyFrequency;
	}

	public void setPhyFrequency(String phyFrequency) {
		this.phyFrequency = phyFrequency;
	}

	public String getPhyMedication() {
		return phyMedication;
	}

	public void setPhyMedication(String phyMedication) {
		this.phyMedication = phyMedication;
	}

	public String getPhyRoute() {
		return phyRoute;
	}

	public void setPhyRoute(String phyRoute) {
		this.phyRoute = phyRoute;
	}

	public int getPhysicianOrderForm2RowSerial() {
		return physicianOrderForm2RowSerial;
	}

	public void setPhysicianOrderForm2RowSerial(int physicianOrderForm2RowSerial) {
		this.physicianOrderForm2RowSerial = physicianOrderForm2RowSerial;
	}

	public int getPhysicianOrderForm2Serial() {
		return physicianOrderForm2Serial;
	}

	public void setPhysicianOrderForm2Serial(int physicianOrderForm2Serial) {
		this.physicianOrderForm2Serial = physicianOrderForm2Serial;
	}

	public String getPrnIndicator() {
		return prnIndicator;
	}

	public void setPrnIndicator(String prnIndicator) {
		this.prnIndicator = prnIndicator;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
