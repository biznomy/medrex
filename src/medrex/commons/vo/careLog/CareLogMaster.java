package medrex.commons.vo.careLog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "CareLogMaster")
public class CareLogMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5245661662657735719L;

	public CareLogMaster() {
		careLogNodes = new ArrayList<CareLogNode>();
	}

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "dateCreated")
	private Date date;

	@Column(name = "UserId")
	private int userId;

	@OneToMany(targetEntity = medrex.commons.vo.careLog.CareLogNode.class, cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.EAGER/*
																																				 * ,cascade
																																				 * =
																																				 * javax
																																				 * .
																																				 * persistence
																																				 * .
																																				 * CascadeType
																																				 * .
																																				 * REMOVE
																																				 */)
	@Cascade( { CascadeType.DELETE_ORPHAN })
	@JoinColumn(name = "careLogMasterSerial", nullable = true)
	private List<CareLogNode> careLogNodes;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<CareLogNode> getCareLogNodes() {
		return careLogNodes;
	}

	public void setCareLogNodes(List<CareLogNode> careLogNodes) {
		this.careLogNodes = careLogNodes;
	}

}
