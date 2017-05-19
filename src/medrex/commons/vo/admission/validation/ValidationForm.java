package medrex.commons.vo.admission.validation;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "ValidationForm")
public class ValidationForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -444701882253947441L;

	public ValidationForm() {
		validationFormFields = new ArrayList<ValidationFormField>();
	}

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formName")
	private String formName;

	@Column(name = "fullClassName")
	private String fullClassName;

	@Column(name = "pageNo")
	private int pageNo;

	@OneToMany(fetch = FetchType.LAZY)
	@Cascade( { CascadeType.ALL })
	@JoinColumn(name = "valFormId")
	private List<ValidationFormField> validationFormFields;

	public List<ValidationFormField> getValidationFormFields() {
		return validationFormFields;
	}

	public void setValidationFormFields(
			List<ValidationFormField> validationFormFields) {
		this.validationFormFields = validationFormFields;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFullClassName() {
		return fullClassName;
	}

	public void setFullClassName(String fullClassName) {
		this.fullClassName = fullClassName;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
