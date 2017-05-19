package medrex.commons.vo.admission;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "painAssessment")
public class PainAssessment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8069124525688244330L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "formNum")
	private int formNum;
	@Column(name = "siteNum")
	private String siteNum;
	@Column(name = "stage")
	private String stage;
	@Column(name = "painOnset")
	private String painOnset;
	@Column(name = "duration")
	private String duration;
	@Column(name = "quality")
	private String quality;
	@Column(name = "exacerbatingFactors")
	private String exacerbatingFactors;
	@Column(name = "painEffects")
	private String painEffects;
	@Column(name = "nonPharmacolotical")
	private String nonPharmacolotical;
	@Column(name = "exihibits")
	private String exihibits;
	@Column(name = "CoordinateX")
	private int x;
	@Column(name = "CoordinateY")
	private int y;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getFormNum() {
		return formNum;
	}

	public void setFormNum(int formNum) {
		this.formNum = formNum;
	}

	public String getSiteNum() {
		return siteNum;
	}

	public void setSiteNum(String siteNum) {
		this.siteNum = siteNum;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getPainOnset() {
		return painOnset;
	}

	public void setPainOnset(String painOnset) {
		this.painOnset = painOnset;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getExacerbatingFactors() {
		return exacerbatingFactors;
	}

	public void setExacerbatingFactors(String exacerbatingFactors) {
		this.exacerbatingFactors = exacerbatingFactors;
	}

	public String getPainEffects() {
		return painEffects;
	}

	public void setPainEffects(String painEffects) {
		this.painEffects = painEffects;
	}

	public String getNonPharmacolotical() {
		return nonPharmacolotical;
	}

	public void setNonPharmacolotical(String nonPharmacolotical) {
		this.nonPharmacolotical = nonPharmacolotical;
	}

	public String getExihibits() {
		return exihibits;
	}

	public void setExihibits(String exihibits) {
		this.exihibits = exihibits;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
