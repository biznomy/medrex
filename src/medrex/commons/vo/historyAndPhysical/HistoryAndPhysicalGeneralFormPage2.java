package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HistoryAndPhysicalGeneralFormPage2")
public class HistoryAndPhysicalGeneralFormPage2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7933987395620182733L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "bp")
	private String bp;
	@Column(name = "ht")
	private String ht;
	@Column(name = "wt")
	private String wt;
	@Column(name = "general")
	private String general;
	@Column(name = "heent")
	private String heent;
	@Column(name = "skin")
	private String skin;
	@Column(name = "chest")
	private String chest;
	@Column(name = "heart")
	private String heart;
	@Column(name = "abdomen")
	private String abdomen;
	@Column(name = "breast")
	private String breast;
	@Column(name = "nodes")
	private String nodes;
	@Column(name = "bruits")
	private String bruits;
	@Column(name = "ext")
	private String ext;
	@Column(name = "neuro")
	private String neuro;
	@Column(name = "mentalStatus")
	private String mentalStatus;
	@Column(name = "assessment")
	private String assessment;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "physicianSignature")
	private String physicianSignature;

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

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getHt() {
		return ht;
	}

	public void setHt(String ht) {
		this.ht = ht;
	}

	public String getWt() {
		return wt;
	}

	public void setWt(String wt) {
		this.wt = wt;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public String getHeent() {
		return heent;
	}

	public void setHeent(String heent) {
		this.heent = heent;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(String abdomen) {
		this.abdomen = abdomen;
	}

	public String getBreast() {
		return breast;
	}

	public void setBreast(String breast) {
		this.breast = breast;
	}

	public String getNodes() {
		return nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
	}

	public String getBruits() {
		return bruits;
	}

	public void setBruits(String bruits) {
		this.bruits = bruits;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getNeuro() {
		return neuro;
	}

	public void setNeuro(String neuro) {
		this.neuro = neuro;
	}

	public String getMentalStatus() {
		return mentalStatus;
	}

	public void setMentalStatus(String mentalStatus) {
		this.mentalStatus = mentalStatus;
	}

	public String getAssessment() {
		return assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getPhysicianSignature() {
		return physicianSignature;
	}

	public void setPhysicianSignature(String physicianSignature) {
		this.physicianSignature = physicianSignature;
	}

}
