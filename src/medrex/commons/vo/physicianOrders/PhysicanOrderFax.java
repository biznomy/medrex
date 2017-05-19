package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
 
@Entity
@Table(name = "PhysicanOrderFax")

public class PhysicanOrderFax implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	
	@OneToOne
	@JoinColumn(name="IdPhysicanOrderMedication")
    private  PhysicianOrderMedication PhysicanOrderMedication;
	
	
	@Column(name="date")
	private Date date;
  
	@Column(name="detail")
	private String Detail;
	
	@Column(name="status")
	private String status;
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	


    public PhysicianOrderMedication getPhysicanOrderMedication() {
		return PhysicanOrderMedication;
	}

	public void setPhysicanOrderMedication(
			PhysicianOrderMedication physicanOrderMedication) {
		PhysicanOrderMedication = physicanOrderMedication;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}
	
	
	


	
	
	
	
	
	
	
	

	
}
