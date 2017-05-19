package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import medrex.commons.vo.resident.ResidentMain;



@Entity
@Table(name = "PhysicianOrderTherapyTest")
public class PhysicianOrderTherapyTest implements Serializable{
	
	private static final long serialVersionUID = -7675782032314091650L;
	
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	
	@ManyToOne
	@JoinColumn(name="IdResident")
	private ResidentMain residents;
	
	@Column(name = "stages")
	private Integer stages;
	
	

	@Column(name = "IncludeMeds")
	private String IncludeMeds;
	
	
	/**
	 * @return the stages
	 */
	public Integer getStages() {
		return stages;
	}

	/**
	 * @param stages the stages to set
	 */
	public void setStages(Integer stages) {
		this.stages = stages;
	}

	/**
	 * @return the serialVersionUID
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Column(name = "Ivf")
	private String Ivf;
	
	@Column(name = "Tpn")
	private String Tpn;
	
	@Column(name = "Orders")
	private String Orders;
	
	@Column(name = "Duration")
	private String Duration;
	
	@Column(name = "RequiredLabs")
	private String RequiredLabs;
	
	@Column(name = "LineType")
	private String LineType;
	
	public ResidentMain getResidents() {
		return residents;
	}
	public void setResidents(ResidentMain residents) {
		this.residents = residents;
	}
	/**
	 * @return the includeMeds
	 */
	public String getIncludeMeds() {
		return IncludeMeds;
	}

	/**
	 * @param includeMeds the includeMeds to set
	 */
	public void setIncludeMeds(String includeMeds) {
		IncludeMeds = includeMeds;
	}

	/**
	 * @return the ivf
	 */
	public String getIvf() {
		return Ivf;
	}

	/**
	 * @param ivf the ivf to set
	 */
	public void setIvf(String ivf) {
		Ivf = ivf;
	}

	/**
	 * @return the tpn
	 */
	public String getTpn() {
		return Tpn;
	}

	/**
	 * @param tpn the tpn to set
	 */
	public void setTpn(String tpn) {
		Tpn = tpn;
	}

	/**
	 * @return the orders
	 */
	public String getOrders() {
		return Orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(String orders) {
		Orders = orders;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return Duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		Duration = duration;
	}

	/**
	 * @return the requiredLabs
	 */
	public String getRequiredLabs() {
		return RequiredLabs;
	}

	/**
	 * @param requiredLabs the requiredLabs to set
	 */
	public void setRequiredLabs(String requiredLabs) {
		RequiredLabs = requiredLabs;
	}

	/**
	 * @return the lineType
	 */
	public String getLineType() {
		return LineType;
	}

	/**
	 * @param lineType the lineType to set
	 */
	public void setLineType(String lineType) {
		LineType = lineType;
	}

	/**
	 * @return the careOfLine
	 */
	public String getCareOfLine() {
		return CareOfLine;
	}

	/**
	 * @param careOfLine the careOfLine to set
	 */
	public void setCareOfLine(String careOfLine) {
		CareOfLine = careOfLine;
	}

	/**
	 * @return the dsg
	 */
	public String getDsg() {
		return Dsg;
	}

	/**
	 * @param dsg the dsg to set
	 */
	public void setDsg(String dsg) {
		Dsg = dsg;
	}

	/**
	 * @return the insertionSite
	 */
	public String getInsertionSite() {
		return InsertionSite;
	}

	/**
	 * @param insertionSite the insertionSite to set
	 */
	public void setInsertionSite(String insertionSite) {
		InsertionSite = insertionSite;
	}

	@Column(name = "CareOfLine")
	private String CareOfLine;
	
	@Column(name = "Dsg")
	private String Dsg;
	
	@Column(name = "InsertionSite")
	private String InsertionSite;
	
	

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getSerial() {
		return serial;
	}
	
	


	
	
}
