/**
 * 
 */
package medrex.commons.vo.careLog;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author D S Naruka
 * 
 */
@Entity
@Table(name = "CareLogNode")
public class CareLogNode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5880053379949085616L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	/*
	 * @OneToMany(cascade=CascadeType.REMOVE, mappedBy="careLogMasterId")
	 * private CareLogMaster careLogMaster;
	 * 
	 * public CareLogMaster getCareLogMaster() { return careLogMaster; } public
	 * void setCareLogMaster(CareLogMaster careLogMaster) { this.careLogMaster =
	 * careLogMaster; }
	 */
	@Column(name = "title")
	private String title;

	@Column(name = "level1Value")
	private int level1Value;

	@Column(name = "level2Value")
	private int level2Value;

	@Column(name = "level3Value")
	private int level3Value;

	@Column(name = "level4Value")
	private int level4Value;

	@Column(name = "level5Value")
	private int level5Value;

	@Column(name = "level6Value")
	private int level6Value;

	@Column(name = "level7Value")
	private int level7Value;

	@Column(name = "level8Value")
	private int level8Value;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLevel1Value() {
		return level1Value;
	}

	public void setLevel1Value(int level1Value) {
		this.level1Value = level1Value;
	}

	public int getLevel2Value() {
		return level2Value;
	}

	public void setLevel2Value(int level2Value) {
		this.level2Value = level2Value;
	}

	public int getLevel3Value() {
		return level3Value;
	}

	public void setLevel3Value(int level3Value) {
		this.level3Value = level3Value;
	}

	public int getLevel4Value() {
		return level4Value;
	}

	public void setLevel4Value(int level4Value) {
		this.level4Value = level4Value;
	}

	public int getLevel5Value() {
		return level5Value;
	}

	public void setLevel5Value(int level5Value) {
		this.level5Value = level5Value;
	}

	public int getLevel6Value() {
		return level6Value;
	}

	public void setLevel6Value(int level6Value) {
		this.level6Value = level6Value;
	}

	public int getLevel7Value() {
		return level7Value;
	}

	public void setLevel7Value(int level7Value) {
		this.level7Value = level7Value;
	}

	public int getLevel8Value() {
		return level8Value;
	}

	public void setLevel8Value(int level8Value) {
		this.level8Value = level8Value;
	}

}
