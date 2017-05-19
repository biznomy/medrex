package medrex.commons.vo.scan;

import java.io.Serializable;
import java.util.Date;

import javax.swing.ImageIcon;

//@Entity
//@Table(name = "ScanForm")
public class ScanForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -740023529138679299L;
	// @Id
	// @GeneratedValue
	// @Column(name = "serial")
	private int serial;
	// @Column(name = "residentId")
	private int residentId;
	// @Column(name = "formId")
	private int formId;
	// @Column(name = "scanFormType")
	private String scanFormType;
	// @Column(name = "dateCreated")
	private Date dateCreated;
	private String fileName;
	// @ Transient
	private ImageIcon img;

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

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getScanFormType() {
		return scanFormType;
	}

	public void setScanFormType(String scanFormType) {
		this.scanFormType = scanFormType;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
}
